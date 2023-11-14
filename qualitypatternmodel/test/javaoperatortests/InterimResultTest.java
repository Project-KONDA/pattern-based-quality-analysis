package javaoperatortests;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaquery.JavaFilter;
import qualitypatternmodel.patternstructure.CompletePattern;

public class InterimResultTest {
	
	private static Boolean output = false;

	public static void main(String[] args) throws InvalidityException {
		List<Boolean> results = new ArrayList<Boolean>();
		results.add(testTestPattern(OneArgTestPatterns.getTestPattern1(), testList1, expectedList1, output));
		results.add(testTestPattern(OneArgTestPatterns.getTestPattern2(), testList1, expectedList2, output));
		results.add(testTestPattern(OneArgTestPatterns.getTestPattern3(), testList3, expectedList3, output));
		results.add(testTestPattern(OneArgTestPatterns.getTestPattern4(), testList3, expectedList4, output));
		results.add(testTestPattern(OneArgTestPatterns.getTestPattern5(), testList1, expectedList5, output));
		results.add(testTestPattern(OneArgTestPatterns.getTestPattern6(), testList2, expectedList6, output));
		results.add(testTestPattern(OneArgTestPatterns.getTestPattern7(), testList7, expectedList7, output));
		results.add(testTestPattern(OneArgTestPatterns.getTestPattern8(), testList8, expectedList8, output));
		results.add(testTestPattern(OneArgTestPatterns.getTestPattern9(), testList1, expectedList9, output));
		// The structure of 10 need to be changed: variableContainer(fixedContainer(a,b)) -> fixedContainer( variableContainer(A), variableContainer(B) ) 
		results.add(testTestPattern(OneArgTestPatterns.getTestPattern10(), testList10, expectedList10, output));
		System.out.println(results);
		System.out.print("total: " + (!results.contains(false)));
	}

