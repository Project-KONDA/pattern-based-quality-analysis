package junittests.adaptionneo4jtests.concretetests;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assume.assumeNotNull;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Field;
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

import junittests.adaptionneo4jtests.NeoPathPartTest;
import qualitypatternmodel.adaptionneo4j.NeoComplexEdge;
import qualitypatternmodel.adaptionneo4j.NeoDirection;
import qualitypatternmodel.adaptionneo4j.NeoEdgeLabelParam;
import qualitypatternmodel.adaptionneo4j.NeoElementPathParam;
import qualitypatternmodel.adaptionneo4j.NeoNodeLabelsParam;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;
import qualitypatternmodel.adaptionneo4j.impl.NeoPathParamImpl;
import qualitypatternmodel.adaptionneo4j.impl.NeoElementPathParamImpl;
import qualitypatternmodel.adaptionneo4j.impl.NeoPropertyPathParamImpl;
import qualitypatternmodel.adaptionneo4j.impl.NeoSimpleEdgeImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.utility.ConstantsNeo;

@DisplayName("NeoSimpleEdge Test")
public class NeoSimpleEdgeTest extends NeoPathPartTest {
	private static final String VAR_ELEMENT_EDGE_1_TEST_LABEL_INT_EG_NODE_1_TEST_LABEL = "-[varEEdge-1:testLabel]-(varEgNode-1:testLabel)";
	private static final String VAR_ELEMENT_EDGE_1_INT_EG_NODE_1_TEST_LABEL = "-[varEEdge-1]-(varEgNode-1:testLabel)";
	private static final String TEST_LABEL = "testLabel";
	private static final String VAR_ELEMENT_EDGE__RIGHT = "-[varEEdge-1]->";
	private static final String VAR_ELEMENT_EDGE_12_LEFT = "<-[varEEdge-1]-";
	private static final String VAR_ELEMENT_EDGE_1_TEST_LABEL = "-[varEEdge-1:testLabel]-";
	private static final String VAR_ELEMENT_EDGE_1_TEST_LABEL_RIGHT = "-[varEEdge-1:testLabel]->";
	private static final String VAR_ELEMENT_EDGE_1_TEST_LABEL_LEFT = "<-[varEEdge-1:testLabel]-";
	private static final String VAR_ELEMENT_EDGE1_1 = "varEEdge1_1";
	private static final String VAR_PROPERTY_EDGE1_1 = "varPEdge1_1";
	private static final String VAR_ELEMENT_EDGE_1_INT_EG_NODE_1 = "-[varEEdge-1]-(varEgNode-1)";
	private static final String VAR_ELEMENT_EDGE_LEFT = VAR_ELEMENT_EDGE_12_LEFT;
	private static final String VAR_ELEMENT_EDGE_1 = "-[varEEdge-1]-";
	private static final String VAR_ELEMENT_EDGE_RIGHT = VAR_ELEMENT_EDGE__RIGHT;
	private static final String VAR_ELEMENT_EDGE1 = "varEEdge1";
	private static final String VAR_PROPERTY_EDGE1 = "varPEdge1";	
	private static Method generateInternalCypherMethod = null;
	private static Field isLastEdgeField = null;
	private static Field edgeNumberField = null;
	NeoSimpleEdge neoSimpleEdge;
	
	@BeforeAll
    static void initAll() throws NoSuchMethodException, SecurityException, NoSuchFieldException {
		Class<NeoSimpleEdgeImpl> neoSimpleEdgeClass = NeoSimpleEdgeImpl.class;
		
		Class<?>[] paramsStringBuilderBoolean = {StringBuilder.class, Boolean.class};
		generateInternalCypherMethod = neoSimpleEdgeClass.getDeclaredMethod("generateInternalCypher", paramsStringBuilderBoolean);
		generateInternalCypherMethod.setAccessible(true);
		isLastEdgeField = neoSimpleEdgeClass.getDeclaredField("isLastEdge");
		isLastEdgeField.setAccessible(true);
		edgeNumberField = neoSimpleEdgeClass.getDeclaredField("edgeNumber");
		edgeNumberField.setAccessible(true);
    }
	
	@BeforeEach
	public void setUp() {
		super.setUp(FACTORY.createNeoSimpleEdge());
		neoSimpleEdge = (NeoSimpleEdge) super.neoPathPart;
	}
	
