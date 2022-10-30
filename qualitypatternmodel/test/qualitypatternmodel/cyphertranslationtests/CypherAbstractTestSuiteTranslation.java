package qualitypatternmodel.cyphertranslationtests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExecutionCondition;

import playground.Java2Neo4JConnector;
import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest00;
import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest01NeoEdge;
import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest01NeoPropertyEdge;
import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest02Return;
import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest03NotCondition;
import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest04Formula;
import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest05ParameterValues;
import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest06Comparison;
import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest07QuantifiedCondition;
import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest08Cycle;
import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest09Contains;
import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest10Match;
import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest11CountCondition;
import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest12CheckNull;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.patternstructure.CompletePattern;

//The Excption handler can do more then the for the suite case
public abstract class CypherAbstractTestSuiteTranslation implements ExecutionCondition {

	private static final String NOT_ALL_PATTERN_HAVE_BEEN_CHECK = "Not all Pattern have been check - rework test";
	private static final String EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION = "NOT ALL INVALIDTIY EXCPECTED EXCEPTIONS HAVE BEEN THROWN";
	private static final String EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION = "NOT ALL UNSUPPORTED MESSAGE EXCPECTED EXCEPTIONS HAVE BEEN THROWN";
	protected static final String THE_MATCH_CLAUSE_CONTAINS_NULL = "The MATCH-CLAUSE contains null";
	protected static final String NEWLINE = "\n";
	protected static final String NULL = "null";
	protected static final String THE_RETURN_CLAUSE_CONTAINS_NULL = "The RETURN-CLAUSE contains null";
	protected static final String TEST_DISABLED_ON_QA_ENVIRONMENT = "Test disabled on QA environment";
	protected static final String TEST_ENABLED_ON_QA_ENVIRONMENT = "Test enabled on QA environment";
	protected ArrayList<CompletePattern> completePatterns;
	
	protected static void exceptionHandler(CompletePattern completePattern) throws InvalidityException {
		completePattern.generateCypher();
	}
	
	public static void testAllCompletePatterns(ArrayList<CompletePattern> completePatterns, boolean isDbOn) throws Exception {
		if (isDbOn) {
			try (Java2Neo4JConnector connector = new Java2Neo4JConnector()) {
				CypherAbstractTranslation.innerTestAllCompletePatterns(completePatterns, connector);
			}
		} else {
			Java2Neo4JConnector connector = null;
			CypherAbstractTranslation.innerTestAllCompletePatterns(completePatterns, connector);
		}
	}

	@BeforeAll
	public void beforeClassFunction() {
		completePatterns = new ArrayList<CompletePattern>();
	}

	@AfterEach
	public void afterEachFunction() {
		completePatterns.clear();
	}

	@AfterAll
	public void afterAllFunction() {
		completePatterns = null;
	}

	//BEGIN - Syntax Validation
	@Test
	public void cypherTest00() {		
		assertDoesNotThrow(() -> {new CypherTest00().buildPatterns(completePatterns); 
			tester(completePatterns);});
	}

	@Test
	public void cypherTest01NeoEdge() {		
		assertDoesNotThrow(() -> {new CypherTest01NeoEdge().buildPatterns(completePatterns); 
			tester(completePatterns);});
	}

