package qualitypatternmodel.cypherevaluation;

import java.util.ArrayList;

import qualitypatternmodel.cyphertranslationtests.CypherTranslationAbstract;
import qualitypatternmodel.patternstructure.CompletePattern;

class Neo4JQueryPrinter {
		protected static void queryPrinter(ArrayList<CompletePattern> completePatterns) {
			CypherTranslationAbstract.testAllCompletePatterns(completePatterns, false, true);
		}
}
