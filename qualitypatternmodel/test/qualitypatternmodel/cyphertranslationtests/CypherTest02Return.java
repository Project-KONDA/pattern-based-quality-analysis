package qualitypatternmodel.cyphertranslationtests;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;

public class CypherTest02Return {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		//Tests
		completePatterns.add(getAllPossibleReturnTypes());
		//Call tester from CypherTest00
		CypherTest00.test(completePatterns);
	}
	
	public static CompletePattern getAllPossibleReturnTypes() {
		//This test is for CompletePattern --> generateCypherReturn
		//Get All NeoNodes
		//Get All NeoPropertyNodes which are outside of the NeoNode
		//Get All NeoPropertyNodes which have as a ComplexNode a specification in the last NeoPathPart
		//Get All NeoProperties
		
		return null;
	}
}
