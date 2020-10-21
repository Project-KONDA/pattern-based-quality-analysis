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
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.testutility.EMFModelLoad;
import qualitypatternmodel.testutility.EMFValidationPreparation;
import qualitypatternmodel.testutility.PatternTestPair;

public class TranslationTests {
	private static final String TEST_DATABASE_NAME = "DemoDatabase";
	private static final String TEST_DATA_PATH = "demo.data/demo_database.xml";
	private static Context context;
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {		
		
		EMFValidationPreparation.registerDelegates();
		createContext();
		openDatabase(TEST_DATABASE_NAME, TEST_DATA_PATH);
		
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		testPairs.addAll(Test00.getTestPairs());
		testPairs.addAll(Test01Axis.getTestPairs());
		testPairs.addAll(Test02Return.getTestPairs());
		testPairs.addAll(Test03Quantor.getTestPairs());
		testPairs.addAll(Test04QuantorCombinations.getTestPairs());
		
		testPairs.addAll(Test06NotElement.getTestPairs());
		testPairs.addAll(Test07Formula.getTestPairs());
		
		// TODO:
//		testPairs.addAll(Test05QuantorCombinationsCond.getTestPairs());
//		testPairs.addAll(Test08Comparison.getTestPairs());
//		testPairs.addAll(Test09ComplexComparison.getTestPairs());
//		testPairs.addAll(Test10Reference.getTestPairs());
//		testPairs.addAll(Test11Match.getTestPairs());
//		testPairs.addAll(Test12Count.getTestPairs());
		
		for(PatternTestPair testPair : testPairs) {
			runTestQueryResultComparison(testPair);
		}		
		
	}
	
	private static void runTestQueryResultComparison(PatternTestPair testPair) {
		// Checks test case defined as testPair
		
		/*
		 * given per test case:
		 * - pattern
		 * - manually written query
		 * - database (small cultural heritage test database)
		 * 
		 * approach: 
		 * - run pattern query
		 * - run manually written query
		 * - compare results
		 * 
		 */
		
		try {
			testPair.getPattern().isValid(AbstractionLevel.CONCRETE);
			
			String result = applyQuery(testPair.getPattern().generateQuery());
			String expectedResult = applyQuery(testPair.getManualQuery());
			
			System.out.println(testPair.getName() + compareResults(result, expectedResult));	

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
//		System.out.println("query executed");
		return result;
	}
	
	private static String compareResults(String result, String expectedResult) {
		// Compares the results of the application of the pattern query to that of the manually written query
		// TODO: use XQuery instead for checking equality?
//		System.out.println(expectedResult);
				
		String empty = (result.equals("") ? "\tresult empty" : "");
		
		if(result.equals(expectedResult)) {			 
			return "\t: succeeded"+empty;
		} else {
			return "\t: FAILED" + empty;
		}
	}
	
	private static void createContext() {
		context = new Context();
	}
	private static void openDatabase(String databaseName, String dataPath) {
//		try {
//			new Open(databaseName).execute(context);
//			System.out.println("Opened database \"" + databaseName + "\"\n");
//		} catch (BaseXException e) {
			try {
				new CreateDB(databaseName, dataPath).execute(context);
				System.out.println("Created database \"" + databaseName + "\" with data " + dataPath + "\n");
			} catch (BaseXException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
//		}				
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
