package qualitypatternmodel.newservlets.patterns.internal;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.impl.NumberElementImpl;

public class CardIfCompSetPattern extends PatternClass {

	public CardIfCompSetPattern() {
		super(PatternConstants.CARDIFCOMPSET_ID,
				PatternConstants.CARDIFCOMPSET_NAME, 
				PatternConstants.CARDIFCOMPSET_DESCR, 
				true, true, true, false);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		ComplexNode ret = pattern.getGraph().getReturnNodes().get(0).makeComplex();
		
		Formula formula = PatternstructureFactory.eINSTANCE.createFormula();
		formula.setOperator(LogicalOperator.AND);
		pattern.setCondition(formula);
		
		QuantifiedCondition exist = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		formula.setCondition1(exist);
		Graph existgraph = exist.getGraph();
		PrimitiveNode nodeA = ret.addOutgoing(existgraph).getTarget().makePrimitive();
		
		TextListParam list = new TextListParamImpl();
		nodeA.addComparison(list);
		
		NotCondition notCondition = PatternstructureFactory.eINSTANCE.createNotCondition();
		formula.setCondition2(notCondition);
		CountCondition count = PatternstructureFactory.eINSTANCE.createCountCondition();
		notCondition.setCondition(count);
		NumberElementImpl ne = new NumberElementImpl();
		count.setArgument2(ne);
		ne.createParameters();
		CountPattern countpattern = count.getCountPattern();
		Graph countGraph = countpattern.getGraph();
		ComplexNode nodeB = ret.addOutgoing(countGraph).getTarget().makeComplex();
		nodeB.setReturnNode(true);

		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
