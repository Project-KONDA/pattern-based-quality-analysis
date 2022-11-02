package qualitypatternmodel.cypherevaluation;

import java.util.ArrayList;
import java.util.List;

import playground.Java2Neo4JConnector;
import qualitypatternmodel.cyphertranslationtests.CypherAbstractTestSuiteTranslation;
import qualitypatternmodel.patternstructure.CompletePattern;

class CypherQueryPrinter {
		protected static void queryPrinterSys(ArrayList<CompletePattern> completePatterns) throws Exception {
			CypherAbstractTestSuiteTranslation.testAllCompletePatterns(completePatterns, false);
		}
		
		protected static void queryPrinterSys(CompletePattern completePattern) throws Exception {
			CypherQueryPrinter.queryPrinterSys(createListFromSingle(completePattern));
		}

		
		
		protected static void queryPrinterDb(ArrayList<CompletePattern> completePatterns) throws Exception {
			CypherAbstractTestSuiteTranslation.testAllCompletePatterns(completePatterns, true);
		}
		
		protected static void queryPrinterDb(CompletePattern completePattern) throws Exception {
			CypherQueryPrinter.queryPrinterDb(createListFromSingle(completePattern));
		}
		
		
		
		protected static void queryPrinterSysAndDb(ArrayList<CompletePattern> completePatterns) throws Exception {
			CypherAbstractTestSuiteTranslation.testAllCompletePatterns(completePatterns, Java2Neo4JConnector.verifyConnectivity());
		}
		
		protected static void queryPrinterSysAndDb(CompletePattern completePattern) throws Exception {
			CypherQueryPrinter.queryPrinterSysAndDb(createListFromSingle(completePattern));
		}
		
		
		private static ArrayList<CompletePattern> createListFromSingle(CompletePattern completePattern) {
			ArrayList<CompletePattern> l = new ArrayList<>();
			l.add(completePattern);
			return l;
		}
}
