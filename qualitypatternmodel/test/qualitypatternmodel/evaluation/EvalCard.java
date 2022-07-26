package qualitypatternmodel.evaluation;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.patternstructure.impl.NumberElementImpl;
import qualitypatternmodel.xmltranslationtests.Test00;
import qualitypatternmodel.xmltranslationtests.Test12Count;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;

public class EvalCard {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCardGeneric());
		completePatterns.add(getCard3Generic());
		completePatterns.add(getCardGenericMidas());
		for (CompletePattern cp: completePatterns)
			System.out.println(cp.myToString());
	}
	
	public static CompletePattern getCardGeneric() throws InvalidityException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		
		// Context graph of pattern:
		completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		
		// First-order logic condition of pattern:
		CountCondition countCondition = PatternstructureFactory.eINSTANCE.createCountCondition();
		completePattern.setCondition(countCondition);
		
		// Graph of quantified condition:
		countCondition.createCountPattern();
		Node element0Copy = countCondition.getCountPattern().getGraph().getReturnNodes().get(0);
		
		element0Copy.addOutgoing().getTarget().makePrimitive();
		
		NumberElementImpl ne = new NumberElementImpl();
		countCondition.setArgument2(ne);
		ne.createParameters();
		
		return completePattern;	
	}
	
	public static CompletePattern getCard3Generic() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory patternStructureFactory = PatternstructureFactory.eINSTANCE;
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		// base pattern
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();;
		
		// add primitive condition to return
		Node returnElementInReturnGraph = completePattern.getGraph().getReturnNodes().get(0);
		returnElementInReturnGraph.addOutgoing().getTarget().addPrimitiveComparison();
				
		// add quantified condition
		QuantifiedCondition quantifiedCondition = patternStructureFactory.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);	
		Graph graph1 = quantifiedCondition.getGraph();
		
		// add complex node with primitive condition
		Node returnG1 = graph1.getReturnNodes().get(0).makeComplex();
		Node e1G1 = returnG1.addOutgoing().getTarget().makeComplex();
		Node e2G1 = e1G1.addOutgoing().getTarget().makePrimitive();
		e2G1.addPrimitiveComparison();
		
		// initialize count pattern
		CountCondition countCondition = patternStructureFactory.createCountCondition();
		quantifiedCondition.setCondition(countCondition);
		CountPattern countPattern = patternStructureFactory.createCountPattern();
		countCondition.setCountPattern(countPattern);

		// intitialize count contition
		NumberElement numberElement = patternStructureFactory.createNumberElement();
		NumberParam numberParam = parametersFactory.createNumberParam();
		numberParam.setValue(1.0);
		numberElement.setNumberParam(numberParam);
		countCondition.getOption().getOptions().add(ComparisonOperator.GREATER);
		countCondition.getOption().setValue(ComparisonOperator.GREATER);		
		countCondition.setArgument2(numberElement);
		
		
		Graph graph2 = countPattern.getGraph();
		Node e1G2 = graph2.getReturnNodes().get(0).makeComplex();
		Node e2G2 = e1G2.addOutgoing().getTarget();
		graph2.getReturnNodes().get(0).setReturnNode(false);
		e2G2.setReturnNode(true);
		Node e3G2 = e2G2.addOutgoing().getTarget();
		e3G2.addPrimitiveComparison();
				
		return completePattern;
	}
	
	public static CompletePattern getCardGenericMidas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory patternStructureFactory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = Test12Count.getPatternCountInPattern();	
		CountCondition condition = (CountCondition) completePattern.getCondition();
		CountPattern countPattern = (CountPattern) condition.getCountPattern();
		
		Node element2InC = countPattern.getGraph().getNodes().get(2).makeComplex();	
		element2InC.addOutgoing().getTarget().addPrimitiveComparison();
		
		Node element3InC = element2InC.addOutgoing().getTarget().makeComplex();
		element3InC.addOutgoing().getTarget().addPrimitiveComparison();
		element3InC.addOutgoing().getTarget().addPrimitiveComparison();
		
		QuantifiedCondition countQCon = patternStructureFactory.createQuantifiedCondition();
		countPattern.setCondition(countQCon);
//		Graph graphCQCon = countQCon.getGraph();
		
		TrueElement trueElement = patternStructureFactory.createTrueElement();
		countQCon.setCondition(trueElement);

		Node element3InCQC = element3InC.getOutgoingMappings().get(0).getTarget();
		
		Node element4InC = element3InCQC.addOutgoing().getTarget();
		Node element5InC = element4InC.addOutgoing().getTarget();
		element5InC.addPrimitiveComparison();		
		
		countPattern.getGraph().getReturnNodes().get(0).setReturnNode(false);;
		element3InC.setReturnNode(true);

		return completePattern;
	}
}
