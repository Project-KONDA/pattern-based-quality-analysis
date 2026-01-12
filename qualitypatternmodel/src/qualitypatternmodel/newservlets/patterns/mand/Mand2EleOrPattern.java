package qualitypatternmodel.newservlets.patterns.mand;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class Mand2EleOrPattern extends PatternClass {

	public Mand2EleOrPattern() {
		super(PatternConstants.MAND2ELEOR_ID,
				PatternConstants.MAND2ELEOR_NAME, 
				PatternConstants.MAND2ELEOR_DESCR, 
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

		ComplexNode n1 = main.addOutgoing(qc1.getGraph()).getTarget().makeComplex();
		ComplexNode n2 = main.addOutgoing(qc2.getGraph()).getTarget().makeComplex();

		n1.setName("field1");
		n2.setName("field2");

		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
