package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.OperatorList;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.operators.impl.ComparisonImpl;
import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.RelationKind;
import qualitypatternmodel.adaptionxml.impl.XmlElementImpl;
import qualitypatternmodel.adaptionxml.impl.XmlNavigationImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.PropertyOptionParam;
import qualitypatternmodel.parameters.RelationOptionParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.translationtests.Test03Quantor;

public class EvalComp {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
//		completePatterns.add(getCompAbstract());
		completePatterns.add(getCompMidas());
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);
		
	}
	public static CompletePattern getCompAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		OperatorsPackage.eINSTANCE.eClass();
		OperatorsPackage functionsFactory = OperatorsPackage.eINSTANCE;		
		
		CompletePattern completePattern = Test03Quantor.getPatternExistsWithRelationFinal();
		
		Graph graph1 = completePattern.getGraph();
		Graph graph2 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
		
		graph1.getElements().get(0).addPrimitiveComparison();
		graph2.getElements().get(1).addPrimitiveComparison();
		Property p = graph2.getElements().get(1).addNewProperty();
		
		XmlElementImpl e = new XmlElementImpl();
		graph2.getElements().add(e);
		Property p2 = e.addNewProperty();
		
		XmlNavigationImpl r = new XmlNavigationImpl();
		graph2.getRelations().add(r);
		r.setSource(graph2.getElements().get(0));
		r.setTarget(e);
		e.addPrimitiveComparison();
				
		OperatorList o = graph2.getOperatorList();
		Comparison c = new ComparisonImpl();
		o.add(c);
		c.createParameters();
		c.getTypeOption().setValue(ReturnType.STRING);
		c.setArgument1(p);
		c.setArgument2(p2);
		
//		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);			
//		returnElementInReturnGraph.addPrimitiveComparison(); 
//		
//		
//		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
//		Element returnElementInGraph1 = graph1.getReturnElements().get(0);	
//		
//		Element next1 = returnElementInGraph1.getNextElements().get(0);	
//		next1.addPrimitiveComparison();
//		Property property1 = graphFactory.createProperty();		
//		property1.setElement(next1);
//		property1.createParameters();
//		
//		Element next2 = graphFactory.createElement();
//		returnElementInGraph1.getNextElements().add(next2);
//		next2.addPrimitiveComparison();
//		Property property2 = graphFactory.createProperty();
//		property2.setElement(next2);
//		property2.createParameters();
//		
//		Comparison comparison = functionsFactory.createComparison();
//		graph1.getOperatorList().add(comparison);		
//		comparison.createParameters();
//		comparison.setArgument1(property1);
//		comparison.setArgument2(property2);		
		
		return completePattern;		
	}
	
	public static CompletePattern getCompMidas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		ParametersPackage.eINSTANCE.eClass();
//		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getCompAbstract();
		
		EList<Parameter> params = completePattern.getParameterList().getParameters();
		
//		completePattern.myToString();
//		for (int i = 0; i<params.size(); i++) {
//			System.out.println(params.get(i).myToString());			
//		}

		((UntypedParameterValue) params.get(17)).replace(new TextLiteralParamImpl("3105"));
		((TextLiteralParam) params.get(16)).setValue("Type");
		((PropertyOptionParam) params.get(15)).setValue(PropertyKind.ATTRIBUTE);		
		((TextLiteralParam) params.get(13)).setValue("Value");
		((PropertyOptionParam) params.get(12)).setValue(PropertyKind.ATTRIBUTE);
		((TextLiteralParam) params.get(11)).setValue("Value");
		((PropertyOptionParam) params.get(10)).setValue(PropertyKind.ATTRIBUTE);
		((UntypedParameterValue) params.get(8)).replace(new TextLiteralParamImpl("3100"));
		((TextLiteralParam) params.get(7)).setValue("Type");
		((PropertyOptionParam) params.get(6)).setValue(PropertyKind.ATTRIBUTE);
		((UntypedParameterValue) params.get(4)).replace(new TextLiteralParamImpl("kue"));
		((TextLiteralParam) params.get(3)).setValue("Type");
		((PropertyOptionParam) params.get(2)).setValue(PropertyKind.ATTRIBUTE);
		((RelationOptionParam) params.get(1)).setValue(RelationKind.THREECHILD);
		
//		completePattern.myToString();
//		Graph returnGraph = completePattern.getGraph();
//		Element returnElementInReturnGraph = returnGraph.getReturnElements().get(0);
		
		
//		returnElementInReturnGraph.getRelationFromPrevious().getOption().setValue(RelationKind.DESCENDANT);
		
//		Comparison comparisonReturnElementInReturnGraph = (Comparison) returnElementInReturnGraph.getPredicates().get(0);
//		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
//		concreteInputValue.setValue("kue");
//		((UnknownParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).concretize(concreteInputValue);
//		returnElementInReturnGraph.getProperties().get(0).getAttributeName().setValue("Type");
//		returnElementInReturnGraph.getProperties().get(0).getOption().setValue(PropertyKind.ATTRIBUTE);
//		
//		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
//		Element returnElementInGraph1 = graph1.getReturnElements().get(0);
//		Element next1ToReturnElementInGraph1 = returnElementInGraph1.getNextElements().get(0);	
//		Element next2ToReturnElementInGraph1 = returnElementInGraph1.getNextElements().get(1);	
//
//		Comparison comparison1 = (Comparison) next1ToReturnElementInGraph1.getPredicates().get(0);
//		TextLiteralParam concreteInputValue1 = parametersFactory.createTextLiteralParam();
//		concreteInputValue1.setValue("3100");
//		((UnknownParameterValue) comparison1.getArguments().get(1)).concretize(concreteInputValue1);
//		next1ToReturnElementInGraph1.getProperties().get(0).getAttributeName().setValue("Type");
//		next1ToReturnElementInGraph1.getProperties().get(0).getOption().setValue(PropertyKind.ATTRIBUTE);
//		next1ToReturnElementInGraph1.getProperties().get(1).getAttributeName().setValue("Value");
//		next1ToReturnElementInGraph1.getProperties().get(1).getOption().setValue(PropertyKind.ATTRIBUTE);
//		
//		Comparison comparison2 = (Comparison) next2ToReturnElementInGraph1.getPredicates().get(0);
//		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
//		concreteInputValue2.setValue("3105");
//		((UnknownParameterValue) comparison2.getArguments().get(1)).concretize(concreteInputValue2);
//		next2ToReturnElementInGraph1.getProperties().get(0).getAttributeName().setValue("Type");
//		next2ToReturnElementInGraph1.getProperties().get(0).getOption().setValue(PropertyKind.ATTRIBUTE);
//		next2ToReturnElementInGraph1.getProperties().get(1).getAttributeName().setValue("Value");
//		next2ToReturnElementInGraph1.getProperties().get(1).getOption().setValue(PropertyKind.ATTRIBUTE);
//		
//		Comparison comparison3 = (Comparison) next2ToReturnElementInGraph1.getPredicates().get(1);
//		comparison3.setType(ReturnType.STRING);

				
		return completePattern;
	}
}