	@Test
	public void cypherTest01NeoEdgeExceptions() {		
			assertThrows(InvalidityException.class, () -> {new CypherTest01NeoEdge().buildInvalidityExceptionPatterns(completePatterns);
					for (CompletePattern cp : completePatterns) exceptionHandler(cp);},
					EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
			assertThrows(InvalidityException.class, () -> {CypherTest01NeoEdge.generateToCreateNeoDirectionErrorShallNotWorkException();},
					//Add additional Exceptions
					EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
			assertThrows(UnsupportedOperationException.class, () -> {CypherTest01NeoEdge.generateBuildNeoNeoNeedsAPathParamException();
					//Add additional Exceptions,
					}, 
					EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION);
	//		assertThrows(Exception.class, () -> {//Add additional Exceptions
	//			}, DIFFRENT_OTHER_EXCEPTIONS);
		}

	@Test
	public void cypherTest01NeoPropertyEdge() {		
		assertDoesNotThrow(() -> {new CypherTest01NeoPropertyEdge().buildPatterns(completePatterns); 
			tester(completePatterns);});
	}

	@Test
	public void cypherTest01NeoPropertyEdgeExceptions() {		
			assertThrows(InvalidityException.class, () -> {new CypherTest01NeoPropertyEdge().buildInvalidityExceptionPatterns(completePatterns);
						for (CompletePattern cp : completePatterns) exceptionHandler(cp);},
						EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
	//		assertThrows(OperatorCycleException.class, () -> {CypherTest01NeoEdge.tryToCreateNeoDirectionErrorShallNotWork();},
	//					//Add additional Exceptions
	//					EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
	//		assertThrows(UnsupportedOperationException.class, () -> {CypherTest01NeoEdge.tryBuildNeoNeoNeedsAPathParam();
	//					//Add additional Exceptions,
	//					}, 
	//					EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION);
	//		assertThrows(Exception.class, () -> {//Add additional Exceptions
	//					}, DIFFRENT_OTHER_EXCEPTIONS);
		}

	@Test
	public void cypherTest02Return() {		
		assertDoesNotThrow(() -> {new CypherTest02Return().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	@Test
	public void cypherTest02ReturnExceptions() {		
			assertThrows(InvalidityException.class, () -> {new CypherTest02Return().buildInvalidityExceptionPatterns(completePatterns);
					for (CompletePattern cp : completePatterns) exceptionHandler(cp);
					},
					EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
	//		assertThrows(OperatorCycleException.class, () -> {CypherTest01NeoEdge.tryToCreateNeoDirectionErrorShallNotWork();},
	//				//Add additional Exceptions
	//				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
	//		assertThrows(UnsupportedOperationException.class, () -> {CypherTest01NeoEdge.tryBuildNeoNeoNeedsAPathParam();
	//			//Add additional Exceptions,
	//			}, 
	//			EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION);
	//		assertThrows(Exception.class, () -> {//Add additional Exceptions
	//			}, DIFFRENT_OTHER_EXCEPTIONS);
		}

	@Test
	public void cypherTest03NotCondition() {		
		assertDoesNotThrow(() -> {new CypherTest03NotCondition().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	public void cypherTest03NotConditionExceptions() {		
			assertThrows(InvalidityException.class, () -> {//Add additional Exceptions
					},
					EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
	//		assertThrows(OperatorCycleException.class, () -> {CypherTest01NeoEdge.tryToCreateNeoDirectionErrorShallNotWork();},
	//				//Add additional Exceptions
	//				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
	//		assertThrows(UnsupportedOperationException.class, () -> {CypherTest01NeoEdge.tryBuildNeoNeoNeedsAPathParam();
	//			//Add additional Exceptions,
	//			}, 
	//			EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION);
	//		assertThrows(Exception.class, () -> {//Add additional Exceptions
	//			}, DIFFRENT_OTHER_EXCEPTIONS);
		}

	@Test
	public void cypherTest04Formula() {		
		assertDoesNotThrow(() -> {new CypherTest04Formula().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	public void cypherTest04FormulaExceptions() {		
			assertThrows(InvalidityException.class, () -> {//Add additional Exceptions
					},
					EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
	//		assertThrows(OperatorCycleException.class, () -> {CypherTest01NeoEdge.tryToCreateNeoDirectionErrorShallNotWork();},
	//				//Add additional Exceptions
	//				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
	//		assertThrows(UnsupportedOperationException.class, () -> {CypherTest01NeoEdge.tryBuildNeoNeoNeedsAPathParam();
	//			//Add additional Exceptions,
	//			}, 
	//			EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION);
	//		assertThrows(Exception.class, () -> {//Add additional Exceptions
	//			}, DIFFRENT_OTHER_EXCEPTIONS);
		}

	@Test
	public void cypherTest05ParameterValues() {		
		assertDoesNotThrow(() -> {new CypherTest05ParameterValues().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	public void cypherTest05ParameterValuesExceptions() {		
			assertThrows(InvalidityException.class, () -> {//Add additional Exceptions
					},
					EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
	//		assertThrows(OperatorCycleException.class, () -> {CypherTest01NeoEdge.tryToCreateNeoDirectionErrorShallNotWork();},
	//				//Add additional Exceptions
	//				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
	//		assertThrows(UnsupportedOperationException.class, () -> {CypherTest01NeoEdge.tryBuildNeoNeoNeedsAPathParam();
	//			//Add additional Exceptions,
	//			}, 
	//			EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION);
	//		assertThrows(Exception.class, () -> {//Add additional Exceptions
	//			}, DIFFRENT_OTHER_EXCEPTIONS);
		}

	@Test
	public void cypherTest06Comparison() {	
		assertDoesNotThrow(() -> {new CypherTest06Comparison().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	public void cypherTest06ComparisonExceptions() {		
			assertThrows(InvalidityException.class, () -> {//Add additional Exceptions
					},
					EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
	//		assertThrows(OperatorCycleException.class, () -> {CypherTest01NeoEdge.tryToCreateNeoDirectionErrorShallNotWork();},
	//				//Add additional Exceptions
	//				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
	//		assertThrows(UnsupportedOperationException.class, () -> {CypherTest01NeoEdge.tryBuildNeoNeoNeedsAPathParam();
	//			//Add additional Exceptions,
	//			}, 
	//			EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION);
	//		assertThrows(Exception.class, () -> {//Add additional Exceptions
	//			}, DIFFRENT_OTHER_EXCEPTIONS);
		}

	@Test
	public void cypherTest07QuantifiedCondition() {	
		assertDoesNotThrow(() -> {new CypherTest07QuantifiedCondition().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	@Test
	public void cypherTest07QuantifiedConditionExceptions() {		
			assertThrows(InvalidityException.class, () -> {new CypherTest07QuantifiedCondition().buildInvalidityExceptionPatterns(completePatterns);
						for (CompletePattern cp : completePatterns) exceptionHandler(cp);
						},
						EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
	//		assertThrows(OperatorCycleException.class, () -> {CypherTest01NeoEdge.tryToCreateNeoDirectionErrorShallNotWork();},
	//				//Add additional Exceptions
	//				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
	//		assertThrows(UnsupportedOperationException.class, () -> {CypherTest01NeoEdge.tryBuildNeoNeoNeedsAPathParam();
	//			//Add additional Exceptions,
	//			}, 
	//			EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION);
	//		assertThrows(Exception.class, () -> {//Add additional Exceptions
	//			}, DIFFRENT_OTHER_EXCEPTIONS);
		}

	@Test
	public void cypherTest08Cycle() {
		assertDoesNotThrow(() -> {new CypherTest08Cycle().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	public void cypherTest08CycleExceptions() {		
			assertThrows(InvalidityException.class, () -> {//Add additonal Exceptions
					},
					EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
	//		assertThrows(OperatorCycleException.class, () -> {CypherTest01NeoEdge.tryToCreateNeoDirectionErrorShallNotWork();},
	//				//Add additional Exceptions
	//				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
	//		assertThrows(UnsupportedOperationException.class, () -> {CypherTest01NeoEdge.tryBuildNeoNeoNeedsAPathParam();
	//			//Add additional Exceptions,
	//			}, 
	//			EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION);
	//		assertThrows(Exception.class, () -> {//Add additional Exceptions
	//			}, DIFFRENT_OTHER_EXCEPTIONS);
		}

	@Test
	public void cypherTest09Contains() {	
		assertDoesNotThrow(() -> {new CypherTest09Contains().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	public void cypherTest09ContainsExceptions() {		
			assertThrows(InvalidityException.class, () -> {//Add additional Exceptions
					},
					EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
	//		assertThrows(OperatorCycleException.class, () -> {CypherTest01NeoEdge.tryToCreateNeoDirectionErrorShallNotWork();},
	//				//Add additional Exceptions
	//				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
	//		assertThrows(UnsupportedOperationException.class, () -> {CypherTest01NeoEdge.tryBuildNeoNeoNeedsAPathParam();
	//			//Add additional Exceptions,
	//			}, 
	//				EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION);
	//		assertThrows(Exception.class, () -> {//Add additional Exceptions
	//			}, DIFFRENT_OTHER_EXCEPTIONS);
		}

	@Test
	public void cypherTest10Match() {	
		assertDoesNotThrow(() -> {new CypherTest10Match().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	@Test
	public void cypherTest10MatchExceptions() {		
			assertThrows(InvalidityException.class, () -> {new CypherTest10Match().buildInvalidityExceptionPatterns(completePatterns);
					for (CompletePattern cp : completePatterns) exceptionHandler(cp);},
					EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
	//		assertThrows(InvalidityException.class, () -> {CypherTest01NeoEdge.tryToCreateNeoDirectionErrorShallNotWork();},
	//				//Add additional Exceptions
	//				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
	//		assertThrows(UnsupportedOperationException.class, () -> {CypherTest01NeoEdge.tryBuildNeoNeoNeedsAPathParam();
	//				//Add additional Exceptions,
	//				}, 
	//				EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION);
	//		assertThrows(Exception.class, () -> {//Add additional Exceptions
	//				}, DIFFRENT_OTHER_EXCEPTIONS);
		}

	@Test
	public void cypherTest11CountCondition() {	
		assertDoesNotThrow(() -> {new CypherTest11CountCondition().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	public void cypherTest11CountConditionExceptions() {		
			assertThrows(InvalidityException.class, () -> {new CypherTest11CountCondition().buildInvalidityExceptionPatterns(completePatterns);
					for (CompletePattern cp : completePatterns) exceptionHandler(cp);},
					EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
	//		assertThrows(OperatorCycleException.class, () -> {CypherTest01NeoEdge.tryToCreateNeoDirectionErrorShallNotWork();},
	//				//Add additional Exceptions
	//				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
	//		assertThrows(UnsupportedOperationException.class, () -> {CypherTest01NeoEdge.tryBuildNeoNeoNeedsAPathParam();
	//				//Add additional Exceptions,
	//				}, 
	//				EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION);
	//		assertThrows(Exception.class, () -> {//Add additional Exceptions
	//				}, DIFFRENT_OTHER_EXCEPTIONS);
		}

	@Test
	public void cypherTest12CheckNull() {	
		assertDoesNotThrow(() -> {new CypherTest12CheckNull().buildPatterns(completePatterns); 
			tester(completePatterns);});
	}
	
	public void cypherTest12CheckNullExceptions() {		
			assertThrows(InvalidityException.class, () -> {//Add additional Exceptions
					},
					EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
	//		assertThrows(OperatorCycleException.class, () -> {CypherTest01NeoEdge.tryToCreateNeoDirectionErrorShallNotWork();},
	//				//Add additional Exceptions
	//				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
	//		assertThrows(UnsupportedOperationException.class, () -> {CypherTest01NeoEdge.tryBuildNeoNeoNeedsAPathParam();
	//				//Add additional Exceptions,
	//				}, 
	//				EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION);
	//		assertThrows(Exception.class, () -> {//Add additional Exceptions
	//				}, DIFFRENT_OTHER_EXCEPTIONS);
		}
//	//END - Syntax Validation

	
	
	//BEGIN - String Comparison
	//Sometime the node number is diffrent ... do not now why... but it is...
	//Dieser Umstand führt in den Fehlschlagenden Tests zu Problemen...
	@Test
	public void cypherTest00QueryComp() {	
		try {
			new CypherTest00().buildPatterns(completePatterns);
			int i = 0;
			
			//getBasePatternCypher
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3)\n"
					+ "RETURN varNode3");
			i++;
			
			//getBasePatternComplexFinal
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3)-[varEdge2]-(varNode4)\n"
					+ "RETURN varNode3");
			i++;
			
			//getBasePatternCondDateConcrete
			assertEquals(completePatterns.get(i).generateCypher(), 
					"\nMATCH (varNode8:Place), (varNode8)-[varEdge7]-(varNode9:Regesta), (varNode9)-[varEdge8]-(varNode10:Place), (varNode9)-[varEdge9]-(varNode11:IndexPerson), (varNode9)-[varEdge10]-(varNode12), (varNode8)-[varEdge11]-(varNode13), (varNode8)-[varEdge12]-(varNode14)\n"
					+ "RETURN DISTINCT (varNode8)");
			i++;

			//getBasePatternCondDateConcrete
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)\n"
					+ "WHERE (varNode3.isoStartDate = date('1440-02-02'))\n"
					+ "RETURN varNode3");
			i++;
			
			//getBasePatternCondConcrete
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)\n"
					+ "WHERE (varNode3.endDate = \"1439-12-20\")\n"
					+ "RETURN varNode3");
			i++;
			
			//getBasePatternMatchConcrete
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)\n"
					+ "WHERE (varNode3.endDate =~ \"1439.*\")\n"
					+ "RETURN varNode3");
			i++;
			
			//getBasePatternMatchNotConcrete
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)\n"
					+ "WHERE (NOT (varNode3.endDate =~ \"1439.*\"))\n"
					+ "RETURN varNode3");
			i++;
			
			assertTrue(NOT_ALL_PATTERN_HAVE_BEEN_CHECK, i == completePatterns.size());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest01NeoEdgeQueryComp() {		
		try {
			new CypherTest01NeoEdge().buildPatterns(completePatterns);
			int i = 0;
			//getUnspecifiedEdge
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3)--(varNode4)\n"
					+ "RETURN varNode3");
			i++;
			
			//getSimpleEdge
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3)-[varEdge2]-(varNode4)\n"
					+ "RETURN varNode3, varNode4, \n"
					+ "      varEdge2");
			i++;
			
			//getSimpleEdgeWithLabels
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)-[varEdge2:PLACE_OF_ISSUE]-(varNode4:Place)\n"
					+ "RETURN varNode3, varNode4, \n"
					+ "      varEdge2");
			i++;
			
			//getSimpleEdgeWithLabelsRight
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)-[varEdge2:PLACE_OF_ISSUE]->(varNode4:Place)\n"
					+ "RETURN varNode3, varNode4, \n"
					+ "      varEdge2");
			i++;
			
			//getSimpleEdgeWithLabelsLeft
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Place)<-[varEdge2:PLACE_OF_ISSUE]-(varNode4:Regesta)\n"
					+ "RETURN varNode3, varNode4, \n"
					+ "      varEdge2");
			i++;
			
			//getSimpleEdgeWithTargetNode
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)-[varEdge2:PLACE_OF_ISSUE]->(intEgNode2:Place)--(varNode4:Regesta)\n"
					+ "RETURN varNode3, varNode4, \n"
					+ "      varEdge2, \n"
					+ "      intEgNode2");
			i++;
			
			//getComplexEdge
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)-[varEdge2:PLACE_OF_ISSUE]->(intEgNode2:Place)<-[varEdge2_1:PLACE_OF_ISSUE]-(varNode4:Regesta)\n"
					+ "RETURN varNode3, varNode4, \n"
					+ "      varEdge2, varEdge2_1, \n"
					+ "      intEgNode2");
			i++;
			
			//getComplexEdgeWithDoppleEnding
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)-[varEdge2:PLACE_OF_ISSUE]->(intEgNode2:Place)<-[varEdge2_1:PLACE_OF_ISSUE]-(varNode4:Regesta)\n"
					+ "RETURN varNode3, varNode4, \n"
					+ "      varEdge2, varEdge2_1, \n"
					+ "      intEgNode2");
			i++;
			
			//getComplexEdgeWithTargeAtEndAndLabels
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)-[varEdge2:PLACE_OF_ISSUE]-(intEgNode2:Place)-[varEdge2_1:PLACE_OF_ISSUE]-(intEgNode2_1:Regesta)-[varEdge2_2:APPEARS_IN]-(varNode4:IndexEntry:IndexPerson)\n"
					+ "RETURN varNode3, varNode4, \n"
					+ "      varEdge2, varEdge2_1, varEdge2_2, \n"
					+ "      intEgNode2, intEgNode2_1");
			i++;
			
			//getComplexEdgeWithLabelsDiffrentDirectionsAndLabels
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)-[varEdge2:PLACE_OF_ISSUE]->(intEgNode2:Place)<-[varEdge2_1:PLACE_OF_ISSUE]-(intEgNode2_1:Regesta)<-[varEdge2_2:APPEARS_IN]-(varNode4:IndexEntry:IndexPerson)\n"
					+ "RETURN varNode3, varNode4, \n"
					+ "      varEdge2, varEdge2_1, varEdge2_2, \n"
					+ "      intEgNode2, intEgNode2_1");
			i++;
			
			//getMultipleGraphPatterns
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode5)-[varEdge3]-(varNode6)\n"
					+ "MATCH (varNode7)-[varEdge4]-(varNode8)\n"
					+ "RETURN varNode5");
			i++;
			
			//getSimpleEdgeWithTargetNodeAndDopple
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)-[varEdge2:PLACE_OF_ISSUE]->(intEgNode2:Place)--(varNode4:Regesta)\n"
					+ "RETURN varNode3, varNode4, \n"
					+ "      varEdge2, \n"
					+ "      intEgNode2");
			i++;
			
			assertTrue(NOT_ALL_PATTERN_HAVE_BEEN_CHECK, i == completePatterns.size());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest01NeoPropertyEdgeQueryComp() {		
		try {
			new CypherTest01NeoPropertyEdge().buildPatterns(completePatterns);
			int i = 0;
			
			//getBlankSimpleEdge
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3)\n"
					+ "RETURN varNode3");
			i++;
			
			//getNeoPropertyEdge
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3)-[varEdge2]-(varPropertyNode4)\n"
					+ "RETURN varNode3");
			i++;
			
			//getSimpleEdgeReturnOnlyProperty
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3)\n"
					+ "RETURN varNode3.identifier");
			i++;
			
			//getSimpleEdgeReturnOnlyMultiProperty
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode5)\n"
					+ "RETURN varNode5.identifier, varNode5.date, varNode5.placeOfIssue");
			i++;
			
			//getSimpleEdgeWithLabels
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)-[varEdge2:PLACE_OF_ISSUE]-(varPropertyNode4:Place)\n"
					+ "RETURN varNode3");
			i++;
			
			//getSimpleEdgeWithLabelsRight
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)-[varEdge2:PLACE_OF_ISSUE]->(varPropertyNode4:Place)\n"
					+ "RETURN varNode3");
			i++;
			
			//getSimpleEdgeWithLabelsLeft
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)<-[varEdge2:APPEARS_IN]-(varPropertyNode4:IndexEntry:IndexPlace)\n"
					+ "RETURN varNode3");
			i++;
			
