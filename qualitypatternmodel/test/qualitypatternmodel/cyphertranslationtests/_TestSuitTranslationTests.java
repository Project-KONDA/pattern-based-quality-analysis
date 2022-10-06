package qualitypatternmodel.cyphertranslationtests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static qualitypatternmodel.xmltranslationtests.Test00.replace;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import playground.Java2Neo4JConnector;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.CypherSpecificConstants;

@TestInstance(Lifecycle.PER_CLASS)
public class _TestSuitTranslationTests {
	private static final String EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION = "NOT ALL EXCPECTED EXCEPTIONS HAVE BEEN THROWN";
	private ArrayList<CompletePattern> completePatterns;
	
	@BeforeAll
	public void beforeClassFunction(){
		completePatterns = new ArrayList<CompletePattern>();
    }
	
	@AfterEach
	public void afterEachFunction(){
		completePatterns.clear();
    }
	
	@AfterAll
	public void afterAllFunction(){
		completePatterns = null;
    }
	
	@Test
	public void CypherTest00() {		
		assertDoesNotThrow(() -> {CypherTest00.buildPatterns(completePatterns); 
			CypherTest00.exceptionHandler(completePatterns);});
	}
	
//	@Test
//	public void CypherTest00Exceptions() {		
//		assertThrows(InvalidityException.class, () -> {CypherTest01NeoEdge.buildPatterns(completePatterns); 
//		CypherTest00.exceptionHandler(completePatterns);},
//				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
////		assertThrows(OperatorCycleException.class, () -> {CypherTest01NeoEdge.buildPatterns(completePatterns); 
////		CypherTest00.exceptionHandler(completePatterns);},
////				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
////		assertThrows(MissingPatternContainerException.class, () -> {CypherTest01NeoEdge.buildPatterns(completePatterns); 
////		CypherTest00.exceptionHandler(completePatterns);},
////				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
//	}
	
	@Test
	public void CypherTest01NeoEdge() {		
		assertDoesNotThrow(() -> {CypherTest01NeoEdge.buildPatterns(completePatterns); 
			CypherTest00.exceptionHandler(completePatterns);});
	}
	
	
//	@Test
//	public void CypherTest01NeoEdgeExceptions() {		
//		assertThrows(InvalidityException.class, () -> {CypherTest01NeoEdge.buildPatterns(completePatterns); 
//				CypherTest00.exceptionHandler(completePatterns);},
//				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
////		assertThrows(OperatorCycleException.class, () -> {CypherTest01NeoEdge.buildPatterns(completePatterns); 
////		CypherTest00.exceptionHandler(completePatterns);},
////				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
////		assertThrows(MissingPatternContainerException.class, () -> {CypherTest01NeoEdge.buildPatterns(completePatterns); 
////		CypherTest00.exceptionHandler(completePatterns);},
////				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
//	}
	
	
	@Test
	public void CypherTest01NeoPropertyEdge() {		
		assertDoesNotThrow(() -> {CypherTest01NeoPropertyEdge.buildPatterns(completePatterns); 
			CypherTest00.exceptionHandler(completePatterns);});
	}
	
//	@Test
//	public void CypherTest01NeoEdgeExceptions() {		
//		assertThrows(InvalidityException.class, () -> {CypherTest01NeoPropertyEdge.buildPatterns(completePatterns); 
//				CypherTest00.exceptionHandler(completePatterns);},
//				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
////		assertThrows(OperatorCycleException.class, () -> {CypherTest01NeoPropertyEdge.buildPatterns(completePatterns); 
////		CypherTest00.exceptionHandler(completePatterns);},
////				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
////		assertThrows(MissingPatternContainerException.class, () -> {CypherTest01NeoPropertyEdge.buildPatterns(completePatterns); 
////		CypherTest00.exceptionHandler(completePatterns);},
////				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
//	}
	
	
	@Test
	public void CypherTest02Return() {		
		assertDoesNotThrow(() -> {CypherTest02Return.buildPatterns(completePatterns); 
			CypherTest00.exceptionHandler(completePatterns);});
	}
	
//	@Test
//	public void CypherTest01NeoEdgeExceptions() {		
//		assertThrows(InvalidityException.class, () -> {CypherTest02Return.buildPatterns(completePatterns); 
//				CypherTest00.exceptionHandler(completePatterns);},
//				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
////		assertThrows(OperatorCycleException.class, () -> {CypherTest02Return.buildPatterns(completePatterns); 
////		CypherTest00.exceptionHandler(completePatterns);},
////				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
////		assertThrows(MissingPatternContainerException.class, () -> {CypherTest02Return.buildPatterns(completePatterns); 
////		CypherTest00.exceptionHandler(completePatterns);},
////				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
//	}
	
	
	@Test
	public void CypherTest03NotCondition() {		
		assertDoesNotThrow(() -> {CypherTest03NotCondition.buildPatterns(completePatterns); 
			CypherTest00.exceptionHandler(completePatterns);});
	}
	
//	@Test
//	public void CypherTest03NotCondition() {		
//		assertThrows(InvalidityException.class, () -> {CypherTest03NotCondition.buildPatterns(completePatterns); 
//				CypherTest00.exceptionHandler(completePatterns);},
//				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
////		assertThrows(OperatorCycleException.class, () -> {CypherTest03NotCondition.buildPatterns(completePatterns); 
////		CypherTest00.exceptionHandler(completePatterns);},
////				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
////		assertThrows(MissingPatternContainerException.class, () -> {CypherTest03NotCondition.buildPatterns(completePatterns); 
////		CypherTest00.exceptionHandler(completePatterns);},
////				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
//	}
	
	
	@Test
	public void CypherTest04Formula() {		
		assertDoesNotThrow(() -> {CypherTest04Formula.buildPatterns(completePatterns); 
			CypherTest00.exceptionHandler(completePatterns);});
	}
	
//	@Test
//	public void CypherTest04Formula() {		
//		assertThrows(InvalidityException.class, () -> {CypherTest04Formula.buildPatterns(completePatterns); 
//				CypherTest00.exceptionHandler(completePatterns);},
//				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
////		assertThrows(OperatorCycleException.class, () -> {CypherTest04Formula.buildPatterns(completePatterns); 
////		CypherTest00.exceptionHandler(completePatterns);},
////				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
////		assertThrows(MissingPatternContainerException.class, () -> {CypherTest04Formula.buildPatterns(completePatterns); 
////		CypherTest00.exceptionHandler(completePatterns);},
////				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
//	}
	
