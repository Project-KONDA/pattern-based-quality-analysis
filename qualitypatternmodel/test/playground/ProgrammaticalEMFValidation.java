package playground;

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
