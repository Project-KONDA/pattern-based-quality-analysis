package qualitypatternmodel.newservlets.patterns;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.impl.ComparisonImpl;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class CompSetIsoPattern extends PatternClass {

	public CompSetIsoPattern() {
		super(PatternConstants.COMPSETISO_ID,
				PatternConstants.COMPSETISO_NAME, 
				PatternConstants.COMPSETISO_DESCR, 
				true, true, false, false);
	}
	
	@Override
	CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		Graph graph1 = pattern.getGraph();
		Node returnNode = graph1.getReturnNodes().get(0).makeComplex();
		Node element1 = returnNode.addOutgoing().getTarget().makePrimitive();

		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(quantifiedCondition);

		TextListParamImpl tlp = new TextListParamImpl();
		Comparison c = new ComparisonImpl();
		c.setOperatorList(quantifiedCondition.getGraph().getOperatorList());
		c.setArgument1(element1);
		c.setArgument2(tlp);
		tlp.setParameterList(pattern.getParameterList());

		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}
}
