package junittests.adaptionneo4jtests.concretetests;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import junittests.adaptionneo4jtests.NeoPropertyNameParamTest;
import qualitypatternmodel.adaptionneo4j.NeoPropertyNameParam;
import qualitypatternmodel.exceptions.InvalidityException;

public class Cypher05NeoPropertyName extends NeoPropertyNameParamTest {

	NeoPropertyNameParam propertyName = null;
	
	@BeforeEach
	public void setUp() {
		propertyName = FACTORY.createNeoPropertyNameParam();
	}
	
	@AfterEach
	public void tearDown() {
		propertyName = null;
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"title", "titl_e", "titleäüö", "title123", "null"})
	public void setValueIfValid(String property) {
		if (property.compareTo("null") == 0) {
			assertDoesNotThrow(() -> propertyName.setValueIfValid(null));	
			assertEquals(null, propertyName.getValue());
		} else {
			assertDoesNotThrow(() -> propertyName.setValueIfValid(property));	
			assertEquals(property, propertyName.getValue());			
		}
	}
	
	@Override
	@ParameterizedTest
	@ValueSource(strings = {"","title@", "tit le", "title<>title", "title||title",  "title$"})
	public void setValueIfValidException(String property) {
		assertThrows(InvalidityException.class, () -> propertyName.setValueIfValid(property));		
		assertEquals(null, propertyName.getValue());
	}

	@Test
	@Override
	public void generateCypher() {		
		assertDoesNotThrow(() -> propertyName.setValueIfValid("title"));
		try {
			assertTrue(propertyName.generateCypher().toString().compareTo("title") == 0);
		} catch (InvalidityException e) {
			assertFalse(true);
		}
	}
	
	@Test
	public void generateCypherException() {
		assertThrows(InvalidityException.class, () -> propertyName.generateCypher());
	}
	
	@Test
	@Override
	public void myToString() {
		assertDoesNotThrow(() -> propertyName.setValueIfValid("title"));
		System.out.println(propertyName.myToString());
		assertTrue(propertyName.myToString().compareTo("property name [-1] 'title'") == 0);
	}

	@Test
	@Override
	public void toStringT() {
		assertDoesNotThrow(() -> propertyName.setValueIfValid("title"));
		assertTrue(propertyName.toString().endsWith("(property name: title)"));
	}
}
