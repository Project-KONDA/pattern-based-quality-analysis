package playground;

import static qualitypatternmodel.testutility.DatabaseConstants.DEMO_DATABASE_NAME;
import static qualitypatternmodel.testutility.DatabaseConstants.DEMO_DATA_PATH;
import static qualitypatternmodel.testutility.DatabaseConstants.DEMO_SCHEMA_NAME;
import static qualitypatternmodel.testutility.DatabaseConstants.DEMO_SCHEMA_PATH;

import org.basex.core.BaseXException;
import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.eclipse.emf.common.util.Diagnostic;

import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.LocalXmlDataDatabase;
import qualitypatternmodel.execution.LocalXmlSchemaDatabase;
import qualitypatternmodel.execution.impl.LocalXmlDataDatabaseImpl;
import qualitypatternmodel.execution.impl.LocalXmlSchemaDatabaseImpl;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.testutility.EMFValidationPreparation;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.utility.EMFModelLoad;

public class SuggestionGeneration {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		CompletePattern completePattern = Test00.getBasePatternCondConcrete("*");
		((XmlProperty) completePattern.getGraph().getElements().get(0).getProperties().get(0)).getOption().getOptions().add(PropertyKind.TAG);
		((XmlProperty) completePattern.getGraph().getElements().get(0).getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
        
		try {
			completePattern.isValid(AbstractionLevel.CONCRETE);
		} catch (InvalidityException | OperatorCycleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MissingPatternContainerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
        LocalXmlDataDatabase db = new LocalXmlDataDatabaseImpl(DEMO_DATABASE_NAME, DEMO_DATA_PATH);        
        LocalXmlSchemaDatabase schema = new LocalXmlSchemaDatabaseImpl(DEMO_SCHEMA_NAME, DEMO_SCHEMA_PATH);
        schema.setNamespace("demo:");
        db.setXmlSchema(schema);                   
        
        try {
			db.init();
		} catch (BaseXException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (QueryIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (QueryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        completePattern.setDatabase(db);
        
        System.out.println("> Element Tag Suggestions:\n");
        TextLiteralParam text = (TextLiteralParam) completePattern.getParameterList().getParameters().get(0);
        for(String s : text.inferElementTagSuggestions()) {
        	System.out.println(s);
        }
        
//        for(String s : db.getElementNames().keySet()) {
//        	System.out.println(s);
//        }

        
        
	}
	

}