	@Test
	public void CypherTest05ParameterValues() {	
		ArrayList<ParameterValue> values = CypherTest05ParameterValues.getTestParameters();	
		assertDoesNotThrow(() -> {CypherTest05ParameterValues.buildPatterns(completePatterns, values); 
			CypherTest00.exceptionHandler(completePatterns);});
	}
	
//	@Test
//	public void CypherTest05ParameterValues() {		
//		assertThrows(InvalidityException.class, () -> {CypherTest05ParameterValues.buildPatterns(completePatterns); 
//				CypherTest00.exceptionHandler(completePatterns);},
//				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
////		assertThrows(OperatorCycleException.class, () -> {CypherTest05ParameterValues.buildPatterns(completePatterns); 
////		CypherTest00.exceptionHandler(completePatterns);},
////				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
////		assertThrows(MissingPatternContainerException.class, () -> {CypherTest05ParameterValues.buildPatterns(completePatterns); 
////		CypherTest00.exceptionHandler(completePatterns);},
////				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
//	}
	
	
	@Test
	public void CypherTest06Comparison() {	
		assertDoesNotThrow(() -> {CypherTest06Comparison.buildPatterns(completePatterns); 
			CypherTest00.exceptionHandler(completePatterns);});
	}
	
//	@Test
//	public void CypherTest06Comparison() {		
//		assertThrows(InvalidityException.class, () -> {CypherTest06Comparison.buildPatterns(completePatterns); 
//				CypherTest00.exceptionHandler(completePatterns);},
//				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
////		assertThrows(OperatorCycleException.class, () -> {CypherTest06Comparison.buildPatterns(completePatterns); 
////		CypherTest00.exceptionHandler(completePatterns);},
////				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
////		assertThrows(MissingPatternContainerException.class, () -> {CypherTest06Comparison.buildPatterns(completePatterns); 
////		CypherTest00.exceptionHandler(completePatterns);},
////				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
//	}
	
	
	@Test
	public void CypherTest07QuantifiedCondition() {	
		assertDoesNotThrow(() -> {CypherTest07QuantifiedCondition.buildPatterns(completePatterns); 
			CypherTest00.exceptionHandler(completePatterns);});
	}
	
//	@Test
//	public void CypherTest07QuantifiedCondition() {		
//		assertThrows(InvalidityException.class, () -> {CypherTest07QuantifiedCondition.buildPatterns(completePatterns); 
//				CypherTest00.exceptionHandler(completePatterns);},
//				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
////		assertThrows(OperatorCycleException.class, () -> {CypherTest07QuantifiedCondition.buildPatterns(completePatterns); 
////		CypherTest00.exceptionHandler(completePatterns);},
////				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
////		assertThrows(MissingPatternContainerException.class, () -> {CypherTest07QuantifiedCondition.buildPatterns(completePatterns); 
////		CypherTest00.exceptionHandler(completePatterns);},
////				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
//	}	
	
