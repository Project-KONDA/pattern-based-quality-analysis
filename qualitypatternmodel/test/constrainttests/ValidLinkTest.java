package constrainttests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import qualitypatternmodel.javaoperators.JavaoperatorsFactory;
import qualitypatternmodel.javaoperators.ValidateLinkOperator;
import qualitypatternmodel.parameters.impl.BooleanParamImpl;

public class ValidLinkTest {
	
	static String[] validlinks = new String[] {
			"https://muenzen.uni-koeln.de/portal/databases/id/muenzen/titles/id/VAR_0008.html", 
			"https://www.google.com"
		};
	
	static String[] invalidlinks = new String[] {
			"das_ist_ein_nicht-valider_link", 
			"http://www.bildindex.de/bilder/m/mi11813dsfsfsfjösfc13"
		};
	
	static String[] falsePositives = new String[] {
			"https://www.britishmuseum.org/collection/object/P_1234752980", 
			"https://www.bildindex.de/document/obj123456789876543", 
		};

	static String[] falseNegatives = new String[] {
			
		};
	
	
	
	static ValidateLinkOperator validateLink;

	@BeforeAll
	static void initialize() {
		validateLink = JavaoperatorsFactory.eINSTANCE.createValidateLinkOperator();
		validateLink.setOption(new BooleanParamImpl());
		validateLink.getOption().setValue(false);
	}
	@AfterAll
	static void end() {
		validateLink = null;
	}
	
	
    static Stream<Arguments> provideData() {
    	Stream<String> positive = Stream.concat(Stream.of(validlinks), Stream.of(falsePositives));
    	Stream<String> negative = Stream.concat(Stream.of(invalidlinks), Stream.of(falseNegatives));
        Stream<Arguments> validArgs = positive
                .map(s -> Arguments.of(s, true));
        Stream<Arguments> invalidArgs = negative
                .map(s -> Arguments.of(s, false));
        return Stream.concat(validArgs, invalidArgs);
    }

	@ParameterizedTest
	@MethodSource("provideData")
	public void testtestValidateLink (String link, Boolean expected) {
		Boolean res = validateLink.apply(link);
		assertEquals(expected, res);
	}
}
