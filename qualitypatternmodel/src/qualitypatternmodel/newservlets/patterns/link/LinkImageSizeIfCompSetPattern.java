package qualitypatternmodel.newservlets.patterns.link;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class LinkImageSizeIfCompSetPattern extends PatternClass {

	public LinkImageSizeIfCompSetPattern() {
		super(PatternConstants.LINKIMAGESIZEIFCOMPSET_ID,
				PatternConstants.LINKIMAGESIZEIFCOMPSET_NAME, 
				PatternConstants.LINKIMAGESIZEIFCOMPSET_DESCR, 
				true, true, false, false);
	}

	public CompletePattern getPatternFormula() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		ComplexNode main = pattern.getGraph().getReturnNodes().get(0).makeComplex();
		Formula form = PatternstructureFactory.eINSTANCE.createFormula();
		pattern.setCondition(form);
		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		form.setCondition1(qc);
		form.setOperator(LogicalOperator.AND);

		PrimitiveNode field1 = main.addOutgoing(qc.getGraph()).getTarget().makePrimitive();
		TextListParamImpl tlp = new TextListParamImpl();
		field1.addPrimitiveComparison(tlp);
		
		NotCondition not = PatternstructureFactory.eINSTANCE.createNotCondition();
		form.setCondition2(not);
		QuantifiedCondition qc2 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		not.setCondition(qc2);

		PrimitiveNode field2 = main.addOutgoing(qc2.getGraph()).getTarget().makePrimitive();
		field2.addPrimitiveLinkImageSize();
		
		return pattern;
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		ComplexNode main = pattern.getGraph().getReturnNodes().get(0).makeComplex();

		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(qc);
		
		PrimitiveNode field1 = main.addOutgoing(qc.getGraph()).getTarget().makePrimitive();
		TextListParamImpl tlp = new TextListParamImpl();
		field1.addPrimitiveComparison(tlp);
		
		PrimitiveNode field2 = main.addOutgoing(qc.getGraph()).getTarget().makePrimitive();
		field2.addPrimitiveLinkImageSize();
		
		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
