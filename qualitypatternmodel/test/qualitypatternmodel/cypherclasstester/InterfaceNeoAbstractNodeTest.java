package qualitypatternmodel.cypherclasstester;


interface InterfaceNeoAbstractNodeTest extends INeo4J, InterfaceNeoElementTest {
	void getCypherVariable(int number);
	void getCypherVariableNotValidNumber(int number);
}
