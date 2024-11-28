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
import utility.Java2Neo4JConnector;

@DisplayName("Systemtest with Neo4J-DB")
@TestInstance(Lifecycle.PER_CLASS)
@ExtendWith(CypherTestSuiteTranslationWithDbTests.class)
public class CypherTestSuiteTranslationWithDbTests extends  CypherTestSuiteTranslation implements ExecutionCondition {
	@Override
	protected void tester(ArrayList<CompletePattern> completePatterns) throws Exception {
		System.out.println(CypherTranslation.BEGIN_TESTS);
		testAllCompletePatterns(completePatterns, true);
	    System.out.println(CypherTranslation.END_TESTS);
	}

	@Override
	public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
		if (utility.Java2Neo4JConnector.verifyConnectivity()) {
			return ConditionEvaluationResult.enabled(TEST_ENABLED_ON_QA_ENVIRONMENT);
		}
		return ConditionEvaluationResult.disabled(TEST_DISABLED_ON_QA_ENVIRONMENT);
	}

	@Override
	protected void testerForToComplexQueries(ArrayList<CompletePattern> completePatterns) throws Exception {
		for (CompletePattern comp : completePatterns) {
			try (Java2Neo4JConnector connector = new Java2Neo4JConnector()) {
				connector.queryTesterForToComplexQueries(comp.generateCypher(), comp.generateCypher().hashCode() + "", true);
			}
		}
	}
}
