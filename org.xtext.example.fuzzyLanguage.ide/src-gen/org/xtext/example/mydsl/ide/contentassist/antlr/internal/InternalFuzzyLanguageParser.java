package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.FuzzyLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFuzzyLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ANYTHING", "RULE_OPERATOR", "RULE_INT", "RULE_STRING", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Output'", "'='", "'Write('", "')'", "'Print('", "'('", "'FuzzySystemBuilding'", "'{'", "'}'", "'is'", "','", "'set'", "'Type'", "'to'", "'FuzzyConfig'", "'FILE'", "'CONSOLE'", "'COUT'"
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

    	public void setGrammarAccess(FuzzyLanguageGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleFuzzyModel"
    // InternalFuzzyLanguage.g:53:1: entryRuleFuzzyModel : ruleFuzzyModel EOF ;
    public final void entryRuleFuzzyModel() throws RecognitionException {
        try {
            // InternalFuzzyLanguage.g:54:1: ( ruleFuzzyModel EOF )
            // InternalFuzzyLanguage.g:55:1: ruleFuzzyModel EOF
            {
             before(grammarAccess.getFuzzyModelRule()); 
            pushFollow(FOLLOW_1);
            ruleFuzzyModel();

            state._fsp--;

             after(grammarAccess.getFuzzyModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFuzzyModel"


    // $ANTLR start "ruleFuzzyModel"
    // InternalFuzzyLanguage.g:62:1: ruleFuzzyModel : ( ( rule__FuzzyModel__Group__0 ) ) ;
    public final void ruleFuzzyModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:66:2: ( ( ( rule__FuzzyModel__Group__0 ) ) )
            // InternalFuzzyLanguage.g:67:2: ( ( rule__FuzzyModel__Group__0 ) )
            {
            // InternalFuzzyLanguage.g:67:2: ( ( rule__FuzzyModel__Group__0 ) )
            // InternalFuzzyLanguage.g:68:3: ( rule__FuzzyModel__Group__0 )
            {
             before(grammarAccess.getFuzzyModelAccess().getGroup()); 
            // InternalFuzzyLanguage.g:69:3: ( rule__FuzzyModel__Group__0 )
            // InternalFuzzyLanguage.g:69:4: rule__FuzzyModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FuzzyModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFuzzyModelAccess().getGroup()); 

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
    // $ANTLR end "ruleFuzzyModel"


    // $ANTLR start "entryRuleOutputs"
    // InternalFuzzyLanguage.g:78:1: entryRuleOutputs : ruleOutputs EOF ;
    public final void entryRuleOutputs() throws RecognitionException {
        try {
            // InternalFuzzyLanguage.g:79:1: ( ruleOutputs EOF )
            // InternalFuzzyLanguage.g:80:1: ruleOutputs EOF
            {
             before(grammarAccess.getOutputsRule()); 
            pushFollow(FOLLOW_1);
            ruleOutputs();

            state._fsp--;

             after(grammarAccess.getOutputsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOutputs"


    // $ANTLR start "ruleOutputs"
    // InternalFuzzyLanguage.g:87:1: ruleOutputs : ( ( rule__Outputs__Group__0 ) ) ;
    public final void ruleOutputs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:91:2: ( ( ( rule__Outputs__Group__0 ) ) )
            // InternalFuzzyLanguage.g:92:2: ( ( rule__Outputs__Group__0 ) )
            {
            // InternalFuzzyLanguage.g:92:2: ( ( rule__Outputs__Group__0 ) )
            // InternalFuzzyLanguage.g:93:3: ( rule__Outputs__Group__0 )
            {
             before(grammarAccess.getOutputsAccess().getGroup()); 
            // InternalFuzzyLanguage.g:94:3: ( rule__Outputs__Group__0 )
            // InternalFuzzyLanguage.g:94:4: rule__Outputs__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Outputs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputsAccess().getGroup()); 

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
    // $ANTLR end "ruleOutputs"


    // $ANTLR start "entryRuleWrite"
    // InternalFuzzyLanguage.g:103:1: entryRuleWrite : ruleWrite EOF ;
    public final void entryRuleWrite() throws RecognitionException {
        try {
            // InternalFuzzyLanguage.g:104:1: ( ruleWrite EOF )
            // InternalFuzzyLanguage.g:105:1: ruleWrite EOF
            {
             before(grammarAccess.getWriteRule()); 
            pushFollow(FOLLOW_1);
            ruleWrite();

            state._fsp--;

             after(grammarAccess.getWriteRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWrite"


    // $ANTLR start "ruleWrite"
    // InternalFuzzyLanguage.g:112:1: ruleWrite : ( ( rule__Write__Alternatives ) ) ;
    public final void ruleWrite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:116:2: ( ( ( rule__Write__Alternatives ) ) )
            // InternalFuzzyLanguage.g:117:2: ( ( rule__Write__Alternatives ) )
            {
            // InternalFuzzyLanguage.g:117:2: ( ( rule__Write__Alternatives ) )
            // InternalFuzzyLanguage.g:118:3: ( rule__Write__Alternatives )
            {
             before(grammarAccess.getWriteAccess().getAlternatives()); 
            // InternalFuzzyLanguage.g:119:3: ( rule__Write__Alternatives )
            // InternalFuzzyLanguage.g:119:4: rule__Write__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Write__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWriteAccess().getAlternatives()); 

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
    // $ANTLR end "ruleWrite"


    // $ANTLR start "entryRuleOutput"
    // InternalFuzzyLanguage.g:128:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // InternalFuzzyLanguage.g:129:1: ( ruleOutput EOF )
            // InternalFuzzyLanguage.g:130:1: ruleOutput EOF
            {
             before(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getOutputRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalFuzzyLanguage.g:137:1: ruleOutput : ( ( rule__Output__Alternatives ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:141:2: ( ( ( rule__Output__Alternatives ) ) )
            // InternalFuzzyLanguage.g:142:2: ( ( rule__Output__Alternatives ) )
            {
            // InternalFuzzyLanguage.g:142:2: ( ( rule__Output__Alternatives ) )
            // InternalFuzzyLanguage.g:143:3: ( rule__Output__Alternatives )
            {
             before(grammarAccess.getOutputAccess().getAlternatives()); 
            // InternalFuzzyLanguage.g:144:3: ( rule__Output__Alternatives )
            // InternalFuzzyLanguage.g:144:4: rule__Output__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Output__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleFuzzySystemBuilding"
    // InternalFuzzyLanguage.g:153:1: entryRuleFuzzySystemBuilding : ruleFuzzySystemBuilding EOF ;
    public final void entryRuleFuzzySystemBuilding() throws RecognitionException {
        try {
            // InternalFuzzyLanguage.g:154:1: ( ruleFuzzySystemBuilding EOF )
            // InternalFuzzyLanguage.g:155:1: ruleFuzzySystemBuilding EOF
            {
             before(grammarAccess.getFuzzySystemBuildingRule()); 
            pushFollow(FOLLOW_1);
            ruleFuzzySystemBuilding();

            state._fsp--;

             after(grammarAccess.getFuzzySystemBuildingRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFuzzySystemBuilding"


    // $ANTLR start "ruleFuzzySystemBuilding"
    // InternalFuzzyLanguage.g:162:1: ruleFuzzySystemBuilding : ( ( rule__FuzzySystemBuilding__Group__0 ) ) ;
    public final void ruleFuzzySystemBuilding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:166:2: ( ( ( rule__FuzzySystemBuilding__Group__0 ) ) )
            // InternalFuzzyLanguage.g:167:2: ( ( rule__FuzzySystemBuilding__Group__0 ) )
            {
            // InternalFuzzyLanguage.g:167:2: ( ( rule__FuzzySystemBuilding__Group__0 ) )
            // InternalFuzzyLanguage.g:168:3: ( rule__FuzzySystemBuilding__Group__0 )
            {
             before(grammarAccess.getFuzzySystemBuildingAccess().getGroup()); 
            // InternalFuzzyLanguage.g:169:3: ( rule__FuzzySystemBuilding__Group__0 )
            // InternalFuzzyLanguage.g:169:4: rule__FuzzySystemBuilding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FuzzySystemBuilding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFuzzySystemBuildingAccess().getGroup()); 

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
    // $ANTLR end "ruleFuzzySystemBuilding"


    // $ANTLR start "entryRuleAffectation"
    // InternalFuzzyLanguage.g:178:1: entryRuleAffectation : ruleAffectation EOF ;
    public final void entryRuleAffectation() throws RecognitionException {
        try {
            // InternalFuzzyLanguage.g:179:1: ( ruleAffectation EOF )
            // InternalFuzzyLanguage.g:180:1: ruleAffectation EOF
            {
             before(grammarAccess.getAffectationRule()); 
            pushFollow(FOLLOW_1);
            ruleAffectation();

            state._fsp--;

             after(grammarAccess.getAffectationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAffectation"


    // $ANTLR start "ruleAffectation"
    // InternalFuzzyLanguage.g:187:1: ruleAffectation : ( ( rule__Affectation__Alternatives ) ) ;
    public final void ruleAffectation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:191:2: ( ( ( rule__Affectation__Alternatives ) ) )
            // InternalFuzzyLanguage.g:192:2: ( ( rule__Affectation__Alternatives ) )
            {
            // InternalFuzzyLanguage.g:192:2: ( ( rule__Affectation__Alternatives ) )
            // InternalFuzzyLanguage.g:193:3: ( rule__Affectation__Alternatives )
            {
             before(grammarAccess.getAffectationAccess().getAlternatives()); 
            // InternalFuzzyLanguage.g:194:3: ( rule__Affectation__Alternatives )
            // InternalFuzzyLanguage.g:194:4: rule__Affectation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAffectationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAffectation"


    // $ANTLR start "entryRuleExpression"
    // InternalFuzzyLanguage.g:203:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalFuzzyLanguage.g:204:1: ( ruleExpression EOF )
            // InternalFuzzyLanguage.g:205:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalFuzzyLanguage.g:212:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:216:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalFuzzyLanguage.g:217:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalFuzzyLanguage.g:217:2: ( ( rule__Expression__Alternatives ) )
            // InternalFuzzyLanguage.g:218:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalFuzzyLanguage.g:219:3: ( rule__Expression__Alternatives )
            // InternalFuzzyLanguage.g:219:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBinding"
    // InternalFuzzyLanguage.g:228:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // InternalFuzzyLanguage.g:229:1: ( ruleBinding EOF )
            // InternalFuzzyLanguage.g:230:1: ruleBinding EOF
            {
             before(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_1);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getBindingRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalFuzzyLanguage.g:237:1: ruleBinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:241:2: ( ( ( rule__Binding__Group__0 ) ) )
            // InternalFuzzyLanguage.g:242:2: ( ( rule__Binding__Group__0 ) )
            {
            // InternalFuzzyLanguage.g:242:2: ( ( rule__Binding__Group__0 ) )
            // InternalFuzzyLanguage.g:243:3: ( rule__Binding__Group__0 )
            {
             before(grammarAccess.getBindingAccess().getGroup()); 
            // InternalFuzzyLanguage.g:244:3: ( rule__Binding__Group__0 )
            // InternalFuzzyLanguage.g:244:4: rule__Binding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getGroup()); 

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
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleParam"
    // InternalFuzzyLanguage.g:253:1: entryRuleParam : ruleParam EOF ;
    public final void entryRuleParam() throws RecognitionException {
        try {
            // InternalFuzzyLanguage.g:254:1: ( ruleParam EOF )
            // InternalFuzzyLanguage.g:255:1: ruleParam EOF
            {
             before(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_1);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getParamRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalFuzzyLanguage.g:262:1: ruleParam : ( ( rule__Param__Alternatives ) ) ;
    public final void ruleParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:266:2: ( ( ( rule__Param__Alternatives ) ) )
            // InternalFuzzyLanguage.g:267:2: ( ( rule__Param__Alternatives ) )
            {
            // InternalFuzzyLanguage.g:267:2: ( ( rule__Param__Alternatives ) )
            // InternalFuzzyLanguage.g:268:3: ( rule__Param__Alternatives )
            {
             before(grammarAccess.getParamAccess().getAlternatives()); 
            // InternalFuzzyLanguage.g:269:3: ( rule__Param__Alternatives )
            // InternalFuzzyLanguage.g:269:4: rule__Param__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Param__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getAlternatives()); 

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
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleTypeSet"
    // InternalFuzzyLanguage.g:278:1: entryRuleTypeSet : ruleTypeSet EOF ;
    public final void entryRuleTypeSet() throws RecognitionException {
        try {
            // InternalFuzzyLanguage.g:279:1: ( ruleTypeSet EOF )
            // InternalFuzzyLanguage.g:280:1: ruleTypeSet EOF
            {
             before(grammarAccess.getTypeSetRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeSet();

            state._fsp--;

             after(grammarAccess.getTypeSetRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTypeSet"


    // $ANTLR start "ruleTypeSet"
    // InternalFuzzyLanguage.g:287:1: ruleTypeSet : ( ( rule__TypeSet__Group__0 ) ) ;
    public final void ruleTypeSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:291:2: ( ( ( rule__TypeSet__Group__0 ) ) )
            // InternalFuzzyLanguage.g:292:2: ( ( rule__TypeSet__Group__0 ) )
            {
            // InternalFuzzyLanguage.g:292:2: ( ( rule__TypeSet__Group__0 ) )
            // InternalFuzzyLanguage.g:293:3: ( rule__TypeSet__Group__0 )
            {
             before(grammarAccess.getTypeSetAccess().getGroup()); 
            // InternalFuzzyLanguage.g:294:3: ( rule__TypeSet__Group__0 )
            // InternalFuzzyLanguage.g:294:4: rule__TypeSet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeSetAccess().getGroup()); 

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
    // $ANTLR end "ruleTypeSet"


    // $ANTLR start "entryRuleFuzzyConfig"
    // InternalFuzzyLanguage.g:303:1: entryRuleFuzzyConfig : ruleFuzzyConfig EOF ;
    public final void entryRuleFuzzyConfig() throws RecognitionException {
        try {
            // InternalFuzzyLanguage.g:304:1: ( ruleFuzzyConfig EOF )
            // InternalFuzzyLanguage.g:305:1: ruleFuzzyConfig EOF
            {
             before(grammarAccess.getFuzzyConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleFuzzyConfig();

            state._fsp--;

             after(grammarAccess.getFuzzyConfigRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFuzzyConfig"


    // $ANTLR start "ruleFuzzyConfig"
    // InternalFuzzyLanguage.g:312:1: ruleFuzzyConfig : ( ( rule__FuzzyConfig__Group__0 ) ) ;
    public final void ruleFuzzyConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:316:2: ( ( ( rule__FuzzyConfig__Group__0 ) ) )
            // InternalFuzzyLanguage.g:317:2: ( ( rule__FuzzyConfig__Group__0 ) )
            {
            // InternalFuzzyLanguage.g:317:2: ( ( rule__FuzzyConfig__Group__0 ) )
            // InternalFuzzyLanguage.g:318:3: ( rule__FuzzyConfig__Group__0 )
            {
             before(grammarAccess.getFuzzyConfigAccess().getGroup()); 
            // InternalFuzzyLanguage.g:319:3: ( rule__FuzzyConfig__Group__0 )
            // InternalFuzzyLanguage.g:319:4: rule__FuzzyConfig__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FuzzyConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFuzzyConfigAccess().getGroup()); 

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
    // $ANTLR end "ruleFuzzyConfig"


    // $ANTLR start "rule__Write__Alternatives"
    // InternalFuzzyLanguage.g:327:1: rule__Write__Alternatives : ( ( ( rule__Write__Group_0__0 ) ) | ( ( rule__Write__Group_1__0 ) ) );
    public final void rule__Write__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:331:1: ( ( ( rule__Write__Group_0__0 ) ) | ( ( rule__Write__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            else if ( (LA1_0==18) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalFuzzyLanguage.g:332:2: ( ( rule__Write__Group_0__0 ) )
                    {
                    // InternalFuzzyLanguage.g:332:2: ( ( rule__Write__Group_0__0 ) )
                    // InternalFuzzyLanguage.g:333:3: ( rule__Write__Group_0__0 )
                    {
                     before(grammarAccess.getWriteAccess().getGroup_0()); 
                    // InternalFuzzyLanguage.g:334:3: ( rule__Write__Group_0__0 )
                    // InternalFuzzyLanguage.g:334:4: rule__Write__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Write__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWriteAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFuzzyLanguage.g:338:2: ( ( rule__Write__Group_1__0 ) )
                    {
                    // InternalFuzzyLanguage.g:338:2: ( ( rule__Write__Group_1__0 ) )
                    // InternalFuzzyLanguage.g:339:3: ( rule__Write__Group_1__0 )
                    {
                     before(grammarAccess.getWriteAccess().getGroup_1()); 
                    // InternalFuzzyLanguage.g:340:3: ( rule__Write__Group_1__0 )
                    // InternalFuzzyLanguage.g:340:4: rule__Write__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Write__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWriteAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Write__Alternatives"


    // $ANTLR start "rule__Output__Alternatives"
    // InternalFuzzyLanguage.g:348:1: rule__Output__Alternatives : ( ( ( rule__Output__Group_0__0 ) ) | ( ( rule__Output__TypeAssignment_1 ) ) | ( ( rule__Output__TypeAssignment_2 ) ) );
    public final void rule__Output__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:352:1: ( ( ( rule__Output__Group_0__0 ) ) | ( ( rule__Output__TypeAssignment_1 ) ) | ( ( rule__Output__TypeAssignment_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt2=1;
                }
                break;
            case 30:
                {
                alt2=2;
                }
                break;
            case 31:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalFuzzyLanguage.g:353:2: ( ( rule__Output__Group_0__0 ) )
                    {
                    // InternalFuzzyLanguage.g:353:2: ( ( rule__Output__Group_0__0 ) )
                    // InternalFuzzyLanguage.g:354:3: ( rule__Output__Group_0__0 )
                    {
                     before(grammarAccess.getOutputAccess().getGroup_0()); 
                    // InternalFuzzyLanguage.g:355:3: ( rule__Output__Group_0__0 )
                    // InternalFuzzyLanguage.g:355:4: rule__Output__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Output__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOutputAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFuzzyLanguage.g:359:2: ( ( rule__Output__TypeAssignment_1 ) )
                    {
                    // InternalFuzzyLanguage.g:359:2: ( ( rule__Output__TypeAssignment_1 ) )
                    // InternalFuzzyLanguage.g:360:3: ( rule__Output__TypeAssignment_1 )
                    {
                     before(grammarAccess.getOutputAccess().getTypeAssignment_1()); 
                    // InternalFuzzyLanguage.g:361:3: ( rule__Output__TypeAssignment_1 )
                    // InternalFuzzyLanguage.g:361:4: rule__Output__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Output__TypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getOutputAccess().getTypeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFuzzyLanguage.g:365:2: ( ( rule__Output__TypeAssignment_2 ) )
                    {
                    // InternalFuzzyLanguage.g:365:2: ( ( rule__Output__TypeAssignment_2 ) )
                    // InternalFuzzyLanguage.g:366:3: ( rule__Output__TypeAssignment_2 )
                    {
                     before(grammarAccess.getOutputAccess().getTypeAssignment_2()); 
                    // InternalFuzzyLanguage.g:367:3: ( rule__Output__TypeAssignment_2 )
                    // InternalFuzzyLanguage.g:367:4: rule__Output__TypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Output__TypeAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getOutputAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__Output__Alternatives"


    // $ANTLR start "rule__Affectation__Alternatives"
    // InternalFuzzyLanguage.g:375:1: rule__Affectation__Alternatives : ( ( ( rule__Affectation__Group_0__0 ) ) | ( ( rule__Affectation__Group_1__0 ) ) | ( ( rule__Affectation__Group_2__0 ) ) );
    public final void rule__Affectation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:379:1: ( ( ( rule__Affectation__Group_0__0 ) ) | ( ( rule__Affectation__Group_1__0 ) ) | ( ( rule__Affectation__Group_2__0 ) ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==15) ) {
                    switch ( input.LA(3) ) {
                    case RULE_OPERATOR:
                        {
                        alt3=3;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA3_4 = input.LA(4);

                        if ( (LA3_4==EOF||LA3_4==RULE_ID||(LA3_4>=22 && LA3_4<=23)) ) {
                            alt3=3;
                        }
                        else if ( (LA3_4==19) ) {
                            alt3=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_ANYTHING:
                        {
                        alt3=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }

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
                    // InternalFuzzyLanguage.g:380:2: ( ( rule__Affectation__Group_0__0 ) )
                    {
                    // InternalFuzzyLanguage.g:380:2: ( ( rule__Affectation__Group_0__0 ) )
                    // InternalFuzzyLanguage.g:381:3: ( rule__Affectation__Group_0__0 )
                    {
                     before(grammarAccess.getAffectationAccess().getGroup_0()); 
                    // InternalFuzzyLanguage.g:382:3: ( rule__Affectation__Group_0__0 )
                    // InternalFuzzyLanguage.g:382:4: rule__Affectation__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Affectation__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAffectationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFuzzyLanguage.g:386:2: ( ( rule__Affectation__Group_1__0 ) )
                    {
                    // InternalFuzzyLanguage.g:386:2: ( ( rule__Affectation__Group_1__0 ) )
                    // InternalFuzzyLanguage.g:387:3: ( rule__Affectation__Group_1__0 )
                    {
                     before(grammarAccess.getAffectationAccess().getGroup_1()); 
                    // InternalFuzzyLanguage.g:388:3: ( rule__Affectation__Group_1__0 )
                    // InternalFuzzyLanguage.g:388:4: rule__Affectation__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Affectation__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAffectationAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFuzzyLanguage.g:392:2: ( ( rule__Affectation__Group_2__0 ) )
                    {
                    // InternalFuzzyLanguage.g:392:2: ( ( rule__Affectation__Group_2__0 ) )
                    // InternalFuzzyLanguage.g:393:3: ( rule__Affectation__Group_2__0 )
                    {
                     before(grammarAccess.getAffectationAccess().getGroup_2()); 
                    // InternalFuzzyLanguage.g:394:3: ( rule__Affectation__Group_2__0 )
                    // InternalFuzzyLanguage.g:394:4: rule__Affectation__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Affectation__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAffectationAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Affectation__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalFuzzyLanguage.g:402:1: rule__Expression__Alternatives : ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__Group_1__0 ) ) | ( ( rule__Expression__NameAssignment_2 ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:406:1: ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__Group_1__0 ) ) | ( ( rule__Expression__NameAssignment_2 ) ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_OPERATOR) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==23) ) {
                    alt4=2;
                }
                else if ( (LA4_2==EOF||LA4_2==RULE_ID||LA4_2==RULE_OPERATOR||LA4_2==22) ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalFuzzyLanguage.g:407:2: ( ( rule__Expression__Group_0__0 ) )
                    {
                    // InternalFuzzyLanguage.g:407:2: ( ( rule__Expression__Group_0__0 ) )
                    // InternalFuzzyLanguage.g:408:3: ( rule__Expression__Group_0__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_0()); 
                    // InternalFuzzyLanguage.g:409:3: ( rule__Expression__Group_0__0 )
                    // InternalFuzzyLanguage.g:409:4: rule__Expression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFuzzyLanguage.g:413:2: ( ( rule__Expression__Group_1__0 ) )
                    {
                    // InternalFuzzyLanguage.g:413:2: ( ( rule__Expression__Group_1__0 ) )
                    // InternalFuzzyLanguage.g:414:3: ( rule__Expression__Group_1__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1()); 
                    // InternalFuzzyLanguage.g:415:3: ( rule__Expression__Group_1__0 )
                    // InternalFuzzyLanguage.g:415:4: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFuzzyLanguage.g:419:2: ( ( rule__Expression__NameAssignment_2 ) )
                    {
                    // InternalFuzzyLanguage.g:419:2: ( ( rule__Expression__NameAssignment_2 ) )
                    // InternalFuzzyLanguage.g:420:3: ( rule__Expression__NameAssignment_2 )
                    {
                     before(grammarAccess.getExpressionAccess().getNameAssignment_2()); 
                    // InternalFuzzyLanguage.g:421:3: ( rule__Expression__NameAssignment_2 )
                    // InternalFuzzyLanguage.g:421:4: rule__Expression__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__NameAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Param__Alternatives"
    // InternalFuzzyLanguage.g:429:1: rule__Param__Alternatives : ( ( ( rule__Param__Group_0__0 ) ) | ( ( rule__Param__ValueAssignment_1 ) ) );
    public final void rule__Param__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:433:1: ( ( ( rule__Param__Group_0__0 ) ) | ( ( rule__Param__ValueAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ANYTHING) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||LA5_1==RULE_ANYTHING||LA5_1==17) ) {
                    alt5=2;
                }
                else if ( (LA5_1==24) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalFuzzyLanguage.g:434:2: ( ( rule__Param__Group_0__0 ) )
                    {
                    // InternalFuzzyLanguage.g:434:2: ( ( rule__Param__Group_0__0 ) )
                    // InternalFuzzyLanguage.g:435:3: ( rule__Param__Group_0__0 )
                    {
                     before(grammarAccess.getParamAccess().getGroup_0()); 
                    // InternalFuzzyLanguage.g:436:3: ( rule__Param__Group_0__0 )
                    // InternalFuzzyLanguage.g:436:4: rule__Param__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Param__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParamAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFuzzyLanguage.g:440:2: ( ( rule__Param__ValueAssignment_1 ) )
                    {
                    // InternalFuzzyLanguage.g:440:2: ( ( rule__Param__ValueAssignment_1 ) )
                    // InternalFuzzyLanguage.g:441:3: ( rule__Param__ValueAssignment_1 )
                    {
                     before(grammarAccess.getParamAccess().getValueAssignment_1()); 
                    // InternalFuzzyLanguage.g:442:3: ( rule__Param__ValueAssignment_1 )
                    // InternalFuzzyLanguage.g:442:4: rule__Param__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Param__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getParamAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__Param__Alternatives"


    // $ANTLR start "rule__FuzzyModel__Group__0"
    // InternalFuzzyLanguage.g:450:1: rule__FuzzyModel__Group__0 : rule__FuzzyModel__Group__0__Impl rule__FuzzyModel__Group__1 ;
    public final void rule__FuzzyModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:454:1: ( rule__FuzzyModel__Group__0__Impl rule__FuzzyModel__Group__1 )
            // InternalFuzzyLanguage.g:455:2: rule__FuzzyModel__Group__0__Impl rule__FuzzyModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__FuzzyModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuzzyModel__Group__1();

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
    // $ANTLR end "rule__FuzzyModel__Group__0"


    // $ANTLR start "rule__FuzzyModel__Group__0__Impl"
    // InternalFuzzyLanguage.g:462:1: rule__FuzzyModel__Group__0__Impl : ( ( rule__FuzzyModel__ElementsAssignment_0 ) ) ;
    public final void rule__FuzzyModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:466:1: ( ( ( rule__FuzzyModel__ElementsAssignment_0 ) ) )
            // InternalFuzzyLanguage.g:467:1: ( ( rule__FuzzyModel__ElementsAssignment_0 ) )
            {
            // InternalFuzzyLanguage.g:467:1: ( ( rule__FuzzyModel__ElementsAssignment_0 ) )
            // InternalFuzzyLanguage.g:468:2: ( rule__FuzzyModel__ElementsAssignment_0 )
            {
             before(grammarAccess.getFuzzyModelAccess().getElementsAssignment_0()); 
            // InternalFuzzyLanguage.g:469:2: ( rule__FuzzyModel__ElementsAssignment_0 )
            // InternalFuzzyLanguage.g:469:3: rule__FuzzyModel__ElementsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FuzzyModel__ElementsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFuzzyModelAccess().getElementsAssignment_0()); 

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
    // $ANTLR end "rule__FuzzyModel__Group__0__Impl"


    // $ANTLR start "rule__FuzzyModel__Group__1"
    // InternalFuzzyLanguage.g:477:1: rule__FuzzyModel__Group__1 : rule__FuzzyModel__Group__1__Impl rule__FuzzyModel__Group__2 ;
    public final void rule__FuzzyModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:481:1: ( rule__FuzzyModel__Group__1__Impl rule__FuzzyModel__Group__2 )
            // InternalFuzzyLanguage.g:482:2: rule__FuzzyModel__Group__1__Impl rule__FuzzyModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__FuzzyModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuzzyModel__Group__2();

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
    // $ANTLR end "rule__FuzzyModel__Group__1"


    // $ANTLR start "rule__FuzzyModel__Group__1__Impl"
    // InternalFuzzyLanguage.g:489:1: rule__FuzzyModel__Group__1__Impl : ( ( rule__FuzzyModel__ElementsAssignment_1 ) ) ;
    public final void rule__FuzzyModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:493:1: ( ( ( rule__FuzzyModel__ElementsAssignment_1 ) ) )
            // InternalFuzzyLanguage.g:494:1: ( ( rule__FuzzyModel__ElementsAssignment_1 ) )
            {
            // InternalFuzzyLanguage.g:494:1: ( ( rule__FuzzyModel__ElementsAssignment_1 ) )
            // InternalFuzzyLanguage.g:495:2: ( rule__FuzzyModel__ElementsAssignment_1 )
            {
             before(grammarAccess.getFuzzyModelAccess().getElementsAssignment_1()); 
            // InternalFuzzyLanguage.g:496:2: ( rule__FuzzyModel__ElementsAssignment_1 )
            // InternalFuzzyLanguage.g:496:3: rule__FuzzyModel__ElementsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FuzzyModel__ElementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFuzzyModelAccess().getElementsAssignment_1()); 

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
    // $ANTLR end "rule__FuzzyModel__Group__1__Impl"


    // $ANTLR start "rule__FuzzyModel__Group__2"
    // InternalFuzzyLanguage.g:504:1: rule__FuzzyModel__Group__2 : rule__FuzzyModel__Group__2__Impl ;
    public final void rule__FuzzyModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:508:1: ( rule__FuzzyModel__Group__2__Impl )
            // InternalFuzzyLanguage.g:509:2: rule__FuzzyModel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuzzyModel__Group__2__Impl();

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
    // $ANTLR end "rule__FuzzyModel__Group__2"


    // $ANTLR start "rule__FuzzyModel__Group__2__Impl"
    // InternalFuzzyLanguage.g:515:1: rule__FuzzyModel__Group__2__Impl : ( ( rule__FuzzyModel__ElementsAssignment_2 )* ) ;
    public final void rule__FuzzyModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:519:1: ( ( ( rule__FuzzyModel__ElementsAssignment_2 )* ) )
            // InternalFuzzyLanguage.g:520:1: ( ( rule__FuzzyModel__ElementsAssignment_2 )* )
            {
            // InternalFuzzyLanguage.g:520:1: ( ( rule__FuzzyModel__ElementsAssignment_2 )* )
            // InternalFuzzyLanguage.g:521:2: ( rule__FuzzyModel__ElementsAssignment_2 )*
            {
             before(grammarAccess.getFuzzyModelAccess().getElementsAssignment_2()); 
            // InternalFuzzyLanguage.g:522:2: ( rule__FuzzyModel__ElementsAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalFuzzyLanguage.g:522:3: rule__FuzzyModel__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__FuzzyModel__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getFuzzyModelAccess().getElementsAssignment_2()); 

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
    // $ANTLR end "rule__FuzzyModel__Group__2__Impl"


    // $ANTLR start "rule__Outputs__Group__0"
    // InternalFuzzyLanguage.g:531:1: rule__Outputs__Group__0 : rule__Outputs__Group__0__Impl rule__Outputs__Group__1 ;
    public final void rule__Outputs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:535:1: ( rule__Outputs__Group__0__Impl rule__Outputs__Group__1 )
            // InternalFuzzyLanguage.g:536:2: rule__Outputs__Group__0__Impl rule__Outputs__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Outputs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Outputs__Group__1();

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
    // $ANTLR end "rule__Outputs__Group__0"


    // $ANTLR start "rule__Outputs__Group__0__Impl"
    // InternalFuzzyLanguage.g:543:1: rule__Outputs__Group__0__Impl : ( 'Output' ) ;
    public final void rule__Outputs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:547:1: ( ( 'Output' ) )
            // InternalFuzzyLanguage.g:548:1: ( 'Output' )
            {
            // InternalFuzzyLanguage.g:548:1: ( 'Output' )
            // InternalFuzzyLanguage.g:549:2: 'Output'
            {
             before(grammarAccess.getOutputsAccess().getOutputKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getOutputsAccess().getOutputKeyword_0()); 

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
    // $ANTLR end "rule__Outputs__Group__0__Impl"


    // $ANTLR start "rule__Outputs__Group__1"
    // InternalFuzzyLanguage.g:558:1: rule__Outputs__Group__1 : rule__Outputs__Group__1__Impl rule__Outputs__Group__2 ;
    public final void rule__Outputs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:562:1: ( rule__Outputs__Group__1__Impl rule__Outputs__Group__2 )
            // InternalFuzzyLanguage.g:563:2: rule__Outputs__Group__1__Impl rule__Outputs__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Outputs__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Outputs__Group__2();

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
    // $ANTLR end "rule__Outputs__Group__1"


    // $ANTLR start "rule__Outputs__Group__1__Impl"
    // InternalFuzzyLanguage.g:570:1: rule__Outputs__Group__1__Impl : ( '=' ) ;
    public final void rule__Outputs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:574:1: ( ( '=' ) )
            // InternalFuzzyLanguage.g:575:1: ( '=' )
            {
            // InternalFuzzyLanguage.g:575:1: ( '=' )
            // InternalFuzzyLanguage.g:576:2: '='
            {
             before(grammarAccess.getOutputsAccess().getEqualsSignKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getOutputsAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__Outputs__Group__1__Impl"


    // $ANTLR start "rule__Outputs__Group__2"
    // InternalFuzzyLanguage.g:585:1: rule__Outputs__Group__2 : rule__Outputs__Group__2__Impl rule__Outputs__Group__3 ;
    public final void rule__Outputs__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:589:1: ( rule__Outputs__Group__2__Impl rule__Outputs__Group__3 )
            // InternalFuzzyLanguage.g:590:2: rule__Outputs__Group__2__Impl rule__Outputs__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Outputs__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Outputs__Group__3();

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
    // $ANTLR end "rule__Outputs__Group__2"


    // $ANTLR start "rule__Outputs__Group__2__Impl"
    // InternalFuzzyLanguage.g:597:1: rule__Outputs__Group__2__Impl : ( ( rule__Outputs__OutAssignment_2 ) ) ;
    public final void rule__Outputs__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:601:1: ( ( ( rule__Outputs__OutAssignment_2 ) ) )
            // InternalFuzzyLanguage.g:602:1: ( ( rule__Outputs__OutAssignment_2 ) )
            {
            // InternalFuzzyLanguage.g:602:1: ( ( rule__Outputs__OutAssignment_2 ) )
            // InternalFuzzyLanguage.g:603:2: ( rule__Outputs__OutAssignment_2 )
            {
             before(grammarAccess.getOutputsAccess().getOutAssignment_2()); 
            // InternalFuzzyLanguage.g:604:2: ( rule__Outputs__OutAssignment_2 )
            // InternalFuzzyLanguage.g:604:3: rule__Outputs__OutAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Outputs__OutAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOutputsAccess().getOutAssignment_2()); 

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
    // $ANTLR end "rule__Outputs__Group__2__Impl"


    // $ANTLR start "rule__Outputs__Group__3"
    // InternalFuzzyLanguage.g:612:1: rule__Outputs__Group__3 : rule__Outputs__Group__3__Impl ;
    public final void rule__Outputs__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:616:1: ( rule__Outputs__Group__3__Impl )
            // InternalFuzzyLanguage.g:617:2: rule__Outputs__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Outputs__Group__3__Impl();

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
    // $ANTLR end "rule__Outputs__Group__3"


    // $ANTLR start "rule__Outputs__Group__3__Impl"
    // InternalFuzzyLanguage.g:623:1: rule__Outputs__Group__3__Impl : ( ( rule__Outputs__WrAssignment_3 ) ) ;
    public final void rule__Outputs__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:627:1: ( ( ( rule__Outputs__WrAssignment_3 ) ) )
            // InternalFuzzyLanguage.g:628:1: ( ( rule__Outputs__WrAssignment_3 ) )
            {
            // InternalFuzzyLanguage.g:628:1: ( ( rule__Outputs__WrAssignment_3 ) )
            // InternalFuzzyLanguage.g:629:2: ( rule__Outputs__WrAssignment_3 )
            {
             before(grammarAccess.getOutputsAccess().getWrAssignment_3()); 
            // InternalFuzzyLanguage.g:630:2: ( rule__Outputs__WrAssignment_3 )
            // InternalFuzzyLanguage.g:630:3: rule__Outputs__WrAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Outputs__WrAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOutputsAccess().getWrAssignment_3()); 

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
    // $ANTLR end "rule__Outputs__Group__3__Impl"


    // $ANTLR start "rule__Write__Group_0__0"
    // InternalFuzzyLanguage.g:639:1: rule__Write__Group_0__0 : rule__Write__Group_0__0__Impl rule__Write__Group_0__1 ;
    public final void rule__Write__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:643:1: ( rule__Write__Group_0__0__Impl rule__Write__Group_0__1 )
            // InternalFuzzyLanguage.g:644:2: rule__Write__Group_0__0__Impl rule__Write__Group_0__1
            {
            pushFollow(FOLLOW_9);
            rule__Write__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Write__Group_0__1();

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
    // $ANTLR end "rule__Write__Group_0__0"


    // $ANTLR start "rule__Write__Group_0__0__Impl"
    // InternalFuzzyLanguage.g:651:1: rule__Write__Group_0__0__Impl : ( 'Write(' ) ;
    public final void rule__Write__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:655:1: ( ( 'Write(' ) )
            // InternalFuzzyLanguage.g:656:1: ( 'Write(' )
            {
            // InternalFuzzyLanguage.g:656:1: ( 'Write(' )
            // InternalFuzzyLanguage.g:657:2: 'Write('
            {
             before(grammarAccess.getWriteAccess().getWriteKeyword_0_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWriteAccess().getWriteKeyword_0_0()); 

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
    // $ANTLR end "rule__Write__Group_0__0__Impl"


    // $ANTLR start "rule__Write__Group_0__1"
    // InternalFuzzyLanguage.g:666:1: rule__Write__Group_0__1 : rule__Write__Group_0__1__Impl rule__Write__Group_0__2 ;
    public final void rule__Write__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:670:1: ( rule__Write__Group_0__1__Impl rule__Write__Group_0__2 )
            // InternalFuzzyLanguage.g:671:2: rule__Write__Group_0__1__Impl rule__Write__Group_0__2
            {
            pushFollow(FOLLOW_10);
            rule__Write__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Write__Group_0__2();

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
    // $ANTLR end "rule__Write__Group_0__1"


    // $ANTLR start "rule__Write__Group_0__1__Impl"
    // InternalFuzzyLanguage.g:678:1: rule__Write__Group_0__1__Impl : ( ( rule__Write__ValueAssignment_0_1 ) ) ;
    public final void rule__Write__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:682:1: ( ( ( rule__Write__ValueAssignment_0_1 ) ) )
            // InternalFuzzyLanguage.g:683:1: ( ( rule__Write__ValueAssignment_0_1 ) )
            {
            // InternalFuzzyLanguage.g:683:1: ( ( rule__Write__ValueAssignment_0_1 ) )
            // InternalFuzzyLanguage.g:684:2: ( rule__Write__ValueAssignment_0_1 )
            {
             before(grammarAccess.getWriteAccess().getValueAssignment_0_1()); 
            // InternalFuzzyLanguage.g:685:2: ( rule__Write__ValueAssignment_0_1 )
            // InternalFuzzyLanguage.g:685:3: rule__Write__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Write__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getWriteAccess().getValueAssignment_0_1()); 

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
    // $ANTLR end "rule__Write__Group_0__1__Impl"


    // $ANTLR start "rule__Write__Group_0__2"
    // InternalFuzzyLanguage.g:693:1: rule__Write__Group_0__2 : rule__Write__Group_0__2__Impl ;
    public final void rule__Write__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:697:1: ( rule__Write__Group_0__2__Impl )
            // InternalFuzzyLanguage.g:698:2: rule__Write__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Write__Group_0__2__Impl();

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
    // $ANTLR end "rule__Write__Group_0__2"


    // $ANTLR start "rule__Write__Group_0__2__Impl"
    // InternalFuzzyLanguage.g:704:1: rule__Write__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Write__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:708:1: ( ( ')' ) )
            // InternalFuzzyLanguage.g:709:1: ( ')' )
            {
            // InternalFuzzyLanguage.g:709:1: ( ')' )
            // InternalFuzzyLanguage.g:710:2: ')'
            {
             before(grammarAccess.getWriteAccess().getRightParenthesisKeyword_0_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getWriteAccess().getRightParenthesisKeyword_0_2()); 

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
    // $ANTLR end "rule__Write__Group_0__2__Impl"


    // $ANTLR start "rule__Write__Group_1__0"
    // InternalFuzzyLanguage.g:720:1: rule__Write__Group_1__0 : rule__Write__Group_1__0__Impl rule__Write__Group_1__1 ;
    public final void rule__Write__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:724:1: ( rule__Write__Group_1__0__Impl rule__Write__Group_1__1 )
            // InternalFuzzyLanguage.g:725:2: rule__Write__Group_1__0__Impl rule__Write__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Write__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Write__Group_1__1();

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
    // $ANTLR end "rule__Write__Group_1__0"


    // $ANTLR start "rule__Write__Group_1__0__Impl"
    // InternalFuzzyLanguage.g:732:1: rule__Write__Group_1__0__Impl : ( 'Print(' ) ;
    public final void rule__Write__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:736:1: ( ( 'Print(' ) )
            // InternalFuzzyLanguage.g:737:1: ( 'Print(' )
            {
            // InternalFuzzyLanguage.g:737:1: ( 'Print(' )
            // InternalFuzzyLanguage.g:738:2: 'Print('
            {
             before(grammarAccess.getWriteAccess().getPrintKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getWriteAccess().getPrintKeyword_1_0()); 

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
    // $ANTLR end "rule__Write__Group_1__0__Impl"


    // $ANTLR start "rule__Write__Group_1__1"
    // InternalFuzzyLanguage.g:747:1: rule__Write__Group_1__1 : rule__Write__Group_1__1__Impl rule__Write__Group_1__2 ;
    public final void rule__Write__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:751:1: ( rule__Write__Group_1__1__Impl rule__Write__Group_1__2 )
            // InternalFuzzyLanguage.g:752:2: rule__Write__Group_1__1__Impl rule__Write__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__Write__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Write__Group_1__2();

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
    // $ANTLR end "rule__Write__Group_1__1"


    // $ANTLR start "rule__Write__Group_1__1__Impl"
    // InternalFuzzyLanguage.g:759:1: rule__Write__Group_1__1__Impl : ( ( rule__Write__ValueAssignment_1_1 ) ) ;
    public final void rule__Write__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:763:1: ( ( ( rule__Write__ValueAssignment_1_1 ) ) )
            // InternalFuzzyLanguage.g:764:1: ( ( rule__Write__ValueAssignment_1_1 ) )
            {
            // InternalFuzzyLanguage.g:764:1: ( ( rule__Write__ValueAssignment_1_1 ) )
            // InternalFuzzyLanguage.g:765:2: ( rule__Write__ValueAssignment_1_1 )
            {
             before(grammarAccess.getWriteAccess().getValueAssignment_1_1()); 
            // InternalFuzzyLanguage.g:766:2: ( rule__Write__ValueAssignment_1_1 )
            // InternalFuzzyLanguage.g:766:3: rule__Write__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Write__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getWriteAccess().getValueAssignment_1_1()); 

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
    // $ANTLR end "rule__Write__Group_1__1__Impl"


    // $ANTLR start "rule__Write__Group_1__2"
    // InternalFuzzyLanguage.g:774:1: rule__Write__Group_1__2 : rule__Write__Group_1__2__Impl ;
    public final void rule__Write__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:778:1: ( rule__Write__Group_1__2__Impl )
            // InternalFuzzyLanguage.g:779:2: rule__Write__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Write__Group_1__2__Impl();

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
    // $ANTLR end "rule__Write__Group_1__2"


    // $ANTLR start "rule__Write__Group_1__2__Impl"
    // InternalFuzzyLanguage.g:785:1: rule__Write__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Write__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:789:1: ( ( ')' ) )
            // InternalFuzzyLanguage.g:790:1: ( ')' )
            {
            // InternalFuzzyLanguage.g:790:1: ( ')' )
            // InternalFuzzyLanguage.g:791:2: ')'
            {
             before(grammarAccess.getWriteAccess().getRightParenthesisKeyword_1_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getWriteAccess().getRightParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__Write__Group_1__2__Impl"


    // $ANTLR start "rule__Output__Group_0__0"
    // InternalFuzzyLanguage.g:801:1: rule__Output__Group_0__0 : rule__Output__Group_0__0__Impl rule__Output__Group_0__1 ;
    public final void rule__Output__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:805:1: ( rule__Output__Group_0__0__Impl rule__Output__Group_0__1 )
            // InternalFuzzyLanguage.g:806:2: rule__Output__Group_0__0__Impl rule__Output__Group_0__1
            {
            pushFollow(FOLLOW_11);
            rule__Output__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group_0__1();

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
    // $ANTLR end "rule__Output__Group_0__0"


    // $ANTLR start "rule__Output__Group_0__0__Impl"
    // InternalFuzzyLanguage.g:813:1: rule__Output__Group_0__0__Impl : ( ( rule__Output__TypeAssignment_0_0 ) ) ;
    public final void rule__Output__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:817:1: ( ( ( rule__Output__TypeAssignment_0_0 ) ) )
            // InternalFuzzyLanguage.g:818:1: ( ( rule__Output__TypeAssignment_0_0 ) )
            {
            // InternalFuzzyLanguage.g:818:1: ( ( rule__Output__TypeAssignment_0_0 ) )
            // InternalFuzzyLanguage.g:819:2: ( rule__Output__TypeAssignment_0_0 )
            {
             before(grammarAccess.getOutputAccess().getTypeAssignment_0_0()); 
            // InternalFuzzyLanguage.g:820:2: ( rule__Output__TypeAssignment_0_0 )
            // InternalFuzzyLanguage.g:820:3: rule__Output__TypeAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Output__TypeAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getTypeAssignment_0_0()); 

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
    // $ANTLR end "rule__Output__Group_0__0__Impl"


    // $ANTLR start "rule__Output__Group_0__1"
    // InternalFuzzyLanguage.g:828:1: rule__Output__Group_0__1 : rule__Output__Group_0__1__Impl rule__Output__Group_0__2 ;
    public final void rule__Output__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:832:1: ( rule__Output__Group_0__1__Impl rule__Output__Group_0__2 )
            // InternalFuzzyLanguage.g:833:2: rule__Output__Group_0__1__Impl rule__Output__Group_0__2
            {
            pushFollow(FOLLOW_12);
            rule__Output__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group_0__2();

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
    // $ANTLR end "rule__Output__Group_0__1"


    // $ANTLR start "rule__Output__Group_0__1__Impl"
    // InternalFuzzyLanguage.g:840:1: rule__Output__Group_0__1__Impl : ( '(' ) ;
    public final void rule__Output__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:844:1: ( ( '(' ) )
            // InternalFuzzyLanguage.g:845:1: ( '(' )
            {
            // InternalFuzzyLanguage.g:845:1: ( '(' )
            // InternalFuzzyLanguage.g:846:2: '('
            {
             before(grammarAccess.getOutputAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getLeftParenthesisKeyword_0_1()); 

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
    // $ANTLR end "rule__Output__Group_0__1__Impl"


    // $ANTLR start "rule__Output__Group_0__2"
    // InternalFuzzyLanguage.g:855:1: rule__Output__Group_0__2 : rule__Output__Group_0__2__Impl rule__Output__Group_0__3 ;
    public final void rule__Output__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:859:1: ( rule__Output__Group_0__2__Impl rule__Output__Group_0__3 )
            // InternalFuzzyLanguage.g:860:2: rule__Output__Group_0__2__Impl rule__Output__Group_0__3
            {
            pushFollow(FOLLOW_10);
            rule__Output__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group_0__3();

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
    // $ANTLR end "rule__Output__Group_0__2"


    // $ANTLR start "rule__Output__Group_0__2__Impl"
    // InternalFuzzyLanguage.g:867:1: rule__Output__Group_0__2__Impl : ( ( rule__Output__PathAssignment_0_2 ) ) ;
    public final void rule__Output__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:871:1: ( ( ( rule__Output__PathAssignment_0_2 ) ) )
            // InternalFuzzyLanguage.g:872:1: ( ( rule__Output__PathAssignment_0_2 ) )
            {
            // InternalFuzzyLanguage.g:872:1: ( ( rule__Output__PathAssignment_0_2 ) )
            // InternalFuzzyLanguage.g:873:2: ( rule__Output__PathAssignment_0_2 )
            {
             before(grammarAccess.getOutputAccess().getPathAssignment_0_2()); 
            // InternalFuzzyLanguage.g:874:2: ( rule__Output__PathAssignment_0_2 )
            // InternalFuzzyLanguage.g:874:3: rule__Output__PathAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Output__PathAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getPathAssignment_0_2()); 

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
    // $ANTLR end "rule__Output__Group_0__2__Impl"


    // $ANTLR start "rule__Output__Group_0__3"
    // InternalFuzzyLanguage.g:882:1: rule__Output__Group_0__3 : rule__Output__Group_0__3__Impl ;
    public final void rule__Output__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:886:1: ( rule__Output__Group_0__3__Impl )
            // InternalFuzzyLanguage.g:887:2: rule__Output__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group_0__3__Impl();

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
    // $ANTLR end "rule__Output__Group_0__3"


    // $ANTLR start "rule__Output__Group_0__3__Impl"
    // InternalFuzzyLanguage.g:893:1: rule__Output__Group_0__3__Impl : ( ')' ) ;
    public final void rule__Output__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:897:1: ( ( ')' ) )
            // InternalFuzzyLanguage.g:898:1: ( ')' )
            {
            // InternalFuzzyLanguage.g:898:1: ( ')' )
            // InternalFuzzyLanguage.g:899:2: ')'
            {
             before(grammarAccess.getOutputAccess().getRightParenthesisKeyword_0_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getRightParenthesisKeyword_0_3()); 

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
    // $ANTLR end "rule__Output__Group_0__3__Impl"


    // $ANTLR start "rule__FuzzySystemBuilding__Group__0"
    // InternalFuzzyLanguage.g:909:1: rule__FuzzySystemBuilding__Group__0 : rule__FuzzySystemBuilding__Group__0__Impl rule__FuzzySystemBuilding__Group__1 ;
    public final void rule__FuzzySystemBuilding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:913:1: ( rule__FuzzySystemBuilding__Group__0__Impl rule__FuzzySystemBuilding__Group__1 )
            // InternalFuzzyLanguage.g:914:2: rule__FuzzySystemBuilding__Group__0__Impl rule__FuzzySystemBuilding__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__FuzzySystemBuilding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuzzySystemBuilding__Group__1();

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
    // $ANTLR end "rule__FuzzySystemBuilding__Group__0"


    // $ANTLR start "rule__FuzzySystemBuilding__Group__0__Impl"
    // InternalFuzzyLanguage.g:921:1: rule__FuzzySystemBuilding__Group__0__Impl : ( 'FuzzySystemBuilding' ) ;
    public final void rule__FuzzySystemBuilding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:925:1: ( ( 'FuzzySystemBuilding' ) )
            // InternalFuzzyLanguage.g:926:1: ( 'FuzzySystemBuilding' )
            {
            // InternalFuzzyLanguage.g:926:1: ( 'FuzzySystemBuilding' )
            // InternalFuzzyLanguage.g:927:2: 'FuzzySystemBuilding'
            {
             before(grammarAccess.getFuzzySystemBuildingAccess().getFuzzySystemBuildingKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFuzzySystemBuildingAccess().getFuzzySystemBuildingKeyword_0()); 

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
    // $ANTLR end "rule__FuzzySystemBuilding__Group__0__Impl"


    // $ANTLR start "rule__FuzzySystemBuilding__Group__1"
    // InternalFuzzyLanguage.g:936:1: rule__FuzzySystemBuilding__Group__1 : rule__FuzzySystemBuilding__Group__1__Impl rule__FuzzySystemBuilding__Group__2 ;
    public final void rule__FuzzySystemBuilding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:940:1: ( rule__FuzzySystemBuilding__Group__1__Impl rule__FuzzySystemBuilding__Group__2 )
            // InternalFuzzyLanguage.g:941:2: rule__FuzzySystemBuilding__Group__1__Impl rule__FuzzySystemBuilding__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__FuzzySystemBuilding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuzzySystemBuilding__Group__2();

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
    // $ANTLR end "rule__FuzzySystemBuilding__Group__1"


    // $ANTLR start "rule__FuzzySystemBuilding__Group__1__Impl"
    // InternalFuzzyLanguage.g:948:1: rule__FuzzySystemBuilding__Group__1__Impl : ( '{' ) ;
    public final void rule__FuzzySystemBuilding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:952:1: ( ( '{' ) )
            // InternalFuzzyLanguage.g:953:1: ( '{' )
            {
            // InternalFuzzyLanguage.g:953:1: ( '{' )
            // InternalFuzzyLanguage.g:954:2: '{'
            {
             before(grammarAccess.getFuzzySystemBuildingAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFuzzySystemBuildingAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__FuzzySystemBuilding__Group__1__Impl"


    // $ANTLR start "rule__FuzzySystemBuilding__Group__2"
    // InternalFuzzyLanguage.g:963:1: rule__FuzzySystemBuilding__Group__2 : rule__FuzzySystemBuilding__Group__2__Impl rule__FuzzySystemBuilding__Group__3 ;
    public final void rule__FuzzySystemBuilding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:967:1: ( rule__FuzzySystemBuilding__Group__2__Impl rule__FuzzySystemBuilding__Group__3 )
            // InternalFuzzyLanguage.g:968:2: rule__FuzzySystemBuilding__Group__2__Impl rule__FuzzySystemBuilding__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__FuzzySystemBuilding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuzzySystemBuilding__Group__3();

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
    // $ANTLR end "rule__FuzzySystemBuilding__Group__2"


    // $ANTLR start "rule__FuzzySystemBuilding__Group__2__Impl"
    // InternalFuzzyLanguage.g:975:1: rule__FuzzySystemBuilding__Group__2__Impl : ( ( rule__FuzzySystemBuilding__AffectationsAssignment_2 )* ) ;
    public final void rule__FuzzySystemBuilding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:979:1: ( ( ( rule__FuzzySystemBuilding__AffectationsAssignment_2 )* ) )
            // InternalFuzzyLanguage.g:980:1: ( ( rule__FuzzySystemBuilding__AffectationsAssignment_2 )* )
            {
            // InternalFuzzyLanguage.g:980:1: ( ( rule__FuzzySystemBuilding__AffectationsAssignment_2 )* )
            // InternalFuzzyLanguage.g:981:2: ( rule__FuzzySystemBuilding__AffectationsAssignment_2 )*
            {
             before(grammarAccess.getFuzzySystemBuildingAccess().getAffectationsAssignment_2()); 
            // InternalFuzzyLanguage.g:982:2: ( rule__FuzzySystemBuilding__AffectationsAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalFuzzyLanguage.g:982:3: rule__FuzzySystemBuilding__AffectationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__FuzzySystemBuilding__AffectationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getFuzzySystemBuildingAccess().getAffectationsAssignment_2()); 

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
    // $ANTLR end "rule__FuzzySystemBuilding__Group__2__Impl"


    // $ANTLR start "rule__FuzzySystemBuilding__Group__3"
    // InternalFuzzyLanguage.g:990:1: rule__FuzzySystemBuilding__Group__3 : rule__FuzzySystemBuilding__Group__3__Impl ;
    public final void rule__FuzzySystemBuilding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:994:1: ( rule__FuzzySystemBuilding__Group__3__Impl )
            // InternalFuzzyLanguage.g:995:2: rule__FuzzySystemBuilding__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuzzySystemBuilding__Group__3__Impl();

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
    // $ANTLR end "rule__FuzzySystemBuilding__Group__3"


    // $ANTLR start "rule__FuzzySystemBuilding__Group__3__Impl"
    // InternalFuzzyLanguage.g:1001:1: rule__FuzzySystemBuilding__Group__3__Impl : ( '}' ) ;
    public final void rule__FuzzySystemBuilding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1005:1: ( ( '}' ) )
            // InternalFuzzyLanguage.g:1006:1: ( '}' )
            {
            // InternalFuzzyLanguage.g:1006:1: ( '}' )
            // InternalFuzzyLanguage.g:1007:2: '}'
            {
             before(grammarAccess.getFuzzySystemBuildingAccess().getRightCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFuzzySystemBuildingAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__FuzzySystemBuilding__Group__3__Impl"


    // $ANTLR start "rule__Affectation__Group_0__0"
    // InternalFuzzyLanguage.g:1017:1: rule__Affectation__Group_0__0 : rule__Affectation__Group_0__0__Impl rule__Affectation__Group_0__1 ;
    public final void rule__Affectation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1021:1: ( rule__Affectation__Group_0__0__Impl rule__Affectation__Group_0__1 )
            // InternalFuzzyLanguage.g:1022:2: rule__Affectation__Group_0__0__Impl rule__Affectation__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Affectation__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Affectation__Group_0__1();

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
    // $ANTLR end "rule__Affectation__Group_0__0"


    // $ANTLR start "rule__Affectation__Group_0__0__Impl"
    // InternalFuzzyLanguage.g:1029:1: rule__Affectation__Group_0__0__Impl : ( ( rule__Affectation__NameAssignment_0_0 ) ) ;
    public final void rule__Affectation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1033:1: ( ( ( rule__Affectation__NameAssignment_0_0 ) ) )
            // InternalFuzzyLanguage.g:1034:1: ( ( rule__Affectation__NameAssignment_0_0 ) )
            {
            // InternalFuzzyLanguage.g:1034:1: ( ( rule__Affectation__NameAssignment_0_0 ) )
            // InternalFuzzyLanguage.g:1035:2: ( rule__Affectation__NameAssignment_0_0 )
            {
             before(grammarAccess.getAffectationAccess().getNameAssignment_0_0()); 
            // InternalFuzzyLanguage.g:1036:2: ( rule__Affectation__NameAssignment_0_0 )
            // InternalFuzzyLanguage.g:1036:3: rule__Affectation__NameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__NameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAffectationAccess().getNameAssignment_0_0()); 

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
    // $ANTLR end "rule__Affectation__Group_0__0__Impl"


    // $ANTLR start "rule__Affectation__Group_0__1"
    // InternalFuzzyLanguage.g:1044:1: rule__Affectation__Group_0__1 : rule__Affectation__Group_0__1__Impl rule__Affectation__Group_0__2 ;
    public final void rule__Affectation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1048:1: ( rule__Affectation__Group_0__1__Impl rule__Affectation__Group_0__2 )
            // InternalFuzzyLanguage.g:1049:2: rule__Affectation__Group_0__1__Impl rule__Affectation__Group_0__2
            {
            pushFollow(FOLLOW_9);
            rule__Affectation__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Affectation__Group_0__2();

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
    // $ANTLR end "rule__Affectation__Group_0__1"


    // $ANTLR start "rule__Affectation__Group_0__1__Impl"
    // InternalFuzzyLanguage.g:1056:1: rule__Affectation__Group_0__1__Impl : ( '=' ) ;
    public final void rule__Affectation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1060:1: ( ( '=' ) )
            // InternalFuzzyLanguage.g:1061:1: ( '=' )
            {
            // InternalFuzzyLanguage.g:1061:1: ( '=' )
            // InternalFuzzyLanguage.g:1062:2: '='
            {
             before(grammarAccess.getAffectationAccess().getEqualsSignKeyword_0_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAffectationAccess().getEqualsSignKeyword_0_1()); 

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
    // $ANTLR end "rule__Affectation__Group_0__1__Impl"


    // $ANTLR start "rule__Affectation__Group_0__2"
    // InternalFuzzyLanguage.g:1071:1: rule__Affectation__Group_0__2 : rule__Affectation__Group_0__2__Impl rule__Affectation__Group_0__3 ;
    public final void rule__Affectation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1075:1: ( rule__Affectation__Group_0__2__Impl rule__Affectation__Group_0__3 )
            // InternalFuzzyLanguage.g:1076:2: rule__Affectation__Group_0__2__Impl rule__Affectation__Group_0__3
            {
            pushFollow(FOLLOW_11);
            rule__Affectation__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Affectation__Group_0__3();

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
    // $ANTLR end "rule__Affectation__Group_0__2"


    // $ANTLR start "rule__Affectation__Group_0__2__Impl"
    // InternalFuzzyLanguage.g:1083:1: rule__Affectation__Group_0__2__Impl : ( ( rule__Affectation__ValueAssignment_0_2 ) ) ;
    public final void rule__Affectation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1087:1: ( ( ( rule__Affectation__ValueAssignment_0_2 ) ) )
            // InternalFuzzyLanguage.g:1088:1: ( ( rule__Affectation__ValueAssignment_0_2 ) )
            {
            // InternalFuzzyLanguage.g:1088:1: ( ( rule__Affectation__ValueAssignment_0_2 ) )
            // InternalFuzzyLanguage.g:1089:2: ( rule__Affectation__ValueAssignment_0_2 )
            {
             before(grammarAccess.getAffectationAccess().getValueAssignment_0_2()); 
            // InternalFuzzyLanguage.g:1090:2: ( rule__Affectation__ValueAssignment_0_2 )
            // InternalFuzzyLanguage.g:1090:3: rule__Affectation__ValueAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__ValueAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getAffectationAccess().getValueAssignment_0_2()); 

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
    // $ANTLR end "rule__Affectation__Group_0__2__Impl"


    // $ANTLR start "rule__Affectation__Group_0__3"
    // InternalFuzzyLanguage.g:1098:1: rule__Affectation__Group_0__3 : rule__Affectation__Group_0__3__Impl rule__Affectation__Group_0__4 ;
    public final void rule__Affectation__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1102:1: ( rule__Affectation__Group_0__3__Impl rule__Affectation__Group_0__4 )
            // InternalFuzzyLanguage.g:1103:2: rule__Affectation__Group_0__3__Impl rule__Affectation__Group_0__4
            {
            pushFollow(FOLLOW_16);
            rule__Affectation__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Affectation__Group_0__4();

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
    // $ANTLR end "rule__Affectation__Group_0__3"


    // $ANTLR start "rule__Affectation__Group_0__3__Impl"
    // InternalFuzzyLanguage.g:1110:1: rule__Affectation__Group_0__3__Impl : ( '(' ) ;
    public final void rule__Affectation__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1114:1: ( ( '(' ) )
            // InternalFuzzyLanguage.g:1115:1: ( '(' )
            {
            // InternalFuzzyLanguage.g:1115:1: ( '(' )
            // InternalFuzzyLanguage.g:1116:2: '('
            {
             before(grammarAccess.getAffectationAccess().getLeftParenthesisKeyword_0_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAffectationAccess().getLeftParenthesisKeyword_0_3()); 

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
    // $ANTLR end "rule__Affectation__Group_0__3__Impl"


    // $ANTLR start "rule__Affectation__Group_0__4"
    // InternalFuzzyLanguage.g:1125:1: rule__Affectation__Group_0__4 : rule__Affectation__Group_0__4__Impl rule__Affectation__Group_0__5 ;
    public final void rule__Affectation__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1129:1: ( rule__Affectation__Group_0__4__Impl rule__Affectation__Group_0__5 )
            // InternalFuzzyLanguage.g:1130:2: rule__Affectation__Group_0__4__Impl rule__Affectation__Group_0__5
            {
            pushFollow(FOLLOW_16);
            rule__Affectation__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Affectation__Group_0__5();

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
    // $ANTLR end "rule__Affectation__Group_0__4"


    // $ANTLR start "rule__Affectation__Group_0__4__Impl"
    // InternalFuzzyLanguage.g:1137:1: rule__Affectation__Group_0__4__Impl : ( ( rule__Affectation__ParamsAssignment_0_4 )* ) ;
    public final void rule__Affectation__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1141:1: ( ( ( rule__Affectation__ParamsAssignment_0_4 )* ) )
            // InternalFuzzyLanguage.g:1142:1: ( ( rule__Affectation__ParamsAssignment_0_4 )* )
            {
            // InternalFuzzyLanguage.g:1142:1: ( ( rule__Affectation__ParamsAssignment_0_4 )* )
            // InternalFuzzyLanguage.g:1143:2: ( rule__Affectation__ParamsAssignment_0_4 )*
            {
             before(grammarAccess.getAffectationAccess().getParamsAssignment_0_4()); 
            // InternalFuzzyLanguage.g:1144:2: ( rule__Affectation__ParamsAssignment_0_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ANYTHING) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalFuzzyLanguage.g:1144:3: rule__Affectation__ParamsAssignment_0_4
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Affectation__ParamsAssignment_0_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getAffectationAccess().getParamsAssignment_0_4()); 

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
    // $ANTLR end "rule__Affectation__Group_0__4__Impl"


    // $ANTLR start "rule__Affectation__Group_0__5"
    // InternalFuzzyLanguage.g:1152:1: rule__Affectation__Group_0__5 : rule__Affectation__Group_0__5__Impl ;
    public final void rule__Affectation__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1156:1: ( rule__Affectation__Group_0__5__Impl )
            // InternalFuzzyLanguage.g:1157:2: rule__Affectation__Group_0__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__Group_0__5__Impl();

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
    // $ANTLR end "rule__Affectation__Group_0__5"


    // $ANTLR start "rule__Affectation__Group_0__5__Impl"
    // InternalFuzzyLanguage.g:1163:1: rule__Affectation__Group_0__5__Impl : ( ')' ) ;
    public final void rule__Affectation__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1167:1: ( ( ')' ) )
            // InternalFuzzyLanguage.g:1168:1: ( ')' )
            {
            // InternalFuzzyLanguage.g:1168:1: ( ')' )
            // InternalFuzzyLanguage.g:1169:2: ')'
            {
             before(grammarAccess.getAffectationAccess().getRightParenthesisKeyword_0_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAffectationAccess().getRightParenthesisKeyword_0_5()); 

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
    // $ANTLR end "rule__Affectation__Group_0__5__Impl"


    // $ANTLR start "rule__Affectation__Group_1__0"
    // InternalFuzzyLanguage.g:1179:1: rule__Affectation__Group_1__0 : rule__Affectation__Group_1__0__Impl rule__Affectation__Group_1__1 ;
    public final void rule__Affectation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1183:1: ( rule__Affectation__Group_1__0__Impl rule__Affectation__Group_1__1 )
            // InternalFuzzyLanguage.g:1184:2: rule__Affectation__Group_1__0__Impl rule__Affectation__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Affectation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Affectation__Group_1__1();

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
    // $ANTLR end "rule__Affectation__Group_1__0"


    // $ANTLR start "rule__Affectation__Group_1__0__Impl"
    // InternalFuzzyLanguage.g:1191:1: rule__Affectation__Group_1__0__Impl : ( ( rule__Affectation__NameAssignment_1_0 ) ) ;
    public final void rule__Affectation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1195:1: ( ( ( rule__Affectation__NameAssignment_1_0 ) ) )
            // InternalFuzzyLanguage.g:1196:1: ( ( rule__Affectation__NameAssignment_1_0 ) )
            {
            // InternalFuzzyLanguage.g:1196:1: ( ( rule__Affectation__NameAssignment_1_0 ) )
            // InternalFuzzyLanguage.g:1197:2: ( rule__Affectation__NameAssignment_1_0 )
            {
             before(grammarAccess.getAffectationAccess().getNameAssignment_1_0()); 
            // InternalFuzzyLanguage.g:1198:2: ( rule__Affectation__NameAssignment_1_0 )
            // InternalFuzzyLanguage.g:1198:3: rule__Affectation__NameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAffectationAccess().getNameAssignment_1_0()); 

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
    // $ANTLR end "rule__Affectation__Group_1__0__Impl"


    // $ANTLR start "rule__Affectation__Group_1__1"
    // InternalFuzzyLanguage.g:1206:1: rule__Affectation__Group_1__1 : rule__Affectation__Group_1__1__Impl rule__Affectation__Group_1__2 ;
    public final void rule__Affectation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1210:1: ( rule__Affectation__Group_1__1__Impl rule__Affectation__Group_1__2 )
            // InternalFuzzyLanguage.g:1211:2: rule__Affectation__Group_1__1__Impl rule__Affectation__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__Affectation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Affectation__Group_1__2();

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
    // $ANTLR end "rule__Affectation__Group_1__1"


    // $ANTLR start "rule__Affectation__Group_1__1__Impl"
    // InternalFuzzyLanguage.g:1218:1: rule__Affectation__Group_1__1__Impl : ( '=' ) ;
    public final void rule__Affectation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1222:1: ( ( '=' ) )
            // InternalFuzzyLanguage.g:1223:1: ( '=' )
            {
            // InternalFuzzyLanguage.g:1223:1: ( '=' )
            // InternalFuzzyLanguage.g:1224:2: '='
            {
             before(grammarAccess.getAffectationAccess().getEqualsSignKeyword_1_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAffectationAccess().getEqualsSignKeyword_1_1()); 

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
    // $ANTLR end "rule__Affectation__Group_1__1__Impl"


    // $ANTLR start "rule__Affectation__Group_1__2"
    // InternalFuzzyLanguage.g:1233:1: rule__Affectation__Group_1__2 : rule__Affectation__Group_1__2__Impl ;
    public final void rule__Affectation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1237:1: ( rule__Affectation__Group_1__2__Impl )
            // InternalFuzzyLanguage.g:1238:2: rule__Affectation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__Group_1__2__Impl();

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
    // $ANTLR end "rule__Affectation__Group_1__2"


    // $ANTLR start "rule__Affectation__Group_1__2__Impl"
    // InternalFuzzyLanguage.g:1244:1: rule__Affectation__Group_1__2__Impl : ( ( rule__Affectation__ValueAssignment_1_2 ) ) ;
    public final void rule__Affectation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1248:1: ( ( ( rule__Affectation__ValueAssignment_1_2 ) ) )
            // InternalFuzzyLanguage.g:1249:1: ( ( rule__Affectation__ValueAssignment_1_2 ) )
            {
            // InternalFuzzyLanguage.g:1249:1: ( ( rule__Affectation__ValueAssignment_1_2 ) )
            // InternalFuzzyLanguage.g:1250:2: ( rule__Affectation__ValueAssignment_1_2 )
            {
             before(grammarAccess.getAffectationAccess().getValueAssignment_1_2()); 
            // InternalFuzzyLanguage.g:1251:2: ( rule__Affectation__ValueAssignment_1_2 )
            // InternalFuzzyLanguage.g:1251:3: rule__Affectation__ValueAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__ValueAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAffectationAccess().getValueAssignment_1_2()); 

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
    // $ANTLR end "rule__Affectation__Group_1__2__Impl"


    // $ANTLR start "rule__Affectation__Group_2__0"
    // InternalFuzzyLanguage.g:1260:1: rule__Affectation__Group_2__0 : rule__Affectation__Group_2__0__Impl rule__Affectation__Group_2__1 ;
    public final void rule__Affectation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1264:1: ( rule__Affectation__Group_2__0__Impl rule__Affectation__Group_2__1 )
            // InternalFuzzyLanguage.g:1265:2: rule__Affectation__Group_2__0__Impl rule__Affectation__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Affectation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Affectation__Group_2__1();

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
    // $ANTLR end "rule__Affectation__Group_2__0"


    // $ANTLR start "rule__Affectation__Group_2__0__Impl"
    // InternalFuzzyLanguage.g:1272:1: rule__Affectation__Group_2__0__Impl : ( ( rule__Affectation__NameAssignment_2_0 ) ) ;
    public final void rule__Affectation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1276:1: ( ( ( rule__Affectation__NameAssignment_2_0 ) ) )
            // InternalFuzzyLanguage.g:1277:1: ( ( rule__Affectation__NameAssignment_2_0 ) )
            {
            // InternalFuzzyLanguage.g:1277:1: ( ( rule__Affectation__NameAssignment_2_0 ) )
            // InternalFuzzyLanguage.g:1278:2: ( rule__Affectation__NameAssignment_2_0 )
            {
             before(grammarAccess.getAffectationAccess().getNameAssignment_2_0()); 
            // InternalFuzzyLanguage.g:1279:2: ( rule__Affectation__NameAssignment_2_0 )
            // InternalFuzzyLanguage.g:1279:3: rule__Affectation__NameAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__NameAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAffectationAccess().getNameAssignment_2_0()); 

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
    // $ANTLR end "rule__Affectation__Group_2__0__Impl"


    // $ANTLR start "rule__Affectation__Group_2__1"
    // InternalFuzzyLanguage.g:1287:1: rule__Affectation__Group_2__1 : rule__Affectation__Group_2__1__Impl rule__Affectation__Group_2__2 ;
    public final void rule__Affectation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1291:1: ( rule__Affectation__Group_2__1__Impl rule__Affectation__Group_2__2 )
            // InternalFuzzyLanguage.g:1292:2: rule__Affectation__Group_2__1__Impl rule__Affectation__Group_2__2
            {
            pushFollow(FOLLOW_18);
            rule__Affectation__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Affectation__Group_2__2();

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
    // $ANTLR end "rule__Affectation__Group_2__1"


    // $ANTLR start "rule__Affectation__Group_2__1__Impl"
    // InternalFuzzyLanguage.g:1299:1: rule__Affectation__Group_2__1__Impl : ( '=' ) ;
    public final void rule__Affectation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1303:1: ( ( '=' ) )
            // InternalFuzzyLanguage.g:1304:1: ( '=' )
            {
            // InternalFuzzyLanguage.g:1304:1: ( '=' )
            // InternalFuzzyLanguage.g:1305:2: '='
            {
             before(grammarAccess.getAffectationAccess().getEqualsSignKeyword_2_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAffectationAccess().getEqualsSignKeyword_2_1()); 

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
    // $ANTLR end "rule__Affectation__Group_2__1__Impl"


    // $ANTLR start "rule__Affectation__Group_2__2"
    // InternalFuzzyLanguage.g:1314:1: rule__Affectation__Group_2__2 : rule__Affectation__Group_2__2__Impl ;
    public final void rule__Affectation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1318:1: ( rule__Affectation__Group_2__2__Impl )
            // InternalFuzzyLanguage.g:1319:2: rule__Affectation__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__Group_2__2__Impl();

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
    // $ANTLR end "rule__Affectation__Group_2__2"


    // $ANTLR start "rule__Affectation__Group_2__2__Impl"
    // InternalFuzzyLanguage.g:1325:1: rule__Affectation__Group_2__2__Impl : ( ( rule__Affectation__ExpAssignment_2_2 ) ) ;
    public final void rule__Affectation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1329:1: ( ( ( rule__Affectation__ExpAssignment_2_2 ) ) )
            // InternalFuzzyLanguage.g:1330:1: ( ( rule__Affectation__ExpAssignment_2_2 ) )
            {
            // InternalFuzzyLanguage.g:1330:1: ( ( rule__Affectation__ExpAssignment_2_2 ) )
            // InternalFuzzyLanguage.g:1331:2: ( rule__Affectation__ExpAssignment_2_2 )
            {
             before(grammarAccess.getAffectationAccess().getExpAssignment_2_2()); 
            // InternalFuzzyLanguage.g:1332:2: ( rule__Affectation__ExpAssignment_2_2 )
            // InternalFuzzyLanguage.g:1332:3: rule__Affectation__ExpAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__ExpAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getAffectationAccess().getExpAssignment_2_2()); 

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
    // $ANTLR end "rule__Affectation__Group_2__2__Impl"


    // $ANTLR start "rule__Expression__Group_0__0"
    // InternalFuzzyLanguage.g:1341:1: rule__Expression__Group_0__0 : rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1 ;
    public final void rule__Expression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1345:1: ( rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1 )
            // InternalFuzzyLanguage.g:1346:2: rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Expression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__1();

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
    // $ANTLR end "rule__Expression__Group_0__0"


    // $ANTLR start "rule__Expression__Group_0__0__Impl"
    // InternalFuzzyLanguage.g:1353:1: rule__Expression__Group_0__0__Impl : ( ( rule__Expression__NameAssignment_0_0 ) ) ;
    public final void rule__Expression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1357:1: ( ( ( rule__Expression__NameAssignment_0_0 ) ) )
            // InternalFuzzyLanguage.g:1358:1: ( ( rule__Expression__NameAssignment_0_0 ) )
            {
            // InternalFuzzyLanguage.g:1358:1: ( ( rule__Expression__NameAssignment_0_0 ) )
            // InternalFuzzyLanguage.g:1359:2: ( rule__Expression__NameAssignment_0_0 )
            {
             before(grammarAccess.getExpressionAccess().getNameAssignment_0_0()); 
            // InternalFuzzyLanguage.g:1360:2: ( rule__Expression__NameAssignment_0_0 )
            // InternalFuzzyLanguage.g:1360:3: rule__Expression__NameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__NameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getNameAssignment_0_0()); 

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
    // $ANTLR end "rule__Expression__Group_0__0__Impl"


    // $ANTLR start "rule__Expression__Group_0__1"
    // InternalFuzzyLanguage.g:1368:1: rule__Expression__Group_0__1 : rule__Expression__Group_0__1__Impl rule__Expression__Group_0__2 ;
    public final void rule__Expression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1372:1: ( rule__Expression__Group_0__1__Impl rule__Expression__Group_0__2 )
            // InternalFuzzyLanguage.g:1373:2: rule__Expression__Group_0__1__Impl rule__Expression__Group_0__2
            {
            pushFollow(FOLLOW_19);
            rule__Expression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__2();

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
    // $ANTLR end "rule__Expression__Group_0__1"


    // $ANTLR start "rule__Expression__Group_0__1__Impl"
    // InternalFuzzyLanguage.g:1380:1: rule__Expression__Group_0__1__Impl : ( '{' ) ;
    public final void rule__Expression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1384:1: ( ( '{' ) )
            // InternalFuzzyLanguage.g:1385:1: ( '{' )
            {
            // InternalFuzzyLanguage.g:1385:1: ( '{' )
            // InternalFuzzyLanguage.g:1386:2: '{'
            {
             before(grammarAccess.getExpressionAccess().getLeftCurlyBracketKeyword_0_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getLeftCurlyBracketKeyword_0_1()); 

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
    // $ANTLR end "rule__Expression__Group_0__1__Impl"


    // $ANTLR start "rule__Expression__Group_0__2"
    // InternalFuzzyLanguage.g:1395:1: rule__Expression__Group_0__2 : rule__Expression__Group_0__2__Impl rule__Expression__Group_0__3 ;
    public final void rule__Expression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1399:1: ( rule__Expression__Group_0__2__Impl rule__Expression__Group_0__3 )
            // InternalFuzzyLanguage.g:1400:2: rule__Expression__Group_0__2__Impl rule__Expression__Group_0__3
            {
            pushFollow(FOLLOW_19);
            rule__Expression__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__3();

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
    // $ANTLR end "rule__Expression__Group_0__2"


    // $ANTLR start "rule__Expression__Group_0__2__Impl"
    // InternalFuzzyLanguage.g:1407:1: rule__Expression__Group_0__2__Impl : ( ( rule__Expression__ExpsAssignment_0_2 )* ) ;
    public final void rule__Expression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1411:1: ( ( ( rule__Expression__ExpsAssignment_0_2 )* ) )
            // InternalFuzzyLanguage.g:1412:1: ( ( rule__Expression__ExpsAssignment_0_2 )* )
            {
            // InternalFuzzyLanguage.g:1412:1: ( ( rule__Expression__ExpsAssignment_0_2 )* )
            // InternalFuzzyLanguage.g:1413:2: ( rule__Expression__ExpsAssignment_0_2 )*
            {
             before(grammarAccess.getExpressionAccess().getExpsAssignment_0_2()); 
            // InternalFuzzyLanguage.g:1414:2: ( rule__Expression__ExpsAssignment_0_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==RULE_OPERATOR) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalFuzzyLanguage.g:1414:3: rule__Expression__ExpsAssignment_0_2
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Expression__ExpsAssignment_0_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getExpressionAccess().getExpsAssignment_0_2()); 

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
    // $ANTLR end "rule__Expression__Group_0__2__Impl"


    // $ANTLR start "rule__Expression__Group_0__3"
    // InternalFuzzyLanguage.g:1422:1: rule__Expression__Group_0__3 : rule__Expression__Group_0__3__Impl ;
    public final void rule__Expression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1426:1: ( rule__Expression__Group_0__3__Impl )
            // InternalFuzzyLanguage.g:1427:2: rule__Expression__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__3__Impl();

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
    // $ANTLR end "rule__Expression__Group_0__3"


    // $ANTLR start "rule__Expression__Group_0__3__Impl"
    // InternalFuzzyLanguage.g:1433:1: rule__Expression__Group_0__3__Impl : ( '}' ) ;
    public final void rule__Expression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1437:1: ( ( '}' ) )
            // InternalFuzzyLanguage.g:1438:1: ( '}' )
            {
            // InternalFuzzyLanguage.g:1438:1: ( '}' )
            // InternalFuzzyLanguage.g:1439:2: '}'
            {
             before(grammarAccess.getExpressionAccess().getRightCurlyBracketKeyword_0_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getRightCurlyBracketKeyword_0_3()); 

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
    // $ANTLR end "rule__Expression__Group_0__3__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalFuzzyLanguage.g:1449:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1453:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalFuzzyLanguage.g:1454:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

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
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalFuzzyLanguage.g:1461:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__NameAssignment_1_0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1465:1: ( ( ( rule__Expression__NameAssignment_1_0 ) ) )
            // InternalFuzzyLanguage.g:1466:1: ( ( rule__Expression__NameAssignment_1_0 ) )
            {
            // InternalFuzzyLanguage.g:1466:1: ( ( rule__Expression__NameAssignment_1_0 ) )
            // InternalFuzzyLanguage.g:1467:2: ( rule__Expression__NameAssignment_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getNameAssignment_1_0()); 
            // InternalFuzzyLanguage.g:1468:2: ( rule__Expression__NameAssignment_1_0 )
            // InternalFuzzyLanguage.g:1468:3: rule__Expression__NameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getNameAssignment_1_0()); 

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
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalFuzzyLanguage.g:1476:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1480:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // InternalFuzzyLanguage.g:1481:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__2();

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
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalFuzzyLanguage.g:1488:1: rule__Expression__Group_1__1__Impl : ( 'is' ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1492:1: ( ( 'is' ) )
            // InternalFuzzyLanguage.g:1493:1: ( 'is' )
            {
            // InternalFuzzyLanguage.g:1493:1: ( 'is' )
            // InternalFuzzyLanguage.g:1494:2: 'is'
            {
             before(grammarAccess.getExpressionAccess().getIsKeyword_1_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getIsKeyword_1_1()); 

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
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__2"
    // InternalFuzzyLanguage.g:1503:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1507:1: ( rule__Expression__Group_1__2__Impl )
            // InternalFuzzyLanguage.g:1508:2: rule__Expression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__2__Impl();

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
    // $ANTLR end "rule__Expression__Group_1__2"


    // $ANTLR start "rule__Expression__Group_1__2__Impl"
    // InternalFuzzyLanguage.g:1514:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__ValueAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1518:1: ( ( ( rule__Expression__ValueAssignment_1_2 ) ) )
            // InternalFuzzyLanguage.g:1519:1: ( ( rule__Expression__ValueAssignment_1_2 ) )
            {
            // InternalFuzzyLanguage.g:1519:1: ( ( rule__Expression__ValueAssignment_1_2 ) )
            // InternalFuzzyLanguage.g:1520:2: ( rule__Expression__ValueAssignment_1_2 )
            {
             before(grammarAccess.getExpressionAccess().getValueAssignment_1_2()); 
            // InternalFuzzyLanguage.g:1521:2: ( rule__Expression__ValueAssignment_1_2 )
            // InternalFuzzyLanguage.g:1521:3: rule__Expression__ValueAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ValueAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getValueAssignment_1_2()); 

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
    // $ANTLR end "rule__Expression__Group_1__2__Impl"


    // $ANTLR start "rule__Binding__Group__0"
    // InternalFuzzyLanguage.g:1530:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1534:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalFuzzyLanguage.g:1535:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Binding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__1();

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
    // $ANTLR end "rule__Binding__Group__0"


    // $ANTLR start "rule__Binding__Group__0__Impl"
    // InternalFuzzyLanguage.g:1542:1: rule__Binding__Group__0__Impl : ( ( rule__Binding__OpAssignment_0 ) ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1546:1: ( ( ( rule__Binding__OpAssignment_0 ) ) )
            // InternalFuzzyLanguage.g:1547:1: ( ( rule__Binding__OpAssignment_0 ) )
            {
            // InternalFuzzyLanguage.g:1547:1: ( ( rule__Binding__OpAssignment_0 ) )
            // InternalFuzzyLanguage.g:1548:2: ( rule__Binding__OpAssignment_0 )
            {
             before(grammarAccess.getBindingAccess().getOpAssignment_0()); 
            // InternalFuzzyLanguage.g:1549:2: ( rule__Binding__OpAssignment_0 )
            // InternalFuzzyLanguage.g:1549:3: rule__Binding__OpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Binding__OpAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getOpAssignment_0()); 

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
    // $ANTLR end "rule__Binding__Group__0__Impl"


    // $ANTLR start "rule__Binding__Group__1"
    // InternalFuzzyLanguage.g:1557:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1561:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalFuzzyLanguage.g:1562:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Binding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__2();

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
    // $ANTLR end "rule__Binding__Group__1"


    // $ANTLR start "rule__Binding__Group__1__Impl"
    // InternalFuzzyLanguage.g:1569:1: rule__Binding__Group__1__Impl : ( '=' ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1573:1: ( ( '=' ) )
            // InternalFuzzyLanguage.g:1574:1: ( '=' )
            {
            // InternalFuzzyLanguage.g:1574:1: ( '=' )
            // InternalFuzzyLanguage.g:1575:2: '='
            {
             before(grammarAccess.getBindingAccess().getEqualsSignKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__Binding__Group__1__Impl"


    // $ANTLR start "rule__Binding__Group__2"
    // InternalFuzzyLanguage.g:1584:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl rule__Binding__Group__3 ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1588:1: ( rule__Binding__Group__2__Impl rule__Binding__Group__3 )
            // InternalFuzzyLanguage.g:1589:2: rule__Binding__Group__2__Impl rule__Binding__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Binding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__3();

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
    // $ANTLR end "rule__Binding__Group__2"


    // $ANTLR start "rule__Binding__Group__2__Impl"
    // InternalFuzzyLanguage.g:1596:1: rule__Binding__Group__2__Impl : ( ( rule__Binding__TargetAssignment_2 ) ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1600:1: ( ( ( rule__Binding__TargetAssignment_2 ) ) )
            // InternalFuzzyLanguage.g:1601:1: ( ( rule__Binding__TargetAssignment_2 ) )
            {
            // InternalFuzzyLanguage.g:1601:1: ( ( rule__Binding__TargetAssignment_2 ) )
            // InternalFuzzyLanguage.g:1602:2: ( rule__Binding__TargetAssignment_2 )
            {
             before(grammarAccess.getBindingAccess().getTargetAssignment_2()); 
            // InternalFuzzyLanguage.g:1603:2: ( rule__Binding__TargetAssignment_2 )
            // InternalFuzzyLanguage.g:1603:3: rule__Binding__TargetAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Binding__TargetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getTargetAssignment_2()); 

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
    // $ANTLR end "rule__Binding__Group__2__Impl"


    // $ANTLR start "rule__Binding__Group__3"
    // InternalFuzzyLanguage.g:1611:1: rule__Binding__Group__3 : rule__Binding__Group__3__Impl ;
    public final void rule__Binding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1615:1: ( rule__Binding__Group__3__Impl )
            // InternalFuzzyLanguage.g:1616:2: rule__Binding__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__3__Impl();

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
    // $ANTLR end "rule__Binding__Group__3"


    // $ANTLR start "rule__Binding__Group__3__Impl"
    // InternalFuzzyLanguage.g:1622:1: rule__Binding__Group__3__Impl : ( ( rule__Binding__Group_3__0 )? ) ;
    public final void rule__Binding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1626:1: ( ( ( rule__Binding__Group_3__0 )? ) )
            // InternalFuzzyLanguage.g:1627:1: ( ( rule__Binding__Group_3__0 )? )
            {
            // InternalFuzzyLanguage.g:1627:1: ( ( rule__Binding__Group_3__0 )? )
            // InternalFuzzyLanguage.g:1628:2: ( rule__Binding__Group_3__0 )?
            {
             before(grammarAccess.getBindingAccess().getGroup_3()); 
            // InternalFuzzyLanguage.g:1629:2: ( rule__Binding__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalFuzzyLanguage.g:1629:3: rule__Binding__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Binding__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBindingAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Binding__Group__3__Impl"


    // $ANTLR start "rule__Binding__Group_3__0"
    // InternalFuzzyLanguage.g:1638:1: rule__Binding__Group_3__0 : rule__Binding__Group_3__0__Impl rule__Binding__Group_3__1 ;
    public final void rule__Binding__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1642:1: ( rule__Binding__Group_3__0__Impl rule__Binding__Group_3__1 )
            // InternalFuzzyLanguage.g:1643:2: rule__Binding__Group_3__0__Impl rule__Binding__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Binding__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group_3__1();

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
    // $ANTLR end "rule__Binding__Group_3__0"


    // $ANTLR start "rule__Binding__Group_3__0__Impl"
    // InternalFuzzyLanguage.g:1650:1: rule__Binding__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Binding__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1654:1: ( ( '(' ) )
            // InternalFuzzyLanguage.g:1655:1: ( '(' )
            {
            // InternalFuzzyLanguage.g:1655:1: ( '(' )
            // InternalFuzzyLanguage.g:1656:2: '('
            {
             before(grammarAccess.getBindingAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getLeftParenthesisKeyword_3_0()); 

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
    // $ANTLR end "rule__Binding__Group_3__0__Impl"


    // $ANTLR start "rule__Binding__Group_3__1"
    // InternalFuzzyLanguage.g:1665:1: rule__Binding__Group_3__1 : rule__Binding__Group_3__1__Impl rule__Binding__Group_3__2 ;
    public final void rule__Binding__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1669:1: ( rule__Binding__Group_3__1__Impl rule__Binding__Group_3__2 )
            // InternalFuzzyLanguage.g:1670:2: rule__Binding__Group_3__1__Impl rule__Binding__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__Binding__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group_3__2();

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
    // $ANTLR end "rule__Binding__Group_3__1"


    // $ANTLR start "rule__Binding__Group_3__1__Impl"
    // InternalFuzzyLanguage.g:1677:1: rule__Binding__Group_3__1__Impl : ( ( rule__Binding__ParamsAssignment_3_1 )* ) ;
    public final void rule__Binding__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1681:1: ( ( ( rule__Binding__ParamsAssignment_3_1 )* ) )
            // InternalFuzzyLanguage.g:1682:1: ( ( rule__Binding__ParamsAssignment_3_1 )* )
            {
            // InternalFuzzyLanguage.g:1682:1: ( ( rule__Binding__ParamsAssignment_3_1 )* )
            // InternalFuzzyLanguage.g:1683:2: ( rule__Binding__ParamsAssignment_3_1 )*
            {
             before(grammarAccess.getBindingAccess().getParamsAssignment_3_1()); 
            // InternalFuzzyLanguage.g:1684:2: ( rule__Binding__ParamsAssignment_3_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ANYTHING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFuzzyLanguage.g:1684:3: rule__Binding__ParamsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Binding__ParamsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getBindingAccess().getParamsAssignment_3_1()); 

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
    // $ANTLR end "rule__Binding__Group_3__1__Impl"


    // $ANTLR start "rule__Binding__Group_3__2"
    // InternalFuzzyLanguage.g:1692:1: rule__Binding__Group_3__2 : rule__Binding__Group_3__2__Impl ;
    public final void rule__Binding__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1696:1: ( rule__Binding__Group_3__2__Impl )
            // InternalFuzzyLanguage.g:1697:2: rule__Binding__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group_3__2__Impl();

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
    // $ANTLR end "rule__Binding__Group_3__2"


    // $ANTLR start "rule__Binding__Group_3__2__Impl"
    // InternalFuzzyLanguage.g:1703:1: rule__Binding__Group_3__2__Impl : ( ')' ) ;
    public final void rule__Binding__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1707:1: ( ( ')' ) )
            // InternalFuzzyLanguage.g:1708:1: ( ')' )
            {
            // InternalFuzzyLanguage.g:1708:1: ( ')' )
            // InternalFuzzyLanguage.g:1709:2: ')'
            {
             before(grammarAccess.getBindingAccess().getRightParenthesisKeyword_3_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getRightParenthesisKeyword_3_2()); 

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
    // $ANTLR end "rule__Binding__Group_3__2__Impl"


    // $ANTLR start "rule__Param__Group_0__0"
    // InternalFuzzyLanguage.g:1719:1: rule__Param__Group_0__0 : rule__Param__Group_0__0__Impl rule__Param__Group_0__1 ;
    public final void rule__Param__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1723:1: ( rule__Param__Group_0__0__Impl rule__Param__Group_0__1 )
            // InternalFuzzyLanguage.g:1724:2: rule__Param__Group_0__0__Impl rule__Param__Group_0__1
            {
            pushFollow(FOLLOW_22);
            rule__Param__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Param__Group_0__1();

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
    // $ANTLR end "rule__Param__Group_0__0"


    // $ANTLR start "rule__Param__Group_0__0__Impl"
    // InternalFuzzyLanguage.g:1731:1: rule__Param__Group_0__0__Impl : ( ( rule__Param__ValueAssignment_0_0 ) ) ;
    public final void rule__Param__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1735:1: ( ( ( rule__Param__ValueAssignment_0_0 ) ) )
            // InternalFuzzyLanguage.g:1736:1: ( ( rule__Param__ValueAssignment_0_0 ) )
            {
            // InternalFuzzyLanguage.g:1736:1: ( ( rule__Param__ValueAssignment_0_0 ) )
            // InternalFuzzyLanguage.g:1737:2: ( rule__Param__ValueAssignment_0_0 )
            {
             before(grammarAccess.getParamAccess().getValueAssignment_0_0()); 
            // InternalFuzzyLanguage.g:1738:2: ( rule__Param__ValueAssignment_0_0 )
            // InternalFuzzyLanguage.g:1738:3: rule__Param__ValueAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Param__ValueAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getValueAssignment_0_0()); 

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
    // $ANTLR end "rule__Param__Group_0__0__Impl"


    // $ANTLR start "rule__Param__Group_0__1"
    // InternalFuzzyLanguage.g:1746:1: rule__Param__Group_0__1 : rule__Param__Group_0__1__Impl ;
    public final void rule__Param__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1750:1: ( rule__Param__Group_0__1__Impl )
            // InternalFuzzyLanguage.g:1751:2: rule__Param__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Param__Group_0__1__Impl();

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
    // $ANTLR end "rule__Param__Group_0__1"


    // $ANTLR start "rule__Param__Group_0__1__Impl"
    // InternalFuzzyLanguage.g:1757:1: rule__Param__Group_0__1__Impl : ( ',' ) ;
    public final void rule__Param__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1761:1: ( ( ',' ) )
            // InternalFuzzyLanguage.g:1762:1: ( ',' )
            {
            // InternalFuzzyLanguage.g:1762:1: ( ',' )
            // InternalFuzzyLanguage.g:1763:2: ','
            {
             before(grammarAccess.getParamAccess().getCommaKeyword_0_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getParamAccess().getCommaKeyword_0_1()); 

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
    // $ANTLR end "rule__Param__Group_0__1__Impl"


    // $ANTLR start "rule__TypeSet__Group__0"
    // InternalFuzzyLanguage.g:1773:1: rule__TypeSet__Group__0 : rule__TypeSet__Group__0__Impl rule__TypeSet__Group__1 ;
    public final void rule__TypeSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1777:1: ( rule__TypeSet__Group__0__Impl rule__TypeSet__Group__1 )
            // InternalFuzzyLanguage.g:1778:2: rule__TypeSet__Group__0__Impl rule__TypeSet__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__TypeSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeSet__Group__1();

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
    // $ANTLR end "rule__TypeSet__Group__0"


    // $ANTLR start "rule__TypeSet__Group__0__Impl"
    // InternalFuzzyLanguage.g:1785:1: rule__TypeSet__Group__0__Impl : ( 'set' ) ;
    public final void rule__TypeSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1789:1: ( ( 'set' ) )
            // InternalFuzzyLanguage.g:1790:1: ( 'set' )
            {
            // InternalFuzzyLanguage.g:1790:1: ( 'set' )
            // InternalFuzzyLanguage.g:1791:2: 'set'
            {
             before(grammarAccess.getTypeSetAccess().getSetKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTypeSetAccess().getSetKeyword_0()); 

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
    // $ANTLR end "rule__TypeSet__Group__0__Impl"


    // $ANTLR start "rule__TypeSet__Group__1"
    // InternalFuzzyLanguage.g:1800:1: rule__TypeSet__Group__1 : rule__TypeSet__Group__1__Impl rule__TypeSet__Group__2 ;
    public final void rule__TypeSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1804:1: ( rule__TypeSet__Group__1__Impl rule__TypeSet__Group__2 )
            // InternalFuzzyLanguage.g:1805:2: rule__TypeSet__Group__1__Impl rule__TypeSet__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__TypeSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeSet__Group__2();

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
    // $ANTLR end "rule__TypeSet__Group__1"


    // $ANTLR start "rule__TypeSet__Group__1__Impl"
    // InternalFuzzyLanguage.g:1812:1: rule__TypeSet__Group__1__Impl : ( 'Type' ) ;
    public final void rule__TypeSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1816:1: ( ( 'Type' ) )
            // InternalFuzzyLanguage.g:1817:1: ( 'Type' )
            {
            // InternalFuzzyLanguage.g:1817:1: ( 'Type' )
            // InternalFuzzyLanguage.g:1818:2: 'Type'
            {
             before(grammarAccess.getTypeSetAccess().getTypeKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTypeSetAccess().getTypeKeyword_1()); 

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
    // $ANTLR end "rule__TypeSet__Group__1__Impl"


    // $ANTLR start "rule__TypeSet__Group__2"
    // InternalFuzzyLanguage.g:1827:1: rule__TypeSet__Group__2 : rule__TypeSet__Group__2__Impl rule__TypeSet__Group__3 ;
    public final void rule__TypeSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1831:1: ( rule__TypeSet__Group__2__Impl rule__TypeSet__Group__3 )
            // InternalFuzzyLanguage.g:1832:2: rule__TypeSet__Group__2__Impl rule__TypeSet__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__TypeSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeSet__Group__3();

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
    // $ANTLR end "rule__TypeSet__Group__2"


    // $ANTLR start "rule__TypeSet__Group__2__Impl"
    // InternalFuzzyLanguage.g:1839:1: rule__TypeSet__Group__2__Impl : ( 'to' ) ;
    public final void rule__TypeSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1843:1: ( ( 'to' ) )
            // InternalFuzzyLanguage.g:1844:1: ( 'to' )
            {
            // InternalFuzzyLanguage.g:1844:1: ( 'to' )
            // InternalFuzzyLanguage.g:1845:2: 'to'
            {
             before(grammarAccess.getTypeSetAccess().getToKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTypeSetAccess().getToKeyword_2()); 

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
    // $ANTLR end "rule__TypeSet__Group__2__Impl"


    // $ANTLR start "rule__TypeSet__Group__3"
    // InternalFuzzyLanguage.g:1854:1: rule__TypeSet__Group__3 : rule__TypeSet__Group__3__Impl ;
    public final void rule__TypeSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1858:1: ( rule__TypeSet__Group__3__Impl )
            // InternalFuzzyLanguage.g:1859:2: rule__TypeSet__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeSet__Group__3__Impl();

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
    // $ANTLR end "rule__TypeSet__Group__3"


    // $ANTLR start "rule__TypeSet__Group__3__Impl"
    // InternalFuzzyLanguage.g:1865:1: rule__TypeSet__Group__3__Impl : ( ( rule__TypeSet__TypeNameAssignment_3 ) ) ;
    public final void rule__TypeSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1869:1: ( ( ( rule__TypeSet__TypeNameAssignment_3 ) ) )
            // InternalFuzzyLanguage.g:1870:1: ( ( rule__TypeSet__TypeNameAssignment_3 ) )
            {
            // InternalFuzzyLanguage.g:1870:1: ( ( rule__TypeSet__TypeNameAssignment_3 ) )
            // InternalFuzzyLanguage.g:1871:2: ( rule__TypeSet__TypeNameAssignment_3 )
            {
             before(grammarAccess.getTypeSetAccess().getTypeNameAssignment_3()); 
            // InternalFuzzyLanguage.g:1872:2: ( rule__TypeSet__TypeNameAssignment_3 )
            // InternalFuzzyLanguage.g:1872:3: rule__TypeSet__TypeNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TypeSet__TypeNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTypeSetAccess().getTypeNameAssignment_3()); 

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
    // $ANTLR end "rule__TypeSet__Group__3__Impl"


    // $ANTLR start "rule__FuzzyConfig__Group__0"
    // InternalFuzzyLanguage.g:1881:1: rule__FuzzyConfig__Group__0 : rule__FuzzyConfig__Group__0__Impl rule__FuzzyConfig__Group__1 ;
    public final void rule__FuzzyConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1885:1: ( rule__FuzzyConfig__Group__0__Impl rule__FuzzyConfig__Group__1 )
            // InternalFuzzyLanguage.g:1886:2: rule__FuzzyConfig__Group__0__Impl rule__FuzzyConfig__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__FuzzyConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuzzyConfig__Group__1();

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
    // $ANTLR end "rule__FuzzyConfig__Group__0"


    // $ANTLR start "rule__FuzzyConfig__Group__0__Impl"
    // InternalFuzzyLanguage.g:1893:1: rule__FuzzyConfig__Group__0__Impl : ( 'FuzzyConfig' ) ;
    public final void rule__FuzzyConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1897:1: ( ( 'FuzzyConfig' ) )
            // InternalFuzzyLanguage.g:1898:1: ( 'FuzzyConfig' )
            {
            // InternalFuzzyLanguage.g:1898:1: ( 'FuzzyConfig' )
            // InternalFuzzyLanguage.g:1899:2: 'FuzzyConfig'
            {
             before(grammarAccess.getFuzzyConfigAccess().getFuzzyConfigKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFuzzyConfigAccess().getFuzzyConfigKeyword_0()); 

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
    // $ANTLR end "rule__FuzzyConfig__Group__0__Impl"


    // $ANTLR start "rule__FuzzyConfig__Group__1"
    // InternalFuzzyLanguage.g:1908:1: rule__FuzzyConfig__Group__1 : rule__FuzzyConfig__Group__1__Impl rule__FuzzyConfig__Group__2 ;
    public final void rule__FuzzyConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1912:1: ( rule__FuzzyConfig__Group__1__Impl rule__FuzzyConfig__Group__2 )
            // InternalFuzzyLanguage.g:1913:2: rule__FuzzyConfig__Group__1__Impl rule__FuzzyConfig__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__FuzzyConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuzzyConfig__Group__2();

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
    // $ANTLR end "rule__FuzzyConfig__Group__1"


    // $ANTLR start "rule__FuzzyConfig__Group__1__Impl"
    // InternalFuzzyLanguage.g:1920:1: rule__FuzzyConfig__Group__1__Impl : ( '{' ) ;
    public final void rule__FuzzyConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1924:1: ( ( '{' ) )
            // InternalFuzzyLanguage.g:1925:1: ( '{' )
            {
            // InternalFuzzyLanguage.g:1925:1: ( '{' )
            // InternalFuzzyLanguage.g:1926:2: '{'
            {
             before(grammarAccess.getFuzzyConfigAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFuzzyConfigAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__FuzzyConfig__Group__1__Impl"


    // $ANTLR start "rule__FuzzyConfig__Group__2"
    // InternalFuzzyLanguage.g:1935:1: rule__FuzzyConfig__Group__2 : rule__FuzzyConfig__Group__2__Impl rule__FuzzyConfig__Group__3 ;
    public final void rule__FuzzyConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1939:1: ( rule__FuzzyConfig__Group__2__Impl rule__FuzzyConfig__Group__3 )
            // InternalFuzzyLanguage.g:1940:2: rule__FuzzyConfig__Group__2__Impl rule__FuzzyConfig__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__FuzzyConfig__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuzzyConfig__Group__3();

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
    // $ANTLR end "rule__FuzzyConfig__Group__2"


    // $ANTLR start "rule__FuzzyConfig__Group__2__Impl"
    // InternalFuzzyLanguage.g:1947:1: rule__FuzzyConfig__Group__2__Impl : ( ( rule__FuzzyConfig__TypeSETAssignment_2 ) ) ;
    public final void rule__FuzzyConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1951:1: ( ( ( rule__FuzzyConfig__TypeSETAssignment_2 ) ) )
            // InternalFuzzyLanguage.g:1952:1: ( ( rule__FuzzyConfig__TypeSETAssignment_2 ) )
            {
            // InternalFuzzyLanguage.g:1952:1: ( ( rule__FuzzyConfig__TypeSETAssignment_2 ) )
            // InternalFuzzyLanguage.g:1953:2: ( rule__FuzzyConfig__TypeSETAssignment_2 )
            {
             before(grammarAccess.getFuzzyConfigAccess().getTypeSETAssignment_2()); 
            // InternalFuzzyLanguage.g:1954:2: ( rule__FuzzyConfig__TypeSETAssignment_2 )
            // InternalFuzzyLanguage.g:1954:3: rule__FuzzyConfig__TypeSETAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FuzzyConfig__TypeSETAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFuzzyConfigAccess().getTypeSETAssignment_2()); 

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
    // $ANTLR end "rule__FuzzyConfig__Group__2__Impl"


    // $ANTLR start "rule__FuzzyConfig__Group__3"
    // InternalFuzzyLanguage.g:1962:1: rule__FuzzyConfig__Group__3 : rule__FuzzyConfig__Group__3__Impl rule__FuzzyConfig__Group__4 ;
    public final void rule__FuzzyConfig__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1966:1: ( rule__FuzzyConfig__Group__3__Impl rule__FuzzyConfig__Group__4 )
            // InternalFuzzyLanguage.g:1967:2: rule__FuzzyConfig__Group__3__Impl rule__FuzzyConfig__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__FuzzyConfig__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuzzyConfig__Group__4();

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
    // $ANTLR end "rule__FuzzyConfig__Group__3"


    // $ANTLR start "rule__FuzzyConfig__Group__3__Impl"
    // InternalFuzzyLanguage.g:1974:1: rule__FuzzyConfig__Group__3__Impl : ( ( rule__FuzzyConfig__BindingsListAssignment_3 )* ) ;
    public final void rule__FuzzyConfig__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1978:1: ( ( ( rule__FuzzyConfig__BindingsListAssignment_3 )* ) )
            // InternalFuzzyLanguage.g:1979:1: ( ( rule__FuzzyConfig__BindingsListAssignment_3 )* )
            {
            // InternalFuzzyLanguage.g:1979:1: ( ( rule__FuzzyConfig__BindingsListAssignment_3 )* )
            // InternalFuzzyLanguage.g:1980:2: ( rule__FuzzyConfig__BindingsListAssignment_3 )*
            {
             before(grammarAccess.getFuzzyConfigAccess().getBindingsListAssignment_3()); 
            // InternalFuzzyLanguage.g:1981:2: ( rule__FuzzyConfig__BindingsListAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_OPERATOR) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFuzzyLanguage.g:1981:3: rule__FuzzyConfig__BindingsListAssignment_3
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__FuzzyConfig__BindingsListAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getFuzzyConfigAccess().getBindingsListAssignment_3()); 

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
    // $ANTLR end "rule__FuzzyConfig__Group__3__Impl"


    // $ANTLR start "rule__FuzzyConfig__Group__4"
    // InternalFuzzyLanguage.g:1989:1: rule__FuzzyConfig__Group__4 : rule__FuzzyConfig__Group__4__Impl ;
    public final void rule__FuzzyConfig__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:1993:1: ( rule__FuzzyConfig__Group__4__Impl )
            // InternalFuzzyLanguage.g:1994:2: rule__FuzzyConfig__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuzzyConfig__Group__4__Impl();

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
    // $ANTLR end "rule__FuzzyConfig__Group__4"


    // $ANTLR start "rule__FuzzyConfig__Group__4__Impl"
    // InternalFuzzyLanguage.g:2000:1: rule__FuzzyConfig__Group__4__Impl : ( '}' ) ;
    public final void rule__FuzzyConfig__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2004:1: ( ( '}' ) )
            // InternalFuzzyLanguage.g:2005:1: ( '}' )
            {
            // InternalFuzzyLanguage.g:2005:1: ( '}' )
            // InternalFuzzyLanguage.g:2006:2: '}'
            {
             before(grammarAccess.getFuzzyConfigAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFuzzyConfigAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__FuzzyConfig__Group__4__Impl"


    // $ANTLR start "rule__FuzzyModel__ElementsAssignment_0"
    // InternalFuzzyLanguage.g:2016:1: rule__FuzzyModel__ElementsAssignment_0 : ( ruleFuzzyConfig ) ;
    public final void rule__FuzzyModel__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2020:1: ( ( ruleFuzzyConfig ) )
            // InternalFuzzyLanguage.g:2021:2: ( ruleFuzzyConfig )
            {
            // InternalFuzzyLanguage.g:2021:2: ( ruleFuzzyConfig )
            // InternalFuzzyLanguage.g:2022:3: ruleFuzzyConfig
            {
             before(grammarAccess.getFuzzyModelAccess().getElementsFuzzyConfigParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFuzzyConfig();

            state._fsp--;

             after(grammarAccess.getFuzzyModelAccess().getElementsFuzzyConfigParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__FuzzyModel__ElementsAssignment_0"


    // $ANTLR start "rule__FuzzyModel__ElementsAssignment_1"
    // InternalFuzzyLanguage.g:2031:1: rule__FuzzyModel__ElementsAssignment_1 : ( ruleFuzzySystemBuilding ) ;
    public final void rule__FuzzyModel__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2035:1: ( ( ruleFuzzySystemBuilding ) )
            // InternalFuzzyLanguage.g:2036:2: ( ruleFuzzySystemBuilding )
            {
            // InternalFuzzyLanguage.g:2036:2: ( ruleFuzzySystemBuilding )
            // InternalFuzzyLanguage.g:2037:3: ruleFuzzySystemBuilding
            {
             before(grammarAccess.getFuzzyModelAccess().getElementsFuzzySystemBuildingParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFuzzySystemBuilding();

            state._fsp--;

             after(grammarAccess.getFuzzyModelAccess().getElementsFuzzySystemBuildingParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__FuzzyModel__ElementsAssignment_1"


    // $ANTLR start "rule__FuzzyModel__ElementsAssignment_2"
    // InternalFuzzyLanguage.g:2046:1: rule__FuzzyModel__ElementsAssignment_2 : ( ruleOutputs ) ;
    public final void rule__FuzzyModel__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2050:1: ( ( ruleOutputs ) )
            // InternalFuzzyLanguage.g:2051:2: ( ruleOutputs )
            {
            // InternalFuzzyLanguage.g:2051:2: ( ruleOutputs )
            // InternalFuzzyLanguage.g:2052:3: ruleOutputs
            {
             before(grammarAccess.getFuzzyModelAccess().getElementsOutputsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOutputs();

            state._fsp--;

             after(grammarAccess.getFuzzyModelAccess().getElementsOutputsParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__FuzzyModel__ElementsAssignment_2"


    // $ANTLR start "rule__Outputs__OutAssignment_2"
    // InternalFuzzyLanguage.g:2061:1: rule__Outputs__OutAssignment_2 : ( ruleOutput ) ;
    public final void rule__Outputs__OutAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2065:1: ( ( ruleOutput ) )
            // InternalFuzzyLanguage.g:2066:2: ( ruleOutput )
            {
            // InternalFuzzyLanguage.g:2066:2: ( ruleOutput )
            // InternalFuzzyLanguage.g:2067:3: ruleOutput
            {
             before(grammarAccess.getOutputsAccess().getOutOutputParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getOutputsAccess().getOutOutputParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Outputs__OutAssignment_2"


    // $ANTLR start "rule__Outputs__WrAssignment_3"
    // InternalFuzzyLanguage.g:2076:1: rule__Outputs__WrAssignment_3 : ( ruleWrite ) ;
    public final void rule__Outputs__WrAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2080:1: ( ( ruleWrite ) )
            // InternalFuzzyLanguage.g:2081:2: ( ruleWrite )
            {
            // InternalFuzzyLanguage.g:2081:2: ( ruleWrite )
            // InternalFuzzyLanguage.g:2082:3: ruleWrite
            {
             before(grammarAccess.getOutputsAccess().getWrWriteParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleWrite();

            state._fsp--;

             after(grammarAccess.getOutputsAccess().getWrWriteParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Outputs__WrAssignment_3"


    // $ANTLR start "rule__Write__ValueAssignment_0_1"
    // InternalFuzzyLanguage.g:2091:1: rule__Write__ValueAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Write__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2095:1: ( ( RULE_ID ) )
            // InternalFuzzyLanguage.g:2096:2: ( RULE_ID )
            {
            // InternalFuzzyLanguage.g:2096:2: ( RULE_ID )
            // InternalFuzzyLanguage.g:2097:3: RULE_ID
            {
             before(grammarAccess.getWriteAccess().getValueIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWriteAccess().getValueIDTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Write__ValueAssignment_0_1"


    // $ANTLR start "rule__Write__ValueAssignment_1_1"
    // InternalFuzzyLanguage.g:2106:1: rule__Write__ValueAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Write__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2110:1: ( ( RULE_ID ) )
            // InternalFuzzyLanguage.g:2111:2: ( RULE_ID )
            {
            // InternalFuzzyLanguage.g:2111:2: ( RULE_ID )
            // InternalFuzzyLanguage.g:2112:3: RULE_ID
            {
             before(grammarAccess.getWriteAccess().getValueIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWriteAccess().getValueIDTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Write__ValueAssignment_1_1"


    // $ANTLR start "rule__Output__TypeAssignment_0_0"
    // InternalFuzzyLanguage.g:2121:1: rule__Output__TypeAssignment_0_0 : ( ( 'FILE' ) ) ;
    public final void rule__Output__TypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2125:1: ( ( ( 'FILE' ) ) )
            // InternalFuzzyLanguage.g:2126:2: ( ( 'FILE' ) )
            {
            // InternalFuzzyLanguage.g:2126:2: ( ( 'FILE' ) )
            // InternalFuzzyLanguage.g:2127:3: ( 'FILE' )
            {
             before(grammarAccess.getOutputAccess().getTypeFILEKeyword_0_0_0()); 
            // InternalFuzzyLanguage.g:2128:3: ( 'FILE' )
            // InternalFuzzyLanguage.g:2129:4: 'FILE'
            {
             before(grammarAccess.getOutputAccess().getTypeFILEKeyword_0_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getTypeFILEKeyword_0_0_0()); 

            }

             after(grammarAccess.getOutputAccess().getTypeFILEKeyword_0_0_0()); 

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
    // $ANTLR end "rule__Output__TypeAssignment_0_0"


    // $ANTLR start "rule__Output__PathAssignment_0_2"
    // InternalFuzzyLanguage.g:2140:1: rule__Output__PathAssignment_0_2 : ( RULE_ANYTHING ) ;
    public final void rule__Output__PathAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2144:1: ( ( RULE_ANYTHING ) )
            // InternalFuzzyLanguage.g:2145:2: ( RULE_ANYTHING )
            {
            // InternalFuzzyLanguage.g:2145:2: ( RULE_ANYTHING )
            // InternalFuzzyLanguage.g:2146:3: RULE_ANYTHING
            {
             before(grammarAccess.getOutputAccess().getPathANYTHINGTerminalRuleCall_0_2_0()); 
            match(input,RULE_ANYTHING,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getPathANYTHINGTerminalRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Output__PathAssignment_0_2"


    // $ANTLR start "rule__Output__TypeAssignment_1"
    // InternalFuzzyLanguage.g:2155:1: rule__Output__TypeAssignment_1 : ( ( 'CONSOLE' ) ) ;
    public final void rule__Output__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2159:1: ( ( ( 'CONSOLE' ) ) )
            // InternalFuzzyLanguage.g:2160:2: ( ( 'CONSOLE' ) )
            {
            // InternalFuzzyLanguage.g:2160:2: ( ( 'CONSOLE' ) )
            // InternalFuzzyLanguage.g:2161:3: ( 'CONSOLE' )
            {
             before(grammarAccess.getOutputAccess().getTypeCONSOLEKeyword_1_0()); 
            // InternalFuzzyLanguage.g:2162:3: ( 'CONSOLE' )
            // InternalFuzzyLanguage.g:2163:4: 'CONSOLE'
            {
             before(grammarAccess.getOutputAccess().getTypeCONSOLEKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getTypeCONSOLEKeyword_1_0()); 

            }

             after(grammarAccess.getOutputAccess().getTypeCONSOLEKeyword_1_0()); 

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
    // $ANTLR end "rule__Output__TypeAssignment_1"


    // $ANTLR start "rule__Output__TypeAssignment_2"
    // InternalFuzzyLanguage.g:2174:1: rule__Output__TypeAssignment_2 : ( ( 'COUT' ) ) ;
    public final void rule__Output__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2178:1: ( ( ( 'COUT' ) ) )
            // InternalFuzzyLanguage.g:2179:2: ( ( 'COUT' ) )
            {
            // InternalFuzzyLanguage.g:2179:2: ( ( 'COUT' ) )
            // InternalFuzzyLanguage.g:2180:3: ( 'COUT' )
            {
             before(grammarAccess.getOutputAccess().getTypeCOUTKeyword_2_0()); 
            // InternalFuzzyLanguage.g:2181:3: ( 'COUT' )
            // InternalFuzzyLanguage.g:2182:4: 'COUT'
            {
             before(grammarAccess.getOutputAccess().getTypeCOUTKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getTypeCOUTKeyword_2_0()); 

            }

             after(grammarAccess.getOutputAccess().getTypeCOUTKeyword_2_0()); 

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
    // $ANTLR end "rule__Output__TypeAssignment_2"


    // $ANTLR start "rule__FuzzySystemBuilding__AffectationsAssignment_2"
    // InternalFuzzyLanguage.g:2193:1: rule__FuzzySystemBuilding__AffectationsAssignment_2 : ( ruleAffectation ) ;
    public final void rule__FuzzySystemBuilding__AffectationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2197:1: ( ( ruleAffectation ) )
            // InternalFuzzyLanguage.g:2198:2: ( ruleAffectation )
            {
            // InternalFuzzyLanguage.g:2198:2: ( ruleAffectation )
            // InternalFuzzyLanguage.g:2199:3: ruleAffectation
            {
             before(grammarAccess.getFuzzySystemBuildingAccess().getAffectationsAffectationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAffectation();

            state._fsp--;

             after(grammarAccess.getFuzzySystemBuildingAccess().getAffectationsAffectationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__FuzzySystemBuilding__AffectationsAssignment_2"


    // $ANTLR start "rule__Affectation__NameAssignment_0_0"
    // InternalFuzzyLanguage.g:2208:1: rule__Affectation__NameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Affectation__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2212:1: ( ( RULE_ID ) )
            // InternalFuzzyLanguage.g:2213:2: ( RULE_ID )
            {
            // InternalFuzzyLanguage.g:2213:2: ( RULE_ID )
            // InternalFuzzyLanguage.g:2214:3: RULE_ID
            {
             before(grammarAccess.getAffectationAccess().getNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAffectationAccess().getNameIDTerminalRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Affectation__NameAssignment_0_0"


    // $ANTLR start "rule__Affectation__ValueAssignment_0_2"
    // InternalFuzzyLanguage.g:2223:1: rule__Affectation__ValueAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Affectation__ValueAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2227:1: ( ( RULE_ID ) )
            // InternalFuzzyLanguage.g:2228:2: ( RULE_ID )
            {
            // InternalFuzzyLanguage.g:2228:2: ( RULE_ID )
            // InternalFuzzyLanguage.g:2229:3: RULE_ID
            {
             before(grammarAccess.getAffectationAccess().getValueIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAffectationAccess().getValueIDTerminalRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Affectation__ValueAssignment_0_2"


    // $ANTLR start "rule__Affectation__ParamsAssignment_0_4"
    // InternalFuzzyLanguage.g:2238:1: rule__Affectation__ParamsAssignment_0_4 : ( ruleParam ) ;
    public final void rule__Affectation__ParamsAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2242:1: ( ( ruleParam ) )
            // InternalFuzzyLanguage.g:2243:2: ( ruleParam )
            {
            // InternalFuzzyLanguage.g:2243:2: ( ruleParam )
            // InternalFuzzyLanguage.g:2244:3: ruleParam
            {
             before(grammarAccess.getAffectationAccess().getParamsParamParserRuleCall_0_4_0()); 
            pushFollow(FOLLOW_2);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getAffectationAccess().getParamsParamParserRuleCall_0_4_0()); 

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
    // $ANTLR end "rule__Affectation__ParamsAssignment_0_4"


    // $ANTLR start "rule__Affectation__NameAssignment_1_0"
    // InternalFuzzyLanguage.g:2253:1: rule__Affectation__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Affectation__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2257:1: ( ( RULE_ID ) )
            // InternalFuzzyLanguage.g:2258:2: ( RULE_ID )
            {
            // InternalFuzzyLanguage.g:2258:2: ( RULE_ID )
            // InternalFuzzyLanguage.g:2259:3: RULE_ID
            {
             before(grammarAccess.getAffectationAccess().getNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAffectationAccess().getNameIDTerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Affectation__NameAssignment_1_0"


    // $ANTLR start "rule__Affectation__ValueAssignment_1_2"
    // InternalFuzzyLanguage.g:2268:1: rule__Affectation__ValueAssignment_1_2 : ( RULE_ANYTHING ) ;
    public final void rule__Affectation__ValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2272:1: ( ( RULE_ANYTHING ) )
            // InternalFuzzyLanguage.g:2273:2: ( RULE_ANYTHING )
            {
            // InternalFuzzyLanguage.g:2273:2: ( RULE_ANYTHING )
            // InternalFuzzyLanguage.g:2274:3: RULE_ANYTHING
            {
             before(grammarAccess.getAffectationAccess().getValueANYTHINGTerminalRuleCall_1_2_0()); 
            match(input,RULE_ANYTHING,FOLLOW_2); 
             after(grammarAccess.getAffectationAccess().getValueANYTHINGTerminalRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Affectation__ValueAssignment_1_2"


    // $ANTLR start "rule__Affectation__NameAssignment_2_0"
    // InternalFuzzyLanguage.g:2283:1: rule__Affectation__NameAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__Affectation__NameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2287:1: ( ( RULE_ID ) )
            // InternalFuzzyLanguage.g:2288:2: ( RULE_ID )
            {
            // InternalFuzzyLanguage.g:2288:2: ( RULE_ID )
            // InternalFuzzyLanguage.g:2289:3: RULE_ID
            {
             before(grammarAccess.getAffectationAccess().getNameIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAffectationAccess().getNameIDTerminalRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Affectation__NameAssignment_2_0"


    // $ANTLR start "rule__Affectation__ExpAssignment_2_2"
    // InternalFuzzyLanguage.g:2298:1: rule__Affectation__ExpAssignment_2_2 : ( ruleExpression ) ;
    public final void rule__Affectation__ExpAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2302:1: ( ( ruleExpression ) )
            // InternalFuzzyLanguage.g:2303:2: ( ruleExpression )
            {
            // InternalFuzzyLanguage.g:2303:2: ( ruleExpression )
            // InternalFuzzyLanguage.g:2304:3: ruleExpression
            {
             before(grammarAccess.getAffectationAccess().getExpExpressionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAffectationAccess().getExpExpressionParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__Affectation__ExpAssignment_2_2"


    // $ANTLR start "rule__Expression__NameAssignment_0_0"
    // InternalFuzzyLanguage.g:2313:1: rule__Expression__NameAssignment_0_0 : ( RULE_OPERATOR ) ;
    public final void rule__Expression__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2317:1: ( ( RULE_OPERATOR ) )
            // InternalFuzzyLanguage.g:2318:2: ( RULE_OPERATOR )
            {
            // InternalFuzzyLanguage.g:2318:2: ( RULE_OPERATOR )
            // InternalFuzzyLanguage.g:2319:3: RULE_OPERATOR
            {
             before(grammarAccess.getExpressionAccess().getNameOPERATORTerminalRuleCall_0_0_0()); 
            match(input,RULE_OPERATOR,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getNameOPERATORTerminalRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Expression__NameAssignment_0_0"


    // $ANTLR start "rule__Expression__ExpsAssignment_0_2"
    // InternalFuzzyLanguage.g:2328:1: rule__Expression__ExpsAssignment_0_2 : ( ruleExpression ) ;
    public final void rule__Expression__ExpsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2332:1: ( ( ruleExpression ) )
            // InternalFuzzyLanguage.g:2333:2: ( ruleExpression )
            {
            // InternalFuzzyLanguage.g:2333:2: ( ruleExpression )
            // InternalFuzzyLanguage.g:2334:3: ruleExpression
            {
             before(grammarAccess.getExpressionAccess().getExpsExpressionParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getExpsExpressionParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Expression__ExpsAssignment_0_2"


    // $ANTLR start "rule__Expression__NameAssignment_1_0"
    // InternalFuzzyLanguage.g:2343:1: rule__Expression__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Expression__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2347:1: ( ( RULE_ID ) )
            // InternalFuzzyLanguage.g:2348:2: ( RULE_ID )
            {
            // InternalFuzzyLanguage.g:2348:2: ( RULE_ID )
            // InternalFuzzyLanguage.g:2349:3: RULE_ID
            {
             before(grammarAccess.getExpressionAccess().getNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getNameIDTerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Expression__NameAssignment_1_0"


    // $ANTLR start "rule__Expression__ValueAssignment_1_2"
    // InternalFuzzyLanguage.g:2358:1: rule__Expression__ValueAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__Expression__ValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2362:1: ( ( ruleExpression ) )
            // InternalFuzzyLanguage.g:2363:2: ( ruleExpression )
            {
            // InternalFuzzyLanguage.g:2363:2: ( ruleExpression )
            // InternalFuzzyLanguage.g:2364:3: ruleExpression
            {
             before(grammarAccess.getExpressionAccess().getValueExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getValueExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Expression__ValueAssignment_1_2"


    // $ANTLR start "rule__Expression__NameAssignment_2"
    // InternalFuzzyLanguage.g:2373:1: rule__Expression__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Expression__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2377:1: ( ( RULE_ID ) )
            // InternalFuzzyLanguage.g:2378:2: ( RULE_ID )
            {
            // InternalFuzzyLanguage.g:2378:2: ( RULE_ID )
            // InternalFuzzyLanguage.g:2379:3: RULE_ID
            {
             before(grammarAccess.getExpressionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Expression__NameAssignment_2"


    // $ANTLR start "rule__Binding__OpAssignment_0"
    // InternalFuzzyLanguage.g:2388:1: rule__Binding__OpAssignment_0 : ( RULE_OPERATOR ) ;
    public final void rule__Binding__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2392:1: ( ( RULE_OPERATOR ) )
            // InternalFuzzyLanguage.g:2393:2: ( RULE_OPERATOR )
            {
            // InternalFuzzyLanguage.g:2393:2: ( RULE_OPERATOR )
            // InternalFuzzyLanguage.g:2394:3: RULE_OPERATOR
            {
             before(grammarAccess.getBindingAccess().getOpOPERATORTerminalRuleCall_0_0()); 
            match(input,RULE_OPERATOR,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getOpOPERATORTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Binding__OpAssignment_0"


    // $ANTLR start "rule__Binding__TargetAssignment_2"
    // InternalFuzzyLanguage.g:2403:1: rule__Binding__TargetAssignment_2 : ( RULE_ID ) ;
    public final void rule__Binding__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2407:1: ( ( RULE_ID ) )
            // InternalFuzzyLanguage.g:2408:2: ( RULE_ID )
            {
            // InternalFuzzyLanguage.g:2408:2: ( RULE_ID )
            // InternalFuzzyLanguage.g:2409:3: RULE_ID
            {
             before(grammarAccess.getBindingAccess().getTargetIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getTargetIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Binding__TargetAssignment_2"


    // $ANTLR start "rule__Binding__ParamsAssignment_3_1"
    // InternalFuzzyLanguage.g:2418:1: rule__Binding__ParamsAssignment_3_1 : ( ruleParam ) ;
    public final void rule__Binding__ParamsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2422:1: ( ( ruleParam ) )
            // InternalFuzzyLanguage.g:2423:2: ( ruleParam )
            {
            // InternalFuzzyLanguage.g:2423:2: ( ruleParam )
            // InternalFuzzyLanguage.g:2424:3: ruleParam
            {
             before(grammarAccess.getBindingAccess().getParamsParamParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getBindingAccess().getParamsParamParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Binding__ParamsAssignment_3_1"


    // $ANTLR start "rule__Param__ValueAssignment_0_0"
    // InternalFuzzyLanguage.g:2433:1: rule__Param__ValueAssignment_0_0 : ( RULE_ANYTHING ) ;
    public final void rule__Param__ValueAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2437:1: ( ( RULE_ANYTHING ) )
            // InternalFuzzyLanguage.g:2438:2: ( RULE_ANYTHING )
            {
            // InternalFuzzyLanguage.g:2438:2: ( RULE_ANYTHING )
            // InternalFuzzyLanguage.g:2439:3: RULE_ANYTHING
            {
             before(grammarAccess.getParamAccess().getValueANYTHINGTerminalRuleCall_0_0_0()); 
            match(input,RULE_ANYTHING,FOLLOW_2); 
             after(grammarAccess.getParamAccess().getValueANYTHINGTerminalRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Param__ValueAssignment_0_0"


    // $ANTLR start "rule__Param__ValueAssignment_1"
    // InternalFuzzyLanguage.g:2448:1: rule__Param__ValueAssignment_1 : ( RULE_ANYTHING ) ;
    public final void rule__Param__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2452:1: ( ( RULE_ANYTHING ) )
            // InternalFuzzyLanguage.g:2453:2: ( RULE_ANYTHING )
            {
            // InternalFuzzyLanguage.g:2453:2: ( RULE_ANYTHING )
            // InternalFuzzyLanguage.g:2454:3: RULE_ANYTHING
            {
             before(grammarAccess.getParamAccess().getValueANYTHINGTerminalRuleCall_1_0()); 
            match(input,RULE_ANYTHING,FOLLOW_2); 
             after(grammarAccess.getParamAccess().getValueANYTHINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Param__ValueAssignment_1"


    // $ANTLR start "rule__TypeSet__TypeNameAssignment_3"
    // InternalFuzzyLanguage.g:2463:1: rule__TypeSet__TypeNameAssignment_3 : ( RULE_ID ) ;
    public final void rule__TypeSet__TypeNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2467:1: ( ( RULE_ID ) )
            // InternalFuzzyLanguage.g:2468:2: ( RULE_ID )
            {
            // InternalFuzzyLanguage.g:2468:2: ( RULE_ID )
            // InternalFuzzyLanguage.g:2469:3: RULE_ID
            {
             before(grammarAccess.getTypeSetAccess().getTypeNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeSetAccess().getTypeNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__TypeSet__TypeNameAssignment_3"


    // $ANTLR start "rule__FuzzyConfig__TypeSETAssignment_2"
    // InternalFuzzyLanguage.g:2478:1: rule__FuzzyConfig__TypeSETAssignment_2 : ( ruleTypeSet ) ;
    public final void rule__FuzzyConfig__TypeSETAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2482:1: ( ( ruleTypeSet ) )
            // InternalFuzzyLanguage.g:2483:2: ( ruleTypeSet )
            {
            // InternalFuzzyLanguage.g:2483:2: ( ruleTypeSet )
            // InternalFuzzyLanguage.g:2484:3: ruleTypeSet
            {
             before(grammarAccess.getFuzzyConfigAccess().getTypeSETTypeSetParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeSet();

            state._fsp--;

             after(grammarAccess.getFuzzyConfigAccess().getTypeSETTypeSetParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__FuzzyConfig__TypeSETAssignment_2"


    // $ANTLR start "rule__FuzzyConfig__BindingsListAssignment_3"
    // InternalFuzzyLanguage.g:2493:1: rule__FuzzyConfig__BindingsListAssignment_3 : ( ruleBinding ) ;
    public final void rule__FuzzyConfig__BindingsListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFuzzyLanguage.g:2497:1: ( ( ruleBinding ) )
            // InternalFuzzyLanguage.g:2498:2: ( ruleBinding )
            {
            // InternalFuzzyLanguage.g:2498:2: ( ruleBinding )
            // InternalFuzzyLanguage.g:2499:3: ruleBinding
            {
             before(grammarAccess.getFuzzyConfigAccess().getBindingsListBindingParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getFuzzyConfigAccess().getBindingsListBindingParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__FuzzyConfig__BindingsListAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400050L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000042L});

}