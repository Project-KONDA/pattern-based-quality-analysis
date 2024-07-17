package qualitypatternmodel.cypherevaluation.translation;

import qualitypatternmodel.adaptionneo4j.NeoDirection;
import qualitypatternmodel.adaptionneo4j.NeoElementPathParam;
import qualitypatternmodel.adaptionneo4j.NeoNodeLabelsParam;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;
import qualitypatternmodel.evaluationtranslation.EvalGraphstructure;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.patternstructure.CompletePattern;

public class Neo4JStructure {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		neo4JConcreteDuplicatedTree();

		System.out.println();
		System.out.println("---");
		System.out.println();

		neo4JConcreteDistinctGraphs();
}

	private static void neo4JConcreteDuplicatedTree() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern neo4JConcreteDuplicatedValue = null;


		neo4JConcreteDuplicatedValue = EvalGraphstructure.abstractDuplicatedTree();

		//Abstract --> Concrete

		ParameterList paramters = neo4JConcreteDuplicatedValue.getParameterList();

		NeoNodeLabelsParam neoNodeLabelsParam0 = (NeoNodeLabelsParam) paramters.getParameters().get(0);
		neoNodeLabelsParam0.addStringValue("Regesta");

		NeoPropertyPathParam neoPropertyPathParam1 = (NeoPropertyPathParam) paramters.getParameters().get(1);
		neoPropertyPathParam1.createParameters();
		((NeoSimpleEdge) neoPropertyPathParam1.getNeoPathPart()).addNeoEdgeLabel("PLACE_OF_ISSUE");
		((NeoSimpleEdge) neoPropertyPathParam1.getNeoPathPart()).addNeoTargetNodeLabel("Place");
		neoPropertyPathParam1.setNeoPropertyName("normalizedGerman");
		NeoPropertyPathParam neoPropertyPathParam2 = (NeoPropertyPathParam) paramters.getParameters().get(2);
		neoPropertyPathParam2.setNeoPropertyName("placeOfIssue");
		NeoPropertyPathParam neoPropertyPathParam3 = (NeoPropertyPathParam) paramters.getParameters().get(3);
		neoPropertyPathParam3.setNeoPropertyName("origPlaceOfIssue");

		System.out.println(neo4JConcreteDuplicatedValue.generateCypher());
	}

	private static void neo4JConcreteDistinctGraphs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern neo4JConcreteDistinctGraphs = null;


		neo4JConcreteDistinctGraphs = EvalGraphstructure.abstractDistinctGraphs();

		//Abstract --> Concrete

		ParameterList paramters = neo4JConcreteDistinctGraphs.getParameterList();

		NeoNodeLabelsParam neoNodeLabelsParam0 = (NeoNodeLabelsParam) paramters.getParameters().get(0);
		neoNodeLabelsParam0.addStringValue("Regesta");
		NeoNodeLabelsParam neoNodeLabelsParam1 = (NeoNodeLabelsParam) paramters.getParameters().get(1);
		neoNodeLabelsParam1.addStringValue("Place");
		NeoNodeLabelsParam neoNodeLabelsParam2 = (NeoNodeLabelsParam) paramters.getParameters().get(2);
		neoNodeLabelsParam2.addStringValue("IndexPerson");
		NeoNodeLabelsParam neoNodeLabelsParam3 = (NeoNodeLabelsParam) paramters.getParameters().get(3);
		neoNodeLabelsParam3.addStringValue("Literature");
		NeoNodeLabelsParam neoNodeLabelsParam4 = (NeoNodeLabelsParam) paramters.getParameters().get(4);
		neoNodeLabelsParam4.addStringValue("Reference");

		NeoElementPathParam neoElementPathParam1 = (NeoElementPathParam) paramters.getParameters().get(5);
		((NeoSimpleEdge) neoElementPathParam1.getNeoPathPart()).addNeoEdgeLabel("PLACE_OF_ISSUE");
		((NeoSimpleEdge) neoElementPathParam1.getNeoPathPart()).setNeoDirection(NeoDirection.RIGHT);
		NeoElementPathParam neoElementPathParam2 = (NeoElementPathParam) paramters.getParameters().get(6);
		((NeoSimpleEdge) neoElementPathParam2.getNeoPathPart()).addNeoEdgeLabel("APPEARS_IN");
		((NeoSimpleEdge) neoElementPathParam2.getNeoPathPart()).setNeoDirection(NeoDirection.LEFT);
		NeoElementPathParam neoElementPathParam3 =(NeoElementPathParam) paramters.getParameters().get(7);
		((NeoSimpleEdge) neoElementPathParam3.getNeoPathPart()).addNeoEdgeLabel("LITERATURE");
		((NeoSimpleEdge) neoElementPathParam3.getNeoPathPart()).setNeoDirection(NeoDirection.LEFT);

		System.out.println(neo4JConcreteDistinctGraphs.generateCypher());
	}
}
