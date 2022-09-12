package qualitypatternmodel.xmltranslationtests;
import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.xmltestutility.PatternTestPair;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.parameters.TextLiteralParam;

public class Test02Return {
	
	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternMultipleReturnNavigation());
		completePatterns.add(getPatternMultipleReturnReference());
		return completePatterns;
	}
	
    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		Test00.test(getPatterns());
	}

	public static CompletePattern getPatternMultipleReturnNavigation() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
			
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();;
		
		Graph graph = completePattern.getGraph();
		Node element1 = completePattern.getGraph().getNodes().get(0);
		Node element2 = element1.addOutgoing().getTarget();
		element2.setReturnNode(true);
		
		completePattern.createXmlAdaption();
				
		return completePattern;
	}

	public static CompletePattern getPatternMultipleReturnReference() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();;
		
		Graph graph = completePattern.getGraph();
		Node element1 = completePattern.getGraph().getNodes().get(0);
		Node element2 = element1.addOutgoing().getTarget();		
		element2.setReturnNode(true);
		
		completePattern.createXmlAdaption();
		
		XmlReference reference = ((ComplexNode) completePattern.getGraph().getNodes().get(1)).getOutgoing().get(0).adaptAsXmlReference();	
		reference.setType(ReturnType.STRING);
//		completePattern.finalizeXMLAdaption();
		
//		((XmlNavigation) completePattern.getGraph().getRelations().get(1)).getPathParam().getOptions().add(AxisKind.DESCENDANT);
		XmlElementNavigation nav2 = (XmlElementNavigation) completePattern.getGraph().getRelations().get(0);
		nav2.getXmlPathParam().setXmlAxis(XmlAxisKind.DESCENDANT, "");
		
//		((XmlNavigation) completePattern.getGraph().getRelations().get(2)).getPathParam().getOptions().add(AxisKind.DESCENDANT);
//		XmlElementNavigation nav3 = (XmlElementNavigation) completePattern.getGraph().getRelations().get(4);
//		nav3.getPathParam().setAxis(AxisKind.DESCENDANT, "");
//		((XmlElementNavigation) completePattern.getGraph().getRelations().get(2)).getPathParam().setAxis(AxisKind.DESCENDANT, "");
		
//		reference.getSourceProperty().getOption().getOptions().add(PropertyKind.ATTRIBUTE);
		XmlPropertyOptionParam pop = reference.getSourcePropertyPath().getXmlPropertyOptionParam();
		pop.setValue(XmlPropertyKind.ATTRIBUTE);
		
//		System.out.println(completePattern.myToString() + "\n\n");
		TextLiteralParam an2 = pop.getAttributeName();
//		System.out.println(an2 == null);
		an2.setValue("demo:id");
		
//		reference.getTargetProperty().getOption().getOptions().add(PropertyKind.ATTRIBUTE);
		XmlPropertyOptionParam pop2 = reference.getSourcePropertyPath().getXmlPropertyOptionParam();
		pop2.setValue(XmlPropertyKind.ATTRIBUTE);
		TextLiteralParam an = pop2.getAttributeName();
//		System.out.println(an);
		an.setValue("demo:id");
				
		return completePattern;
	}
	
	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		testPairs.add(new PatternTestPair("MUL_RET_NAV", getPatternMultipleReturnNavigation(), "for $x1 in /* for $x2 in $x1/* return ($x1, $x2)"));
		testPairs.add(new PatternTestPair("MUL_RET_REF", getPatternMultipleReturnReference(), "for $x1 in //* for $x2 in //*[@*[name()='demo:id']=$x1/@*[name()='demo:id']] return ($x1, $x2)"));
		return testPairs;		
	}
	
}
