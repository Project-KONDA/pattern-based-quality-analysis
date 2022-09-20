package covTester;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
//import qualitypatternmodel.adaptionNeo4J.tests.AdaptionNeo4JTests;


import org.junit.Test;
import qualitypatternmodel.cyphertranslationtests.*;

public class CypherCovTester {

	@Test
	public void CypherTest00() {
		CypherTest00 cypher = new CypherTest00();
		assertDoesNotThrow(() -> cypher.main(null));
	}
	
	@Test
	public void CypherTest01NeoEdge() {
		CypherTest01NeoEdge cypher = new CypherTest01NeoEdge();
		assertDoesNotThrow(() -> cypher.main(null));
	}
	
	@Test
	public void CypherTest01NeoPropertyEdge() {
		CypherTest01NeoPropertyEdge cypher = new CypherTest01NeoPropertyEdge();
		assertDoesNotThrow(() -> cypher.main(null));
	}
	
	@Test
	public void CypherTest02Return() {
		CypherTest02Return cypher = new CypherTest02Return();
		assertDoesNotThrow(() -> cypher.main(null));
	}
	
	@Test
	public void CypherTest03NotCondition() {
		CypherTest03NotCondition cypher = new CypherTest03NotCondition();
		assertDoesNotThrow(() -> cypher.main(null));
	}
	
	@Test
	public void CypherTest04Formula() {
		CypherTest04Formula cypher = new CypherTest04Formula();
		assertDoesNotThrow(() -> cypher.main(null));
	}
	
	@Test
	public void CypherTest05ParameterValues() {
		CypherTest05ParameterValues cypher = new CypherTest05ParameterValues();
		assertDoesNotThrow(() -> cypher.main(null));
	}
	
	@Test
	public void CypherTest06Comparison() {
		CypherTest06Comparison cypher = new CypherTest06Comparison();
		assertDoesNotThrow(() -> cypher.main(null));
	}
	
	@Test
	public void CypherTest07QuantifiedCondition() {
		CypherTest07QuantifiedCondition cypher = new CypherTest07QuantifiedCondition();
		assertDoesNotThrow(() -> cypher.main(null));
	}
	
	@Test
	public void CypherTest08Cycle() {
		CypherTest08Cycle cypher = new CypherTest08Cycle();
		assertDoesNotThrow(() -> cypher.main(null));
	}
	
	@Test
	public void CypherTest09Contains() {
		CypherTest09Contains cypher = new CypherTest09Contains();
		assertDoesNotThrow(() -> cypher.main(null));
	}
	
	@Test
	public void CypherTest10Match() {
		CypherTest10Match cypher = new CypherTest10Match();
		assertDoesNotThrow(() -> cypher.main(null));
	}
}
