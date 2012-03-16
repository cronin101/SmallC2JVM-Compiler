import java.util.ArrayList;
import java.util.HashMap;

import org.antlr.runtime.tree.CommonTree;


public class Procedure {
	private ArrayList<String> variablesInOrder;
	private String name;
	private String type;
	private HashMap<String,String> args;
	private ArrayList<String> argList;
	private HashMap<String,String> decls;
	private ArrayList<CommonTree> statements;
	public CommonTree subtree;
	
	public int getRegister(String variable){
		variablesInOrder = new ArrayList<String>(0);
		for (String arg : argList){
			variablesInOrder.add(arg);
		}
		String[] declars = new String[decls.size()];
		decls.keySet().toArray(declars);
		for (String dec : declars){
			variablesInOrder.add(dec);
		}
		for (int i=0;i< variablesInOrder.size();i++){
			if (variablesInOrder.get(i).contentEquals(variable)){
				return i;
			}
		}
		return -1;
	}
	
 	public  Procedure(){
		args = new HashMap<String,String>();
		argList = new ArrayList<String>();
		decls = new HashMap<String,String>();
		statements = new ArrayList<CommonTree>();
	}
	
 	public ArrayList<String> getArgList(){
 		return argList;
 	}
 	
 	public String[] getDecList(){
 		String[] result = new String[decls.size()];
 		decls.keySet().toArray(result);
 		return result;
 	}
 	
 	private ArrayList<CommonTree> getDeeperAssigns(CommonTree statement){
 		ArrayList<CommonTree> assigns = new ArrayList<CommonTree>();
 		if(statement.getChild(0).getText().contentEquals("STATEMENTS")){
 			for (int i = 0; i < statement.getChild(0).getChildCount();i++){
 				assigns.addAll(getDeeperAssigns((CommonTree) statement.getChild(0).getChild(i)));
 				
 			}
 		}
 		if(statement.getChild(0).getText().contentEquals("ASSIGN")){
				assigns.add(statement);
			} else {
				if(statement.getChild(0).getText().contentEquals("while")){
					assigns.addAll(getDeeperAssigns((CommonTree) statement.getChild(2)));
				}
				if(statement.getChild(0).getText().contentEquals("if")){
					assigns.addAll(getDeeperAssigns((CommonTree) statement.getChild(2)));
				}
			}
		return assigns;
 	}
 	
 	public ArrayList<CommonTree> getAssigns(){
 		ArrayList<CommonTree> assigns = new ArrayList<CommonTree>();
 		for (CommonTree statement : statements){
 			if(statement.getChild(0).getText().contentEquals("ASSIGN")){
 				assigns.add(statement);
 			} else {
 				if(statement.getChild(0).getText().contentEquals("while")){
 					assigns.addAll(getDeeperAssigns(statement));
 				}
 				if(statement.getChild(0).getText().contentEquals("if")){
 					assigns.addAll(getDeeperAssigns(statement));
 				}
 			}
 		}
 		return assigns;
 	}
 	
 	public ArrayList<CommonTree> getCalls(){
 		ArrayList<CommonTree> calls = new ArrayList<CommonTree>();
 		for (CommonTree statement : statements){
 			if(statement.getText().contentEquals("CALL")){
 				calls.add(statement);
 			} else {
 				if(statement.getChild(0).getText().contentEquals("while")){
 					calls.addAll(getDeeperCalls(statement));
 				}
 				if(statement.getChild(0).getText().contentEquals("if")){
 					calls.addAll(getDeeperCalls(statement));
 				}
 			}
 		}
 		return calls;
 	}
 	
 	private ArrayList<CommonTree> getDeeperCalls(CommonTree statement){
 		ArrayList<CommonTree> calls = new ArrayList<CommonTree>();
 		if(statement.getChild(0).getText().contentEquals("STATEMENTS")){
 			for (int i = 0; i < statement.getChild(0).getChildCount();i++){
 				calls.addAll(getDeeperCalls  ((CommonTree) statement.getChild(0).getChild(i)));
 				
 			}
 		}
 		if(statement.getChild(0).getText().contentEquals("CALL")){
				calls.add(statement);
			} else {
				if(statement.getChild(0).getText().contentEquals("while")){
					calls.addAll(getDeeperCalls((CommonTree) statement.getChild(2)));
				}
				if(statement.getChild(0).getText().contentEquals("if")){
					calls.addAll(getDeeperCalls((CommonTree) statement.getChild(2)));
				}
			}
		return calls;
 	}
 	
