package qualitypatternmodel.evaluation;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlAxisOptionParam;
import qualitypatternmodel.adaptionxml.impl.XmlPropertyOptionParamImpl;
import qualitypatternmodel.adaptionxml.impl.XmlAxisOptionParamImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.graphstructure.impl.RelationImpl;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.OperatorList;
import qualitypatternmodel.operators.impl.ComparisonImpl;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.OptionParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl;
import qualitypatternmodel.parameters.impl.NumberParamImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.parameters.impl.UntypedParameterValueImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountConditionArgument;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.MorphismContainer;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.patternstructure.impl.CountConditionImpl;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.translationtests.Test06NotElement;

public class EvalAppdupl {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCARD3Midas());
		Test00.test(completePatterns);
		
	}
	
	static CompletePattern getCARD3Abstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphfactory = GraphstructureFactory.eINSTANCE;
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory paramFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = Test00.getBasePattern();
		Graph g0 = completePattern.getGraph();
		g0.getNodes().get(0).setName("First");
		g0.getNodes().get(0).addPrimitiveComparison("wer");
		
		CountCondition cc = factory.createCountCondition();
		completePattern.setCondition(cc);
		CountPattern cp = factory.createCountPattern();
		cc.setCountPattern(cp);
		NumberElement ne = factory.createNumberElement();
		ne.setNumberParam(paramFactory.createNumberParam());
		cc.setArgument2(ne);
		
		Graph cpg = cp.getGraph();
		Node e = graphfactory.createNode();
		cpg.getNodes().add(e);
		cpg.getReturnNodes().clear();
		cpg.getReturnNodes().add(e);
		e.addPrimitiveComparison("wer");
		e.setName("Counted");

		QuantifiedCondition cpqc = factory.createQuantifiedCondition();
		cp.setCondition(cpqc);
		Graph cpqcg = cpqc.getGraph();		
		Node e1 = cpqcg.getNodes().get(0);
		Node e2 = cpqcg.getNodes().get(1);
		
		TrueElement trueElement = factory.createTrueElement();
		cpqc.setCondition(trueElement);

		Node e1a = graphfactory.createNode();
		e1a.setGraph(cpqcg);
		cpqcg.addRelation(e1, e1a);
		PrimitiveNode e1ap = graphfactory.createPrimitiveNode();
		e1a.addOutgoing(e1ap);
		
		e1a.addPrimitiveComparison();
		e1a.setName("1A");		
		Node e1b = graphfactory.createNode();
		e1b.setGraph(cpqcg);
		cpqcg.addRelation(e1, e1b);
		PrimitiveNode e1bp = graphfactory.createPrimitiveNode();
		e1b.addOutgoing(e1bp);
		
		e1b.addPrimitiveComparison();
		e1b.setName("1B");		
		Node e1c = graphfactory.createNode();
		e1c.setGraph(cpqcg);
		cpqcg.addRelation(e1, e1c);
		PrimitiveNode e1cp = graphfactory.createPrimitiveNode();
		e1c.addOutgoing(e1cp);
		e1c.addPrimitiveComparison();
		e1c.setName("1C");
		Node e2a = graphfactory.createNode();
		e2a.setGraph(cpqcg);
		cpqcg.addRelation(e2, e2a);
		PrimitiveNode e2ap = graphfactory.createPrimitiveNode();
		e2a.addOutgoing(e2ap);
		e2a.addPrimitiveComparison();
		e2a.setName("2A");
		Node e2b = graphfactory.createNode();
		e2b.setGraph(cpqcg);
		cpqcg.addRelation(e2, e2b);
		PrimitiveNode e2bp = graphfactory.createPrimitiveNode();
		e2b.addOutgoing(e2bp);
		e2b.addPrimitiveComparison();
		e2b.setName("2B");
		Node e2c = graphfactory.createNode();
		e2c.setGraph(cpqcg);
		cpqcg.addRelation(e2, e2c);
		PrimitiveNode e2cp = graphfactory.createPrimitiveNode();
		e2c.addOutgoing(e2cp);
		e2c.addPrimitiveComparison();
		e2c.setName("2C");
		

		OperatorList ol = cpqcg.getOperatorList();
		Comparison cea = new ComparisonImpl();
		ol.add(cea);
		cea.createParameters();
		cea.setArgument1(e1ap);
		cea.setArgument2(e2ap);
		cea.getTypeOption().setValue(ReturnType.STRING);
		Comparison ceb = new ComparisonImpl();
		ol.add(ceb);
		ceb.createParameters();
		ceb.setArgument1(e1bp);
		ceb.setArgument2(e2bp);
		ceb.getTypeOption().setValue(ReturnType.STRING);
		Comparison cec = new ComparisonImpl();
		ol.add(cec);
		cec.createParameters();
		cec.setArgument1(e1cp);
		cec.setArgument2(e2cp);
		cec.getTypeOption().setValue(ReturnType.STRING);
		
		
//		System.out.println(completePattern.myToString());
		
		completePattern.createXMLAdaption();
		EList<Relation> rels1 = cpqcg.getRelations();
		for (int i = rels1.size()-1; i>=0; i--) rels1.get(i).adaptAsXmlElementNavigation();
		completePattern.finalizeXMLAdaption();	
		
