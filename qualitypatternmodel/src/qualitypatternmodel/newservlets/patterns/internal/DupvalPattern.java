package qualitypatternmodel.newservlets.patterns.internal;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.newservlets.ServletConstants;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.impl.NumberElementImpl;

public class DupvalPattern extends PatternClass {

	public DupvalPattern() {
		super(PatternConstants.DUPVAL_ID,
				PatternConstants.DUPVAL_NAME, 
				PatternConstants.DUPVAL_DESCR, 
				false, false, false, false);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		ComplexNode main = pattern.getGraph().getReturnNodes().get(0).makeComplex();
		main.setName("main");

		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(qc);

		PrimitiveNode field = main.addOutgoing(qc.getGraph()).getTarget().makePrimitive();
		field.setName("field");

		CountCondition countCondition = PatternstructureFactory.eINSTANCE.createCountCondition();
		qc.setCondition(countCondition);
		countCondition.createCountPattern();
		NumberElementImpl ne = new NumberElementImpl();
		countCondition.setArgument2(ne);
		ne.createParameters();

		if (ServletConstants.FILL_VALUES) {
			ne.getNumberParam().setValue(1.);
			countCondition.getOption().setValue(ComparisonOperator.GREATER);
		}

		Relation rel = main.addOutgoing(countCondition.getCountPattern().getGraph());
		PrimitiveNode field2 = rel.getTarget().makePrimitive();
		field2.setName("field2");
		field2.setReturnNode(true);
		Comparison c = field2.addComparison(field);
		ComparisonOptionParam comparisonOption = c.getOption();
		comparisonOption.setValue(ComparisonOperator.EQUAL);
		comparisonOption.setPredefined(true);

		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
