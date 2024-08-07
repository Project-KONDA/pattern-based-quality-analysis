package qualitypatternmodel.cyphertranslationtests_new;

import java.util.ArrayList;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class Test07Formula {

	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		for (LogicalOperator lo: LogicalOperator.VALUES) {
			completePatterns.add(getFormulaPatternConcrete(lo));
		}
		return completePatterns;
	}

    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		Test00.test(getPatterns());
	}

	public static CompletePattern getFormulaPattern(LogicalOperator op) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;

		CompletePattern completePattern = factory.createCompletePattern();
		Formula form = factory.createFormula();
		completePattern.setCondition(form);
		form.setOperator(op);

		QuantifiedCondition qc1 = factory.createQuantifiedCondition();
		QuantifiedCondition qc2 = factory.createQuantifiedCondition();

		form.setCondition1(qc1);
		form.setCondition2(qc2);

		Node e0qc1 = qc1.getGraph().getNodes().get(0);
		e0qc1.addOutgoing();

		Node e0qc2 = qc2.getGraph().getNodes().get(0);
		e0qc2.addOutgoing();

		completePattern.createNeo4jAdaption();

//		XmlReference ref = qc2.getGraph().getRelations().get(0).adaptAsXmlReference();
//		ref.setType(ReturnType.STRING);

		return completePattern;
	}

	public static CompletePattern getFormulaPatternConcrete(LogicalOperator op) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = getFormulaPattern(op);

//		((XmlElementNavigation) pattern.getGraph().getRelations().get(0)).getXmlPathParam().setXmlAxis(XmlAxisKind.DESCENDANT, null);
//		QuantifiedCondition q1 = ((QuantifiedCondition)((Formula) pattern.getCondition()).getCondition2());
//		XmlPropertyOptionParam property = ((XmlPropertyNavigation) q1.getGraph().getRelations().get(3)).getXmlPathParam().getXmlPropertyOptionParam();
//		property.setValue(XmlPropertyKind.ATTRIBUTE);
//		property.getAttributeName().setValue("demo:id");

		return pattern;
	}
}
