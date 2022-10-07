package qualitypatternmodel.cypherclasstester;

import org.junit.Test;

interface InterfaceNeoAbstractNodeTest extends INeo4J, InterfaceNeoElementTest {
	@Test
	void getCypherVariable();
	
	
}
