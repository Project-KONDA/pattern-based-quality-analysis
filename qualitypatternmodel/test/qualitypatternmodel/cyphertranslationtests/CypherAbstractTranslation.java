package qualitypatternmodel.cyphertranslationtests;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import playground.Java2Neo4JConnector;
import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JFactory;
import qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JFactoryImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.CypherSpecificConstants;

public abstract class CypherAbstractTranslation implements CypherInterfaceTranslatione {
	public static final AdaptionNeo4JFactory NEO_FACTORY = new AdaptionNeo4JFactoryImpl();
	
	public static final String BEGIN_TESTS = "<<< BEGIN - Tests >>>";
	public static final String END_TESTS = "<<< END - Tests >>>";
	public static final String TEST_SUCCESSFUL = "Test successful";
	public static final String BEGINNING_OF_THE_EXCEPTIONS_TESTS = "-- Beginning of the Exceptions --";
	public static final String END_OF_THE_EXCEPTION_TESTS = "<<< END - Exception Tests >>>";
	public static final String NO_EXCEPTION_HAS_BEEN_TRIGGERED = "No Exception has been triggered";
	public static final String TRANSLATION = "\n___TRANSLATION___";
	public static final String PATTERN_VALID = "\n\n___PATTERN_(VALID)___";
	public static final String PATTERN_NOT_VALID = "\n\n___PATTERN_(NOT VALID)___";
	public static final String END_BUILD_PATTERN_EXCEPTIONS = "<<< END - Build-Pattern-Exceptions >>>";
	public static final String BEGIN_BUILD_PATTERN_EXCEPTIONS = "<<< BEGIN - Build-Pattern-Exceptions >>>";
	public static final String END_SPECIFIC_TESTS = "<<< END - Specific Tests >>>";
	public static final String BEGIN_SPECIFIC_TESTS = "<<< BEGIN - Specific Tests >>>";
	
	
	
	public static void exceptionTestHandler(ArrayList<CompletePattern> completePatterns) {
		for (CompletePattern completePattern : completePatterns) {
			try {
				System.out.println(PATTERN_NOT_VALID);
				System.out.println(completePattern.myToString());
				System.out.print(TRANSLATION);
				System.out.println(completePattern.generateCypher());
				System.out.println(NO_EXCEPTION_HAS_BEEN_TRIGGERED);
			} catch (Exception e) {
				System.out.println("");
				System.out.println(BEGINNING_OF_THE_EXCEPTIONS_TESTS);
				System.out.println(e.toString());
				try {
				  System.out.println(completePattern.myToString());
				} catch (Exception e2) {
					System.out.println(e2.toString());
				}
				System.out.println(TEST_SUCCESSFUL);
			}
		}
	}

	public static void testAllCompletePatterns(ArrayList<CompletePattern> completePatterns, Boolean withDb, Boolean printQuery) throws Exception {
			try (Java2Neo4JConnector connector = new Java2Neo4JConnector()) {
				for (CompletePattern completePattern : completePatterns) {
					replace(completePattern);
					try {
						System.out.println(PATTERN_VALID);
						System.out.println(completePattern.myToString());
						System.out.print(TRANSLATION);
						String query = completePattern.generateCypher();
						checkForNullInMatchAndReturn(query);
						
						//Depending on the test mode activated the db-connector
						if (printQuery) {
							System.out.println(query); 
						}
						
						//Include the null check for the results
						if (withDb) {
							String hashCode = query.hashCode() + "";
							connector.queryTester(query, hashCode, true);							
						}
					} catch (Exception e) {
						System.out.println();
						e.printStackTrace();
						try {
						  System.out.println(completePattern.myToString());
						} catch (Exception e2) {
							e2.printStackTrace();
							throw e2;
						}
						throw e;
					}
				}
			}
		}

	protected static void checkForNullInMatchAndReturn(String query) throws InvalidityException {
		//Test for null in MATCH
		String matchString = query.substring(query.indexOf(CypherSpecificConstants.CLAUSE_MATCH), query.indexOf(CypherAbstractTestSuiteTranslation.NEWLINE));
		if (matchString.toLowerCase().contains(CypherAbstractTestSuiteTranslation.NULL)) {
			throw new InvalidityException(CypherAbstractTestSuiteTranslation.THE_MATCH_CLAUSE_CONTAINS_NULL);
		}
		matchString = null;						
		
		//Test for null in RETURN
		String returnString = query.substring(query.indexOf(CypherSpecificConstants.CLAUSE_RETURN));
		if (returnString.toLowerCase().contains(CypherAbstractTestSuiteTranslation.NULL)) {
			throw new InvalidityException(CypherAbstractTestSuiteTranslation.THE_RETURN_CLAUSE_CONTAINS_NULL);
		}
		returnString  = null;
	}

	public void generalizedInvalidtyExceptionTests()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		ArrayList<CompletePattern> completePatternsExceptions = new ArrayList<CompletePattern>();
		buildInvalidityExceptionPatterns(completePatternsExceptions);
		if (completePatternsExceptions.size() != 0) {
			System.out.println("");
			System.out.println(CypherAbstractTranslation.BEGIN_BUILD_PATTERN_EXCEPTIONS);		
			CypherAbstractTranslation.exceptionTestHandler(completePatternsExceptions);
			System.out.println(CypherAbstractTranslation.END_BUILD_PATTERN_EXCEPTIONS);
			System.out.println("");
		}
	}

	public void generalizedTests()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		buildPatterns(completePatterns);
		if (completePatterns.size() != 0) {
		    System.out.println("");
		    System.out.println(CypherAbstractTranslation.BEGIN_TESTS);
		    try {
		    	CypherAbstractTranslation.testAllCompletePatterns(completePatterns, true, true);
		    } catch (Exception e) {
				System.out.println(e);
			}
			
		    System.out.println(CypherAbstractTranslation.END_TESTS);
		    System.out.println("");
		}
	}
	
	public static CompletePattern replace(CompletePattern pattern) {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		EList<Parameter> params = pattern.getParameterList().getParameters();
		for (int i = params.size()-1; i > -1; i--) {
			Parameter param = pattern.getParameterList().getParameters().get(i);
			if (param instanceof UntypedParameterValue) {
				TextLiteralParam text = parametersFactory.createTextLiteralParam();
				text.setValue("unknown");
				((UntypedParameterValue) param).replace(text);
			}
			if (param instanceof TextLiteralParam) {
				TextLiteralParam text = (TextLiteralParam) param;
				if(text.getValue() == null) {
					text.setValue("something");
				}
			}
			if (param instanceof BooleanParam) {
				BooleanParam bool = (BooleanParam) param;
				if(bool.getValue() == null) {
					bool.setValue(true);
				}
			}
			if (param instanceof NumberParam) {
				NumberParam number = (NumberParam) param;
				if(number.getValue() == null) {
					number.setValue(0.0);
				}
			}
		}
		return pattern;
	}
}