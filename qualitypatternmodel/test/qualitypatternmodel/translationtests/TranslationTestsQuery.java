package qualitypatternmodel.translationtests;

import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.CreateDB;
import org.basex.core.cmd.Open;
import org.basex.core.cmd.XQuery;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.util.Diagnostician;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.testutilityclasses.EMFModelLoad;
import qualitypatternmodel.testutilityclasses.EMFValidationPreparation;

public class TranslationTestsQuery {
	public static void main(String[] args) {
		/*
		 * given per test case:
		 * - pattern
		 * - manually written query
		 * - database (MIDAS, LIDO or self written test database)
		 * 
		 * approach: 
		 * - run pattern query
		 * - run manually written query
		 * - compare results
		 * 
		 */
		
		EMFValidationPreparation.registerDelegates();
		
//		Context context = new Context();
//		try {
//			String create = new CreateDB("DBExample", "D:\\Dokumente\\MIDAS\\fme-private-20190522\\fme-private-Seiten20190521.xml").execute(context);
//			System.out.println("created: " + create);
//		} catch (BaseXException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		"D:\\Dokumente\\Lido\\ddb_20190220\\ddb_20190220\\ddb_20190220_1.xml"
		runTest("instances/userstudy/disjp.patternstructure", "D:\\Dokumente\\MIDAS\\fme-private-20190522\\fme-private-Seiten20190521.xml", 
				"//*[@Type=\"kue\" and .//*[@Type=\"3100\"]/@Value=.//*[@Type=\"3105\"]/@Value]", "Test 1");
		
		
	}
	
	private static void runTest(String instancePath, String dataPath, String manualQuery, String testName) {
		try {
			String query = getQuery(instancePath);
			String result = applyQuery(query, dataPath);
//			String expectedResult = applyQuery(manualQuery, dataPath);
//			boolean isCorrect = compareResults(result, expectedResult);	
//			System.out.println(testName + ": " + isCorrect); 			
			// TODO: visualize result
		} catch (InvalidityException e) {
			// TODO: print output if pattern is not valid
			e.printStackTrace();
		} catch (BaseXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static boolean compareResults(String result, String expectedResult) {
		return result.equals(expectedResult);
	}
	
	private static String getQuery(String path) throws InvalidityException {
        EMFModelLoad loader = new EMFModelLoad();
        Pattern pattern = loader.load(path);
        DiagnosticChain diagnostics = null;
        if(!Diagnostician.INSTANCE.validate(pattern, diagnostics)) {
        	// TODO: print output if pattern is not valid
//    		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(pattern);		
//    		printDiagnostic(diagnostic, "");
        }
		try {
			pattern.isValid(true);
		} catch (InvalidityException e) {
			// TODO: print output if pattern is not valid
			e.printStackTrace();
		} catch (OperatorCycleException e) {
			// TODO: print output if pattern is not valid
			e.printStackTrace();
		} catch (MissingPatternContainerException e) {
			// TODO: print output if pattern is not valid
			e.printStackTrace();
		}
		return pattern.toXQuery();
		
	}
	
	private static String applyQuery(String query, String dataPath) throws BaseXException {		
		Context context = new Context();		
		new CreateDB("DBExample", "D:\\Dokumente\\MIDAS\\fme-private-20190522\\fme-private-Seiten20190521.xml").execute(context);
//		new Open("DBExample").execute(context);
		System.out.println("created");
		// TODO: is it OK to use the same name for each data base?
		XQuery xquery = new XQuery("/*");
		String result = xquery.execute(context);	
		System.out.println("executed");
		return result;
	}
}
