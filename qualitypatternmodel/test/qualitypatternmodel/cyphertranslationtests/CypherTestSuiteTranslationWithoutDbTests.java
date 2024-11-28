package qualitypatternmodel.cyphertranslationtests;


import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;

import qualitypatternmodel.patternstructure.CompletePattern;

@DisplayName("Systemtest without Neo4J-DB")
@TestInstance(Lifecycle.PER_CLASS)
@ExtendWith(CypherTestSuiteTranslationWithoutDbTests.class)
public class CypherTestSuiteTranslationWithoutDbTests extends CypherTestSuiteTranslation {
	@Override
	protected void tester(ArrayList<CompletePattern> completePatterns) throws Exception {
		System.out.println(CypherTranslation.BEGIN_TESTS);
		testAllCompletePatterns(completePatterns, false);
	    System.out.println(CypherTranslation.END_TESTS);
	}

	@Override
	protected void testerForToComplexQueries(ArrayList<CompletePattern> completePatterns) throws Exception {
		tester(completePatterns);
	}
	@Override
	public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
		if (utility.Java2Neo4JConnector.verifyConnectivity()) {
            return ConditionEvaluationResult.disabled(TEST_DISABLED_ON_QA_ENVIRONMENT);
        }
        return ConditionEvaluationResult.enabled(TEST_ENABLED_ON_QA_ENVIRONMENT);
	}

}
