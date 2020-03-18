package qualitypatternmodel.translationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.testutilityclasses.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.inputfields.AxisOption;
import qualitypatternmodel.inputfields.InputfieldsFactory;
import qualitypatternmodel.inputfields.InputfieldsPackage;
import qualitypatternmodel.exceptions.*;

public class Test01Axis {

	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		PatternstructurePackage.eINSTANCE.eClass();
//		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
//		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;

		ArrayList<Pattern> patterns = new ArrayList<Pattern>();
		patterns.add(Test00.getBasePattern()); // child
		
		for (Axis ax : Axis.VALUES) {
			patterns.add(getBasePatternAxis(ax));
		}
		
		Test00.test(patterns);
	}

	public static Pattern getBasePatternAxis(Axis axis) {
		InputfieldsPackage.eINSTANCE.eClass();
		InputfieldsFactory inputfieldsFactory = InputfieldsFactory.eINSTANCE;
		
		Pattern pattern = Test00.getBasePattern();
		AxisOption axisOption = inputfieldsFactory.createAxisOption();		
		pattern.getGraph().getRootElement().getNextSingle().get(0).getRelationFromPrevious().setOption(axisOption);
		axisOption.getOptions().add(axis);
		axisOption.setValue(axis);
		return pattern;
	}

	public static List<PatternTestPair> getTestPairs() {
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();

		for (Axis ax : Axis.VALUES) {
			if(ax != Axis.DESCENDANT && ax != Axis.ANCESTOR)
				testPairs.add(new PatternTestPair(ax.getName(), getBasePatternAxis(ax), "/"+ax.getLiteral()+"::*"));
		}		
//		testPairs.add(new PatternTestPair("CHILD", 				getBasePatternAxis(Axis.CHILD), 				"/child::*"));
////		testPairs.add(new PatternTestPair("PARENT", 			getBasePatternAxis(Axis.PARENT), 				"/parent::*"));
//		testPairs.add(new PatternTestPair("SELF", 				getBasePatternAxis(Axis.SELF), 				"/self::*"));
////		testPairs.add(new PatternTestPair("ANCESTOR", 			getBasePatternAxis(Axis.ANCESTOR), 			"/ancestor::*"));
//		testPairs.add(new PatternTestPair("ANCESTOR_OR_SELF", 	getBasePatternAxis(Axis.ANCESTOR_OR_SELF), 	"/ancestor-or-self::*"));
//		testPairs.add(new PatternTestPair("DESCENDANT", 		getBasePatternAxis(Axis.DESCENDANT), 			"/descendant::*"));
//		testPairs.add(new PatternTestPair("DESCENDANT_OR_SELF", getBasePatternAxis(Axis.DESCENDANT_OR_SELF), 	"/descendant-or-self::*"));
//		testPairs.add(new PatternTestPair("FOLLOWING", 			getBasePatternAxis(Axis.FOLLOWING), 			"/following::*"));
//		testPairs.add(new PatternTestPair("FOLLOWING_SIBLING", 	getBasePatternAxis(Axis.FOLLOWING_SIBLING), 	"/following-sibling::*"));
//		testPairs.add(new PatternTestPair("PRECEDING", 			getBasePatternAxis(Axis.PRECEDING), 			"/preceding::*"));
//		testPairs.add(new PatternTestPair("PRECEDING_SIBLING", 	getBasePatternAxis(Axis.PRECEDING_SIBLING), 	"/preceding-sibling::*"));
		return testPairs;
	}

}
