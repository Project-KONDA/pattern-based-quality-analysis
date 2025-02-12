package junittests.adaptionneo4jtests.concretetests;

import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

import junittests.adaptionneo4jtests.NeoEdgeTest;
import qualitypatternmodel.adaptionneo4j.NeoPathParam;
import qualitypatternmodel.adaptionneo4j.NeoPathPart;
import qualitypatternmodel.adaptionneo4j.NeoPropertyEdge;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
import qualitypatternmodel.adaptionneo4j.impl.NeoComplexEdgeImpl;
import qualitypatternmodel.adaptionneo4j.impl.NeoElementNodeImpl;
import qualitypatternmodel.adaptionneo4j.impl.NeoPathParamImpl;
import qualitypatternmodel.adaptionneo4j.impl.NeoPropertyEdgeImpl;
import qualitypatternmodel.adaptionneo4j.impl.NeoPropertyPathParamImpl;
import qualitypatternmodel.adaptionneo4j.impl.NeoSimpleEdgeImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.impl.ParametersFactoryImpl;
import qualitypatternmodel.utility.ConstantsNeo;


@DisplayName("NeoPropertyEdge Test")
public class NeoPropertyEdgeTest extends NeoEdgeTest {
	private static final String NEO_PROPERTY_NODE = ConstantsNeo.VARIABLE_PROPERTY_NODE + 2;
	private static final String PLACE_OF_ISSUE = "placeOfIssue";
	private static final String NEO_PROPERTY_EDGE_1 = "NeoPropertyEdgeImpl [1]";
	private static final String NODE_PROPERTY_PLACE_OF_ISSUE = NEO_PROPERTY_NODE + "." + PLACE_OF_ISSUE;
	private static final String NEO_PROPERTY_PATH_PARAM_1 = "NeoPropertyPathParam [1]";
	private NeoPropertyEdge neoPropertyEdge;

	@BeforeAll
    static void initAll() {

    }

	@BeforeEach
	public void setUp() {
		try {
			super.setUp(FACTORY.createNeoPropertyEdge());
			neoPropertyEdge = (NeoPropertyEdge) super.neoAbstractEdge;
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}

	}

	@Override
	@AfterEach
	public void tearDown() {
		super.tearDown();
		neoPropertyEdge = null;
	}

