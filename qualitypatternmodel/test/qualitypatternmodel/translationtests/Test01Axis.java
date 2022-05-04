package qualitypatternmodel.translationtests;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.testutility.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.adaptionxml.AdaptionxmlFactory;
import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.AxisKind;
import qualitypatternmodel.adaptionxml.AxisOptionParam;
import qualitypatternmodel.adaptionxml.PathParam;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlRoot;
import qualitypatternmodel.exceptions.*;

public class Test01Axis {

	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		
		for (AxisKind ax : AxisKind.VALUES) {
			completePatterns.add(getBasePatternAxisRoot(ax));
			completePatterns.add(getBasePatternAxisNotRoot(ax));
			
		}
				
		Test00.test(completePatterns);
	}

	public static CompletePattern getBasePatternAxisRoot(AxisKind axisKind) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {		
		CompletePattern completePattern = Test00.getBasePattern();
		completePattern.createXMLAdaption();
		completePattern.finalizeXMLAdaption();
		XmlNavigation relation = (XmlNavigation) completePattern.getGraph().getRelations().get(0);
		PathParam axisOption = relation.getPathParam();
		EList<AxisKind> axisOptions = axisOption.getOptions();
		if(!axisOptions.contains(axisKind)) axisOptions.add(axisKind);
		axisOption.setAxis(axisKind, "");
		return completePattern;
	}
	
	public static CompletePattern getBasePatternAxisNotRoot(AxisKind axisKind) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {		
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
		
		completePattern.createXMLAdaption();
		XmlNavigation navigation = graph.getNodes().get(1).getIncoming().get(0).adaptAsXMLNavigation();		
		completePattern.finalizeXMLAdaption();			
		
		PathParam axisOption = navigation.getPathParam();
		EList<AxisKind> axisOptions = axisOption.getOptions();
		if(!axisOptions.contains(axisKind)) axisOptions.add(axisKind);
		axisOption.setAxis(axisKind, "");
		return completePattern;
	}

	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();

		for (AxisKind ax : AxisKind.VALUES) {
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
