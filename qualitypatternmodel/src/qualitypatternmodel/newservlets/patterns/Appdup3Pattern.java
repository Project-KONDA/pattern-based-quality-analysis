package qualitypatternmodel.newservlets.patterns;

import java.util.Map;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.newservlets.initialisation.PatternBundle;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class Appdup3Pattern {

	static String APPDUP3_ID_GENERIC = "Appdup3_generic";
	static String APPDUP3_ID_XML = "Appdup3_xml";
	static String APPDUP3_ID_RDF = "Appdup3_rdf";
	static String APPDUP3_ID_NEO = "Appdup3_neo4j";
	static String APPDUP3_NAME = "Approximate Duplicate based on three attributes";
	static String APPDUP3_DESCR = "Check whether there are records that have the same value in three important attributes, suggesting that they describe the same real-world object.";

	public static CompletePattern getGeneric()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = Appdup2Pattern.getGeneric();
		pattern.setPatternId(APPDUP3_ID_GENERIC);
		pattern.setAbstractId(APPDUP3_ID_GENERIC);
		pattern.setName(APPDUP3_NAME);
		pattern.setDescription(APPDUP3_DESCR);

		Graph g0 = pattern.getGraph();
		QuantifiedCondition qc1 = (QuantifiedCondition) pattern.getCondition();
		Graph g1 = qc1.getGraph();

		Node main = g0.getNodes().get(0);
		Node other = g0.getNodes().get(1);

		Node n2 = main.addOutgoing(g1).getTarget().makePrimitive();
		other.addOutgoing(n2);

		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}
	
	public static PatternBundle getXmlBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException  {
		return new PatternBundle(
				getGeneric(),
				Language.XML,
				APPDUP3_ID_XML,
				Map.of(),
				null,
				null);
	}
	
	public static PatternBundle getRdfBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException  {
		return new PatternBundle(
				getGeneric(),
				Language.RDF,
				APPDUP3_ID_RDF,
				Map.of(),
				null,
				null);
	}
	
	public static PatternBundle getNeoBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException  {
		return new PatternBundle(
				getGeneric(),
				Language.NEO4J,
				APPDUP3_ID_NEO,
				Map.of(),
				null,
				null);
	}

}
