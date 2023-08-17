package junittests.adaptionneo4jtests;

import static org.junit.Assume.assumeTrue;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import qualitypatternmodel.adaptionneo4j.NeoEdge;
import qualitypatternmodel.adaptionneo4j.NeoNode;
import qualitypatternmodel.graphstructure.impl.NodeImpl;
import qualitypatternmodel.graphstructure.impl.RelationImpl;

public abstract class NeoNodeTest implements INeoNodeTest {
	protected static final int GENERIC_NODE_ID = 1;
	protected NeoNode neoAbstractNode;
	
	public void setUp(NeoNode neoAbstractNode) {
		this.neoAbstractNode = neoAbstractNode;
	}
	
	public void tearDown() {
		neoAbstractNode = null;
	}

	protected void initGetCypherVariableTest(NeoNode node, int id)
			throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		Class<?> obj = node.getClass();
		obj = obj.getSuperclass().getSuperclass().getSuperclass();
		Method m = obj.getMethod("setInternalId", int.class);
		m.setAccessible(true);
		m.invoke(node, id);
		assumeTrue(((NodeImpl) node).getInternalId() == id);
	}
	
	protected void initGetCypherVariableTest(NeoEdge edge, int id)
			throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		Class<?> obj = edge.getClass();
		obj = obj.getSuperclass().getSuperclass().getSuperclass();
		Method m = obj.getMethod("setInternalId", int.class);
		m.setAccessible(true);
		m.invoke(edge, id);
		assumeTrue(((RelationImpl) edge).getInternalId() == id);
	}
}