	private static Boolean testTestPattern(CompletePattern testpattern, List<Object> rawResults, List<String> expected, Boolean output)
			throws InvalidityException {
		if (rawResults == null)
			return false;
		
		try {
			// Pattern
			if (output) System.out.println(testpattern.myToString());  
			
			// Filter & Structure
			JavaFilter filter = testpattern.generateQueryFilter();
			if (output) 
				System.out.println(filter.getFilter()); 
			if (output) 
				System.out.println(filter.getStructure());
			
			// Result
			filter.createInterimResultContainer(rawResults);
			List<String> result = filter.filterQueryResults();
			if (output) 
				System.out.println("res: " + result);
			if (output) 
				System.out.println("exp: " + expected);
			if (output) 
				System.out.println(Objects.equals(expected, result));
			return Objects.equals(expected, result);
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
//	private static List<Object> testList1 = List.of(
//		List.of("record0", List.of()),
//		List.of("record1",
//				List.of("https://en.wikipedia.org/wiki/Empire_State_Building",
//						"https://en.wikinotpedia.org/wiki/Empire_State_Building-invalidlink", // invalid
//						"https://en.wikipedia.org/wiki/Empire_State_Building")),
//		List.of("record2", List.of("https://en.wikipedia.org/wiki/Chrysler_Building")),
//		List.of("record3", List.of("thisisnotevenalink")), // invalid
//		List.of("record4", List.of("https://en.wikipedia.org/wiki/ihopethisentrydoesnotexist")), // invalid
//		List.of("record5", List.of()), List.of("record6", List.of("thisisnotevenalink", "thisisnotevenalink")), // invalid
//		List.of("record7", List.of("https://de.wikipedia.org/wiki/Mona_Lisa")),
//		List.of("record8", List.of("https://en.wikipedia.org/wiki/Salvator_Mundi_(Leonardo)")),
//		List.of("record9", List.of()), List.of("record10", List.of()),
//		List.of("record11", List.of("thisisnotevenalink")), // invalid
//		List.of("record12", List.of("https://en.wikipedia.org/wiki/Leonardo_da_Vinci")));
	
	private static String valid = "https://en.wikipedia.org/wiki/Main_Page";
	private static String invalid = "invalid link";
	private static List<String> booleanStrings = List.of("true()", "false");
	private static List<List<String>> lists = List.of(List.of(), List.of(valid), List.of(invalid), List.of(valid, valid), List.of(valid, invalid), List.of(invalid, invalid));
	// used for old text10
//	private static List<List<String>> pairs = List.of(List.of(valid, valid), List.of(valid, invalid), List.of(invalid, valid), List.of(invalid, invalid));

	private static List<List<List<String>>> listCombinations = listCombinationsFrom(lists);
	private static List<List<List<List<String>>>> listListCombinations = listCombinationsFrom(listCombinations);
	private static <T> List<List<T>> listCombinationsFrom(List<T> elements) {
		List<List<T>> result= new ArrayList<List<T>>();
		// 0
        result.add(new ArrayList<T>());

        // 1
        for (T element : elements) {
            List<T> combination = new ArrayList<>();
            combination.add(element);
            result.add(combination);
        }

        // 2
        for (T element1 : elements) {
            for (T element2 : elements) {
                List<T> combination = new ArrayList<T>();
                combination.add(element1);
                combination.add(element2);
                result.add(combination);
            }
        }
		return result;
	}

	private static List<Object> testList1 = testList1();
	private static List<Object> testList1(){
		List<Object> result = new ArrayList<Object>();
		int i = 0;
		for (List<String> list: lists) {
			result.add(List.of("record" + i, list));
			i++;
		}	
		return result;
	}
	@SuppressWarnings("unchecked")
	private static List<String> getExpectedList1(){
		List<String> result = new ArrayList<String>();
		for (Object list: testList1()) {
			List<Object> lst = (List<Object>) list;
			String record = (String) lst.get(0);
			List<Object> test = ((List<Object>) lst.get(1));
			if (test.contains(invalid))
				result.add(record);
		}	
		return result;
	}
	
	
	
	private static List<Object> testList2 = testList2();
	private static List<Object> testList2(){
		List<Object> result = new ArrayList<Object>();
		int i = 0;
		for (String bool: booleanStrings)
			for (List<String> list: lists) {
				result.add(List.of("record" + i, List.of(bool, list)));
				i++;
			}	
		return result;
	}

	private static List<Object> testList3 = testList3();
	private static List<Object> testList3(){
		List<Object> result = new ArrayList<Object>();
		int i = 0;
		for (List<String> list1: lists)
			for (List<String> list2: lists) {
				result.add(List.of("record" + i, List.of(list1, list2)));
				i++;
			}
		return result;
	}
	
	private static List<Object> testList7 = testList7();
	private static List<Object> testList7(){
		List<Object> result = new ArrayList<Object>();
		int i = 0;
		
		for (List<List<String>> sublist: listCombinations) {
			result.add(List.of("record" + i, sublist));
			i++;
		}
		return result;
		
	}
	
	private static List<Object> testList8 = testList8();
	private static List<Object> testList8(){
		List<Object> result = new ArrayList<Object>();
		int i = 0;
		for (List<List<List<String>>> sublist: listListCombinations) {
			result.add(List.of("record" + i, sublist));
			i++;
		}
		return result;
	}
	
	private static List<String> getExpectedList8(){
		List<String> result = new ArrayList<String>();
		int i = 0;
		for (List<List<List<String>>> sublist: listListCombinations) {
			boolean outersome = false;
			for(List<List<String>> outerList: sublist) {
				boolean every = true;
				for (List<String> innerList: outerList) {
					boolean some = false;
					for (String value: innerList) {
						if (value == invalid) {
							some = true;
							break;
						}
					}
					every = every && some;
					if (!every)
						break;
				}
				if (every) {
					outersome = true;
					break;
				}
			}
			if (outersome)
				result.add("record" + i);
			i++;
		}
		return result;
	}
	
	private static List<Object> testList10 = testList10(); //testList10old();
	private static List<Object> testList10(){
		List<Object> result = new ArrayList<Object>();
		int i = 0;
		for (List<String> lst1: lists)
			for (List<String> lst2: lists) {
				List<Object> myList = List.of(lst1, lst2);
				result.add(List.of("record" + i, myList));
				i++;
			}
		return result;
	}
//	private static List<Object> testList10old(){
//		List<Object> result = new ArrayList<Object>();
//		int i = 0;
//		result.add(List.of("record" + i, List.of()));
//		i++;
//		for (List<String> pair: pairs) {
//				List<Object> myList = List.of(pair);
//				result.add(List.of("record" + i, myList));
//				i++;
//			}
//		for (List<String> pair1: pairs)
//			for (List<String> pair2: pairs) {
//			List<Object> myList = List.of(pair1, pair2);
//			result.add(List.of("record" + i, myList));
//			i++;
//		}
//		return result;
//	}
	
	static List<String> expectedList1 = getExpectedList1(); // List.of("record2", "record4", "record5");
	static List<String> expectedList2 = expectedList1;
	static List<String> expectedList3 = List.of("record14", "record16", "record17", "record26", "record28", "record29", "record32", "record34", "record35");
	static List<String> expectedList4 = List.of("record2", "record4", "record5", "record8", "record10", "record11", "record12", "record13", "record14", "record15", "record16", "record17", "record20", "record22", "record23", "record24", "record25", "record26", "record27", "record28", "record29", "record30", "record31", "record32", "record33", "record34", "record35");
	static List<String> expectedList5 = expectedList1;
	static List<String> expectedList6 = List.of("record0", "record1", "record2", "record3", "record4", "record5", "record8", "record10", "record11");
	static List<String> expectedList7 = List.of("record0", "record3", "record5", "record6", "record21", "record23", "record24", "record33", "record35", "record36", "record39", "record41", "record42");
	static List<String> expectedList8 = getExpectedList8();
//			List.of("record4", "record6", "record7", "record10", "record12", "record13", "record16", "record18", "record19", "record20", "record21", "record22", "record23", "record24", "record25", "record28", "record30", "record31", "record32", "record33", "record34", "record35", "record36", "record37", "record38", "record39", "record40", "record41", "record42", "record43", "record47", "record49", "record50", "record53", "record55", "record56", "record59", "record61", "record62", "record63", "record64", "record65", "record66", "record67", "record68", "record71", "record73", "record74", "record75", "record76", "record77", "record78", "record79", "record80", "record81", "record82", "record83", "record84", "record85", "record86", "record90", "record92", "record93", "record96", "record98", "record99", "record102", "record104", "record105", "record106", "record107", "record108", "record109", "record110", "record111", "record114", "record116", "record117", "record118", "record119", "record120", "record121", "record122", "record123", "record124", "record125", "record126", "record127", "record128", "record129", "record133", "record135", "record136", "record139", "record141", "record142", "record145", "record147", "record148", "record149", "record150", "record151", "record152", "record153", "record154", "record157", "record159", "record160", "record161", "record162", "record163", "record164", "record165", "record166", "record167", "record168", "record169", "record170", "record171", "record172", "record173", "record174", "record175", "record176", "record177", "record178", "record179", "record180", "record181", "record182", "record183", "record184", "record185", "record186", "record187", "record188", "record189", "record190", "record191", "record192", "record193", "record194", "record195", "record196", "record197", "record198", "record199", "record200", "record201", "record202", "record203", "record204", "record205", "record206", "record207", "record208", "record209", "record210", "record211", "record212", "record213", "record214", "record215", "record219", "record221", "record222", "record225", "record227", "record228", "record231", "record233", "record234", "record235", "record236", "record237", "record238", "record239", "record240", "record243", "record245", "record246", "record247", "record248", "record249", "record250", "record251", "record252", "record253", "record254", "record255", "record256", "record257", "record258", "record259", "record260", "record261", "record262", "record263", "record264", "record265", "record266", "record267", "record268", "record269", "record270", "record271", "record272", "record273", "record274", "record275", "record276", "record277", "record278", "record279", "record280", "record281", "record282", "record283", "record284", "record285", "record286", "record287", "record288", "record289", "record290", "record291", "record292", "record293", "record294", "record295", "record296", "record297", "record298", "record299", "record300", "record301", "record302", "record303", "record304", "record305", "record306", "record307", "record308", "record309", "record310", "record311", "record312", "record313", "record314", "record315", "record316", "record317", "record318", "record319", "record320", "record321", "record322", "record323", "record324", "record325", "record326", "record327", "record328", "record329", "record330", "record331", "record332", "record333", "record334", "record335", "record336", "record337", "record338", "record339", "record340", "record341", "record342", "record343", "record344", "record348", "record350", "record351", "record354", "record356", "record357", "record360", "record362", "record363", "record364", "record365", "record366", "record367", "record368", "record369", "record372", "record374", "record375", "record376", "record377", "record378", "record379", "record380", "record381", "record382", "record383", "record384", "record385", "record386", "record387", "record391", "record393", "record394", "record397", "record399", "record400", "record403", "record405", "record406", "record407", "record408", "record409", "record410", "record411", "record412", "record415", "record417", "record418", "record419", "record420", "record421", "record422", "record423", "record424", "record425", "record426", "record427", "record428", "record429", "record430", "record431", "record432", "record433", "record434", "record435", "record436", "record437", "record438", "record439", "record440", "record441", "record442", "record443", "record444", "record445", "record446", "record447", "record448", "record449", "record450", "record451", "record452", "record453", "record454", "record455", "record456", "record457", "record458", "record459", "record460", "record461", "record462", "record463", "record464", "record465", "record466", "record467", "record468", "record469", "record470", "record471", "record472", "record473", "record477", "record479", "record480", "record483", "record485", "record486", "record489", "record491", "record492", "record493", "record494", "record495", "record496", "record497", "record498", "record501", "record503", "record504", "record505", "record506", "record507", "record508", "record509", "record510", "record511", "record512", "record513", "record514", "record515", "record516", "record517", "record518", "record519", "record520", "record521", "record522", "record523", "record524", "record525", "record526", "record527", "record528", "record529", "record530", "record531", "record532", "record533", "record534", "record535", "record536", "record537", "record538", "record539", "record540", "record541", "record542", "record543", "record544", "record545", "record546", "record547", "record548", "record549", "record550", "record551", "record552", "record553", "record554", "record555", "record556", "record557", "record558", "record559", "record560", "record561", "record562", "record563", "record564", "record565", "record566", "record567", "record568", "record569", "record570", "record571", "record572", "record573", "record574", "record575", "record576", "record577", "record578", "record579", "record580", "record581", "record582", "record583", "record584", "record585", "record586", "record587", "record588", "record589", "record590", "record591", "record592", "record593", "record594", "record595", "record596", "record597", "record598", "record599", "record600", "record601", "record602", "record606", "record608", "record609", "record612", "record614", "record615", "record618", "record620", "record621", "record622", "record623", "record624", "record625", "record626", "record627", "record630", "record632", "record633", "record634", "record635", "record636", "record637", "record638", "record639", "record640", "record641", "record642", "record643", "record644", "record645", "record649", "record651", "record652", "record655", "record657", "record658", "record661", "record663", "record664", "record665", "record666", "record667", "record668", "record669", "record670", "record673", "record675", "record676", "record677", "record678", "record679", "record680", "record681", "record682", "record683", "record684", "record685", "record686", "record687", "record688", "record689", "record690", "record691", "record692", "record693", "record694", "record695", "record696", "record697", "record698", "record699", "record700", "record701", "record702", "record703", "record704", "record705", "record706", "record707", "record708", "record709", "record710", "record711", "record712", "record713", "record714", "record715", "record716", "record717", "record718", "record719", "record720", "record721", "record722", "record723", "record724", "record725", "record726", "record727", "record728", "record729", "record730", "record731", "record735", "record737", "record738", "record741", "record743", "record744", "record747", "record749", "record750", "record751", "record752", "record753", "record754", "record755", "record756", "record759", "record761", "record762", "record763", "record764", "record765", "record766", "record767", "record768", "record769", "record770", "record771", "record772", "record773", "record774", "record775", "record776", "record777", "record778", "record779", "record780", "record781", "record782", "record783", "record784", "record785", "record786", "record787", "record788", "record789", "record790", "record791", "record792", "record793", "record794", "record795", "record796", "record797", "record798", "record799", "record800", "record801", "record802", "record803", "record804", "record805", "record806", "record807", "record808", "record809", "record810", "record811", "record812", "record813", "record814", "record815", "record816", "record817", "record818", "record819", "record820", "record821", "record822", "record823", "record824", "record825", "record826", "record827", "record828", "record829", "record830", "record831", "record832", "record833", "record834", "record835", "record836", "record837", "record838", "record839", "record840", "record841", "record842", "record843", "record844", "record845", "record846", "record847", "record848", "record849", "record850", "record851", "record852", "record853", "record854", "record855", "record856", "record857", "record858", "record859", "record860", "record861", "record862", "record863", "record864", "record865", "record866", "record867", "record868", "record869", "record870", "record871", "record872", "record873", "record874", "record875", "record876", "record877", "record878", "record879", "record880", "record881", "record882", "record883", "record884", "record885", "record886", "record887", "record888", "record889", "record890", "record891", "record892", "record893", "record894", "record895", "record896", "record897", "record898", "record899", "record900", "record901", "record902", "record903", "record904", "record905", "record906", "record907", "record908", "record909", "record910", "record911", "record912", "record913", "record914", "record915", "record916", "record917", "record918", "record919", "record920", "record921", "record922", "record923", "record924", "record925", "record926", "record927", "record928", "record929", "record930", "record931", "record932", "record933", "record934", "record935", "record936", "record937", "record938", "record939", "record940", "record941", "record942", "record943", "record944", "record945", "record946", "record947", "record948", "record949", "record950", "record951", "record952", "record953", "record954", "record955", "record956", "record957", "record958", "record959", "record960", "record961", "record962", "record963", "record964", "record965", "record966", "record967", "record968", "record969", "record970", "record971", "record972", "record973", "record974", "record975", "record976", "record977", "record978", "record979", "record980", "record981", "record982", "record983", "record984", "record985", "record986", "record987", "record988", "record989", "record990", "record991", "record992", "record993", "record994", "record995", "record996", "record997", "record998", "record999", "record1000", "record1001", "record1002", "record1003", "record1004", "record1005", "record1006", "record1007", "record1008", "record1009", "record1010", "record1011", "record1012", "record1013", "record1014", "record1015", "record1016", "record1017", "record1018", "record1019", "record1020", "record1021", "record1022", "record1023", "record1024", "record1025", "record1026", "record1027", "record1028", "record1029", "record1030", "record1031", "record1032", "record1033", "record1034", "record1035", "record1036", "record1037", "record1038", "record1039", "record1040", "record1041", "record1042", "record1043", "record1044", "record1045", "record1046", "record1047", "record1048", "record1049", "record1050", "record1051", "record1052", "record1053", "record1054", "record1055", "record1056", "record1057", "record1058", "record1059", "record1060", "record1061", "record1062", "record1063", "record1064", "record1065", "record1066", "record1067", "record1068", "record1069", "record1070", "record1071", "record1072", "record1073", "record1074", "record1075", "record1076", "record1077", "record1078", "record1079", "record1080", "record1081", "record1082", "record1083", "record1084", "record1085", "record1086", "record1087", "record1088", "record1089", "record1090", "record1091", "record1092", "record1093", "record1094", "record1095", "record1096", "record1097", "record1098", "record1099", "record1100", "record1101", "record1102", "record1103", "record1104", "record1105", "record1106", "record1107", "record1108", "record1109", "record1110", "record1111", "record1112", "record1113", "record1114", "record1115", "record1116", "record1117", "record1118", "record1122", "record1124", "record1125", "record1128", "record1130", "record1131", "record1134", "record1136", "record1137", "record1138", "record1139", "record1140", "record1141", "record1142", "record1143", "record1146", "record1148", "record1149", "record1150", "record1151", "record1152", "record1153", "record1154", "record1155", "record1156", "record1157", "record1158", "record1159", "record1160", "record1161", "record1165", "record1167", "record1168", "record1171", "record1173", "record1174", "record1177", "record1179", "record1180", "record1181", "record1182", "record1183", "record1184", "record1185", "record1186", "record1189", "record1191", "record1192", "record1193", "record1194", "record1195", "record1196", "record1197", "record1198", "record1199", "record1200", "record1201", "record1202", "record1203", "record1204", "record1205", "record1206", "record1207", "record1208", "record1209", "record1210", "record1211", "record1212", "record1213", "record1214", "record1215", "record1216", "record1217", "record1218", "record1219", "record1220", "record1221", "record1222", "record1223", "record1224", "record1225", "record1226", "record1227", "record1228", "record1229", "record1230", "record1231", "record1232", "record1233", "record1234", "record1235", "record1236", "record1237", "record1238", "record1239", "record1240", "record1241", "record1242", "record1243", "record1244", "record1245", "record1246", "record1247", "record1251", "record1253", "record1254", "record1257", "record1259", "record1260", "record1263", "record1265", "record1266", "record1267", "record1268", "record1269", "record1270", "record1271", "record1272", "record1275", "record1277", "record1278", "record1279", "record1280", "record1281", "record1282", "record1283", "record1284", "record1285", "record1286", "record1287", "record1288", "record1289", "record1290", "record1291", "record1292", "record1293", "record1294", "record1295", "record1296", "record1297", "record1298", "record1299", "record1300", "record1301", "record1302", "record1303", "record1304", "record1305", "record1306", "record1307", "record1308", "record1309", "record1310", "record1311", "record1312", "record1313", "record1314", "record1315", "record1316", "record1317", "record1318", "record1319", "record1320", "record1321", "record1322", "record1323", "record1324", "record1325", "record1326", "record1327", "record1328", "record1329", "record1330", "record1331", "record1332", "record1333", "record1334", "record1335", "record1336", "record1337", "record1338", "record1339", "record1340", "record1341", "record1342", "record1343", "record1344", "record1345", "record1346", "record1347", "record1348", "record1349", "record1350", "record1351", "record1352", "record1353", "record1354", "record1355", "record1356", "record1357", "record1358", "record1359", "record1360", "record1361", "record1362", "record1363", "record1364", "record1365", "record1366", "record1367", "record1368", "record1369", "record1370", "record1371", "record1372", "record1373", "record1374", "record1375", "record1376", "record1377", "record1378", "record1379", "record1380", "record1381", "record1382", "record1383", "record1384", "record1385", "record1386", "record1387", "record1388", "record1389", "record1390", "record1391", "record1392", "record1393", "record1394", "record1395", "record1396", "record1397", "record1398", "record1399", "record1400", "record1401", "record1402", "record1403", "record1404", "record1405", "record1406", "record1407", "record1408", "record1409", "record1410", "record1411", "record1412", "record1413", "record1414", "record1415", "record1416", "record1417", "record1418", "record1419", "record1420", "record1421", "record1422", "record1423", "record1424", "record1425", "record1426", "record1427", "record1428", "record1429", "record1430", "record1431", "record1432", "record1433", "record1434", "record1435", "record1436", "record1437", "record1438", "record1439", "record1440", "record1441", "record1442", "record1443", "record1444", "record1445", "record1446", "record1447", "record1448", "record1449", "record1450", "record1451", "record1452", "record1453", "record1454", "record1455", "record1456", "record1457", "record1458", "record1459", "record1460", "record1461", "record1462", "record1463", "record1464", "record1465", "record1466", "record1467", "record1468", "record1469", "record1470", "record1471", "record1472", "record1473", "record1474", "record1475", "record1476", "record1477", "record1478", "record1479", "record1480", "record1481", "record1482", "record1483", "record1484", "record1485", "record1486", "record1487", "record1488", "record1489", "record1490", "record1491", "record1492", "record1493", "record1494", "record1495", "record1496", "record1497", "record1498", "record1499", "record1500", "record1501", "record1502", "record1503", "record1504", "record1505", "record1506", "record1507", "record1508", "record1509", "record1510", "record1511", "record1512", "record1513", "record1514", "record1515", "record1516", "record1517", "record1518", "record1519", "record1520", "record1521", "record1522", "record1523", "record1524", "record1525", "record1526", "record1527", "record1528", "record1529", "record1530", "record1531", "record1532", "record1533", "record1534", "record1535", "record1536", "record1537", "record1538", "record1539", "record1540", "record1541", "record1542", "record1543", "record1544", "record1545", "record1546", "record1547", "record1548", "record1549", "record1550", "record1551", "record1552", "record1553", "record1554", "record1555", "record1556", "record1557", "record1558", "record1559", "record1560", "record1561", "record1562", "record1563", "record1564", "record1565", "record1566", "record1567", "record1568", "record1569", "record1570", "record1571", "record1572", "record1573", "record1574", "record1575", "record1576", "record1577", "record1578", "record1579", "record1580", "record1581", "record1582", "record1583", "record1584", "record1585", "record1586", "record1587", "record1588", "record1589", "record1590", "record1591", "record1592", "record1593", "record1594", "record1595", "record1596", "record1597", "record1598", "record1599", "record1600", "record1601", "record1602", "record1603", "record1604", "record1605", "record1606", "record1607", "record1608", "record1609", "record1610", "record1611", "record1612", "record1613", "record1614", "record1615", "record1616", "record1617", "record1618", "record1619", "record1620", "record1621", "record1622", "record1623", "record1624", "record1625", "record1626", "record1627", "record1628", "record1629", "record1630", "record1631", "record1632", "record1633", "record1634", "record1635", "record1636", "record1637", "record1638", "record1639", "record1640", "record1641", "record1642", "record1643", "record1644", "record1645", "record1646", "record1647", "record1648", "record1649", "record1650", "record1651", "record1652", "record1653", "record1654", "record1655", "record1656", "record1657", "record1658", "record1659", "record1660", "record1661", "record1662", "record1663", "record1664", "record1665", "record1666", "record1667", "record1668", "record1669", "record1670", "record1671", "record1672", "record1673", "record1674", "record1675", "record1676", "record1677", "record1678", "record1679", "record1680", "record1681", "record1682", "record1683", "record1684", "record1685", "record1686", "record1687", "record1688", "record1689", "record1690", "record1691", "record1692", "record1693", "record1694", "record1695", "record1696", "record1697", "record1698", "record1699", "record1700", "record1701", "record1702", "record1703", "record1704", "record1705", "record1706", "record1707", "record1708", "record1709", "record1710", "record1711", "record1712", "record1713", "record1714", "record1715", "record1716", "record1717", "record1718", "record1719", "record1720", "record1721", "record1722", "record1723", "record1724", "record1725", "record1726", "record1727", "record1728", "record1729", "record1730", "record1731", "record1732", "record1733", "record1734", "record1735", "record1736", "record1737", "record1738", "record1739", "record1740", "record1741", "record1742", "record1743", "record1744", "record1745", "record1746", "record1747", "record1748", "record1749", "record1750", "record1751", "record1752", "record1753", "record1754", "record1755", "record1756", "record1757", "record1758", "record1759", "record1760", "record1761", "record1762", "record1763", "record1764", "record1765", "record1766", "record1767", "record1768", "record1769", "record1770", "record1771", "record1772", "record1773", "record1774", "record1775", "record1776", "record1777", "record1778", "record1779", "record1780", "record1781", "record1782", "record1783", "record1784", "record1785", "record1786", "record1787", "record1788", "record1789", "record1790", "record1791", "record1792", "record1793", "record1794", "record1795", "record1796", "record1797", "record1798", "record1799", "record1800", "record1801", "record1802", "record1803", "record1804", "record1805", "record1806", "record1807", "record1808", "record1809", "record1810", "record1811", "record1812", "record1813", "record1814", "record1815", "record1816", "record1817", "record1818", "record1819", "record1820", "record1821", "record1822", "record1823", "record1824", "record1825", "record1826", "record1827", "record1828", "record1829", "record1830", "record1831", "record1832", "record1833", "record1834", "record1835", "record1836", "record1837", "record1838", "record1839", "record1840", "record1841", "record1842", "record1843", "record1844", "record1845", "record1846", "record1847", "record1848", "record1849", "record1850", "record1851", "record1852", "record1853", "record1854", "record1855", "record1856", "record1857", "record1858", "record1859", "record1860", "record1861", "record1862", "record1863", "record1864", "record1865", "record1866", "record1867", "record1868", "record1869", "record1870", "record1871", "record1872", "record1873", "record1874", "record1875", "record1876", "record1877", "record1878", "record1879", "record1880", "record1881", "record1882", "record1883", "record1884", "record1885", "record1886", "record1887", "record1888", "record1889", "record1890", "record1891", "record1892");
	static List<String> expectedList9 = expectedList1;
//	static List<String> expectedList10old = List.of("record4", "record8", "record12", "record16", "record17", "record18", "record19", "record20");
	static List<String> expectedList10 = List.of("record14", "record16", "record17", "record26", "record28", "record29", "record32", "record34", "record35");
	
	
	
	

}
