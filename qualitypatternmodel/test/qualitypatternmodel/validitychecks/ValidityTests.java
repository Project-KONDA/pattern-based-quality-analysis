package qualitypatternmodel.validitychecks;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.util.Diagnostician;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.testutilityclasses.EMFModelLoad;

public class ValidityTests {
	public static void main(String[] args) {
		
		// TODO: call checkValidity for each test case
		
	}

	private static void checkValidity(String path) {
		EMFModelLoad loader = new EMFModelLoad();
        Pattern pattern = loader.load(path);
        DiagnosticChain diagnostics = null;
        if(Diagnostician.INSTANCE.validate(pattern, diagnostics)) {
        	// TODO: print output if pattern is not valid
        }
//		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(pattern);		
//		printDiagnostic(diagnostic, "");
		try {
			pattern.isValid(true);
		} catch (InvalidityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (OperatorCycleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO: print output if pattern is valid
 catch (MissingPatternContainerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
