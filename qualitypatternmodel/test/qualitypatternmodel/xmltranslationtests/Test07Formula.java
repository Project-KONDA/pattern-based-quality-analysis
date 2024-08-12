package qualitypatternmodel.xmltranslationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.utility.PatternUtility;
import qualitypatternmodel.xmltestutility.PatternTestPair;

public class Test07Formula {

	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		for (LogicalOperator lo: LogicalOperator.VALUES) {
			completePatterns.add(getFormulaPattern(lo));
		}
		return completePatterns;
	}

    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternUtility.testPatterns(getPatterns());
	}

	public static CompletePattern getFormulaPattern(LogicalOperator op) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;

		CompletePattern completePattern = factory.createCompletePattern();
		Formula form = factory.createFormula();
		completePattern.setCondition(form);
		form.setOperator(op);

		QuantifiedCondition qc1 = factory.createQuantifiedCondition();
		QuantifiedCondition qc2 = factory.createQuantifiedCondition();

		form.setCondition1(qc1);
		form.setCondition2(qc2);

		Node ret = completePattern.getGraph().getNodes().get(0).makeComplex();
		ret.addOutgoing(qc1.getGraph());
		ret.addOutgoing(qc2.getGraph());

		completePattern.createXmlAdaption();

		List<Parameter> params = completePattern.getParameterList().getParameters();
		((XmlPathParam) params.get(0)).setValueFromString("//*");
		((XmlPathParam) params.get(1)).setValueFromString("/*");
		((XmlPathParam) params.get(2)).setValueFromString("/parent::*");

		return completePattern;
	}



	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		List<PatternTestPair> testPairs = new ArrayList<>();

		testPairs.add(new PatternTestPair("07", "AND", getFormulaPattern(LogicalOperator.AND), "/*//*[./*]"));
		testPairs.add(new PatternTestPair("07", "OR", getFormulaPattern(LogicalOperator.OR), "//*"));
		testPairs.add(new PatternTestPair("07", "IMPLIES", getFormulaPattern(LogicalOperator.IMPLIES), "/*//*"));
		testPairs.add(new PatternTestPair("07", "XOR", getFormulaPattern(LogicalOperator.XOR), "/* | //*[not(./*)]"));
		testPairs.add(new PatternTestPair("07", "EQUAL", getFormulaPattern(LogicalOperator.EQUAL), "/*//*[./*]"));

		return testPairs;
	}

}
