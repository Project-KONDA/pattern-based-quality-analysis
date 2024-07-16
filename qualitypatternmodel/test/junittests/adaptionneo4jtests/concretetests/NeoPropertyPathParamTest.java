package junittests.adaptionneo4jtests.concretetests;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assume.assumeNotNull;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

import junittests.adaptionneo4jtests.NeoPathParamTest;
import qualitypatternmodel.adaptionneo4j.NeoComplexEdge;
import qualitypatternmodel.adaptionneo4j.NeoNodeLabelsParam;
import qualitypatternmodel.adaptionneo4j.NeoPathPart;
import qualitypatternmodel.adaptionneo4j.NeoPropertyEdge;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;
import qualitypatternmodel.adaptionneo4j.impl.NeoPathParamImpl;
import qualitypatternmodel.adaptionneo4j.impl.NeoPropertyEdgeImpl;
import qualitypatternmodel.adaptionneo4j.impl.NeoPropertyPathParamImpl;
import qualitypatternmodel.adaptionneo4j.impl.NeoSimpleEdgeImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.utility.ConstantsNeo;

@DisplayName("NeoPropertyPathParam Test")
public class NeoPropertyPathParamTest extends NeoPathParamTest {
	private static final String NEO_PROPERTY_PATH_PARAM_VARIABLE_EAGE_ONE_CLAMPED = "NeoPropertyPathParam [1] " + "-"+ VARIABLE_EAGE_ONE_CLAMPED + "-";
	private static final String ORIGINAL_PLACE_OF_ISSUE = "originalPlaceOfIssue";
	private static final String INDEXPLACE = "INDEXPLACE";
	private static final String PLACE = "PLACE";
	private static final String EDGE_WITH_TARGET = "-[VARIABLE_EDGE_ONE]-" + "(" + "varPropertyNode2" + ":" + INDEXPLACE + ":" + REGESTA + ")";
	NeoPropertyPathParam neoPropertyPathParam;

	@BeforeAll
    static void initAll() {

    }

	@BeforeEach
	public void setUp() {
		try {
			super.setUp(FACTORY.createNeoPropertyPathParam());
			neoPropertyPathParam = (NeoPropertyPathParam) super.neoAbstractPathParam;
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}

	}

	@Override
	@AfterEach
	public void tearDown() {
		super.tearDown();
	}

