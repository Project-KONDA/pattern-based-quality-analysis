package qualitypatternmodel.newservlets.patterns.comp;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
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
				true, true, true, false);
	}
	
	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		Graph graph1 = pattern.getGraph();
		Node container = graph1.getReturnNodes().get(0).makeComplex();
		Node returnnode = container.addOutgoing().getTarget().makePrimitive();
		container.setReturnNode(false);
		returnnode.setReturnNode(true);

		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(quantifiedCondition);

		TextListParamImpl tlp = new TextListParamImpl();
		Comparison c = new ComparisonImpl();
		c.setOperatorList(quantifiedCondition.getGraph().getOperatorList());
		c.setArgument1(returnnode);
		c.setArgument2(tlp);
		tlp.setParameterList(pattern.getParameterList());

		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
