package qualitypatternmodel.evaluationquality;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.xmltranslationtests.Test00;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.ParameterList;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;

public class EvalMatch {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		
		completePatterns.add(getMatchGeneric());
//		completePatterns.add(getMatch3Generic());
		
		for (CompletePattern cp: completePatterns)
			Test00.printGenericPatternExampleXQuery(cp);
//			System.out.println(cp.myToString());
	}
	
	public static CompletePattern getMatchGeneric() throws InvalidityException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		
		completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);
		
		Node ret  = completePattern.getGraph().getReturnNodes().get(0);
		Node element1 = ret.addOutgoing(quantifiedCondition.getGraph()).getTarget().makePrimitive();
		element1.addPrimitiveMatch();
		
		return completePattern;	
	}
	
	public static CompletePattern getMatch3Generic() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		
		QuantifiedCondition qc = factory.createQuantifiedCondition();
		completePattern.setCondition(qc);
		Graph g1 = qc.getGraph();
		
		Node ret = completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		Node node1 = ret.addOutgoing(g1).getTarget().makeComplex();
		Node node2 = node1.addOutgoing().getTarget().makeComplex();
		node2.addOutgoing().getTarget().addPrimitiveMatch();

		return completePattern;
	}
	
	public static CompletePattern getGenericWrongFormat() throws InvalidityException {
		CompletePattern completePattern = getMatchGeneric();
		ParameterList paramters = completePattern.getParameterList();
		BooleanParam booleanParam = (BooleanParam) paramters.getParameters().get(0);
		booleanParam.setValue(false);
		return completePattern;
	}

}
