package qualitypatternmodel.validitychecks;

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

import qualitypatternmodel.patternstructure.InvalidityException;
import qualitypatternmodel.patternstructure.Pattern;

public class ValidityTest {
	public static void main(String[] args) {

		/* https://bugs.eclipse.org/bugs/show_bug.cgi?id=420208#c0
		 * "SettingDelegateFactory registration must occur before the static initialization of the EMF generated classes."
		 */
        
        String oclDelegateURI = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
				    new OCLInvocationDelegateFactory.Global());
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
		    new OCLSettingDelegateFactory.Global());
		EValidator.ValidationDelegate.Registry.INSTANCE.put(oclDelegateURI,
		    new OCLValidationDelegateFactory.Global());
		
		OCLinEcoreStandaloneSetup.doSetup();
		OCLstdlib.install();
		
		 // Loading the existing model
        EMFModelLoad loader = new EMFModelLoad();
        Pattern pattern = loader.load();
		
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(pattern);			
		
		printDiagnostic(diagnostic, "");
        
        try {
			pattern.isValid(false);
		} catch (InvalidityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			try {
				System.out.println(pattern.toXQuery());
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
