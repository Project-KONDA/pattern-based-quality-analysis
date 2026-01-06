package qualitypatternmodel.newservlets.patterns.comp;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class CompSetAnyPattern extends PatternClass {

	public CompSetAnyPattern() {
		super(PatternConstants.COMPSETANY_ID,
				PatternConstants.COMPSETANY_NAME, 
				PatternConstants.COMPSETANY_DESCR, 
				true, true, true, true);
	}
	
	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		Graph graph1 = pattern.getGraph();
		Node returnNode = graph1.getReturnNodes().get(0).makeComplex();
		NotCondition notCondition = PatternstructureFactory.eINSTANCE.createNotCondition();
		pattern.setCondition(notCondition);
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		notCondition.setCondition(quantifiedCondition);
		Graph graph2 = quantifiedCondition.getGraph();

		Node element1 = returnNode.addOutgoing(graph2).getTarget().makePrimitive();

		TextListParamImpl tlp = new TextListParamImpl();
		element1.addPrimitiveComparison(tlp);
		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____
}