	public ArrayList<CommonTree> getComparisons(){
 		ArrayList<CommonTree> comps = new ArrayList<CommonTree>();
 		for (CommonTree statement : statements){
 			comps.addAll(getDeeperComparisons(statement));
 		}
 		return comps;
 	}
	
	private ArrayList<CommonTree> getDeeperComparisons(CommonTree statement){
 		ArrayList<CommonTree> comps = new ArrayList<CommonTree>();
 		if (statement.getChild(0).toString().contentEquals("STATEMENTS")){
 			for (int i = 0;i < statement.getChild(0).getChildCount(); i++){
 				comps.addAll(getDeeperComparisons((CommonTree) statement.getChild(0).getChild(i)));
 			}
 		}
		if(statement.getChild(0).getText().contentEquals("while")){
			comps.add((CommonTree) statement.getChild(1));
			comps.addAll(getDeeperComparisons((CommonTree) statement.getChild(2)));
		}
		if(statement.getChild(0).getText().contentEquals("if")){
			comps.add((CommonTree) statement.getChild(1));
			comps.addAll(getDeeperComparisons((CommonTree) statement.getChild(2)));
		}
		return comps;
 	}
 	
	public ArrayList<CommonTree> getIO(){
 		ArrayList<CommonTree> io = new ArrayList<CommonTree>();
 		for (CommonTree statement : statements){
 			if(statement.getChild(0).getText().contentEquals("IO")){
 				io.add(statement);
 			} else {
 				if(statement.getChild(0).getText().contentEquals("while")){
 					io.addAll(getDeeperIO(statement));
 				}
 				if(statement.getChild(0).getText().contentEquals("if")){
 					io.addAll(getDeeperIO(statement));
 				}
 			}
 		}
 		return io;
 	}
	
	private ArrayList<CommonTree> getDeeperIO(CommonTree statement){
 		ArrayList<CommonTree> io = new ArrayList<CommonTree>();
 		if(statement.getChild(0).getText().contentEquals("STATEMENTS")){
 			for (int i = 0; i < statement.getChild(0).getChildCount();i++){
 				io.addAll(getDeeperIO  ((CommonTree) statement.getChild(0).getChild(i)));
 				
 			}
 		}
 		if(statement.getChild(0).getText().contentEquals("IO")){
				io.add(statement);
			} else {
				if(statement.getChild(0).getText().contentEquals("while")){
					io.addAll(getDeeperIO((CommonTree) statement.getChild(2)));
				}
				if(statement.getChild(0).getText().contentEquals("if")){
					io.addAll(getDeeperIO((CommonTree) statement.getChild(2)));
				}
			}
		return io;
 	}
 	
 	public boolean isDeclared(String name){
 		return (args.containsKey(name) || decls.containsKey(name));
 	}
 	
 	public void addArg(String name, String type){
 		args.put(name, type);
 		argList.add(name);
 	}
 	
 	public void addDec(String name, String type){
 		decls.put(name, type);
 	}
 	
 	public void addStatement(CommonTree statement){
 		statements.add(statement);
 	}
 	
 	public void setName(String name){
 		this.name = name;
 	}
 	
 	public String getName(){
 		return this.name;
 	}
 	
 	public void setType(String type){
 		this.type = type;
 	}
 	
 	public String getType(){
 		return this.type;
 	}
 	
 	public ArrayList<CommonTree> getStatements(){
 		return statements;
 	}
 	
 	public CommonTree shiftStatement(){
 		CommonTree head = statements.get(0);
 		statements.remove(0);
 		return head;
 	}
 	
 	public String typeLookup(String name){
 		if (args.containsKey(name)){
 			return args.get(name);
 		}
 		if (decls.containsKey(name)){
 			return decls.get(name);
 		}
		return null;
 	}
 	
}
