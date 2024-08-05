package qualitypatternmodel.xmltranslationtests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.CreateDB;
import org.basex.core.cmd.Open;
import org.basex.core.cmd.XQuery;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.xmltestutility.PatternTestPair;

public class TranslationTests2 {
	private static final String TEST_DATABASE_NAME = "DemoDatabase";
	private static final String TEST_DATA_PATH = "demo.data/demo_database.xml";
	private static Context context;

	@BeforeAll
	public static void setup() {
//		EMFValidationPreparation.registerDelegates();
		createContext();
		openDatabase(TEST_DATABASE_NAME, TEST_DATA_PATH);
	}

    public static Collection<PatternTestPair> data() {
    	List<PatternTestPair> pairs = new ArrayList<PatternTestPair>();
    	try {
    		pairs.addAll(Test00.getTestPairs());
    		pairs.addAll(Test01Axis.getTestPairs());
    		pairs.addAll(Test01AxisAlternative.getTestPairs());
    		pairs.addAll(Test01Reference.getTestPairs());
    		pairs.addAll(Test01XmlPropertyNavigation.getTestPairs());
    		pairs.addAll(Test02Return.getTestPairs());
    		pairs.addAll(Test03Quantor.getTestPairs());
    		pairs.addAll(Test04QuantorCombinations.getTestPairs());
    		pairs.addAll(Test05QuantorCombinationsCond.getTestPairs());
    		pairs.addAll(Test06NotElement.getTestPairs());
    		pairs.addAll(Test07Formula.getTestPairs());
    		pairs.addAll(Test08ParameterValues.getTestPairs());
    		pairs.addAll(Test09ComplexComparison.getTestPairs());
    		pairs.addAll(Test10Reference.getTestPairs());
    		pairs.addAll(Test11Contains.getTestPairs());
    		pairs.addAll(Test11Match.getTestPairs());
    		pairs.addAll(Test12Count.getTestPairs());
    		pairs.addAll(Test13Cycle.getTestPairs());
    		pairs.addAll(Test14StringLength.getTestPairs());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pairs;
    }

	@ParameterizedTest
	@MethodSource("data")
    public void test(PatternTestPair pair) throws BaseXException, InvalidityException, OperatorCycleException, MissingPatternContainerException {
    	runQueryResultComparison(pair);
    }

	private static void runQueryResultComparison(PatternTestPair testPair) throws InvalidityException, OperatorCycleException, MissingPatternContainerException, BaseXException {
		testPair.getPattern().isValid(AbstractionLevel.CONCRETE);

		String query = testPair.getPattern().generateXQuery();
		assertNotNull("\n" + testPair.getName() + ":\ngenerated query is null", query);
		System.out.println(query);
		String result = applyQuery(query);
		assertNotNull("\n" + testPair.getName() + ":\nresult is null", result);
		if (testPair.getManualQuery() == null || testPair.getManualQuery().equals("")) { 
			throw new BaseXException("Empty Query");
		} else {
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
