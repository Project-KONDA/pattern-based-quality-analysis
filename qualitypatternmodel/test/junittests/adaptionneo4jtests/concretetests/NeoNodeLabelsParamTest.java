package junittests.adaptionneo4jtests.concretetests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import junittests.adaptionneo4jtests.NeoLabelTest;
import qualitypatternmodel.adaptionneo4j.NeoNodeLabelsParam;
import qualitypatternmodel.exceptions.InvalidityException;

public class NeoNodeLabelsParamTest extends NeoLabelTest {

	NeoNodeLabelsParam nodeLabel = null;

	@Override
	@BeforeEach
	public void setUp() {
		nodeLabel = FACTORY.createNeoNodeLabelsParam();
		label = nodeLabel;
	}

	@Override
	@AfterEach
	public void tearDown() {
		super.tearDown();
		nodeLabel = null;
	}

	@Override
	@ParameterizedTest
	@ValueSource(strings = {"Regesta1", "Regesta_2,IndexPlace", "Index_Entry,Index_Entry"})
	public void setValueIfValid(String label) {
		final EList<String> newValue = new BasicEList<String>();
		fillLabelList(label, newValue);
		assertDoesNotThrow(() -> nodeLabel.setValueIfValid(newValue));
	}

	@ParameterizedTest
	@ValueSource(strings = {"Regesta1", "Regesta_2,IndexPlace", "Index_Entry,Index_Entry", "null"})
	public void addStringValue(String label) {
		if (label.compareTo("null") == 0) {
			assertDoesNotThrow(() -> nodeLabel.addStringValue(null));
		} else {
			final String[] labels = label.split(",");
			int i = 0;
			for (String templabel : labels) {
				assertDoesNotThrow(() -> nodeLabel.addStringValue(templabel));
				if (label.compareTo("Index_Entry,Index_Entry") != 0) {
					assertEquals(templabel, nodeLabel.getValues().get(i));
					i++;
				} else {
					assertTrue(nodeLabel.getValues().size() == 1);
				}
			}
		}
	}

	@Override
	@ParameterizedTest
	@ValueSource(strings = {"Regesta1@, Reges ta2", "Index-Place", "Index<>Entry,Index\\Entry", "Index||Entry",  "Index$ Entry"})
	public void setValueIfValidException(String label) {
		final EList<String> newValue = new BasicEList<String>();
		fillLabelList(label, newValue);
		assertThrows(InvalidityException.class, () -> nodeLabel.setValueIfValid(newValue));
	}

	@ParameterizedTest
	@ValueSource(strings = {"Regesta1@, Reges ta2", "Index-Place", "Index<>Entry,Index\\Entry", "Index||Entry", "Index$ Entry"})
	public void addStringValueException(String label) {
		final String[] labels = label.split(",");
		for (String templabel : labels) {
			assertThrows(InvalidityException.class, () -> nodeLabel.addStringValue(templabel));
		}
	}

	@Test
	@Override
	public void generateCypher() {
		try {
			final EList<String> newValue = new BasicEList<String>();
			final String seperator = ":";
			newValue.add("Regesta1");
			nodeLabel.setValueIfValid(newValue);
			assertTrue(nodeLabel.generateCypher().compareTo(seperator + "Regesta1") == 0);

			newValue.add("IndexPlace");
			nodeLabel.setValueIfValid(newValue);
			assertTrue(nodeLabel.generateCypher().compareTo(seperator + "Regesta1" + seperator + "IndexPlace") == 0);
		} catch (Exception e) {
			assertFalse(true);
		}
	}

	@Test
	@Override
	public void myToString() {
		final EList<String> newValue = new BasicEList<String>();
		newValue.add("Regesta");
		newValue.add("IndexPlace");
		assertDoesNotThrow(() -> nodeLabel.setValueIfValid(newValue));
		assertTrue(nodeLabel.myToString().compareTo("NeoNodeLabels [-1] ('Regesta', 'IndexPlace')") == 0);
	}

	@Test
	@Override
	public void toStringT() {
		final EList<String> newValue = new BasicEList<String>();
		newValue.add("Regesta");
		newValue.add("IndexPlace");
		assertDoesNotThrow(() -> nodeLabel.setValueIfValid(newValue));
		assertTrue(nodeLabel.myToString().compareTo("NeoNodeLabels [-1] ('Regesta', 'IndexPlace')") == 0);
	}

	//FACTORY- and HELPER-METHODS
	private final void fillLabelList(String label, final EList<String> newValue) {
		final String[] labels = label.split(",");
		for (String currentlabel: labels) {
			newValue.add(currentlabel);
		}
	}
}
