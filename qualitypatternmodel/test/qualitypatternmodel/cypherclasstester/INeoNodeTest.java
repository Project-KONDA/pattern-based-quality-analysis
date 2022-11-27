package qualitypatternmodel.cypherclasstester;


interface INeoNodeTest extends INeo4J, NeoElementTest {
	void getCypherVariable(int number);
	void getCypherVariableNotValidNumber(int number);
}
