package qualitypatternmodel.cypherclasstester.concretetests;


import static org.junit.Assume.assumeNotNull;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;

import qualitypatternmodel.adaptionNeo4J.NeoComplexEdge;
import qualitypatternmodel.adaptionNeo4J.NeoDirection;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
import qualitypatternmodel.cypherclasstester.NeoAbstractPathPartTest;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.parameters.TextListParam;

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
		assertDoesNotThrow(() -> neoSimpleEdge.addTargetNodeLabel(label));
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
		assertDoesNotThrow(() -> neoSimpleEdge.addTargetNodeLabel(label));
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
			assertDoesNotThrow(() ->  neoSimpleEdge.addTargetNodeLabel(label));
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
			assertDoesNotThrow(() ->  neoSimpleEdge.addTargetNodeLabel(label));
		}
		EList<String> labelList = neoSimpleEdge.getNeoTargetNodeLabels().getValues();
		assumeNotNull(labelList);
		
		assertTrue(labels.length - 2 == labelList.size());
		assertEquals(labels[0], labelList.get(0));
		assertEquals(labels[1], labelList.get(1));
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
