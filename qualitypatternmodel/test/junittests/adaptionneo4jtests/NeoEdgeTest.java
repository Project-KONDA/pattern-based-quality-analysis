package junittests.adaptionneo4jtests;


import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EMap;
import org.mockito.Mockito;

import qualitypatternmodel.adaptionneo4j.NeoEdge;
import qualitypatternmodel.adaptionneo4j.impl.NeoSimpleEdgeImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.impl.RelationImpl;
import qualitypatternmodel.utility.CypherSpecificConstants;

public abstract class NeoEdgeTest implements INeoEdgeTest {
	private static final int INTERNAL_ID_ONE = 1;
	protected static final String VAR_ELEMENT_EDGE_X = "varEEdge%s";
	protected static final String VAR_EDGE1 = "varEdge1";
	protected static final String VAR_EDGE1_CLAMPED = "-[varEdge1]-";
	protected static final String INTERNAL_EDGE_NODE_1 = CypherSpecificConstants.INTERNAL_EDGE_NODE + 1;
	protected NeoEdge neoAbstractEdge;
	protected Field internalId;
	
	public void setUp(NeoEdge neoAbstractEdge) {
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

	protected void initGetCypherReturnVariableTest(NeoEdge edge, int number) {
		int id = number;
		try {
			initGetCypherVariableTest(edge, id);
			EMap<Integer, String> variableMap = edge.getCypherReturn();
			assumeTrue(variableMap.keySet().stream().count() == 1);
			assumeTrue(variableMap.containsKey(0));
			String variable = variableMap.get(0).getValue();
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	protected void initGetCypherVariableTest(NeoEdge edge, int id)
			throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		this.internalId.set(edge, id);
		assumeTrue( ((RelationImpl)edge).getOriginalID() == id);
	}
	
	protected NeoSimpleEdgeImpl prepaireMockObjNeoSimpleEdge(int number) throws InvalidityException {
		NeoSimpleEdgeImpl mockNeoEdgeImpl = Mockito.mock(NeoSimpleEdgeImpl.class);
		Mockito.when(mockNeoEdgeImpl.getCypherVariable()).thenReturn(String.format(VAR_ELEMENT_EDGE_X, number));
		return mockNeoEdgeImpl;
	}

	protected Field getNeoAbstractPathParamField(Class<?> cl, String fieldName)
			throws NoSuchFieldException, SecurityException {
				Class<?> c = cl;
				Field f = c.getDeclaredField(fieldName);
				f.setAccessible(true);
				return f;
			}
}
