package qualitypatternmodel.cyphertranslationtests;

import java.util.ArrayList;

import org.junit.jupiter.api.condition.DisabledIf;

import qualitypatternmodel.patternstructure.CompletePattern;

@DisabledIf("isDbActive()") //--> has to be done
public class CypherTestSuiteTranslationWithDbTests extends  CypherAbstractTestSuiteTranslation {
	@Override
	protected void tester(ArrayList<CompletePattern> completePatterns) throws Exception {
		System.out.println(CypherAbstractTranslation.BEGIN_TESTS);
		CypherAbstractTranslation.testAllCompletePatterns(completePatterns, true, false);
	    System.out.println(CypherAbstractTranslation.END_TESTS);
	}
	
	public static boolean isDbActive() {
		return playground.Java2Neo4JConnector.verifyConnectivity();
	}
}
