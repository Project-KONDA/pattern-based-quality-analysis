package qualitypatternmodel.newservlets.patterns.link;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.utility.PatternUtility;

public class LinkMatchListExistsPattern extends PatternClass {

	public LinkMatchListExistsPattern() {
		super(PatternConstants.LINKMATCHLISTEXISTS_ID,
				PatternConstants.LINKMATCHLISTEXISTS_NAME, 
				PatternConstants.LINKMATCHLISTEXISTS_DESCR, 
				true, true, false, false);
	}
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = new LinkMatchListExistsPattern().getXmlPattern();
		PatternUtility.fillParameter(pattern);
		pattern.printParameters(false);
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

		field.addPrimitiveValidateLink();
		field.addPrimitiveMatchList();

		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
