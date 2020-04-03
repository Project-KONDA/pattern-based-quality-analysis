package qualitypatternmodel.translationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.testutilityclasses.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.operators.*;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;

public class Test10Reference {

	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternReference());
		completePatterns.add(getPatternReferenceSameProp());		
		Test00.test(completePatterns);
	}

	
	public static CompletePattern getPatternReference() {
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
		
		oplist.add(refop);
		refop.setProperty1(prop1);
		refop.setProperty2(prop2);	
		prop2.getOption().setValue(PropertyLocation.TAG);
		return pattern;		
	}

	
	public static CompletePattern getPatternReferenceSameProp() {
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
		prop2.setAttributeName(prop1.getAttributeName());
		prop2.setOption(prop1.getOption());
		
		oplist.add(refop);
		refop.setProperty1(prop2);	
		refop.setProperty2(prop1);
		return pattern;		
	}
	public static List<PatternTestPair> getTestPairs() {
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();

		return testPairs;
	}

}
