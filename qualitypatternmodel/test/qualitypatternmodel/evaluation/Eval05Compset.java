package qualitypatternmodel.evaluation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UnknownParameterValue;
import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.RelationKind;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.translationtests.Test03Quantor;

public class Eval05Compset {
	public static void main(String[] args) {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCompsetLidoGenderActor());
		Test00.test(completePatterns);
		
	}
	
	public static CompletePattern getCompsetAbstract() {	
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;

		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;		
				
		CompletePattern completePattern = Test03Quantor.getPatternExists();
		TrueElement t = (TrueElement) ((QuantifiedCondition) completePattern.getCondition()).getCondition();
		QuantifiedCondition qc1 = (QuantifiedCondition) completePattern.getCondition(); 
		NotCondition n = factory.createNotCondition();
		QuantifiedCondition qc2 = factory.createQuantifiedCondition();
				
		qc1.setCondition(n);
		n.setCondition(qc2);
		qc2.setCondition(t);
		
		Element e1g0 = completePattern.getGraph().getElements().get(0);
		e1g0.addPrimitiveComparison();
		
		Element e1g1 = qc1.getGraph().getElements().get(0);	
		
		Element e2g1 = qc1.getGraph().getElements().get(1);	
		e2g1.addPrimitiveComparison();
		
		Relation relation = graphFactory.createRelation();
		relation.setGraph(qc1.getGraph());
		relation.setSource(e1g1);
		relation.setTarget(e2g1);
		
		Element e2g2 = qc2.getGraph().getElements().get(1);
		e2g2.addPrimitiveComparison();
		
		completePattern.createXMLAdaption();
		relation.adaptAsXMLNavigation();	
		completePattern.finalizeXMLAdaption();	
		
		return completePattern; 
	}
	
	public static CompletePattern getCompsetConcrete(String returnElementType, RelationKind returnElementAxis, String attribute1Name, PropertyKind attribute1Kind,
			String element2Type, RelationKind element2Axis, String attribute2Name, PropertyKind attribute2Kind, String attribute3Name, PropertyKind attribute3Kind, List<String> values) {	
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getCompsetAbstract();
		
		Element returnElementInReturnGraph = completePattern.getGraph().getElements().get(0);	
		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getOption().setValue(returnElementAxis);
		Comparison comparisonReturnElementInReturnGraph = (Comparison) returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue(returnElementType);
		((UnknownParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).concretize(concreteInputValue);
		if (attribute1Kind == PropertyKind.ATTRIBUTE) {
			((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getAttributeName().setValue(attribute1Name);
		}
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(attribute1Kind);
		
		QuantifiedCondition condition = (QuantifiedCondition) completePattern.getCondition();
		Graph graph1 = condition.getGraph();
		Element nextToReturnElementInGraph1 =  graph1.getElements().get(1);
		
		Comparison comparison1 = (Comparison) nextToReturnElementInGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue1 = parametersFactory.createTextLiteralParam();
		concreteInputValue1.setValue(element2Type);
		((UnknownParameterValue) comparison1.getArguments().get(1)).concretize(concreteInputValue1);
		if (attribute2Kind == PropertyKind.ATTRIBUTE) {
			((XmlProperty) nextToReturnElementInGraph1.getProperties().get(0)).getAttributeName().setValue(attribute2Name);
		}
		((XmlProperty) nextToReturnElementInGraph1.getProperties().get(0)).getOption().setValue(attribute2Kind);
	
		NotCondition notCondition = (NotCondition) condition.getCondition();
		QuantifiedCondition condition2 = (QuantifiedCondition) notCondition.getCondition();
		Graph graph2 = condition2.getGraph();
		Element nextToReturnElementInGraph2 = graph2.getElements().get(1);
		
		Comparison comparison2 = (Comparison) nextToReturnElementInGraph2.getPredicates().get(0);
		TextListParam concreteInputValue2 = parametersFactory.createTextListParam();
		for(String str : values) {
			concreteInputValue2.getValues().add(str);
		}

		((UnknownParameterValue) comparison2.getArguments().get(1)).concretize(concreteInputValue2);
		if (attribute3Kind == PropertyKind.ATTRIBUTE) {
			((XmlProperty) nextToReturnElementInGraph2.getProperties().get(0)).getAttributeName().setValue(attribute3Name);
		}
		((XmlProperty) nextToReturnElementInGraph2.getProperties().get(0)).getOption().setValue(attribute3Kind);		
		
		return completePattern;
	}
	
	public static CompletePattern getCompsetMIDAS3140() {			
		List<String> values = Arrays.asList("m","f","unbekannt","m?","f?","?");		
		return getCompsetConcrete("kue", RelationKind.DESCENDANT, "Type", PropertyKind.ATTRIBUTE, "3140", RelationKind.CHILD, "Type", PropertyKind.ATTRIBUTE, "Value", PropertyKind.ATTRIBUTE, values);
	}
	
	public static CompletePattern getCompsetLidoGenderActor() {			
		List<String> values = Arrays.asList("male","männlich","weiblich","female","unknown","not applicable");		
		return getCompsetConcrete("lido:lido", RelationKind.DESCENDANT, null, PropertyKind.TAG, "lido:genderActor", RelationKind.DESCENDANT, 
				null, PropertyKind.TAG, null, PropertyKind.DATA, values);
	}
}
