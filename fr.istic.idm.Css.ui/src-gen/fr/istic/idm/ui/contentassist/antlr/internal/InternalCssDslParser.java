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
import fr.istic.idm.services.CssDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCssDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CheckBox'", "'ComboBox'", "'TextField'", "'RadioButton'", "'Css '", "'{'", "'}'", "'=>'"
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
    public String getGrammarFileName() { return "../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g"; }


     
     	private CssDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CssDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleCss"
    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:60:1: entryRuleCss : ruleCss EOF ;
    public final void entryRuleCss() throws RecognitionException {
        try {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:61:1: ( ruleCss EOF )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:62:1: ruleCss EOF
            {
             before(grammarAccess.getCssRule()); 
            pushFollow(FOLLOW_ruleCss_in_entryRuleCss61);
            ruleCss();

            state._fsp--;

             after(grammarAccess.getCssRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCss68); 

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
    // $ANTLR end "entryRuleCss"


    // $ANTLR start "ruleCss"
    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:69:1: ruleCss : ( ( rule__Css__Group__0 ) ) ;
    public final void ruleCss() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:73:2: ( ( ( rule__Css__Group__0 ) ) )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:74:1: ( ( rule__Css__Group__0 ) )
            {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:74:1: ( ( rule__Css__Group__0 ) )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:75:1: ( rule__Css__Group__0 )
            {
             before(grammarAccess.getCssAccess().getGroup()); 
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:76:1: ( rule__Css__Group__0 )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:76:2: rule__Css__Group__0
            {
            pushFollow(FOLLOW_rule__Css__Group__0_in_ruleCss94);
            rule__Css__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCssAccess().getGroup()); 

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
    // $ANTLR end "ruleCss"


    // $ANTLR start "entryRuleWidget"
    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:88:1: entryRuleWidget : ruleWidget EOF ;
    public final void entryRuleWidget() throws RecognitionException {
        try {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:89:1: ( ruleWidget EOF )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:90:1: ruleWidget EOF
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
    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:97:1: ruleWidget : ( ( rule__Widget__Group__0 ) ) ;
    public final void ruleWidget() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:101:2: ( ( ( rule__Widget__Group__0 ) ) )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:102:1: ( ( rule__Widget__Group__0 ) )
            {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:102:1: ( ( rule__Widget__Group__0 ) )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:103:1: ( rule__Widget__Group__0 )
            {
             before(grammarAccess.getWidgetAccess().getGroup()); 
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:104:1: ( rule__Widget__Group__0 )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:104:2: rule__Widget__Group__0
            {
            pushFollow(FOLLOW_rule__Widget__Group__0_in_ruleWidget154);
            rule__Widget__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWidgetAccess().getGroup()); 

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


    // $ANTLR start "rule__Widget__ValueAlternatives_2_0"
    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:116:1: rule__Widget__ValueAlternatives_2_0 : ( ( 'CheckBox' ) | ( 'ComboBox' ) | ( 'TextField' ) | ( 'RadioButton' ) );
    public final void rule__Widget__ValueAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:120:1: ( ( 'CheckBox' ) | ( 'ComboBox' ) | ( 'TextField' ) | ( 'RadioButton' ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
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
                    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:121:1: ( 'CheckBox' )
                    {
                    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:121:1: ( 'CheckBox' )
                    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:122:1: 'CheckBox'
                    {
                     before(grammarAccess.getWidgetAccess().getValueCheckBoxKeyword_2_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Widget__ValueAlternatives_2_0191); 
                     after(grammarAccess.getWidgetAccess().getValueCheckBoxKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:129:6: ( 'ComboBox' )
                    {
                    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:129:6: ( 'ComboBox' )
                    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:130:1: 'ComboBox'
                    {
                     before(grammarAccess.getWidgetAccess().getValueComboBoxKeyword_2_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Widget__ValueAlternatives_2_0211); 
                     after(grammarAccess.getWidgetAccess().getValueComboBoxKeyword_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:137:6: ( 'TextField' )
                    {
                    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:137:6: ( 'TextField' )
                    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:138:1: 'TextField'
                    {
                     before(grammarAccess.getWidgetAccess().getValueTextFieldKeyword_2_0_2()); 
                    match(input,13,FOLLOW_13_in_rule__Widget__ValueAlternatives_2_0231); 
                     after(grammarAccess.getWidgetAccess().getValueTextFieldKeyword_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:145:6: ( 'RadioButton' )
                    {
                    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:145:6: ( 'RadioButton' )
                    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:146:1: 'RadioButton'
                    {
                     before(grammarAccess.getWidgetAccess().getValueRadioButtonKeyword_2_0_3()); 
                    match(input,14,FOLLOW_14_in_rule__Widget__ValueAlternatives_2_0251); 
                     after(grammarAccess.getWidgetAccess().getValueRadioButtonKeyword_2_0_3()); 

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
    // $ANTLR end "rule__Widget__ValueAlternatives_2_0"


    // $ANTLR start "rule__Css__Group__0"
    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:160:1: rule__Css__Group__0 : rule__Css__Group__0__Impl rule__Css__Group__1 ;
    public final void rule__Css__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:164:1: ( rule__Css__Group__0__Impl rule__Css__Group__1 )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:165:2: rule__Css__Group__0__Impl rule__Css__Group__1
            {
            pushFollow(FOLLOW_rule__Css__Group__0__Impl_in_rule__Css__Group__0283);
            rule__Css__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css__Group__1_in_rule__Css__Group__0286);
            rule__Css__Group__1();

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
    // $ANTLR end "rule__Css__Group__0"


    // $ANTLR start "rule__Css__Group__0__Impl"
    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:172:1: rule__Css__Group__0__Impl : ( 'Css ' ) ;
    public final void rule__Css__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:176:1: ( ( 'Css ' ) )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:177:1: ( 'Css ' )
            {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:177:1: ( 'Css ' )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:178:1: 'Css '
            {
             before(grammarAccess.getCssAccess().getCssKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Css__Group__0__Impl314); 
             after(grammarAccess.getCssAccess().getCssKeyword_0()); 

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
    // $ANTLR end "rule__Css__Group__0__Impl"


    // $ANTLR start "rule__Css__Group__1"
    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:191:1: rule__Css__Group__1 : rule__Css__Group__1__Impl rule__Css__Group__2 ;
    public final void rule__Css__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:195:1: ( rule__Css__Group__1__Impl rule__Css__Group__2 )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:196:2: rule__Css__Group__1__Impl rule__Css__Group__2
            {
            pushFollow(FOLLOW_rule__Css__Group__1__Impl_in_rule__Css__Group__1345);
            rule__Css__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css__Group__2_in_rule__Css__Group__1348);
            rule__Css__Group__2();

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
    // $ANTLR end "rule__Css__Group__1"


    // $ANTLR start "rule__Css__Group__1__Impl"
    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:203:1: rule__Css__Group__1__Impl : ( '{' ) ;
    public final void rule__Css__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:207:1: ( ( '{' ) )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:208:1: ( '{' )
            {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:208:1: ( '{' )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:209:1: '{'
            {
             before(grammarAccess.getCssAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__Css__Group__1__Impl376); 
             after(grammarAccess.getCssAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Css__Group__1__Impl"


    // $ANTLR start "rule__Css__Group__2"
    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:222:1: rule__Css__Group__2 : rule__Css__Group__2__Impl rule__Css__Group__3 ;
    public final void rule__Css__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:226:1: ( rule__Css__Group__2__Impl rule__Css__Group__3 )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:227:2: rule__Css__Group__2__Impl rule__Css__Group__3
            {
            pushFollow(FOLLOW_rule__Css__Group__2__Impl_in_rule__Css__Group__2407);
            rule__Css__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css__Group__3_in_rule__Css__Group__2410);
            rule__Css__Group__3();

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
    // $ANTLR end "rule__Css__Group__2"


    // $ANTLR start "rule__Css__Group__2__Impl"
    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:234:1: rule__Css__Group__2__Impl : ( ( ( rule__Css__CssAssignment_2 ) ) ( ( rule__Css__CssAssignment_2 )* ) ) ;
    public final void rule__Css__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:238:1: ( ( ( ( rule__Css__CssAssignment_2 ) ) ( ( rule__Css__CssAssignment_2 )* ) ) )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:239:1: ( ( ( rule__Css__CssAssignment_2 ) ) ( ( rule__Css__CssAssignment_2 )* ) )
            {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:239:1: ( ( ( rule__Css__CssAssignment_2 ) ) ( ( rule__Css__CssAssignment_2 )* ) )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:240:1: ( ( rule__Css__CssAssignment_2 ) ) ( ( rule__Css__CssAssignment_2 )* )
            {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:240:1: ( ( rule__Css__CssAssignment_2 ) )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:241:1: ( rule__Css__CssAssignment_2 )
            {
             before(grammarAccess.getCssAccess().getCssAssignment_2()); 
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:242:1: ( rule__Css__CssAssignment_2 )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:242:2: rule__Css__CssAssignment_2
            {
            pushFollow(FOLLOW_rule__Css__CssAssignment_2_in_rule__Css__Group__2__Impl439);
            rule__Css__CssAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCssAccess().getCssAssignment_2()); 

            }

            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:245:1: ( ( rule__Css__CssAssignment_2 )* )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:246:1: ( rule__Css__CssAssignment_2 )*
            {
             before(grammarAccess.getCssAccess().getCssAssignment_2()); 
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:247:1: ( rule__Css__CssAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:247:2: rule__Css__CssAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Css__CssAssignment_2_in_rule__Css__Group__2__Impl451);
            	    rule__Css__CssAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getCssAccess().getCssAssignment_2()); 

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
    // $ANTLR end "rule__Css__Group__2__Impl"


    // $ANTLR start "rule__Css__Group__3"
    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:258:1: rule__Css__Group__3 : rule__Css__Group__3__Impl ;
    public final void rule__Css__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:262:1: ( rule__Css__Group__3__Impl )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:263:2: rule__Css__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Css__Group__3__Impl_in_rule__Css__Group__3484);
            rule__Css__Group__3__Impl();

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
    // $ANTLR end "rule__Css__Group__3"


    // $ANTLR start "rule__Css__Group__3__Impl"
    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:269:1: rule__Css__Group__3__Impl : ( '}' ) ;
    public final void rule__Css__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:273:1: ( ( '}' ) )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:274:1: ( '}' )
            {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:274:1: ( '}' )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:275:1: '}'
            {
             before(grammarAccess.getCssAccess().getRightCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Css__Group__3__Impl512); 
             after(grammarAccess.getCssAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Css__Group__3__Impl"


    // $ANTLR start "rule__Widget__Group__0"
    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:296:1: rule__Widget__Group__0 : rule__Widget__Group__0__Impl rule__Widget__Group__1 ;
    public final void rule__Widget__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:300:1: ( rule__Widget__Group__0__Impl rule__Widget__Group__1 )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:301:2: rule__Widget__Group__0__Impl rule__Widget__Group__1
            {
            pushFollow(FOLLOW_rule__Widget__Group__0__Impl_in_rule__Widget__Group__0551);
            rule__Widget__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Widget__Group__1_in_rule__Widget__Group__0554);
            rule__Widget__Group__1();

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
    // $ANTLR end "rule__Widget__Group__0"


    // $ANTLR start "rule__Widget__Group__0__Impl"
    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:308:1: rule__Widget__Group__0__Impl : ( ( rule__Widget__IdAssignment_0 ) ) ;
    public final void rule__Widget__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:312:1: ( ( ( rule__Widget__IdAssignment_0 ) ) )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:313:1: ( ( rule__Widget__IdAssignment_0 ) )
            {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:313:1: ( ( rule__Widget__IdAssignment_0 ) )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:314:1: ( rule__Widget__IdAssignment_0 )
            {
             before(grammarAccess.getWidgetAccess().getIdAssignment_0()); 
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:315:1: ( rule__Widget__IdAssignment_0 )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:315:2: rule__Widget__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__Widget__IdAssignment_0_in_rule__Widget__Group__0__Impl581);
            rule__Widget__IdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWidgetAccess().getIdAssignment_0()); 

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
    // $ANTLR end "rule__Widget__Group__0__Impl"


    // $ANTLR start "rule__Widget__Group__1"
    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:325:1: rule__Widget__Group__1 : rule__Widget__Group__1__Impl rule__Widget__Group__2 ;
    public final void rule__Widget__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:329:1: ( rule__Widget__Group__1__Impl rule__Widget__Group__2 )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:330:2: rule__Widget__Group__1__Impl rule__Widget__Group__2
            {
            pushFollow(FOLLOW_rule__Widget__Group__1__Impl_in_rule__Widget__Group__1611);
            rule__Widget__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Widget__Group__2_in_rule__Widget__Group__1614);
            rule__Widget__Group__2();

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
    // $ANTLR end "rule__Widget__Group__1"


    // $ANTLR start "rule__Widget__Group__1__Impl"
    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:337:1: rule__Widget__Group__1__Impl : ( '=>' ) ;
    public final void rule__Widget__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:341:1: ( ( '=>' ) )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:342:1: ( '=>' )
            {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:342:1: ( '=>' )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:343:1: '=>'
            {
             before(grammarAccess.getWidgetAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Widget__Group__1__Impl642); 
             after(grammarAccess.getWidgetAccess().getEqualsSignGreaterThanSignKeyword_1()); 

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
    // $ANTLR end "rule__Widget__Group__1__Impl"


    // $ANTLR start "rule__Widget__Group__2"
    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:356:1: rule__Widget__Group__2 : rule__Widget__Group__2__Impl ;
    public final void rule__Widget__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:360:1: ( rule__Widget__Group__2__Impl )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:361:2: rule__Widget__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Widget__Group__2__Impl_in_rule__Widget__Group__2673);
            rule__Widget__Group__2__Impl();

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
    // $ANTLR end "rule__Widget__Group__2"


    // $ANTLR start "rule__Widget__Group__2__Impl"
    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:367:1: rule__Widget__Group__2__Impl : ( ( rule__Widget__ValueAssignment_2 ) ) ;
    public final void rule__Widget__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:371:1: ( ( ( rule__Widget__ValueAssignment_2 ) ) )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:372:1: ( ( rule__Widget__ValueAssignment_2 ) )
            {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:372:1: ( ( rule__Widget__ValueAssignment_2 ) )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:373:1: ( rule__Widget__ValueAssignment_2 )
            {
             before(grammarAccess.getWidgetAccess().getValueAssignment_2()); 
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:374:1: ( rule__Widget__ValueAssignment_2 )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:374:2: rule__Widget__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Widget__ValueAssignment_2_in_rule__Widget__Group__2__Impl700);
            rule__Widget__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWidgetAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__Widget__Group__2__Impl"


    // $ANTLR start "rule__Css__CssAssignment_2"
    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:391:1: rule__Css__CssAssignment_2 : ( ruleWidget ) ;
    public final void rule__Css__CssAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:395:1: ( ( ruleWidget ) )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:396:1: ( ruleWidget )
            {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:396:1: ( ruleWidget )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:397:1: ruleWidget
            {
             before(grammarAccess.getCssAccess().getCssWidgetParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleWidget_in_rule__Css__CssAssignment_2741);
            ruleWidget();

            state._fsp--;

             after(grammarAccess.getCssAccess().getCssWidgetParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Css__CssAssignment_2"


    // $ANTLR start "rule__Widget__IdAssignment_0"
    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:406:1: rule__Widget__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__Widget__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:410:1: ( ( RULE_ID ) )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:411:1: ( RULE_ID )
            {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:411:1: ( RULE_ID )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:412:1: RULE_ID
            {
             before(grammarAccess.getWidgetAccess().getIdIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Widget__IdAssignment_0772); 
             after(grammarAccess.getWidgetAccess().getIdIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Widget__IdAssignment_0"


    // $ANTLR start "rule__Widget__ValueAssignment_2"
    // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:421:1: rule__Widget__ValueAssignment_2 : ( ( rule__Widget__ValueAlternatives_2_0 ) ) ;
    public final void rule__Widget__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:425:1: ( ( ( rule__Widget__ValueAlternatives_2_0 ) ) )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:426:1: ( ( rule__Widget__ValueAlternatives_2_0 ) )
            {
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:426:1: ( ( rule__Widget__ValueAlternatives_2_0 ) )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:427:1: ( rule__Widget__ValueAlternatives_2_0 )
            {
             before(grammarAccess.getWidgetAccess().getValueAlternatives_2_0()); 
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:428:1: ( rule__Widget__ValueAlternatives_2_0 )
            // ../fr.istic.idm.Css.ui/src-gen/fr/istic/idm/ui/contentassist/antlr/internal/InternalCssDsl.g:428:2: rule__Widget__ValueAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__Widget__ValueAlternatives_2_0_in_rule__Widget__ValueAssignment_2803);
            rule__Widget__ValueAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getWidgetAccess().getValueAlternatives_2_0()); 

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
    // $ANTLR end "rule__Widget__ValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleCss_in_entryRuleCss61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCss68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css__Group__0_in_ruleCss94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWidget_in_entryRuleWidget121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWidget128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__Group__0_in_ruleWidget154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Widget__ValueAlternatives_2_0191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Widget__ValueAlternatives_2_0211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Widget__ValueAlternatives_2_0231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Widget__ValueAlternatives_2_0251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css__Group__0__Impl_in_rule__Css__Group__0283 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Css__Group__1_in_rule__Css__Group__0286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Css__Group__0__Impl314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css__Group__1__Impl_in_rule__Css__Group__1345 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Css__Group__2_in_rule__Css__Group__1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Css__Group__1__Impl376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css__Group__2__Impl_in_rule__Css__Group__2407 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Css__Group__3_in_rule__Css__Group__2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css__CssAssignment_2_in_rule__Css__Group__2__Impl439 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Css__CssAssignment_2_in_rule__Css__Group__2__Impl451 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Css__Group__3__Impl_in_rule__Css__Group__3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Css__Group__3__Impl512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__Group__0__Impl_in_rule__Widget__Group__0551 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Widget__Group__1_in_rule__Widget__Group__0554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__IdAssignment_0_in_rule__Widget__Group__0__Impl581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__Group__1__Impl_in_rule__Widget__Group__1611 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__Widget__Group__2_in_rule__Widget__Group__1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Widget__Group__1__Impl642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__Group__2__Impl_in_rule__Widget__Group__2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__ValueAssignment_2_in_rule__Widget__Group__2__Impl700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWidget_in_rule__Css__CssAssignment_2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Widget__IdAssignment_0772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__ValueAlternatives_2_0_in_rule__Widget__ValueAssignment_2803 = new BitSet(new long[]{0x0000000000000002L});

}