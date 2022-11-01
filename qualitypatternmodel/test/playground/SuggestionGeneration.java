package playground;

import static qualitypatternmodel.xmltestutility.DatabaseConstants.DEMO_DATABASE_NAME;
import static qualitypatternmodel.xmltestutility.DatabaseConstants.DEMO_DATA_PATH;
import static qualitypatternmodel.xmltestutility.DatabaseConstants.DEMO_SCHEMA_NAME;
import static qualitypatternmodel.xmltestutility.DatabaseConstants.DEMO_SCHEMA_PATH;

import java.util.List;

import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.LocalXmlDataDatabase;
import qualitypatternmodel.execution.LocalXmlSchemaDatabase;
import qualitypatternmodel.execution.impl.LocalXmlDataDatabaseImpl;
import qualitypatternmodel.execution.impl.LocalXmlSchemaDatabaseImpl;
//import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.xmltranslationtests.Test00;

public class SuggestionGeneration {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		CompletePattern completePattern = Test00.getBasePatternCond("*");

		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
//		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		XmlPathParam p4 = ((XmlPathParam) params.get(4));
		
//		p0.setValue("demo:name");
		p4.setXmlAxis(XmlAxisKind.DESCENDANT, "demo:name");
		
		System.out.println(completePattern.myToString());
		
		try {
			completePattern.isValid(AbstractionLevel.ABSTRACT);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
        LocalXmlDataDatabase db = new LocalXmlDataDatabaseImpl(DEMO_DATABASE_NAME, DEMO_DATA_PATH);        
        LocalXmlSchemaDatabase schema = new LocalXmlSchemaDatabaseImpl(DEMO_SCHEMA_NAME, DEMO_SCHEMA_PATH);
        schema.setNamespace("demo:");
        db.setXmlSchema(schema);                   
        
        try {
			db.init();
		} catch (Exception e) {
			e.printStackTrace();
		}
        completePattern.setDatabase(db);
        
        System.out.println("> P0 Element Tag Suggestions:\n");
        for(String s : p0.inferSuggestions()) {
        	System.out.println(s);
        }

        System.out.println("> P4 Element Tag Suggestions:\n");
//        TextLiteralParam text = (TextLiteralParam) completePattern.getParameterList().getParameters().get(0);
        TextLiteralParam text = p4.getXmlAxisPairs().get(0).getTextLiteralParam();
        for(String s : text.inferSuggestions()) {
        	System.out.println(s);
        }
    }
}