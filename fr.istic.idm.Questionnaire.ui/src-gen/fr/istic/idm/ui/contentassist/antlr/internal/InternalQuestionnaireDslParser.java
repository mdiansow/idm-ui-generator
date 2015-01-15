package fr.istic.idm.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import fr.istic.idm.services.QuestionnaireDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQuestionnaireDslParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g"; }


     
     	private QuestionnaireDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(QuestionnaireDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleSondage"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:60:1: entryRuleSondage : ruleSondage EOF ;
    public final void entryRuleSondage() throws RecognitionException {
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:61:1: ( ruleSondage EOF )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:62:1: ruleSondage EOF
            {
             before(grammarAccess.getSondageRule()); 
            pushFollow(FOLLOW_ruleSondage_in_entryRuleSondage61);
            ruleSondage();

            state._fsp--;

             after(grammarAccess.getSondageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSondage68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSondage"


    // $ANTLR start "ruleSondage"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:69:1: ruleSondage : ( ( rule__Sondage__Group__0 ) ) ;
    public final void ruleSondage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:73:2: ( ( ( rule__Sondage__Group__0 ) ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:74:1: ( ( rule__Sondage__Group__0 ) )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:74:1: ( ( rule__Sondage__Group__0 ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:75:1: ( rule__Sondage__Group__0 )
            {
             before(grammarAccess.getSondageAccess().getGroup()); 
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:76:1: ( rule__Sondage__Group__0 )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:76:2: rule__Sondage__Group__0
            {
            pushFollow(FOLLOW_rule__Sondage__Group__0_in_ruleSondage94);
            rule__Sondage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSondageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSondage"


    // $ANTLR start "entryRuleQuestionnaire"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:88:1: entryRuleQuestionnaire : ruleQuestionnaire EOF ;
    public final void entryRuleQuestionnaire() throws RecognitionException {
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:89:1: ( ruleQuestionnaire EOF )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:90:1: ruleQuestionnaire EOF
            {
             before(grammarAccess.getQuestionnaireRule()); 
            pushFollow(FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire121);
            ruleQuestionnaire();

            state._fsp--;

             after(grammarAccess.getQuestionnaireRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestionnaire128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestionnaire"


    // $ANTLR start "ruleQuestionnaire"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:97:1: ruleQuestionnaire : ( ( rule__Questionnaire__Group__0 ) ) ;
    public final void ruleQuestionnaire() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:101:2: ( ( ( rule__Questionnaire__Group__0 ) ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:102:1: ( ( rule__Questionnaire__Group__0 ) )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:102:1: ( ( rule__Questionnaire__Group__0 ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:103:1: ( rule__Questionnaire__Group__0 )
            {
             before(grammarAccess.getQuestionnaireAccess().getGroup()); 
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:104:1: ( rule__Questionnaire__Group__0 )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:104:2: rule__Questionnaire__Group__0
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__0_in_ruleQuestionnaire154);
            rule__Questionnaire__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestionnaire"


    // $ANTLR start "entryRuleQuestion"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:116:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:117:1: ( ruleQuestion EOF )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:118:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion181);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:125:1: ruleQuestion : ( ( rule__Question__Group__0 ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:129:2: ( ( ( rule__Question__Group__0 ) ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:130:1: ( ( rule__Question__Group__0 ) )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:130:1: ( ( rule__Question__Group__0 ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:131:1: ( rule__Question__Group__0 )
            {
             before(grammarAccess.getQuestionAccess().getGroup()); 
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:132:1: ( rule__Question__Group__0 )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:132:2: rule__Question__Group__0
            {
            pushFollow(FOLLOW_rule__Question__Group__0_in_ruleQuestion214);
            rule__Question__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleOption"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:144:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:145:1: ( ruleOption EOF )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:146:1: ruleOption EOF
            {
             before(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_ruleOption_in_entryRuleOption241);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getOptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOption248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:153:1: ruleOption : ( ( rule__Option__Group__0 ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:157:2: ( ( ( rule__Option__Group__0 ) ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:158:1: ( ( rule__Option__Group__0 ) )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:158:1: ( ( rule__Option__Group__0 ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:159:1: ( rule__Option__Group__0 )
            {
             before(grammarAccess.getOptionAccess().getGroup()); 
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:160:1: ( rule__Option__Group__0 )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:160:2: rule__Option__Group__0
            {
            pushFollow(FOLLOW_rule__Option__Group__0_in_ruleOption274);
            rule__Option__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOption"


    // $ANTLR start "rule__Sondage__Group__0"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:174:1: rule__Sondage__Group__0 : rule__Sondage__Group__0__Impl rule__Sondage__Group__1 ;
    public final void rule__Sondage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:178:1: ( rule__Sondage__Group__0__Impl rule__Sondage__Group__1 )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:179:2: rule__Sondage__Group__0__Impl rule__Sondage__Group__1
            {
            pushFollow(FOLLOW_rule__Sondage__Group__0__Impl_in_rule__Sondage__Group__0308);
            rule__Sondage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sondage__Group__1_in_rule__Sondage__Group__0311);
            rule__Sondage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sondage__Group__0"


    // $ANTLR start "rule__Sondage__Group__0__Impl"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:186:1: rule__Sondage__Group__0__Impl : ( 'Sondage ' ) ;
    public final void rule__Sondage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:190:1: ( ( 'Sondage ' ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:191:1: ( 'Sondage ' )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:191:1: ( 'Sondage ' )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:192:1: 'Sondage '
            {
             before(grammarAccess.getSondageAccess().getSondageKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Sondage__Group__0__Impl339); 
             after(grammarAccess.getSondageAccess().getSondageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sondage__Group__0__Impl"


    // $ANTLR start "rule__Sondage__Group__1"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:205:1: rule__Sondage__Group__1 : rule__Sondage__Group__1__Impl rule__Sondage__Group__2 ;
    public final void rule__Sondage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:209:1: ( rule__Sondage__Group__1__Impl rule__Sondage__Group__2 )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:210:2: rule__Sondage__Group__1__Impl rule__Sondage__Group__2
            {
            pushFollow(FOLLOW_rule__Sondage__Group__1__Impl_in_rule__Sondage__Group__1370);
            rule__Sondage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sondage__Group__2_in_rule__Sondage__Group__1373);
            rule__Sondage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sondage__Group__1"


    // $ANTLR start "rule__Sondage__Group__1__Impl"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:217:1: rule__Sondage__Group__1__Impl : ( '{' ) ;
    public final void rule__Sondage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:221:1: ( ( '{' ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:222:1: ( '{' )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:222:1: ( '{' )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:223:1: '{'
            {
             before(grammarAccess.getSondageAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__Sondage__Group__1__Impl401); 
             after(grammarAccess.getSondageAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sondage__Group__1__Impl"


    // $ANTLR start "rule__Sondage__Group__2"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:236:1: rule__Sondage__Group__2 : rule__Sondage__Group__2__Impl rule__Sondage__Group__3 ;
    public final void rule__Sondage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:240:1: ( rule__Sondage__Group__2__Impl rule__Sondage__Group__3 )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:241:2: rule__Sondage__Group__2__Impl rule__Sondage__Group__3
            {
            pushFollow(FOLLOW_rule__Sondage__Group__2__Impl_in_rule__Sondage__Group__2432);
            rule__Sondage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sondage__Group__3_in_rule__Sondage__Group__2435);
            rule__Sondage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sondage__Group__2"


    // $ANTLR start "rule__Sondage__Group__2__Impl"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:248:1: rule__Sondage__Group__2__Impl : ( ( ( rule__Sondage__SondageAssignment_2 ) ) ( ( rule__Sondage__SondageAssignment_2 )* ) ) ;
    public final void rule__Sondage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:252:1: ( ( ( ( rule__Sondage__SondageAssignment_2 ) ) ( ( rule__Sondage__SondageAssignment_2 )* ) ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:253:1: ( ( ( rule__Sondage__SondageAssignment_2 ) ) ( ( rule__Sondage__SondageAssignment_2 )* ) )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:253:1: ( ( ( rule__Sondage__SondageAssignment_2 ) ) ( ( rule__Sondage__SondageAssignment_2 )* ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:254:1: ( ( rule__Sondage__SondageAssignment_2 ) ) ( ( rule__Sondage__SondageAssignment_2 )* )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:254:1: ( ( rule__Sondage__SondageAssignment_2 ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:255:1: ( rule__Sondage__SondageAssignment_2 )
            {
             before(grammarAccess.getSondageAccess().getSondageAssignment_2()); 
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:256:1: ( rule__Sondage__SondageAssignment_2 )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:256:2: rule__Sondage__SondageAssignment_2
            {
            pushFollow(FOLLOW_rule__Sondage__SondageAssignment_2_in_rule__Sondage__Group__2__Impl464);
            rule__Sondage__SondageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSondageAccess().getSondageAssignment_2()); 

            }

            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:259:1: ( ( rule__Sondage__SondageAssignment_2 )* )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:260:1: ( rule__Sondage__SondageAssignment_2 )*
            {
             before(grammarAccess.getSondageAccess().getSondageAssignment_2()); 
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:261:1: ( rule__Sondage__SondageAssignment_2 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:261:2: rule__Sondage__SondageAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Sondage__SondageAssignment_2_in_rule__Sondage__Group__2__Impl476);
            	    rule__Sondage__SondageAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSondageAccess().getSondageAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sondage__Group__2__Impl"


    // $ANTLR start "rule__Sondage__Group__3"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:272:1: rule__Sondage__Group__3 : rule__Sondage__Group__3__Impl ;
    public final void rule__Sondage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:276:1: ( rule__Sondage__Group__3__Impl )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:277:2: rule__Sondage__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Sondage__Group__3__Impl_in_rule__Sondage__Group__3509);
            rule__Sondage__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sondage__Group__3"


    // $ANTLR start "rule__Sondage__Group__3__Impl"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:283:1: rule__Sondage__Group__3__Impl : ( '}' ) ;
    public final void rule__Sondage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:287:1: ( ( '}' ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:288:1: ( '}' )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:288:1: ( '}' )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:289:1: '}'
            {
             before(grammarAccess.getSondageAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Sondage__Group__3__Impl537); 
             after(grammarAccess.getSondageAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sondage__Group__3__Impl"


    // $ANTLR start "rule__Questionnaire__Group__0"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:310:1: rule__Questionnaire__Group__0 : rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1 ;
    public final void rule__Questionnaire__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:314:1: ( rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1 )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:315:2: rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__0__Impl_in_rule__Questionnaire__Group__0576);
            rule__Questionnaire__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__1_in_rule__Questionnaire__Group__0579);
            rule__Questionnaire__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__0"


    // $ANTLR start "rule__Questionnaire__Group__0__Impl"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:322:1: rule__Questionnaire__Group__0__Impl : ( 'Questionnaire ' ) ;
    public final void rule__Questionnaire__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:326:1: ( ( 'Questionnaire ' ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:327:1: ( 'Questionnaire ' )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:327:1: ( 'Questionnaire ' )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:328:1: 'Questionnaire '
            {
             before(grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Questionnaire__Group__0__Impl607); 
             after(grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__0__Impl"


    // $ANTLR start "rule__Questionnaire__Group__1"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:341:1: rule__Questionnaire__Group__1 : rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2 ;
    public final void rule__Questionnaire__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:345:1: ( rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2 )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:346:2: rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__1__Impl_in_rule__Questionnaire__Group__1638);
            rule__Questionnaire__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__2_in_rule__Questionnaire__Group__1641);
            rule__Questionnaire__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__1"


    // $ANTLR start "rule__Questionnaire__Group__1__Impl"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:353:1: rule__Questionnaire__Group__1__Impl : ( ( rule__Questionnaire__NameAssignment_1 ) ) ;
    public final void rule__Questionnaire__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:357:1: ( ( ( rule__Questionnaire__NameAssignment_1 ) ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:358:1: ( ( rule__Questionnaire__NameAssignment_1 ) )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:358:1: ( ( rule__Questionnaire__NameAssignment_1 ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:359:1: ( rule__Questionnaire__NameAssignment_1 )
            {
             before(grammarAccess.getQuestionnaireAccess().getNameAssignment_1()); 
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:360:1: ( rule__Questionnaire__NameAssignment_1 )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:360:2: rule__Questionnaire__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Questionnaire__NameAssignment_1_in_rule__Questionnaire__Group__1__Impl668);
            rule__Questionnaire__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__1__Impl"


    // $ANTLR start "rule__Questionnaire__Group__2"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:370:1: rule__Questionnaire__Group__2 : rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3 ;
    public final void rule__Questionnaire__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:374:1: ( rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3 )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:375:2: rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__2__Impl_in_rule__Questionnaire__Group__2698);
            rule__Questionnaire__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__3_in_rule__Questionnaire__Group__2701);
            rule__Questionnaire__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__2"


    // $ANTLR start "rule__Questionnaire__Group__2__Impl"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:382:1: rule__Questionnaire__Group__2__Impl : ( '{' ) ;
    public final void rule__Questionnaire__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:386:1: ( ( '{' ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:387:1: ( '{' )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:387:1: ( '{' )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:388:1: '{'
            {
             before(grammarAccess.getQuestionnaireAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Questionnaire__Group__2__Impl729); 
             after(grammarAccess.getQuestionnaireAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__2__Impl"


    // $ANTLR start "rule__Questionnaire__Group__3"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:401:1: rule__Questionnaire__Group__3 : rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4 ;
    public final void rule__Questionnaire__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:405:1: ( rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4 )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:406:2: rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__3__Impl_in_rule__Questionnaire__Group__3760);
            rule__Questionnaire__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__4_in_rule__Questionnaire__Group__3763);
            rule__Questionnaire__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__3"


    // $ANTLR start "rule__Questionnaire__Group__3__Impl"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:413:1: rule__Questionnaire__Group__3__Impl : ( ( rule__Questionnaire__QuestionnaireAssignment_3 )* ) ;
    public final void rule__Questionnaire__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:417:1: ( ( ( rule__Questionnaire__QuestionnaireAssignment_3 )* ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:418:1: ( ( rule__Questionnaire__QuestionnaireAssignment_3 )* )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:418:1: ( ( rule__Questionnaire__QuestionnaireAssignment_3 )* )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:419:1: ( rule__Questionnaire__QuestionnaireAssignment_3 )*
            {
             before(grammarAccess.getQuestionnaireAccess().getQuestionnaireAssignment_3()); 
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:420:1: ( rule__Questionnaire__QuestionnaireAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:420:2: rule__Questionnaire__QuestionnaireAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Questionnaire__QuestionnaireAssignment_3_in_rule__Questionnaire__Group__3__Impl790);
            	    rule__Questionnaire__QuestionnaireAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getQuestionnaireAccess().getQuestionnaireAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__3__Impl"


    // $ANTLR start "rule__Questionnaire__Group__4"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:430:1: rule__Questionnaire__Group__4 : rule__Questionnaire__Group__4__Impl ;
    public final void rule__Questionnaire__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:434:1: ( rule__Questionnaire__Group__4__Impl )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:435:2: rule__Questionnaire__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__4__Impl_in_rule__Questionnaire__Group__4821);
            rule__Questionnaire__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__4"


    // $ANTLR start "rule__Questionnaire__Group__4__Impl"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:441:1: rule__Questionnaire__Group__4__Impl : ( '}' ) ;
    public final void rule__Questionnaire__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:445:1: ( ( '}' ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:446:1: ( '}' )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:446:1: ( '}' )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:447:1: '}'
            {
             before(grammarAccess.getQuestionnaireAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Questionnaire__Group__4__Impl849); 
             after(grammarAccess.getQuestionnaireAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__4__Impl"


    // $ANTLR start "rule__Question__Group__0"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:470:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:474:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:475:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__0890);
            rule__Question__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__1_in_rule__Question__Group__0893);
            rule__Question__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__0"


    // $ANTLR start "rule__Question__Group__0__Impl"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:482:1: rule__Question__Group__0__Impl : ( 'Question ' ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:486:1: ( ( 'Question ' ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:487:1: ( 'Question ' )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:487:1: ( 'Question ' )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:488:1: 'Question '
            {
             before(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Question__Group__0__Impl921); 
             after(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__0__Impl"


    // $ANTLR start "rule__Question__Group__1"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:501:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:505:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:506:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__1952);
            rule__Question__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__2_in_rule__Question__Group__1955);
            rule__Question__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__1"


    // $ANTLR start "rule__Question__Group__1__Impl"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:513:1: rule__Question__Group__1__Impl : ( ( rule__Question__NameAssignment_1 ) ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:517:1: ( ( ( rule__Question__NameAssignment_1 ) ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:518:1: ( ( rule__Question__NameAssignment_1 ) )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:518:1: ( ( rule__Question__NameAssignment_1 ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:519:1: ( rule__Question__NameAssignment_1 )
            {
             before(grammarAccess.getQuestionAccess().getNameAssignment_1()); 
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:520:1: ( rule__Question__NameAssignment_1 )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:520:2: rule__Question__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Question__NameAssignment_1_in_rule__Question__Group__1__Impl982);
            rule__Question__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__1__Impl"


    // $ANTLR start "rule__Question__Group__2"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:530:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:534:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:535:2: rule__Question__Group__2__Impl rule__Question__Group__3
            {
            pushFollow(FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__21012);
            rule__Question__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__3_in_rule__Question__Group__21015);
            rule__Question__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__2"


    // $ANTLR start "rule__Question__Group__2__Impl"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:542:1: rule__Question__Group__2__Impl : ( '{' ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:546:1: ( ( '{' ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:547:1: ( '{' )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:547:1: ( '{' )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:548:1: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Question__Group__2__Impl1043); 
             after(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__2__Impl"


    // $ANTLR start "rule__Question__Group__3"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:561:1: rule__Question__Group__3 : rule__Question__Group__3__Impl rule__Question__Group__4 ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:565:1: ( rule__Question__Group__3__Impl rule__Question__Group__4 )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:566:2: rule__Question__Group__3__Impl rule__Question__Group__4
            {
            pushFollow(FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__31074);
            rule__Question__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__4_in_rule__Question__Group__31077);
            rule__Question__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__3"


    // $ANTLR start "rule__Question__Group__3__Impl"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:573:1: rule__Question__Group__3__Impl : ( ( rule__Question__TextAssignment_3 ) ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:577:1: ( ( ( rule__Question__TextAssignment_3 ) ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:578:1: ( ( rule__Question__TextAssignment_3 ) )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:578:1: ( ( rule__Question__TextAssignment_3 ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:579:1: ( rule__Question__TextAssignment_3 )
            {
             before(grammarAccess.getQuestionAccess().getTextAssignment_3()); 
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:580:1: ( rule__Question__TextAssignment_3 )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:580:2: rule__Question__TextAssignment_3
            {
            pushFollow(FOLLOW_rule__Question__TextAssignment_3_in_rule__Question__Group__3__Impl1104);
            rule__Question__TextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getTextAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__3__Impl"


    // $ANTLR start "rule__Question__Group__4"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:590:1: rule__Question__Group__4 : rule__Question__Group__4__Impl rule__Question__Group__5 ;
    public final void rule__Question__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:594:1: ( rule__Question__Group__4__Impl rule__Question__Group__5 )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:595:2: rule__Question__Group__4__Impl rule__Question__Group__5
            {
            pushFollow(FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__41134);
            rule__Question__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__5_in_rule__Question__Group__41137);
            rule__Question__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__4"


    // $ANTLR start "rule__Question__Group__4__Impl"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:602:1: rule__Question__Group__4__Impl : ( ( rule__Question__QuestionAssignment_4 ) ) ;
    public final void rule__Question__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:606:1: ( ( ( rule__Question__QuestionAssignment_4 ) ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:607:1: ( ( rule__Question__QuestionAssignment_4 ) )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:607:1: ( ( rule__Question__QuestionAssignment_4 ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:608:1: ( rule__Question__QuestionAssignment_4 )
            {
             before(grammarAccess.getQuestionAccess().getQuestionAssignment_4()); 
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:609:1: ( rule__Question__QuestionAssignment_4 )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:609:2: rule__Question__QuestionAssignment_4
            {
            pushFollow(FOLLOW_rule__Question__QuestionAssignment_4_in_rule__Question__Group__4__Impl1164);
            rule__Question__QuestionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getQuestionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__4__Impl"


    // $ANTLR start "rule__Question__Group__5"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:619:1: rule__Question__Group__5 : rule__Question__Group__5__Impl ;
    public final void rule__Question__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:623:1: ( rule__Question__Group__5__Impl )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:624:2: rule__Question__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group__5__Impl_in_rule__Question__Group__51194);
            rule__Question__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__5"


    // $ANTLR start "rule__Question__Group__5__Impl"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:630:1: rule__Question__Group__5__Impl : ( '}' ) ;
    public final void rule__Question__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:634:1: ( ( '}' ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:635:1: ( '}' )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:635:1: ( '}' )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:636:1: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_13_in_rule__Question__Group__5__Impl1222); 
             after(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__5__Impl"


    // $ANTLR start "rule__Option__Group__0"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:661:1: rule__Option__Group__0 : rule__Option__Group__0__Impl rule__Option__Group__1 ;
    public final void rule__Option__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:665:1: ( rule__Option__Group__0__Impl rule__Option__Group__1 )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:666:2: rule__Option__Group__0__Impl rule__Option__Group__1
            {
            pushFollow(FOLLOW_rule__Option__Group__0__Impl_in_rule__Option__Group__01265);
            rule__Option__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Option__Group__1_in_rule__Option__Group__01268);
            rule__Option__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__0"


    // $ANTLR start "rule__Option__Group__0__Impl"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:673:1: rule__Option__Group__0__Impl : ( 'Options' ) ;
    public final void rule__Option__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:677:1: ( ( 'Options' ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:678:1: ( 'Options' )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:678:1: ( 'Options' )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:679:1: 'Options'
            {
             before(grammarAccess.getOptionAccess().getOptionsKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Option__Group__0__Impl1296); 
             after(grammarAccess.getOptionAccess().getOptionsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__0__Impl"


    // $ANTLR start "rule__Option__Group__1"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:692:1: rule__Option__Group__1 : rule__Option__Group__1__Impl ;
    public final void rule__Option__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:696:1: ( rule__Option__Group__1__Impl )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:697:2: rule__Option__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Option__Group__1__Impl_in_rule__Option__Group__11327);
            rule__Option__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__1"


    // $ANTLR start "rule__Option__Group__1__Impl"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:703:1: rule__Option__Group__1__Impl : ( ( ( rule__Option__Group_1__0 ) ) ( ( rule__Option__Group_1__0 )* ) ) ;
    public final void rule__Option__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:707:1: ( ( ( ( rule__Option__Group_1__0 ) ) ( ( rule__Option__Group_1__0 )* ) ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:708:1: ( ( ( rule__Option__Group_1__0 ) ) ( ( rule__Option__Group_1__0 )* ) )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:708:1: ( ( ( rule__Option__Group_1__0 ) ) ( ( rule__Option__Group_1__0 )* ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:709:1: ( ( rule__Option__Group_1__0 ) ) ( ( rule__Option__Group_1__0 )* )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:709:1: ( ( rule__Option__Group_1__0 ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:710:1: ( rule__Option__Group_1__0 )
            {
             before(grammarAccess.getOptionAccess().getGroup_1()); 
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:711:1: ( rule__Option__Group_1__0 )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:711:2: rule__Option__Group_1__0
            {
            pushFollow(FOLLOW_rule__Option__Group_1__0_in_rule__Option__Group__1__Impl1356);
            rule__Option__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getGroup_1()); 

            }

            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:714:1: ( ( rule__Option__Group_1__0 )* )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:715:1: ( rule__Option__Group_1__0 )*
            {
             before(grammarAccess.getOptionAccess().getGroup_1()); 
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:716:1: ( rule__Option__Group_1__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:716:2: rule__Option__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Option__Group_1__0_in_rule__Option__Group__1__Impl1368);
            	    rule__Option__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getOptionAccess().getGroup_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__1__Impl"


    // $ANTLR start "rule__Option__Group_1__0"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:731:1: rule__Option__Group_1__0 : rule__Option__Group_1__0__Impl rule__Option__Group_1__1 ;
    public final void rule__Option__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:735:1: ( rule__Option__Group_1__0__Impl rule__Option__Group_1__1 )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:736:2: rule__Option__Group_1__0__Impl rule__Option__Group_1__1
            {
            pushFollow(FOLLOW_rule__Option__Group_1__0__Impl_in_rule__Option__Group_1__01405);
            rule__Option__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Option__Group_1__1_in_rule__Option__Group_1__01408);
            rule__Option__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_1__0"


    // $ANTLR start "rule__Option__Group_1__0__Impl"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:743:1: rule__Option__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__Option__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:747:1: ( ( RULE_ID ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:748:1: ( RULE_ID )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:748:1: ( RULE_ID )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:749:1: RULE_ID
            {
             before(grammarAccess.getOptionAccess().getIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Option__Group_1__0__Impl1435); 
             after(grammarAccess.getOptionAccess().getIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_1__0__Impl"


    // $ANTLR start "rule__Option__Group_1__1"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:760:1: rule__Option__Group_1__1 : rule__Option__Group_1__1__Impl rule__Option__Group_1__2 ;
    public final void rule__Option__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:764:1: ( rule__Option__Group_1__1__Impl rule__Option__Group_1__2 )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:765:2: rule__Option__Group_1__1__Impl rule__Option__Group_1__2
            {
            pushFollow(FOLLOW_rule__Option__Group_1__1__Impl_in_rule__Option__Group_1__11464);
            rule__Option__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Option__Group_1__2_in_rule__Option__Group_1__11467);
            rule__Option__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_1__1"


    // $ANTLR start "rule__Option__Group_1__1__Impl"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:772:1: rule__Option__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Option__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:776:1: ( ( ':' ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:777:1: ( ':' )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:777:1: ( ':' )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:778:1: ':'
            {
             before(grammarAccess.getOptionAccess().getColonKeyword_1_1()); 
            match(input,17,FOLLOW_17_in_rule__Option__Group_1__1__Impl1495); 
             after(grammarAccess.getOptionAccess().getColonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_1__1__Impl"


    // $ANTLR start "rule__Option__Group_1__2"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:791:1: rule__Option__Group_1__2 : rule__Option__Group_1__2__Impl ;
    public final void rule__Option__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:795:1: ( rule__Option__Group_1__2__Impl )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:796:2: rule__Option__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Option__Group_1__2__Impl_in_rule__Option__Group_1__21526);
            rule__Option__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_1__2"


    // $ANTLR start "rule__Option__Group_1__2__Impl"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:802:1: rule__Option__Group_1__2__Impl : ( ( rule__Option__TextAssignment_1_2 ) ) ;
    public final void rule__Option__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:806:1: ( ( ( rule__Option__TextAssignment_1_2 ) ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:807:1: ( ( rule__Option__TextAssignment_1_2 ) )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:807:1: ( ( rule__Option__TextAssignment_1_2 ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:808:1: ( rule__Option__TextAssignment_1_2 )
            {
             before(grammarAccess.getOptionAccess().getTextAssignment_1_2()); 
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:809:1: ( rule__Option__TextAssignment_1_2 )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:809:2: rule__Option__TextAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Option__TextAssignment_1_2_in_rule__Option__Group_1__2__Impl1553);
            rule__Option__TextAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getTextAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_1__2__Impl"


    // $ANTLR start "rule__Sondage__SondageAssignment_2"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:826:1: rule__Sondage__SondageAssignment_2 : ( ruleQuestionnaire ) ;
    public final void rule__Sondage__SondageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:830:1: ( ( ruleQuestionnaire ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:831:1: ( ruleQuestionnaire )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:831:1: ( ruleQuestionnaire )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:832:1: ruleQuestionnaire
            {
             before(grammarAccess.getSondageAccess().getSondageQuestionnaireParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQuestionnaire_in_rule__Sondage__SondageAssignment_21594);
            ruleQuestionnaire();

            state._fsp--;

             after(grammarAccess.getSondageAccess().getSondageQuestionnaireParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sondage__SondageAssignment_2"


    // $ANTLR start "rule__Questionnaire__NameAssignment_1"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:841:1: rule__Questionnaire__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Questionnaire__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:845:1: ( ( RULE_ID ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:846:1: ( RULE_ID )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:846:1: ( RULE_ID )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:847:1: RULE_ID
            {
             before(grammarAccess.getQuestionnaireAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Questionnaire__NameAssignment_11625); 
             after(grammarAccess.getQuestionnaireAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__NameAssignment_1"


    // $ANTLR start "rule__Questionnaire__QuestionnaireAssignment_3"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:856:1: rule__Questionnaire__QuestionnaireAssignment_3 : ( ruleQuestion ) ;
    public final void rule__Questionnaire__QuestionnaireAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:860:1: ( ( ruleQuestion ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:861:1: ( ruleQuestion )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:861:1: ( ruleQuestion )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:862:1: ruleQuestion
            {
             before(grammarAccess.getQuestionnaireAccess().getQuestionnaireQuestionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleQuestion_in_rule__Questionnaire__QuestionnaireAssignment_31656);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionnaireAccess().getQuestionnaireQuestionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__QuestionnaireAssignment_3"


    // $ANTLR start "rule__Question__NameAssignment_1"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:871:1: rule__Question__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Question__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:875:1: ( ( RULE_ID ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:876:1: ( RULE_ID )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:876:1: ( RULE_ID )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:877:1: RULE_ID
            {
             before(grammarAccess.getQuestionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Question__NameAssignment_11687); 
             after(grammarAccess.getQuestionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__NameAssignment_1"


    // $ANTLR start "rule__Question__TextAssignment_3"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:886:1: rule__Question__TextAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Question__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:890:1: ( ( RULE_STRING ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:891:1: ( RULE_STRING )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:891:1: ( RULE_STRING )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:892:1: RULE_STRING
            {
             before(grammarAccess.getQuestionAccess().getTextSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Question__TextAssignment_31718); 
             after(grammarAccess.getQuestionAccess().getTextSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__TextAssignment_3"


    // $ANTLR start "rule__Question__QuestionAssignment_4"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:901:1: rule__Question__QuestionAssignment_4 : ( ruleOption ) ;
    public final void rule__Question__QuestionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:905:1: ( ( ruleOption ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:906:1: ( ruleOption )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:906:1: ( ruleOption )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:907:1: ruleOption
            {
             before(grammarAccess.getQuestionAccess().getQuestionOptionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleOption_in_rule__Question__QuestionAssignment_41749);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getQuestionOptionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__QuestionAssignment_4"


    // $ANTLR start "rule__Option__TextAssignment_1_2"
    // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:916:1: rule__Option__TextAssignment_1_2 : ( RULE_STRING ) ;
    public final void rule__Option__TextAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:920:1: ( ( RULE_STRING ) )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:921:1: ( RULE_STRING )
            {
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:921:1: ( RULE_STRING )
            // ../fr.istic.idm.Questionnaire.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalQuestionnaireDsl.g:922:1: RULE_STRING
            {
             before(grammarAccess.getOptionAccess().getTextSTRINGTerminalRuleCall_1_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Option__TextAssignment_1_21780); 
             after(grammarAccess.getOptionAccess().getTextSTRINGTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__TextAssignment_1_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSondage_in_entryRuleSondage61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSondage68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sondage__Group__0_in_ruleSondage94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestionnaire128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__0_in_ruleQuestionnaire154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__0_in_ruleQuestion214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_entryRuleOption241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOption248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group__0_in_ruleOption274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sondage__Group__0__Impl_in_rule__Sondage__Group__0308 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Sondage__Group__1_in_rule__Sondage__Group__0311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Sondage__Group__0__Impl339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sondage__Group__1__Impl_in_rule__Sondage__Group__1370 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Sondage__Group__2_in_rule__Sondage__Group__1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Sondage__Group__1__Impl401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sondage__Group__2__Impl_in_rule__Sondage__Group__2432 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Sondage__Group__3_in_rule__Sondage__Group__2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sondage__SondageAssignment_2_in_rule__Sondage__Group__2__Impl464 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Sondage__SondageAssignment_2_in_rule__Sondage__Group__2__Impl476 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Sondage__Group__3__Impl_in_rule__Sondage__Group__3509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Sondage__Group__3__Impl537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__0__Impl_in_rule__Questionnaire__Group__0576 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__1_in_rule__Questionnaire__Group__0579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Questionnaire__Group__0__Impl607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__1__Impl_in_rule__Questionnaire__Group__1638 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__2_in_rule__Questionnaire__Group__1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__NameAssignment_1_in_rule__Questionnaire__Group__1__Impl668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__2__Impl_in_rule__Questionnaire__Group__2698 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__3_in_rule__Questionnaire__Group__2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Questionnaire__Group__2__Impl729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__3__Impl_in_rule__Questionnaire__Group__3760 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__4_in_rule__Questionnaire__Group__3763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__QuestionnaireAssignment_3_in_rule__Questionnaire__Group__3__Impl790 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__4__Impl_in_rule__Questionnaire__Group__4821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Questionnaire__Group__4__Impl849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__0890 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Question__Group__1_in_rule__Question__Group__0893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Question__Group__0__Impl921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__1952 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Question__Group__2_in_rule__Question__Group__1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__NameAssignment_1_in_rule__Question__Group__1__Impl982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__21012 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Question__Group__3_in_rule__Question__Group__21015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Question__Group__2__Impl1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__31074 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Question__Group__4_in_rule__Question__Group__31077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__TextAssignment_3_in_rule__Question__Group__3__Impl1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__41134 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Question__Group__5_in_rule__Question__Group__41137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__QuestionAssignment_4_in_rule__Question__Group__4__Impl1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__5__Impl_in_rule__Question__Group__51194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Question__Group__5__Impl1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group__0__Impl_in_rule__Option__Group__01265 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Option__Group__1_in_rule__Option__Group__01268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Option__Group__0__Impl1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group__1__Impl_in_rule__Option__Group__11327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group_1__0_in_rule__Option__Group__1__Impl1356 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Option__Group_1__0_in_rule__Option__Group__1__Impl1368 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Option__Group_1__0__Impl_in_rule__Option__Group_1__01405 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Option__Group_1__1_in_rule__Option__Group_1__01408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Option__Group_1__0__Impl1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group_1__1__Impl_in_rule__Option__Group_1__11464 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Option__Group_1__2_in_rule__Option__Group_1__11467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Option__Group_1__1__Impl1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Group_1__2__Impl_in_rule__Option__Group_1__21526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__TextAssignment_1_2_in_rule__Option__Group_1__2__Impl1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestionnaire_in_rule__Sondage__SondageAssignment_21594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Questionnaire__NameAssignment_11625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_rule__Questionnaire__QuestionnaireAssignment_31656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Question__NameAssignment_11687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Question__TextAssignment_31718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__Question__QuestionAssignment_41749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Option__TextAssignment_1_21780 = new BitSet(new long[]{0x0000000000000002L});

}