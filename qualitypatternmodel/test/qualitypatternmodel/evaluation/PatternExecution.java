package qualitypatternmodel.evaluation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.CreateDB;
import org.basex.core.cmd.Open;
import org.basex.core.cmd.XQuery;
import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.basex.query.QueryProcessor;
import org.basex.query.iter.Iter;
import org.basex.query.value.item.Item;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;

public class PatternExecution {
	static Context context;
	
	public static void main(String[] args) {
//		createDatabase("MidasTest", "C:\\Users\\Viola Wenz\\Documents\\Daten\\fme-private-20190522\\fme-private-OBJ20190521.xml");
//		System.out.println("created");
//		CompletePattern pattern = Eval00Match.getMatchMidas5064();
//		execute(pattern, "MidasTest");
		
		// TODO: add explanation?
		
		// MIDAS
		String databaseNameMidas = "MIDAS";		
		
		execute(EvalMatch.getMatchMidasOb30Child(), databaseNameMidas); // 5.1.1
		execute(EvalCompval.getCompsetMIDAS3140(), databaseNameMidas); // 5.1.2
		execute(EvalMandatt.getMandattMidas(), databaseNameMidas); // 5.2.1
		execute(EvalMandstruc.getMandstrucThreeElementsMidas(), databaseNameMidas); // 5.2.2
		// 5.2.3
		execute(EvalCompval.getCompvalSetMidas3270(), databaseNameMidas); // 5.2.4
		execute(EvalRefint.getRefintMidasWer(), databaseNameMidas); // 5.3
		execute(EvalUnique.getUniqueMidas(), databaseNameMidas); // 5.4
		execute(EvalFunc.getFuncMidas(), databaseNameMidas); // 5.5
		execute(EvalContrel.getContrelMidas(), databaseNameMidas); // 5.6
		execute(EvalCard.getCardMidasOb30(), databaseNameMidas); // 5.7.1
		execute(EvalMatch.getMatchMidas3270Imprecise(), databaseNameMidas); // 5.7.2 
		execute(EvalCompval.getCompvalMidas5230Objekt(), databaseNameMidas); // 5.7.3
		execute(EvalCompval.getCompvalMidas5230Schloss(), databaseNameMidas); // 5.7.4
		execute(EvalMatch.getMatchMidas3100Abbreviation(), databaseNameMidas); // 5.7.5
		execute(EvalMatch.getMatchMidas5060(), databaseNameMidas); // 5.8.1
		execute(EvalMatch.getMatchMidas5064(), databaseNameMidas); // 5.8.2
		execute(EvalExdupl.getExactDuplicatesMidasWer(), databaseNameMidas); // 5.9.1
		execute(EvalAppdupl.getCARD3Midas(), databaseNameMidas); // 5.9.2
		execute(EvalComp.getCompMidas(), databaseNameMidas); // 5.9.3
		execute(EvalMatch.getMatchMidas5360(), databaseNameMidas); // 5.10.1
		execute(EvalCompval.getCompvalMidas5230Print(), databaseNameMidas); // 5.10.2
		execute(EvalExnex.getExNExMidas(), databaseNameMidas); // 5.10.3
		// 5.11
		// 5.12.1
		// 5.12.2
		execute(EvalMatch.getMatchMidas3270(), databaseNameMidas); // 5.12.3		
		
		// LIDO
		String databaseNameLido = "LIDO";	
		
		execute(EvalMatch.getMatchLidoMeasurementValue(), databaseNameLido); // 5.1.1
		execute(EvalCompval.getCompsetLidoGenderActor(), databaseNameLido); // 5.1.2
		execute(EvalMandatt.getMandattThreeElementsLido(), databaseNameLido); // 5.2.1
		execute(EvalExnex.getExNExLidoRoleActor(), databaseNameLido); // 5.2.2
		// 5.2.3
		execute(EvalCompval.getCompvalSetLidoAppellationValue(), databaseNameLido); // 5.2.4
		// 5.3
		execute(EvalUnique.getUniqueLidoLidoRecId(), databaseNameLido); // 5.4
		execute(EvalFunc.getFuncLido(), databaseNameLido); // 5.5
		// 5.6
		execute(EvalCompval.getCompvalLidoEventPlace(), databaseNameLido); // 5.7.1
		execute(EvalMatch.getMatchLidoEarliestDate(), databaseNameLido); // 5.7.2 
		execute(EvalCompval.getCompvalLidoObjectWorkTypeObjekt(), databaseNameLido); // 5.7.3
		execute(EvalCompval.getCompvalLidoObjectWorkTypeSchloss(), databaseNameLido); // 5.7.4
		execute(EvalMatch.getMatchLidoNameActorSetAbbreviation(), databaseNameLido); // 5.7.5
		execute(EvalMatch.getMatchLidoMeasurementUnit(), databaseNameLido); // 5.8.1
		execute(EvalMatch.getMatchLidoNamePlaceSet(), databaseNameLido); // 5.8.2
		execute(EvalExdupl.getExactDuplicatesLido(), databaseNameLido); // 5.9.1
		execute(EvalUnique.getUniqueLidoObjectPublishedId(), databaseNameLido); // 5.9.2
		execute(EvalUnique.getUniqueComplexLidoNameActorSet(), databaseNameLido); // 5.9.3
		// 5.10.1
		execute(EvalCompval.getCompvalLidoObjectWorkTypePrint(), databaseNameLido); // 5.10.2
		execute(EvalCard.getCardLidoActorName(), databaseNameLido); // 5.10.3
		// 5.11
		// 5.12.1
		// 5.12.2
		execute(EvalMatch.getMatchLidoAppellationValue(), databaseNameLido); // 5.12.3
		
		
		
		
	}

	/**
	 * Creates a BaseX database from the XML data located at the provided file path.
	 * @param databaseName the name of the newly created BaseX database
	 * @param dataPath the path where the XML data can be found
	 */
	static void createDatabase(String databaseName, String dataPath) {
		context = new Context();
		try {
			new CreateDB(databaseName, dataPath).execute(context);
		} catch (BaseXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Executes a pattern on the existing BaseX database with the provided name
	 * @param pattern the pattern to be executed
	 * @param databaseName the name of the existing BaseX database
	 */
	static void execute(CompletePattern pattern, String databaseName) {        
        try {
			pattern.isValid(AbstractionLevel.CONCRETE);
		} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		try {
			String query = pattern.generateQuery();
			System.out.println(query);
			new Open(databaseName).execute(context);
		
			List<String> queryResult = new ArrayList<String>();
			Date startDate = new Date();
			
		    try(QueryProcessor proc = new QueryProcessor(query, context)) {		    
		    	Iter iter = proc.iter();
			  	for(Item item; (item = iter.next()) != null;) {
			  		queryResult.add(item.serialize().toString());
		        }
			  	
			  	Date endDate = new Date();
		    	long runtime = endDate.getTime() - startDate.getTime();
		    	System.out.println("\nruntime = " + runtime + " ms");
		    	System.out.println("\nnumber of problems detected = " + queryResult.size());
		    } catch (QueryException | QueryIOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (BaseXException | InvalidityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
