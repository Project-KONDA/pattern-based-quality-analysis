package qualitypatternmodel.newservlets.initialisation;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.json.JSONException;
import org.json.JSONObject;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.StringLength;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.impl.NumberElementImpl;
import qualitypatternmodel.textrepresentation.impl.PatternTextImpl;

public class GenericPatterns {
	
	private static boolean VALUES = true;
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		int i = 0;
		for (CompletePattern pattern: getAllGenericPattern()) {
			i+=1;
			System.out.println("Example " + i);
			System.out.println(pattern.myToString());
			System.out.println();
		}
	}
	
	public static List<CompletePattern> getAllGenericPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<CompletePattern> patterns = new BasicEList<CompletePattern>();
		patterns.add(getGenericCard());
		patterns.add(getGenericComp());
		patterns.add(getGenericFunc());
		patterns.add(getGenericUnique());
		patterns.add(getGenericMatch());
		patterns.add(getGenericContains());
		patterns.add(getGenericAppdup3());
		patterns.add(getGenericDupVal());
		patterns.add(getGenericInvalidLink());

		patterns.add(getGenericMandAtt());
		patterns.add(getGenericStringLength());
		patterns.add(getGenericCompVal());
//		patterns.add(getGenericLocalUnique());
//		patterns.add(getGenericCompValAny());
//		patterns.add(getGenericCardImpliesMandAtt());
//		patterns.add(getGenericCheckFormat());
//		patterns.add(getGenericCompDatabase());
		
		return patterns;
	}

	public static CompletePattern getGenericCard() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId("Card_generic");
		pattern.setAbstractId("Card_generic");
		pattern.setName("Card");
		pattern.setShortDescription("Cardinality Constraint");
		pattern.setDescription("Check, wether the occurence count of specific elements apply.");
		
		// Context graph of pattern:
		Node returnNode = pattern.getGraph().getNodes().get(0).makeComplex();
		returnNode.setName("RecordElement");
		
		// First-order logic condition of pattern:
		CountCondition countCondition = PatternstructureFactory.eINSTANCE.createCountCondition();
		pattern.setCondition(countCondition);
		countCondition.createCountPattern();
		NumberElementImpl ne = new NumberElementImpl();
		countCondition.setArgument2(ne);
		ne.createParameters();
		if (VALUES) {
			ne.getNumberParam().setValue(1.);
			countCondition.getOption().setValue(ComparisonOperator.GREATER);
		}

		Node countReturn = returnNode.addOutgoing(countCondition.getCountPattern().getGraph()).getTarget().makePrimitive();
