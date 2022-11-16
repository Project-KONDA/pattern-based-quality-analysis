package qualitypatternmodel.cypherclasstester.concretetests;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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

import qualitypatternmodel.adaptionneo4j.NeoInterfaceNode;
import qualitypatternmodel.adaptionneo4j.NeoPathPart;
import qualitypatternmodel.adaptionneo4j.NeoPropertyEdge;
import qualitypatternmodel.adaptionneo4j.NeoPropertyNode;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;
import qualitypatternmodel.adaptionneo4j.impl.NeoPropertyNodeImpl;
import qualitypatternmodel.cypherclasstester.NeoAbstractNodeTest;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.impl.NodeImpl;
import qualitypatternmodel.graphstructure.impl.RelationImpl;
import qualitypatternmodel.utility.CypherSpecificConstants;


@DisplayName("NeoPropertyNode Tests")
public class Cypher01NeoPropertyNodeTest extends NeoAbstractNodeTest {
	NeoPropertyNode neoPropertyNode;
	
	@BeforeAll
    static void initAll() {
		
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
			relations.add(null);
			field.set(neoPropertyNode, relations);
			assertThrows(InvalidityException.class, () -> neoPropertyNode.generateCypherPropertyAddressing());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		} 
	}
	
	@Test
	public void setIsReturnProperty() {
		neoPropertyNode.setReturnProperty(true);
		assertTrue(neoPropertyNode.isReturnProperty());
		neoPropertyNode.setReturnProperty(false);
		assertFalse(neoPropertyNode.isReturnProperty());
	}
	
	@Test
	public void isNodeReturnable() {
		try {
			NeoPropertyEdge neoPropertyEdge = prepaireValidPropertyEdgeStructure(GENERIC_NODE_ID);
			Field field = getIncomingField();
			EList<Relation> rList = new BasicEList<Relation>();
			rList.add(neoPropertyEdge);
			field.set(neoPropertyNode, rList);
			
			Class<NeoPropertyNodeImpl> obj = NeoPropertyNodeImpl.class;
			Method m = obj.getDeclaredMethod("isNodeReturnable", int.class);
			m.setAccessible(true);
			assertDoesNotThrow(() -> m.invoke(neoPropertyNode, 0));
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

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
	
	@Test
	public void isNodeReturnableNot() {
		try {
			NeoPropertyNode localNode = neoPropertyNode;
			Class<NeoPropertyNodeImpl> obj = NeoPropertyNodeImpl.class;
			Method m = obj.getDeclaredMethod("isNodeReturnable", int.class);
			m.setAccessible(true);
			Field field = getIncomingField();
			field.set(localNode, (EList<?>) null);
			EList<Relation> rList = new BasicEList<Relation>();
			rList.add(FACTORY.createNeoPropertyEdge());
			rList.add(FACTORY.createNeoPropertyEdge());
			field.set(localNode, rList);
			assertFalse(Boolean.parseBoolean(m.invoke(localNode, 0).toString()));
			rList.clear();
			rList.add((Relation) null);
			checkForInvalidityExceptionInReflation(localNode, m);
			
			EList<Relation> relations = new BasicEList<Relation>();
			relations.add(FACTORY.createNeoPropertyEdge());
			((NeoPropertyEdge) relations.get(0)).setNeoPropertyPathParam(FACTORY.createNeoPropertyPathParam());
			field.set(neoPropertyNode, relations);
			assertFalse(Boolean.parseBoolean(m.invoke(localNode, 0).toString()));
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	private void checkForInvalidityExceptionInReflation(NeoPropertyNode localNode, Method m) {
		try {
			m.invoke(localNode, 0);
			assertFalse(true);
		} catch (Exception e) {
			assertTrue(e.getCause().getClass().equals(InvalidityException.class));
		}
	}
	
	@Test
	public void generateCypherNodeVariable() {
		int id = GENERIC_NODE_ID;
		try {
			initGetCypherVariableTest(neoPropertyNode, id);
			Field field = getIncomingField();
			EList<Relation> relations = new BasicEList<Relation>();
			NeoPropertyEdge mockNeoPropertyEdge = Mockito.mock(NeoPropertyEdge.class);
			Mockito.when(mockNeoPropertyEdge.generateCypherNodeVariable()).thenReturn(CypherSpecificConstants.VARIABLE_PROPERTY_NODE + id);
			NeoPropertyPathParam mockParam = Mockito.mock(NeoPropertyPathParam.class);
			Mockito.when(mockNeoPropertyEdge.getNeoPropertyPathParam()).thenReturn(mockParam);
			Mockito.when(mockParam.getNeoPathPart()).thenReturn(Mockito.mock(NeoPathPart.class));
			relations.add(mockNeoPropertyEdge);
			field.set(neoPropertyNode, relations);
			
			String[] variable = neoPropertyNode.generateCypherNodeVariable().split(CypherSpecificConstants.SEPERATOR);
		    assertTrue(variable[0].compareTo(CypherSpecificConstants.VARIABLE_PROPERTY_NODE + id) == 0);
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

//	//Shall be changed to factory method
//	private void buildNeoPropertyNode(int id) throws NoSuchMethodException, IllegalAccessException,
//	InvocationTargetException, NoSuchFieldException, InvalidityException {
//		initGetCypherVariableTest(neoPropertyNode, id);
//		Field field = getIncomingField();
//		EList<Relation> relations = new BasicEList<Relation>();
//		NeoPropertyEdge mockNeoPropertyEdge = Mockito.mock(NeoPropertyEdge.class);
//		Mockito.when(mockNeoPropertyEdge.generateCypherNodeVariable()).thenReturn(CypherSpecificConstants.VARIABLE_PROPERTY_NODE + id);
//		relations.add(mockNeoPropertyEdge);
//		field.set(neoPropertyNode, relations);
//	}
//	
//	//Shall be changed to factory method
//	private void buildNeoPropertyNodeForGetNodeVariable(int id) throws NoSuchMethodException, IllegalAccessException,
//	InvocationTargetException, NoSuchFieldException, InvalidityException {
//		initGetCypherVariableTest(neoPropertyNode, id);
//		Field field = getIncomingField();
//		EList<Relation> relations = new BasicEList<Relation>();
//		NeoPropertyEdge mockNeoPropertyEdge = Mockito.mock(NeoPropertyEdge.class);
//		Mockito.when(mockNeoPropertyEdge.generateCypherNodeVariable()).thenReturn(CypherSpecificConstants.VARIABLE_PROPERTY_NODE + id);
//		relations.add(mockNeoPropertyEdge);
//		field.set(neoPropertyNode, relations);
//	}
	
	@Test
	public void generateCypherNodeVariableNoIncomingEdge() {		
		assertThrows(InvalidityException.class, () -> neoPropertyNode.generateCypherNodeVariable());
		try {
			Field field = getIncomingField();
			field.set(neoPropertyNode, (EList<?>) null);
			//Something does not work here
			assertThrows(InvalidityException.class, () -> neoPropertyNode.generateCypherNodeVariable());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void generateCypherNodeVariableWrongEdge() {		
		assertThrows(InvalidityException.class, () -> neoPropertyNode.generateCypherNodeVariable());
		try {
			neoPropertyNode = FACTORY.createNeoPropertyNode();
			Field field = getIncomingField();
			EList<Relation> rList = new BasicEList<Relation>();
			rList.add(new RelationImpl());
			field.set(neoPropertyNode, (EList<Relation>) rList);
			assertThrows(InvalidityException.class, () -> neoPropertyNode.generateCypherNodeVariable());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	private Field getIncomingField() throws NoSuchFieldException {
		Class<NodeImpl> obj = NodeImpl.class;			
		Field field = obj.getDeclaredField("incoming");
		field.setAccessible(true);
		return field;
	}

	@Override
	@ParameterizedTest
	@ValueSource(ints = {1,10,100,1000})
	public void getCypherVariable(int number) {
		int id = number;
		try {
			neoPropertyNode = FACTORY.createNeoPropertyNode();
			NeoPropertyEdge neoPropertyEdge = prepaireValidPropertyEdgeStructure(id);
			initGetCypherVariableTest(neoPropertyNode, id);
			Field field = getIncomingField();
			EList<Relation> rList = new BasicEList<Relation>();
			rList.add(neoPropertyEdge);
			field.set(neoPropertyNode, rList);
			
			String[] variable = neoPropertyNode.getCypherVariable().split(CypherSpecificConstants.SEPERATOR);
		    assertTrue(variable[0].compareTo(CypherSpecificConstants.VARIABLE_PROPERTY_NODE + id + "_1") == 0);
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

//	@Override
//	@ParameterizedTest
//	@ValueSource(ints = {0,-1,-10,-100,-1000})
	public void getCypherVariableNotValidNumber(int number) {
		//Is not needed since the counting happens automaticlly
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
	
	//PULL-UP ???
	private void initGetCypherReturnVariableTest(NeoInterfaceNode node, int number) {
		int id = number;
		try {
			initGetCypherVariableTest(node, id);
			EMap<Integer, String> variableMap = node.getCypherReturnVariable();
			assumeTrue(variableMap.keySet().stream().count() == 1);
			assumeTrue(variableMap.containsKey(1));
			String variable = variableMap.get(0).getValue();
			assertTrue(variable.matches(CypherSpecificConstants.VARIABLE_PROPERTY_NODE + "[1-9][0-9]*" + "_" + "[1-9][0-9]*"));
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	@Override
	public void generateCypher() {
		int id = 1;
		try {
			NeoPropertyEdge neoPropertyEdge = prepaireValidPropertyEdgeStructure(GENERIC_NODE_ID);
			initGetCypherVariableTest(neoPropertyNode, GENERIC_NODE_ID);
			Field field = getIncomingField();
			EList<Relation> rList = new BasicEList<Relation>();
			rList.add(neoPropertyEdge);
			field.set(neoPropertyNode, rList);
			
			String[] variable = neoPropertyNode.generateCypher().split(CypherSpecificConstants.SEPERATOR);
		    assertTrue(variable[0].compareTo("(" + CypherSpecificConstants.VARIABLE_PROPERTY_NODE + id + "_" + "1" + ")") == 0);
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
}
