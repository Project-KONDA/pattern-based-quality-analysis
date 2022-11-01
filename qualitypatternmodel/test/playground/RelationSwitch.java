package playground;

import java.util.ArrayList;
import java.util.List;

//import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.xmltranslationtests.Test00;
import qualitypatternmodel.xmltranslationtests.Test03Quantor;

public class RelationSwitch {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getRefintAbstractRunningExample());
		completePatterns.add(getRefintRunningExample());
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);
	}
	

	public static CompletePattern getRefintAbstractRunningExample() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;

		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;		
				
		CompletePattern completePattern = Test03Quantor.getPatternExists();
		TrueElement t = (TrueElement) ((QuantifiedCondition) completePattern.getCondition()).getCondition();
		QuantifiedCondition qc1 = (QuantifiedCondition) completePattern.getCondition(); 
		NotCondition n = factory.createNotCondition();
		QuantifiedCondition qc2 = factory.createQuantifiedCondition();
				
		qc1.setCondition(n);
		n.setCondition(qc2);
		qc2.setCondition(t);
		
		Node e1g0 = completePattern.getGraph().getNodes().get(0);
		e1g0.addOutgoing().getTarget().addPrimitiveComparison();
		
		Node e1g1 = qc1.getGraph().getNodes().get(0);	
		
		Node e2g1 = qc1.getGraph().getNodes().get(1);	
		e2g1.addOutgoing().getTarget().addPrimitiveComparison();
		
		Node e2g2 = qc2.getGraph().getNodes().get(1);
		Relation referenceg2 = e2g2.addOutgoing(); 
		Node e3g2 = referenceg2.getTarget().makeComplex();
		e3g2.addOutgoing().getTarget().addPrimitiveComparison();		
		
		completePattern.createXmlAdaption();

		((XmlPathParamImpl) completePattern.getParameterList().getParameters().get(13)).basicGetXmlNavigation().adaptAsXmlReference();
		
		return completePattern; 
	}
	
	public static CompletePattern getRefintRunningExample() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getRefintAbstractRunningExample();
				
		
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
		UntypedParameterValue p3 = ((UntypedParameterValue) params.get(3));
		ComparisonOptionParam p4 = ((ComparisonOptionParam) params.get(4));
		TypeOptionParam p5 = ((TypeOptionParam) params.get(5));
		UntypedParameterValue p6 = ((UntypedParameterValue) params.get(6));
		ComparisonOptionParam p7 = ((ComparisonOptionParam) params.get(7));
		TypeOptionParam p8 = ((TypeOptionParam) params.get(8));
		XmlPathParamImpl p9 = ((XmlPathParamImpl) params.get(9));
		XmlPathParamImpl p10 = ((XmlPathParamImpl) params.get(10));
		XmlPathParamImpl p11 = ((XmlPathParamImpl) params.get(11));
		XmlPathParamImpl p12 = ((XmlPathParamImpl) params.get(12));
		XmlPathParamImpl p13 = ((XmlPathParamImpl) params.get(13));
		XmlPathParamImpl p14 = ((XmlPathParamImpl) params.get(14));
		XmlPathParamImpl p15 = ((XmlPathParamImpl) params.get(15));
		XmlPathParamImpl p16 = ((XmlPathParamImpl) params.get(16));

		p0.setValue("building");
		p3.setValue("creator");
		p6.setValue("artist");
		
		p9.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p10.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		p11.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		p12.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p13.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p14.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p14.getXmlPropertyOptionParam().getAttributeName().setValue("ref");
		p15.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p15.getXmlPropertyOptionParam().getAttributeName().setValue("id");
		p16.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		
		return completePattern;		
	}
}
