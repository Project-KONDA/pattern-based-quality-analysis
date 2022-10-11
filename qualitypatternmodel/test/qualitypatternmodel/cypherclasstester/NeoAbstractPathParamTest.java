package qualitypatternmodel.cypherclasstester;

import static org.junit.Assert.assertFalse;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.mockito.Mockito;

import qualitypatternmodel.adaptionNeo4J.NeoAbstractPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoPathPart;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
import qualitypatternmodel.adaptionNeo4J.impl.NeoSimpleEdgeImpl;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;
import qualitypatternmodel.utility.CypherSpecificConstants;

public abstract class NeoAbstractPathParamTest implements InterfaceNeoAbstractPathParamTest {
	//Improve the Klammern this are not EDGE Klammern
	
	private static final int INTERNAL_ID_ONE = 1;
	protected static final String VARIABLE_EDGE_ONE = CypherSpecificConstants.VARIABLE_EGDE + 1;
	protected static final String VARIABLE_EDGE_TWO = CypherSpecificConstants.VARIABLE_EGDE + 2;
	protected static final String VARIABLE_EAGE_ONE_CLAMPED = "(" + VARIABLE_EDGE_ONE + ")";
	protected static final String VARIABLE_EAGE_TWO_CLAMPED = "(" + VARIABLE_EDGE_TWO + ")";
	protected static final String REGESTA = "REGESTA";
	protected NeoAbstractPathParam neoAbstractPathParam;
	protected NeoSimpleEdgeImpl mockSimpleEdge;
	protected Field internalId;
	
	public void setUp(NeoAbstractPathParam neoAbstractPathParam) {
		try {
			this.neoAbstractPathParam = neoAbstractPathParam;
			if (internalId == null) {
				Class obj = neoAbstractPathParam.getClass();
				obj = obj.getSuperclass().getSuperclass().getSuperclass();
				Field f = obj.getDeclaredField("internalId");
				f.setAccessible(true);
				internalId = f;
			}
			internalId.set(neoAbstractPathParam, INTERNAL_ID_ONE);
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	public void tearDown() {
		neoAbstractPathParam = null;
	}
	
	public void buildMockSimpleEdge() {
		try {
			mockSimpleEdge = Mockito.mock(NeoSimpleEdgeImpl.class);
			String variableEdgeOne = VARIABLE_EDGE_ONE;
			Mockito.when(mockSimpleEdge.getCypherVariable()).thenReturn(variableEdgeOne);
			EList<NeoPathPart> l = new BasicEList<NeoPathPart>();
			l.add(mockSimpleEdge);
			Mockito.when(mockSimpleEdge.getNeoPathPartEdges()).thenReturn(l);
			Mockito.when(mockSimpleEdge.generateCypher()).thenReturn("-"+ VARIABLE_EAGE_ONE_CLAMPED + "-")
															.thenReturn("-"+VARIABLE_EAGE_TWO_CLAMPED + "-");
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	protected Method getMethodGetRelationNumber(Class obj) throws NoSuchMethodException {
		Method m = obj.getDeclaredMethod("getRelationNumber");
		m.setAccessible(true);
		return m;
	}

	protected Field getInternalIdField() throws NoSuchFieldException, IllegalAccessException {
		Class obj = PatternElementImpl.class;
		Field f = obj.getDeclaredField("internalId");
		f.setAccessible(true);
		return f;
	}
}
