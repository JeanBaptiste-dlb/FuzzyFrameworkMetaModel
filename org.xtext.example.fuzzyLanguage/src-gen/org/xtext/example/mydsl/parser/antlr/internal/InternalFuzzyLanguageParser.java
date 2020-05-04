package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.FuzzyLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFuzzyLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ANYTHING", "RULE_OPERATOR", "RULE_INT", "RULE_STRING", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Output'", "'='", "'Write('", "')'", "'Print('", "'FILE'", "'('", "'CONSOLE'", "'COUT'", "'FuzzySystemBuilding'", "'{'", "'}'", "'is'", "','", "'set'", "'Type'", "'to'", "'FuzzyConfig'"
    };
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


        public InternalFuzzyLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFuzzyLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFuzzyLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFuzzyLanguage.g"; }



     	private FuzzyLanguageGrammarAccess grammarAccess;

        public InternalFuzzyLanguageParser(TokenStream input, FuzzyLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "FuzzyModel";
       	}

       	@Override
       	protected FuzzyLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFuzzyModel"
    // InternalFuzzyLanguage.g:64:1: entryRuleFuzzyModel returns [EObject current=null] : iv_ruleFuzzyModel= ruleFuzzyModel EOF ;
    public final EObject entryRuleFuzzyModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuzzyModel = null;


        try {
            // InternalFuzzyLanguage.g:64:51: (iv_ruleFuzzyModel= ruleFuzzyModel EOF )
            // InternalFuzzyLanguage.g:65:2: iv_ruleFuzzyModel= ruleFuzzyModel EOF
            {
             newCompositeNode(grammarAccess.getFuzzyModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuzzyModel=ruleFuzzyModel();

            state._fsp--;

             current =iv_ruleFuzzyModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuzzyModel"


    // $ANTLR start "ruleFuzzyModel"
    // InternalFuzzyLanguage.g:71:1: ruleFuzzyModel returns [EObject current=null] : ( ( (lv_elements_0_0= ruleFuzzyConfig ) ) ( (lv_elements_1_0= ruleFuzzySystemBuilding ) ) ( (lv_elements_2_0= ruleOutputs ) )* ) ;
    public final EObject ruleFuzzyModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;

        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalFuzzyLanguage.g:77:2: ( ( ( (lv_elements_0_0= ruleFuzzyConfig ) ) ( (lv_elements_1_0= ruleFuzzySystemBuilding ) ) ( (lv_elements_2_0= ruleOutputs ) )* ) )
            // InternalFuzzyLanguage.g:78:2: ( ( (lv_elements_0_0= ruleFuzzyConfig ) ) ( (lv_elements_1_0= ruleFuzzySystemBuilding ) ) ( (lv_elements_2_0= ruleOutputs ) )* )
            {
            // InternalFuzzyLanguage.g:78:2: ( ( (lv_elements_0_0= ruleFuzzyConfig ) ) ( (lv_elements_1_0= ruleFuzzySystemBuilding ) ) ( (lv_elements_2_0= ruleOutputs ) )* )
            // InternalFuzzyLanguage.g:79:3: ( (lv_elements_0_0= ruleFuzzyConfig ) ) ( (lv_elements_1_0= ruleFuzzySystemBuilding ) ) ( (lv_elements_2_0= ruleOutputs ) )*
            {
            // InternalFuzzyLanguage.g:79:3: ( (lv_elements_0_0= ruleFuzzyConfig ) )
            // InternalFuzzyLanguage.g:80:4: (lv_elements_0_0= ruleFuzzyConfig )
            {
            // InternalFuzzyLanguage.g:80:4: (lv_elements_0_0= ruleFuzzyConfig )
            // InternalFuzzyLanguage.g:81:5: lv_elements_0_0= ruleFuzzyConfig
            {

            					newCompositeNode(grammarAccess.getFuzzyModelAccess().getElementsFuzzyConfigParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_elements_0_0=ruleFuzzyConfig();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuzzyModelRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_0_0,
            						"org.xtext.example.mydsl.FuzzyLanguage.FuzzyConfig");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFuzzyLanguage.g:98:3: ( (lv_elements_1_0= ruleFuzzySystemBuilding ) )
            // InternalFuzzyLanguage.g:99:4: (lv_elements_1_0= ruleFuzzySystemBuilding )
            {
            // InternalFuzzyLanguage.g:99:4: (lv_elements_1_0= ruleFuzzySystemBuilding )
            // InternalFuzzyLanguage.g:100:5: lv_elements_1_0= ruleFuzzySystemBuilding
            {

            					newCompositeNode(grammarAccess.getFuzzyModelAccess().getElementsFuzzySystemBuildingParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_elements_1_0=ruleFuzzySystemBuilding();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuzzyModelRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"org.xtext.example.mydsl.FuzzyLanguage.FuzzySystemBuilding");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFuzzyLanguage.g:117:3: ( (lv_elements_2_0= ruleOutputs ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFuzzyLanguage.g:118:4: (lv_elements_2_0= ruleOutputs )
            	    {
            	    // InternalFuzzyLanguage.g:118:4: (lv_elements_2_0= ruleOutputs )
            	    // InternalFuzzyLanguage.g:119:5: lv_elements_2_0= ruleOutputs
            	    {

            	    					newCompositeNode(grammarAccess.getFuzzyModelAccess().getElementsOutputsParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_elements_2_0=ruleOutputs();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFuzzyModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"org.xtext.example.mydsl.FuzzyLanguage.Outputs");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuzzyModel"


    // $ANTLR start "entryRuleOutputs"
    // InternalFuzzyLanguage.g:140:1: entryRuleOutputs returns [EObject current=null] : iv_ruleOutputs= ruleOutputs EOF ;
    public final EObject entryRuleOutputs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputs = null;


        try {
            // InternalFuzzyLanguage.g:140:48: (iv_ruleOutputs= ruleOutputs EOF )
            // InternalFuzzyLanguage.g:141:2: iv_ruleOutputs= ruleOutputs EOF
            {
             newCompositeNode(grammarAccess.getOutputsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutputs=ruleOutputs();

            state._fsp--;

             current =iv_ruleOutputs; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutputs"


    // $ANTLR start "ruleOutputs"
    // InternalFuzzyLanguage.g:147:1: ruleOutputs returns [EObject current=null] : (otherlv_0= 'Output' otherlv_1= '=' ( (lv_out_2_0= ruleOutput ) ) ( (lv_wr_3_0= ruleWrite ) ) ) ;
    public final EObject ruleOutputs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_out_2_0 = null;

        EObject lv_wr_3_0 = null;



        	enterRule();

        try {
            // InternalFuzzyLanguage.g:153:2: ( (otherlv_0= 'Output' otherlv_1= '=' ( (lv_out_2_0= ruleOutput ) ) ( (lv_wr_3_0= ruleWrite ) ) ) )
            // InternalFuzzyLanguage.g:154:2: (otherlv_0= 'Output' otherlv_1= '=' ( (lv_out_2_0= ruleOutput ) ) ( (lv_wr_3_0= ruleWrite ) ) )
            {
            // InternalFuzzyLanguage.g:154:2: (otherlv_0= 'Output' otherlv_1= '=' ( (lv_out_2_0= ruleOutput ) ) ( (lv_wr_3_0= ruleWrite ) ) )
            // InternalFuzzyLanguage.g:155:3: otherlv_0= 'Output' otherlv_1= '=' ( (lv_out_2_0= ruleOutput ) ) ( (lv_wr_3_0= ruleWrite ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputsAccess().getOutputKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputsAccess().getEqualsSignKeyword_1());
            		
            // InternalFuzzyLanguage.g:163:3: ( (lv_out_2_0= ruleOutput ) )
            // InternalFuzzyLanguage.g:164:4: (lv_out_2_0= ruleOutput )
            {
            // InternalFuzzyLanguage.g:164:4: (lv_out_2_0= ruleOutput )
            // InternalFuzzyLanguage.g:165:5: lv_out_2_0= ruleOutput
            {

            					newCompositeNode(grammarAccess.getOutputsAccess().getOutOutputParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_out_2_0=ruleOutput();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutputsRule());
            					}
            					set(
            						current,
            						"out",
            						lv_out_2_0,
            						"org.xtext.example.mydsl.FuzzyLanguage.Output");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFuzzyLanguage.g:182:3: ( (lv_wr_3_0= ruleWrite ) )
            // InternalFuzzyLanguage.g:183:4: (lv_wr_3_0= ruleWrite )
            {
            // InternalFuzzyLanguage.g:183:4: (lv_wr_3_0= ruleWrite )
            // InternalFuzzyLanguage.g:184:5: lv_wr_3_0= ruleWrite
            {

            					newCompositeNode(grammarAccess.getOutputsAccess().getWrWriteParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_wr_3_0=ruleWrite();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutputsRule());
            					}
            					set(
            						current,
            						"wr",
            						lv_wr_3_0,
            						"org.xtext.example.mydsl.FuzzyLanguage.Write");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutputs"


    // $ANTLR start "entryRuleWrite"
    // InternalFuzzyLanguage.g:205:1: entryRuleWrite returns [EObject current=null] : iv_ruleWrite= ruleWrite EOF ;
    public final EObject entryRuleWrite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWrite = null;


        try {
            // InternalFuzzyLanguage.g:205:46: (iv_ruleWrite= ruleWrite EOF )
            // InternalFuzzyLanguage.g:206:2: iv_ruleWrite= ruleWrite EOF
            {
             newCompositeNode(grammarAccess.getWriteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWrite=ruleWrite();

            state._fsp--;

             current =iv_ruleWrite; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWrite"


    // $ANTLR start "ruleWrite"
    // InternalFuzzyLanguage.g:212:1: ruleWrite returns [EObject current=null] : ( (otherlv_0= 'Write(' ( (lv_value_1_0= RULE_ID ) ) otherlv_2= ')' ) | (otherlv_3= 'Print(' ( (lv_value_4_0= RULE_ID ) ) otherlv_5= ')' ) ) ;
    public final EObject ruleWrite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalFuzzyLanguage.g:218:2: ( ( (otherlv_0= 'Write(' ( (lv_value_1_0= RULE_ID ) ) otherlv_2= ')' ) | (otherlv_3= 'Print(' ( (lv_value_4_0= RULE_ID ) ) otherlv_5= ')' ) ) )
            // InternalFuzzyLanguage.g:219:2: ( (otherlv_0= 'Write(' ( (lv_value_1_0= RULE_ID ) ) otherlv_2= ')' ) | (otherlv_3= 'Print(' ( (lv_value_4_0= RULE_ID ) ) otherlv_5= ')' ) )
            {
            // InternalFuzzyLanguage.g:219:2: ( (otherlv_0= 'Write(' ( (lv_value_1_0= RULE_ID ) ) otherlv_2= ')' ) | (otherlv_3= 'Print(' ( (lv_value_4_0= RULE_ID ) ) otherlv_5= ')' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalFuzzyLanguage.g:220:3: (otherlv_0= 'Write(' ( (lv_value_1_0= RULE_ID ) ) otherlv_2= ')' )
                    {
                    // InternalFuzzyLanguage.g:220:3: (otherlv_0= 'Write(' ( (lv_value_1_0= RULE_ID ) ) otherlv_2= ')' )
                    // InternalFuzzyLanguage.g:221:4: otherlv_0= 'Write(' ( (lv_value_1_0= RULE_ID ) ) otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getWriteAccess().getWriteKeyword_0_0());
                    			
                    // InternalFuzzyLanguage.g:225:4: ( (lv_value_1_0= RULE_ID ) )
                    // InternalFuzzyLanguage.g:226:5: (lv_value_1_0= RULE_ID )
                    {
                    // InternalFuzzyLanguage.g:226:5: (lv_value_1_0= RULE_ID )
                    // InternalFuzzyLanguage.g:227:6: lv_value_1_0= RULE_ID
                    {
                    lv_value_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getWriteAccess().getValueIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWriteRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getWriteAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFuzzyLanguage.g:249:3: (otherlv_3= 'Print(' ( (lv_value_4_0= RULE_ID ) ) otherlv_5= ')' )
                    {
                    // InternalFuzzyLanguage.g:249:3: (otherlv_3= 'Print(' ( (lv_value_4_0= RULE_ID ) ) otherlv_5= ')' )
                    // InternalFuzzyLanguage.g:250:4: otherlv_3= 'Print(' ( (lv_value_4_0= RULE_ID ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getWriteAccess().getPrintKeyword_1_0());
                    			
                    // InternalFuzzyLanguage.g:254:4: ( (lv_value_4_0= RULE_ID ) )
                    // InternalFuzzyLanguage.g:255:5: (lv_value_4_0= RULE_ID )
                    {
                    // InternalFuzzyLanguage.g:255:5: (lv_value_4_0= RULE_ID )
                    // InternalFuzzyLanguage.g:256:6: lv_value_4_0= RULE_ID
                    {
                    lv_value_4_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(lv_value_4_0, grammarAccess.getWriteAccess().getValueIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWriteRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getWriteAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWrite"


    // $ANTLR start "entryRuleOutput"
    // InternalFuzzyLanguage.g:281:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalFuzzyLanguage.g:281:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalFuzzyLanguage.g:282:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalFuzzyLanguage.g:288:1: ruleOutput returns [EObject current=null] : ( ( ( (lv_type_0_0= 'FILE' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_ANYTHING ) ) otherlv_3= ')' ) | ( (lv_type_4_0= 'CONSOLE' ) ) | ( (lv_type_5_0= 'COUT' ) ) ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token lv_path_2_0=null;
        Token otherlv_3=null;
        Token lv_type_4_0=null;
        Token lv_type_5_0=null;


        	enterRule();

        try {
            // InternalFuzzyLanguage.g:294:2: ( ( ( ( (lv_type_0_0= 'FILE' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_ANYTHING ) ) otherlv_3= ')' ) | ( (lv_type_4_0= 'CONSOLE' ) ) | ( (lv_type_5_0= 'COUT' ) ) ) )
            // InternalFuzzyLanguage.g:295:2: ( ( ( (lv_type_0_0= 'FILE' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_ANYTHING ) ) otherlv_3= ')' ) | ( (lv_type_4_0= 'CONSOLE' ) ) | ( (lv_type_5_0= 'COUT' ) ) )
            {
            // InternalFuzzyLanguage.g:295:2: ( ( ( (lv_type_0_0= 'FILE' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_ANYTHING ) ) otherlv_3= ')' ) | ( (lv_type_4_0= 'CONSOLE' ) ) | ( (lv_type_5_0= 'COUT' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt3=1;
                }
                break;
            case 21:
                {
                alt3=2;
                }
                break;
            case 22:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalFuzzyLanguage.g:296:3: ( ( (lv_type_0_0= 'FILE' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_ANYTHING ) ) otherlv_3= ')' )
                    {
                    // InternalFuzzyLanguage.g:296:3: ( ( (lv_type_0_0= 'FILE' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_ANYTHING ) ) otherlv_3= ')' )
                    // InternalFuzzyLanguage.g:297:4: ( (lv_type_0_0= 'FILE' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_ANYTHING ) ) otherlv_3= ')'
                    {
                    // InternalFuzzyLanguage.g:297:4: ( (lv_type_0_0= 'FILE' ) )
                    // InternalFuzzyLanguage.g:298:5: (lv_type_0_0= 'FILE' )
                    {
                    // InternalFuzzyLanguage.g:298:5: (lv_type_0_0= 'FILE' )
                    // InternalFuzzyLanguage.g:299:6: lv_type_0_0= 'FILE'
                    {
                    lv_type_0_0=(Token)match(input,19,FOLLOW_10); 

                    						newLeafNode(lv_type_0_0, grammarAccess.getOutputAccess().getTypeFILEKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutputRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_0_0, "FILE");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalFuzzyLanguage.g:315:4: ( (lv_path_2_0= RULE_ANYTHING ) )
                    // InternalFuzzyLanguage.g:316:5: (lv_path_2_0= RULE_ANYTHING )
                    {
                    // InternalFuzzyLanguage.g:316:5: (lv_path_2_0= RULE_ANYTHING )
                    // InternalFuzzyLanguage.g:317:6: lv_path_2_0= RULE_ANYTHING
                    {
                    lv_path_2_0=(Token)match(input,RULE_ANYTHING,FOLLOW_9); 

                    						newLeafNode(lv_path_2_0, grammarAccess.getOutputAccess().getPathANYTHINGTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutputRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"path",
                    							lv_path_2_0,
                    							"org.xtext.example.mydsl.FuzzyLanguage.ANYTHING");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getOutputAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFuzzyLanguage.g:339:3: ( (lv_type_4_0= 'CONSOLE' ) )
                    {
                    // InternalFuzzyLanguage.g:339:3: ( (lv_type_4_0= 'CONSOLE' ) )
                    // InternalFuzzyLanguage.g:340:4: (lv_type_4_0= 'CONSOLE' )
                    {
                    // InternalFuzzyLanguage.g:340:4: (lv_type_4_0= 'CONSOLE' )
                    // InternalFuzzyLanguage.g:341:5: lv_type_4_0= 'CONSOLE'
                    {
                    lv_type_4_0=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_type_4_0, grammarAccess.getOutputAccess().getTypeCONSOLEKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOutputRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_4_0, "CONSOLE");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFuzzyLanguage.g:354:3: ( (lv_type_5_0= 'COUT' ) )
                    {
                    // InternalFuzzyLanguage.g:354:3: ( (lv_type_5_0= 'COUT' ) )
                    // InternalFuzzyLanguage.g:355:4: (lv_type_5_0= 'COUT' )
                    {
                    // InternalFuzzyLanguage.g:355:4: (lv_type_5_0= 'COUT' )
                    // InternalFuzzyLanguage.g:356:5: lv_type_5_0= 'COUT'
                    {
                    lv_type_5_0=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_type_5_0, grammarAccess.getOutputAccess().getTypeCOUTKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOutputRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_5_0, "COUT");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleFuzzySystemBuilding"
    // InternalFuzzyLanguage.g:372:1: entryRuleFuzzySystemBuilding returns [EObject current=null] : iv_ruleFuzzySystemBuilding= ruleFuzzySystemBuilding EOF ;
    public final EObject entryRuleFuzzySystemBuilding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuzzySystemBuilding = null;


        try {
            // InternalFuzzyLanguage.g:372:60: (iv_ruleFuzzySystemBuilding= ruleFuzzySystemBuilding EOF )
            // InternalFuzzyLanguage.g:373:2: iv_ruleFuzzySystemBuilding= ruleFuzzySystemBuilding EOF
            {
             newCompositeNode(grammarAccess.getFuzzySystemBuildingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuzzySystemBuilding=ruleFuzzySystemBuilding();

            state._fsp--;

             current =iv_ruleFuzzySystemBuilding; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuzzySystemBuilding"


    // $ANTLR start "ruleFuzzySystemBuilding"
    // InternalFuzzyLanguage.g:379:1: ruleFuzzySystemBuilding returns [EObject current=null] : (otherlv_0= 'FuzzySystemBuilding' otherlv_1= '{' ( (lv_affectations_2_0= ruleAffectation ) )* otherlv_3= '}' ) ;
    public final EObject ruleFuzzySystemBuilding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_affectations_2_0 = null;



        	enterRule();

        try {
            // InternalFuzzyLanguage.g:385:2: ( (otherlv_0= 'FuzzySystemBuilding' otherlv_1= '{' ( (lv_affectations_2_0= ruleAffectation ) )* otherlv_3= '}' ) )
            // InternalFuzzyLanguage.g:386:2: (otherlv_0= 'FuzzySystemBuilding' otherlv_1= '{' ( (lv_affectations_2_0= ruleAffectation ) )* otherlv_3= '}' )
            {
            // InternalFuzzyLanguage.g:386:2: (otherlv_0= 'FuzzySystemBuilding' otherlv_1= '{' ( (lv_affectations_2_0= ruleAffectation ) )* otherlv_3= '}' )
            // InternalFuzzyLanguage.g:387:3: otherlv_0= 'FuzzySystemBuilding' otherlv_1= '{' ( (lv_affectations_2_0= ruleAffectation ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getFuzzySystemBuildingAccess().getFuzzySystemBuildingKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getFuzzySystemBuildingAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalFuzzyLanguage.g:395:3: ( (lv_affectations_2_0= ruleAffectation ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFuzzyLanguage.g:396:4: (lv_affectations_2_0= ruleAffectation )
            	    {
            	    // InternalFuzzyLanguage.g:396:4: (lv_affectations_2_0= ruleAffectation )
            	    // InternalFuzzyLanguage.g:397:5: lv_affectations_2_0= ruleAffectation
            	    {

            	    					newCompositeNode(grammarAccess.getFuzzySystemBuildingAccess().getAffectationsAffectationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_affectations_2_0=ruleAffectation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFuzzySystemBuildingRule());
            	    					}
            	    					add(
            	    						current,
            	    						"affectations",
            	    						lv_affectations_2_0,
            	    						"org.xtext.example.mydsl.FuzzyLanguage.Affectation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_3=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFuzzySystemBuildingAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuzzySystemBuilding"


    // $ANTLR start "entryRuleAffectation"
    // InternalFuzzyLanguage.g:422:1: entryRuleAffectation returns [EObject current=null] : iv_ruleAffectation= ruleAffectation EOF ;
    public final EObject entryRuleAffectation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffectation = null;


        try {
            // InternalFuzzyLanguage.g:422:52: (iv_ruleAffectation= ruleAffectation EOF )
            // InternalFuzzyLanguage.g:423:2: iv_ruleAffectation= ruleAffectation EOF
            {
             newCompositeNode(grammarAccess.getAffectationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAffectation=ruleAffectation();

            state._fsp--;

             current =iv_ruleAffectation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAffectation"


    // $ANTLR start "ruleAffectation"
    // InternalFuzzyLanguage.g:429:1: ruleAffectation returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_params_4_0= ruleParam ) )* otherlv_5= ')' ) | ( ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (lv_value_8_0= RULE_ANYTHING ) ) ) | ( ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '=' ( (lv_exp_11_0= ruleExpression ) ) ) ) ;
    public final EObject ruleAffectation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token lv_value_8_0=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        EObject lv_params_4_0 = null;

        EObject lv_exp_11_0 = null;



        	enterRule();

        try {
            // InternalFuzzyLanguage.g:435:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_params_4_0= ruleParam ) )* otherlv_5= ')' ) | ( ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (lv_value_8_0= RULE_ANYTHING ) ) ) | ( ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '=' ( (lv_exp_11_0= ruleExpression ) ) ) ) )
            // InternalFuzzyLanguage.g:436:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_params_4_0= ruleParam ) )* otherlv_5= ')' ) | ( ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (lv_value_8_0= RULE_ANYTHING ) ) ) | ( ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '=' ( (lv_exp_11_0= ruleExpression ) ) ) )
            {
            // InternalFuzzyLanguage.g:436:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_params_4_0= ruleParam ) )* otherlv_5= ')' ) | ( ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (lv_value_8_0= RULE_ANYTHING ) ) ) | ( ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '=' ( (lv_exp_11_0= ruleExpression ) ) ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==15) ) {
                    switch ( input.LA(3) ) {
                    case RULE_OPERATOR:
                        {
                        alt6=3;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA6_4 = input.LA(4);

                        if ( (LA6_4==EOF||LA6_4==RULE_ID||(LA6_4>=25 && LA6_4<=26)) ) {
                            alt6=3;
                        }
                        else if ( (LA6_4==20) ) {
                            alt6=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_ANYTHING:
                        {
                        alt6=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }

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
                    // InternalFuzzyLanguage.g:437:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_params_4_0= ruleParam ) )* otherlv_5= ')' )
                    {
                    // InternalFuzzyLanguage.g:437:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_params_4_0= ruleParam ) )* otherlv_5= ')' )
                    // InternalFuzzyLanguage.g:438:4: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_params_4_0= ruleParam ) )* otherlv_5= ')'
                    {
                    // InternalFuzzyLanguage.g:438:4: ( (lv_name_0_0= RULE_ID ) )
                    // InternalFuzzyLanguage.g:439:5: (lv_name_0_0= RULE_ID )
                    {
                    // InternalFuzzyLanguage.g:439:5: (lv_name_0_0= RULE_ID )
                    // InternalFuzzyLanguage.g:440:6: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_0_0, grammarAccess.getAffectationAccess().getNameIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAffectationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_0_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getAffectationAccess().getEqualsSignKeyword_0_1());
                    			
                    // InternalFuzzyLanguage.g:460:4: ( (lv_value_2_0= RULE_ID ) )
                    // InternalFuzzyLanguage.g:461:5: (lv_value_2_0= RULE_ID )
                    {
                    // InternalFuzzyLanguage.g:461:5: (lv_value_2_0= RULE_ID )
                    // InternalFuzzyLanguage.g:462:6: lv_value_2_0= RULE_ID
                    {
                    lv_value_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_value_2_0, grammarAccess.getAffectationAccess().getValueIDTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAffectationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getAffectationAccess().getLeftParenthesisKeyword_0_3());
                    			
                    // InternalFuzzyLanguage.g:482:4: ( (lv_params_4_0= ruleParam ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ANYTHING) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalFuzzyLanguage.g:483:5: (lv_params_4_0= ruleParam )
                    	    {
                    	    // InternalFuzzyLanguage.g:483:5: (lv_params_4_0= ruleParam )
                    	    // InternalFuzzyLanguage.g:484:6: lv_params_4_0= ruleParam
                    	    {

                    	    						newCompositeNode(grammarAccess.getAffectationAccess().getParamsParamParserRuleCall_0_4_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_params_4_0=ruleParam();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAffectationRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"params",
                    	    							lv_params_4_0,
                    	    							"org.xtext.example.mydsl.FuzzyLanguage.Param");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getAffectationAccess().getRightParenthesisKeyword_0_5());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFuzzyLanguage.g:507:3: ( ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (lv_value_8_0= RULE_ANYTHING ) ) )
                    {
                    // InternalFuzzyLanguage.g:507:3: ( ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (lv_value_8_0= RULE_ANYTHING ) ) )
                    // InternalFuzzyLanguage.g:508:4: ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (lv_value_8_0= RULE_ANYTHING ) )
                    {
                    // InternalFuzzyLanguage.g:508:4: ( (lv_name_6_0= RULE_ID ) )
                    // InternalFuzzyLanguage.g:509:5: (lv_name_6_0= RULE_ID )
                    {
                    // InternalFuzzyLanguage.g:509:5: (lv_name_6_0= RULE_ID )
                    // InternalFuzzyLanguage.g:510:6: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_6_0, grammarAccess.getAffectationAccess().getNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAffectationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_6_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getAffectationAccess().getEqualsSignKeyword_1_1());
                    			
                    // InternalFuzzyLanguage.g:530:4: ( (lv_value_8_0= RULE_ANYTHING ) )
                    // InternalFuzzyLanguage.g:531:5: (lv_value_8_0= RULE_ANYTHING )
                    {
                    // InternalFuzzyLanguage.g:531:5: (lv_value_8_0= RULE_ANYTHING )
                    // InternalFuzzyLanguage.g:532:6: lv_value_8_0= RULE_ANYTHING
                    {
                    lv_value_8_0=(Token)match(input,RULE_ANYTHING,FOLLOW_2); 

                    						newLeafNode(lv_value_8_0, grammarAccess.getAffectationAccess().getValueANYTHINGTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAffectationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_8_0,
                    							"org.xtext.example.mydsl.FuzzyLanguage.ANYTHING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFuzzyLanguage.g:550:3: ( ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '=' ( (lv_exp_11_0= ruleExpression ) ) )
                    {
                    // InternalFuzzyLanguage.g:550:3: ( ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '=' ( (lv_exp_11_0= ruleExpression ) ) )
                    // InternalFuzzyLanguage.g:551:4: ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '=' ( (lv_exp_11_0= ruleExpression ) )
                    {
                    // InternalFuzzyLanguage.g:551:4: ( (lv_name_9_0= RULE_ID ) )
                    // InternalFuzzyLanguage.g:552:5: (lv_name_9_0= RULE_ID )
                    {
                    // InternalFuzzyLanguage.g:552:5: (lv_name_9_0= RULE_ID )
                    // InternalFuzzyLanguage.g:553:6: lv_name_9_0= RULE_ID
                    {
                    lv_name_9_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_9_0, grammarAccess.getAffectationAccess().getNameIDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAffectationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_9_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_10, grammarAccess.getAffectationAccess().getEqualsSignKeyword_2_1());
                    			
                    // InternalFuzzyLanguage.g:573:4: ( (lv_exp_11_0= ruleExpression ) )
                    // InternalFuzzyLanguage.g:574:5: (lv_exp_11_0= ruleExpression )
                    {
                    // InternalFuzzyLanguage.g:574:5: (lv_exp_11_0= ruleExpression )
                    // InternalFuzzyLanguage.g:575:6: lv_exp_11_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getAffectationAccess().getExpExpressionParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exp_11_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAffectationRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_11_0,
                    							"org.xtext.example.mydsl.FuzzyLanguage.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAffectation"


    // $ANTLR start "entryRuleExpression"
    // InternalFuzzyLanguage.g:597:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalFuzzyLanguage.g:597:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalFuzzyLanguage.g:598:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalFuzzyLanguage.g:604:1: ruleExpression returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_OPERATOR ) ) otherlv_1= '{' ( (lv_exps_2_0= ruleExpression ) )* otherlv_3= '}' ) | ( ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'is' ( (lv_value_6_0= ruleExpression ) ) ) | ( (lv_name_7_0= RULE_ID ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_name_7_0=null;
        EObject lv_exps_2_0 = null;

        EObject lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalFuzzyLanguage.g:610:2: ( ( ( ( (lv_name_0_0= RULE_OPERATOR ) ) otherlv_1= '{' ( (lv_exps_2_0= ruleExpression ) )* otherlv_3= '}' ) | ( ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'is' ( (lv_value_6_0= ruleExpression ) ) ) | ( (lv_name_7_0= RULE_ID ) ) ) )
            // InternalFuzzyLanguage.g:611:2: ( ( ( (lv_name_0_0= RULE_OPERATOR ) ) otherlv_1= '{' ( (lv_exps_2_0= ruleExpression ) )* otherlv_3= '}' ) | ( ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'is' ( (lv_value_6_0= ruleExpression ) ) ) | ( (lv_name_7_0= RULE_ID ) ) )
            {
            // InternalFuzzyLanguage.g:611:2: ( ( ( (lv_name_0_0= RULE_OPERATOR ) ) otherlv_1= '{' ( (lv_exps_2_0= ruleExpression ) )* otherlv_3= '}' ) | ( ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'is' ( (lv_value_6_0= ruleExpression ) ) ) | ( (lv_name_7_0= RULE_ID ) ) )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_OPERATOR) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==EOF||LA8_2==RULE_ID||LA8_2==RULE_OPERATOR||LA8_2==25) ) {
                    alt8=3;
                }
                else if ( (LA8_2==26) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalFuzzyLanguage.g:612:3: ( ( (lv_name_0_0= RULE_OPERATOR ) ) otherlv_1= '{' ( (lv_exps_2_0= ruleExpression ) )* otherlv_3= '}' )
                    {
                    // InternalFuzzyLanguage.g:612:3: ( ( (lv_name_0_0= RULE_OPERATOR ) ) otherlv_1= '{' ( (lv_exps_2_0= ruleExpression ) )* otherlv_3= '}' )
                    // InternalFuzzyLanguage.g:613:4: ( (lv_name_0_0= RULE_OPERATOR ) ) otherlv_1= '{' ( (lv_exps_2_0= ruleExpression ) )* otherlv_3= '}'
                    {
                    // InternalFuzzyLanguage.g:613:4: ( (lv_name_0_0= RULE_OPERATOR ) )
                    // InternalFuzzyLanguage.g:614:5: (lv_name_0_0= RULE_OPERATOR )
                    {
                    // InternalFuzzyLanguage.g:614:5: (lv_name_0_0= RULE_OPERATOR )
                    // InternalFuzzyLanguage.g:615:6: lv_name_0_0= RULE_OPERATOR
                    {
                    lv_name_0_0=(Token)match(input,RULE_OPERATOR,FOLLOW_12); 

                    						newLeafNode(lv_name_0_0, grammarAccess.getExpressionAccess().getNameOPERATORTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_0_0,
                    							"org.xtext.example.mydsl.FuzzyLanguage.OPERATOR");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,24,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getLeftCurlyBracketKeyword_0_1());
                    			
                    // InternalFuzzyLanguage.g:635:4: ( (lv_exps_2_0= ruleExpression ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ID||LA7_0==RULE_OPERATOR) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalFuzzyLanguage.g:636:5: (lv_exps_2_0= ruleExpression )
                    	    {
                    	    // InternalFuzzyLanguage.g:636:5: (lv_exps_2_0= ruleExpression )
                    	    // InternalFuzzyLanguage.g:637:6: lv_exps_2_0= ruleExpression
                    	    {

                    	    						newCompositeNode(grammarAccess.getExpressionAccess().getExpsExpressionParserRuleCall_0_2_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
                    	    lv_exps_2_0=ruleExpression();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"exps",
                    	    							lv_exps_2_0,
                    	    							"org.xtext.example.mydsl.FuzzyLanguage.Expression");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getRightCurlyBracketKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFuzzyLanguage.g:660:3: ( ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'is' ( (lv_value_6_0= ruleExpression ) ) )
                    {
                    // InternalFuzzyLanguage.g:660:3: ( ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'is' ( (lv_value_6_0= ruleExpression ) ) )
                    // InternalFuzzyLanguage.g:661:4: ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'is' ( (lv_value_6_0= ruleExpression ) )
                    {
                    // InternalFuzzyLanguage.g:661:4: ( (lv_name_4_0= RULE_ID ) )
                    // InternalFuzzyLanguage.g:662:5: (lv_name_4_0= RULE_ID )
                    {
                    // InternalFuzzyLanguage.g:662:5: (lv_name_4_0= RULE_ID )
                    // InternalFuzzyLanguage.g:663:6: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getExpressionAccess().getNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,26,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getIsKeyword_1_1());
                    			
                    // InternalFuzzyLanguage.g:683:4: ( (lv_value_6_0= ruleExpression ) )
                    // InternalFuzzyLanguage.g:684:5: (lv_value_6_0= ruleExpression )
                    {
                    // InternalFuzzyLanguage.g:684:5: (lv_value_6_0= ruleExpression )
                    // InternalFuzzyLanguage.g:685:6: lv_value_6_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getValueExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_6_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"org.xtext.example.mydsl.FuzzyLanguage.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFuzzyLanguage.g:704:3: ( (lv_name_7_0= RULE_ID ) )
                    {
                    // InternalFuzzyLanguage.g:704:3: ( (lv_name_7_0= RULE_ID ) )
                    // InternalFuzzyLanguage.g:705:4: (lv_name_7_0= RULE_ID )
                    {
                    // InternalFuzzyLanguage.g:705:4: (lv_name_7_0= RULE_ID )
                    // InternalFuzzyLanguage.g:706:5: lv_name_7_0= RULE_ID
                    {
                    lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_7_0, grammarAccess.getExpressionAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExpressionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_7_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBinding"
    // InternalFuzzyLanguage.g:726:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalFuzzyLanguage.g:726:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalFuzzyLanguage.g:727:2: iv_ruleBinding= ruleBinding EOF
            {
             newCompositeNode(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinding=ruleBinding();

            state._fsp--;

             current =iv_ruleBinding; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalFuzzyLanguage.g:733:1: ruleBinding returns [EObject current=null] : ( ( (lv_op_0_0= RULE_OPERATOR ) ) otherlv_1= '=' ( (lv_target_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_params_4_0= ruleParam ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        Token otherlv_1=null;
        Token lv_target_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_params_4_0 = null;



        	enterRule();

        try {
            // InternalFuzzyLanguage.g:739:2: ( ( ( (lv_op_0_0= RULE_OPERATOR ) ) otherlv_1= '=' ( (lv_target_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_params_4_0= ruleParam ) )* otherlv_5= ')' )? ) )
            // InternalFuzzyLanguage.g:740:2: ( ( (lv_op_0_0= RULE_OPERATOR ) ) otherlv_1= '=' ( (lv_target_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_params_4_0= ruleParam ) )* otherlv_5= ')' )? )
            {
            // InternalFuzzyLanguage.g:740:2: ( ( (lv_op_0_0= RULE_OPERATOR ) ) otherlv_1= '=' ( (lv_target_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_params_4_0= ruleParam ) )* otherlv_5= ')' )? )
            // InternalFuzzyLanguage.g:741:3: ( (lv_op_0_0= RULE_OPERATOR ) ) otherlv_1= '=' ( (lv_target_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_params_4_0= ruleParam ) )* otherlv_5= ')' )?
            {
            // InternalFuzzyLanguage.g:741:3: ( (lv_op_0_0= RULE_OPERATOR ) )
            // InternalFuzzyLanguage.g:742:4: (lv_op_0_0= RULE_OPERATOR )
            {
            // InternalFuzzyLanguage.g:742:4: (lv_op_0_0= RULE_OPERATOR )
            // InternalFuzzyLanguage.g:743:5: lv_op_0_0= RULE_OPERATOR
            {
            lv_op_0_0=(Token)match(input,RULE_OPERATOR,FOLLOW_5); 

            					newLeafNode(lv_op_0_0, grammarAccess.getBindingAccess().getOpOPERATORTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"op",
            						lv_op_0_0,
            						"org.xtext.example.mydsl.FuzzyLanguage.OPERATOR");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getEqualsSignKeyword_1());
            		
            // InternalFuzzyLanguage.g:763:3: ( (lv_target_2_0= RULE_ID ) )
            // InternalFuzzyLanguage.g:764:4: (lv_target_2_0= RULE_ID )
            {
            // InternalFuzzyLanguage.g:764:4: (lv_target_2_0= RULE_ID )
            // InternalFuzzyLanguage.g:765:5: lv_target_2_0= RULE_ID
            {
            lv_target_2_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_target_2_0, grammarAccess.getBindingAccess().getTargetIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"target",
            						lv_target_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalFuzzyLanguage.g:781:3: (otherlv_3= '(' ( (lv_params_4_0= ruleParam ) )* otherlv_5= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalFuzzyLanguage.g:782:4: otherlv_3= '(' ( (lv_params_4_0= ruleParam ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getBindingAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalFuzzyLanguage.g:786:4: ( (lv_params_4_0= ruleParam ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ANYTHING) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalFuzzyLanguage.g:787:5: (lv_params_4_0= ruleParam )
                    	    {
                    	    // InternalFuzzyLanguage.g:787:5: (lv_params_4_0= ruleParam )
                    	    // InternalFuzzyLanguage.g:788:6: lv_params_4_0= ruleParam
                    	    {

                    	    						newCompositeNode(grammarAccess.getBindingAccess().getParamsParamParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_params_4_0=ruleParam();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getBindingRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"params",
                    	    							lv_params_4_0,
                    	    							"org.xtext.example.mydsl.FuzzyLanguage.Param");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getBindingAccess().getRightParenthesisKeyword_3_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleParam"
    // InternalFuzzyLanguage.g:814:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalFuzzyLanguage.g:814:46: (iv_ruleParam= ruleParam EOF )
            // InternalFuzzyLanguage.g:815:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalFuzzyLanguage.g:821:1: ruleParam returns [EObject current=null] : ( ( ( (lv_value_0_0= RULE_ANYTHING ) ) otherlv_1= ',' ) | ( (lv_value_2_0= RULE_ANYTHING ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalFuzzyLanguage.g:827:2: ( ( ( ( (lv_value_0_0= RULE_ANYTHING ) ) otherlv_1= ',' ) | ( (lv_value_2_0= RULE_ANYTHING ) ) ) )
            // InternalFuzzyLanguage.g:828:2: ( ( ( (lv_value_0_0= RULE_ANYTHING ) ) otherlv_1= ',' ) | ( (lv_value_2_0= RULE_ANYTHING ) ) )
            {
            // InternalFuzzyLanguage.g:828:2: ( ( ( (lv_value_0_0= RULE_ANYTHING ) ) otherlv_1= ',' ) | ( (lv_value_2_0= RULE_ANYTHING ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ANYTHING) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==EOF||LA11_1==RULE_ANYTHING||LA11_1==17) ) {
                    alt11=2;
                }
                else if ( (LA11_1==27) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalFuzzyLanguage.g:829:3: ( ( (lv_value_0_0= RULE_ANYTHING ) ) otherlv_1= ',' )
                    {
                    // InternalFuzzyLanguage.g:829:3: ( ( (lv_value_0_0= RULE_ANYTHING ) ) otherlv_1= ',' )
                    // InternalFuzzyLanguage.g:830:4: ( (lv_value_0_0= RULE_ANYTHING ) ) otherlv_1= ','
                    {
                    // InternalFuzzyLanguage.g:830:4: ( (lv_value_0_0= RULE_ANYTHING ) )
                    // InternalFuzzyLanguage.g:831:5: (lv_value_0_0= RULE_ANYTHING )
                    {
                    // InternalFuzzyLanguage.g:831:5: (lv_value_0_0= RULE_ANYTHING )
                    // InternalFuzzyLanguage.g:832:6: lv_value_0_0= RULE_ANYTHING
                    {
                    lv_value_0_0=(Token)match(input,RULE_ANYTHING,FOLLOW_19); 

                    						newLeafNode(lv_value_0_0, grammarAccess.getParamAccess().getValueANYTHINGTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParamRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_0_0,
                    							"org.xtext.example.mydsl.FuzzyLanguage.ANYTHING");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getParamAccess().getCommaKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFuzzyLanguage.g:854:3: ( (lv_value_2_0= RULE_ANYTHING ) )
                    {
                    // InternalFuzzyLanguage.g:854:3: ( (lv_value_2_0= RULE_ANYTHING ) )
                    // InternalFuzzyLanguage.g:855:4: (lv_value_2_0= RULE_ANYTHING )
                    {
                    // InternalFuzzyLanguage.g:855:4: (lv_value_2_0= RULE_ANYTHING )
                    // InternalFuzzyLanguage.g:856:5: lv_value_2_0= RULE_ANYTHING
                    {
                    lv_value_2_0=(Token)match(input,RULE_ANYTHING,FOLLOW_2); 

                    					newLeafNode(lv_value_2_0, grammarAccess.getParamAccess().getValueANYTHINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParamRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"org.xtext.example.mydsl.FuzzyLanguage.ANYTHING");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleTypeSet"
    // InternalFuzzyLanguage.g:876:1: entryRuleTypeSet returns [EObject current=null] : iv_ruleTypeSet= ruleTypeSet EOF ;
    public final EObject entryRuleTypeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSet = null;


        try {
            // InternalFuzzyLanguage.g:876:48: (iv_ruleTypeSet= ruleTypeSet EOF )
            // InternalFuzzyLanguage.g:877:2: iv_ruleTypeSet= ruleTypeSet EOF
            {
             newCompositeNode(grammarAccess.getTypeSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeSet=ruleTypeSet();

            state._fsp--;

             current =iv_ruleTypeSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeSet"


    // $ANTLR start "ruleTypeSet"
    // InternalFuzzyLanguage.g:883:1: ruleTypeSet returns [EObject current=null] : (otherlv_0= 'set' otherlv_1= 'Type' otherlv_2= 'to' ( (lv_typeName_3_0= RULE_ID ) ) ) ;
    public final EObject ruleTypeSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_typeName_3_0=null;


        	enterRule();

        try {
            // InternalFuzzyLanguage.g:889:2: ( (otherlv_0= 'set' otherlv_1= 'Type' otherlv_2= 'to' ( (lv_typeName_3_0= RULE_ID ) ) ) )
            // InternalFuzzyLanguage.g:890:2: (otherlv_0= 'set' otherlv_1= 'Type' otherlv_2= 'to' ( (lv_typeName_3_0= RULE_ID ) ) )
            {
            // InternalFuzzyLanguage.g:890:2: (otherlv_0= 'set' otherlv_1= 'Type' otherlv_2= 'to' ( (lv_typeName_3_0= RULE_ID ) ) )
            // InternalFuzzyLanguage.g:891:3: otherlv_0= 'set' otherlv_1= 'Type' otherlv_2= 'to' ( (lv_typeName_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeSetAccess().getSetKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getTypeSetAccess().getTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getTypeSetAccess().getToKeyword_2());
            		
            // InternalFuzzyLanguage.g:903:3: ( (lv_typeName_3_0= RULE_ID ) )
            // InternalFuzzyLanguage.g:904:4: (lv_typeName_3_0= RULE_ID )
            {
            // InternalFuzzyLanguage.g:904:4: (lv_typeName_3_0= RULE_ID )
            // InternalFuzzyLanguage.g:905:5: lv_typeName_3_0= RULE_ID
            {
            lv_typeName_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_typeName_3_0, grammarAccess.getTypeSetAccess().getTypeNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeSetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"typeName",
            						lv_typeName_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeSet"


    // $ANTLR start "entryRuleFuzzyConfig"
    // InternalFuzzyLanguage.g:925:1: entryRuleFuzzyConfig returns [EObject current=null] : iv_ruleFuzzyConfig= ruleFuzzyConfig EOF ;
    public final EObject entryRuleFuzzyConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuzzyConfig = null;


        try {
            // InternalFuzzyLanguage.g:925:52: (iv_ruleFuzzyConfig= ruleFuzzyConfig EOF )
            // InternalFuzzyLanguage.g:926:2: iv_ruleFuzzyConfig= ruleFuzzyConfig EOF
            {
             newCompositeNode(grammarAccess.getFuzzyConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuzzyConfig=ruleFuzzyConfig();

            state._fsp--;

             current =iv_ruleFuzzyConfig; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuzzyConfig"


    // $ANTLR start "ruleFuzzyConfig"
    // InternalFuzzyLanguage.g:932:1: ruleFuzzyConfig returns [EObject current=null] : (otherlv_0= 'FuzzyConfig' otherlv_1= '{' ( (lv_typeSET_2_0= ruleTypeSet ) ) ( (lv_BindingsList_3_0= ruleBinding ) )* otherlv_4= '}' ) ;
    public final EObject ruleFuzzyConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_typeSET_2_0 = null;

        EObject lv_BindingsList_3_0 = null;



        	enterRule();

        try {
            // InternalFuzzyLanguage.g:938:2: ( (otherlv_0= 'FuzzyConfig' otherlv_1= '{' ( (lv_typeSET_2_0= ruleTypeSet ) ) ( (lv_BindingsList_3_0= ruleBinding ) )* otherlv_4= '}' ) )
            // InternalFuzzyLanguage.g:939:2: (otherlv_0= 'FuzzyConfig' otherlv_1= '{' ( (lv_typeSET_2_0= ruleTypeSet ) ) ( (lv_BindingsList_3_0= ruleBinding ) )* otherlv_4= '}' )
            {
            // InternalFuzzyLanguage.g:939:2: (otherlv_0= 'FuzzyConfig' otherlv_1= '{' ( (lv_typeSET_2_0= ruleTypeSet ) ) ( (lv_BindingsList_3_0= ruleBinding ) )* otherlv_4= '}' )
            // InternalFuzzyLanguage.g:940:3: otherlv_0= 'FuzzyConfig' otherlv_1= '{' ( (lv_typeSET_2_0= ruleTypeSet ) ) ( (lv_BindingsList_3_0= ruleBinding ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getFuzzyConfigAccess().getFuzzyConfigKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getFuzzyConfigAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalFuzzyLanguage.g:948:3: ( (lv_typeSET_2_0= ruleTypeSet ) )
            // InternalFuzzyLanguage.g:949:4: (lv_typeSET_2_0= ruleTypeSet )
            {
            // InternalFuzzyLanguage.g:949:4: (lv_typeSET_2_0= ruleTypeSet )
            // InternalFuzzyLanguage.g:950:5: lv_typeSET_2_0= ruleTypeSet
            {

            					newCompositeNode(grammarAccess.getFuzzyConfigAccess().getTypeSETTypeSetParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_typeSET_2_0=ruleTypeSet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuzzyConfigRule());
            					}
            					set(
            						current,
            						"typeSET",
            						lv_typeSET_2_0,
            						"org.xtext.example.mydsl.FuzzyLanguage.TypeSet");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFuzzyLanguage.g:967:3: ( (lv_BindingsList_3_0= ruleBinding ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_OPERATOR) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFuzzyLanguage.g:968:4: (lv_BindingsList_3_0= ruleBinding )
            	    {
            	    // InternalFuzzyLanguage.g:968:4: (lv_BindingsList_3_0= ruleBinding )
            	    // InternalFuzzyLanguage.g:969:5: lv_BindingsList_3_0= ruleBinding
            	    {

            	    					newCompositeNode(grammarAccess.getFuzzyConfigAccess().getBindingsListBindingParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_BindingsList_3_0=ruleBinding();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFuzzyConfigRule());
            	    					}
            	    					add(
            	    						current,
            	    						"BindingsList",
            	    						lv_BindingsList_3_0,
            	    						"org.xtext.example.mydsl.FuzzyLanguage.Binding");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFuzzyConfigAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuzzyConfig"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000680000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000050L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000040L});

}