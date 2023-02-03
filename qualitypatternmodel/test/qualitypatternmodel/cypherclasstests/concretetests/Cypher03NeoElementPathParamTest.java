package qualitypatternmodel.cypherclasstests.concretetests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assume.assumeNotNull;
import static org.junit.Assume.assumeTrue;
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
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;

import qualitypatternmodel.adaptionneo4j.NeoComplexEdge;
import qualitypatternmodel.adaptionneo4j.NeoElementEdge;
import qualitypatternmodel.adaptionneo4j.NeoElementPathParam;
import qualitypatternmodel.adaptionneo4j.NeoNodeLabelsParam;
import qualitypatternmodel.adaptionneo4j.NeoPathPart;
import qualitypatternmodel.adaptionneo4j.impl.NeoComplexEdgeImpl;
import qualitypatternmodel.adaptionneo4j.impl.NeoElementPathParamImpl;
import qualitypatternmodel.adaptionneo4j.impl.NeoSimpleEdgeImpl;
import qualitypatternmodel.cypherclasstests.NeoPathParamTest;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.utility.CypherSpecificConstants;

@DisplayName("NeoElementPathParamTest")
public class Cypher03NeoElementPathParamTest extends NeoPathParamTest {
	NeoElementPathParam neoPathParam;
	
	@BeforeAll
    static void initAll() {
		
    }
	
