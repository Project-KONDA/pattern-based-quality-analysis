package qualitypatternmodel.cypherclasstester.concretetests;


import static org.junit.Assert.assertFalse;
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
import org.mockito.Mock;
import org.mockito.Mockito;

import qualitypatternmodel.adaptionNeo4J.NeoAbstractPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoDirection;
import qualitypatternmodel.adaptionNeo4J.NeoPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
import qualitypatternmodel.adaptionNeo4J.impl.NeoAbstractPathParamImpl;
import qualitypatternmodel.adaptionNeo4J.impl.NeoComplexEdgeImpl;
import qualitypatternmodel.adaptionNeo4J.impl.NeoPathParamImpl;
import qualitypatternmodel.adaptionNeo4J.impl.NeoPathPartImpl;
import qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyPathParamImpl;
import qualitypatternmodel.adaptionNeo4J.impl.NeoSimpleEdgeImpl;
import qualitypatternmodel.cypherclasstester.NeoAbstractPathPartTest;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.impl.NodeImpl;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;

@DisplayName("NeoSimpleEdge Test")
public class Neo04NeoSimpleEdgeTest extends NeoAbstractPathPartTest {
	NeoSimpleEdge neoSimpleEdge;
	
	@BeforeAll
    static void initAll() {
		
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
		
    }
	
