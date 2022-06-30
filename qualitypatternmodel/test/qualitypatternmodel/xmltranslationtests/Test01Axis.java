package qualitypatternmodel.xmltranslationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.xmltestutility.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.exceptions.*;

public class Test01Axis {

	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		
		for (XmlAxisKind ax : XmlAxisKind.VALUES) {
			completePatterns.add(getBasePatternAxisRoot(ax));
			completePatterns.add(getBasePatternAxisNotRoot(ax));
			
		}
				
		Test00.test(completePatterns);
	}

	public static CompletePattern getBasePatternAxisRoot(XmlAxisKind xmlAxisKind) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {		
		CompletePattern completePattern = Test00.getBasePattern();
		completePattern.createXmlAdaption();
		XmlNavigation relation = (XmlNavigation) completePattern.getGraph().getRelations().get(0);
		XmlPathParam axisOption = relation.getXmlPathParam();
//		EList<AxisKind> axisOptions = axisOption.getOptions();
//		if(!axisOptions.contains(axisKind)) axisOptions.add(axisKind);
		axisOption.setXmlAxis(xmlAxisKind, "");
		return completePattern;
	}
	
	public static CompletePattern getBasePatternAxisNotRoot(XmlAxisKind xmlAxisKind) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {		
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = Test00.getBasePattern();
		Graph graph = completePattern.getGraph();
		Node element1 = completePattern.getGraph().getNodes().get(0);
		Node element2 = graphFactory.createNode();
		element2.setGraph(graph);
		Relation relation = graphFactory.createRelation();
		relation.setGraph(graph);
		relation.setSource(element1);
		relation.setTarget(element2);		
		
		completePattern.createXmlAdaption();
		XmlElementNavigation navigation = (XmlElementNavigation) graph.getRelations().get(0);		
		
		XmlPathParam axisOption = navigation.getXmlPathParam();
//		EList<AxisKind> axisOptions = axisOption.getOptions();
//		if(!axisOptions.contains(axisKind)) axisOptions.add(axisKind);
		axisOption.setXmlAxis(xmlAxisKind, "");
		return completePattern;
	}

	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();

		for (XmlAxisKind ax : XmlAxisKind.VALUES) {
			testPairs.add(new PatternTestPair(ax.getName()+"_ROOT", getBasePatternAxisRoot(ax), ax.getLiteral()));
			testPairs.add(new PatternTestPair(ax.getName(), getBasePatternAxisNotRoot(ax), "for $x in /* for $y in $x" + ax.getLiteral() + " return $x"));
		}
		
		
		
//		testPairs.add(new PatternTestPair("CHILD", 				getBasePatternAxis(Axis.CHILD), 				"/child::*"));
////		testPairs.add(new PatternTestPair("PARENT", 			getBasePatternAxis(Axis.PARENT), 				"/parent::*"));
//		testPairs.add(new PatternTestPair("SELF", 				getBasePatternAxis(Axis.SELF), 				"/self::*"));
////		testPairs.add(new PatternTestPair("ANCESTOR", 			getBasePatternAxis(Axis.ANCESTOR), 			"/ancestor::*"));
//		testPairs.add(new PatternTestPair("ANCESTOR_OR_SELF", 	getBasePatternAxis(Axis.ANCESTOR_OR_SELF), 	"/ancestor-or-self::*"));
//		testPairs.add(new PatternTestPair("DESCENDANT", 		getBasePatternAxis(Axis.DESCENDANT), 			"/descendant::*"));
//		testPairs.add(new PatternTestPair("DESCENDANT_OR_SELF", getBasePatternAxis(Axis.DESCENDANT_OR_SELF), 	"/descendant-or-self::*"));
//		testPairs.add(new PatternTestPair("FOLLOWING", 			getBasePatternAxis(Axis.FOLLOWING), 			"/following::*"));
//		testPairs.add(new PatternTestPair("FOLLOWING_SIBLING", 	getBasePatternAxis(Axis.FOLLOWING_SIBLING), 	"/following-sibling::*"));
//		testPairs.add(new PatternTestPair("PRECEDING", 			getBasePatternAxis(Axis.PRECEDING), 			"/preceding::*"));
//		testPairs.add(new PatternTestPair("PRECEDING_SIBLING", 	getBasePatternAxis(Axis.PRECEDING_SIBLING), 	"/preceding-sibling::*"));
		return testPairs;
	}

}
