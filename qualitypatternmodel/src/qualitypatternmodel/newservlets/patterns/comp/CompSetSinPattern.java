package qualitypatternmodel.newservlets.patterns.comp;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.impl.ComparisonImpl;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class CompSetSinPattern extends PatternClass {

	public CompSetSinPattern() {
		super(PatternConstants.COMPSETSIN_ID,
				PatternConstants.COMPSETSIN_NAME, 
				PatternConstants.COMPSETSIN_DESCR, 
				true, true, false, false);
	}
	
	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		Graph graph1 = pattern.getGraph();
		PrimitiveNode returnNode = graph1.getReturnNodes().get(0).makePrimitive();

		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(quantifiedCondition);

		TextListParamImpl tlp = new TextListParamImpl();
		Comparison c = new ComparisonImpl();
		c.setOperatorList(quantifiedCondition.getGraph().getOperatorList());
		c.setArgument1(returnNode);
		c.setArgument2(tlp);
		tlp.setParameterList(pattern.getParameterList());

		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
