// $ANTLR 3.4 /home/cronin/Brogramming/grammarlol.g 2012-03-12 20:03:07

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class grammarlolLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public grammarlolLexer() {} 
    public grammarlolLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public grammarlolLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/cronin/Brogramming/grammarlol.g"; }

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:2:7: ( '!=' )
            // /home/cronin/Brogramming/grammarlol.g:2:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:3:7: ( '#include' )
            // /home/cronin/Brogramming/grammarlol.g:3:9: '#include'
            {
            match("#include"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:4:7: ( '%' )
            // /home/cronin/Brogramming/grammarlol.g:4:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:5:7: ( '(' )
            // /home/cronin/Brogramming/grammarlol.g:5:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:6:7: ( ')' )
            // /home/cronin/Brogramming/grammarlol.g:6:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:7:7: ( '*' )
            // /home/cronin/Brogramming/grammarlol.g:7:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:8:7: ( '+' )
            // /home/cronin/Brogramming/grammarlol.g:8:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:9:7: ( ',' )
            // /home/cronin/Brogramming/grammarlol.g:9:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:10:7: ( '-' )
            // /home/cronin/Brogramming/grammarlol.g:10:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:11:7: ( '/' )
            // /home/cronin/Brogramming/grammarlol.g:11:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:12:7: ( ';' )
            // /home/cronin/Brogramming/grammarlol.g:12:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:13:7: ( '<' )
            // /home/cronin/Brogramming/grammarlol.g:13:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:14:7: ( '<=' )
            // /home/cronin/Brogramming/grammarlol.g:14:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:15:7: ( '=' )
            // /home/cronin/Brogramming/grammarlol.g:15:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:16:7: ( '==' )
            // /home/cronin/Brogramming/grammarlol.g:16:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:17:7: ( '>' )
            // /home/cronin/Brogramming/grammarlol.g:17:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:18:7: ( '>=' )
            // /home/cronin/Brogramming/grammarlol.g:18:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:19:7: ( 'char' )
            // /home/cronin/Brogramming/grammarlol.g:19:9: 'char'
            {
            match("char"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:20:7: ( 'else' )
            // /home/cronin/Brogramming/grammarlol.g:20:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:21:7: ( 'if' )
            // /home/cronin/Brogramming/grammarlol.g:21:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:22:7: ( 'int' )
            // /home/cronin/Brogramming/grammarlol.g:22:9: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:23:7: ( 'main' )
            // /home/cronin/Brogramming/grammarlol.g:23:9: 'main'
            {
            match("main"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:24:7: ( 'output' )
            // /home/cronin/Brogramming/grammarlol.g:24:9: 'output'
            {
            match("output"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:25:7: ( 'outputc' )
            // /home/cronin/Brogramming/grammarlol.g:25:9: 'outputc'
            {
            match("outputc"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:26:7: ( 'print' )
            // /home/cronin/Brogramming/grammarlol.g:26:9: 'print'
            {
            match("print"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:27:7: ( 'read' )
            // /home/cronin/Brogramming/grammarlol.g:27:9: 'read'
            {
            match("read"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:28:7: ( 'readc' )
            // /home/cronin/Brogramming/grammarlol.g:28:9: 'readc'
            {
            match("readc"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:29:7: ( 'return' )
            // /home/cronin/Brogramming/grammarlol.g:29:9: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:30:7: ( 'while' )
            // /home/cronin/Brogramming/grammarlol.g:30:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:31:7: ( '{' )
            // /home/cronin/Brogramming/grammarlol.g:31:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:32:7: ( '}' )
            // /home/cronin/Brogramming/grammarlol.g:32:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /home/cronin/Brogramming/grammarlol.g:116:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // /home/cronin/Brogramming/grammarlol.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /home/cronin/Brogramming/grammarlol.g:121:8: ( ( '0' .. '9' ) )
            // /home/cronin/Brogramming/grammarlol.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:124:9: ( ( DIGIT )+ )
            // /home/cronin/Brogramming/grammarlol.g:124:11: ( DIGIT )+
            {
            // /home/cronin/Brogramming/grammarlol.g:124:11: ( DIGIT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/cronin/Brogramming/grammarlol.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            // /home/cronin/Brogramming/grammarlol.g:130:7: ( ( '\\n' | NNLCHAR ) )
            // /home/cronin/Brogramming/grammarlol.g:
            {
            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "CHARACTER"
    public final void mCHARACTER() throws RecognitionException {
        try {
            int _type = CHARACTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:134:2: ( '\\'' ( CHAR ) '\\'' )
            // /home/cronin/Brogramming/grammarlol.g:134:4: '\\'' ( CHAR ) '\\''
            {
            match('\''); 

            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARACTER"

    // $ANTLR start "NNLCHAR"
    public final void mNNLCHAR() throws RecognitionException {
        try {
            // /home/cronin/Brogramming/grammarlol.g:140:9: ( (~ ( '\\n' | '\"' ) ) )
            // /home/cronin/Brogramming/grammarlol.g:
            {
            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NNLCHAR"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:143:8: ( '\"' ( NNLCHAR )* '\"' )
            // /home/cronin/Brogramming/grammarlol.g:143:10: '\"' ( NNLCHAR )* '\"'
            {
            match('\"'); 

            // /home/cronin/Brogramming/grammarlol.g:143:13: ( NNLCHAR )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '!')||(LA2_0 >= '#' && LA2_0 <= '\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/cronin/Brogramming/grammarlol.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:147:9: ( ( LETTER ) ( LETTER | DIGIT | '_' )* )
            // /home/cronin/Brogramming/grammarlol.g:147:11: ( LETTER ) ( LETTER | DIGIT | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/cronin/Brogramming/grammarlol.g:147:20: ( LETTER | DIGIT | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/cronin/Brogramming/grammarlol.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:151:6: ( '//' ( . )* '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='/') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='/') ) {
                    alt6=1;
                }
                else if ( (LA6_1=='*') ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /home/cronin/Brogramming/grammarlol.g:151:10: '//' ( . )* '\\n'
                    {
                    match("//"); 



                    // /home/cronin/Brogramming/grammarlol.g:151:15: ( . )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\n') ) {
                            alt4=2;
                        }
                        else if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\uFFFF')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /home/cronin/Brogramming/grammarlol.g:151:16: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /home/cronin/Brogramming/grammarlol.g:152:10: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home/cronin/Brogramming/grammarlol.g:152:15: ( options {greedy=false; } : . )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='*') ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1=='/') ) {
                                alt5=2;
                            }
                            else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
                                alt5=1;
                            }


                        }
                        else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/cronin/Brogramming/grammarlol.g:152:43: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/cronin/Brogramming/grammarlol.g:155:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/cronin/Brogramming/grammarlol.g:155:10: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /home/cronin/Brogramming/grammarlol.g:1:8: ( T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | NUMBER | CHARACTER | STRING | IDENT | COMMENT | WS )
        int alt7=37;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // /home/cronin/Brogramming/grammarlol.g:1:10: T__32
                {
                mT__32(); 


                }
                break;
            case 2 :
                // /home/cronin/Brogramming/grammarlol.g:1:16: T__33
                {
                mT__33(); 


                }
                break;
            case 3 :
                // /home/cronin/Brogramming/grammarlol.g:1:22: T__34
                {
                mT__34(); 


                }
                break;
            case 4 :
                // /home/cronin/Brogramming/grammarlol.g:1:28: T__35
                {
                mT__35(); 


                }
                break;
            case 5 :
                // /home/cronin/Brogramming/grammarlol.g:1:34: T__36
                {
                mT__36(); 


                }
                break;
            case 6 :
                // /home/cronin/Brogramming/grammarlol.g:1:40: T__37
                {
                mT__37(); 


                }
                break;
            case 7 :
                // /home/cronin/Brogramming/grammarlol.g:1:46: T__38
                {
                mT__38(); 


                }
                break;
            case 8 :
                // /home/cronin/Brogramming/grammarlol.g:1:52: T__39
                {
                mT__39(); 


                }
                break;
            case 9 :
                // /home/cronin/Brogramming/grammarlol.g:1:58: T__40
                {
                mT__40(); 


                }
                break;
            case 10 :
                // /home/cronin/Brogramming/grammarlol.g:1:64: T__41
                {
                mT__41(); 


                }
                break;
            case 11 :
                // /home/cronin/Brogramming/grammarlol.g:1:70: T__42
                {
                mT__42(); 


                }
                break;
            case 12 :
                // /home/cronin/Brogramming/grammarlol.g:1:76: T__43
                {
                mT__43(); 


                }
                break;
            case 13 :
                // /home/cronin/Brogramming/grammarlol.g:1:82: T__44
                {
                mT__44(); 


                }
                break;
            case 14 :
                // /home/cronin/Brogramming/grammarlol.g:1:88: T__45
                {
                mT__45(); 


                }
                break;
            case 15 :
                // /home/cronin/Brogramming/grammarlol.g:1:94: T__46
                {
                mT__46(); 


                }
                break;
            case 16 :
                // /home/cronin/Brogramming/grammarlol.g:1:100: T__47
                {
                mT__47(); 


                }
                break;
            case 17 :
                // /home/cronin/Brogramming/grammarlol.g:1:106: T__48
                {
                mT__48(); 


                }
                break;
            case 18 :
                // /home/cronin/Brogramming/grammarlol.g:1:112: T__49
                {
                mT__49(); 


                }
                break;
            case 19 :
                // /home/cronin/Brogramming/grammarlol.g:1:118: T__50
                {
                mT__50(); 


                }
                break;
            case 20 :
                // /home/cronin/Brogramming/grammarlol.g:1:124: T__51
                {
                mT__51(); 


                }
                break;
            case 21 :
                // /home/cronin/Brogramming/grammarlol.g:1:130: T__52
                {
                mT__52(); 


                }
                break;
            case 22 :
                // /home/cronin/Brogramming/grammarlol.g:1:136: T__53
                {
                mT__53(); 


                }
                break;
            case 23 :
                // /home/cronin/Brogramming/grammarlol.g:1:142: T__54
                {
                mT__54(); 


                }
                break;
            case 24 :
                // /home/cronin/Brogramming/grammarlol.g:1:148: T__55
                {
                mT__55(); 


                }
                break;
            case 25 :
                // /home/cronin/Brogramming/grammarlol.g:1:154: T__56
                {
                mT__56(); 


                }
                break;
            case 26 :
                // /home/cronin/Brogramming/grammarlol.g:1:160: T__57
                {
                mT__57(); 


                }
                break;
            case 27 :
                // /home/cronin/Brogramming/grammarlol.g:1:166: T__58
                {
                mT__58(); 


                }
                break;
            case 28 :
                // /home/cronin/Brogramming/grammarlol.g:1:172: T__59
                {
                mT__59(); 


                }
                break;
            case 29 :
                // /home/cronin/Brogramming/grammarlol.g:1:178: T__60
                {
                mT__60(); 


                }
                break;
            case 30 :
                // /home/cronin/Brogramming/grammarlol.g:1:184: T__61
                {
                mT__61(); 


                }
                break;
            case 31 :
                // /home/cronin/Brogramming/grammarlol.g:1:190: T__62
                {
                mT__62(); 


                }
                break;
            case 32 :
                // /home/cronin/Brogramming/grammarlol.g:1:196: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 33 :
                // /home/cronin/Brogramming/grammarlol.g:1:203: CHARACTER
                {
                mCHARACTER(); 


                }
                break;
            case 34 :
                // /home/cronin/Brogramming/grammarlol.g:1:213: STRING
                {
                mSTRING(); 


                }
                break;
            case 35 :
                // /home/cronin/Brogramming/grammarlol.g:1:220: IDENT
                {
                mIDENT(); 


                }
                break;
            case 36 :
                // /home/cronin/Brogramming/grammarlol.g:1:226: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 37 :
                // /home/cronin/Brogramming/grammarlol.g:1:234: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\12\uffff\1\37\1\uffff\1\41\1\43\1\45\10\34\17\uffff\2\34\1\61\10"+
        "\34\1\uffff\1\73\6\34\1\102\1\103\1\uffff\1\104\2\34\1\110\2\34"+
        "\3\uffff\1\34\1\114\1\115\1\uffff\1\34\1\117\1\121\2\uffff\1\122"+
        "\1\uffff\1\123\3\uffff";
    static final String DFA7_eofS =
        "\124\uffff";
    static final String DFA7_minS =
        "\1\11\11\uffff\1\52\1\uffff\3\75\1\150\1\154\1\146\1\141\1\165\1"+
        "\162\1\145\1\150\17\uffff\1\141\1\163\1\60\1\164\1\151\1\164\1\151"+
        "\1\141\1\151\1\162\1\145\1\uffff\1\60\1\156\1\160\1\156\1\144\1"+
        "\165\1\154\2\60\1\uffff\1\60\1\165\1\164\1\60\1\162\1\145\3\uffff"+
        "\1\164\2\60\1\uffff\1\156\2\60\2\uffff\1\60\1\uffff\1\60\3\uffff";
    static final String DFA7_maxS =
        "\1\175\11\uffff\1\57\1\uffff\3\75\1\150\1\154\1\156\1\141\1\165"+
        "\1\162\1\145\1\150\17\uffff\1\141\1\163\1\172\1\164\1\151\1\164"+
        "\1\151\1\164\1\151\1\162\1\145\1\uffff\1\172\1\156\1\160\1\156\1"+
        "\144\1\165\1\154\2\172\1\uffff\1\172\1\165\1\164\1\172\1\162\1\145"+
        "\3\uffff\1\164\2\172\1\uffff\1\156\2\172\2\uffff\1\172\1\uffff\1"+
        "\172\3\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\13\13\uffff"+
        "\1\36\1\37\1\40\1\41\1\42\1\43\1\45\1\44\1\12\1\15\1\14\1\17\1\16"+
        "\1\21\1\20\13\uffff\1\24\11\uffff\1\25\6\uffff\1\22\1\23\1\26\3"+
        "\uffff\1\32\3\uffff\1\31\1\33\1\uffff\1\35\1\uffff\1\27\1\34\1\30";
    static final String DFA7_specialS =
        "\124\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\35\2\uffff\1\35\22\uffff\1\35\1\1\1\33\1\2\1\uffff\1\3\1"+
            "\uffff\1\32\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\12\12\31\1\uffff"+
            "\1\13\1\14\1\15\1\16\2\uffff\32\34\6\uffff\2\34\1\17\1\34\1"+
            "\20\3\34\1\21\3\34\1\22\1\34\1\23\1\24\1\34\1\25\4\34\1\26\3"+
            "\34\1\27\1\uffff\1\30",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\36\4\uffff\1\36",
            "",
            "\1\40",
            "\1\42",
            "\1\44",
            "\1\46",
            "\1\47",
            "\1\50\7\uffff\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\57",
            "\1\60",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66\22\uffff\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\105",
            "\1\106",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\2\34\1\107\27\34",
            "\1\111",
            "\1\112",
            "",
            "",
            "",
            "\1\113",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\116",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\2\34\1\120\27\34",
            "",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | NUMBER | CHARACTER | STRING | IDENT | COMMENT | WS );";
        }
    }
 

}