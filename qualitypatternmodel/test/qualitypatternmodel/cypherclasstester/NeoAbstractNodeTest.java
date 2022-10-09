package qualitypatternmodel.cypherclasstester;

import static org.junit.Assume.assumeTrue;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import qualitypatternmodel.adaptionNeo4J.NeoAbstractEdge;
import qualitypatternmodel.adaptionNeo4J.NeoAbstractNode;
import qualitypatternmodel.adaptionNeo4J.NeoEdge;
import qualitypatternmodel.graphstructure.impl.NodeImpl;
import qualitypatternmodel.graphstructure.impl.RelationImpl;

public abstract class NeoAbstractNodeTest implements InterfaceNeoAbstractNodeTest {
	protected static final int GENERIC_NODE_ID = 1;
	protected NeoAbstractNode neoAbstractNode;
	
	public void setUp(NeoAbstractNode neoAbstractNode) {
		this.neoAbstractNode = neoAbstractNode;
	}
	
	public void tearDown() {
		neoAbstractNode = null;
	}

	protected void initGetCypherVariableTest(NeoAbstractNode node, int id)
			throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//		node = super.neoAbstractNode;
		Class obj = node.getClass();
		obj = obj.getSuperclass().getSuperclass().getSuperclass();
		Method m = obj.getMethod("setInternalId", int.class);
		m.setAccessible(true);
		m.invoke(node, id);
		assumeTrue(((NodeImpl) node).getOriginalID() == id);
	}
	
	protected void initGetCypherVariableTest(NeoAbstractEdge edge, int id)
			throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//		node = super.neoAbstractNode;
		Class obj = edge.getClass();
		obj = obj.getSuperclass().getSuperclass().getSuperclass();
		Method m = obj.getMethod("setInternalId", int.class);
		m.setAccessible(true);
		m.invoke(edge, id);
		assumeTrue(((RelationImpl) edge).getOriginalID() == id);
	}
}
