import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

import org.antlr.runtime.tree.CommonTree;
import org.objectweb.asm.*;

public class Program implements Opcodes {

	private HashMap<String,String> globalVariables;
	private ArrayList<Procedure> procedures;
	private Procedure main;
	
	public Program (HashMap<String,String> globalVariables, ArrayList<Procedure> procedures, Procedure main ){
		this.globalVariables = globalVariables;
		this.procedures = procedures;
		this.main = main;
	}
	
	//generates bytecode for declaring global variables
	private void declareGlobals(ClassWriter cw, MethodVisitor mv, FieldVisitor fv, String name){
		String[] globalKeys = new String[globalVariables.size()];
		globalVariables.keySet().toArray(globalKeys);
		for (String key : globalKeys){
			String type = null;
			if (globalVariables.get(key).contentEquals("int")){
				type = "I";
			}
			if (globalVariables.get(key).contentEquals("char")){
				type = "C";
			}
			fv = cw.visitField(ACC_PUBLIC+ACC_STATIC, key,type, null, null);
			fv.visitEnd();
		}
		mv = cw.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
		mv.visitCode();
		for (String key : globalKeys){
			String type = null;
			if (globalVariables.get(key).contentEquals("int")){
				type = "I";
			}
			if (globalVariables.get(key).contentEquals("char")){
				type = "C";
			}
			mv.visitIntInsn(BIPUSH, 0);
			mv.visitFieldInsn(PUTSTATIC, name, key, type);
		}
		mv.visitInsn(RETURN);
		mv.visitMaxs(0, 0);
		mv.visitEnd();
	}
			
	//dumps bytecode to file corresponding to name of class
	private byte[] dumpBytecode(String name) throws Exception{
		ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
		FieldVisitor fv= null;
		MethodVisitor mv= null;
		AnnotationVisitor av;
		cw.visit(V1_6, ACC_PUBLIC + ACC_SUPER, name, null, "java/lang/Object", null);
		cw.visitSource(name,null);
		
		if (globalVariables != null){
			declareGlobals(cw,mv,fv,name);
		}
		
		//MAIN CLASS DEFINITION
		{
		mv = cw.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
		mv.visitCode();
		mv.visitVarInsn(ALOAD, 0);
		mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
		mv.visitInsn(RETURN);
		mv.visitMaxs(0, 0);
		mv.visitEnd();
		}
		
		//Output code for each procedure
		procedures.add(main);
		for (Procedure procedure : procedures){
			generateProcedureCode(cw,mv,fv,name,procedure);
		}
		cw.visitEnd();
		return cw.toByteArray();
	}
	
	private Procedure getProcByName(String name){
		for (Procedure procedure : procedures){
			if (procedure.getName().contentEquals(name)){
				return procedure;
			}
		}
		return null;
	}
	
	
	private void generateCall(ClassWriter cw, MethodVisitor mv, FieldVisitor fv, CommonTree statement, Procedure procedure, String name){
		//pushing arguments onto the stack
		for (int i = 0; i < statement.getChild(1).getChildCount(); i++){
			String varname = statement.getChild(1).getChild(i).getChild(0).getText();
			//Local variable
			if (procedure.isDeclared(varname)){
				mv.visitIntInsn(ILOAD,procedure.getRegister(varname));
			//Global variable
			} else {
				String type = null;
				if (globalVariables.get(varname).contentEquals("int")){
					type = "I";
				}
				if (globalVariables.get(varname).contentEquals("char")){
					type = "C";
				}
				mv.visitFieldInsn(GETSTATIC, name, varname, type);
			}
		}
		//make the call
		String callname = statement.getChild(0).getChild(0).getText();
		Procedure callproc = getProcByName(callname);
		mv.visitMethodInsn(INVOKESTATIC, name, callname, "("+getARGCode(callproc)+")"+getReturnCode(callproc));
	}
	
