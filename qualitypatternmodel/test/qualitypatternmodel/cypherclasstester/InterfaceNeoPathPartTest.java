package qualitypatternmodel.cypherclasstester;

import qualitypatternmodel.exceptions.InvalidityException;

public interface InterfaceNeoPathPartTest extends INeo4J {
	void getNeoPathPartEdges();
	void getCypherVariable();
	void getCypherInnerEdgeNodes(boolean isReturn) throws InvalidityException;
	void getNeoLastEdge() throws InvalidityException;
	void isLastEdge();
	void generateCypher();
	void generateInternalCypher();
	void isValidLocal();
	void getNeoAbstractPathParam();
	void setNeoComplexEdge();
	void myToString();
	void setCount();
	void getNeoAbstractPathParamException();
}
