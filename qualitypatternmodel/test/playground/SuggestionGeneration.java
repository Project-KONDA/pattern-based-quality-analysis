package playground;

import static qualitypatternmodel.xmltestutility.DatabaseConstants.DEMO_DATABASE_NAME;
import static qualitypatternmodel.xmltestutility.DatabaseConstants.DEMO_DATA_PATH;
import static qualitypatternmodel.xmltestutility.DatabaseConstants.DEMO_SCHEMA_NAME;
import static qualitypatternmodel.xmltestutility.DatabaseConstants.DEMO_SCHEMA_PATH;

import java.io.IOException;
import java.util.List;

import org.basex.core.BaseXException;
import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.eclipse.emf.common.util.Diagnostic;

import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.LocalXmlDataDatabase;
import qualitypatternmodel.execution.LocalXmlSchemaDatabase;
import qualitypatternmodel.execution.impl.LocalXmlDataDatabaseImpl;
import qualitypatternmodel.execution.impl.LocalXmlSchemaDatabaseImpl;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.xmltestutility.EMFValidationPreparation;
import qualitypatternmodel.xmltranslationtests.Test00;

public class SuggestionGeneration {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		CompletePattern completePattern = Test00.getBasePatternCond("*");

		List<Parameter> params = completePattern.getParameterList().getParameters();
		TextLiteralParam p0 = ((TextLiteralParam) params.get(0));
		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
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
        
        System.out.println("> Element Tag Suggestions:\n");
        TextLiteralParam text = (TextLiteralParam) completePattern.getParameterList().getParameters().get(0);
        for(String s : text.inferElementTagSuggestions()) {
        	System.out.println(s);
        }
    }
}