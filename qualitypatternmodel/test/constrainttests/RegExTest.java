package constrainttests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.operators.impl.MatchImpl;
import qualitypatternmodel.patternstructure.Language;

public class RegExTest {
	
    static Stream<Arguments> provideRegexData() {
    	return Stream.of(
    			Arguments.of(dateregex, validIsoDates, invalidIsoDates)
    			);
    }
    
    static Stream<Arguments> provideFlattenedData() {
        return provideRegexData().flatMap(args -> {
            String regex = (String) args.get()[0];
            String[] valid = (String[]) args.get()[1];
            String[] invalid = (String[]) args.get()[2];

            Stream<Arguments> validArgs = Stream.of(valid)
                    .map(s -> Arguments.of(regex, s, "true"));
            Stream<Arguments> invalidArgs = Stream.of(invalid)
                    .map(s -> Arguments.of(regex, s, "false"));

            return Stream.concat(validArgs, invalidArgs);
        });
    }
    
    @ParameterizedTest(name = "[{index}] regex={0}, input={1}, expected={2}")
    @MethodSource("provideFlattenedData")
    @DisplayName("Regex string-level validation")
    void testRegex (String regex, String input, String expected) throws InvalidityException {
		String res = MatchImpl.matches(input, regex, Language.XML);
		assertEquals(expected, res);
    }
    
    
    // INPUT VALUES 
   
    // ISO DATES
    
    static String dateregex = "^\\d{4}(-[01]\\d(-[0-3]\\d(T([01]\\d|2[0-3]):[0-5]\\d(:[0-5]\\d(\\.\\d+)?)?([+\\-][01]\\d:[03]0)?)?)?)?$";
	
	static String[] validIsoDates = new String[] {
			"2025-10-21",
			"2025-10-21T14:05",
			"2024-06-10T09:52:21.658",
			"2025-10-21T14:05:09+05:30",
			"2020-10-03T09:24:46+02:00",
			"2019-08-25T12:51:27+02:00",
			"2020-05-08T08:20:53+02:00",
			"2020-10-03T09:24:46+01:00",
			"2020-10-03T19:24:46+01:00",
			"2020-10-02T22:33:53+01:00",
			"2020-10-02T22:48:26+01:00",
			"2020-10-02T22:48:26-01:00",
			"2020-10-03T09:24:46+02:00",
			"2020-10-02T22:33:53+01:00",
			"2020-10-02T22:48:26+01:00"
	};

    static String[] invalidIsoDates = new String[] {
			"20250832",
			"25-08-2025", 
			"2024-06-10T09:52:21658",
			"2020-10-02T24:48:26+01:00"};
    
    
}
