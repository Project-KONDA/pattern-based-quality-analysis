package playground;

import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.ExecutionFactory;
import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.testutility.EMFModelLoad;
import qualitypatternmodel.testutility.EMFValidationPreparation;
import qualitypatternmodel.translationtests.Test00;

public class ValueRecording {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		CompletePattern completePattern = Test00.getBasePatternCondConcrete("test");
                
        try {
			completePattern.isValid(AbstractionLevel.CONCRETE);
		} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        ExecutionPackage.eINSTANCE.eClass();
		ExecutionFactory factory = ExecutionFactory.eINSTANCE;
        
        XmlDataDatabase db = factory.createXmlDataDatabase();
        completePattern.setDatabase(db);
        try {
			completePattern.recordValues();
		} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println("> Recorded Data Values:\n");
        for(String s : db.getRecordedDataValues().keySet()) {
        	System.out.println(s);
        }
        
	}
}
