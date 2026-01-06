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

		NotCondition not = factory.createNotCondition();
		pattern.setCondition(not);
		Formula form1 = factory.createFormula();
		not.setCondition(form1);
		
		QuantifiedCondition qc1 = factory.createQuantifiedCondition();
		form1.setCondition1(qc1);
		QuantifiedCondition qc2 = factory.createQuantifiedCondition();
		form1.setCondition2(qc2);

		ComplexNode n1 = main.addOutgoing(qc1.getGraph()).getTarget().makeComplex();
		ComplexNode n2 = main.addOutgoing(qc2.getGraph()).getTarget().makeComplex();

		n1.setName("field1");
		n2.setName("field2");

		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