			//getSimpleEdgeWithTargetNodePropertyNProperty
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)-[varEdge2:PLACE_OF_ISSUE]->(varPropertyNode4:Place)\n"
					+ "RETURN varNode3, \n"
					+ "      varPropertyNode4, \n"
					+ "      varPropertyNode4.identifier");
			i++;
			
			//getSimpleEdgeWithTargetNodePropertyNNeoPropertyEdgeNProperty
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)-[varEdge2:PLACE_OF_ISSUE]->(varPropertyNode4:Place)\n"
					+ "RETURN varNode3, \n"
					+ "      varPropertyNode4, \n"
					+ "      varPropertyNode4.identifier, \n"
					+ "      varEdge2");
			i++;
			
			//getComplexEdge
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3)-[varEdge2]-(intEgNode2)-[varEdge2_1]-(varPropertyNode4)\n"
					+ "RETURN varNode3, \n"
					+ "      intEgNode2");
			i++;
			
			//getComplexEdgeWithLabels
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)-[varEdge2:APPEARS_IN]-(intEgNode2:IndexEntry:IndexPlace)-[varEdge2_1:IS_SUB_OF]-(varPropertyNode4:IndexEntry:IndexPerson)\n"
					+ "RETURN varNode3, \n"
					+ "      intEgNode2");
			i++;
			
			//getComplexEdgeWithLabelsDiffrentDirections
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)<-[varEdge2:APPEARS_IN]-(intEgNode2:IndexEntry:IndexPlace)<-[varEdge2_1:IS_SUB_OF]-(varPropertyNode4:IndexEntry:IndexPerson)\n"
					+ "RETURN varNode3, \n"
					+ "      intEgNode2");
			i++;
			
			//getComplexEdgeWithLabelsDiffrentDirectionsAndAllReturns
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)<-[varEdge2:APPEARS_IN]-(intEgNode2:IndexEntry:IndexPlace)<-[varEdge2_1:IS_SUB_OF]-(varPropertyNode4:IndexEntry:IndexPerson)\n"
					+ "RETURN varNode3, \n"
					+ "      varPropertyNode4, \n"
					+ "      varPropertyNode4.path, \n"
					+ "      varEdge2, varEdge2_1, \n"
					+ "      intEgNode2");
			i++;
			
			assertTrue(NOT_ALL_PATTERN_HAVE_BEEN_CHECK, i == completePatterns.size());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest02ReturnQueryComp() {		
		try {
			new CypherTest02Return().buildPatterns(completePatterns);
			int i = 0;
			
			//getAllPossibleReturnTypes
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode4:Regesta)-[varEdge3:APPEARS_IN]-(intEgNode3:IndexEntry:IndexPlace)-[varEdge3_1:APPEARS_IN]-(varNode5:Regesta)-[varEdge4:APPEARS_IN]-(intEgNode4:IndexEntry:IndexPerson)-[varEdge4_1:APPEARS_IN]-(varPropertyNode6:Regesta)\n"
					+ "RETURN varNode4, varNode5, \n"
					+ "      varPropertyNode6, \n"
					+ "      varPropertyNode6.summary, \n"
					+ "      varEdge3, varEdge3_1, varEdge4, varEdge4_1, \n"
					+ "      intEgNode3, intEgNode4");
			i++;
			
			assertTrue(NOT_ALL_PATTERN_HAVE_BEEN_CHECK, i == completePatterns.size());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest03NotConditionQueryComp() {		
		try {
			new CypherTest03NotCondition().buildPatterns(completePatterns);
			int i = 0;
			
			//getTestPattern1
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode4:Literature)\n"
					+ "WHERE NOT (EXISTS {\n"
					+ "            MATCH (varNode4)<-[varEdge2]-(varNode5:Regesta)\n"
					+ "            WHERE NOT (EXISTS {\n"
					+ "                        MATCH (varNode5)-[varEdge4]->(varNode6:Reference)})})\n"
					+ "RETURN varNode4");
			i++;
			
			//getTestPattern1WithConditions
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode8:Literature)\n"
					+ "WHERE (varNode8.title = \"BATTENBERG\"\n"
					+ "            AND varNode8.url = \"http://opac.regesta-imperii.de/lang_de/kurztitelsuche_r.php?kurztitel=battenberg,_solmser_urkunden_1\")\n"
					+ "            AND NOT (EXISTS {\n"
					+ "                        MATCH (varNode8)<-[varEdge6]-(varNode9:Regesta)\n"
					+ "                        WHERE NOT (EXISTS {\n"
					+ "                                    MATCH (varNode9)-[varEdge11]->(varNode10:Reference)\n"
					+ "                                    WHERE (varNode10.title = \"Kulpis Documenta S. 181f.\")})\n"
					+ "                        AND (varNode9.isoStartDate = date('1439-12-20'))})\n"
					+ "RETURN varNode8");
			i++;
			
