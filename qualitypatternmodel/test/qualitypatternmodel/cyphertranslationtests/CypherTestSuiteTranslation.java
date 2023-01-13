package qualitypatternmodel.cyphertranslationtests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

import org.eclipse.ocl.xtext.oclinecorecs.SysMLCS;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExecutionCondition;

import playground.Java2Neo4JConnector;
import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest00;
import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest01NeoElementEdge;
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
public abstract class CypherTestSuiteTranslation implements ExecutionCondition {

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
			Java2Neo4JConnector connector = new Java2Neo4JConnector();
			CypherTranslation.innerTestAllCompletePatterns(completePatterns, connector);
		} else {
			Java2Neo4JConnector connector = null;
			CypherTranslation.innerTestAllCompletePatterns(completePatterns, connector);
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
	public void cypherTest01NeoElementEdge() {		
		assertDoesNotThrow(() -> {new CypherTest01NeoElementEdge().buildPatterns(completePatterns); 
			tester(completePatterns);});
	}

	@Test
	public void cypherTest01NeoElementEdgeExceptions() {		
			assertDoesNotThrow(() -> new CypherTest01NeoElementEdge().buildInvalidityExceptionPatterns(completePatterns));
			for (CompletePattern cp : completePatterns) {
				assertThrows(InvalidityException.class, () -> {exceptionHandler(cp);},
						EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
			}
			assertThrows(InvalidityException.class, () -> {CypherTest01NeoElementEdge.generateToCreateNeoDirectionErrorShallNotWorkException();},
					//Add additional Exceptions
					EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
			assertThrows(UnsupportedOperationException.class, () -> {CypherTest01NeoElementEdge.generateBuildNeoNeoNeedsAPathParamException();
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
		completePatterns.clear();
		assertDoesNotThrow(() -> {new CypherTest01NeoPropertyEdge().buildToComplexQueryPatterns(completePatterns); 
		testerForToComplexQueries(completePatterns);});
	}

	@Test
	public void cypherTest01NeoPropertyEdgeExceptions() {	
			assertDoesNotThrow(() -> new CypherTest01NeoPropertyEdge().buildInvalidityExceptionPatterns(completePatterns));
			for (CompletePattern cp : completePatterns) {
				assertThrows(InvalidityException.class, () -> {exceptionHandler(cp);},
						EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
			}
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
			assertDoesNotThrow(() -> new CypherTest02Return().buildInvalidityExceptionPatterns(completePatterns));
			for (CompletePattern cp : completePatterns) {
				assertThrows(InvalidityException.class, () -> {exceptionHandler(cp);
						},
						EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
			}
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
		completePatterns.clear();
		assertDoesNotThrow(() -> {new CypherTest01NeoPropertyEdge().buildToComplexQueryPatterns(completePatterns); 
		testerForToComplexQueries(completePatterns);});
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
		completePatterns.clear();
		assertDoesNotThrow(() -> {new CypherTest07QuantifiedCondition().buildToComplexQueryPatterns(completePatterns); 
		testerForToComplexQueries(completePatterns);});
	}

	@Test
	public void cypherTest07QuantifiedConditionExceptions() {
			assertDoesNotThrow(() -> new CypherTest07QuantifiedCondition().buildInvalidityExceptionPatterns(completePatterns));
			for (CompletePattern cp : completePatterns) {
				assertThrows(InvalidityException.class, () -> {exceptionHandler(cp);
							},
							EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
			}
	//		assertThrows(OperatorCycleException.class, () -> {CypherTest01NeoEdge.tryToCreateNeoDirectionErrorShallNotWork();},
	//				//Add additional Exceptions
	//				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
			completePatterns.clear();
			assertDoesNotThrow(() -> new CypherTest07QuantifiedCondition().buildUnsupportedException(completePatterns));
			for (CompletePattern cp : completePatterns) {
				assertThrows(Exception.class, () -> {exceptionHandler(cp);},
				EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION);
			}
			completePatterns.clear();
			assertDoesNotThrow(() -> new CypherTest07QuantifiedCondition().buildOtherException(completePatterns));
			for (CompletePattern cp : completePatterns) {
				assertThrows(Exception.class, () -> {exceptionHandler(cp);
					});
			}
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
			assertDoesNotThrow(()-> new CypherTest10Match().buildInvalidityExceptionPatterns(completePatterns));
			for (CompletePattern cp : completePatterns) {
				assertThrows(InvalidityException.class, () -> {exceptionHandler(cp);},
						EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
			}
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
			assertDoesNotThrow(() -> new CypherTest11CountCondition().buildInvalidityExceptionPatterns(completePatterns));
			for (CompletePattern cp : completePatterns) {
				assertThrows(InvalidityException.class, () -> {exceptionHandler(cp);},
						EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
			}
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
//			System.out.println(completePatterns.get(i).generateCypher());
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)\n"
					+ "RETURN varElementNode3");
			i++;
			
			//getBasePatternComplexFinal
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)-[varElementEdge2]-(varElementNode4)\n"
					+ "RETURN varElementNode3");
			i++;
			//getBasePatternCondDateConcrete
			assertEquals(completePatterns.get(i).generateCypher(), 
					"\nMATCH (varElementNode8:Place), (varElementNode8)-[varElementEdge7]-(varElementNode9:Regesta), (varElementNode9)-[varElementEdge8]-(varElementNode10:Place), (varElementNode9)-[varElementEdge9]-(varElementNode11:IndexPerson), (varElementNode9)-[varElementEdge10]-(varElementNode12), (varElementNode8)-[varElementEdge11]-(varElementNode13), (varElementNode8)-[varElementEdge12]-(varElementNode14)\n"
					+ "RETURN DISTINCT (varElementNode8)");
			i++;

			//getBasePatternCondDateConcrete
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)\n"
					+ "WHERE (varElementNode3.isoStartDate = date('1440-02-02'))\n"
					+ "RETURN varElementNode3");
			i++;
		
			//getBasePatternCondConcrete
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)\n"
					+ "WHERE (varElementNode3.endDate = \"1439-12-20\")\n"
					+ "RETURN varElementNode3");
			i++;
		
			//getBasePatternMatchConcrete
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)\n"
					+ "WHERE (varElementNode3.endDate =~ \"1439.*\")\n"
					+ "RETURN varElementNode3");
			i++;
			
			//getBasePatternMatchNotConcrete
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)\n"
					+ "WHERE (NOT (varElementNode3.endDate =~ \"1439.*\"))\n"
					+ "RETURN varElementNode3");
			i++;
			
			assertTrue(NOT_ALL_PATTERN_HAVE_BEEN_CHECK, i == completePatterns.size());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest01NeoElementEdgeQueryComp() {		
		try {
			new CypherTest01NeoElementEdge().buildPatterns(completePatterns);
			int i = 0;
		
			//getUnspecifiedEdge
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)--(varElementNode4)\n"
					+ "RETURN varElementNode3");
			i++;
			
			//getSimpleEdge
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)-[varElementEdge2]-(varElementNode4)\n"
					+ "RETURN varElementNode3, varElementNode4, \n"
					+ "   varElementEdge2");
			i++;
			
			//getSimpleEdgeWithLabels
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)-[varElementEdge2:PLACE_OF_ISSUE]-(varElementNode4:Place)\n"
					+ "RETURN varElementNode3, varElementNode4, \n"
					+ "   varElementEdge2");
			i++;
			
			//getSimpleEdgeWithLabelsRight
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)-[varElementEdge2:PLACE_OF_ISSUE]->(varElementNode4:Place)\n"
					+ "RETURN varElementNode3, varElementNode4, \n"
					+ "   varElementEdge2");
			i++;
			
			//getSimpleEdgeWithLabelsLeft
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Place)<-[varElementEdge2:PLACE_OF_ISSUE]-(varElementNode4:Regesta)\n"
					+ "RETURN varElementNode3, varElementNode4, \n"
					+ "   varElementEdge2");
			i++;
			
			//getSimpleEdgeWithTargetNode
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)-[varElementEdge2:PLACE_OF_ISSUE]->(intEgNode2:Place)--(varElementNode4:Regesta)\n"
					+ "RETURN varElementNode3, varElementNode4, \n"
					+ "   varElementEdge2,\n"
					+ "   intEgNode2");
			i++;
			
			//getComplexEdge
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)-[varElementEdge2:PLACE_OF_ISSUE]->(intEgNode2:Place)<-[varElementEdge2_1:PLACE_OF_ISSUE]-(varElementNode4:Regesta)\n"
					+ "RETURN varElementNode3, varElementNode4, \n"
					+ "   varElementEdge2, varElementEdge2_1,\n"
					+ "   intEgNode2");
			i++;
			
			//getComplexEdgeWithDoppleEnding
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)-[varElementEdge2:PLACE_OF_ISSUE]->(intEgNode2:Place)<-[varElementEdge2_1:PLACE_OF_ISSUE]-(varElementNode4:Regesta)\n"
					+ "RETURN varElementNode3, varElementNode4, \n"
					+ "   varElementEdge2, varElementEdge2_1,\n"
					+ "   intEgNode2");
			i++;
			
			//getComplexEdgeWithTargeAtEndAndLabels
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)-[varElementEdge2:PLACE_OF_ISSUE]-(intEgNode2:Place)-[varElementEdge2_1:PLACE_OF_ISSUE]-(intEgNode2_1:Regesta)-[varElementEdge2_2:APPEARS_IN]-(varElementNode4:IndexEntry:IndexPerson)\n"
					+ "RETURN varElementNode3, varElementNode4, \n"
					+ "   varElementEdge2, varElementEdge2_1, varElementEdge2_2,\n"
					+ "   intEgNode2, intEgNode2_1");
			i++;
			
			//getComplexEdgeWithLabelsDiffrentDirectionsAndLabels
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)-[varElementEdge2:PLACE_OF_ISSUE]->(intEgNode2:Place)<-[varElementEdge2_1:PLACE_OF_ISSUE]-(intEgNode2_1:Regesta)<-[varElementEdge2_2:APPEARS_IN]-(varElementNode4:IndexEntry:IndexPerson)\n"
					+ "RETURN varElementNode3, varElementNode4, \n"
					+ "   varElementEdge2, varElementEdge2_1, varElementEdge2_2,\n"
					+ "   intEgNode2, intEgNode2_1");
			i++;
		
			//getMultipleGraphPatterns
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5)-[varElementEdge3]-(varElementNode6)\n"
					+ "MATCH (varElementNode7)-[varElementEdge4]-(varElementNode8)\n"
					+ "RETURN varElementNode5");
			i++;
			
			//getSimpleEdgeWithTargetNodeAndDopple
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)-[varElementEdge2:PLACE_OF_ISSUE]->(intEgNode2:Place)--(varElementNode4:Regesta)\n"
					+ "RETURN varElementNode3, varElementNode4, \n"
					+ "   varElementEdge2,\n"
					+ "   intEgNode2");
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
			new CypherTest01NeoPropertyEdge().buildToComplexQueryPatterns(completePatterns);
			int i = 0;
			
			//getBlankSimpleEdge
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)\n"
					+ "RETURN varElementNode3");
			i++;
	
			//getNeoPropertyEdge
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)-[varPropertyEdge2]-(varPropertyNode4_2)\n"
					+ "RETURN varElementNode3");
			i++;
			
			//getSimpleEdgeReturnOnlyProperty
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)\n"
					+ "RETURN varElementNode3.identifier");
			i++;
		
			//getSimpleEdgeReturnOnlyMultiProperty
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5)\n"
					+ "RETURN varElementNode5.identifier, varElementNode5.date, varElementNode5.placeOfIssue");
			i++;
			
			//getSimpleEdgeWithLabels
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)-[varPropertyEdge2:PLACE_OF_ISSUE]-(varPropertyNode4_2:Place)\n"
					+ "RETURN varElementNode3");
			i++;

			//getSimpleEdgeWithLabelsRight
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)-[varPropertyEdge2:PLACE_OF_ISSUE]->(varPropertyNode4_2:Place)\n"
					+ "RETURN varElementNode3");
			i++;
	
			//getSimpleEdgeWithLabelsLeft
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)<-[varPropertyEdge2:APPEARS_IN]-(varPropertyNode4_2:IndexEntry:IndexPlace)\n"
					+ "RETURN varElementNode3");
			i++;
		
			//getSimpleEdgeWithTargetNodePropertyNProperty
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)-[varPropertyEdge2:PLACE_OF_ISSUE]->(varPropertyNode4_2:Place)\n"
					+ "RETURN varElementNode3, \n"
					+ "   varPropertyNode4_2.identifier");
			i++;
		
			//getSimpleEdgeWithTargetNodePropertyNNeoPropertyEdgeNProperty
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)-[varPropertyEdge2:PLACE_OF_ISSUE]->(varPropertyNode4_2:Place)\n"
					+ "RETURN varElementNode3, \n"
					+ "   varPropertyNode4_2.identifier, \n"
					+ "   varPropertyEdge2");
			i++;
			
			//getComplexEdge
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)-[varPropertyEdge2]-(intEgNode2)-[varPropertyEdge2_1]-(varPropertyNode4_2)\n"
					+ "RETURN varElementNode3,\n"
					+ "   intEgNode2");
			i++;
		
			//getComplexEdgeWithLabels
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)-[varPropertyEdge2:APPEARS_IN]-(intEgNode2:IndexEntry:IndexPlace)-[varPropertyEdge2_1:IS_SUB_OF]-(varPropertyNode4_2:IndexEntry:IndexPerson)\n"
					+ "RETURN varElementNode3,\n"
					+ "   intEgNode2");
			i++;

			//getComplexEdgeWithLabelsDiffrentDirections
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)<-[varPropertyEdge2:APPEARS_IN]-(intEgNode2:IndexEntry:IndexPlace)<-[varPropertyEdge2_1:IS_SUB_OF]-(varPropertyNode4_2:IndexEntry:IndexPerson)\n"
					+ "RETURN varElementNode3,\n"
					+ "   intEgNode2");
			i++;
	
			//getComplexEdgeWithLabelsDiffrentDirectionsAndAllReturns
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)<-[varPropertyEdge2:APPEARS_IN]-(intEgNode2:IndexEntry:IndexPlace)<-[varPropertyEdge2_1:IS_SUB_OF]-(varPropertyNode4_2:IndexEntry:IndexPerson)\n"
					+ "RETURN varElementNode3, \n"
					+ "   varPropertyNode4_2.path, \n"
					+ "   varPropertyEdge2, varPropertyEdge2_1,\n"
					+ "   intEgNode2");
			i++;
			
			//getComplexEdgeWithLabelsDiffrentDirectionsAndAllReturns
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode7)\n"
					+ "MATCH (varElementNode8)\n"
					+ "MATCH (varElementNode9)-[varPropertyEdge6]-(varPropertyNode10_6:Regesta)\n"
					+ "MATCH (varElementNode11)-[varPropertyEdge8]-(varPropertyNode10_8:Regesta)\n"
					+ "WHERE (varElementNode7.placeOfIssue = varElementNode8.placeOfIssue AND varElementNode7.placeOfIssue = varPropertyNode10_6.placeOfIssue AND varElementNode7.placeOfIssue = varPropertyNode10_8.placeOfIssue)\n"
					+ "   AND NOT ((varElementNode7.placeOfIssue = varElementNode8.placeOfIssue))\n"
					+ "RETURN varElementNode7");
			i++;
		
			//getMultiEdgesToNeoPropertyNode
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode6)\n"
					+ "MATCH (varElementNode7)\n"
					+ "MATCH (varElementNode8)-[varPropertyEdge5]-(varPropertyNode9_5:Regesta)\n"
					+ "MATCH (varElementNode10)-[varPropertyEdge6]-(varPropertyNode9_6:Regesta)\n"
					+ "WHERE (varElementNode6.placeOfIssue = varElementNode7.placeOfIssue AND varElementNode6.placeOfIssue = varPropertyNode9_5.placeOfIssue AND varElementNode6.placeOfIssue = varPropertyNode9_6.placeOfIssue)\n"
					+ "RETURN varElementNode6");
			i++;	
		
			//getMultiEdgesToTwoNeoPropertyNode
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode7)\n"
					+ "MATCH (varElementNode8)-[varPropertyEdge8]-(varPropertyNode9_8:Regesta)\n"
					+ "MATCH (varElementNode10)-[varPropertyEdge9]-(varPropertyNode11_9:Regesta)\n"
					+ "MATCH (varElementNode12)\n"
					+ "WHERE (varElementNode7.placeOfIssue = varElementNode8.placeOfIssue AND varElementNode7.placeOfIssue = varPropertyNode11_9.placeOfIssue AND varElementNode7.placeOfIssue = varElementNode12.placeOfIssue\n"
					+ "   AND varElementNode7.TestValue1 = varElementNode7.TestValue2 AND varElementNode7.TestValue1 = varPropertyNode9_8.TestValue3)\n"
					+ "RETURN varElementNode7");
			i++;			
		
			//getMultiEdgesToTwoNeoPropertyNode
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode8)\n"
					+ "MATCH (varElementNode9)-[varPropertyEdge14]-(varPropertyNode10_14:Regesta)\n"
					+ "MATCH (varElementNode11)-[varPropertyEdge6]-(varPropertyNode12_6:Regesta)\n"
					+ "MATCH (varElementNode13)\n"
					+ "WHERE (varElementNode8.placeOfIssue = varElementNode9.placeOfIssue AND varElementNode8.placeOfIssue = varPropertyNode12_6.placeOfIssue AND varElementNode8.placeOfIssue = varElementNode13.placeOfIssue\n"
					+ "   AND varElementNode8.TestValue1 = varElementNode8.TestValue2 AND varElementNode8.TestValue1 = varPropertyNode10_14.TestValue3)\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varElementNode14)\n"
					+ "      WHERE (varElementNode8.placeOfIssue = varElementNode14.TestValue4)}\n"
					+ "RETURN varElementNode8");
			i++;			
	
			//getMultiEdgesToTwoNeoPropertyNode
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode7)\n"
					+ "MATCH (varElementNode8)-[varPropertyEdge14]-(varPropertyNode9_14:Regesta)\n"
					+ "MATCH (varElementNode10)-[varPropertyEdge6]-(varPropertyNode11_6:Regesta)\n"
					+ "MATCH (varElementNode12)\n"
					+ "WHERE (varElementNode7.placeOfIssue = varElementNode8.placeOfIssue AND varElementNode7.placeOfIssue = varPropertyNode11_6.placeOfIssue AND varElementNode7.placeOfIssue = varElementNode12.placeOfIssue\n"
					+ "   AND varElementNode7.TestValue1 = varElementNode7.TestValue2 AND varElementNode7.TestValue1 = varPropertyNode9_14.TestValue3)\n"
					+ "   AND (varElementNode7.placeOfIssue = varElementNode7.TestValue4)\n"
					+ "RETURN varElementNode7");
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
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode4:Regesta)-[varElementEdge3:APPEARS_IN]-(intEgNode3:IndexEntry:IndexPlace)-[varElementEdge3_1:APPEARS_IN]-(varElementNode5:Regesta)-[varPropertyEdge4:APPEARS_IN]-(intEgNode4:IndexEntry:IndexPerson)-[varPropertyEdge4_1:APPEARS_IN]-(varPropertyNode6_4:Regesta)\n"
					+ "RETURN varElementNode4, varElementNode5, \n"
					+ "   varPropertyNode6_4.summary, \n"
					+ "   varElementEdge3, varElementEdge3_1, varPropertyEdge4, varPropertyEdge4_1,\n"
					+ "   intEgNode3, intEgNode4");
			i++;
		
			//getAllPossibleReturnTypesWithTwoRelationsToNeoPropertyNode
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode4:Regesta)-[varElementEdge4:APPEARS_IN]-(intEgNode4:IndexEntry:IndexPlace)-[varElementEdge4_1:APPEARS_IN]-(varElementNode5:Regesta)-[varPropertyEdge5:APPEARS_IN]-(intEgNode5:IndexEntry:IndexPerson)-[varPropertyEdge5_1:APPEARS_IN]-(varPropertyNode6_5:Regesta)\n"
					+ "WHERE (varPropertyNode6_5.summary = varElementNode5.title)\n"
					+ "RETURN varElementNode4, varElementNode5, \n"
					+ "   varPropertyNode6_5.summary, varElementNode5.title, \n"
					+ "   varElementEdge4, varElementEdge4_1, varPropertyEdge5, varPropertyEdge5_1,\n"
					+ "   intEgNode4, intEgNode5");
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
			new CypherTest03NotCondition().buildToComplexQueryPatterns(completePatterns);
			int i = 0;

			//getTestPattern1
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode4:Literature)\n"
					+ "WHERE NOT (NOT (EXISTS {\n"
					+ "   MATCH (varElementNode4)<-[varElementEdge2]-(varElementNode5:Regesta)\n"
					+ "   WHERE NOT (EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge4]->(varElementNode6:Reference)})}))\n"
					+ "RETURN varElementNode4");
			i++;
			
			//getTestPattern1WithConditions
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode8:Literature)\n"
					+ "WHERE (varElementNode8.title = \"BATTENBERG\"\n"
					+ "   AND varElementNode8.url = \"http://opac.regesta-imperii.de/lang_de/kurztitelsuche_r.php?kurztitel=battenberg,_solmser_urkunden_1\")\n"
					+ "   AND NOT (NOT (EXISTS {\n"
					+ "      MATCH (varElementNode8)<-[varElementEdge6]-(varElementNode9:Regesta)\n"
					+ "      WHERE (varElementNode9.isoStartDate = date('1439-12-20'))\n"
					+ "         AND NOT (EXISTS {\n"
					+ "            MATCH (varElementNode9)-[varElementEdge11]->(varElementNode10:Reference)\n"
					+ "            WHERE (varElementNode10.title = \"Kulpis Documenta S. 181f.\")})}))\n"
					+ "RETURN varElementNode8");
			i++;
	
			//getTestPattern2
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5:Regesta)\n"
					+ "WHERE NOT (EXISTS {\n"
					+ "   MATCH (varElementNode5), (varElementNode5)-[varElementEdge4:APPEARS_IN]-(varElementNode6:IndexPerson), (varElementNode5)-[varElementEdge5:ACTION]-(varElementNode7:Action), (varElementNode5)-[varElementEdge6:RECIPIENT_IN]-(varElementNode8:IndexPlace)})\n"
					+ "RETURN varElementNode5");
			i++;

			//getTestPattern5
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode4:Regesta)\n"
					+ "WHERE EXISTS {\n"
					+ "   MATCH (varElementNode4), (varElementNode4)<-[varElementEdge4:APPEARS_IN]-(varElementNode5:IndexPerson)-[varElementEdge5:IS_SUB_OF]-(varElementNode6:IndexPlace), (varElementNode4)-[varElementEdge6:RECIPIENT_IN]-(varElementNode6)}\n"
					+ "RETURN varElementNode4");
			i++;
			
			//getNotExistsExists
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5:Regesta)\n"
					+ "WHERE NOT (EXISTS {\n"
					+ "   MATCH (varElementNode5)-[varElementEdge4:APPEARS_IN]-(varElementNode6:IndexPerson)\n"
					+ "   WHERE EXISTS {\n"
					+ "      MATCH (varElementNode6)-[varElementEdge6]-(varElementNode7:Regesta)}})\n"
					+ "RETURN varElementNode5");
			i++;
			
			//getNotNotPattern
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode4)\n"
					+ "WHERE EXISTS {\n"
					+ "   MATCH (varElementNode4)-[varElementEdge4]-(varElementNode5)}\n"
					+ "RETURN varElementNode4");
			i++;
		
			//getNotNotPattern
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode4)\n"
					+ "WHERE NOT (EXISTS {\n"
					+ "   MATCH (varElementNode4)-[varElementEdge4]-(varElementNode5)})\n"
					+ "RETURN varElementNode4");
			i++;
			
			//getNotNotNotNotPattern
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode4)\n"
					+ "WHERE EXISTS {\n"
					+ "   MATCH (varElementNode4)-[varElementEdge4]-(varElementNode5)}\n"
					+ "RETURN varElementNode4");
			i++;
		
			//getNotNotNotNotNotPattern
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode4)\n"
					+ "WHERE NOT (EXISTS {\n"
					+ "   MATCH (varElementNode4)-[varElementEdge4]-(varElementNode5)})\n"
					+ "RETURN varElementNode4");
			i++;			
			
			//getMultiEdgesToTwoWithNotConditionNeoPropertyNode
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode8)\n"
					+ "MATCH (varElementNode9)-[varPropertyEdge14]-(varPropertyNode10_14:Regesta)\n"
					+ "MATCH (varElementNode11)-[varPropertyEdge6]-(varPropertyNode12_6:Regesta)\n"
					+ "MATCH (varElementNode13)\n"
					+ "WHERE (varElementNode8.placeOfIssue = varElementNode9.placeOfIssue AND varElementNode8.placeOfIssue = varPropertyNode12_6.placeOfIssue AND varElementNode8.placeOfIssue = varElementNode13.placeOfIssue\n"
					+ "   AND varElementNode8.TestValue1 = varElementNode8.TestValue2 AND varElementNode8.TestValue1 = varPropertyNode10_14.TestValue3)\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varElementNode14)\n"
					+ "      WHERE (varElementNode8.placeOfIssue = varElementNode14.TestValue4)}\n"
					+ "RETURN varElementNode8");
			i++;
	
			//getMultiEdgesToTwoWithNotConditionWithoutNewComplexNodeNeoPropertyNode
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode7)\n"
					+ "MATCH (varElementNode8)-[varPropertyEdge14]-(varPropertyNode9_14:Regesta)\n"
					+ "MATCH (varElementNode10)-[varPropertyEdge6]-(varPropertyNode11_6:Regesta)\n"
					+ "MATCH (varElementNode12)\n"
					+ "WHERE (varElementNode7.placeOfIssue = varElementNode8.placeOfIssue AND varElementNode7.placeOfIssue = varPropertyNode11_6.placeOfIssue AND varElementNode7.placeOfIssue = varElementNode12.placeOfIssue\n"
					+ "   AND varElementNode7.TestValue1 = varElementNode7.TestValue2 AND varElementNode7.TestValue1 = varPropertyNode9_14.TestValue3)\n"
					+ "   AND (varElementNode7.placeOfIssue = varElementNode7.TestValue4)\n"
					+ "RETURN varElementNode7");
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
			
			//AND
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5:Regesta)\n"
					+ "WHERE EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge5:PLACE_OF_ISSUE]-(varElementNode6:Place)}\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge6:APPEARS_IN]-(varElementNode7:IndexEntry:IndexPlace)}\n"
					+ "RETURN varElementNode5");
			i++;
			
			//OR
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5:Regesta)\n"
					+ "WHERE EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge5:PLACE_OF_ISSUE]-(varElementNode6:Place)}\n"
					+ "   OR EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge6:APPEARS_IN]-(varElementNode7:IndexEntry:IndexPlace)}\n"
					+ "RETURN varElementNode5");
			i++;

			//IMPLIES
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5:Regesta)\n"
					+ "WHERE NOT EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge5:PLACE_OF_ISSUE]-(varElementNode6:Place)}\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge6:APPEARS_IN]-(varElementNode7:IndexEntry:IndexPlace)}\n"
					+ "RETURN varElementNode5");
			i++;
		
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5:Regesta)\n"
					+ "WHERE (EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge5:PLACE_OF_ISSUE]-(varElementNode6:Place)}\n"
					+ "   AND NOT EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge6:APPEARS_IN]-(varElementNode7:IndexEntry:IndexPlace)})\n"
					+ "   OR (NOT EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge5:PLACE_OF_ISSUE]-(varElementNode6:Place)}\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge6:APPEARS_IN]-(varElementNode7:IndexEntry:IndexPlace)})\n"
					+ "RETURN varElementNode5");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5:Regesta)\n"
					+ "WHERE (EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge5:PLACE_OF_ISSUE]-(varElementNode6:Place)}\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge6:APPEARS_IN]-(varElementNode7:IndexEntry:IndexPlace)})\n"
					+ "   OR NOT (EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge5:PLACE_OF_ISSUE]-(varElementNode6:Place)}\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge6:APPEARS_IN]-(varElementNode7:IndexEntry:IndexPlace)})\n"
					+ "RETURN varElementNode5");
			i++;
		
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5:Regesta)\n"
					+ "WHERE (EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge5:PLACE_OF_ISSUE]-(varElementNode6:Place)}\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge6:APPEARS_IN]-(varElementNode7:IndexEntry:IndexPlace)})\n"
					+ "RETURN varElementNode5");
			i++;
		
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5:Regesta)\n"
					+ "WHERE (EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge5:PLACE_OF_ISSUE]-(varElementNode6:Place)}\n"
					+ "   OR EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge6:APPEARS_IN]-(varElementNode7:IndexEntry:IndexPlace)})\n"
					+ "RETURN varElementNode5");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5:Regesta)\n"
					+ "WHERE (NOT EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge5:PLACE_OF_ISSUE]-(varElementNode6:Place)}\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge6:APPEARS_IN]-(varElementNode7:IndexEntry:IndexPlace)})\n"
					+ "RETURN varElementNode5");
			i++;
			
			//
		
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5:Regesta)\n"
					+ "WHERE ((EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge5:PLACE_OF_ISSUE]-(varElementNode6:Place)}\n"
					+ "   AND NOT EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge6:APPEARS_IN]-(varElementNode7:IndexEntry:IndexPlace)})\n"
					+ "   OR (NOT EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge5:PLACE_OF_ISSUE]-(varElementNode6:Place)}\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge6:APPEARS_IN]-(varElementNode7:IndexEntry:IndexPlace)}))\n"
					+ "RETURN varElementNode5");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5:Regesta)\n"
					+ "WHERE ((EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge5:PLACE_OF_ISSUE]-(varElementNode6:Place)}\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge6:APPEARS_IN]-(varElementNode7:IndexEntry:IndexPlace)})\n"
					+ "   OR NOT (EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge5:PLACE_OF_ISSUE]-(varElementNode6:Place)}\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge6:APPEARS_IN]-(varElementNode7:IndexEntry:IndexPlace)}))\n"
					+ "RETURN varElementNode5");
			i++;
		
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5:IndexPlace)\n"
					+ "WHERE (EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge5:IS_SUB_OF]-(varElementNode6:IndexPlace)}\n"
					+ "   OR EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge6:placeOfIssue]-(varElementNode7:Regesta)})\n"
					+ "RETURN varElementNode5");
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
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)\n"
					+ "WHERE (varElementNode3.date = \"1439 Dezember 20\")\n"
					+ "RETURN varElementNode3");
			i++;
			
			//TextListParam
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)\n"
					+ "WHERE (varElementNode3.origPlaceOfIssue = [\"unknown\", \"USA\", \"17\", \"17.0\", \"-17\", \"-17.0\", \"-17.0+\"])\n"
					+ "RETURN varElementNode3");
			i++;
			
			//NumberParam
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)\n"
					+ "WHERE (varElementNode3.age = 1452.0)\n"
					+ "RETURN varElementNode3");
			i++;
	
			//BooleanParam
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)\n"
					+ "WHERE (varElementNode3.isVater = true)\n"
					+ "RETURN varElementNode3");
			i++;
			
			//DateParam
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)\n"
					+ "WHERE (varElementNode3.isoStartDate  = date('1439-12-20'))\n"
					+ "RETURN varElementNode3");
			i++;
			
			//TimeParam
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)\n"
					+ "WHERE (varElementNode3.isoStartDate = time('09:00:00'))\n"
					+ "RETURN varElementNode3");
			i++;
			
			//DateTimeParam
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)\n"
					+ "WHERE (varElementNode3.isoStartDate = datetime('2020-10-03T09:00:00'))\n"
					+ "RETURN varElementNode3");
			i++;
			
			//MultiListParam
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)\n"
					+ "WHERE (varElementNode3.origPlaceOfIssue = [\"unknown\", \"USA\", 17, 17.0, -17, -17.0, \"-17.0+\", date('1439-12-20'), datetime('2020-10-03T09:00:00'), time('09:00:00')])\n"
					+ "RETURN varElementNode3");
			i++;
			
			//MultiListParam + IN
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)\n"
					+ "WHERE (varElementNode3.origPlaceOfIssue IN [\"unknown\", \"USA\", 17, 17.0, -17, -17.0, \"-17.0+\", date('1439-12-20'), datetime('2020-10-03T09:00:00'), time('09:00:00')])\n"
					+ "RETURN varElementNode3");
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
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5)\n"
					+ "MATCH (varElementNode6)\n"
					+ "WHERE (varElementNode5 = varElementNode6\n"
					+ "   AND varElementNode6 = varElementNode5)\n"
					+ "RETURN varElementNode5");
			i++;
		
			//Unequal
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5)\n"
					+ "MATCH (varElementNode6)\n"
					+ "WHERE (varElementNode5 <> varElementNode6\n"
					+ "   AND varElementNode6 <> varElementNode5)\n"
					+ "RETURN varElementNode5");
			i++;
			
			//getComparisonTwoNeoPropertiesWithNeoPartsAndPropertyName (NOTEQUAL)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5)-[varPropertyEdge3:PLACE_OF_ISSUE]-(varPropertyNode6_3:Place)\n"
					+ "MATCH (varElementNode7)-[varPropertyEdge4:PLACE_OF_ISSUE]-(varPropertyNode8_4:Place)\n"
					+ "WHERE (varElementNode5 <> varElementNode7\n"
					+ "   AND varPropertyNode6_3.normalizedGerman <> varPropertyNode8_4.normalizedGerman\n"
					+ "   AND varPropertyNode8_4.normalizedGerman <> varPropertyNode6_3.normalizedGerman)\n"
					+ "RETURN varElementNode5");
			i++;
		
			//getComparisonTwoNeoPropertiesWithNeoPartsAndPropertyName (EQUAL)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5)-[varPropertyEdge3:PLACE_OF_ISSUE]-(varPropertyNode6_3:Place)\n"
					+ "MATCH (varElementNode7)-[varPropertyEdge4:PLACE_OF_ISSUE]-(varPropertyNode8_4:Place)\n"
					+ "WHERE (varElementNode5 <> varElementNode7\n"
					+ "   AND varPropertyNode6_3.normalizedGerman = varPropertyNode8_4.normalizedGerman\n"
					+ "   AND varPropertyNode8_4.normalizedGerman = varPropertyNode6_3.normalizedGerman)\n"
					+ "RETURN varElementNode5");
			i++;
			
			//getMultipleComparisons
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5)-[varPropertyEdge3:PLACE_OF_ISSUE]-(varPropertyNode6_3:Place)\n"
					+ "MATCH (varElementNode7)-[varPropertyEdge4:PLACE_OF_ISSUE]-(varPropertyNode8_4:Place)\n"
					+ "WHERE (varElementNode5 <> varElementNode7\n"
					+ "   AND varElementNode7 <> varElementNode5\n"
					+ "   AND varElementNode5 = varElementNode7\n"
					+ "   AND varElementNode7 = varElementNode5\n"
					+ "   AND varElementNode5 = varElementNode7\n"
					+ "   AND varPropertyNode6_3.normalizedGerman <> varPropertyNode8_4.normalizedGerman\n"
					+ "   AND varPropertyNode8_4.normalizedGerman <> varPropertyNode6_3.normalizedGerman\n"
					+ "   AND varElementNode5 = varElementNode7\n"
					+ "   AND varPropertyNode6_3.normalizedGerman = varPropertyNode8_4.normalizedGerman\n"
					+ "   AND varPropertyNode8_4.normalizedGerman = varPropertyNode6_3.normalizedGerman)\n"
					+ "RETURN varElementNode5");
			i++;
			
			//getCompareByElementId (NOTEQUAL)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5)-[varPropertyEdge3:PLACE_OF_ISSUE]-(varPropertyNode6_3:Place)\n"
					+ "MATCH (varElementNode7)-[varPropertyEdge4:PLACE_OF_ISSUE]-(varPropertyNode8_4:Place)\n"
					+ "WHERE (ID(varElementNode5) <> ID(varElementNode7)\n"
					+ "   AND varElementNode7 <> varElementNode5)\n"
					+ "RETURN varElementNode5");
			i++;
			
			//getCompareByElementId (EQUAL)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5)-[varPropertyEdge3:PLACE_OF_ISSUE]-(varPropertyNode6_3:Place)\n"
					+ "MATCH (varElementNode7)-[varPropertyEdge4:PLACE_OF_ISSUE]-(varPropertyNode8_4:Place)\n"
					+ "WHERE (ID(varElementNode5) = ID(varElementNode7)\n"
					+ "   AND varElementNode7 = varElementNode5)\n"
					+ "RETURN varElementNode5");
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
			new CypherTest07QuantifiedCondition().buildToComplexQueryPatterns(completePatterns);
			int i = 0;
			
			//getNodesWhereExits (false)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode4:Regesta)\n"
					+ "WHERE EXISTS (varElementNode4.origPlaceOfIssue)\n"
					+ "RETURN varElementNode4");
			i++;
		
			//getNodesWhereExits (true)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode4:Regesta)\n"
					+ "WHERE NOT (EXISTS (varElementNode4.origPlaceOfIssue))\n"
					+ "RETURN varElementNode4");
			i++;

			//getNodesWhereMultiplePropertyExistsChecks (false)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode6:Regesta)\n"
					+ "WHERE EXISTS (varElementNode6.origPlaceOfIssue, varElementNode6.startDate, varElementNode6.endDate)\n"
					+ "RETURN varElementNode6");
			i++;
			
			//getNodesWhereMultiplePropertyExistsChecks (true)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode6:Regesta)\n"
					+ "WHERE NOT (EXISTS (varElementNode6.origPlaceOfIssue)\n"
					+ "   AND EXISTS (varElementNode6.startDate)\n"
					+ "   AND EXISTS (varElementNode6.endDate))\n"
					+ "RETURN varElementNode6");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5)\n"
					+ "WHERE NOT (EXISTS {\n"
					+ "   MATCH (varElementNode6), (varElementNode7)\n"
					+ "   WHERE (varElementNode5.date = varElementNode6.startDate AND varElementNode5.date = varElementNode7.isoStartDate)})\n"
					+ "RETURN varElementNode5");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode6)\n"
					+ "WHERE NOT (EXISTS {\n"
					+ "   MATCH (varElementNode6)-[varElementEdge6]-(varElementNode7)\n"
					+ "   WHERE EXISTS (varElementNode7.endDate)\n"
					+ "      AND (varElementNode7.startDate CONTAINS (\"1613\"))})\n"
					+ "RETURN varElementNode6");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode6)\n"
					+ "WHERE EXISTS {\n"
					+ "   MATCH (varElementNode6)-[varElementEdge6]-(varElementNode7)\n"
					+ "   WHERE (varElementNode7.startDate CONTAINS (\"1613\"))}\n"
					+ "RETURN varElementNode6");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode6)\n"
					+ "WHERE EXISTS {\n"
					+ "   MATCH (varElementNode6)-[varElementEdge6]-(varElementNode7), (varElementNode7)-[varPropertyEdge7]-(varPropertyNode8_7:DateNode), (varElementNode7)-[varPropertyEdge8]-(varPropertyNode9_8:DateNode)\n"
					+ "   WHERE (varPropertyNode8_7.startDate CONTAINS (\"1613\")\n"
					+ "      AND varPropertyNode9_8.endDate CONTAINS (\"1614\"))}\n"
					+ "RETURN varElementNode6");
			i++; 
	
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5)\n"
					+ "WHERE EXISTS {\n"
					+ "   MATCH (varElementNode6), (varElementNode7)\n"
					+ "   WHERE (varElementNode5.date = varElementNode6.startDate AND varElementNode5.date = varElementNode7.isoStartDate)}\n"
					+ "RETURN varElementNode5");
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
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode4)-[varElementEdge4]-(varElementNode5)-[varElementEdge5]-(varElementNode4)\n"
					+ "RETURN varElementNode4");
			i++;
			
			//getCyclePattern(3)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5)-[varElementEdge5]-(varElementNode6)-[varElementEdge6]-(varElementNode7)-[varElementEdge7]-(varElementNode5)\n"
					+ "RETURN varElementNode5");
			i++;

			//getCyclePatternComp(2)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5)-[varElementEdge4]-(varElementNode6)-[varElementEdge5]-(varElementNode7)\n"
					+ "WHERE (varElementNode5 = varElementNode7)\n"
					+ "RETURN varElementNode5");
			i++;
			
			//getCyclePatternComp(3)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode6)-[varElementEdge5]-(varElementNode7)-[varElementEdge6]-(varElementNode8)-[varElementEdge7]-(varElementNode9)\n"
					+ "WHERE (varElementNode6 = varElementNode9)\n"
					+ "RETURN varElementNode6");
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
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)\n"
					+ "WHERE (varElementNode3.archivalHistory CONTAINS (\"http://opac.regesta-imperii.de/lang_de/kurztitelsuche_r.php?kurztitel=gudenus,_cod._dipl.\"))\n"
					+ "RETURN varElementNode3");
			i++;
			
			//getPatternContains (false)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)\n"
					+ "WHERE (NOT (varElementNode3.archivalHistory CONTAINS (\"http://opac.regesta-imperii.de/lang_de/kurztitelsuche_r.php?kurztitel=gudenus,_cod._dipl.\")))\n"
					+ "RETURN varElementNode3");
			i++;
	
			//getMultipleContains (true)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode7)\n"
					+ "WHERE (varElementNode7.summary CONTAINS (\"Churfürsten (Dietrich von Mainz, Dietrich\")\n"
					+ "   AND varElementNode7.identifier CONTAINS (\"hmel n. \")\n"
					+ "   AND varElementNode7.exchangeIdentifier CONTAINS (\"20_000001_000001_013_0\")\n"
					+ "   AND varElementNode7.bandpk CONTAINS (\"13000000\")\n"
					+ "   AND varElementNode7.title CONTAINS (\"Friedrich\"))\n"
					+ "RETURN varElementNode7");
			i++;
			
			//getMultipleContains (false)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode7)\n"
					+ "WHERE (NOT (varElementNode7.summary CONTAINS (\"Churfürsten (Dietrich von Mainz, Dietrich\"))\n"
					+ "   AND NOT (varElementNode7.identifier CONTAINS (\"hmel n. \"))\n"
					+ "   AND NOT (varElementNode7.exchangeIdentifier CONTAINS (\"20_000001_000001_013_0\"))\n"
					+ "   AND NOT (varElementNode7.bandpk CONTAINS (\"13000000\"))\n"
					+ "   AND NOT (varElementNode7.title CONTAINS (\"Friedrich\")))\n"
					+ "RETURN varElementNode7");
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
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)\n"
					+ "WHERE (varElementNode3.summary =~ \"Churfürsten\")\n"
					+ "RETURN varElementNode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)\n"
					+ "WHERE (NOT (varElementNode3.summary =~ \"Churfürsten\"))\n"
					+ "RETURN varElementNode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)\n"
					+ "WHERE (varElementNode3.summary =~ \".*Churfürsten.*\")\n"
					+ "RETURN varElementNode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)\n"
					+ "WHERE (NOT (varElementNode3.summary =~ \".*Churfürsten.*\"))\n"
					+ "RETURN varElementNode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)\n"
					+ "WHERE (varElementNode3.summary =~ \".*(?i)Churfürsten.*\")\n"
					+ "RETURN varElementNode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)\n"
					+ "WHERE (NOT (varElementNode3.summary =~ \".*(?i)Churfürsten.*\"))\n"
					+ "RETURN varElementNode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)\n"
					+ "WHERE (varElementNode3.summary =~ \".*(?m)Churfürsten.*\")\n"
					+ "RETURN varElementNode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)\n"
					+ "WHERE (NOT (varElementNode3.summary =~ \".*(?m)Churfürsten.*\"))\n"
					+ "RETURN varElementNode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)\n"
					+ "WHERE (varElementNode3.summary =~ \".*(?s)Churfürsten.*\")\n"
					+ "RETURN varElementNode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)\n"
					+ "WHERE (NOT (varElementNode3.summary =~ \".*(?s)Churfürsten.*\"))\n"
					+ "RETURN varElementNode3");
			i++;
			
			assertTrue(NOT_ALL_PATTERN_HAVE_BEEN_CHECK, i == completePatterns.size());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest11CountConditionQueryComp() {		
		try {
			new CypherTest11CountCondition().buildPatterns(completePatterns);
			int i = 0;
			
			//getJustCount
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode2)\n"
					+ "WITH varElementNode2, COUNT(varElementNode2) AS myCounter1\n"
					+ "WHERE myCounter1 = 1.0\n"
					+ "RETURN varElementNode2");
			i++;
			
			//getCountInPattern
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)\n"
					+ "MATCH (varElementNode3)-[varElementEdge2]-(varElementNode4)\n"
					+ "WITH varElementNode3, COUNT(varElementNode4) AS myCounter1\n"
					+ "WHERE myCounter1 = 1.0\n"
					+ "RETURN varElementNode3");
			i++;
		
			//getCountInPatternWithRemoveAElement
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)\n"
					+ "MATCH (varElementNode3)-[varElementEdge2]-(varElementNode4)\n"
					+ "WITH varElementNode3, COUNT(varElementNode4) AS myCounter1\n"
					+ "WHERE myCounter1 = 1.0\n"
					+ "RETURN varElementNode3");
			i++;
	
			//getMultiCountsInPattern
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)\n"
					+ "MATCH (varElementNode3)-[varElementEdge2]-(varElementNode4)\n"
					+ "WITH varElementNode3, COUNT(varElementNode3) AS myCounter1, COUNT(varElementNode4) AS myCounter2\n"
					+ "WHERE myCounter1 = 1.0 AND myCounter2 = 1.0\n"
					+ "RETURN varElementNode3");
			i++;
			System.out.println(completePatterns.get(i).generateCypher());
			//getCountConditionWithWhereClause
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode4)\n"
					+ "WHERE (varElementNode4.placeOfIssue = \"Wien\")\n"
					+ "MATCH (varElementNode4)-[varElementEdge4]-(varElementNode5)\n"
					+ "WHERE (varElementNode4 = varElementNode5)\n"
					+ "WITH varElementNode4, COUNT(varElementNode4) AS myCounter1\n"
					+ "WHERE myCounter1 = 1.0\n"
					+ "RETURN varElementNode4");
			i++;
	
			//getCountAPropertyNode
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode4)-[varPropertyEdge2:PLACE_OF_ISSUE]-(varPropertyNode5_2:IndexPlace)\n"
					+ "MATCH (varElementNode4)-[varElementEdge4]-(varElementNode6)\n"
					+ "WITH varElementNode4, COUNT(varElementNode4) AS myCounter1, COUNT(varPropertyNode5_2) AS myCounter2\n"
					+ "WHERE myCounter1 = 1.0 AND myCounter2 = 1.0\n"
					+ "RETURN varElementNode4");
			i++;
			
			//getCountAProperty
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode4)\n"
					+ "MATCH (varElementNode4)-[varElementEdge3]-(varElementNode5)\n"
					+ "WITH varElementNode4, COUNT(varElementNode4) AS myCounter1, COUNT(varElementNode4.placeOfIssue) AS myCounter2\n"
					+ "WHERE myCounter1 = 1.0 AND myCounter2 = 1.0\n"
					+ "RETURN varElementNode4");
			i++;
			
			//getCountWithRelations
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode4:Regesta)-[varElementEdge2]-(varElementNode5:IndexPlace)\n"
					+ "MATCH (varElementNode4)-[varElementEdge4]-(varElementNode6:IndexPerson)\n"
					+ "WITH varElementNode5, varElementEdge2, COUNT(varElementNode6) AS myCounter1, COUNT(varElementNode5) AS myCounter2\n"
					+ "WHERE myCounter1 = 1.0 AND myCounter2 = 1.0\n"
					+ "RETURN varElementNode5, \n"
					+ "   varElementEdge2");
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
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)\n"
					+ "WHERE (varElementNode3.summary IS NULL)\n"
					+ "RETURN varElementNode3");
			i++;

			//getNullCheckNullPrimitiveNodeException
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)\n"
					+ "WHERE (varElementNode3.summary IS NOT NULL)\n"
					+ "RETURN varElementNode3");
			i++;
			
			assertTrue(NOT_ALL_PATTERN_HAVE_BEEN_CHECK, i == completePatterns.size());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	//End - String Comparison
	protected abstract void tester(ArrayList<CompletePattern> completePatterns) throws Exception;
	protected abstract void testerForToComplexQueries(ArrayList<CompletePattern> completePatterns) throws Exception;
}