package mqaftranslationtest;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.mqaftranslation.MqafFieldNodeIdentification;
import qualitypatternmodel.patternstructure.CompletePattern;

public class MqafFieldIdentificationTest {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		EList<CompletePattern> patterns = MqafStringTranslationTest.getTestPatternCollection();
		
		for (CompletePattern pattern: patterns) {
			
			String description = pattern.getDescription();
			Node[] fields = MqafFieldNodeIdentification.identifyFieldNodes(pattern);
			
			System.out.println("__" + description + "__");
			for (Node field: fields)
				System.out.println(field.myToString());
			System.out.println();
			
		}
		
	}

}
