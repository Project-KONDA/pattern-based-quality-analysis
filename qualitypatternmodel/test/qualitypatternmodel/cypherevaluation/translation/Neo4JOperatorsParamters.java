package qualitypatternmodel.cypherevaluation.translation;

import qualitypatternmodel.adaptionneo4j.NeoNodeLabelsParam;
import qualitypatternmodel.adaptionneo4j.NeoPropertyEdge;
import qualitypatternmodel.adaptionneo4j.NeoPropertyNode;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
import qualitypatternmodel.evaluationtranslation.EvalParamterOperators;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.NullCheck;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.parameters.impl.TypeOptionParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;

public class Neo4JOperatorsParamters {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		neo4JConcreteNotValidEntries();
	}
	
	private static void neo4JConcreteNotValidEntries() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern neo4JConcreteValidEntries = null;
		
		
		neo4JConcreteValidEntries = EvalParamterOperators.abstractNotValidEntries();
				
		//Abstract --> Concrete
				
		ParameterList paramters = neo4JConcreteValidEntries.getParameterList();
		
		NeoNodeLabelsParam neoNodeLabelsParam0 = (NeoNodeLabelsParam) paramters.getParameters().get(8);
		neoNodeLabelsParam0.addStringValue("Regesta");
		
		Graph g = neo4JConcreteValidEntries.getGraph();

		TextListParam list = new TextListParamImpl(); 
		list.addStringValue("Friedrich III.");
		list.addStringValue("Hz. Maximilian");
		list.addStringValue("Kg. Maximilian");
		UntypedParameterValue p = (UntypedParameterValue) paramters.getParameters().get(0);
		p.replace(list);
		
		NeoPropertyPathParam neoPathParam1 = ((NeoPropertyEdge) ((NeoPropertyNode) g.getNodes().get(1)).getIncoming().get(0)).getNeoPropertyPathParam();
		neoPathParam1.setNeoPropertyName("title");
		
		Comparison comp = (Comparison) ((NeoPropertyNode) g.getNodes().get(1)).getComparison1().get(0);
		TypeOptionParam typeOptionParam = new TypeOptionParamImpl();
		typeOptionParam.setValue(ReturnType.LIST);
		comp.setTypeOption(typeOptionParam);
		ComparisonOptionParam optioncomp =  comp.getOption();
		optioncomp.setValue(ComparisonOperator.EQUAL);
		
		NeoPropertyPathParam neoPathParam2 = ((NeoPropertyEdge) ((NeoPropertyNode) g.getNodes().get(2)).getIncoming().get(0)).getNeoPropertyPathParam();
		neoPathParam2.setNeoPropertyName("identifier");
		
		NeoPropertyPathParam neoPathParam3 = ((NeoPropertyEdge) ((NeoPropertyNode) g.getNodes().get(3)).getIncoming().get(0)).getNeoPropertyPathParam();
		neoPathParam3.setNeoPropertyName("regid");
		
		TextLiteralParam regex = (TextLiteralParam) paramters.getParameters().get(4);
		regex.setValue("\\\\d{4}-\\\\d{2}-\\\\d{2}_.*");
		
		BooleanParam not = (BooleanParam) paramters.getParameters().get(3);
		not.setValue(true);
		
		NullCheck _null = (NullCheck) ((NeoPropertyNode) g.getNodes().get(2)).getNullCheck();
		_null.getOption().setValue(false);
		
		NeoPropertyPathParam neoPathParam4 = ((NeoPropertyEdge) ((NeoPropertyNode) g.getNodes().get(4)).getIncoming().get(0)).getNeoPropertyPathParam();
		neoPathParam4.setNeoPropertyName("origPlaceOfIssue");
		
		TextLiteralParam contains = (TextLiteralParam) paramters.getParameters().get(6);
		contains.setValue("[-]");
		
		System.out.println(neo4JConcreteValidEntries.generateCypher());
	}
}
