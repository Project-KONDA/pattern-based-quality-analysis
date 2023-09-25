package constrainttranslationtests;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import de.gwdg.metadataqa.api.json.DataElement;
import de.gwdg.metadataqa.api.schema.BaseSchema;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.impl.NumberElementImpl;
import qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl;
import qualitypatternmodel.constrainttranslation.ConstraintTranslation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.impl.BooleanParamImpl;
import qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl;
import qualitypatternmodel.parameters.impl.NumberParamImpl;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.parameters.impl.TypeOptionParamImpl;
import qualitypatternmodel.parameters.impl.UntypedParameterValueImpl;

public class ConstraintSchemaTranslationTests {
	
	static String RECORD_PATH = "/descendant::*";
	static String FIELD_PATH = "/descendant::*";
	static String OTHERFIELD_PATH = "/descendant::*";
	

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		EList<CompletePattern> patterns = getTestPatternCollection();
		
		int valid = 0;
		int invalid = 0;
		
		for (CompletePattern c: patterns) {
			try {
				System.out.println("____ " + c.getDescription() + " _____");
				BaseSchema schema = ConstraintTranslation.translateToConstraintSchema(c);
				System.out.println(schema);
				System.out.println();
				for (DataElement de: schema.getPaths())
					System.out.println(de);
				System.out.println();
				valid += 1;
			} catch (Exception e) {
				e.printStackTrace();
				invalid += 1;
			}
		}
		
		System.out.println( "out of " + (valid+invalid) + " testpatterns " + valid + " were valid and " + invalid + " were invalid");
		
		// TODO Auto-generated method stub

	}
	
	public static EList<CompletePattern> getTestPatternCollection() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		EList<CompletePattern> patterns = new BasicEList<CompletePattern>();

		patterns.add(ConstraintStringTranslationTests.simpleMatchPattern(false));
		patterns.add(ConstraintStringTranslationTests.simpleMatchPattern(true));
		patterns.add(ConstraintStringTranslationTests.simpleStringLengthPattern(ComparisonOperator.EQUAL));
		patterns.add(ConstraintStringTranslationTests.simpleStringLengthPattern(ComparisonOperator.GREATER));
		patterns.add(ConstraintStringTranslationTests.simpleValueComparisonPattern(false));
		patterns.add(ConstraintStringTranslationTests.simpleValueComparisonPattern(true));
		patterns.add(ConstraintStringTranslationTests.simpleNumberValueComparisonPattern(ComparisonOperator.EQUAL));
		patterns.add(ConstraintStringTranslationTests.simpleNumberValueComparisonPattern(ComparisonOperator.GREATER));
		patterns.add(ConstraintStringTranslationTests.simpleNumberValueComparisonPattern(ComparisonOperator.LESSOREQUAL));
		patterns.add(ConstraintStringTranslationTests.simpleListPattern(true));
		patterns.add(ConstraintStringTranslationTests.simpleListPattern(false));
		patterns.add(ConstraintStringTranslationTests.notConditionPattern());
		patterns.add(ConstraintStringTranslationTests.doubleNotConditionPattern());
		patterns.add(ConstraintStringTranslationTests.formulaCombinationPattern(LogicalOperator.AND));
		patterns.add(ConstraintStringTranslationTests.formulaCombinationPattern(LogicalOperator.IMPLIES));
		patterns.add(ConstraintStringTranslationTests.formulaNotCombinationPattern());
		patterns.add(ConstraintStringTranslationTests.notComparisonPattern());
		patterns.add(ConstraintStringTranslationTests.simpleComparisonPattern(ComparisonOperator.EQUAL));
		patterns.add(ConstraintStringTranslationTests.simpleComparisonPattern(ComparisonOperator.GREATER));
		patterns.add(ConstraintStringTranslationTests.simpleComparisonPattern(ComparisonOperator.LESSOREQUAL));
		patterns.add(ConstraintStringTranslationTests.doubleComparisonPattern());
		patterns.add(ConstraintStringTranslationTests.conditionCombinationPattern());
		patterns.add(ConstraintStringTranslationTests.uniqueness1_1nPattern());
		patterns.add(ConstraintStringTranslationTests.uniqueness1_2nPattern());
		patterns.add(ConstraintStringTranslationTests.uniqueness2_1nPattern());
		patterns.add(ConstraintStringTranslationTests.uniqueness2_2nPattern());
		patterns.add(ConstraintStringTranslationTests.uniqueness3_1nPattern());
		patterns.add(ConstraintStringTranslationTests.uniqueness3_2nPattern());
		
		return patterns;
	}
}
