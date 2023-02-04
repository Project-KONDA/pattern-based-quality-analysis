package qualitypatternmodel.cypherclasstests.concretetests;

import static org.junit.Assert.assertNull;
import static org.junit.Assume.assumeNotNull;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

import qualitypatternmodel.adaptionneo4j.NeoNode;
import qualitypatternmodel.adaptionneo4j.NeoNodeLabelsParam;
import qualitypatternmodel.adaptionneo4j.NeoElementNode;
import qualitypatternmodel.adaptionneo4j.impl.NeoElementNodeImpl;
import qualitypatternmodel.cypherclasstests.NeoNodeTest;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.parameters.impl.ParameterListImpl;
import qualitypatternmodel.utility.CypherSpecificConstants;

@DisplayName("NeoElementNode Tests")
public class Cypher01NeoElementNodeTest extends NeoNodeTest {
	private static final String VAR_NODE1 = "(varElementNode1)";
	private static final String VAR_NODE1_REGESTA_INDEX_PLACE = "(varElementNode1:Regesta:IndexPlace)";
	NeoElementNode neoNode;
	
	@BeforeAll
    static void initAll() {
		
    }
	
	@BeforeEach
	public void setUp() {
		super.setUp(FACTORY.createNeoElementNode());
		neoNode = (NeoElementNode) super.neoAbstractNode;
	}
	
	@AfterEach
	public void tearDown() {
		super.tearDown();
		neoNode = null;
	}
	
	@AfterAll
	static void tearDownAll() {
		
    }
		
