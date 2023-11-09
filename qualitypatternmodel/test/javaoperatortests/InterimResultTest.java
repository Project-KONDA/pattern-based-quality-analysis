package javaoperatortests;

import java.util.List;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaquery.JavaFilter;
import qualitypatternmodel.javaqueryoutput.InterimResultContainer;
import qualitypatternmodel.patternstructure.CompletePattern;

public class InterimResultTest {

	public static void main(String[] args) throws InvalidityException {
		List<Object> raw = List.of(
				List.of("record1",
						List.of("https://en.wikipedia.org/wiki/Empire_State_Building",
								"https://en.wikinotpedia.org/wiki/Empire_State_Building-invalidlink",
								"https://en.wikipedia.org/wiki/Empire_State_Building")),
				List.of("record2", List.of("https://en.wikipedia.org/wiki/Chrysler_Building")),
				List.of("record3", List.of("thisisnotevenalink")), List.of("record4", List.of()),
				List.of("record5", List.of()), List.of("record6", List.of("thisisnotevenalink", "thisisnotevenalink")),
				List.of("record7", List.of("https://de.wikipedia.org/wiki/Mona_Lisa")),
				List.of("record8", List.of("https://en.wikipedia.org/wiki/Salvator_Mundi_(Leonardo)")),
				List.of("record9", List.of()), List.of("record10", List.of()),
				List.of("record11", List.of("thisisnotevenalink")),
				List.of("record12", List.of("https://en.wikipedia.org/wiki/Leonardo_da_Vinci")));
		
		CompletePattern testpattern1 = OneArgTestPatterns.getTestPattern1();
		
		
		JavaFilter filter = testpattern1.generateQueryFilter();
		filter.createInterimResultContainer(raw);
		for (InterimResultContainer interimRes : filter.getInterimResults())
			System.out.println(interimRes);
		System.out.println();
		for (String result : filter.filterQueryResults())
			System.out.println(result);
		
	}

}
