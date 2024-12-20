package qualitypatternmodel.xmltranslationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.utility.PatternUtility;
import qualitypatternmodel.xmltestutility.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.parameters.Parameter;
//import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.exceptions.*;

public class Test01Reference {
	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getBaseReferenceAbstractFilled());
		completePatterns.add(getBaseReferenceExistsAbstractFilled());
		completePatterns.add(getBaseReference1());
		completePatterns.add(getBaseReferenceExists1());
		return completePatterns;
	}
	
    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternUtility.testPatterns(getPatterns());
	}

	public static CompletePattern getBaseReference() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		Graph g = completePattern.getGraph();
		
		Node n1 = g.getNodes().get(0);
		Node n2 = g.addComplexNode();
		n1.addOutgoing(n2);
		
		return completePattern;
	}

	public static CompletePattern getBaseReferenceAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		CompletePattern completePattern = getBaseReference();
		Graph graph = completePattern.getGraph();
		completePattern.createXmlAdaption();
		graph.getRelations().get(0).adaptAsXmlReference();
		return completePattern;
	}
	
	public static CompletePattern getBaseReferenceAbstractFilled() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		CompletePattern completePattern = getBaseReferenceAbstract();
		PatternUtility.fillParameter(completePattern);
		return completePattern;
	}

	public static CompletePattern getBaseReference1() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		CompletePattern completePattern = getBaseReferenceAbstract();
		completePattern.getNamespaces().put("demo", "demo");
		List<Parameter> params = completePattern.getParameterList().getParameters();
		params.get(0).setValueFromString("/demo:data/demo:painting"); // XmlPathParam
		params.get(1).setValueFromString("/demo:data/demo:artist"); // XmlPathParam
		params.get(2).setValueFromString("/demo:creator/text()"); // XmlPathParam Property
		params.get(3).setValueFromString("/@demo:id"); // XmlPathParam Property
		return completePattern;
	}

	public static CompletePattern getBaseReferenceExistsAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		
		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		
		completePattern.setCondition(qc);
		completePattern.getGraph().getNodes().get(0).addOutgoing(qc.getGraph());
		completePattern.createXmlAdaption();
		((QuantifiedCondition) completePattern.getCondition()).getGraph().getRelations().get(0).adaptAsXmlReference();
		return completePattern;
	}
	
	public static CompletePattern getBaseReferenceExistsAbstractFilled() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		CompletePattern completePattern = getBaseReferenceExistsAbstract();
		PatternUtility.fillParameter(completePattern);
		return completePattern;
	}
	
	public static CompletePattern getBaseReferenceExists1() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = getBaseReferenceExistsAbstract();
		pattern.getNamespaces().put("demo", "demo");
		List<Parameter> params = pattern.getParameterList().getParameters();
		params.get(0).setValueFromString("/demo:data/demo:painting"); // XmlPathParam
		params.get(1).setValueFromString("/demo:data/demo:artist"); // XmlPathParam
		params.get(2).setValueFromString("/demo:creator/text()"); // XmlPathParam Property
		params.get(3).setValueFromString("/@demo:id"); // XmlPathParam Property
		return pattern;
	}

	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		String query = "declare namespace demo = \"demo\"; /demo:data/demo:painting[./demo:creator/text() != \"9\"]";
		testPairs.add(new PatternTestPair("01r", "base-reference_1", getBaseReference1(), query));
		testPairs.add(new PatternTestPair("01r", "base-reference_exist", getBaseReferenceExists1(), query));
		return testPairs;
	}

}
