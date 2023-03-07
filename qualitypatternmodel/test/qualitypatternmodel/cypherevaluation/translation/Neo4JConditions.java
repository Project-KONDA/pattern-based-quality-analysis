package qualitypatternmodel.cypherevaluation.translation;

import qualitypatternmodel.adaptionneo4j.NeoDirection;
import qualitypatternmodel.adaptionneo4j.NeoElementPathParam;
import qualitypatternmodel.adaptionneo4j.NeoNodeLabelsParam;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;
import qualitypatternmodel.evaluationtranslation.EvalConditions;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.NotCondition;

public class Neo4JConditions {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		neo4JConcreteDuplicatedNeighbour();
		
		System.out.println();
		System.out.println("---");
		System.out.println();
		
		neo4JConcreteMandetoryFields();
		

		System.out.println();
		System.out.println("---");
		System.out.println();
		
		neo4JConcreteMyNbCount();
	}

	private static void neo4JConcreteDuplicatedNeighbour() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern neo4JConcreteDuplicatedNeighbour = null;
		
		
		neo4JConcreteDuplicatedNeighbour = EvalConditions.abstractDuplicatedNeighbour();
				
		//Abstract --> Concrete
				
		ParameterList paramters = neo4JConcreteDuplicatedNeighbour.getParameterList();
		
		Formula formula = (Formula) ((NotCondition) neo4JConcreteDuplicatedNeighbour.getCondition()).getCondition();
		formula.setOperator(LogicalOperator.XOR);
		
		NeoNodeLabelsParam neoNodeLabelsParam0 = (NeoNodeLabelsParam) paramters.getParameters().get(0);
		neoNodeLabelsParam0.addStringValue("Regesta");
		NeoNodeLabelsParam neoNodeLabelsParam1 = (NeoNodeLabelsParam) paramters.getParameters().get(1);
		neoNodeLabelsParam1.addStringValue("Place");
		NeoNodeLabelsParam neoNodeLabelsParam2 = (NeoNodeLabelsParam) paramters.getParameters().get(3);
		neoNodeLabelsParam2.addStringValue("IndexPlace");
		
		NeoElementPathParam neoElementPathParam1 = (NeoElementPathParam) paramters.getParameters().get(2);
		((NeoSimpleEdge) neoElementPathParam1.getNeoPathPart()).addNeoEdgeLabel("PLACE_OF_ISSUE");
		NeoElementPathParam neoElementPathParam2 = (NeoElementPathParam) paramters.getParameters().get(4);
		((NeoSimpleEdge) neoElementPathParam2.getNeoPathPart()).addNeoEdgeLabel("PLACE_OF_ISSUE");
		
		System.out.println(neo4JConcreteDuplicatedNeighbour.generateCypher());
	}
	
	private static void neo4JConcreteMandetoryFields() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern neo4JConcreteMandetoryFields = null;
		
		
		neo4JConcreteMandetoryFields = EvalConditions.abstractMandetoryFields();
				
		//Abstract --> Concrete
				
		ParameterList paramters = neo4JConcreteMandetoryFields.getParameterList();
		
		NeoNodeLabelsParam neoNodeLabelsParam0 = (NeoNodeLabelsParam) paramters.getParameters().get(0);
		neoNodeLabelsParam0.addStringValue("Regesta");
		
		NeoPropertyPathParam neoParam = (NeoPropertyPathParam) paramters.getParameters().get(1);
		neoParam.setNeoPropertyName("placeOfIssue");
		neoParam = (NeoPropertyPathParam) paramters.getParameters().get(2);
		neoParam.setNeoPropertyName("url");
		neoParam = (NeoPropertyPathParam) paramters.getParameters().get(3);
		neoParam.setNeoPropertyName("regesterId");
		
		System.out.println(neo4JConcreteMandetoryFields.generateCypher());
	}
	
	private static void neo4JConcreteMyNbCount() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern neo4JConcreteMyNbCount = null;
		
		
		neo4JConcreteMyNbCount = EvalConditions.abstractMyNbCount();
		
		ParameterList paramters = neo4JConcreteMyNbCount.getParameterList();
				
		NeoNodeLabelsParam neoNodeLabelsParam0 = (NeoNodeLabelsParam) paramters.getParameters().get(2);
		neoNodeLabelsParam0.addStringValue("Reference");
		NeoNodeLabelsParam neoNodeLabelsParam1 = (NeoNodeLabelsParam) paramters.getParameters().get(3);
		neoNodeLabelsParam1.addStringValue("Literature");
		
		NeoElementPathParam neoElementPathParam1 = (NeoElementPathParam) paramters.getParameters().get(4);
		((NeoSimpleEdge) neoElementPathParam1.getNeoPathPart()).addNeoEdgeLabel("LITERATURE");
		((NeoSimpleEdge) neoElementPathParam1.getNeoPathPart()).setNeoDirection(NeoDirection.RIGHT);
		
		System.out.println(neo4JConcreteMyNbCount.generateCypher());
	}
}
