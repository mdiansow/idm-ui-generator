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
import fr.istic.idm.services.PivotMMDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPivotMMDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PollSystem'", "'{'", "'title'", "'models'", "','", "'}'", "'UiModel'", "'id'", "'laQuestion'", "'widgets'", "'CheckBox'", "'value'", "'RadioButton'", "'TextField'", "'ComboBox'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPivotMMDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPivotMMDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPivotMMDslParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g"; }



     	private PivotMMDslGrammarAccess grammarAccess;
     	
        public InternalPivotMMDslParser(TokenStream input, PivotMMDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "PollSystem";	
       	}
       	
       	@Override
       	protected PivotMMDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePollSystem"
    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:67:1: entryRulePollSystem returns [EObject current=null] : iv_rulePollSystem= rulePollSystem EOF ;
    public final EObject entryRulePollSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePollSystem = null;


        try {
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:68:2: (iv_rulePollSystem= rulePollSystem EOF )
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:69:2: iv_rulePollSystem= rulePollSystem EOF
            {
             newCompositeNode(grammarAccess.getPollSystemRule()); 
            pushFollow(FOLLOW_rulePollSystem_in_entryRulePollSystem75);
            iv_rulePollSystem=rulePollSystem();

            state._fsp--;

             current =iv_rulePollSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePollSystem85); 

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
    // $ANTLR end "entryRulePollSystem"


    // $ANTLR start "rulePollSystem"
    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:76:1: rulePollSystem returns [EObject current=null] : ( () otherlv_1= 'PollSystem' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'models' otherlv_6= '{' ( (lv_models_7_0= ruleUiModel ) ) (otherlv_8= ',' ( (lv_models_9_0= ruleUiModel ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject rulePollSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        EObject lv_models_7_0 = null;

        EObject lv_models_9_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:79:28: ( ( () otherlv_1= 'PollSystem' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'models' otherlv_6= '{' ( (lv_models_7_0= ruleUiModel ) ) (otherlv_8= ',' ( (lv_models_9_0= ruleUiModel ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:80:1: ( () otherlv_1= 'PollSystem' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'models' otherlv_6= '{' ( (lv_models_7_0= ruleUiModel ) ) (otherlv_8= ',' ( (lv_models_9_0= ruleUiModel ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:80:1: ( () otherlv_1= 'PollSystem' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'models' otherlv_6= '{' ( (lv_models_7_0= ruleUiModel ) ) (otherlv_8= ',' ( (lv_models_9_0= ruleUiModel ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:80:2: () otherlv_1= 'PollSystem' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'models' otherlv_6= '{' ( (lv_models_7_0= ruleUiModel ) ) (otherlv_8= ',' ( (lv_models_9_0= ruleUiModel ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:80:2: ()
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPollSystemAccess().getPollSystemAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_rulePollSystem131); 

                	newLeafNode(otherlv_1, grammarAccess.getPollSystemAccess().getPollSystemKeyword_1());
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePollSystem143); 

                	newLeafNode(otherlv_2, grammarAccess.getPollSystemAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:94:1: (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:94:3: otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_rulePollSystem156); 

                        	newLeafNode(otherlv_3, grammarAccess.getPollSystemAccess().getTitleKeyword_3_0());
                        
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:98:1: ( (lv_title_4_0= ruleEString ) )
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:99:1: (lv_title_4_0= ruleEString )
                    {
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:99:1: (lv_title_4_0= ruleEString )
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:100:3: lv_title_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPollSystemAccess().getTitleEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_rulePollSystem177);
                    lv_title_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPollSystemRule());
                    	        }
                           		set(
                           			current, 
                           			"title",
                            		lv_title_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:116:4: (otherlv_5= 'models' otherlv_6= '{' ( (lv_models_7_0= ruleUiModel ) ) (otherlv_8= ',' ( (lv_models_9_0= ruleUiModel ) ) )* otherlv_10= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:116:6: otherlv_5= 'models' otherlv_6= '{' ( (lv_models_7_0= ruleUiModel ) ) (otherlv_8= ',' ( (lv_models_9_0= ruleUiModel ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_rulePollSystem192); 

                        	newLeafNode(otherlv_5, grammarAccess.getPollSystemAccess().getModelsKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,12,FOLLOW_12_in_rulePollSystem204); 

                        	newLeafNode(otherlv_6, grammarAccess.getPollSystemAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:124:1: ( (lv_models_7_0= ruleUiModel ) )
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:125:1: (lv_models_7_0= ruleUiModel )
                    {
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:125:1: (lv_models_7_0= ruleUiModel )
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:126:3: lv_models_7_0= ruleUiModel
                    {
                     
                    	        newCompositeNode(grammarAccess.getPollSystemAccess().getModelsUiModelParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUiModel_in_rulePollSystem225);
                    lv_models_7_0=ruleUiModel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPollSystemRule());
                    	        }
                           		add(
                           			current, 
                           			"models",
                            		lv_models_7_0, 
                            		"UiModel");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:142:2: (otherlv_8= ',' ( (lv_models_9_0= ruleUiModel ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:142:4: otherlv_8= ',' ( (lv_models_9_0= ruleUiModel ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_rulePollSystem238); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getPollSystemAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:146:1: ( (lv_models_9_0= ruleUiModel ) )
                    	    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:147:1: (lv_models_9_0= ruleUiModel )
                    	    {
                    	    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:147:1: (lv_models_9_0= ruleUiModel )
                    	    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:148:3: lv_models_9_0= ruleUiModel
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPollSystemAccess().getModelsUiModelParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleUiModel_in_rulePollSystem259);
                    	    lv_models_9_0=ruleUiModel();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPollSystemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"models",
                    	            		lv_models_9_0, 
                    	            		"UiModel");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_16_in_rulePollSystem273); 

                        	newLeafNode(otherlv_10, grammarAccess.getPollSystemAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_rulePollSystem287); 

                	newLeafNode(otherlv_11, grammarAccess.getPollSystemAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "rulePollSystem"


    // $ANTLR start "entryRuleWidget"
    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:180:1: entryRuleWidget returns [EObject current=null] : iv_ruleWidget= ruleWidget EOF ;
    public final EObject entryRuleWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidget = null;


        try {
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:181:2: (iv_ruleWidget= ruleWidget EOF )
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:182:2: iv_ruleWidget= ruleWidget EOF
            {
             newCompositeNode(grammarAccess.getWidgetRule()); 
            pushFollow(FOLLOW_ruleWidget_in_entryRuleWidget323);
            iv_ruleWidget=ruleWidget();

            state._fsp--;

             current =iv_ruleWidget; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWidget333); 

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
    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:189:1: ruleWidget returns [EObject current=null] : (this_CheckBox_0= ruleCheckBox | this_RadioButton_1= ruleRadioButton | this_TextField_2= ruleTextField | this_ComboBox_3= ruleComboBox ) ;
    public final EObject ruleWidget() throws RecognitionException {
        EObject current = null;

        EObject this_CheckBox_0 = null;

        EObject this_RadioButton_1 = null;

        EObject this_TextField_2 = null;

        EObject this_ComboBox_3 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:192:28: ( (this_CheckBox_0= ruleCheckBox | this_RadioButton_1= ruleRadioButton | this_TextField_2= ruleTextField | this_ComboBox_3= ruleComboBox ) )
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:193:1: (this_CheckBox_0= ruleCheckBox | this_RadioButton_1= ruleRadioButton | this_TextField_2= ruleTextField | this_ComboBox_3= ruleComboBox )
            {
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:193:1: (this_CheckBox_0= ruleCheckBox | this_RadioButton_1= ruleRadioButton | this_TextField_2= ruleTextField | this_ComboBox_3= ruleComboBox )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt4=1;
                }
                break;
            case 23:
                {
                alt4=2;
                }
                break;
            case 24:
                {
                alt4=3;
                }
                break;
            case 25:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:194:5: this_CheckBox_0= ruleCheckBox
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getCheckBoxParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCheckBox_in_ruleWidget380);
                    this_CheckBox_0=ruleCheckBox();

                    state._fsp--;

                     
                            current = this_CheckBox_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:204:5: this_RadioButton_1= ruleRadioButton
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getRadioButtonParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRadioButton_in_ruleWidget407);
                    this_RadioButton_1=ruleRadioButton();

                    state._fsp--;

                     
                            current = this_RadioButton_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:214:5: this_TextField_2= ruleTextField
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getTextFieldParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTextField_in_ruleWidget434);
                    this_TextField_2=ruleTextField();

                    state._fsp--;

                     
                            current = this_TextField_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:224:5: this_ComboBox_3= ruleComboBox
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getComboBoxParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleComboBox_in_ruleWidget461);
                    this_ComboBox_3=ruleComboBox();

                    state._fsp--;

                     
                            current = this_ComboBox_3; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleWidget"


    // $ANTLR start "entryRuleUiModel"
    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:240:1: entryRuleUiModel returns [EObject current=null] : iv_ruleUiModel= ruleUiModel EOF ;
    public final EObject entryRuleUiModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUiModel = null;


        try {
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:241:2: (iv_ruleUiModel= ruleUiModel EOF )
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:242:2: iv_ruleUiModel= ruleUiModel EOF
            {
             newCompositeNode(grammarAccess.getUiModelRule()); 
            pushFollow(FOLLOW_ruleUiModel_in_entryRuleUiModel496);
            iv_ruleUiModel=ruleUiModel();

            state._fsp--;

             current =iv_ruleUiModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUiModel506); 

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
    // $ANTLR end "entryRuleUiModel"


    // $ANTLR start "ruleUiModel"
    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:249:1: ruleUiModel returns [EObject current=null] : ( () otherlv_1= 'UiModel' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'laQuestion' ( (lv_laQuestion_6_0= ruleEString ) ) )? (otherlv_7= 'widgets' otherlv_8= '{' ( (lv_widgets_9_0= ruleWidget ) ) (otherlv_10= ',' ( (lv_widgets_11_0= ruleWidget ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleUiModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        AntlrDatatypeRuleToken lv_laQuestion_6_0 = null;

        EObject lv_widgets_9_0 = null;

        EObject lv_widgets_11_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:252:28: ( ( () otherlv_1= 'UiModel' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'laQuestion' ( (lv_laQuestion_6_0= ruleEString ) ) )? (otherlv_7= 'widgets' otherlv_8= '{' ( (lv_widgets_9_0= ruleWidget ) ) (otherlv_10= ',' ( (lv_widgets_11_0= ruleWidget ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:253:1: ( () otherlv_1= 'UiModel' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'laQuestion' ( (lv_laQuestion_6_0= ruleEString ) ) )? (otherlv_7= 'widgets' otherlv_8= '{' ( (lv_widgets_9_0= ruleWidget ) ) (otherlv_10= ',' ( (lv_widgets_11_0= ruleWidget ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:253:1: ( () otherlv_1= 'UiModel' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'laQuestion' ( (lv_laQuestion_6_0= ruleEString ) ) )? (otherlv_7= 'widgets' otherlv_8= '{' ( (lv_widgets_9_0= ruleWidget ) ) (otherlv_10= ',' ( (lv_widgets_11_0= ruleWidget ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:253:2: () otherlv_1= 'UiModel' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'laQuestion' ( (lv_laQuestion_6_0= ruleEString ) ) )? (otherlv_7= 'widgets' otherlv_8= '{' ( (lv_widgets_9_0= ruleWidget ) ) (otherlv_10= ',' ( (lv_widgets_11_0= ruleWidget ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:253:2: ()
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:254:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUiModelAccess().getUiModelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleUiModel552); 

                	newLeafNode(otherlv_1, grammarAccess.getUiModelAccess().getUiModelKeyword_1());
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleUiModel564); 

                	newLeafNode(otherlv_2, grammarAccess.getUiModelAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:267:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:267:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleUiModel577); 

                        	newLeafNode(otherlv_3, grammarAccess.getUiModelAccess().getIdKeyword_3_0());
                        
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:271:1: ( (lv_id_4_0= ruleEString ) )
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:272:1: (lv_id_4_0= ruleEString )
                    {
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:272:1: (lv_id_4_0= ruleEString )
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:273:3: lv_id_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getUiModelAccess().getIdEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleUiModel598);
                    lv_id_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUiModelRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:289:4: (otherlv_5= 'laQuestion' ( (lv_laQuestion_6_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:289:6: otherlv_5= 'laQuestion' ( (lv_laQuestion_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleUiModel613); 

                        	newLeafNode(otherlv_5, grammarAccess.getUiModelAccess().getLaQuestionKeyword_4_0());
                        
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:293:1: ( (lv_laQuestion_6_0= ruleEString ) )
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:294:1: (lv_laQuestion_6_0= ruleEString )
                    {
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:294:1: (lv_laQuestion_6_0= ruleEString )
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:295:3: lv_laQuestion_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getUiModelAccess().getLaQuestionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleUiModel634);
                    lv_laQuestion_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUiModelRule());
                    	        }
                           		set(
                           			current, 
                           			"laQuestion",
                            		lv_laQuestion_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:311:4: (otherlv_7= 'widgets' otherlv_8= '{' ( (lv_widgets_9_0= ruleWidget ) ) (otherlv_10= ',' ( (lv_widgets_11_0= ruleWidget ) ) )* otherlv_12= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:311:6: otherlv_7= 'widgets' otherlv_8= '{' ( (lv_widgets_9_0= ruleWidget ) ) (otherlv_10= ',' ( (lv_widgets_11_0= ruleWidget ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleUiModel649); 

                        	newLeafNode(otherlv_7, grammarAccess.getUiModelAccess().getWidgetsKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleUiModel661); 

                        	newLeafNode(otherlv_8, grammarAccess.getUiModelAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:319:1: ( (lv_widgets_9_0= ruleWidget ) )
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:320:1: (lv_widgets_9_0= ruleWidget )
                    {
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:320:1: (lv_widgets_9_0= ruleWidget )
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:321:3: lv_widgets_9_0= ruleWidget
                    {
                     
                    	        newCompositeNode(grammarAccess.getUiModelAccess().getWidgetsWidgetParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWidget_in_ruleUiModel682);
                    lv_widgets_9_0=ruleWidget();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUiModelRule());
                    	        }
                           		add(
                           			current, 
                           			"widgets",
                            		lv_widgets_9_0, 
                            		"Widget");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:337:2: (otherlv_10= ',' ( (lv_widgets_11_0= ruleWidget ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==15) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:337:4: otherlv_10= ',' ( (lv_widgets_11_0= ruleWidget ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleUiModel695); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getUiModelAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:341:1: ( (lv_widgets_11_0= ruleWidget ) )
                    	    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:342:1: (lv_widgets_11_0= ruleWidget )
                    	    {
                    	    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:342:1: (lv_widgets_11_0= ruleWidget )
                    	    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:343:3: lv_widgets_11_0= ruleWidget
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUiModelAccess().getWidgetsWidgetParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleWidget_in_ruleUiModel716);
                    	    lv_widgets_11_0=ruleWidget();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUiModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"widgets",
                    	            		lv_widgets_11_0, 
                    	            		"Widget");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleUiModel730); 

                        	newLeafNode(otherlv_12, grammarAccess.getUiModelAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleUiModel744); 

                	newLeafNode(otherlv_13, grammarAccess.getUiModelAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleUiModel"


    // $ANTLR start "entryRuleEString"
    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:375:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:376:2: (iv_ruleEString= ruleEString EOF )
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:377:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString781);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString792); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:384:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:387:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:388:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:388:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:388:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString832); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:396:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString858); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleCheckBox"
    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:411:1: entryRuleCheckBox returns [EObject current=null] : iv_ruleCheckBox= ruleCheckBox EOF ;
    public final EObject entryRuleCheckBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckBox = null;


        try {
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:412:2: (iv_ruleCheckBox= ruleCheckBox EOF )
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:413:2: iv_ruleCheckBox= ruleCheckBox EOF
            {
             newCompositeNode(grammarAccess.getCheckBoxRule()); 
            pushFollow(FOLLOW_ruleCheckBox_in_entryRuleCheckBox903);
            iv_ruleCheckBox=ruleCheckBox();

            state._fsp--;

             current =iv_ruleCheckBox; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckBox913); 

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
    // $ANTLR end "entryRuleCheckBox"


    // $ANTLR start "ruleCheckBox"
    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:420:1: ruleCheckBox returns [EObject current=null] : ( () otherlv_1= 'CheckBox' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleCheckBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:423:28: ( ( () otherlv_1= 'CheckBox' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:424:1: ( () otherlv_1= 'CheckBox' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:424:1: ( () otherlv_1= 'CheckBox' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:424:2: () otherlv_1= 'CheckBox' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:424:2: ()
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:425:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCheckBoxAccess().getCheckBoxAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleCheckBox959); 

                	newLeafNode(otherlv_1, grammarAccess.getCheckBoxAccess().getCheckBoxKeyword_1());
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCheckBox971); 

                	newLeafNode(otherlv_2, grammarAccess.getCheckBoxAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:438:1: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:438:3: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleCheckBox984); 

                        	newLeafNode(otherlv_3, grammarAccess.getCheckBoxAccess().getValueKeyword_3_0());
                        
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:442:1: ( (lv_value_4_0= ruleEString ) )
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:443:1: (lv_value_4_0= ruleEString )
                    {
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:443:1: (lv_value_4_0= ruleEString )
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:444:3: lv_value_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCheckBoxAccess().getValueEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleCheckBox1005);
                    lv_value_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCheckBoxRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleCheckBox1019); 

                	newLeafNode(otherlv_5, grammarAccess.getCheckBoxAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleCheckBox"


    // $ANTLR start "entryRuleRadioButton"
    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:472:1: entryRuleRadioButton returns [EObject current=null] : iv_ruleRadioButton= ruleRadioButton EOF ;
    public final EObject entryRuleRadioButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadioButton = null;


        try {
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:473:2: (iv_ruleRadioButton= ruleRadioButton EOF )
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:474:2: iv_ruleRadioButton= ruleRadioButton EOF
            {
             newCompositeNode(grammarAccess.getRadioButtonRule()); 
            pushFollow(FOLLOW_ruleRadioButton_in_entryRuleRadioButton1055);
            iv_ruleRadioButton=ruleRadioButton();

            state._fsp--;

             current =iv_ruleRadioButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRadioButton1065); 

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
    // $ANTLR end "entryRuleRadioButton"


    // $ANTLR start "ruleRadioButton"
    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:481:1: ruleRadioButton returns [EObject current=null] : ( () otherlv_1= 'RadioButton' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleRadioButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:484:28: ( ( () otherlv_1= 'RadioButton' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:485:1: ( () otherlv_1= 'RadioButton' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:485:1: ( () otherlv_1= 'RadioButton' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:485:2: () otherlv_1= 'RadioButton' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:485:2: ()
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:486:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRadioButtonAccess().getRadioButtonAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleRadioButton1111); 

                	newLeafNode(otherlv_1, grammarAccess.getRadioButtonAccess().getRadioButtonKeyword_1());
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRadioButton1123); 

                	newLeafNode(otherlv_2, grammarAccess.getRadioButtonAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:499:1: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:499:3: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleRadioButton1136); 

                        	newLeafNode(otherlv_3, grammarAccess.getRadioButtonAccess().getValueKeyword_3_0());
                        
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:503:1: ( (lv_value_4_0= ruleEString ) )
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:504:1: (lv_value_4_0= ruleEString )
                    {
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:504:1: (lv_value_4_0= ruleEString )
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:505:3: lv_value_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRadioButtonAccess().getValueEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleRadioButton1157);
                    lv_value_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRadioButtonRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleRadioButton1171); 

                	newLeafNode(otherlv_5, grammarAccess.getRadioButtonAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleRadioButton"


    // $ANTLR start "entryRuleTextField"
    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:533:1: entryRuleTextField returns [EObject current=null] : iv_ruleTextField= ruleTextField EOF ;
    public final EObject entryRuleTextField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextField = null;


        try {
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:534:2: (iv_ruleTextField= ruleTextField EOF )
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:535:2: iv_ruleTextField= ruleTextField EOF
            {
             newCompositeNode(grammarAccess.getTextFieldRule()); 
            pushFollow(FOLLOW_ruleTextField_in_entryRuleTextField1207);
            iv_ruleTextField=ruleTextField();

            state._fsp--;

             current =iv_ruleTextField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextField1217); 

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
    // $ANTLR end "entryRuleTextField"


    // $ANTLR start "ruleTextField"
    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:542:1: ruleTextField returns [EObject current=null] : ( () otherlv_1= 'TextField' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleTextField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:545:28: ( ( () otherlv_1= 'TextField' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:546:1: ( () otherlv_1= 'TextField' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:546:1: ( () otherlv_1= 'TextField' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:546:2: () otherlv_1= 'TextField' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:546:2: ()
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:547:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTextFieldAccess().getTextFieldAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleTextField1263); 

                	newLeafNode(otherlv_1, grammarAccess.getTextFieldAccess().getTextFieldKeyword_1());
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleTextField1275); 

                	newLeafNode(otherlv_2, grammarAccess.getTextFieldAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:560:1: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:560:3: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleTextField1288); 

                        	newLeafNode(otherlv_3, grammarAccess.getTextFieldAccess().getValueKeyword_3_0());
                        
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:564:1: ( (lv_value_4_0= ruleEString ) )
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:565:1: (lv_value_4_0= ruleEString )
                    {
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:565:1: (lv_value_4_0= ruleEString )
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:566:3: lv_value_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextFieldAccess().getValueEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleTextField1309);
                    lv_value_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTextFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleTextField1323); 

                	newLeafNode(otherlv_5, grammarAccess.getTextFieldAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleTextField"


    // $ANTLR start "entryRuleComboBox"
    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:594:1: entryRuleComboBox returns [EObject current=null] : iv_ruleComboBox= ruleComboBox EOF ;
    public final EObject entryRuleComboBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComboBox = null;


        try {
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:595:2: (iv_ruleComboBox= ruleComboBox EOF )
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:596:2: iv_ruleComboBox= ruleComboBox EOF
            {
             newCompositeNode(grammarAccess.getComboBoxRule()); 
            pushFollow(FOLLOW_ruleComboBox_in_entryRuleComboBox1359);
            iv_ruleComboBox=ruleComboBox();

            state._fsp--;

             current =iv_ruleComboBox; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComboBox1369); 

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
    // $ANTLR end "entryRuleComboBox"


    // $ANTLR start "ruleComboBox"
    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:603:1: ruleComboBox returns [EObject current=null] : ( () otherlv_1= 'ComboBox' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleComboBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:606:28: ( ( () otherlv_1= 'ComboBox' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:607:1: ( () otherlv_1= 'ComboBox' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:607:1: ( () otherlv_1= 'ComboBox' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:607:2: () otherlv_1= 'ComboBox' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:607:2: ()
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:608:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getComboBoxAccess().getComboBoxAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleComboBox1415); 

                	newLeafNode(otherlv_1, grammarAccess.getComboBoxAccess().getComboBoxKeyword_1());
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleComboBox1427); 

                	newLeafNode(otherlv_2, grammarAccess.getComboBoxAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:621:1: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:621:3: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleComboBox1440); 

                        	newLeafNode(otherlv_3, grammarAccess.getComboBoxAccess().getValueKeyword_3_0());
                        
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:625:1: ( (lv_value_4_0= ruleEString ) )
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:626:1: (lv_value_4_0= ruleEString )
                    {
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:626:1: (lv_value_4_0= ruleEString )
                    // ../fr.istic.idm.PivotMM/src-gen/fr/istic/idm/parser/antlr/internal/InternalPivotMMDsl.g:627:3: lv_value_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getComboBoxAccess().getValueEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleComboBox1461);
                    lv_value_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComboBoxRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleComboBox1475); 

                	newLeafNode(otherlv_5, grammarAccess.getComboBoxAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleComboBox"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePollSystem_in_entryRulePollSystem75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePollSystem85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePollSystem131 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePollSystem143 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_13_in_rulePollSystem156 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_rulePollSystem177 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_14_in_rulePollSystem192 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePollSystem204 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleUiModel_in_rulePollSystem225 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_rulePollSystem238 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleUiModel_in_rulePollSystem259 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_rulePollSystem273 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePollSystem287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWidget_in_entryRuleWidget323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWidget333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckBox_in_ruleWidget380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioButton_in_ruleWidget407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextField_in_ruleWidget434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComboBox_in_ruleWidget461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUiModel_in_entryRuleUiModel496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUiModel506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleUiModel552 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUiModel564 = new BitSet(new long[]{0x00000000001D0000L});
    public static final BitSet FOLLOW_18_in_ruleUiModel577 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleUiModel598 = new BitSet(new long[]{0x0000000000190000L});
    public static final BitSet FOLLOW_19_in_ruleUiModel613 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleUiModel634 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_20_in_ruleUiModel649 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUiModel661 = new BitSet(new long[]{0x0000000003A00000L});
    public static final BitSet FOLLOW_ruleWidget_in_ruleUiModel682 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleUiModel695 = new BitSet(new long[]{0x0000000003A00000L});
    public static final BitSet FOLLOW_ruleWidget_in_ruleUiModel716 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleUiModel730 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleUiModel744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckBox_in_entryRuleCheckBox903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckBox913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleCheckBox959 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCheckBox971 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleCheckBox984 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleCheckBox1005 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCheckBox1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioButton_in_entryRuleRadioButton1055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRadioButton1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleRadioButton1111 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRadioButton1123 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleRadioButton1136 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleRadioButton1157 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRadioButton1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextField_in_entryRuleTextField1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextField1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTextField1263 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTextField1275 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleTextField1288 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTextField1309 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTextField1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComboBox_in_entryRuleComboBox1359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComboBox1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleComboBox1415 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleComboBox1427 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleComboBox1440 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleComboBox1461 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleComboBox1475 = new BitSet(new long[]{0x0000000000000002L});

}