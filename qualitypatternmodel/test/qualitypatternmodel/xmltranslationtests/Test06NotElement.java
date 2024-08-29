package qualitypatternmodel.xmltranslationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.utility.PatternUtility;
import qualitypatternmodel.xmltestutility.PatternTestPair;

public class Test06NotElement {

	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternNotTrue());
		completePatterns.add(getPatternNotNotTrue());
		completePatterns.add(getPatternNotExists());
		completePatterns.add(getPatternNotForall());
		completePatterns.add(getPatternExistsNotExists());
		completePatterns.add(getPatternForallNotForall());
		return completePatterns;
	}

    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternUtility.testPatterns(getPatterns());
	}

	public static CompletePattern getPatternNotTrue() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		NotCondition n = factory.createNotCondition();
		completePattern.setCondition(n);
		completePattern.createXmlAdaption();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		params.get(0).setValueFromString("/*"); // XmlPathParam

		return completePattern;
	}

	public static CompletePattern getPatternNotNotTrue() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		NotCondition n = factory.createNotCondition();
		completePattern.setCondition(n);
		NotCondition n2 = factory.createNotCondition();
		n.setCondition(n2);

		completePattern.createXmlAdaption();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		params.get(0).setValueFromString("/*"); // XmlPathParam

		return completePattern;
	}

	public static CompletePattern getPatternNotExistsAbstract() throws InvalidityException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;

		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		NotCondition n = factory.createNotCondition();
		completePattern.setCondition(n);
		QuantifiedCondition qc = factory.createQuantifiedCondition();
		n.setCondition(qc);
		TrueElement t = factory.createTrueElement();
		qc.setCondition(t);

		Node e0 = completePattern.getGraph().getNodes().get(0);
		e0.addOutgoing(qc.getGraph());

		return completePattern;
	}

	public static CompletePattern getPatternNotExists() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternNotExistsAbstract();
		completePattern.createXmlAdaption();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		params.get(0).setValueFromString("//*"); // XmlPathParam
		params.get(1).setValueFromString("/*"); // XmlPathParam
		return completePattern;
	}
	public static CompletePattern getPatternNotForall() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternNotExists();
		QuantifiedCondition qc = ((QuantifiedCondition) ((NotCondition) completePattern.getCondition()).getCondition());
		qc.setQuantifier(Quantifier.FORALL);
		return completePattern;
	}

	public static CompletePattern getPatternExistsNotExistsAbstract() throws InvalidityException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;

		CompletePattern completePattern = Test03Quantor.getPatternExists();
		TrueElement t = (TrueElement) ((QuantifiedCondition) completePattern.getCondition()).getCondition();
		QuantifiedCondition qc1 = (QuantifiedCondition) completePattern.getCondition();
		NotCondition n = factory.createNotCondition();
		QuantifiedCondition qc2 = factory.createQuantifiedCondition();

		qc1.setCondition(n);
		n.setCondition(qc2);
		qc2.setCondition(t);

		Node e1 = qc1.getGraph().getNodes().get(0);

		e1.addOutgoing(qc2.getGraph());
		return completePattern;
	}


	public static CompletePattern getPatternExistsNotExists() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternExistsNotExistsAbstract();

		QuantifiedCondition q1 = ((QuantifiedCondition) completePattern.getCondition());
		QuantifiedCondition q2 = ((QuantifiedCondition) ((NotCondition) q1.getCondition()).getCondition());
		q2.getGraph().getNodes().get(0).addPrimitiveComparison();

		completePattern.createXmlAdaption();

		List<Parameter> params = completePattern.getParameterList().getParameters();
		params.get(0).setValueFromString("unknown"); // UntypedParameterValue
		params.get(1).setValueFromString("EQUAL"); // ComparisonOptionParam
		params.get(2).setValueFromString("STRING"); // TypeOptionParam
		params.get(3).setValueFromString("//demo:building"); // XmlPathParam
		params.get(4).setValueFromString("/demo:address"); // XmlPathParam
		params.get(5).setValueFromString("/demo:city/text()"); // XmlPathParam Property

		return completePattern;
	}
	public static CompletePattern getPatternForallNotForall() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternExistsNotExists();

		QuantifiedCondition qc1 = (QuantifiedCondition) completePattern.getCondition();
		QuantifiedCondition qc2 = (QuantifiedCondition) ((NotCondition) qc1.getCondition()).getCondition();

		qc1.setQuantifier(Quantifier.FORALL);
		qc2.setQuantifier(Quantifier.FORALL);

		return completePattern;
	}

	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		testPairs.add(new PatternTestPair("06", "NOT",getPatternNotTrue(), "()"));
		testPairs.add(new PatternTestPair("06", "NOTNOT", getPatternNotNotTrue(), "/*"));
		testPairs.add(new PatternTestPair("06", "NOTEX", getPatternNotExists(), "//*[not(./*)]"));
		testPairs.add(new PatternTestPair("06", "NOTFA", getPatternNotForall(), "()"));
		testPairs.add(new PatternTestPair("06", "EXNOTEX", getPatternExistsNotExists(), "declare namespace demo = \"demo\"; //demo:building[./demo:address/demo:city[./text() = \"New York City\"]]"));
		testPairs.add(new PatternTestPair("06", "FANOTFA", getPatternForallNotForall(), "()"));
		return testPairs;
	}

}
