package qualitypatternmodel.rdftranslationtests;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.xmltranslationtests.Test00;

public class RdfTest07ComplexComparisons {
	
	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPrimitiveNodesPattern());
		completePatterns.add(getComplexNodesPattern());
		
		RdfTest00.test(completePatterns);
	}

	private static CompletePattern getPrimitiveNodesPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = RdfTest00.getBasePattern();
		
		ComplexNode complexNode1 = completePattern.getGraph().getNodes().get(0).makeComplex();
		PrimitiveNode primitiveNode = completePattern.getGraph().getNodes().get(1).makePrimitive();
		Node node2 = completePattern.getGraph().addNode();
		PrimitiveNode primitiveNode2 = node2.makePrimitive();
		completePattern.getGraph().addRelation(complexNode1, primitiveNode2);
		
		primitiveNode.addComparison(primitiveNode2);
		
		completePattern.createRdfAdaption();
		return completePattern;
	}
	
	private static CompletePattern getComplexNodesPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = RdfTest00.getBasePattern();
		
		ComplexNode complexNode1 = completePattern.getGraph().getNodes().get(0).makeComplex();
		ComplexNode complexNode3 = completePattern.getGraph().getNodes().get(1).makeComplex();
		Node node2 = completePattern.getGraph().addNode();
		completePattern.getGraph().addRelation(complexNode1, node2);
		ComplexNode complexNode2 = node2.makeComplex();
		
		complexNode3.addComparison(complexNode2);
		
		completePattern.createRdfAdaption();
		return completePattern;
	}

	

}
