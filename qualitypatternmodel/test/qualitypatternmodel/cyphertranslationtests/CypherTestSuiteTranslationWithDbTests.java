package qualitypatternmodel.cyphertranslationtests;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;

import qualitypatternmodel.patternstructure.CompletePattern;

@DisplayName("Systemtest with Neo4J-DB")
@TestInstance(Lifecycle.PER_CLASS)
@ExtendWith(CypherTestSuiteTranslationWithDbTests.class)
public class CypherTestSuiteTranslationWithDbTests extends  CypherAbstractTestSuiteTranslation implements ExecutionCondition {
	@Override
	protected void tester(ArrayList<CompletePattern> completePatterns) throws Exception {
		System.out.println(CypherAbstractTranslation.BEGIN_TESTS);
		CypherAbstractTranslation.testAllCompletePatterns(completePatterns, true, false);
	    System.out.println(CypherAbstractTranslation.END_TESTS);
	}

	@Override
	public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {		
		if (playground.Java2Neo4JConnector.verifyConnectivity()) {
			return ConditionEvaluationResult.enabled(TEST_ENABLED_ON_QA_ENVIRONMENT);
		} 
		return ConditionEvaluationResult.disabled(TEST_DISABLED_ON_QA_ENVIRONMENT);
	}
}
