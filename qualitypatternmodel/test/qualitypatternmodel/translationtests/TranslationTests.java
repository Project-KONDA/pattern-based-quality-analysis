package qualitypatternmodel.translationtests;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.CreateDB;
import org.basex.core.cmd.Open;
import org.basex.core.cmd.XQuery;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.testutility.EMFValidationPreparation;
import qualitypatternmodel.testutility.PatternTestPair;

public class TranslationTests {
	private static final String TEST_DATABASE_NAME = "DemoDatabase";
	private static final String TEST_DATA_PATH = "demo.data/demo_database.xml";
	private static Context context;

	@BeforeAll
	public static void setup() {
		EMFValidationPreparation.registerDelegates();
		createContext();
		openDatabase(TEST_DATABASE_NAME, TEST_DATA_PATH);
	}
	
	@Test
	public void simple() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		validatePatternTestPairs(Test00.getTestPairs());
	}
	@Test
	public void axis() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		validatePatternTestPairs(Test01Axis.getTestPairs());
	}
	@Test
	public void returnElements() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		validatePatternTestPairs(Test02Return.getTestPairs());
	}
	@Test
	public void quantors() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		validatePatternTestPairs(Test03Quantor.getTestPairs());
	}
	@Test
	public void quantorCombinations() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		validatePatternTestPairs(Test04QuantorCombinations.getTestPairs());
	}
	@Test
	public void quantorCombinationsConditions() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		validatePatternTestPairs(Test05QuantorCombinationsCond.getTestPairs());
	}
	@Test
	public void notElements() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		validatePatternTestPairs(Test06NotElement.getTestPairs());
	}
	@Test
	public void formulas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		validatePatternTestPairs(Test07Formula.getTestPairs());
	}
	@Test
	public void parameterValues() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		validatePatternTestPairs(Test08ParameterValues.getTestPairs());
	}
	@Test
	public void complexComparisons() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		validatePatternTestPairs(Test09ComplexComparison.getTestPairs());
	}
	@Test
	public void references() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		validatePatternTestPairs(Test10Reference.getTestPairs());
	}
	@Test
	public void matches() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		validatePatternTestPairs(Test11Match.getTestPairs());
	}
	@Test
	public void count() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		validatePatternTestPairs(Test12Count.getTestPairs());
	}

	private void validatePatternTestPairs(List<PatternTestPair> testPairs)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		for(PatternTestPair testPair : testPairs) {
			runQueryResultComparison(testPair);
		}
	}
	
	private static void runQueryResultComparison(PatternTestPair testPair) {		
		try {
			testPair.getPattern().isValid(AbstractionLevel.CONCRETE);
			
			String result = applyQuery(testPair.getPattern().generateQuery());
			String expectedResult = applyQuery(testPair.getManualQuery());
			
			assertEquals(expectedResult, result);
			
		} catch (BaseXException | InvalidityException | OperatorCycleException | MissingPatternContainerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static String applyQuery(String query) throws BaseXException {		
		XQuery xquery = new XQuery(query);
		String result = xquery.execute(context);	
		return result;
	}	
	
	private static void createContext() {
		context = new Context();
	}
	
	private static void openDatabase(String databaseName, String dataPath) {
		try {
			new Open(databaseName).execute(context);
		} catch (BaseXException e) {
			try {
				new CreateDB(databaseName, dataPath).execute(context);
			} catch (BaseXException e1) {
				e1.printStackTrace();
			}
		}				
	}		
	
//	private static void printDiagnostic(Diagnostic diagnostic, String indent) {
//		System.out.print(indent);
//		System.out.println(diagnostic.getMessage());
//		for (Diagnostic child : diagnostic.getChildren()) {
//			printDiagnostic(child, indent + "  ");
//		}
//	}
	
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
