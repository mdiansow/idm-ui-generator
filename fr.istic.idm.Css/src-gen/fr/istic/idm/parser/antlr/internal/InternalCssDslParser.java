package fr.istic.idm.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.istic.idm.services.CssDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCssDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Css '", "'{'", "'}'", "'=>'", "'CheckBox'", "'ComboBox'", "'TextField'", "'RadioButton'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalCssDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCssDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCssDslParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g"; }



     	private CssDslGrammarAccess grammarAccess;
     	
        public InternalCssDslParser(TokenStream input, CssDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Css";	
       	}
       	
       	@Override
       	protected CssDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleCss"
    // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:67:1: entryRuleCss returns [EObject current=null] : iv_ruleCss= ruleCss EOF ;
    public final EObject entryRuleCss() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCss = null;


        try {
            // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:68:2: (iv_ruleCss= ruleCss EOF )
            // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:69:2: iv_ruleCss= ruleCss EOF
            {
             newCompositeNode(grammarAccess.getCssRule()); 
            pushFollow(FOLLOW_ruleCss_in_entryRuleCss75);
            iv_ruleCss=ruleCss();

            state._fsp--;

             current =iv_ruleCss; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCss85); 

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
    // $ANTLR end "entryRuleCss"


    // $ANTLR start "ruleCss"
    // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:76:1: ruleCss returns [EObject current=null] : (otherlv_0= 'Css ' otherlv_1= '{' ( (lv_css_2_0= ruleWidget ) )+ otherlv_3= '}' ) ;
    public final EObject ruleCss() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_css_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:79:28: ( (otherlv_0= 'Css ' otherlv_1= '{' ( (lv_css_2_0= ruleWidget ) )+ otherlv_3= '}' ) )
            // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:80:1: (otherlv_0= 'Css ' otherlv_1= '{' ( (lv_css_2_0= ruleWidget ) )+ otherlv_3= '}' )
            {
            // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:80:1: (otherlv_0= 'Css ' otherlv_1= '{' ( (lv_css_2_0= ruleWidget ) )+ otherlv_3= '}' )
            // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:80:3: otherlv_0= 'Css ' otherlv_1= '{' ( (lv_css_2_0= ruleWidget ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleCss122); 

                	newLeafNode(otherlv_0, grammarAccess.getCssAccess().getCssKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleCss134); 

                	newLeafNode(otherlv_1, grammarAccess.getCssAccess().getLeftCurlyBracketKeyword_1());
                
            // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:88:1: ( (lv_css_2_0= ruleWidget ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:89:1: (lv_css_2_0= ruleWidget )
            	    {
            	    // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:89:1: (lv_css_2_0= ruleWidget )
            	    // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:90:3: lv_css_2_0= ruleWidget
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCssAccess().getCssWidgetParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWidget_in_ruleCss155);
            	    lv_css_2_0=ruleWidget();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCssRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"css",
            	            		lv_css_2_0, 
            	            		"Widget");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleCss168); 

                	newLeafNode(otherlv_3, grammarAccess.getCssAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleCss"


    // $ANTLR start "entryRuleWidget"
    // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:118:1: entryRuleWidget returns [EObject current=null] : iv_ruleWidget= ruleWidget EOF ;
    public final EObject entryRuleWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidget = null;


        try {
            // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:119:2: (iv_ruleWidget= ruleWidget EOF )
            // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:120:2: iv_ruleWidget= ruleWidget EOF
            {
             newCompositeNode(grammarAccess.getWidgetRule()); 
            pushFollow(FOLLOW_ruleWidget_in_entryRuleWidget204);
            iv_ruleWidget=ruleWidget();

            state._fsp--;

             current =iv_ruleWidget; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWidget214); 

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
    // $ANTLR end "entryRuleWidget"


    // $ANTLR start "ruleWidget"
    // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:127:1: ruleWidget returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=>' ( ( (lv_value_2_1= 'CheckBox' | lv_value_2_2= 'ComboBox' | lv_value_2_3= 'TextField' | lv_value_2_4= 'RadioButton' ) ) ) ) ;
    public final EObject ruleWidget() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;
        Token lv_value_2_3=null;
        Token lv_value_2_4=null;

         enterRule(); 
            
        try {
            // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:130:28: ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=>' ( ( (lv_value_2_1= 'CheckBox' | lv_value_2_2= 'ComboBox' | lv_value_2_3= 'TextField' | lv_value_2_4= 'RadioButton' ) ) ) ) )
            // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:131:1: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=>' ( ( (lv_value_2_1= 'CheckBox' | lv_value_2_2= 'ComboBox' | lv_value_2_3= 'TextField' | lv_value_2_4= 'RadioButton' ) ) ) )
            {
            // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:131:1: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=>' ( ( (lv_value_2_1= 'CheckBox' | lv_value_2_2= 'ComboBox' | lv_value_2_3= 'TextField' | lv_value_2_4= 'RadioButton' ) ) ) )
            // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:131:2: ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=>' ( ( (lv_value_2_1= 'CheckBox' | lv_value_2_2= 'ComboBox' | lv_value_2_3= 'TextField' | lv_value_2_4= 'RadioButton' ) ) )
            {
            // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:131:2: ( (lv_id_0_0= RULE_ID ) )
            // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:132:1: (lv_id_0_0= RULE_ID )
            {
            // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:132:1: (lv_id_0_0= RULE_ID )
            // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:133:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWidget256); 

            			newLeafNode(lv_id_0_0, grammarAccess.getWidgetAccess().getIdIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWidgetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleWidget273); 

                	newLeafNode(otherlv_1, grammarAccess.getWidgetAccess().getEqualsSignGreaterThanSignKeyword_1());
                
            // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:153:1: ( ( (lv_value_2_1= 'CheckBox' | lv_value_2_2= 'ComboBox' | lv_value_2_3= 'TextField' | lv_value_2_4= 'RadioButton' ) ) )
            // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:154:1: ( (lv_value_2_1= 'CheckBox' | lv_value_2_2= 'ComboBox' | lv_value_2_3= 'TextField' | lv_value_2_4= 'RadioButton' ) )
            {
            // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:154:1: ( (lv_value_2_1= 'CheckBox' | lv_value_2_2= 'ComboBox' | lv_value_2_3= 'TextField' | lv_value_2_4= 'RadioButton' ) )
            // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:155:1: (lv_value_2_1= 'CheckBox' | lv_value_2_2= 'ComboBox' | lv_value_2_3= 'TextField' | lv_value_2_4= 'RadioButton' )
            {
            // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:155:1: (lv_value_2_1= 'CheckBox' | lv_value_2_2= 'ComboBox' | lv_value_2_3= 'TextField' | lv_value_2_4= 'RadioButton' )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            case 18:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:156:3: lv_value_2_1= 'CheckBox'
                    {
                    lv_value_2_1=(Token)match(input,15,FOLLOW_15_in_ruleWidget293); 

                            newLeafNode(lv_value_2_1, grammarAccess.getWidgetAccess().getValueCheckBoxKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWidgetRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:168:8: lv_value_2_2= 'ComboBox'
                    {
                    lv_value_2_2=(Token)match(input,16,FOLLOW_16_in_ruleWidget322); 

                            newLeafNode(lv_value_2_2, grammarAccess.getWidgetAccess().getValueComboBoxKeyword_2_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWidgetRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:180:8: lv_value_2_3= 'TextField'
                    {
                    lv_value_2_3=(Token)match(input,17,FOLLOW_17_in_ruleWidget351); 

                            newLeafNode(lv_value_2_3, grammarAccess.getWidgetAccess().getValueTextFieldKeyword_2_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWidgetRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../fr.istic.idm.Css/src-gen/fr/istic/idm/parser/antlr/internal/InternalCssDsl.g:192:8: lv_value_2_4= 'RadioButton'
                    {
                    lv_value_2_4=(Token)match(input,18,FOLLOW_18_in_ruleWidget380); 

                            newLeafNode(lv_value_2_4, grammarAccess.getWidgetAccess().getValueRadioButtonKeyword_2_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWidgetRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_4, null);
                    	    

                    }
                    break;

            }


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
    // $ANTLR end "ruleWidget"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleCss_in_entryRuleCss75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCss85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleCss122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCss134 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleWidget_in_ruleCss155 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleCss168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWidget_in_entryRuleWidget204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWidget214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWidget256 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleWidget273 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_15_in_ruleWidget293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleWidget322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleWidget351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleWidget380 = new BitSet(new long[]{0x0000000000000002L});

}