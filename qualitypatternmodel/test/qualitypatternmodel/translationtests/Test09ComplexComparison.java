package qualitypatternmodel.translationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.patternstructure.impl.*;
import qualitypatternmodel.testutility.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.graphstructure.impl.*;
import qualitypatternmodel.operators.*;
import qualitypatternmodel.operators.impl.*;
import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.AxisKind;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.*;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.impl.*;

public class Test09ComplexComparison {

	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternSelfTwoProperties());
		completePatterns.add(getPatternTwoProperties());
		completePatterns.add(getPatternTwoElements());
		completePatterns.add(getPatternTwoOperators());
		
		Test00.test(completePatterns);
	}
	
	public static CompletePattern getPatternSelfTwoProperties() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		OperatorsPackage.eINSTANCE.eClass();
		OperatorsFactory operatorFactory = OperatorsFactory.eINSTANCE;

		CompletePattern completePattern = Test00.getBasePattern();
		Node ret = completePattern.getGraph().getNodes().get(0);
		
		PrimitiveNode p1 = graphFactory.createPrimitiveNode();
		PrimitiveNode p2 = graphFactory.createPrimitiveNode();
		
		Comparison comp = operatorFactory.createComparison();
		
		completePattern.getGraph().getOperatorList().add(comp);
		comp.createParameters();
		ret.getProperties().add(p1);
		ret.getProperties().add(p2);
			
		comp.setArgument1(p1);
		comp.setArgument2(p2);
		comp.getTypeOption().setValue(ReturnType.STRING);
		
		completePattern.createXMLAdaption();
		completePattern.finalizeXMLAdaption();
		
		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getPathParam().getOptions().add(AxisKind.DESCENDANT);
		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getPathParam().setAxis(AxisKind.DESCENDANT, "");

		return completePattern;
	}

	public static CompletePattern getPatternTwoProperties() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		OperatorsPackage.eINSTANCE.eClass();
		OperatorsFactory operatorsFactory = OperatorsFactory.eINSTANCE;

		CompletePattern completePattern = Test00.getBasePattern();
		Node ret = completePattern.getGraph().getNodes().get(0);

		Node se1 = graphFactory.createNode();
		se1.setGraph(completePattern.getGraph());
		Relation relation = graphFactory.createRelation();
		relation.setGraph(completePattern.getGraph());
		relation.setSource(ret);
		relation.setTarget(se1);
		
		Node se2 = graphFactory.createNode();
		se2.setGraph(completePattern.getGraph());
		Relation relation2 = graphFactory.createRelation();
		relation2.setGraph(completePattern.getGraph());
		relation2.setSource(ret);
		relation2.setTarget(se2);
		
		PrimitiveNode p1 = graphFactory.createPrimitiveNode();
		PrimitiveNode p2 = graphFactory.createPrimitiveNode();
		
		Comparison comp = operatorsFactory.createComparison();
		
		completePattern.getGraph().getOperatorList().add(comp);
		comp.createParameters();
		se1.getProperties().add(p1);
		se2.getProperties().add(p2);
				
		comp.setArgument1(p1);
		comp.setArgument2(p2);
		comp.getTypeOption().setValue(ReturnType.STRING);
		
		completePattern.createXMLAdaption();
		completePattern.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		completePattern.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		completePattern.finalizeXMLAdaption();
		
		((XmlNavigation) completePattern.getGraph().getRelations().get(2)).getPathParam().getOptions().add(AxisKind.DESCENDANT);
		((XmlNavigation) completePattern.getGraph().getRelations().get(2)).getPathParam().setAxis(AxisKind.DESCENDANT, "");

		return completePattern;
	}

	public static CompletePattern getPatternTwoElements() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		OperatorsPackage.eINSTANCE.eClass();
		OperatorsFactory functionFactory = OperatorsFactory.eINSTANCE;

		CompletePattern completePattern = Test00.getBasePattern();
		Node ret = completePattern.getGraph().getNodes().get(0);

		Node se1 = graphFactory.createNode();
		se1.setGraph(completePattern.getGraph());
		Relation relation = graphFactory.createRelation();
		relation.setGraph(completePattern.getGraph());
		relation.setSource(ret);
		relation.setTarget(se1);
		
		Node se2 = graphFactory.createNode();
		se2.setGraph(completePattern.getGraph());
		Relation relation2 = graphFactory.createRelation();
		relation2.setGraph(completePattern.getGraph());
		relation2.setSource(ret);
		relation2.setTarget(se2);
		
		Comparison comp = functionFactory.createComparison();
		
		completePattern.getGraph().getOperatorList().add(comp);
		comp.createParameters();
		comp.setArgument1(se1);
		comp.setArgument2(se2);
		
		completePattern.createXMLAdaption();
		completePattern.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		completePattern.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		completePattern.finalizeXMLAdaption();
		
		return completePattern;
	}	

	public static CompletePattern getPatternTwoOperators() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		OperatorsPackage.eINSTANCE.eClass();
		OperatorsFactory functionFactory = OperatorsFactory.eINSTANCE;
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory inputsFactory = ParametersFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = Test00.getBasePattern();
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
		
		completePattern.createXMLAdaption();
		completePattern.finalizeXMLAdaption();	
		
		((XmlProperty) comp1.getArgument1()).getOption().setValue(PropertyKind.TAG);
		
		return completePattern;		
	}	

	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		
		testPairs.add(new PatternTestPair("COMPSELFPROPS", getPatternSelfTwoProperties(), "//*[./text()]"));
		testPairs.add(new PatternTestPair("COMPPROPPROP", getPatternTwoProperties(), "for $c in //*/* for $copy in $c/parent::*/*[(./text() = $c/text())] return $c/parent::*"));
		testPairs.add(new PatternTestPair("COMPELEL", getPatternTwoElements(), "for $c in /*/* for $copy in $c/parent::*/*[fn:deep-equal(.,$c)] return $c/parent::*"));
		testPairs.add(new PatternTestPair("COMPOPOP", getPatternTwoOperators(), "/*[name()!='building']"));
		
		return testPairs;
	}

}
