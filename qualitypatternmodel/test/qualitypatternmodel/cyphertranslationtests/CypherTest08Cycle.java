package qualitypatternmodel.cyphertranslationtests;

import java.util.ArrayList;

import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
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
        completePatterns.add(getCyclePattern());
        //Call tester from CypherTest00
        CypherTest00.test(completePatterns);
        System.out.println("<<< END - Tests >>>");
        System.out.println("");         
        
        //INTRODUCE THE EXCEPTION TESTS ??? 
    }
    
	private static CompletePattern getCyclePattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest00.getBasePattern();
		ComplexNode newNode0 = (ComplexNode) completePattern.getGraph().getNodes().get(0);
		ComplexNode newNode1 = completePattern.getGraph().addComplexNode();
		ComplexNode newNode2 = completePattern.getGraph().addComplexNode();
		ComplexNode newNode3 = completePattern.getGraph().addComplexNode();
		
		completePattern.getGraph().addRelation(newNode0, newNode1);
		completePattern.getGraph().addRelation(newNode1, newNode2);
		completePattern.getGraph().addRelation(newNode2, newNode3);
		
		newNode0.addComparison(newNode3);
		
		completePattern.createNeo4jAdaption();
		NeoNode neoNode0 = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode0.setNodePlace(NeoPlace.BEGINNING);
		
		return completePattern;
	}
}
