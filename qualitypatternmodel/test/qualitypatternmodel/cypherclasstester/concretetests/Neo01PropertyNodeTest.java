package qualitypatternmodel.cypherclasstester.concretetests;

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
import org.mockito.Mockito;

import qualitypatternmodel.adaptionNeo4J.NeoPathPart;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyNode;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
import qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyNodeImpl;
import qualitypatternmodel.cypherclasstester.NeoAbstractNodeTest;
import qualitypatternmodel.exceptions.InvalidityException;
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

	}
	
	//@Test
	public void isNodeReturnable() {
		try {
			Class obj = NeoPropertyNodeImpl.class;
			Method m = obj.getDeclaredMethod("isNodeReturnable", null);
			m.setAccessible(true);
			m.invoke(neoPropertyNode);
			//generateNeoPropertyEdge(true);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	@Test
	public void isNodeReturnableNot() {
		try {
			Class obj = NeoPropertyNodeImpl.class;
			Method m = obj.getDeclaredMethod("isNodeReturnable", null);
			m.setAccessible(true);
			assertThrows(InvalidityException.class, () -> m.invoke(neoPropertyNode));
			Field field = getIncomingField();
			field.set(neoPropertyNode, null);
			assertThrows(InvalidityException.class, () -> m.invoke(neoPropertyNode));
		} catch (Exception e) {
			System.out.println(e);
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
			
//			m.invoke(neoPropertyNode);
//			int i;
//			assertThrows(InvalidityException.class, () -> m.invoke(neoPropertyNode));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	private NeoPropertyEdge generateNeoPropertyEdge(boolean withNeoPathPart) {
		NeoPropertyEdge neoPropertyEdge = FACTORY.createNeoPropertyEdge();
		NeoPropertyPathParam neoPropertyPathParam = FACTORY.createNeoPropertyPathParam();
		
		if (withNeoPathPart) {
			NeoSimpleEdge mockNeoSimpleEdge = Mockito.mock(NeoSimpleEdge.class);
			//Mockito.when(mockNeoSimpleEdge.generateCypherNodeVariable()).thenReturn();
			neoPropertyPathParam.setNeoPathPart((NeoPathPart) mockNeoSimpleEdge);
		} else {
			neoPropertyPathParam.setNeoPathPart((NeoPathPart) null);
		}
		
		return neoPropertyEdge;
	}
	
	@Test
	public void generateCypherNodeVariable() {
		int id = GENERIC_NODE_ID;
		try {
			String variable = buildNeoPropertyNode(id);
		    assertTrue(variable.compareTo("(" + CypherSpecificConstants.VARIABLE_PROPERTY_NODE + id + ")") == 0);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private String buildNeoPropertyNode(int id) throws NoSuchMethodException, IllegalAccessException,
			InvocationTargetException, NoSuchFieldException, InvalidityException {
		initGetCypherVariableTest(neoPropertyNode, id);
		Field field = getIncomingField();
		EList<Relation> relations = new BasicEList<Relation>();
		NeoPropertyEdge mockNeoPropertyEdge = Mockito.mock(NeoPropertyEdge.class);
		Mockito.when(mockNeoPropertyEdge.generateCypherNodeVariable()).thenReturn("(" + CypherSpecificConstants.VARIABLE_PROPERTY_NODE + id + ")");
		relations.add(mockNeoPropertyEdge);
		field.set(neoPropertyNode, relations);
		String variable = neoPropertyNode.generateCypherNodeVariable();
		return variable;
	}
	
	@Test
	public void generateCypherNodeVariableNoIncomingEdge() {		
		assertThrows(InvalidityException.class, () -> neoPropertyNode.generateCypherNodeVariable());
		try {
			neoPropertyNode = FACTORY.createNeoPropertyNode();
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
	
	//Needs to be reworked!!! --> maybe not needed since toString is autogenerated
	@Override
	public void toStringTest(int numbers) {
		// TODO Auto-generated method stub
	}

	@Override
	public void getCypherVariable(int number) {

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
		try {
			this.buildNeoPropertyNode(GENERIC_NODE_ID);
			String temp = neoPropertyNode.generateCypher();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
