package qualitypatternmodel.cypherclasstester.concretetests;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeNotNull;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.NeoAbstractPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoComplexEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoPathPart;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
import qualitypatternmodel.adaptionNeo4J.impl.NeoComplexEdgeImpl;
import qualitypatternmodel.adaptionNeo4J.impl.NeoPathPartImpl;
import qualitypatternmodel.adaptionNeo4J.impl.NeoSimpleEdgeImpl;
import qualitypatternmodel.cypherclasstester.NeoAbstractPathPartTest;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;
import qualitypatternmodel.utility.CypherSpecificConstants;

@DisplayName("NeoComplexEdge Test")
public class Neo04ComplexEdgeTest extends NeoAbstractPathPartTest {
	private static final String VARIABLE_EDGE_3 = CypherSpecificConstants.VARIABLE_EGDE + "3";
	private static final String VARIABLE_EDGE_2 = CypherSpecificConstants.VARIABLE_EGDE + "2";
	private static final String VARIABLE_EDGE_1 = CypherSpecificConstants.VARIABLE_EGDE + "1";
	NeoComplexEdge neoComplexEdge;
	private static final String INTERNAL_EDGE_NODE_ID_1 = "-" + CypherSpecificConstants.INTERNAL_EDGE_NODE + 1 + "-";
	private static final String INTERNAL_EDGE_NODE_ID_2 = CypherSpecificConstants.INTERNAL_EDGE_NODE + 2 + "-";
	private static final String VARIABLE_PROPERTY_NODE_ID_3 = CypherSpecificConstants.VARIABLE_PROPERTY_NODE + 3 + "-";
	
	@BeforeAll
    static void initAll() {
		//The internal ID could be here
		//And other Reflactions can be done here
    }
	
	@BeforeEach
	public void setUp() {
		super.setUp(FACTORY.createNeoComplexEdge());
		neoComplexEdge = (NeoComplexEdge) super.neoPathPart;
	}
	
	@AfterEach
	public void tearDown() {
		super.tearDown();
		neoComplexEdge = null;
	}
	
	@AfterAll
	static void tearDownAll() {
		
    }
	
