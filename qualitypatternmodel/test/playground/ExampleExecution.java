package playground;

import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.CreateDB;
import org.basex.core.cmd.XQuery;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.testutilityclasses.EMFModelLoad;
import qualitypatternmodel.testutilityclasses.EMFValidationPreparation;

public class ExampleExecution {
	public static void main(String[] args) {
		
		EMFValidationPreparation.registerDelegates();
		
		 // Loading the existing model
        EMFModelLoad loader = new EMFModelLoad();
//        Pattern pattern = loader.load("instances/playground/MatchAppellationUncertain.patternstructure");
        // TODO: create pattern "MatchAppellationUncertain.patternstructure"
		
//		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(pattern);			
//		
//		printDiagnostic(diagnostic, "");
//        
//        try {
//			pattern.isValid(false);
//		} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
		try {
//			String query = pattern.toXQuery();
			String query = "(//*[name()=\"lido:appellationValue\" and matches(./data(),\"\\?\")]/parent::*/parent::*/parent::*/parent::*/parent::*)[1]";
			Context context = new Context();		
//			new CreateDB("DBExample", "D:/Dokumente/LIDO/201902-Update/ddb_20190220/ddb_20190220_1.xml").execute(context);
			
			new CreateDB("DBExample", "D:\\Dokumente\\Lido\\ddb_20190220\\ddb_20190220\\ddb_20190220_1.xml").execute(context);
			XQuery xquery = new XQuery("(//*)[1]");
			String result = xquery.execute(context);
			System.out.println(result);
		} 
//		catch (InvalidityException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
		catch (BaseXException e) {
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
