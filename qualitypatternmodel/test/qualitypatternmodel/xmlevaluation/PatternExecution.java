package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.CreateDB;
import org.basex.core.cmd.Open;
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

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// application of all concrete patterns created for the evaluation on cultural heritage databases (BaseX) of the formats MIDAS and LIDO

		// MIDAS database
		String databaseNameMidas = "MIDAS";

		execute(XmlEvalMatch.getMatch3MidasOb30Child(), databaseNameMidas); // 4.1.1 Wrong Datatype
		execute(XmlEvalCompset.getCompsetMIDAS3140(), databaseNameMidas); // 4.1.2 Domain Violation
		execute(XmlEvalMandAtt.getMandattMidasHida(), databaseNameMidas); // 4.2.1 Missing Values
		execute(XmlEvalMandStruc.getMandstruc3MidasHida(), databaseNameMidas); // 4.2.2 Missing References
		// 4.2.3 Missing Records (not covered)
		execute(XmlEvalCompset.getCompsetMidas3270(), databaseNameMidas); // 4.2.4 Dummy Values
		execute(XmlEvalRefInt.getRefintMidasWer(), databaseNameMidas); // 4.3 Referential Integrity Violation
		execute(XmlEvalUnique.getUniqueMidas(), databaseNameMidas); // 4.4 Unique Value Violation
		execute(XmlEvalFunc.getFuncMidas(), databaseNameMidas); // 4.5 Violation of a Functional Dependency
		execute(XmlEvalContrel.getContrelMidas(), databaseNameMidas); // 4.6 Contradictory Relationships
		execute(XmlEvalCard.getCardMidasHidaOb30(), databaseNameMidas); // 4.7.1 Alternative Possible Values
		execute(XmlEvalMatch.getMatchMidas3270Imprecise(), databaseNameMidas); // 4.7.2 Imprecise Numerical Values
		execute(XmlEvalCompval.getCompvalMidas5230Objekt(), databaseNameMidas); // 4.7.3 Abstract Terms
		execute(XmlEvalCompval.getCompvalMidas5230Schloss(), databaseNameMidas); // 4.7.4 Ambiguous Values
		execute(XmlEvalMatch.getMatchMidas3100Abbreviation(), databaseNameMidas); // 4.7.5 Abbreviations
		execute(XmlEvalMatch.getMatchMidas5060(), databaseNameMidas); // 4.8.1 Misfielded Values
		execute(XmlEvalMatch.getMatchMidas5064(), databaseNameMidas); // 4.8.2 Extraneous Data
		execute(XmlEvalAppDup.getAppdup3Midas(), databaseNameMidas); // 4.9.2 Approximate Duplicate Records
		execute(XmlEvalComp.getCompHidaMidas(), databaseNameMidas); // 4.9.3 Information Placed in Multiple Locations
		execute(XmlEvalMatch.getMatchMidas5360(), databaseNameMidas); // 4.10.1 Heterogeneous Measure Units
		execute(XmlEvalCompval.getCompvalMidas5230Print(), databaseNameMidas); // 4.10.2 Heterogeneous Value Representations
		execute(XmlEvalExNEx.getExNExMidas(), databaseNameMidas); // 4.10.3 Heterogeneous Structural Representations
		// 4.11 Misspellings (not covered)
		// 4.12.1 False Values (not covered)
		// 4.12.2 False References (not covered)
		execute(XmlEvalMatch.getMatchMidas3270(), databaseNameMidas); // 4.12.3 Doubtful Data


		// LIDO database
		String databaseNameLido = "LIDO";

		execute(XmlEvalMatch.getMatchLidoMeasurementValue(), databaseNameLido); // 4.1.1 Wrong Datatype
		execute(XmlEvalCompset.getCompsetLidoGenderActor(), databaseNameLido); // 4.1.2 Domain Violation
		execute(XmlEvalMandAtt.getMandatt3Lido(), databaseNameLido); // 4.2.1 Missing Values
		execute(XmlEvalExNEx.getExNExLidoWorkTypeWithoutConcept(), databaseNameLido); // 4.2.2 Missing References
		// 4.2.3 Missing Records (not covered)
		execute(XmlEvalCompset.getCompsetLidoAppellationValue(), databaseNameLido); // 4.2.4 Dummy Values
		// 4.3 Referential Integity Violation (not applicable to LIDO)
		execute(XmlEvalUnique.getUniqueLidoLidoRecId(), databaseNameLido); // 4.4 Unique Value Violation
		execute(XmlEvalFunc.getFuncLido(), databaseNameLido); // 4.5 Violation of Functional Dependency
		// 4.6 Contradictory Relationships (not applicable to LIDO)
		execute(XmlEvalCompval.getCompvalLidoEventPlace(), databaseNameLido); // 4.7.1 Alternative Possible Values
		execute(XmlEvalMatch.getMatchLidoEarliestDate(), databaseNameLido); // 4.7.2 Imprecise Numerical Values
		execute(XmlEvalCompval.getCompvalLidoObjectWorkTypeObjekt(), databaseNameLido); // 4.7.3 Abstract Terms
		execute(XmlEvalCompval.getCompvalLidoObjectWorkTypeSchloss(), databaseNameLido); // 4.7.4 Ambiguous Values
//		execute(EvalMatch.getMatchLidoNameActorSetAbbreviation(), databaseNameLido); // 4.7.5 Abbreviations
		execute(XmlEvalMatch.getMatchLidoMeasurementUnit(), databaseNameLido); // 4.8.1 Misfielded Values
		execute(XmlEvalMatch.getMatchLidoNamePlaceSet(), databaseNameLido); // 4.8.2 Extraneous Data
		execute(XmlEvalUnique.getUniqueLidoObjectPublishedId(), databaseNameLido); // 4.9.2 Approximate Duplicate records
		execute(XmlEvalUnique.getUniqueComplexLidoNameActorSet(), databaseNameLido); // 4.9.3 Information Placed in Multiple Locations
		// 4.10.1 Heterogeneous Measure Units (not considered problematic in LIDO)
		execute(XmlEvalCompval.getCompvalLidoObjectWorkTypePrint(), databaseNameLido); // 4.10.2 Heterogeneous Value Representations
		execute(XmlEvalCard.getCardLidoActorName(), databaseNameLido); // 4.10.3 Heterogeneous Strucural Representations
		// 4.11 Misspellings (not covered)
		// 4.12.1 False Values (not covered)
		// 4.12.2 False References (not covered)
		execute(XmlEvalMatch.getMatchLidoAppellationValue(), databaseNameLido); // 4.12.3 Doubtful Data
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
			String query = pattern.generateXQuery();
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
