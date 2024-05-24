package patterntoconstrainttranslation;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.constrainttranslation.ConstraintTranslation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;

public class ConstraintToSchemaTranslationTest {

	static Boolean SHOW_QUERY = false;
	static Boolean SHOW_STRING = false;
	static Boolean SHOW_SCHEMA = true;

	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		EList<CompletePattern> patterns = ConstraintToStringTranslationTest.getTestPatternCollection();

		int valid = 0;
		int invalid = 0;

		for (CompletePattern c : patterns) {
			try {
				
				System.out.println("____ " + c.getDescription() + " _____");
				
				if (SHOW_QUERY) {
					System.out.println(c.generateXQuery());
					System.out.println();
				}
				if (SHOW_STRING) {
					System.out.println(ConstraintTranslation.translateToConstraintString(c));
					System.out.println();
				}
				if (SHOW_SCHEMA) {
					System.out.println(ConstraintTranslation.translateToConstraintSchema(c));
					System.out.println();
				}
				valid += 1;
			} catch (Exception e) {
				e.printStackTrace();
				invalid += 1;
			}
		}

		System.out.println("out of " + (valid + invalid) + " testpatterns " + valid + " were valid and " + invalid
				+ " were invalid");

		// TODO Auto-generated method stub

	}
}
