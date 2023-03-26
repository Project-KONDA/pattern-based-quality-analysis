package junittests.adaptionneo4jtests.concretetests;

import static org.junit.Assert.assertNull;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;

import junittests.adaptionneo4jtests.NeoNodeTest;
import qualitypatternmodel.adaptionneo4j.NeoNode;
import qualitypatternmodel.adaptionneo4j.NeoPathPart;
import qualitypatternmodel.adaptionneo4j.NeoPropertyEdge;
import qualitypatternmodel.adaptionneo4j.NeoPropertyNode;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;
import qualitypatternmodel.adaptionneo4j.impl.NeoPropertyEdgeImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.impl.NodeImpl;
import qualitypatternmodel.utility.CypherSpecificConstants;

@DisplayName("NeoPropertyNode Tests")
public class NeoPropertyNodeTest extends NeoNodeTest {
	NeoPropertyNode neoPropertyNode = null;

	
	@BeforeAll
    static void initAll() throws NoSuchMethodException, SecurityException {

	}
	
	@BeforeEach
	public void setUp() {
		super.setUp(FACTORY.createNeoPropertyNode());
		neoPropertyNode = (NeoPropertyNode) super.neoAbstractNode;
	}
	
	@AfterEach
	public void tearDown() {
		super.tearDown();
		neoPropertyNode = null;
	}
	
	@AfterAll
	static void tearDownAll() {

    }
	
	@Test
	public void generateCypherPropertyAddressing() {
		try {
			String placeOfIssue = "placeOfIssue";
			String propertyAddress = CypherSpecificConstants.VARIABLE_PROPERTY_NODE + GENERIC_NODE_ID + placeOfIssue;
			Field field = getIncomingField();
			EList<Relation> relations = new BasicEList<Relation>();
			NeoPropertyEdge mockNeoPropertyEdge = Mockito.mock(NeoPropertyEdge.class);
			Mockito.when(mockNeoPropertyEdge.generateCypherPropertyAddressing()).thenReturn(propertyAddress);
			NeoPropertyPathParam mockNeoPropertyPathParam = Mockito.mock(NeoPropertyPathParam.class);
			Mockito.when(mockNeoPropertyEdge.getNeoPropertyPathParam()).thenReturn(mockNeoPropertyPathParam);
			Mockito.when(mockNeoPropertyPathParam.getNeoPropertyName()).thenReturn(placeOfIssue);
			relations.add(mockNeoPropertyEdge);
			field.set(neoPropertyNode, relations);
			EList<String> temp = neoPropertyNode.generateCypherPropertyAddressing();
			assertTrue(temp.get(0).compareTo(propertyAddress) == 0);
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		} 
	}
	
	@Test
	public void generateCypherPropertyAddressingEmptyReturn() {
		try {
			Field field = getIncomingField();
			EList<Relation> relations = new BasicEList<Relation>();
			field.set(neoPropertyNode, relations);
			assertTrue(neoPropertyNode.generateCypherPropertyAddressing().size() == 0);
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		} 
	}
	
