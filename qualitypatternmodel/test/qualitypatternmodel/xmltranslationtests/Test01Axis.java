package qualitypatternmodel.xmltranslationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.AbstractionLevel;
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
		for (CompletePattern test: completePatterns) {
			test.isValid(AbstractionLevel.CONCRETE);
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
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		Graph graph = completePattern.getGraph();
		Node element1 = completePattern.getGraph().getReturnNodes().get(0);
		element1.addOutgoing(graph);

		completePattern.createXmlAdaption();
		XmlElementNavigation navigation = (XmlElementNavigation) graph.getRelations().get(0);

		XmlPathParam axisOption = navigation.getXmlPathParam();
		axisOption.setXmlAxis(xmlAxisKind, null);
		List<Parameter> params = completePattern.getParameterList().getParameters();
		((XmlPathParam) params.get(0)).setValueFromString("/*");
		((XmlPathParam) params.get(1)).setValueFromString(xmlAxisKind + "*");
		return completePattern;
	}

	private static CompletePattern getBasePatternAxisPart(XmlPropertyKind type, String value) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		completePattern.createXmlAdaption();
		
		String axisvalue = "/*[";
		if (type == XmlPropertyKind.ATTRIBUTE)
			axisvalue += "@attribute";
		else if (type == XmlPropertyKind.TAG)
			axisvalue += "name()";
		else if (type == XmlPropertyKind.DATA)
			axisvalue += "data()";
		if (value != null)
			axisvalue += "=\"" + value + "\"";
		axisvalue += "]";
		
		List<Parameter> params = completePattern.getParameterList().getParameters();
		((XmlPathParam) params.get(0)).setValueFromString(axisvalue);
		return completePattern;
	}

	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();

		for (XmlAxisKind ax : XmlAxisKind.VALUES) {
			testPairs.add(new PatternTestPair("01a", ax.getName()+"_ROOT", getBasePatternAxisRoot(ax), ax.getLiteral() + "*"));
			testPairs.add(new PatternTestPair("01a", ax.getName(), getBasePatternAxisNotRoot(ax), "/* " + ax.getLiteral() + "*"));
		}
		return testPairs;
	}
}
