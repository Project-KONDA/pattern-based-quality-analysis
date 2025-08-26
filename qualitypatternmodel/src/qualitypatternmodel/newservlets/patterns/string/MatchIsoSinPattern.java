package qualitypatternmodel.newservlets.patterns.string;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class MatchIsoSinPattern extends PatternClass {
	

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern p = new MatchIsoSinPattern().getPattern();
		System.out.println(p.myToString());
		p.isValid(AbstractionLevel.GENERIC);
	}

	public MatchIsoSinPattern() {
		super(PatternConstants.MATCHISOSIN_ID,
				PatternConstants.MATCHISOSIN_NAME, 
				PatternConstants.MATCHISOSIN_DESCR, 
				true, true, false, false);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		pattern.getGraph().getReturnNodes().get(0).makeComplex();

		PrimitiveNode element1 = pattern.getGraph().getReturnNodes().get(0).makePrimitive();

		Match match = element1.addPrimitiveMatch().getMatches().get(0);

		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(quantifiedCondition);

		match.setOperatorList(quantifiedCondition.getGraph().getOperatorList());
		return pattern;
	}
}
