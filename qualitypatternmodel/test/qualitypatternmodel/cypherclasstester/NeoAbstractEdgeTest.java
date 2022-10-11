package qualitypatternmodel.cypherclasstester;


import static org.junit.Assert.assertFalse;

import java.lang.reflect.Field;

import qualitypatternmodel.adaptionNeo4J.NeoAbstractEdge;

public abstract class NeoAbstractEdgeTest implements InterfaceNeoAbstractEdgeTest {
	private static final int INTERNAL_ID_ONE = 1;
	protected NeoAbstractEdge neoAbstractEdge;
	protected Field internalId;
	
	public void setUp(NeoAbstractEdge neoAbstractEdge) {
		try {
			this.neoAbstractEdge = neoAbstractEdge;
			if (internalId == null) {
				Class obj = neoAbstractEdge.getClass();
				obj = obj.getSuperclass().getSuperclass().getSuperclass();
				Field f = obj.getDeclaredField("internalId");
				f.setAccessible(true);
				internalId = f;
			}
			internalId.set(neoAbstractEdge, INTERNAL_ID_ONE);
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	public void tearDown() {
		neoAbstractEdge = null;
	}
}
