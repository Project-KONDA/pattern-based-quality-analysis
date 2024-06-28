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
	
	
	// GENERIC PATTERNS

	public static CompletePattern getGenericCard() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId(GenericPatternInformation.CARD_ID_GENERIC);
		pattern.setAbstractId(GenericPatternInformation.CARD_ID_GENERIC);
		pattern.setName(GenericPatternInformation.CARD_NAME);
		pattern.setDescription(GenericPatternInformation.CARD_DESCR);
		
		// Context graph of pattern:
		Node returnNode = pattern.getGraph().getNodes().get(0).makeComplex();
		
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
		countReturn.setReturnNode(true);
		
		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;	
	}
	
	public static CompletePattern getGenericComp() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId(GenericPatternInformation.COMP_ID_GENERIC);
		pattern.setAbstractId(GenericPatternInformation.COMP_ID_GENERIC);
		pattern.setName(GenericPatternInformation.COMP_NAME);
		pattern.setDescription(GenericPatternInformation.COMP_DESCR);
		
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
		pattern.setPatternId(GenericPatternInformation.COMPSET_ID_GENERIC);
		pattern.setAbstractId(GenericPatternInformation.COMPSET_ID_GENERIC);
		pattern.setName(GenericPatternInformation.COMPSET_NAME);
		pattern.setDescription(GenericPatternInformation.COMPSET_DESCR);
		
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
		pattern.setPatternId(GenericPatternInformation.FUNC_ID_GENERIC);
		pattern.setAbstractId(GenericPatternInformation.FUNC_ID_GENERIC);
		pattern.setName(GenericPatternInformation.FUNC_NAME);
		pattern.setDescription(GenericPatternInformation.FUNC_DESCR);
		
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
		pattern.setPatternId(GenericPatternInformation.UNIQUE_ID_GENERIC);
		pattern.setAbstractId(GenericPatternInformation.UNIQUE_ID_GENERIC);
		pattern.setName(GenericPatternInformation.UNIQUE_NAME);
		pattern.setDescription(GenericPatternInformation.UNIQUE_DESCR);
		
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
		pattern.setPatternId(GenericPatternInformation.MATCH_ID_GENERIC);
		pattern.setAbstractId(GenericPatternInformation.MATCH_ID_GENERIC);
		pattern.setName(GenericPatternInformation.MATCH_NAME);
		pattern.setDescription(GenericPatternInformation.MATCH_DESCR);
		
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
		pattern.setPatternId(GenericPatternInformation.CONTAINS_ID_GENERIC);
		pattern.setAbstractId(GenericPatternInformation.CONTAINS_ID_GENERIC);
		pattern.setName(GenericPatternInformation.CONTAINS_NAME);
		pattern.setDescription(GenericPatternInformation.CONTAINS_DESCR);
		
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
		pattern.setPatternId(GenericPatternInformation.APPDUP2_ID_GENERIC);
		pattern.setAbstractId(GenericPatternInformation.APPDUP2_ID_GENERIC);
		pattern.setName(GenericPatternInformation.APPDUP2_NAME);
		pattern.setDescription(GenericPatternInformation.APPDUP2_DESCR);
		
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
		pattern.setPatternId(GenericPatternInformation.APPDUP3_ID_GENERIC);
		pattern.setAbstractId(GenericPatternInformation.APPDUP3_ID_GENERIC);
		pattern.setName(GenericPatternInformation.APPDUP3_NAME);
		pattern.setDescription(GenericPatternInformation.APPDUP3_DESCR);
		
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
		pattern.setPatternId(GenericPatternInformation.DUPVAL_ID_GENERIC);
		pattern.setAbstractId(GenericPatternInformation.DUPVAL_ID_GENERIC);
		pattern.setName(GenericPatternInformation.DUPVAL_NAME);
		pattern.setDescription(GenericPatternInformation.DUPVAL_DESCR);
		
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
		pattern.setPatternId(GenericPatternInformation.INVALIDLINK_ID_GENERIC);
		pattern.setAbstractId(GenericPatternInformation.INVALIDLINK_ID_GENERIC);
		pattern.setName(GenericPatternInformation.INVALIDLINK_NAME);
		pattern.setDescription(GenericPatternInformation.INVALIDLINK_DESCR);

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
		pattern.setPatternId(GenericPatternInformation.MANDATT_ID_GENERIC);
		pattern.setAbstractId(GenericPatternInformation.MANDATT_ID_GENERIC);
		pattern.setName(GenericPatternInformation.MANDATT_NAME);
		pattern.setDescription(GenericPatternInformation.MANDATT_DESCR);

		ComplexNode main = (ComplexNode) pattern.getGraph().getReturnNodes().get(0).makeComplex();
		main.setName("main");
		
		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(qc);

		PrimitiveNode field = main.addOutgoing(qc.getGraph()).getTarget().makePrimitive();
		field.setName("field");
		
		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}
	
	public static CompletePattern getGenericStringLength() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId(GenericPatternInformation.STRINGLENGTH_ID_GENERIC);
		pattern.setAbstractId(GenericPatternInformation.STRINGLENGTH_ID_GENERIC);
		pattern.setName(GenericPatternInformation.STRINGLENGTH_NAME);
		pattern.setDescription(GenericPatternInformation.STRINGLENGTH_DESCR);

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
		pattern.setPatternId(GenericPatternInformation.COMPVAL_ID_GENERIC);
		pattern.setAbstractId(GenericPatternInformation.COMPVAL_ID_GENERIC);
		pattern.setName(GenericPatternInformation.COMPVAL_NAME);
		pattern.setDescription(GenericPatternInformation.COMPVAL_DESCR);

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
	
