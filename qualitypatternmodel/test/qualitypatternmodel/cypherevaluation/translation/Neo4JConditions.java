package qualitypatternmodel.cypherevaluation.translation;

import java.text.Normalizer.Form;
import java.time.Duration;
import java.time.Instant;

import org.eclipse.emf.common.util.BasicEList;

import qualitypatternmodel.adaptionneo4j.NeoElementPathParam;
import qualitypatternmodel.adaptionneo4j.NeoNodeLabelsParam;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;
import qualitypatternmodel.evaluationtranslation.Conditions;
import qualitypatternmodel.evaluationtranslation.GeneralPattern;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.NotCondition;

public class Neo4JConditions {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		//New Ones - Valid for REGSTA-DB
		neo4JConcreteDuplicatedNeighbour();
		
//		System.out.println();
//		System.out.println("---");
//		System.out.println();
}

	private static void neo4JConcreteDuplicatedNeighbour() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern neo4JConcreteDuplicatedNeighbour = null;
		
		
		neo4JConcreteDuplicatedNeighbour = Conditions.abstractDuplicatedNeighbour();
				
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
}