	@Test
	public void CypherTest08Cycle() {	
		assertDoesNotThrow(() -> {CypherTest08Cycle.buildPatterns(completePatterns); 
			CypherTest00.exceptionHandler(completePatterns);});
	}
	
//	@Test
//	public void CypherTest09Contains() {		
//		assertThrows(InvalidityException.class, () -> {CypherTest09Contains.buildPatterns(completePatterns); 
//				CypherTest00.exceptionHandler(completePatterns);},
//				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
////		assertThrows(OperatorCycleException.class, () -> {CypherTest09Contains.buildPatterns(completePatterns); 
////		CypherTest00.exceptionHandler(completePatterns);},
////				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
////		assertThrows(MissingPatternContainerException.class, () -> {CypherTest09Contains.buildPatterns(completePatterns); 
////		CypherTest00.exceptionHandler(completePatterns);},
////				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
//	}
	
	
	@Test
	public void CypherTest09Contains() {	
		assertDoesNotThrow(() -> {CypherTest09Contains.buildPatterns(completePatterns); 
			CypherTest00.exceptionHandler(completePatterns);});
	}
	
//	@Test
//	public void CypherTest09Contains() {		
//		assertThrows(InvalidityException.class, () -> {CypherTest09Contains.buildPatterns(completePatterns); 
//				CypherTest00.exceptionHandler(completePatterns);},
//				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
////		assertThrows(OperatorCycleException.class, () -> {CypherTest09Contains.buildPatterns(completePatterns); 
////		CypherTest00.exceptionHandler(completePatterns);},
////				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
////		assertThrows(MissingPatternContainerException.class, () -> {CypherTest09Contains.buildPatterns(completePatterns); 
////		CypherTest00.exceptionHandler(completePatterns);},
////				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
//	}
	
	@Test
	public void CypherTest10Match() {	
		assertDoesNotThrow(() -> {CypherTest10Match.buildPatterns(completePatterns); 
		CypherTest00.exceptionHandler(completePatterns);});
	}
	
//	@Test
//	public void CypherTest09Contains() {		
//		assertThrows(InvalidityException.class, () -> {CypherTest10Match.buildPatterns(completePatterns); 
//				CypherTest00.exceptionHandler(completePatterns);},
//				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
////		assertThrows(OperatorCycleException.class, () -> {CypherTest10Match.buildPatterns(completePatterns); 
////		CypherTest00.exceptionHandler(completePatterns);},
////				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
////		assertThrows(MissingPatternContainerException.class, () -> {CypherTest10Match.buildPatterns(completePatterns); 
////		CypherTest00.exceptionHandler(completePatterns);},
////				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
//	}
	
	
	@Test
	public void CypherTest11CountCondition() {	
		assertDoesNotThrow(() -> {CypherTest11CountCondition.buildPatterns(completePatterns); 
		CypherTest00.exceptionHandler(completePatterns);});
	}
	
//	@Test
//	public void CypherTest11CountCondition() {		
//		assertThrows(InvalidityException.class, () -> {CypherTest11CountCondition.buildPatterns(completePatterns); 
//				CypherTest00.exceptionHandler(completePatterns);},
//				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
////		assertThrows(OperatorCycleException.class, () -> {CypherTest11CountCondition.buildPatterns(completePatterns); 
////		CypherTest00.exceptionHandler(completePatterns);},
////				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
////		assertThrows(MissingPatternContainerException.class, () -> {CypherTest11CountCondition.buildPatterns(completePatterns); 
////		CypherTest00.exceptionHandler(completePatterns);},
////				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
//	}
	
	
	@Test
	public void CypherTest12Match() {	
		assertDoesNotThrow(() -> {CypherTest12CheckNull.buildPatterns(completePatterns); 
			test(completePatterns);});
	}
	
//	@Test
//	public void CypherTest09Contains() {		
//		assertThrows(InvalidityException.class, () -> {CypherTest10Match.buildPatterns(completePatterns); 
//				CypherTest00.exceptionHandler(completePatterns);},
//				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
////		assertThrows(OperatorCycleException.class, () -> {CypherTest10Match.buildPatterns(completePatterns); 
////		CypherTest00.exceptionHandler(completePatterns);},
////				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
////		assertThrows(MissingPatternContainerException.class, () -> {CypherTest10Match.buildPatterns(completePatterns); 
////		CypherTest00.exceptionHandler(completePatterns);},
////				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
//	}

	
	public void test(ArrayList<CompletePattern> completePatterns) throws InvalidityException {
		Java2Neo4JConnector connector = new Java2Neo4JConnector();
		for (CompletePattern completePattern : completePatterns) {
			replace(completePattern);
			System.out.println("\n\n___PATTERN_(VALID)___");
			System.out.println(completePattern.myToString());
			System.out.print("\n___TRANSLATION___");
			String query = completePattern.generateCypher();
			
			//Include the null check for the results
			String hashCode = query.hashCode() + "";
			connector.queryTester(query, hashCode);
			String returnString = query.substring(query.indexOf(CypherSpecificConstants.CLAUSE_RETURN));
			if (returnString.toLowerCase().contains("null")) {
				throw new InvalidityException("The RETURN-CLAUSE contains null.");
			}
		}
	}
}
