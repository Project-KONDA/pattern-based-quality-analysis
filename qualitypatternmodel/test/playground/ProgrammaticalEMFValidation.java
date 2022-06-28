package playground;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.testutility.EMFValidationPreparation;

public class ProgrammaticalEMFValidation {
	public static void main(String[] args) {	

		EMFValidationPreparation.registerDelegates();
		
		PatternstructurePackage.eINSTANCE.eClass();		
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;		
		CompletePattern completePattern = factory.createCompletePattern();
		
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(completePattern);			
		
		printDiagnostic(diagnostic, "");
	}
	
	private static void printDiagnostic(Diagnostic diagnostic, String indent) {
		System.out.print(indent);
		System.out.println(diagnostic.getMessage());
		for (Diagnostic child : diagnostic.getChildren()) {
			printDiagnostic(child, indent + "  ");
		}
	}

}
