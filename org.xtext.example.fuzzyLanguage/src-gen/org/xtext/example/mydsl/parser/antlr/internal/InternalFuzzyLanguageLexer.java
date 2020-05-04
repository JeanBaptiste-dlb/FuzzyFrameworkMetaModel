package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFuzzyLanguageLexer extends Lexer {
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=9;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ANYTHING=5;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_OPERATOR=6;
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalFuzzyLanguageLexer() {;} 
    public InternalFuzzyLanguageLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalFuzzyLanguageLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalFuzzyLanguage.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFuzzyLanguage.g:11:7: ( 'Output' )
            // InternalFuzzyLanguage.g:11:9: 'Output'
            {
            match("Output"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFuzzyLanguage.g:12:7: ( '=' )
            // InternalFuzzyLanguage.g:12:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFuzzyLanguage.g:13:7: ( 'Write(' )
            // InternalFuzzyLanguage.g:13:9: 'Write('
            {
            match("Write("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFuzzyLanguage.g:14:7: ( ')' )
            // InternalFuzzyLanguage.g:14:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFuzzyLanguage.g:15:7: ( 'Print(' )
            // InternalFuzzyLanguage.g:15:9: 'Print('
            {
            match("Print("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFuzzyLanguage.g:16:7: ( 'FILE' )
            // InternalFuzzyLanguage.g:16:9: 'FILE'
            {
            match("FILE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFuzzyLanguage.g:17:7: ( '(' )
            // InternalFuzzyLanguage.g:17:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFuzzyLanguage.g:18:7: ( 'CONSOLE' )
            // InternalFuzzyLanguage.g:18:9: 'CONSOLE'
            {
            match("CONSOLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFuzzyLanguage.g:19:7: ( 'COUT' )
            // InternalFuzzyLanguage.g:19:9: 'COUT'
            {
            match("COUT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFuzzyLanguage.g:20:7: ( 'FuzzySystemBuilding' )
            // InternalFuzzyLanguage.g:20:9: 'FuzzySystemBuilding'
            {
            match("FuzzySystemBuilding"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFuzzyLanguage.g:21:7: ( '{' )
            // InternalFuzzyLanguage.g:21:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFuzzyLanguage.g:22:7: ( '}' )
            // InternalFuzzyLanguage.g:22:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFuzzyLanguage.g:23:7: ( 'is' )
            // InternalFuzzyLanguage.g:23:9: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFuzzyLanguage.g:24:7: ( ',' )
            // InternalFuzzyLanguage.g:24:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFuzzyLanguage.g:25:7: ( 'set' )
            // InternalFuzzyLanguage.g:25:9: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFuzzyLanguage.g:26:7: ( 'Type' )
            // InternalFuzzyLanguage.g:26:9: 'Type'
            {
            match("Type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFuzzyLanguage.g:27:7: ( 'to' )
            // InternalFuzzyLanguage.g:27:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFuzzyLanguage.g:28:7: ( 'FuzzyConfig' )
            // InternalFuzzyLanguage.g:28:9: 'FuzzyConfig'
            {
            match("FuzzyConfig"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "RULE_ANYTHING"
    public final void mRULE_ANYTHING() throws RecognitionException {
        try {
            int _type = RULE_ANYTHING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFuzzyLanguage.g:993:15: ( ( RULE_INT | RULE_STRING | RULE_DOUBLE | 'ASK_USER_FOR_VALUE' | 'CONCAVE' | 'CONVEXE' | 'Up' | 'Down' ) )
            // InternalFuzzyLanguage.g:993:17: ( RULE_INT | RULE_STRING | RULE_DOUBLE | 'ASK_USER_FOR_VALUE' | 'CONCAVE' | 'CONVEXE' | 'Up' | 'Down' )
            {
            // InternalFuzzyLanguage.g:993:17: ( RULE_INT | RULE_STRING | RULE_DOUBLE | 'ASK_USER_FOR_VALUE' | 'CONCAVE' | 'CONVEXE' | 'Up' | 'Down' )
            int alt1=8;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalFuzzyLanguage.g:993:18: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;
                case 2 :
                    // InternalFuzzyLanguage.g:993:27: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;
                case 3 :
                    // InternalFuzzyLanguage.g:993:39: RULE_DOUBLE
                    {
                    mRULE_DOUBLE(); 

                    }
                    break;
                case 4 :
                    // InternalFuzzyLanguage.g:993:51: 'ASK_USER_FOR_VALUE'
                    {
                    match("ASK_USER_FOR_VALUE"); 


                    }
                    break;
                case 5 :
                    // InternalFuzzyLanguage.g:993:72: 'CONCAVE'
                    {
                    match("CONCAVE"); 


                    }
                    break;
                case 6 :
                    // InternalFuzzyLanguage.g:993:82: 'CONVEXE'
                    {
                    match("CONVEXE"); 


                    }
                    break;
                case 7 :
                    // InternalFuzzyLanguage.g:993:92: 'Up'
                    {
                    match("Up"); 


                    }
                    break;
                case 8 :
                    // InternalFuzzyLanguage.g:993:97: 'Down'
                    {
                    match("Down"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANYTHING"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            // InternalFuzzyLanguage.g:995:22: ( RULE_INT '.' RULE_INT )
            // InternalFuzzyLanguage.g:995:24: RULE_INT '.' RULE_INT
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_OPERATOR"
    public final void mRULE_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFuzzyLanguage.g:997:15: ( ( 'AND' | 'NOT' | 'OR' | 'DEFUZZ' | 'THEN' | 'AGG' ) )
            // InternalFuzzyLanguage.g:997:17: ( 'AND' | 'NOT' | 'OR' | 'DEFUZZ' | 'THEN' | 'AGG' )
            {
            // InternalFuzzyLanguage.g:997:17: ( 'AND' | 'NOT' | 'OR' | 'DEFUZZ' | 'THEN' | 'AGG' )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 'A':
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='N') ) {
                    alt2=1;
                }
                else if ( (LA2_1=='G') ) {
                    alt2=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 'N':
                {
                alt2=2;
                }
                break;
            case 'O':
                {
                alt2=3;
                }
                break;
            case 'D':
                {
                alt2=4;
                }
                break;
            case 'T':
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalFuzzyLanguage.g:997:18: 'AND'
                    {
                    match("AND"); 


                    }
                    break;
                case 2 :
                    // InternalFuzzyLanguage.g:997:24: 'NOT'
                    {
                    match("NOT"); 


                    }
                    break;
                case 3 :
                    // InternalFuzzyLanguage.g:997:30: 'OR'
                    {
                    match("OR"); 


                    }
                    break;
                case 4 :
                    // InternalFuzzyLanguage.g:997:35: 'DEFUZZ'
                    {
                    match("DEFUZZ"); 


                    }
                    break;
                case 5 :
                    // InternalFuzzyLanguage.g:997:44: 'THEN'
                    {
                    match("THEN"); 


                    }
                    break;
                case 6 :
                    // InternalFuzzyLanguage.g:997:51: 'AGG'
                    {
                    match("AGG"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OPERATOR"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFuzzyLanguage.g:999:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalFuzzyLanguage.g:999:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalFuzzyLanguage.g:999:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalFuzzyLanguage.g:999:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalFuzzyLanguage.g:999:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFuzzyLanguage.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalFuzzyLanguage.g:1001:19: ( ( '0' .. '9' )+ )
            // InternalFuzzyLanguage.g:1001:21: ( '0' .. '9' )+
            {
            // InternalFuzzyLanguage.g:1001:21: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFuzzyLanguage.g:1001:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            // InternalFuzzyLanguage.g:1003:22: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalFuzzyLanguage.g:1003:24: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalFuzzyLanguage.g:1003:24: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalFuzzyLanguage.g:1003:25: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalFuzzyLanguage.g:1003:29: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalFuzzyLanguage.g:1003:30: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalFuzzyLanguage.g:1003:37: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalFuzzyLanguage.g:1003:57: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalFuzzyLanguage.g:1003:62: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalFuzzyLanguage.g:1003:63: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalFuzzyLanguage.g:1003:70: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFuzzyLanguage.g:1005:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalFuzzyLanguage.g:1005:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalFuzzyLanguage.g:1005:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalFuzzyLanguage.g:1005:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFuzzyLanguage.g:1007:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalFuzzyLanguage.g:1007:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalFuzzyLanguage.g:1007:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFuzzyLanguage.g:1007:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalFuzzyLanguage.g:1007:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFuzzyLanguage.g:1007:41: ( '\\r' )? '\\n'
                    {
                    // InternalFuzzyLanguage.g:1007:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalFuzzyLanguage.g:1007:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFuzzyLanguage.g:1009:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalFuzzyLanguage.g:1009:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalFuzzyLanguage.g:1009:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalFuzzyLanguage.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFuzzyLanguage.g:1011:16: ( . )
            // InternalFuzzyLanguage.g:1011:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalFuzzyLanguage.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_ANYTHING | RULE_OPERATOR | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=25;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalFuzzyLanguage.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalFuzzyLanguage.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalFuzzyLanguage.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalFuzzyLanguage.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalFuzzyLanguage.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalFuzzyLanguage.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalFuzzyLanguage.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalFuzzyLanguage.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalFuzzyLanguage.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalFuzzyLanguage.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalFuzzyLanguage.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalFuzzyLanguage.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalFuzzyLanguage.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalFuzzyLanguage.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalFuzzyLanguage.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalFuzzyLanguage.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalFuzzyLanguage.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalFuzzyLanguage.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalFuzzyLanguage.g:1:118: RULE_ANYTHING
                {
                mRULE_ANYTHING(); 

                }
                break;
            case 20 :
                // InternalFuzzyLanguage.g:1:132: RULE_OPERATOR
                {
                mRULE_OPERATOR(); 

                }
                break;
            case 21 :
                // InternalFuzzyLanguage.g:1:146: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 22 :
                // InternalFuzzyLanguage.g:1:154: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 23 :
                // InternalFuzzyLanguage.g:1:170: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 24 :
                // InternalFuzzyLanguage.g:1:186: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 25 :
                // InternalFuzzyLanguage.g:1:194: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA1_eotS =
        "\1\uffff\1\7\13\uffff";
    static final String DFA1_eofS =
        "\15\uffff";
    static final String DFA1_minS =
        "\1\42\1\56\2\uffff\1\117\4\uffff\1\116\1\103\2\uffff";
    static final String DFA1_maxS =
        "\1\125\1\71\2\uffff\1\117\4\uffff\1\116\1\126\2\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\2\1\4\1\uffff\1\7\1\10\1\1\1\3\2\uffff\1\5\1\6";
    static final String DFA1_specialS =
        "\15\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\4\uffff\1\2\10\uffff\12\1\7\uffff\1\3\1\uffff\1\4\1\6\20\uffff\1\5",
            "\1\10\1\uffff\12\1",
            "",
            "",
            "\1\11",
            "",
            "",
            "",
            "",
            "\1\12",
            "\1\13\22\uffff\1\14",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "993:17: ( RULE_INT | RULE_STRING | RULE_DOUBLE | 'ASK_USER_FOR_VALUE' | 'CONCAVE' | 'CONVEXE' | 'Up' | 'Down' )";
        }
    }
    static final String DFA14_eotS =
        "\1\uffff\1\36\1\uffff\1\36\1\uffff\2\36\1\uffff\1\36\2\uffff\1\36\1\uffff\3\36\1\uffff\2\33\4\36\1\33\1\uffff\1\33\2\uffff\1\36\1\73\2\uffff\1\36\1\uffff\3\36\1\uffff\1\36\2\uffff\1\102\1\uffff\3\36\1\106\1\uffff\3\36\1\57\3\36\3\uffff\1\36\1\uffff\6\36\1\uffff\1\126\2\36\1\uffff\1\36\2\73\2\36\1\73\3\36\1\137\4\36\1\144\1\uffff\1\145\1\73\1\36\1\57\4\36\1\uffff\4\36\2\uffff\2\36\1\162\2\uffff\6\36\1\73\1\uffff\2\36\1\173\2\57\3\36\1\uffff\10\36\1\u0087\2\36\1\uffff\14\36\1\57\1\u0096\1\uffff";
    static final String DFA14_eofS =
        "\u0097\uffff";
    static final String DFA14_minS =
        "\1\0\1\122\1\uffff\1\162\1\uffff\1\162\1\111\1\uffff\1\117\2\uffff\1\163\1\uffff\1\145\1\110\1\157\1\uffff\2\0\1\107\1\160\1\105\1\117\1\101\1\uffff\1\52\2\uffff\1\164\1\60\2\uffff\1\151\1\uffff\1\151\1\114\1\172\1\uffff\1\116\2\uffff\1\60\1\uffff\1\164\1\160\1\105\1\60\1\uffff\1\113\1\104\1\107\1\60\1\167\1\106\1\124\3\uffff\1\160\1\uffff\1\164\1\156\1\105\1\172\1\103\1\124\1\uffff\1\60\1\145\1\116\1\uffff\1\137\2\60\1\156\1\125\1\60\1\165\1\145\1\164\1\60\1\171\1\117\1\101\1\105\1\60\1\uffff\2\60\1\125\1\60\1\132\1\164\2\50\1\uffff\1\103\1\114\1\126\1\130\2\uffff\1\123\1\132\1\60\2\uffff\1\171\1\157\4\105\1\60\1\uffff\1\163\1\156\3\60\1\122\1\164\1\146\1\uffff\1\137\1\145\1\151\1\106\1\155\1\147\1\117\1\102\1\60\1\122\1\165\1\uffff\1\137\1\151\1\126\1\154\1\101\1\144\1\114\1\151\1\125\1\156\1\105\1\147\2\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\165\1\uffff\1\162\1\uffff\1\162\1\165\1\uffff\1\117\2\uffff\1\163\1\uffff\1\145\1\171\1\157\1\uffff\2\uffff\1\123\1\160\1\157\1\117\1\172\1\uffff\1\57\2\uffff\1\164\1\172\2\uffff\1\151\1\uffff\1\151\1\114\1\172\1\uffff\1\125\2\uffff\1\172\1\uffff\1\164\1\160\1\105\1\172\1\uffff\1\113\1\104\1\107\1\172\1\167\1\106\1\124\3\uffff\1\160\1\uffff\1\164\1\156\1\105\1\172\1\126\1\124\1\uffff\1\172\1\145\1\116\1\uffff\1\137\2\172\1\156\1\125\1\172\1\165\1\145\1\164\1\172\1\171\1\117\1\101\1\105\1\172\1\uffff\2\172\1\125\1\172\1\132\1\164\2\50\1\uffff\1\123\1\114\1\126\1\130\2\uffff\1\123\1\132\1\172\2\uffff\1\171\1\157\4\105\1\172\1\uffff\1\163\1\156\3\172\1\122\1\164\1\146\1\uffff\1\137\1\145\1\151\1\106\1\155\1\147\1\117\1\102\1\172\1\122\1\165\1\uffff\1\137\1\151\1\126\1\154\1\101\1\144\1\114\1\151\1\125\1\156\1\105\1\147\2\172\1\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\2\uffff\1\7\1\uffff\1\13\1\14\1\uffff\1\16\3\uffff\1\23\7\uffff\1\25\1\uffff\1\30\1\31\2\uffff\1\25\1\2\1\uffff\1\4\3\uffff\1\7\1\uffff\1\13\1\14\1\uffff\1\16\4\uffff\1\23\7\uffff\1\26\1\27\1\30\1\uffff\1\24\6\uffff\1\15\3\uffff\1\21\17\uffff\1\17\10\uffff\1\6\4\uffff\1\11\1\20\3\uffff\1\3\1\5\7\uffff\1\1\10\uffff\1\10\13\uffff\1\22\16\uffff\1\12";
    static final String DFA14_specialS =
        "\1\0\20\uffff\1\2\1\1\u0084\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\33\2\32\2\33\1\32\22\33\1\32\1\33\1\21\4\33\1\22\1\7\1\4\2\33\1\14\2\33\1\31\12\20\3\33\1\2\3\33\1\23\1\30\1\10\1\25\1\30\1\6\7\30\1\26\1\1\1\5\3\30\1\16\1\24\1\30\1\3\3\30\3\33\1\27\1\30\1\33\10\30\1\13\11\30\1\15\1\17\6\30\1\11\1\33\1\12\uff82\33",
            "\1\35\42\uffff\1\34",
            "",
            "\1\40",
            "",
            "\1\42",
            "\1\43\53\uffff\1\44",
            "",
            "\1\46",
            "",
            "",
            "\1\51",
            "",
            "\1\53",
            "\1\55\60\uffff\1\54",
            "\1\56",
            "",
            "\0\57",
            "\0\57",
            "\1\62\6\uffff\1\61\4\uffff\1\60",
            "\1\63",
            "\1\65\51\uffff\1\64",
            "\1\66",
            "\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\67\4\uffff\1\70",
            "",
            "",
            "\1\72",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\1\74",
            "",
            "\1\75",
            "\1\76",
            "\1\77",
            "",
            "\1\100\6\uffff\1\101",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\107",
            "\1\110",
            "\1\111",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\112",
            "\1\113",
            "\1\114",
            "",
            "",
            "",
            "\1\115",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\123\17\uffff\1\122\2\uffff\1\124",
            "\1\125",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\127",
            "\1\130",
            "",
            "\1\131",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\132",
            "\1\133",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\134",
            "\1\135",
            "\1\136",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\146",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "",
            "\1\154\17\uffff\1\153",
            "\1\155",
            "\1\156",
            "\1\157",
            "",
            "",
            "\1\160",
            "\1\161",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\171",
            "\1\172",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\174",
            "\1\175",
            "\1\176",
            "",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u0088",
            "\1\u0089",
            "",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_ANYTHING | RULE_OPERATOR | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='O') ) {s = 1;}

                        else if ( (LA14_0=='=') ) {s = 2;}

                        else if ( (LA14_0=='W') ) {s = 3;}

                        else if ( (LA14_0==')') ) {s = 4;}

                        else if ( (LA14_0=='P') ) {s = 5;}

                        else if ( (LA14_0=='F') ) {s = 6;}

                        else if ( (LA14_0=='(') ) {s = 7;}

                        else if ( (LA14_0=='C') ) {s = 8;}

                        else if ( (LA14_0=='{') ) {s = 9;}

                        else if ( (LA14_0=='}') ) {s = 10;}

                        else if ( (LA14_0=='i') ) {s = 11;}

                        else if ( (LA14_0==',') ) {s = 12;}

                        else if ( (LA14_0=='s') ) {s = 13;}

                        else if ( (LA14_0=='T') ) {s = 14;}

                        else if ( (LA14_0=='t') ) {s = 15;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 16;}

                        else if ( (LA14_0=='\"') ) {s = 17;}

                        else if ( (LA14_0=='\'') ) {s = 18;}

                        else if ( (LA14_0=='A') ) {s = 19;}

                        else if ( (LA14_0=='U') ) {s = 20;}

                        else if ( (LA14_0=='D') ) {s = 21;}

                        else if ( (LA14_0=='N') ) {s = 22;}

                        else if ( (LA14_0=='^') ) {s = 23;}

                        else if ( (LA14_0=='B'||LA14_0=='E'||(LA14_0>='G' && LA14_0<='M')||(LA14_0>='Q' && LA14_0<='S')||LA14_0=='V'||(LA14_0>='X' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='r')||(LA14_0>='u' && LA14_0<='z')) ) {s = 24;}

                        else if ( (LA14_0=='/') ) {s = 25;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 26;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='*' && LA14_0<='+')||(LA14_0>='-' && LA14_0<='.')||(LA14_0>=':' && LA14_0<='<')||(LA14_0>='>' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_18 = input.LA(1);

                        s = -1;
                        if ( ((LA14_18>='\u0000' && LA14_18<='\uFFFF')) ) {s = 47;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_17 = input.LA(1);

                        s = -1;
                        if ( ((LA14_17>='\u0000' && LA14_17<='\uFFFF')) ) {s = 47;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}