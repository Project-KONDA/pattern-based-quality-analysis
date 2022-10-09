package qualitypatternmodel.cypherclasstester;

import qualitypatternmodel.adaptionNeo4J.NeoPathPart;

public abstract class NeoAbstractPathPartTest implements InterfaceNeoPathPartTest {
	protected NeoPathPart neoPathPart;
	
	public void setUp(NeoPathPart neoPathPart) {
		this.neoPathPart = neoPathPart;
	}
	
	public void tearDown() {
		neoPathPart = null;
	}
}
