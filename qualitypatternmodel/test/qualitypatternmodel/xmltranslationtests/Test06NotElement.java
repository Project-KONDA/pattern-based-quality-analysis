package qualitypatternmodel.xmltranslationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.utility.PatternUtility;
import qualitypatternmodel.xmltestutility.PatternTestPair;

public class Test06NotElement {

	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
//		completePatterns.add(getPatternNotTrue());
//		completePatterns.add(getPatternNotNotTrue());
//		completePatterns.add(getPatternNotExists());
		completePatterns.add(getPatternNotForall());
//		completePatterns.add(getPatternExistsNotExists());
//		completePatterns.add(getPatternForallNotForall());
		return completePatterns;
	}

    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternUtility.testPatterns(getPatterns());
	}

	public static CompletePattern getPatternNotTrue() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		NotCondition n = factory.createNotCondition();
		completePattern.setCondition(n);

		completePattern.createXmlAdaption();

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

		completePattern.createXmlAdaption();

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
		TrueElement t = factory.createTrueElement();
		qc.setCondition(t);

		Node e0 = completePattern.getGraph().getNodes().get(0);
		e0.addOutgoing(qc.getGraph());

		return completePattern;
	}

	public static CompletePattern getPatternNotExists() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternNotExistsAbstract();
		completePattern.createXmlAdaption();
		completePattern.printParameters();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		params.get(0).setValueFromString("//*");
//		params.get(1).setValueFromString("/parent::*");
//		params.get(2).setValueFromString("/self::*");
//		((QuantifiedCondition) ((NotCondition) completePattern.getCondition()).getCondition()).getGraph().getRelations().get(0).adaptAsXmlElementNavigation();

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
		TrueElement t = (TrueElement) ((QuantifiedCondition) completePattern.getCondition()).getCondition();
		QuantifiedCondition qc1 = (QuantifiedCondition) completePattern.getCondition();
		NotCondition n = factory.createNotCondition();
		QuantifiedCondition qc2 = factory.createQuantifiedCondition();

		qc1.setCondition(n);
		n.setCondition(qc2);
		qc2.setCondition(t);

		Node e2 = graphFactory.createNode();
		e2.setGraph(qc2.getGraph());
		return completePattern;

	}


	public static CompletePattern getPatternExistsNotExists() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternExistsNotExistsAbstract();

		QuantifiedCondition q1 = ((QuantifiedCondition) completePattern.getCondition());
		QuantifiedCondition q2 = ((QuantifiedCondition) ((NotCondition) q1.getCondition()).getCondition());

		completePattern.createXmlAdaption();

		completePattern.printParameters();
//		List<Parameter> params = completePattern.getParameterList().getParameters();
//		params.get(0).setValueFromString("/ancestor::*");
//		params.get(1).setValueFromString("/parent::*");
//		params.get(2).setValueFromString("/self::*");
		

		((XmlElementNavigation) completePattern.getGraph().getRelations().get(0)).getXmlPathParam().setXmlAxis(XmlAxisKind.DESCENDANT, null);
		((XmlElementNavigation) q1.getGraph().getRelations().get(0)).getXmlPathParam().setXmlAxis(XmlAxisKind.CHILD, "");
		((XmlElementNavigation) q2.getGraph().getRelations().get(0)).getXmlPathParam().setXmlAxis(XmlAxisKind.ANCESTOR, "");
		return completePattern;
	}
	public static CompletePattern getPatternForallNotForall() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternExistsNotExists();

		QuantifiedCondition qc1 = (QuantifiedCondition) completePattern.getCondition();
		QuantifiedCondition qc2 = (QuantifiedCondition) ((NotCondition) qc1.getCondition()).getCondition();

		qc1.setQuantifier(Quantifier.FORALL);
		qc2.setQuantifier(Quantifier.FORALL);

		completePattern.printParameters();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		params.get(0).setValueFromString("/ancestor::*");
		params.get(1).setValueFromString("/parent::*");
		params.get(2).setValueFromString("/self::*");
		
//		((XmlElementNavigation)qc1.getGraph().getRelations().get(1)).getXmlPathParam().setXmlAxis(XmlAxisKind.PARENT, "");
//		((XmlElementNavigation)qc2.getGraph().getRelations().get(2)).getXmlPathParam().setXmlAxis(XmlAxisKind.CHILD, "");
		
		

		return completePattern;
	}

	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		testPairs.add(new PatternTestPair("06", "NOT",getPatternNotTrue(), "()"));
		testPairs.add(new PatternTestPair("06", "NOTNOT", getPatternNotNotTrue(), "/*"));
		testPairs.add(new PatternTestPair("06", "NOTEX", getPatternNotExists(), "//*[not(./*)]"));
		testPairs.add(new PatternTestPair("06", "NOTFA", getPatternNotForall(), "()"));
		testPairs.add(new PatternTestPair("06", "EXNOTEX", getPatternExistsNotExists(), "if ( not( exists (/ancestor::*)) and  exists (/*)) then (/*/*)"));
		testPairs.add(new PatternTestPair("06", "FANOTFA", getPatternForallNotForall(), "if ( not( exists (/parent::*))) then (/*/*)"));
		return testPairs;
	}

}
