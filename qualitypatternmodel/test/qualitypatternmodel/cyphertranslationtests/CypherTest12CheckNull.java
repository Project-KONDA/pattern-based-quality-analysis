package qualitypatternmodel.cyphertranslationtests;

import java.util.ArrayList;

import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.operators.NullCheck;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

public class CypherTest12CheckNull {
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
        
//        //INTRODUCE THE EXCEPTION TESTS
//        
//		System.out.println("");
//		System.out.println("<<< BEGIN - Exception Tests >>>");
//		ArrayList<CompletePattern> completePatternsExceptions = new ArrayList<CompletePattern>();
//		buildExceptionPatterns(completePatternsExceptions);
//		//Call Exception Handler
//		CypherTest10Match.exceptionHandler(completePatternsExceptions);
//		System.out.println("<<< END - Exception Tests >>>");
//		System.out.println("");
    }

	public static void buildExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
	}

	public static void buildPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatterns.add(tryIsNull(true, "isoStartDate"));
	}

	public static CompletePattern tryIsNull(Boolean isNull, String str) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern pattern = factory.createCompletePattern();
		if (isNull) {
			pattern.getGraph().getNodes().get(0).addOutgoing().getTarget().addPrimitiveNullCheck();
		} else {
			pattern.getGraph().getNodes().get(0).addOutgoing().getTarget().addPrimitiveNullCheck(isNull);
		}
		
		NullCheck nullCheck = ((NullCheck) pattern.getGraph().getOperatorList().getOperators().get(0));		
		makeConcrete(pattern);
		
		return pattern;
	}
	
	private static void makeConcrete(CompletePattern pattern)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		pattern.createNeo4jAdaption();
		NeoNode neoNode = (NeoNode) pattern.getGraph().getNodes().get(0);
		neoNode.setNodePlace(NeoPlace.BEGINNING);
		neoNode.addStringLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) pattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("summary");
	}
	
	//Exceptions
}
