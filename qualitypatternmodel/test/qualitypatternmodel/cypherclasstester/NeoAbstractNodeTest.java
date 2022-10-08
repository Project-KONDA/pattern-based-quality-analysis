package qualitypatternmodel.cypherclasstester;

import qualitypatternmodel.adaptionNeo4J.NeoAbstractNode;

public abstract class NeoAbstractNodeTest implements InterfaceNeoAbstractNodeTest {
	protected NeoAbstractNode neoAbstractNode;
	
	public void setUp(NeoAbstractNode neoAbstractNode) {
		this.neoAbstractNode = neoAbstractNode;
	}
	
	public void tearDown() {
		neoAbstractNode = null;
	}
}
