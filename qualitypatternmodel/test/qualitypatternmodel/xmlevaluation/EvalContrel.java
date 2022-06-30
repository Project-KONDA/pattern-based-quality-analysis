package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
import qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.OperatorsFactory;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl;
import qualitypatternmodel.parameters.impl.NumberParamImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.parameters.impl.TypeOptionParamImpl;
import qualitypatternmodel.parameters.impl.UntypedParameterValueImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.xmltranslationtests.Test00;

public class EvalContrel {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
//		completePatterns.add(getContrelAbstract());
		completePatterns.add(getContrelMidas());
		
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);	
	}
	
	public static CompletePattern getContrelAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern pattern = factory.createCompletePattern();
		
		Graph g1 = pattern.getGraph();
		ComplexNode g1return = g1.getReturnNodes().get(0).makeComplex();
		g1return.addOutgoing().getTarget().addPrimitiveComparison();
		
		
		
		QuantifiedCondition qc = factory.createQuantifiedCondition();
		pattern.setCondition(qc);
		TrueElement trueElement = factory.createTrueElement();
		qc.setCondition(trueElement);
		
		Graph g2 = qc.getGraph();		
		ComplexNode g2n1 = g2.getReturnNodes().get(0).makeComplex();
		
		
		ComplexNode g2c1 = graphFactory.createComplexNode();
		g2c1.setGraph(g2);
		g2c1.addOutgoing().getTarget().addPrimitiveComparison();
		

		ComplexNode g2n2 = g2n1.addOutgoing().getTarget().makeComplex();
		g2n2.addOutgoing().getTarget().addPrimitiveComparison();
		
		ComplexNode g2c2 = g2c1.addOutgoing().getTarget().makeComplex();
		g2c2.addOutgoing().getTarget().addPrimitiveComparison();
		ComplexNode g2n3 = g2n1.addOutgoing().getTarget().makeComplex();
		g2n3.addOutgoing().getTarget().addPrimitiveComparison();
		ComplexNode g2c3 = g2c1.addOutgoing().getTarget().makeComplex();
		g2c3.addOutgoing().getTarget().addPrimitiveComparison();
		ComplexNode g2n4 = g2n3.addOutgoing().getTarget().makeComplex();
		g2n4.addOutgoing().getTarget().addPrimitiveComparison();
		ComplexNode g2c4 = g2c3.addOutgoing().getTarget().makeComplex();
		g2c4.addOutgoing().getTarget().addPrimitiveComparison();

		Comparison comp2 = g2n2.addOutgoing().getTarget().makePrimitive().addComparison(g2c3.addOutgoing().getTarget().makePrimitive());
		comp2.getTypeOption().setValue(ReturnType.STRING);
		Comparison comp3 = g2n3.addOutgoing().getTarget().makePrimitive().addComparison(g2c4.addOutgoing().getTarget().makePrimitive());
		comp3.getTypeOption().setValue(ReturnType.STRING);
		Comparison comp4 = g2n4.addOutgoing().getTarget().makePrimitive().addComparison(g2c2.addOutgoing().getTarget().makePrimitive());
		comp4.getTypeOption().setValue(ReturnType.STRING);
		
		
		pattern.createXmlAdaption();
		return pattern;
	}
	
	public static CompletePattern getContrelMidas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {		
		CompletePattern completePattern = getContrelAbstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		UntypedParameterValueImpl p0 = ((UntypedParameterValueImpl) params.get(0));
		ComparisonOptionParamImpl p1 = ((ComparisonOptionParamImpl) params.get(1));
		TypeOptionParamImpl p2 = ((TypeOptionParamImpl) params.get(2));
		UntypedParameterValueImpl p3 = ((UntypedParameterValueImpl) params.get(3));
		ComparisonOptionParamImpl p4 = ((ComparisonOptionParamImpl) params.get(4));
		TypeOptionParamImpl p5 = ((TypeOptionParamImpl) params.get(5));
		UntypedParameterValueImpl p6 = ((UntypedParameterValueImpl) params.get(6));
		ComparisonOptionParamImpl p7 = ((ComparisonOptionParamImpl) params.get(7));
		TypeOptionParamImpl p8 = ((TypeOptionParamImpl) params.get(8));
		UntypedParameterValueImpl p9 = ((UntypedParameterValueImpl) params.get(9));
		ComparisonOptionParamImpl p10 = ((ComparisonOptionParamImpl) params.get(10));
		TypeOptionParamImpl p11 = ((TypeOptionParamImpl) params.get(11));
		UntypedParameterValueImpl p12 = ((UntypedParameterValueImpl) params.get(12));
		ComparisonOptionParamImpl p13 = ((ComparisonOptionParamImpl) params.get(13));
		TypeOptionParamImpl p14 = ((TypeOptionParamImpl) params.get(14));
		UntypedParameterValueImpl p15 = ((UntypedParameterValueImpl) params.get(15));
		ComparisonOptionParamImpl p16 = ((ComparisonOptionParamImpl) params.get(16));
		TypeOptionParamImpl p17 = ((TypeOptionParamImpl) params.get(17));
		UntypedParameterValueImpl p18 = ((UntypedParameterValueImpl) params.get(18));
		ComparisonOptionParamImpl p19 = ((ComparisonOptionParamImpl) params.get(19));
		TypeOptionParamImpl p20 = ((TypeOptionParamImpl) params.get(20));
		UntypedParameterValueImpl p21 = ((UntypedParameterValueImpl) params.get(21));
		ComparisonOptionParamImpl p22 = ((ComparisonOptionParamImpl) params.get(22));
		TypeOptionParamImpl p23 = ((TypeOptionParamImpl) params.get(23));
		ComparisonOptionParamImpl p24 = ((ComparisonOptionParamImpl) params.get(24));
		TypeOptionParamImpl p25 = ((TypeOptionParamImpl) params.get(25));
		ComparisonOptionParamImpl p26 = ((ComparisonOptionParamImpl) params.get(26));
		TypeOptionParamImpl p27 = ((TypeOptionParamImpl) params.get(27));
		ComparisonOptionParamImpl p28 = ((ComparisonOptionParamImpl) params.get(28));
		TypeOptionParamImpl p29 = ((TypeOptionParamImpl) params.get(29));
		XmlPathParamImpl p30 = ((XmlPathParamImpl) params.get(30));
		XmlPathParamImpl p31 = ((XmlPathParamImpl) params.get(31));
		XmlPathParamImpl p32 = ((XmlPathParamImpl) params.get(32));
		XmlPathParamImpl p33 = ((XmlPathParamImpl) params.get(33));
		XmlPathParamImpl p34 = ((XmlPathParamImpl) params.get(34));
		XmlPathParamImpl p35 = ((XmlPathParamImpl) params.get(35));
		XmlPathParamImpl p36 = ((XmlPathParamImpl) params.get(36));
		XmlPathParamImpl p37 = ((XmlPathParamImpl) params.get(37));
		XmlPathParamImpl p38 = ((XmlPathParamImpl) params.get(38));
		XmlPathParamImpl p39 = ((XmlPathParamImpl) params.get(39));
		XmlPathParamImpl p40 = ((XmlPathParamImpl) params.get(40));
		XmlPathParamImpl p41 = ((XmlPathParamImpl) params.get(41));
		XmlPathParamImpl p42 = ((XmlPathParamImpl) params.get(42));
		XmlPathParamImpl p43 = ((XmlPathParamImpl) params.get(43));
		XmlPathParamImpl p44 = ((XmlPathParamImpl) params.get(44));
		XmlPathParamImpl p45 = ((XmlPathParamImpl) params.get(45));
		XmlPathParamImpl p46 = ((XmlPathParamImpl) params.get(46));
		XmlPathParamImpl p47 = ((XmlPathParamImpl) params.get(47));
		XmlPathParamImpl p48 = ((XmlPathParamImpl) params.get(48));
		XmlPathParamImpl p49 = ((XmlPathParamImpl) params.get(49));
		XmlPathParamImpl p50 = ((XmlPathParamImpl) params.get(50));
		XmlPathParamImpl p51 = ((XmlPathParamImpl) params.get(51));

		p0.replace(new TextLiteralParamImpl("kue"));
		p3.replace(new TextLiteralParamImpl("wer"));
		p6.replace(new TextLiteralParamImpl("3100"));
		p9.replace(new TextLiteralParamImpl("3600"));
		p12.replace(new TextLiteralParamImpl("ku35"));
		p15.replace(new TextLiteralParamImpl("we30"));
		p18.replace(new TextLiteralParamImpl("3600"));
		p21.replace(new TextLiteralParamImpl("3100"));
		
		
		p30.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p30.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p32.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p32.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p34.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p34.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p36.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p36.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p38.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p38.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p40.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p40.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p42.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p42.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p44.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p44.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p45.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p45.getXmlPropertyOptionParam().getAttributeName().setValue("Value");
		p46.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p46.getXmlPropertyOptionParam().getAttributeName().setValue("Value");
		p47.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p47.getXmlPropertyOptionParam().getAttributeName().setValue("Value");
		p48.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p48.getXmlPropertyOptionParam().getAttributeName().setValue("Value");
		p49.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p49.getXmlPropertyOptionParam().getAttributeName().setValue("Value");
		p50.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p50.getXmlPropertyOptionParam().getAttributeName().setValue("Value");
						
		return completePattern;
	}
}
