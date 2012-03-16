// $ANTLR 3.4 /home/cronin/Brogramming/grammarlol.g 2012-03-12 20:03:07

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class grammarlolParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARGUMENTS", "ASSIGN", "CALL", "CHAR", "CHARACTER", "CHR", "COMMENT", "DECLARATION", "DIGIT", "ENTRYPOINT", "FUNCBODY", "HEADERS", "IDENT", "IO", "LETTER", "NAME", "NEG", "NNLCHAR", "NUMBER", "PARAM", "PROCEDURE", "PROGSTRUCTURE", "STATEMENT", "STATEMENTS", "STRING", "TIDENT", "TYPE", "WS", "'!='", "'#include'", "'%'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "';'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'char'", "'else'", "'if'", "'int'", "'main'", "'output'", "'outputc'", "'print'", "'read'", "'readc'", "'return'", "'while'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int ARGUMENTS=4;
    public static final int ASSIGN=5;
    public static final int CALL=6;
    public static final int CHAR=7;
    public static final int CHARACTER=8;
    public static final int CHR=9;
    public static final int COMMENT=10;
    public static final int DECLARATION=11;
    public static final int DIGIT=12;
    public static final int ENTRYPOINT=13;
    public static final int FUNCBODY=14;
    public static final int HEADERS=15;
    public static final int IDENT=16;
    public static final int IO=17;
    public static final int LETTER=18;
    public static final int NAME=19;
    public static final int NEG=20;
    public static final int NNLCHAR=21;
    public static final int NUMBER=22;
    public static final int PARAM=23;
    public static final int PROCEDURE=24;
    public static final int PROGSTRUCTURE=25;
    public static final int STATEMENT=26;
    public static final int STATEMENTS=27;
    public static final int STRING=28;
    public static final int TIDENT=29;
    public static final int TYPE=30;
    public static final int WS=31;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public grammarlolParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public grammarlolParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[56+1];
         

    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return grammarlolParser.tokenNames; }
    public String getGrammarFileName() { return "/home/cronin/Brogramming/grammarlol.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // /home/cronin/Brogramming/grammarlol.g:37:1: program : ( includes decls ( procedure )* main ) -> ^( PROGSTRUCTURE decls ( procedure )* main ) ;
    public final grammarlolParser.program_return program() throws RecognitionException {
        grammarlolParser.program_return retval = new grammarlolParser.program_return();
        retval.start = input.LT(1);

        int program_StartIndex = input.index();

        Object root_0 = null;

        grammarlolParser.includes_return includes1 =null;

        grammarlolParser.decls_return decls2 =null;

        grammarlolParser.procedure_return procedure3 =null;

        grammarlolParser.main_return main4 =null;


        RewriteRuleSubtreeStream stream_decls=new RewriteRuleSubtreeStream(adaptor,"rule decls");
        RewriteRuleSubtreeStream stream_includes=new RewriteRuleSubtreeStream(adaptor,"rule includes");
        RewriteRuleSubtreeStream stream_procedure=new RewriteRuleSubtreeStream(adaptor,"rule procedure");
        RewriteRuleSubtreeStream stream_main=new RewriteRuleSubtreeStream(adaptor,"rule main");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

            // /home/cronin/Brogramming/grammarlol.g:37:9: ( ( includes decls ( procedure )* main ) -> ^( PROGSTRUCTURE decls ( procedure )* main ) )
            // /home/cronin/Brogramming/grammarlol.g:37:12: ( includes decls ( procedure )* main )
            {
            // /home/cronin/Brogramming/grammarlol.g:37:12: ( includes decls ( procedure )* main )
            // /home/cronin/Brogramming/grammarlol.g:37:13: includes decls ( procedure )* main
            {
            pushFollow(FOLLOW_includes_in_program122);
            includes1=includes();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_includes.add(includes1.getTree());

            pushFollow(FOLLOW_decls_in_program124);
            decls2=decls();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_decls.add(decls2.getTree());

            // /home/cronin/Brogramming/grammarlol.g:37:28: ( procedure )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IDENT||LA1_0==49||LA1_0==52) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/cronin/Brogramming/grammarlol.g:37:29: procedure
            	    {
            	    pushFollow(FOLLOW_procedure_in_program127);
            	    procedure3=procedure();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_procedure.add(procedure3.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            pushFollow(FOLLOW_main_in_program131);
            main4=main();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_main.add(main4.getTree());

            }


            // AST REWRITE
            // elements: procedure, main, decls
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 37:47: -> ^( PROGSTRUCTURE decls ( procedure )* main )
            {
                // /home/cronin/Brogramming/grammarlol.g:37:50: ^( PROGSTRUCTURE decls ( procedure )* main )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PROGSTRUCTURE, "PROGSTRUCTURE")
                , root_1);

                adaptor.addChild(root_1, stream_decls.nextTree());

                // /home/cronin/Brogramming/grammarlol.g:37:72: ( procedure )*
                while ( stream_procedure.hasNext() ) {
                    adaptor.addChild(root_1, stream_procedure.nextTree());

                }
                stream_procedure.reset();

                adaptor.addChild(root_1, stream_main.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, program_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "program"


    public static class includes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "includes"
    // /home/cronin/Brogramming/grammarlol.g:41:1: includes : ( '#include' STRING )* ;
    public final grammarlolParser.includes_return includes() throws RecognitionException {
        grammarlolParser.includes_return retval = new grammarlolParser.includes_return();
        retval.start = input.LT(1);

        int includes_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal5=null;
        Token STRING6=null;

        Object string_literal5_tree=null;
        Object STRING6_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

            // /home/cronin/Brogramming/grammarlol.g:42:2: ( ( '#include' STRING )* )
            // /home/cronin/Brogramming/grammarlol.g:42:4: ( '#include' STRING )*
            {
            root_0 = (Object)adaptor.nil();


            // /home/cronin/Brogramming/grammarlol.g:42:4: ( '#include' STRING )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==33) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/cronin/Brogramming/grammarlol.g:42:5: '#include' STRING
            	    {
            	    string_literal5=(Token)match(input,33,FOLLOW_33_in_includes160); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal5_tree = 
            	    (Object)adaptor.create(string_literal5)
            	    ;
            	    adaptor.addChild(root_0, string_literal5_tree);
            	    }

            	    STRING6=(Token)match(input,STRING,FOLLOW_STRING_in_includes162); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    STRING6_tree = 
            	    (Object)adaptor.create(STRING6)
            	    ;
            	    adaptor.addChild(root_0, STRING6_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, includes_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "includes"


    public static class stmtlist_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtlist"
    // /home/cronin/Brogramming/grammarlol.g:46:1: stmtlist : ( stmt )* -> ^( STATEMENTS ( stmt )* ) ;
    public final grammarlolParser.stmtlist_return stmtlist() throws RecognitionException {
        grammarlolParser.stmtlist_return retval = new grammarlolParser.stmtlist_return();
        retval.start = input.LT(1);

        int stmtlist_StartIndex = input.index();

        Object root_0 = null;

        grammarlolParser.stmt_return stmt7 =null;


        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

            // /home/cronin/Brogramming/grammarlol.g:46:9: ( ( stmt )* -> ^( STATEMENTS ( stmt )* ) )
            // /home/cronin/Brogramming/grammarlol.g:46:11: ( stmt )*
            {
            // /home/cronin/Brogramming/grammarlol.g:46:11: ( stmt )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==IDENT||LA3_0==51||(LA3_0 >= 54 && LA3_0 <= 61)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/cronin/Brogramming/grammarlol.g:46:12: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_stmtlist176);
            	    stmt7=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stmt.add(stmt7.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // AST REWRITE
            // elements: stmt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 46:19: -> ^( STATEMENTS ( stmt )* )
            {
                // /home/cronin/Brogramming/grammarlol.g:46:22: ^( STATEMENTS ( stmt )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STATEMENTS, "STATEMENTS")
                , root_1);

                // /home/cronin/Brogramming/grammarlol.g:46:35: ( stmt )*
                while ( stream_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmt.nextTree());

                }
                stream_stmt.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, stmtlist_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtlist"


    public static class main_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "main"
    // /home/cronin/Brogramming/grammarlol.g:50:1: main : 'main' '(' ')' body -> ^( ENTRYPOINT body ) ;
    public final grammarlolParser.main_return main() throws RecognitionException {
        grammarlolParser.main_return retval = new grammarlolParser.main_return();
        retval.start = input.LT(1);

        int main_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal8=null;
        Token char_literal9=null;
        Token char_literal10=null;
        grammarlolParser.body_return body11 =null;


        Object string_literal8_tree=null;
        Object char_literal9_tree=null;
        Object char_literal10_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

            // /home/cronin/Brogramming/grammarlol.g:50:6: ( 'main' '(' ')' body -> ^( ENTRYPOINT body ) )
            // /home/cronin/Brogramming/grammarlol.g:50:8: 'main' '(' ')' body
            {
            string_literal8=(Token)match(input,53,FOLLOW_53_in_main198); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(string_literal8);


            char_literal9=(Token)match(input,35,FOLLOW_35_in_main200); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_35.add(char_literal9);


            char_literal10=(Token)match(input,36,FOLLOW_36_in_main202); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_36.add(char_literal10);


            pushFollow(FOLLOW_body_in_main204);
            body11=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_body.add(body11.getTree());

            // AST REWRITE
            // elements: body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 50:28: -> ^( ENTRYPOINT body )
            {
                // /home/cronin/Brogramming/grammarlol.g:50:31: ^( ENTRYPOINT body )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ENTRYPOINT, "ENTRYPOINT")
                , root_1);

                adaptor.addChild(root_1, stream_body.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, main_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "main"


    public static class procedure_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "procedure"
    // /home/cronin/Brogramming/grammarlol.g:54:1: procedure : (type= 'int' |type= 'char' )? IDENT '(' args ')' body -> ^( PROCEDURE ( ^( TYPE $type) )? ^( NAME IDENT ) args body ) ;
    public final grammarlolParser.procedure_return procedure() throws RecognitionException {
        grammarlolParser.procedure_return retval = new grammarlolParser.procedure_return();
        retval.start = input.LT(1);

        int procedure_StartIndex = input.index();

        Object root_0 = null;

        Token type=null;
        Token IDENT12=null;
        Token char_literal13=null;
        Token char_literal15=null;
        grammarlolParser.args_return args14 =null;

        grammarlolParser.body_return body16 =null;


        Object type_tree=null;
        Object IDENT12_tree=null;
        Object char_literal13_tree=null;
        Object char_literal15_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

            // /home/cronin/Brogramming/grammarlol.g:55:2: ( (type= 'int' |type= 'char' )? IDENT '(' args ')' body -> ^( PROCEDURE ( ^( TYPE $type) )? ^( NAME IDENT ) args body ) )
            // /home/cronin/Brogramming/grammarlol.g:55:4: (type= 'int' |type= 'char' )? IDENT '(' args ')' body
            {
            // /home/cronin/Brogramming/grammarlol.g:55:4: (type= 'int' |type= 'char' )?
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==52) ) {
                alt4=1;
            }
            else if ( (LA4_0==49) ) {
                alt4=2;
            }
            switch (alt4) {
                case 1 :
                    // /home/cronin/Brogramming/grammarlol.g:55:5: type= 'int'
                    {
                    type=(Token)match(input,52,FOLLOW_52_in_procedure228); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_52.add(type);


                    }
                    break;
                case 2 :
                    // /home/cronin/Brogramming/grammarlol.g:55:16: type= 'char'
                    {
                    type=(Token)match(input,49,FOLLOW_49_in_procedure232); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_49.add(type);


                    }
                    break;

            }


            IDENT12=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedure236); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT12);


            char_literal13=(Token)match(input,35,FOLLOW_35_in_procedure238); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_35.add(char_literal13);


            pushFollow(FOLLOW_args_in_procedure240);
            args14=args();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_args.add(args14.getTree());

            char_literal15=(Token)match(input,36,FOLLOW_36_in_procedure242); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_36.add(char_literal15);


            pushFollow(FOLLOW_body_in_procedure244);
            body16=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_body.add(body16.getTree());

            // AST REWRITE
            // elements: body, args, IDENT, type
            // token labels: type
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_type=new RewriteRuleTokenStream(adaptor,"token type",type);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 55:54: -> ^( PROCEDURE ( ^( TYPE $type) )? ^( NAME IDENT ) args body )
            {
                // /home/cronin/Brogramming/grammarlol.g:55:57: ^( PROCEDURE ( ^( TYPE $type) )? ^( NAME IDENT ) args body )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PROCEDURE, "PROCEDURE")
                , root_1);

                // /home/cronin/Brogramming/grammarlol.g:55:69: ( ^( TYPE $type) )?
                if ( stream_type.hasNext() ) {
                    // /home/cronin/Brogramming/grammarlol.g:55:69: ^( TYPE $type)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(TYPE, "TYPE")
                    , root_2);

                    adaptor.addChild(root_2, stream_type.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_type.reset();

                // /home/cronin/Brogramming/grammarlol.g:55:84: ^( NAME IDENT )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(NAME, "NAME")
                , root_2);

                adaptor.addChild(root_2, 
                stream_IDENT.nextNode()
                );

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_args.nextTree());

                adaptor.addChild(root_1, stream_body.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, procedure_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "procedure"


    public static class body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "body"
    // /home/cronin/Brogramming/grammarlol.g:59:1: body : '{' decls stmtlist '}' -> ^( FUNCBODY decls stmtlist ) ;
    public final grammarlolParser.body_return body() throws RecognitionException {
        grammarlolParser.body_return retval = new grammarlolParser.body_return();
        retval.start = input.LT(1);

        int body_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal17=null;
        Token char_literal20=null;
        grammarlolParser.decls_return decls18 =null;

        grammarlolParser.stmtlist_return stmtlist19 =null;


        Object char_literal17_tree=null;
        Object char_literal20_tree=null;
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_stmtlist=new RewriteRuleSubtreeStream(adaptor,"rule stmtlist");
        RewriteRuleSubtreeStream stream_decls=new RewriteRuleSubtreeStream(adaptor,"rule decls");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

            // /home/cronin/Brogramming/grammarlol.g:59:6: ( '{' decls stmtlist '}' -> ^( FUNCBODY decls stmtlist ) )
            // /home/cronin/Brogramming/grammarlol.g:59:8: '{' decls stmtlist '}'
            {
            char_literal17=(Token)match(input,61,FOLLOW_61_in_body279); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_61.add(char_literal17);


            pushFollow(FOLLOW_decls_in_body281);
            decls18=decls();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_decls.add(decls18.getTree());

            pushFollow(FOLLOW_stmtlist_in_body283);
            stmtlist19=stmtlist();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtlist.add(stmtlist19.getTree());

            char_literal20=(Token)match(input,62,FOLLOW_62_in_body285); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_62.add(char_literal20);


            // AST REWRITE
            // elements: decls, stmtlist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 59:31: -> ^( FUNCBODY decls stmtlist )
            {
                // /home/cronin/Brogramming/grammarlol.g:59:34: ^( FUNCBODY decls stmtlist )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FUNCBODY, "FUNCBODY")
                , root_1);

                adaptor.addChild(root_1, stream_decls.nextTree());

                adaptor.addChild(root_1, stream_stmtlist.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, body_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "body"


    public static class typedident_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedident"
    // /home/cronin/Brogramming/grammarlol.g:63:1: typedident : (type= 'int' |type= 'char' ) IDENT -> ^( TIDENT ^( TYPE $type) ^( NAME IDENT ) ) ;
    public final grammarlolParser.typedident_return typedident() throws RecognitionException {
        grammarlolParser.typedident_return retval = new grammarlolParser.typedident_return();
        retval.start = input.LT(1);

        int typedident_StartIndex = input.index();

        Object root_0 = null;

        Token type=null;
        Token IDENT21=null;

        Object type_tree=null;
        Object IDENT21_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

            // /home/cronin/Brogramming/grammarlol.g:64:4: ( (type= 'int' |type= 'char' ) IDENT -> ^( TIDENT ^( TYPE $type) ^( NAME IDENT ) ) )
            // /home/cronin/Brogramming/grammarlol.g:64:6: (type= 'int' |type= 'char' ) IDENT
            {
            // /home/cronin/Brogramming/grammarlol.g:64:6: (type= 'int' |type= 'char' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==52) ) {
                alt5=1;
            }
            else if ( (LA5_0==49) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /home/cronin/Brogramming/grammarlol.g:64:7: type= 'int'
                    {
                    type=(Token)match(input,52,FOLLOW_52_in_typedident312); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_52.add(type);


                    }
                    break;
                case 2 :
                    // /home/cronin/Brogramming/grammarlol.g:64:18: type= 'char'
                    {
                    type=(Token)match(input,49,FOLLOW_49_in_typedident316); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_49.add(type);


                    }
                    break;

            }


            IDENT21=(Token)match(input,IDENT,FOLLOW_IDENT_in_typedident319); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT21);


            // AST REWRITE
            // elements: IDENT, type
            // token labels: type
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_type=new RewriteRuleTokenStream(adaptor,"token type",type);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 64:37: -> ^( TIDENT ^( TYPE $type) ^( NAME IDENT ) )
            {
                // /home/cronin/Brogramming/grammarlol.g:64:40: ^( TIDENT ^( TYPE $type) ^( NAME IDENT ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TIDENT, "TIDENT")
                , root_1);

                // /home/cronin/Brogramming/grammarlol.g:64:49: ^( TYPE $type)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TYPE, "TYPE")
                , root_2);

                adaptor.addChild(root_2, stream_type.nextNode());

                adaptor.addChild(root_1, root_2);
                }

                // /home/cronin/Brogramming/grammarlol.g:64:63: ^( NAME IDENT )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(NAME, "NAME")
                , root_2);

                adaptor.addChild(root_2, 
                stream_IDENT.nextNode()
                );

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, typedident_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typedident"


    public static class args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "args"
    // /home/cronin/Brogramming/grammarlol.g:68:1: args : ( ( typedident ) ( ',' typedident )* )? -> ^( ARGUMENTS ( typedident )* ) ;
    public final grammarlolParser.args_return args() throws RecognitionException {
        grammarlolParser.args_return retval = new grammarlolParser.args_return();
        retval.start = input.LT(1);

        int args_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal23=null;
        grammarlolParser.typedident_return typedident22 =null;

        grammarlolParser.typedident_return typedident24 =null;


        Object char_literal23_tree=null;
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_typedident=new RewriteRuleSubtreeStream(adaptor,"rule typedident");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

            // /home/cronin/Brogramming/grammarlol.g:68:7: ( ( ( typedident ) ( ',' typedident )* )? -> ^( ARGUMENTS ( typedident )* ) )
            // /home/cronin/Brogramming/grammarlol.g:68:9: ( ( typedident ) ( ',' typedident )* )?
            {
            // /home/cronin/Brogramming/grammarlol.g:68:9: ( ( typedident ) ( ',' typedident )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==49||LA7_0==52) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/cronin/Brogramming/grammarlol.g:68:10: ( typedident ) ( ',' typedident )*
                    {
                    // /home/cronin/Brogramming/grammarlol.g:68:10: ( typedident )
                    // /home/cronin/Brogramming/grammarlol.g:68:11: typedident
                    {
                    pushFollow(FOLLOW_typedident_in_args354);
                    typedident22=typedident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typedident.add(typedident22.getTree());

                    }


                    // /home/cronin/Brogramming/grammarlol.g:68:22: ( ',' typedident )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==39) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /home/cronin/Brogramming/grammarlol.g:68:23: ',' typedident
                    	    {
                    	    char_literal23=(Token)match(input,39,FOLLOW_39_in_args357); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_39.add(char_literal23);


                    	    pushFollow(FOLLOW_typedident_in_args358);
                    	    typedident24=typedident();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_typedident.add(typedident24.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }


            // AST REWRITE
            // elements: typedident
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 68:41: -> ^( ARGUMENTS ( typedident )* )
            {
                // /home/cronin/Brogramming/grammarlol.g:68:44: ^( ARGUMENTS ( typedident )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ARGUMENTS, "ARGUMENTS")
                , root_1);

                // /home/cronin/Brogramming/grammarlol.g:68:56: ( typedident )*
                while ( stream_typedident.hasNext() ) {
                    adaptor.addChild(root_1, stream_typedident.nextTree());

                }
                stream_typedident.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, args_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "args"


    public static class decls_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "decls"
    // /home/cronin/Brogramming/grammarlol.g:72:1: decls : ( typedident ';' )* -> ^( DECLARATION ( typedident )* ) ;
    public final grammarlolParser.decls_return decls() throws RecognitionException {
        grammarlolParser.decls_return retval = new grammarlolParser.decls_return();
        retval.start = input.LT(1);

        int decls_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal26=null;
        grammarlolParser.typedident_return typedident25 =null;


        Object char_literal26_tree=null;
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleSubtreeStream stream_typedident=new RewriteRuleSubtreeStream(adaptor,"rule typedident");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

            // /home/cronin/Brogramming/grammarlol.g:72:9: ( ( typedident ';' )* -> ^( DECLARATION ( typedident )* ) )
            // /home/cronin/Brogramming/grammarlol.g:72:11: ( typedident ';' )*
            {
            // /home/cronin/Brogramming/grammarlol.g:72:11: ( typedident ';' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==52) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==IDENT) ) {
                        int LA8_4 = input.LA(3);

                        if ( (LA8_4==42) ) {
                            alt8=1;
                        }


                    }


                }
                else if ( (LA8_0==49) ) {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==IDENT) ) {
                        int LA8_4 = input.LA(3);

                        if ( (LA8_4==42) ) {
                            alt8=1;
                        }


                    }


                }


                switch (alt8) {
            	case 1 :
            	    // /home/cronin/Brogramming/grammarlol.g:72:12: typedident ';'
            	    {
            	    pushFollow(FOLLOW_typedident_in_decls386);
            	    typedident25=typedident();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_typedident.add(typedident25.getTree());

            	    char_literal26=(Token)match(input,42,FOLLOW_42_in_decls387); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_42.add(char_literal26);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            // AST REWRITE
            // elements: typedident
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 72:28: -> ^( DECLARATION ( typedident )* )
            {
                // /home/cronin/Brogramming/grammarlol.g:72:31: ^( DECLARATION ( typedident )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DECLARATION, "DECLARATION")
                , root_1);

                // /home/cronin/Brogramming/grammarlol.g:72:45: ( typedident )*
                while ( stream_typedident.hasNext() ) {
                    adaptor.addChild(root_1, stream_typedident.nextTree());

                }
                stream_typedident.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, decls_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "decls"


    public static class exp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exp"
    // /home/cronin/Brogramming/grammarlol.g:76:1: exp : lexp ( ( '>' ^| '>=' ^| '<' ^| '<=' ^| '==' ^| '!=' ^) lexp )? ;
    public final grammarlolParser.exp_return exp() throws RecognitionException {
        grammarlolParser.exp_return retval = new grammarlolParser.exp_return();
        retval.start = input.LT(1);

        int exp_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal28=null;
        Token string_literal29=null;
        Token char_literal30=null;
        Token string_literal31=null;
        Token string_literal32=null;
        Token string_literal33=null;
        grammarlolParser.lexp_return lexp27 =null;

        grammarlolParser.lexp_return lexp34 =null;


        Object char_literal28_tree=null;
        Object string_literal29_tree=null;
        Object char_literal30_tree=null;
        Object string_literal31_tree=null;
        Object string_literal32_tree=null;
        Object string_literal33_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // /home/cronin/Brogramming/grammarlol.g:76:6: ( lexp ( ( '>' ^| '>=' ^| '<' ^| '<=' ^| '==' ^| '!=' ^) lexp )? )
            // /home/cronin/Brogramming/grammarlol.g:76:8: lexp ( ( '>' ^| '>=' ^| '<' ^| '<=' ^| '==' ^| '!=' ^) lexp )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_lexp_in_exp411);
            lexp27=lexp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, lexp27.getTree());

            // /home/cronin/Brogramming/grammarlol.g:76:12: ( ( '>' ^| '>=' ^| '<' ^| '<=' ^| '==' ^| '!=' ^) lexp )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32||(LA10_0 >= 43 && LA10_0 <= 44)||(LA10_0 >= 46 && LA10_0 <= 48)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/cronin/Brogramming/grammarlol.g:76:13: ( '>' ^| '>=' ^| '<' ^| '<=' ^| '==' ^| '!=' ^) lexp
                    {
                    // /home/cronin/Brogramming/grammarlol.g:76:13: ( '>' ^| '>=' ^| '<' ^| '<=' ^| '==' ^| '!=' ^)
                    int alt9=6;
                    switch ( input.LA(1) ) {
                    case 47:
                        {
                        alt9=1;
                        }
                        break;
                    case 48:
                        {
                        alt9=2;
                        }
                        break;
                    case 43:
                        {
                        alt9=3;
                        }
                        break;
                    case 44:
                        {
                        alt9=4;
                        }
                        break;
                    case 46:
                        {
                        alt9=5;
                        }
                        break;
                    case 32:
                        {
                        alt9=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;

                    }

                    switch (alt9) {
                        case 1 :
                            // /home/cronin/Brogramming/grammarlol.g:76:14: '>' ^
                            {
                            char_literal28=(Token)match(input,47,FOLLOW_47_in_exp414); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal28_tree = 
                            (Object)adaptor.create(char_literal28)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal28_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /home/cronin/Brogramming/grammarlol.g:76:19: '>=' ^
                            {
                            string_literal29=(Token)match(input,48,FOLLOW_48_in_exp417); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal29_tree = 
                            (Object)adaptor.create(string_literal29)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal29_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // /home/cronin/Brogramming/grammarlol.g:76:25: '<' ^
                            {
                            char_literal30=(Token)match(input,43,FOLLOW_43_in_exp420); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal30_tree = 
                            (Object)adaptor.create(char_literal30)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(char_literal30_tree, root_0);
                            }

                            }
                            break;
                        case 4 :
                            // /home/cronin/Brogramming/grammarlol.g:76:30: '<=' ^
                            {
                            string_literal31=(Token)match(input,44,FOLLOW_44_in_exp423); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal31_tree = 
                            (Object)adaptor.create(string_literal31)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal31_tree, root_0);
                            }

                            }
                            break;
                        case 5 :
                            // /home/cronin/Brogramming/grammarlol.g:76:36: '==' ^
                            {
                            string_literal32=(Token)match(input,46,FOLLOW_46_in_exp426); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal32_tree = 
                            (Object)adaptor.create(string_literal32)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal32_tree, root_0);
                            }

                            }
                            break;
                        case 6 :
                            // /home/cronin/Brogramming/grammarlol.g:76:42: '!=' ^
                            {
                            string_literal33=(Token)match(input,32,FOLLOW_32_in_exp429); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal33_tree = 
                            (Object)adaptor.create(string_literal33)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(string_literal33_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_lexp_in_exp432);
                    lexp34=lexp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lexp34.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, exp_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exp"


    public static class stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt"
    // /home/cronin/Brogramming/grammarlol.g:82:1: stmt : ( ( '{' stmtlist '}' ) -> ^( STATEMENT stmtlist ) | 'while' '(' exp ')' stmt -> ^( STATEMENT 'while' exp stmt ) | 'if' '(' exp ')' stmt ( 'else' stmt )? -> ^( STATEMENT 'if' exp stmt ) | IDENT '=' lexp ';' -> ^( STATEMENT ASSIGN ^( NAME IDENT ) lexp ) | (action= 'read' |action= 'output' |action= 'readc' |action= 'outputc' ) '(' IDENT ')' ';' -> ^( STATEMENT ^( IO $action) ^( NAME IDENT ) ) | 'print' '(' STRING ')' ';' -> ^( STATEMENT ^( IO 'print' ) STRING ) | 'return' ( lexp )? ';' -> ^( STATEMENT 'return' ( lexp )? ) | IDENT '(' ( IDENT ( ',' IDENT )* )? ')' ';' -> ^( CALL ^( NAME IDENT ) ^( PARAM ( ^( NAME IDENT ) )* ) ) );
    public final grammarlolParser.stmt_return stmt() throws RecognitionException {
        grammarlolParser.stmt_return retval = new grammarlolParser.stmt_return();
        retval.start = input.LT(1);

        int stmt_StartIndex = input.index();

        Object root_0 = null;

        Token action=null;
        Token char_literal35=null;
        Token char_literal37=null;
        Token string_literal38=null;
        Token char_literal39=null;
        Token char_literal41=null;
        Token string_literal43=null;
        Token char_literal44=null;
        Token char_literal46=null;
        Token string_literal48=null;
        Token IDENT50=null;
        Token char_literal51=null;
        Token char_literal53=null;
        Token char_literal54=null;
        Token IDENT55=null;
        Token char_literal56=null;
        Token char_literal57=null;
        Token string_literal58=null;
        Token char_literal59=null;
        Token STRING60=null;
        Token char_literal61=null;
        Token char_literal62=null;
        Token string_literal63=null;
        Token char_literal65=null;
        Token IDENT66=null;
        Token char_literal67=null;
        Token IDENT68=null;
        Token char_literal69=null;
        Token IDENT70=null;
        Token char_literal71=null;
        Token char_literal72=null;
        grammarlolParser.stmtlist_return stmtlist36 =null;

        grammarlolParser.exp_return exp40 =null;

        grammarlolParser.stmt_return stmt42 =null;

        grammarlolParser.exp_return exp45 =null;

        grammarlolParser.stmt_return stmt47 =null;

        grammarlolParser.stmt_return stmt49 =null;

        grammarlolParser.lexp_return lexp52 =null;

        grammarlolParser.lexp_return lexp64 =null;


        Object action_tree=null;
        Object char_literal35_tree=null;
        Object char_literal37_tree=null;
        Object string_literal38_tree=null;
        Object char_literal39_tree=null;
        Object char_literal41_tree=null;
        Object string_literal43_tree=null;
        Object char_literal44_tree=null;
        Object char_literal46_tree=null;
        Object string_literal48_tree=null;
        Object IDENT50_tree=null;
        Object char_literal51_tree=null;
        Object char_literal53_tree=null;
        Object char_literal54_tree=null;
        Object IDENT55_tree=null;
        Object char_literal56_tree=null;
        Object char_literal57_tree=null;
        Object string_literal58_tree=null;
        Object char_literal59_tree=null;
        Object STRING60_tree=null;
        Object char_literal61_tree=null;
        Object char_literal62_tree=null;
        Object string_literal63_tree=null;
        Object char_literal65_tree=null;
        Object IDENT66_tree=null;
        Object char_literal67_tree=null;
        Object IDENT68_tree=null;
        Object char_literal69_tree=null;
        Object IDENT70_tree=null;
        Object char_literal71_tree=null;
        Object char_literal72_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_stmtlist=new RewriteRuleSubtreeStream(adaptor,"rule stmtlist");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        RewriteRuleSubtreeStream stream_lexp=new RewriteRuleSubtreeStream(adaptor,"rule lexp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // /home/cronin/Brogramming/grammarlol.g:82:6: ( ( '{' stmtlist '}' ) -> ^( STATEMENT stmtlist ) | 'while' '(' exp ')' stmt -> ^( STATEMENT 'while' exp stmt ) | 'if' '(' exp ')' stmt ( 'else' stmt )? -> ^( STATEMENT 'if' exp stmt ) | IDENT '=' lexp ';' -> ^( STATEMENT ASSIGN ^( NAME IDENT ) lexp ) | (action= 'read' |action= 'output' |action= 'readc' |action= 'outputc' ) '(' IDENT ')' ';' -> ^( STATEMENT ^( IO $action) ^( NAME IDENT ) ) | 'print' '(' STRING ')' ';' -> ^( STATEMENT ^( IO 'print' ) STRING ) | 'return' ( lexp )? ';' -> ^( STATEMENT 'return' ( lexp )? ) | IDENT '(' ( IDENT ( ',' IDENT )* )? ')' ';' -> ^( CALL ^( NAME IDENT ) ^( PARAM ( ^( NAME IDENT ) )* ) ) )
            int alt16=8;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt16=1;
                }
                break;
            case 60:
                {
                alt16=2;
                }
                break;
            case 51:
                {
                alt16=3;
                }
                break;
            case IDENT:
                {
                int LA16_4 = input.LA(2);

                if ( (LA16_4==45) ) {
                    alt16=4;
                }
                else if ( (LA16_4==35) ) {
                    alt16=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 4, input);

                    throw nvae;

                }
                }
                break;
            case 54:
            case 55:
            case 57:
            case 58:
                {
                alt16=5;
                }
                break;
            case 56:
                {
                alt16=6;
                }
                break;
            case 59:
                {
                alt16=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // /home/cronin/Brogramming/grammarlol.g:82:8: ( '{' stmtlist '}' )
                    {
                    // /home/cronin/Brogramming/grammarlol.g:82:8: ( '{' stmtlist '}' )
                    // /home/cronin/Brogramming/grammarlol.g:82:9: '{' stmtlist '}'
                    {
                    char_literal35=(Token)match(input,61,FOLLOW_61_in_stmt449); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_61.add(char_literal35);


                    pushFollow(FOLLOW_stmtlist_in_stmt451);
                    stmtlist36=stmtlist();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtlist.add(stmtlist36.getTree());

                    char_literal37=(Token)match(input,62,FOLLOW_62_in_stmt453); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_62.add(char_literal37);


                    }


                    // AST REWRITE
                    // elements: stmtlist
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 82:32: -> ^( STATEMENT stmtlist )
                    {
                        // /home/cronin/Brogramming/grammarlol.g:82:35: ^( STATEMENT stmtlist )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(STATEMENT, "STATEMENT")
                        , root_1);

                        adaptor.addChild(root_1, stream_stmtlist.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/cronin/Brogramming/grammarlol.g:83:4: 'while' '(' exp ')' stmt
                    {
                    string_literal38=(Token)match(input,60,FOLLOW_60_in_stmt472); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_60.add(string_literal38);


                    char_literal39=(Token)match(input,35,FOLLOW_35_in_stmt474); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(char_literal39);


                    pushFollow(FOLLOW_exp_in_stmt476);
                    exp40=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp40.getTree());

                    char_literal41=(Token)match(input,36,FOLLOW_36_in_stmt478); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_36.add(char_literal41);


                    pushFollow(FOLLOW_stmt_in_stmt480);
                    stmt42=stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmt.add(stmt42.getTree());

                    // AST REWRITE
                    // elements: exp, stmt, 60
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 83:33: -> ^( STATEMENT 'while' exp stmt )
                    {
                        // /home/cronin/Brogramming/grammarlol.g:83:36: ^( STATEMENT 'while' exp stmt )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(STATEMENT, "STATEMENT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_60.nextNode()
                        );

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_1, stream_stmt.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // /home/cronin/Brogramming/grammarlol.g:84:4: 'if' '(' exp ')' stmt ( 'else' stmt )?
                    {
                    string_literal43=(Token)match(input,51,FOLLOW_51_in_stmt501); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_51.add(string_literal43);


                    char_literal44=(Token)match(input,35,FOLLOW_35_in_stmt504); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(char_literal44);


                    pushFollow(FOLLOW_exp_in_stmt506);
                    exp45=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp45.getTree());

                    char_literal46=(Token)match(input,36,FOLLOW_36_in_stmt508); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_36.add(char_literal46);


                    pushFollow(FOLLOW_stmt_in_stmt510);
                    stmt47=stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmt.add(stmt47.getTree());

                    // /home/cronin/Brogramming/grammarlol.g:84:27: ( 'else' stmt )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==50) ) {
                        int LA11_1 = input.LA(2);

                        if ( (synpred18_grammarlol()) ) {
                            alt11=1;
                        }
                    }
                    switch (alt11) {
                        case 1 :
                            // /home/cronin/Brogramming/grammarlol.g:84:28: 'else' stmt
                            {
                            string_literal48=(Token)match(input,50,FOLLOW_50_in_stmt513); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_50.add(string_literal48);


                            pushFollow(FOLLOW_stmt_in_stmt515);
                            stmt49=stmt();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_stmt.add(stmt49.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: 51, stmt, exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 84:44: -> ^( STATEMENT 'if' exp stmt )
                    {
                        // /home/cronin/Brogramming/grammarlol.g:84:47: ^( STATEMENT 'if' exp stmt )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(STATEMENT, "STATEMENT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_51.nextNode()
                        );

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_1, stream_stmt.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // /home/cronin/Brogramming/grammarlol.g:85:4: IDENT '=' lexp ';'
                    {
                    IDENT50=(Token)match(input,IDENT,FOLLOW_IDENT_in_stmt536); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT50);


                    char_literal51=(Token)match(input,45,FOLLOW_45_in_stmt538); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_45.add(char_literal51);


                    pushFollow(FOLLOW_lexp_in_stmt540);
                    lexp52=lexp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_lexp.add(lexp52.getTree());

                    char_literal53=(Token)match(input,42,FOLLOW_42_in_stmt542); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_42.add(char_literal53);


                    // AST REWRITE
                    // elements: lexp, IDENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 85:26: -> ^( STATEMENT ASSIGN ^( NAME IDENT ) lexp )
                    {
                        // /home/cronin/Brogramming/grammarlol.g:85:29: ^( STATEMENT ASSIGN ^( NAME IDENT ) lexp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(STATEMENT, "STATEMENT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (Object)adaptor.create(ASSIGN, "ASSIGN")
                        );

                        // /home/cronin/Brogramming/grammarlol.g:85:48: ^( NAME IDENT )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NAME, "NAME")
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_IDENT.nextNode()
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_lexp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // /home/cronin/Brogramming/grammarlol.g:86:4: (action= 'read' |action= 'output' |action= 'readc' |action= 'outputc' ) '(' IDENT ')' ';'
                    {
                    // /home/cronin/Brogramming/grammarlol.g:86:4: (action= 'read' |action= 'output' |action= 'readc' |action= 'outputc' )
                    int alt12=4;
                    switch ( input.LA(1) ) {
                    case 57:
                        {
                        alt12=1;
                        }
                        break;
                    case 54:
                        {
                        alt12=2;
                        }
                        break;
                    case 58:
                        {
                        alt12=3;
                        }
                        break;
                    case 55:
                        {
                        alt12=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;

                    }

                    switch (alt12) {
                        case 1 :
                            // /home/cronin/Brogramming/grammarlol.g:86:5: action= 'read'
                            {
                            action=(Token)match(input,57,FOLLOW_57_in_stmt569); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_57.add(action);


                            }
                            break;
                        case 2 :
                            // /home/cronin/Brogramming/grammarlol.g:86:19: action= 'output'
                            {
                            action=(Token)match(input,54,FOLLOW_54_in_stmt573); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_54.add(action);


                            }
                            break;
                        case 3 :
                            // /home/cronin/Brogramming/grammarlol.g:86:35: action= 'readc'
                            {
                            action=(Token)match(input,58,FOLLOW_58_in_stmt577); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_58.add(action);


                            }
                            break;
                        case 4 :
                            // /home/cronin/Brogramming/grammarlol.g:86:50: action= 'outputc'
                            {
                            action=(Token)match(input,55,FOLLOW_55_in_stmt581); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_55.add(action);


                            }
                            break;

                    }


                    char_literal54=(Token)match(input,35,FOLLOW_35_in_stmt584); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(char_literal54);


                    IDENT55=(Token)match(input,IDENT,FOLLOW_IDENT_in_stmt586); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT55);


                    char_literal56=(Token)match(input,36,FOLLOW_36_in_stmt588); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_36.add(char_literal56);


                    char_literal57=(Token)match(input,42,FOLLOW_42_in_stmt590); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_42.add(char_literal57);


                    // AST REWRITE
                    // elements: IDENT, action
                    // token labels: action
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_action=new RewriteRuleTokenStream(adaptor,"token action",action);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 86:86: -> ^( STATEMENT ^( IO $action) ^( NAME IDENT ) )
                    {
                        // /home/cronin/Brogramming/grammarlol.g:86:89: ^( STATEMENT ^( IO $action) ^( NAME IDENT ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(STATEMENT, "STATEMENT")
                        , root_1);

                        // /home/cronin/Brogramming/grammarlol.g:86:101: ^( IO $action)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(IO, "IO")
                        , root_2);

                        adaptor.addChild(root_2, stream_action.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }

                        // /home/cronin/Brogramming/grammarlol.g:86:115: ^( NAME IDENT )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NAME, "NAME")
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_IDENT.nextNode()
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // /home/cronin/Brogramming/grammarlol.g:87:4: 'print' '(' STRING ')' ';'
                    {
                    string_literal58=(Token)match(input,56,FOLLOW_56_in_stmt615); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_56.add(string_literal58);


                    char_literal59=(Token)match(input,35,FOLLOW_35_in_stmt617); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(char_literal59);


                    STRING60=(Token)match(input,STRING,FOLLOW_STRING_in_stmt619); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING.add(STRING60);


                    char_literal61=(Token)match(input,36,FOLLOW_36_in_stmt621); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_36.add(char_literal61);


                    char_literal62=(Token)match(input,42,FOLLOW_42_in_stmt623); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_42.add(char_literal62);


                    // AST REWRITE
                    // elements: STRING, 56
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 87:34: -> ^( STATEMENT ^( IO 'print' ) STRING )
                    {
                        // /home/cronin/Brogramming/grammarlol.g:87:37: ^( STATEMENT ^( IO 'print' ) STRING )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(STATEMENT, "STATEMENT")
                        , root_1);

                        // /home/cronin/Brogramming/grammarlol.g:87:49: ^( IO 'print' )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(IO, "IO")
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_56.nextNode()
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, 
                        stream_STRING.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // /home/cronin/Brogramming/grammarlol.g:88:4: 'return' ( lexp )? ';'
                    {
                    string_literal63=(Token)match(input,59,FOLLOW_59_in_stmt645); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_59.add(string_literal63);


                    // /home/cronin/Brogramming/grammarlol.g:88:13: ( lexp )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==CHARACTER||LA13_0==IDENT||LA13_0==NUMBER||LA13_0==35||LA13_0==40) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /home/cronin/Brogramming/grammarlol.g:88:13: lexp
                            {
                            pushFollow(FOLLOW_lexp_in_stmt647);
                            lexp64=lexp();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_lexp.add(lexp64.getTree());

                            }
                            break;

                    }


                    char_literal65=(Token)match(input,42,FOLLOW_42_in_stmt650); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_42.add(char_literal65);


                    // AST REWRITE
                    // elements: 59, lexp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 88:27: -> ^( STATEMENT 'return' ( lexp )? )
                    {
                        // /home/cronin/Brogramming/grammarlol.g:88:30: ^( STATEMENT 'return' ( lexp )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(STATEMENT, "STATEMENT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_59.nextNode()
                        );

                        // /home/cronin/Brogramming/grammarlol.g:88:51: ( lexp )?
                        if ( stream_lexp.hasNext() ) {
                            adaptor.addChild(root_1, stream_lexp.nextTree());

                        }
                        stream_lexp.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // /home/cronin/Brogramming/grammarlol.g:89:4: IDENT '(' ( IDENT ( ',' IDENT )* )? ')' ';'
                    {
                    IDENT66=(Token)match(input,IDENT,FOLLOW_IDENT_in_stmt670); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT66);


                    char_literal67=(Token)match(input,35,FOLLOW_35_in_stmt672); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(char_literal67);


                    // /home/cronin/Brogramming/grammarlol.g:89:13: ( IDENT ( ',' IDENT )* )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==IDENT) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /home/cronin/Brogramming/grammarlol.g:89:14: IDENT ( ',' IDENT )*
                            {
                            IDENT68=(Token)match(input,IDENT,FOLLOW_IDENT_in_stmt674); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENT.add(IDENT68);


                            // /home/cronin/Brogramming/grammarlol.g:89:19: ( ',' IDENT )*
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( (LA14_0==39) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // /home/cronin/Brogramming/grammarlol.g:89:20: ',' IDENT
                            	    {
                            	    char_literal69=(Token)match(input,39,FOLLOW_39_in_stmt676); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_39.add(char_literal69);


                            	    IDENT70=(Token)match(input,IDENT,FOLLOW_IDENT_in_stmt677); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_IDENT.add(IDENT70);


                            	    }
                            	    break;

                            	default :
                            	    break loop14;
                                }
                            } while (true);


                            }
                            break;

                    }


                    char_literal71=(Token)match(input,36,FOLLOW_36_in_stmt683); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_36.add(char_literal71);


                    char_literal72=(Token)match(input,42,FOLLOW_42_in_stmt685); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_42.add(char_literal72);


                    // AST REWRITE
                    // elements: IDENT, IDENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 89:43: -> ^( CALL ^( NAME IDENT ) ^( PARAM ( ^( NAME IDENT ) )* ) )
                    {
                        // /home/cronin/Brogramming/grammarlol.g:89:46: ^( CALL ^( NAME IDENT ) ^( PARAM ( ^( NAME IDENT ) )* ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CALL, "CALL")
                        , root_1);

                        // /home/cronin/Brogramming/grammarlol.g:89:53: ^( NAME IDENT )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NAME, "NAME")
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_IDENT.nextNode()
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        // /home/cronin/Brogramming/grammarlol.g:89:67: ^( PARAM ( ^( NAME IDENT ) )* )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PARAM, "PARAM")
                        , root_2);

                        // /home/cronin/Brogramming/grammarlol.g:89:75: ( ^( NAME IDENT ) )*
                        while ( stream_IDENT.hasNext() ) {
                            // /home/cronin/Brogramming/grammarlol.g:89:75: ^( NAME IDENT )
                            {
                            Object root_3 = (Object)adaptor.nil();
                            root_3 = (Object)adaptor.becomeRoot(
                            (Object)adaptor.create(NAME, "NAME")
                            , root_3);

                            adaptor.addChild(root_3, 
                            stream_IDENT.nextNode()
                            );

                            adaptor.addChild(root_2, root_3);
                            }

                        }
                        stream_IDENT.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, stmt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmt"


    public static class lexp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lexp"
    // /home/cronin/Brogramming/grammarlol.g:93:1: lexp : term ( ( '+' ^| '-' ^) term )* ;
    public final grammarlolParser.lexp_return lexp() throws RecognitionException {
        grammarlolParser.lexp_return retval = new grammarlolParser.lexp_return();
        retval.start = input.LT(1);

        int lexp_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal74=null;
        Token char_literal75=null;
        grammarlolParser.term_return term73 =null;

        grammarlolParser.term_return term76 =null;


        Object char_literal74_tree=null;
        Object char_literal75_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

            // /home/cronin/Brogramming/grammarlol.g:93:6: ( term ( ( '+' ^| '-' ^) term )* )
            // /home/cronin/Brogramming/grammarlol.g:93:9: term ( ( '+' ^| '-' ^) term )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term_in_lexp722);
            term73=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term73.getTree());

            // /home/cronin/Brogramming/grammarlol.g:93:14: ( ( '+' ^| '-' ^) term )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==38||LA18_0==40) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/cronin/Brogramming/grammarlol.g:93:15: ( '+' ^| '-' ^) term
            	    {
            	    // /home/cronin/Brogramming/grammarlol.g:93:15: ( '+' ^| '-' ^)
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==38) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==40) ) {
            	        alt17=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // /home/cronin/Brogramming/grammarlol.g:93:16: '+' ^
            	            {
            	            char_literal74=(Token)match(input,38,FOLLOW_38_in_lexp726); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal74_tree = 
            	            (Object)adaptor.create(char_literal74)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal74_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /home/cronin/Brogramming/grammarlol.g:93:21: '-' ^
            	            {
            	            char_literal75=(Token)match(input,40,FOLLOW_40_in_lexp729); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal75_tree = 
            	            (Object)adaptor.create(char_literal75)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal75_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_lexp732);
            	    term76=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term76.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, lexp_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "lexp"


    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /home/cronin/Brogramming/grammarlol.g:96:1: term : factor ( ( '*' ^| '/' ^| '%' ^) factor )* ;
    public final grammarlolParser.term_return term() throws RecognitionException {
        grammarlolParser.term_return retval = new grammarlolParser.term_return();
        retval.start = input.LT(1);

        int term_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal78=null;
        Token char_literal79=null;
        Token char_literal80=null;
        grammarlolParser.factor_return factor77 =null;

        grammarlolParser.factor_return factor81 =null;


        Object char_literal78_tree=null;
        Object char_literal79_tree=null;
        Object char_literal80_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // /home/cronin/Brogramming/grammarlol.g:96:6: ( factor ( ( '*' ^| '/' ^| '%' ^) factor )* )
            // /home/cronin/Brogramming/grammarlol.g:96:8: factor ( ( '*' ^| '/' ^| '%' ^) factor )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term745);
            factor77=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor77.getTree());

            // /home/cronin/Brogramming/grammarlol.g:96:14: ( ( '*' ^| '/' ^| '%' ^) factor )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==34||LA20_0==37||LA20_0==41) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/cronin/Brogramming/grammarlol.g:96:15: ( '*' ^| '/' ^| '%' ^) factor
            	    {
            	    // /home/cronin/Brogramming/grammarlol.g:96:15: ( '*' ^| '/' ^| '%' ^)
            	    int alt19=3;
            	    switch ( input.LA(1) ) {
            	    case 37:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt19) {
            	        case 1 :
            	            // /home/cronin/Brogramming/grammarlol.g:96:16: '*' ^
            	            {
            	            char_literal78=(Token)match(input,37,FOLLOW_37_in_term748); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal78_tree = 
            	            (Object)adaptor.create(char_literal78)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal78_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /home/cronin/Brogramming/grammarlol.g:96:21: '/' ^
            	            {
            	            char_literal79=(Token)match(input,41,FOLLOW_41_in_term751); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal79_tree = 
            	            (Object)adaptor.create(char_literal79)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal79_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /home/cronin/Brogramming/grammarlol.g:96:26: '%' ^
            	            {
            	            char_literal80=(Token)match(input,34,FOLLOW_34_in_term754); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal80_tree = 
            	            (Object)adaptor.create(char_literal80)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal80_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term758);
            	    factor81=factor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor81.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, term_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /home/cronin/Brogramming/grammarlol.g:100:1: factor : ( '(' lexp ')' -> lexp | '-' NUMBER -> ^( NEG NUMBER ) | '-' IDENT -> ^( NEG IDENT ) | NUMBER | IDENT -> ^( NAME IDENT ) | CHARACTER -> ^( CHR CHARACTER ) | IDENT '(' ( IDENT ( ',' IDENT )* )? ')' -> ^( CALL ^( NAME IDENT ) ^( PARAM ( ^( NAME IDENT ) )* ) ) );
    public final grammarlolParser.factor_return factor() throws RecognitionException {
        grammarlolParser.factor_return retval = new grammarlolParser.factor_return();
        retval.start = input.LT(1);

        int factor_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal82=null;
        Token char_literal84=null;
        Token char_literal85=null;
        Token NUMBER86=null;
        Token char_literal87=null;
        Token IDENT88=null;
        Token NUMBER89=null;
        Token IDENT90=null;
        Token CHARACTER91=null;
        Token IDENT92=null;
        Token char_literal93=null;
        Token IDENT94=null;
        Token char_literal95=null;
        Token IDENT96=null;
        Token char_literal97=null;
        grammarlolParser.lexp_return lexp83 =null;


        Object char_literal82_tree=null;
        Object char_literal84_tree=null;
        Object char_literal85_tree=null;
        Object NUMBER86_tree=null;
        Object char_literal87_tree=null;
        Object IDENT88_tree=null;
        Object NUMBER89_tree=null;
        Object IDENT90_tree=null;
        Object CHARACTER91_tree=null;
        Object IDENT92_tree=null;
        Object char_literal93_tree=null;
        Object IDENT94_tree=null;
        Object char_literal95_tree=null;
        Object IDENT96_tree=null;
        Object char_literal97_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_CHARACTER=new RewriteRuleTokenStream(adaptor,"token CHARACTER");
        RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
        RewriteRuleSubtreeStream stream_lexp=new RewriteRuleSubtreeStream(adaptor,"rule lexp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

            // /home/cronin/Brogramming/grammarlol.g:100:8: ( '(' lexp ')' -> lexp | '-' NUMBER -> ^( NEG NUMBER ) | '-' IDENT -> ^( NEG IDENT ) | NUMBER | IDENT -> ^( NAME IDENT ) | CHARACTER -> ^( CHR CHARACTER ) | IDENT '(' ( IDENT ( ',' IDENT )* )? ')' -> ^( CALL ^( NAME IDENT ) ^( PARAM ( ^( NAME IDENT ) )* ) ) )
            int alt23=7;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt23=1;
                }
                break;
            case 40:
                {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==NUMBER) ) {
                    alt23=2;
                }
                else if ( (LA23_2==IDENT) ) {
                    alt23=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 2, input);

                    throw nvae;

                }
                }
                break;
            case NUMBER:
                {
                alt23=4;
                }
                break;
            case IDENT:
                {
                int LA23_4 = input.LA(2);

                if ( (LA23_4==35) ) {
                    alt23=7;
                }
                else if ( (LA23_4==EOF||LA23_4==32||LA23_4==34||(LA23_4 >= 36 && LA23_4 <= 38)||(LA23_4 >= 40 && LA23_4 <= 44)||(LA23_4 >= 46 && LA23_4 <= 48)) ) {
                    alt23=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 4, input);

                    throw nvae;

                }
                }
                break;
            case CHARACTER:
                {
                alt23=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // /home/cronin/Brogramming/grammarlol.g:100:10: '(' lexp ')'
                    {
                    char_literal82=(Token)match(input,35,FOLLOW_35_in_factor772); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(char_literal82);


                    pushFollow(FOLLOW_lexp_in_factor774);
                    lexp83=lexp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_lexp.add(lexp83.getTree());

                    char_literal84=(Token)match(input,36,FOLLOW_36_in_factor776); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_36.add(char_literal84);


                    // AST REWRITE
                    // elements: lexp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 100:25: -> lexp
                    {
                        adaptor.addChild(root_0, stream_lexp.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/cronin/Brogramming/grammarlol.g:101:10: '-' NUMBER
                    {
                    char_literal85=(Token)match(input,40,FOLLOW_40_in_factor793); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_40.add(char_literal85);


                    NUMBER86=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_factor795); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NUMBER.add(NUMBER86);


                    // AST REWRITE
                    // elements: NUMBER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 101:21: -> ^( NEG NUMBER )
                    {
                        // /home/cronin/Brogramming/grammarlol.g:101:24: ^( NEG NUMBER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NEG, "NEG")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NUMBER.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // /home/cronin/Brogramming/grammarlol.g:102:4: '-' IDENT
                    {
                    char_literal87=(Token)match(input,40,FOLLOW_40_in_factor808); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_40.add(char_literal87);


                    IDENT88=(Token)match(input,IDENT,FOLLOW_IDENT_in_factor810); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT88);


                    // AST REWRITE
                    // elements: IDENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 102:15: -> ^( NEG IDENT )
                    {
                        // /home/cronin/Brogramming/grammarlol.g:102:18: ^( NEG IDENT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NEG, "NEG")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IDENT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // /home/cronin/Brogramming/grammarlol.g:103:4: NUMBER
                    {
                    root_0 = (Object)adaptor.nil();


                    NUMBER89=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_factor824); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER89_tree = 
                    (Object)adaptor.create(NUMBER89)
                    ;
                    adaptor.addChild(root_0, NUMBER89_tree);
                    }

                    }
                    break;
                case 5 :
                    // /home/cronin/Brogramming/grammarlol.g:104:10: IDENT
                    {
                    IDENT90=(Token)match(input,IDENT,FOLLOW_IDENT_in_factor835); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT90);


                    // AST REWRITE
                    // elements: IDENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 104:16: -> ^( NAME IDENT )
                    {
                        // /home/cronin/Brogramming/grammarlol.g:104:19: ^( NAME IDENT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NAME, "NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IDENT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // /home/cronin/Brogramming/grammarlol.g:105:4: CHARACTER
                    {
                    CHARACTER91=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_factor848); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHARACTER.add(CHARACTER91);


                    // AST REWRITE
                    // elements: CHARACTER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 105:14: -> ^( CHR CHARACTER )
                    {
                        // /home/cronin/Brogramming/grammarlol.g:105:17: ^( CHR CHARACTER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CHR, "CHR")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_CHARACTER.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // /home/cronin/Brogramming/grammarlol.g:106:4: IDENT '(' ( IDENT ( ',' IDENT )* )? ')'
                    {
                    IDENT92=(Token)match(input,IDENT,FOLLOW_IDENT_in_factor861); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT92);


                    char_literal93=(Token)match(input,35,FOLLOW_35_in_factor863); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(char_literal93);


                    // /home/cronin/Brogramming/grammarlol.g:106:14: ( IDENT ( ',' IDENT )* )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==IDENT) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // /home/cronin/Brogramming/grammarlol.g:106:15: IDENT ( ',' IDENT )*
                            {
                            IDENT94=(Token)match(input,IDENT,FOLLOW_IDENT_in_factor866); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENT.add(IDENT94);


                            // /home/cronin/Brogramming/grammarlol.g:106:21: ( ',' IDENT )*
                            loop21:
                            do {
                                int alt21=2;
                                int LA21_0 = input.LA(1);

                                if ( (LA21_0==39) ) {
                                    alt21=1;
                                }


                                switch (alt21) {
                            	case 1 :
                            	    // /home/cronin/Brogramming/grammarlol.g:106:22: ',' IDENT
                            	    {
                            	    char_literal95=(Token)match(input,39,FOLLOW_39_in_factor869); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_39.add(char_literal95);


                            	    IDENT96=(Token)match(input,IDENT,FOLLOW_IDENT_in_factor870); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_IDENT.add(IDENT96);


                            	    }
                            	    break;

                            	default :
                            	    break loop21;
                                }
                            } while (true);


                            }
                            break;

                    }


                    char_literal97=(Token)match(input,36,FOLLOW_36_in_factor876); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_36.add(char_literal97);


                    // AST REWRITE
                    // elements: IDENT, IDENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 106:39: -> ^( CALL ^( NAME IDENT ) ^( PARAM ( ^( NAME IDENT ) )* ) )
                    {
                        // /home/cronin/Brogramming/grammarlol.g:106:42: ^( CALL ^( NAME IDENT ) ^( PARAM ( ^( NAME IDENT ) )* ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CALL, "CALL")
                        , root_1);

                        // /home/cronin/Brogramming/grammarlol.g:106:49: ^( NAME IDENT )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NAME, "NAME")
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_IDENT.nextNode()
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        // /home/cronin/Brogramming/grammarlol.g:106:63: ^( PARAM ( ^( NAME IDENT ) )* )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PARAM, "PARAM")
                        , root_2);

                        // /home/cronin/Brogramming/grammarlol.g:106:71: ( ^( NAME IDENT ) )*
                        while ( stream_IDENT.hasNext() ) {
                            // /home/cronin/Brogramming/grammarlol.g:106:71: ^( NAME IDENT )
                            {
                            Object root_3 = (Object)adaptor.nil();
                            root_3 = (Object)adaptor.becomeRoot(
                            (Object)adaptor.create(NAME, "NAME")
                            , root_3);

                            adaptor.addChild(root_3, 
                            stream_IDENT.nextNode()
                            );

                            adaptor.addChild(root_2, root_3);
                            }

                        }
                        stream_IDENT.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, factor_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "factor"

    // $ANTLR start synpred18_grammarlol
    public final void synpred18_grammarlol_fragment() throws RecognitionException {
        // /home/cronin/Brogramming/grammarlol.g:84:28: ( 'else' stmt )
        // /home/cronin/Brogramming/grammarlol.g:84:28: 'else' stmt
        {
        match(input,50,FOLLOW_50_in_synpred18_grammarlol513); if (state.failed) return ;

        pushFollow(FOLLOW_stmt_in_synpred18_grammarlol515);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred18_grammarlol

    // Delegated rules

    public final boolean synpred18_grammarlol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_grammarlol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_includes_in_program122 = new BitSet(new long[]{0x0032000000010000L});
    public static final BitSet FOLLOW_decls_in_program124 = new BitSet(new long[]{0x0032000000010000L});
    public static final BitSet FOLLOW_procedure_in_program127 = new BitSet(new long[]{0x0032000000010000L});
    public static final BitSet FOLLOW_main_in_program131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_includes160 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_STRING_in_includes162 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_stmt_in_stmtlist176 = new BitSet(new long[]{0x3FC8000000010002L});
    public static final BitSet FOLLOW_53_in_main198 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_main200 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_main202 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_body_in_main204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_procedure228 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_49_in_procedure232 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENT_in_procedure236 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_procedure238 = new BitSet(new long[]{0x0012001000000000L});
    public static final BitSet FOLLOW_args_in_procedure240 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_procedure242 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_body_in_procedure244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_body279 = new BitSet(new long[]{0x7FDA000000010000L});
    public static final BitSet FOLLOW_decls_in_body281 = new BitSet(new long[]{0x7FC8000000010000L});
    public static final BitSet FOLLOW_stmtlist_in_body283 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_body285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_typedident312 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_49_in_typedident316 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENT_in_typedident319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedident_in_args354 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_args357 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_typedident_in_args358 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_typedident_in_decls386 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_decls387 = new BitSet(new long[]{0x0012000000000002L});
    public static final BitSet FOLLOW_lexp_in_exp411 = new BitSet(new long[]{0x0001D80100000002L});
    public static final BitSet FOLLOW_47_in_exp414 = new BitSet(new long[]{0x0000010800410100L});
    public static final BitSet FOLLOW_48_in_exp417 = new BitSet(new long[]{0x0000010800410100L});
    public static final BitSet FOLLOW_43_in_exp420 = new BitSet(new long[]{0x0000010800410100L});
    public static final BitSet FOLLOW_44_in_exp423 = new BitSet(new long[]{0x0000010800410100L});
    public static final BitSet FOLLOW_46_in_exp426 = new BitSet(new long[]{0x0000010800410100L});
    public static final BitSet FOLLOW_32_in_exp429 = new BitSet(new long[]{0x0000010800410100L});
    public static final BitSet FOLLOW_lexp_in_exp432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_stmt449 = new BitSet(new long[]{0x7FC8000000010000L});
    public static final BitSet FOLLOW_stmtlist_in_stmt451 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_stmt453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_stmt472 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_stmt474 = new BitSet(new long[]{0x0000010800410100L});
    public static final BitSet FOLLOW_exp_in_stmt476 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_stmt478 = new BitSet(new long[]{0x3FC8000000010000L});
    public static final BitSet FOLLOW_stmt_in_stmt480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_stmt501 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_stmt504 = new BitSet(new long[]{0x0000010800410100L});
    public static final BitSet FOLLOW_exp_in_stmt506 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_stmt508 = new BitSet(new long[]{0x3FC8000000010000L});
    public static final BitSet FOLLOW_stmt_in_stmt510 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_stmt513 = new BitSet(new long[]{0x3FC8000000010000L});
    public static final BitSet FOLLOW_stmt_in_stmt515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_stmt536 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_stmt538 = new BitSet(new long[]{0x0000010800410100L});
    public static final BitSet FOLLOW_lexp_in_stmt540 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_stmt542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_stmt569 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_54_in_stmt573 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_58_in_stmt577 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_55_in_stmt581 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_stmt584 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENT_in_stmt586 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_stmt588 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_stmt590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_stmt615 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_stmt617 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_STRING_in_stmt619 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_stmt621 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_stmt623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_stmt645 = new BitSet(new long[]{0x0000050800410100L});
    public static final BitSet FOLLOW_lexp_in_stmt647 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_stmt650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_stmt670 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_stmt672 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_IDENT_in_stmt674 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_39_in_stmt676 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENT_in_stmt677 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_36_in_stmt683 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_stmt685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_lexp722 = new BitSet(new long[]{0x0000014000000002L});
    public static final BitSet FOLLOW_38_in_lexp726 = new BitSet(new long[]{0x0000010800410100L});
    public static final BitSet FOLLOW_40_in_lexp729 = new BitSet(new long[]{0x0000010800410100L});
    public static final BitSet FOLLOW_term_in_lexp732 = new BitSet(new long[]{0x0000014000000002L});
    public static final BitSet FOLLOW_factor_in_term745 = new BitSet(new long[]{0x0000022400000002L});
    public static final BitSet FOLLOW_37_in_term748 = new BitSet(new long[]{0x0000010800410100L});
    public static final BitSet FOLLOW_41_in_term751 = new BitSet(new long[]{0x0000010800410100L});
    public static final BitSet FOLLOW_34_in_term754 = new BitSet(new long[]{0x0000010800410100L});
    public static final BitSet FOLLOW_factor_in_term758 = new BitSet(new long[]{0x0000022400000002L});
    public static final BitSet FOLLOW_35_in_factor772 = new BitSet(new long[]{0x0000010800410100L});
    public static final BitSet FOLLOW_lexp_in_factor774 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_factor776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_factor793 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_NUMBER_in_factor795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_factor808 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENT_in_factor810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_factor824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_factor835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_in_factor848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_factor861 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_factor863 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_IDENT_in_factor866 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_39_in_factor869 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENT_in_factor870 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_36_in_factor876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred18_grammarlol513 = new BitSet(new long[]{0x3FC8000000010000L});
    public static final BitSet FOLLOW_stmt_in_synpred18_grammarlol515 = new BitSet(new long[]{0x0000000000000002L});

}