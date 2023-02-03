package qualitypatternmodel.cypherclasstests;

import qualitypatternmodel.exceptions.InvalidityException;

public interface INeoPathPartTest extends INeo4JTest {
	void getNeoPathPartEdges();
	void getCypherVariable();
	void getCypherInnerEdgeNodes(boolean isReturn) throws InvalidityException;
	void getNeoLastEdge() throws InvalidityException;
	void isLastEdge();
	void generateInternalCypher();
	void isValidLocal();
	void getNeoPathParam();
	void setNeoComplexEdge();
	void setCount();
	void getNeoPathParamException();
}
