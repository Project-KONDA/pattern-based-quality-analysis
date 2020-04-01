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
import qualitypatternmodel.parameters.impl.*;

public class Test10Reference {

	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(Test00.concretize(getPatternReference()));
		Test00.test(completePatterns);
	}

	
	public static CompletePattern getPatternReference() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;		
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;		
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;
		OperatorsPackage.eINSTANCE.eClass();
		OperatorsFactory operatorFactory = OperatorsFactory.eINSTANCE;
		
		
		CompletePattern pattern = Test03Quantor.getPatternExists();
		Graph graph = ((QuantifiedCondition) pattern.getCondition()).getGraph();
		OperatorList oplist = graph.getOperatorList();
		Element ret = graph.getReturnElements().get(0);
		Element ele = ret.getNextElements().get(0);
		
		ReferenceOperator refop = operatorFactory.createReferenceOperator();

		Property prop1 = graphstructureFactory.createProperty();		
		prop1.setElement(ret);
		prop1.createParameters();
		
		Property prop2 = graphstructureFactory.createProperty();		
		prop2.setElement(ele);
		prop2.createParameters();
		
//		PropertyOptionParam proppa = parametersFactory.createPropertyOptionParam();
//		PropertyOptionParam proppa2 = parametersFactory.createPropertyOptionParam();
		oplist.add(refop);
//		prop1.setOption(proppa);
//		prop2.setOption(proppa2);	
//		ret.getProperties().add(prop1);
//		ret.getProperties().add(prop2);
		refop.setProperty1(prop1);
		refop.setProperty2(prop2);	
		return pattern;		
	}

	public static List<PatternTestPair> getTestPairs() {
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();

		return testPairs;
	}

}
