package org.xtext.example.qdsl.ui.contentassist.antlr.internal; 

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
import org.xtext.example.qdsl.services.QDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'radio_button'", "'check_box'", "'free_text'", "'questions'", "'{'", "'}'", "'questionItem'", "'questionContent'", "'AnswerType'", "'chooseFrom'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalQDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g"; }


     
     	private QDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(QDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:61:1: ( ruleModel EOF )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:76:1: ( rule__Model__Group__0 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleQuestion"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:88:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:89:1: ( ruleQuestion EOF )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:90:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion121);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion128); 

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
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:97:1: ruleQuestion : ( ( rule__Question__Group__0 ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:101:2: ( ( ( rule__Question__Group__0 ) ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:102:1: ( ( rule__Question__Group__0 ) )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:102:1: ( ( rule__Question__Group__0 ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:103:1: ( rule__Question__Group__0 )
            {
             before(grammarAccess.getQuestionAccess().getGroup()); 
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:104:1: ( rule__Question__Group__0 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:104:2: rule__Question__Group__0
            {
            pushFollow(FOLLOW_rule__Question__Group__0_in_ruleQuestion154);
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


    // $ANTLR start "entryRulequestionContent"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:116:1: entryRulequestionContent : rulequestionContent EOF ;
    public final void entryRulequestionContent() throws RecognitionException {
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:117:1: ( rulequestionContent EOF )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:118:1: rulequestionContent EOF
            {
             before(grammarAccess.getQuestionContentRule()); 
            pushFollow(FOLLOW_rulequestionContent_in_entryRulequestionContent181);
            rulequestionContent();

            state._fsp--;

             after(grammarAccess.getQuestionContentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulequestionContent188); 

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
    // $ANTLR end "entryRulequestionContent"


    // $ANTLR start "rulequestionContent"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:125:1: rulequestionContent : ( ( rule__QuestionContent__Group__0 ) ) ;
    public final void rulequestionContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:129:2: ( ( ( rule__QuestionContent__Group__0 ) ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:130:1: ( ( rule__QuestionContent__Group__0 ) )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:130:1: ( ( rule__QuestionContent__Group__0 ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:131:1: ( rule__QuestionContent__Group__0 )
            {
             before(grammarAccess.getQuestionContentAccess().getGroup()); 
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:132:1: ( rule__QuestionContent__Group__0 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:132:2: rule__QuestionContent__Group__0
            {
            pushFollow(FOLLOW_rule__QuestionContent__Group__0_in_rulequestionContent214);
            rule__QuestionContent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionContentAccess().getGroup()); 

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
    // $ANTLR end "rulequestionContent"


    // $ANTLR start "entryRuleAnswerType"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:144:1: entryRuleAnswerType : ruleAnswerType EOF ;
    public final void entryRuleAnswerType() throws RecognitionException {
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:145:1: ( ruleAnswerType EOF )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:146:1: ruleAnswerType EOF
            {
             before(grammarAccess.getAnswerTypeRule()); 
            pushFollow(FOLLOW_ruleAnswerType_in_entryRuleAnswerType241);
            ruleAnswerType();

            state._fsp--;

             after(grammarAccess.getAnswerTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnswerType248); 

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
    // $ANTLR end "entryRuleAnswerType"


    // $ANTLR start "ruleAnswerType"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:153:1: ruleAnswerType : ( ( rule__AnswerType__Group__0 ) ) ;
    public final void ruleAnswerType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:157:2: ( ( ( rule__AnswerType__Group__0 ) ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:158:1: ( ( rule__AnswerType__Group__0 ) )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:158:1: ( ( rule__AnswerType__Group__0 ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:159:1: ( rule__AnswerType__Group__0 )
            {
             before(grammarAccess.getAnswerTypeAccess().getGroup()); 
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:160:1: ( rule__AnswerType__Group__0 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:160:2: rule__AnswerType__Group__0
            {
            pushFollow(FOLLOW_rule__AnswerType__Group__0_in_ruleAnswerType274);
            rule__AnswerType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnswerTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleAnswerType"


    // $ANTLR start "entryRuleChooseFrom"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:172:1: entryRuleChooseFrom : ruleChooseFrom EOF ;
    public final void entryRuleChooseFrom() throws RecognitionException {
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:173:1: ( ruleChooseFrom EOF )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:174:1: ruleChooseFrom EOF
            {
             before(grammarAccess.getChooseFromRule()); 
            pushFollow(FOLLOW_ruleChooseFrom_in_entryRuleChooseFrom301);
            ruleChooseFrom();

            state._fsp--;

             after(grammarAccess.getChooseFromRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChooseFrom308); 

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
    // $ANTLR end "entryRuleChooseFrom"


    // $ANTLR start "ruleChooseFrom"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:181:1: ruleChooseFrom : ( ( rule__ChooseFrom__Group__0 ) ) ;
    public final void ruleChooseFrom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:185:2: ( ( ( rule__ChooseFrom__Group__0 ) ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:186:1: ( ( rule__ChooseFrom__Group__0 ) )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:186:1: ( ( rule__ChooseFrom__Group__0 ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:187:1: ( rule__ChooseFrom__Group__0 )
            {
             before(grammarAccess.getChooseFromAccess().getGroup()); 
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:188:1: ( rule__ChooseFrom__Group__0 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:188:2: rule__ChooseFrom__Group__0
            {
            pushFollow(FOLLOW_rule__ChooseFrom__Group__0_in_ruleChooseFrom334);
            rule__ChooseFrom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChooseFromAccess().getGroup()); 

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
    // $ANTLR end "ruleChooseFrom"


    // $ANTLR start "rule__AnswerType__AtypeAlternatives_1_0"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:202:1: rule__AnswerType__AtypeAlternatives_1_0 : ( ( 'radio_button' ) | ( 'check_box' ) | ( 'free_text' ) );
    public final void rule__AnswerType__AtypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:206:1: ( ( 'radio_button' ) | ( 'check_box' ) | ( 'free_text' ) )
            int alt1=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:207:1: ( 'radio_button' )
                    {
                    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:207:1: ( 'radio_button' )
                    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:208:1: 'radio_button'
                    {
                     before(grammarAccess.getAnswerTypeAccess().getAtypeRadio_buttonKeyword_1_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__AnswerType__AtypeAlternatives_1_0373); 
                     after(grammarAccess.getAnswerTypeAccess().getAtypeRadio_buttonKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:215:6: ( 'check_box' )
                    {
                    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:215:6: ( 'check_box' )
                    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:216:1: 'check_box'
                    {
                     before(grammarAccess.getAnswerTypeAccess().getAtypeCheck_boxKeyword_1_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__AnswerType__AtypeAlternatives_1_0393); 
                     after(grammarAccess.getAnswerTypeAccess().getAtypeCheck_boxKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:223:6: ( 'free_text' )
                    {
                    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:223:6: ( 'free_text' )
                    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:224:1: 'free_text'
                    {
                     before(grammarAccess.getAnswerTypeAccess().getAtypeFree_textKeyword_1_0_2()); 
                    match(input,13,FOLLOW_13_in_rule__AnswerType__AtypeAlternatives_1_0413); 
                     after(grammarAccess.getAnswerTypeAccess().getAtypeFree_textKeyword_1_0_2()); 

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
    // $ANTLR end "rule__AnswerType__AtypeAlternatives_1_0"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:238:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:242:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:243:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0445);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0448);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:250:1: rule__Model__Group__0__Impl : ( 'questions' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:254:1: ( ( 'questions' ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:255:1: ( 'questions' )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:255:1: ( 'questions' )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:256:1: 'questions'
            {
             before(grammarAccess.getModelAccess().getQuestionsKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Model__Group__0__Impl476); 
             after(grammarAccess.getModelAccess().getQuestionsKeyword_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:269:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:273:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:274:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1507);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1510);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:281:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:285:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:286:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:286:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:287:1: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:288:1: ( rule__Model__NameAssignment_1 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:288:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl537);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:298:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:302:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:303:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2567);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2570);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:310:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:314:1: ( ( '{' ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:315:1: ( '{' )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:315:1: ( '{' )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:316:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Model__Group__2__Impl598); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:329:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:333:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:334:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3629);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3632);
            rule__Model__Group__4();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:341:1: rule__Model__Group__3__Impl : ( ( rule__Model__QuestionsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:345:1: ( ( ( rule__Model__QuestionsAssignment_3 )* ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:346:1: ( ( rule__Model__QuestionsAssignment_3 )* )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:346:1: ( ( rule__Model__QuestionsAssignment_3 )* )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:347:1: ( rule__Model__QuestionsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getQuestionsAssignment_3()); 
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:348:1: ( rule__Model__QuestionsAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:348:2: rule__Model__QuestionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__QuestionsAssignment_3_in_rule__Model__Group__3__Impl659);
            	    rule__Model__QuestionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getQuestionsAssignment_3()); 

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:358:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:362:1: ( rule__Model__Group__4__Impl )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:363:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4690);
            rule__Model__Group__4__Impl();

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
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:369:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:373:1: ( ( '}' ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:374:1: ( '}' )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:374:1: ( '}' )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:375:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__Model__Group__4__Impl718); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Question__Group__0"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:398:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:402:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:403:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__0759);
            rule__Question__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__1_in_rule__Question__Group__0762);
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
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:410:1: rule__Question__Group__0__Impl : ( 'questionItem' ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:414:1: ( ( 'questionItem' ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:415:1: ( 'questionItem' )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:415:1: ( 'questionItem' )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:416:1: 'questionItem'
            {
             before(grammarAccess.getQuestionAccess().getQuestionItemKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Question__Group__0__Impl790); 
             after(grammarAccess.getQuestionAccess().getQuestionItemKeyword_0()); 

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
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:429:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:433:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:434:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__1821);
            rule__Question__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__2_in_rule__Question__Group__1824);
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
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:441:1: rule__Question__Group__1__Impl : ( ( rule__Question__NameAssignment_1 ) ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:445:1: ( ( ( rule__Question__NameAssignment_1 ) ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:446:1: ( ( rule__Question__NameAssignment_1 ) )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:446:1: ( ( rule__Question__NameAssignment_1 ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:447:1: ( rule__Question__NameAssignment_1 )
            {
             before(grammarAccess.getQuestionAccess().getNameAssignment_1()); 
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:448:1: ( rule__Question__NameAssignment_1 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:448:2: rule__Question__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Question__NameAssignment_1_in_rule__Question__Group__1__Impl851);
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
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:458:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:462:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:463:2: rule__Question__Group__2__Impl rule__Question__Group__3
            {
            pushFollow(FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__2881);
            rule__Question__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__3_in_rule__Question__Group__2884);
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
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:470:1: rule__Question__Group__2__Impl : ( '{' ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:474:1: ( ( '{' ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:475:1: ( '{' )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:475:1: ( '{' )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:476:1: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Question__Group__2__Impl912); 
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
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:489:1: rule__Question__Group__3 : rule__Question__Group__3__Impl rule__Question__Group__4 ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:493:1: ( rule__Question__Group__3__Impl rule__Question__Group__4 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:494:2: rule__Question__Group__3__Impl rule__Question__Group__4
            {
            pushFollow(FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__3943);
            rule__Question__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__4_in_rule__Question__Group__3946);
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
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:501:1: rule__Question__Group__3__Impl : ( ( rule__Question__ContensAssignment_3 ) ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:505:1: ( ( ( rule__Question__ContensAssignment_3 ) ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:506:1: ( ( rule__Question__ContensAssignment_3 ) )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:506:1: ( ( rule__Question__ContensAssignment_3 ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:507:1: ( rule__Question__ContensAssignment_3 )
            {
             before(grammarAccess.getQuestionAccess().getContensAssignment_3()); 
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:508:1: ( rule__Question__ContensAssignment_3 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:508:2: rule__Question__ContensAssignment_3
            {
            pushFollow(FOLLOW_rule__Question__ContensAssignment_3_in_rule__Question__Group__3__Impl973);
            rule__Question__ContensAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getContensAssignment_3()); 

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
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:518:1: rule__Question__Group__4 : rule__Question__Group__4__Impl rule__Question__Group__5 ;
    public final void rule__Question__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:522:1: ( rule__Question__Group__4__Impl rule__Question__Group__5 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:523:2: rule__Question__Group__4__Impl rule__Question__Group__5
            {
            pushFollow(FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__41003);
            rule__Question__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__5_in_rule__Question__Group__41006);
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
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:530:1: rule__Question__Group__4__Impl : ( ( rule__Question__AnswerTypesAssignment_4 ) ) ;
    public final void rule__Question__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:534:1: ( ( ( rule__Question__AnswerTypesAssignment_4 ) ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:535:1: ( ( rule__Question__AnswerTypesAssignment_4 ) )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:535:1: ( ( rule__Question__AnswerTypesAssignment_4 ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:536:1: ( rule__Question__AnswerTypesAssignment_4 )
            {
             before(grammarAccess.getQuestionAccess().getAnswerTypesAssignment_4()); 
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:537:1: ( rule__Question__AnswerTypesAssignment_4 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:537:2: rule__Question__AnswerTypesAssignment_4
            {
            pushFollow(FOLLOW_rule__Question__AnswerTypesAssignment_4_in_rule__Question__Group__4__Impl1033);
            rule__Question__AnswerTypesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getAnswerTypesAssignment_4()); 

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
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:547:1: rule__Question__Group__5 : rule__Question__Group__5__Impl rule__Question__Group__6 ;
    public final void rule__Question__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:551:1: ( rule__Question__Group__5__Impl rule__Question__Group__6 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:552:2: rule__Question__Group__5__Impl rule__Question__Group__6
            {
            pushFollow(FOLLOW_rule__Question__Group__5__Impl_in_rule__Question__Group__51063);
            rule__Question__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__6_in_rule__Question__Group__51066);
            rule__Question__Group__6();

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
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:559:1: rule__Question__Group__5__Impl : ( ( rule__Question__ChooseFromsAssignment_5 )? ) ;
    public final void rule__Question__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:563:1: ( ( ( rule__Question__ChooseFromsAssignment_5 )? ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:564:1: ( ( rule__Question__ChooseFromsAssignment_5 )? )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:564:1: ( ( rule__Question__ChooseFromsAssignment_5 )? )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:565:1: ( rule__Question__ChooseFromsAssignment_5 )?
            {
             before(grammarAccess.getQuestionAccess().getChooseFromsAssignment_5()); 
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:566:1: ( rule__Question__ChooseFromsAssignment_5 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:566:2: rule__Question__ChooseFromsAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Question__ChooseFromsAssignment_5_in_rule__Question__Group__5__Impl1093);
                    rule__Question__ChooseFromsAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getChooseFromsAssignment_5()); 

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


    // $ANTLR start "rule__Question__Group__6"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:576:1: rule__Question__Group__6 : rule__Question__Group__6__Impl ;
    public final void rule__Question__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:580:1: ( rule__Question__Group__6__Impl )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:581:2: rule__Question__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group__6__Impl_in_rule__Question__Group__61124);
            rule__Question__Group__6__Impl();

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
    // $ANTLR end "rule__Question__Group__6"


    // $ANTLR start "rule__Question__Group__6__Impl"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:587:1: rule__Question__Group__6__Impl : ( '}' ) ;
    public final void rule__Question__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:591:1: ( ( '}' ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:592:1: ( '}' )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:592:1: ( '}' )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:593:1: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_16_in_rule__Question__Group__6__Impl1152); 
             after(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Question__Group__6__Impl"


    // $ANTLR start "rule__QuestionContent__Group__0"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:620:1: rule__QuestionContent__Group__0 : rule__QuestionContent__Group__0__Impl rule__QuestionContent__Group__1 ;
    public final void rule__QuestionContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:624:1: ( rule__QuestionContent__Group__0__Impl rule__QuestionContent__Group__1 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:625:2: rule__QuestionContent__Group__0__Impl rule__QuestionContent__Group__1
            {
            pushFollow(FOLLOW_rule__QuestionContent__Group__0__Impl_in_rule__QuestionContent__Group__01197);
            rule__QuestionContent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuestionContent__Group__1_in_rule__QuestionContent__Group__01200);
            rule__QuestionContent__Group__1();

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
    // $ANTLR end "rule__QuestionContent__Group__0"


    // $ANTLR start "rule__QuestionContent__Group__0__Impl"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:632:1: rule__QuestionContent__Group__0__Impl : ( 'questionContent' ) ;
    public final void rule__QuestionContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:636:1: ( ( 'questionContent' ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:637:1: ( 'questionContent' )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:637:1: ( 'questionContent' )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:638:1: 'questionContent'
            {
             before(grammarAccess.getQuestionContentAccess().getQuestionContentKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__QuestionContent__Group__0__Impl1228); 
             after(grammarAccess.getQuestionContentAccess().getQuestionContentKeyword_0()); 

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
    // $ANTLR end "rule__QuestionContent__Group__0__Impl"


    // $ANTLR start "rule__QuestionContent__Group__1"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:651:1: rule__QuestionContent__Group__1 : rule__QuestionContent__Group__1__Impl ;
    public final void rule__QuestionContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:655:1: ( rule__QuestionContent__Group__1__Impl )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:656:2: rule__QuestionContent__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QuestionContent__Group__1__Impl_in_rule__QuestionContent__Group__11259);
            rule__QuestionContent__Group__1__Impl();

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
    // $ANTLR end "rule__QuestionContent__Group__1"


    // $ANTLR start "rule__QuestionContent__Group__1__Impl"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:662:1: rule__QuestionContent__Group__1__Impl : ( ( rule__QuestionContent__QcontentAssignment_1 ) ) ;
    public final void rule__QuestionContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:666:1: ( ( ( rule__QuestionContent__QcontentAssignment_1 ) ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:667:1: ( ( rule__QuestionContent__QcontentAssignment_1 ) )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:667:1: ( ( rule__QuestionContent__QcontentAssignment_1 ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:668:1: ( rule__QuestionContent__QcontentAssignment_1 )
            {
             before(grammarAccess.getQuestionContentAccess().getQcontentAssignment_1()); 
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:669:1: ( rule__QuestionContent__QcontentAssignment_1 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:669:2: rule__QuestionContent__QcontentAssignment_1
            {
            pushFollow(FOLLOW_rule__QuestionContent__QcontentAssignment_1_in_rule__QuestionContent__Group__1__Impl1286);
            rule__QuestionContent__QcontentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionContentAccess().getQcontentAssignment_1()); 

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
    // $ANTLR end "rule__QuestionContent__Group__1__Impl"


    // $ANTLR start "rule__AnswerType__Group__0"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:683:1: rule__AnswerType__Group__0 : rule__AnswerType__Group__0__Impl rule__AnswerType__Group__1 ;
    public final void rule__AnswerType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:687:1: ( rule__AnswerType__Group__0__Impl rule__AnswerType__Group__1 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:688:2: rule__AnswerType__Group__0__Impl rule__AnswerType__Group__1
            {
            pushFollow(FOLLOW_rule__AnswerType__Group__0__Impl_in_rule__AnswerType__Group__01320);
            rule__AnswerType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnswerType__Group__1_in_rule__AnswerType__Group__01323);
            rule__AnswerType__Group__1();

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
    // $ANTLR end "rule__AnswerType__Group__0"


    // $ANTLR start "rule__AnswerType__Group__0__Impl"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:695:1: rule__AnswerType__Group__0__Impl : ( 'AnswerType' ) ;
    public final void rule__AnswerType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:699:1: ( ( 'AnswerType' ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:700:1: ( 'AnswerType' )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:700:1: ( 'AnswerType' )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:701:1: 'AnswerType'
            {
             before(grammarAccess.getAnswerTypeAccess().getAnswerTypeKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__AnswerType__Group__0__Impl1351); 
             after(grammarAccess.getAnswerTypeAccess().getAnswerTypeKeyword_0()); 

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
    // $ANTLR end "rule__AnswerType__Group__0__Impl"


    // $ANTLR start "rule__AnswerType__Group__1"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:714:1: rule__AnswerType__Group__1 : rule__AnswerType__Group__1__Impl ;
    public final void rule__AnswerType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:718:1: ( rule__AnswerType__Group__1__Impl )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:719:2: rule__AnswerType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AnswerType__Group__1__Impl_in_rule__AnswerType__Group__11382);
            rule__AnswerType__Group__1__Impl();

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
    // $ANTLR end "rule__AnswerType__Group__1"


    // $ANTLR start "rule__AnswerType__Group__1__Impl"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:725:1: rule__AnswerType__Group__1__Impl : ( ( rule__AnswerType__AtypeAssignment_1 ) ) ;
    public final void rule__AnswerType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:729:1: ( ( ( rule__AnswerType__AtypeAssignment_1 ) ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:730:1: ( ( rule__AnswerType__AtypeAssignment_1 ) )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:730:1: ( ( rule__AnswerType__AtypeAssignment_1 ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:731:1: ( rule__AnswerType__AtypeAssignment_1 )
            {
             before(grammarAccess.getAnswerTypeAccess().getAtypeAssignment_1()); 
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:732:1: ( rule__AnswerType__AtypeAssignment_1 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:732:2: rule__AnswerType__AtypeAssignment_1
            {
            pushFollow(FOLLOW_rule__AnswerType__AtypeAssignment_1_in_rule__AnswerType__Group__1__Impl1409);
            rule__AnswerType__AtypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnswerTypeAccess().getAtypeAssignment_1()); 

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
    // $ANTLR end "rule__AnswerType__Group__1__Impl"


    // $ANTLR start "rule__ChooseFrom__Group__0"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:746:1: rule__ChooseFrom__Group__0 : rule__ChooseFrom__Group__0__Impl rule__ChooseFrom__Group__1 ;
    public final void rule__ChooseFrom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:750:1: ( rule__ChooseFrom__Group__0__Impl rule__ChooseFrom__Group__1 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:751:2: rule__ChooseFrom__Group__0__Impl rule__ChooseFrom__Group__1
            {
            pushFollow(FOLLOW_rule__ChooseFrom__Group__0__Impl_in_rule__ChooseFrom__Group__01443);
            rule__ChooseFrom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChooseFrom__Group__1_in_rule__ChooseFrom__Group__01446);
            rule__ChooseFrom__Group__1();

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
    // $ANTLR end "rule__ChooseFrom__Group__0"


    // $ANTLR start "rule__ChooseFrom__Group__0__Impl"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:758:1: rule__ChooseFrom__Group__0__Impl : ( () ) ;
    public final void rule__ChooseFrom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:762:1: ( ( () ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:763:1: ( () )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:763:1: ( () )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:764:1: ()
            {
             before(grammarAccess.getChooseFromAccess().getChooseFromAction_0()); 
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:765:1: ()
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:767:1: 
            {
            }

             after(grammarAccess.getChooseFromAccess().getChooseFromAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChooseFrom__Group__0__Impl"


    // $ANTLR start "rule__ChooseFrom__Group__1"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:777:1: rule__ChooseFrom__Group__1 : rule__ChooseFrom__Group__1__Impl rule__ChooseFrom__Group__2 ;
    public final void rule__ChooseFrom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:781:1: ( rule__ChooseFrom__Group__1__Impl rule__ChooseFrom__Group__2 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:782:2: rule__ChooseFrom__Group__1__Impl rule__ChooseFrom__Group__2
            {
            pushFollow(FOLLOW_rule__ChooseFrom__Group__1__Impl_in_rule__ChooseFrom__Group__11504);
            rule__ChooseFrom__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChooseFrom__Group__2_in_rule__ChooseFrom__Group__11507);
            rule__ChooseFrom__Group__2();

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
    // $ANTLR end "rule__ChooseFrom__Group__1"


    // $ANTLR start "rule__ChooseFrom__Group__1__Impl"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:789:1: rule__ChooseFrom__Group__1__Impl : ( 'chooseFrom' ) ;
    public final void rule__ChooseFrom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:793:1: ( ( 'chooseFrom' ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:794:1: ( 'chooseFrom' )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:794:1: ( 'chooseFrom' )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:795:1: 'chooseFrom'
            {
             before(grammarAccess.getChooseFromAccess().getChooseFromKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__ChooseFrom__Group__1__Impl1535); 
             after(grammarAccess.getChooseFromAccess().getChooseFromKeyword_1()); 

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
    // $ANTLR end "rule__ChooseFrom__Group__1__Impl"


    // $ANTLR start "rule__ChooseFrom__Group__2"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:808:1: rule__ChooseFrom__Group__2 : rule__ChooseFrom__Group__2__Impl ;
    public final void rule__ChooseFrom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:812:1: ( rule__ChooseFrom__Group__2__Impl )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:813:2: rule__ChooseFrom__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ChooseFrom__Group__2__Impl_in_rule__ChooseFrom__Group__21566);
            rule__ChooseFrom__Group__2__Impl();

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
    // $ANTLR end "rule__ChooseFrom__Group__2"


    // $ANTLR start "rule__ChooseFrom__Group__2__Impl"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:819:1: rule__ChooseFrom__Group__2__Impl : ( ( rule__ChooseFrom__ChoiseAssignment_2 )* ) ;
    public final void rule__ChooseFrom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:823:1: ( ( ( rule__ChooseFrom__ChoiseAssignment_2 )* ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:824:1: ( ( rule__ChooseFrom__ChoiseAssignment_2 )* )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:824:1: ( ( rule__ChooseFrom__ChoiseAssignment_2 )* )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:825:1: ( rule__ChooseFrom__ChoiseAssignment_2 )*
            {
             before(grammarAccess.getChooseFromAccess().getChoiseAssignment_2()); 
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:826:1: ( rule__ChooseFrom__ChoiseAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:826:2: rule__ChooseFrom__ChoiseAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ChooseFrom__ChoiseAssignment_2_in_rule__ChooseFrom__Group__2__Impl1593);
            	    rule__ChooseFrom__ChoiseAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getChooseFromAccess().getChoiseAssignment_2()); 

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
    // $ANTLR end "rule__ChooseFrom__Group__2__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:844:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:848:1: ( ( RULE_ID ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:849:1: ( RULE_ID )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:849:1: ( RULE_ID )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:850:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__NameAssignment_11636); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__QuestionsAssignment_3"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:859:1: rule__Model__QuestionsAssignment_3 : ( ruleQuestion ) ;
    public final void rule__Model__QuestionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:863:1: ( ( ruleQuestion ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:864:1: ( ruleQuestion )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:864:1: ( ruleQuestion )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:865:1: ruleQuestion
            {
             before(grammarAccess.getModelAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleQuestion_in_rule__Model__QuestionsAssignment_31667);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getModelAccess().getQuestionsQuestionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Model__QuestionsAssignment_3"


    // $ANTLR start "rule__Question__NameAssignment_1"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:874:1: rule__Question__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Question__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:878:1: ( ( RULE_ID ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:879:1: ( RULE_ID )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:879:1: ( RULE_ID )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:880:1: RULE_ID
            {
             before(grammarAccess.getQuestionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Question__NameAssignment_11698); 
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


    // $ANTLR start "rule__Question__ContensAssignment_3"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:889:1: rule__Question__ContensAssignment_3 : ( rulequestionContent ) ;
    public final void rule__Question__ContensAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:893:1: ( ( rulequestionContent ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:894:1: ( rulequestionContent )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:894:1: ( rulequestionContent )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:895:1: rulequestionContent
            {
             before(grammarAccess.getQuestionAccess().getContensQuestionContentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulequestionContent_in_rule__Question__ContensAssignment_31729);
            rulequestionContent();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getContensQuestionContentParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Question__ContensAssignment_3"


    // $ANTLR start "rule__Question__AnswerTypesAssignment_4"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:904:1: rule__Question__AnswerTypesAssignment_4 : ( ruleAnswerType ) ;
    public final void rule__Question__AnswerTypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:908:1: ( ( ruleAnswerType ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:909:1: ( ruleAnswerType )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:909:1: ( ruleAnswerType )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:910:1: ruleAnswerType
            {
             before(grammarAccess.getQuestionAccess().getAnswerTypesAnswerTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAnswerType_in_rule__Question__AnswerTypesAssignment_41760);
            ruleAnswerType();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getAnswerTypesAnswerTypeParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Question__AnswerTypesAssignment_4"


    // $ANTLR start "rule__Question__ChooseFromsAssignment_5"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:919:1: rule__Question__ChooseFromsAssignment_5 : ( ruleChooseFrom ) ;
    public final void rule__Question__ChooseFromsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:923:1: ( ( ruleChooseFrom ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:924:1: ( ruleChooseFrom )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:924:1: ( ruleChooseFrom )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:925:1: ruleChooseFrom
            {
             before(grammarAccess.getQuestionAccess().getChooseFromsChooseFromParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleChooseFrom_in_rule__Question__ChooseFromsAssignment_51791);
            ruleChooseFrom();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getChooseFromsChooseFromParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Question__ChooseFromsAssignment_5"


    // $ANTLR start "rule__QuestionContent__QcontentAssignment_1"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:934:1: rule__QuestionContent__QcontentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__QuestionContent__QcontentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:938:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:939:1: ( RULE_STRING )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:939:1: ( RULE_STRING )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:940:1: RULE_STRING
            {
             before(grammarAccess.getQuestionContentAccess().getQcontentSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__QuestionContent__QcontentAssignment_11822); 
             after(grammarAccess.getQuestionContentAccess().getQcontentSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__QuestionContent__QcontentAssignment_1"


    // $ANTLR start "rule__AnswerType__AtypeAssignment_1"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:949:1: rule__AnswerType__AtypeAssignment_1 : ( ( rule__AnswerType__AtypeAlternatives_1_0 ) ) ;
    public final void rule__AnswerType__AtypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:953:1: ( ( ( rule__AnswerType__AtypeAlternatives_1_0 ) ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:954:1: ( ( rule__AnswerType__AtypeAlternatives_1_0 ) )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:954:1: ( ( rule__AnswerType__AtypeAlternatives_1_0 ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:955:1: ( rule__AnswerType__AtypeAlternatives_1_0 )
            {
             before(grammarAccess.getAnswerTypeAccess().getAtypeAlternatives_1_0()); 
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:956:1: ( rule__AnswerType__AtypeAlternatives_1_0 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:956:2: rule__AnswerType__AtypeAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__AnswerType__AtypeAlternatives_1_0_in_rule__AnswerType__AtypeAssignment_11853);
            rule__AnswerType__AtypeAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAnswerTypeAccess().getAtypeAlternatives_1_0()); 

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
    // $ANTLR end "rule__AnswerType__AtypeAssignment_1"


    // $ANTLR start "rule__ChooseFrom__ChoiseAssignment_2"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:965:1: rule__ChooseFrom__ChoiseAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ChooseFrom__ChoiseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:969:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:970:1: ( RULE_STRING )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:970:1: ( RULE_STRING )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:971:1: RULE_STRING
            {
             before(grammarAccess.getChooseFromAccess().getChoiseSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ChooseFrom__ChoiseAssignment_21886); 
             after(grammarAccess.getChooseFromAccess().getChoiseSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ChooseFrom__ChoiseAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__0_in_ruleQuestion154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulequestionContent_in_entryRulequestionContent181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulequestionContent188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionContent__Group__0_in_rulequestionContent214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswerType_in_entryRuleAnswerType241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnswerType248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnswerType__Group__0_in_ruleAnswerType274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChooseFrom_in_entryRuleChooseFrom301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChooseFrom308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChooseFrom__Group__0_in_ruleChooseFrom334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__AnswerType__AtypeAlternatives_1_0373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__AnswerType__AtypeAlternatives_1_0393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__AnswerType__AtypeAlternatives_1_0413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0445 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Model__Group__0__Impl476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1507 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2567 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Model__Group__2__Impl598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3629 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__QuestionsAssignment_3_in_rule__Model__Group__3__Impl659 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Model__Group__4__Impl718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__0759 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Question__Group__1_in_rule__Question__Group__0762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Question__Group__0__Impl790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__1821 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Question__Group__2_in_rule__Question__Group__1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__NameAssignment_1_in_rule__Question__Group__1__Impl851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__2881 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Question__Group__3_in_rule__Question__Group__2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Question__Group__2__Impl912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__3943 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Question__Group__4_in_rule__Question__Group__3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__ContensAssignment_3_in_rule__Question__Group__3__Impl973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__41003 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_rule__Question__Group__5_in_rule__Question__Group__41006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__AnswerTypesAssignment_4_in_rule__Question__Group__4__Impl1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__5__Impl_in_rule__Question__Group__51063 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_rule__Question__Group__6_in_rule__Question__Group__51066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__ChooseFromsAssignment_5_in_rule__Question__Group__5__Impl1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__6__Impl_in_rule__Question__Group__61124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Question__Group__6__Impl1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionContent__Group__0__Impl_in_rule__QuestionContent__Group__01197 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__QuestionContent__Group__1_in_rule__QuestionContent__Group__01200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__QuestionContent__Group__0__Impl1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionContent__Group__1__Impl_in_rule__QuestionContent__Group__11259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionContent__QcontentAssignment_1_in_rule__QuestionContent__Group__1__Impl1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnswerType__Group__0__Impl_in_rule__AnswerType__Group__01320 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__AnswerType__Group__1_in_rule__AnswerType__Group__01323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__AnswerType__Group__0__Impl1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnswerType__Group__1__Impl_in_rule__AnswerType__Group__11382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnswerType__AtypeAssignment_1_in_rule__AnswerType__Group__1__Impl1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChooseFrom__Group__0__Impl_in_rule__ChooseFrom__Group__01443 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ChooseFrom__Group__1_in_rule__ChooseFrom__Group__01446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChooseFrom__Group__1__Impl_in_rule__ChooseFrom__Group__11504 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ChooseFrom__Group__2_in_rule__ChooseFrom__Group__11507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ChooseFrom__Group__1__Impl1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChooseFrom__Group__2__Impl_in_rule__ChooseFrom__Group__21566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChooseFrom__ChoiseAssignment_2_in_rule__ChooseFrom__Group__2__Impl1593 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NameAssignment_11636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_rule__Model__QuestionsAssignment_31667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Question__NameAssignment_11698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulequestionContent_in_rule__Question__ContensAssignment_31729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswerType_in_rule__Question__AnswerTypesAssignment_41760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChooseFrom_in_rule__Question__ChooseFromsAssignment_51791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__QuestionContent__QcontentAssignment_11822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnswerType__AtypeAlternatives_1_0_in_rule__AnswerType__AtypeAssignment_11853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ChooseFrom__ChoiseAssignment_21886 = new BitSet(new long[]{0x0000000000000002L});

}