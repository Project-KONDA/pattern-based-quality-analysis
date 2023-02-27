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
import utilis.Java2Neo4JConnector;

//The Exception handler can do more then the for the single case
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
	}

	@Test
	public void cypherTest01NeoPropertyEdge() {		
		assertDoesNotThrow(() -> {new CypherTest01NeoPropertyEdge().buildPatterns(completePatterns); 
			tester(completePatterns);});
		completePatterns.clear();
		assertDoesNotThrow(() -> {new CypherTest01NeoPropertyEdge().buildTooComplexQueryPatterns(completePatterns); 
		testerForToComplexQueries(completePatterns);});
	}

	@Test
	public void cypherTest01NeoPropertyEdgeExceptions() {	
		assertDoesNotThrow(() -> new CypherTest01NeoPropertyEdge().buildInvalidityExceptionPatterns(completePatterns));
		for (CompletePattern cp : completePatterns) {
			assertThrows(InvalidityException.class, () -> {exceptionHandler(cp);},
					EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
		}
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
	}

	@Test
	public void cypherTest03NotCondition() {		
		assertDoesNotThrow(() -> {new CypherTest03NotCondition().buildPatterns(completePatterns); 
		tester(completePatterns);});
		completePatterns.clear();
		assertDoesNotThrow(() -> {new CypherTest01NeoPropertyEdge().buildTooComplexQueryPatterns(completePatterns); 
		testerForToComplexQueries(completePatterns);});
	}

	public void cypherTest03NotConditionExceptions() {		
		assertDoesNotThrow(() -> new CypherTest03NotCondition().buildInvalidityExceptionPatterns(completePatterns));
		for (CompletePattern cp : completePatterns) {
			assertThrows(InvalidityException.class, () -> {exceptionHandler(cp);
						},
						EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
		}
	}

	@Test
	public void cypherTest04Formula() {		
		assertDoesNotThrow(() -> {new CypherTest04Formula().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	@Test
	public void cypherTest04FormulaExceptions() {		
		assertDoesNotThrow(() -> new CypherTest04Formula().buildInvalidityExceptionPatterns(completePatterns));
		for (CompletePattern cp : completePatterns) {
			assertThrows(InvalidityException.class, () -> {exceptionHandler(cp);
						},
						EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
		}
		completePatterns.clear();
		assertDoesNotThrow(() -> new CypherTest04Formula().buildUnsupportedException(completePatterns));
		for (CompletePattern cp : completePatterns) {
			assertThrows(UnsupportedOperationException.class, () -> {exceptionHandler(cp);
						},
						EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
		}
	}

	@Test
	public void cypherTest05ParameterValues() {		
		assertDoesNotThrow(() -> {new CypherTest05ParameterValues().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	@Test
	public void cypherTest05ParameterValuesExceptions() {		
		assertDoesNotThrow(() -> new CypherTest05ParameterValues().buildInvalidityExceptionPatterns(completePatterns));
		for (CompletePattern cp : completePatterns) {
			assertThrows(InvalidityException.class, () -> {exceptionHandler(cp);
						},
						EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
		}
	}

	@Test
	public void cypherTest06Comparison() {	
		assertDoesNotThrow(() -> {new CypherTest06Comparison().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	@Test
	public void cypherTest06ComparisonExceptions() {		
		assertDoesNotThrow(() -> new CypherTest06Comparison().buildInvalidityExceptionPatterns(completePatterns));
		for (CompletePattern cp : completePatterns) {
			assertThrows(InvalidityException.class, () -> {exceptionHandler(cp);
						},
						EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
		}
		assertThrows(RuntimeException.class, () -> {CypherTest06Comparison.generateComparisonTypeException();
			},
			EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
	}

	@Test
	public void cypherTest07QuantifiedCondition() {	
		assertDoesNotThrow(() -> {new CypherTest07QuantifiedCondition().buildPatterns(completePatterns); 
		tester(completePatterns);});
		completePatterns.clear();
		assertDoesNotThrow(() -> {new CypherTest07QuantifiedCondition().buildTooComplexQueryPatterns(completePatterns); 
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

//	No Cycle Exceptions are defined
//	@Test
	public void cypherTest08CycleExceptions() {		
			assertThrows(InvalidityException.class, () -> {//Add additonal Exceptions
					},
					EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
	}

	@Test
	public void cypherTest09Contains() {	
		assertDoesNotThrow(() -> {new CypherTest09Contains().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	@Test
	public void cypherTest09ContainsExceptions() {		
		assertDoesNotThrow(() -> new CypherTest09Contains().buildInvalidityExceptionPatterns(completePatterns));
		for (CompletePattern cp : completePatterns) {
			assertThrows(InvalidityException.class, () -> {exceptionHandler(cp);},
					EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
		}
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
		}

	@Test
	public void cypherTest11CountCondition() {	
		assertDoesNotThrow(() -> {new CypherTest11CountCondition().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	@Test
	public void cypherTest11CountConditionExceptions() {	
			assertDoesNotThrow(() -> new CypherTest11CountCondition().buildInvalidityExceptionPatterns(completePatterns));
			for (CompletePattern cp : completePatterns) {
				assertThrows(InvalidityException.class, () -> {exceptionHandler(cp);},
						EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
			}
			completePatterns.clear();
			assertDoesNotThrow(() -> new CypherTest11CountCondition().buildUnsupportedException(completePatterns));
			for (CompletePattern cp : completePatterns) {
				assertThrows(Exception.class, () -> {exceptionHandler(cp);},
				EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION);
			}
		}

	@Test
	public void cypherTest12CheckNull() {	
		assertDoesNotThrow(() -> {new CypherTest12CheckNull().buildPatterns(completePatterns); 
			tester(completePatterns);});
	}
	
	@Test
	public void cypherTest12CheckNullExceptions() {		
		assertDoesNotThrow(() -> new CypherTest12CheckNull().buildInvalidityExceptionPatterns(completePatterns));
			for (CompletePattern cp : completePatterns) {
				assertThrows(InvalidityException.class, () -> {exceptionHandler(cp);},
						EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
			}
	}
//	//END - Syntax Validation

	
	
	//BEGIN - String Comparison
	@Test
	public void cypherTest00QueryComp() {	
		try {
			new CypherTest00().buildPatterns(completePatterns);
			int i = 0;
			
			//getBasePatternCypher
			System.out.println(completePatterns.get(i).generateCypher());
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3)\n"
					+ "RETURN varENode3");
			i++;
			
			//getBasePatternComplexFinal
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3)-[varEEdge2]-(varENode4)\n"
					+ "RETURN varENode3");
			i++;
			//getBasePatternCondDateConcrete
			assertEquals(completePatterns.get(i).generateCypher(), 
					"\nMATCH (varENode8:Place), (varENode8)-[varEEdge7]-(varENode9:Regesta), (varENode9)-[varEEdge8]-(varENode10:Place), (varENode9)-[varEEdge9]-(varENode11:IndexPerson), (varENode9)-[varEEdge10]-(varENode12), (varENode8)-[varEEdge11]-(varENode13), (varENode8)-[varEEdge12]-(varENode14)\n"
					+ "RETURN DISTINCT (varENode8)");
			i++;

			//getBasePatternCondDateConcrete
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Regesta)\n"
					+ "WHERE (varENode3.isoStartDate = date('1440-02-02'))\n"
					+ "RETURN varENode3");
			i++;
		
			//getBasePatternCondConcrete
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Regesta)\n"
					+ "WHERE (varENode3.endDate = \"1439-12-20\")\n"
					+ "RETURN varENode3");
			i++;
		
			//getBasePatternMatchConcrete
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Regesta)\n"
					+ "WHERE (varENode3.endDate =~ \"1439.*\")\n"
					+ "RETURN varENode3");
			i++;
			
			//getBasePatternMatchNotConcrete
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Regesta)\n"
					+ "WHERE (NOT (varENode3.endDate =~ \"1439.*\"))\n"
					+ "RETURN varENode3");
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
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3)--(varENode4)\n"
					+ "RETURN varENode3");
			i++;
			
			//getSimpleEdge
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3)-[varEEdge2]-(varENode4)\n"
					+ "RETURN varENode3, varENode4, \n"
					+ "   varEEdge2");
			i++;
			
			//getSimpleEdgeWithLabels
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Regesta)-[varEEdge2:PLACE_OF_ISSUE]-(varENode4:Place)\n"
					+ "RETURN varENode3, varENode4, \n"
					+ "   varEEdge2");
			i++;
			
			//getSimpleEdgeWithLabelsRight
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Regesta)-[varEEdge2:PLACE_OF_ISSUE]->(varENode4:Place)\n"
					+ "RETURN varENode3, varENode4, \n"
					+ "   varEEdge2");
			i++;
			
			//getSimpleEdgeWithLabelsLeft
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Place)<-[varEEdge2:PLACE_OF_ISSUE]-(varENode4:Regesta)\n"
					+ "RETURN varENode3, varENode4, \n"
					+ "   varEEdge2");
			i++;

			//getSimpleEdgeWithTargetNode
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Regesta)-[varEEdge2:PLACE_OF_ISSUE]->(varEgNode2:Place)--(varENode4:Regesta)\n"
					+ "RETURN varENode3, varENode4, \n"
					+ "   varEEdge2,\n"
					+ "   varEgNode2");
			i++;
			
			//getComplexEdge
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Regesta)-[varEEdge2:PLACE_OF_ISSUE]->(varEgNode2:Place)<-[varEEdge2_1:PLACE_OF_ISSUE]-(varENode4:Regesta)\n"
					+ "RETURN varENode3, varENode4, \n"
					+ "   varEEdge2, varEEdge2_1,\n"
					+ "   varEgNode2");
			i++;
			
			//getComplexEdgeWithDoppleEnding
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Regesta)-[varEEdge2:PLACE_OF_ISSUE]->(varEgNode2:Place)<-[varEEdge2_1:PLACE_OF_ISSUE]-(varENode4:Regesta)\n"
					+ "RETURN varENode3, varENode4, \n"
					+ "   varEEdge2, varEEdge2_1,\n"
					+ "   varEgNode2");
			i++;
			
			//getComplexEdgeWithTargeAtEndAndLabels
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Regesta)-[varEEdge2:PLACE_OF_ISSUE]-(varEgNode2:Place)-[varEEdge2_1:PLACE_OF_ISSUE]-(varEgNode2_1:Regesta)-[varEEdge2_2:APPEARS_IN]-(varENode4:IndexEntry:IndexPerson)\n"
					+ "RETURN varENode3, varENode4, \n"
					+ "   varEEdge2, varEEdge2_1, varEEdge2_2,\n"
					+ "   varEgNode2, varEgNode2_1");
			i++;
			
			//getComplexEdgeWithLabelsDiffrentDirectionsAndLabels
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Regesta)-[varEEdge2:PLACE_OF_ISSUE]->(varEgNode2:Place)<-[varEEdge2_1:PLACE_OF_ISSUE]-(varEgNode2_1:Regesta)<-[varEEdge2_2:APPEARS_IN]-(varENode4:IndexEntry:IndexPerson)\n"
					+ "RETURN varENode3, varENode4, \n"
					+ "   varEEdge2, varEEdge2_1, varEEdge2_2,\n"
					+ "   varEgNode2, varEgNode2_1");
			i++;
		
			//getMultipleGraphPatterns
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode5)-[varEEdge3]-(varENode6)\n"
					+ "MATCH (varENode7)-[varEEdge4]-(varENode8)\n"
					+ "RETURN varENode5");
			i++;
			
			//getSimpleEdgeWithTargetNodeAndDopple
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Regesta)-[varEEdge2:PLACE_OF_ISSUE]->(varEgNode2:Place)--(varENode4:Regesta)\n"
					+ "RETURN varENode3, varENode4, \n"
					+ "   varEEdge2,\n"
					+ "   varEgNode2");
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
			new CypherTest01NeoPropertyEdge().buildTooComplexQueryPatterns(completePatterns);
			int i = 0;
			
			//getBlankSimpleEdge
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3)\n"
					+ "WHERE EXISTS (varENode3.title)\n"
					+ "RETURN varENode3");
			i++;
	
			//getNeoPropertyEdge
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3)-[varPEdge2]-(varPNode4_2)\n"
					+ "RETURN varENode3");
			i++;
			
			//getSimpleEdgeReturnOnlyProperty
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3)\n"
					+ "RETURN varENode3.identifier");
			i++;
		
			//getSimpleEdgeReturnOnlyMultiProperty
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode5)\n"
					+ "RETURN varENode5.identifier, varENode5.date, varENode5.placeOfIssue");
			i++;
			
			//getSimpleEdgeWithLabels
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Regesta)-[varPEdge2:PLACE_OF_ISSUE]-(varPNode4_2:Place)\n"
					+ "RETURN varENode3");
			i++;

			//getSimpleEdgeWithLabelsRight
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Regesta)-[varPEdge2:PLACE_OF_ISSUE]->(varPNode4_2:Place)\n"
					+ "RETURN varENode3");
			i++;
	
			//getSimpleEdgeWithLabelsLeft
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Regesta)<-[varPEdge2:APPEARS_IN]-(varPNode4_2:IndexEntry:IndexPlace)\n"
					+ "RETURN varENode3");
			i++;
		
			//getSimpleEdgeWithTargetNodePropertyNProperty
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Regesta)-[varPEdge2:PLACE_OF_ISSUE]->(varPNode4_2:Place)\n"
					+ "RETURN varENode3, \n"
					+ "   varPNode4_2.identifier");
			i++;
		
			//getSimpleEdgeWithTargetNodePropertyNNeoPropertyEdgeNProperty
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Regesta)-[varPEdge2:PLACE_OF_ISSUE]->(varPNode4_2:Place)\n"
					+ "RETURN varENode3, \n"
					+ "   varPNode4_2.identifier, \n"
					+ "   varPEdge2");
			i++;
			
			//getComplexEdge
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3)-[varPEdge2]-(varEgNode2)-[varPEdge2_1]-(varPNode4_2)\n"
					+ "RETURN varENode3,\n"
					+ "   varEgNode2");
			i++;
		
			//getComplexEdgeWithLabels
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Regesta)-[varPEdge2:APPEARS_IN]-(varEgNode2:IndexEntry:IndexPlace)-[varPEdge2_1:IS_SUB_OF]-(varPNode4_2:IndexEntry:IndexPerson)\n"
					+ "RETURN varENode3,\n"
					+ "   varEgNode2");
			i++;

			//getComplexEdgeWithLabelsDiffrentDirections
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Regesta)<-[varPEdge2:APPEARS_IN]-(varEgNode2:IndexEntry:IndexPlace)<-[varPEdge2_1:IS_SUB_OF]-(varPNode4_2:IndexEntry:IndexPerson)\n"
					+ "RETURN varENode3,\n"
					+ "   varEgNode2");
			i++;
	
			//getComplexEdgeWithLabelsDiffrentDirectionsAndAllReturns
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Regesta)<-[varPEdge2:APPEARS_IN]-(varEgNode2:IndexEntry:IndexPlace)<-[varPEdge2_1:IS_SUB_OF]-(varPNode4_2:IndexEntry:IndexPerson)\n"
					+ "RETURN varENode3, \n"
					+ "   varPNode4_2.path, \n"
					+ "   varPEdge2, varPEdge2_1,\n"
					+ "   varEgNode2");
			i++;
			
			//getComplexEdgeWithLabelsDiffrentDirectionsAndAllReturns
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode7)\n"
					+ "MATCH (varENode8)\n"
					+ "MATCH (varENode9)-[varPEdge6]-(varPNode10_6:Regesta)\n"
					+ "MATCH (varENode11)-[varPEdge8]-(varPNode10_8:Regesta)\n"
					+ "WHERE (varENode7.placeOfIssue = varENode8.placeOfIssue AND varENode7.placeOfIssue = varPNode10_6.placeOfIssue AND varENode7.placeOfIssue = varPNode10_8.placeOfIssue)\n"
					+ "   AND NOT ((varENode7.placeOfIssue = varENode8.placeOfIssue))\n"
					+ "RETURN varENode7");
			i++;
		
			//getMultiEdgesToNeoPropertyNode
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode6)\n"
					+ "MATCH (varENode7)\n"
					+ "MATCH (varENode8)-[varPEdge5]-(varPNode9_5:Regesta)\n"
					+ "MATCH (varENode10)-[varPEdge6]-(varPNode9_6:Regesta)\n"
					+ "WHERE (varENode6.placeOfIssue = varENode7.placeOfIssue AND varENode6.placeOfIssue = varPNode9_5.placeOfIssue AND varENode6.placeOfIssue = varPNode9_6.placeOfIssue)\n"
					+ "RETURN varENode6");
			i++;	
		
			//getMultiEdgesToTwoNeoPropertyNode
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode7)\n"
					+ "MATCH (varENode8)-[varPEdge8]-(varPNode9_8:Regesta)\n"
					+ "MATCH (varENode10)-[varPEdge9]-(varPNode11_9:Regesta)\n"
					+ "MATCH (varENode12)\n"
					+ "WHERE (varENode7.placeOfIssue = varENode8.placeOfIssue AND varENode7.placeOfIssue = varPNode11_9.placeOfIssue AND varENode7.placeOfIssue = varENode12.placeOfIssue\n"
					+ "   AND varENode7.TestValue1 = varENode7.TestValue2 AND varENode7.TestValue1 = varPNode9_8.TestValue3)\n"
					+ "RETURN varENode7");
			i++;			
		
			//getMultiEdgesToTwoNeoPropertyNode
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode8)\n"
					+ "MATCH (varENode9)-[varPEdge14]-(varPNode10_14:Regesta)\n"
					+ "MATCH (varENode11)-[varPEdge6]-(varPNode12_6:Regesta)\n"
					+ "MATCH (varENode13)\n"
					+ "WHERE (varENode8.placeOfIssue = varENode9.placeOfIssue AND varENode8.placeOfIssue = varPNode12_6.placeOfIssue AND varENode8.placeOfIssue = varENode13.placeOfIssue\n"
					+ "   AND varENode8.TestValue1 = varENode8.TestValue2 AND varENode8.TestValue1 = varPNode10_14.TestValue3)\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varENode14)\n"
					+ "      WHERE (varENode8.placeOfIssue = varENode14.TestValue4)}\n"
					+ "RETURN varENode8");
			i++;			
	
			//getMultiEdgesToTwoNeoPropertyNode
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode7)\n"
					+ "MATCH (varENode8)-[varPEdge14]-(varPNode9_14:Regesta)\n"
					+ "MATCH (varENode10)-[varPEdge6]-(varPNode11_6:Regesta)\n"
					+ "MATCH (varENode12)\n"
					+ "WHERE (varENode7.placeOfIssue = varENode8.placeOfIssue AND varENode7.placeOfIssue = varPNode11_6.placeOfIssue AND varENode7.placeOfIssue = varENode12.placeOfIssue\n"
					+ "   AND varENode7.TestValue1 = varENode7.TestValue2 AND varENode7.TestValue1 = varPNode9_14.TestValue3)\n"
					+ "   AND (varENode7.placeOfIssue = varENode7.TestValue4)\n"
					+ "RETURN varENode7");
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
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode4:Regesta)-[varEEdge3:APPEARS_IN]-(varEgNode3:IndexEntry:IndexPlace)-[varEEdge3_1:APPEARS_IN]-(varENode5:Regesta)-[varPEdge4:APPEARS_IN]-(varEgNode4:IndexEntry:IndexPerson)-[varPEdge4_1:APPEARS_IN]-(varPNode6_4:Regesta)\n"
					+ "RETURN varENode4, varENode5, \n"
					+ "   varPNode6_4.summary, \n"
					+ "   varEEdge3, varEEdge3_1, varPEdge4, varPEdge4_1,\n"
					+ "   varEgNode3, varEgNode4");
			i++;
		
			//getAllPossibleReturnTypesWithTwoRelationsToNeoPropertyNode
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode4:Regesta)-[varEEdge4:APPEARS_IN]-(varEgNode4:IndexEntry:IndexPlace)-[varEEdge4_1:APPEARS_IN]-(varENode5:Regesta)-[varPEdge5:APPEARS_IN]-(varEgNode5:IndexEntry:IndexPerson)-[varPEdge5_1:APPEARS_IN]-(varPNode6_5:Regesta)\n"
					+ "WHERE (varPNode6_5.summary = varENode5.title)\n"
					+ "RETURN varENode4, varENode5, \n"
					+ "   varPNode6_5.summary, varENode5.title, \n"
					+ "   varEEdge4, varEEdge4_1, varPEdge5, varPEdge5_1,\n"
					+ "   varEgNode4, varEgNode5");
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
			new CypherTest03NotCondition().buildTooComplexQueryPatterns(completePatterns);
			int i = 0;

			//getTestPattern1
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode4:Literature)\n"
					+ "WHERE NOT (NOT (EXISTS {\n"
					+ "   MATCH (varENode4)<-[varEEdge2]-(varENode5:Regesta)\n"
					+ "   WHERE NOT (EXISTS {\n"
					+ "      MATCH (varENode5)-[varEEdge4]->(varENode6:Reference)})}))\n"
					+ "RETURN varENode4");
			i++;
			
			//getTestPattern1WithConditions
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode8:Literature)\n"
					+ "WHERE (varENode8.title = \"BATTENBERG\"\n"
					+ "   AND varENode8.url = \"http://opac.regesta-imperii.de/lang_de/kurztitelsuche_r.php?kurztitel=battenberg,_solmser_urkunden_1\")\n"
					+ "   AND NOT (NOT (EXISTS {\n"
					+ "      MATCH (varENode8)<-[varEEdge6]-(varENode9:Regesta)\n"
					+ "      WHERE (varENode9.isoStartDate = date('1439-12-20'))\n"
					+ "         AND NOT (EXISTS {\n"
					+ "            MATCH (varENode9)-[varEEdge11]->(varENode10:Reference)\n"
					+ "            WHERE (varENode10.title = \"Kulpis Documenta S. 181f.\")})}))\n"
					+ "RETURN varENode8");
			i++;
	
			//getTestPattern2
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode5:Regesta)\n"
					+ "WHERE NOT (EXISTS {\n"
					+ "   MATCH (varENode5), (varENode5)-[varEEdge4:APPEARS_IN]-(varENode6:IndexPerson), (varENode5)-[varEEdge5:ACTION]-(varENode7:Action), (varENode5)-[varEEdge6:RECIPIENT_IN]-(varENode8:IndexPlace)})\n"
					+ "RETURN varENode5");
			i++;

			//getTestPattern5
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode4:Regesta)\n"
					+ "WHERE EXISTS {\n"
					+ "   MATCH (varENode4), (varENode4)<-[varEEdge4:APPEARS_IN]-(varENode5:IndexPerson)-[varEEdge5:IS_SUB_OF]-(varENode6:IndexPlace), (varENode4)-[varEEdge6:RECIPIENT_IN]-(varENode6)}\n"
					+ "RETURN varENode4");
			i++;
			
			//getNotExistsExists
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode5:Regesta)\n"
					+ "WHERE NOT (EXISTS {\n"
					+ "   MATCH (varENode5)-[varEEdge4:APPEARS_IN]-(varENode6:IndexPerson)\n"
					+ "   WHERE EXISTS {\n"
					+ "      MATCH (varENode6)-[varEEdge6]-(varENode7:Regesta)}})\n"
					+ "RETURN varENode5");
			i++;
			
			//getNotNotPattern
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode4)\n"
					+ "WHERE EXISTS {\n"
					+ "   MATCH (varENode4)-[varEEdge4]-(varENode5)}\n"
					+ "RETURN varENode4");
			i++;
		
			//getNotNotPattern
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode4)\n"
					+ "WHERE NOT (EXISTS {\n"
					+ "   MATCH (varENode4)-[varEEdge4]-(varENode5)})\n"
					+ "RETURN varENode4");
			i++;
			
			//getNotNotNotNotPattern
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode4)\n"
					+ "WHERE EXISTS {\n"
					+ "   MATCH (varENode4)-[varEEdge4]-(varENode5)}\n"
					+ "RETURN varENode4");
			i++;
		
			//getNotNotNotNotNotPattern
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode4)\n"
					+ "WHERE NOT (EXISTS {\n"
					+ "   MATCH (varENode4)-[varEEdge4]-(varENode5)})\n"
					+ "RETURN varENode4");
			i++;			
			
			//NotTrueElement
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3)\n"
					+ "WHERE false\n"
					+ "RETURN varENode3");
			i++;
			
			//NotNotTrueElement
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3)\n"
					+ "RETURN varENode3");
			i++;
			
			//getMultiEdgesToTwoWithNotConditionNeoPropertyNode
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode8)\n"
					+ "MATCH (varENode9)-[varPEdge14]-(varPNode10_14:Regesta)\n"
					+ "MATCH (varENode11)-[varPEdge6]-(varPNode12_6:Regesta)\n"
					+ "MATCH (varENode13)\n"
					+ "WHERE (varENode8.placeOfIssue = varENode9.placeOfIssue AND varENode8.placeOfIssue = varPNode12_6.placeOfIssue AND varENode8.placeOfIssue = varENode13.placeOfIssue\n"
					+ "   AND varENode8.TestValue1 = varENode8.TestValue2 AND varENode8.TestValue1 = varPNode10_14.TestValue3)\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varENode14)\n"
					+ "      WHERE (varENode8.placeOfIssue = varENode14.TestValue4)}\n"
					+ "RETURN varENode8");
			i++;
	
			//getMultiEdgesToTwoWithNotConditionWithoutNewComplexNodeNeoPropertyNode
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode7)\n"
					+ "MATCH (varENode8)-[varPEdge14]-(varPNode9_14:Regesta)\n"
					+ "MATCH (varENode10)-[varPEdge6]-(varPNode11_6:Regesta)\n"
					+ "MATCH (varENode12)\n"
					+ "WHERE (varENode7.placeOfIssue = varENode8.placeOfIssue AND varENode7.placeOfIssue = varPNode11_6.placeOfIssue AND varENode7.placeOfIssue = varENode12.placeOfIssue\n"
					+ "   AND varENode7.TestValue1 = varENode7.TestValue2 AND varENode7.TestValue1 = varPNode9_14.TestValue3)\n"
					+ "   AND (varENode7.placeOfIssue = varENode7.TestValue4)\n"
					+ "RETURN varENode7");
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
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode5:Regesta)\n"
					+ "WHERE EXISTS {\n"
					+ "      MATCH (varENode5)-[varEEdge5:PLACE_OF_ISSUE]-(varENode6:Place)}\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varENode5)-[varEEdge6:APPEARS_IN]-(varENode7:IndexEntry:IndexPlace)}\n"
					+ "RETURN varENode5");
			i++;
			
			//OR
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode5:Regesta)\n"
					+ "WHERE EXISTS {\n"
					+ "      MATCH (varENode5)-[varEEdge5:PLACE_OF_ISSUE]-(varENode6:Place)}\n"
					+ "   OR EXISTS {\n"
					+ "      MATCH (varENode5)-[varEEdge6:APPEARS_IN]-(varENode7:IndexEntry:IndexPlace)}\n"
					+ "RETURN varENode5");
			i++;

			//IMPLIES
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode5:Regesta)\n"
					+ "WHERE NOT (EXISTS {\n"
					+ "      MATCH (varENode5)-[varEEdge5:PLACE_OF_ISSUE]-(varENode6:Place)})\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varENode5)-[varEEdge6:APPEARS_IN]-(varENode7:IndexEntry:IndexPlace)}\n"
					+ "RETURN varENode5");
			i++;
		
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode5:Regesta)\n"
					+ "WHERE (EXISTS {\n"
					+ "      MATCH (varENode5)-[varEEdge5:PLACE_OF_ISSUE]-(varENode6:Place)}\n"
					+ "   AND NOT (EXISTS {\n"
					+ "      MATCH (varENode5)-[varEEdge6:APPEARS_IN]-(varENode7:IndexEntry:IndexPlace)}))\n"
					+ "   OR (NOT (EXISTS {\n"
					+ "      MATCH (varENode5)-[varEEdge5:PLACE_OF_ISSUE]-(varENode6:Place)})\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varENode5)-[varEEdge6:APPEARS_IN]-(varENode7:IndexEntry:IndexPlace)})\n"
					+ "RETURN varENode5");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode5:Regesta)\n"
					+ "WHERE (EXISTS {\n"
					+ "      MATCH (varENode5)-[varEEdge5:PLACE_OF_ISSUE]-(varENode6:Place)}\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varENode5)-[varEEdge6:APPEARS_IN]-(varENode7:IndexEntry:IndexPlace)})\n"
					+ "   OR NOT (EXISTS {\n"
					+ "      MATCH (varENode5)-[varEEdge5:PLACE_OF_ISSUE]-(varENode6:Place)}\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varENode5)-[varEEdge6:APPEARS_IN]-(varENode7:IndexEntry:IndexPlace)})\n"
					+ "RETURN varENode5");
			i++;
		
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode5:Regesta)\n"
					+ "WHERE (EXISTS {\n"
					+ "      MATCH (varENode5)-[varEEdge5:PLACE_OF_ISSUE]-(varENode6:Place)}\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varENode5)-[varEEdge6:APPEARS_IN]-(varENode7:IndexEntry:IndexPlace)})\n"
					+ "RETURN varENode5");
			i++;
		
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode5:Regesta)\n"
					+ "WHERE (EXISTS {\n"
					+ "      MATCH (varENode5)-[varEEdge5:PLACE_OF_ISSUE]-(varENode6:Place)}\n"
					+ "   OR EXISTS {\n"
					+ "      MATCH (varENode5)-[varEEdge6:APPEARS_IN]-(varENode7:IndexEntry:IndexPlace)})\n"
					+ "RETURN varENode5");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode5:Regesta)\n"
					+ "WHERE (NOT (EXISTS {\n"
					+ "      MATCH (varENode5)-[varEEdge5:PLACE_OF_ISSUE]-(varENode6:Place)})\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varENode5)-[varEEdge6:APPEARS_IN]-(varENode7:IndexEntry:IndexPlace)})\n"
					+ "RETURN varENode5");
			i++;
			
			//
		
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode5:Regesta)\n"
					+ "WHERE ((EXISTS {\n"
					+ "      MATCH (varENode5)-[varEEdge5:PLACE_OF_ISSUE]-(varENode6:Place)}\n"
					+ "   AND NOT (EXISTS {\n"
					+ "      MATCH (varENode5)-[varEEdge6:APPEARS_IN]-(varENode7:IndexEntry:IndexPlace)}))\n"
					+ "   OR (NOT (EXISTS {\n"
					+ "      MATCH (varENode5)-[varEEdge5:PLACE_OF_ISSUE]-(varENode6:Place)})\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varENode5)-[varEEdge6:APPEARS_IN]-(varENode7:IndexEntry:IndexPlace)}))\n"
					+ "RETURN varENode5");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode5:Regesta)\n"
					+ "WHERE ((EXISTS {\n"
					+ "      MATCH (varENode5)-[varEEdge5:PLACE_OF_ISSUE]-(varENode6:Place)}\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varENode5)-[varEEdge6:APPEARS_IN]-(varENode7:IndexEntry:IndexPlace)})\n"
					+ "   OR NOT (EXISTS {\n"
					+ "      MATCH (varENode5)-[varEEdge5:PLACE_OF_ISSUE]-(varENode6:Place)}\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varENode5)-[varEEdge6:APPEARS_IN]-(varENode7:IndexEntry:IndexPlace)}))\n"
					+ "RETURN varENode5");
			i++;
		
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode5:IndexPlace)\n"
					+ "WHERE (EXISTS {\n"
					+ "      MATCH (varENode5)-[varEEdge5:IS_SUB_OF]-(varENode6:IndexPlace)}\n"
					+ "   OR EXISTS {\n"
					+ "      MATCH (varENode5)-[varEEdge6:placeOfIssue]-(varENode7:Regesta)})\n"
					+ "RETURN varENode5");
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
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3)\n"
					+ "WHERE (varENode3.title = \"Friedrich III.\")\n"
					+ "RETURN varENode3");
			i++;
			
			//TextListParam
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3)\n"
					+ "WHERE (varENode3.origPlaceOfIssue = [\"Graz\", \"Korneuburg\", \"1461 August 25\", \"1462\", \"-17\", \"-17.0\", \"-17.0+\"])\n"
					+ "RETURN varENode3");
			i++;
			
			//NumberParam
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3)\n"
					+ "WHERE (varENode3.age = 1452.0)\n"
					+ "RETURN varENode3");
			i++;
	
			//BooleanParam
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3)\n"
					+ "WHERE (varENode3.isVater = true)\n"
					+ "RETURN varENode3");
			i++;
			
			//DateParam
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3)\n"
					+ "WHERE (varENode3.isoStartDate = date('1461-08-25'))\n"
					+ "RETURN varENode3");
			i++;
			
			//TimeParam
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3)\n"
					+ "WHERE (varENode3.isoStartDate = time('09:00:00'))\n"
					+ "RETURN varENode3");
			i++;
			
			//DateTimeParam
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3)\n"
					+ "WHERE (varENode3.isoStartDate = datetime('1462-12-07T09:00:00'))\n"
					+ "RETURN varENode3");
			i++;
			
			//MultiListParam
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3)\n"
					+ "WHERE (varENode3.origPlaceOfIssue = [\"unknown\", \"USA\", 17, 17.0, -17, -17.0, \"-17.0+\", date('1439-12-20'), datetime('2020-10-03T09:00:00'), time('09:00:00')])\n"
					+ "RETURN varENode3");
			i++;
			
			//MultiListParam + IN
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3)\n"
					+ "WHERE (varENode3.origPlaceOfIssue IN [\"unknown\", \"USA\", 17, 17.0, -17, -17.0, \"-17.0+\", date('1439-12-20'), datetime('2020-10-03T09:00:00'), time('09:00:00')])\n"
					+ "RETURN varENode3");
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
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode5)\n"
					+ "MATCH (varENode6)\n"
					+ "WHERE (varENode5 = varENode6\n"
					+ "   AND varENode6 = varENode5)\n"
					+ "RETURN varENode5");
			i++;
		
			//Unequal
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode5)\n"
					+ "MATCH (varENode6)\n"
					+ "WHERE (varENode5 <> varENode6\n"
					+ "   AND varENode6 <> varENode5)\n"
					+ "RETURN varENode5");
			i++;
			
			//getComparisonTwoNeoPropertiesWithNeoPartsAndPropertyName (NOTEQUAL)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode5)-[varPEdge3:PLACE_OF_ISSUE]-(varPNode6_3:Place)\n"
					+ "MATCH (varENode7)-[varPEdge4:PLACE_OF_ISSUE]-(varPNode8_4:Place)\n"
					+ "WHERE (varENode5 <> varENode7\n"
					+ "   AND varPNode6_3.normalizedGerman <> varPNode8_4.normalizedGerman\n"
					+ "   AND varPNode8_4.normalizedGerman <> varPNode6_3.normalizedGerman)\n"
					+ "RETURN varENode5");
			i++;
			System.out.println(completePatterns.get(i).generateCypher());
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode5)-[varPEdge3:PLACE_OF_ISSUE]-(varPNode6_3:Place)\n"
					+ "MATCH (varENode7)-[varPEdge4:PLACE_OF_ISSUE]-(varPNode8_4:Place)\n"
					+ "WHERE (varENode5 = varENode7\n"
					+ "   AND varPNode6_3.normalizedGerman = varPNode8_4.normalizedGerman\n"
					+ "   AND varPNode8_4.normalizedGerman = varPNode6_3.normalizedGerman)\n"
					+ "RETURN varENode5");
			i++;
			
			
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode5)-[varPEdge3:PLACE_OF_ISSUE]-(varPNode6_3:Place)\n"
					+ "MATCH (varENode7)-[varPEdge4:PLACE_OF_ISSUE]-(varPNode8_4:Place)\n"
					+ "WHERE (varENode5 <> varENode7\n"
					+ "   AND varENode7 <> varENode5\n"
					+ "   AND varENode5 = varENode7\n"
					+ "   AND varENode7 = varENode5\n"
					+ "   AND varENode5 = varENode7\n"
					+ "   AND varPNode6_3.normalizedGerman <> varPNode8_4.normalizedGerman\n"
					+ "   AND varPNode8_4.normalizedGerman <> varPNode6_3.normalizedGerman\n"
					+ "   AND varENode5 = varENode7\n"
					+ "   AND varPNode6_3.normalizedGerman = varPNode8_4.normalizedGerman\n"
					+ "   AND varPNode8_4.normalizedGerman = varPNode6_3.normalizedGerman)\n"
					+ "RETURN varENode5");
			i++;
			
			//getCompareByElementId (NOTEQUAL)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode5)-[varPEdge3:PLACE_OF_ISSUE]-(varPNode6_3:Place)\n"
					+ "MATCH (varENode7)-[varPEdge4:PLACE_OF_ISSUE]-(varPNode8_4:Place)\n"
					+ "WHERE (ID(varENode5) <> ID(varENode7)\n"
					+ "   AND varENode7 <> varENode5)\n"
					+ "RETURN varENode5");
			i++;
			
			//getCompareByElementId (EQUAL)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode5)-[varPEdge3:PLACE_OF_ISSUE]-(varPNode6_3:Place)\n"
					+ "MATCH (varENode7)-[varPEdge4:PLACE_OF_ISSUE]-(varPNode8_4:Place)\n"
					+ "WHERE (ID(varENode5) = ID(varENode7)\n"
					+ "   AND varENode7 = varENode5)\n"
					+ "RETURN varENode5");
			i++;
			
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3)\n"
					+ "WHERE (varENode3.origPlaceOfIssue IN [\"unknown\", \"USA\", 17, 17.0, -17, -17.0, \"-17.0+\", date('1439-12-20'), datetime('2020-10-03T09:00:00'), time('09:00:00')])\n"
					+ "RETURN varENode3");
			i++;
			System.out.println(completePatterns.get(i).generateCypher());
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3)\n"
					+ "WHERE (NOT (varENode3.origPlaceOfIssue IN [\"unknown\", \"USA\", 17, 17.0, -17, -17.0, \"-17.0+\", date('1439-12-20'), datetime('2020-10-03T09:00:00'), time('09:00:00')]))\n"
					+ "RETURN varENode3");
			i++;
			
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode5)-[varPEdge3:PLACE_OF_ISSUE]-(varPNode6_3:Place)\n"
					+ "MATCH (varENode7)-[varPEdge4:PLACE_OF_ISSUE]-(varPNode8_4:Place)\n"
					+ "WHERE (varENode5 <> varENode7\n"
					+ "   AND varPNode6_3.normalizedGerman > varPNode8_4.normalizedGerman\n"
					+ "   AND varPNode8_4.normalizedGerman > varPNode6_3.normalizedGerman)\n"
					+ "RETURN varENode5");
			i++;
		
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode5)-[varPEdge3:PLACE_OF_ISSUE]-(varPNode6_3:Place)\n"
					+ "MATCH (varENode7)-[varPEdge4:PLACE_OF_ISSUE]-(varPNode8_4:Place)\n"
					+ "WHERE (varENode5 <> varENode7\n"
					+ "   AND varPNode6_3.normalizedGerman >= varPNode8_4.normalizedGerman\n"
					+ "   AND varPNode8_4.normalizedGerman >= varPNode6_3.normalizedGerman)\n"
					+ "RETURN varENode5");
			i++;

			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode5)-[varPEdge3:PLACE_OF_ISSUE]-(varPNode6_3:Place)\n"
					+ "MATCH (varENode7)-[varPEdge4:PLACE_OF_ISSUE]-(varPNode8_4:Place)\n"
					+ "WHERE (varENode5 <> varENode7\n"
					+ "   AND varPNode6_3.normalizedGerman < varPNode8_4.normalizedGerman\n"
					+ "   AND varPNode8_4.normalizedGerman < varPNode6_3.normalizedGerman)\n"
					+ "RETURN varENode5");
			i++;

			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode5)-[varPEdge3:PLACE_OF_ISSUE]-(varPNode6_3:Place)\n"
					+ "MATCH (varENode7)-[varPEdge4:PLACE_OF_ISSUE]-(varPNode8_4:Place)\n"
					+ "WHERE (varENode5 <> varENode7\n"
					+ "   AND varPNode6_3.normalizedGerman <= varPNode8_4.normalizedGerman\n"
					+ "   AND varPNode8_4.normalizedGerman <= varPNode6_3.normalizedGerman)\n"
					+ "RETURN varENode5");
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
			new CypherTest07QuantifiedCondition().buildTooComplexQueryPatterns(completePatterns);
			int i = 0;
			
			//getNodesWhereExits (false)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode4:Regesta)\n"
					+ "WHERE EXISTS (varENode4.origPlaceOfIssue)\n"
					+ "RETURN varENode4");
			i++;
		
			//getNodesWhereExits (true)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode4:Regesta)\n"
					+ "WHERE NOT (EXISTS (varENode4.origPlaceOfIssue))\n"
					+ "RETURN varENode4");
			i++;

			//getNodesWhereMultiplePropertyExistsChecks (false)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode6:Regesta)\n"
					+ "WHERE EXISTS (varENode6.origPlaceOfIssue, varENode6.startDate, varENode6.endDate)\n"
					+ "RETURN varENode6");
			i++;
			
			//getNodesWhereMultiplePropertyExistsChecks (true)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode6:Regesta)\n"
					+ "WHERE NOT (EXISTS (varENode6.origPlaceOfIssue)\n"
					+ "   AND EXISTS (varENode6.startDate)\n"
					+ "   AND EXISTS (varENode6.endDate))\n"
					+ "RETURN varENode6");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode5)\n"
					+ "WHERE NOT (EXISTS {\n"
					+ "   MATCH (varENode6), (varENode7)\n"
					+ "   WHERE (varENode5.date = varENode6.startDate AND varENode5.date = varENode7.isoStartDate)})\n"
					+ "RETURN varENode5");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode6)\n"
					+ "WHERE NOT (EXISTS {\n"
					+ "   MATCH (varENode6)-[varEEdge6]-(varENode7)\n"
					+ "   WHERE EXISTS (varENode7.endDate)\n"
					+ "      AND (varENode7.startDate CONTAINS (\"1613\"))})\n"
					+ "RETURN varENode6");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode6)\n"
					+ "WHERE EXISTS {\n"
					+ "   MATCH (varENode6)-[varEEdge6]-(varENode7)\n"
					+ "   WHERE (varENode7.startDate CONTAINS (\"1613\"))}\n"
					+ "RETURN varENode6");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode6)\n"
					+ "WHERE EXISTS {\n"
					+ "   MATCH (varENode6)-[varEEdge6]-(varENode7), (varENode7)-[varPEdge7]-(varPNode8_7:DateNode), (varENode7)-[varPEdge8]-(varPNode9_8:DateNode)\n"
					+ "   WHERE (varPNode8_7.startDate CONTAINS (\"1613\")\n"
					+ "      AND varPNode9_8.endDate CONTAINS (\"1614\"))}\n"
					+ "RETURN varENode6");
			i++; 
	
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode5)\n"
					+ "WHERE EXISTS {\n"
					+ "   MATCH (varENode6), (varENode7)\n"
					+ "   WHERE (varENode5.date = varENode6.startDate AND varENode5.date = varENode7.isoStartDate)}\n"
					+ "RETURN varENode5");
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
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode4)-[varEEdge4]-(varENode5)-[varEEdge5]-(varENode4)\n"
					+ "RETURN varENode4");
			i++;
			
			//getCyclePattern(3)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode5)-[varEEdge5]-(varENode6)-[varEEdge6]-(varENode7)-[varEEdge7]-(varENode5)\n"
					+ "RETURN varENode5");
			i++;

			//getCyclePatternComp(2)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode5)-[varEEdge4]-(varENode6)-[varEEdge5]-(varENode7)\n"
					+ "WHERE (varENode5 = varENode7)\n"
					+ "RETURN varENode5");
			i++;
			
			//getCyclePatternComp(3)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode6)-[varEEdge5]-(varENode7)-[varEEdge6]-(varENode8)-[varEEdge7]-(varENode9)\n"
					+ "WHERE (varENode6 = varENode9)\n"
					+ "RETURN varENode6");
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
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3)\n"
					+ "WHERE (varENode3.archivalHistory CONTAINS (\"http://opac.regesta-imperii.de/lang_de/kurztitelsuche_r.php?kurztitel=gudenus,_cod._dipl.\"))\n"
					+ "RETURN varENode3");
			i++;
			
			//getPatternContains (false)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3)\n"
					+ "WHERE (NOT (varENode3.archivalHistory CONTAINS (\"http://opac.regesta-imperii.de/lang_de/kurztitelsuche_r.php?kurztitel=gudenus,_cod._dipl.\")))\n"
					+ "RETURN varENode3");
			i++;
	
			//getMultipleContains (true)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode7)\n"
					+ "WHERE (varENode7.summary CONTAINS (\"Churfürsten (Dietrich von Mainz, Dietrich\")\n"
					+ "   AND varENode7.identifier CONTAINS (\"hmel n. \")\n"
					+ "   AND varENode7.exchangeIdentifier CONTAINS (\"20_000001_000001_013_0\")\n"
					+ "   AND varENode7.bandpk CONTAINS (\"13000000\")\n"
					+ "   AND varENode7.title CONTAINS (\"Friedrich\"))\n"
					+ "RETURN varENode7");
			i++;
			
			//getMultipleContains (false)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode7)\n"
					+ "WHERE (NOT (varENode7.summary CONTAINS (\"Churfürsten (Dietrich von Mainz, Dietrich\"))\n"
					+ "   AND NOT (varENode7.identifier CONTAINS (\"hmel n. \"))\n"
					+ "   AND NOT (varENode7.exchangeIdentifier CONTAINS (\"20_000001_000001_013_0\"))\n"
					+ "   AND NOT (varENode7.bandpk CONTAINS (\"13000000\"))\n"
					+ "   AND NOT (varENode7.title CONTAINS (\"Friedrich\")))\n"
					+ "RETURN varENode7");
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
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Regesta)\n"
					+ "WHERE (varENode3.summary =~ \"Churfürsten\")\n"
					+ "RETURN varENode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Regesta)\n"
					+ "WHERE (NOT (varENode3.summary =~ \"Churfürsten\"))\n"
					+ "RETURN varENode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Regesta)\n"
					+ "WHERE (varENode3.summary =~ \".*Churfürsten.*\")\n"
					+ "RETURN varENode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Regesta)\n"
					+ "WHERE (NOT (varENode3.summary =~ \".*Churfürsten.*\"))\n"
					+ "RETURN varENode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Regesta)\n"
					+ "WHERE (varENode3.summary =~ \".*(?i)Churfürsten.*\")\n"
					+ "RETURN varENode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Regesta)\n"
					+ "WHERE (NOT (varENode3.summary =~ \".*(?i)Churfürsten.*\"))\n"
					+ "RETURN varENode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Regesta)\n"
					+ "WHERE (varENode3.summary =~ \".*(?m)Churfürsten.*\")\n"
					+ "RETURN varENode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Regesta)\n"
					+ "WHERE (NOT (varENode3.summary =~ \".*(?m)Churfürsten.*\"))\n"
					+ "RETURN varENode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Regesta)\n"
					+ "WHERE (varENode3.summary =~ \".*(?s)Churfürsten.*\")\n"
					+ "RETURN varENode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Regesta)\n"
					+ "WHERE (NOT (varENode3.summary =~ \".*(?s)Churfürsten.*\"))\n"
					+ "RETURN varENode3");
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
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode2)\n"
					+ "WITH varENode2, COUNT(varENode2) AS myCounter1\n"
					+ "WHERE myCounter1 = 1.0\n"
					+ "RETURN varENode2");
			i++;
			
			//getCountInPattern
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3)\n"
					+ "MATCH (varENode3)-[varEEdge2]-(varENode4)\n"
					+ "WITH varENode3, COUNT(varENode4) AS myCounter1\n"
					+ "WHERE myCounter1 = 1.0\n"
					+ "RETURN varENode3");
			i++;
		
			//getCountInPatternWithRemoveAElement
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3)\n"
					+ "MATCH (varENode3)-[varEEdge2]-(varENode4)\n"
					+ "WITH varENode3, COUNT(varENode4) AS myCounter1\n"
					+ "WHERE myCounter1 = 1.0\n"
					+ "RETURN varENode3");
			i++;
	
			//getMultiCountsInPattern
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3)\n"
					+ "MATCH (varENode3)-[varEEdge2]-(varENode4)\n"
					+ "WITH varENode3, COUNT(varENode3) AS myCounter1, COUNT(varENode4) AS myCounter2\n"
					+ "WHERE myCounter1 = 1.0 AND myCounter2 = 1.0\n"
					+ "RETURN varENode3");
			i++;
			
			//getCountConditionWithWhereClause
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode4)\n"
					+ "WHERE (varENode4.placeOfIssue = \"Wien\")\n"
					+ "MATCH (varENode4)-[varEEdge4]-(varENode5)\n"
					+ "WHERE (varENode4 = varENode5)\n"
					+ "WITH varENode4, COUNT(varENode4) AS myCounter1\n"
					+ "WHERE myCounter1 = 1.0\n"
					+ "RETURN varENode4");
			i++;
			
			//getCountAPropertyNode
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode4)-[varPEdge2:PLACE_OF_ISSUE]-(varPNode5_2:IndexPlace)\n"
					+ "MATCH (varENode4)-[varEEdge4]-(varENode6)\n"
					+ "WITH varENode4, COUNT(varENode4) AS myCounter1, COUNT(varPNode5_2.test) AS myCounter2\n"
					+ "WHERE myCounter1 = 1.0 AND myCounter2 = 1.0\n"
					+ "RETURN varENode4");
			i++;
			
			//getCountAProperty
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode4)\n"
					+ "MATCH (varENode4)-[varEEdge3]-(varENode5)\n"
					+ "WITH varENode4, COUNT(varENode4) AS myCounter1, COUNT(varENode4.placeOfIssue) AS myCounter2\n"
					+ "WHERE myCounter1 = 1.0 AND myCounter2 = 1.0\n"
					+ "RETURN varENode4");
			i++;
			
			//getCountWithRelations
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode4:Regesta)-[varEEdge2]-(varENode5:IndexPlace)\n"
					+ "MATCH (varENode4)-[varEEdge4]-(varENode6:IndexPerson)\n"
					+ "WITH varENode5, varEEdge2, COUNT(varENode6) AS myCounter1, COUNT(varENode5) AS myCounter2\n"
					+ "WHERE myCounter1 = 1.0 AND myCounter2 = 1.0\n"
					+ "RETURN varENode5, \n"
					+ "   varEEdge2");
			i++;
			
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode5)\n"
					+ "MATCH (varENode5)-[varEEdge2]-(varENode6)\n"
					+ "WHERE NOT (EXISTS {\n"
					+ "         MATCH (varENode5)-[varEEdge5]-(varENode7)}\n"
					+ "      AND EXISTS (varENode5.normalizedGerman))\n"
					+ "WITH varENode5, COUNT(varENode6) AS myCounter1\n"
					+ "WHERE myCounter1 = 1.0\n"
					+ "RETURN varENode5");
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
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Regesta)\n"
					+ "WHERE (varENode3.summary IS NULL)\n"
					+ "RETURN varENode3");
			i++;

			//getNullCheckNullPrimitiveNodeException
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varENode3:Regesta)\n"
					+ "WHERE (varENode3.summary IS NOT NULL)\n"
					+ "RETURN varENode3");
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
}