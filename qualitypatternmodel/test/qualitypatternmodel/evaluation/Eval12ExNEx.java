package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.RelationKind;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.impl.RelationImpl;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.PropertyOptionParam;
import qualitypatternmodel.parameters.RelationOptionParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UnknownParameterValue;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.translationtests.Test06NotElement;

public class Eval12ExNEx {
	public static void main(String[] args) {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getExNExMidas());
//		completePatterns.add(getExNExLido());
		Test00.test(completePatterns);
		
	}
	
	private static CompletePattern getExNExAbstract() {
		
		CompletePattern completePattern = Test06NotElement.getPatternExistsNotExistsAbstract();
		
		QuantifiedCondition qc1 = ((QuantifiedCondition) completePattern.getCondition());
		QuantifiedCondition qc2 = ((QuantifiedCondition)((NotCondition) qc1.getCondition()).getCondition());

		Graph g0 = completePattern.getGraph();
		g0.getElements().get(0).addPrimitiveComparison();
		
		Graph g1 = qc1.getGraph();
		Relation r1 = new RelationImpl();
		g1.getRelations().add(r1);
		r1.setSource(g1.getElements().get(0));
		r1.setTarget(g1.getElements().get(1));
		g1.getElements().get(1).addPrimitiveComparison();
		
		Graph g2 = qc2.getGraph();
		Relation r2 = new RelationImpl();
		g2.getRelations().add(r2);
		r2.setSource(g2.getElements().get(1));
		r2.setTarget(g2.getElements().get(2));
		
		completePattern.createXMLAdaption();
		EList<Relation> rels1 = qc1.getGraph().getRelations();
		EList<Relation> rels2 = qc2.getGraph().getRelations();
		for (int i = rels1.size()-1; i>=0; i--) rels1.get(i).adaptAsXMLNavigation();
		for (int i = rels2.size()-1; i>=0; i--) rels2.get(i).adaptAsXMLNavigation();
				
		completePattern.finalizeXMLAdaption();	
		
		return completePattern;		
	}
	
	
	private static CompletePattern getExNExMidas() {
		CompletePattern completePattern = getExNExAbstract();
		EList<Parameter> params = completePattern.getParameterList().getParameters();

		((RelationOptionParam) params.get(10)).setValue(RelationKind.DESCENDANT);
		((RelationOptionParam) params.get(9)).setValue(RelationKind.CHILD);
		((RelationOptionParam) params.get(8)).setValue(RelationKind.CHILD);
		((TextLiteralParam) params.get(7)).setValue("Type");
		((PropertyOptionParam) params.get(6)).setValue(PropertyKind.ATTRIBUTE);
		((TextLiteralParam) params.get(5)).setValue("Type");
		((PropertyOptionParam) params.get(4)).setValue(PropertyKind.ATTRIBUTE);
		((ComparisonOptionParam) params.get(3)).setValue(ComparisonOperator.EQUAL);
		((UnknownParameterValue) params.get(2)).concretize(new TextLiteralParamImpl("ob30"));
		((ComparisonOptionParam) params.get(1)).setValue(ComparisonOperator.EQUAL);
		((UnknownParameterValue) params.get(0)).concretize(new TextLiteralParamImpl("obj"));
		
		return completePattern;
	}
	
//	private static CompletePattern getExNExLido() {
//		CompletePattern completePattern = getExNExAbstract();
//		return completePattern;
//	}
	
}
