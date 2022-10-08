package qualitypatternmodel.cypherclasstester;

import org.junit.jupiter.api.Test;

import qualitypatternmodel.adaptionNeo4J.NeoComplexEdge;
import qualitypatternmodel.exceptions.InvalidityException;

public interface InterfaceNeoPathPartTest {
	@Test
	void getNeoPathPartEdges();
	
	@Test
	void getCypherVariable();
	
	@Test
	void getCypherInnerEdgeNodes(boolean isReturn) throws InvalidityException;
	
	@Test
	void getNeoLastEdge() throws InvalidityException;
	
	@Test
	void isLastEdge();
	
	@Test
	void generateCypher();
	
	@Test
	void generateInternalCypher();
	
	@Test
	void isValidLocal();
	
	@Test
	void getNeoAbstractPathParam();
	
	@Test
	void setNeoComplexEdge(NeoComplexEdge newNeoComplexEdge);
	
	@Test
	void myToString();
	
	@Test
	void setCount();
}
