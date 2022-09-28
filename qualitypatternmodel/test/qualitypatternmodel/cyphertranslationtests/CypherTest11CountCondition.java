package qualitypatternmodel.cyphertranslationtests;

import java.util.ArrayList;

import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.impl.CountConditionImpl;

public class CypherTest11CountCondition {
	
	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCountInPatternPattern());
		return completePatterns;
	}
	
	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CypherTest00.test(getPatterns());
	}
	
	private static CompletePattern getCountInPatternPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		
		ComplexNode complexNode1 = completePattern.getGraph().addComplexNode();
		complexNode1.setReturnNode(false);
		completePattern.getGraph().addRelation((ComplexNode) completePattern.getGraph().getNodes().get(0), (Node) complexNode1);
		
		CountCondition countCond = PatternstructureFactory.eINSTANCE.createCountCondition();
		countCond.setPattern(completePattern);
		
		NumberElement numberElement = PatternstructureFactory.eINSTANCE.createNumberElement();
		countCond.setArgument2(numberElement);
		numberElement.getNumberParam().setValue(1.);
		
		completePattern.createNeo4jAdaption();
		
		Graph g = countCond.getCountPattern().getGraph();
		NeoNode neoNode = (NeoNode) g.getNodes().get(1);
		neoNode.setNodePlace(NeoPlace.BEGINNING);
		
		return completePattern;
	}
	
	
	private static CompletePattern getBasePattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.getGraph().getNodes().get(0).makeComplex();
		completePattern.setName("MyPattern");
	
		return completePattern;	
	}
}