	@Test
	public void generateCypherNodeVariable() {
		int id = GENERIC_NODE_ID;
		try {
			initGetCypherVariableTest(neoPropertyNode, id);
			Field field = getIncomingField();
			EList<Relation> relations = new BasicEList<Relation>();
			NeoPropertyEdgeImpl mockNeoPropertyEdge = Mockito.mock(NeoPropertyEdgeImpl.class);
			Mockito.when(mockNeoPropertyEdge.getCypherNodeVariable()).thenReturn(CypherSpecificConstants.VARIABLE_PROPERTY_NODE + id);
			NeoPropertyPathParam mockParam = Mockito.mock(NeoPropertyPathParam.class);
			Mockito.when(mockNeoPropertyEdge.getNeoPropertyPathParam()).thenReturn(mockParam);
			Mockito.when(mockParam.getNeoPathPart()).thenReturn(Mockito.mock(NeoPathPart.class));
			relations.add(mockNeoPropertyEdge);
			field.set(neoPropertyNode, relations);
			
			String[] variable = neoPropertyNode.getCypherVariable().split(CypherSpecificConstants.SEPERATOR);
		    assertTrue(variable[0].compareTo(CypherSpecificConstants.VARIABLE_PROPERTY_NODE + id) == 0);
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	@Override
	@ParameterizedTest
	@ValueSource(ints = {1,10,100,1000})
	public void getCypherVariable(int number) {
		int id = number;
		try {
			//Change hier the Variable
			//Just One
			neoPropertyNode = FACTORY.createNeoPropertyNode();
			NeoPropertyEdge neoPropertyEdge = prepaireValidPropertyEdgeStructure(id);
			initGetCypherVariableTest(neoPropertyNode, id);
			Field field = getIncomingField();
			EList<Relation> rList = new BasicEList<Relation>();
			rList.add(neoPropertyEdge);
			field.set(neoPropertyNode, rList);
			
			String[] variable = neoPropertyNode.getCypherVariable().split(CypherSpecificConstants.SEPERATOR);
		    assertTrue(variable[0].compareTo(CypherSpecificConstants.VARIABLE_PROPERTY_NODE + id + "_1") == 0);
		    
		    //With multiple incomings
		    neoPropertyNode = FACTORY.createNeoPropertyNode();
		    neoPropertyEdge = prepaireValidPropertyEdgeStructure(id);
		    NeoPropertyEdge neoPropertyEdge2 = prepaireValidPropertyEdgeStructure(id+1);
		    initGetCypherVariableTest(neoPropertyNode, id);
		    initGetCypherVariableTest(neoPropertyEdge2, id+1);
		    field = getIncomingField();
		    rList.clear();;
		    rList.add(neoPropertyEdge);
		    rList.add(neoPropertyEdge2);
		    field.set(neoPropertyNode, rList);
		    
		    variable = neoPropertyNode.getCypherVariable().split(CypherSpecificConstants.SEPERATOR);
		    assertTrue(variable[0].compareTo(CypherSpecificConstants.VARIABLE_PROPERTY_NODE + id + "_1") == 0);
		    int suffix = (id + 1);
		    assertTrue(variable[1].compareTo(CypherSpecificConstants.VARIABLE_PROPERTY_NODE + id + "_" + suffix) == 0);
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	@Test
	private void getCypherPropertyNodeVariableEmpty() {
		assertDoesNotThrow(() -> neoPropertyNode.getCypherVariable());
		try {
			assertNull(neoPropertyNode.getCypherVariable());
		} catch (InvalidityException e) {
			assertFalse(true);
		}
	}
	
	@Override
	@ParameterizedTest
	@ValueSource(ints = {1,10,100,1000})
	public void getCypherReturnVariable(int number) {
		try {
			NeoPropertyEdge neoPropertyEdge = prepaireValidPropertyEdgeStructure(GENERIC_NODE_ID);
			initGetCypherVariableTest(neoPropertyNode, GENERIC_NODE_ID);
			Field field = getIncomingField();
			EList<Relation> rList = new BasicEList<Relation>();
			rList.add(neoPropertyEdge);
			field.set(neoPropertyNode, rList);
			initGetCypherReturnVariableTest(super.neoAbstractNode, GENERIC_NODE_ID);
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	@Override
	public void generateCypher() {
		assertThrows(UnsupportedOperationException.class, () -> neoPropertyNode.generateCypher());
	}

	@Test
	@Override
	public void myToString() {
		final String string = "NeoPropertyNodeImpl Property 1 [1]";
		assertDoesNotThrow(() -> initGetCypherVariableTest(neoPropertyNode, 1));
		assertTrue(neoPropertyNode.myToString().compareTo(string) == 0);
	}

	@Test
	@Override
	public void toStringT() {
		assertDoesNotThrow(() -> initGetCypherVariableTest(neoPropertyNode, 1));
		final String prefix = "qualitypatternmodel.adaptionneo4j.impl.NeoPropertyNodeImpl@";
		assertTrue(neoPropertyNode.toString().startsWith(prefix));
		final String suffix = ", internalId: 1) (name: null, returnNode: false, typeModifiable: true, translated: false, predicatesAreBeingTranslated: false)";
		assertTrue(neoPropertyNode.toString().endsWith(suffix));
	}
	
	//FACTORIES- and HELPER-methods
	private void initGetCypherReturnVariableTest(NeoNode node, int number) {
		int id = number;
		try {
			initGetCypherVariableTest(node, id);
			final String propertyName = "summary";
			((NeoPropertyEdge) neoPropertyNode.getIncoming().get(0)).getNeoPropertyPathParam().setNeoPropertyName(propertyName);
			EMap<Integer, String> variableMap = node.getCypherReturn();
			assumeTrue(variableMap.keySet().stream().count() == 1);
			assumeTrue(variableMap.containsKey(1));
			String variable = variableMap.get(0).getValue();
			assertTrue(variable.matches(CypherSpecificConstants.VARIABLE_PROPERTY_NODE + "[1-9][0-9]*" + "_" + "[1-9][0-9]*" + "." + propertyName));
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	//FACTORIES- and HELPER methods
	private NeoPropertyEdge prepaireValidPropertyEdgeStructure(int id) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InvalidityException {
		NeoPropertyEdge neoPropertyEdge = FACTORY.createNeoPropertyEdge();
		initGetCypherVariableTest(neoPropertyEdge, GENERIC_NODE_ID);
		NeoPropertyPathParam neoPropertyPathParam = FACTORY.createNeoPropertyPathParam();
		NeoSimpleEdge neoSimpleEdge = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.addNeoTargetNodeLabel("Regesta");
		neoPropertyEdge.setNeoPropertyPathParam(neoPropertyPathParam);
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		neoPropertyEdge.setTarget((Node)neoPropertyNode);
		return neoPropertyEdge;
	}
	
	private Field getIncomingField() throws NoSuchFieldException {
		Class<NodeImpl> obj = NodeImpl.class;			
		Field field = obj.getDeclaredField("incoming");
		field.setAccessible(true);
		return field;
	}
}