	private void generateVarOrLit(ClassWriter cw, MethodVisitor mv, FieldVisitor fv, CommonTree statement, Procedure procedure, String name){
		if (statement.getText().contentEquals("CALL")){
			generateCall(cw,mv,fv,statement,procedure,name);
			return;
		}
		if (statement.getChildCount() == 0){
			int num = Integer.parseInt(statement.getText());
			mv.visitIntInsn(SIPUSH,num);
		} else {
			if (statement.getText().contentEquals("NEG")){
				int num = Integer.parseInt(statement.getChild(0).getText());
				mv.visitIntInsn(SIPUSH,-num);
			} else {
				String varname = statement.getChild(0).getText();
				//Local variable
				if (procedure.isDeclared(varname)){
					mv.visitIntInsn(ILOAD,procedure.getRegister(varname));
				//Global variable
				} else {
					String type = null;
					if (globalVariables.get(varname).contentEquals("int")){
						type = "I";
					}
					if (globalVariables.get(varname).contentEquals("char")){
						type = "C";
					}
					mv.visitFieldInsn(GETSTATIC, name, varname, type);
				}
			}
		}
	}
	
	
	private void generateArithCode(ClassWriter cw, MethodVisitor mv, FieldVisitor fv, CommonTree statement, Procedure procedure, String name){
		if (statement.getText().contentEquals("+")){
			generateArithCode(cw,mv,fv,(CommonTree) statement.getChild(0),procedure,name);
			generateArithCode(cw, mv, fv, (CommonTree) statement.getChild(1), procedure,name);
			mv.visitInsn(IADD);
			return;
		}
		if (statement.getText().contentEquals("-")){
			generateArithCode(cw,mv,fv,(CommonTree) statement.getChild(0),procedure,name);
			generateArithCode(cw, mv, fv, (CommonTree) statement.getChild(1), procedure,name);
			mv.visitInsn(ISUB);
			return;
		}
		if (statement.getText().contentEquals("/")){
			generateArithCode(cw,mv,fv,(CommonTree) statement.getChild(0),procedure,name);
			generateArithCode(cw, mv, fv, (CommonTree) statement.getChild(1), procedure,name);
			mv.visitInsn(IDIV);
			return;
		}
		if (statement.getText().contentEquals("*")){
			generateArithCode(cw,mv,fv,(CommonTree) statement.getChild(0),procedure,name);
			generateArithCode(cw, mv, fv, (CommonTree) statement.getChild(1), procedure,name);
			mv.visitInsn(IMUL);
			return;
		}
		if (statement.getText().contentEquals("%")){
			generateArithCode(cw,mv,fv,(CommonTree) statement.getChild(0),procedure,name);
			generateArithCode(cw, mv, fv, (CommonTree) statement.getChild(1), procedure,name);
			mv.visitInsn(IREM);
			return;
		}
		generateVarOrLit(cw, mv, fv, statement, procedure,name);
	}
	
