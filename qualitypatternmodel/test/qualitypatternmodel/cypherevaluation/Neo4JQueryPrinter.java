package qualitypatternmodel.cypherevaluation;

import java.util.ArrayList;

import qualitypatternmodel.cyphertranslationtests.CypherTranslationAbstract;
import qualitypatternmodel.patternstructure.CompletePattern;

class Neo4JQueryPrinter {
		protected static void queryPrinterSys(ArrayList<CompletePattern> completePatterns) {
			CypherTranslationAbstract.testAllCompletePatterns(completePatterns, false, true);
		}
		
		protected static void queryPrinterDb(ArrayList<CompletePattern> completePatterns) {
			CypherTranslationAbstract.testAllCompletePatterns(completePatterns, true, false);
		}
		
		protected static void queryPrinterSysAndDb(ArrayList<CompletePattern> completePatterns) {
			CypherTranslationAbstract.testAllCompletePatterns(completePatterns, true, true);
		}
}
