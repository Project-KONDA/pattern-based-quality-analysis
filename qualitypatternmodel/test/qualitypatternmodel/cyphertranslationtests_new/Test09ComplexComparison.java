package qualitypatternmodel.cyphertranslationtests_new;

import java.util.ArrayList;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.OperatorList;
import qualitypatternmodel.operators.OperatorsFactory;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;

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
		Test00.test(getPatterns());
	}

	public static CompletePattern getPatternSelfTwoProperties() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		OperatorsPackage.eINSTANCE.eClass();
		OperatorsFactory operatorFactory = OperatorsFactory.eINSTANCE;

		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		Node ret = completePattern.getGraph().getNodes().get(0).makeComplex();

		PrimitiveNode p1 = graphFactory.createPrimitiveNode();
		PrimitiveNode p2 = graphFactory.createPrimitiveNode();

		Comparison comp = operatorFactory.createComparison();

		completePattern.getGraph().getOperatorList().add(comp);
		comp.createParameters();
		ret.addOutgoing(p1);
		ret.addOutgoing(p2);

		comp.setArgument1(p1);
		comp.setArgument2(p2);
		comp.getTypeOption().setValue(ReturnType.STRING);

		completePattern.createNeo4jAdaption();

//		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getPathParam().getOptions().add(AxisKind.DESCENDANT);
//		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getXmlPathParam().setXmlAxis(XmlAxisKind.DESCENDANT, "");

		return completePattern;
	}

	public static CompletePattern getPatternTwoProperties() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		OperatorsPackage.eINSTANCE.eClass();
		OperatorsFactory operatorsFactory = OperatorsFactory.eINSTANCE;

		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		Node ret = completePattern.getGraph().getNodes().get(0);

		Relation r1 = ret.addOutgoing();
		ret = r1.getSource();
		Relation r2 = ret.addOutgoing();

		Comparison comp = operatorsFactory.createComparison();

		completePattern.getGraph().getOperatorList().add(comp);
		comp.createParameters();

		Relation r11 = r1.getTarget().addOutgoing();
		PrimitiveNode p1 = r11.getTarget().makePrimitive();

		Relation r21 = r2.getTarget().addOutgoing();
		PrimitiveNode p2 = r21.getTarget().makePrimitive();

		comp.setArgument1(p1);
		comp.setArgument2(p2);
		comp.getTypeOption().setValue(ReturnType.STRING);

		completePattern.createNeo4jAdaption();
//		completePattern.getGraph().getRelations().get(0).adaptAsXmlElementNavigation();
//		completePattern.getGraph().getRelations().get(0).adaptAsXmlElementNavigation();

//		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getXmlPathParam().setXmlAxis(XmlAxisKind.DESCENDANT, null);
//		((XmlNavigation) completePattern.getGraph().getRelations().get(1)).getXmlPathParam().setXmlAxis(XmlAxisKind.DESCENDANT, null);

		return completePattern;
	}

	public static CompletePattern getPatternTwoElements() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		OperatorsPackage.eINSTANCE.eClass();
		OperatorsFactory functionFactory = OperatorsFactory.eINSTANCE;

		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		Node ret = completePattern.getGraph().getNodes().get(0).makeComplex();

		Relation r1 = ret.addOutgoing();
		ret = r1.getSource();
		Relation r2 = ret.addOutgoing();
		Node se1 = r1.getTarget();
		Node se2 = r2.getTarget();

		Comparison comp = functionFactory.createComparison();

		completePattern.getGraph().getOperatorList().add(comp);
		comp.createParameters();
		comp.setArgument1(se1);
		comp.setArgument2(se2);

		completePattern.createNeo4jAdaption();
//		completePattern.getGraph().getRelations().get(0).adaptAsXmlElementNavigation();
//		completePattern.getGraph().getRelations().get(0).adaptAsXmlElementNavigation();

		return completePattern;
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

		completePattern.createNeo4jAdaption();

//		((XmlNavigation) ((XmlProperty) comp1.getArgument1()).getIncoming().get(0)).getXmlPathParam().getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);

		return completePattern;
	}
}