	@Test
	public void setNeoDirection() {
		neoSimpleEdge.setNeoDirection(NeoDirection.IMPLICIT);
		assertEquals(NeoDirection.IMPLICIT,neoSimpleEdge.getNeoDirection());
		neoSimpleEdge.setNeoDirection(NeoDirection.LEFT);
		assertEquals(NeoDirection.LEFT,neoSimpleEdge.getNeoDirection());
		neoSimpleEdge.setNeoDirection(NeoDirection.RIGHT);
		assertEquals(NeoDirection.RIGHT, neoSimpleEdge.getNeoDirection());
		neoSimpleEdge.setNeoDirection(null);
		assertEquals(null, neoSimpleEdge.getNeoDirection());
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"", "Regesta", "IndexPlace", "IndexEntry" })
	public void addTargetNodeLabel(String label) {
		assertDoesNotThrow(() -> neoSimpleEdge.addNeoTargetNodeLabel(label));
		EList<String> labelList = neoSimpleEdge.getNeoTargetNodeLabels().getValues();
		assumeNotNull(labelList);
		assumeTrue(labelList.size() == 1);
		assertTrue(labelList.get(0).compareTo(label) == 0);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"", "Regesta", "IndexPlace", "IndexEntry" })
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
	@ValueSource(strings = {",Regesta,IndexPlace", "Regesta,IndexPlace", "Regesta,IndexPlace,IndexEntry"})
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
	@ValueSource(strings = {",Regesta,,Regesta","Regesta,IndexThing,Regesta,IndexThing"})
	public void setSameLabels(String labelsParam) {
		String[] labels = labelsParam.split(",");
		for (String label : labels) {
			assertDoesNotThrow(() ->  neoSimpleEdge.addNeoTargetNodeLabel(label));
		}
		EList<String> labelList = neoSimpleEdge.getNeoTargetNodeLabels().getValues();
		assumeNotNull(labelList);
		
		assertTrue(labels.length - 2 == labelList.size());
		assertEquals(labels[0], labelList.get(0));
		assertEquals(labels[1], labelList.get(1));
	}
	
	
	
	@Test
	public void setNeoTargetNodeLabels() {
		assertDoesNotThrow(()  -> neoSimpleEdge.setNeoTargetNodeLabels((TextListParam) null));
		TextListParam textListParam = new TextListParamImpl();
		textListParam.addStringValue("");
		textListParam.addStringValue("Regesta");		
		textListParam.addStringValue("IndexPlace");
		assertDoesNotThrow(()  -> neoSimpleEdge.setNeoTargetNodeLabels(textListParam));
		assertEquals(textListParam, neoSimpleEdge.getNeoTargetNodeLabels());
	}
	
	@Test
	public void setWrongNeoTargetNodeLabels() {
		TextListParam textListParam = new TextListParamImpl();
		textListParam.addStringValue(" ");
		textListParam.addStringValue("Regesta");		
		textListParam.addStringValue("IndexPlace");
		assertThrows(InvalidityException.class, ()  -> neoSimpleEdge.setNeoTargetNodeLabels(textListParam));
	}
	
	@Test
	public void addWrongNeoTargetNodeLabels() {
		assertThrows(InvalidityException.class, ()  -> neoSimpleEdge.addNeoTargetNodeLabel(" "));
	}
	
	
	@Test
	public void addNeoEdgeLabel() {
		assertDoesNotThrow(() -> neoSimpleEdge.addNeoEdgeLabel(null));
		assertDoesNotThrow(() -> neoSimpleEdge.setNeoEdgeLabel(null));
		assertDoesNotThrow(() -> neoSimpleEdge.addNeoEdgeLabel("Regesta"));
		assertDoesNotThrow(() -> neoSimpleEdge.addNeoEdgeLabel("Regesta"));
		assertDoesNotThrow(() -> neoSimpleEdge.addNeoEdgeLabel("IndexPlace"));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Regesta", "Regesta,IndexPlace", "Regesta,IndexPlace", "Regesta,IndexPlace,IndexEntry"})
	public void setNeoEdgeLabel(String label) {
		try {
			String[] labels = label.split(",");
			TextLiteralParam textListParam = new TextLiteralParamImpl();
			for (String l : labels) {
				textListParam.setValueFromString(l);
			}
			assertDoesNotThrow(() -> neoSimpleEdge.setNeoEdgeLabel(textListParam));
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
			assertEquals(null, neoSimpleEdge.getNeoEdgeLabel());
			TextLiteralParam textLiteralParam = new TextLiteralParamImpl();
			textLiteralParam.setValue((String) null); 
			assertDoesNotThrow(() -> neoSimpleEdge.setNeoEdgeLabel(textLiteralParam));
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
	public void generateInternalCypherLabelGenerator() {
		
	}
	
	@Test
	public void setCount() {
		//Does not have to be tested... is just a setter which is calling a generated method
	}

	@Test
	@Override
	public void getNeoPathPartEdges() {
		assumeNotNull(neoSimpleEdge.getNeoPathPartEdges());
		assumeTrue(neoSimpleEdge.getNeoPathPartEdges().size() == 1);
		assertEquals(neoSimpleEdge, neoSimpleEdge.getNeoPathPartEdges().get(0));
	}
	
	//Pull-Up?
	protected class MyClassMockNeoPathParamImpl extends NeoPathParamImpl {
		@Override
		protected int getRelationNumber() {
			return 1;
		}
	}
	
	//Pull-Up?
	protected class MyClassMockNeoPropertyPathParamImpl extends NeoPropertyPathParamImpl {
		@Override
		protected int getRelationNumber() {
			return 1;
		}
	}
	
	@Test
	@Override
	public void getCypherVariable() {
		createMockingForNeoPathParam();
		assertEquals("varEdge1", neoSimpleEdge.getCypherVariable());
	}
	
	@Test
	public void getCypherVariableWithSubNumber() {
		try {
			createMockingForNeoPathParam();
			Field field = getEdgeNumber();
			field.set(neoSimpleEdge, 1);
			assertEquals("varEdge1_1", neoSimpleEdge.getCypherVariable());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	//Introduce into Interface?
	@Test
	public void getCypherVariableNeoPropertyPathParam() {
		createMockingForNeoPropertyPathParam();
		assertEquals("varEdge1", neoSimpleEdge.getCypherVariable());
	}
	
	//Introduce into Interface?
	@Test
	public void getCypherVariableWithSubNumberPropertyPathParam() {
		try {
			createMockingForNeoPropertyPathParam();
			Field field = getEdgeNumber();
			field.set(neoSimpleEdge, 1);
			assertEquals("varEdge1_1", neoSimpleEdge.getCypherVariable());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true); // Introduce this in every catch
		}
	}

	//Pull-Up?
	private Field getEdgeNumber() throws NoSuchFieldException {
		Class obj = NeoSimpleEdgeImpl.class;			
		Field field = obj.getDeclaredField("edgeNumber");
		field.setAccessible(true);
		return field;
	}

	//Pull-Up?
	private void createMockingForNeoPathParam() {
		MyClassMockNeoPathParamImpl mockNeoPathParam = 
				Mockito.mock(MyClassMockNeoPathParamImpl.class);
		Mockito.when(mockNeoPathParam.getRelationNumber()).thenReturn(1); 
		neoSimpleEdge.setNeoPathParam(mockNeoPathParam);
	}
	
	//Pull-Up?
	private void createMockingForNeoPropertyPathParam() {
		MyClassMockNeoPropertyPathParamImpl mockNeoPropertyPathParam = 
				Mockito.mock(MyClassMockNeoPropertyPathParamImpl.class);
		Mockito.when(mockNeoPropertyPathParam.getRelationNumber()).thenReturn(1); 
		neoSimpleEdge.setNeoPropertyPathParam(mockNeoPropertyPathParam);
	}

	@Override
	public void getCypherInnerEdgeNodes(boolean isReturn) throws InvalidityException {
		// TODO Auto-generated method stub
		
	}

	@Test
	@Override
	public void getNeoLastEdge() throws InvalidityException {
		neoSimpleEdge.setIsLastEdge(true);
		assertEquals(neoPathPart, neoPathPart.getNeoLastEdge());		
	}
	
	@Test
	public void isNotNeoLastEdge() throws InvalidityException {
		neoSimpleEdge.setIsLastEdge(false);
		assertEquals(null, neoPathPart.getNeoLastEdge());
	}

	//Can be removed since it is generated automaticlly 
	@Override
	public void isLastEdge() {
		// TODO Auto-generated method stub
		//has not to be tested since it is a simple getter
	}

	@Override
	public void generateCypher() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generateInternalCypher() {
		// TODO Auto-generated method stub
		
	}

	//Maybe not needed 
	@Override
	public void isValidLocal() {
		// TODO Auto-generated method stub
		
	}
	
	@Test
	@Override
	public void getNeoAbstractPathParam() {
		try {
			Method m = getTheGetNeoAbstractPathParamMethod();
			
			NeoAbstractPathParamImpl neoAbstractPathParamImpl = (NeoAbstractPathParamImpl) FACTORY.createNeoPathParam();
			neoPathPart.setNeoPathParam((NeoPathParam) neoAbstractPathParamImpl);
			assertEquals(neoAbstractPathParamImpl, m.invoke(neoPathPart));
			neoPathPart.setNeoPathParam(null);
			
			neoAbstractPathParamImpl = (NeoAbstractPathParamImpl) FACTORY.createNeoPropertyPathParam();
			neoPathPart.setNeoPropertyPathParam((NeoPropertyPathParam) neoAbstractPathParamImpl);
			assertEquals(neoAbstractPathParamImpl, m.invoke(neoPathPart));
			neoPathPart.setNeoPathParam(null);
			
			assertEquals(null, m.invoke(neoPathPart));	
			assertEquals(null, m.invoke(neoPathPart));
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	//Pull-Up?
	protected class MyClassMockNeoComplexEdge extends NeoComplexEdgeImpl {
		@Override
		protected NeoAbstractPathParam getNeoAbstractPathParam() {
			return null;
		}
	}
	
	//Pull-Up?
	@Test
	public void getNeoAbstractPathParamFromNeoComplex() {
		try {
			Method m = getTheGetNeoAbstractPathParamMethod();
			
			MyClassMockNeoComplexEdge mockNeoComplexEdge = Mockito.mock(MyClassMockNeoComplexEdge.class);
			Object neoObject = FACTORY.createNeoPathParam();
			Mockito.when(mockNeoComplexEdge.getNeoAbstractPathParam()).thenReturn((NeoAbstractPathParam) neoObject);
			neoPathPart.setNeoComplexEdge(mockNeoComplexEdge);
			assertEquals(neoObject, m.invoke(neoPathPart));
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	private Method getTheGetNeoAbstractPathParamMethod() throws NoSuchMethodException {
		Class obj = NeoPathPartImpl.class;
		Method m = obj.getDeclaredMethod("getNeoAbstractPathParam");
		m.setAccessible(true);
		return m;
	}

	//REMOCE
	@Override
	public void setNeoComplexEdge() {
		// TODO Auto-generated method stub
		
	}

	//REMOVE?
	@Override
	public void myToString() {
		// TODO Auto-generated method stub
		
	}
}