	private void generateStatementCode(
			ClassWriter cw, MethodVisitor mv, FieldVisitor fv, CommonTree statement, Procedure procedure, String name){
		//IO
		if (statement.getChild(0).getText().contentEquals("IO")){
			if (statement.getChild(0).getChild(0).getText().contentEquals("print")){
				mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
				mv.visitLdcInsn(statement.getChild(1).toString().substring(1,statement.getChild(1).toString().length() -1));
				mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V");
			}
			if (statement.getChild(0).getChild(0).getText().contentEquals("outputc")){
				mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
				generateVarOrLit(cw,mv,fv,(CommonTree)statement.getChild(1),procedure,name);
				mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(C)V");
			}
			if (statement.getChild(0).getChild(0).getText().contentEquals("output")){
				mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
				generateVarOrLit(cw,mv,fv,(CommonTree)statement.getChild(1),procedure,name);
				mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(I)V");
			}
			if (statement.getChild(0).getChild(0).getText().contentEquals("read")){
				mv.visitFieldInsn(GETSTATIC, "java/lang/System", "in", "Ljava/io/InputStream;");
				mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/InputStream", "read", "()I");
				//Gets char corresponding to int entered so needs 48 subtracted to convert
				mv.visitIntInsn(BIPUSH, 48);
				mv.visitInsn(ISUB);
				//Should now correspond to the integer entered
				String varname = statement.getChild(1).getChild(0).getText();
				//Local variable
				if (procedure.isDeclared(varname)){
					mv.visitVarInsn(ISTORE,(procedure.getRegister(varname)));
				//Global variables
				}else {
					String type = null;
					if (globalVariables.get(varname).contentEquals("int")){
						type = "I";
						
					}
					if (globalVariables.get(varname).contentEquals("char")){
						type = "C";
					}
					mv.visitFieldInsn(PUTSTATIC, name, varname, type);
				}
				//Flush STD.IN
				mv.visitFieldInsn(GETSTATIC, "java/lang/System", "in", "Ljava/io/InputStream;");
				mv.visitFieldInsn(GETSTATIC, "java/lang/System", "in", "Ljava/io/InputStream;");
				mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/InputStream", "available", "()I");
				mv.visitInsn(I2L);
				mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/InputStream", "skip", "(J)J");
				mv.visitInsn(POP2);
			}
			if (statement.getChild(0).getChild(0).getText().contentEquals("readc")){
				mv.visitFieldInsn(GETSTATIC, "java/lang/System", "in", "Ljava/io/InputStream;");
				mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/InputStream", "read", "()I");
				String varname = statement.getChild(1).getChild(0).getText();
				//Local variable
				if (procedure.isDeclared(varname)){
					mv.visitVarInsn(ISTORE,(procedure.getRegister(varname)));
				//Global variables
				}else {
					String type = null;
					if (globalVariables.get(varname).contentEquals("int")){
						type = "I";
					}
					if (globalVariables.get(varname).contentEquals("char")){
						type = "C";
					}
					mv.visitFieldInsn(PUTSTATIC, name, varname, type);
				}
				//FLUSH STD.IN
				mv.visitFieldInsn(GETSTATIC, "java/lang/System", "in", "Ljava/io/InputStream;");
				mv.visitFieldInsn(GETSTATIC, "java/lang/System", "in", "Ljava/io/InputStream;");
				mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/InputStream", "available", "()I");
				mv.visitInsn(I2L);
				mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/InputStream", "skip", "(J)J");
				mv.visitInsn(POP2);
			}
		}
		
		//NESTED STATEMENTS
		if (statement.getChild(0).getText().contentEquals("STATEMENTS")){
			for (int i = 0; i < statement.getChild(0).getChildCount(); i++){
				generateStatementCode(cw,mv,fv,(CommonTree) statement.getChild(0).getChild(i),procedure,name);
			}
		}
		//IF STATEMENTS
		if (statement.getChild(0).getText().contentEquals("if")){
			//this is the lhs
			generateArithCode(cw,mv,fv,(CommonTree) statement.getChild(1).getChild(0),procedure,name);
			//this is the rhs
			generateArithCode(cw,mv,fv,(CommonTree) statement.getChild(1).getChild(1),procedure,name);
			Label eef = new Label();
			Label fee = new Label();
			//this is the OPPOSITE of the comparison (to jump to fee)
			if (statement.getChild(1).getText().contentEquals("==")){
				mv.visitJumpInsn(IF_ICMPNE, fee);
			}
			if (statement.getChild(1).getText().contentEquals("!=")){
				mv.visitJumpInsn(IF_ICMPEQ, fee);
			}
			if (statement.getChild(1).getText().contentEquals(">")){
				mv.visitJumpInsn(IF_ICMPLE, fee);
			}
			if (statement.getChild(1).getText().contentEquals("<")){
				mv.visitJumpInsn(IF_ICMPGE, fee);
			}
			if (statement.getChild(1).getText().contentEquals("<=")){
				mv.visitJumpInsn(IF_ICMPGT, fee);
			}
			if (statement.getChild(1).getText().contentEquals(">=")){
				
				mv.visitJumpInsn(IF_ICMPLT, fee);
			}
			//CONDITIONAL BLOCK
			//if ->
			//block entry
			mv.visitLabel(eef);
			generateStatementCode(cw,mv,fv,(CommonTree) statement.getChild(2),procedure,name);
			// <- fi
			mv.visitLabel(fee);
		}
		//WHILE LOOPS
		if (statement.getChild(0).getText().contentEquals("while")){
			Label eef = new Label();
			Label fee = new Label();
			//CONDITIONAL BLOCK
			//if ->
			mv.visitLabel(eef);
			//this is the lhs
			generateArithCode(cw,mv,fv,(CommonTree) statement.getChild(1).getChild(0),procedure,name);
			//this is the rhs
			generateArithCode(cw,mv,fv,(CommonTree) statement.getChild(1).getChild(1),procedure,name);
			
			//this is the OPPOSITE of the comparison (to jump to fee)
			if (statement.getChild(1).getText().contentEquals("==")){
				mv.visitJumpInsn(IF_ICMPNE, fee);
			}
			if (statement.getChild(1).getText().contentEquals("!=")){
				mv.visitJumpInsn(IF_ICMPEQ, fee);
			}
			if (statement.getChild(1).getText().contentEquals(">")){
				mv.visitJumpInsn(IF_ICMPLE, fee);
			}
			if (statement.getChild(1).getText().contentEquals("<")){
				mv.visitJumpInsn(IF_ICMPGE, fee);
			}
			if (statement.getChild(1).getText().contentEquals("<=")){
				mv.visitJumpInsn(IF_ICMPGT, fee);
			}
			if (statement.getChild(1).getText().contentEquals(">=")){
				mv.visitJumpInsn(IF_ICMPLT, fee);
			}
			//block entry
			generateStatementCode(cw,mv,fv,(CommonTree) statement.getChild(2),procedure,name);
			//AT THIS POINT... JUMP BACK TO EEF
			mv.visitJumpInsn(GOTO, eef);
			// <- fi
			mv.visitLabel(fee);
		}
		//ASSIGNMENT
		if (statement.getChild(0).getText().contentEquals("ASSIGN")){
			generateArithCode(cw,mv,fv,(CommonTree) statement.getChild(2),procedure,name);
			String varname = statement.getChild(1).getChild(0).getText();
			//Local variable
			if (procedure.isDeclared(varname)){
				mv.visitVarInsn(ISTORE,(procedure.getRegister(varname)));
			//Global variables
			}else {
				String type = null;
				if (globalVariables.get(varname).contentEquals("int")){
					type = "I";
				}
				if (globalVariables.get(varname).contentEquals("char")){
					type = "C";
				}
				mv.visitFieldInsn(PUTSTATIC, name, varname, type);
			}
		}
		if (statement.getChild(0).getText().contentEquals("return")){
			generateArithCode(cw,mv,fv,(CommonTree) statement.getChild(1),procedure,name);
			mv.visitInsn(IRETURN);
		}
	}
	
