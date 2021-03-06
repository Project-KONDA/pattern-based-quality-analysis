package qualitypatternmodel.translationtests;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.testutility.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.parameters.RelationOptionParam;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.adaptionxml.AdaptionxmlFactory;
import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.RelationKind;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlRoot;
import qualitypatternmodel.exceptions.*;

public class Test01Axis {

	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		
		for (RelationKind ax : RelationKind.VALUES) {
			completePatterns.add(getBasePatternAxisRoot(ax));
			completePatterns.add(getBasePatternAxisNotRoot(ax));
			
		}
				
		Test00.test(completePatterns);
	}

	public static CompletePattern getBasePatternAxisRoot(RelationKind relationKind) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {		
		CompletePattern completePattern = Test00.getBasePattern();
		completePattern.createXMLAdaption();
		completePattern.finalizeXMLAdaption();
		XmlNavigation relation = (XmlNavigation) completePattern.getGraph().getRelations().get(0);
		RelationOptionParam axisOption = relation.getOption();
		EList<RelationKind> axisOptions = axisOption.getOptions();
		if(!axisOptions.contains(relationKind)) axisOptions.add(relationKind);
		axisOption.setValue(relationKind);
		return completePattern;
	}
	
	public static CompletePattern getBasePatternAxisNotRoot(RelationKind relationKind) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {		
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = Test00.getBasePattern();
		Graph graph = completePattern.getGraph();
		Element element1 = completePattern.getGraph().getElements().get(0);
		Element element2 = graphFactory.createElement();
		element2.setGraph(graph);
		Relation relation = graphFactory.createRelation();
		relation.setGraph(graph);
		relation.setSource(element1);
		relation.setTarget(element2);		
		
		completePattern.createXMLAdaption();
		XmlNavigation navigation = graph.getElements().get(1).getIncoming().get(0).adaptAsXMLNavigation();		
		completePattern.finalizeXMLAdaption();			
		
		RelationOptionParam axisOption = navigation.getOption();
		EList<RelationKind> axisOptions = axisOption.getOptions();
		if(!axisOptions.contains(relationKind)) axisOptions.add(relationKind);
		axisOption.setValue(relationKind);
		return completePattern;
	}

	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();

		for (RelationKind ax : RelationKind.VALUES) {
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
