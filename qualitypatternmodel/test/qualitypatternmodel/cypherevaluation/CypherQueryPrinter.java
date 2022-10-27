package qualitypatternmodel.cypherevaluation;

import java.util.ArrayList;

import playground.Java2Neo4JConnector;
import qualitypatternmodel.cyphertranslationtests.CypherAbstractTestSuiteTranslation;
import qualitypatternmodel.patternstructure.CompletePattern;

class CypherQueryPrinter {
		protected static void queryPrinterSys(ArrayList<CompletePattern> completePatterns) throws Exception {
			CypherAbstractTestSuiteTranslation.testAllCompletePatterns(completePatterns, Java2Neo4JConnector.verifyConnectivity());
		}
		
		protected static void queryPrinterDb(ArrayList<CompletePattern> completePatterns) throws Exception {
			CypherAbstractTestSuiteTranslation.testAllCompletePatterns(completePatterns, Java2Neo4JConnector.verifyConnectivity());
		}
		
		protected static void queryPrinterSysAndDb(ArrayList<CompletePattern> completePatterns) throws Exception {
			CypherAbstractTestSuiteTranslation.testAllCompletePatterns(completePatterns, Java2Neo4JConnector.verifyConnectivity());
		}
}
