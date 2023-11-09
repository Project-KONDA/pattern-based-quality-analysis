package javaoperatortests;

import java.util.List;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaquery.JavaFilter;
import qualitypatternmodel.patternstructure.CompletePattern;

public class InterimResultTest {

	public static void main(String[] args) throws InvalidityException {
		testTestPattern(OneArgTestPatterns.getTestPattern1(), getTestList1());
		testTestPattern(OneArgTestPatterns.getTestPattern2(), getTestList1());
		testTestPattern(OneArgTestPatterns.getTestPattern3(), null);
		testTestPattern(OneArgTestPatterns.getTestPattern4(), null);
		testTestPattern(OneArgTestPatterns.getTestPattern5(), null);
		testTestPattern(OneArgTestPatterns.getTestPattern6(), getTestList2true());
		testTestPattern(OneArgTestPatterns.getTestPattern6(), getTestList2false());
		testTestPattern(OneArgTestPatterns.getTestPattern7(), null);
		testTestPattern(OneArgTestPatterns.getTestPattern8(), null);
		testTestPattern(OneArgTestPatterns.getTestPattern9(), getTestList1());
		testTestPattern(OneArgTestPatterns.getTestPattern10(), null);
		
	}
	
	
	private static void testTestPattern(CompletePattern testpattern, List<Object> rawResults) throws InvalidityException {
		if (rawResults == null) return;
		JavaFilter filter = testpattern.generateQueryFilter();
		filter.createInterimResultContainer(rawResults);
		System.out.println(filter.filterQueryResults());
	}
	
	private static List<Object> getTestList1 () {
		return List.of(
				List.of("record1",
						List.of("https://en.wikipedia.org/wiki/Empire_State_Building",
								"https://en.wikinotpedia.org/wiki/Empire_State_Building-invalidlink", // invalid
								"https://en.wikipedia.org/wiki/Empire_State_Building")),
				List.of("record2", List.of("https://en.wikipedia.org/wiki/Chrysler_Building")),
				List.of("record3", List.of("thisisnotevenalink")), // invalid
				List.of("record4", List.of("https://en.wikipedia.org/wiki/ihopethisentrydoesnotexist")), // invalid
				List.of("record5", List.of()), 
				List.of("record6", List.of("thisisnotevenalink", "thisisnotevenalink")), // invalid
				List.of("record7", List.of("https://de.wikipedia.org/wiki/Mona_Lisa")),
				List.of("record8", List.of("https://en.wikipedia.org/wiki/Salvator_Mundi_(Leonardo)")),
				List.of("record9", List.of()), 
				List.of("record10", List.of()),
				List.of("record11", List.of("thisisnotevenalink")), // invalid
				List.of("record12", List.of("https://en.wikipedia.org/wiki/Leonardo_da_Vinci")));
	}
	
	private static List<Object> getTestList2true() {
		return List.of(
				List.of("record1",
						List.of( "true",
						List.of("https://en.wikipedia.org/wiki/Empire_State_Building",
								"https://en.wikinotpedia.org/wiki/Empire_State_Building-invalidlink", // invalid
								"https://en.wikipedia.org/wiki/Empire_State_Building"))),
				
				List.of("record2",
						List.of( "true",
						List.of("https://en.wikipedia.org/wiki/Chrysler_Building"))),
				
				List.of("record3",
						List.of( "true",
						List.of("thisisnotevenalink"))), // invalid
				
				List.of("record4",
						List.of( "true",
						List.of("https://en.wikipedia.org/wiki/ihopethisentrydoesnotexist"))), // invalid
				
				List.of("record5",
						List.of( "true",
						List.of())), 
				
				List.of("record6",
						List.of( "true",
						List.of("thisisnotevenalink", "thisisnotevenalink"))), // invalid
				
				List.of("record7",
						List.of( "true",
						List.of("https://de.wikipedia.org/wiki/Mona_Lisa"))),
				
				List.of("record8",
						List.of( "true",
						List.of("https://en.wikipedia.org/wiki/Salvator_Mundi_(Leonardo)"))),
				
				List.of("record9",
						List.of( "true",
						List.of())), 
				
				List.of("record10",
						List.of( "true",
						List.of())),
				
				List.of("record11",
						List.of( "true",
						List.of("thisisnotevenalink"))), // invalid
				
				List.of("record12",
						List.of( "true",
						List.of("https://en.wikipedia.org/wiki/Leonardo_da_Vinci"))));
		
	}
	
	private static List<Object> getTestList2false() {
		return List.of(
				List.of("record1",
						List.of( "false",
						List.of("https://en.wikipedia.org/wiki/Empire_State_Building",
								"https://en.wikinotpedia.org/wiki/Empire_State_Building-invalidlink", // invalid
								"https://en.wikipedia.org/wiki/Empire_State_Building"))),
				
				List.of("record2",
						List.of( "false",
						List.of("https://en.wikipedia.org/wiki/Chrysler_Building"))),
				
				List.of("record3",
						List.of( "false",
						List.of("thisisnotevenalink"))), // invalid
				
				List.of("record4",
						List.of( "false",
						List.of("https://en.wikipedia.org/wiki/ihopethisentrydoesnotexist"))), // invalid
				
				List.of("record5",
						List.of( "false",
						List.of())), 
				
				List.of("record6",
						List.of( "false",
						List.of("thisisnotevenalink", "thisisnotevenalink"))), // invalid
				
				List.of("record7",
						List.of( "false",
						List.of("https://de.wikipedia.org/wiki/Mona_Lisa"))),
				
				List.of("record8",
						List.of( "false",
						List.of("https://en.wikipedia.org/wiki/Salvator_Mundi_(Leonardo)"))),
				
				List.of("record9",
						List.of( "false",
						List.of())), 
				
				List.of("record10",
						List.of( "false",
						List.of())),
				
				List.of("record11",
						List.of( "false",
						List.of("thisisnotevenalink"))), // invalid
				
				List.of("record12",
						List.of( "false",
						List.of("https://en.wikipedia.org/wiki/Leonardo_da_Vinci"))));
		
	}
	
	

}
