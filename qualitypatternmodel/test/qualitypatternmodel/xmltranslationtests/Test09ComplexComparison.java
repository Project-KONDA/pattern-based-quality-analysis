package qualitypatternmodel.xmltranslationtests;

import java.util.ArrayList;
import java.util.List;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.OperatorList;
import qualitypatternmodel.operators.OperatorsFactory;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.utility.PatternUtility;
import qualitypatternmodel.xmltestutility.PatternTestPair;

public class Test09ComplexComparison {

	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternSelfTwoProperties());
		completePatterns.add(getPatternTwoProperties());
		completePatterns.add(getPatternTwoElements());
		completePatterns.add(getPatternTwoOperators());
		return completePatterns;
	}

    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternUtility.testPatterns(getPatterns());
	}

	public static CompletePattern getPatternSelfTwoProperties() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		Node ret = completePattern.getGraph().getNodes().get(0).makeComplex();
		
		QuantifiedCondition cond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(cond);

		PrimitiveNode p1 = ret.addOutgoing(cond.getGraph()).getTarget().makePrimitive();
		PrimitiveNode p2 = ret.addOutgoing(cond.getGraph()).getTarget().makePrimitive();

		p1.addComparison(p2);

		completePattern.createXmlAdaption();

		completePattern.getNamespaces().put("demo", "demo");
		List<Parameter> params = completePattern.getParameterList().getParameters();
//		((ComparisonOptionParam) params.get(0)).setValueFromString(null);
//		((TypeOptionParam) params.get(1)).setValueFromString(null);
		((XmlPathParam) params.get(2)).setValueFromString("//*");
		((XmlPathParam) params.get(3)).setValueFromString("/demo:creator/text()"); // Property
		((XmlPathParam) params.get(4)).setValueFromString("/parent::*/demo:artist/@demo:id"); // Property

		return completePattern;
	}

	public static CompletePattern getPatternTwoProperties() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		ComplexNode ret = pattern.getGraph().getNodes().get(0).makeComplex();
		
		QuantifiedCondition qcon = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(qcon);
		Graph qcongraph = qcon.getGraph();
		
		ComplexNode node = qcongraph.addComplexNode();

		PrimitiveNode n1 = ret.addOutgoing(qcongraph).getTarget().makePrimitive();
		PrimitiveNode n2 = node.addOutgoing(qcongraph).getTarget().makePrimitive();
		
		n1.addComparison(n2);

		pattern.createXmlAdaption();

		List<Parameter> params = pattern.getParameterList().getParameters();
		((XmlPathParam) params.get(2)).setValueFromString("/*/*");
		((XmlPathParam) params.get(3)).setValueFromString("/demo:creator/text()"); // Property
		((XmlPathParam) params.get(4)).setValueFromString("/@demo:id"); // Property
		((XmlPathParam) params.get(5)).setValueFromString("/*/demo:artist");
		return pattern;
	}

	public static CompletePattern getPatternTwoElements() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		Node ret = pattern.getGraph().getNodes().get(0).makeComplex();

		QuantifiedCondition qcon = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(qcon);
		Graph qcongraph = qcon.getGraph();

		ComplexNode r1 = ret.addOutgoing(qcongraph).getTarget().makeComplex();
		ComplexNode r2 = ret.addOutgoing(qcongraph).getTarget().makeComplex();
		r1.addComparison(r2);

		pattern.createXmlAdaption();

		List<Parameter> params = pattern.getParameterList().getParameters();
		((XmlPathParam) params.get(2)).setValueFromString(null);
		((XmlPathParam) params.get(3)).setValueFromString(null);
		((XmlPathParam) params.get(4)).setValueFromString(null);

		return pattern;
	}

	public static CompletePattern getPatternTwoOperators() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		OperatorsPackage.eINSTANCE.eClass();
		OperatorsFactory functionFactory = OperatorsFactory.eINSTANCE;
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory inputsFactory = ParametersFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;

		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		ParameterList varlist = completePattern.getParameterList();
		OperatorList oplist = completePattern.getGraph().getOperatorList();
		Node se = completePattern.getGraph().getNodes().get(0);

		TextLiteralParam tl2 = inputsFactory.createTextLiteralParam();
		tl2.setValue("building");
		TextLiteralParam tl3 = inputsFactory.createTextLiteralParam();
		tl3.setValue("A");
		TextLiteralParam tl4 = inputsFactory.createTextLiteralParam();
		tl4.setValue("B");

		varlist.add(tl2);
		varlist.add(tl3);
		varlist.add(tl4);

		Comparison comp0 = functionFactory.createComparison();
		oplist.add(comp0);
		comp0.createParameters();
		Comparison comp1 = functionFactory.createComparison();
		oplist.add(comp1);
		comp1.createParameters();
		Comparison comp2 = functionFactory.createComparison();
		oplist.add(comp2);
		comp2.createParameters();

//		se.getPredicates().add(comp0);
		comp0.setArgument1(comp1);
		comp0.setArgument2(comp2);

		PrimitiveNode p = graphFactory.createPrimitiveNode();
		se.addOutgoing(p);
		comp1.setArgument1(p);
		comp1.setArgument2(tl2);
		comp2.setArgument1(tl3);
		comp2.setArgument2(tl4);

		completePattern.createXmlAdaption();

		((XmlNavigation) ((XmlProperty) comp1.getArgument1()).getIncoming().get(0)).getXmlPathParam().getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);

		return completePattern;
	}

	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<PatternTestPair> testPairs = new ArrayList<>();

		testPairs.add(new PatternTestPair("09", "COMPSELFPROPS", getPatternSelfTwoProperties(), "//*[./text()]"));
		testPairs.add(new PatternTestPair("09", "COMPPROPPROP", getPatternTwoProperties(), "for $c in //*/* for $copy in $c/parent::*/*[(./text() = $c/text())] return $c/parent::*"));
		testPairs.add(new PatternTestPair("09", "COMPELEL", getPatternTwoElements(), "for $c in /*/* for $copy in $c/parent::*/*[fn:deep-equal(.,$c)] return $c/parent::*"));
		testPairs.add(new PatternTestPair("09", "COMPOPOP", getPatternTwoOperators(), "/*[name()!='building']"));

		return testPairs;
	}

}
