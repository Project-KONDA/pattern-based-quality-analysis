package qualitypatternmodel.cyphertranslationtests;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.patternstructure.CompletePattern;


public class CypherTest08Cycle {
    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
        //Tests
        System.out.println("");
        System.out.println("<<< BEGIN - Tests >>>");
        ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
        buildPatterns(completePatterns);
        //Call tester from CypherTest00
        CypherTest00.test(completePatterns);
        System.out.println("<<< END - Tests >>>");
        System.out.println("");         
        
        //INTRODUCE THE EXCEPTION TESTS ??? 
    }

	protected static void buildPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatterns.add(getCyclePattern(2));
        completePatterns.add(getCyclePattern(3));
	}
    
	private static CompletePattern getCyclePattern(int nodesInCycle) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest00.getBasePattern();
		ComplexNode newNode0 = (ComplexNode) completePattern.getGraph().getNodes().get(0);
		ComplexNode[] newNode = new ComplexNode[nodesInCycle];
		for (int i = 0; i < nodesInCycle; i++) {
			newNode[i] = completePattern.getGraph().addComplexNode();
			if (i == 0) {
				completePattern.getGraph().addRelation(newNode0, newNode[i]);
			} else {
				completePattern.getGraph().addRelation(newNode[i - 1], newNode[i]);
			}
		}
		
		newNode0.addComparison(newNode[nodesInCycle - 1]);
		
		completePattern.createNeo4jAdaption();
		
		return completePattern;
	}
}
