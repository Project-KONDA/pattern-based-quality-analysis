package qualitypatternmodel.cyphertranslationtests;

import java.util.ArrayList;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import qualitypatternmodel.patternstructure.CompletePattern;

@TestInstance(Lifecycle.PER_CLASS)
public class CypherTestSuiteTranslationWithoutDbTests extends CypherAbstractTestSuiteTranslation {
	@Override
	protected void tester(ArrayList<CompletePattern> completePatterns) throws Exception {
		System.out.println(CypherAbstractTranslation.BEGIN_TESTS);
		CypherAbstractTranslation.testAllCompletePatterns(completePatterns, false, true);
	    System.out.println(CypherAbstractTranslation.END_TESTS);
	}
}
