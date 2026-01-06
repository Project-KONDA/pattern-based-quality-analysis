package newservelettest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.newservlets.ServletConstants;
import qualitypatternmodel.newservlets.initialisation.PatternCollection;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.PatternUtility;
import qualitypatternmodel.utility.XmlServletUtility;

public class PatternCollectionTests {

	// Setup
	private static Boolean oldVariantsTypeConstraint = false;
	private static Boolean oldVariantsTypeAntipattern = false;

	@BeforeAll
	public static void initialize() {
		oldVariantsTypeConstraint = ServletConstants.VARIANTS_TYPE_CONSTRAINT;
		oldVariantsTypeAntipattern = ServletConstants.VARIANTS_TYPE_ANTIPATTERN;
		ServletConstants.VARIANTS_TYPE_CONSTRAINT = true;
		ServletConstants.VARIANTS_TYPE_ANTIPATTERN = true;
	}

	@AfterAll
	public static void close() {
		ServletConstants.VARIANTS_TYPE_CONSTRAINT = oldVariantsTypeConstraint;
		ServletConstants.VARIANTS_TYPE_ANTIPATTERN = oldVariantsTypeAntipattern;
	}


	// Parameters
	
	private static List<PatternClass> getTemplateInstances() {
		return PatternCollection.getPatternClassInstances();
	}
	
	private static List<CompletePattern> genericPatterns() {
		return PatternCollection.getGenericPatterns();
	}
	
	private static List<CompletePattern> xmlPatterns() throws InvalidityException {
		return PatternCollection.getXmlPatterns();
	}
	
	private static List<CompletePattern> rdfPatterns() throws InvalidityException {
		return PatternCollection.getRdfPatterns();
	}
	
	private static List<CompletePattern> neoPatterns() throws InvalidityException {
		return PatternCollection.getNeoPatterns();
	}

	@ParameterizedTest
    @MethodSource("getTemplateInstances")
	public void testPatternClass(PatternClass clazz) {
		
	}

	@ParameterizedTest
    @MethodSource("genericPatterns")
	public void testGenericPattern(CompletePattern pattern) {
		assertDoesNotThrow(() -> pattern.isValid(AbstractionLevel.GENERIC));
	}

	@ParameterizedTest
    @MethodSource("xmlPatterns")
	public void testXmlPattern(CompletePattern pattern) throws InvalidityException {
		testSemiConcretePattern(pattern);
	}

	@ParameterizedTest
    @MethodSource("rdfPatterns")
	public void testRdfPattern(CompletePattern pattern) throws InvalidityException {
		testSemiConcretePattern(pattern);
	}

	@ParameterizedTest
    @MethodSource("neoPatterns")
	public void testNeoPattern(CompletePattern pattern) throws InvalidityException {
		testSemiConcretePattern(pattern);
	}
	
	private void testSemiConcretePattern(CompletePattern pattern) throws InvalidityException {
		assertDoesNotThrow(() -> pattern.isValid(AbstractionLevel.SEMI_CONCRETE));
		if (pattern.getText().size() == 0)
			System.out.println("No variants coded in " + pattern.getName());
		
		if (pattern.getText().size() > 0) {

			switch(pattern.getLanguage()) {
			case XML: {
				PatternUtility.fillParameter(pattern);
				String query = assertDoesNotThrow(() -> (pattern.generateXQuery()));
				validateXmlQuery(query);
				assertDoesNotThrow(() -> validateXmlQuery(query));
				break;
			}
			case RDF: {
				PatternUtility.fillParameter(pattern);
				String query = assertDoesNotThrow(() -> (pattern.generateSparql()));
				assertDoesNotThrow(() -> validateSparql(query));
				break;	
			}
			case NEO4J: {
				break;	
			}
			default:
				throw new RuntimeException("Pattern has no valid Language");
			}
		}
	}
	
	private void validateXmlQuery(String query) throws InvalidityException {
		XmlServletUtility.executeXQueryJava(query);
	}
	
	private void validateSparql(String query) throws InvalidityException {
	}

}
