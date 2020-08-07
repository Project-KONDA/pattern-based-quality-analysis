package playground;

import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.ExecutionFactory;
import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.XmlDatabase;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.testutilityclasses.EMFModelLoad;
import qualitypatternmodel.testutilityclasses.EMFValidationPreparation;

public class DBValueRecordingTest {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		EMFValidationPreparation.registerDelegates();
        EMFModelLoad loader = new EMFModelLoad();
        CompletePattern completePattern = loader.load("instances/playground/My9.patternstructure");
        
        completePattern.createXMLAdaption();
        completePattern.finalizeXMLAdaption();
        
        ((XmlProperty) completePattern.getGraph().getElements().get(0).getProperties().get(0)).getOption().setValue(PropertyKind.DATA);
                
        try {
			completePattern.isValid(AbstractionLevel.CONCRETE);
		} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        ExecutionPackage.eINSTANCE.eClass();
		ExecutionFactory factory = ExecutionFactory.eINSTANCE;
        
        XmlDatabase db = factory.createXmlDatabase();
        completePattern.setDatabase(db);
        try {
			completePattern.recordValues();
		} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        for(String s : db.getRecordedDataValues().keySet()) {
        	System.out.println(s);
        }
        
	}
}
