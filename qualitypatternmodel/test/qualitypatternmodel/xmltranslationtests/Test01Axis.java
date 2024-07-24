package qualitypatternmodel.xmltranslationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlAxisPart;
import qualitypatternmodel.adaptionxml.XmlAxisPartCondition;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.impl.XmlAxisPartConditionImpl;
import qualitypatternmodel.adaptionxml.impl.XmlPropertyOptionParamImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.utility.PatternUtility;
import qualitypatternmodel.xmltestutility.PatternTestPair;

public class Test01Axis {
	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		for (XmlAxisKind ax : XmlAxisKind.VALUES) {
			completePatterns.add(getBasePatternAxisRoot(ax));
			completePatterns.add(getBasePatternAxisNotRoot(ax));
		}
		for (XmlPropertyKind kind : XmlPropertyKind.VALUES) {
			completePatterns.add(getBasePatternAxisPart(kind, null));
			completePatterns.add(getBasePatternAxisPart(kind, "test"));
		}
		return completePatterns;
	}

    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternUtility.testPatterns(getPatterns());
	}

	public static CompletePattern getBasePatternAxisRoot(XmlAxisKind xmlAxisKind) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.createXmlAdaption();
		XmlNavigation relation = (XmlNavigation) completePattern.getGraph().getRelations().get(0);
		XmlPathParam axisOption = relation.getXmlPathParam();
//		EList<AxisKind> axisOptions = axisOption.getOptions();
//		if(!axisOptions.contains(axisKind)) axisOptions.add(axisKind);
		axisOption.setXmlAxis(xmlAxisKind, null);
		return completePattern;
	}

	public static CompletePattern getBasePatternAxisNotRoot(XmlAxisKind xmlAxisKind) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;

		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		Graph graph = completePattern.getGraph();
		Node element1 = completePattern.getGraph().getReturnNodes().get(0);
		Node element2 = graphFactory.createNode();
		element2.setGraph(graph);
		element2.addOutgoing(element1);

		completePattern.createXmlAdaption();
		XmlElementNavigation navigation = (XmlElementNavigation) graph.getRelations().get(0);

		XmlPathParam axisOption = navigation.getXmlPathParam();
		axisOption.setXmlAxis(xmlAxisKind, null);
		return completePattern;
	}

	private static CompletePattern getBasePatternAxisPart(XmlPropertyKind type, String value) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		completePattern.createXmlAdaption();
		XmlPathParam relation = ((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getXmlPathParam();
		XmlAxisPart part = relation.getXmlAxisParts().get(0);
		XmlAxisPartCondition cond = new XmlAxisPartConditionImpl();
		part.getXmlAxisPartConditions().clear();
		part.getXmlAxisPartConditions().add(cond);
		if (cond.getXmlPropertyOption() == null) {
			cond.setXmlPropertyOption(new XmlPropertyOptionParamImpl());
		}
		cond.getXmlPropertyOption().setValue(type);
		if (type.equals(XmlPropertyKind.ATTRIBUTE)) {
			cond.getXmlPropertyOption().getAttributeName().setValue("attribute");
		}
		if (value != null) {
			if (cond.getTextLiteralParam() == null) {
				cond.setTextLiteralParam(new TextLiteralParamImpl());
			}
			cond.getTextLiteralParam().setValue(value);
		}
		return completePattern;
	}

	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();

		for (XmlAxisKind ax : XmlAxisKind.VALUES) {
			testPairs.add(new PatternTestPair("01a", ax.getName()+"_ROOT", getBasePatternAxisRoot(ax), ax.getLiteral()));
			testPairs.add(new PatternTestPair("01a", ax.getName(), getBasePatternAxisNotRoot(ax), "/* " + ax.getLiteral()));
		}
		return testPairs;
	}
}
