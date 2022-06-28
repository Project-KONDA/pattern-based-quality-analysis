package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
import qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl;
import qualitypatternmodel.parameters.impl.NumberParamImpl;
import qualitypatternmodel.parameters.impl.ParameterImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.parameters.impl.TypeOptionParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.operators.Comparison;

public class EvalAppdupl {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCARD3Midas());
		Test00.test(completePatterns);
		
	}
	
	static CompletePattern getCARD3AbstractStructure() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = Test00.getBasePattern();
		
		CountCondition cc = factory.createCountCondition();
		completePattern.setCondition(cc);
		CountPattern cp = factory.createCountPattern();
		NumberElement ne = factory.createNumberElement();
		cc.setArgument2(ne);
		cc.setCountPattern(cp);
		
		QuantifiedCondition qc = factory.createQuantifiedCondition();
		cp.setCondition(qc);
		return completePattern;		
	}
	
	static CompletePattern getCARD3Abstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphfactory = GraphstructureFactory.eINSTANCE;
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory paramFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getCARD3AbstractStructure();
		Graph g0 = completePattern.getGraph();
		{
			ComplexNode n01 = g0.getNodes().get(0).makeComplex();
			n01.setName("OriginalDataSet");
			Relation r01 = n01.addOutgoing();
			Node n02 = r01.getTarget();
			n02 = n02.makePrimitive();
			n02.addPrimitiveComparison(paramFactory.createTextLiteralParam());			
		}
		
		Graph g1 = ((CountCondition)completePattern.getCondition()).getCountPattern().getGraph();
		{
			g1.getReturnNodes().get(0).setReturnNode(false);
			ComplexNode n13 = g1.addComplexNode();
			n13.setName("ComparedDataset");
			n13.setReturnNode(true);
			Relation r12 = n13.addOutgoing();
			Node n14 = r12.getTarget();
			n14 = n14.makePrimitive();
			n14.addPrimitiveComparison(paramFactory.createTextLiteralParam());	
		}
		
		Graph g2 = ((QuantifiedCondition)((CountPattern) g1.getContainer()).getCondition()).getGraph();
		{	
			ComplexNode n21 = (ComplexNode) g2.getNodes().get(0);
			ComplexNode n22 = (ComplexNode) g2.getNodes().get(2);
			
			for (int i = 0; i<3; i++) {
				Relation r = n21.addOutgoing();
				Relation r2 = n22.addOutgoing();
				Node node1 = r.getTarget().makeComplex();
				Node node2 = r2.getTarget().makeComplex();

				Relation rel0 = node1.addOutgoing();
				Relation rel1 = node2.addOutgoing();
				PrimitiveNode value1 = rel0.getTarget().makePrimitive();
				PrimitiveNode value2 = rel1.getTarget().makePrimitive();
				
				TextLiteralParamImpl rlp = (TextLiteralParamImpl) value1.addPrimitiveComparison(new TextLiteralParamImpl());
				value2.addPrimitiveComparison(rlp);
				
				Relation rel2 = node1.addOutgoing();
				Relation rel3 = node2.addOutgoing();
				PrimitiveNode value3 = rel2.getTarget().makePrimitive();
				PrimitiveNode value4 = rel3.getTarget().makePrimitive();
				
				value3.addComparison(value4).getTypeOption().setValue(ReturnType.STRING);
				
				Comparison c = value1.addComparison(value2);
				c.getTypeOption().setValue(ReturnType.STRING);
				
			}			
		}
		
		completePattern.createXmlAdaption();
		return completePattern;		
	}
	
	
	static CompletePattern getCARD3Midas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getCARD3Abstract();
		EList<Parameter> params = completePattern.getParameterList().getParameters();
		
		ComparisonOptionParamImpl p0 = ((ComparisonOptionParamImpl) params.get(0));
		NumberParamImpl p1 = ((NumberParamImpl) params.get(1));
		TextLiteralParamImpl p2 = ((TextLiteralParamImpl) params.get(2));
		ComparisonOptionParamImpl p3 = ((ComparisonOptionParamImpl) params.get(3));
		TypeOptionParamImpl p4 = ((TypeOptionParamImpl) params.get(4));
		TextLiteralParamImpl p5 = ((TextLiteralParamImpl) params.get(5));
		ComparisonOptionParamImpl p6 = ((ComparisonOptionParamImpl) params.get(6));
		TypeOptionParamImpl p7 = ((TypeOptionParamImpl) params.get(7));
		TextLiteralParamImpl p8 = ((TextLiteralParamImpl) params.get(8));
		ComparisonOptionParamImpl p9 = ((ComparisonOptionParamImpl) params.get(9));
		TypeOptionParamImpl p10 = ((TypeOptionParamImpl) params.get(10));
		ComparisonOptionParamImpl p11 = ((ComparisonOptionParamImpl) params.get(11));
		TypeOptionParamImpl p12 = ((TypeOptionParamImpl) params.get(12));
		ComparisonOptionParamImpl p13 = ((ComparisonOptionParamImpl) params.get(13));
		TypeOptionParamImpl p14 = ((TypeOptionParamImpl) params.get(14));
		ComparisonOptionParamImpl p15 = ((ComparisonOptionParamImpl) params.get(15));
		TypeOptionParamImpl p16 = ((TypeOptionParamImpl) params.get(16));
		TextLiteralParamImpl p17 = ((TextLiteralParamImpl) params.get(17));
		ComparisonOptionParamImpl p18 = ((ComparisonOptionParamImpl) params.get(18));
		TypeOptionParamImpl p19 = ((TypeOptionParamImpl) params.get(19));
		ComparisonOptionParamImpl p20 = ((ComparisonOptionParamImpl) params.get(20));
		TypeOptionParamImpl p21 = ((TypeOptionParamImpl) params.get(21));
		ComparisonOptionParamImpl p22 = ((ComparisonOptionParamImpl) params.get(22));
		TypeOptionParamImpl p23 = ((TypeOptionParamImpl) params.get(23));
		ComparisonOptionParamImpl p24 = ((ComparisonOptionParamImpl) params.get(24));
		TypeOptionParamImpl p25 = ((TypeOptionParamImpl) params.get(25));
		TextLiteralParamImpl p26 = ((TextLiteralParamImpl) params.get(26));
		ComparisonOptionParamImpl p27 = ((ComparisonOptionParamImpl) params.get(27));
		TypeOptionParamImpl p28 = ((TypeOptionParamImpl) params.get(28));
		ComparisonOptionParamImpl p29 = ((ComparisonOptionParamImpl) params.get(29));
		TypeOptionParamImpl p30 = ((TypeOptionParamImpl) params.get(30));
		ComparisonOptionParamImpl p31 = ((ComparisonOptionParamImpl) params.get(31));
		TypeOptionParamImpl p32 = ((TypeOptionParamImpl) params.get(32));
		ComparisonOptionParamImpl p33 = ((ComparisonOptionParamImpl) params.get(33));
		TypeOptionParamImpl p34 = ((TypeOptionParamImpl) params.get(34));
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
		XmlPathParamImpl p52 = ((XmlPathParamImpl) params.get(52));
		XmlPathParamImpl p53 = ((XmlPathParamImpl) params.get(53));
		XmlPathParamImpl p54 = ((XmlPathParamImpl) params.get(54));
		XmlPathParamImpl p55 = ((XmlPathParamImpl) params.get(55));
		XmlPathParamImpl p56 = ((XmlPathParamImpl) params.get(56));
		
		p1.setValue(1.);
		p2.setValue("wer");
		p4.setValue(ReturnType.STRING);
		p5.setValue("wer");
		p7.setValue(ReturnType.STRING);
		p8.setValue("3560");
		p10.setValue(ReturnType.STRING);
		p12.setValue(ReturnType.STRING);
		p14.setValue(ReturnType.STRING);
		p16.setValue(ReturnType.STRING);
		p17.setValue("3580");
		p19.setValue(ReturnType.STRING);
		p21.setValue(ReturnType.STRING);
		p23.setValue(ReturnType.STRING);
		p25.setValue(ReturnType.STRING);
		p26.setValue("3680");
		p28.setValue(ReturnType.STRING);
		p30.setValue(ReturnType.STRING);
		p32.setValue(ReturnType.STRING);
		p34.setValue(ReturnType.STRING);
		
		p36.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD});
		p38.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD});
			
		XmlPathParamImpl[] paths = new XmlPathParamImpl[] {p35, p37, p41, p42, p47, p48, p53, p54};
		for (XmlPathParamImpl p : paths) {
			XmlPropertyOptionParam pop = p.getXmlPropertyOptionParam();
			pop.setValue(XmlPropertyKind.ATTRIBUTE);
			pop.getAttributeName().setValue("Type");			
		}
		
		XmlPathParamImpl[] paths2 = new XmlPathParamImpl[] {p43, p44, p49, p50, p55, p56};
		for (XmlPathParamImpl p : paths2) {
			XmlPropertyOptionParam pop = p.getXmlPropertyOptionParam();
			pop.setValue(XmlPropertyKind.ATTRIBUTE);
			pop.getAttributeName().setValue("Value");			
		}
		
		return completePattern;
	}
	
//	private static CompletePattern getCARD3Lido() {
//		CompletePattern completePattern = getCARD3Abstract();
//		return completePattern;
//	}
	
}
