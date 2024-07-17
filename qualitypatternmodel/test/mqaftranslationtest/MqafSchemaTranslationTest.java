package mqaftranslationtest;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.mqaftranslation.MqafTranslation;
import qualitypatternmodel.patternstructure.CompletePattern;

public class MqafSchemaTranslationTest {

	static Boolean SHOW_QUERY = false;
	static Boolean SHOW_STRING = false;
	static Boolean SHOW_SCHEMA = true;

	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		EList<CompletePattern> patterns = MqafStringTranslationTest.getTestPatternCollection();

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
					System.out.println(MqafTranslation.translateToConstraintString(c));
					System.out.println();
				}
				if (SHOW_SCHEMA) {
					System.out.println(MqafTranslation.translateToConstraintSchema(c));
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
	}
}
