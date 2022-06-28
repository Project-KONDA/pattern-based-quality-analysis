package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
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
		g0.getNodes().get(0).addPrimitiveComparison();
		
		Graph g1 = qc1.getGraph();
		Relation r1 = new RelationImpl();
		g1.getRelations().add(r1);
		r1.setSource(g1.getNodes().get(0));
		r1.setTarget(g1.getNodes().get(1));
		g1.getNodes().get(1).addPrimitiveComparison();
		
		Graph g2 = qc2.getGraph();
		Relation r2 = new RelationImpl();
		g2.getRelations().add(r2);
		r2.setSource(g2.getNodes().get(1));
		r2.setTarget(g2.getNodes().get(2));
		
		completePattern.createXmlAdaption();
		EList<Relation> rels1 = qc1.getGraph().getRelations();
		EList<Relation> rels2 = qc2.getGraph().getRelations();
		for (int i = rels1.size()-1; i>=0; i--) rels1.get(i).adaptAsXmlElementNavigation();
		for (int i = rels2.size()-1; i>=0; i--) rels2.get(i).adaptAsXmlElementNavigation();
				
		completePattern.finalizeXMLAdaption();	
		
		return completePattern;		
	}
	
	private static CompletePattern getExNExAbstractWithComp() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = Test06NotElement.getPatternExistsNotExistsAbstract();
		
		QuantifiedCondition qc1 = ((QuantifiedCondition) completePattern.getCondition());
		QuantifiedCondition qc2 = ((QuantifiedCondition)((NotCondition) qc1.getCondition()).getCondition());

		Graph g0 = completePattern.getGraph();
		g0.getNodes().get(0).addPrimitiveComparison();
		
		Graph g1 = qc1.getGraph();
		Relation r1 = new RelationImpl();
		g1.getRelations().add(r1);
		r1.setSource(g1.getNodes().get(0));
		r1.setTarget(g1.getNodes().get(1));
		g1.getNodes().get(1).addPrimitiveComparison();
		
		Graph g2 = qc2.getGraph();
		Relation r2 = new RelationImpl();
		g2.getRelations().add(r2);
		r2.setSource(g2.getNodes().get(1));
		r2.setTarget(g2.getNodes().get(2));
		g2.getNodes().get(2).addPrimitiveComparison();
		
		completePattern.createXmlAdaption();
		EList<Relation> rels1 = qc1.getGraph().getRelations();
		EList<Relation> rels2 = qc2.getGraph().getRelations();
		for (int i = rels1.size()-1; i>=0; i--) rels1.get(i).adaptAsXmlElementNavigation();
		for (int i = rels2.size()-1; i>=0; i--) rels2.get(i).adaptAsXmlElementNavigation();
				
		completePattern.finalizeXMLAdaption();	
		
		return completePattern;		
	}
	
	
	static CompletePattern getExNExMidas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getExNExAbstract();
		EList<Parameter> params = completePattern.getParameterList().getParameters();

		((XmlAxisOptionParam) params.get(12)).setValue(XmlAxisKind.THREECHILD);
		((XmlAxisOptionParam) params.get(11)).setValue(XmlAxisKind.CHILD);
		((XmlAxisOptionParam) params.get(10)).setValue(XmlAxisKind.CHILD);
		((TextLiteralParam) params.get(9)).setValue("Type");
		((XmlPropertyOptionParam) params.get(8)).setValue(XmlPropertyKind.ATTRIBUTE);
		((TextLiteralParam) params.get(7)).setValue("Type");
		((XmlPropertyOptionParam) params.get(6)).setValue(XmlPropertyKind.ATTRIBUTE);
		((ComparisonOptionParam) params.get(4)).setValue(ComparisonOperator.EQUAL);
		((UntypedParameterValue) params.get(3)).replace(new TextLiteralParamImpl("ob30"));
		((ComparisonOptionParam) params.get(1)).setValue(ComparisonOperator.EQUAL);
		((UntypedParameterValue) params.get(0)).replace(new TextLiteralParamImpl("obj"));
		
		return completePattern;
	}
	
	static CompletePattern getExNExLidoRoleActor() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getExNExAbstractWithComp();
		EList<Parameter> params = completePattern.getParameterList().getParameters();

		((XmlAxisOptionParam) params.get(17)).setValue(XmlAxisKind.TWOCHILD);
		((XmlAxisOptionParam) params.get(16)).setValue(XmlAxisKind.CHILD);
		((XmlAxisOptionParam) params.get(15)).setValue(XmlAxisKind.SEVENCHILD);
//		((TextLiteralParam) params.get(14)).setValue("Type");
		((XmlPropertyOptionParam) params.get(13)).setValue(XmlPropertyKind.TAG);
//		((TextLiteralParam) params.get(12)).setValue("Type");
		((XmlPropertyOptionParam) params.get(11)).setValue(XmlPropertyKind.TAG);
//		((TextLiteralParam) params.get(10)).setValue("Type");
		((XmlPropertyOptionParam) params.get(9)).setValue(XmlPropertyKind.TAG);
		((ComparisonOptionParam) params.get(7)).setValue(ComparisonOperator.EQUAL);
		((UntypedParameterValue) params.get(6)).replace(new TextLiteralParamImpl("lido:conceptID"));
		((ComparisonOptionParam) params.get(4)).setValue(ComparisonOperator.EQUAL);
		((UntypedParameterValue) params.get(3)).replace(new TextLiteralParamImpl("lido:roleActor"));
		((ComparisonOptionParam) params.get(1)).setValue(ComparisonOperator.EQUAL);
		((UntypedParameterValue) params.get(0)).replace(new TextLiteralParamImpl("lido:lido"));
		
		return completePattern;
	}
	
//	private static CompletePattern getExNExLido() {
//		CompletePattern completePattern = getExNExAbstract();
//		return completePattern;
//	}
	
}
