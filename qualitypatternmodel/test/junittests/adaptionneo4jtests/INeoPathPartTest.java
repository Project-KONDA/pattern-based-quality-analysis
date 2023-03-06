package junittests.adaptionneo4jtests;

public interface INeoPathPartTest extends INeo4JTest {
	void getNeoPathPartEdges();
	void getCypherVariable();
	void getCypherInnerEdgeNodes(boolean isReturn);
	void getNeoLastEdge();
	void generateInternalCypher();
	void getNeoPathParam();
	void getNeoPathParamException();
}
