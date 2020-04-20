package qualitypatternmodel.translationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.patternstructure.impl.*;
import qualitypatternmodel.testutilityclasses.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.graphstructure.impl.*;
import qualitypatternmodel.operators.*;
import qualitypatternmodel.operators.impl.*;
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
		completePatterns.add(getPatternSelfTwoProps());
//		completePatterns.add(getPatternTwoProps());
//		completePatterns.add(getPatternTwoEs());
//		completePatterns.add(getPatternTwoOps()); // TODO
		
		Test00.test(completePatterns);
	}
	
	public static CompletePattern getPatternSelfTwoProps() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		OperatorsPackage.eINSTANCE.eClass();
		OperatorsFactory operatorFactory = OperatorsFactory.eINSTANCE;

		CompletePattern completePattern = Test00.getBasePattern();
		Element ret = completePattern.getGraph().getElements().get(0);
		
		Property p1 = graphFactory.createProperty();
		Property p2 = graphFactory.createProperty();
		
		Comparison comp = operatorFactory.createComparison();
		
		completePattern.getGraph().getOperatorList().add(comp);
		comp.createParameters();
		ret.getProperties().add(p1);
//		p1.createParameters();
		ret.getProperties().add(p2);
//		p2.createParameters();
		
//		p1.getOption().setValue(PropertyLocation.TAG);
		
		comp.setArgument1(p1);
		comp.setArgument2(p2);
		comp.setType(ReturnType.STRING);
		
		completePattern.createXMLAdaption();
		completePattern.finalizeXMLAdaption();

		return completePattern;
	}

	public static CompletePattern getPatternTwoProps() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		FunctionsPackage.eINSTANCE.eClass();
		FunctionsFactory functionFactory = FunctionsFactory.eINSTANCE;

		CompletePattern completePattern = Test00.getBasePattern();
		Element ret = completePattern.getGraph().getReturnElements().get(0);

		Element se1 = graphFactory.createElement();
		Element se2 = graphFactory.createElement();

		ret.getNextElements().add(se1);
		ret.getNextElements().add(se2);
		
		Property p1 = graphFactory.createProperty();
		Property p2 = graphFactory.createProperty();
		
		Comparison comp = functionFactory.createComparison();
		
		completePattern.getGraph().getOperatorList().add(comp);
		comp.createParameters();
		se1.getProperties().add(p1);
		p1.createParameters();
		se2.getProperties().add(p2);
		p2.createParameters();
		
		p1.getOption().setValue(PropertyLocation.TAG);
		
		comp.setArgument1(p1);
		comp.setArgument2(p2);
		comp.setType(ReturnType.STRING);

		return completePattern;
	}

	public static CompletePattern getPatternTwoEs() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		FunctionsPackage.eINSTANCE.eClass();
		FunctionsFactory functionFactory = FunctionsFactory.eINSTANCE;

		CompletePattern completePattern = Test00.getBasePattern();
		Element ret = completePattern.getGraph().getReturnElements().get(0);

		Element se1 = graphFactory.createElement();
		Element se2 = graphFactory.createElement();

		ret.getNextElements().add(se1);
		ret.getNextElements().add(se2);
		
		Comparison comp = functionFactory.createComparison();
		
		completePattern.getGraph().getOperatorList().add(comp);
		comp.createParameters();
		comp.setArgument1(se1);
		comp.setArgument2(se2);
		
		return completePattern;
	}	

	public static CompletePattern getPatternTwoOps() {
		FunctionsPackage.eINSTANCE.eClass();
		FunctionsFactory functionFactory = FunctionsFactory.eINSTANCE;
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory inputsFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = Test00.getBasePattern();
		ParameterList varlist = completePattern.getParameterList();
		OperatorList oplist = completePattern.getGraph().getOperatorList();
		Element se = completePattern.getGraph().getReturnElements().get(0);
		
//		TextLiteralParam tl = inputsFactory.createTextLiteralParam();
//		tl.setValue("a");
		TextLiteralParam tl2 = inputsFactory.createTextLiteralParam();
		tl2.setValue("a");
		TextLiteralParam tl3 = inputsFactory.createTextLiteralParam();
		tl3.setValue("a");
		TextLiteralParam tl4 = inputsFactory.createTextLiteralParam();
		tl4.setValue("a");

//		varlist.add(tl);
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
		
		se.getPredicates().add(comp0);
		comp0.setArgument1(comp1);
		comp0.setArgument2(comp2);

		comp1.setArgument1(se.addNewProperty());
		comp1.setArgument2(tl2);
		comp2.setArgument1(tl3);
		comp2.setArgument2(tl4);
		
		
		return completePattern;		
	}
	
	
	

	public static List<PatternTestPair> getTestPairs() {
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();

		return testPairs;
	}

}
