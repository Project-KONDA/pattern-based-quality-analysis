package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.operators.FunctionsFactory;
import qualitypatternmodel.operators.FunctionsPackage;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.translationtests.Test03Quantor;

public class Eval02Mandstruc {
	public static void main(String[] args) {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getMandstrucAbstract());
		Test00.test(completePatterns);
		
	}
	public static CompletePattern getMandstrucAbstract() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		FunctionsPackage.eINSTANCE.eClass();
		FunctionsFactory functionsFactory = FunctionsFactory.eINSTANCE;		
		
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory patternstructureFactory = PatternstructureFactory.eINSTANCE;		
		
		CompletePattern completePattern = Test03Quantor.getPatternExists();
		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);			
		returnElementInReturnGraph.addPrimitiveComparison(); 
		
		NotCondition notCondition = patternstructureFactory.createNotCondition();
		completePattern.setCondition(notCondition);
		
		Formula formula = patternstructureFactory.createFormula();
		formula.setOperator(LogicalOperator.OR);
		notCondition.setCondition(formula);
		
		QuantifiedCondition quantifiedCondition1 = patternstructureFactory.createQuantifiedCondition();		
		formula.setCondition1(quantifiedCondition1);
		QuantifiedCondition quantifiedCondition2 = patternstructureFactory.createQuantifiedCondition();
		formula.setCondition2(quantifiedCondition2);
		TrueElement t1 = patternstructureFactory.createTrueElement();
		quantifiedCondition1.setCondition(t1);
		TrueElement t2 = patternstructureFactory.createTrueElement();
		quantifiedCondition2.setCondition(t2);
		
		Graph graph1 = quantifiedCondition1.getGraph();
		Element element1 = graphFactory.createElement();
		graph1.getReturnElements().get(0).getNextElements().add(element1);
		element1.addPrimitiveComparison();
		
		Graph graph2 = quantifiedCondition2.getGraph();
		Element element2 = graphFactory.createElement();
		graph2.getReturnElements().get(0).getNextElements().add(element2);
		element2.addPrimitiveComparison();		
		
		return completePattern;
	}
}
