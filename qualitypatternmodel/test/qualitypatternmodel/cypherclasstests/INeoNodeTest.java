package qualitypatternmodel.cypherclasstests;


interface INeoNodeTest extends INeo4J, INeoElementTest {
	void getCypherVariable(int number);
	void getCypherVariableNotValidNumber(int number);
}
