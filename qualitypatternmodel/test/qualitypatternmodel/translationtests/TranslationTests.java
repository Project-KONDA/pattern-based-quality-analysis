package qualitypatternmodel.translationtests;

import java.util.ArrayList;
import java.util.List;

import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.CreateDB;
import org.basex.core.cmd.Open;
import org.basex.core.cmd.XQuery;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.util.Diagnostician;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.testutilityclasses.EMFModelLoad;
import qualitypatternmodel.testutilityclasses.EMFValidationPreparation;
import qualitypatternmodel.testutilityclasses.PatternTestPair;

public class TranslationTests {
	private static Context context;
	
	public static void main(String[] args) {		
		
		EMFValidationPreparation.registerDelegates();
		createContext();
		openDatabase("DBExample", "D:\\Dokumente\\MIDAS\\20190522\\fme-private-Seiten20190521.xml");
		
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		// TODO: add all test cases to testpairs
		testPairs.addAll(test00.getTestPairs());
		testPairs.addAll(test01_axis.getTestPairs());
		testPairs.addAll(test02_return.getTestPairs());
		testPairs.addAll(test03_quantor.getTestPairs());
		testPairs.addAll(test04_quantorcombinations.getTestPairs());
		testPairs.addAll(test05_quantorcombinations_cond.getTestPairs());
		testPairs.addAll(test06_formula.getTestPairs());
		
		for(PatternTestPair testPair : testPairs) {
			runTestQueryResultComparison(testPair);
		}
		
//		runTestQueryResultComparison("instances/userstudy/disjp.patternstructure",
//				"//*[@Type=\"kue\" and .//*[@Type=\"3100\"]/@Value=.//*[@Type=\"3105\"]/@Value]", "Test 1");		
		
	}
	
	private static void runTestQueryResultComparison(PatternTestPair testPair) {
		// compares the pattern query result with that of the manually written query
		
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
		
		try {
			testPair.getPattern().isValid(true);
			String result = applyQuery(testPair.getPattern().toXQuery());
			String expectedResult = applyQuery(testPair.getManualQuery());
			boolean isCorrect = compareResults(result, expectedResult);	
			if(isCorrect) {
				System.out.println(testPair.getName() + ": succeeded");
			} else {
				System.out.println(testPair.getName() + ": failed");
			}
			// TODO: visualize result
		} catch (InvalidityException e) {
			// TODO: print output if pattern is not valid
			e.printStackTrace();
		} catch (BaseXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (OperatorCycleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MissingPatternContainerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	private static String applyQuery(String query) throws BaseXException {		
		XQuery xquery = new XQuery(query);
		String result = xquery.execute(context);	
		System.out.println("query executed");
		return result;
	}
	
	private static boolean compareResults(String result, String expectedResult) {
		// compares the results of the pattern query to that of the manually written query
		// TODO: use XQuery instead for checking equality?
		return result.equals(expectedResult);
	}
	
	private static void createContext() {
		context = new Context();
	}
	private static void openDatabase(String databaseName, String dataPath) {
		try {
			new Open(databaseName).execute(context);
			System.out.println("opened database " + databaseName);
		} catch (BaseXException e) {
			try {
				new CreateDB(databaseName, dataPath).execute(context);
				System.out.println("created database " + databaseName + " with data " + dataPath);
			} catch (BaseXException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}				
	}		
	
	private static void printDiagnostic(Diagnostic diagnostic, String indent) {
		System.out.print(indent);
		System.out.println(diagnostic.getMessage());
		for (Diagnostic child : diagnostic.getChildren()) {
			printDiagnostic(child, indent + "  ");
		}
	}
	
//	private static boolean checkSelection(String query) {
//		// check selection against manually inserted markings
//		
//		// TODO: 1. check if every selected element was expected to be selected (find false positives)
//		// result of query "for $a in (query) where empty($a[@expected]) return $a" must be empty
//		
//		// TODO: 2. check if every expected element got selected (find false negatives)
//		// result of query "let $q := (query) for $n in originalXML[@expected] where not(exists($q intersect $n))" must be empty		
//		/* alternative: mark selected elements in whole 
//		 * result of query
//		 * "for $a in (
//		 * ... 
//		 * for $x ... return if(...where clause...) then ( element{$x/name()} {
//		 * $x/@*, attribute { 'selected' } { '1' } }
//		 * 
//		 * ) else ($x)
//		 * )
//		 * where $a[@expected] and not($a[@selected])
//		 * return $a"
//		 * must be empty
//		 * 
//		 * Is this method problematic if there are multiple return elements in the pattern?
//		 */
//		return false;
//		
//	}
	
//	private static void runTestCheckMarkings(String instancePath, String testName) {
//		// checks the pattern query result against markings (e.g. @expected="true()") manually inserted into the database
//		try {
//			String query = getQuery(instancePath);
//			String result = applyQuery(query);
//			boolean isCorrect = checkSelection(result);	
//			if(isCorrect) {
//				System.out.println(testName + ": succeeded");
//			} else {
//				System.out.println(testName + ": failed");
//			}
//			// TODO: visualize result
//		} catch (InvalidityException e) {
//			// TODO: print output if pattern is not valid
//			e.printStackTrace();
//		} catch (BaseXException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}	
	
//	private static String getQuery(String path) throws InvalidityException {
//        EMFModelLoad loader = new EMFModelLoad();
//        Pattern pattern = loader.load(path);
//        DiagnosticChain diagnostics = null;
//        if(!Diagnostician.INSTANCE.validate(pattern, diagnostics)) {
//        	// TODO: print output if pattern is not valid
////    		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(pattern);		
////    		printDiagnostic(diagnostic, "");
//        }
//		try {
//			pattern.isValid(true);
//		} catch (InvalidityException e) {
//			// TODO: print output if pattern is not valid
//			e.printStackTrace();
//		} catch (OperatorCycleException e) {
//			// TODO: print output if pattern is not valid
//			e.printStackTrace();
//		} catch (MissingPatternContainerException e) {
//			// TODO: print output if pattern is not valid
//			e.printStackTrace();
//		}
//		return pattern.toXQuery();
//		
//	}
	
	
}
