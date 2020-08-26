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

import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.testutilityclasses.EMFModelLoad;
import qualitypatternmodel.testutilityclasses.EMFValidationPreparation;

public class AdaptionTest {
	public static void main(String[] args) {

		EMFValidationPreparation.registerDelegates();
		
		 // Loading the existing model
        EMFModelLoad loader = new EMFModelLoad();
        CompletePattern completePattern = loader.load("instances/playground/My.patternstructure");
		
//		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(completePattern);			
//		
//		printDiagnostic(diagnostic, "");
        
        try {
			completePattern.isValid(AbstractionLevel.GENERIC);
		} catch (InvalidityException | OperatorCycleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MissingPatternContainerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
//			System.out.println(completePattern.generateQuery());
//		} catch (InvalidityException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        
        try {
			completePattern.createXMLAdaption();
			XmlReference xmlReference = completePattern.getGraph().getRelations().get(0).adaptAsXMLReference();
			System.out.println(xmlReference);
			System.out.println(xmlReference.getSource());
			System.out.println(xmlReference.getTarget());
			System.out.println(xmlReference.getSource().getProperties().size());
			QuantifiedCondition qc = (QuantifiedCondition) completePattern.getCondition();
			XmlReference xmlReference2 = (XmlReference) qc.getGraph().getRelations().get(0);
			System.out.println(xmlReference2);
			System.out.println(xmlReference2.getSource());
			System.out.println(xmlReference2.getTarget());
			System.out.println(xmlReference2.getSource().getProperties().size());
			
		} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e) {
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
