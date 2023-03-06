package junittests.adaptionneo4jtests;


interface INeoNodeTest extends INeo4JTest, INeoElementTest {
	void getCypherVariable(int number);
}
