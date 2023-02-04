package qualitypatternmodel.cypherclasstests;


interface INeoNodeTest extends INeo4JTest, INeoElementTest {
	void getCypherVariable(int number);
}
