package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.translationtests.Test00;

public class Eval08Mandatt {
	public static void main(String[] args) {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getMandattAbstract());
		Test00.test(completePatterns);
		
	}
	
	private static CompletePattern getMandattAbstract() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		Formula form = factory.createFormula();
		completePattern.setCondition(form);
		form.setOperator(LogicalOperator.OR);
		
		NotCondition notC = factory.createNotCondition();
		QuantifiedCondition qcN = factory.createQuantifiedCondition();
		TrueElement te1 = factory.createTrueElement();
		form.setCondition1(notC);
		notC.setCondition(qcN);
		qcN.setCondition(te1);		
		
		Graph graph1 = qcN.getGraph();
		Element returnInGraph1 = graph1.getReturnElements().get(0);
		Element element2 = graphFactory.createElement();
		element2.setPreviousElement(returnInGraph1);
		element2.addPrimitiveComparison();
		
		QuantifiedCondition qc1 = factory.createQuantifiedCondition();
		TrueElement te2 = factory.createTrueElement();
		form.setCondition2(qc1);
		qc1.setCondition(te2);
		
		Graph graph2 = qc1.getGraph();
		Element returnInGraph2 = graph2.getReturnElements().get(0);
		Element element3 = graphFactory.createElement();
		element3.setPreviousElement(returnInGraph2);
		element3.addPrimitiveComparison();
		element3.addPrimitiveComparison();	
		
		return completePattern;		
	}
}
