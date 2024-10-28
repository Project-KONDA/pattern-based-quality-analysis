package qualitypatternmodel.newservlets.patterns;

import java.util.Map;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.newservlets.initialisation.PatternBundle;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class Appdup2Pattern {

	static String APPDUP2_ID_GENERIC = "Appdup2_generic";
	static String APPDUP2_ID_XML = "Appdup2_xml";
	static String APPDUP2_ID_RDF = "Appdup2_rdf";
	static String APPDUP2_ID_NEO = "Appdup2_neo4j";
	static String APPDUP2_NAME = "Approximate Duplicate based on two attributes";
	static String APPDUP2_DESCR = "Check whether there are records that have the same value in two important attributes, suggesting that they describe the same real-world object.";

	static CompletePattern getGeneric()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId(APPDUP2_ID_GENERIC);
		pattern.setAbstractId(APPDUP2_ID_GENERIC);
		pattern.setName(APPDUP2_NAME);
		pattern.setDescription(APPDUP2_DESCR);

		pattern.getGraph().getReturnNodes().get(0).makeComplex();
		pattern.getGraph().getReturnNodes().get(0).setName("main");

		ComplexNode main = (ComplexNode) pattern.getGraph().getReturnNodes().get(0);
		ComplexNode other = GraphstructureFactory.eINSTANCE.createComplexNode();
		other.setName("other");
		other.setReturnNode(true);
		other.setGraph(pattern.getGraph());
		Comparison c = main.addComparison(other);

		QuantifiedCondition qc1 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(qc1);

		Graph g1 = qc1.getGraph();

		c.getOption().setValue(ComparisonOperator.NOTEQUAL);
		c.getOption().setPredefined(true);

		Node n1 = main.addOutgoing(g1).getTarget().makePrimitive();
		other.addOutgoing(n1);

		Node n2 = main.addOutgoing(g1).getTarget().makePrimitive();
		other.addOutgoing(n2);

		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}
	
	public static PatternBundle getXmlBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException  {
		return new PatternBundle(
				getGeneric(),
				Language.XML,
				APPDUP2_ID_XML,
				Map.of(),
				null,
				null);
	}
	
	public static PatternBundle getRdfBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException  {
		return new PatternBundle(
				getGeneric(),
				Language.RDF,
				APPDUP2_ID_RDF,
				Map.of(),
				null,
				null);
	}
	
	public static PatternBundle getNeoBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException  {
		return new PatternBundle(
				getGeneric(),
				Language.NEO4J,
				APPDUP2_ID_NEO,
				Map.of(),
				null,
				null);
	}

}
