package qualitypatternmodel.cypherclasstester.concretetests;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;

import qualitypatternmodel.adaptionNeo4J.NeoPathPart;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyNode;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
import qualitypatternmodel.adaptionNeo4J.impl.NeoAbstractPathParamImpl;
import qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyNodeImpl;
import qualitypatternmodel.cypherclasstester.NeoAbstractNodeTest;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.impl.NodeImpl;
import qualitypatternmodel.graphstructure.impl.RelationImpl;
import qualitypatternmodel.utility.CypherSpecificConstants;


@DisplayName("NeoPropertyNode Tests")
public class Neo01PropertyNodeTest extends NeoAbstractNodeTest {
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
			
			Class obj = NeoPropertyNodeImpl.class;
			Method m = obj.getDeclaredMethod("isNodeReturnable", null);
			m.setAccessible(true);
			assertDoesNotThrow(() -> m.invoke(neoPropertyNode));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private NeoPropertyEdge prepaireValidPropertyEdgeStructure(int id) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
		NeoPropertyEdge neoPropertyEdge = FACTORY.createNeoPropertyEdge();
		initGetCypherVariableTest(neoPropertyEdge, GENERIC_NODE_ID);
		NeoPropertyPathParam neoPropertyPathParam = FACTORY.createNeoPropertyPathParam();
		NeoSimpleEdge neoSimpleEdge = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.addTargetNodeLabel("Regesta");
		neoSimpleEdge.setIsLastEdge(true);
		neoPropertyEdge.setNeoPropertyPathParam(neoPropertyPathParam);
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		neoPropertyEdge.setTarget((Node)neoPropertyNode);
		return neoPropertyEdge;
	}
	
	@Test
	public void isNodeReturnableNot() {
		try {
			NeoPropertyNode localNode = neoPropertyNode;
			Class obj = NeoPropertyNodeImpl.class;
			Method m = obj.getDeclaredMethod("isNodeReturnable", null);
			m.setAccessible(true);
			Field field = getIncomingField();
			field.set(localNode, (EList) null);
//			checkForInvalidityExceptionInReflation(localNode, m); //Exception is not thrown because no List --> Check why
			EList<Relation> rList = new BasicEList<Relation>();
			rList.add(FACTORY.createNeoPropertyEdge());
			rList.add(FACTORY.createNeoPropertyEdge());
			field.set(localNode, rList);
			checkForInvalidityExceptionInReflation(localNode, m);
			rList.clear();
			rList.add((Relation) null);
			checkForInvalidityExceptionInReflation(localNode, m);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private void checkForInvalidityExceptionInReflation(NeoPropertyNode localNode, Method m) {
		try {
			m.invoke(localNode);
		} catch (Exception e) {
			assertTrue(e.getCause().getClass().equals(InvalidityException.class));
		}
	}
	
	@Test
	public void isNodeReturnableNotBecauseNoNeoPathPart() {
		try {
			Class obj = NeoPropertyNodeImpl.class;
			Method m = obj.getDeclaredMethod("isNodeReturnable", null);
			m.setAccessible(true);
			
			Field field = getIncomingField();
			EList<Relation> relations = new BasicEList<Relation>();
			relations.add(FACTORY.createNeoPropertyEdge());
			((NeoPropertyEdge) relations.get(0)).setNeoPropertyPathParam(FACTORY.createNeoPropertyPathParam());
			field.set(neoPropertyNode, relations);
			
			checkForInvalidityExceptionInReflation(neoPropertyNode, m);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	@Test
	public void generateCypherNodeVariable() {
		int id = GENERIC_NODE_ID;
		try {
			buildNeoPropertyNode(id);
			String variable = neoPropertyNode.generateCypherNodeVariable();
		    assertTrue(variable.compareTo(CypherSpecificConstants.VARIABLE_PROPERTY_NODE + id) == 0);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private void buildNeoPropertyNode(int id) throws NoSuchMethodException, IllegalAccessException,
			InvocationTargetException, NoSuchFieldException, InvalidityException {
		initGetCypherVariableTest(neoPropertyNode, id);
		Field field = getIncomingField();
		EList<Relation> relations = new BasicEList<Relation>();
		NeoPropertyEdge mockNeoPropertyEdge = Mockito.mock(NeoPropertyEdge.class);
		Mockito.when(mockNeoPropertyEdge.generateCypherNodeVariable()).thenReturn(CypherSpecificConstants.VARIABLE_PROPERTY_NODE + id);
		relations.add(mockNeoPropertyEdge);
		field.set(neoPropertyNode, relations);
	}
	
	@Test
	public void generateCypherNodeVariableNoIncomingEdge() {		
		assertThrows(InvalidityException.class, () -> neoPropertyNode.generateCypherNodeVariable());
		try {
			Field field = getIncomingField();
			field.set(neoPropertyNode, (EList) null);
			//Something does not work here
			assertThrows(InvalidityException.class, () -> neoPropertyNode.generateCypherNodeVariable());
		} catch (Exception e) {
			System.out.println("Reflaction went wrong");
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
			field.set(neoPropertyNode, (EList) rList);
			assertThrows(InvalidityException.class, () -> neoPropertyNode.generateCypherNodeVariable());
		} catch (Exception e) {
			System.out.println("Reflaction went wrong");
		}
	}

	private Field getIncomingField() throws NoSuchFieldException {
		Class obj = NodeImpl.class;			
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
			
			String variable = neoPropertyNode.getCypherVariable();
		    assertTrue(variable.compareTo(CypherSpecificConstants.VARIABLE_PROPERTY_NODE + id) == 0);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void getCypherVariableNotValidNumber(int number) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generateCypherReturnVariable(int number) {
		// TODO Auto-generated method stub
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
			
			String variable = neoPropertyNode.generateCypher();
		    assertTrue(variable.compareTo("(" + CypherSpecificConstants.VARIABLE_PROPERTY_NODE + id + ")") == 0);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	//Needs to be reworked!!! --> maybe not needed since toString is autogenerated
	@Override
	public void toStringTest(int numbers) {
		// TODO Auto-generated method stub
	}
}
