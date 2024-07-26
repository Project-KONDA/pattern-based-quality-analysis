package qualitypatternmodel.xmltranslationtests;
import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;
import qualitypatternmodel.utility.PatternUtility;
import qualitypatternmodel.xmltestutility.PatternTestPair;

public class Test05QuantorCombinationsCond {

	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternExistsInExistsCond());
		completePatterns.add(getPatternForallInExistsCond());
		completePatterns.add(getPatternExistsInForallCond());
		completePatterns.add(getPatternForallInForallCond());
		return completePatterns;
	}

    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternUtility.testPatterns(getPatterns());
	}

	public static CompletePattern getPatternExistsInExistsCond() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// PatternStructure
		CompletePattern completePattern = Test04QuantorCombinations.getPatternExistsInExistsFinal();
		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
		Node e1 = graph1.getNodes().get(0).makeComplex();
		e1.addOutgoing().getTarget().adaptAsXmlProperty().addPrimitiveComparison("1492");
		return completePattern;
	}

	public static CompletePattern getPatternForallInExistsCond() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternExistsInExistsCond();
		((QuantifiedCondition)((QuantifiedCondition) completePattern.getCondition()).getCondition()).setQuantifier(Quantifier.FORALL);
		return completePattern;
	}

	public static CompletePattern getPatternExistsInForallCond() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternExistsInExistsCond();
		((QuantifiedCondition) completePattern.getCondition()).setQuantifier(Quantifier.FORALL);
		return completePattern;
	}
	public static CompletePattern getPatternForallInForallCond() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternForallInExistsCond();
		((QuantifiedCondition) completePattern.getCondition()).setQuantifier(Quantifier.FORALL);
		return completePattern;
	}
	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();

		String query1 = "declare namespace demo = \"demo\"; /demo:data/demo:painting[./demo:startwork[./text()=\"1492\"]][./demo:creator[./text() = /demo:data/demo:artist/@demo:id]]";
		String query2 = "declare namespace demo = \"demo\"; /demo:data/demo:painting[./demo:startwork[./text()=\"1492\"]]";
		String query3 = "declare namespace demo = \"demo\"; /demo:data/demo:painting";

		testPairs.add(new PatternTestPair("05", "ExistsInExists", 	getPatternExistsInExistsCond(), query1));
		testPairs.add(new PatternTestPair("05", "ForallInExists", 	getPatternForallInExistsCond(), query2));
		testPairs.add(new PatternTestPair("05", "ExistsInForall", 	getPatternExistsInForallCond(), query3));
		testPairs.add(new PatternTestPair("05", "ForallInForall", 	getPatternForallInForallCond(), query3));

		return testPairs;
	}

}
