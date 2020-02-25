package qualitypatternmodel.translationtests;

import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.CreateDB;
import org.basex.core.cmd.XQuery;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.ocl.pivot.internal.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.pivot.internal.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.pivot.internal.delegate.OCLValidationDelegateFactory;
import org.eclipse.ocl.pivot.model.OCLstdlib;
import org.eclipse.ocl.xtext.oclinecore.OCLinEcoreStandaloneSetup;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.testutilityclasses.EMFModelLoad;
import qualitypatternmodel.testutilityclasses.EMFValidationPreparation;

public class TranslationTestsManualMarking {
	
	public static void main(String[] args) {
        
		EMFValidationPreparation.registerDelegates();
		
        // TODO: call runTest for each test case

	}
	
	private static void runTest(String instancePath, String dataPath, String testName) {
		String query;
		try {
			query = getQuery(instancePath);
//			String result = applyQuery(query, dataPath);
			boolean isCorrect = checkSelection(query, dataPath);	
			// TODO: visualize result
		} catch (InvalidityException | OperatorCycleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MissingPatternContainerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static boolean checkSelection(String query, String dataPath) {
		// TODO: 1. check if every selected element was expected to be selected (find false positives)
		// result of query "for $a in (query) where empty($a[@expected]) return $a" must be empty
		
		// TODO: 2. check if every expected element got selected (find false negatives)
		// result of query "let $q := (query) for $n in originalXML[@expected] where not(exists($q intersect $n))" must be empty		
		/* alternative: mark selected elements in whole 
		 * result of query
		 * "for $a in (
		 * ... 
		 * for $x ... return if(...where clause...) then ( element{$x/name()} {
		 * $x/@*, attribute { 'selected' } { '1' } }
		 * 
		 * ) else ($x)
		 * )
		 * where $a[@expected] and not($a[@selected])
		 * return $a"
		 * must be empty
		 * 
		 * Is this method problematic if there are multiple return elements in the pattern?
		 */
		return false;
		
	}
	
	private static String applyQuery(String query, String dataPath) throws BaseXException {		
		Context context = new Context();		
		new CreateDB("DBExample", dataPath).execute(context);
		// TODO: is it OK to use the same name for each data base?
		XQuery xquery = new XQuery(query);
		String result = xquery.execute(context);		
		return result;
	}

	private static String getQuery(String path) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// Loading the existing model
        EMFModelLoad loader = new EMFModelLoad();
        Pattern pattern = loader.load(path);
        DiagnosticChain diagnostics = null;
        if(Diagnostician.INSTANCE.validate(pattern, diagnostics)) {
        	// TODO: print output if pattern is not valid
        }
//		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(pattern);		
//		printDiagnostic(diagnostic, "");
		pattern.isValid(true);
		return pattern.toXQuery();
		
	}


	
	private static void printDiagnostic(Diagnostic diagnostic, String indent) {
		System.out.print(indent);
		System.out.println(diagnostic.getMessage());
		for (Diagnostic child : diagnostic.getChildren()) {
			printDiagnostic(child, indent + "  ");
		}
	}

}
