// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g 2011-08-08 00:05:53

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SimpleASMLexer extends Lexer {
    public static final int EOF=-1;
    public static final int MOVW=4;
    public static final int LOAD=5;
    public static final int STORE=6;
    public static final int ADD=7;
    public static final int NOT=8;
    public static final int AND=9;
    public static final int OR=10;
    public static final int XOR=11;
    public static final int INC=12;
    public static final int SUB=13;
    public static final int BRANCH=14;
    public static final int END_STMT=15;
    public static final int COMMENT=16;
    public static final int NEWLINE=17;
    public static final int WS=18;
    public static final int REGISTER=19;
    public static final int DIGIT=20;
    public static final int NUMERO_DEC=21;
    public static final int HEX_DIGIT=22;
    public static final int NUMERO_HEX=23;

    // delegates
    // delegators

    public SimpleASMLexer() {;} 
    public SimpleASMLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SimpleASMLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g"; }

    // $ANTLR start "MOVW"
    public final void mMOVW() throws RecognitionException {
        try {
            int _type = MOVW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:3:6: ( 'MOVW' )
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:3:8: 'MOVW'
            {
            match("MOVW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOVW"

    // $ANTLR start "LOAD"
    public final void mLOAD() throws RecognitionException {
        try {
            int _type = LOAD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:4:6: ( 'LOAD' )
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:4:8: 'LOAD'
            {
            match("LOAD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOAD"

    // $ANTLR start "STORE"
    public final void mSTORE() throws RecognitionException {
        try {
            int _type = STORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:5:7: ( 'STORE' )
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:5:9: 'STORE'
            {
            match("STORE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STORE"

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:6:5: ( 'ADD' )
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:6:7: 'ADD'
            {
            match("ADD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ADD"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:7:5: ( 'NOT' )
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:7:7: 'NOT'
            {
            match("NOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:8:5: ( 'AND' )
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:8:7: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:9:4: ( 'OR' )
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:9:6: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "XOR"
    public final void mXOR() throws RecognitionException {
        try {
            int _type = XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:10:5: ( 'XOR' )
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:10:7: 'XOR'
            {
            match("XOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XOR"

    // $ANTLR start "INC"
    public final void mINC() throws RecognitionException {
        try {
            int _type = INC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:11:5: ( 'INC' )
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:11:7: 'INC'
            {
            match("INC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INC"

    // $ANTLR start "SUB"
    public final void mSUB() throws RecognitionException {
        try {
            int _type = SUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:12:5: ( 'SUB' )
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:12:7: 'SUB'
            {
            match("SUB"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUB"

    // $ANTLR start "BRANCH"
    public final void mBRANCH() throws RecognitionException {
        try {
            int _type = BRANCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:13:8: ( 'BRANCH' )
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:13:10: 'BRANCH'
            {
            match("BRANCH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BRANCH"

    // $ANTLR start "END_STMT"
    public final void mEND_STMT() throws RecognitionException {
        try {
            int _type = END_STMT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:14:10: ( ';' )
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:14:12: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END_STMT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:27:9: ( '//' (~ ( '\\n' | '\\r' ) )* | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='/') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='/') ) {
                    alt3=1;
                }
                else if ( (LA3_1=='*') ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:28:2: '//' (~ ( '\\n' | '\\r' ) )*
                    {
                    match("//"); 

                    // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:28:7: (~ ( '\\n' | '\\r' ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:28:7: ~ ( '\\n' | '\\r' )
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
                    	    break loop1;
                        }
                    } while (true);

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:29:10: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:29:15: ( options {greedy=false; } : . )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0=='*') ) {
                            int LA2_1 = input.LA(2);

                            if ( (LA2_1=='/') ) {
                                alt2=2;
                            }
                            else if ( ((LA2_1>='\u0000' && LA2_1<='.')||(LA2_1>='0' && LA2_1<='\uFFFF')) ) {
                                alt2=1;
                            }


                        }
                        else if ( ((LA2_0>='\u0000' && LA2_0<=')')||(LA2_0>='+' && LA2_0<='\uFFFF')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:29:43: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
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
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:34:2: ( ( '\\r' )? '\\n' )
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:34:4: ( '\\r' )? '\\n'
            {
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:34:4: ( '\\r' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:34:4: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:37:5: ( ( ' ' | '\\t' ) )
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:37:9: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "REGISTER"
    public final void mREGISTER() throws RecognitionException {
        try {
            int _type = REGISTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:44:2: ( ( 'BX' | 'CX' | 'DX' | 'EX' | 'FX' | 'GX' | 'DIRA' | 'DIRB' | 'DIRC' | 'PORTA' | 'PORTB' | 'PORTC' ) )
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:44:4: ( 'BX' | 'CX' | 'DX' | 'EX' | 'FX' | 'GX' | 'DIRA' | 'DIRB' | 'DIRC' | 'PORTA' | 'PORTB' | 'PORTC' )
            {
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:44:4: ( 'BX' | 'CX' | 'DX' | 'EX' | 'FX' | 'GX' | 'DIRA' | 'DIRB' | 'DIRC' | 'PORTA' | 'PORTB' | 'PORTC' )
            int alt5=12;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:44:5: 'BX'
                    {
                    match("BX"); 


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:44:12: 'CX'
                    {
                    match("CX"); 


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:44:19: 'DX'
                    {
                    match("DX"); 


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:44:26: 'EX'
                    {
                    match("EX"); 


                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:44:33: 'FX'
                    {
                    match("FX"); 


                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:44:40: 'GX'
                    {
                    match("GX"); 


                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:44:47: 'DIRA'
                    {
                    match("DIRA"); 


                    }
                    break;
                case 8 :
                    // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:44:56: 'DIRB'
                    {
                    match("DIRB"); 


                    }
                    break;
                case 9 :
                    // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:44:65: 'DIRC'
                    {
                    match("DIRC"); 


                    }
                    break;
                case 10 :
                    // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:44:74: 'PORTA'
                    {
                    match("PORTA"); 


                    }
                    break;
                case 11 :
                    // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:44:84: 'PORTB'
                    {
                    match("PORTB"); 


                    }
                    break;
                case 12 :
                    // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:44:94: 'PORTC'
                    {
                    match("PORTC"); 


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
    // $ANTLR end "REGISTER"

    // $ANTLR start "NUMERO_DEC"
    public final void mNUMERO_DEC() throws RecognitionException {
        try {
            int _type = NUMERO_DEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:48:2: ( ( DIGIT )+ )
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:48:4: ( DIGIT )+
            {
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:48:4: ( DIGIT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:48:5: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMERO_DEC"

    // $ANTLR start "NUMERO_HEX"
    public final void mNUMERO_HEX() throws RecognitionException {
        try {
            int _type = NUMERO_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:52:2: ( '0x' ( HEX_DIGIT )+ )
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:52:4: '0x' ( HEX_DIGIT )+
            {
            match("0x"); 

            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:52:8: ( HEX_DIGIT )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='F')||(LA7_0>='a' && LA7_0<='f')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:52:9: HEX_DIGIT
            	    {
            	    mHEX_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMERO_HEX"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:55:2: ( '0' .. '9' )
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:55:4: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:57:2: ( ( '0' .. '9' ) | ( 'a' .. 'f' | 'A' .. 'F' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                alt8=1;
            }
            else if ( ((LA8_0>='A' && LA8_0<='F')||(LA8_0>='a' && LA8_0<='f')) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:57:4: ( '0' .. '9' )
                    {
                    // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:57:4: ( '0' .. '9' )
                    // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:57:5: '0' .. '9'
                    {
                    matchRange('0','9'); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:57:17: ( 'a' .. 'f' | 'A' .. 'F' )
                    {
                    if ( (input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    public void mTokens() throws RecognitionException {
        // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:1:8: ( MOVW | LOAD | STORE | ADD | NOT | AND | OR | XOR | INC | SUB | BRANCH | END_STMT | COMMENT | NEWLINE | WS | REGISTER | NUMERO_DEC | NUMERO_HEX )
        int alt9=18;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:1:10: MOVW
                {
                mMOVW(); 

                }
                break;
            case 2 :
                // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:1:15: LOAD
                {
                mLOAD(); 

                }
                break;
            case 3 :
                // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:1:20: STORE
                {
                mSTORE(); 

                }
                break;
            case 4 :
                // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:1:26: ADD
                {
                mADD(); 

                }
                break;
            case 5 :
                // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:1:30: NOT
                {
                mNOT(); 

                }
                break;
            case 6 :
                // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:1:34: AND
                {
                mAND(); 

                }
                break;
            case 7 :
                // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:1:38: OR
                {
                mOR(); 

                }
                break;
            case 8 :
                // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:1:41: XOR
                {
                mXOR(); 

                }
                break;
            case 9 :
                // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:1:45: INC
                {
                mINC(); 

                }
                break;
            case 10 :
                // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:1:49: SUB
                {
                mSUB(); 

                }
                break;
            case 11 :
                // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:1:53: BRANCH
                {
                mBRANCH(); 

                }
                break;
            case 12 :
                // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:1:60: END_STMT
                {
                mEND_STMT(); 

                }
                break;
            case 13 :
                // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:1:69: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 14 :
                // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:1:77: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 15 :
                // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:1:85: WS
                {
                mWS(); 

                }
                break;
            case 16 :
                // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:1:88: REGISTER
                {
                mREGISTER(); 

                }
                break;
            case 17 :
                // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:1:97: NUMERO_DEC
                {
                mNUMERO_DEC(); 

                }
                break;
            case 18 :
                // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:1:108: NUMERO_HEX
                {
                mNUMERO_HEX(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA5_eotS =
        "\24\uffff";
    static final String DFA5_eofS =
        "\24\uffff";
    static final String DFA5_minS =
        "\1\102\2\uffff\1\111\3\uffff\1\117\1\uffff\2\122\1\101\1\124\3"+
        "\uffff\1\101\3\uffff";
    static final String DFA5_maxS =
        "\1\120\2\uffff\1\130\3\uffff\1\117\1\uffff\2\122\1\103\1\124\3"+
        "\uffff\1\103\3\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\uffff\1\3\4\uffff\1\7\1"+
        "\10\1\11\1\uffff\1\12\1\13\1\14";
    static final String DFA5_specialS =
        "\24\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\10\uffff\1\7",
            "",
            "",
            "\1\11\16\uffff\1\10",
            "",
            "",
            "",
            "\1\12",
            "",
            "\1\13",
            "\1\14",
            "\1\15\1\16\1\17",
            "\1\20",
            "",
            "",
            "",
            "\1\21\1\22\1\23",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "44:4: ( 'BX' | 'CX' | 'DX' | 'EX' | 'FX' | 'GX' | 'DIRA' | 'DIRB' | 'DIRC' | 'PORTA' | 'PORTB' | 'PORTC' )";
        }
    }
    static final String DFA9_eotS =
        "\17\uffff\1\20\7\uffff";
    static final String DFA9_eofS =
        "\27\uffff";
    static final String DFA9_minS =
        "\1\11\2\uffff\1\124\1\104\4\uffff\1\122\5\uffff\1\170\7\uffff";
    static final String DFA9_maxS =
        "\1\130\2\uffff\1\125\1\116\4\uffff\1\130\5\uffff\1\170\7\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\5\1\7\1\10\1\11\1\uffff\1\14\1\15\1"+
        "\16\1\17\1\20\1\uffff\1\21\1\3\1\12\1\4\1\6\1\13\1\22";
    static final String DFA9_specialS =
        "\27\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\15\1\14\2\uffff\1\14\22\uffff\1\15\16\uffff\1\13\1\17\11"+
            "\20\1\uffff\1\12\5\uffff\1\4\1\11\5\16\1\uffff\1\10\2\uffff"+
            "\1\2\1\1\1\5\1\6\1\16\2\uffff\1\3\4\uffff\1\7",
            "",
            "",
            "\1\21\1\22",
            "\1\23\11\uffff\1\24",
            "",
            "",
            "",
            "",
            "\1\25\5\uffff\1\16",
            "",
            "",
            "",
            "",
            "",
            "\1\26",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( MOVW | LOAD | STORE | ADD | NOT | AND | OR | XOR | INC | SUB | BRANCH | END_STMT | COMMENT | NEWLINE | WS | REGISTER | NUMERO_DEC | NUMERO_HEX );";
        }
    }
 

}