//		countReturn = countReturn.makePrimitive();
		countReturn = countReturn.makeComplex();
		countReturn.setName("PropertyToCount");
		countReturn.setReturnNode(true);
		
		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;	
	}
	
	public static CompletePattern getGenericComp() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId("Comp_generic");
		pattern.setAbstractId("Comp_generic");
		pattern.setName("Comp");
		pattern.setShortDescription("Comparison Pattern");
		pattern.setDescription("Check, wether the occurence count of specific elements apply.");
		
		Graph graph1 = pattern.getGraph();
		Node returnNode = graph1.getReturnNodes().get(0).makeComplex();
		
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(quantifiedCondition);
		Graph graph2 = quantifiedCondition.getGraph();
		
		Node element1 = returnNode.addOutgoing(graph2).getTarget().makePrimitive();
		Node element2 = returnNode.addOutgoing(graph2).getTarget().makePrimitive();
		
		Comparison comp2 = element1.addComparison(element2);
		comp2.getOption().getOptions().add(ComparisonOperator.GREATER);
		comp2.getOption().getOptions().add(ComparisonOperator.LESS);
		comp2.getOption().getOptions().add(ComparisonOperator.GREATEROREQUAL);
		comp2.getOption().getOptions().add(ComparisonOperator.LESSOREQUAL);
		
		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}
	
	public static CompletePattern getGenericCompSet() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId("CompSet_generic");
		pattern.setAbstractId("CompSet_generic");
		pattern.setName("CompSet");
		pattern.setShortDescription("Comparison Pattern with Set");
		pattern.setDescription("Check, wether the vallue of fields are within a list of allowed (/forbidden) wo.");
		
		Graph graph1 = pattern.getGraph();
		Node returnNode = graph1.getReturnNodes().get(0).makeComplex();
		
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(quantifiedCondition);
		Graph graph2 = quantifiedCondition.getGraph();
		
		Node element1 = returnNode.addOutgoing(graph2).getTarget().makePrimitive();
		
		TextListParamImpl tlp = new TextListParamImpl();
		element1.addPrimitiveComparison(tlp);
		if (VALUES) {
			tlp.addStringValue("abc");
			tlp.addStringValue("def");
			tlp.addStringValue("ghi");
		}
		
		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}
	
	public static CompletePattern getGenericFunc() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId("Func_generic");
		pattern.setAbstractId("Func_generic");
		pattern.setName("Func");
		pattern.setShortDescription("Functional Dependency Constraint");
		pattern.setDescription("Validate a dependency between two subordinate fields is valid in comparison to data records next to it.");
		
		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		
		pattern.setCondition(qc);
		
		Graph g1 = pattern.getGraph();
		Graph g2 = qc.getGraph();
		
		ComplexNode ret = g1.getNodes().get(0).makeComplex();
		ComplexNode other = g2.addComplexNode();
		
		PrimitiveNode fieldA1 = ret.addOutgoing(g2).getTarget().makePrimitive();
		PrimitiveNode fieldA2 = ret.addOutgoing(g2).getTarget().makePrimitive();
		PrimitiveNode fieldB1 = other.addOutgoing().getTarget().makePrimitive();
		PrimitiveNode fieldB2 = other.addOutgoing().getTarget().makePrimitive();
		
		Comparison c1 = fieldA1.addComparison(fieldB1);
		c1.getTypeOption().setValue(ReturnType.STRING);
		c1.getTypeOption().setPredefined(true);
		c1.getOption().setValue(ComparisonOperator.EQUAL);
		c1.getOption().setPredefined(true);

		Comparison c2 = fieldA2.addComparison(fieldB2);
		c2.getTypeOption().setValue(ReturnType.STRING);
		c2.getTypeOption().setPredefined(true);
		c2.getOption().setValue(ComparisonOperator.NOTEQUAL);
		c2.getOption().setPredefined(true);
		
		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}
	
	public static CompletePattern getGenericUnique() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId("Unique_generic");
		pattern.setAbstractId("Unique_generic");
		pattern.setName("Unique");
		pattern.setShortDescription("Uniqueness Constraint");
		pattern.setDescription("Check, whether a value is unique within the dataset.");
		
//		NotCondition notCon = PatternstructureFactory.eINSTANCE.createNotCondition();
//		pattern.setCondition(notCon);

		QuantifiedCondition quaCon = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
