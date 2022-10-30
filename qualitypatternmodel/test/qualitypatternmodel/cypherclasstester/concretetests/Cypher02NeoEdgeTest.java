package qualitypatternmodel.cypherclasstester.concretetests;

import static org.junit.Assume.assumeNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Field;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;

import qualitypatternmodel.adaptionNeo4J.NeoAbstractPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPathParam;
import qualitypatternmodel.adaptionNeo4J.impl.NeoEdgeImpl;
import qualitypatternmodel.adaptionNeo4J.impl.NeoPathParamImpl;
import qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyEdgeImpl;
import qualitypatternmodel.adaptionNeo4J.impl.NeoSimpleEdgeImpl;
import qualitypatternmodel.cypherclasstester.NeoAbstractEdgeTest;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.impl.ParametersFactoryImpl;
import qualitypatternmodel.utility.CypherSpecificConstants;

@DisplayName("NeoEdge Test")
public class Cypher02NeoEdgeTest extends NeoAbstractEdgeTest {
	private static final String NEO_PATH_PARAM_1 = "NeoPathParam [1] ";
	private static final String NEO_EDGE_IMPL_1 = "NeoEdgeImpl [1]";
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
		neoEdge = null;
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
			Mockito.when(mockNeoPathParam.generateCypher()).thenReturn(VAR_EDGE1_CLAMPED);
			Field f = getNeoAbstractPathParamField(NeoEdgeImpl.class, "neoPathParam");
			f.set(neoEdge, mockNeoPathParam);
			assumeNotNull(neoEdge.getNeoPathParam());
			assertTrue(neoAbstractEdge.generateCypher().compareTo(VAR_EDGE1_CLAMPED) == 0);
			assertEquals("", neoAbstractEdge.generateCypher());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void generateCypherException() {
		try {
			Field f = getNeoAbstractPathParamField(NeoEdgeImpl.class, "neoPathParam");
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
			Field f = getNeoAbstractPathParamField(NeoEdgeImpl.class, "neoPathParam");
			f.set(neoEdge, mockNeoPathParam);
			
//			neoEdge.setNeoPathParam(FACTORY.createNeoPathParam()); //DUE TO EMF I CAN NOT SET IT
			assertEquals(NEO_EDGE_IMPL_1 + " " + NEO_PATH_PARAM_1, neoAbstractEdge.myToString());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	@Override
	public void createParameters() {
		try {
			neoAbstractEdge.createParameters();
			assertNull(neoEdge.getNeoPathParam());
			assertNull(neoEdge.getParameterList());	
			
			NeoEdgeImpl mockNeoEdgeImpl = Mockito.mock(NeoEdgeImpl.class);
			ParameterList list = new ParametersFactoryImpl().createParameterList();
			Mockito.when(mockNeoEdgeImpl.getParameterList()).thenReturn(list);
			Mockito.doCallRealMethod().when(mockNeoEdgeImpl).createParameters();
			mockNeoEdgeImpl.createParameters();
			assertTrue(list.getParameters().size() == 1);
			assertTrue(list.getParameters().get(0) instanceof NeoPathParamImpl);
			Mockito.when(mockNeoEdgeImpl.getNeoPathParam()).thenReturn((NeoPathParam) list.getParameters().get(0));
//			Mockito.doCallRealMethod().when(mockNeoEdgeImpl);
			//EMF interne logic zur bidirektionalem setzen der Werte wird nicht getriggert, daher manuelle einfügung
//			((NeoPathParam) list.getParameters().get(0)).setNeoEdge(mockNeoEdgeImpl);
			
//			assertEquals(mockNeoEdgeImpl, ((NeoPathParamImpl) list.getParameters().get(0)).getNeoEdge());
			
			mockNeoEdgeImpl.createParameters();
			assertTrue(list.getParameters().size() == 1);
			
			//Not a valid structure just for testing correct
			Mockito.when(mockNeoEdgeImpl.getNeoPathParam()).thenReturn(FACTORY.createNeoPathParam());
			mockNeoEdgeImpl.createParameters();
			assertTrue(list.getParameters().size() == 2);
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	@Override
	@ParameterizedTest
	@ValueSource(ints = {1,10,100,1000})
	public void getCypherReturnVariable(int number) {
		try {
			NeoAbstractPathParam neoAbstractPathParam = FACTORY.createNeoPathParam();
			((NeoPathParam) neoAbstractPathParam).setNeoPathPart(null);
			neoEdge.setNeoPathParam((NeoPathParam) neoAbstractPathParam);
			assumeNotNull(neoEdge.getNeoPathParam());
			assertEquals(null, neoEdge.getCypherReturnVariable());
			
			NeoSimpleEdgeImpl mockNeoEdgeImpl = prepaireMockObjNeoSimpleEdge(number);
			((NeoPathParam) neoAbstractPathParam).setNeoPathPart(mockNeoEdgeImpl);
			
			initGetCypherReturnVariableTest(neoAbstractEdge, number);
			String variable = neoEdge.getCypherReturnVariable().get(0).getValue();
			assertTrue(variable.matches(CypherSpecificConstants.VARIABLE_EGDE + "[1-9][0-9]*"));
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(false);
		}
	}
	
	@Test
	public void getCypherReturnVariableException() {
		try {
			assertNull(neoEdge.getNeoPathParam());
			assertThrows(InvalidityException.class, () -> neoEdge.getCypherReturnVariable());			
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(false);
		}
	}
}
