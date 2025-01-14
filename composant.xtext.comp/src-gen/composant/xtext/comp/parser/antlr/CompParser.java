/*
 * generated by Xtext 2.26.0
 */
package composant.xtext.comp.parser.antlr;

import com.google.inject.Inject;
import composant.xtext.comp.parser.antlr.internal.InternalCompParser;
import composant.xtext.comp.services.CompGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class CompParser extends AbstractAntlrParser {

	@Inject
	private CompGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalCompParser createParser(XtextTokenStream stream) {
		return new InternalCompParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Composant";
	}

	public CompGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CompGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
