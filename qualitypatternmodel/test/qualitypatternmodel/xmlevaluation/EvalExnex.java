package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
import qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlAxisOptionParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.impl.RelationImpl;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.xmltranslationtests.Test00;
import qualitypatternmodel.xmltranslationtests.Test06NotElement;

public class EvalExnex {
	// also called MANDSTRUC2
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getExNExMidas());
		completePatterns.add(getExNExLidoRoleActor());
		Test00.test(completePatterns);
	}
	
	private static CompletePattern getExNExAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		CompletePattern completePattern = Test06NotElement.getPatternExistsNotExistsAbstract();
		
		QuantifiedCondition qc1 = ((QuantifiedCondition) completePattern.getCondition());
		QuantifiedCondition qc2 = ((QuantifiedCondition)((NotCondition) qc1.getCondition()).getCondition());

		Graph g0 = completePattern.getGraph();
		g0.getNodes().get(0).addOutgoing().getTarget().addPrimitiveComparison();
		
		Graph g1 = qc1.getGraph();
		g1.getNodes().get(1).addOutgoing().getTarget().addPrimitiveComparison();
		
		Graph g2 = qc2.getGraph();
		
		completePattern.createXmlAdaption();
		
		return completePattern;		
	}
	
	private static CompletePattern getExNExAbstractWithComp() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = Test06NotElement.getPatternExistsNotExistsAbstract();
		
		QuantifiedCondition qc1 = ((QuantifiedCondition) completePattern.getCondition());
		QuantifiedCondition qc2 = ((QuantifiedCondition)((NotCondition) qc1.getCondition()).getCondition());

		Graph g0 = completePattern.getGraph();
		g0.getNodes().get(0).addOutgoing().getTarget().addPrimitiveComparison();
		
		Graph g1 = qc1.getGraph();
		g1.getNodes().get(1).addOutgoing().getTarget().addPrimitiveComparison();
		
		Graph g2 = qc2.getGraph();
		g2.getNodes().get(2).addOutgoing().getTarget().addPrimitiveComparison();
		
		completePattern.createXmlAdaption();
		
		return completePattern;		
	}
	
	
	static CompletePattern getExNExMidas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getExNExAbstract();
		EList<Parameter> params = completePattern.getParameterList().getParameters();
		
		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
		UntypedParameterValue p3 = ((UntypedParameterValue) params.get(3));
		ComparisonOptionParam p4 = ((ComparisonOptionParam) params.get(4));
		TypeOptionParam p5 = ((TypeOptionParam) params.get(5));
		XmlPathParamImpl p6 = ((XmlPathParamImpl) params.get(6));
		XmlPathParamImpl p7 = ((XmlPathParamImpl) params.get(7));
		XmlPathParamImpl p8 = ((XmlPathParamImpl) params.get(8));
		XmlPathParamImpl p9 = ((XmlPathParamImpl) params.get(9));
		XmlPathParamImpl p10 = ((XmlPathParamImpl) params.get(10));
				
		p0.setValue("obj");
		p1.setValue(ComparisonOperator.EQUAL);
		p3.setValue("ob30");
		p4.setValue(ComparisonOperator.EQUAL);
		p6.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p6.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p7.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD});
		p8.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		p9.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p9.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p10.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		
		
		
		return completePattern;
	}
	
	static CompletePattern getExNExLidoRoleActor() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getExNExAbstractWithComp();
		EList<Parameter> params = completePattern.getParameterList().getParameters();
		
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

		p0.setValue("lido:lido");
		p1.setValue(ComparisonOperator.EQUAL);
		p3.setValue("lido:roleActor");
		p4.setValue(ComparisonOperator.EQUAL);
		p6.setValue("lido:conceptID");
		p7.setValue(ComparisonOperator.EQUAL);
		p9.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p10.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD});;
		p11.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD});
		p12.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p13.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p14.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});;
		
		return completePattern;
	}
	
//	private static CompletePattern getExNExLido() {
//		CompletePattern completePattern = getExNExAbstract();
//		return completePattern;
//	}
	
}
