package qualitypatternmodel.translationtests;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.testutility.PatternTestPair;
import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.AxisKind;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.*;

public class Test02Return {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternMultipleReturnNavigation());
		completePatterns.add(getPatternMultipleReturnReference());

		Test00.test(completePatterns);
	}

	public static CompletePattern getPatternMultipleReturnNavigation() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
			
		CompletePattern completePattern = Test00.getBasePattern();
		
		Graph graph = completePattern.getGraph();
		Node element1 = completePattern.getGraph().getNodes().get(0);
		Node element2 = graphFactory.createNode();		
		element2.setGraph(graph);
		element2.setResultOf(graph);
		Relation relation = graphFactory.createRelation();
		relation.setGraph(graph);
		relation.setSource(element1);
		relation.setTarget(element2);		
		
		completePattern.createXMLAdaption();
		completePattern.getGraph().getNodes().get(1).getIncoming().get(0).adaptAsXMLNavigation();		
		completePattern.finalizeXMLAdaption();
				
		return completePattern;
	}

	public static CompletePattern getPatternMultipleReturnReference() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
			
		CompletePattern completePattern = Test00.getBasePattern();
		
		Graph graph = completePattern.getGraph();
		Node element1 = completePattern.getGraph().getNodes().get(0);
		Node element2 = graphFactory.createNode();		
		element2.setGraph(graph);
		element2.setResultOf(graph);
		Relation relation = graphFactory.createRelation();
		relation.setGraph(graph);
		relation.setSource(element1);
		relation.setTarget(element2);		
		
		completePattern.createXMLAdaption();
		XmlReference reference = completePattern.getGraph().getNodes().get(1).getIncoming().get(0).adaptAsXMLReference();	
		reference.setType(ReturnType.STRING);
		completePattern.finalizeXMLAdaption();
		
		((XmlNavigation) completePattern.getGraph().getRelations().get(1)).getOption().getOptions().add(AxisKind.DESCENDANT);
		((XmlNavigation) completePattern.getGraph().getRelations().get(1)).getOption().setValue(AxisKind.DESCENDANT);
		
		((XmlNavigation) completePattern.getGraph().getRelations().get(2)).getOption().getOptions().add(AxisKind.DESCENDANT);
		((XmlNavigation) completePattern.getGraph().getRelations().get(2)).getOption().setValue(AxisKind.DESCENDANT);
		
		reference.getSourceProperty().getOption().getOptions().add(PropertyKind.ATTRIBUTE);
		reference.getSourceProperty().getOption().setValue(PropertyKind.ATTRIBUTE);
		reference.getSourceProperty().getAttributeName().setValue("demo:id");
		
		reference.getTargetProperty().getOption().getOptions().add(PropertyKind.ATTRIBUTE);
		reference.getTargetProperty().getOption().setValue(PropertyKind.ATTRIBUTE);
		reference.getTargetProperty().getAttributeName().setValue("demo:id");
				
		return completePattern;
	}
	
	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		testPairs.add(new PatternTestPair("MUL_RET_NAV", getPatternMultipleReturnNavigation(), "for $x1 in /* for $x2 in $x1/* return ($x1, $x2)"));
		testPairs.add(new PatternTestPair("MUL_RET_REF", getPatternMultipleReturnReference(), "for $x1 in //* for $x2 in //*[@*[name()='demo:id']=$x1/@*[name()='demo:id']] return ($x1, $x2)"));
		return testPairs;		
	}
	
}
