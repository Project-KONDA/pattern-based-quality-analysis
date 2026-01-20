package qualitypatternmodel.newservlets.patterns.mand;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.StringLength;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class Mand2PropOrPattern extends PatternClass {

	public Mand2PropOrPattern() {
		super(PatternConstants.MAND2PROPOR_ID,
				PatternConstants.MAND2PROPOR_NAME, 
				PatternConstants.MAND2PROPOR_DESCR, 
				true, true, true, true);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		CompletePattern pattern = factory.createCompletePattern();
		ComplexNode main = pattern.getGraph().getReturnNodes().get(0).makeComplex();
		main.setName("element");

		
		Formula form1 = factory.createFormula();
		pattern.setCondition(form1);

		NotCondition not1 = factory.createNotCondition();
		form1.setCondition1(not1);
		QuantifiedCondition qc1 = factory.createQuantifiedCondition();
		not1.setCondition(qc1);
		NotCondition not2 = factory.createNotCondition();
		form1.setCondition2(not2);
		QuantifiedCondition qc2 = factory.createQuantifiedCondition();
		not2.setCondition(qc2);

		PrimitiveNode n1 = main.addOutgoing(qc1.getGraph()).getTarget().makePrimitive();
		PrimitiveNode n2 = main.addOutgoing(qc2.getGraph()).getTarget().makePrimitive();

		StringLength sl1 = n1.addPrimitiveStringLength();
		StringLength sl2 = n2.addPrimitiveStringLength();
		
		sl1.getOption().setPredefined(true);
		sl1.getOption().setValue(ComparisonOperator.GREATER);
		sl1.getNumber().setValue(0.);
		sl1.getNumber().setPredefined(true);

		sl2.getOption().setPredefined(true);
		sl2.getOption().setValue(ComparisonOperator.GREATER);
		sl2.getNumber().setPredefined(true);
		sl2.getNumber().setValue(0.);

		n1.setName("property1");
		n2.setName("property2");

		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
