package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.functions.FunctionsFactory;
import qualitypatternmodel.functions.FunctionsPackage;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.NotElement;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.translationtests.Test03Quantor;

public class Eval02Mandstruc {
	public static void main(String[] args) {
		ArrayList<Pattern> patterns = new ArrayList<Pattern>();
		patterns.add(getMandstrucAbstract());
		Test00.test(patterns);
		
	}
	public static Pattern getMandstrucAbstract() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		FunctionsPackage.eINSTANCE.eClass();
		FunctionsFactory functionsFactory = FunctionsFactory.eINSTANCE;		
		
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory patternstructureFactory = PatternstructureFactory.eINSTANCE;		
		
		Pattern pattern = Test03Quantor.getPatternExists();
		Element returnElementInReturnGraph = pattern.getGraph().getReturnElements().get(0);			
		returnElementInReturnGraph.addPrimitiveComparison(); 
		
		NotElement notElement = patternstructureFactory.createNotElement();
		pattern.setCondition(notElement);
		
		Formula formula = patternstructureFactory.createFormula();
		formula.setOperator(LogicalOperator.OR);
		notElement.setCondition(formula);
		
		QuantifiedCondition quantifiedCondition1 = patternstructureFactory.createQuantifiedCondition();		
		formula.setCondition(quantifiedCondition1);
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
		
		return pattern;
	}
}
