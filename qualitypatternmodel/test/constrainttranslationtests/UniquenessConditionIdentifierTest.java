package constrainttranslationtests;

import org.basex.util.Pair;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.constrainttranslation.UniquenessConditionCheck;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.CompletePattern;

public class UniquenessConditionIdentifierTest {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		EList<CompletePattern> patterns = new BasicEList<CompletePattern>();

		patterns.add(ConstraintTranslationTests.uniqueness1_1nPattern());
		patterns.add(ConstraintTranslationTests.uniqueness1_2nPattern());
		patterns.add(ConstraintTranslationTests.uniqueness2_1nPattern());
		patterns.add(ConstraintTranslationTests.uniqueness2_2nPattern());
		patterns.add(ConstraintTranslationTests.uniqueness3_1nPattern());
		patterns.add(ConstraintTranslationTests.uniqueness3_2nPattern());

		
		for (CompletePattern pattern: patterns) {
			try {
				System.out.println("__ " + pattern.getDescription() + " __");
//				System.out.println(pattern.myToString());
				Pair<Node, Boolean> pair = UniquenessConditionCheck.uniquenessConditionField(pattern);
				if (pair == null)
					System.out.println("null");
				else {
					System.out.println(pair.name().myToString());
					System.out.println(pair.value());
				}	
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println();
		}
	}
}
