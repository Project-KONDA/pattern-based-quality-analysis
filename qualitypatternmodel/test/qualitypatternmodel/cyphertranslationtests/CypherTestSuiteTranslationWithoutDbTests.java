package qualitypatternmodel.cyphertranslationtests;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;

import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest00;
import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest01NeoEdge;
import qualitypatternmodel.patternstructure.CompletePattern;

@DisplayName("Systemtest without Neo4J-DB")
@TestInstance(Lifecycle.PER_CLASS)
@ExtendWith(CypherTestSuiteTranslationWithoutDbTests.class)
public class CypherTestSuiteTranslationWithoutDbTests extends CypherAbstractTestSuiteTranslation {
	@Override
	protected void tester(ArrayList<CompletePattern> completePatterns) throws Exception {
		System.out.println(CypherAbstractTranslation.BEGIN_TESTS);
		testAllCompletePatterns(completePatterns, false);
	    System.out.println(CypherAbstractTranslation.END_TESTS);
	}
	
	@Override
	public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
		if (playground.Java2Neo4JConnector.verifyConnectivity()) {
            return ConditionEvaluationResult.disabled(TEST_DISABLED_ON_QA_ENVIRONMENT);
        } 
        return ConditionEvaluationResult.enabled(TEST_ENABLED_ON_QA_ENVIRONMENT);
	}
	
	//Further testing - Query Comparing
	@BeforeAll
	public void beforeClassFunction() {
		super.beforeClassFunction();
	}

	@AfterEach
	public void afterEachFunction() {
		super.afterEachFunction();
	}
	
	@Test
	public void cypherTest00QueryComp() {	
		try {
			new CypherTest00().buildPatterns(completePatterns);
			
			//getBasePatternCypher
			assertEquals(completePatterns.get(0).generateCypher(), "\nMATCH (varNode3)\n"
					+ "RETURN varNode3");
			
			//getBasePatternComplexFinal
			assertEquals(completePatterns.get(1).generateCypher(), "\nMATCH (varNode3)-[varEdge2]-(varNode4)\n"
					+ "RETURN varNode3");
			
			//getBasePatternCondDateConcrete
			assertEquals(completePatterns.get(2).generateCypher(), 
					"\nMATCH (varNode8:Place), (varNode8)-[varEdge7]-(varNode9:Regesta), (varNode9)-[varEdge8]-(varNode10:Place), (varNode9)-[varEdge9]-(varNode11:IndexPerson), (varNode9)-[varEdge10]-(varNode12), (varNode8)-[varEdge11]-(varNode13), (varNode8)-[varEdge12]-(varNode14)\n"
					+ "RETURN DISTINCT (varNode8)");

			//getBasePatternCondDateConcrete
			assertEquals(completePatterns.get(3).generateCypher(), "\nMATCH (varNode3:Regesta)\n"
					+ "WHERE (varNode3.isoStartDate = date('1440-02-02'))\n"
					+ "RETURN varNode3");
			
			//getBasePatternCondConcrete
			assertEquals(completePatterns.get(4).generateCypher(), "\nMATCH (varNode3:Regesta)\n"
					+ "WHERE (varNode3.endDate = \"1439-12-20\")\n"
					+ "RETURN varNode3");
			
			//getBasePatternMatchConcrete
			assertEquals(completePatterns.get(5).generateCypher(), "\nMATCH (varNode3:Regesta)\n"
					+ "WHERE (varNode3.endDate =~ \"1439.*\")\n"
					+ "RETURN varNode3");
			
			//getBasePatternMatchNotConcrete
			assertEquals(completePatterns.get(6).generateCypher(), "\nMATCH (varNode3:Regesta)\n"
					+ "WHERE (NOT (varNode3.endDate =~ \"1439.*\"))\n"
					+ "RETURN varNode3");
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest01NeoEdgeQueryComp() {		
		try {
			new CypherTest01NeoEdge().buildPatterns(completePatterns);
			
			//getUnspecifiedEdge
			assertEquals(completePatterns.get(0).generateCypher(), "\nMATCH (varNode3)--(varNode4)\n"
					+ "RETURN varNode3");
			
			//getSimpleEdge
			assertEquals(completePatterns.get(1).generateCypher(), "\nMATCH (varNode3)-[varEdge2]-(varNode4)\n"
					+ "RETURN varNode3, varNode4, \n"
					+ "      varEdge2");
			
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest01NeoPropertyEdgeQueryComp() {		
		try {
			new CypherTest01NeoEdge().buildPatterns(completePatterns);
			
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest02ReturnQueryComp() {		
		try {
			new CypherTest01NeoEdge().buildPatterns(completePatterns);
			
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest03NotConditionQueryComp() {		
		try {
			new CypherTest01NeoEdge().buildPatterns(completePatterns);
			
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest04FormulaQueryComp() {		
		try {
			new CypherTest01NeoEdge().buildPatterns(completePatterns);
			
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest05ParameterValuesQueryComp() {		
		try {
			new CypherTest01NeoEdge().buildPatterns(completePatterns);
			
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest06ComparisonQueryComp() {		
		try {
			new CypherTest01NeoEdge().buildPatterns(completePatterns);
			
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest07QuantifiedConditionQueryComp() {		
		try {
			new CypherTest01NeoEdge().buildPatterns(completePatterns);
			
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest08CycleQueryComp() {		
		try {
			new CypherTest01NeoEdge().buildPatterns(completePatterns);
			
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest09ContainsQueryComp() {		
		try {
			new CypherTest01NeoEdge().buildPatterns(completePatterns);
			
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest10MatchQueryComp() {		
		try {
			new CypherTest01NeoEdge().buildPatterns(completePatterns);
			
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest11CountConditionQueryComp() {		
		try {
			new CypherTest01NeoEdge().buildPatterns(completePatterns);
			
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest12CheckNullQueryComp() {		
		try {
			new CypherTest01NeoEdge().buildPatterns(completePatterns);
			
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			//
			assertEquals(completePatterns.get(0).generateCypher(), "\n");
			
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
}
