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

import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.RelationKind;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Property;
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
import qualitypatternmodel.parameters.PropertyOptionParam;
import qualitypatternmodel.parameters.RelationOptionParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl;
import qualitypatternmodel.parameters.impl.NumberParamImpl;
import qualitypatternmodel.parameters.impl.PropertyOptionParamImpl;
import qualitypatternmodel.parameters.impl.RelationOptionParamImpl;
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
		g0.getElements().get(0).setName("First");
		g0.getElements().get(0).addPrimitiveComparison("wer");
		
		CountCondition cc = factory.createCountCondition();
		completePattern.setCondition(cc);
		CountPattern cp = factory.createCountPattern();
		cc.setCountPattern(cp);
		NumberElement ne = factory.createNumberElement();
		ne.setNumberParam(paramFactory.createNumberParam());
		cc.setArgument2(ne);
		
		Graph cpg = cp.getGraph();
		Element e = graphfactory.createElement();
		cpg.getElements().add(e);
		cpg.getReturnElements().clear();
		cpg.getReturnElements().add(e);
		e.addPrimitiveComparison("wer");
		e.setName("Counted");

		QuantifiedCondition cpqc = factory.createQuantifiedCondition();
		cp.setCondition(cpqc);
		Graph cpqcg = cpqc.getGraph();		
		Element e1 = cpqcg.getElements().get(0);
		Element e2 = cpqcg.getElements().get(1);
		
		TrueElement trueElement = factory.createTrueElement();
		cpqc.setCondition(trueElement);

		Element e1a = graphfactory.createElement();
		e1a.setGraph(cpqcg);
		cpqcg.addRelation(e1, e1a);
		Property e1ap = e1a.addNewProperty();
		e1a.addPrimitiveComparison();
		e1a.setName("1A");		
		Element e1b = graphfactory.createElement();
		e1b.setGraph(cpqcg);
		cpqcg.addRelation(e1, e1b);
		Property e1bp = e1b.addNewProperty();
		e1b.addPrimitiveComparison();
		e1b.setName("1B");		
		Element e1c = graphfactory.createElement();
		e1c.setGraph(cpqcg);
		cpqcg.addRelation(e1, e1c);
		Property e1cp = e1c.addNewProperty();
		e1c.addPrimitiveComparison();
		e1c.setName("1C");
		Element e2a = graphfactory.createElement();
		e2a.setGraph(cpqcg);
		cpqcg.addRelation(e2, e2a);
		Property e2ap = e2a.addNewProperty();
		e2a.addPrimitiveComparison();
		e2a.setName("2A");
		Element e2b = graphfactory.createElement();
		e2b.setGraph(cpqcg);
		cpqcg.addRelation(e2, e2b);
		Property e2bp = e2b.addNewProperty();
		e2b.addPrimitiveComparison();
		e2b.setName("2B");
		Element e2c = graphfactory.createElement();
		e2c.setGraph(cpqcg);
		cpqcg.addRelation(e2, e2c);
		Property e2cp = e2c.addNewProperty();
		e2c.addPrimitiveComparison();
		e2c.setName("2C");
		

		OperatorList ol = cpqcg.getOperatorList();
		Comparison cea = new ComparisonImpl();
		ol.add(cea);
		cea.createParameters();
		cea.setArgument1(e1ap);
		cea.setArgument2(e2ap);
		cea.setType(ReturnType.STRING);
		Comparison ceb = new ComparisonImpl();
		ol.add(ceb);
		ceb.createParameters();
		ceb.setArgument1(e1bp);
		ceb.setArgument2(e2bp);
		ceb.setType(ReturnType.STRING);
		Comparison cec = new ComparisonImpl();
		ol.add(cec);
		cec.createParameters();
		cec.setArgument1(e1cp);
		cec.setArgument2(e2cp);
		cec.setType(ReturnType.STRING);
		
		
//		System.out.println(completePattern.myToString());
		
		completePattern.createXMLAdaption();
		EList<Relation> rels1 = cpqcg.getRelations();
		for (int i = rels1.size()-1; i>=0; i--) rels1.get(i).adaptAsXMLNavigation();
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

		((RelationOptionParamImpl) params.get(56)).setValue(RelationKind.THREECHILD);
		((RelationOptionParamImpl) params.get(55)).setValue(RelationKind.THREECHILD);
		((TextLiteralParamImpl) params.get(48)).setValue("Type");
		((PropertyOptionParamImpl) params.get(47)).setValue(PropertyKind.ATTRIBUTE);
		((TextLiteralParamImpl) params.get(46)).setValue("Value");
		((PropertyOptionParamImpl) params.get(45)).setValue(PropertyKind.ATTRIBUTE);
		((TextLiteralParamImpl) params.get(44)).setValue("Type");
		((PropertyOptionParamImpl) params.get(43)).setValue(PropertyKind.ATTRIBUTE);
		((TextLiteralParamImpl) params.get(42)).setValue("Value");
		((PropertyOptionParamImpl) params.get(41)).setValue(PropertyKind.ATTRIBUTE);
		((TextLiteralParamImpl) params.get(40)).setValue("Type");
		((PropertyOptionParamImpl) params.get(39)).setValue(PropertyKind.ATTRIBUTE);
		((TextLiteralParamImpl) params.get(38)).setValue("Value");
		((PropertyOptionParamImpl) params.get(37)).setValue(PropertyKind.ATTRIBUTE);
		((TextLiteralParamImpl) params.get(36)).setValue("Type");
		((PropertyOptionParamImpl) params.get(35)).setValue(PropertyKind.ATTRIBUTE);
		((TextLiteralParamImpl) params.get(34)).setValue("Value");
		((PropertyOptionParamImpl) params.get(33)).setValue(PropertyKind.ATTRIBUTE);
		((TextLiteralParamImpl) params.get(32)).setValue("Type");
		((PropertyOptionParamImpl) params.get(31)).setValue(PropertyKind.ATTRIBUTE);
		((TextLiteralParamImpl) params.get(30)).setValue("Value");
		((PropertyOptionParamImpl) params.get(29)).setValue(PropertyKind.ATTRIBUTE);
		((TextLiteralParamImpl) params.get(28)).setValue("Type");
		((PropertyOptionParamImpl) params.get(27)).setValue(PropertyKind.ATTRIBUTE);
		((TextLiteralParamImpl) params.get(26)).setValue("Value");
		((PropertyOptionParamImpl) params.get(25)).setValue(PropertyKind.ATTRIBUTE);
		((TextLiteralParamImpl) params.get(24)).setValue("Type");
		((PropertyOptionParamImpl) params.get(23)).setValue(PropertyKind.ATTRIBUTE);
		((TextLiteralParamImpl) params.get(22)).setValue("Type");
		((PropertyOptionParamImpl) params.get(21)).setValue(PropertyKind.ATTRIBUTE);
		((UntypedParameterValueImpl) params.get(16)).setValue("3560");
		((UntypedParameterValueImpl) params.get(14)).setValue("3580");
		((UntypedParameterValueImpl) params.get(12)).setValue("3680");
		((UntypedParameterValueImpl) params.get(10)).setValue("3560");
		((UntypedParameterValueImpl) params.get(8)).setValue("3580");
		((UntypedParameterValueImpl) params.get(6)).setValue("3680");
		((TextLiteralParamImpl) params.get(4)).setValue("wer");
		((NumberParamImpl) params.get(3)).setValue(1.);
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
