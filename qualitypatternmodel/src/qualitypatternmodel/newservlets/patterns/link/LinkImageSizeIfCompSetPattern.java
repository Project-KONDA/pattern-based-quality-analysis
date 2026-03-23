package qualitypatternmodel.newservlets.patterns.link;

import org.json.JSONArray;
import org.json.JSONObject;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.javaquery.JavaFilter;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.utility.PatternUtility;

public class LinkImageSizeIfCompSetPattern extends PatternClass {

	public LinkImageSizeIfCompSetPattern() {
		super(PatternConstants.LINKIMAGESIZEIFCOMPSET_ID,
				PatternConstants.LINKIMAGESIZEIFCOMPSET_NAME, 
				PatternConstants.LINKIMAGESIZEIFCOMPSET_DESCR, 
				true, true, false, false);
	}
	
	public static void main(String params[]) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		CompletePattern pattern = new LinkImageSizeIfCompSetPattern().getXmlPattern();
		PatternUtility.fillParameter(pattern);
		pattern.printParameters(false);

		JavaFilter f = pattern.generateQueryFilter();
		System.out.println(pattern.generateQueryFilter());
		
		String s1 = "<interim> <return><lido:lido xmlns:lido=\"http://www.lido-schema.org\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.lido-schema.org\"></lido:lido> </return> <condition><formula> <boolean>false</boolean> <quantifier><value>DE-Mb112/lido-obj00154983</value> </quantifier></formula> </condition></interim>";
		String s2 = "<interim> <return><demo:data xmlns:demo=\"demo\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"demo ./demo_database_schema.xsd\"><!--BUILDINGS --></demo:data> </return> <condition><formula> <boolean>false</boolean> <quantifier/></formula> </condition></interim>";
		JSONObject o1 = new JSONObject();
		JSONObject o2 = new JSONObject();
		o1.put("snippet", s1);
		o2.put("snippet", s2);
		JSONArray arra = new JSONArray();
		arra.put(o1);
		arra.put(o2);
		JSONArray resarra = f.filter(arra);
		System.out.println(resarra);
		
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		ComplexNode main = pattern.getGraph().getReturnNodes().get(0).makeComplex();
		Formula form = PatternstructureFactory.eINSTANCE.createFormula();
		pattern.setCondition(form);
		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		form.setCondition1(qc);
		form.setOperator(LogicalOperator.AND);

		PrimitiveNode field1 = main.addOutgoing(qc.getGraph()).getTarget().makePrimitive();
		TextListParamImpl tlp = new TextListParamImpl();
		field1.addPrimitiveComparison(tlp);
		
		NotCondition not = PatternstructureFactory.eINSTANCE.createNotCondition();
		form.setCondition2(not);
		QuantifiedCondition qc2 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		not.setCondition(qc2);

		PrimitiveNode field2 = main.addOutgoing(qc2.getGraph()).getTarget().makePrimitive();
		field2.addPrimitiveLinkImageSize();
		
		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
