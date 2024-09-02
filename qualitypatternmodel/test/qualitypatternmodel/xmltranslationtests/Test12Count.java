package qualitypatternmodel.xmltranslationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;
import qualitypatternmodel.utility.PatternUtility;
import qualitypatternmodel.xmltestutility.PatternTestPair;

public class Test12Count {

	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternCount());
		completePatterns.add(getPatternCountInExists());
		completePatterns.add(getPatternCountInForall());
		completePatterns.add(getPatternCountInNot());
		completePatterns.add(getPatternCountNextToExists());
		completePatterns.add(getPatternCountNextToForall());
		return completePatterns;
	}

    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternUtility.testPatterns(getPatterns());
	}

	public static CompletePattern getPatternCount() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		Graph g = pattern.getGraph();
		CountCondition ccond = PatternstructureFactory.eINSTANCE.createCountCondition();
		pattern.setCondition(ccond);
		ccond.createCountPattern();
		Graph cograph = ccond.getCountPattern().getGraph();
		NumberElement nel = PatternstructureFactory.eINSTANCE.createNumberElement();
		ccond.setArgument2(nel);
		g.getNodes().get(0).addOutgoing(cograph).getTarget().makeComplex().setReturnNode(true);
		pattern.createXmlAdaption();

		List<Parameter> params = pattern.getParameterList().getParameters();
		params.get(0).setValueFromString("EQUAL"); // ComparisonOptionParam
		params.get(1).setValueFromString("2."); // NumberParam
		params.get(2).setValueFromString("//*"); // XmlPathParam
		params.get(3).setValueFromString("/following-sibling::*"); // XmlPathParam
		return pattern;
	}

	public static CompletePattern getPatternCountInExists() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		Graph g = pattern.getGraph();
		QuantifiedCondition qcon = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		Graph g2 = qcon.getGraph();
		pattern.setCondition(qcon);
		CountCondition ccond = PatternstructureFactory.eINSTANCE.createCountCondition();
		qcon.setCondition(ccond);
		ccond.createCountPattern();
		Graph g3 = ccond.getCountPattern().getGraph();
		NumberElement nel = PatternstructureFactory.eINSTANCE.createNumberElement();
		ccond.setArgument2(nel);
		g.getNodes().get(0).addOutgoing(g2).getTarget().addOutgoing(g3).getTarget().makeComplex().setReturnNode(true);
		pattern.createXmlAdaption();

		List<Parameter> params = pattern.getParameterList().getParameters();
		params.get(0).setValueFromString("EQUAL"); // ComparisonOptionParam
		params.get(1).setValueFromString("2."); // NumberParam
		params.get(2).setValueFromString("//*"); // XmlPathParam
		params.get(3).setValueFromString("/*"); // XmlPathParam
		params.get(4).setValueFromString("/following-sibling::*"); // XmlPathParam
		return pattern;
	}

	public static CompletePattern getPatternCountInForall() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = getPatternCountInExists();
		((QuantifiedCondition) pattern.getCondition()).setQuantifier(Quantifier.FORALL);
		pattern.getNamespaces().put("demo", "demo");
		List<Parameter> params = pattern.getParameterList().getParameters();
		params.get(0).setValueFromString("GREATER"); // ComparisonOptionParam
		params.get(1).setValueFromString("2.0"); // NumberParam
		params.get(2).setValueFromString("//*"); // XmlPathParam
		params.get(3).setValueFromString("/demo:creator"); // XmlPathParam
		params.get(4).setValueFromString("/preceding-sibling::*"); // XmlPathParam
		return pattern;
	}

	public static CompletePattern getPatternCountInNot() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		Graph g = pattern.getGraph();
		NotCondition not = PatternstructureFactory.eINSTANCE.createNotCondition();
		pattern.setCondition(not);
		CountCondition ccond = PatternstructureFactory.eINSTANCE.createCountCondition();
		not.setCondition(ccond);
		ccond.createCountPattern();
		Graph cograph = ccond.getCountPattern().getGraph();
		NumberElement nel = PatternstructureFactory.eINSTANCE.createNumberElement();
		ccond.setArgument2(nel);
		g.getNodes().get(0).addOutgoing(cograph).getTarget().makeComplex().setReturnNode(true);
		pattern.createXmlAdaption();

		List<Parameter> params = pattern.getParameterList().getParameters();
		params.get(0).setValueFromString("EQUAL"); // ComparisonOptionParam
		params.get(1).setValueFromString("2."); // NumberParam
		params.get(2).setValueFromString("//*"); // XmlPathParam
		params.get(3).setValueFromString("/following-sibling::*"); // XmlPathParam
		return pattern;
	}


	public static CompletePattern getPatternCountNextToExists() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		Graph g = pattern.getGraph();
		Formula formula = PatternstructureFactory.eINSTANCE.createFormula();
		pattern.setCondition(formula);
		CountCondition ccond = PatternstructureFactory.eINSTANCE.createCountCondition();
		formula.setCondition1(ccond);

		QuantifiedCondition qcon = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		Graph g2 = qcon.getGraph();
		formula.setCondition2(qcon);
		g.getNodes().get(0).addOutgoing(g2).getTarget().makePrimitive();

		ccond.createCountPattern();
		Graph cograph = ccond.getCountPattern().getGraph();
		NumberElement nel = PatternstructureFactory.eINSTANCE.createNumberElement();
		ccond.setArgument2(nel);
		g.getNodes().get(0).addOutgoing(cograph).getTarget().makeComplex().setReturnNode(true);
		pattern.createXmlAdaption();

		List<Parameter> params = pattern.getParameterList().getParameters();
		params.get(0).setValueFromString("EQUAL"); // ComparisonOptionParam
		params.get(1).setValueFromString("2."); // NumberParam
		params.get(2).setValueFromString("//*"); // XmlPathParam
		params.get(3).setValueFromString("/following-sibling::*"); // XmlPathParam
		params.get(4).setValueFromString("/text()"); // XmlPathParam Property
		return pattern;
	}

	public static CompletePattern getPatternCountNextToForall() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = getPatternCountNextToExists();
		Formula formula = (Formula) pattern.getCondition();
		QuantifiedCondition qcon = (QuantifiedCondition) formula.getCondition2();
		qcon.setQuantifier(Quantifier.FORALL);
		NotCondition not = PatternstructureFactory.eINSTANCE.createNotCondition();
		qcon.setCondition(not);
		return pattern;
	}

	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<PatternTestPair> testPairs = new ArrayList<>();
		testPairs.add(new PatternTestPair("12", "Count", getPatternCount(), "//*[count(./following-sibling::*) = 2]"));
		testPairs.add(new PatternTestPair("12", "CountExist", getPatternCountInExists(), "//*[./*[count(./following-sibling::*) = 2]]"));
		testPairs.add(new PatternTestPair("12", "CountFor", getPatternCountInForall(), "declare namespace demo = \"demo\"; //*[not (./demo:creator) or count(./demo:creator/preceding-sibling::*)>2]"));
		testPairs.add(new PatternTestPair("12", "CountNot", getPatternCountInNot(), "//*[not(count(./following-sibling::*) = 2)]"));
		testPairs.add(new PatternTestPair("12", "CountNextExist", getPatternCountNextToExists(), "//*[./text()][count(./following-sibling::*) = 2]"));
		testPairs.add(new PatternTestPair("12", "CountNextForall", getPatternCountNextToForall(), "//*[not(./text())][count(./following-sibling::*) = 2]"));
		return testPairs;
	}
}