//		for (int i = completePattern.getParameterList().getParameters().size()-1; i>=0; i--) {
//			System.out.print("((" + completePattern.getParameterList().getParameters().get(i).getClass().getSimpleName() + ") params.get(" + i + "))");
//			switch(completePattern.getParameterList().getParameters().get(i).getClass().getSimpleName()) {
//			case "RelationOptionParamImpl": System.out.println(".setValue(RelationKind.TWOCHILD);");
//			break;
//			case "ComparisonOptionParamImpl": System.out.println(".setValue(ComparisonOperator.EQUAL);");
//			break;
//			case "UnknownParameterValueImpl": System.out.println(".setValue(\"3680\");");	
//			break;
//			case "TextLiteralParamImpl": System.out.println(".setValue(\"Type\");");
//			break;
//			case "NumberParamImpl": System.out.println(".setValue(1.);");
//			break;
//			case "PropertyOptionParamImpl" : System.out.println(".setValue(PropertyKind.ATTRIBUTE);");
//			break;
//			}			
//		}
		
		return completePattern;		
	}
	
	
	static CompletePattern getCARD3Midas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getCARD3Abstract();
		
		EList<Parameter> params = completePattern.getParameterList().getParameters();
		((XmlAxisOptionParamImpl) params.get(67)).setValue(XmlAxisKind.THREECHILD);
		((XmlAxisOptionParamImpl) params.get(66)).setValue(XmlAxisKind.THREECHILD);
		((TextLiteralParamImpl) params.get(59)).setValue("Type");
		((XmlPropertyOptionParamImpl) params.get(58)).setValue(XmlPropertyKind.ATTRIBUTE);
		((TextLiteralParamImpl) params.get(57)).setValue("Value");
		((XmlPropertyOptionParamImpl) params.get(56)).setValue(XmlPropertyKind.ATTRIBUTE);
		((TextLiteralParamImpl) params.get(55)).setValue("Type");
		((XmlPropertyOptionParamImpl) params.get(54)).setValue(XmlPropertyKind.ATTRIBUTE);
		((TextLiteralParamImpl) params.get(53)).setValue("Value");
		((XmlPropertyOptionParamImpl) params.get(52)).setValue(XmlPropertyKind.ATTRIBUTE);
		((TextLiteralParamImpl) params.get(51)).setValue("Type");
		((XmlPropertyOptionParamImpl) params.get(50)).setValue(XmlPropertyKind.ATTRIBUTE);
		((TextLiteralParamImpl) params.get(49)).setValue("Value");
		((XmlPropertyOptionParamImpl) params.get(48)).setValue(XmlPropertyKind.ATTRIBUTE);
		((TextLiteralParamImpl) params.get(47)).setValue("Type");
		((XmlPropertyOptionParamImpl) params.get(46)).setValue(XmlPropertyKind.ATTRIBUTE);
		((TextLiteralParamImpl) params.get(45)).setValue("Value");
		((XmlPropertyOptionParamImpl) params.get(44)).setValue(XmlPropertyKind.ATTRIBUTE);
		((TextLiteralParamImpl) params.get(43)).setValue("Type");
		((XmlPropertyOptionParamImpl) params.get(42)).setValue(XmlPropertyKind.ATTRIBUTE);
		((TextLiteralParamImpl) params.get(41)).setValue("Value");
		((XmlPropertyOptionParamImpl) params.get(40)).setValue(XmlPropertyKind.ATTRIBUTE);
		((TextLiteralParamImpl) params.get(39)).setValue("Type");
		((XmlPropertyOptionParamImpl) params.get(38)).setValue(XmlPropertyKind.ATTRIBUTE);
		((TextLiteralParamImpl) params.get(37)).setValue("Value");
		((XmlPropertyOptionParamImpl) params.get(36)).setValue(XmlPropertyKind.ATTRIBUTE);
		((TextLiteralParamImpl) params.get(35)).setValue("Type");
		((XmlPropertyOptionParamImpl) params.get(34)).setValue(XmlPropertyKind.ATTRIBUTE);
		((TextLiteralParamImpl) params.get(33)).setValue("Type");
		((XmlPropertyOptionParamImpl) params.get(32)).setValue(XmlPropertyKind.ATTRIBUTE);
		((UntypedParameterValueImpl) params.get(23)).setValue("3560");
		((UntypedParameterValueImpl) params.get(20)).setValue("3580");
		((UntypedParameterValueImpl) params.get(17)).setValue("3680");
		((UntypedParameterValueImpl) params.get(14)).setValue("3560");
		((UntypedParameterValueImpl) params.get(11)).setValue("3580");
		((UntypedParameterValueImpl) params.get(8)).setValue("3680");
		
		((TextLiteralParamImpl) params.get(5)).setValue("wer");
		((NumberParamImpl) params.get(4)).setValue(1.);
		((TextLiteralParamImpl) params.get(0)).setValue("wer");

		ComparisonOptionParam compOp = ((CountCondition) completePattern.getCondition()).getOption();
		compOp.setValue(ComparisonOperator.GREATER);
		
		return completePattern;
	}
	
//	private static CompletePattern getCARD3Lido() {
//		CompletePattern completePattern = getCARD3Abstract();
//		return completePattern;
//	}
	
}
