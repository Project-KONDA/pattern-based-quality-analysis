package qualitypatternmodel.translationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.patternstructure.impl.*;
import qualitypatternmodel.testutilityclasses.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.graphstructure.impl.*;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.functions.*;
import qualitypatternmodel.functions.impl.*;
import qualitypatternmodel.parameters.*;
import qualitypatternmodel.parameters.impl.*;

public class Test09ComplexComparison {

	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<Pattern> patterns = new ArrayList<Pattern>();
//		patterns.add(getPatternCount());
//		patterns.add(getPatternSelfTwoProps());
//		patterns.add(getPatternTwoProps());
//		patterns.add(getPatternTwoEs());
		patterns.add(getPatternEtoSE());
//		patterns.add(getPatternTwoSetEs());
//		patterns.add(getPatternTwoOps());
		
		Test00.test(patterns);
	}

	public static Pattern getPatternCount() {
		
		Pattern pattern = Test03Quantor.getPatternExists();		
		Graph graph = ((QuantifiedCondition) pattern.getCondition()).getGraph();
		SingleElement se = graph.getReturnElements().get(0);
		se.addCountOperation();
		return pattern;		
	}
	
	public static Pattern getPatternSelfTwoProps() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		FunctionsPackage.eINSTANCE.eClass();
		FunctionsFactory functionFactory = FunctionsFactory.eINSTANCE;

		Pattern pattern = Test00.getBasePattern();
		SingleElement ret = pattern.getGraph().getReturnElements().get(0);
		
		Property p1 = graphFactory.createProperty();
		Property p2 = graphFactory.createProperty();
		
		Comparison comp = functionFactory.createComparison();
		
		pattern.getGraph().getOperatorList().add(comp);
		ret.getProperties().add(p1);
		ret.getProperties().add(p2);
		
		p1.getOption().setValue(PropertyLocation.TAG);
		
		comp.setArgument1(p1);
		comp.setArgument2(p2);
		comp.setType(ReturnType.STRING);

		return pattern;
	}

	public static Pattern getPatternTwoProps() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		FunctionsPackage.eINSTANCE.eClass();
		FunctionsFactory functionFactory = FunctionsFactory.eINSTANCE;

		Pattern pattern = Test00.getBasePattern();
		SingleElement ret = pattern.getGraph().getReturnElements().get(0);

		SingleElement se1 = graphFactory.createSingleElement();
		SingleElement se2 = graphFactory.createSingleElement();

		ret.getNextSingle().add(se1);
		ret.getNextSingle().add(se2);
		
		Property p1 = graphFactory.createProperty();
		Property p2 = graphFactory.createProperty();
		
		Comparison comp = functionFactory.createComparison();
		
		pattern.getGraph().getOperatorList().add(comp);
		se1.getProperties().add(p1);
		se2.getProperties().add(p2);
		
		p1.getOption().setValue(PropertyLocation.TAG);
		
		comp.setArgument1(p1);
		comp.setArgument2(p2);
		comp.setType(ReturnType.STRING);

		return pattern;
	}

	public static Pattern getPatternTwoEs() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		FunctionsPackage.eINSTANCE.eClass();
		FunctionsFactory functionFactory = FunctionsFactory.eINSTANCE;

		Pattern pattern = Test00.getBasePattern();
		SingleElement ret = pattern.getGraph().getReturnElements().get(0);

		SingleElement se1 = graphFactory.createSingleElement();
		SingleElement se2 = graphFactory.createSingleElement();

		ret.getNextSingle().add(se1);
		ret.getNextSingle().add(se2);
		
		Comparison comp = functionFactory.createComparison();
		
		pattern.getGraph().getOperatorList().add(comp);
		comp.setArgument1(se1);
		comp.setArgument2(se2);
		
		return pattern;
	}	

	public static Pattern getPatternEtoSE() {
//		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		FunctionsPackage.eINSTANCE.eClass();
		FunctionsFactory functionFactory = FunctionsFactory.eINSTANCE;
//		InputfieldsPackage.eINSTANCE.eClass();
//		InputfieldsFactory inputsFactory = InputfieldsFactory.eINSTANCE;
//
//		Pattern pattern = Test03Quantor.getPatternExists();
//		SingleElement ret = graph.getReturnElements().get(0);
//
//		Graph graph = ((QuantifiedCondition) pattern.getCondition()).getGraph();
//		OperatorList oplist = graph.getOperatorList();
//		SetElement se = graphFactory.createSetElement();
//		ret.getNextSet().add(se);
//		
//		Comparison countcomp = functionFactory.createComparison();
//		Count count = functionFactory.createCount();
//		Comparison comp = functionFactory.createComparison();
//		
//		oplist.add(count);
//		oplist.add(countcomp);
//		oplist.add(comp);
//		
//		
//		countcomp.setArgument1(count);
//		countcomp.setArgument2(inputsFactory.createNumber());
//		comp.setArgument1(ret);
//		comp.setArgument2(se);
//		count.setArgument(se);
		
		Pattern pattern = getPatternCount();
		Graph graph = ((QuantifiedCondition) pattern.getCondition()).getGraph();
		OperatorList oplist = graph.getOperatorList();
		Comparison comp = functionFactory.createComparison();
		
		oplist.add(comp);
		
		SingleElement se = graph.getReturnElements().get(0);
		
		comp.setArgument1(se.getNextSet().get(0));
		comp.setArgument2(se.getNextSingle().get(0));
		
		return pattern;
	}

	public static Pattern getPatternTwoSetEs() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		FunctionsPackage.eINSTANCE.eClass();
		FunctionsFactory functionFactory = FunctionsFactory.eINSTANCE;
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory inputsFactory = ParametersFactory.eINSTANCE;

		Pattern pattern = Test03Quantor.getPatternExists();

		OperatorList oplist = ((QuantifiedCondition)pattern.getCondition()).getGraph().getOperatorList();
		SingleElement ret = ((QuantifiedCondition)pattern.getCondition()).getGraph().getReturnElements().get(0);
		ret.getNextSingle().remove(0);

		SetElement se1 = graphFactory.createSetElement();
		ret.getNextSet().add(se1);
		SetElement se2 = graphFactory.createSetElement();		
		se1.getNext().add(se2);
				
		Comparison countcomp = functionFactory.createComparison();
		oplist.add(countcomp);
		Count count = functionFactory.createCount();
		oplist.add(count);
		Comparison comp = functionFactory.createComparison();
		oplist.add(comp);

		ret.getPredicates().add(countcomp);
		countcomp.setArgument1(count);
		Number num = inputsFactory.createNumber();
		pattern.getParameterList().add(num);
		countcomp.setArgument2(num);
		
		count.setArgument(se1);
		
		comp.setArgument1(se1);
		comp.setArgument2(se2);
		
		return pattern;
	}	

	public static Pattern getPatternTwoOps() {
		FunctionsPackage.eINSTANCE.eClass();
		FunctionsFactory functionFactory = FunctionsFactory.eINSTANCE;
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory inputsFactory = ParametersFactory.eINSTANCE;
		
		Pattern pattern = Test00.getBasePattern();
		ParameterList varlist = pattern.getParameterList();
		OperatorList oplist = pattern.getGraph().getOperatorList();
		SingleElement se = pattern.getGraph().getReturnElements().get(0);
		
		TextLiteral tl = inputsFactory.createTextLiteral();
		tl.setValue("a");
		TextLiteral tl2 = inputsFactory.createTextLiteral();
		tl.setValue("a");
		TextLiteral tl3 = inputsFactory.createTextLiteral();
		tl.setValue("a");
		TextLiteral tl4 = inputsFactory.createTextLiteral();
		tl.setValue("a");

		varlist.add(tl);
		varlist.add(tl2);
		varlist.add(tl3);
		varlist.add(tl4);

		Comparison comp0 = functionFactory.createComparison();
		Comparison comp1 = functionFactory.createComparison();
		Comparison comp2 = functionFactory.createComparison();
		oplist.add(comp0);
		oplist.add(comp1);
		oplist.add(comp2);
		se.getPredicates().add(comp0);
		comp0.setArgument1(comp1);
		comp0.setArgument1(comp2);

		comp1.setArgument1(tl);
		comp1.setArgument2(tl2);
		comp2.setArgument2(tl3);
		comp2.setArgument2(tl4);
		
		
		return pattern;		
	}
	
	
	

	public static List<PatternTestPair> getTestPairs() {
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();

		return testPairs;
	}

}
