package qualitypatternmodel.xmltranslationtests;
import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;
import qualitypatternmodel.utility.PatternUtility;
import qualitypatternmodel.xmltestutility.PatternTestPair;

public class Test04QuantorCombinations {

	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternExistsInExistsFinal());
		completePatterns.add(getPatternForallInExists());
		completePatterns.add(getPatternExistsInForall());
		completePatterns.add(getPatternForallInForall());
		return completePatterns;
	}

    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternUtility.testPatterns(getPatterns());
	}

	public static CompletePattern getPatternExistsInExists() throws InvalidityException {

		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		CompletePattern completePattern = factory.createCompletePattern();
		QuantifiedCondition qcond = factory.createQuantifiedCondition();
		QuantifiedCondition qcond2 =  factory.createQuantifiedCondition();
		completePattern.setCondition(qcond);
		qcond.setCondition(qcond2);

		Graph g1 = completePattern.getGraph();
		Graph g2 = qcond.getGraph();
		Graph g3 = qcond2.getGraph();

		Node g1a = g1.getNodes().get(0).makeComplex();
		
		g1a.addOutgoing(g2).getTarget();
		Node g2b = g1a.addOutgoing().getTarget().makePrimitive();
		Node g3a = g3.addComplexNode();
		Node g3b = g3a.addOutgoing().getTarget().makePrimitive();
		g3b.addComparison(g2b);

		return completePattern;
	}

	public static CompletePattern getPatternExistsInExistsFinal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternExistsInExists();
		completePattern.createXmlAdaption();

		List<Parameter> params = completePattern.getParameterList().getParameters();
		params.get(0).setValueFromString("EQUAL"); // ComparisonOptionParam
		params.get(1).setValueFromString("STRING"); // TypeOptionParam
		params.get(2).setValueFromString("/demo:creator/text()"); // Property
		params.get(3).setValueFromString("/demo:data/demo:painting");
		params.get(4).setValueFromString("/demo:startwork");
		params.get(5).setValueFromString("/@demo:id");
		params.get(6).setValueFromString("/demo:data/demo:artist");

		return completePattern;
	}

	public static CompletePattern getPatternForallInExists() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternExistsInExistsFinal();
		((QuantifiedCondition)((QuantifiedCondition) completePattern.getCondition()).getCondition()).setQuantifier(Quantifier.FORALL);
		return completePattern;
	}

	public static CompletePattern getPatternExistsInForall() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternExistsInExistsFinal();
		((QuantifiedCondition) completePattern.getCondition()).setQuantifier(Quantifier.FORALL);
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) ((QuantifiedCondition) completePattern.getCondition()).getCondition();
		Node n1 = quantifiedCondition.getGraph().getNodes().get(1);
		n1.addPrimitiveComparison("demo:artist");

		return completePattern;
	}
	public static CompletePattern getPatternForallInForall() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternForallInExists();
		((QuantifiedCondition) completePattern.getCondition()).setQuantifier(Quantifier.FORALL);
		return completePattern;
	}
	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();

		String query1 = "declare namespace demo = \"demo\"; /demo:data/demo:painting[./demo:startwork][./demo:creator[./text() = /demo:data/demo:artist/@demo:id]]";
		String query3 = "declare namespace demo = \"demo\"; /demo:data/demo:painting";
		String query2 = "declare namespace demo = \"demo\"; /demo:data/demo:painting[not(./demo:startwork)]";

		testPairs.add(new PatternTestPair("04", "ExistsInExists", getPatternExistsInExistsFinal(), query1));
		testPairs.add(new PatternTestPair("04", "ForallInExists", getPatternForallInExists(), query1));
		testPairs.add(new PatternTestPair("04", "ExistsInForall", getPatternExistsInForall(), query2));
		testPairs.add(new PatternTestPair("04", "ForallInForall", getPatternForallInForall(), query3));
		return testPairs;
	}

}
