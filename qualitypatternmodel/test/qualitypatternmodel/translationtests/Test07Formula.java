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
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.*;
import qualitypatternmodel.parameters.impl.*;

public class Test07Formula {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		
		for (LogicalOperator lo: LogicalOperator.VALUES) {
			completePatterns.add(getFormulaPattern(lo));
		}

		Test00.test(completePatterns);
	}
	
	public static CompletePattern getFormulaPattern(LogicalOperator op) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		Formula form = factory.createFormula();
		completePattern.setCondition(form);
		form.setOperator(op);

		QuantifiedCondition qc1 = factory.createQuantifiedCondition();
		TrueElement te1 = factory.createTrueElement();
		QuantifiedCondition qc2 = factory.createQuantifiedCondition();
		TrueElement te2 = factory.createTrueElement();
		
		form.setCondition1(qc1);
		qc1.setCondition(te1);
		form.setCondition2(qc2);
		qc2.setCondition(te2);

		Element e0qc1 = qc1.getGraph().getElements().get(0);
		Element e1 = graphFactory.createElement();
		e1.setGraph(qc1.getGraph());
		Relation relation1 = graphFactory.createRelation();
		relation1.setGraph(qc1.getGraph());
		relation1.setSource(e0qc1);
		relation1.setTarget(e1);
		
		Element e0qc2 = qc2.getGraph().getElements().get(0);
		Element e2 = graphFactory.createElement();
		e2.setGraph(qc2.getGraph());
		Relation relation2 = graphFactory.createRelation();
		relation2.setGraph(qc2.getGraph());
		relation2.setSource(e0qc2);
		relation2.setTarget(e2);
	
		completePattern.createXMLAdaption();
		
		qc1.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		XmlReference ref = qc2.getGraph().getRelations().get(0).adaptAsXMLReference();
		ref.setType(ReturnType.STRING);		
		
		completePattern.finalizeXMLAdaption();	
		
		return completePattern;
	}
	
	
	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();

		for (LogicalOperator lo: LogicalOperator.VALUES) {
			testPairs.add(new PatternTestPair(lo.toString(), getFormulaPattern(lo), ""));
		}		
		
		// TODO: complete test cases
		
		return testPairs;		
	}

}
