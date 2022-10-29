package qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

import qualitypatternmodel.cyphertranslationtests.CypherAbstractTranslation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.patternstructure.CompletePattern;

//Warum dauert der test so lange?
public class CypherTest08Cycle extends CypherAbstractTranslation {
    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
    	CypherTest08Cycle cycle = new CypherTest08Cycle();
    	Instant start = Instant.now();
    	try {
//    		cycle.generalizedTests();         
//    		cycle.generalizedInvalidtyExceptionTests();
    		ArrayList<CompletePattern> l = new ArrayList<>();
    		cycle.buildPatterns(l);
    		System.out.println(l.get(0).generateCypher());
    		System.out.println(l.get(1).generateCypher());    		
    	} catch (Exception e) {
			System.out.println(e);
		}
		    
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println(timeElapsed);
    }

	public void buildPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatterns.add(getCyclePattern2());
        completePatterns.add(getCyclePattern3());
	}
	
	@Override
	public void buildInvalidityExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		//Nothing to generate here		
	}
    
	private CompletePattern getCyclePattern2() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherAbstractTranslation.getBasePattern();
		ComplexNode newNode0 = (ComplexNode) completePattern.getGraph().getNodes().get(0);
		ComplexNode newNode1 = (ComplexNode) completePattern.getGraph().addComplexNode();
		completePattern.getGraph().addRelation(newNode0, newNode1);
		ComplexNode newNode2 = (ComplexNode) completePattern.getGraph().addComplexNode();
		completePattern.getGraph().addRelation(newNode0, newNode2);
		
		newNode0.addComparison(newNode2);
		
		completePattern.createNeo4jAdaption();
		
		return completePattern;
	}
	
	private CompletePattern getCyclePattern3() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherAbstractTranslation.getBasePattern();
		ComplexNode newNode0 = (ComplexNode) completePattern.getGraph().getNodes().get(0);
		ComplexNode newNode1 = (ComplexNode) completePattern.getGraph().addComplexNode();
		completePattern.getGraph().addRelation(newNode0, newNode1);
		ComplexNode newNode2 = (ComplexNode) completePattern.getGraph().addComplexNode();
		completePattern.getGraph().addRelation(newNode0, newNode2);
		ComplexNode newNode3 = (ComplexNode) completePattern.getGraph().addComplexNode();
		completePattern.getGraph().addRelation(newNode0, newNode3);
		
		newNode0.addComparison(newNode3);
		
		completePattern.createNeo4jAdaption();
		
		return completePattern;
	}
}
