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
import fr.istic.idm.services.PivotMMDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPivotMMDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PollSystem'", "'{'", "'}'", "'title'", "'models'", "','", "'UiModel'", "'id'", "'laQuestion'", "'widgets'", "'CheckBox'", "'value'", "'RadioButton'", "'TextField'", "'ComboBox'"
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
    public String getGrammarFileName() { return "../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g"; }


     
     	private PivotMMDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(PivotMMDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRulePollSystem"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:60:1: entryRulePollSystem : rulePollSystem EOF ;
    public final void entryRulePollSystem() throws RecognitionException {
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:61:1: ( rulePollSystem EOF )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:62:1: rulePollSystem EOF
            {
             before(grammarAccess.getPollSystemRule()); 
            pushFollow(FOLLOW_rulePollSystem_in_entryRulePollSystem61);
            rulePollSystem();

            state._fsp--;

             after(grammarAccess.getPollSystemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePollSystem68); 

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
    // $ANTLR end "entryRulePollSystem"


    // $ANTLR start "rulePollSystem"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:69:1: rulePollSystem : ( ( rule__PollSystem__Group__0 ) ) ;
    public final void rulePollSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:73:2: ( ( ( rule__PollSystem__Group__0 ) ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:74:1: ( ( rule__PollSystem__Group__0 ) )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:74:1: ( ( rule__PollSystem__Group__0 ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:75:1: ( rule__PollSystem__Group__0 )
            {
             before(grammarAccess.getPollSystemAccess().getGroup()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:76:1: ( rule__PollSystem__Group__0 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:76:2: rule__PollSystem__Group__0
            {
            pushFollow(FOLLOW_rule__PollSystem__Group__0_in_rulePollSystem94);
            rule__PollSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPollSystemAccess().getGroup()); 

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
    // $ANTLR end "rulePollSystem"


    // $ANTLR start "entryRuleWidget"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:88:1: entryRuleWidget : ruleWidget EOF ;
    public final void entryRuleWidget() throws RecognitionException {
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:89:1: ( ruleWidget EOF )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:90:1: ruleWidget EOF
            {
             before(grammarAccess.getWidgetRule()); 
            pushFollow(FOLLOW_ruleWidget_in_entryRuleWidget121);
            ruleWidget();

            state._fsp--;

             after(grammarAccess.getWidgetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWidget128); 

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
    // $ANTLR end "entryRuleWidget"


    // $ANTLR start "ruleWidget"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:97:1: ruleWidget : ( ( rule__Widget__Alternatives ) ) ;
    public final void ruleWidget() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:101:2: ( ( ( rule__Widget__Alternatives ) ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:102:1: ( ( rule__Widget__Alternatives ) )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:102:1: ( ( rule__Widget__Alternatives ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:103:1: ( rule__Widget__Alternatives )
            {
             before(grammarAccess.getWidgetAccess().getAlternatives()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:104:1: ( rule__Widget__Alternatives )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:104:2: rule__Widget__Alternatives
            {
            pushFollow(FOLLOW_rule__Widget__Alternatives_in_ruleWidget154);
            rule__Widget__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWidgetAccess().getAlternatives()); 

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
    // $ANTLR end "ruleWidget"


    // $ANTLR start "entryRuleUiModel"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:116:1: entryRuleUiModel : ruleUiModel EOF ;
    public final void entryRuleUiModel() throws RecognitionException {
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:117:1: ( ruleUiModel EOF )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:118:1: ruleUiModel EOF
            {
             before(grammarAccess.getUiModelRule()); 
            pushFollow(FOLLOW_ruleUiModel_in_entryRuleUiModel181);
            ruleUiModel();

            state._fsp--;

             after(grammarAccess.getUiModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUiModel188); 

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
    // $ANTLR end "entryRuleUiModel"


    // $ANTLR start "ruleUiModel"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:125:1: ruleUiModel : ( ( rule__UiModel__Group__0 ) ) ;
    public final void ruleUiModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:129:2: ( ( ( rule__UiModel__Group__0 ) ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:130:1: ( ( rule__UiModel__Group__0 ) )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:130:1: ( ( rule__UiModel__Group__0 ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:131:1: ( rule__UiModel__Group__0 )
            {
             before(grammarAccess.getUiModelAccess().getGroup()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:132:1: ( rule__UiModel__Group__0 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:132:2: rule__UiModel__Group__0
            {
            pushFollow(FOLLOW_rule__UiModel__Group__0_in_ruleUiModel214);
            rule__UiModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUiModelAccess().getGroup()); 

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
    // $ANTLR end "ruleUiModel"


    // $ANTLR start "entryRuleEString"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:144:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:145:1: ( ruleEString EOF )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:146:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString241);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString248); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:153:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:157:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:158:1: ( ( rule__EString__Alternatives ) )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:158:1: ( ( rule__EString__Alternatives ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:159:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:160:1: ( rule__EString__Alternatives )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:160:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString274);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleCheckBox"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:172:1: entryRuleCheckBox : ruleCheckBox EOF ;
    public final void entryRuleCheckBox() throws RecognitionException {
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:173:1: ( ruleCheckBox EOF )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:174:1: ruleCheckBox EOF
            {
             before(grammarAccess.getCheckBoxRule()); 
            pushFollow(FOLLOW_ruleCheckBox_in_entryRuleCheckBox301);
            ruleCheckBox();

            state._fsp--;

             after(grammarAccess.getCheckBoxRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckBox308); 

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
    // $ANTLR end "entryRuleCheckBox"


    // $ANTLR start "ruleCheckBox"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:181:1: ruleCheckBox : ( ( rule__CheckBox__Group__0 ) ) ;
    public final void ruleCheckBox() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:185:2: ( ( ( rule__CheckBox__Group__0 ) ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:186:1: ( ( rule__CheckBox__Group__0 ) )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:186:1: ( ( rule__CheckBox__Group__0 ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:187:1: ( rule__CheckBox__Group__0 )
            {
             before(grammarAccess.getCheckBoxAccess().getGroup()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:188:1: ( rule__CheckBox__Group__0 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:188:2: rule__CheckBox__Group__0
            {
            pushFollow(FOLLOW_rule__CheckBox__Group__0_in_ruleCheckBox334);
            rule__CheckBox__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckBoxAccess().getGroup()); 

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
    // $ANTLR end "ruleCheckBox"


    // $ANTLR start "entryRuleRadioButton"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:200:1: entryRuleRadioButton : ruleRadioButton EOF ;
    public final void entryRuleRadioButton() throws RecognitionException {
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:201:1: ( ruleRadioButton EOF )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:202:1: ruleRadioButton EOF
            {
             before(grammarAccess.getRadioButtonRule()); 
            pushFollow(FOLLOW_ruleRadioButton_in_entryRuleRadioButton361);
            ruleRadioButton();

            state._fsp--;

             after(grammarAccess.getRadioButtonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRadioButton368); 

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
    // $ANTLR end "entryRuleRadioButton"


    // $ANTLR start "ruleRadioButton"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:209:1: ruleRadioButton : ( ( rule__RadioButton__Group__0 ) ) ;
    public final void ruleRadioButton() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:213:2: ( ( ( rule__RadioButton__Group__0 ) ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:214:1: ( ( rule__RadioButton__Group__0 ) )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:214:1: ( ( rule__RadioButton__Group__0 ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:215:1: ( rule__RadioButton__Group__0 )
            {
             before(grammarAccess.getRadioButtonAccess().getGroup()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:216:1: ( rule__RadioButton__Group__0 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:216:2: rule__RadioButton__Group__0
            {
            pushFollow(FOLLOW_rule__RadioButton__Group__0_in_ruleRadioButton394);
            rule__RadioButton__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRadioButtonAccess().getGroup()); 

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
    // $ANTLR end "ruleRadioButton"


    // $ANTLR start "entryRuleTextField"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:228:1: entryRuleTextField : ruleTextField EOF ;
    public final void entryRuleTextField() throws RecognitionException {
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:229:1: ( ruleTextField EOF )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:230:1: ruleTextField EOF
            {
             before(grammarAccess.getTextFieldRule()); 
            pushFollow(FOLLOW_ruleTextField_in_entryRuleTextField421);
            ruleTextField();

            state._fsp--;

             after(grammarAccess.getTextFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextField428); 

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
    // $ANTLR end "entryRuleTextField"


    // $ANTLR start "ruleTextField"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:237:1: ruleTextField : ( ( rule__TextField__Group__0 ) ) ;
    public final void ruleTextField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:241:2: ( ( ( rule__TextField__Group__0 ) ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:242:1: ( ( rule__TextField__Group__0 ) )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:242:1: ( ( rule__TextField__Group__0 ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:243:1: ( rule__TextField__Group__0 )
            {
             before(grammarAccess.getTextFieldAccess().getGroup()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:244:1: ( rule__TextField__Group__0 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:244:2: rule__TextField__Group__0
            {
            pushFollow(FOLLOW_rule__TextField__Group__0_in_ruleTextField454);
            rule__TextField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextFieldAccess().getGroup()); 

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
    // $ANTLR end "ruleTextField"


    // $ANTLR start "entryRuleComboBox"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:256:1: entryRuleComboBox : ruleComboBox EOF ;
    public final void entryRuleComboBox() throws RecognitionException {
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:257:1: ( ruleComboBox EOF )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:258:1: ruleComboBox EOF
            {
             before(grammarAccess.getComboBoxRule()); 
            pushFollow(FOLLOW_ruleComboBox_in_entryRuleComboBox481);
            ruleComboBox();

            state._fsp--;

             after(grammarAccess.getComboBoxRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComboBox488); 

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
    // $ANTLR end "entryRuleComboBox"


    // $ANTLR start "ruleComboBox"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:265:1: ruleComboBox : ( ( rule__ComboBox__Group__0 ) ) ;
    public final void ruleComboBox() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:269:2: ( ( ( rule__ComboBox__Group__0 ) ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:270:1: ( ( rule__ComboBox__Group__0 ) )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:270:1: ( ( rule__ComboBox__Group__0 ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:271:1: ( rule__ComboBox__Group__0 )
            {
             before(grammarAccess.getComboBoxAccess().getGroup()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:272:1: ( rule__ComboBox__Group__0 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:272:2: rule__ComboBox__Group__0
            {
            pushFollow(FOLLOW_rule__ComboBox__Group__0_in_ruleComboBox514);
            rule__ComboBox__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComboBoxAccess().getGroup()); 

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
    // $ANTLR end "ruleComboBox"


    // $ANTLR start "rule__Widget__Alternatives"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:284:1: rule__Widget__Alternatives : ( ( ruleCheckBox ) | ( ruleRadioButton ) | ( ruleTextField ) | ( ruleComboBox ) );
    public final void rule__Widget__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:288:1: ( ( ruleCheckBox ) | ( ruleRadioButton ) | ( ruleTextField ) | ( ruleComboBox ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt1=1;
                }
                break;
            case 23:
                {
                alt1=2;
                }
                break;
            case 24:
                {
                alt1=3;
                }
                break;
            case 25:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:289:1: ( ruleCheckBox )
                    {
                    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:289:1: ( ruleCheckBox )
                    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:290:1: ruleCheckBox
                    {
                     before(grammarAccess.getWidgetAccess().getCheckBoxParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCheckBox_in_rule__Widget__Alternatives550);
                    ruleCheckBox();

                    state._fsp--;

                     after(grammarAccess.getWidgetAccess().getCheckBoxParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:295:6: ( ruleRadioButton )
                    {
                    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:295:6: ( ruleRadioButton )
                    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:296:1: ruleRadioButton
                    {
                     before(grammarAccess.getWidgetAccess().getRadioButtonParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRadioButton_in_rule__Widget__Alternatives567);
                    ruleRadioButton();

                    state._fsp--;

                     after(grammarAccess.getWidgetAccess().getRadioButtonParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:301:6: ( ruleTextField )
                    {
                    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:301:6: ( ruleTextField )
                    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:302:1: ruleTextField
                    {
                     before(grammarAccess.getWidgetAccess().getTextFieldParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleTextField_in_rule__Widget__Alternatives584);
                    ruleTextField();

                    state._fsp--;

                     after(grammarAccess.getWidgetAccess().getTextFieldParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:307:6: ( ruleComboBox )
                    {
                    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:307:6: ( ruleComboBox )
                    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:308:1: ruleComboBox
                    {
                     before(grammarAccess.getWidgetAccess().getComboBoxParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleComboBox_in_rule__Widget__Alternatives601);
                    ruleComboBox();

                    state._fsp--;

                     after(grammarAccess.getWidgetAccess().getComboBoxParserRuleCall_3()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Widget__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:318:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:322:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:323:1: ( RULE_STRING )
                    {
                    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:323:1: ( RULE_STRING )
                    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:324:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives633); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:329:6: ( RULE_ID )
                    {
                    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:329:6: ( RULE_ID )
                    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:330:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives650); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__PollSystem__Group__0"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:342:1: rule__PollSystem__Group__0 : rule__PollSystem__Group__0__Impl rule__PollSystem__Group__1 ;
    public final void rule__PollSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:346:1: ( rule__PollSystem__Group__0__Impl rule__PollSystem__Group__1 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:347:2: rule__PollSystem__Group__0__Impl rule__PollSystem__Group__1
            {
            pushFollow(FOLLOW_rule__PollSystem__Group__0__Impl_in_rule__PollSystem__Group__0680);
            rule__PollSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PollSystem__Group__1_in_rule__PollSystem__Group__0683);
            rule__PollSystem__Group__1();

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
    // $ANTLR end "rule__PollSystem__Group__0"


    // $ANTLR start "rule__PollSystem__Group__0__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:354:1: rule__PollSystem__Group__0__Impl : ( () ) ;
    public final void rule__PollSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:358:1: ( ( () ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:359:1: ( () )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:359:1: ( () )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:360:1: ()
            {
             before(grammarAccess.getPollSystemAccess().getPollSystemAction_0()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:361:1: ()
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:363:1: 
            {
            }

             after(grammarAccess.getPollSystemAccess().getPollSystemAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PollSystem__Group__0__Impl"


    // $ANTLR start "rule__PollSystem__Group__1"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:373:1: rule__PollSystem__Group__1 : rule__PollSystem__Group__1__Impl rule__PollSystem__Group__2 ;
    public final void rule__PollSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:377:1: ( rule__PollSystem__Group__1__Impl rule__PollSystem__Group__2 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:378:2: rule__PollSystem__Group__1__Impl rule__PollSystem__Group__2
            {
            pushFollow(FOLLOW_rule__PollSystem__Group__1__Impl_in_rule__PollSystem__Group__1741);
            rule__PollSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PollSystem__Group__2_in_rule__PollSystem__Group__1744);
            rule__PollSystem__Group__2();

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
    // $ANTLR end "rule__PollSystem__Group__1"


    // $ANTLR start "rule__PollSystem__Group__1__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:385:1: rule__PollSystem__Group__1__Impl : ( 'PollSystem' ) ;
    public final void rule__PollSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:389:1: ( ( 'PollSystem' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:390:1: ( 'PollSystem' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:390:1: ( 'PollSystem' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:391:1: 'PollSystem'
            {
             before(grammarAccess.getPollSystemAccess().getPollSystemKeyword_1()); 
            match(input,11,FOLLOW_11_in_rule__PollSystem__Group__1__Impl772); 
             after(grammarAccess.getPollSystemAccess().getPollSystemKeyword_1()); 

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
    // $ANTLR end "rule__PollSystem__Group__1__Impl"


    // $ANTLR start "rule__PollSystem__Group__2"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:404:1: rule__PollSystem__Group__2 : rule__PollSystem__Group__2__Impl rule__PollSystem__Group__3 ;
    public final void rule__PollSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:408:1: ( rule__PollSystem__Group__2__Impl rule__PollSystem__Group__3 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:409:2: rule__PollSystem__Group__2__Impl rule__PollSystem__Group__3
            {
            pushFollow(FOLLOW_rule__PollSystem__Group__2__Impl_in_rule__PollSystem__Group__2803);
            rule__PollSystem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PollSystem__Group__3_in_rule__PollSystem__Group__2806);
            rule__PollSystem__Group__3();

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
    // $ANTLR end "rule__PollSystem__Group__2"


    // $ANTLR start "rule__PollSystem__Group__2__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:416:1: rule__PollSystem__Group__2__Impl : ( '{' ) ;
    public final void rule__PollSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:420:1: ( ( '{' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:421:1: ( '{' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:421:1: ( '{' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:422:1: '{'
            {
             before(grammarAccess.getPollSystemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__PollSystem__Group__2__Impl834); 
             after(grammarAccess.getPollSystemAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__PollSystem__Group__2__Impl"


    // $ANTLR start "rule__PollSystem__Group__3"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:435:1: rule__PollSystem__Group__3 : rule__PollSystem__Group__3__Impl rule__PollSystem__Group__4 ;
    public final void rule__PollSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:439:1: ( rule__PollSystem__Group__3__Impl rule__PollSystem__Group__4 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:440:2: rule__PollSystem__Group__3__Impl rule__PollSystem__Group__4
            {
            pushFollow(FOLLOW_rule__PollSystem__Group__3__Impl_in_rule__PollSystem__Group__3865);
            rule__PollSystem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PollSystem__Group__4_in_rule__PollSystem__Group__3868);
            rule__PollSystem__Group__4();

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
    // $ANTLR end "rule__PollSystem__Group__3"


    // $ANTLR start "rule__PollSystem__Group__3__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:447:1: rule__PollSystem__Group__3__Impl : ( ( rule__PollSystem__Group_3__0 )? ) ;
    public final void rule__PollSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:451:1: ( ( ( rule__PollSystem__Group_3__0 )? ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:452:1: ( ( rule__PollSystem__Group_3__0 )? )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:452:1: ( ( rule__PollSystem__Group_3__0 )? )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:453:1: ( rule__PollSystem__Group_3__0 )?
            {
             before(grammarAccess.getPollSystemAccess().getGroup_3()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:454:1: ( rule__PollSystem__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:454:2: rule__PollSystem__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__PollSystem__Group_3__0_in_rule__PollSystem__Group__3__Impl895);
                    rule__PollSystem__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPollSystemAccess().getGroup_3()); 

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
    // $ANTLR end "rule__PollSystem__Group__3__Impl"


    // $ANTLR start "rule__PollSystem__Group__4"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:464:1: rule__PollSystem__Group__4 : rule__PollSystem__Group__4__Impl rule__PollSystem__Group__5 ;
    public final void rule__PollSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:468:1: ( rule__PollSystem__Group__4__Impl rule__PollSystem__Group__5 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:469:2: rule__PollSystem__Group__4__Impl rule__PollSystem__Group__5
            {
            pushFollow(FOLLOW_rule__PollSystem__Group__4__Impl_in_rule__PollSystem__Group__4926);
            rule__PollSystem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PollSystem__Group__5_in_rule__PollSystem__Group__4929);
            rule__PollSystem__Group__5();

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
    // $ANTLR end "rule__PollSystem__Group__4"


    // $ANTLR start "rule__PollSystem__Group__4__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:476:1: rule__PollSystem__Group__4__Impl : ( ( rule__PollSystem__Group_4__0 )? ) ;
    public final void rule__PollSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:480:1: ( ( ( rule__PollSystem__Group_4__0 )? ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:481:1: ( ( rule__PollSystem__Group_4__0 )? )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:481:1: ( ( rule__PollSystem__Group_4__0 )? )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:482:1: ( rule__PollSystem__Group_4__0 )?
            {
             before(grammarAccess.getPollSystemAccess().getGroup_4()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:483:1: ( rule__PollSystem__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:483:2: rule__PollSystem__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__PollSystem__Group_4__0_in_rule__PollSystem__Group__4__Impl956);
                    rule__PollSystem__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPollSystemAccess().getGroup_4()); 

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
    // $ANTLR end "rule__PollSystem__Group__4__Impl"


    // $ANTLR start "rule__PollSystem__Group__5"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:493:1: rule__PollSystem__Group__5 : rule__PollSystem__Group__5__Impl ;
    public final void rule__PollSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:497:1: ( rule__PollSystem__Group__5__Impl )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:498:2: rule__PollSystem__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__PollSystem__Group__5__Impl_in_rule__PollSystem__Group__5987);
            rule__PollSystem__Group__5__Impl();

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
    // $ANTLR end "rule__PollSystem__Group__5"


    // $ANTLR start "rule__PollSystem__Group__5__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:504:1: rule__PollSystem__Group__5__Impl : ( '}' ) ;
    public final void rule__PollSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:508:1: ( ( '}' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:509:1: ( '}' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:509:1: ( '}' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:510:1: '}'
            {
             before(grammarAccess.getPollSystemAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_13_in_rule__PollSystem__Group__5__Impl1015); 
             after(grammarAccess.getPollSystemAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__PollSystem__Group__5__Impl"


    // $ANTLR start "rule__PollSystem__Group_3__0"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:535:1: rule__PollSystem__Group_3__0 : rule__PollSystem__Group_3__0__Impl rule__PollSystem__Group_3__1 ;
    public final void rule__PollSystem__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:539:1: ( rule__PollSystem__Group_3__0__Impl rule__PollSystem__Group_3__1 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:540:2: rule__PollSystem__Group_3__0__Impl rule__PollSystem__Group_3__1
            {
            pushFollow(FOLLOW_rule__PollSystem__Group_3__0__Impl_in_rule__PollSystem__Group_3__01058);
            rule__PollSystem__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PollSystem__Group_3__1_in_rule__PollSystem__Group_3__01061);
            rule__PollSystem__Group_3__1();

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
    // $ANTLR end "rule__PollSystem__Group_3__0"


    // $ANTLR start "rule__PollSystem__Group_3__0__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:547:1: rule__PollSystem__Group_3__0__Impl : ( 'title' ) ;
    public final void rule__PollSystem__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:551:1: ( ( 'title' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:552:1: ( 'title' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:552:1: ( 'title' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:553:1: 'title'
            {
             before(grammarAccess.getPollSystemAccess().getTitleKeyword_3_0()); 
            match(input,14,FOLLOW_14_in_rule__PollSystem__Group_3__0__Impl1089); 
             after(grammarAccess.getPollSystemAccess().getTitleKeyword_3_0()); 

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
    // $ANTLR end "rule__PollSystem__Group_3__0__Impl"


    // $ANTLR start "rule__PollSystem__Group_3__1"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:566:1: rule__PollSystem__Group_3__1 : rule__PollSystem__Group_3__1__Impl ;
    public final void rule__PollSystem__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:570:1: ( rule__PollSystem__Group_3__1__Impl )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:571:2: rule__PollSystem__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__PollSystem__Group_3__1__Impl_in_rule__PollSystem__Group_3__11120);
            rule__PollSystem__Group_3__1__Impl();

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
    // $ANTLR end "rule__PollSystem__Group_3__1"


    // $ANTLR start "rule__PollSystem__Group_3__1__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:577:1: rule__PollSystem__Group_3__1__Impl : ( ( rule__PollSystem__TitleAssignment_3_1 ) ) ;
    public final void rule__PollSystem__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:581:1: ( ( ( rule__PollSystem__TitleAssignment_3_1 ) ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:582:1: ( ( rule__PollSystem__TitleAssignment_3_1 ) )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:582:1: ( ( rule__PollSystem__TitleAssignment_3_1 ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:583:1: ( rule__PollSystem__TitleAssignment_3_1 )
            {
             before(grammarAccess.getPollSystemAccess().getTitleAssignment_3_1()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:584:1: ( rule__PollSystem__TitleAssignment_3_1 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:584:2: rule__PollSystem__TitleAssignment_3_1
            {
            pushFollow(FOLLOW_rule__PollSystem__TitleAssignment_3_1_in_rule__PollSystem__Group_3__1__Impl1147);
            rule__PollSystem__TitleAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPollSystemAccess().getTitleAssignment_3_1()); 

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
    // $ANTLR end "rule__PollSystem__Group_3__1__Impl"


    // $ANTLR start "rule__PollSystem__Group_4__0"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:598:1: rule__PollSystem__Group_4__0 : rule__PollSystem__Group_4__0__Impl rule__PollSystem__Group_4__1 ;
    public final void rule__PollSystem__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:602:1: ( rule__PollSystem__Group_4__0__Impl rule__PollSystem__Group_4__1 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:603:2: rule__PollSystem__Group_4__0__Impl rule__PollSystem__Group_4__1
            {
            pushFollow(FOLLOW_rule__PollSystem__Group_4__0__Impl_in_rule__PollSystem__Group_4__01181);
            rule__PollSystem__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PollSystem__Group_4__1_in_rule__PollSystem__Group_4__01184);
            rule__PollSystem__Group_4__1();

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
    // $ANTLR end "rule__PollSystem__Group_4__0"


    // $ANTLR start "rule__PollSystem__Group_4__0__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:610:1: rule__PollSystem__Group_4__0__Impl : ( 'models' ) ;
    public final void rule__PollSystem__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:614:1: ( ( 'models' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:615:1: ( 'models' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:615:1: ( 'models' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:616:1: 'models'
            {
             before(grammarAccess.getPollSystemAccess().getModelsKeyword_4_0()); 
            match(input,15,FOLLOW_15_in_rule__PollSystem__Group_4__0__Impl1212); 
             after(grammarAccess.getPollSystemAccess().getModelsKeyword_4_0()); 

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
    // $ANTLR end "rule__PollSystem__Group_4__0__Impl"


    // $ANTLR start "rule__PollSystem__Group_4__1"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:629:1: rule__PollSystem__Group_4__1 : rule__PollSystem__Group_4__1__Impl rule__PollSystem__Group_4__2 ;
    public final void rule__PollSystem__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:633:1: ( rule__PollSystem__Group_4__1__Impl rule__PollSystem__Group_4__2 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:634:2: rule__PollSystem__Group_4__1__Impl rule__PollSystem__Group_4__2
            {
            pushFollow(FOLLOW_rule__PollSystem__Group_4__1__Impl_in_rule__PollSystem__Group_4__11243);
            rule__PollSystem__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PollSystem__Group_4__2_in_rule__PollSystem__Group_4__11246);
            rule__PollSystem__Group_4__2();

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
    // $ANTLR end "rule__PollSystem__Group_4__1"


    // $ANTLR start "rule__PollSystem__Group_4__1__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:641:1: rule__PollSystem__Group_4__1__Impl : ( '{' ) ;
    public final void rule__PollSystem__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:645:1: ( ( '{' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:646:1: ( '{' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:646:1: ( '{' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:647:1: '{'
            {
             before(grammarAccess.getPollSystemAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_12_in_rule__PollSystem__Group_4__1__Impl1274); 
             after(grammarAccess.getPollSystemAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__PollSystem__Group_4__1__Impl"


    // $ANTLR start "rule__PollSystem__Group_4__2"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:660:1: rule__PollSystem__Group_4__2 : rule__PollSystem__Group_4__2__Impl rule__PollSystem__Group_4__3 ;
    public final void rule__PollSystem__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:664:1: ( rule__PollSystem__Group_4__2__Impl rule__PollSystem__Group_4__3 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:665:2: rule__PollSystem__Group_4__2__Impl rule__PollSystem__Group_4__3
            {
            pushFollow(FOLLOW_rule__PollSystem__Group_4__2__Impl_in_rule__PollSystem__Group_4__21305);
            rule__PollSystem__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PollSystem__Group_4__3_in_rule__PollSystem__Group_4__21308);
            rule__PollSystem__Group_4__3();

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
    // $ANTLR end "rule__PollSystem__Group_4__2"


    // $ANTLR start "rule__PollSystem__Group_4__2__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:672:1: rule__PollSystem__Group_4__2__Impl : ( ( rule__PollSystem__ModelsAssignment_4_2 ) ) ;
    public final void rule__PollSystem__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:676:1: ( ( ( rule__PollSystem__ModelsAssignment_4_2 ) ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:677:1: ( ( rule__PollSystem__ModelsAssignment_4_2 ) )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:677:1: ( ( rule__PollSystem__ModelsAssignment_4_2 ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:678:1: ( rule__PollSystem__ModelsAssignment_4_2 )
            {
             before(grammarAccess.getPollSystemAccess().getModelsAssignment_4_2()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:679:1: ( rule__PollSystem__ModelsAssignment_4_2 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:679:2: rule__PollSystem__ModelsAssignment_4_2
            {
            pushFollow(FOLLOW_rule__PollSystem__ModelsAssignment_4_2_in_rule__PollSystem__Group_4__2__Impl1335);
            rule__PollSystem__ModelsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getPollSystemAccess().getModelsAssignment_4_2()); 

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
    // $ANTLR end "rule__PollSystem__Group_4__2__Impl"


    // $ANTLR start "rule__PollSystem__Group_4__3"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:689:1: rule__PollSystem__Group_4__3 : rule__PollSystem__Group_4__3__Impl rule__PollSystem__Group_4__4 ;
    public final void rule__PollSystem__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:693:1: ( rule__PollSystem__Group_4__3__Impl rule__PollSystem__Group_4__4 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:694:2: rule__PollSystem__Group_4__3__Impl rule__PollSystem__Group_4__4
            {
            pushFollow(FOLLOW_rule__PollSystem__Group_4__3__Impl_in_rule__PollSystem__Group_4__31365);
            rule__PollSystem__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PollSystem__Group_4__4_in_rule__PollSystem__Group_4__31368);
            rule__PollSystem__Group_4__4();

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
    // $ANTLR end "rule__PollSystem__Group_4__3"


    // $ANTLR start "rule__PollSystem__Group_4__3__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:701:1: rule__PollSystem__Group_4__3__Impl : ( ( rule__PollSystem__Group_4_3__0 )* ) ;
    public final void rule__PollSystem__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:705:1: ( ( ( rule__PollSystem__Group_4_3__0 )* ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:706:1: ( ( rule__PollSystem__Group_4_3__0 )* )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:706:1: ( ( rule__PollSystem__Group_4_3__0 )* )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:707:1: ( rule__PollSystem__Group_4_3__0 )*
            {
             before(grammarAccess.getPollSystemAccess().getGroup_4_3()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:708:1: ( rule__PollSystem__Group_4_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:708:2: rule__PollSystem__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_rule__PollSystem__Group_4_3__0_in_rule__PollSystem__Group_4__3__Impl1395);
            	    rule__PollSystem__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPollSystemAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__PollSystem__Group_4__3__Impl"


    // $ANTLR start "rule__PollSystem__Group_4__4"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:718:1: rule__PollSystem__Group_4__4 : rule__PollSystem__Group_4__4__Impl ;
    public final void rule__PollSystem__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:722:1: ( rule__PollSystem__Group_4__4__Impl )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:723:2: rule__PollSystem__Group_4__4__Impl
            {
            pushFollow(FOLLOW_rule__PollSystem__Group_4__4__Impl_in_rule__PollSystem__Group_4__41426);
            rule__PollSystem__Group_4__4__Impl();

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
    // $ANTLR end "rule__PollSystem__Group_4__4"


    // $ANTLR start "rule__PollSystem__Group_4__4__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:729:1: rule__PollSystem__Group_4__4__Impl : ( '}' ) ;
    public final void rule__PollSystem__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:733:1: ( ( '}' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:734:1: ( '}' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:734:1: ( '}' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:735:1: '}'
            {
             before(grammarAccess.getPollSystemAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_13_in_rule__PollSystem__Group_4__4__Impl1454); 
             after(grammarAccess.getPollSystemAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__PollSystem__Group_4__4__Impl"


    // $ANTLR start "rule__PollSystem__Group_4_3__0"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:758:1: rule__PollSystem__Group_4_3__0 : rule__PollSystem__Group_4_3__0__Impl rule__PollSystem__Group_4_3__1 ;
    public final void rule__PollSystem__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:762:1: ( rule__PollSystem__Group_4_3__0__Impl rule__PollSystem__Group_4_3__1 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:763:2: rule__PollSystem__Group_4_3__0__Impl rule__PollSystem__Group_4_3__1
            {
            pushFollow(FOLLOW_rule__PollSystem__Group_4_3__0__Impl_in_rule__PollSystem__Group_4_3__01495);
            rule__PollSystem__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PollSystem__Group_4_3__1_in_rule__PollSystem__Group_4_3__01498);
            rule__PollSystem__Group_4_3__1();

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
    // $ANTLR end "rule__PollSystem__Group_4_3__0"


    // $ANTLR start "rule__PollSystem__Group_4_3__0__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:770:1: rule__PollSystem__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__PollSystem__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:774:1: ( ( ',' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:775:1: ( ',' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:775:1: ( ',' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:776:1: ','
            {
             before(grammarAccess.getPollSystemAccess().getCommaKeyword_4_3_0()); 
            match(input,16,FOLLOW_16_in_rule__PollSystem__Group_4_3__0__Impl1526); 
             after(grammarAccess.getPollSystemAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__PollSystem__Group_4_3__0__Impl"


    // $ANTLR start "rule__PollSystem__Group_4_3__1"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:789:1: rule__PollSystem__Group_4_3__1 : rule__PollSystem__Group_4_3__1__Impl ;
    public final void rule__PollSystem__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:793:1: ( rule__PollSystem__Group_4_3__1__Impl )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:794:2: rule__PollSystem__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_rule__PollSystem__Group_4_3__1__Impl_in_rule__PollSystem__Group_4_3__11557);
            rule__PollSystem__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__PollSystem__Group_4_3__1"


    // $ANTLR start "rule__PollSystem__Group_4_3__1__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:800:1: rule__PollSystem__Group_4_3__1__Impl : ( ( rule__PollSystem__ModelsAssignment_4_3_1 ) ) ;
    public final void rule__PollSystem__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:804:1: ( ( ( rule__PollSystem__ModelsAssignment_4_3_1 ) ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:805:1: ( ( rule__PollSystem__ModelsAssignment_4_3_1 ) )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:805:1: ( ( rule__PollSystem__ModelsAssignment_4_3_1 ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:806:1: ( rule__PollSystem__ModelsAssignment_4_3_1 )
            {
             before(grammarAccess.getPollSystemAccess().getModelsAssignment_4_3_1()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:807:1: ( rule__PollSystem__ModelsAssignment_4_3_1 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:807:2: rule__PollSystem__ModelsAssignment_4_3_1
            {
            pushFollow(FOLLOW_rule__PollSystem__ModelsAssignment_4_3_1_in_rule__PollSystem__Group_4_3__1__Impl1584);
            rule__PollSystem__ModelsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPollSystemAccess().getModelsAssignment_4_3_1()); 

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
    // $ANTLR end "rule__PollSystem__Group_4_3__1__Impl"


    // $ANTLR start "rule__UiModel__Group__0"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:821:1: rule__UiModel__Group__0 : rule__UiModel__Group__0__Impl rule__UiModel__Group__1 ;
    public final void rule__UiModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:825:1: ( rule__UiModel__Group__0__Impl rule__UiModel__Group__1 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:826:2: rule__UiModel__Group__0__Impl rule__UiModel__Group__1
            {
            pushFollow(FOLLOW_rule__UiModel__Group__0__Impl_in_rule__UiModel__Group__01618);
            rule__UiModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UiModel__Group__1_in_rule__UiModel__Group__01621);
            rule__UiModel__Group__1();

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
    // $ANTLR end "rule__UiModel__Group__0"


    // $ANTLR start "rule__UiModel__Group__0__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:833:1: rule__UiModel__Group__0__Impl : ( () ) ;
    public final void rule__UiModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:837:1: ( ( () ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:838:1: ( () )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:838:1: ( () )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:839:1: ()
            {
             before(grammarAccess.getUiModelAccess().getUiModelAction_0()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:840:1: ()
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:842:1: 
            {
            }

             after(grammarAccess.getUiModelAccess().getUiModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UiModel__Group__0__Impl"


    // $ANTLR start "rule__UiModel__Group__1"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:852:1: rule__UiModel__Group__1 : rule__UiModel__Group__1__Impl rule__UiModel__Group__2 ;
    public final void rule__UiModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:856:1: ( rule__UiModel__Group__1__Impl rule__UiModel__Group__2 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:857:2: rule__UiModel__Group__1__Impl rule__UiModel__Group__2
            {
            pushFollow(FOLLOW_rule__UiModel__Group__1__Impl_in_rule__UiModel__Group__11679);
            rule__UiModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UiModel__Group__2_in_rule__UiModel__Group__11682);
            rule__UiModel__Group__2();

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
    // $ANTLR end "rule__UiModel__Group__1"


    // $ANTLR start "rule__UiModel__Group__1__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:864:1: rule__UiModel__Group__1__Impl : ( 'UiModel' ) ;
    public final void rule__UiModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:868:1: ( ( 'UiModel' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:869:1: ( 'UiModel' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:869:1: ( 'UiModel' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:870:1: 'UiModel'
            {
             before(grammarAccess.getUiModelAccess().getUiModelKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__UiModel__Group__1__Impl1710); 
             after(grammarAccess.getUiModelAccess().getUiModelKeyword_1()); 

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
    // $ANTLR end "rule__UiModel__Group__1__Impl"


    // $ANTLR start "rule__UiModel__Group__2"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:883:1: rule__UiModel__Group__2 : rule__UiModel__Group__2__Impl rule__UiModel__Group__3 ;
    public final void rule__UiModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:887:1: ( rule__UiModel__Group__2__Impl rule__UiModel__Group__3 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:888:2: rule__UiModel__Group__2__Impl rule__UiModel__Group__3
            {
            pushFollow(FOLLOW_rule__UiModel__Group__2__Impl_in_rule__UiModel__Group__21741);
            rule__UiModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UiModel__Group__3_in_rule__UiModel__Group__21744);
            rule__UiModel__Group__3();

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
    // $ANTLR end "rule__UiModel__Group__2"


    // $ANTLR start "rule__UiModel__Group__2__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:895:1: rule__UiModel__Group__2__Impl : ( '{' ) ;
    public final void rule__UiModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:899:1: ( ( '{' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:900:1: ( '{' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:900:1: ( '{' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:901:1: '{'
            {
             before(grammarAccess.getUiModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__UiModel__Group__2__Impl1772); 
             after(grammarAccess.getUiModelAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__UiModel__Group__2__Impl"


    // $ANTLR start "rule__UiModel__Group__3"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:914:1: rule__UiModel__Group__3 : rule__UiModel__Group__3__Impl rule__UiModel__Group__4 ;
    public final void rule__UiModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:918:1: ( rule__UiModel__Group__3__Impl rule__UiModel__Group__4 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:919:2: rule__UiModel__Group__3__Impl rule__UiModel__Group__4
            {
            pushFollow(FOLLOW_rule__UiModel__Group__3__Impl_in_rule__UiModel__Group__31803);
            rule__UiModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UiModel__Group__4_in_rule__UiModel__Group__31806);
            rule__UiModel__Group__4();

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
    // $ANTLR end "rule__UiModel__Group__3"


    // $ANTLR start "rule__UiModel__Group__3__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:926:1: rule__UiModel__Group__3__Impl : ( ( rule__UiModel__Group_3__0 )? ) ;
    public final void rule__UiModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:930:1: ( ( ( rule__UiModel__Group_3__0 )? ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:931:1: ( ( rule__UiModel__Group_3__0 )? )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:931:1: ( ( rule__UiModel__Group_3__0 )? )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:932:1: ( rule__UiModel__Group_3__0 )?
            {
             before(grammarAccess.getUiModelAccess().getGroup_3()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:933:1: ( rule__UiModel__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:933:2: rule__UiModel__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__UiModel__Group_3__0_in_rule__UiModel__Group__3__Impl1833);
                    rule__UiModel__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUiModelAccess().getGroup_3()); 

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
    // $ANTLR end "rule__UiModel__Group__3__Impl"


    // $ANTLR start "rule__UiModel__Group__4"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:943:1: rule__UiModel__Group__4 : rule__UiModel__Group__4__Impl rule__UiModel__Group__5 ;
    public final void rule__UiModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:947:1: ( rule__UiModel__Group__4__Impl rule__UiModel__Group__5 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:948:2: rule__UiModel__Group__4__Impl rule__UiModel__Group__5
            {
            pushFollow(FOLLOW_rule__UiModel__Group__4__Impl_in_rule__UiModel__Group__41864);
            rule__UiModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UiModel__Group__5_in_rule__UiModel__Group__41867);
            rule__UiModel__Group__5();

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
    // $ANTLR end "rule__UiModel__Group__4"


    // $ANTLR start "rule__UiModel__Group__4__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:955:1: rule__UiModel__Group__4__Impl : ( ( rule__UiModel__Group_4__0 )? ) ;
    public final void rule__UiModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:959:1: ( ( ( rule__UiModel__Group_4__0 )? ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:960:1: ( ( rule__UiModel__Group_4__0 )? )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:960:1: ( ( rule__UiModel__Group_4__0 )? )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:961:1: ( rule__UiModel__Group_4__0 )?
            {
             before(grammarAccess.getUiModelAccess().getGroup_4()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:962:1: ( rule__UiModel__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:962:2: rule__UiModel__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__UiModel__Group_4__0_in_rule__UiModel__Group__4__Impl1894);
                    rule__UiModel__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUiModelAccess().getGroup_4()); 

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
    // $ANTLR end "rule__UiModel__Group__4__Impl"


    // $ANTLR start "rule__UiModel__Group__5"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:972:1: rule__UiModel__Group__5 : rule__UiModel__Group__5__Impl rule__UiModel__Group__6 ;
    public final void rule__UiModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:976:1: ( rule__UiModel__Group__5__Impl rule__UiModel__Group__6 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:977:2: rule__UiModel__Group__5__Impl rule__UiModel__Group__6
            {
            pushFollow(FOLLOW_rule__UiModel__Group__5__Impl_in_rule__UiModel__Group__51925);
            rule__UiModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UiModel__Group__6_in_rule__UiModel__Group__51928);
            rule__UiModel__Group__6();

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
    // $ANTLR end "rule__UiModel__Group__5"


    // $ANTLR start "rule__UiModel__Group__5__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:984:1: rule__UiModel__Group__5__Impl : ( ( rule__UiModel__Group_5__0 )? ) ;
    public final void rule__UiModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:988:1: ( ( ( rule__UiModel__Group_5__0 )? ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:989:1: ( ( rule__UiModel__Group_5__0 )? )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:989:1: ( ( rule__UiModel__Group_5__0 )? )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:990:1: ( rule__UiModel__Group_5__0 )?
            {
             before(grammarAccess.getUiModelAccess().getGroup_5()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:991:1: ( rule__UiModel__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:991:2: rule__UiModel__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__UiModel__Group_5__0_in_rule__UiModel__Group__5__Impl1955);
                    rule__UiModel__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUiModelAccess().getGroup_5()); 

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
    // $ANTLR end "rule__UiModel__Group__5__Impl"


    // $ANTLR start "rule__UiModel__Group__6"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1001:1: rule__UiModel__Group__6 : rule__UiModel__Group__6__Impl ;
    public final void rule__UiModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1005:1: ( rule__UiModel__Group__6__Impl )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1006:2: rule__UiModel__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__UiModel__Group__6__Impl_in_rule__UiModel__Group__61986);
            rule__UiModel__Group__6__Impl();

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
    // $ANTLR end "rule__UiModel__Group__6"


    // $ANTLR start "rule__UiModel__Group__6__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1012:1: rule__UiModel__Group__6__Impl : ( '}' ) ;
    public final void rule__UiModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1016:1: ( ( '}' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1017:1: ( '}' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1017:1: ( '}' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1018:1: '}'
            {
             before(grammarAccess.getUiModelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_13_in_rule__UiModel__Group__6__Impl2014); 
             after(grammarAccess.getUiModelAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__UiModel__Group__6__Impl"


    // $ANTLR start "rule__UiModel__Group_3__0"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1045:1: rule__UiModel__Group_3__0 : rule__UiModel__Group_3__0__Impl rule__UiModel__Group_3__1 ;
    public final void rule__UiModel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1049:1: ( rule__UiModel__Group_3__0__Impl rule__UiModel__Group_3__1 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1050:2: rule__UiModel__Group_3__0__Impl rule__UiModel__Group_3__1
            {
            pushFollow(FOLLOW_rule__UiModel__Group_3__0__Impl_in_rule__UiModel__Group_3__02059);
            rule__UiModel__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UiModel__Group_3__1_in_rule__UiModel__Group_3__02062);
            rule__UiModel__Group_3__1();

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
    // $ANTLR end "rule__UiModel__Group_3__0"


    // $ANTLR start "rule__UiModel__Group_3__0__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1057:1: rule__UiModel__Group_3__0__Impl : ( 'id' ) ;
    public final void rule__UiModel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1061:1: ( ( 'id' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1062:1: ( 'id' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1062:1: ( 'id' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1063:1: 'id'
            {
             before(grammarAccess.getUiModelAccess().getIdKeyword_3_0()); 
            match(input,18,FOLLOW_18_in_rule__UiModel__Group_3__0__Impl2090); 
             after(grammarAccess.getUiModelAccess().getIdKeyword_3_0()); 

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
    // $ANTLR end "rule__UiModel__Group_3__0__Impl"


    // $ANTLR start "rule__UiModel__Group_3__1"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1076:1: rule__UiModel__Group_3__1 : rule__UiModel__Group_3__1__Impl ;
    public final void rule__UiModel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1080:1: ( rule__UiModel__Group_3__1__Impl )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1081:2: rule__UiModel__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__UiModel__Group_3__1__Impl_in_rule__UiModel__Group_3__12121);
            rule__UiModel__Group_3__1__Impl();

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
    // $ANTLR end "rule__UiModel__Group_3__1"


    // $ANTLR start "rule__UiModel__Group_3__1__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1087:1: rule__UiModel__Group_3__1__Impl : ( ( rule__UiModel__IdAssignment_3_1 ) ) ;
    public final void rule__UiModel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1091:1: ( ( ( rule__UiModel__IdAssignment_3_1 ) ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1092:1: ( ( rule__UiModel__IdAssignment_3_1 ) )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1092:1: ( ( rule__UiModel__IdAssignment_3_1 ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1093:1: ( rule__UiModel__IdAssignment_3_1 )
            {
             before(grammarAccess.getUiModelAccess().getIdAssignment_3_1()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1094:1: ( rule__UiModel__IdAssignment_3_1 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1094:2: rule__UiModel__IdAssignment_3_1
            {
            pushFollow(FOLLOW_rule__UiModel__IdAssignment_3_1_in_rule__UiModel__Group_3__1__Impl2148);
            rule__UiModel__IdAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUiModelAccess().getIdAssignment_3_1()); 

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
    // $ANTLR end "rule__UiModel__Group_3__1__Impl"


    // $ANTLR start "rule__UiModel__Group_4__0"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1108:1: rule__UiModel__Group_4__0 : rule__UiModel__Group_4__0__Impl rule__UiModel__Group_4__1 ;
    public final void rule__UiModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1112:1: ( rule__UiModel__Group_4__0__Impl rule__UiModel__Group_4__1 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1113:2: rule__UiModel__Group_4__0__Impl rule__UiModel__Group_4__1
            {
            pushFollow(FOLLOW_rule__UiModel__Group_4__0__Impl_in_rule__UiModel__Group_4__02182);
            rule__UiModel__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UiModel__Group_4__1_in_rule__UiModel__Group_4__02185);
            rule__UiModel__Group_4__1();

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
    // $ANTLR end "rule__UiModel__Group_4__0"


    // $ANTLR start "rule__UiModel__Group_4__0__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1120:1: rule__UiModel__Group_4__0__Impl : ( 'laQuestion' ) ;
    public final void rule__UiModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1124:1: ( ( 'laQuestion' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1125:1: ( 'laQuestion' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1125:1: ( 'laQuestion' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1126:1: 'laQuestion'
            {
             before(grammarAccess.getUiModelAccess().getLaQuestionKeyword_4_0()); 
            match(input,19,FOLLOW_19_in_rule__UiModel__Group_4__0__Impl2213); 
             after(grammarAccess.getUiModelAccess().getLaQuestionKeyword_4_0()); 

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
    // $ANTLR end "rule__UiModel__Group_4__0__Impl"


    // $ANTLR start "rule__UiModel__Group_4__1"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1139:1: rule__UiModel__Group_4__1 : rule__UiModel__Group_4__1__Impl ;
    public final void rule__UiModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1143:1: ( rule__UiModel__Group_4__1__Impl )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1144:2: rule__UiModel__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__UiModel__Group_4__1__Impl_in_rule__UiModel__Group_4__12244);
            rule__UiModel__Group_4__1__Impl();

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
    // $ANTLR end "rule__UiModel__Group_4__1"


    // $ANTLR start "rule__UiModel__Group_4__1__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1150:1: rule__UiModel__Group_4__1__Impl : ( ( rule__UiModel__LaQuestionAssignment_4_1 ) ) ;
    public final void rule__UiModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1154:1: ( ( ( rule__UiModel__LaQuestionAssignment_4_1 ) ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1155:1: ( ( rule__UiModel__LaQuestionAssignment_4_1 ) )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1155:1: ( ( rule__UiModel__LaQuestionAssignment_4_1 ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1156:1: ( rule__UiModel__LaQuestionAssignment_4_1 )
            {
             before(grammarAccess.getUiModelAccess().getLaQuestionAssignment_4_1()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1157:1: ( rule__UiModel__LaQuestionAssignment_4_1 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1157:2: rule__UiModel__LaQuestionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__UiModel__LaQuestionAssignment_4_1_in_rule__UiModel__Group_4__1__Impl2271);
            rule__UiModel__LaQuestionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getUiModelAccess().getLaQuestionAssignment_4_1()); 

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
    // $ANTLR end "rule__UiModel__Group_4__1__Impl"


    // $ANTLR start "rule__UiModel__Group_5__0"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1171:1: rule__UiModel__Group_5__0 : rule__UiModel__Group_5__0__Impl rule__UiModel__Group_5__1 ;
    public final void rule__UiModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1175:1: ( rule__UiModel__Group_5__0__Impl rule__UiModel__Group_5__1 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1176:2: rule__UiModel__Group_5__0__Impl rule__UiModel__Group_5__1
            {
            pushFollow(FOLLOW_rule__UiModel__Group_5__0__Impl_in_rule__UiModel__Group_5__02305);
            rule__UiModel__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UiModel__Group_5__1_in_rule__UiModel__Group_5__02308);
            rule__UiModel__Group_5__1();

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
    // $ANTLR end "rule__UiModel__Group_5__0"


    // $ANTLR start "rule__UiModel__Group_5__0__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1183:1: rule__UiModel__Group_5__0__Impl : ( 'widgets' ) ;
    public final void rule__UiModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1187:1: ( ( 'widgets' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1188:1: ( 'widgets' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1188:1: ( 'widgets' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1189:1: 'widgets'
            {
             before(grammarAccess.getUiModelAccess().getWidgetsKeyword_5_0()); 
            match(input,20,FOLLOW_20_in_rule__UiModel__Group_5__0__Impl2336); 
             after(grammarAccess.getUiModelAccess().getWidgetsKeyword_5_0()); 

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
    // $ANTLR end "rule__UiModel__Group_5__0__Impl"


    // $ANTLR start "rule__UiModel__Group_5__1"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1202:1: rule__UiModel__Group_5__1 : rule__UiModel__Group_5__1__Impl rule__UiModel__Group_5__2 ;
    public final void rule__UiModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1206:1: ( rule__UiModel__Group_5__1__Impl rule__UiModel__Group_5__2 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1207:2: rule__UiModel__Group_5__1__Impl rule__UiModel__Group_5__2
            {
            pushFollow(FOLLOW_rule__UiModel__Group_5__1__Impl_in_rule__UiModel__Group_5__12367);
            rule__UiModel__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UiModel__Group_5__2_in_rule__UiModel__Group_5__12370);
            rule__UiModel__Group_5__2();

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
    // $ANTLR end "rule__UiModel__Group_5__1"


    // $ANTLR start "rule__UiModel__Group_5__1__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1214:1: rule__UiModel__Group_5__1__Impl : ( '{' ) ;
    public final void rule__UiModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1218:1: ( ( '{' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1219:1: ( '{' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1219:1: ( '{' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1220:1: '{'
            {
             before(grammarAccess.getUiModelAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_12_in_rule__UiModel__Group_5__1__Impl2398); 
             after(grammarAccess.getUiModelAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__UiModel__Group_5__1__Impl"


    // $ANTLR start "rule__UiModel__Group_5__2"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1233:1: rule__UiModel__Group_5__2 : rule__UiModel__Group_5__2__Impl rule__UiModel__Group_5__3 ;
    public final void rule__UiModel__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1237:1: ( rule__UiModel__Group_5__2__Impl rule__UiModel__Group_5__3 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1238:2: rule__UiModel__Group_5__2__Impl rule__UiModel__Group_5__3
            {
            pushFollow(FOLLOW_rule__UiModel__Group_5__2__Impl_in_rule__UiModel__Group_5__22429);
            rule__UiModel__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UiModel__Group_5__3_in_rule__UiModel__Group_5__22432);
            rule__UiModel__Group_5__3();

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
    // $ANTLR end "rule__UiModel__Group_5__2"


    // $ANTLR start "rule__UiModel__Group_5__2__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1245:1: rule__UiModel__Group_5__2__Impl : ( ( rule__UiModel__WidgetsAssignment_5_2 ) ) ;
    public final void rule__UiModel__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1249:1: ( ( ( rule__UiModel__WidgetsAssignment_5_2 ) ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1250:1: ( ( rule__UiModel__WidgetsAssignment_5_2 ) )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1250:1: ( ( rule__UiModel__WidgetsAssignment_5_2 ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1251:1: ( rule__UiModel__WidgetsAssignment_5_2 )
            {
             before(grammarAccess.getUiModelAccess().getWidgetsAssignment_5_2()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1252:1: ( rule__UiModel__WidgetsAssignment_5_2 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1252:2: rule__UiModel__WidgetsAssignment_5_2
            {
            pushFollow(FOLLOW_rule__UiModel__WidgetsAssignment_5_2_in_rule__UiModel__Group_5__2__Impl2459);
            rule__UiModel__WidgetsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getUiModelAccess().getWidgetsAssignment_5_2()); 

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
    // $ANTLR end "rule__UiModel__Group_5__2__Impl"


    // $ANTLR start "rule__UiModel__Group_5__3"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1262:1: rule__UiModel__Group_5__3 : rule__UiModel__Group_5__3__Impl rule__UiModel__Group_5__4 ;
    public final void rule__UiModel__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1266:1: ( rule__UiModel__Group_5__3__Impl rule__UiModel__Group_5__4 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1267:2: rule__UiModel__Group_5__3__Impl rule__UiModel__Group_5__4
            {
            pushFollow(FOLLOW_rule__UiModel__Group_5__3__Impl_in_rule__UiModel__Group_5__32489);
            rule__UiModel__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UiModel__Group_5__4_in_rule__UiModel__Group_5__32492);
            rule__UiModel__Group_5__4();

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
    // $ANTLR end "rule__UiModel__Group_5__3"


    // $ANTLR start "rule__UiModel__Group_5__3__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1274:1: rule__UiModel__Group_5__3__Impl : ( ( rule__UiModel__Group_5_3__0 )* ) ;
    public final void rule__UiModel__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1278:1: ( ( ( rule__UiModel__Group_5_3__0 )* ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1279:1: ( ( rule__UiModel__Group_5_3__0 )* )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1279:1: ( ( rule__UiModel__Group_5_3__0 )* )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1280:1: ( rule__UiModel__Group_5_3__0 )*
            {
             before(grammarAccess.getUiModelAccess().getGroup_5_3()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1281:1: ( rule__UiModel__Group_5_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1281:2: rule__UiModel__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_rule__UiModel__Group_5_3__0_in_rule__UiModel__Group_5__3__Impl2519);
            	    rule__UiModel__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getUiModelAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__UiModel__Group_5__3__Impl"


    // $ANTLR start "rule__UiModel__Group_5__4"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1291:1: rule__UiModel__Group_5__4 : rule__UiModel__Group_5__4__Impl ;
    public final void rule__UiModel__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1295:1: ( rule__UiModel__Group_5__4__Impl )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1296:2: rule__UiModel__Group_5__4__Impl
            {
            pushFollow(FOLLOW_rule__UiModel__Group_5__4__Impl_in_rule__UiModel__Group_5__42550);
            rule__UiModel__Group_5__4__Impl();

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
    // $ANTLR end "rule__UiModel__Group_5__4"


    // $ANTLR start "rule__UiModel__Group_5__4__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1302:1: rule__UiModel__Group_5__4__Impl : ( '}' ) ;
    public final void rule__UiModel__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1306:1: ( ( '}' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1307:1: ( '}' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1307:1: ( '}' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1308:1: '}'
            {
             before(grammarAccess.getUiModelAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FOLLOW_13_in_rule__UiModel__Group_5__4__Impl2578); 
             after(grammarAccess.getUiModelAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__UiModel__Group_5__4__Impl"


    // $ANTLR start "rule__UiModel__Group_5_3__0"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1331:1: rule__UiModel__Group_5_3__0 : rule__UiModel__Group_5_3__0__Impl rule__UiModel__Group_5_3__1 ;
    public final void rule__UiModel__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1335:1: ( rule__UiModel__Group_5_3__0__Impl rule__UiModel__Group_5_3__1 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1336:2: rule__UiModel__Group_5_3__0__Impl rule__UiModel__Group_5_3__1
            {
            pushFollow(FOLLOW_rule__UiModel__Group_5_3__0__Impl_in_rule__UiModel__Group_5_3__02619);
            rule__UiModel__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UiModel__Group_5_3__1_in_rule__UiModel__Group_5_3__02622);
            rule__UiModel__Group_5_3__1();

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
    // $ANTLR end "rule__UiModel__Group_5_3__0"


    // $ANTLR start "rule__UiModel__Group_5_3__0__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1343:1: rule__UiModel__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__UiModel__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1347:1: ( ( ',' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1348:1: ( ',' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1348:1: ( ',' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1349:1: ','
            {
             before(grammarAccess.getUiModelAccess().getCommaKeyword_5_3_0()); 
            match(input,16,FOLLOW_16_in_rule__UiModel__Group_5_3__0__Impl2650); 
             after(grammarAccess.getUiModelAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__UiModel__Group_5_3__0__Impl"


    // $ANTLR start "rule__UiModel__Group_5_3__1"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1362:1: rule__UiModel__Group_5_3__1 : rule__UiModel__Group_5_3__1__Impl ;
    public final void rule__UiModel__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1366:1: ( rule__UiModel__Group_5_3__1__Impl )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1367:2: rule__UiModel__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_rule__UiModel__Group_5_3__1__Impl_in_rule__UiModel__Group_5_3__12681);
            rule__UiModel__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__UiModel__Group_5_3__1"


    // $ANTLR start "rule__UiModel__Group_5_3__1__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1373:1: rule__UiModel__Group_5_3__1__Impl : ( ( rule__UiModel__WidgetsAssignment_5_3_1 ) ) ;
    public final void rule__UiModel__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1377:1: ( ( ( rule__UiModel__WidgetsAssignment_5_3_1 ) ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1378:1: ( ( rule__UiModel__WidgetsAssignment_5_3_1 ) )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1378:1: ( ( rule__UiModel__WidgetsAssignment_5_3_1 ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1379:1: ( rule__UiModel__WidgetsAssignment_5_3_1 )
            {
             before(grammarAccess.getUiModelAccess().getWidgetsAssignment_5_3_1()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1380:1: ( rule__UiModel__WidgetsAssignment_5_3_1 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1380:2: rule__UiModel__WidgetsAssignment_5_3_1
            {
            pushFollow(FOLLOW_rule__UiModel__WidgetsAssignment_5_3_1_in_rule__UiModel__Group_5_3__1__Impl2708);
            rule__UiModel__WidgetsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUiModelAccess().getWidgetsAssignment_5_3_1()); 

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
    // $ANTLR end "rule__UiModel__Group_5_3__1__Impl"


    // $ANTLR start "rule__CheckBox__Group__0"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1394:1: rule__CheckBox__Group__0 : rule__CheckBox__Group__0__Impl rule__CheckBox__Group__1 ;
    public final void rule__CheckBox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1398:1: ( rule__CheckBox__Group__0__Impl rule__CheckBox__Group__1 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1399:2: rule__CheckBox__Group__0__Impl rule__CheckBox__Group__1
            {
            pushFollow(FOLLOW_rule__CheckBox__Group__0__Impl_in_rule__CheckBox__Group__02742);
            rule__CheckBox__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckBox__Group__1_in_rule__CheckBox__Group__02745);
            rule__CheckBox__Group__1();

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
    // $ANTLR end "rule__CheckBox__Group__0"


    // $ANTLR start "rule__CheckBox__Group__0__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1406:1: rule__CheckBox__Group__0__Impl : ( () ) ;
    public final void rule__CheckBox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1410:1: ( ( () ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1411:1: ( () )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1411:1: ( () )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1412:1: ()
            {
             before(grammarAccess.getCheckBoxAccess().getCheckBoxAction_0()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1413:1: ()
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1415:1: 
            {
            }

             after(grammarAccess.getCheckBoxAccess().getCheckBoxAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBox__Group__0__Impl"


    // $ANTLR start "rule__CheckBox__Group__1"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1425:1: rule__CheckBox__Group__1 : rule__CheckBox__Group__1__Impl rule__CheckBox__Group__2 ;
    public final void rule__CheckBox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1429:1: ( rule__CheckBox__Group__1__Impl rule__CheckBox__Group__2 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1430:2: rule__CheckBox__Group__1__Impl rule__CheckBox__Group__2
            {
            pushFollow(FOLLOW_rule__CheckBox__Group__1__Impl_in_rule__CheckBox__Group__12803);
            rule__CheckBox__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckBox__Group__2_in_rule__CheckBox__Group__12806);
            rule__CheckBox__Group__2();

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
    // $ANTLR end "rule__CheckBox__Group__1"


    // $ANTLR start "rule__CheckBox__Group__1__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1437:1: rule__CheckBox__Group__1__Impl : ( 'CheckBox' ) ;
    public final void rule__CheckBox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1441:1: ( ( 'CheckBox' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1442:1: ( 'CheckBox' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1442:1: ( 'CheckBox' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1443:1: 'CheckBox'
            {
             before(grammarAccess.getCheckBoxAccess().getCheckBoxKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__CheckBox__Group__1__Impl2834); 
             after(grammarAccess.getCheckBoxAccess().getCheckBoxKeyword_1()); 

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
    // $ANTLR end "rule__CheckBox__Group__1__Impl"


    // $ANTLR start "rule__CheckBox__Group__2"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1456:1: rule__CheckBox__Group__2 : rule__CheckBox__Group__2__Impl rule__CheckBox__Group__3 ;
    public final void rule__CheckBox__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1460:1: ( rule__CheckBox__Group__2__Impl rule__CheckBox__Group__3 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1461:2: rule__CheckBox__Group__2__Impl rule__CheckBox__Group__3
            {
            pushFollow(FOLLOW_rule__CheckBox__Group__2__Impl_in_rule__CheckBox__Group__22865);
            rule__CheckBox__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckBox__Group__3_in_rule__CheckBox__Group__22868);
            rule__CheckBox__Group__3();

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
    // $ANTLR end "rule__CheckBox__Group__2"


    // $ANTLR start "rule__CheckBox__Group__2__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1468:1: rule__CheckBox__Group__2__Impl : ( '{' ) ;
    public final void rule__CheckBox__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1472:1: ( ( '{' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1473:1: ( '{' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1473:1: ( '{' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1474:1: '{'
            {
             before(grammarAccess.getCheckBoxAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__CheckBox__Group__2__Impl2896); 
             after(grammarAccess.getCheckBoxAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__CheckBox__Group__2__Impl"


    // $ANTLR start "rule__CheckBox__Group__3"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1487:1: rule__CheckBox__Group__3 : rule__CheckBox__Group__3__Impl rule__CheckBox__Group__4 ;
    public final void rule__CheckBox__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1491:1: ( rule__CheckBox__Group__3__Impl rule__CheckBox__Group__4 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1492:2: rule__CheckBox__Group__3__Impl rule__CheckBox__Group__4
            {
            pushFollow(FOLLOW_rule__CheckBox__Group__3__Impl_in_rule__CheckBox__Group__32927);
            rule__CheckBox__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckBox__Group__4_in_rule__CheckBox__Group__32930);
            rule__CheckBox__Group__4();

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
    // $ANTLR end "rule__CheckBox__Group__3"


    // $ANTLR start "rule__CheckBox__Group__3__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1499:1: rule__CheckBox__Group__3__Impl : ( ( rule__CheckBox__Group_3__0 )? ) ;
    public final void rule__CheckBox__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1503:1: ( ( ( rule__CheckBox__Group_3__0 )? ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1504:1: ( ( rule__CheckBox__Group_3__0 )? )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1504:1: ( ( rule__CheckBox__Group_3__0 )? )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1505:1: ( rule__CheckBox__Group_3__0 )?
            {
             before(grammarAccess.getCheckBoxAccess().getGroup_3()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1506:1: ( rule__CheckBox__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1506:2: rule__CheckBox__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__CheckBox__Group_3__0_in_rule__CheckBox__Group__3__Impl2957);
                    rule__CheckBox__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheckBoxAccess().getGroup_3()); 

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
    // $ANTLR end "rule__CheckBox__Group__3__Impl"


    // $ANTLR start "rule__CheckBox__Group__4"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1516:1: rule__CheckBox__Group__4 : rule__CheckBox__Group__4__Impl ;
    public final void rule__CheckBox__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1520:1: ( rule__CheckBox__Group__4__Impl )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1521:2: rule__CheckBox__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CheckBox__Group__4__Impl_in_rule__CheckBox__Group__42988);
            rule__CheckBox__Group__4__Impl();

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
    // $ANTLR end "rule__CheckBox__Group__4"


    // $ANTLR start "rule__CheckBox__Group__4__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1527:1: rule__CheckBox__Group__4__Impl : ( '}' ) ;
    public final void rule__CheckBox__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1531:1: ( ( '}' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1532:1: ( '}' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1532:1: ( '}' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1533:1: '}'
            {
             before(grammarAccess.getCheckBoxAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__CheckBox__Group__4__Impl3016); 
             after(grammarAccess.getCheckBoxAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__CheckBox__Group__4__Impl"


    // $ANTLR start "rule__CheckBox__Group_3__0"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1556:1: rule__CheckBox__Group_3__0 : rule__CheckBox__Group_3__0__Impl rule__CheckBox__Group_3__1 ;
    public final void rule__CheckBox__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1560:1: ( rule__CheckBox__Group_3__0__Impl rule__CheckBox__Group_3__1 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1561:2: rule__CheckBox__Group_3__0__Impl rule__CheckBox__Group_3__1
            {
            pushFollow(FOLLOW_rule__CheckBox__Group_3__0__Impl_in_rule__CheckBox__Group_3__03057);
            rule__CheckBox__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckBox__Group_3__1_in_rule__CheckBox__Group_3__03060);
            rule__CheckBox__Group_3__1();

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
    // $ANTLR end "rule__CheckBox__Group_3__0"


    // $ANTLR start "rule__CheckBox__Group_3__0__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1568:1: rule__CheckBox__Group_3__0__Impl : ( 'value' ) ;
    public final void rule__CheckBox__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1572:1: ( ( 'value' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1573:1: ( 'value' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1573:1: ( 'value' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1574:1: 'value'
            {
             before(grammarAccess.getCheckBoxAccess().getValueKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__CheckBox__Group_3__0__Impl3088); 
             after(grammarAccess.getCheckBoxAccess().getValueKeyword_3_0()); 

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
    // $ANTLR end "rule__CheckBox__Group_3__0__Impl"


    // $ANTLR start "rule__CheckBox__Group_3__1"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1587:1: rule__CheckBox__Group_3__1 : rule__CheckBox__Group_3__1__Impl ;
    public final void rule__CheckBox__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1591:1: ( rule__CheckBox__Group_3__1__Impl )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1592:2: rule__CheckBox__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__CheckBox__Group_3__1__Impl_in_rule__CheckBox__Group_3__13119);
            rule__CheckBox__Group_3__1__Impl();

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
    // $ANTLR end "rule__CheckBox__Group_3__1"


    // $ANTLR start "rule__CheckBox__Group_3__1__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1598:1: rule__CheckBox__Group_3__1__Impl : ( ( rule__CheckBox__ValueAssignment_3_1 ) ) ;
    public final void rule__CheckBox__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1602:1: ( ( ( rule__CheckBox__ValueAssignment_3_1 ) ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1603:1: ( ( rule__CheckBox__ValueAssignment_3_1 ) )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1603:1: ( ( rule__CheckBox__ValueAssignment_3_1 ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1604:1: ( rule__CheckBox__ValueAssignment_3_1 )
            {
             before(grammarAccess.getCheckBoxAccess().getValueAssignment_3_1()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1605:1: ( rule__CheckBox__ValueAssignment_3_1 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1605:2: rule__CheckBox__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__CheckBox__ValueAssignment_3_1_in_rule__CheckBox__Group_3__1__Impl3146);
            rule__CheckBox__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckBoxAccess().getValueAssignment_3_1()); 

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
    // $ANTLR end "rule__CheckBox__Group_3__1__Impl"


    // $ANTLR start "rule__RadioButton__Group__0"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1619:1: rule__RadioButton__Group__0 : rule__RadioButton__Group__0__Impl rule__RadioButton__Group__1 ;
    public final void rule__RadioButton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1623:1: ( rule__RadioButton__Group__0__Impl rule__RadioButton__Group__1 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1624:2: rule__RadioButton__Group__0__Impl rule__RadioButton__Group__1
            {
            pushFollow(FOLLOW_rule__RadioButton__Group__0__Impl_in_rule__RadioButton__Group__03180);
            rule__RadioButton__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RadioButton__Group__1_in_rule__RadioButton__Group__03183);
            rule__RadioButton__Group__1();

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
    // $ANTLR end "rule__RadioButton__Group__0"


    // $ANTLR start "rule__RadioButton__Group__0__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1631:1: rule__RadioButton__Group__0__Impl : ( () ) ;
    public final void rule__RadioButton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1635:1: ( ( () ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1636:1: ( () )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1636:1: ( () )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1637:1: ()
            {
             before(grammarAccess.getRadioButtonAccess().getRadioButtonAction_0()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1638:1: ()
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1640:1: 
            {
            }

             after(grammarAccess.getRadioButtonAccess().getRadioButtonAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButton__Group__0__Impl"


    // $ANTLR start "rule__RadioButton__Group__1"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1650:1: rule__RadioButton__Group__1 : rule__RadioButton__Group__1__Impl rule__RadioButton__Group__2 ;
    public final void rule__RadioButton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1654:1: ( rule__RadioButton__Group__1__Impl rule__RadioButton__Group__2 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1655:2: rule__RadioButton__Group__1__Impl rule__RadioButton__Group__2
            {
            pushFollow(FOLLOW_rule__RadioButton__Group__1__Impl_in_rule__RadioButton__Group__13241);
            rule__RadioButton__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RadioButton__Group__2_in_rule__RadioButton__Group__13244);
            rule__RadioButton__Group__2();

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
    // $ANTLR end "rule__RadioButton__Group__1"


    // $ANTLR start "rule__RadioButton__Group__1__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1662:1: rule__RadioButton__Group__1__Impl : ( 'RadioButton' ) ;
    public final void rule__RadioButton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1666:1: ( ( 'RadioButton' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1667:1: ( 'RadioButton' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1667:1: ( 'RadioButton' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1668:1: 'RadioButton'
            {
             before(grammarAccess.getRadioButtonAccess().getRadioButtonKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__RadioButton__Group__1__Impl3272); 
             after(grammarAccess.getRadioButtonAccess().getRadioButtonKeyword_1()); 

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
    // $ANTLR end "rule__RadioButton__Group__1__Impl"


    // $ANTLR start "rule__RadioButton__Group__2"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1681:1: rule__RadioButton__Group__2 : rule__RadioButton__Group__2__Impl rule__RadioButton__Group__3 ;
    public final void rule__RadioButton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1685:1: ( rule__RadioButton__Group__2__Impl rule__RadioButton__Group__3 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1686:2: rule__RadioButton__Group__2__Impl rule__RadioButton__Group__3
            {
            pushFollow(FOLLOW_rule__RadioButton__Group__2__Impl_in_rule__RadioButton__Group__23303);
            rule__RadioButton__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RadioButton__Group__3_in_rule__RadioButton__Group__23306);
            rule__RadioButton__Group__3();

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
    // $ANTLR end "rule__RadioButton__Group__2"


    // $ANTLR start "rule__RadioButton__Group__2__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1693:1: rule__RadioButton__Group__2__Impl : ( '{' ) ;
    public final void rule__RadioButton__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1697:1: ( ( '{' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1698:1: ( '{' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1698:1: ( '{' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1699:1: '{'
            {
             before(grammarAccess.getRadioButtonAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__RadioButton__Group__2__Impl3334); 
             after(grammarAccess.getRadioButtonAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__RadioButton__Group__2__Impl"


    // $ANTLR start "rule__RadioButton__Group__3"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1712:1: rule__RadioButton__Group__3 : rule__RadioButton__Group__3__Impl rule__RadioButton__Group__4 ;
    public final void rule__RadioButton__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1716:1: ( rule__RadioButton__Group__3__Impl rule__RadioButton__Group__4 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1717:2: rule__RadioButton__Group__3__Impl rule__RadioButton__Group__4
            {
            pushFollow(FOLLOW_rule__RadioButton__Group__3__Impl_in_rule__RadioButton__Group__33365);
            rule__RadioButton__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RadioButton__Group__4_in_rule__RadioButton__Group__33368);
            rule__RadioButton__Group__4();

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
    // $ANTLR end "rule__RadioButton__Group__3"


    // $ANTLR start "rule__RadioButton__Group__3__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1724:1: rule__RadioButton__Group__3__Impl : ( ( rule__RadioButton__Group_3__0 )? ) ;
    public final void rule__RadioButton__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1728:1: ( ( ( rule__RadioButton__Group_3__0 )? ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1729:1: ( ( rule__RadioButton__Group_3__0 )? )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1729:1: ( ( rule__RadioButton__Group_3__0 )? )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1730:1: ( rule__RadioButton__Group_3__0 )?
            {
             before(grammarAccess.getRadioButtonAccess().getGroup_3()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1731:1: ( rule__RadioButton__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1731:2: rule__RadioButton__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__RadioButton__Group_3__0_in_rule__RadioButton__Group__3__Impl3395);
                    rule__RadioButton__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRadioButtonAccess().getGroup_3()); 

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
    // $ANTLR end "rule__RadioButton__Group__3__Impl"


    // $ANTLR start "rule__RadioButton__Group__4"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1741:1: rule__RadioButton__Group__4 : rule__RadioButton__Group__4__Impl ;
    public final void rule__RadioButton__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1745:1: ( rule__RadioButton__Group__4__Impl )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1746:2: rule__RadioButton__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__RadioButton__Group__4__Impl_in_rule__RadioButton__Group__43426);
            rule__RadioButton__Group__4__Impl();

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
    // $ANTLR end "rule__RadioButton__Group__4"


    // $ANTLR start "rule__RadioButton__Group__4__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1752:1: rule__RadioButton__Group__4__Impl : ( '}' ) ;
    public final void rule__RadioButton__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1756:1: ( ( '}' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1757:1: ( '}' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1757:1: ( '}' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1758:1: '}'
            {
             before(grammarAccess.getRadioButtonAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__RadioButton__Group__4__Impl3454); 
             after(grammarAccess.getRadioButtonAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__RadioButton__Group__4__Impl"


    // $ANTLR start "rule__RadioButton__Group_3__0"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1781:1: rule__RadioButton__Group_3__0 : rule__RadioButton__Group_3__0__Impl rule__RadioButton__Group_3__1 ;
    public final void rule__RadioButton__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1785:1: ( rule__RadioButton__Group_3__0__Impl rule__RadioButton__Group_3__1 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1786:2: rule__RadioButton__Group_3__0__Impl rule__RadioButton__Group_3__1
            {
            pushFollow(FOLLOW_rule__RadioButton__Group_3__0__Impl_in_rule__RadioButton__Group_3__03495);
            rule__RadioButton__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RadioButton__Group_3__1_in_rule__RadioButton__Group_3__03498);
            rule__RadioButton__Group_3__1();

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
    // $ANTLR end "rule__RadioButton__Group_3__0"


    // $ANTLR start "rule__RadioButton__Group_3__0__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1793:1: rule__RadioButton__Group_3__0__Impl : ( 'value' ) ;
    public final void rule__RadioButton__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1797:1: ( ( 'value' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1798:1: ( 'value' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1798:1: ( 'value' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1799:1: 'value'
            {
             before(grammarAccess.getRadioButtonAccess().getValueKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__RadioButton__Group_3__0__Impl3526); 
             after(grammarAccess.getRadioButtonAccess().getValueKeyword_3_0()); 

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
    // $ANTLR end "rule__RadioButton__Group_3__0__Impl"


    // $ANTLR start "rule__RadioButton__Group_3__1"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1812:1: rule__RadioButton__Group_3__1 : rule__RadioButton__Group_3__1__Impl ;
    public final void rule__RadioButton__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1816:1: ( rule__RadioButton__Group_3__1__Impl )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1817:2: rule__RadioButton__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__RadioButton__Group_3__1__Impl_in_rule__RadioButton__Group_3__13557);
            rule__RadioButton__Group_3__1__Impl();

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
    // $ANTLR end "rule__RadioButton__Group_3__1"


    // $ANTLR start "rule__RadioButton__Group_3__1__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1823:1: rule__RadioButton__Group_3__1__Impl : ( ( rule__RadioButton__ValueAssignment_3_1 ) ) ;
    public final void rule__RadioButton__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1827:1: ( ( ( rule__RadioButton__ValueAssignment_3_1 ) ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1828:1: ( ( rule__RadioButton__ValueAssignment_3_1 ) )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1828:1: ( ( rule__RadioButton__ValueAssignment_3_1 ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1829:1: ( rule__RadioButton__ValueAssignment_3_1 )
            {
             before(grammarAccess.getRadioButtonAccess().getValueAssignment_3_1()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1830:1: ( rule__RadioButton__ValueAssignment_3_1 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1830:2: rule__RadioButton__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__RadioButton__ValueAssignment_3_1_in_rule__RadioButton__Group_3__1__Impl3584);
            rule__RadioButton__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRadioButtonAccess().getValueAssignment_3_1()); 

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
    // $ANTLR end "rule__RadioButton__Group_3__1__Impl"


    // $ANTLR start "rule__TextField__Group__0"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1844:1: rule__TextField__Group__0 : rule__TextField__Group__0__Impl rule__TextField__Group__1 ;
    public final void rule__TextField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1848:1: ( rule__TextField__Group__0__Impl rule__TextField__Group__1 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1849:2: rule__TextField__Group__0__Impl rule__TextField__Group__1
            {
            pushFollow(FOLLOW_rule__TextField__Group__0__Impl_in_rule__TextField__Group__03618);
            rule__TextField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextField__Group__1_in_rule__TextField__Group__03621);
            rule__TextField__Group__1();

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
    // $ANTLR end "rule__TextField__Group__0"


    // $ANTLR start "rule__TextField__Group__0__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1856:1: rule__TextField__Group__0__Impl : ( () ) ;
    public final void rule__TextField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1860:1: ( ( () ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1861:1: ( () )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1861:1: ( () )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1862:1: ()
            {
             before(grammarAccess.getTextFieldAccess().getTextFieldAction_0()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1863:1: ()
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1865:1: 
            {
            }

             after(grammarAccess.getTextFieldAccess().getTextFieldAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__0__Impl"


    // $ANTLR start "rule__TextField__Group__1"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1875:1: rule__TextField__Group__1 : rule__TextField__Group__1__Impl rule__TextField__Group__2 ;
    public final void rule__TextField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1879:1: ( rule__TextField__Group__1__Impl rule__TextField__Group__2 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1880:2: rule__TextField__Group__1__Impl rule__TextField__Group__2
            {
            pushFollow(FOLLOW_rule__TextField__Group__1__Impl_in_rule__TextField__Group__13679);
            rule__TextField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextField__Group__2_in_rule__TextField__Group__13682);
            rule__TextField__Group__2();

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
    // $ANTLR end "rule__TextField__Group__1"


    // $ANTLR start "rule__TextField__Group__1__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1887:1: rule__TextField__Group__1__Impl : ( 'TextField' ) ;
    public final void rule__TextField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1891:1: ( ( 'TextField' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1892:1: ( 'TextField' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1892:1: ( 'TextField' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1893:1: 'TextField'
            {
             before(grammarAccess.getTextFieldAccess().getTextFieldKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__TextField__Group__1__Impl3710); 
             after(grammarAccess.getTextFieldAccess().getTextFieldKeyword_1()); 

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
    // $ANTLR end "rule__TextField__Group__1__Impl"


    // $ANTLR start "rule__TextField__Group__2"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1906:1: rule__TextField__Group__2 : rule__TextField__Group__2__Impl rule__TextField__Group__3 ;
    public final void rule__TextField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1910:1: ( rule__TextField__Group__2__Impl rule__TextField__Group__3 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1911:2: rule__TextField__Group__2__Impl rule__TextField__Group__3
            {
            pushFollow(FOLLOW_rule__TextField__Group__2__Impl_in_rule__TextField__Group__23741);
            rule__TextField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextField__Group__3_in_rule__TextField__Group__23744);
            rule__TextField__Group__3();

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
    // $ANTLR end "rule__TextField__Group__2"


    // $ANTLR start "rule__TextField__Group__2__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1918:1: rule__TextField__Group__2__Impl : ( '{' ) ;
    public final void rule__TextField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1922:1: ( ( '{' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1923:1: ( '{' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1923:1: ( '{' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1924:1: '{'
            {
             before(grammarAccess.getTextFieldAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__TextField__Group__2__Impl3772); 
             after(grammarAccess.getTextFieldAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__TextField__Group__2__Impl"


    // $ANTLR start "rule__TextField__Group__3"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1937:1: rule__TextField__Group__3 : rule__TextField__Group__3__Impl rule__TextField__Group__4 ;
    public final void rule__TextField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1941:1: ( rule__TextField__Group__3__Impl rule__TextField__Group__4 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1942:2: rule__TextField__Group__3__Impl rule__TextField__Group__4
            {
            pushFollow(FOLLOW_rule__TextField__Group__3__Impl_in_rule__TextField__Group__33803);
            rule__TextField__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextField__Group__4_in_rule__TextField__Group__33806);
            rule__TextField__Group__4();

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
    // $ANTLR end "rule__TextField__Group__3"


    // $ANTLR start "rule__TextField__Group__3__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1949:1: rule__TextField__Group__3__Impl : ( ( rule__TextField__Group_3__0 )? ) ;
    public final void rule__TextField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1953:1: ( ( ( rule__TextField__Group_3__0 )? ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1954:1: ( ( rule__TextField__Group_3__0 )? )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1954:1: ( ( rule__TextField__Group_3__0 )? )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1955:1: ( rule__TextField__Group_3__0 )?
            {
             before(grammarAccess.getTextFieldAccess().getGroup_3()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1956:1: ( rule__TextField__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1956:2: rule__TextField__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__TextField__Group_3__0_in_rule__TextField__Group__3__Impl3833);
                    rule__TextField__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextFieldAccess().getGroup_3()); 

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
    // $ANTLR end "rule__TextField__Group__3__Impl"


    // $ANTLR start "rule__TextField__Group__4"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1966:1: rule__TextField__Group__4 : rule__TextField__Group__4__Impl ;
    public final void rule__TextField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1970:1: ( rule__TextField__Group__4__Impl )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1971:2: rule__TextField__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TextField__Group__4__Impl_in_rule__TextField__Group__43864);
            rule__TextField__Group__4__Impl();

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
    // $ANTLR end "rule__TextField__Group__4"


    // $ANTLR start "rule__TextField__Group__4__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1977:1: rule__TextField__Group__4__Impl : ( '}' ) ;
    public final void rule__TextField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1981:1: ( ( '}' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1982:1: ( '}' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1982:1: ( '}' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:1983:1: '}'
            {
             before(grammarAccess.getTextFieldAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__TextField__Group__4__Impl3892); 
             after(grammarAccess.getTextFieldAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__TextField__Group__4__Impl"


    // $ANTLR start "rule__TextField__Group_3__0"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2006:1: rule__TextField__Group_3__0 : rule__TextField__Group_3__0__Impl rule__TextField__Group_3__1 ;
    public final void rule__TextField__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2010:1: ( rule__TextField__Group_3__0__Impl rule__TextField__Group_3__1 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2011:2: rule__TextField__Group_3__0__Impl rule__TextField__Group_3__1
            {
            pushFollow(FOLLOW_rule__TextField__Group_3__0__Impl_in_rule__TextField__Group_3__03933);
            rule__TextField__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextField__Group_3__1_in_rule__TextField__Group_3__03936);
            rule__TextField__Group_3__1();

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
    // $ANTLR end "rule__TextField__Group_3__0"


    // $ANTLR start "rule__TextField__Group_3__0__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2018:1: rule__TextField__Group_3__0__Impl : ( 'value' ) ;
    public final void rule__TextField__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2022:1: ( ( 'value' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2023:1: ( 'value' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2023:1: ( 'value' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2024:1: 'value'
            {
             before(grammarAccess.getTextFieldAccess().getValueKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__TextField__Group_3__0__Impl3964); 
             after(grammarAccess.getTextFieldAccess().getValueKeyword_3_0()); 

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
    // $ANTLR end "rule__TextField__Group_3__0__Impl"


    // $ANTLR start "rule__TextField__Group_3__1"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2037:1: rule__TextField__Group_3__1 : rule__TextField__Group_3__1__Impl ;
    public final void rule__TextField__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2041:1: ( rule__TextField__Group_3__1__Impl )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2042:2: rule__TextField__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__TextField__Group_3__1__Impl_in_rule__TextField__Group_3__13995);
            rule__TextField__Group_3__1__Impl();

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
    // $ANTLR end "rule__TextField__Group_3__1"


    // $ANTLR start "rule__TextField__Group_3__1__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2048:1: rule__TextField__Group_3__1__Impl : ( ( rule__TextField__ValueAssignment_3_1 ) ) ;
    public final void rule__TextField__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2052:1: ( ( ( rule__TextField__ValueAssignment_3_1 ) ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2053:1: ( ( rule__TextField__ValueAssignment_3_1 ) )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2053:1: ( ( rule__TextField__ValueAssignment_3_1 ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2054:1: ( rule__TextField__ValueAssignment_3_1 )
            {
             before(grammarAccess.getTextFieldAccess().getValueAssignment_3_1()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2055:1: ( rule__TextField__ValueAssignment_3_1 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2055:2: rule__TextField__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__TextField__ValueAssignment_3_1_in_rule__TextField__Group_3__1__Impl4022);
            rule__TextField__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTextFieldAccess().getValueAssignment_3_1()); 

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
    // $ANTLR end "rule__TextField__Group_3__1__Impl"


    // $ANTLR start "rule__ComboBox__Group__0"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2069:1: rule__ComboBox__Group__0 : rule__ComboBox__Group__0__Impl rule__ComboBox__Group__1 ;
    public final void rule__ComboBox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2073:1: ( rule__ComboBox__Group__0__Impl rule__ComboBox__Group__1 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2074:2: rule__ComboBox__Group__0__Impl rule__ComboBox__Group__1
            {
            pushFollow(FOLLOW_rule__ComboBox__Group__0__Impl_in_rule__ComboBox__Group__04056);
            rule__ComboBox__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComboBox__Group__1_in_rule__ComboBox__Group__04059);
            rule__ComboBox__Group__1();

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
    // $ANTLR end "rule__ComboBox__Group__0"


    // $ANTLR start "rule__ComboBox__Group__0__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2081:1: rule__ComboBox__Group__0__Impl : ( () ) ;
    public final void rule__ComboBox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2085:1: ( ( () ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2086:1: ( () )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2086:1: ( () )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2087:1: ()
            {
             before(grammarAccess.getComboBoxAccess().getComboBoxAction_0()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2088:1: ()
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2090:1: 
            {
            }

             after(grammarAccess.getComboBoxAccess().getComboBoxAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboBox__Group__0__Impl"


    // $ANTLR start "rule__ComboBox__Group__1"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2100:1: rule__ComboBox__Group__1 : rule__ComboBox__Group__1__Impl rule__ComboBox__Group__2 ;
    public final void rule__ComboBox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2104:1: ( rule__ComboBox__Group__1__Impl rule__ComboBox__Group__2 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2105:2: rule__ComboBox__Group__1__Impl rule__ComboBox__Group__2
            {
            pushFollow(FOLLOW_rule__ComboBox__Group__1__Impl_in_rule__ComboBox__Group__14117);
            rule__ComboBox__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComboBox__Group__2_in_rule__ComboBox__Group__14120);
            rule__ComboBox__Group__2();

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
    // $ANTLR end "rule__ComboBox__Group__1"


    // $ANTLR start "rule__ComboBox__Group__1__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2112:1: rule__ComboBox__Group__1__Impl : ( 'ComboBox' ) ;
    public final void rule__ComboBox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2116:1: ( ( 'ComboBox' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2117:1: ( 'ComboBox' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2117:1: ( 'ComboBox' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2118:1: 'ComboBox'
            {
             before(grammarAccess.getComboBoxAccess().getComboBoxKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__ComboBox__Group__1__Impl4148); 
             after(grammarAccess.getComboBoxAccess().getComboBoxKeyword_1()); 

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
    // $ANTLR end "rule__ComboBox__Group__1__Impl"


    // $ANTLR start "rule__ComboBox__Group__2"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2131:1: rule__ComboBox__Group__2 : rule__ComboBox__Group__2__Impl rule__ComboBox__Group__3 ;
    public final void rule__ComboBox__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2135:1: ( rule__ComboBox__Group__2__Impl rule__ComboBox__Group__3 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2136:2: rule__ComboBox__Group__2__Impl rule__ComboBox__Group__3
            {
            pushFollow(FOLLOW_rule__ComboBox__Group__2__Impl_in_rule__ComboBox__Group__24179);
            rule__ComboBox__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComboBox__Group__3_in_rule__ComboBox__Group__24182);
            rule__ComboBox__Group__3();

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
    // $ANTLR end "rule__ComboBox__Group__2"


    // $ANTLR start "rule__ComboBox__Group__2__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2143:1: rule__ComboBox__Group__2__Impl : ( '{' ) ;
    public final void rule__ComboBox__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2147:1: ( ( '{' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2148:1: ( '{' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2148:1: ( '{' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2149:1: '{'
            {
             before(grammarAccess.getComboBoxAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__ComboBox__Group__2__Impl4210); 
             after(grammarAccess.getComboBoxAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ComboBox__Group__2__Impl"


    // $ANTLR start "rule__ComboBox__Group__3"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2162:1: rule__ComboBox__Group__3 : rule__ComboBox__Group__3__Impl rule__ComboBox__Group__4 ;
    public final void rule__ComboBox__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2166:1: ( rule__ComboBox__Group__3__Impl rule__ComboBox__Group__4 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2167:2: rule__ComboBox__Group__3__Impl rule__ComboBox__Group__4
            {
            pushFollow(FOLLOW_rule__ComboBox__Group__3__Impl_in_rule__ComboBox__Group__34241);
            rule__ComboBox__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComboBox__Group__4_in_rule__ComboBox__Group__34244);
            rule__ComboBox__Group__4();

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
    // $ANTLR end "rule__ComboBox__Group__3"


    // $ANTLR start "rule__ComboBox__Group__3__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2174:1: rule__ComboBox__Group__3__Impl : ( ( rule__ComboBox__Group_3__0 )? ) ;
    public final void rule__ComboBox__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2178:1: ( ( ( rule__ComboBox__Group_3__0 )? ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2179:1: ( ( rule__ComboBox__Group_3__0 )? )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2179:1: ( ( rule__ComboBox__Group_3__0 )? )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2180:1: ( rule__ComboBox__Group_3__0 )?
            {
             before(grammarAccess.getComboBoxAccess().getGroup_3()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2181:1: ( rule__ComboBox__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2181:2: rule__ComboBox__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ComboBox__Group_3__0_in_rule__ComboBox__Group__3__Impl4271);
                    rule__ComboBox__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComboBoxAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ComboBox__Group__3__Impl"


    // $ANTLR start "rule__ComboBox__Group__4"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2191:1: rule__ComboBox__Group__4 : rule__ComboBox__Group__4__Impl ;
    public final void rule__ComboBox__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2195:1: ( rule__ComboBox__Group__4__Impl )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2196:2: rule__ComboBox__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ComboBox__Group__4__Impl_in_rule__ComboBox__Group__44302);
            rule__ComboBox__Group__4__Impl();

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
    // $ANTLR end "rule__ComboBox__Group__4"


    // $ANTLR start "rule__ComboBox__Group__4__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2202:1: rule__ComboBox__Group__4__Impl : ( '}' ) ;
    public final void rule__ComboBox__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2206:1: ( ( '}' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2207:1: ( '}' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2207:1: ( '}' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2208:1: '}'
            {
             before(grammarAccess.getComboBoxAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__ComboBox__Group__4__Impl4330); 
             after(grammarAccess.getComboBoxAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__ComboBox__Group__4__Impl"


    // $ANTLR start "rule__ComboBox__Group_3__0"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2231:1: rule__ComboBox__Group_3__0 : rule__ComboBox__Group_3__0__Impl rule__ComboBox__Group_3__1 ;
    public final void rule__ComboBox__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2235:1: ( rule__ComboBox__Group_3__0__Impl rule__ComboBox__Group_3__1 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2236:2: rule__ComboBox__Group_3__0__Impl rule__ComboBox__Group_3__1
            {
            pushFollow(FOLLOW_rule__ComboBox__Group_3__0__Impl_in_rule__ComboBox__Group_3__04371);
            rule__ComboBox__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComboBox__Group_3__1_in_rule__ComboBox__Group_3__04374);
            rule__ComboBox__Group_3__1();

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
    // $ANTLR end "rule__ComboBox__Group_3__0"


    // $ANTLR start "rule__ComboBox__Group_3__0__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2243:1: rule__ComboBox__Group_3__0__Impl : ( 'value' ) ;
    public final void rule__ComboBox__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2247:1: ( ( 'value' ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2248:1: ( 'value' )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2248:1: ( 'value' )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2249:1: 'value'
            {
             before(grammarAccess.getComboBoxAccess().getValueKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__ComboBox__Group_3__0__Impl4402); 
             after(grammarAccess.getComboBoxAccess().getValueKeyword_3_0()); 

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
    // $ANTLR end "rule__ComboBox__Group_3__0__Impl"


    // $ANTLR start "rule__ComboBox__Group_3__1"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2262:1: rule__ComboBox__Group_3__1 : rule__ComboBox__Group_3__1__Impl ;
    public final void rule__ComboBox__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2266:1: ( rule__ComboBox__Group_3__1__Impl )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2267:2: rule__ComboBox__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ComboBox__Group_3__1__Impl_in_rule__ComboBox__Group_3__14433);
            rule__ComboBox__Group_3__1__Impl();

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
    // $ANTLR end "rule__ComboBox__Group_3__1"


    // $ANTLR start "rule__ComboBox__Group_3__1__Impl"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2273:1: rule__ComboBox__Group_3__1__Impl : ( ( rule__ComboBox__ValueAssignment_3_1 ) ) ;
    public final void rule__ComboBox__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2277:1: ( ( ( rule__ComboBox__ValueAssignment_3_1 ) ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2278:1: ( ( rule__ComboBox__ValueAssignment_3_1 ) )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2278:1: ( ( rule__ComboBox__ValueAssignment_3_1 ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2279:1: ( rule__ComboBox__ValueAssignment_3_1 )
            {
             before(grammarAccess.getComboBoxAccess().getValueAssignment_3_1()); 
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2280:1: ( rule__ComboBox__ValueAssignment_3_1 )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2280:2: rule__ComboBox__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ComboBox__ValueAssignment_3_1_in_rule__ComboBox__Group_3__1__Impl4460);
            rule__ComboBox__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComboBoxAccess().getValueAssignment_3_1()); 

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
    // $ANTLR end "rule__ComboBox__Group_3__1__Impl"


    // $ANTLR start "rule__PollSystem__TitleAssignment_3_1"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2295:1: rule__PollSystem__TitleAssignment_3_1 : ( ruleEString ) ;
    public final void rule__PollSystem__TitleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2299:1: ( ( ruleEString ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2300:1: ( ruleEString )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2300:1: ( ruleEString )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2301:1: ruleEString
            {
             before(grammarAccess.getPollSystemAccess().getTitleEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__PollSystem__TitleAssignment_3_14499);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPollSystemAccess().getTitleEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__PollSystem__TitleAssignment_3_1"


    // $ANTLR start "rule__PollSystem__ModelsAssignment_4_2"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2310:1: rule__PollSystem__ModelsAssignment_4_2 : ( ruleUiModel ) ;
    public final void rule__PollSystem__ModelsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2314:1: ( ( ruleUiModel ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2315:1: ( ruleUiModel )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2315:1: ( ruleUiModel )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2316:1: ruleUiModel
            {
             before(grammarAccess.getPollSystemAccess().getModelsUiModelParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleUiModel_in_rule__PollSystem__ModelsAssignment_4_24530);
            ruleUiModel();

            state._fsp--;

             after(grammarAccess.getPollSystemAccess().getModelsUiModelParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__PollSystem__ModelsAssignment_4_2"


    // $ANTLR start "rule__PollSystem__ModelsAssignment_4_3_1"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2325:1: rule__PollSystem__ModelsAssignment_4_3_1 : ( ruleUiModel ) ;
    public final void rule__PollSystem__ModelsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2329:1: ( ( ruleUiModel ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2330:1: ( ruleUiModel )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2330:1: ( ruleUiModel )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2331:1: ruleUiModel
            {
             before(grammarAccess.getPollSystemAccess().getModelsUiModelParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_ruleUiModel_in_rule__PollSystem__ModelsAssignment_4_3_14561);
            ruleUiModel();

            state._fsp--;

             after(grammarAccess.getPollSystemAccess().getModelsUiModelParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__PollSystem__ModelsAssignment_4_3_1"


    // $ANTLR start "rule__UiModel__IdAssignment_3_1"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2340:1: rule__UiModel__IdAssignment_3_1 : ( ruleEString ) ;
    public final void rule__UiModel__IdAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2344:1: ( ( ruleEString ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2345:1: ( ruleEString )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2345:1: ( ruleEString )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2346:1: ruleEString
            {
             before(grammarAccess.getUiModelAccess().getIdEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__UiModel__IdAssignment_3_14592);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUiModelAccess().getIdEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__UiModel__IdAssignment_3_1"


    // $ANTLR start "rule__UiModel__LaQuestionAssignment_4_1"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2355:1: rule__UiModel__LaQuestionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__UiModel__LaQuestionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2359:1: ( ( ruleEString ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2360:1: ( ruleEString )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2360:1: ( ruleEString )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2361:1: ruleEString
            {
             before(grammarAccess.getUiModelAccess().getLaQuestionEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__UiModel__LaQuestionAssignment_4_14623);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUiModelAccess().getLaQuestionEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__UiModel__LaQuestionAssignment_4_1"


    // $ANTLR start "rule__UiModel__WidgetsAssignment_5_2"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2370:1: rule__UiModel__WidgetsAssignment_5_2 : ( ruleWidget ) ;
    public final void rule__UiModel__WidgetsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2374:1: ( ( ruleWidget ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2375:1: ( ruleWidget )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2375:1: ( ruleWidget )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2376:1: ruleWidget
            {
             before(grammarAccess.getUiModelAccess().getWidgetsWidgetParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_ruleWidget_in_rule__UiModel__WidgetsAssignment_5_24654);
            ruleWidget();

            state._fsp--;

             after(grammarAccess.getUiModelAccess().getWidgetsWidgetParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__UiModel__WidgetsAssignment_5_2"


    // $ANTLR start "rule__UiModel__WidgetsAssignment_5_3_1"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2385:1: rule__UiModel__WidgetsAssignment_5_3_1 : ( ruleWidget ) ;
    public final void rule__UiModel__WidgetsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2389:1: ( ( ruleWidget ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2390:1: ( ruleWidget )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2390:1: ( ruleWidget )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2391:1: ruleWidget
            {
             before(grammarAccess.getUiModelAccess().getWidgetsWidgetParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_ruleWidget_in_rule__UiModel__WidgetsAssignment_5_3_14685);
            ruleWidget();

            state._fsp--;

             after(grammarAccess.getUiModelAccess().getWidgetsWidgetParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__UiModel__WidgetsAssignment_5_3_1"


    // $ANTLR start "rule__CheckBox__ValueAssignment_3_1"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2400:1: rule__CheckBox__ValueAssignment_3_1 : ( ruleEString ) ;
    public final void rule__CheckBox__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2404:1: ( ( ruleEString ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2405:1: ( ruleEString )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2405:1: ( ruleEString )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2406:1: ruleEString
            {
             before(grammarAccess.getCheckBoxAccess().getValueEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__CheckBox__ValueAssignment_3_14716);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCheckBoxAccess().getValueEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__CheckBox__ValueAssignment_3_1"


    // $ANTLR start "rule__RadioButton__ValueAssignment_3_1"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2415:1: rule__RadioButton__ValueAssignment_3_1 : ( ruleEString ) ;
    public final void rule__RadioButton__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2419:1: ( ( ruleEString ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2420:1: ( ruleEString )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2420:1: ( ruleEString )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2421:1: ruleEString
            {
             before(grammarAccess.getRadioButtonAccess().getValueEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__RadioButton__ValueAssignment_3_14747);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRadioButtonAccess().getValueEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__RadioButton__ValueAssignment_3_1"


    // $ANTLR start "rule__TextField__ValueAssignment_3_1"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2430:1: rule__TextField__ValueAssignment_3_1 : ( ruleEString ) ;
    public final void rule__TextField__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2434:1: ( ( ruleEString ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2435:1: ( ruleEString )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2435:1: ( ruleEString )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2436:1: ruleEString
            {
             before(grammarAccess.getTextFieldAccess().getValueEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__TextField__ValueAssignment_3_14778);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTextFieldAccess().getValueEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__TextField__ValueAssignment_3_1"


    // $ANTLR start "rule__ComboBox__ValueAssignment_3_1"
    // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2445:1: rule__ComboBox__ValueAssignment_3_1 : ( ruleEString ) ;
    public final void rule__ComboBox__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2449:1: ( ( ruleEString ) )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2450:1: ( ruleEString )
            {
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2450:1: ( ruleEString )
            // ../fr.istic.idm.PivotMM.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalPivotMMDsl.g:2451:1: ruleEString
            {
             before(grammarAccess.getComboBoxAccess().getValueEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__ComboBox__ValueAssignment_3_14809);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComboBoxAccess().getValueEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ComboBox__ValueAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePollSystem_in_entryRulePollSystem61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePollSystem68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PollSystem__Group__0_in_rulePollSystem94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWidget_in_entryRuleWidget121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWidget128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__Alternatives_in_ruleWidget154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUiModel_in_entryRuleUiModel181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUiModel188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UiModel__Group__0_in_ruleUiModel214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckBox_in_entryRuleCheckBox301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckBox308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckBox__Group__0_in_ruleCheckBox334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioButton_in_entryRuleRadioButton361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRadioButton368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioButton__Group__0_in_ruleRadioButton394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextField_in_entryRuleTextField421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextField428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextField__Group__0_in_ruleTextField454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComboBox_in_entryRuleComboBox481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComboBox488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComboBox__Group__0_in_ruleComboBox514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckBox_in_rule__Widget__Alternatives550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadioButton_in_rule__Widget__Alternatives567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextField_in_rule__Widget__Alternatives584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComboBox_in_rule__Widget__Alternatives601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PollSystem__Group__0__Impl_in_rule__PollSystem__Group__0680 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__PollSystem__Group__1_in_rule__PollSystem__Group__0683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PollSystem__Group__1__Impl_in_rule__PollSystem__Group__1741 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__PollSystem__Group__2_in_rule__PollSystem__Group__1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__PollSystem__Group__1__Impl772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PollSystem__Group__2__Impl_in_rule__PollSystem__Group__2803 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_rule__PollSystem__Group__3_in_rule__PollSystem__Group__2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__PollSystem__Group__2__Impl834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PollSystem__Group__3__Impl_in_rule__PollSystem__Group__3865 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_rule__PollSystem__Group__4_in_rule__PollSystem__Group__3868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PollSystem__Group_3__0_in_rule__PollSystem__Group__3__Impl895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PollSystem__Group__4__Impl_in_rule__PollSystem__Group__4926 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_rule__PollSystem__Group__5_in_rule__PollSystem__Group__4929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PollSystem__Group_4__0_in_rule__PollSystem__Group__4__Impl956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PollSystem__Group__5__Impl_in_rule__PollSystem__Group__5987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PollSystem__Group__5__Impl1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PollSystem__Group_3__0__Impl_in_rule__PollSystem__Group_3__01058 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__PollSystem__Group_3__1_in_rule__PollSystem__Group_3__01061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PollSystem__Group_3__0__Impl1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PollSystem__Group_3__1__Impl_in_rule__PollSystem__Group_3__11120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PollSystem__TitleAssignment_3_1_in_rule__PollSystem__Group_3__1__Impl1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PollSystem__Group_4__0__Impl_in_rule__PollSystem__Group_4__01181 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__PollSystem__Group_4__1_in_rule__PollSystem__Group_4__01184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PollSystem__Group_4__0__Impl1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PollSystem__Group_4__1__Impl_in_rule__PollSystem__Group_4__11243 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__PollSystem__Group_4__2_in_rule__PollSystem__Group_4__11246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__PollSystem__Group_4__1__Impl1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PollSystem__Group_4__2__Impl_in_rule__PollSystem__Group_4__21305 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__PollSystem__Group_4__3_in_rule__PollSystem__Group_4__21308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PollSystem__ModelsAssignment_4_2_in_rule__PollSystem__Group_4__2__Impl1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PollSystem__Group_4__3__Impl_in_rule__PollSystem__Group_4__31365 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__PollSystem__Group_4__4_in_rule__PollSystem__Group_4__31368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PollSystem__Group_4_3__0_in_rule__PollSystem__Group_4__3__Impl1395 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__PollSystem__Group_4__4__Impl_in_rule__PollSystem__Group_4__41426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PollSystem__Group_4__4__Impl1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PollSystem__Group_4_3__0__Impl_in_rule__PollSystem__Group_4_3__01495 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__PollSystem__Group_4_3__1_in_rule__PollSystem__Group_4_3__01498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PollSystem__Group_4_3__0__Impl1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PollSystem__Group_4_3__1__Impl_in_rule__PollSystem__Group_4_3__11557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PollSystem__ModelsAssignment_4_3_1_in_rule__PollSystem__Group_4_3__1__Impl1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UiModel__Group__0__Impl_in_rule__UiModel__Group__01618 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__UiModel__Group__1_in_rule__UiModel__Group__01621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UiModel__Group__1__Impl_in_rule__UiModel__Group__11679 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__UiModel__Group__2_in_rule__UiModel__Group__11682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__UiModel__Group__1__Impl1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UiModel__Group__2__Impl_in_rule__UiModel__Group__21741 = new BitSet(new long[]{0x00000000001C2000L});
    public static final BitSet FOLLOW_rule__UiModel__Group__3_in_rule__UiModel__Group__21744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__UiModel__Group__2__Impl1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UiModel__Group__3__Impl_in_rule__UiModel__Group__31803 = new BitSet(new long[]{0x00000000001C2000L});
    public static final BitSet FOLLOW_rule__UiModel__Group__4_in_rule__UiModel__Group__31806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UiModel__Group_3__0_in_rule__UiModel__Group__3__Impl1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UiModel__Group__4__Impl_in_rule__UiModel__Group__41864 = new BitSet(new long[]{0x00000000001C2000L});
    public static final BitSet FOLLOW_rule__UiModel__Group__5_in_rule__UiModel__Group__41867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UiModel__Group_4__0_in_rule__UiModel__Group__4__Impl1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UiModel__Group__5__Impl_in_rule__UiModel__Group__51925 = new BitSet(new long[]{0x00000000001C2000L});
    public static final BitSet FOLLOW_rule__UiModel__Group__6_in_rule__UiModel__Group__51928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UiModel__Group_5__0_in_rule__UiModel__Group__5__Impl1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UiModel__Group__6__Impl_in_rule__UiModel__Group__61986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__UiModel__Group__6__Impl2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UiModel__Group_3__0__Impl_in_rule__UiModel__Group_3__02059 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__UiModel__Group_3__1_in_rule__UiModel__Group_3__02062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__UiModel__Group_3__0__Impl2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UiModel__Group_3__1__Impl_in_rule__UiModel__Group_3__12121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UiModel__IdAssignment_3_1_in_rule__UiModel__Group_3__1__Impl2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UiModel__Group_4__0__Impl_in_rule__UiModel__Group_4__02182 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__UiModel__Group_4__1_in_rule__UiModel__Group_4__02185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__UiModel__Group_4__0__Impl2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UiModel__Group_4__1__Impl_in_rule__UiModel__Group_4__12244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UiModel__LaQuestionAssignment_4_1_in_rule__UiModel__Group_4__1__Impl2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UiModel__Group_5__0__Impl_in_rule__UiModel__Group_5__02305 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__UiModel__Group_5__1_in_rule__UiModel__Group_5__02308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__UiModel__Group_5__0__Impl2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UiModel__Group_5__1__Impl_in_rule__UiModel__Group_5__12367 = new BitSet(new long[]{0x0000000003A00000L});
    public static final BitSet FOLLOW_rule__UiModel__Group_5__2_in_rule__UiModel__Group_5__12370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__UiModel__Group_5__1__Impl2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UiModel__Group_5__2__Impl_in_rule__UiModel__Group_5__22429 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__UiModel__Group_5__3_in_rule__UiModel__Group_5__22432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UiModel__WidgetsAssignment_5_2_in_rule__UiModel__Group_5__2__Impl2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UiModel__Group_5__3__Impl_in_rule__UiModel__Group_5__32489 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__UiModel__Group_5__4_in_rule__UiModel__Group_5__32492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UiModel__Group_5_3__0_in_rule__UiModel__Group_5__3__Impl2519 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__UiModel__Group_5__4__Impl_in_rule__UiModel__Group_5__42550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__UiModel__Group_5__4__Impl2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UiModel__Group_5_3__0__Impl_in_rule__UiModel__Group_5_3__02619 = new BitSet(new long[]{0x0000000003A00000L});
    public static final BitSet FOLLOW_rule__UiModel__Group_5_3__1_in_rule__UiModel__Group_5_3__02622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__UiModel__Group_5_3__0__Impl2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UiModel__Group_5_3__1__Impl_in_rule__UiModel__Group_5_3__12681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UiModel__WidgetsAssignment_5_3_1_in_rule__UiModel__Group_5_3__1__Impl2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckBox__Group__0__Impl_in_rule__CheckBox__Group__02742 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__CheckBox__Group__1_in_rule__CheckBox__Group__02745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckBox__Group__1__Impl_in_rule__CheckBox__Group__12803 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__CheckBox__Group__2_in_rule__CheckBox__Group__12806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CheckBox__Group__1__Impl2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckBox__Group__2__Impl_in_rule__CheckBox__Group__22865 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_rule__CheckBox__Group__3_in_rule__CheckBox__Group__22868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CheckBox__Group__2__Impl2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckBox__Group__3__Impl_in_rule__CheckBox__Group__32927 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_rule__CheckBox__Group__4_in_rule__CheckBox__Group__32930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckBox__Group_3__0_in_rule__CheckBox__Group__3__Impl2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckBox__Group__4__Impl_in_rule__CheckBox__Group__42988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CheckBox__Group__4__Impl3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckBox__Group_3__0__Impl_in_rule__CheckBox__Group_3__03057 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__CheckBox__Group_3__1_in_rule__CheckBox__Group_3__03060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CheckBox__Group_3__0__Impl3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckBox__Group_3__1__Impl_in_rule__CheckBox__Group_3__13119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckBox__ValueAssignment_3_1_in_rule__CheckBox__Group_3__1__Impl3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioButton__Group__0__Impl_in_rule__RadioButton__Group__03180 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RadioButton__Group__1_in_rule__RadioButton__Group__03183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioButton__Group__1__Impl_in_rule__RadioButton__Group__13241 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__RadioButton__Group__2_in_rule__RadioButton__Group__13244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RadioButton__Group__1__Impl3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioButton__Group__2__Impl_in_rule__RadioButton__Group__23303 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_rule__RadioButton__Group__3_in_rule__RadioButton__Group__23306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RadioButton__Group__2__Impl3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioButton__Group__3__Impl_in_rule__RadioButton__Group__33365 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_rule__RadioButton__Group__4_in_rule__RadioButton__Group__33368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioButton__Group_3__0_in_rule__RadioButton__Group__3__Impl3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioButton__Group__4__Impl_in_rule__RadioButton__Group__43426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RadioButton__Group__4__Impl3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioButton__Group_3__0__Impl_in_rule__RadioButton__Group_3__03495 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__RadioButton__Group_3__1_in_rule__RadioButton__Group_3__03498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RadioButton__Group_3__0__Impl3526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioButton__Group_3__1__Impl_in_rule__RadioButton__Group_3__13557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RadioButton__ValueAssignment_3_1_in_rule__RadioButton__Group_3__1__Impl3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextField__Group__0__Impl_in_rule__TextField__Group__03618 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__TextField__Group__1_in_rule__TextField__Group__03621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextField__Group__1__Impl_in_rule__TextField__Group__13679 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__TextField__Group__2_in_rule__TextField__Group__13682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TextField__Group__1__Impl3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextField__Group__2__Impl_in_rule__TextField__Group__23741 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_rule__TextField__Group__3_in_rule__TextField__Group__23744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__TextField__Group__2__Impl3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextField__Group__3__Impl_in_rule__TextField__Group__33803 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_rule__TextField__Group__4_in_rule__TextField__Group__33806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextField__Group_3__0_in_rule__TextField__Group__3__Impl3833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextField__Group__4__Impl_in_rule__TextField__Group__43864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__TextField__Group__4__Impl3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextField__Group_3__0__Impl_in_rule__TextField__Group_3__03933 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__TextField__Group_3__1_in_rule__TextField__Group_3__03936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TextField__Group_3__0__Impl3964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextField__Group_3__1__Impl_in_rule__TextField__Group_3__13995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextField__ValueAssignment_3_1_in_rule__TextField__Group_3__1__Impl4022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComboBox__Group__0__Impl_in_rule__ComboBox__Group__04056 = new BitSet(new long[]{0x0000000003A00000L});
    public static final BitSet FOLLOW_rule__ComboBox__Group__1_in_rule__ComboBox__Group__04059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComboBox__Group__1__Impl_in_rule__ComboBox__Group__14117 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ComboBox__Group__2_in_rule__ComboBox__Group__14120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ComboBox__Group__1__Impl4148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComboBox__Group__2__Impl_in_rule__ComboBox__Group__24179 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_rule__ComboBox__Group__3_in_rule__ComboBox__Group__24182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ComboBox__Group__2__Impl4210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComboBox__Group__3__Impl_in_rule__ComboBox__Group__34241 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_rule__ComboBox__Group__4_in_rule__ComboBox__Group__34244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComboBox__Group_3__0_in_rule__ComboBox__Group__3__Impl4271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComboBox__Group__4__Impl_in_rule__ComboBox__Group__44302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ComboBox__Group__4__Impl4330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComboBox__Group_3__0__Impl_in_rule__ComboBox__Group_3__04371 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ComboBox__Group_3__1_in_rule__ComboBox__Group_3__04374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ComboBox__Group_3__0__Impl4402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComboBox__Group_3__1__Impl_in_rule__ComboBox__Group_3__14433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComboBox__ValueAssignment_3_1_in_rule__ComboBox__Group_3__1__Impl4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__PollSystem__TitleAssignment_3_14499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUiModel_in_rule__PollSystem__ModelsAssignment_4_24530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUiModel_in_rule__PollSystem__ModelsAssignment_4_3_14561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__UiModel__IdAssignment_3_14592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__UiModel__LaQuestionAssignment_4_14623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWidget_in_rule__UiModel__WidgetsAssignment_5_24654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWidget_in_rule__UiModel__WidgetsAssignment_5_3_14685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__CheckBox__ValueAssignment_3_14716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__RadioButton__ValueAssignment_3_14747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__TextField__ValueAssignment_3_14778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__ComboBox__ValueAssignment_3_14809 = new BitSet(new long[]{0x0000000000000002L});

}