package qualitypatternmodel.cypherclasstester;

import qualitypatternmodel.exceptions.InvalidityException;

public interface INeoPathPartTest extends INeo4J {
	void getNeoPathPartEdges();
	void getCypherVariable();
	void getCypherInnerEdgeNodes(boolean isReturn) throws InvalidityException;
	void getNeoLastEdge() throws InvalidityException;
	void isLastEdge();
	void generateCypher();
	void generateInternalCypher();
	void isValidLocal();
	void getNeoPathParam();
	void setNeoComplexEdge();
	void myToString();
	void setCount();
	void getNeoPathParamException();
}
