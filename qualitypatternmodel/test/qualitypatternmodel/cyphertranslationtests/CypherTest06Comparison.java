package qualitypatternmodel.cyphertranslationtests;

import java.util.ArrayList;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JFactory;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
import qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JFactoryImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

public class CypherTest06Comparison {
    public static final AdaptionNeo4JFactory FACTORY = new AdaptionNeo4JFactoryImpl();
    
    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
            //Tests
            System.out.println("");
            System.out.println("<<< BEGIN - Tests >>>");
            ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
            completePatterns.add(getComparisonTwoNeoNodes());
            //Call tester from CypherTest00
            CypherTest00.test(completePatterns);
            System.out.println("<<< END - Tests >>>");
            System.out.println("");         
            
            //INTRODUCE THE EXCEPTION TESTS ???
    }
	
	public static CompletePattern getBasePattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.setName("MyPattern");
		
		ComplexNode complexNode1 = completePattern.getGraph().getNodes().get(0).makeComplex();
		PrimitiveNode primitiveNode1 = completePattern.getGraph().addPrimitiveNode();
		completePattern.getGraph().addRelation(complexNode1, primitiveNode1);
		
		ComplexNode complexNode2 = completePattern.getGraph().addComplexNode();
		PrimitiveNode primitiveNode2 = completePattern.getGraph().addPrimitiveNode();
		completePattern.getGraph().addRelation(complexNode2, primitiveNode2);
	
		return completePattern;	
	}
    
    
	private static CompletePattern getComparisonTwoNeoNodes() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		ComplexNode complexNode1 = (ComplexNode) completePattern.getGraph().getNodes().get(0);
		ComplexNode complexNode2 = (ComplexNode) completePattern.getGraph().getNodes().get(2);
		
		complexNode1.addComparison(complexNode2);
		//complexNode2.addComparison(complexNode1);
		
		completePattern.createNeo4jAdaption();
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.setNodePlace(NeoPlace.BEGINNING);
		
		neoNode = (NeoNode) completePattern.getGraph().getNodes().get(2);
		neoNode.setNodePlace(NeoPlace.BEGINNING);
		
		return completePattern;
	}
	
	private static CompletePattern getComparisonTwoNeoPropertyNodes() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		return null;
	}
	
	private static CompletePattern getComparisonNeoNodeAndNeoPropertyNodes() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		return null;
	}
	
	//Exceptions 
	private static CompletePattern getComparisonNeoNodeAndNonSpecifiedNeoPropertyNodes() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		return null;
	}
	
	private static CompletePattern getComparisonTwoNonSpecifiedNeoPropertyNodes() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		return null;
	}

	//Alle bisher implementierten boolischen Operatoren müssen getestet werden
	//Verschiedene aneinanderreihungen müssen getestet werden
	//WENN IMPLEMENTIERT: im Match ausgedrückte Comparisons müssen gecheckt werden
	//Equivalente ausdrücke müssen nicht getestet werden
}



//MATCH (r:Regesta), (r2:Regesta)
//WHERE r = r2
//RETURN r LIMIT 1