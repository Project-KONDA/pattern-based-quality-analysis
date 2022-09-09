package covTester;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
	
//	@Test
//	public void CypherTest04Formula() {
//		
//	}
//	
//	@Test
//	public void CypherTest05ParameterValues() {
//		
//	}
//	
//	@Test
//	public void CypherTest06Comparison() {
//		
//	}
//	
//	@Test
//	public void CypherTest07CountCondition() {
//		
//	}
//	
//	@Test
//	public void CypherTest08Cycle() {
//		
//	}
//	
//	@Test
//	public void CypherTest09Contains() {
//		
//	}
//	
//	@Test
//	public void CypherTest10Match() {
//		
//	}
	
}
