package qualitypatternmodel.cypherclasstester.concretetests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.lang.reflect.Field;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;

import qualitypatternmodel.adaptionNeo4J.NeoEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
import qualitypatternmodel.adaptionNeo4J.impl.NeoEdgeImpl;
import qualitypatternmodel.adaptionNeo4J.impl.NeoPathParamImpl;
import qualitypatternmodel.adaptionNeo4J.impl.NeoSimpleEdgeImpl;
import qualitypatternmodel.cypherclasstester.NeoAbstractEdgeTest;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.utility.CypherSpecificConstants;

@DisplayName("NeoEdge Test")
public class Neo02EdgeTest extends NeoAbstractEdgeTest {
	private static final String INTERNAL_EDGE_NODE_1 = CypherSpecificConstants.INTERNAL_EDGE_NODE + 1;
	private static final String VAR_EDGE1 = "-[varEdge1]-";
	private static final String NEO_EDGE_IMPL_1 = "NeoEdgeImpl [1]";
	private static final String NEO_PATH_PARAM_1 = "NeoPathParam [1] ";
	NeoEdge neoEdge;
	
	@BeforeAll
    static void initAll() {
		
    }
	
	@BeforeEach
	public void setUp() {
		try {
			super.setUp(FACTORY.createNeoEdge());		
			neoEdge = (NeoEdge) super.neoAbstractEdge;
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
		
	}
	
	@AfterEach
	public void tearDown() {
		super.tearDown();
	}
	
	//has not to be tested && stuff like adaptAsNeoEdge are also not tested since they are simple getters (setters)
	@Override
	public void setIsReturnElement() {
		// TODO Auto-generated method stub
	}

	@Test
	@Override
	public void getReturnInnerEdgeNodes() {
		try {
			assertEquals(null, neoEdge.getReturnInnerEdgeNodes());
			NeoPathParamImpl mockNeoPathParam = Mockito.mock(NeoPathParamImpl.class);
			Mockito.when(mockNeoPathParam.getReturnInnerEdgeNodes()).thenReturn(INTERNAL_EDGE_NODE_1);
			neoEdge.setNeoPathParam(mockNeoPathParam);	
			assertEquals(INTERNAL_EDGE_NODE_1, neoEdge.getReturnInnerEdgeNodes());
		} catch (InvalidityException e) {
			System.out.println(e);
			assertFalse(true);
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	@Test
	@Override
	public void generateCypher() {
		try {
			NeoPathParam mockNeoPathParam = Mockito.mock(NeoPathParam.class);
			Mockito.when(mockNeoPathParam.generateCypher()).thenReturn(VAR_EDGE1);
			Field f = getNeoPathParam();
			f.set(neoEdge, mockNeoPathParam);
			assumeNotNull(neoEdge.getNeoPathParam());
			assertTrue(neoAbstractEdge.generateCypher().compareTo(VAR_EDGE1) == 0);
			assertEquals(null, neoAbstractEdge.generateCypher());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void generateCypherException() {
		try {
			Field f = getNeoPathParam();
			f.set(neoEdge, null);
			assertNull(neoEdge.getNeoPathParam());
			assertThrows(InvalidityException.class, () -> neoEdge.generateCypher());
			assertThrows(InvalidityException.class, () -> neoEdge.generateCypher());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	@Test
	@Override
	public void myToString() {
		try {
			assertEquals(NEO_EDGE_IMPL_1, neoAbstractEdge.myToString());
			
			NeoPathParam mockNeoPathParam = Mockito.mock(NeoPathParam.class);
			Mockito.when(mockNeoPathParam.myToString()).thenReturn(NEO_PATH_PARAM_1);
			Field f = getNeoPathParam();
			f.set(neoEdge, mockNeoPathParam);
			
//			neoEdge.setNeoPathParam(FACTORY.createNeoPathParam()); //DUE TO EMF I CAN NOT SET IT
			assertEquals(NEO_EDGE_IMPL_1 + " " + NEO_PATH_PARAM_1, neoAbstractEdge.myToString());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	protected Field getNeoPathParam() throws NoSuchFieldException, SecurityException {
		Class c = NeoEdgeImpl.class;
		Field f = c.getDeclaredField("neoPathParam");
		f.setAccessible(true);
		return f;
	}

//	@Test
	@Override
	public void createParameters() {
		neoAbstractEdge.createParameters();
		assertNull(neoEdge.getNeoPathParam());
		assertNull(neoAbstractEdge.getParameterList());
		
	}
	
//	protected Field getParameterListField() {
//		Class<NeoEdgeImpl> c = NeoEdgeImpl.class;
//		Field f = c.getField(name)
//	}

	@Override
	@ParameterizedTest
	@ValueSource(ints = {1,10,100,1000})
	public void generateCypherReturnVariable(int number) {
		try {
			neoAbstractEdge.getCypherReturnVariable();
			initGetCypherReturnVariableTest(node, number, true);
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(false);
		}
	}
}
