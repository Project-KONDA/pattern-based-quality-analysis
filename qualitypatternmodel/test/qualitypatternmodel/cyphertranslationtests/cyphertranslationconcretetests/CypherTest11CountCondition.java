package qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import qualitypatternmodel.adaptionNeo4J.NeoInterfaceNode;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
import qualitypatternmodel.cyphertranslationtests.CypherTranslationAbstract;
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
import qualitypatternmodel.patternstructure.impl.CountPatternImpl;

public class CypherTest11CountCondition extends CypherTranslationAbstract {
		
	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CypherTest11CountCondition count = new CypherTest11CountCondition();
		count.generalizedTests();         
		count.generalizedInvalidtyExceptionTests();
	}
	
	public void buildPatterns(ArrayList<CompletePattern> completePatterns) throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		completePatterns.add(getCountInPatternPattern());
	}
	
	@Override
	public void buildInvalidityExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// TODO Auto-generated method stub
	}
	
	private CompletePattern getCountInPatternPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		
		CountCondition countCond = PatternstructureFactory.eINSTANCE.createCountCondition();
		countCond.setPattern(completePattern);
		
		ComplexNode complexNode1 = countCond.getCountPattern().getGraph().addComplexNode();
		complexNode1.setReturnNode(false);
		countCond.getCountPattern().getGraph().addRelation((ComplexNode) countCond.getCountPattern().getGraph().getNodes().get(0), (Node) complexNode1);
		
		NumberElement numberElement = PatternstructureFactory.eINSTANCE.createNumberElement();
		countCond.setArgument2(numberElement);
		numberElement.getNumberParam().setValue(1.);
		
		completePattern.createNeo4jAdaption();
		
		CountPatternImpl countPatternImpl = (CountPatternImpl) countCond.getCountPattern();
		Set<NeoInterfaceNode> countElements = new HashSet<NeoInterfaceNode>();
		countElements.add((NeoInterfaceNode) countPatternImpl.getGraph().getNodes().get(1));
		countPatternImpl.setCountElementNodes(countElements);
		
		Graph g = countCond.getCountPattern().getGraph();
		NeoNode neoNode = (NeoNode) g.getNodes().get(0);
		neoNode.setNodePlace(NeoPlace.BEGINNING);
		
		return completePattern;
	}
	
	
	private CompletePattern getBasePattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.getGraph().getNodes().get(0).makeComplex();
		completePattern.setName("MyPattern");
	
		return completePattern;	
	}
}