	private void generateProcedureCode(ClassWriter cw, MethodVisitor mv, FieldVisitor fv, String name, Procedure procedure){
		if (procedure.getName().contentEquals("main")){
			mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, procedure.getName(), "([Ljava/lang/String;)V", null, null);
		}else{
			mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, procedure.getName(), "("+getARGCode(procedure)+")"+getReturnCode(procedure), null, null);
		}
		mv.visitCode();
		//Local Variables
		for (String dec : procedure.getDecList()){
			mv.visitInsn(ICONST_0);
			mv.visitVarInsn(ISTORE, procedure.getRegister(dec));
		}
		for (CommonTree statement : procedure.getStatements()){
			generateStatementCode(cw, mv, fv, (CommonTree) statement, procedure, name);
		}
		
		//Automatic returning at end of functions
		if (procedure.getType() == null){
			mv.visitInsn(RETURN);
		}else{
			mv.visitInsn(
					IRETURN);
		}
		mv.visitMaxs(0, 0);
		mv.visitEnd();
	}
	
	private String getARGCode(Procedure procedure){
		String code = "";
		for (String arg : procedure.getArgList()){
			if (procedure.typeLookup(arg).contentEquals("int")){
				code = code + "I";
			}
			if (procedure.typeLookup(arg).contentEquals("char")){
				code = code + "C";
			}
		}
		return code;
	}
	
	private String getReturnCode(Procedure procedure){
		if (procedure.getType().contentEquals("int")){
			return "I";
		}
		if (procedure.getType().contentEquals("char")){
			return "C";
		}
		if (procedure.getType() == null){
			return "V";
		}
		return null;
	}
	
	public void getBytecode(FileOutputStream output, String name) throws Exception{
		output.write(dumpBytecode(name));
		output.close();
	}
}
