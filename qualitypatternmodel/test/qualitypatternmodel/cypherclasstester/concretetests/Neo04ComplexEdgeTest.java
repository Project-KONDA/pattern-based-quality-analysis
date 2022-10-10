package qualitypatternmodel.cypherclasstester.concretetests;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeNotNull;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.lang.reflect.Field;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.NeoComplexEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPathPart;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
import qualitypatternmodel.adaptionNeo4J.impl.NeoComplexEdgeImpl;
import qualitypatternmodel.cypherclasstester.NeoAbstractPathPartTest;
import qualitypatternmodel.exceptions.InvalidityException;

public class Neo04ComplexEdgeTest extends NeoAbstractPathPartTest {
	NeoComplexEdge neoComplexEdge;
	
	@BeforeAll
    static void initAll() {
		
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
	
	
	@Test
	public void validateComplexEdge() {
		try {
			neoComplexEdge.addNeoPathPart(FACTORY.createNeoSimpleEdge());
			neoComplexEdge.addNeoPathPart(FACTORY.createNeoSimpleEdge());
			assertTrue(neoComplexEdge.validateComplexEdge());
			((NeoComplexEdgeImpl) neoComplexEdge).eUnset((int) AdaptionNeo4JPackage.NEO_COMPLEX_EDGE__NEO_PATH_PART);
			assumeNotNull(neoComplexEdge.getNeoPathPartEdges());
			assertTrue(neoComplexEdge.getNeoPathPartEdges().size() == 0);
			
			//In NeoComplexEdges
			NeoComplexEdge neoComplexEdge1 = FACTORY.createNeoComplexEdge();
			neoComplexEdge1.addNeoPathPart(FACTORY.createNeoSimpleEdge());
			NeoComplexEdge neoComplexEdge2 = FACTORY.createNeoComplexEdge();
			neoComplexEdge2.addNeoPathPart(FACTORY.createNeoSimpleEdge());
			neoComplexEdge.addNeoPathPart(FACTORY.createNeoSimpleEdge());
			neoComplexEdge.addNeoPathPart(neoComplexEdge1);
			neoComplexEdge.addNeoPathPart(neoComplexEdge2);
			assertTrue(neoComplexEdge.validateComplexEdge());
			
			//In NeoComplexEdges -- WITH LAST EDGE
			NeoComplexEdge neoComplexEdge3 = FACTORY.createNeoComplexEdge();
			neoComplexEdge3.addNeoPathPart(FACTORY.createNeoSimpleEdge());
			NeoComplexEdge neoComplexEdge4 = FACTORY.createNeoComplexEdge();
			NeoSimpleEdge neoSimpleEdge1 = FACTORY.createNeoSimpleEdge();
			neoSimpleEdge1.setIsLastEdge(true);
			neoComplexEdge4.addNeoPathPart(neoSimpleEdge1);
			neoComplexEdge.addNeoPathPart(FACTORY.createNeoSimpleEdge());
			neoComplexEdge.addNeoPathPart(neoComplexEdge1);
			neoComplexEdge.addNeoPathPart(neoComplexEdge2);
			assertTrue(neoComplexEdge.validateComplexEdge());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void notValidatComplexEdge() {
		assertDoesNotThrow(() -> neoComplexEdge.validateComplexEdge());
		neoComplexEdge.addNeoPathPart(FACTORY.createNeoComplexEdge());
		neoComplexEdge.addNeoPathPart(FACTORY.createNeoComplexEdge());
		assertThrows(InvalidityException.class, () -> neoComplexEdge.validateComplexEdge());
		((NeoComplexEdgeImpl) neoComplexEdge).eUnset((int) AdaptionNeo4JPackage.NEO_COMPLEX_EDGE__NEO_PATH_PART);
		assumeNotNull(neoComplexEdge.getNeoPathPartEdges());
		assertTrue(neoComplexEdge.getNeoPathPartEdges().size() == 0);
		
		//MultiEdges
		NeoSimpleEdge neoSimpleEdge = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.setIsLastEdge(true);;
		neoComplexEdge.addNeoPathPart(neoSimpleEdge);
		neoSimpleEdge = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.setIsLastEdge(true);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge);
		assertThrows(InvalidityException.class, () -> neoComplexEdge.validateComplexEdge());
		((NeoComplexEdgeImpl) neoComplexEdge).eUnset((int) AdaptionNeo4JPackage.NEO_COMPLEX_EDGE__NEO_PATH_PART);
		assumeNotNull(neoComplexEdge.getNeoPathPartEdges());
		assertTrue(neoComplexEdge.getNeoPathPartEdges().size() == 0);
		
		//Last Edge is not @ the end
		neoSimpleEdge = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.setIsLastEdge(true);;
		neoComplexEdge.addNeoPathPart(neoSimpleEdge);
		neoSimpleEdge = FACTORY.createNeoSimpleEdge();
		neoComplexEdge.addNeoPathPart(neoSimpleEdge);
		assertThrows(InvalidityException.class, () -> neoComplexEdge.validateComplexEdge());
		((NeoComplexEdgeImpl) neoComplexEdge).eUnset((int) AdaptionNeo4JPackage.NEO_COMPLEX_EDGE__NEO_PATH_PART);
		assumeNotNull(neoComplexEdge.getNeoPathPartEdges());
		assertTrue(neoComplexEdge.getNeoPathPartEdges().size() == 0);
	}
	
	//Addaitions to this test have to follow since not all possiblities are tested
	@Test
	public void addNeoPathPart() {
		try {
			neoComplexEdge.addNeoPathPart(null);
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
	public void isLastEdgeAtTheEnd() {
		
	}
	
	@Test 
	public void hasMultipleLastEdges() {
		
	}
	
	@Test 
	public void countOfEdges() {
		
	}
	
	@Test 
	public void myToString() {
		
	}
	
	@Test 
	public void getNeoLastEdge() {
		
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

	@Override
	public void getCypherVariable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCypherInnerEdgeNodes(boolean isReturn) throws InvalidityException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void isLastEdge() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generateCypher() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generateInternalCypher() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void isValidLocal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getNeoAbstractPathParam() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setNeoComplexEdge(NeoComplexEdge newNeoComplexEdge) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCount() {
		// TODO Auto-generated method stub
		
	}
	//Testing the inner Counter has to be introduced here
}
