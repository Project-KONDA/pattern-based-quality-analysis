package qualitypatternmodel.cypherclasstester;

import org.junit.jupiter.api.Test;

interface InterfaceNeoAbstractNodeTest extends INeo4J, InterfaceNeoElementTest {
	void getCypherVariable(int number);
	void getCypherVariableNotValidNumber(int number);
}
