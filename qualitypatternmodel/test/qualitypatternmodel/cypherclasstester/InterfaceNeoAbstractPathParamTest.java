package qualitypatternmodel.cypherclasstester;

import org.junit.jupiter.api.Test;

interface InterfaceNeoAbstractPathParamTest extends INeo4J {
	@Test
	void getReturnInnerEdgeNodes();
	
	@Test
	void getCypherReturnVariable();	
	
	@Test
	void createParameters();
	
	@Test
	void inputIsValid();
	
	@Test
	void myToString();
	
	@Test
	void getRelationNumber();
}
