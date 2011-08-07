// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g 2011-08-08 00:05:52

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class SimpleASMParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MOVW", "LOAD", "STORE", "ADD", "NOT", "AND", "OR", "XOR", "INC", "SUB", "BRANCH", "END_STMT", "COMMENT", "NEWLINE", "WS", "REGISTER", "DIGIT", "NUMERO_DEC", "HEX_DIGIT", "NUMERO_HEX"
    };
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


        public SimpleASMParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SimpleASMParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return SimpleASMParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g"; }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:60:1: program : ( statement1 | statement2 )+ ;
    public final SimpleASMParser.program_return program() throws RecognitionException {
        SimpleASMParser.program_return retval = new SimpleASMParser.program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SimpleASMParser.statement1_return statement11 = null;

        SimpleASMParser.statement2_return statement22 = null;



        try {
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:60:9: ( ( statement1 | statement2 )+ )
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:60:11: ( statement1 | statement2 )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:60:11: ( statement1 | statement2 )+
            int cnt1=0;
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==MOVW||(LA1_0>=ADD && LA1_0<=XOR)||LA1_0==SUB) ) {
                    alt1=1;
                }
                else if ( (LA1_0==INC) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:60:12: statement1
            	    {
            	    pushFollow(FOLLOW_statement1_in_program414);
            	    statement11=statement1();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement11.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:60:25: statement2
            	    {
            	    pushFollow(FOLLOW_statement2_in_program418);
            	    statement22=statement2();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement22.getTree());

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

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class statement1_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement1"
    // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:61:1: statement1 : ( MOVW | ADD | NOT | AND | OR | XOR | SUB ) ( REGISTER | NUMERO_DEC | NUMERO_HEX ) END_STMT ( COMMENT )? NEWLINE ;
    public final SimpleASMParser.statement1_return statement1() throws RecognitionException {
        SimpleASMParser.statement1_return retval = new SimpleASMParser.statement1_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set3=null;
        Token set4=null;
        Token END_STMT5=null;
        Token COMMENT6=null;
        Token NEWLINE7=null;

        CommonTree set3_tree=null;
        CommonTree set4_tree=null;
        CommonTree END_STMT5_tree=null;
        CommonTree COMMENT6_tree=null;
        CommonTree NEWLINE7_tree=null;

        try {
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:62:3: ( ( MOVW | ADD | NOT | AND | OR | XOR | SUB ) ( REGISTER | NUMERO_DEC | NUMERO_HEX ) END_STMT ( COMMENT )? NEWLINE )
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:62:5: ( MOVW | ADD | NOT | AND | OR | XOR | SUB ) ( REGISTER | NUMERO_DEC | NUMERO_HEX ) END_STMT ( COMMENT )? NEWLINE
            {
            root_0 = (CommonTree)adaptor.nil();

            set3=(Token)input.LT(1);
            if ( input.LA(1)==MOVW||(input.LA(1)>=ADD && input.LA(1)<=XOR)||input.LA(1)==SUB ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set3));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            set4=(Token)input.LT(1);
            if ( input.LA(1)==REGISTER||input.LA(1)==NUMERO_DEC||input.LA(1)==NUMERO_HEX ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set4));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            END_STMT5=(Token)match(input,END_STMT,FOLLOW_END_STMT_in_statement1472); 
            END_STMT5_tree = (CommonTree)adaptor.create(END_STMT5);
            adaptor.addChild(root_0, END_STMT5_tree);

            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:62:94: ( COMMENT )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==COMMENT) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:62:94: COMMENT
                    {
                    COMMENT6=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_statement1474); 
                    COMMENT6_tree = (CommonTree)adaptor.create(COMMENT6);
                    adaptor.addChild(root_0, COMMENT6_tree);


                    }
                    break;

            }

            NEWLINE7=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_statement1477); 
            NEWLINE7_tree = (CommonTree)adaptor.create(NEWLINE7);
            adaptor.addChild(root_0, NEWLINE7_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement1"

    public static class statement2_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement2"
    // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:64:1: statement2 : INC END_STMT ( COMMENT )? NEWLINE ;
    public final SimpleASMParser.statement2_return statement2() throws RecognitionException {
        SimpleASMParser.statement2_return retval = new SimpleASMParser.statement2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INC8=null;
        Token END_STMT9=null;
        Token COMMENT10=null;
        Token NEWLINE11=null;

        CommonTree INC8_tree=null;
        CommonTree END_STMT9_tree=null;
        CommonTree COMMENT10_tree=null;
        CommonTree NEWLINE11_tree=null;

        try {
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:65:2: ( INC END_STMT ( COMMENT )? NEWLINE )
            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:65:4: INC END_STMT ( COMMENT )? NEWLINE
            {
            root_0 = (CommonTree)adaptor.nil();

            INC8=(Token)match(input,INC,FOLLOW_INC_in_statement2489); 
            INC8_tree = (CommonTree)adaptor.create(INC8);
            adaptor.addChild(root_0, INC8_tree);

            END_STMT9=(Token)match(input,END_STMT,FOLLOW_END_STMT_in_statement2491); 
            END_STMT9_tree = (CommonTree)adaptor.create(END_STMT9);
            adaptor.addChild(root_0, END_STMT9_tree);

            // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:65:17: ( COMMENT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==COMMENT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Documents and Settings\\Laraujo\\Desktop\\Downloads\\SimpleASM.g:65:17: COMMENT
                    {
                    COMMENT10=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_statement2493); 
                    COMMENT10_tree = (CommonTree)adaptor.create(COMMENT10);
                    adaptor.addChild(root_0, COMMENT10_tree);


                    }
                    break;

            }

            NEWLINE11=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_statement2496); 
            NEWLINE11_tree = (CommonTree)adaptor.create(NEWLINE11);
            adaptor.addChild(root_0, NEWLINE11_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement2"

    // Delegated rules


 

    public static final BitSet FOLLOW_statement1_in_program414 = new BitSet(new long[]{0x0000000000003F92L});
    public static final BitSet FOLLOW_statement2_in_program418 = new BitSet(new long[]{0x0000000000003F92L});
    public static final BitSet FOLLOW_set_in_statement1431 = new BitSet(new long[]{0x0000000000A80000L});
    public static final BitSet FOLLOW_set_in_statement1459 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_STMT_in_statement1472 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_COMMENT_in_statement1474 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NEWLINE_in_statement1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_statement2489 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_STMT_in_statement2491 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_COMMENT_in_statement2493 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NEWLINE_in_statement2496 = new BitSet(new long[]{0x0000000000000002L});

}