	@ParameterizedTest
	@ValueSource(strings = {"Regesta1", "Regesta2", "IndexPlace", "IndexEntry" })
	public void addLabel(String labels) {
		String label = labels;
		assertDoesNotThrow(() -> neoNode.addNeoLabel(label));

		EList<String> labelList = neoNode.getNeoNodeLabels().getValues();
		assumeNotNull(labelList);
		
		assertTrue(labelList.size() == 1);
		assertEquals(label, labelList.get(0));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"1,Regesta,IndexPlace", "Regesta,IndexPlace", "Regesta,IndexPlace,IndexEntry"})
	public void multiLabel(String labelsParam) {
		String[] labels = labelsParam.split(",");
		for (String label : labels) {
			assertDoesNotThrow(() ->  neoNode.addNeoLabel(label));
		}
		EList<String> labelList = neoNode.getNeoNodeLabels().getValues();
		assumeNotNull(labelList);
		
		assertTrue(labels.length == labelList.size());
		for (int i = 0; i < labels.length; i++) {
			assertEquals(labels[i], labelList.get(i));
		}
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Regesta,IndexThing,Regesta,IndexThing"})
	public void setSameLabels(String labelsParam) {
		String[] labels = labelsParam.split(",");
		for (String label : labels) {
			assertDoesNotThrow(() ->  neoNode.addNeoLabel(label));
		}
		EList<String> labelList = neoNode.getNeoNodeLabels().getValues();
		assumeNotNull(labelList);
		
		assertTrue(labels.length - 2 == labelList.size());
		assertEquals(labels[0], labelList.get(0));
		assertEquals(labels[1], labelList.get(1));
	}
	
	@Test
	public void addLabelThrowInvalidityException() {
		String label = " ";
		assertThrows(InvalidityException.class, () -> neoNode.addNeoLabel(label));
	}

	@Override
	@ParameterizedTest
	@ValueSource(ints = {1,10,100,1000})
	public void getCypherVariable(int number) {
		int id = number;
		try {
			NeoNode node = super.neoAbstractNode;
			initGetCypherVariableTest(node, id);
			String variable;
			variable = assertDoesNotThrow(() -> {return node.getCypherVariable();});
		    assertTrue(variable.matches(CypherSpecificConstants.VARIABLE_ELEMENT_NODE + "[1-9][0-9]*")); //--> Checks if the first is the normal prefix + the last digitis are numbers 
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@ParameterizedTest
	@ValueSource(ints = {0,-1,-10,-100,-1000})
	public void getCypherVariableNotValidNumber(int number) {
		int id = number;
		try {
			NeoNode node = super.neoAbstractNode;
			initGetCypherVariableTest(node, id);
			String variable;
			variable = assertDoesNotThrow(() -> {return node.getCypherVariable();});
		    assertFalse(variable.matches(CypherSpecificConstants.VARIABLE_ELEMENT_NODE + "[1-9][0-9]*")); 
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	@Override
	@ParameterizedTest
	@ValueSource(ints = {1,10,100,1000})
	public void getCypherReturnVariable(int number) {
		NeoNode node = super.neoAbstractNode;
		initGetCypherReturnVariableTest(node, number, true);
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1,10,100,1000})
	public void generateCypherReturnVariableDistinct(int number) {
		NeoNode node = super.neoAbstractNode;
		((NeoElementNode) node).setIsVariableDistinctInUse(false);
		initGetCypherReturnVariableTest(node, number, false);
	}
	
	private void initGetCypherReturnVariableTest(NeoNode node, int number, boolean isDistinct) {
		int id = number;
		try {
			initGetCypherVariableTest(node, id);
			EMap<Integer, String> variableMap = node.getCypherReturn();
			assumeTrue(variableMap.keySet().stream().count() == 1);
			assumeTrue(variableMap.containsKey(0));
			String variable = variableMap.get(0).getValue();
			if (!isDistinct) {
				assertTrue(variable.matches(CypherSpecificConstants.CYPHER_SPECIAL_FUNCTION_DISTINCT + " \\(" +CypherSpecificConstants.VARIABLE_ELEMENT_NODE + "[1-9][0-9]*[)]+"));
			} else {
				assertTrue(variable.matches(CypherSpecificConstants.VARIABLE_ELEMENT_NODE + "[1-9][0-9]*"));
			}
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Override
	@Test
	public void generateCypher() {
		NeoNode node = super.neoAbstractNode;
		try {
			initGetCypherVariableTest(node, GENERIC_NODE_ID);
			NeoNodeLabelsParam labels = FACTORY.createNeoNodeLabelsParam();
			EList<String> labelList = new BasicEList<String>();
			labelList.add("Regesta");
			labelList.add("IndexPlace");
			labels.setValueIfValid(labelList);
			((NeoElementNodeImpl) node).setNeoNodeLabels(labels);
			((NeoElementNodeImpl) node).setTranslated(false);
			String cypher = ((NeoElementNodeImpl) node).generateCypher();
			assertTrue(cypher.compareTo(VAR_NODE1_REGESTA_INDEX_PLACE) == 0);
			cypher = ((NeoElementNodeImpl) node).generateCypher();
			assertTrue(cypher.compareTo(VAR_NODE1) == 0);
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void generateCypherWithNoLabels() {
		NeoNode node = super.neoAbstractNode;
		try {
			initGetCypherVariableTest(node, GENERIC_NODE_ID);
			((NeoElementNodeImpl) node).setNeoNodeLabels(null);
			((NeoElementNodeImpl) node).setTranslated(false);
			String cypher = ((NeoElementNodeImpl) node).generateCypher();
			assertTrue(cypher.compareTo(VAR_NODE1) == 0);
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	@Test
	@Override
	public void myToString() {
		assertDoesNotThrow(() -> initGetCypherVariableTest(neoNode, 1));
		final String temp = neoNode.myToString();
		assertTrue(temp.toString().compareTo("NeoElementNodeImpl Element 1 [1]") == 0);			
	}
	
	@Test
	@Override
	public void toStringT() {
		final String suffix = "(name: testNode, returnNode: false, typeModifiable: true, translated: false, predicatesAreBeingTranslated: false)"
				+ " " + "(neoPlace: FOLLOWING, isVariableDistinctInUse: true)";
		assertDoesNotThrow(() -> initGetCypherVariableTest(neoNode, 1));
		neoNode.setIsVariableDistinctInUse(true);
		neoNode.setName("testNode");
		assertDoesNotThrow(() -> neoNode.addNeoLabel("REGESTA"));
		final String temp = neoNode.toString();
		assertTrue(temp.endsWith(suffix));
	}
	
	@Test
	public void createParamters() {
		final ParameterListImpl list = new ParameterListImpl(null);
		NeoElementNodeImpl mockNeoElementNode = Mockito.mock(NeoElementNodeImpl.class);
		Mockito.doCallRealMethod().when(mockNeoElementNode).createParameters();
		Mockito.doCallRealMethod().when(mockNeoElementNode).getNeoNodeLabels();
		Mockito.when(mockNeoElementNode.getNeoNodeLabels()).thenCallRealMethod();
		Mockito.when(mockNeoElementNode.getParameterList()).thenReturn(null).
									thenReturn(list);
		
		//Try to fill empty list
		mockNeoElementNode.createParameters();
		assertNull(mockNeoElementNode.getNeoNodeLabels());
		
		//List has the gets the label instance
		assertNull(mockNeoElementNode.getNeoNodeLabels());
		mockNeoElementNode.createParameters();
		NeoNodeLabelsParam neoNodeLabelsParam = null;
		try {
			assertTrue(list.getParameters().get(0) != null);
			neoNodeLabelsParam = (NeoNodeLabelsParam) list.getParameters().get(0);
		} catch (Exception e) {
			assertFalse(true);
		}
		
		//Do it again --> No changes
		Mockito.when(mockNeoElementNode.getNeoNodeLabels()).thenReturn((NeoNodeLabelsParam) list.getParameters().get(0));
		mockNeoElementNode.createParameters();
		assumeNotNull(list.getParameters().get(0));
		
		assertEquals(neoNodeLabelsParam, list.getParameters().get(0));
		
		//A label is already set 
		final NeoNodeLabelsParam labels = FACTORY.createNeoNodeLabelsParam();
		Mockito.when(mockNeoElementNode.getNeoNodeLabels()).thenReturn(labels);
		mockNeoElementNode.createParameters();
		try {
			assertTrue(list.getParameters().get(0) != null);
			neoNodeLabelsParam = (NeoNodeLabelsParam) list.getParameters().get(1);
		} catch (Exception e) {
			assertFalse(true);
		}
		assertEquals(labels, neoNodeLabelsParam);
	}
}
