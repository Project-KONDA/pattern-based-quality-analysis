package newservelettest;

import java.util.Arrays;
import java.util.List;

import qualitypatternmodel.newservlets.initialisation.PatternCollection;
import qualitypatternmodel.newservlets.patterns.PatternClass;

public class PatternCollectionTests2 {
	
	public static void main(String[] args) {
		
		String[] clazzes = {
//				"Comp",
//				"CompSetAny",
//				"CompSetIso",
//				"CompSet",
//				"CompSetSin",
//				"AppDup2",
//				"AppDup3",
//				"Func",
//				"UniqueIso",
//				"Unique",
//				"UniqueSin",
//				"CardCompSetIfCompSet",
//				"CardIfCompSet",
//				"Card",
//				"CompSetIfMatch",
//				"DupVal",
//				"ExistsIfExists",
//				"LinkImageSizeIso",
//				"LinkImageSize",
//				"LinkImageSizeSin",
//				"LinkMimeTypeIso",
//				"LinkMimeType",
//				"LinkMimeTypeSin",
				"LinkSourceExists",
//				"LinkSourceIso",
//				"LinkSource",
//				"LinkSourceSin",
//				"ValidLinkIso",
//				"ValidLink",
//				"ValidLinkSin",
				"Mand2EleOr",
				"Mand3EleOr",
//				"MandAtt",
//				"MandContAndIso",
//				"MandContAnd",
//				"MandContAndSin",
//				"MandContIso",
//				"MandCont",
//				"MandContSin",
//				"MandEle",
//				"CardMatch",
//				"ContainsIso",
//				"ContainsListIso",
//				"ContainsList",
//				"ContainsListSin",
//				"Contains",
//				"ContainsSin",
//				"MatchIso",
//				"MatchListIso",
//				"MatchList",
//				"MatchListSin",
//				"Match",
//				"MatchSin",
//				"StringLengthIso",
//				"StringLength",
//				"StringLengthRangeIso",
//				"StringLengthRange",
//				"StringLengthRangeSin",
//				"StringLengthSin",
		};
		
		List<String> clazzlist = Arrays.asList(clazzes);
		
		for (PatternClass patternclass: PatternCollection.getPatternClassInstances()) {
			if (clazzlist.contains(patternclass.id)) {
				patternclass.testXmlPattern();
				System.out.println("\n################################################################\n");
			}
		}
	}

}
