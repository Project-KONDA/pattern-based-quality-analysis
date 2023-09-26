package patterntoconstrainttranslation;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import de.gwdg.metadataqa.api.json.DataElement;
import de.gwdg.metadataqa.api.schema.BaseSchema;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.constrainttranslation.ConstraintTranslation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.operators.ComparisonOperator;

public class ConstraintToSchemaTranslationTest {

	static String RECORD_PATH = "/descendant::*";
	static String FIELD_PATH = "/descendant::*";
	static String OTHERFIELD_PATH = "/descendant::*";

	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		EList<CompletePattern> patterns = getTestPatternCollection();

		int valid = 0;
		int invalid = 0;

		for (CompletePattern c : patterns) {
			try {
				System.out.println("____ " + c.getDescription() + " _____");
				BaseSchema schema = ConstraintTranslation.translateToConstraintSchema(c);
				System.out.println(schema);
				System.out.println();
				for (DataElement de : schema.getPaths())
					System.out.println(de);
				System.out.println();
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

	public static EList<CompletePattern> getTestPatternCollection()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		EList<CompletePattern> patterns = new BasicEList<CompletePattern>();

		patterns.add(ConstraintToStringTranslationTest.simpleMatchPattern(false));
		patterns.add(ConstraintToStringTranslationTest.simpleMatchPattern(true));
		patterns.add(ConstraintToStringTranslationTest.simpleStringLengthPattern(ComparisonOperator.EQUAL));
		patterns.add(ConstraintToStringTranslationTest.simpleStringLengthPattern(ComparisonOperator.GREATER));
		patterns.add(ConstraintToStringTranslationTest.simpleValueComparisonPattern(false));
		patterns.add(ConstraintToStringTranslationTest.simpleValueComparisonPattern(true));
		patterns.add(ConstraintToStringTranslationTest.simpleNumberValueComparisonPattern(ComparisonOperator.EQUAL));
		patterns.add(ConstraintToStringTranslationTest.simpleNumberValueComparisonPattern(ComparisonOperator.GREATER));
		patterns.add(ConstraintToStringTranslationTest.simpleNumberValueComparisonPattern(ComparisonOperator.LESSOREQUAL));
		patterns.add(ConstraintToStringTranslationTest.simpleListPattern(true));
		patterns.add(ConstraintToStringTranslationTest.simpleListPattern(false));
		patterns.add(ConstraintToStringTranslationTest.notConditionPattern());
		patterns.add(ConstraintToStringTranslationTest.doubleNotConditionPattern());
		patterns.add(ConstraintToStringTranslationTest.formulaCombinationPattern(LogicalOperator.AND));
		patterns.add(ConstraintToStringTranslationTest.formulaCombinationPattern(LogicalOperator.IMPLIES));
		patterns.add(ConstraintToStringTranslationTest.formulaNotCombinationPattern());
		patterns.add(ConstraintToStringTranslationTest.notComparisonPattern());
		patterns.add(ConstraintToStringTranslationTest.simpleComparisonPattern(ComparisonOperator.EQUAL));
		patterns.add(ConstraintToStringTranslationTest.simpleComparisonPattern(ComparisonOperator.GREATER));
		patterns.add(ConstraintToStringTranslationTest.simpleComparisonPattern(ComparisonOperator.LESSOREQUAL));
		patterns.add(ConstraintToStringTranslationTest.doubleComparisonPattern());
		patterns.add(ConstraintToStringTranslationTest.conditionCombinationPattern());
		patterns.add(ConstraintToStringTranslationTest.uniqueness1_1nPattern());
		patterns.add(ConstraintToStringTranslationTest.uniqueness1_2nPattern());
		patterns.add(ConstraintToStringTranslationTest.uniqueness2_1nPattern());
		patterns.add(ConstraintToStringTranslationTest.uniqueness2_2nPattern());
		patterns.add(ConstraintToStringTranslationTest.uniqueness3_1nPattern());
		patterns.add(ConstraintToStringTranslationTest.uniqueness3_2nPattern());

		return patterns;
	}
}
