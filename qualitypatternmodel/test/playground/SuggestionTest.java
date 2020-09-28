package playground;

import org.basex.core.BaseXException;
import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.ocl.pivot.internal.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.pivot.internal.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.pivot.internal.delegate.OCLValidationDelegateFactory;
import org.eclipse.ocl.pivot.model.OCLstdlib;
import org.eclipse.ocl.xtext.oclinecore.OCLinEcoreStandaloneSetup;

import qualitypatternmodel.adaptionxml.RelationKind;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.LocalXmlDataDatabase;
import qualitypatternmodel.execution.LocalXmlSchemaDatabase;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.execution.impl.LocalXmlDataDatabaseImpl;
import qualitypatternmodel.execution.impl.LocalXmlSchemaDatabaseImpl;
import qualitypatternmodel.execution.impl.XmlDataDatabaseImpl;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.testutilityclasses.EMFModelLoad;
import qualitypatternmodel.testutilityclasses.EMFValidationPreparation;

public class SuggestionTest {
	public static void main(String[] args) {

		EMFValidationPreparation.registerDelegates();
		
		 // Loading the existing model
        EMFModelLoad loader = new EMFModelLoad();
        CompletePattern completePattern = loader.load("instances/playground/My2.patternstructure");
        
        LocalXmlDataDatabase db = new LocalXmlDataDatabaseImpl("test", "");        
        LocalXmlSchemaDatabase schema = new LocalXmlSchemaDatabaseImpl("C:/Users/Viola Wenz/Documents/Daten/1.1_lido-v1.1-draft.xsd");
        db.setXmlSchema(schema);
        db.setNamespace("lido:");
        try {
			schema.init();
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
        
        TextLiteralParam text = (TextLiteralParam) completePattern.getParameterList().getParameters().get(1);
        for(String s : text.inferElementTagSuggestions()) {
        	System.out.println(s);
        }
        
//        XmlNavigation nav = (XmlNavigation) completePattern.getGraph().getRelations().get(1);
//        for(RelationKind rel : nav.getOption().generateSuggestions()) {
//        	System.out.println(rel);
//        }
        
//        for(String s : db.getElementNames().keySet()) {
//        	System.out.println(s);
//        }
		
//		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(completePattern);			
//		
//		printDiagnostic(diagnostic, "");
        
        try {
			completePattern.isValid(AbstractionLevel.CONCRETE);
		} catch (InvalidityException | OperatorCycleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MissingPatternContainerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(completePattern.generateQuery());
		} catch (InvalidityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private static void printDiagnostic(Diagnostic diagnostic, String indent) {
		System.out.print(indent);
		System.out.println(diagnostic.getMessage());
		for (Diagnostic child : diagnostic.getChildren()) {
			printDiagnostic(child, indent + "  ");
		}
	}
}
