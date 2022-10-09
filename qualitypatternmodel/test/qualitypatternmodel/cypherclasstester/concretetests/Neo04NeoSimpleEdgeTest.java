package qualitypatternmodel.cypherclasstester.concretetests;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import qualitypatternmodel.adaptionNeo4J.NeoComplexEdge;
import qualitypatternmodel.adaptionNeo4J.NeoDirection;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
import qualitypatternmodel.cypherclasstester.NeoAbstractPathPartTest;
import qualitypatternmodel.exceptions.InvalidityException;

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
	
	@Test
	public void addTargetNodeLabel() {
		
	}
	
	@Test
	public void addNeoEdgeLabel() {
		
	}
	
	@Test
	public void generateInternalCypherLabelGenerator() {
		
	}
	
	@Test
	public void setCount() {
		
	}

	@Override
	public void getNeoPathPartEdges() {
		// TODO Auto-generated method stub
		
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
	public void getNeoLastEdge() throws InvalidityException {
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
	public void myToString() {
		// TODO Auto-generated method stub
		
	}
	
	
}
