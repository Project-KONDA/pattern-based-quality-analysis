package utilis;

import java.io.IOException;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

public class LoadSaveText {

	public static void main(String[] args) throws IOException, InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		QuantifiedCondition qcon = PatternstructureFactory.eINSTANCE.createQuantifiedCondition(); 
		pattern.setCondition(qcon);
		pattern.getGraph().getNodes().get(0).addOutgoing(qcon.getGraph()).getTarget().makePrimitive().addPrimitiveStringLength();
		
		System.out.println("\n base:");
		System.out.println(pattern.myToString());
		
		EMFModelSave.exportToFile2(pattern, "D:", "testpattern", "patternstructure");
		CompletePattern pattern2 = EMFModelLoad.loadCompletePattern("D:/testpattern.patternstructure");
		System.out.println("\n loaded:");
		System.out.println(pattern2.myToString());
		
		pattern2.createXmlAdaption();
		System.out.println("\n XML-adapted:");
		System.out.println(pattern2.myToString());

		EMFModelSave.exportToFile2(pattern2, "D:", "testpattern_xml", "patternstructure");
		CompletePattern pattern3 = EMFModelLoad.loadCompletePattern("D:/testpattern_xml.patternstructure");
		
		System.out.println("\n loaded XML:");
		System.out.println(pattern3.myToString());
		
		
		// TODO Auto-generated method stub

	}

}