//		notCon.setCondition(quaCon);
		pattern.setCondition(quaCon);
		
		ComplexNode r1 = (ComplexNode) pattern.getGraph().getNodes().get(0).makeComplex();
		r1.setName("Original");
		ComplexNode r2 = quaCon.getGraph().addComplexNode();
		r2.setName("Copy");
		
		Comparison c = r1.addComparison(r2);
		c.getOption().setValue(ComparisonOperator.NOTEQUAL);
		c.getOption().setPredefined(true);
		
		PrimitiveNode n = r1.addOutgoing(quaCon.getGraph()).getTarget().makePrimitive();
		n.setName("Value");
		r2.addOutgoing(n);

		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}
	
	public static CompletePattern getGenericMatch() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId("Match_generic");
		pattern.setAbstractId("Match_generic");
		pattern.setName("Match");
		pattern.setShortDescription("Regular Expression Check");
		pattern.setDescription("Check, whether a value matches a specific regular expression.");
		
		pattern.getGraph().getReturnNodes().get(0).makeComplex();
		
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(quantifiedCondition);
		
		Node ret  = pattern.getGraph().getReturnNodes().get(0);
		Node element1 = ret.addOutgoing(quantifiedCondition.getGraph()).getTarget().makePrimitive();
		
		TextLiteralParam tlp = element1.addPrimitiveMatch();
		if (VALUES)
			tlp.setValue("[a-zA-Z]*");

		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;	
	}
	
	public static CompletePattern getGenericContains() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId("Contains_generic");
		pattern.setAbstractId("Contains_generic");
		pattern.setName("Contains");
		pattern.setShortDescription("Contains Check");
		pattern.setDescription("Check, whether a value contains a specific substring.");
		
		// Context graph of pattern:
		pattern.getGraph().getReturnNodes().get(0).makeComplex();
		Graph g1 = pattern.getGraph();
		Node ret = g1.getReturnNodes().get(0);
		
		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(quantifiedCondition);
		Graph g2 = quantifiedCondition.getGraph();
		
		Node element1 = ret.addOutgoing(g2).getTarget().makePrimitive();
		TextLiteralParam tlp = element1.addPrimitiveContains();
		if (VALUES)
			tlp.setValue("abc");

		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;	
	}

	public static CompletePattern getGenericAppdup2() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId("Appdup2_generic");
		pattern.setAbstractId("Appdup2_generic");
		pattern.setName("Appdup2");
		pattern.setShortDescription("Approximate Duplicate based on two attributes");
		pattern.setDescription("Check whether there are records that have the same value in two important attributes, suggesting that they describe the same real-world object.");
		
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

	public static CompletePattern getGenericAppdup3() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = getGenericAppdup2();
		pattern.setPatternId("Appdup3_generic");
		pattern.setAbstractId("Appdup3_generic");
		pattern.setName("Appdup3");
		pattern.setShortDescription("Approximate Duplicate based on three attributes");
		pattern.setDescription("Check whether there are records that have the same value in three important attributes, suggesting that they describe the same real-world object.");
		
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
	
	public static CompletePattern getGenericDupVal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId("DupVal_generic");
		pattern.setAbstractId("DupVal_generic");
		pattern.setName("DupVal");
		pattern.setShortDescription("Duplicate value");
		pattern.setDescription("Check whether a record has the same value in two distinct fields.");
		
		ComplexNode main = (ComplexNode) pattern.getGraph().getReturnNodes().get(0).makeComplex();
		main.setName("main");
		
		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(qc);
		
		PrimitiveNode field = main.addOutgoing(qc.getGraph()).getTarget().makePrimitive();
		field.setName("field");
		
		CountCondition countCondition = PatternstructureFactory.eINSTANCE.createCountCondition();
		qc.setCondition(countCondition);
		countCondition.createCountPattern();
		NumberElementImpl ne = new NumberElementImpl();
		countCondition.setArgument2(ne);
		ne.createParameters();

		if (VALUES) {
			ne.getNumberParam().setValue(1.);
			countCondition.getOption().setValue(ComparisonOperator.GREATER);
		}
		
		Relation rel = main.addOutgoing(countCondition.getCountPattern().getGraph());
		PrimitiveNode field2 = rel.getTarget().makePrimitive();
		field2.setName("field2");
		field2.setReturnNode(true);
		Comparison c = field2.addComparison(field);
		ComparisonOptionParam comparisonOption = c.getOption();
		comparisonOption.setValue(ComparisonOperator.EQUAL);
		comparisonOption.setPredefined(true);

		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}

	public static CompletePattern getGenericInvalidLink() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId("InvalidLink_generic");
		pattern.setAbstractId("InvalidLink_generic");
		pattern.setName("InvalidLink");
		pattern.setShortDescription("Invalid Link");
		pattern.setDescription("Check whether a record an invalid link in a field.");

		ComplexNode main = (ComplexNode) pattern.getGraph().getReturnNodes().get(0).makeComplex();
		main.setName("main");
		
		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(qc);

		PrimitiveNode field = main.addOutgoing(qc.getGraph()).getTarget().makePrimitive();
		field.setName("field");
		
		field.addPrimitiveValidateLink();

		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}

	
	public static CompletePattern getGenericMandAtt() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId("MandAtt_generic");
		pattern.setAbstractId("MandAtt_generic");
		pattern.setName("MandAtt");
		pattern.setShortDescription("Mandatory Attribute");
		pattern.setDescription("Check whether a record has a mandatory field.");

		ComplexNode main = (ComplexNode) pattern.getGraph().getReturnNodes().get(0).makeComplex();
		main.setName("main");
		
		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(qc);

		PrimitiveNode field = main.addOutgoing(qc.getGraph()).getTarget().makePrimitive();
		field.setName("field");
		
		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}
	
