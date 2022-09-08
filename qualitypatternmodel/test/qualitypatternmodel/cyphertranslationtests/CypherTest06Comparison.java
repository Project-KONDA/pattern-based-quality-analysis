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
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl;
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
            completePatterns.add(getComparisonTwoNeoNodes(ComparisonOperator.EQUAL));
            completePatterns.add(getComparisonTwoNeoNodes(ComparisonOperator.NOTEQUAL));
//            for (ComparisonOperator c : ComparisonOperator.values()) { // --> Could be done later one when all operators are implemented
//            	if (!(c == ComparisonOperator.ISNULL || c == ComparisonOperator.ISNOTNULL)) {
//            		completePatterns.add(getComparisonTwoNeoNodes(c));
//            	}
//            }
            //completePatterns.add(getComparisonTwoNeoNodes(null)); --> Why is doing this bullshit ???
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
    
    
	private static CompletePattern getComparisonTwoNeoNodes(ComparisonOperator comparisonOption) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		ComplexNode complexNode1 = (ComplexNode) completePattern.getGraph().getNodes().get(0);
		ComplexNode complexNode2 = (ComplexNode) completePattern.getGraph().getNodes().get(2);
		Comparison comp;
		ComparisonOptionParam comparisonOptionParam;
		
		complexNode1.addComparison(complexNode2);
		comp = complexNode1.getComparison1().get(0);
		comparisonOptionParam = new ComparisonOptionParamImpl();
		comparisonOptionParam.setValue(comparisonOption);
		comp.setOption(comparisonOptionParam);
		complexNode2.addComparison(complexNode1);
		comp = complexNode2.getComparison1().get(0);
		comparisonOptionParam = new ComparisonOptionParamImpl();
		comparisonOptionParam.setValue(comparisonOption);
		comp.setOption(comparisonOptionParam);
		
		completePattern.createNeo4jAdaption();
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.setNodePlace(NeoPlace.BEGINNING);
		
		neoNode = (NeoNode) completePattern.getGraph().getNodes().get(2);
		neoNode.setNodePlace(NeoPlace.BEGINNING);
		
		return completePattern;
	}
	
	//Sollte eine Exception werfen... Nochmals in Cypher testen
	private static CompletePattern getComparisonNeoNodeAndNeoPropertyNodes(ComparisonOptionParam comparisonOptionParam) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		return null;
	}
	
	private static CompletePattern getComparisonTwoNeoProperties(ComparisonOperator comparisonOption) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		PrimitiveNode primitiveNode1 = (PrimitiveNode) completePattern.getGraph().getNodes().get(1);
		ComplexNode primitiveNode2 = (ComplexNode) completePattern.getGraph().getNodes().get(3);
		Comparison comp;
		ComparisonOptionParam comparisonOptionParam;
		
		primitiveNode1.addComparison(primitiveNode2);
		
		
		primitiveNode2.addComparison(primitiveNode1);
				
		completePattern.createNeo4jAdaption();
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.setNodePlace(NeoPlace.BEGINNING);
		
		neoNode = (NeoNode) completePattern.getGraph().getNodes().get(2);
		neoNode.setNodePlace(NeoPlace.BEGINNING);
		
		return completePattern;
	}
	
	//Include also multiple comparions
	
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
	
	//Exceptions
	//Should throw an exception
	private static CompletePattern getComparisonTwoNeoPropertyNodesWithVariableName(ComparisonOptionParam comparisonOptionParam) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		return null;
	}
	
	//If a NeoNode compares to a NeoProperty without path 
	//NeoPropertyWith
	
//	To Build something like this should throw an exception
//	MATCH (r:Regesta), (r2:Regesta)
//	WHERE r = r2.identifier
//	RETURN r
}



//MATCH (r:Regesta), (r2:Regesta)
//WHERE r = r2
//RETURN r LIMIT 1