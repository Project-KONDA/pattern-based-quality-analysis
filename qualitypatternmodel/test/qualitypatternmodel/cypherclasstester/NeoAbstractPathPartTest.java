package qualitypatternmodel.cypherclasstester;

import qualitypatternmodel.adaptionNeo4J.NeoPathPart;
import qualitypatternmodel.adaptionNeo4J.impl.NeoPathParamImpl;

public abstract class NeoAbstractPathPartTest implements InterfaceNeoPathPartTest {
	protected NeoPathPart neoPathPart;
	
	public void setUp(NeoPathPart neoPathPart) {
		this.neoPathPart = neoPathPart;
	}
	
	public void tearDown() {
		neoPathPart = null;
	}
}
