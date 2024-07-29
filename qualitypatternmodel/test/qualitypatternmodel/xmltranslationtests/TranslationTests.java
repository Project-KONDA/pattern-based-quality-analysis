package qualitypatternmodel.xmltranslationtests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.CreateDB;
import org.basex.core.cmd.Open;
import org.basex.core.cmd.XQuery;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.AbstractionLevel;
//import qualitypatternmodel.xmltestutility.EMFValidationPreparation;
import qualitypatternmodel.xmltestutility.PatternTestPair;

public class TranslationTests {
	private static final String TEST_DATABASE_NAME = "DemoDatabase";
	private static final String TEST_DATA_PATH = "demo.data/demo_database.xml";
	private static Context context;

	@BeforeAll
	public static void setup() {
//		EMFValidationPreparation.registerDelegates();
		createContext();
		openDatabase(TEST_DATABASE_NAME, TEST_DATA_PATH);
	}

	@Test
	public void simple() throws InvalidityException, OperatorCycleException, MissingPatternContainerException, BaseXException {
		validatePatternTestPairs(Test00.getTestPairs());
	}
	@Test
	public void axis() throws InvalidityException, OperatorCycleException, MissingPatternContainerException, BaseXException {
		validatePatternTestPairs(Test01Axis.getTestPairs());
	}
	@Test
	public void returnElements() throws InvalidityException, OperatorCycleException, MissingPatternContainerException, BaseXException {
		validatePatternTestPairs(Test02Return.getTestPairs());
	}
	@Test
	public void quantors() throws InvalidityException, OperatorCycleException, MissingPatternContainerException, BaseXException {
		validatePatternTestPairs(Test03Quantor.getTestPairs());
	}
	@Test
	public void quantorCombinations() throws InvalidityException, OperatorCycleException, MissingPatternContainerException, BaseXException {
		validatePatternTestPairs(Test04QuantorCombinations.getTestPairs());
	}
	@Test
	public void quantorCombinationsConditions() throws InvalidityException, OperatorCycleException, MissingPatternContainerException, BaseXException {
		validatePatternTestPairs(Test05QuantorCombinationsCond.getTestPairs());
	}
	@Test
	public void notElements() throws InvalidityException, OperatorCycleException, MissingPatternContainerException, BaseXException {
		validatePatternTestPairs(Test06NotElement.getTestPairs());
	}
	@Test
	public void formulas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException, BaseXException {
		validatePatternTestPairs(Test07Formula.getTestPairs());
	}
	@Test
	public void parameterValues() throws InvalidityException, OperatorCycleException, MissingPatternContainerException, BaseXException {
		validatePatternTestPairs(Test08ParameterValues.getTestPairs());
	}
	@Test
	public void complexComparisons() throws InvalidityException, OperatorCycleException, MissingPatternContainerException, BaseXException {
		validatePatternTestPairs(Test09ComplexComparison.getTestPairs());
	}
	@Test
	public void references() throws InvalidityException, OperatorCycleException, MissingPatternContainerException, BaseXException {
		validatePatternTestPairs(Test10Reference.getTestPairs());
	}
	@Test
	public void matches() throws InvalidityException, OperatorCycleException, MissingPatternContainerException, BaseXException {
		validatePatternTestPairs(Test11Match.getTestPairs());
	}
	@Test
	public void count() throws InvalidityException, OperatorCycleException, MissingPatternContainerException, BaseXException {
		validatePatternTestPairs(Test12Count.getTestPairs());
	}

	private void validatePatternTestPairs(List<PatternTestPair> testPairs)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException, BaseXException {
		for(PatternTestPair testPair : testPairs) {
			runQueryResultComparison(testPair);
		}
	}

	private static void runQueryResultComparison(PatternTestPair testPair) throws InvalidityException, OperatorCycleException, MissingPatternContainerException, BaseXException {
		testPair.getPattern().isValid(AbstractionLevel.CONCRETE);

		String query = testPair.getPattern().generateXQuery();
		assertNotNull("\n" + testPair.getName() + ":\ngenerated query is null", query);
		String result = applyQuery(query);
		assertNotNull("\n" + testPair.getName() + ":\nresult is null", result);
		if (testPair.getManualQuery() != null && ! testPair.getManualQuery().equals("")) {
			String expectedResult = applyQuery(testPair.getManualQuery());
			assertNotNull("\n" + testPair.getName() + ":\nexpected result is null", expectedResult);
			assertEquals("\n" + testPair.getName() + ":\ndifferent results for queries:\n" + testPair.getManualQuery() + query + "\n", expectedResult, result);
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
}