//	public static CompletePattern getGenericLocalUnique() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
//		pattern.setPatternId(GenericPatternInformation.LOCALUNIQUE_ID_GENERIC);
//		pattern.setAbstractId(GenericPatternInformation.LOCALUNIQUE_ID_GENERIC);
//		pattern.setName(GenericPatternInformation.LOCALUNIQUE_NAME);
//		pattern.setDescription(GenericPatternInformation.LOCALUNIQUE_DESCR);
//		// TODO
//		pattern.isValid(AbstractionLevel.GENERIC);
//		return pattern;
//	}
//	
//	public static CompletePattern getGenericCompValAny() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
//		pattern.setPatternId(GenericPatternInformation.COMPVALANY_ID_GENERIC);
//		pattern.setAbstractId(GenericPatternInformation.COMPVALANY_ID_GENERIC);
//		pattern.setName(GenericPatternInformation.COMPVALANY_NAME);
//		pattern.setDescription(GenericPatternInformation.COMPVALANY_DESCR);
//		// TODO
//		pattern.isValid(AbstractionLevel.GENERIC);
//		return pattern;
//	}
//	
//	public static CompletePattern getGenericCardImpliesMandAtt() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
//		pattern.setPatternId(GenericPatternInformation.CARDIMPLIESMANDATT_ID_GENERIC);
//		pattern.setAbstractId(GenericPatternInformation.CARDIMPLIESMANDATT_ID_GENERIC);
//		pattern.setName(GenericPatternInformation.CARDIMPLIESMANDATT_NAME);
//		pattern.setDescription(GenericPatternInformation.CARDIMPLIESMANDATT_DESCR);
//		// TODO
//		pattern.isValid(AbstractionLevel.GENERIC);
//		return pattern;
//	}
//	
//	public static CompletePattern getGenericCheckFormat() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
//		pattern.setPatternId(GenericPatternInformation.CHECKFORMAT_ID_GENERIC);
//		pattern.setAbstractId(GenericPatternInformation.CHECKFORMAT_ID_GENERIC);
//		pattern.setName(GenericPatternInformation.CHECKFORMAT_NAME);
//		pattern.setDescription(GenericPatternInformation.CHECKFORMAT_DESCR);
//		// TODO
//		pattern.isValid(AbstractionLevel.GENERIC);
//		return pattern;
//	}
//	
//	public static CompletePattern getGenericCompDatabase() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
//		pattern.setPatternId(GenericPatternInformation.COMPDATABASE_ID_GENERIC);
//		pattern.setAbstractId(GenericPatternInformation.COMPDATABASE_ID_GENERIC);
//		pattern.setName(GenericPatternInformation.COMPDATABASE_NAME);
//		pattern.setDescription(GenericPatternInformation.COMPDATABASE_DESCR);
//		// TODO
//		pattern.isValid(AbstractionLevel.GENERIC);
//		return pattern;
//	}

}
