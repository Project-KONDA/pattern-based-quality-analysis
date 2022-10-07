package qualitypatternmodel.cypherclasstester;

import qualitypatternmodel.adaptionNeo4J.NeoComplexEdge;
import qualitypatternmodel.exceptions.InvalidityException;

public interface InterfaceNeoPathPartTest {
	void getNeoPathPartEdges();
	void getCypherVariable();
	void getCypherInnerEdgeNodes(boolean isReturn) throws InvalidityException;
	void getNeoLastEdge() throws InvalidityException;
	void isLastEdge();
	void generateCypher();
	void generateInternalCypher();
	void isValidLocal();
	void getNeoAbstractPathParam();
	void setNeoComplexEdge(NeoComplexEdge newNeoComplexEdge);
	void myToString();
	void setCount();
}