	//Maybe bundle this methods
	@Test
	public void validateComplexEdge() {
		try {
			//Just with NeoSimpleEdges
			neoComplexEdge.addNeoPathPart(FACTORY.createNeoSimpleEdge());
			neoComplexEdge.addNeoPathPart(FACTORY.createNeoSimpleEdge());
			assertDoesNotThrow(() -> neoComplexEdge.validateComplexEdge());
			unsetNeoPathPartInComplexEdge();
			
			//Just with NeoSimpleEdges and NeoLastEdge
			neoComplexEdge.addNeoPathPart(FACTORY.createNeoSimpleEdge());
			NeoSimpleEdge neoSimpleEdge0 = FACTORY.createNeoSimpleEdge();
			neoComplexEdge.addNeoPathPart(neoSimpleEdge0);
			assertDoesNotThrow(() -> neoComplexEdge.validateComplexEdge());
			unsetNeoPathPartInComplexEdge();
			
			//In NeoComplexEdges
			NeoComplexEdge neoComplexEdge1 = FACTORY.createNeoComplexEdge();
			neoComplexEdge1.addNeoPathPart(FACTORY.createNeoSimpleEdge());
			NeoComplexEdge neoComplexEdge2 = FACTORY.createNeoComplexEdge();
			neoComplexEdge2.addNeoPathPart(FACTORY.createNeoSimpleEdge());
			neoComplexEdge.addNeoPathPart(FACTORY.createNeoSimpleEdge());
			neoComplexEdge.addNeoPathPart(neoComplexEdge1);
			neoComplexEdge.addNeoPathPart(neoComplexEdge2);
			assertDoesNotThrow(() -> neoComplexEdge.validateComplexEdge());
			unsetNeoPathPartInComplexEdge();
			
			//In NeoComplexEdges -- WITH LAST EDGE
			NeoComplexEdge neoComplexEdge3 = FACTORY.createNeoComplexEdge();
			neoComplexEdge3.addNeoPathPart(FACTORY.createNeoSimpleEdge());
			NeoComplexEdge neoComplexEdge4 = FACTORY.createNeoComplexEdge();
			NeoSimpleEdge neoSimpleEdge1 = FACTORY.createNeoSimpleEdge();
			neoComplexEdge4.addNeoPathPart(neoSimpleEdge1);
			neoComplexEdge.addNeoPathPart(FACTORY.createNeoSimpleEdge());
			neoComplexEdge.addNeoPathPart(neoComplexEdge1);
			neoComplexEdge.addNeoPathPart(neoComplexEdge2);
			assertDoesNotThrow(() -> neoComplexEdge.validateComplexEdge());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	private void unsetNeoPathPartInComplexEdge() {
		((NeoComplexEdgeImpl) neoComplexEdge).eUnset((int) AdaptionNeo4JPackage.NEO_COMPLEX_EDGE__NEO_PATH_PART);
		assumeNotNull(neoComplexEdge.getNeoPathPartEdges());
		assertTrue(neoComplexEdge.getNeoPathPartEdges().size() == 0);
		
	}
	
	//this three methods have been tested indicectly
	//countOfEdges()
	//hasMultipleLastEdges()
	//isLastEdgeAtTheEnd()
	@Test
	public void notValidatComplexEdge() {
		//WITH NO INPUT
		assertThrows(InvalidityException.class, () -> neoComplexEdge.validateComplexEdge());
		
		//WITH TWO NEOCOMPLEXEDGES
		neoComplexEdge.addNeoPathPart(FACTORY.createNeoComplexEdge());
		neoComplexEdge.addNeoPathPart(FACTORY.createNeoComplexEdge());
		assertThrows(InvalidityException.class, () -> neoComplexEdge.validateComplexEdge());
		unsetNeoPathPartInComplexEdge();

//		//MultipleLastEdges --> Partly deprecated
		try {
			Field f = getFieldIsLastEdge();
			NeoSimpleEdge neoSimpleEdge = FACTORY.createNeoSimpleEdge();
			neoComplexEdge.addNeoPathPart(neoSimpleEdge);
			neoSimpleEdge = FACTORY.createNeoSimpleEdge();
			neoComplexEdge.addNeoPathPart(neoSimpleEdge);
			for (NeoPathPart part : neoComplexEdge.getNeoPathPartEdges()) {
				f.set(part, true);
			}
			assertThrows(InvalidityException.class, () -> neoComplexEdge.validateComplexEdge());
			unsetNeoPathPartInComplexEdge();
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}

		
		//Last Edge is not @ the end
		try {
			Field f = getFieldIsLastEdge();
			NeoSimpleEdge neoSimpleEdge = FACTORY.createNeoSimpleEdge();
			neoComplexEdge.addNeoPathPart(neoSimpleEdge);
			neoSimpleEdge = FACTORY.createNeoSimpleEdge();
			neoComplexEdge.addNeoPathPart(neoSimpleEdge);
			for (NeoPathPart part : neoComplexEdge.getNeoPathPartEdges()) {
				f.set(part, true);
			}
			f.set(neoComplexEdge.getNeoPathPartEdges().get(neoComplexEdge.getNeoPathPartEdges().size() - 1), false);
			assertThrows(InvalidityException.class, () -> neoComplexEdge.validateComplexEdge());
			unsetNeoPathPartInComplexEdge();
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	@Test //Due to ecore this tests needed to be extracted --> Unset of the NeoComplexEdge is via a EMF-CONTAINER
	public void validateStructureWithJustTwoComplexEdgesException() {
		//WITH TWO NEASTED NEOCCOMPLEXEDGES
		try {
			NeoComplexEdge neoComplexEdge1 = FACTORY.createNeoComplexEdge();
			NeoComplexEdge neoComplexEdge2 = FACTORY.createNeoComplexEdge();
			neoComplexEdge2.setNeoComplexEdge(neoComplexEdge1);
			neoComplexEdge.addNeoPathPart(neoComplexEdge1);
			assertThrows(InvalidityException.class, () -> neoComplexEdge.validateComplexEdge());
		} catch (Exception e) {
			System.out.println(e); 
			assertFalse(true);
		}
		unsetNeoPathPartInComplexEdge();
	}

	//Check this and think how to prevent the commented version
	@Test //Due to ecore this tests needed to be extracted --> Unset of the NeoComplexEdge is via a EMF-CONTAINER
	public void ComplexEdgeInAComplexEdgeException() {
//		neoComplexEdge.setNeoComplexEdge(FACTORY.createNeoComplexEdge());
		NeoComplexEdge neoComplexEdge1 = FACTORY.createNeoComplexEdge();
		neoComplexEdge1.setNeoComplexEdge(neoComplexEdge);
		assertThrows(InvalidityException.class, () -> neoComplexEdge.validateComplexEdge());
		unsetNeoPathPartInComplexEdge();
	}
	
	@Deprecated
	@Test
	public void countLastEdgesInSubStructure() {
		try {
			Class<NeoComplexEdgeImpl> c = NeoComplexEdgeImpl.class;
			Method m = c.getDeclaredMethod("countLastEdgesInSubStructure", null);
			m.setAccessible(true);
			Field f = getFieldIsLastEdge();
			
			
			neoComplexEdge.addNeoPathPart(FACTORY.createNeoComplexEdge());
			neoComplexEdge.addNeoPathPart(FACTORY.createNeoSimpleEdge());
			NeoSimpleEdge neoSimpleEdge = FACTORY.createNeoSimpleEdge();
			neoComplexEdge.addNeoPathPart(neoSimpleEdge);
			NeoComplexEdge neoComplexEdge1 = FACTORY.createNeoComplexEdge();
			neoSimpleEdge = FACTORY.createNeoSimpleEdge();
			neoComplexEdge1.addNeoPathPart(neoSimpleEdge);
			neoSimpleEdge = FACTORY.createNeoSimpleEdge();
			neoComplexEdge1.addNeoPathPart(neoSimpleEdge);
			neoSimpleEdge = FACTORY.createNeoSimpleEdge();
			neoComplexEdge1.addNeoPathPart(neoSimpleEdge);
			neoComplexEdge.addNeoPathPart(neoComplexEdge1);
			
			for (NeoPathPart parts : neoComplexEdge.getNeoPathPartEdges()) {
				f.set(parts, true);
			}
			
			assertEquals(5, m.invoke(neoComplexEdge));
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	protected Field getFieldIsLastEdge() throws NoSuchFieldException {
		Class<NeoSimpleEdgeImpl> c2 = NeoSimpleEdgeImpl.class;
		Field f = c2.getDeclaredField("isLastEdge");
		f.setAccessible(true);
		return f;
	}
	
	//Addaitions to this test have to follow since not all possiblities are tested
	@Test
	public void addNeoPathPart() {
		try {
			//No null value can be added to the List
			neoComplexEdge.addNeoPathPart(null);
			assumeTrue(neoComplexEdge.getNeoPathPartEdges().size() == 0);
			
			assertTrue(neoPathPart.getNeoPathPartEdges().size() == 0);
			NeoSimpleEdge neoSimpleEdge1 = FACTORY.createNeoSimpleEdge();
			neoComplexEdge.addNeoPathPart(neoSimpleEdge1);
			assertEquals(neoSimpleEdge1, neoPathPart.getNeoPathPartEdges().get(0));
			NeoComplexEdge neoComplexEdge1 = FACTORY.createNeoComplexEdge();
			neoComplexEdge.addNeoPathPart(neoComplexEdge1);
			Class<NeoComplexEdgeImpl> c = NeoComplexEdgeImpl.class;
			Field f = c.getDeclaredField("neoPathPart");
			f.setAccessible(true);
			EList<NeoPathPart> partPathList= (EList<NeoPathPart>) f.get(neoComplexEdge);
			assertTrue(partPathList.contains(neoComplexEdge1));
			NeoComplexEdge neoComplexEdge2 = FACTORY.createNeoComplexEdge();
			neoComplexEdge1.addNeoPathPart(neoComplexEdge2);
			partPathList= (EList<NeoPathPart>) f.get(neoComplexEdge1);
			assertTrue(partPathList.contains(neoComplexEdge2));
			NeoComplexEdge neoComplexEdge3 = FACTORY.createNeoComplexEdge();
			NeoSimpleEdge neoSimpleEdge2 = FACTORY.createNeoSimpleEdge();
			NeoSimpleEdge neoSimpleEdge3 = FACTORY.createNeoSimpleEdge();
			neoComplexEdge3.addNeoPathPart(neoSimpleEdge2);
			neoComplexEdge3.addNeoPathPart(neoSimpleEdge3);
			neoComplexEdge.addNeoPathPart(neoComplexEdge3);
			partPathList= (EList<NeoPathPart>) f.get(neoComplexEdge);
			assertTrue(partPathList.contains(neoComplexEdge3));
			partPathList= (EList<NeoPathPart>) f.get(neoComplexEdge3);
			assertTrue(partPathList.contains(neoSimpleEdge2));
			assertTrue(partPathList.contains(neoSimpleEdge3));
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test 
	public void myToString() {
		try {
			String myToStringRef = "NeoComplexEdge [1] (NeoSimpleEdge1, NeoComplexEdge [2] (NeoSimpleEdge2))";
			NeoSimpleEdgeImpl mockNeoSimpleEdge1 = Mockito.mock(NeoSimpleEdgeImpl.class);
			Mockito.when(mockNeoSimpleEdge1.myToString()).thenReturn("NeoSimpleEdge1");
			EList<NeoPathPart> l = new BasicEList<NeoPathPart>();
			Mockito.when(mockNeoSimpleEdge1.getNeoPathPartEdges()).thenReturn(l);
			NeoSimpleEdgeImpl mockNeoSimpleEdge2 = Mockito.mock(NeoSimpleEdgeImpl.class);
			Mockito.when(mockNeoSimpleEdge2.myToString()).thenReturn("NeoSimpleEdge2");
			l = new BasicEList<NeoPathPart>();
			l.add(mockNeoSimpleEdge2);
			Mockito.when(mockNeoSimpleEdge2.getNeoPathPartEdges()).thenReturn(l);
			NeoComplexEdge neoComplexEdge1 = FACTORY.createNeoComplexEdge();
			neoComplexEdge1.addNeoPathPart(mockNeoSimpleEdge2);
			
			neoComplexEdge.addNeoPathPart(mockNeoSimpleEdge1);
			neoComplexEdge.addNeoPathPart(neoComplexEdge1);
			
			Class<PatternElementImpl> c = PatternElementImpl.class;
			Field f = c.getDeclaredField("id");
			f.setAccessible(true);
			f.set(neoComplexEdge, "1");
			f.set(neoComplexEdge1, "2");
			
			assertTrue(neoComplexEdge.myToString().compareTo(myToStringRef) == 0);
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test 
	public void getNeoLastEdge() {
		try {
			//Simple Version with two NeSimpleEdges
			NeoSimpleEdge neoSimpleEdge1 = FACTORY.createNeoSimpleEdge();
			NeoSimpleEdge neoSimpleEdge2 = FACTORY.createNeoSimpleEdge();
			neoComplexEdge.addNeoPathPart(neoSimpleEdge1);
			neoComplexEdge.addNeoPathPart(neoSimpleEdge2);
			assertEquals(neoSimpleEdge2, neoPathPart.getNeoLastEdge());
			unsetNeoPathPartInComplexEdge();
			
			//NeoLastEdge is in a Container
			NeoComplexEdge neoComplexEdge1 = FACTORY.createNeoComplexEdge();
			NeoComplexEdge neoComplexEdge2 = FACTORY.createNeoComplexEdge();
			neoComplexEdge1.addNeoPathPart(neoSimpleEdge1);
			neoComplexEdge2.addNeoPathPart(neoSimpleEdge2);
			neoComplexEdge.addNeoPathPart(neoComplexEdge1);
			neoComplexEdge.addNeoPathPart(neoComplexEdge2);
			

			assertEquals(neoSimpleEdge2, neoPathPart.getNeoLastEdge());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
		
	}

	//Check if the setting of NeoAbstractPathParam in the substructure is correct
	@Test
	@Override
	public void getNeoPathPartEdges() {
		assumeNotNull(neoPathPart.getNeoPathPartEdges());
		assumeTrue(neoPathPart.getNeoPathPartEdges().size() == 0);
		NeoPathPart part1 = FACTORY.createNeoComplexEdge();
		NeoPathPart part2 = FACTORY.createNeoComplexEdge();
		NeoPathPart part3 = FACTORY.createNeoSimpleEdge();
		NeoPathPart part4 = FACTORY.createNeoSimpleEdge();
		((NeoComplexEdge) part1).addNeoPathPart(part3);
		((NeoComplexEdge) part1).addNeoPathPart(part2);
		((NeoComplexEdge) part1).addNeoPathPart(part4);
		neoComplexEdge.addNeoPathPart(part1);
		assertEquals(part3, neoPathPart.getNeoPathPartEdges().get(0));
		assertEquals(part4, neoPathPart.getNeoPathPartEdges().get(1));
	}

	@Test
	@Override
	public void getCypherVariable() {
		try {
			NeoSimpleEdge mockNeoSimpleEdge1 = Mockito.mock(NeoSimpleEdgeImpl.class);
			NeoSimpleEdge mockNeoSimpleEdge2 = Mockito.mock(NeoSimpleEdgeImpl.class);
			NeoSimpleEdge mockNeoSimpleEdge3 = Mockito.mock(NeoSimpleEdgeImpl.class);
			Mockito.when(mockNeoSimpleEdge1.getCypherVariable()).thenReturn(VARIABLE_EDGE_1);
			Mockito.when(mockNeoSimpleEdge2.getCypherVariable()).thenReturn(VARIABLE_EDGE_2);
			Mockito.when(mockNeoSimpleEdge3.getCypherVariable()).thenReturn(VARIABLE_EDGE_3);
			EList<NeoPathPart> listNeoPathParts = new BasicEList<NeoPathPart>();
			listNeoPathParts.add(mockNeoSimpleEdge1);
			Mockito.when(mockNeoSimpleEdge1.getNeoPathPartEdges()).thenReturn(listNeoPathParts);
			listNeoPathParts = new BasicEList<NeoPathPart>();
			listNeoPathParts.add(mockNeoSimpleEdge2);
			Mockito.when(mockNeoSimpleEdge2.getNeoPathPartEdges()).thenReturn(listNeoPathParts);
			listNeoPathParts = new BasicEList<NeoPathPart>();
			listNeoPathParts.add(mockNeoSimpleEdge3);
			Mockito.when(mockNeoSimpleEdge3.getNeoPathPartEdges()).thenReturn(listNeoPathParts);
			neoComplexEdge.addNeoPathPart(mockNeoSimpleEdge1);
			neoComplexEdge.addNeoPathPart(mockNeoSimpleEdge2);
			neoComplexEdge.addNeoPathPart(mockNeoSimpleEdge3);
			
			assertTrue(neoPathPart.getCypherVariable().compareTo(VARIABLE_EDGE_1 + ", " + VARIABLE_EDGE_2 + ", " + VARIABLE_EDGE_3) == 0);
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void getCypherVariableException() {	
		try {
			assertNull(neoPathPart.getCypherVariable());
			neoComplexEdge.addNeoPathPart(FACTORY.createNeoComplexEdge());
			assertEquals(null, neoPathPart.getCypherVariable());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	//I do often the mocking since the structure of a component is relativly complex
	@ParameterizedTest
	@ValueSource(booleans =  {true, false})
	public void getCypherInnerEdgeNodes(boolean isReturn) {
		try {
			NeoSimpleEdgeImpl mockSimple1 = Mockito.mock(NeoSimpleEdgeImpl.class);
			NeoSimpleEdgeImpl mockSimple2 = Mockito.mock(NeoSimpleEdgeImpl.class);
			EList<NeoPathPart> sEdgeList = new BasicEList<NeoPathPart>();
			sEdgeList.add(mockSimple1);
			Mockito.when(mockSimple1.getNeoPathPartEdges()).thenReturn(sEdgeList);
			Mockito.when(mockSimple1.getCypherInnerEdgeNodes(Mockito.anyBoolean())).thenReturn(CypherSpecificConstants.INTERNAL_EDGE_NODE + 1)
																		.thenReturn(CypherSpecificConstants.VARIABLE_PROPERTY_NODE + 1)
																		.thenReturn(null);
			sEdgeList = new BasicEList<NeoPathPart>();
			sEdgeList.add(mockSimple2);
			Mockito.when(mockSimple2.getNeoPathPartEdges()).thenReturn(sEdgeList);
			Mockito.when(mockSimple2.getCypherInnerEdgeNodes(Mockito.anyBoolean())).thenReturn(CypherSpecificConstants.INTERNAL_EDGE_NODE + 2)
																		.thenReturn(CypherSpecificConstants.VARIABLE_PROPERTY_NODE + 2)
																		.thenReturn(null);
			neoComplexEdge.addNeoPathPart(mockSimple1);
			neoComplexEdge.addNeoPathPart(mockSimple2);
			assertDoesNotThrow(() -> neoComplexEdge.validateComplexEdge());
			
			String temp = neoComplexEdge.getCypherInnerEdgeNodes(isReturn);
			assertTrue(temp.compareTo(CypherSpecificConstants.INTERNAL_EDGE_NODE + 1 + ", " + CypherSpecificConstants.INTERNAL_EDGE_NODE + 2) == 0);
			
			temp = neoComplexEdge.getCypherInnerEdgeNodes(isReturn);
			assertTrue(temp.isEmpty());
			
			temp = neoComplexEdge.getCypherInnerEdgeNodes(isReturn);
			assertTrue(temp.isEmpty());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@ParameterizedTest
	@ValueSource(booleans =  {true, false})
	public void getCypherInnerEdgeNodesException(boolean isReturn) {
		try {
			assertThrows(InvalidityException.class, () -> neoComplexEdge.getCypherInnerEdgeNodes(isReturn));
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	@Test
	@Override
	public void isLastEdge() {
//		assertThrows(UnsupportedOperationException.class, () -> neoPathPart.isLastEdge());
	}

	@Test
	@Override
	public void generateCypher() {
		try {
			buildStructureForNeoSimpleEdgesStoredInComplexEdge(INTERNAL_EDGE_NODE_ID_1, INTERNAL_EDGE_NODE_ID_2, VARIABLE_PROPERTY_NODE_ID_3);
			String temp = neoPathPart.generateCypher();
			assertTrue(temp.compareTo(INTERNAL_EDGE_NODE_ID_1 + INTERNAL_EDGE_NODE_ID_2 + VARIABLE_PROPERTY_NODE_ID_3) == 0);
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void generateCypherWithException() {
		try {
			assertThrows(InvalidityException.class, () -> neoPathPart.generateCypher());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	@Test
	@Override
	public void generateInternalCypher() {
		try {
			buildStructureForNeoSimpleEdgesStoredInComplexEdge(INTERNAL_EDGE_NODE_ID_1, INTERNAL_EDGE_NODE_ID_2, VARIABLE_PROPERTY_NODE_ID_3);
			
			Class c = NeoComplexEdgeImpl.class;
			Method m = c.getDeclaredMethod("generateInternalCypher");
			m.setAccessible(true);
			String temp = (String) m.invoke(neoComplexEdge);
			assertTrue(temp.compareTo(INTERNAL_EDGE_NODE_ID_1 + INTERNAL_EDGE_NODE_ID_2 + VARIABLE_PROPERTY_NODE_ID_3) == 0);
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	private void buildStructureForNeoSimpleEdgesStoredInComplexEdge(String s1, String s2, String s3)
			throws InvalidityException {
		NeoSimpleEdge mockNeoSimpleEdge1 = Mockito.mock(NeoSimpleEdgeImpl.class);
		NeoSimpleEdge mockNeoSimpleEdge2 = Mockito.mock(NeoSimpleEdgeImpl.class);
		NeoSimpleEdge mockNeoSimpleEdge3 = Mockito.mock(NeoSimpleEdgeImpl.class);
		Mockito.when(mockNeoSimpleEdge1.generateCypher()).thenReturn(s1);
		Mockito.when(mockNeoSimpleEdge2.generateCypher()).thenReturn(s2);
		Mockito.when(mockNeoSimpleEdge3.generateCypher()).thenReturn(s3);
		BasicEList<NeoPathPart> listNeoPathParts = new BasicEList<NeoPathPart>();
		//Redundancy maybe something can be extracted
		listNeoPathParts.add(mockNeoSimpleEdge1);
		Mockito.when(mockNeoSimpleEdge1.getNeoPathPartEdges()).thenReturn(listNeoPathParts);
		listNeoPathParts = new BasicEList<NeoPathPart>();
		listNeoPathParts.add(mockNeoSimpleEdge2);
		Mockito.when(mockNeoSimpleEdge2.getNeoPathPartEdges()).thenReturn(listNeoPathParts);
		listNeoPathParts = new BasicEList<NeoPathPart>();
		listNeoPathParts.add(mockNeoSimpleEdge3);
		Mockito.when(mockNeoSimpleEdge3.getNeoPathPartEdges()).thenReturn(listNeoPathParts);
		neoComplexEdge.addNeoPathPart((NeoPathPart) mockNeoSimpleEdge1);
		neoComplexEdge.addNeoPathPart((NeoPathPart) mockNeoSimpleEdge2);
		neoComplexEdge.addNeoPathPart((NeoPathPart) mockNeoSimpleEdge3);
	}

	@Override
	public void isValidLocal() {
		// TODO Auto-generated method stub
		
	}

	//Inidectly tested: getHighestComplexEdge
	//The NeoPathParam && NeoPropertyPathParam are handelt inside a EMF container which can not be easyly accessed. Inside the class the it should rather the getNeoAbstractPathParam be used
	@Test
	@Override
	public void getNeoAbstractPathParam() {
		try {
			//If nothing is set return null
			assertNull(neoPathPart.getNeoComplexEdge());
			
			//If the NeoPathPart is set return it
			NeoAbstractPathParam neoAbstractPathParam = FACTORY.createNeoPathParam();
			neoPathPart.setNeoPathParam((NeoPathParam) neoAbstractPathParam);
			assertEquals(neoAbstractPathParam, neoPathPart.getNeoPathParam());
			neoPathPart.setNeoPathParam((NeoPathParam) null);
			assertNull(neoPathPart.getNeoPathParam());
			
			//If the NeoPropertyPathPart is set return it
			neoAbstractPathParam = FACTORY.createNeoPropertyPathParam();
			neoPathPart.setNeoPropertyPathParam((NeoPropertyPathParam) neoAbstractPathParam);
			assertEquals(neoAbstractPathParam, neoPathPart.getNeoPropertyPathParam());
			neoPathPart.setNeoPathParam((NeoPathParam) null);
			assertNull(neoPathPart.getNeoPropertyPathParam());		
			
			//If a NeoComplexEdge is set then return the NeoAbstractPathParam from that (NeoPathParam)
			NeoComplexEdge neoComplexEdge1 = FACTORY.createNeoComplexEdge();
			neoAbstractPathParam = FACTORY.createNeoPathParam();
			neoComplexEdge.setNeoPathParam((NeoPathParam) neoAbstractPathParam);
			neoComplexEdge1.setNeoComplexEdge(neoComplexEdge);
			Class<NeoPathPartImpl> c = NeoPathPartImpl.class;
			Method m = c.getDeclaredMethod("getNeoAbstractPathParam");
			m.setAccessible(true);
			assertEquals(neoAbstractPathParam, m.invoke(neoComplexEdge1));
			assumeNotNull(neoComplexEdge1.getNeoComplexEdge());
			
			//If a NeoComplexEdge is set then return the NeoAbstractPathParam from that (NeoPropertyPathParam)
			neoComplexEdge.setNeoPathParam(null);
			neoAbstractPathParam = FACTORY.createNeoPropertyPathParam();
			neoComplexEdge.setNeoPropertyPathParam((NeoPropertyPathParam) neoAbstractPathParam);
			assertEquals(neoAbstractPathParam, m.invoke(neoComplexEdge1));
			assumeNotNull(neoComplexEdge1.getNeoComplexEdge());
			
			//If no NeoPathParam is set
			assumeNotNull(neoComplexEdge1.getNeoComplexEdge());
			neoComplexEdge.setNeoPropertyPathParam((NeoPropertyPathParam) null);
			try {
				m.invoke(neoComplexEdge1);
			} catch (Exception e) {
				assertTrue(e.getCause().getClass() == InvalidityException.class);
			};
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	@Override
	public void getNeoAbstractPathParamException() {
		try {
			Method m = getTheGetNeoAbstractPathParamMethod();
			super.getNeoAbstractPathParamException(m);
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void setJustNeoComplexEdge() {
		//a NeoComplexEdge can not be changed --> Why ? --> I believe EMF is doing something --> Look it up
		NeoComplexEdge neoComplexEdge0 = FACTORY.createNeoComplexEdge();
		neoComplexEdge.setNeoComplexEdge(neoComplexEdge0);
		assertEquals(0, neoComplexEdge.getNeoPathPartEdges().size());
		assertEquals(0, neoComplexEdge0.getNeoPathPartEdges().size());
		assertEquals(neoComplexEdge0, neoComplexEdge.getNeoComplexEdge());
	}

	//Something is wrong
	//Add that previews neoComplexEdge is not to set NeoComplexEdge
	@Test
	@Override
	public void setNeoComplexEdge() {
		//A NeoComplexEdge will be set with a NeoComplexEdge and NeoSimpleEdge inside
		try {			
			NeoComplexEdge neoComplexEdge1 = FACTORY.createNeoComplexEdge();
			neoComplexEdge1.addNeoPathPart(FACTORY.createNeoComplexEdge());
			neoComplexEdge1.addNeoPathPart(FACTORY.createNeoSimpleEdge());
			((NeoComplexEdge) neoPathPart).addNeoPathPart(neoComplexEdge1);
			assumeNotNull(((NeoComplexEdge) neoPathPart).getNeoPathPart());
			assertTrue(((NeoComplexEdge) neoPathPart).getNeoPathPart().size() == 1);
			assumeNotNull(neoComplexEdge1.getNeoPathPart());
			assertTrue(neoComplexEdge1.getNeoPathPart().size() == 2);
			
			assertEquals(neoComplexEdge, neoComplexEdge1.getNeoComplexEdge());
			Class<NeoComplexEdgeImpl> c = NeoComplexEdgeImpl.class;
			Field f = c.getDeclaredField("count");
			f.setAccessible(true);
			assertEquals(f.get(neoPathPart), f.get(neoComplexEdge1));
			int i = 0;
			for (NeoPathPart part : neoComplexEdge1.getNeoPathPartEdges()) {
				assertEquals(i, ((NeoSimpleEdgeImpl)part).getEdgeNumber());
				i++;
			}
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	@Override
	public void setCount() {
		// TODO Auto-generated method stub
		
	}
	
	//InternalCount --> Can be tested indirectly
	//Has to be reworked --> Think about it
//	volatile NeoComplexEdge threadNeoComplexEdge;
//	@Test
//	public void internalCountThrosException() {
//		threadNeoComplexEdge = FACTORY.createNeoComplexEdge();
//		class threaty implements Runnable {  
//			public void run(){  
//				AdaptionNeo4JFactory f = new AdaptionNeo4JFactoryImpl();
//				for (int i = 0; i < Integer.MAX_VALUE; i++) {
//					threadNeoComplexEdge.addNeoPathPart(f.createNeoSimpleEdge());
//				} 
//				
//			}
//		}
//		threaty m1 = new threaty();  
//		Thread t1 = new Thread(m1); 
//		t1.start();
//		assertThrows(IndexOutOfBoundsException.class, () -> threadNeoComplexEdge.addNeoPathPart(FACTORY.createNeoSimpleEdge()));
//	}
}
