package qualitypatternmodel.cypherclasstests.concretetests;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import qualitypatternmodel.adaptionneo4j.NeoEdgeLabelParam;
import qualitypatternmodel.cypherclasstests.NeoLabelTest;
import qualitypatternmodel.exceptions.InvalidityException;

public class Cypher05NeoEdgeLabelParamTest extends NeoLabelTest {
	NeoEdgeLabelParam edgeLabel = null;
	
	@BeforeEach
	public void setUp() {
		edgeLabel = FACTORY.createNeoEdgeLabelParam();
		label = edgeLabel;
	}
	
	@AfterEach
	public void tearDown() {
		super.tearDown();
		edgeLabel = null;
	}
	
	@Override
	@ParameterizedTest
	@ValueSource(strings = {"Regesta1", "Regesta_2", "IndexPlaceäüö", "Index_Entry", "", "null"})
	public void setValueIfValid(String label) {
		if (label.compareTo("null") == 0) {
			assertDoesNotThrow(() -> edgeLabel.setValueIfValid(null));
		}
		assertDoesNotThrow(() -> edgeLabel.setValueIfValid(label));
	}
	
	@Override
	@ParameterizedTest
	@ValueSource(strings = {"Regesta1@", "Reges ta2", "Index-Place", "Index<>Entry", "Index\\Entry", "Index||Entry",  "Index$ Entry" })
	public void setValueIfValidException(String label) {
		assertThrows(InvalidityException.class, () -> edgeLabel.setValueIfValid(label));		
	}

	@Test
	@Override
	public void generateCypher() {
		try {
			final String seperator = ":";
			String correctLabel = "Regesta1";
			edgeLabel.setValueIfValid(correctLabel);
			assertTrue(edgeLabel.generateCypher().compareTo(seperator + correctLabel) == 0);
			
			correctLabel = "IndexPlace";
			edgeLabel.setValueIfValid(correctLabel);
			assertTrue(edgeLabel.generateCypher().compareTo(seperator + correctLabel) == 0);
			
			correctLabel = "IndexEntry";
			edgeLabel.setValueIfValid(correctLabel);
			assertTrue(edgeLabel.generateCypher().compareTo(seperator + correctLabel) == 0);			
		} catch (Exception e) {
			assertFalse(true);
		}
	}
	
	@Test
	@Override
	public void myToString() {
		edgeLabel.setValue("Regesta");
		assertTrue(edgeLabel.myToString().compareTo("label [-1] 'Regesta'") == 0);
	}

	@Test
	@Override
	public void toStringT() {
		edgeLabel.setValue("Regesta");
		assertTrue(edgeLabel.toString().endsWith("(label: Regesta)"));
	}
}
