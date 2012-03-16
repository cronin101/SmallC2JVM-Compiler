//Libraries for I/O
import java.io.IOException;

//Libraries for ANTLR
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;


public class myParser {
  public CommonTree getASTFromSource(String file) throws IOException{
    //The variable for return
	CommonTree resulttree = null;
	//The FileStream that will read source-code from a file.
    ANTLRFileStream fs = null;
    //The command line argument is the filename of SmallC source and is read into an ANTLRFileStream.
    if ((file.length()) == 0){
      System.out.println("Error: Missing input source-code filename as command-line argument.");
      System.exit(1);
    }
    //It is read into a FileStream
    try{
      fs = new ANTLRFileStream(file);
    }catch (Exception e){
      //Error loading the file
      System.out.println("Error loading source:");
      System.out.println(e);
      System.exit(1);
    }
    //The Lexer is instantiated and the ANTLRFileStream is subjected to the might of said Lexer.
    grammarlolLexer lexer = new grammarlolLexer(fs);
    //The Lexed FileStream is reduced to mere tokens syntactically equivalent to its former self.
    CommonTokenStream tokens = new CommonTokenStream();
    tokens.setTokenSource(lexer);
    //The Grammar is instantiated and instructed to pick up the pieces
    grammarlolParser parser = new grammarlolParser(tokens);
    //parsing is attempted with 'program' as the root rule.
    grammarlolParser.program_return parseresult = null;
    try {
      parseresult = parser.program();
      //if there are syntactic errors, the program exits gracefully
      int errors = parser.getNumberOfSyntaxErrors();
      if (errors > 0){
        System.out.printf("Parsing failed with %d errors.\n",errors);
        System.exit(1);
      }
    // A less common error indicating something more sinister.
    } catch (RecognitionException e) {
      System.out.println("Error when parsing source-code:");
      e.printStackTrace();
      System.exit(1);
    }
    if (parseresult == null){
      System.out.println("No parse result was returned. Check source-code structure.");
      System.exit(1);
    //If a parse was returned.
    }else{
      resulttree = (CommonTree)parseresult.tree;
    }
    return resulttree;
  }
}
