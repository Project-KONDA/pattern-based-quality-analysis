package qualitypatternmodel.xmltranslationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.ReturnType;
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
			completePatterns.add(getFormulaPatternConcrete(lo));
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

		XmlReference ref = qc2.getGraph().getRelations().get(0).adaptAsXmlReference();
		ref.setType(ReturnType.STRING);

		return completePattern;
	}

	public static CompletePattern getFormulaPatternConcrete(LogicalOperator op) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = getFormulaPattern(op);

		((XmlElementNavigation) pattern.getGraph().getRelations().get(0)).getXmlPathParam().setXmlAxis(XmlAxisKind.DESCENDANT, null);
		QuantifiedCondition q1 = ((QuantifiedCondition)((Formula) pattern.getCondition()).getCondition2());
		XmlPropertyOptionParam property = ((XmlPropertyNavigation) q1.getGraph().getRelations().get(2)).getXmlPathParam().getXmlPropertyOptionParam();
		property.setValue(XmlPropertyKind.ATTRIBUTE);
		property.getAttributeName().setValue("demo:id");

		return pattern;
	}



	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		List<PatternTestPair> testPairs = new ArrayList<>();

		testPairs.add(new PatternTestPair("07", "AND", getFormulaPatternConcrete(LogicalOperator.AND), "/*/*[ ./* and ./@*[name()=\"demo:id\"]=/*/*/*/data()]"));
		testPairs.add(new PatternTestPair("07", "OR", getFormulaPatternConcrete(LogicalOperator.OR), "/*/*[ ./* or ./@*[name()=\"demo:id\"]=/*/*/*/data()]"));
		testPairs.add(new PatternTestPair("07", "IMPLIES", getFormulaPatternConcrete(LogicalOperator.IMPLIES), "/*/*[ not(./*) or ./@*[name()=\"demo:id\"]=/*/*/*/data()]"));
		testPairs.add(new PatternTestPair("07", "XOR", getFormulaPatternConcrete(LogicalOperator.XOR), "/*/* [ not(./*) = (./@*[name()=\"demo:id\"]=/*/*/*/data())]"));
		testPairs.add(new PatternTestPair("07", "EQUAL", getFormulaPatternConcrete(LogicalOperator.EQUAL), "/*/* [ exists(./*) = (./@*[name()=\"demo:id\"]=/*/*/*/data())]"));

		return testPairs;
	}

}
