package qualitypatternmodel.cypherclasstester.concretetests;

import static org.junit.Assume.assumeNotNull;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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

import qualitypatternmodel.adaptionNeo4J.NeoAbstractNode;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.cypherclasstester.NeoAbstractNodeTest;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.impl.NodeImpl;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.utility.CypherSpecificConstants;


//CHECK IF THE REGEX ARE CORRECT !!!
@DisplayName("NeoNode Tests")
public class Neo01NodeTest extends NeoAbstractNodeTest {
	NeoNode neoNode;
	
	@BeforeAll
    static void initAll() {
		
    }
	
	@BeforeEach
	public void setUp() {
		super.setUp(FACTORY.createNeoNode());
		neoNode = (NeoNode) super.neoAbstractNode;
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
	@ValueSource(strings = {"", "Regesta", "IndexPlace", "IndexEntry" })
	public void addLabel(String labels) {
		String label = labels;
		assertDoesNotThrow(() -> neoNode.addLabel(label));

		EList<String> labelList = neoNode.getNeoNodeLabels().getValues();
		assumeNotNull(labelList);
		
		assertTrue(labelList.size() == 1);
		assertEquals(label, labelList.get(0));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {",Regesta,IndexPlace", "Regesta,IndexPlace", "Regesta,IndexPlace,IndexEntry"})
	public void multiLabel(String labelsParam) {
		String[] labels = labelsParam.split(",");
		for (String label : labels) {
			assertDoesNotThrow(() ->  neoNode.addLabel(label));
		}
		EList<String> labelList = neoNode.getNeoNodeLabels().getValues();
		assumeNotNull(labelList);
		
		assertTrue(labels.length == labelList.size());
		for (int i = 0; i < labels.length; i++) {
			assertEquals(labels[i], labelList.get(i));
		}
	}
	
	@ParameterizedTest
	@ValueSource(strings = {",Regesta,,Regesta","Regesta,IndexThing,Regesta,IndexThing"})
	public void setSameLabels(String labelsParam) {
		String[] labels = labelsParam.split(",");
		for (String label : labels) {
			assertDoesNotThrow(() ->  neoNode.addLabel(label));
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
		assertThrows(InvalidityException.class, () -> neoNode.addLabel(label));
	}
	
	@Test
	public void setNeoNodeLabelsThrowInvalidityException() {
		TextListParam textListParam = new TextListParamImpl();
		textListParam.addStringValue("Regesta");
		textListParam.addStringValue("Regesta");
		textListParam.addStringValue(" ");
		assertThrows(InvalidityException.class, () -> neoNode.setNeoNodeLabels(textListParam));
	}
	
	@Test
	public void asd() {
		assertDoesNotThrow(() -> {neoNode.setNeoNodeLabels(null);
			neoNode.setNeoNodeLabels(new TextListParamImpl());
			});
	}

	@Override
	@ParameterizedTest
	@ValueSource(ints = {1,10,100,1000})
	public void getCypherVariable(int number) {
		int id = number;
		try {
			NeoAbstractNode node = super.neoAbstractNode;
			initGetCypherVariableTest(node, id);
			String variable;
			variable = assertDoesNotThrow(() -> {return node.getCypherVariable();});
		    assertTrue(variable.matches(CypherSpecificConstants.VARIABLE_NODE + "[1-9][0-9]*")); //--> Checks if the first is the normal prefix + the last digitis are numbers 
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	@Override
	@ParameterizedTest
	@ValueSource(ints = {0,-1,-10,-100,-1000})
	public void getCypherVariableNotValidNumber(int number) {
		int id = number;
		try {
			NeoAbstractNode node = super.neoAbstractNode;
			initGetCypherVariableTest(node, id);
			String variable;
			variable = assertDoesNotThrow(() -> {return node.getCypherVariable();});
		    assertFalse(variable.matches(CypherSpecificConstants.VARIABLE_NODE + "[1-9][0-9]*")); //--> Checks if the first is the normal prefix + the last digitis are numbers 
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private void initGetCypherVariableTest(NeoAbstractNode node, int id)
			throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		node = super.neoAbstractNode;
		Class obj = node.getClass();
		obj = obj.getSuperclass().getSuperclass().getSuperclass();
		Method m = obj.getMethod("setInternalId", int.class);
		m.setAccessible(true);
		m.invoke(node, id);
		assumeTrue(((NodeImpl) node).getOriginalID() == id);
	}

	@Override
	@ParameterizedTest
	@ValueSource(ints = {1,10,100,1000})
	public void generateCypherReturnVariable(int number) {
		NeoAbstractNode node = super.neoAbstractNode;
		initGetCypherReturnVariableTest(node, number, true);
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1,10,100,1000})
	public void generateCypherReturnVariableDistinct(int number) {
		NeoAbstractNode node = super.neoAbstractNode;
		node.setIsVariableDistinctInUse(false);
		initGetCypherReturnVariableTest(node, number, false);
	}
	
	private void initGetCypherReturnVariableTest(NeoAbstractNode node, int number, boolean isDistinct) {
		int id = number;
		try {
			initGetCypherVariableTest(node, id);
			EMap<Integer, String> variableMap = node.getCypherReturnVariable();
			assumeTrue(variableMap.keySet().stream().count() == 1);
			assumeTrue(variableMap.containsKey(0));
			String variable = variableMap.get(0).getValue();
			if (!isDistinct) {
				assertTrue(variable.matches(CypherSpecificConstants.CYPHER_SPECIAL_FUNCTION_DISTINCT + " (" +CypherSpecificConstants.VARIABLE_NODE + "[1-9][0-9]*[)]{1}"));
			} else {
				assertTrue(variable.matches(CypherSpecificConstants.VARIABLE_NODE + "[1-9][0-9]*"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void toStringTest() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void generateCypher() {
		// TODO Auto-generated method stub
		
	}
}