	@Test
	public void validateNeoPropertyEdge() {
		try {
			Method m = getValidateNeoPropertyEdgeMethod();
			NeoComplexEdge neoComplexEdge1 = FACTORY.createNeoComplexEdge();
			NeoSimpleEdge neoSimpleEdge1 = FACTORY.createNeoSimpleEdge();
			NeoSimpleEdge neoSimpleEdge2 = FACTORY.createNeoSimpleEdge();
			neoSimpleEdge1.addNeoTargetNodeLabel(REGESTA);
			neoSimpleEdge2.addNeoTargetNodeLabel(REGESTA);
			neoComplexEdge1.addNeoPathPart(neoSimpleEdge1);
			neoComplexEdge1.addNeoPathPart(neoSimpleEdge2);
			neoPropertyPathParam.setNeoPathPart(neoComplexEdge1);
			assertDoesNotThrow(() -> m.invoke(neoPropertyPathParam));
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	@Test
	public void validateNeoPropertyEdgeException() {
		try {
			Method m = getValidateNeoPropertyEdgeMethod();
			NeoComplexEdge neoComplexEdge1 = FACTORY.createNeoComplexEdge();
			//First Case with NeoComplexEdge
			neoPropertyPathParam.setNeoPathPart(neoComplexEdge1);
			try {
				m.invoke(neoPropertyPathParam);
			} catch (Exception e) {
				assertEquals(InvalidityException.class, e.getCause().getClass());
			}

			//Second Case with NeoSimpleEdge
			neoPropertyPathParam.setNeoPathPart(FACTORY.createNeoSimpleEdge());
			try {
				m.invoke(neoPropertyPathParam);
			} catch (Exception e) {
				assertEquals(InvalidityException.class, e.getCause().getClass());
			}
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	@Test
	public void innerEdgesHaveTargets() {
		try {
			Class<NeoPropertyPathParamImpl> obj = NeoPropertyPathParamImpl.class;
			Method m = obj.getDeclaredMethod("innerEdgesHaveTargets", EList.class);
			m.setAccessible(true);

			NeoSimpleEdge neoSimpleEdge1 = FACTORY.createNeoSimpleEdge();
			NeoSimpleEdge neoSimpleEdge2 = FACTORY.createNeoSimpleEdge();
			NeoComplexEdge neoComplexEdge1 = FACTORY.createNeoComplexEdge();
			NeoSimpleEdge neoSimpleEdge3 = FACTORY.createNeoSimpleEdge();
			NeoPathPart mockPart = Mockito.mock(NeoPathPart.class);
			neoComplexEdge1.addNeoPathPart(neoSimpleEdge3);
			EList<NeoPathPart> l = new BasicEList<NeoPathPart>();
			l.add(neoSimpleEdge1);
			l.add(neoSimpleEdge2);
			l.add(neoComplexEdge1);
			l.add(mockPart);

			//Case that neoSimpleEdge.getNeoTargetNodeLabels() == null and the size > 0 is not testable
			assertEquals(false, m.invoke(neoPropertyPathParam, l));

			neoSimpleEdge1.addNeoTargetNodeLabel(REGESTA);
			neoSimpleEdge2.addNeoTargetNodeLabel(PLACE);
			neoSimpleEdge3.addNeoTargetNodeLabel(INDEXPLACE);
			assertEquals(true, m.invoke(neoPropertyPathParam, l));
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	@Test
	public void neoPropertyName() {
		//Check if the original value is null
		assertNull(neoPropertyPathParam.getNeoPropertyName());

		//Set a valid Property-Namen
		String neoPropertyName = ORIGINAL_PLACE_OF_ISSUE;
		assertDoesNotThrow(() -> neoPropertyPathParam.setNeoPropertyName(neoPropertyName));
		assertEquals(neoPropertyName, neoPropertyPathParam.getNeoPropertyName());

		//Setting the Value to null
		assertDoesNotThrow(()-> neoPropertyPathParam.setNeoPropertyName((String) null));
		assertNull(neoPropertyPathParam.getNeoPropertyName());

		//Trying to set a Empty-String --> Nothing happens
		assertThrows(InvalidityException.class, ()-> neoPropertyPathParam.setNeoPropertyName(""));
		assertNull(neoPropertyPathParam.getNeoPropertyName());
	}

	@Test
	@Override
	public void getReturnInnerEdgeNodes() {
		try {
			//No NeoPathPart is set
			assertNull(neoPropertyPathParam.getNeoPathPart());
			assertNull(neoPropertyPathParam.getReturnInnerEdgeNodes());

			//NeoPathPart is set
			NeoSimpleEdgeImpl mockPathPart = Mockito.mock(NeoSimpleEdgeImpl.class);
			String internalEdgeString = ConstantsNeo.INTERNAL_EDGE_NODE + 1;
			Mockito.when(mockPathPart.getCypherInnerEdgeNodes(ArgumentMatchers.anyBoolean())).thenReturn(internalEdgeString);
			neoPropertyPathParam.setNeoPathPart(mockPathPart);
			assertEquals(internalEdgeString, neoAbstractPathParam.getReturnInnerEdgeNodes());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	@Test
	@Override
	public void getCypherReturnVariable() {
		try {
			buildMockSimpleEdge();
			neoPropertyPathParam.setNeoPathPart(super.mockSimpleEdge);
			assertEquals(NeoPathParamTest.VARIABLE_EDGE_ONE, neoPropertyPathParam.getCypherReturnVariable());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	@Test
	@Override
	public void generateCypher() {
		try {
			//If nothing is set
			assertEquals("", super.neoAbstractPathParam.generateCypher());

			//If NeoPathParts are set
			buildMockSimpleEdge();
			NeoNodeLabelsParam tL = FACTORY.createNeoNodeLabelsParam();
			tL.addStringValue(PLACE);
			tL.addStringValue(REGESTA);
			Mockito.when(mockSimpleEdge.getNeoTargetNodeLabels()).thenReturn(tL);
			Mockito.when(mockSimpleEdge.generateCypher()).thenReturn(EDGE_WITH_TARGET);
			neoPropertyPathParam.setNeoPathPart(mockSimpleEdge);
			assertEquals(EDGE_WITH_TARGET, super.neoAbstractPathParam.generateCypher());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	@Test
	@Override
	public void createParameters() {
		neoAbstractPathParam.createParameters();
		assertTrue(neoPropertyPathParam.getNeoPathPart() instanceof NeoSimpleEdge);
	}

	@Test
	@Override
	public void myToString() {
		try {
			//Just Print the internalId
			assertTrue(neoPropertyPathParam.myToString().compareTo("NeoPropertyPathParam [1]") == 0);

			//If an visibile Edge is set
			buildMockSimpleEdge();
			NeoNodeLabelsParam l = FACTORY.createNeoNodeLabelsParam();
			l.addStringValue(REGESTA);
			Mockito.when(super.mockSimpleEdge.getNeoTargetNodeLabels()).thenReturn(l);
			neoPropertyPathParam.setNeoPathPart(super.mockSimpleEdge);
			Mockito.when(mockSimpleEdge.generateCypher()).thenReturn("-"+ VARIABLE_EAGE_ONE_CLAMPED + "-");

			assertTrue(neoPropertyPathParam.myToString().compareTo(NEO_PROPERTY_PATH_PARAM_VARIABLE_EAGE_ONE_CLAMPED) == 0);

			//Get it with an identifier
			neoPropertyPathParam.setNeoPathPart(null);
			assertNull(neoPropertyPathParam.getNeoPathPart());
			NeoPropertyEdgeImpl mockNeoPropertyEdgeImpl = Mockito.mock(NeoPropertyEdgeImpl.class);
			neoPropertyPathParam.setNeoPropertyEdge(mockNeoPropertyEdgeImpl);
			String varNode3Property = "varNode3.placeOfIssue";
			neoPropertyPathParam.setNeoPropertyName(FACTORY.createNeoPropertyNameParam());
			Mockito.when(mockNeoPropertyEdgeImpl.generateCypherPropertyAddressing()).thenReturn(varNode3Property)
																						.thenThrow(new InvalidityException());
			assertTrue(neoPropertyPathParam.myToString().compareTo("NeoPropertyPathParam [1] " + varNode3Property) == 0);

			//In the case of a Exception nothing happens except the StackTrace is printed
			neoPropertyPathParam.myToString();
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	@Test
	@Override
	public void getRelationNumber() {
		try {
			NeoPropertyEdge neoPropertyEdge = FACTORY.createNeoPropertyEdge();
			Field f = super.getInternalIdField();

			Class<? extends NeoPropertyPathParam> obj = neoPropertyPathParam.getClass();
			Method m = super.getMethodGetRelationNumber(obj);

			//If No NeoEdge is set return -1
			assertEquals(-1, m.invoke(neoPropertyPathParam));

			//NeoPropertyEdge is set with the Id 1
			f.set(neoPropertyEdge, 1);
			neoPropertyPathParam.setNeoPropertyEdge(neoPropertyEdge);
			assumeNotNull(neoPropertyPathParam.getNeoPropertyEdge());
			assertEquals(1, m.invoke(neoPropertyPathParam));
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	@Test
	public void noLastEdge() {
		try {
			NeoComplexEdge mockComplexEdge = Mockito.mock(NeoComplexEdge.class);
			Mockito.when(mockComplexEdge.getNeoLastEdge()).thenReturn(null);
			Class<NeoPathParamImpl> obj = NeoPathParamImpl.class;
			Field f = obj.getDeclaredField("neoPathPart");
			f.setAccessible(true);
			f.set(neoPropertyPathParam, mockComplexEdge);
			assertThrows(InvalidityException.class, () -> neoPropertyPathParam.generateCypher());
		} catch (Exception e) {
			assertFalse(true);
		}

	}

	@Test
	@Override
	public void toStringT() {
		final String string = "(predefined: false, description: )";
		assertTrue(neoAbstractPathParam.toString().endsWith(string));
	}

	//FACTORY- and HELPERS
	private Method getValidateNeoPropertyEdgeMethod() throws NoSuchMethodException, SecurityException {
		Class<NeoPropertyPathParamImpl> obj = NeoPropertyPathParamImpl.class;
		Method m = obj.getDeclaredMethod("validateNeoPropertyEdge");
		m.setAccessible(true);
		return m;
	}
}
