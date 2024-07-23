package qualitypatternmodel.xmltranslationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.utility.PatternUtility;
import qualitypatternmodel.xmltestutility.PatternTestPair;

public class Test14StringLength {

	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<>();
		completePatterns.add(getPatternLength(ComparisonOperator.EQUAL, 5.));
		completePatterns.add(getPatternLength(ComparisonOperator.LESSOREQUAL, 10.));
		return completePatterns;
	}

    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternUtility.testPatterns(getPatterns());
	}

	public static CompletePattern getPatternLength(ComparisonOperator op, Double num) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.getGraph().getNodes().get(0).addOutgoing().getTarget().addPrimitiveStringLength(op, num);
		pattern.createXmlAdaption();
		pattern.printParameters();
		List<Parameter> params = pattern.getParameterList().getParameters();
		params.get(2).setValueFromString("/text()");
		params.get(3).setValueFromString("//*");
		return pattern;
	}

	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		testPairs.add(new PatternTestPair("EQUAL", getPatternLength(ComparisonOperator.EQUAL, 5.), "//*[./text()[string-length(.) = 5.0]]"));
		testPairs.add(new PatternTestPair("LESSOREQUAL", getPatternLength(ComparisonOperator.LESSOREQUAL, 10.), "//*[./text()[string-length(.) <= 10.0]]"));
		return testPairs;
	}
}
