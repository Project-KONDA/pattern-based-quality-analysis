package qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

import qualitypatternmodel.cyphertranslationtests.CypherTranslation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.patternstructure.CompletePattern;

public class CypherTest08Cycle extends CypherTranslation {
    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
    	CypherTest08Cycle cycle = new CypherTest08Cycle();
    	
//    	Instant start = Instant.now();
    	try {
    		cycle.generalizedTests();         
    		cycle.generalizedInvalidtyExceptionTests();
    	} catch (Exception e) {
			System.out.println(e);
		}
		       
//		Instant finish = Instant.now();
//		long timeElapsed = Duration.between(start, finish).toNanos();
//		System.out.println(timeElapsed);
    	
    	
    	
//    	Instant start = null;
//    	Instant finish = null;
//    	long timeElapsed = -1;
//    	
//    	//Testing
//    	CompletePattern completePattern = null;
//    	completePattern = cycle.getCyclePattern(2);
//    	start = Instant.now();
//    	System.out.println(completePattern.generateCypher());
//    	finish = Instant.now();
//		timeElapsed = Duration.between(start, finish).toNanos();
//		System.out.println("Speed time of toCypher in Nanos: " + timeElapsed);
//		timeElapsed = Duration.between(start, finish).toMillis();
//		System.out.println("Speed time of toCypher in Millis: " + timeElapsed);
//		start = null;
//    	finish = null;
//    	timeElapsed = -1;
//    	
//    	System.out.println("\n\nSecond run -->");
//    	completePattern = cycle.getCyclePattern(2);
//    	start = Instant.now();
//    	System.out.println(completePattern.generateCypher());
//    	finish = Instant.now();
//    	timeElapsed = Duration.between(start, finish).toNanos();
//		System.out.println("Speed time of toCypher in Nanos: " + timeElapsed);
//		timeElapsed = Duration.between(start, finish).toMillis();
//		System.out.println("Speed time of toCypher in Millis: " + timeElapsed);
//    	start = null;
//    	finish = null;
//    	timeElapsed = -1;
//    	
//    	System.out.println("\n\n");
//    	completePattern = cycle.getCyclePattern(3);
//    	start = Instant.now();
//    	System.out.println(completePattern.generateCypher());
//    	finish = Instant.now();
//		timeElapsed = Duration.between(start, finish).toNanos();
//		timeElapsed = Duration.between(start, finish).toNanos();
//		System.out.println("Speed time of toCypher in Nanos: " + timeElapsed);
//		timeElapsed = Duration.between(start, finish).toMillis();
//		System.out.println("Speed time of toCypher in Millis: " + timeElapsed);
//		start = null;
//    	finish = null;
//    	timeElapsed = -1;
//
//    	System.out.println("\n\nSecond run -->");
//    	completePattern = cycle.getCyclePattern(3);
//    	start = Instant.now();
//    	System.out.println(completePattern.generateCypher());
//    	finish = Instant.now();
//    	timeElapsed = Duration.between(start, finish).toNanos();
//		timeElapsed = Duration.between(start, finish).toNanos();
//		System.out.println("Speed time of toCypher in Nanos: " + timeElapsed);
//		timeElapsed = Duration.between(start, finish).toMillis();
//		System.out.println("Speed time of toCypher in Millis: " + timeElapsed);
//    	start = null;
//    	finish = null;
//    	timeElapsed = -1;
//    	
//    	
//    	System.out.println("\n\n");
//    	completePattern = cycle.getCyclePatternComp(2);
//    	start = Instant.now();
//    	System.out.println(completePattern.generateCypher());
//    	finish = Instant.now();
//		timeElapsed = Duration.between(start, finish).toNanos();
//		timeElapsed = Duration.between(start, finish).toNanos();
//		System.out.println("Speed time of toCypher in Nanos: " + timeElapsed);
//		timeElapsed = Duration.between(start, finish).toMillis();
//		System.out.println("Speed time of toCypher in Millis: " + timeElapsed);
//		start = null;
//    	finish = null;
//    	timeElapsed = -1;
//
//    	System.out.println("\n\nSecond run -->");
//    	completePattern = cycle.getCyclePatternComp(2);
//    	start = Instant.now();
//    	System.out.println(completePattern.generateCypher());
//    	finish = Instant.now();
//    	timeElapsed = Duration.between(start, finish).toNanos();
//		timeElapsed = Duration.between(start, finish).toNanos();
//		System.out.println("Speed time of toCypher in Nanos: " + timeElapsed);
//		timeElapsed = Duration.between(start, finish).toMillis();
//		System.out.println("Speed time of toCypher in Millis: " + timeElapsed);
//    	start = null;
//    	finish = null;
//    	timeElapsed = -1;
//    	
//
//    	System.out.println("\n\n");
//    	completePattern = cycle.getCyclePatternComp(3);
//    	start = Instant.now();
//    	System.out.println(completePattern.generateCypher());
//    	finish = Instant.now();
//		timeElapsed = Duration.between(start, finish).toNanos();
//		timeElapsed = Duration.between(start, finish).toNanos();
//		System.out.println("Speed time of toCypher in Nanos: " + timeElapsed);
//		timeElapsed = Duration.between(start, finish).toMillis();
//		System.out.println("Speed time of toCypher in Millis: " + timeElapsed);
//		start = null;
//    	finish = null;
//    	timeElapsed = -1;
//
//    	System.out.println("\n\nSecond run -->");
//    	completePattern = cycle.getCyclePatternComp(3);
//    	start = Instant.now();
//    	System.out.println(completePattern.generateCypher());
//    	finish = Instant.now();
//    	timeElapsed = Duration.between(start, finish).toNanos();
//		timeElapsed = Duration.between(start, finish).toNanos();
//		System.out.println("Speed time of toCypher in Nanos: " + timeElapsed);
//		timeElapsed = Duration.between(start, finish).toMillis();
//		System.out.println("Speed time of toCypher in Millis: " + timeElapsed);
//    	start = null;
//    	finish = null;
//    	timeElapsed = -1;
    }

	public void buildPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatterns.add(getCyclePattern(2));
        completePatterns.add(getCyclePattern(3));
        completePatterns.add(getCyclePatternComp(2));
        completePatterns.add(getCyclePatternComp(3));
	}
	
	@Override
	public void buildInvalidityExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		//Nothing to generate here		
	}
    
	
	private CompletePattern getCyclePattern(int nodesInCycle) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest08Cycle.buildPatternCycle(nodesInCycle);
		
		return completePattern;
	}
	
	
	private CompletePattern getCyclePatternComp(int nodesInCycle) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest08Cycle.buildPatternCycleComp(nodesInCycle);
		
		return completePattern;
	}

	
	//FACTORY-METHODS
	private static CompletePattern buildPatternCycle(int nodesInCycle)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		//Generic + Abstract
		Instant start = Instant.now();
		
		CompletePattern completePattern = CypherTranslation.getBasePattern();
		ComplexNode newNode0 = (ComplexNode) completePattern.getGraph().getNodes().get(0);
		ComplexNode[] newNode = new ComplexNode[nodesInCycle];
		for (int i = 0; i < nodesInCycle - 1; i++) {
			newNode[i] = completePattern.getGraph().addComplexNode();
			if (i == 0) {
				completePattern.getGraph().addRelation(newNode0, newNode[i]);
			} else {
				completePattern.getGraph().addRelation(newNode[i - 1], newNode[i]);
			}
		}
		ComplexNode lastNode = (ComplexNode) completePattern.getGraph().getNodes().get(completePattern.getGraph().getNodes().size() - 1);
		completePattern.getGraph().addRelation(lastNode, completePattern.getGraph().getNodes().get(0));
		completePattern.createNeo4jAdaption();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toNanos();
		System.out.println("Speed time of Generic/Abstract" + " instance "+ nodesInCycle +"in Nanos: " + timeElapsed);
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic/Abstract" + " instance "+ nodesInCycle +"in Millis: " + timeElapsed);
				
		return completePattern;
	}
	
	private static CompletePattern buildPatternCycleComp(int nodesInCycle)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		//Generic + Abstract
		Instant start = Instant.now();
		
		CompletePattern completePattern = CypherTranslation.getBasePattern();
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
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toNanos();
		System.out.println("Speed time of Generic/Abstract" + " instance "+ nodesInCycle +"in Nanos: " + timeElapsed);
		timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Speed time of Generic/Abstract" + " instance "+ nodesInCycle +"in Millis: " + timeElapsed);
		return completePattern;
	}

	@Override
	public void buildToComplexQueryPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildUnsupportedException(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildOtherException(ArrayList<CompletePattern> completePatternsExceptions) throws InvalidityException {
		// TODO Auto-generated method stub
		
	}
}
