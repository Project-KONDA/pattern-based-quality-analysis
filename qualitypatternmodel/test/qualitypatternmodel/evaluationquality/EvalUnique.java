package qualitypatternmodel.evaluationquality;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;
import qualitypatternmodel.patternstructure.impl.NumberElementImpl;
import qualitypatternmodel.xmltranslationtests.Test00;

public class EvalUnique {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();

		completePatterns.add(getUniqueGeneric());
		
		for (CompletePattern cp: completePatterns)
			Test00.printGenericPatternExampleXQuery(cp);
//			System.out.println(cp.myToString());
	}
	
	public static CompletePattern getUniqueGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();	
		
		QuantifiedCondition quantifiedCondition = factory.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);
		
		
		
		
		CountCondition countCondition = PatternstructureFactory.eINSTANCE.createCountCondition();
		quantifiedCondition.setCondition(countCondition);
		countCondition.createCountPattern();
		CountPattern countPattern = countCondition.getCountPattern(); 
		NumberElementImpl numberElement = new NumberElementImpl();
		countCondition.setArgument2(numberElement);
		numberElement.createParameters();
		numberElement.getNumberParam().setValue(1.);
		countCondition.getOption().setValue(ComparisonOperator.GREATER);
		
		
		NumberParam numberParam = numberElement.getNumberParam();
		
		numberParam.setValue(1.0);
		countCondition.getOption().getOptions().add(ComparisonOperator.GREATER);
		countCondition.getOption().setValue(ComparisonOperator.GREATER);	
				
		Graph g0 = completePattern.getGraph();
		Graph g1 = quantifiedCondition.getGraph();
		Graph g2 = countPattern.getGraph();
		
		Node ret = g0.getReturnNodes().get(0).makeComplex();
		Node e1 = ret.addOutgoing(g1).getTarget().makePrimitive();
		
		Node g2base = g2.addComplexNode();
		Node g2return = g2base.addOutgoing().getTarget().makePrimitive();
		g2return.setReturnNode(true);
		
		Comparison c = g2return.addComparison(e1);
		c.getTypeOption().setValue(ReturnType.STRING);
		
		return completePattern;
	}

	
	//Added this new to the GENERIC ones
	public static CompletePattern getUniqueCondExistsGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		
		QuantifiedCondition quantifiedCondition = factory.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);
		quantifiedCondition.getGraph().addComplexNode();
		quantifiedCondition.setQuantifier(Quantifier.EXISTS);
		
		PrimitiveNode primitiveNode1 = quantifiedCondition.getGraph().addPrimitiveNode();
		ComplexNode complexNode1 = (ComplexNode) quantifiedCondition.getGraph().getNodes().get(0).makeComplex();
		quantifiedCondition.getGraph().addRelation(complexNode1, primitiveNode1);
		
		PrimitiveNode primitiveNode2 = quantifiedCondition.getGraph().addPrimitiveNode();
		ComplexNode complexNode2 = (ComplexNode) quantifiedCondition.getGraph().getNodes().get(0);
		quantifiedCondition.getGraph().addRelation(complexNode2, primitiveNode2);
		
		ComparisonOptionParam comparisonOptionParam1 = new ComparisonOptionParamImpl();
		comparisonOptionParam1.setValue(ComparisonOperator.NOTEQUAL);
		Comparison comparison1 = complexNode1.addComparison(complexNode2);
		comparison1.setOption(comparisonOptionParam1);
		
		primitiveNode1.addComparison(primitiveNode2);
		
		return completePattern;
	}
}