	@AfterEach
	public void tearDown() {
		super.tearDown();
		neoSimpleEdge = null;
	}
	
	@AfterAll
	static void tearDownAll() {
		generateInternalCypherMethod.setAccessible(false);
		generateInternalCypherMethod = null;
		isLastEdgeField.setAccessible(false);
		isLastEdgeField = null;
    }
	
	@Test
	public void setNeoDirection() {
		try {
			//IMPLICIT
			neoSimpleEdge.setNeoDirection(NeoDirection.IMPLICIT);
			assertEquals(NeoDirection.IMPLICIT,neoSimpleEdge.getNeoDirection());
			
			//LEFT
			neoSimpleEdge.setNeoDirection(NeoDirection.LEFT);
			assertEquals(NeoDirection.LEFT,neoSimpleEdge.getNeoDirection());
			neoSimpleEdge.setNeoDirection(NeoDirection.RIGHT);
			
			//RIGHT
			assertEquals(NeoDirection.RIGHT, neoSimpleEdge.getNeoDirection());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void setNeoDirectionException() {
		assertThrows(InvalidityException.class, ()-> neoSimpleEdge.setNeoDirection(null));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Regesta", "Index_Place", "Index_Entry1" })
	public void addTargetNodeLabel(String label) {
		assertDoesNotThrow(() -> neoSimpleEdge.addNeoTargetNodeLabel(label));
		EList<String> labelList = neoSimpleEdge.getNeoTargetNodeLabels().getValues();
		assumeNotNull(labelList);
		assumeTrue(labelList.size() == 1);
		assertTrue(labelList.get(0).compareTo(label) == 0);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Regesta", "Index_Place", "Index_Entry1" })
	public void addLabel(String label) {
		TextListParam mockTextListParam = Mockito.mock(TextListParam.class);
		EList<String> labelList = new BasicEList<String>();
		labelList.add(label);
		Mockito.when(mockTextListParam.getValues()).thenReturn(labelList);
		assertDoesNotThrow(() -> neoSimpleEdge.addNeoTargetNodeLabel(label));
		labelList.clear();
		
		labelList = neoSimpleEdge.getNeoTargetNodeLabels().getValues();
		assumeNotNull(labelList);
		
		assertTrue(labelList.size() == 1);
		assertEquals(label, labelList.get(0));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Regesta,IndexPlace", "Regesta,IndexPlace", "Regesta,IndexPlace,IndexEntry"})
	public void multiLabel(String labelsParam) {
		String[] labels = labelsParam.split(",");
		for (String label : labels) {
			assertDoesNotThrow(() ->  neoSimpleEdge.addNeoTargetNodeLabel(label));
		}
		EList<String> labelList = neoSimpleEdge.getNeoTargetNodeLabels().getValues();
		assumeNotNull(labelList);
		
		assertTrue(labels.length == labelList.size());
		for (int i = 0; i < labels.length; i++) {
			assertEquals(labels[i], labelList.get(i));
		}
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Regesta,Regesta","Regesta,IndexThing,Regesta,IndexThing"})
	public void setSameLabels(String labelsParam) {
		String[] labels = labelsParam.split(",");
		for (String label : labels) {
			assertDoesNotThrow(() ->  neoSimpleEdge.addNeoTargetNodeLabel(label));
		}
		EList<String> labelList = neoSimpleEdge.getNeoTargetNodeLabels().getValues();
		assumeNotNull(labelList);
		
		assertTrue(labels.length / 2 == labelList.size());
		for (int i = labels.length / 2 - 1; i > -1; i--) {
			assertEquals(labels[i], labelList.get(i));			
		}
	}
	
	@Test
	public void setNeoTargetNodeLabels() {
		assertDoesNotThrow(()  -> neoSimpleEdge.setNeoTargetNodeLabels((NeoNodeLabelsParam) null));
		NeoNodeLabelsParam targetNodeLabels = FACTORY.createNeoNodeLabelsParam();
		assertDoesNotThrow(()  -> targetNodeLabels.addStringValue("Regesta"));		
		assertDoesNotThrow(()  -> targetNodeLabels.addStringValue("IndexPlace"));
		assertDoesNotThrow(()  -> neoSimpleEdge.setNeoTargetNodeLabels(targetNodeLabels));
		assertEquals(targetNodeLabels, neoSimpleEdge.getNeoTargetNodeLabels());
	}
	
	@Test
	public void addWrongNeoTargetNodeLabels() {
		assertThrows(InvalidityException.class, ()  -> neoSimpleEdge.addNeoTargetNodeLabel("Re gesta"));
	}
	
	
	@Test
	public void addNeoEdgeLabel() {
		//ADD NULL
		assertDoesNotThrow(() -> neoSimpleEdge.addNeoEdgeLabel(null));
		
		//ADD LABEL 
		assertDoesNotThrow(() -> neoSimpleEdge.addNeoEdgeLabel("Regesta"));
		
		//Already set
		assertThrows(InvalidityException.class, () -> neoSimpleEdge.addNeoEdgeLabel("Regesta"));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Regesta", "IndexPlace", "Index_Place"})
	public void setNeoEdgeLabel(String label) {
		try {
			String[] labels = label.split(",");
			NeoEdgeLabelParam targetNodeLabels = FACTORY.createNeoEdgeLabelParam();
			for (String l : labels) {
				targetNodeLabels.setValueFromString(l);
			}
			assertDoesNotThrow(() -> neoSimpleEdge.setNeoEdgeLabel(targetNodeLabels));
			assertTrue(neoSimpleEdge.getNeoEdgeLabel().getValue().compareTo(labels[labels.length - 1]) == 0);
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void setNeoEdgeLabelNullObject() {
		try {
			assertDoesNotThrow(() -> neoSimpleEdge.setNeoEdgeLabel(null));
			assertNull(neoSimpleEdge.getNeoEdgeLabel());
			NeoEdgeLabelParam edgeNodeLabel = FACTORY.createNeoEdgeLabelParam();
			edgeNodeLabel.setValue((String) null); 
			assertDoesNotThrow(() -> neoSimpleEdge.setNeoEdgeLabel(edgeNodeLabel));
			assertEquals(null, neoSimpleEdge.getNeoEdgeLabel().getValue());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Rege sta"," "})
	public void addWrongNeoEdgeLabel(String label) {
		assertThrows(InvalidityException.class, () -> neoSimpleEdge.addNeoEdgeLabel(label));
	}

	@Test
	@Override
	public void getNeoPathPartEdges() {
		assumeNotNull(neoSimpleEdge.getNeoPathPartEdgeLeafs());
		assumeTrue(neoSimpleEdge.getNeoPathPartEdgeLeafs().size() == 1);
		assertEquals(neoSimpleEdge, neoSimpleEdge.getNeoPathPartEdgeLeafs().get(0));
	}
	
	@Test
	@Override
	public void getCypherVariable() {
		try {
			String temp = null;
			
			neoSimpleEdge = createMockingForNeoPathParam(neoSimpleEdge);
			temp = neoSimpleEdge.getCypherVariable();
			assertEquals(VAR_ELEMENT_EDGE1, temp);
			
			neoSimpleEdge = createMockingForNeoPropertyPathParam(neoSimpleEdge);
			temp = neoSimpleEdge.getCypherVariable();
			assertEquals(VAR_PROPERTY_EDGE1, temp);
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void getCypherVariableWithSubNumber() {
		try {
			neoSimpleEdge = createMockingForNeoPathParam(neoSimpleEdge);
			edgeNumberField.set(neoSimpleEdge, 1);
			assertEquals(VAR_ELEMENT_EDGE1_1, neoSimpleEdge.getCypherVariable());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void getCypherVariableWithSubNumberPropertyPathParam() {
		try {
			neoSimpleEdge = createMockingForNeoPropertyPathParam(neoSimpleEdge);
			edgeNumberField.set(neoSimpleEdge, 1);
			assertEquals(VAR_PROPERTY_EDGE1_1, neoSimpleEdge.getCypherVariable());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	@Test
	@Override
	public void getNeoLastEdge() {
		try {
			assertEquals(neoPathPart, neoPathPart.getNeoLastEdge());	
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void isNotNeoLastEdge() throws InvalidityException {
		try {			
			isLastEdgeField.set(neoPathPart, false);
			assertEquals(null, neoPathPart.getNeoLastEdge());
		} catch (Exception e) {
			e.printStackTrace();
			assertFalse(true);
		}
	}


	 //Partly also implicit test of generateInternalCypher + generateInternalCypherLabelGenerator
	@Test
	@Override
	public void generateCypher() {
		try {
			neoSimpleEdge.setNeoPathParam(FACTORY.createNeoElementPathParam());
			//IMPLICIT
			neoSimpleEdge.setNeoDirection(NeoDirection.IMPLICIT);
			assertTrue(neoSimpleEdge.generateCypher().compareTo(VAR_ELEMENT_EDGE_1) == 0);
			//LEFT
			neoSimpleEdge.setNeoDirection(NeoDirection.RIGHT);
			assertTrue(neoSimpleEdge.generateCypher().compareTo(VAR_ELEMENT_EDGE__RIGHT) == 0);
			
			//RIGHT
			neoSimpleEdge.setNeoDirection(NeoDirection.LEFT);
			assertTrue(neoSimpleEdge.generateCypher().compareTo(VAR_ELEMENT_EDGE_12_LEFT) == 0);
			
			//IMPLICIT - WITH LABEL
			neoSimpleEdge.setNeoDirection(NeoDirection.IMPLICIT);
			neoSimpleEdge.addNeoEdgeLabel(TEST_LABEL);
			assertTrue(neoSimpleEdge.generateCypher().compareTo(VAR_ELEMENT_EDGE_1_TEST_LABEL) == 0);
			
			//LEFT - WITH LABEL
			neoSimpleEdge.setNeoDirection(NeoDirection.RIGHT);
			assertTrue(neoSimpleEdge.generateCypher().compareTo(VAR_ELEMENT_EDGE_1_TEST_LABEL_RIGHT) == 0);
			
			//RIGHT - WITH LABEL
			neoSimpleEdge.setNeoDirection(NeoDirection.LEFT);
			assertTrue(neoSimpleEdge.generateCypher().compareTo(VAR_ELEMENT_EDGE_1_TEST_LABEL_LEFT) == 0);
			
			neoSimpleEdge.setNeoEdgeLabel(null);
			
			//WITH TARGET-Label
			neoSimpleEdge.setNeoDirection(NeoDirection.IMPLICIT);
			neoSimpleEdge.addNeoTargetNodeLabel(TEST_LABEL);
			assertTrue(neoSimpleEdge.generateCypher().compareTo(VAR_ELEMENT_EDGE_1_INT_EG_NODE_1_TEST_LABEL) == 0);
			
			//WITH AN EMPTY STRING_LABEL
			neoSimpleEdge.addNeoTargetNodeLabel(new String());
			assertTrue(neoSimpleEdge.generateCypher().compareTo(VAR_ELEMENT_EDGE_1_INT_EG_NODE_1_TEST_LABEL) == 0);
			
			//WITH TARGET-Label AND EDGE-Label
			neoSimpleEdge.addNeoEdgeLabel(TEST_LABEL);
			assertTrue(neoSimpleEdge.generateCypher().compareTo(VAR_ELEMENT_EDGE_1_TEST_LABEL_INT_EG_NODE_1_TEST_LABEL) == 0);
		} catch (Exception e) {
			assertFalse(true);
		}
	}

	@Test
	@Override
	public void generateInternalCypher() {
		try {
			String temp = null;
			
			StringBuilder localStringBuilder = new StringBuilder();
			Object[] params = {localStringBuilder, false};
			neoSimpleEdge.setNeoPathParam(FACTORY.createNeoElementPathParam());
			
			//IMPLICIT
			neoSimpleEdge.setNeoDirection(NeoDirection.IMPLICIT);
			generateInternalCypherMethod.invoke(neoSimpleEdge, params);
			temp = localStringBuilder.toString();
			localStringBuilder.setLength(0);
			assertTrue(temp.compareTo(VAR_ELEMENT_EDGE_1) == 0);
			
			//LEFT
			neoSimpleEdge.setNeoDirection(NeoDirection.RIGHT);
			generateInternalCypherMethod.invoke(neoSimpleEdge, params);
			temp = localStringBuilder.toString();
			localStringBuilder.setLength(0);
			assertTrue(temp.compareTo(VAR_ELEMENT_EDGE_RIGHT) == 0);
			
			//IMPLICIT - WITH LABEL BUT NOT PRINTED
			neoSimpleEdge.setNeoDirection(NeoDirection.IMPLICIT);
			neoSimpleEdge.addNeoEdgeLabel(TEST_LABEL);
			generateInternalCypherMethod.invoke(neoSimpleEdge, params);
			temp = localStringBuilder.toString();
			localStringBuilder.setLength(0);
			assertTrue(temp.compareTo(VAR_ELEMENT_EDGE_1) == 0);
			
			//LEFT - WITH LABEL
			neoSimpleEdge.setNeoDirection(NeoDirection.RIGHT);
			generateInternalCypherMethod.invoke(neoSimpleEdge, params);
			temp = localStringBuilder.toString();
			localStringBuilder.setLength(0);
			assertTrue(temp.compareTo(VAR_ELEMENT_EDGE_RIGHT) == 0);
			
			//RIGHT - WITH LABEL
			neoSimpleEdge.setNeoDirection(NeoDirection.LEFT);
			generateInternalCypherMethod.invoke(neoSimpleEdge, params);
			temp = localStringBuilder.toString();
			localStringBuilder.setLength(0);
			assertTrue(temp.compareTo(VAR_ELEMENT_EDGE_LEFT) == 0);
			
			//Reset
			neoSimpleEdge.setNeoEdgeLabel(null);
			
			//WITH TARGET-Label
			neoSimpleEdge.setNeoDirection(NeoDirection.IMPLICIT);
			neoSimpleEdge.addNeoTargetNodeLabel(TEST_LABEL);
			generateInternalCypherMethod.invoke(neoSimpleEdge, params);
			temp = localStringBuilder.toString();
			localStringBuilder.setLength(0);
			assertTrue(temp.compareTo(VAR_ELEMENT_EDGE_1_INT_EG_NODE_1) == 0);
			
			//WITH AN EMPTY STRING_LABEL
			neoSimpleEdge.addNeoTargetNodeLabel(new String());
			generateInternalCypherMethod.invoke(neoSimpleEdge, params);
			temp = localStringBuilder.toString();
			localStringBuilder.setLength(0);
			assertTrue(temp.compareTo(VAR_ELEMENT_EDGE_1_INT_EG_NODE_1) == 0);
			
			//WITH TARGET-Label AND EDGE-Label
			neoSimpleEdge.addNeoEdgeLabel(TEST_LABEL);
			generateInternalCypherMethod.invoke(neoSimpleEdge, params);
			temp = localStringBuilder.toString();
			localStringBuilder.setLength(0);
			assertTrue(temp.compareTo(VAR_ELEMENT_EDGE_1_INT_EG_NODE_1) == 0);
			
		} catch (Exception e) {
			assertFalse(true);
			e.printStackTrace();
		}		
	}
	
	@Override
	@ParameterizedTest
	@ValueSource(booleans =  {true, false})
	public void getCypherInnerEdgeNodes(boolean isReturn) {
		neoSimpleEdge.setNeoPathParam(FACTORY.createNeoElementPathParam());
		try {
			//No TargetNodeLabels
			assertEquals(null, neoSimpleEdge.getCypherInnerEdgeNodes(isReturn));
			
			//is not isLastEdge
			neoSimpleEdge.addNeoTargetNodeLabel(TEST_LABEL);
			assertTrue(neoSimpleEdge.getCypherInnerEdgeNodes(isReturn).compareTo("varEgNode-1") == 0);						
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	@Override
	public void getNeoPathParam() {	
		try {
			//ElementParam
			NeoPathParamImpl neoAbstractPathParamImpl = (NeoPathParamImpl) FACTORY.createNeoElementPathParam();
			neoPathPart.setNeoPathParam((NeoElementPathParam) neoAbstractPathParamImpl);
			assertEquals(neoAbstractPathParamImpl, neoPathPart.getNeoPathParam());
			neoPathPart.setNeoPathParam(null);
			
			//PropertyParam
			neoAbstractPathParamImpl = (NeoPathParamImpl) FACTORY.createNeoPropertyPathParam();
			neoPathPart.setNeoPathParam((NeoPropertyPathParam) neoAbstractPathParamImpl);
			assertEquals(neoAbstractPathParamImpl, neoPathPart.getNeoPathParam());
			neoPathPart.setNeoPathParam(null);			
		} catch (Exception e) {
			assertFalse(true);
		}
	}
	
	@Test
	@Override
	public void getNeoPathParamException() {
		assertThrows(InvalidityException.class, () -> neoSimpleEdge.getNeoPathParam());
	}
	
	@Test
	public void getNeoAbstractPathParamFromNeoComplex() {
		try {			
			NeoComplexEdge neoComplexEdge = FACTORY.createNeoComplexEdge();
			NeoElementPathParam neoPathParam = FACTORY.createNeoElementPathParam();
			neoComplexEdge.setNeoPathParam(neoPathParam);
			neoPathPart.setNeoComplexEdge(neoComplexEdge);
			assertEquals(neoPathParam, neoPathPart.getNeoPathParam());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	@Test
	@Override
	public void myToString() {
		//Simple myToString
		final String prefix = "NeoSimpleEdge [";
		assertTrue(neoSimpleEdge.myToString().startsWith(prefix));
		assertTrue(neoSimpleEdge.myToString().endsWith("]"));
		
		//myToString with Label
		assertDoesNotThrow(() -> neoSimpleEdge.addNeoEdgeLabel(TEST_LABEL));
		
		//Add one label which will not be added and one extra one
		assertDoesNotThrow(() -> neoSimpleEdge.addNeoTargetNodeLabel(TEST_LABEL));
		assertDoesNotThrow(() -> neoSimpleEdge.addNeoTargetNodeLabel(TEST_LABEL+1));
		assertTrue(neoSimpleEdge.myToString().startsWith(prefix));
		final String suffix = "] (Edge-Labels:[testLabel] Edge-Target-Node-Labels[testLabel, testLabel1])";
		assertTrue(neoSimpleEdge.myToString().endsWith(suffix));
	}
	
	@Test
	@Override
	public void toStringT() {
		final String suffix = ", internalId: -1)" 
				+ " (neoDirection: IMPLICIT, edgeNumber: <unset>)";
		assertTrue(neoPathPart.toString().endsWith(suffix));
		final String prefix = "qualitypatternmodel.adaptionneo4j.impl.NeoSimpleEdgeImpl@";
		assertTrue(neoPathPart.toString().startsWith(prefix));
	}
	
	//METHOD FACTORIES
	private static NeoSimpleEdge createMockingForNeoPathParam(NeoSimpleEdge neoSimpleEdge) {
		MyClassMockNeoElementPathParamImpl mockNeoElementPathParam = 
				Mockito.mock(MyClassMockNeoElementPathParamImpl.class);
		Mockito.when(mockNeoElementPathParam.getRelationNumber()).thenReturn(1); 
		Mockito.when(mockNeoElementPathParam.getEdgeNaming()).thenReturn(ConstantsNeo.VARIABLE_ELEMENT_EGDE); 
		neoSimpleEdge.setNeoPathParam(mockNeoElementPathParam);
		return neoSimpleEdge;
	}
	
	private static NeoSimpleEdge createMockingForNeoPropertyPathParam(NeoSimpleEdge neoSimpleEdge) {
		MyClassMockNeoPropertyPathParamImpl mockNeoPropertyPathParam = 
				Mockito.mock(MyClassMockNeoPropertyPathParamImpl.class);
		Mockito.when(mockNeoPropertyPathParam.getRelationNumber()).thenReturn(1); 
		Mockito.when(mockNeoPropertyPathParam.getEdgeNaming()).thenReturn(ConstantsNeo.VARIABLE_PROPERTY_EGDE);
		neoSimpleEdge.setNeoPathParam(mockNeoPropertyPathParam);
		return neoSimpleEdge;
	}
	
	//FACTORIES and HELPERS
	protected class MyClassMockNeoElementPathParamImpl extends NeoElementPathParamImpl {
		@Override
		protected int getRelationNumber() {
			return 1;
		}
		@Override
		protected String getEdgeNaming() {
			return ConstantsNeo.VARIABLE_ELEMENT_EGDE;
		}
	}
	
	protected class MyClassMockNeoPropertyPathParamImpl extends NeoPropertyPathParamImpl {
		@Override
		protected int getRelationNumber() {
			return 1;
		}
		
		@Override
		protected String getEdgeNaming() {
			return ConstantsNeo.VARIABLE_PROPERTY_EGDE;
		}
	}
}
