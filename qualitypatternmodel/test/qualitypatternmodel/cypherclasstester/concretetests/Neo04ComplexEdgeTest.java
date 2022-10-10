package qualitypatternmodel.cypherclasstester.concretetests;


import static org.junit.Assume.assumeNotNull;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import qualitypatternmodel.adaptionNeo4J.NeoComplexEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPathPart;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
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
		
	}
	
	@Test
	public void addNeoPathPart() {
		
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
		((NeoComplexEdge) part1).addNeoPathPart(part2);
		((NeoComplexEdge) part1).addNeoPathPart(part3);
		part3.setNeoComplexEdge((NeoComplexEdge) part1);
		((NeoComplexEdge) part2).addNeoPathPart(part4);
		((NeoComplexEdge) neoPathPart).addNeoPathPart(part1);
		
		assertEquals(part1, neoPathPart.getNeoPathPartEdges().get(0));
		assertEquals(part2, neoPathPart.getNeoPathPartEdges().get(0).getNeoPathPartEdges().get(1));
		assertEquals(part2, neoPathPart.getNeoPathPartEdges().get(0).getNeoPathPartEdges().get(1).getNeoPathPartEdges().get(0));
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