	@BeforeEach
	public void setUp() {
		try {
			super.setUp(FACTORY.createNeoElementPathParam());		
			neoPathParam = (NeoElementPathParam) super.neoAbstractPathParam;
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
		
	}
	
	@AfterEach
	public void tearDown() {
		super.tearDown();
	}
		
	@Test
	@Override
	public void getReturnInnerEdgeNodes() {
		try {
			//No NeoPathPart is set
			assumeNotNull(neoPathParam.getNeoPathPart());
			neoPathParam.setNeoPathPart(null);
			assertNull(neoPathParam.getNeoPathPart());
			assertNull(neoPathParam.getReturnInnerEdgeNodes());
			
			//NeoPathPart is set
			NeoSimpleEdgeImpl mockPathPart = Mockito.mock(NeoSimpleEdgeImpl.class);
			String internalEdgeString = CypherSpecificConstants.INTERNAL_EDGE_NODE + 1;
			Mockito.when(mockPathPart.getCypherInnerEdgeNodes(Mockito.anyBoolean())).thenReturn(internalEdgeString);
			neoPathParam.setNeoPathPart(mockPathPart);
			assertEquals(internalEdgeString, neoAbstractPathParam.getReturnInnerEdgeNodes());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void generateMultiEdgeCypher() {
		try {
			Method m = getGenerateMultiEdgecypher();
			
			NeoSimpleEdgeImpl neoSimpl1 = Mockito.mock(NeoSimpleEdgeImpl.class);
			NeoSimpleEdgeImpl neoSimpl2 = Mockito.mock(NeoSimpleEdgeImpl.class);
			String varEdge1 = "-[varEdge1]-(varNode2)";
			Mockito.when(neoSimpl1.generateCypher()).thenReturn(varEdge1);
			String varEdge2WithTarget = "-[varEdge2]-(varNode3)";
			Mockito.when(neoSimpl2.generateCypher()).thenReturn(varEdge2WithTarget);
			Mockito.when(neoSimpl2.getNeoLastEdge()).thenReturn(neoSimpl2);
			NeoNodeLabelsParam t = FACTORY.createNeoNodeLabelsParam();
			Mockito.when(neoSimpl2.getNeoLastEdge()).thenReturn(neoSimpl2);
			Mockito.when(neoSimpl2.getNeoTargetNodeLabels()).thenReturn(t);
			EList<NeoPathPart> l1 = new BasicEList<NeoPathPart>();
			l1.add(neoSimpl1);
			Mockito.when(neoSimpl1.getNeoPathPartEdgeLeafs()).thenReturn(l1);
			EList<NeoPathPart> l2 = new BasicEList<NeoPathPart>();
			l2.add(neoSimpl2);
			Mockito.when(neoSimpl2.getNeoPathPartEdgeLeafs()).thenReturn(l2);
			NeoComplexEdge neoComplexEdge1 = FACTORY.createNeoComplexEdge();
			neoComplexEdge1.addNeoPathPart(neoSimpl1);
			neoComplexEdge1.addNeoPathPart(neoSimpl2);
			neoPathParam.setNeoPathPart(neoComplexEdge1);
			
			StringBuilder sb = new StringBuilder();
			
			m.invoke(neoPathParam, sb);
			assertEquals(varEdge1 + varEdge2WithTarget + "--", sb.toString());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void generateMultiEdgeCypherException() {
		try {
			Method m = getGenerateMultiEdgecypher();
			
			NeoComplexEdge neoComplexEdge1 = FACTORY.createNeoComplexEdge();
			neoComplexEdge1.addNeoPathPart(FACTORY.createNeoSimpleEdge());
			neoComplexEdge1.addNeoPathPart(FACTORY.createNeoSimpleEdge());
			neoPathParam.setNeoPathPart(neoComplexEdge1);
			StringBuilder sb = new StringBuilder();
			
			m.invoke(neoPathParam, sb);
		} catch (Exception e) {
			if (e.getCause().getClass() == InvalidityException.class) {
				assertTrue(true);
			} else {
				System.out.println(e);
				assertFalse(true);
			}
		}
	}
	
	private Method getGenerateMultiEdgecypher() throws Exception {
		Class<NeoElementPathParamImpl> c = NeoElementPathParamImpl.class;
		Method m = c.getDeclaredMethod("generateMultiEdgeCypher", StringBuilder.class);
		m.setAccessible(true);
		return m;
	}
	
	@Test
	public void generateSingleEdgeCypher() {
		try {
			//SimpleNeoEdge without Targets
			Class<NeoElementPathParamImpl> c = NeoElementPathParamImpl.class;
			Method m = c.getDeclaredMethod("generateSingleEdgeCypher", StringBuilder.class, EList.class);
			m.setAccessible(true);
			
			EList<NeoPathPart> l = new BasicEList<NeoPathPart>();
			buildMockSimpleEdge();
			l.add(super.mockSimpleEdge);
			
			StringBuilder sb = new StringBuilder();
			m.invoke(neoPathParam, sb, l);
			assertTrue(sb.toString().compareTo("-"+ VARIABLE_EAGE_ONE_CLAMPED + "-") == 0);
			
			//SimpleNeoEdgeWith a Target
			NeoNodeLabelsParam t = FACTORY.createNeoNodeLabelsParam();
			t.addStringValue("testvalue");
			Mockito.when(super.mockSimpleEdge.getNeoTargetNodeLabels()).thenReturn(null);
			l.clear();
			l.add(mockSimpleEdge);
			sb.setLength(0);
			m.invoke(neoPathParam, sb, l);
			assertTrue(sb.toString().compareTo("-"+ VARIABLE_EAGE_TWO_CLAMPED + "-") == 0);
			sb.setLength(0);
			NeoSimpleEdgeImpl mockSimplEdgeImpl2 = Mockito.mock(NeoSimpleEdgeImpl.class);
			String tempComp = "-"+ VARIABLE_EAGE_TWO_CLAMPED + "-" + "[varNode1]";
			Mockito.when(mockSimplEdgeImpl2.generateCypher()).thenReturn(tempComp);
			Mockito.when(mockSimplEdgeImpl2.getNeoTargetNodeLabels()).thenReturn(t);
			l.clear();
			l.add(mockSimplEdgeImpl2);
			m.invoke(neoPathParam, sb, l);
			assertTrue(sb.toString().compareTo(tempComp + "--") == 0);
			
			sb.setLength(0);
			l.clear();
			l.add(null);
			m.invoke(neoPathParam, sb, l);
		} catch (Exception e) {
			if (e.getCause().getClass() == InvalidityException.class) {
				assertTrue(true);
			} else {
				System.out.println(e);
				assertFalse(true);
			}
		}
	}
	

	
	@Test
	@Override
	public void getCypherReturnVariable() {
		try {
			buildMockSimpleEdge();
			neoPathParam.setNeoPathPart((NeoPathPart) super.mockSimpleEdge);
			assertEquals(NeoPathParamTest.VARIABLE_EDGE_ONE, neoPathParam.getCypherReturnVariable());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	@Override
	public void generateCypher() {
		try {
			//No Part specified
			neoPathParam.setNeoPathPart(null);
			assertEquals("--", neoPathParam.generateCypher());
			
			//With a NeoSimpleEdge
			buildMockSimpleEdge();
			neoPathParam.setNeoPathPart(super.mockSimpleEdge);
			assumeNotNull(neoPathParam.getNeoPathPart());
			assertEquals("-[varElementEdge1]-", neoPathParam.generateCypher()); 
			
			//With a NeoComplexEdge	
			NeoComplexEdge neoComplexEdge = FACTORY.createNeoComplexEdge();
			MockNeoSimpleEdgeImplClass mockNeoSimpleEdgeImplClass1 = buildTheMockNeoSimpleEdgeImplClass();
			Mockito.when(mockNeoSimpleEdgeImplClass1.isLastEdge()).thenReturn(false);
			buildMockSimpleEdge();
			MockNeoSimpleEdgeImplClass mockNeoSimpleEdgeImplClass2 = buildTheMockNeoSimpleEdgeImplClass();
			Mockito.when(mockNeoSimpleEdgeImplClass2.generateCypher()).thenReturn("-"+ VARIABLE_EAGE_TWO_CLAMPED + "-");
			Mockito.when(mockNeoSimpleEdgeImplClass2.isLastEdge()).thenReturn(true);
			Mockito.when(mockNeoSimpleEdgeImplClass2.getNeoLastEdge()).thenReturn(mockNeoSimpleEdgeImplClass2);
			Mockito.when(mockNeoSimpleEdgeImplClass2.getNeoTargetNodeLabels()).thenReturn(null);
			
			neoComplexEdge.addNeoPathPart(mockNeoSimpleEdgeImplClass1);
			neoComplexEdge.addNeoPathPart(mockNeoSimpleEdgeImplClass2);
			neoPathParam.setNeoPathPart(neoComplexEdge);
			assumeTrue(neoPathParam.getNeoPathPart().getNeoPathPartEdgeLeafs().size() == 2);
			assumeNotNull(neoPathParam.getNeoPathPart());
			assertEquals("-[varElementEdge1]--[varElementEdge2]-", neoPathParam.generateCypher());			
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	} 
	
	@Test
	public void generateCypherException() {
		try {
			//Set Empty NeoComplexEdge
			neoPathParam.setNeoPathPart(FACTORY.createNeoComplexEdge());
			assumeNotNull(neoPathParam.getNeoPathPart());
			assertThrows(InvalidityException.class, () -> neoPathParam.generateCypher()); 
			
			//Set Empty NeoComplexEdge --> Which returns null
			NeoComplexEdgeImpl mockNeoComplexEdge = Mockito.mock(NeoComplexEdgeImpl.class);
			Mockito.when(mockNeoComplexEdge.getNeoPathPartEdgeLeafs()).thenReturn(null);
			neoPathParam.setNeoPathPart(mockNeoComplexEdge);
			assumeNotNull(neoPathParam.getNeoPathPart());
			assertThrows(InvalidityException.class, () -> neoPathParam.generateCypher()); 
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	} 

	@Test
	@Override
	public void createParameters() {
		neoPathParam.createParameters();
		assertNotNull(neoPathParam.getNeoPathPart());
	}

	@Override
	public void inputIsValid() {
		// TODO Auto-generated method stub
		
	}

	@Override
	@ParameterizedTest
	@ValueSource(strings = {""})
	public void myToString(String args) {
		buildMockSimpleEdge();		
		neoPathParam.setNeoPathPart(super.mockSimpleEdge);
		assertTrue(neoPathParam.myToString().compareTo("NeoPathParam [1] " + "-" + VARIABLE_EAGE_ONE_CLAMPED  + "-") == 0);	
	}

	@Test
	@Override
	public void getRelationNumber() {
		try {
			NeoElementEdge neoEdge = FACTORY.createNeoElementEdge();
			Field f = super.getInternalIdField();
			
			Class obj = neoPathParam.getClass();
			Method m = super.getMethodGetRelationNumber(obj);
			m.setAccessible(true);
			
			//If No NeoEdge is set return -1			
			assertEquals(-1, m.invoke(neoPathParam));
			
			//NeoEdge is set with the Id 1
			neoPathParam.setNeoElementEdge(neoEdge);
			f.set(neoEdge, 1);
			assumeNotNull(neoPathParam.getNeoElementEdge());
			assertEquals(1, m.invoke(neoPathParam));
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	//FACTORY and HELPERS
	private abstract class MockNeoSimpleEdgeImplClass extends NeoSimpleEdgeImpl {
		@Override
		protected abstract boolean isLastEdge();
	}
	
	private MockNeoSimpleEdgeImplClass buildTheMockNeoSimpleEdgeImplClass() {
		MockNeoSimpleEdgeImplClass mockNeoSimpleEdgeImplClass = null;
		try {
			mockNeoSimpleEdgeImplClass = Mockito.mock(MockNeoSimpleEdgeImplClass.class);
			String variableEdgeOne = VARIABLE_EDGE_ONE;
			Mockito.when(mockNeoSimpleEdgeImplClass.getCypherVariable()).thenReturn(variableEdgeOne);
			EList<NeoPathPart> l = new BasicEList<NeoPathPart>();
			l.add(mockNeoSimpleEdgeImplClass);
			Mockito.when(mockNeoSimpleEdgeImplClass.getNeoPathPartEdgeLeafs()).thenReturn(l);
			Mockito.when(mockNeoSimpleEdgeImplClass.generateCypher()).thenReturn("-"+ VARIABLE_EAGE_ONE_CLAMPED + "-");
			
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
		return mockNeoSimpleEdgeImplClass;
	}
}