//			//testPatternQuery1
//			assertEquals(completePatterns.get(i).generateCypher(), "\n");
//			i++;
			
			//getTestPattern2
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode5:Regesta)\n"
					+ "WHERE NOT (EXISTS {\n"
					+ "            MATCH (varNode5), (varNode5)-[varEdge4:APPEARS_IN]-(varNode6:IndexPerson), (varNode5)-[varEdge5:ACTION]-(varNode7:Action), (varNode5)-[varEdge6:RECIPIENT_IN]-(varNode8:IndexPlace)})\n"
					+ "RETURN varNode5");
			i++;
			
			//getTestPattern5
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode4:Regesta)\n"
					+ "WHERE EXISTS {\n"
					+ "            MATCH (varNode4), (varNode4)<-[varEdge4:APPEARS_IN]-(varNode5:IndexPerson)-[varEdge5:IS_SUB_OF]-(varNode6:IndexPlace), (varNode4)-[varEdge6:RECIPIENT_IN]-(varNode6)}\n"
					+ "RETURN varNode4");
			i++;
			
			//getNotExistsExists
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode5:Regesta)\n"
					+ "WHERE NOT (EXISTS {\n"
					+ "            MATCH (varNode5)-[varEdge4:APPEARS_IN]-(varNode6:IndexPerson)\n"
					+ "            WHERE EXISTS {\n"
					+ "                        MATCH (varNode6)-[varEdge6]-(varNode7:Regesta)}})\n"
					+ "RETURN varNode5");
			i++;
			
			//getNotNotPattern
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode4)\n"
					+ "WHERE EXISTS {\n"
					+ "            MATCH (varNode4)-[varEdge4]-(varNode5)}\n"
					+ "RETURN varNode4");
			i++;
			
			//getNotNotPattern
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode4)\n"
					+ "WHERE NOT (EXISTS {\n"
					+ "            MATCH (varNode4)-[varEdge4]-(varNode5)})\n"
					+ "RETURN varNode4");
			i++;
			
			//getNotNotNotNotPattern
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode4)\n"
					+ "WHERE EXISTS {\n"
					+ "            MATCH (varNode4)-[varEdge4]-(varNode5)}\n"
					+ "RETURN varNode4");
			i++;
			
			//getNotNotNotNotNotPattern
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode4)\n"
					+ "WHERE NOT (EXISTS {\n"
					+ "            MATCH (varNode4)-[varEdge4]-(varNode5)})\n"
					+ "RETURN varNode4");
			i++;
			
			assertTrue(NOT_ALL_PATTERN_HAVE_BEEN_CHECK, i == completePatterns.size());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest04FormulaQueryComp() {		
		try {
			new CypherTest04Formula().buildPatterns(completePatterns);
			int i = 0;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode5:Regesta)\n"
					+ "WHERE EXISTS {\n"
					+ "            MATCH (varNode5)-[varEdge5:PLACE_OF_ISSUE]-(varNode6:Place)} \n"
					+ "      AND EXISTS {\n"
					+ "            MATCH (varNode5)-[varEdge6:APPEARS_IN]-(varNode7:IndexEntry:IndexPlace)}\n"
					+ "RETURN varNode5");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode5:Regesta)\n"
					+ "WHERE EXISTS {\n"
					+ "            MATCH (varNode5)-[varEdge5:PLACE_OF_ISSUE]-(varNode6:Place)} \n"
					+ "      OR EXISTS {\n"
					+ "            MATCH (varNode5)-[varEdge6:APPEARS_IN]-(varNode7:IndexEntry:IndexPlace)}\n"
					+ "RETURN varNode5");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode5:Regesta)\n"
					+ "WHERE NOT EXISTS {\n"
					+ "            MATCH (varNode5)-[varEdge5:PLACE_OF_ISSUE]-(varNode6:Place)} \n"
					+ "      AND EXISTS {\n"
					+ "            MATCH (varNode5)-[varEdge6:APPEARS_IN]-(varNode7:IndexEntry:IndexPlace)}\n"
					+ "RETURN varNode5");
			i++;
			
