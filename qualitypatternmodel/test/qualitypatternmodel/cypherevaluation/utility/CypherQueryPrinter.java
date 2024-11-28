package qualitypatternmodel.cypherevaluation.utility;

import java.util.ArrayList;

import qualitypatternmodel.cyphertranslationtests.CypherTestSuiteTranslation;
import qualitypatternmodel.patternstructure.CompletePattern;
import utility.Java2Neo4JConnector;

public class CypherQueryPrinter {
		public static void queryPrinterSys(ArrayList<CompletePattern> completePatterns) throws Exception {
			CypherTestSuiteTranslation.testAllCompletePatterns(completePatterns, false);
		}

		public static void queryPrinterSys(CompletePattern completePattern) throws Exception {
			CypherQueryPrinter.queryPrinterSys(createListFromSingle(completePattern));
		}



		public static void queryPrinterDb(ArrayList<CompletePattern> completePatterns) throws Exception {
			CypherTestSuiteTranslation.testAllCompletePatterns(completePatterns, true);
		}

		public static void queryPrinterDb(CompletePattern completePattern) throws Exception {
			CypherQueryPrinter.queryPrinterDb(createListFromSingle(completePattern));
		}



		public static void queryPrinterSysAndDb(ArrayList<CompletePattern> completePatterns) throws Exception {
			CypherTestSuiteTranslation.testAllCompletePatterns(completePatterns, Java2Neo4JConnector.verifyConnectivity());
		}

		public static void queryPrinterSysAndDb(CompletePattern completePattern) throws Exception {
			CypherQueryPrinter.queryPrinterSysAndDb(createListFromSingle(completePattern));
		}


		private static ArrayList<CompletePattern> createListFromSingle(CompletePattern completePattern) {
			ArrayList<CompletePattern> l = new ArrayList<CompletePattern>();
			l.add(completePattern);
			return l;
		}
}
