package qualitypatternmodel.translationtests;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.testutilityclasses.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.parameters.RelationOptionParam;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.adaptionxml.AdaptionxmlFactory;
import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.Axis;
import qualitypatternmodel.adaptionxml.XMLNavigation;
import qualitypatternmodel.adaptionxml.XMLRoot;
import qualitypatternmodel.exceptions.*;

public class Test01Axis {

	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		PatternstructurePackage.eINSTANCE.eClass();
//		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
//		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
//		completePatterns.add(Test00.getBasePattern()); // child
		
		for (Axis ax : Axis.VALUES) {
			completePatterns.add(getBasePatternAxisRoot(ax));
			completePatterns.add(getBasePatternAxisNotRoot(ax));
		}
		
		Test00.test(completePatterns);
	}

	public static CompletePattern getBasePatternAxisRoot(Axis axis) {		
		CompletePattern completePattern = Test00.getBasePattern();
		Element element1 = completePattern.getGraph().getElements().get(0);
		XMLNavigation relation = (XMLNavigation) element1.getIncoming().get(0);
		RelationOptionParam axisOption = relation.getOption();
		EList<Axis> axisOptions = axisOption.getOptions();
		if(!axisOptions.contains(axis)) axisOptions.add(axis);
		axisOption.setValue(axis);
		return completePattern;
	}
	
	public static CompletePattern getBasePatternAxisNotRoot(Axis axis) {
//		ParametersPackage.eINSTANCE.eClass();
//		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		AdaptionxmlPackage.eINSTANCE.eClass();
		AdaptionxmlFactory xmlFactory = AdaptionxmlFactory.eINSTANCE;
		
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
		XMLNavigation navigation = completePattern.getGraph().getElements().get(2).getIncoming().get(0).adaptAsXMLNavigation();		
		completePattern.finalizeXMLAdaption();			
		
		RelationOptionParam axisOption = navigation.getOption();
		EList<Axis> axisOptions = axisOption.getOptions();
		if(!axisOptions.contains(axis)) axisOptions.add(axis);
		axisOption.setValue(axis);
		return completePattern;
	}

	public static List<PatternTestPair> getTestPairs() {
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();

		for (Axis ax : Axis.VALUES) {
			if(ax != Axis.DESCENDANT && ax != Axis.ANCESTOR)
				testPairs.add(new PatternTestPair(ax.getName(), getBasePatternAxisRoot(ax), "/"+ax.getLiteral()+"::*"));
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
