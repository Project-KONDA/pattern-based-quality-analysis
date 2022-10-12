package qualitypatternmodel.cypherclasstester.concretetests;

import static org.junit.Assume.assumeNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;

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
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.adaptionNeo4J.impl.NeoNodeImpl;
import qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyEdgeImpl;
import qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyPathParamImpl;
import qualitypatternmodel.adaptionNeo4J.impl.NeoSimpleEdgeImpl;
import qualitypatternmodel.cypherclasstester.NeoAbstractEdgeTest;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.utility.CypherSpecificConstants;


@DisplayName("NeoPropertyEdge Test")
public class Neo02NeoPropertyEdgeTest extends NeoAbstractEdgeTest {
	
	private static final String PLACE_OF_ISSUE = "placeOfIssue";
	private static final String NEO_PROPERTY_EDGE_1 = "NeoPropertyEdgeImpl [1]";
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
	
	@AfterEach
	public void tearDown() {
		super.tearDown();
		neoPropertyEdge = null;
	}
	
	
	//Morphisen in the systemtests?
	@Test
	public void generateCypherPropertyAddressing() {
		try {
			//if no neoPropertyPathParam is set return null
			assertEquals(null, neoPropertyEdge.generateCypherPropertyAddressing());
			
			//Source Node is not set && The case if no neoPropertyPathParam is set
			NeoPropertyPathParamImpl propertyName = (NeoPropertyPathParamImpl) FACTORY.createNeoPropertyPathParam();
			propertyName.setNeoPropertyName(PLACE_OF_ISSUE);
			neoPropertyEdge.setSource(null);
			neoPropertyEdge.setNeoPropertyPathParam(propertyName);
			assertThrows(InvalidityException.class, ()->neoPropertyEdge.generateCypherPropertyAddressing());
			
			assumeNotNull(neoPropertyEdge.getNeoPropertyPathParam());
			//assertEquals(null, neoPropertyEdge.generateCypherPropertyAddressing());
			
			//Get the NodeName from source
			NeoNodeImpl mockNeoNodeImpl = Mockito.mock(NeoNodeImpl.class);
			Mockito.when(mockNeoNodeImpl.getCypherVariable()).thenReturn(VAR_EDGE1);
			neoPropertyEdge.setSource((NeoNodeImpl) mockNeoNodeImpl);
			assumeNotNull(neoPropertyEdge.getSource());
			
			assertTrue(neoPropertyEdge.generateCypherPropertyAddressing().compareTo(VAR_EDGE1 + "." + PLACE_OF_ISSUE) == 0);	
			
			//Get the NodeName from LastSimpleEdge Node
		} catch (Exception e) {
			// TODO: handle exception
		}
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
			assumeNotNull(neoPropertyEdge.getNeoPropertyPathParam());
			assertTrue(neoAbstractEdge.generateCypher().compareTo(VAR_EDGE1_CLAMPED) == 0);
			assertEquals(null, neoAbstractEdge.generateCypher());
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
	@Override
	public void myToString() {
		try {
			assertEquals(NEO_PROPERTY_EDGE_1, neoAbstractEdge.myToString());
			
			NeoPropertyPathParam mockNeoPropertyPathParam = Mockito.mock(NeoPropertyPathParam.class);
			Mockito.when(mockNeoPropertyPathParam.myToString()).thenReturn(NEO_PROPERTY_PATH_PARAM_1);
			Field f = getNeoAbstractPathParamField(NeoPropertyEdgeImpl.class, "neoPropertyPathParam");
			f.set(neoPropertyEdge, mockNeoPropertyPathParam);
			
//			neoEdge.setNeoPathParam(FACTORY.createNeoPathParam()); //DUE TO EMF I CAN NOT SET IT
			assertEquals(NEO_PROPERTY_EDGE_1 + " " + NEO_PROPERTY_PATH_PARAM_1, neoAbstractEdge.myToString());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	//Think about it otherwise should be from the systemtests
	@Test
	@Override
	public void createParameters() {
		neoAbstractEdge.createParameters();
		assertNull(neoPropertyEdge.getNeoPropertyPathParam());
		assertNull(neoPropertyEdge.getParameterList());	
	}

	@Override
	@ParameterizedTest
	@ValueSource(ints = {1,10,100,1000})
	public void getCypherReturnVariable(int number) {
		try {
			NeoAbstractPathParam neoAbstractPathParam = FACTORY.createNeoPropertyPathParam();
			((NeoPropertyPathParam) neoAbstractPathParam).setNeoPathPart(null);
			neoPropertyEdge.setNeoPropertyPathParam((NeoPropertyPathParam) neoAbstractPathParam);
			assumeNotNull(neoPropertyEdge.getNeoPropertyPathParam());
			assertEquals(null, neoPropertyEdge.getCypherReturnVariable());
			
			NeoSimpleEdgeImpl mockNeoSimpleEdgeImpl = prepaireMockObjNeoSimpleEdge(number);
			((NeoPropertyPathParam) neoAbstractPathParam).setNeoPathPart(mockNeoSimpleEdgeImpl);
			
			initGetCypherReturnVariableTest(neoAbstractEdge, number);
			String variable = neoPropertyEdge.getCypherReturnVariable().get(0).getValue();
			assertTrue(variable.matches(CypherSpecificConstants.VARIABLE_EGDE + "[1-9][0-9]*"));
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(false);
		}
	}
	
	@Test
	public void getCypherReturnVariableException() {
		try {
			assertNull(neoPropertyEdge.getNeoPropertyPathParam());
			assertThrows(InvalidityException.class, () -> neoPropertyEdge.getCypherReturnVariable());			
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(false);
		}
	}
}
