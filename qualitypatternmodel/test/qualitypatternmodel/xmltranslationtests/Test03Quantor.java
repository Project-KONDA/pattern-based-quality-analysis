package qualitypatternmodel.xmltranslationtests;
import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;
import qualitypatternmodel.utility.PatternUtility;
import qualitypatternmodel.xmltestutility.PatternTestPair;

public class Test03Quantor {

	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternExistsWithRelationFinal());
		completePatterns.add(getPatternExistsFinal());
		completePatterns.add(getPatternExistsNavigation());
		completePatterns.add(getPatternExistsCondFinal());
		completePatterns.add(getPatternForall());
		completePatterns.add(getPatternForallCond());
		return completePatterns;
	}

    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternUtility.testPatterns(getPatterns());
	}

	public static CompletePattern getPatternExistsFinal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
//		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;

		// Pattern Structure
		CompletePattern completePattern = getPatternExists();

		completePattern.createXmlAdaption();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		params.get(0).setValueFromString("/*");
		params.get(1).setValueFromString("/*");
		return completePattern;
	}

	public static CompletePattern getPatternExistsNavigation() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
//		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;

		// Pattern Structure
		CompletePattern completePattern = getPatternExists();
		Graph graph1 = completePattern.getGraph();
		QuantifiedCondition cond = (QuantifiedCondition) completePattern.getCondition();
		Graph graph2 = cond.getGraph();

		Node e0g2 = graph1.getNodes().get(0);
		Node e1g2 = graph2.getNodes().get(0);
		e0g2.addOutgoing(e1g2);

		completePattern.createXmlAdaption();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		params.get(0).setValueFromString("/demo:data");
		params.get(1).setValueFromString("/demo:building/demo:source");
		params.get(2).setValueFromString("/demo:painting/demo:source");

		return completePattern;
	}

	public static CompletePattern getPatternExists() throws InvalidityException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;

		// Pattern Structure
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		QuantifiedCondition cond = factory.createQuantifiedCondition();
		completePattern.setCondition(cond);
		Graph g = cond.getGraph();

		Node ret = completePattern.getGraph().getNodes().get(0);

		// EXISTS additional graph structure
		Node n2 = ret.addOutgoing(g).getTarget();
		n2 = n2.makeComplex();

		return completePattern;
	}

	public static CompletePattern getPatternExistsWithRelation() throws InvalidityException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;

		// Pattern Structure
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		QuantifiedCondition cond = factory.createQuantifiedCondition();
		completePattern.setCondition(cond);
		Graph condGraph = cond.getGraph();

		// EXISTS additional graph structure
//		Node se1 = cond.getGraph().getReturnNodes().get(0);
//		Node se2 = se1.addOutgoing().getTarget();
		Node se1 = completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		se1.addOutgoing(condGraph);
		return completePattern;
	}

	public static CompletePattern getPatternExistsWithRelationFinal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternExistsWithRelation();
		completePattern.createXmlAdaption();
//		((QuantifiedCondition) completePattern.getCondition()).getGraph().getRelations().get(0).adaptAsXmlElementNavigation();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		params.get(0).setValueFromString("/*");
		params.get(1).setValueFromString("/*");
		return completePattern;
	}

	public static CompletePattern getPatternExistsCondFinal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternExistsCond();
		completePattern.createXmlAdaption();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		params.get(0).setValueFromString("New York City"); // TextLiteralParam
		params.get(1).setValueFromString("EQUAL"); // ComparisonOptionParam
		params.get(2).setValueFromString("STRING"); // TypeOptionParam
		params.get(3).setValueFromString("/*");
		params.get(4).setValueFromString("/*/*/*");
		params.get(5).setValueFromString("/text()");
		return completePattern;
	}

	public static CompletePattern getPatternExistsCond() throws InvalidityException {
		CompletePattern completePattern = getPatternExists();
		Graph graph2 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
		Node last = graph2.getNodes().get(0);
		last.addOutgoing().getTarget().addPrimitiveComparison("New York City");
		return completePattern;
	}

	public static CompletePattern getPatternForall() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternExists();
		QuantifiedCondition cond1 = (QuantifiedCondition) completePattern.getCondition();
		cond1.setQuantifier(Quantifier.FORALL);
		completePattern.createXmlAdaption();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		params.get(0).setValueFromString("/*");
		params.get(1).setValueFromString("/*");
		return completePattern;
	}

	public static CompletePattern getPatternForallCond() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternExistsCond();
		QuantifiedCondition cond1 = (QuantifiedCondition) completePattern.getCondition();
		cond1.setQuantifier(Quantifier.FORALL);
		completePattern.createXmlAdaption();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		params.get(0).setValueFromString("text");
		params.get(1).setValueFromString("EQUAL");
//		params.get(2).setValueFromString(null);
		params.get(3).setValueFromString("/*");
		params.get(4).setValueFromString("/*");
		params.get(5).setValueFromString("/text()"); // Property
		return completePattern;
	}

	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		testPairs.add(new PatternTestPair("03", "ExistsRelation", getPatternExistsWithRelationFinal(), "/*[./*]"));
		testPairs.add(new PatternTestPair("03", "Exists", getPatternExistsFinal(), "/*[/*]"));
		testPairs.add(new PatternTestPair("03", "ExistsNavigation", getPatternExistsNavigation(), "declare namespace demo = \"demo\"; /demo:data[./demo:building/demo:source = ./demo:painting/demo:source]"));
		testPairs.add(new PatternTestPair("03", "ExistsCond", getPatternExistsCondFinal(), "/*[/*/*/*[data()=\"New York City\"]]"));
		testPairs.add(new PatternTestPair("03", "Forall", getPatternForall(), "for $x1 in /* where every $x2 in /* satisfies true() return $x1"));
		testPairs.add(new PatternTestPair("03", "ForallCond", getPatternForallCond(), "for $x1 in /* where every $x2 in /*[data()=\"myvalue\"] satisfies true() return $x1"));
		return testPairs;
	}
}
