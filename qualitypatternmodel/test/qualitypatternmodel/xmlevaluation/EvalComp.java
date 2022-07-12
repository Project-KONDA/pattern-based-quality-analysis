package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.OperatorList;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.operators.impl.ComparisonImpl;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlAxisOptionParam;
import qualitypatternmodel.adaptionxml.impl.XmlElementImpl;
import qualitypatternmodel.adaptionxml.impl.XmlElementNavigationImpl;
import qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.parameters.impl.UntypedParameterValueImpl;
import qualitypatternmodel.xmltranslationtests.Test00;
import qualitypatternmodel.xmltranslationtests.Test03Quantor;

public class EvalComp {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCompAbstract());
		completePatterns.add(getCompMidas());
//		Test00.getQueries(completePatterns);
		Test00.test(completePatterns);
		
	}
	public static CompletePattern getCompAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory patternStructureFactory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		OperatorsPackage.eINSTANCE.eClass();
		OperatorsPackage functionsFactory = OperatorsPackage.eINSTANCE;		
		
		CompletePattern completePattern = Test00.getBasePattern();
		
		Graph g1 = completePattern.getGraph();

		Node g1n1 = g1.getReturnNodes().get(0).makeComplex();
		Node g1n2 = g1n1.addOutgoing().getTarget().makePrimitive();
		g1n2.addPrimitiveComparison();
		
		QuantifiedCondition q1 = patternStructureFactory.createQuantifiedCondition();
		completePattern.setCondition(q1);	
		Graph g2 = q1.getGraph();
		Node g2n1 = g2.getReturnNodes().get(0);
		Node g2n3 = g2n1.addOutgoing().getTarget().makeComplex();
		Node g2n4 = g2n3.addOutgoing().getTarget().makePrimitive();
		g2n4.addPrimitiveComparison();

		QuantifiedCondition q2 = patternStructureFactory.createQuantifiedCondition();
		q1.setCondition(q2);	
		Graph g3 = q2.getGraph();
		Node g3n1 = g3.getReturnNodes().get(0);
		Node g3n5 = g3n1.addOutgoing().getTarget().makeComplex();
		Node g3n3 = g3.getNodes().get(2);
		Node g3n4 = g3n3.addOutgoing().getTarget().makePrimitive();
		Node g3n6 = g3n5.addOutgoing().getTarget().makePrimitive();
		Node g3n7 = g3n5.addOutgoing().getTarget().makePrimitive();
		g3n6.addPrimitiveComparison();
		Comparison c = g3n7.addComparison(g3n4);
		c.getTypeOption().setValue(ReturnType.STRING);
				
		
//		CompletePattern completePattern = Test03Quantor.getPatternExistsWithRelationFinal();
//		
//		Graph graph1 = completePattern.getGraph();
//		Graph graph2 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
//		
//		Node n1 = graph1.getNodes().get(0).makeComplex();
//		Node n2 = n1.addOutgoing().getTarget().makePrimitive();
//		n2.addPrimitiveComparison();
//		graph2.getNodes().get(1).addPrimitiveComparison();
//		PrimitiveNode p = graphFactory.createPrimitiveNode(); 
//		graph2.getNodes().get(1).addOutgoing(p);
//		
//		XmlElementImpl e = new XmlElementImpl();
//		graph2.getNodes().add(e);
//		PrimitiveNode p2 = graphFactory.createPrimitiveNode();
//		e.addOutgoing(p2);
//		
//		XmlElementNavigationImpl r = new XmlElementNavigationImpl();
//		graph2.getRelations().add(r);
//		r.setSource(graph2.getNodes().get(0));
//		r.setTarget(e);
//		e.addPrimitiveComparison();
//				
//		OperatorList o = graph2.getOperatorList();
//		Comparison c = new ComparisonImpl();
//		o.add(c);
//		c.createParameters();
//		c.getTypeOption().setValue(ReturnType.STRING);
//		c.setArgument1(p);
//		c.setArgument2(p2);
		
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
		completePattern.createXmlAdaption();
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

		((UntypedParameterValueImpl) params.get(0)).replace(new TextLiteralParamImpl("kue"));
//		((ComparisonOptionParamImpl) params.get(1));
//		((TypeOptionParamImpl) params.get(2));
		((UntypedParameterValueImpl) params.get(3)).replace(new TextLiteralParamImpl("3100"));
//		((ComparisonOptionParamImpl) params.get(4));
//		((TypeOptionParamImpl) params.get(5));
		((UntypedParameterValueImpl) params.get(6)).replace(new TextLiteralParamImpl("3105"));
//		((ComparisonOptionParamImpl) params.get(7));
//		((TypeOptionParamImpl) params.get(8));
//		((ComparisonOptionParamImpl) params.get(9));
//		((TypeOptionParamImpl) params.get(10));
		XmlPathParamImpl p11 = ((XmlPathParamImpl) params.get(11));
		XmlPathParamImpl p12 = ((XmlPathParamImpl) params.get(12));
		XmlPathParamImpl p13 = ((XmlPathParamImpl) params.get(13));
		XmlPathParamImpl p14 = ((XmlPathParamImpl) params.get(14));
		XmlPathParamImpl p15 = ((XmlPathParamImpl) params.get(15));
		XmlPathParamImpl p16 = ((XmlPathParamImpl) params.get(16));
		XmlPathParamImpl p17 = ((XmlPathParamImpl) params.get(17));
		XmlPathParamImpl p18 = ((XmlPathParamImpl) params.get(18));

		p12.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD});
		p13.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD,});
		p15.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD,});

		XmlPathParamImpl[] paths = new XmlPathParamImpl[] {p11, p14, p17};
		for (XmlPathParamImpl p : paths) {
			XmlPropertyOptionParam pop = p.getXmlPropertyOptionParam();
			pop.setValue(XmlPropertyKind.ATTRIBUTE);
			pop.getAttributeName().setValue("Type");	
		}
		
		XmlPathParamImpl[] paths2 = new XmlPathParamImpl[] {p16, p18};
		for (XmlPathParamImpl p : paths2) {
			XmlPropertyOptionParam pop = p.getXmlPropertyOptionParam();
			pop.setValue(XmlPropertyKind.ATTRIBUTE);
			pop.getAttributeName().setValue("Value");	
		}

		
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