//			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode5:Regesta)\n"
					+ "WHERE (EXISTS {\n"
					+ "            MATCH (varNode5)-[varEdge5:PLACE_OF_ISSUE]-(varNode6:Place)} \n"
					+ "      AND NOT EXISTS {\n"
					+ "            MATCH (varNode5)-[varEdge6:APPEARS_IN]-(varNode7:IndexEntry:IndexPlace)})\n"
					+ "      OR (NOT EXISTS {\n"
					+ "            MATCH (varNode5)-[varEdge5:PLACE_OF_ISSUE]-(varNode6:Place)} \n"
					+ "      AND EXISTS {\n"
					+ "            MATCH (varNode5)-[varEdge6:APPEARS_IN]-(varNode7:IndexEntry:IndexPlace)})\n"
					+ "RETURN varNode5");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode5:Regesta)\n"
					+ "WHERE (EXISTS {\n"
					+ "            MATCH (varNode5)-[varEdge5:PLACE_OF_ISSUE]-(varNode6:Place)} \n"
					+ "      AND EXISTS {\n"
					+ "            MATCH (varNode5)-[varEdge6:APPEARS_IN]-(varNode7:IndexEntry:IndexPlace)})\n"
					+ "      OR NOT (EXISTS {\n"
					+ "            MATCH (varNode5)-[varEdge5:PLACE_OF_ISSUE]-(varNode6:Place)}\n"
					+ "      AND EXISTS {\n"
					+ "            MATCH (varNode5)-[varEdge6:APPEARS_IN]-(varNode7:IndexEntry:IndexPlace)})\n"
					+ "RETURN varNode5");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode5:Regesta)\n"
					+ "WHERE (EXISTS {\n"
					+ "            MATCH (varNode5)-[varEdge5:PLACE_OF_ISSUE]-(varNode6:Place)} \n"
					+ "      AND EXISTS {\n"
					+ "            MATCH (varNode5)-[varEdge6:APPEARS_IN]-(varNode7:IndexEntry:IndexPlace)})\n"
					+ "RETURN varNode5");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode5:Regesta)\n"
					+ "WHERE (EXISTS {\n"
					+ "            MATCH (varNode5)-[varEdge5:PLACE_OF_ISSUE]-(varNode6:Place)} \n"
					+ "      OR EXISTS {\n"
					+ "            MATCH (varNode5)-[varEdge6:APPEARS_IN]-(varNode7:IndexEntry:IndexPlace)})\n"
					+ "RETURN varNode5");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode5:Regesta)\n"
					+ "WHERE (NOT EXISTS {\n"
					+ "            MATCH (varNode5)-[varEdge5:PLACE_OF_ISSUE]-(varNode6:Place)} \n"
					+ "      AND EXISTS {\n"
					+ "            MATCH (varNode5)-[varEdge6:APPEARS_IN]-(varNode7:IndexEntry:IndexPlace)})\n"
					+ "RETURN varNode5");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode5:Regesta)\n"
					+ "WHERE ((EXISTS {\n"
					+ "            MATCH (varNode5)-[varEdge5:PLACE_OF_ISSUE]-(varNode6:Place)} \n"
					+ "      AND NOT EXISTS {\n"
					+ "            MATCH (varNode5)-[varEdge6:APPEARS_IN]-(varNode7:IndexEntry:IndexPlace)})\n"
					+ "      OR (NOT EXISTS {\n"
					+ "            MATCH (varNode5)-[varEdge5:PLACE_OF_ISSUE]-(varNode6:Place)} \n"
					+ "      AND EXISTS {\n"
					+ "            MATCH (varNode5)-[varEdge6:APPEARS_IN]-(varNode7:IndexEntry:IndexPlace)}))\n"
					+ "RETURN varNode5");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode5:Regesta)\n"
					+ "WHERE ((EXISTS {\n"
					+ "            MATCH (varNode5)-[varEdge5:PLACE_OF_ISSUE]-(varNode6:Place)} \n"
					+ "      AND EXISTS {\n"
					+ "            MATCH (varNode5)-[varEdge6:APPEARS_IN]-(varNode7:IndexEntry:IndexPlace)})\n"
					+ "      OR NOT (EXISTS {\n"
					+ "            MATCH (varNode5)-[varEdge5:PLACE_OF_ISSUE]-(varNode6:Place)}\n"
					+ "      AND EXISTS {\n"
					+ "            MATCH (varNode5)-[varEdge6:APPEARS_IN]-(varNode7:IndexEntry:IndexPlace)}))\n"
					+ "RETURN varNode5");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode5:IndexPlace)\n"
					+ "WHERE (EXISTS {\n"
					+ "            MATCH (varNode5)-[varEdge5:IS_SUB_OF]-(varNode6:IndexPlace)} \n"
					+ "      OR EXISTS {\n"
					+ "            MATCH (varNode5)-[varEdge6:placeOfIssue]-(varNode7:Regesta)})\n"
					+ "RETURN varNode5");
			i++;
			
			assertTrue(NOT_ALL_PATTERN_HAVE_BEEN_CHECK, i == completePatterns.size());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest05ParameterValuesQueryComp() {		
		try {
			new CypherTest05ParameterValues().buildPatterns(completePatterns);
			int i = 0;
			
			//TextLiteralParam
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3)\n"
					+ "WHERE (varNode3.date = \"1439 Dezember 20\")\n"
					+ "RETURN varNode3");
			i++;
			
			//TextListParam
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3)\n"
					+ "WHERE (varNode3.origPlaceOfIssue = [\"unknown\", \"USA\", \"17\", \"17.0\", \"-17\", \"-17.0\", \"-17.0+\"])\n"
					+ "RETURN varNode3");
			i++;
			
			//NumberParam
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3)\n"
					+ "WHERE (varNode3.age = 1452.0)\n"
					+ "RETURN varNode3");
			i++;
			
			//BooleanParam
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3)\n"
					+ "WHERE (varNode3.isVater = true)\n"
					+ "RETURN varNode3");
			i++;
			
			//DateParam
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3)\n"
					+ "WHERE (varNode3.isoStartDate  = date('1439-12-20'))\n"
					+ "RETURN varNode3");
			i++;
			
			//TimeParam
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3)\n"
					+ "WHERE (varNode3.isoStartDate = time('09:00:00'))\n"
					+ "RETURN varNode3");
			i++;
			
			//DateTimeParam
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3)\n"
					+ "WHERE (varNode3.isoStartDate = datetime('2020-10-03T09:00:00'))\n"
					+ "RETURN varNode3");
			i++;
			
			//MultiListParam
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3)\n"
					+ "WHERE (varNode3.origPlaceOfIssue = [\"unknown\", \"USA\", 17, 17.0, -17, -17.0, \"-17.0+\"])\n"
					+ "RETURN varNode3");
			i++;
			
			//MultiListParam + IN
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3)\n"
					+ "WHERE (varNode3.origPlaceOfIssue IN [\"unknown\", \"USA\", 17, 17.0, -17, -17.0, \"-17.0+\"])\n"
					+ "RETURN varNode3");
			i++;
			
			assertTrue(NOT_ALL_PATTERN_HAVE_BEEN_CHECK, i == completePatterns.size());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest06ComparisonQueryComp() {		
		try {
			new CypherTest06Comparison().buildPatterns(completePatterns);
			int i = 0;
			
			//Equal
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode5)\n"
					+ "MATCH (varNode6)\n"
					+ "WHERE (varNode5 = varNode6\n"
					+ "            AND varNode6 = varNode5)\n"
					+ "RETURN varNode5");
			i++;
			
			//Unequal
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode5)\n"
					+ "MATCH (varNode6)\n"
					+ "WHERE (varNode5 <> varNode6\n"
					+ "            AND varNode6 <> varNode5)\n"
					+ "RETURN varNode5");
			i++;
			
			//getComparisonTwoNeoPropertiesWithNeoPartsAndPropertyName (NOTEQUAL)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode5)-[varEdge3:PLACE_OF_ISSUE]-(varPropertyNode6:Place)\n"
					+ "MATCH (varNode7)-[varEdge4:PLACE_OF_ISSUE]-(varPropertyNode8:Place)\n"
					+ "WHERE (varNode5 <> varNode7\n"
					+ "            AND varPropertyNode6.normalizedGerman <> varPropertyNode8.normalizedGerman\n"
					+ "            AND varPropertyNode8.normalizedGerman <> varPropertyNode6.normalizedGerman)\n"
					+ "RETURN varNode5");
			i++;
			
			//getComparisonTwoNeoPropertiesWithNeoPartsAndPropertyName (EQUAL)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode5)-[varEdge3:PLACE_OF_ISSUE]-(varPropertyNode6:Place)\n"
					+ "MATCH (varNode7)-[varEdge4:PLACE_OF_ISSUE]-(varPropertyNode8:Place)\n"
					+ "WHERE (varNode5 <> varNode7\n"
					+ "            AND varPropertyNode6.normalizedGerman = varPropertyNode8.normalizedGerman\n"
					+ "            AND varPropertyNode8.normalizedGerman = varPropertyNode6.normalizedGerman)\n"
					+ "RETURN varNode5");
			i++;
			
			//getMultipleComparisons
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode5)-[varEdge3:PLACE_OF_ISSUE]-(varPropertyNode6:Place)\n"
					+ "MATCH (varNode7)-[varEdge4:PLACE_OF_ISSUE]-(varPropertyNode8:Place)\n"
					+ "WHERE (varNode5 <> varNode7\n"
					+ "            AND varNode7 <> varNode5\n"
					+ "            AND varNode5 = varNode7\n"
					+ "            AND varNode7 = varNode5\n"
					+ "            AND varNode5 = varNode7\n"
					+ "            AND varPropertyNode6.normalizedGerman <> varPropertyNode8.normalizedGerman\n"
					+ "            AND varPropertyNode8.normalizedGerman <> varPropertyNode6.normalizedGerman\n"
					+ "            AND varNode5 = varNode7\n"
					+ "            AND varPropertyNode6.normalizedGerman = varPropertyNode8.normalizedGerman\n"
					+ "            AND varPropertyNode8.normalizedGerman = varPropertyNode6.normalizedGerman)\n"
					+ "RETURN varNode5");
			i++;
			
			//getCompareByElementId (NOTEQUAL)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode5)-[varEdge3:PLACE_OF_ISSUE]-(varPropertyNode6:Place)\n"
					+ "MATCH (varNode7)-[varEdge4:PLACE_OF_ISSUE]-(varPropertyNode8:Place)\n"
					+ "WHERE (ID(varNode5) <> ID(varNode7)\n"
					+ "            AND varNode7 <> varNode5)\n"
					+ "RETURN varNode5");
			i++;
			
			//getCompareByElementId (EQUAL)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode5)-[varEdge3:PLACE_OF_ISSUE]-(varPropertyNode6:Place)\n"
					+ "MATCH (varNode7)-[varEdge4:PLACE_OF_ISSUE]-(varPropertyNode8:Place)\n"
					+ "WHERE (ID(varNode5) = ID(varNode7)\n"
					+ "            AND varNode7 = varNode5)\n"
					+ "RETURN varNode5");
			i++;
			
			assertTrue(NOT_ALL_PATTERN_HAVE_BEEN_CHECK, i == completePatterns.size());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest07QuantifiedConditionQueryComp() {		
		try {
			new CypherTest07QuantifiedCondition().buildPatterns(completePatterns);
			int i = 0;
			
			//getNodesWhereExits (false)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)\n"
					+ "WHERE EXISTS (varNode3.origPlaceOfIssue)\n"
					+ "RETURN varNode3");
			i++;
			
			//getNodesWhereExits (true)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)\n"
					+ "WHERE NOT ((EXISTS (varNode3.origPlaceOfIssue)))\n"
					+ "RETURN varNode3");
			i++;
			
			//getNodesWhereMultiplePropertyExistsChecks (false)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode5:Regesta)\n"
					+ "WHERE EXISTS (varNode5.origPlaceOfIssue, varNode5.origPlaceOfIssue, varNode5.origPlaceOfIssue)\n"
					+ "RETURN varNode5");
			i++;
			
			//getNodesWhereMultiplePropertyExistsChecks (true)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode5:Regesta)\n"
					+ "WHERE EXISTS (varNode5.origPlaceOfIssue, varNode5.origPlaceOfIssue, varNode5.origPlaceOfIssue)\n"
					+ "RETURN varNode5");
			i++;
			
			assertTrue(NOT_ALL_PATTERN_HAVE_BEEN_CHECK, i == completePatterns.size());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest08CycleQueryComp() {		
		try {
			new CypherTest08Cycle().buildPatterns(completePatterns);
			int i = 0;
			
			//getCyclePattern(2)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode4)-[varEdge4]-(varNode5)-[varEdge5]-(varNode4)\n"
					+ "RETURN varNode4");
			i++;
			
			//getCyclePattern(3)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode5)-[varEdge5]-(varNode6)-[varEdge6]-(varNode7)-[varEdge7]-(varNode5)\n"
					+ "RETURN varNode5");
			i++;
			
			//getCyclePatternComp(2)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode5)-[varEdge4]-(varNode6)-[varEdge5]-(varNode7)\n"
					+ "WHERE (varNode5 = varNode7)\n"
					+ "RETURN varNode5");
			i++;
			
			//getCyclePatternComp(3)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode6)-[varEdge5]-(varNode7)-[varEdge6]-(varNode8)-[varEdge7]-(varNode9)\n"
					+ "WHERE (varNode6 = varNode9)\n"
					+ "RETURN varNode6");
			i++;
						
			assertTrue(NOT_ALL_PATTERN_HAVE_BEEN_CHECK, i == completePatterns.size());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest09ContainsQueryComp() {		
		try {
			new CypherTest09Contains().buildPatterns(completePatterns);
			int i = 0;
			
			//getPatternContains (true)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3)\n"
					+ "WHERE (varNode3.archivalHistory CONTAINS (\"http://opac.regesta-imperii.de/lang_de/kurztitelsuche_r.php?kurztitel=gudenus,_cod._dipl.\"))\n"
					+ "RETURN varNode3");
			i++;
			
			//getPatternContains (false)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3)\n"
					+ "WHERE (NOT (varNode3.archivalHistory CONTAINS (\"http://opac.regesta-imperii.de/lang_de/kurztitelsuche_r.php?kurztitel=gudenus,_cod._dipl.\")))\n"
					+ "RETURN varNode3");
			i++;
			
			//getMultipleContains (true)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode7)\n"
					+ "WHERE (varNode7.summary CONTAINS (\"Churfürsten (Dietrich von Mainz, Dietrich\")\n"
					+ "            AND varNode7.identifier CONTAINS (\"hmel n. \")\n"
					+ "            AND varNode7.exchangeIdentifier CONTAINS (\"20_000001_000001_013_0\")\n"
					+ "            AND varNode7.bandpk CONTAINS (\"13000000\")\n"
					+ "            AND varNode7.title CONTAINS (\"Friedrich\"))\n"
					+ "RETURN varNode7");
			i++;
			
			//getMultipleContains (false)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode7)\n"
					+ "WHERE (NOT (varNode7.summary CONTAINS (\"Churfürsten (Dietrich von Mainz, Dietrich\"))\n"
					+ "            AND NOT (varNode7.identifier CONTAINS (\"hmel n. \"))\n"
					+ "            AND NOT (varNode7.exchangeIdentifier CONTAINS (\"20_000001_000001_013_0\"))\n"
					+ "            AND NOT (varNode7.bandpk CONTAINS (\"13000000\"))\n"
					+ "            AND NOT (varNode7.title CONTAINS (\"Friedrich\")))\n"
					+ "RETURN varNode7");
			i++;
			
			assertTrue(NOT_ALL_PATTERN_HAVE_BEEN_CHECK, i == completePatterns.size());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest10MatchQueryComp() {		
		try {
			new CypherTest10Match().buildPatterns(completePatterns);
			int i = 0;
			
			//getPatternMatch
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)\n"
					+ "WHERE (varNode3.summary =~ \"Churfürsten\")\n"
					+ "RETURN varNode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)\n"
					+ "WHERE (NOT (varNode3.summary =~ \"Churfürsten\"))\n"
					+ "RETURN varNode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)\n"
					+ "WHERE (varNode3.summary =~ \".*Churfürsten.*\")\n"
					+ "RETURN varNode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)\n"
					+ "WHERE (NOT (varNode3.summary =~ \".*Churfürsten.*\"))\n"
					+ "RETURN varNode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)\n"
					+ "WHERE (varNode3.summary =~ \".*(?i)Churfürsten.*\")\n"
					+ "RETURN varNode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)\n"
					+ "WHERE (NOT (varNode3.summary =~ \".*(?i)Churfürsten.*\"))\n"
					+ "RETURN varNode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)\n"
					+ "WHERE (varNode3.summary =~ \".*(?m)Churfürsten.*\")\n"
					+ "RETURN varNode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)\n"
					+ "WHERE (NOT (varNode3.summary =~ \".*(?m)Churfürsten.*\"))\n"
					+ "RETURN varNode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)\n"
					+ "WHERE (varNode3.summary =~ \".*(?s)Churfürsten.*\")\n"
					+ "RETURN varNode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)\n"
					+ "WHERE (NOT (varNode3.summary =~ \".*(?s)Churfürsten.*\"))\n"
					+ "RETURN varNode3");
			i++;
			
			assertTrue(NOT_ALL_PATTERN_HAVE_BEEN_CHECK, i == completePatterns.size());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	//@Test
	public void cypherTest11CountConditionQueryComp() {		
		try {
			new CypherTest11CountCondition().buildPatterns(completePatterns);
			int i = 0;
			
			//getJustCount
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode4)\n"
					+ "WITH varNode4, COUNT(varNode4) AS myCounter1\n"
					+ "WHERE myCounter1 = 1.0\n"
					+ "RETURN varNode4");
			i++;
			
			//getCountInPattern
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3)\n"
					+ "MATCH (varNode3)-[varEdge2]-(varNode4)\n"
					+ "WITH varNode3, COUNT(varNode4) AS myCounter1\n"
					+ "WHERE myCounter1 = 1.0\n"
					+ "RETURN varNode3");
			i++;
			
			//getCountInPatternWithRemoveAElement
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3)\n"
					+ "MATCH (varNode3)-[varEdge2]-(varNode4)\n"
					+ "WITH varNode3, COUNT(varNode4) AS myCounter1\n"
					+ "WHERE myCounter1 = 1.0\n"
					+ "RETURN varNode3");
			i++;
			
			//getMultiCountsInPattern
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3)\n"
					+ "MATCH (varNode3)-[varEdge2]-(varNode4)\n"
					+ "WITH varNode3, COUNT(varNode3) AS myCounter1, COUNT(varNode4) AS myCounter2\n"
					+ "WHERE myCounter1 = 1.0 AND myCounter2 = 1.0\n"
					+ "RETURN varNode3");
			i++;
			
			//getCountConditionWithWhereClause
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode5)\n"
					+ "WHERE (varNode5.placeOfIssue = \"Wien\")\n"
					+ "MATCH (varNode5)-[varEdge4]-(varNode6)\n"
					+ "WHERE (varNode5 = varNode6)\n"
					+ "WITH varNode5, COUNT(varNode5) AS myCounter1\n"
					+ "WHERE myCounter1 = 1.0\n"
					+ "RETURN varNode5");
			i++;
			
			//getCountAPropertyNode
			System.out.println(completePatterns.get(i).generateCypher());
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode4)-[varEdge2:PLACE_OF_ISSUE]-(varPropertyNode5:IndexPlace)\n"
					+ "MATCH (varNode4)-[varEdge4]-(varNode6)\n"
					+ "WITH varNode4, COUNT(varPropertyNode5) AS myCounter1\n"
					+ "WHERE myCounter1 = 1.0\n"
					+ "RETURN varNode4");
			i++;
			
			//getCountAProperty
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode4)\n"
					+ "WITH varNode4, COUNT(varNode4.placeOfIssue) AS myCounter1\n"
					+ "WHERE myCounter1 = 1.0\n"
					+ "RETURN varNode4");
			i++;
			
			//getCountWithRelations --> Error
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode4:Regesta)-[varEdge2]-(varNode5:IndexPlace)\n"
					+ "MATCH (varNode4)-[varEdge4]-(varNode6:IndexPerson)\n"
					+ "WITH varNode5, varEdge4, COUNT(varNode6) AS myCounter1\n"
					+ "WHERE myCounter1 = 1.0\n"
					+ "RETURN varNode5");
			i++;
			
			assertTrue(NOT_ALL_PATTERN_HAVE_BEEN_CHECK, i == completePatterns.size());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest12CheckNullQueryComp() {		
		try {
			new CypherTest12CheckNull().buildPatterns(completePatterns);
			int i = 0;
			
			//getNullCheckInvalidOptionException
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)\n"
					+ "WHERE (varNode3.summary IS NULL)\n"
					+ "RETURN varNode3");
			i++;
			
			//getNullCheckNullPrimitiveNodeException
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)\n"
					+ "WHERE (varNode3.summary IS NOT NULL)\n"
					+ "RETURN varNode3");
			i++;
			
			assertTrue(NOT_ALL_PATTERN_HAVE_BEEN_CHECK, i == completePatterns.size());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	//End - String Comparison
	protected abstract void tester(ArrayList<CompletePattern> completePatterns) throws Exception;
}