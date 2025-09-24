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
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.impl.NumberElementImpl;

public class CardCompSetIfCompSetPattern extends PatternClass {
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException  {
		CompletePattern pattern = new CardCompSetIfCompSetPattern().getPattern(); 
		System.out.println(pattern.myToString());
		pattern.isValid(AbstractionLevel.GENERIC);
	}

	public CardCompSetIfCompSetPattern() {
		super(PatternConstants.CARDCOMPSETIFCOMPSET_ID,
				PatternConstants.CARDCOMPSETIFCOMPSET_NAME, 
				PatternConstants.CARDCOMPSETIFCOMPSET_DESCR, 
				true, true, false, false);
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
		
		CountCondition count = PatternstructureFactory.eINSTANCE.createCountCondition();
		formula.setCondition2(count);
		NumberElementImpl ne = new NumberElementImpl();
		count.setArgument2(ne);
		ne.createParameters();
		CountPattern countpattern = count.getCountPattern();
		Graph countGraph = countpattern.getGraph();
		PrimitiveNode nodeB = ret.addOutgoing(countGraph).getTarget().makePrimitive();
		nodeB.setReturnNode(true);
		TextListParam list2 = new TextListParamImpl();
		nodeB.addComparison(list2);

		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
