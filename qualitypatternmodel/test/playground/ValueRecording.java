package playground;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.ExecutionFactory;
import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.xmltranslationtests.Test00;

public class ValueRecording {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		CompletePattern completePattern = Test00.getBasePatternCond("test");

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
