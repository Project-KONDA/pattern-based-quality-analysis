package patterntoconstrainttranslation;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.constrainttranslation.FieldNodeIdentification;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.CompletePattern;

public class ConstraintFieldIdentificationTest {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		EList<CompletePattern> patterns = ConstraintToStringTranslationTest.getTestPatternCollection();
		
		for (CompletePattern pattern: patterns) {
			
			String description = pattern.getDescription();
			Node[] fields = FieldNodeIdentification.identifyFieldNodes(pattern);
			
			System.out.println("__" + description + "__");
			for (Node field: fields)
				System.out.println(field.myToString());
			System.out.println();
			
		}
		
	}

}
