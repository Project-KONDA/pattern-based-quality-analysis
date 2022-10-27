package qualitypatternmodel.cyphertranslationtests;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExecutionCondition;

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

public abstract class CypherAbstractTestSuiteTranslation implements ExecutionCondition {

	private static final String EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION = "NOT ALL INVALIDTIY EXCPECTED EXCEPTIONS HAVE BEEN THROWN";
	private static final String EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION = "NOT ALL UNSUPPORTED MESSAGE EXCPECTED EXCEPTIONS HAVE BEEN THROWN";
	private ArrayList<CompletePattern> completePatterns;
	protected static final String THE_MATCH_CLAUSE_CONTAINS_NULL = "The MATCH-CLAUSE contains null";
	protected static final String NEWLINE = "\n";
	protected static final String NULL = "null";
	protected static final String THE_RETURN_CLAUSE_CONTAINS_NULL = "The RETURN-CLAUSE contains null";
	protected static final String TEST_DISABLED_ON_QA_ENVIRONMENT = "Test disabled on QA environment";
	protected static final String TEST_ENABLED_ON_QA_ENVIRONMENT = "Test enabled on QA environment";

	protected static void exceptionHandler(CompletePattern completePattern) throws InvalidityException {
		completePattern.generateCypher();
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

	@Test
	public void CypherTest00() {		
		assertDoesNotThrow(() -> {new CypherTest00().buildPatterns(completePatterns); 
			tester(completePatterns);});
	}

	@Test
	public void CypherTest01NeoEdge() {		
		assertDoesNotThrow(() -> {new CypherTest01NeoEdge().buildPatterns(completePatterns); 
			tester(completePatterns);});
	}

	@Test
	public void CypherTest01NeoEdgeExceptions() {		
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
	public void CypherTest01NeoPropertyEdge() {		
		assertDoesNotThrow(() -> {new CypherTest01NeoPropertyEdge().buildPatterns(completePatterns); 
			tester(completePatterns);});
	}

	@Test
	public void CypherTest01NeoPropertyEdgeExceptions() {		
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
	public void CypherTest02Return() {		
		assertDoesNotThrow(() -> {new CypherTest02Return().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	@Test
	public void CypherTest02ReturnExceptions() {		
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
	public void CypherTest03NotCondition() {		
		assertDoesNotThrow(() -> {new CypherTest03NotCondition().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	public void CypherTest03NotConditionExceptions() {		
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
	public void CypherTest04Formula() {		
		assertDoesNotThrow(() -> {new CypherTest04Formula().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	public void CypherTest04FormulaExceptions() {		
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
	public void CypherTest05ParameterValues() {		
		assertDoesNotThrow(() -> {new CypherTest05ParameterValues().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	public void CypherTest05ParameterValuesExceptions() {		
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
	public void CypherTest06Comparison() {	
		assertDoesNotThrow(() -> {new CypherTest06Comparison().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	public void CypherTest06ComparisonExceptions() {		
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
	public void CypherTest07QuantifiedCondition() {	
		assertDoesNotThrow(() -> {new CypherTest07QuantifiedCondition().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	@Test
	public void CypherTest07QuantifiedConditionExceptions() {		
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
	public void CypherTest08Cycle() {
		assertDoesNotThrow(() -> {new CypherTest08Cycle().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	public void CypherTest08CycleExceptions() {		
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
	public void CypherTest09Contains() {	
		assertDoesNotThrow(() -> {new CypherTest09Contains().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	public void CypherTest09ContainsExceptions() {		
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
	public void CypherTest10Match() {	
		assertDoesNotThrow(() -> {new CypherTest10Match().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	@Test
	public void CypherTest10MatchExceptions() {		
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
	public void CypherTest11CountCondition() {	
		assertDoesNotThrow(() -> {new CypherTest11CountCondition().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	public void CypherTest11CountConditionExceptions() {		
			assertThrows(InvalidityException.class, () -> {//Add additional Exceptions
					CypherTest00.exceptionTestHandler(completePatterns);},
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
	public void CypherTest12CheckNull() {	
		assertDoesNotThrow(() -> {new CypherTest12CheckNull().buildPatterns(completePatterns); 
			tester(completePatterns);});
	}
	
	public void CypherTest12CheckNullExceptions() {		
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

	protected abstract void tester(ArrayList<CompletePattern> completePatterns) throws Exception;
}