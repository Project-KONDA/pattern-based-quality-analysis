package qualitypatternmodel.cyphertranslationtests_new;

import java.util.ArrayList;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;

public class Test06NotElement {

	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternNotNotTrue());
		completePatterns.add(getPatternNotExists());
		completePatterns.add(getPatternNotForall());
		completePatterns.add(getPatternExistsNotExists());
		completePatterns.add(getPatternForallNotForall());
		return completePatterns;
	}

    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		Test00.test(getPatterns());
	}

	public static CompletePattern getPatternNotTrue() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		NotCondition n = factory.createNotCondition();
		completePattern.setCondition(n);

		completePattern.createNeo4jAdaption();

		return completePattern;
	}

	public static CompletePattern getPatternNotNotTrue() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		NotCondition n = factory.createNotCondition();
		completePattern.setCondition(n);
		NotCondition n2 = factory.createNotCondition();
		n.setCondition(n2);

		completePattern.createNeo4jAdaption();

		return completePattern;
	}

	public static CompletePattern getPatternNotExistsAbstract() throws InvalidityException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;

		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		NotCondition n = factory.createNotCondition();
		completePattern.setCondition(n);
		QuantifiedCondition qc = factory.createQuantifiedCondition();
		n.setCondition(qc);
		qc.setCondition(null);

		Node e0 = qc.getGraph().getNodes().get(0);
		e0.addOutgoing();

		return completePattern;
	}

	public static CompletePattern getPatternNotExists() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		CompletePattern completePattern = getPatternNotExistsAbstract();

		completePattern.createNeo4jAdaption();
		((QuantifiedCondition) ((NotCondition) completePattern.getCondition()).getCondition()).getGraph().getRelations().get(0).adaptAsXmlElementNavigation();

		((XmlElementNavigation)(completePattern.getGraph().getRelations().get(0))).getXmlPathParam().setXmlAxis(XmlAxisKind.DESCENDANT, null);

		return completePattern;
	}

	public static CompletePattern getPatternNotForall() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternNotExists();
		QuantifiedCondition qc = ((QuantifiedCondition) ((NotCondition) completePattern.getCondition()).getCondition());
		qc.setQuantifier(Quantifier.FORALL);
		return completePattern;
	}

	public static CompletePattern getPatternExistsNotExistsAbstract() throws InvalidityException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;

		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;

		CompletePattern completePattern = Test03Quantor.getPatternExists();
		QuantifiedCondition qc1 = (QuantifiedCondition) completePattern.getCondition();
		NotCondition n = factory.createNotCondition();
		QuantifiedCondition qc2 = factory.createQuantifiedCondition();

		qc1.setCondition(n);
		n.setCondition(qc2);
		qc2.setCondition(null);

		Node e2 = graphFactory.createNode();
		e2.setGraph(qc2.getGraph());
		return completePattern;
	}

	public static CompletePattern getPatternExistsNotExists() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternExistsNotExistsAbstract();

//		QuantifiedCondition q1 = ((QuantifiedCondition)completePattern.getCondition());
//		QuantifiedCondition q2 = ((QuantifiedCondition) ((NotCondition) q1.getCondition()).getCondition());

		completePattern.createNeo4jAdaption();

//		((XmlElementNavigation) completePattern.getGraph().getRelations().get(0)).getXmlPathParam().setXmlAxis(XmlAxisKind.DESCENDANT, null);
//		((XmlElementNavigation) q1.getGraph().getRelations().get(1)).getXmlPathParam().setXmlAxis(XmlAxisKind.CHILD, "");
//		((XmlElementNavigation) q2.getGraph().getRelations().get(2)).getXmlPathParam().setXmlAxis(XmlAxisKind.ANCESTOR, "");
		return completePattern;
	}

	public static CompletePattern getPatternForallNotForall() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternExistsNotExists();

		QuantifiedCondition qc1 = (QuantifiedCondition) completePattern.getCondition();
		QuantifiedCondition qc2 = (QuantifiedCondition) ((NotCondition) qc1.getCondition()).getCondition();

		qc1.setQuantifier(Quantifier.FORALL);
		qc2.setQuantifier(Quantifier.FORALL);

		((XmlElementNavigation)qc1.getGraph().getRelations().get(1)).getXmlPathParam().setXmlAxis(XmlAxisKind.PARENT, "");
		((XmlElementNavigation)qc2.getGraph().getRelations().get(2)).getXmlPathParam().setXmlAxis(XmlAxisKind.CHILD, "");

		return completePattern;
	}
}
