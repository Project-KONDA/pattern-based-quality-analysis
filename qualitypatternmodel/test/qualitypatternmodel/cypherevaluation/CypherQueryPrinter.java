package qualitypatternmodel.cypherevaluation;

import java.util.ArrayList;

import qualitypatternmodel.cyphertranslationtests.CypherAbstractTranslation;
import qualitypatternmodel.patternstructure.CompletePattern;

class CypherQueryPrinter {
		protected static void queryPrinterSys(ArrayList<CompletePattern> completePatterns) throws Exception {
			CypherAbstractTranslation.testAllCompletePatternsWithDbCheck(completePatterns);
		}
		
		protected static void queryPrinterDb(ArrayList<CompletePattern> completePatterns) throws Exception {
			CypherAbstractTranslation.testAllCompletePatternsWithDbCheck(completePatterns);
		}
		
		protected static void queryPrinterSysAndDb(ArrayList<CompletePattern> completePatterns) throws Exception {
			CypherAbstractTranslation.testAllCompletePatternsWithDbCheck(completePatterns);
		}
}
