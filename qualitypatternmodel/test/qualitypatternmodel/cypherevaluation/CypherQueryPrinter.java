package qualitypatternmodel.cypherevaluation;

import java.util.ArrayList;

import qualitypatternmodel.cyphertranslationtests.CypherAbstractTranslation;
import qualitypatternmodel.patternstructure.CompletePattern;

class CypherQueryPrinter {
		protected static void queryPrinterSys(ArrayList<CompletePattern> completePatterns) throws Exception {
			CypherAbstractTranslation.testAllCompletePatterns(completePatterns, false, true);
		}
		
		protected static void queryPrinterDb(ArrayList<CompletePattern> completePatterns) throws Exception {
			CypherAbstractTranslation.testAllCompletePatterns(completePatterns, true, false);
		}
		
		protected static void queryPrinterSysAndDb(ArrayList<CompletePattern> completePatterns) throws Exception {
			CypherAbstractTranslation.testAllCompletePatterns(completePatterns, true, true);
		}
}
