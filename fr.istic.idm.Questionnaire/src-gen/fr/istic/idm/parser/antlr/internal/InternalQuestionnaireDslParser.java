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
import fr.istic.idm.services.QuestionnaireDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQuestionnaireDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Sondage '", "'{'", "'}'", "'Questionnaire '", "'Question '", "'Options'", "':'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalQuestionnaireDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQuestionnaireDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQuestionnaireDslParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g"; }



     	private QuestionnaireDslGrammarAccess grammarAccess;
     	
        public InternalQuestionnaireDslParser(TokenStream input, QuestionnaireDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Sondage";	
       	}
       	
       	@Override
       	protected QuestionnaireDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSondage"
    // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:67:1: entryRuleSondage returns [EObject current=null] : iv_ruleSondage= ruleSondage EOF ;
    public final EObject entryRuleSondage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSondage = null;


        try {
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:68:2: (iv_ruleSondage= ruleSondage EOF )
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:69:2: iv_ruleSondage= ruleSondage EOF
            {
             newCompositeNode(grammarAccess.getSondageRule()); 
            pushFollow(FOLLOW_ruleSondage_in_entryRuleSondage75);
            iv_ruleSondage=ruleSondage();

            state._fsp--;

             current =iv_ruleSondage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSondage85); 

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
    // $ANTLR end "entryRuleSondage"


    // $ANTLR start "ruleSondage"
    // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:76:1: ruleSondage returns [EObject current=null] : (otherlv_0= 'Sondage ' otherlv_1= '{' ( (lv_sondage_2_0= ruleQuestionnaire ) )+ otherlv_3= '}' ) ;
    public final EObject ruleSondage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_sondage_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:79:28: ( (otherlv_0= 'Sondage ' otherlv_1= '{' ( (lv_sondage_2_0= ruleQuestionnaire ) )+ otherlv_3= '}' ) )
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:80:1: (otherlv_0= 'Sondage ' otherlv_1= '{' ( (lv_sondage_2_0= ruleQuestionnaire ) )+ otherlv_3= '}' )
            {
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:80:1: (otherlv_0= 'Sondage ' otherlv_1= '{' ( (lv_sondage_2_0= ruleQuestionnaire ) )+ otherlv_3= '}' )
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:80:3: otherlv_0= 'Sondage ' otherlv_1= '{' ( (lv_sondage_2_0= ruleQuestionnaire ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSondage122); 

                	newLeafNode(otherlv_0, grammarAccess.getSondageAccess().getSondageKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleSondage134); 

                	newLeafNode(otherlv_1, grammarAccess.getSondageAccess().getLeftCurlyBracketKeyword_1());
                
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:88:1: ( (lv_sondage_2_0= ruleQuestionnaire ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:89:1: (lv_sondage_2_0= ruleQuestionnaire )
            	    {
            	    // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:89:1: (lv_sondage_2_0= ruleQuestionnaire )
            	    // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:90:3: lv_sondage_2_0= ruleQuestionnaire
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSondageAccess().getSondageQuestionnaireParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuestionnaire_in_ruleSondage155);
            	    lv_sondage_2_0=ruleQuestionnaire();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSondageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sondage",
            	            		lv_sondage_2_0, 
            	            		"Questionnaire");
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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSondage168); 

                	newLeafNode(otherlv_3, grammarAccess.getSondageAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleSondage"


    // $ANTLR start "entryRuleQuestionnaire"
    // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:118:1: entryRuleQuestionnaire returns [EObject current=null] : iv_ruleQuestionnaire= ruleQuestionnaire EOF ;
    public final EObject entryRuleQuestionnaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionnaire = null;


        try {
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:119:2: (iv_ruleQuestionnaire= ruleQuestionnaire EOF )
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:120:2: iv_ruleQuestionnaire= ruleQuestionnaire EOF
            {
             newCompositeNode(grammarAccess.getQuestionnaireRule()); 
            pushFollow(FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire204);
            iv_ruleQuestionnaire=ruleQuestionnaire();

            state._fsp--;

             current =iv_ruleQuestionnaire; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestionnaire214); 

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
    // $ANTLR end "entryRuleQuestionnaire"


    // $ANTLR start "ruleQuestionnaire"
    // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:127:1: ruleQuestionnaire returns [EObject current=null] : (otherlv_0= 'Questionnaire ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_questionnaire_3_0= ruleQuestion ) )* otherlv_4= '}' ) ;
    public final EObject ruleQuestionnaire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_questionnaire_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:130:28: ( (otherlv_0= 'Questionnaire ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_questionnaire_3_0= ruleQuestion ) )* otherlv_4= '}' ) )
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:131:1: (otherlv_0= 'Questionnaire ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_questionnaire_3_0= ruleQuestion ) )* otherlv_4= '}' )
            {
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:131:1: (otherlv_0= 'Questionnaire ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_questionnaire_3_0= ruleQuestion ) )* otherlv_4= '}' )
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:131:3: otherlv_0= 'Questionnaire ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_questionnaire_3_0= ruleQuestion ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleQuestionnaire251); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0());
                
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:135:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:136:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:136:1: (lv_name_1_0= RULE_ID )
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:137:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuestionnaire268); 

            			newLeafNode(lv_name_1_0, grammarAccess.getQuestionnaireAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestionnaireRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleQuestionnaire285); 

                	newLeafNode(otherlv_2, grammarAccess.getQuestionnaireAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:157:1: ( (lv_questionnaire_3_0= ruleQuestion ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:158:1: (lv_questionnaire_3_0= ruleQuestion )
            	    {
            	    // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:158:1: (lv_questionnaire_3_0= ruleQuestion )
            	    // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:159:3: lv_questionnaire_3_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionnaireAccess().getQuestionnaireQuestionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuestion_in_ruleQuestionnaire306);
            	    lv_questionnaire_3_0=ruleQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionnaireRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questionnaire",
            	            		lv_questionnaire_3_0, 
            	            		"Question");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleQuestionnaire319); 

                	newLeafNode(otherlv_4, grammarAccess.getQuestionnaireAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleQuestionnaire"


    // $ANTLR start "entryRuleQuestion"
    // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:187:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:188:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:189:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion355);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion365); 

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
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:196:1: ruleQuestion returns [EObject current=null] : (otherlv_0= 'Question ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_text_3_0= RULE_STRING ) ) ( (lv_question_4_0= ruleOption ) ) otherlv_5= '}' ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_text_3_0=null;
        Token otherlv_5=null;
        EObject lv_question_4_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:199:28: ( (otherlv_0= 'Question ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_text_3_0= RULE_STRING ) ) ( (lv_question_4_0= ruleOption ) ) otherlv_5= '}' ) )
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:200:1: (otherlv_0= 'Question ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_text_3_0= RULE_STRING ) ) ( (lv_question_4_0= ruleOption ) ) otherlv_5= '}' )
            {
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:200:1: (otherlv_0= 'Question ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_text_3_0= RULE_STRING ) ) ( (lv_question_4_0= ruleOption ) ) otherlv_5= '}' )
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:200:3: otherlv_0= 'Question ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_text_3_0= RULE_STRING ) ) ( (lv_question_4_0= ruleOption ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleQuestion402); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQuestionKeyword_0());
                
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:204:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:205:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:205:1: (lv_name_1_0= RULE_ID )
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:206:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuestion419); 

            			newLeafNode(lv_name_1_0, grammarAccess.getQuestionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleQuestion436); 

                	newLeafNode(otherlv_2, grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:226:1: ( (lv_text_3_0= RULE_STRING ) )
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:227:1: (lv_text_3_0= RULE_STRING )
            {
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:227:1: (lv_text_3_0= RULE_STRING )
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:228:3: lv_text_3_0= RULE_STRING
            {
            lv_text_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuestion453); 

            			newLeafNode(lv_text_3_0, grammarAccess.getQuestionAccess().getTextSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:244:2: ( (lv_question_4_0= ruleOption ) )
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:245:1: (lv_question_4_0= ruleOption )
            {
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:245:1: (lv_question_4_0= ruleOption )
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:246:3: lv_question_4_0= ruleOption
            {
             
            	        newCompositeNode(grammarAccess.getQuestionAccess().getQuestionOptionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleOption_in_ruleQuestion479);
            lv_question_4_0=ruleOption();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	        }
                   		add(
                   			current, 
                   			"question",
                    		lv_question_4_0, 
                    		"Option");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleQuestion491); 

                	newLeafNode(otherlv_5, grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleOption"
    // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:274:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:275:2: (iv_ruleOption= ruleOption EOF )
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:276:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_ruleOption_in_entryRuleOption527);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOption537); 

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
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:283:1: ruleOption returns [EObject current=null] : (otherlv_0= 'Options' (this_ID_1= RULE_ID otherlv_2= ':' ( (lv_text_3_0= RULE_STRING ) ) )+ ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ID_1=null;
        Token otherlv_2=null;
        Token lv_text_3_0=null;

         enterRule(); 
            
        try {
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:286:28: ( (otherlv_0= 'Options' (this_ID_1= RULE_ID otherlv_2= ':' ( (lv_text_3_0= RULE_STRING ) ) )+ ) )
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:287:1: (otherlv_0= 'Options' (this_ID_1= RULE_ID otherlv_2= ':' ( (lv_text_3_0= RULE_STRING ) ) )+ )
            {
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:287:1: (otherlv_0= 'Options' (this_ID_1= RULE_ID otherlv_2= ':' ( (lv_text_3_0= RULE_STRING ) ) )+ )
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:287:3: otherlv_0= 'Options' (this_ID_1= RULE_ID otherlv_2= ':' ( (lv_text_3_0= RULE_STRING ) ) )+
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleOption574); 

                	newLeafNode(otherlv_0, grammarAccess.getOptionAccess().getOptionsKeyword_0());
                
            // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:291:1: (this_ID_1= RULE_ID otherlv_2= ':' ( (lv_text_3_0= RULE_STRING ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:291:2: this_ID_1= RULE_ID otherlv_2= ':' ( (lv_text_3_0= RULE_STRING ) )
            	    {
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOption586); 
            	     
            	        newLeafNode(this_ID_1, grammarAccess.getOptionAccess().getIDTerminalRuleCall_1_0()); 
            	        
            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleOption597); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOptionAccess().getColonKeyword_1_1());
            	        
            	    // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:299:1: ( (lv_text_3_0= RULE_STRING ) )
            	    // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:300:1: (lv_text_3_0= RULE_STRING )
            	    {
            	    // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:300:1: (lv_text_3_0= RULE_STRING )
            	    // ../fr.istic.idm.Questionnaire/src-gen/fr/istic/idm/parser/antlr/internal/InternalQuestionnaireDsl.g:301:3: lv_text_3_0= RULE_STRING
            	    {
            	    lv_text_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOption614); 

            	    			newLeafNode(lv_text_3_0, grammarAccess.getOptionAccess().getTextSTRINGTerminalRuleCall_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOptionRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"text",
            	            		lv_text_3_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // $ANTLR end "ruleOption"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSondage_in_entryRuleSondage75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSondage85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSondage122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSondage134 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleQuestionnaire_in_ruleSondage155 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleSondage168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestionnaire214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleQuestionnaire251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuestionnaire268 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleQuestionnaire285 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_ruleQuestion_in_ruleQuestionnaire306 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_ruleQuestionnaire319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleQuestion402 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuestion419 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleQuestion436 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuestion453 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleOption_in_ruleQuestion479 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleQuestion491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_entryRuleOption527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOption537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOption574 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOption586 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleOption597 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOption614 = new BitSet(new long[]{0x0000000000000012L});

}