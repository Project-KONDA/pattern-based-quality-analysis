import java.util.ArrayList;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.exceptions.*;

public class test04_quantorcombinations {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<Pattern> patterns = new ArrayList<Pattern>();
//		patterns.add(getPatternExistsInExists());
		patterns.add(getPatternForallInExists());
//		patterns.add(getPatternExistsInForall());
		patterns.add(getPatternForallInForall());

		test00.test(patterns);
	}

	public static Pattern getPatternExistsInExists() {
		
		// PatternStructure
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		Pattern pattern = test03_quantor.getPatternExists();
		QuantifiedCondition qcond = (QuantifiedCondition) pattern.getCondition();
		QuantifiedCondition qcond2 =  factory.createQuantifiedCondition();
		qcond.setCondition(qcond2);
		True t = factory.createTrue();
		qcond2.setCondition(t);
		
		
		// EXISTS 2 additional graph structure
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		SingleElement se3 = graphFactory.createSingleElement();
		qcond2.getGraph().getRootElement().getNextSingle().get(0).getNextSingle().get(0).getNextSingle().add(se3);
		
		return pattern;
	}
	
	public static Pattern getPatternForallInExists() {
		Pattern pattern = getPatternExistsInExists();
		((QuantifiedCondition)((QuantifiedCondition) pattern.getCondition()).getCondition()).setQuantifier(Quantifier.FORALL);
		return pattern;		
	}

	public static Pattern getPatternExistsInForall() {
		Pattern pattern = getPatternExistsInExists();
		((QuantifiedCondition) pattern.getCondition()).setQuantifier(Quantifier.FORALL);
		return pattern;
	}
	public static Pattern getPatternForallInForall() {
		Pattern pattern = getPatternForallInExists();
		((QuantifiedCondition) pattern.getCondition()).setQuantifier(Quantifier.FORALL);
		return pattern;
	}
	
}
