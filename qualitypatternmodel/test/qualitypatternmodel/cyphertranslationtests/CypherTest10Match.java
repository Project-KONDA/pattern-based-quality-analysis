package qualitypatternmodel.cyphertranslationtests;

import java.util.ArrayList;

import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyNode;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

public class CypherTest10Match {
//	https://neo4j.com/docs/cypher-manual/current/clauses/where/ --> Consider the diffrent regex expressions from here
	
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
        //Tests
        System.out.println("");
        System.out.println("<<< BEGIN - Tests >>>");
        ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternMatch(true, "Churfürsten"));
		completePatterns.add(getPatternMatch(false, "Churfürsten"));
        completePatterns.add(getPatternMatch(true, ".*Churfürsten.*"));
		completePatterns.add(getPatternMatch(false, ".*Churfürsten.*"));
//		completePatterns.add(getPatternMatch(true, "^unk"));
//		completePatterns.add(getPatternMatch(true, "own$"));
//		completePatterns.add(getPatternMatch(true, "^unknown$"));
//		completePatterns.add(getPatternMatch(false, "^unknown$"));
        //Call tester from CypherTest00
        CypherTest00.test(completePatterns);
        System.out.println("<<< END - Tests >>>");
        System.out.println("");         
        
        //INTRODUCE THE EXCEPTION TESTS ??? 
    }
    
	public static CompletePattern getPatternMatch(Boolean invert, String str) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern pattern = factory.createCompletePattern();
		pattern.getGraph().getNodes().get(0).addOutgoing().getTarget().addPrimitiveMatch(str);
		Match match = ((Match) pattern.getGraph().getOperatorList().getOperators().get(0));
		match.getOption().setValue(invert);
		
		makeConcrete(pattern);
		
		return pattern;
	}

	private static void makeConcrete(CompletePattern pattern)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		pattern.createNeo4jAdaption();
		NeoNode neoNode = (NeoNode) pattern.getGraph().getNodes().get(0);
		neoNode.setNodePlace(NeoPlace.BEGINNING);
		neoNode.addStringLabel("Regesta");
		
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) pattern.getGraph().getNodes().get(1);
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) pattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("summary");

	}
	
	
	//Exceptions 
	// --> "Match - invalid option"
	// --> If a ComplexNode NeoNode has a match
}
