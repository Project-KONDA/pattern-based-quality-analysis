package qualitypatternmodel.translationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.testutility.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.PropertyOptionParam;
import qualitypatternmodel.adaptionxml.AxisKind;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;

public class Test07Formula {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		
		for (LogicalOperator lo: LogicalOperator.VALUES) {
			completePatterns.add(getFormulaPatternConcrete(lo));
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

		Node e0qc1 = qc1.getGraph().getNodes().get(0);
		Node e1 = graphFactory.createNode();
		e1.setGraph(qc1.getGraph());
		Relation relation1 = graphFactory.createRelation();
		relation1.setGraph(qc1.getGraph());
		relation1.setSource(e0qc1);
		relation1.setTarget(e1);
		
		Node e0qc2 = qc2.getGraph().getNodes().get(0);
		Node e2 = graphFactory.createNode();
		e2.setGraph(qc2.getGraph());
		Relation relation2 = graphFactory.createRelation();
		relation2.setGraph(qc2.getGraph());
		relation2.setSource(e0qc2);
		relation2.setTarget(e2);
	
		completePattern.createXMLAdaption();
		
		qc1.getGraph().getRelations().get(0).adaptAsXMLElementNavigation();
		XmlReference ref = qc2.getGraph().getRelations().get(0).adaptAsXMLReference();
		ref.setType(ReturnType.STRING);		
		
		return completePattern;
	}
	
	public static CompletePattern getFormulaPatternConcrete(LogicalOperator op) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = getFormulaPattern(op);
		
		((XmlElementNavigation) pattern.getGraph().getRelations().get(0)).getXmlPathParam().setAxis(AxisKind.DESCENDANT, null);
		QuantifiedCondition q1 = ((QuantifiedCondition)((Formula) pattern.getCondition()).getCondition2());
		PropertyOptionParam property = ((XmlPropertyNavigation) q1.getGraph().getRelations().get(3)).getXmlPathParam().getPropertyOptionParam();
		property.setValue(PropertyKind.ATTRIBUTE);
		property.getAttributeName().setValue("demo:id");		
		
		return pattern;		
	}
	
	
	
	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();

		testPairs.add(new PatternTestPair("AND", getFormulaPatternConcrete(LogicalOperator.AND), "/*/*[ ./* and ./@*[name()=\"demo:id\"]=/*/*/*/data()]"));
		testPairs.add(new PatternTestPair("OR", getFormulaPatternConcrete(LogicalOperator.OR), "/*/*[ ./* or ./@*[name()=\"demo:id\"]=/*/*/*/data()]"));
		testPairs.add(new PatternTestPair("IMPLIES", getFormulaPatternConcrete(LogicalOperator.IMPLIES), "/*/*[ not(./*) or ./@*[name()=\"demo:id\"]=/*/*/*/data()]"));
		testPairs.add(new PatternTestPair("XOR", getFormulaPatternConcrete(LogicalOperator.XOR), "/*/* [ not(./*) = (./@*[name()=\"demo:id\"]=/*/*/*/data())]"));
		testPairs.add(new PatternTestPair("EQUAL", getFormulaPatternConcrete(LogicalOperator.EQUAL), "/*/* [ exists(./*) = (./@*[name()=\"demo:id\"]=/*/*/*/data())]"));
				
		return testPairs;		
	}

}