//	public static CompletePattern getGenericLocalUnique() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
//		pattern.setPatternId("LocalUnique_generic");
//		pattern.setAbstractId("LocalUnique_generic");
//		pattern.setName("LocalUnique");
//		pattern.setShortDescription("Local Unique Attribute Value");
//		pattern.setDescription("Check whether all field values are unique within a record.");
//		// TODO
//		pattern.isValid(AbstractionLevel.GENERIC);
//		return pattern;
//	}
	
	public static CompletePattern getGenericStringLength() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId("StringLength_generic");
		pattern.setAbstractId("StringLength_generic");
		pattern.setName("StringLength");
		pattern.setShortDescription("String value length restriction");
		pattern.setDescription("Check whether all field values comply to the length restriction.");

		ComplexNode main = (ComplexNode) pattern.getGraph().getReturnNodes().get(0).makeComplex();
		main.setName("main");
		
		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(qc);

		PrimitiveNode field = main.addOutgoing(qc.getGraph()).getTarget().makePrimitive();
		field.setName("field");
		
		StringLength sl = field.addPrimitiveStringLength();

		if (VALUES)
			sl.getNumber().setValue(1.);
		
		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}
	
	public static CompletePattern getGenericCompVal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId("CompVal_generic");
		pattern.setAbstractId("CompVal_generic");
		pattern.setName("CompVal");
		pattern.setShortDescription("");
		pattern.setDescription("Check whether all values of a specific field within a record does comply to a value restriction.");

		ComplexNode main = (ComplexNode) pattern.getGraph().getReturnNodes().get(0).makeComplex();
		main.setName("main");
		
		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(qc);

		PrimitiveNode field = main.addOutgoing(qc.getGraph()).getTarget().makePrimitive();
		field.setName("field");
		
		field.addPrimitiveComparison();
		
		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}
	
//	public static CompletePattern getGenericCompValAny() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
//		pattern.setPatternId("CompValAny_generic");
//		pattern.setAbstractId("CompValAny_generic");
//		pattern.setName("CompValAny");
//		pattern.setShortDescription("");
//		pattern.setDescription("Check whether any value of a specific field within a record does comply to a value restriction.");
//		// TODO
//		pattern.isValid(AbstractionLevel.GENERIC);
//		return pattern;
//	}
	
//	public static CompletePattern getGenericCardImpliesMandAtt() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
//		pattern.setPatternId("CardImpliesMandAtt_generic");
//		pattern.setAbstractId("CardImpliesMandAtt_generic");
//		pattern.setName("CardImpliesMandAtt");
//		pattern.setShortDescription("Mandatory Attribute based on Cardinality Constraint");
//		pattern.setDescription("Check whether a attribute exists, that is mandatory on specific cardinalities of a field.");
//		// TODO
//		pattern.isValid(AbstractionLevel.GENERIC);
//		return pattern;
//	}

	public static CompletePattern getConcrete(CompletePattern pattern, Language lan, Map<Integer, String> values, String[] variants, String[] oldvariants) 
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (pattern.getLanguage() != Language.GENERIC)
			throw new InvalidityException("Pattern '" + pattern.getName() + "' is not generic.");
		
		switch(lan) {
		case XML: 
			pattern.createXmlAdaption();
			break;
		case RDF: 
			pattern.createRdfAdaption();
			break;
		case NEO4J:
			pattern.createNeo4jAdaption();
			break;
		default:
			throw new InvalidityException("Invalid Language");
		}
		
		String name = pattern.getName();
		pattern.setPatternId(name + "_" + lan.getLiteral());
		pattern.setAbstractId(name + "_" + lan.getLiteral());
		List<Parameter> params = pattern.getParameterList().getParameters();
		
		if (XmlPatterns.AXIS && values != null)
			for (Integer index: values.keySet())
				params.get(index).setValueFromString(values.get(index));
		
		if (XmlPatterns.DEFAULT_VARIANTS && variants != null)
			for (String json: variants)
				try {
					new PatternTextImpl(pattern, new JSONObject(json));
				} catch(JSONException e) {
					e.printStackTrace();
				}
		
		if (XmlPatterns.OLD_VARIANTS && oldvariants != null)
			for (String json: oldvariants)
				try {
					new PatternTextImpl(pattern, new JSONObject(json));
				} catch(JSONException e) {
					e.printStackTrace();
				}
	
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
//	public static CompletePattern getGenericCheckFormat() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
//		pattern.setPatternId("CheckFormat_generic");
//		pattern.setAbstractId("CheckFormat_generic");
//		pattern.setName("CheckFormat");
//		pattern.setShortDescription("Check the format of a resource.");
//		pattern.setDescription("Check if the ressource under an URL is of a specific format.");
//		// TODO
//		pattern.isValid(AbstractionLevel.GENERIC);
//		return pattern;
//	}
	
//	public static CompletePattern getGenericCompDatabase() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
//		pattern.setPatternId("CompDatabase_generic");
//		pattern.setAbstractId("CompDatabase_generic");
//		pattern.setName("CompDatabase");
//		pattern.setShortDescription("Fieldvalue in Database");
//		pattern.setDescription("Check whether all values in a field are in a database.");
//		// TODO
//		pattern.isValid(AbstractionLevel.GENERIC);
//		return pattern;
//	}

}