	@Test
	public void generateCypherPropertyAddressing() {
		try {
			//if no neoPropertyPathParam is set return null
			assertEquals("", neoPropertyEdge.generateCypherPropertyAddressing());

			//Source Node is not set && The case if no neoPropertyPathParam is set
			NeoPropertyPathParamImpl propertyName = (NeoPropertyPathParamImpl) FACTORY.createNeoPropertyPathParam();
			propertyName.setNeoPropertyName(PLACE_OF_ISSUE);
			neoPropertyEdge.setSource(null);
			neoPropertyEdge.setNeoPropertyPathParam(propertyName);
			assertThrows(InvalidityException.class, ()->neoPropertyEdge.generateCypherPropertyAddressing());

			assumeTrue(neoPropertyEdge.getNeoPropertyPathParam() != null);
			//assertEquals(null, neoPropertyEdge.generateCypherPropertyAddressing());

			//Get the NodeName from source
			NeoElementNodeImpl mockNeoNodeImpl = Mockito.mock(NeoElementNodeImpl.class);
			Mockito.when(mockNeoNodeImpl.getCypherVariable()).thenReturn(NEO_PROPERTY_NODE);
			neoPropertyEdge.setSource(mockNeoNodeImpl);
			assumeTrue(neoPropertyEdge.getSource() != null);

			assertTrue(neoPropertyEdge.generateCypherPropertyAddressing().compareTo(NEO_PROPERTY_NODE + "." + PLACE_OF_ISSUE) == 0);
			neoPropertyEdge.setSource(null);

			//Get the NodeName from NeoSimpleEdge Node
			assertNull(neoPropertyEdge.getSource());
			NeoSimpleEdgeImpl mockNeoSimpleEdgeImpl = Mockito.mock(NeoSimpleEdgeImpl.class);
			Mockito.when(mockNeoSimpleEdgeImpl.getCypherInnerEdgeNodes(ArgumentMatchers.anyBoolean())).thenReturn(NEO_PROPERTY_NODE);
			Mockito.when(mockNeoSimpleEdgeImpl.getNeoLastEdge()).thenReturn(mockNeoSimpleEdgeImpl);
			propertyName.setNeoPathPart(mockNeoSimpleEdgeImpl);
			String temp = neoPropertyEdge.generateCypherPropertyAddressing();
			assertTrue(temp.compareTo(NODE_PROPERTY_PLACE_OF_ISSUE) == 0);

			//Get the NodeName from ComplexEdge
			NeoComplexEdgeImpl mockNeoComplexEdgeImpl = Mockito.mock(NeoComplexEdgeImpl.class);
			Mockito.when(mockNeoComplexEdgeImpl.getNeoLastEdge()).thenReturn(mockNeoSimpleEdgeImpl);
			propertyName.setNeoPathPart(mockNeoComplexEdgeImpl);
			temp = neoPropertyEdge.generateCypherPropertyAddressing();
			assertTrue(temp.compareTo(NODE_PROPERTY_PLACE_OF_ISSUE) == 0);
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	@Test
	public void generateCypherNodeVariable() {
		try {
			//if no neoPropertyPathParam is set return null
			assertEquals("", neoPropertyEdge.getCypherNodeVariable());

			//Get the NodeName from source
			NeoElementNodeImpl mockNeoNodeImpl = Mockito.mock(NeoElementNodeImpl.class);
			Mockito.when(mockNeoNodeImpl.getCypherVariable()).thenReturn(VAR_EDGE1);
			neoPropertyEdge.setSource(mockNeoNodeImpl);
			assumeTrue(neoPropertyEdge.getSource() != null);

			NeoPropertyPathParamImpl propertyName = (NeoPropertyPathParamImpl) FACTORY.createNeoPropertyPathParam();
			propertyName.setNeoPropertyName(PLACE_OF_ISSUE);
			neoPropertyEdge.setNeoPropertyPathParam(propertyName);

			assertTrue(neoPropertyEdge.getCypherNodeVariable().compareTo(VAR_EDGE1) == 0);
			neoPropertyEdge.setSource(null);

			//Get the NodeName from NeoSimpleEdge Node
			assertNull(neoPropertyEdge.getSource());
			NeoSimpleEdgeImpl mockNeoSimpleEdgeImpl = Mockito.mock(NeoSimpleEdgeImpl.class);
			Mockito.when(mockNeoSimpleEdgeImpl.getCypherInnerEdgeNodes(ArgumentMatchers.anyBoolean())).thenReturn(NEO_PROPERTY_NODE);
			Mockito.when(mockNeoSimpleEdgeImpl.getNeoLastEdge()).thenReturn(mockNeoSimpleEdgeImpl);
			propertyName.setNeoPathPart(mockNeoSimpleEdgeImpl);
			String temp = neoPropertyEdge.getCypherNodeVariable();
			assertTrue(temp.compareTo(NEO_PROPERTY_NODE) == 0);

			//Get the NodeName from ComplexEdge
			NeoComplexEdgeImpl mockNeoComplexEdgeImpl = Mockito.mock(NeoComplexEdgeImpl.class);
			Mockito.when(mockNeoComplexEdgeImpl.getNeoLastEdge()).thenReturn(mockNeoSimpleEdgeImpl);
			propertyName.setNeoPathPart(mockNeoComplexEdgeImpl);
			temp = neoPropertyEdge.getCypherNodeVariable();
			assertTrue(temp.compareTo(NEO_PROPERTY_NODE) == 0);

			//Get the Exception
			NeoPathPart mockNeoPathPart = Mockito.mock(NeoPathPart.class);
			Field f = getNeoAbstractPathParamField(NeoPathParamImpl.class, "neoPathPart");
			f.set(propertyName, mockNeoPathPart);
			assertThrows(InvalidityException.class, () -> neoPropertyEdge.getCypherNodeVariable());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}


	@Test
	@Override
	public void getReturnInnerEdgeNodes() {
		try {
			assertEquals(null, neoPropertyEdge.getReturnInnerEdgeNodes());
			NeoPropertyPathParamImpl mockNeoPropertyPathParam = Mockito.mock(NeoPropertyPathParamImpl.class);
			Mockito.when(mockNeoPropertyPathParam.getReturnInnerEdgeNodes()).thenReturn(INTERNAL_EDGE_NODE_1);
			neoPropertyEdge.setNeoPropertyPathParam(mockNeoPropertyPathParam);
			assertEquals(INTERNAL_EDGE_NODE_1, neoPropertyEdge.getReturnInnerEdgeNodes());
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
			NeoPropertyPathParam mockNeoPropertyPathParam = Mockito.mock(NeoPropertyPathParam.class);
			Mockito.when(mockNeoPropertyPathParam.generateCypher()).thenReturn(VAR_EDGE1_CLAMPED);
			Field f = getNeoAbstractPathParamField(NeoPropertyEdgeImpl.class, "neoPropertyPathParam");
			f.set(neoPropertyEdge, mockNeoPropertyPathParam);
			assumeTrue(neoPropertyEdge.getNeoPropertyPathParam() != null);
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
			Field f = getNeoAbstractPathParamField(NeoPropertyEdgeImpl.class, "neoPropertyPathParam");
			f.set(neoPropertyEdge, null);
			assertNull(neoPropertyEdge.getNeoPropertyPathParam());
			assertThrows(InvalidityException.class, () -> neoPropertyEdge.generateCypher());
			assertThrows(InvalidityException.class, () -> neoPropertyEdge.generateCypher());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	@Test
	public void noPropertyName() {
		NeoPropertyPathParam neoPropertyPathParam = FACTORY.createNeoPropertyPathParam();
		neoPropertyEdge.setNeoPropertyPathParam(neoPropertyPathParam);
		assumeTrue(neoPropertyEdge.getNeoPropertyPathParam() != null);
		assertThrows(InvalidityException.class, () -> neoPropertyEdge.generateCypherPropertyAddressing());
	}

	@Test
	@Override
	public void myToString() {
		try {
			assertEquals(NEO_PROPERTY_EDGE_1, neoAbstractEdge.myToString());

			NeoPropertyPathParam mockNeoPropertyPathParam = Mockito.mock(NeoPropertyPathParam.class);
			Mockito.when(mockNeoPropertyPathParam.myToString()).thenReturn(NEO_PROPERTY_PATH_PARAM_1);
			Field f = getNeoAbstractPathParamField(NeoPropertyEdgeImpl.class, "neoPropertyPathParam");
			f.set(neoPropertyEdge, mockNeoPropertyPathParam);

			assertEquals(NEO_PROPERTY_EDGE_1 + " " + NEO_PROPERTY_PATH_PARAM_1, neoAbstractEdge.myToString());
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
			assertNull(neoPropertyEdge.getNeoPropertyPathParam());
			assertNull(neoPropertyEdge.getParameterList());

			NeoPropertyEdgeImpl mockNeoPropertyEdgeImpl = Mockito.mock(NeoPropertyEdgeImpl.class);
			ParameterList list = new ParametersFactoryImpl().createParameterList();
			Mockito.when(mockNeoPropertyEdgeImpl.getParameterList()).thenReturn(list);
			Mockito.doCallRealMethod().when(mockNeoPropertyEdgeImpl).createParameters();
			mockNeoPropertyEdgeImpl.createParameters();
			assertTrue(list.getParameters().size() == 1);
			assertTrue(list.getParameters().get(0) instanceof NeoPropertyPathParam);

			Mockito.when(mockNeoPropertyEdgeImpl.getNeoPropertyPathParam()).thenReturn((NeoPropertyPathParam) list.getParameters().get(0));
			mockNeoPropertyEdgeImpl.createParameters();
			assertTrue(list.getParameters().size() == 1);

			//Not a valid structure just for testing correct
			Mockito.when(mockNeoPropertyEdgeImpl.getNeoPropertyPathParam()).thenReturn(FACTORY.createNeoPropertyPathParam());
			mockNeoPropertyEdgeImpl.createParameters();
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
			NeoPathParam neoAbstractPathParam = FACTORY.createNeoPropertyPathParam();
			((NeoPropertyPathParam) neoAbstractPathParam).setNeoPathPart(null);
			neoPropertyEdge.setNeoPropertyPathParam((NeoPropertyPathParam) neoAbstractPathParam);
			assumeTrue(neoPropertyEdge.getNeoPropertyPathParam() != null);
			assertEquals(null, neoPropertyEdge.getCypherReturn());

			NeoSimpleEdgeImpl mockNeoSimpleEdgeImpl = prepaireMockObjNeoSimpleEdge(number);
			((NeoPropertyPathParam) neoAbstractPathParam).setNeoPathPart(mockNeoSimpleEdgeImpl);

			initGetCypherReturnVariableTest(neoAbstractEdge, number);
			String variable = neoPropertyEdge.getCypherReturn().get(0).getValue();
			assertTrue(variable.matches(ConstantsNeo.VARIABLE_ELEMENT_EGDE + "[1-9][0-9]*"));
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(false);
		}
	}

	@Test
	public void getCypherReturnVariableException() {
		try {
			assertNull(neoPropertyEdge.getNeoPropertyPathParam());
			assertThrows(InvalidityException.class, () -> neoPropertyEdge.getCypherReturn());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(false);
		}
	}

	@Test
	@Override
	public void toStringT() {
		final String name = "TestName";
		final String string = "(name: " + name + ", translated: false, predicatesAreBeingTranslated: false) (returnElement: false)";
		neoPropertyEdge.setName(name);
		assertTrue(neoPropertyEdge.toString().endsWith(string));
	}
}
