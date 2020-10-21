package qualitypatternmodel.testutility;

import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.ocl.pivot.internal.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.pivot.internal.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.pivot.internal.delegate.OCLValidationDelegateFactory;
import org.eclipse.ocl.pivot.model.OCLstdlib;
import org.eclipse.ocl.xtext.oclinecore.OCLinEcoreStandaloneSetup;

public class EMFValidationPreparation {
	public static void registerDelegates() {
		
		/*
		 *  org.eclipse.ocl.examples.pivot plug-in has been promoted to org.eclipse.ocl.pivot
		 */
		
		/* https://bugs.eclipse.org/bugs/show_bug.cgi?id=420208#c0
		 * "SettingDelegateFactory registration must occur before the static initialization of the EMF generated classes."
		 */
		
//		String oclDelegateURI = OCLDelegateDomain.OCL_DELEGATE_URI+"/Pivot";
//		String oclDelegateURI = OCLDelegateDomain.OCL_DELEGATE_URI;
		String oclDelegateURI = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
				    new OCLInvocationDelegateFactory.Global());
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
		    new OCLSettingDelegateFactory.Global());
		EValidator.ValidationDelegate.Registry.INSTANCE.put(oclDelegateURI,
		    new OCLValidationDelegateFactory.Global());
		
		OCLinEcoreStandaloneSetup.doSetup();
		OCLstdlib.install();
	}
}
