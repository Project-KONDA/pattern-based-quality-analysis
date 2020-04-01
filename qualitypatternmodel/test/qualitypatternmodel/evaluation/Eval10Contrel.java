package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.FunctionsFactory;
import qualitypatternmodel.operators.FunctionsPackage;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.translationtests.Test00;

public class Eval10Contrel {
	public static void main(String[] args) {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getContrelAbstract());
		Test00.test(completePatterns);		
	}
	
	public static CompletePattern getContrelAbstract() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		FunctionsPackage.eINSTANCE.eClass();
		FunctionsFactory functionsFactory = FunctionsFactory.eINSTANCE;		
		
		CompletePattern pattern = factory.createCompletePattern();
		pattern.getGraph().getReturnElements().get(0).addPrimitiveComparison();
		QuantifiedCondition qc = factory.createQuantifiedCondition();
		pattern.setCondition(qc);
		TrueElement trueElement = factory.createTrueElement();
		qc.setCondition(trueElement);
		
		Graph graph = qc.getGraph();		
		
		Element returnInG = graph.getReturnElements().get(0);
		Element id1 = graphFactory.createElement();
		id1.setPreviousElement(returnInG);
		id1.addPrimitiveComparison();
		Property id1Prop = graphFactory.createProperty();
		id1Prop.setElement(id1);
		id1Prop.createParameters();
		Element ref1 = graphFactory.createElement();
		ref1.setPreviousElement(returnInG);
		ref1.addPrimitiveComparison();
		Property ref1Prop = graphFactory.createProperty();
		ref1Prop.setElement(ref1);
		ref1Prop.createParameters();
		Element val1 = graphFactory.createElement();
		val1.setPreviousElement(ref1);
		val1.addPrimitiveComparison();
		Property val1Prop = graphFactory.createProperty();
		val1Prop.setElement(val1);
		val1Prop.createParameters();
		
		Element element2 = graphFactory.createElement();
		element2.setPreviousElement(graph.getRootElement());
		Element id2 = graphFactory.createElement();
		id2.setPreviousElement(element2);
		id2.addPrimitiveComparison();
		Property id2Prop = graphFactory.createProperty();
		id2Prop.setElement(id2);
		id2Prop.createParameters();
		Element ref2 = graphFactory.createElement();
		ref2.setPreviousElement(element2);
		ref2.addPrimitiveComparison();
		Property ref2Prop = graphFactory.createProperty();
		ref2Prop.setElement(ref2);
		ref2Prop.createParameters();
		Element val2 = graphFactory.createElement();
		val2.setPreviousElement(ref2);
		val2.addPrimitiveComparison();
		Property val2Prop = graphFactory.createProperty();
		val2Prop.setElement(val2);
		val2Prop.createParameters();
				
		Comparison compId1Val2 = functionsFactory.createComparison();
		graph.getOperatorList().add(compId1Val2);		
		compId1Val2.createParameters();
		compId1Val2.setArgument1(id1Prop);
		compId1Val2.setArgument2(val2Prop);
		compId1Val2.setType(ReturnType.STRING);
		Comparison compId2Val1 = functionsFactory.createComparison();
		graph.getOperatorList().add(compId2Val1);
		compId2Val1.createParameters();
		compId2Val1.setArgument1(id2Prop);
		compId2Val1.setArgument2(val1Prop);
		compId2Val1.setType(ReturnType.STRING);
		Comparison compRefValue = functionsFactory.createComparison();
		graph.getOperatorList().add(compRefValue);
		compRefValue.createParameters();
		compRefValue.setArgument1(ref1Prop);
		compRefValue.setArgument2(ref2Prop);
		compRefValue.setType(ReturnType.STRING);	
		compRefValue.getOption().setValue(ComparisonOperator.NOTEQUAL);		
		
		return pattern;
	}
}
