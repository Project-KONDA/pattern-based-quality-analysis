package qualitypatternmodel.constrainttranslation;

import java.util.List;

import org.basex.util.Pair;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import de.gwdg.metadataqa.api.configuration.schema.Rule;
import de.gwdg.metadataqa.api.json.DataElement;
import de.gwdg.metadataqa.api.schema.BaseSchema;
import de.gwdg.metadataqa.api.schema.Format;
import qualitypatternmodel.constrainttranslation.ConstraintRuleObject.FormulaConstraintRuleObject;
import qualitypatternmodel.constrainttranslation.ConstraintRuleObject.HasValueRuleObject;
import qualitypatternmodel.constrainttranslation.ConstraintRuleObject.ListComparisonRuleObject;
import qualitypatternmodel.constrainttranslation.ConstraintRuleObject.NotConstraintRuleObject;
import qualitypatternmodel.constrainttranslation.ConstraintRuleObject.NumberComparisonRuleObject;
import qualitypatternmodel.constrainttranslation.ConstraintRuleObject.PatternRuleObject;
import qualitypatternmodel.constrainttranslation.ConstraintRuleObject.SingleConstraintRuleObject;
import qualitypatternmodel.constrainttranslation.ConstraintRuleObject.StringLengthRuleObject;
import qualitypatternmodel.constrainttranslation.ConstraintRuleObject.CardinalityConstraintRuleObject;
import qualitypatternmodel.constrainttranslation.ConstraintRuleObject.UniqueRuleObject;
import qualitypatternmodel.constrainttranslation.ConstraintRuleObject.ComparisonRuleObject;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Comparable;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.Contains;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.operators.StringLength;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.patternstructure.impl.NumberElementImpl;

public class ConstraintObject {
	
	CompletePattern pattern;
	ComplexNode record;
	Node[] fieldNodes;
	String fieldPath;
	
	ConstraintRuleObject rule;
	
	EList<String> rules;
	EList<Pair<String, String>> fieldPaths;

	
	public ConstraintObject (CompletePattern completePattern) throws InvalidityException {
		
		if (!ConstraintTranslationValidation.checkPatternTranslatable (completePattern))
			throw new InvalidityException();

		pattern = completePattern;
		record = FieldNodeIdentification.identifyRecordNode(pattern);
		fieldNodes = FieldNodeIdentification.identifyFieldNodes(pattern);
		rule = transformCondition(completePattern.getCondition(), record, fieldNodes).realInvert();
		
		fieldPath = ConstraintTranslationHelper.getRelationPathTo(fieldNodes[0]);
		if (rule != null)
			fieldPaths = rule.getAllFields();
	}
	
	// public functions
	public String getStringRepresentation() throws InvalidityException {
		if (rule == null)
			return "ERROR";
		String result = "format: XML\nfields:\n";
		
		EList<Pair<String, String>> fields = rule.getAllFields();
		
		for (Pair<String, String> fieldpair: fields) {
			result += "- name: " + fieldpair.name() +
					"\n  path: " + fieldpair.value() + "\n";
		}
		
		result += "- name: " + fieldNodes[0].getName().replace(" ", "_") + "\n";
		result += "  path: " + fieldPath + "\n";
		result += "  extractable: true\n";
		result += "  rules:\n" + rule.getStringRepresentation();
		
		return result;
	}
	
	public BaseSchema getConstraintSchema() {
		if (rule == null)
			return null;
		BaseSchema schema = new BaseSchema();
		schema.setFormat(Format.XML);

		EList<Pair<String, String>> fields = rule.getAllFields();
		
		for (Pair<String, String> fieldpair: fields) {
			DataElement field = new DataElement(fieldpair.name(), fieldpair.value()).setExtractable();
			schema.addField(field);
		}
		
		Rule constraintrule = new Rule().withSuccessScore(1);
		rule.addConstraintRuleTo(constraintrule);
		DataElement field1 = new DataElement(fieldNodes[0].getName().replace(" ", "_"), fieldPath).setExtractable();
		field1.addRule(constraintrule);
		schema.addField(field1);
		
		return schema;
	}
	
	// local functions
	
	private static ConstraintRuleObject transformCondition(Condition condition, ComplexNode recordNode, Node[] fieldNodes) throws InvalidityException {
		
		Pair<Node, Boolean> pair = UniquenessConditionCheck.uniquenessConditionField (condition, recordNode);
		if (pair != null)
			return new UniqueRuleObject(pair.value());
		
		if (condition instanceof Formula) {
			Formula formula = (Formula) condition;
			List<ConstraintRuleObject> ruleobjectlist = new BasicEList<ConstraintRuleObject>();
			ruleobjectlist.add(transformCondition(formula.getCondition1(), recordNode, fieldNodes));
			ruleobjectlist.add(transformCondition(formula.getCondition2(), recordNode, fieldNodes));
			FormulaConstraintRuleObject frule = new FormulaConstraintRuleObject(formula.getOperator(), ruleobjectlist);
			return frule;
		} else if (condition instanceof NotCondition) {
			NotCondition notc = (NotCondition) condition;
			NotConstraintRuleObject frule = new NotConstraintRuleObject(transformCondition(notc.getCondition(), recordNode, fieldNodes));
			return frule;
		} else if (condition instanceof QuantifiedCondition) {
			QuantifiedCondition qcond = (QuantifiedCondition) condition;
			ConstraintRuleObject rule = transformQuantifiedCondition(qcond, fieldNodes);
			return rule;
		} else if (condition instanceof QuantifiedCondition) {
			QuantifiedCondition qcond = (QuantifiedCondition) condition;
			ConstraintRuleObject rule = transformQuantifiedCondition(qcond, fieldNodes);
			return rule;
		} else if (condition instanceof CountCondition) {
			CountCondition ccond = (CountCondition) condition;
			ConstraintRuleObject rule = transformCountCondition(ccond, fieldNodes);
			return rule;
		}
		throw new InvalidityException();
	}
	
	private static ConstraintRuleObject transformQuantifiedCondition(QuantifiedCondition condition, Node[] fieldNodes) throws InvalidityException {
		if (!condition.getQuantifier().equals(Quantifier.EXISTS))
			throw new InvalidityException();
		
		Graph graph = condition.getGraph(); 
		
		// is Unique Exists
		if (condition.getCondition() instanceof CountCondition) {
			// TODO maybe
		}		
		
		if (condition.getCondition() != null && !(condition.getCondition() instanceof TrueElement))
			throw new InvalidityException();
		
		// is default Exists
		if (graph.getNodes().size() == 1 && graph.getOperatorList().getOperators().size() == 0) {
			return transformSingleNodeExistsGraph(graph, fieldNodes);
		}
		if (graph.getNodes().size() == 1 && graph.getOperatorList().getOperators().size() == 1) {
			return transformSingleNodeGraph(graph, fieldNodes);
		}
		else if (graph.getNodes().size() == 2 && graph.getOperatorList().getOperators().size() == 1) {
			return transformNodeComparisonGraph(graph, fieldNodes);
		}
		else 
			return transformCombinationGraph(graph, fieldNodes);
	}
	
	private static ConstraintRuleObject transformCountCondition(CountCondition condition, Node[] fieldNodes) throws InvalidityException {
		Graph graph = condition.getCountPattern().getGraph();
		if (graph.getNodes().size() != 1)
			throw new InvalidityException("Count Condition invalidly specified: multiple nodes");
//		Node node = graph.getNodes().get(0);
//		if (!(node instanceof XmlProperty))
//			throw new InvalidityException("Count Condition invalidly specified: Node " + (node != null? node.getName(): "") + " is of type " + node.getClass().getSimpleName() + " instead of XmlProperty");

		ComparisonOperator operator = condition.getOption().getValue();
		
		if (! (condition.getArgument2() instanceof NumberElementImpl))
			throw new InvalidityException("Count Condition invalidly specified: argument 2 invalid");
		
		Double number = ((NumberElement) condition.getArgument2()).getNumberParam().getValue();
		
		ConstraintRuleObject rule = new CardinalityConstraintRuleObject(operator, number);
		
		return rule;
	}
	
	private static ConstraintRuleObject transformSingleNodeExistsGraph (Graph graph, Node[] fieldNodes) throws InvalidityException {
		return new CardinalityConstraintRuleObject(ComparisonOperator.LESS, 1.);
	}
	
	private static ConstraintRuleObject transformSingleNodeGraph (Graph graph, Node[] fieldNodes) throws InvalidityException {
		Node node = graph.getNodes().get(0);
		Operator op = graph.getOperatorList().getOperators().get(0);
		return transformOperator(op, node);
	}
	
	private static ConstraintRuleObject transformOperator(Operator op, Node node) throws InvalidityException {
		SingleConstraintRuleObject rule = null;
		
		if (op instanceof Comparison) {
			Comparison cf = (Comparison) op;
			ComparisonOperator co = cf.getOption().getValue();
			EList<Comparable> args = cf.getArguments();
			if (args.size() != 2)
				throw new InvalidityException();
			
			Boolean isRightDirection = args.get(0) == node;
			Comparable otherArg = (isRightDirection)? args.get(1) : args.get(0);
			co = (isRightDirection)? co: ComparisonOperator.invertDirection(co);
			
			if (otherArg instanceof TextLiteralParam) {
//				"hasValue"
				TextLiteralParam tp = (TextLiteralParam) otherArg;
				String value = tp.getValue();
				
				if ( co != ComparisonOperator.EQUAL && co != ComparisonOperator.NOTEQUAL)
					return null;
				rule = new HasValueRuleObject(value, co);
				
			} else if (otherArg instanceof NumberParam) {
//				"minExclusive", "minInclusive", "maxInclusive", "maxExclusive"
				NumberParam np = (NumberParam) otherArg;
				rule = new NumberComparisonRuleObject(np.getValue(), co);
				
			} else if (otherArg instanceof TextListParam) {
//				"in" [str1, str2, .. strN]
				TextListParam tlp = (TextListParam) otherArg;
				if ( co != ComparisonOperator.EQUAL && co != ComparisonOperator.NOTEQUAL)
					return null;
				
				rule = new ListComparisonRuleObject( tlp.getValues(), (co == ComparisonOperator.NOTEQUAL) );
			} else if (otherArg instanceof Node) {
				Node nodearg = (Node) otherArg;
				if ( co != ComparisonOperator.EQUAL && co != ComparisonOperator.NOTEQUAL)
					return null;
				
				rule = new ComparisonRuleObject(nodearg, co);
			}
			
		} else if (op instanceof Match) {
//			"pattern" <regex>
//			"minWords", "maxWords"
			Match match = (Match) op;
			rule = new PatternRuleObject( match.getRegularExpression().getValue(), !match.getOption().getValue() );
			
		} else if (op instanceof Contains) {
//			contains
			Contains contains = (Contains) op;
			String containsAsRegex = ".*" + java.util.regex.Pattern.quote(contains.getContent().getValue()) + ".*";
			rule = new PatternRuleObject(containsAsRegex, !contains.getOption().getValue());
			
		} else if (op instanceof StringLength) {
//			"minLength" , "maxLength"
			StringLength len = (StringLength) op;
			
			ComparisonOperator co = len.getOption().getValue();
			Double num = len.getNumber().getValue();
			rule = new StringLengthRuleObject(num, co);
		}
		
		if (rule == null)
			throw new InvalidityException(op.myToString());
		return rule;
	}

	private static ConstraintRuleObject transformNodeComparisonGraph (Graph graph, Node[] fieldNodes) throws InvalidityException {
		
		EList<Node> nodes = graph.getNodes();
		
		if (nodes.size() != 2)
			throw new InvalidityException();
		
		Node field = null;
		Node other = null;
		
		for (Node n: nodes) {
			Boolean contains = false;
			for (Node n2: fieldNodes)
				if(n == n2)
					contains = true;
			
			if (contains) {
				if (field != null)
					throw new InvalidityException();
				field = n;
			}
			else {
				if (other != null){
					field = nodes.get(0);
					other = nodes.get(1);
				}
				other = n;
			}
		}

		if (field == null || other == null)
			throw new InvalidityException();
		
		Comparison comp = (Comparison) field.getPredicates().get(0);
		
		return new ComparisonRuleObject(other, comp.getOption().getValue());
	}

	private static ConstraintRuleObject transformCombinationGraph (Graph graph, Node[] fieldNodes) throws InvalidityException {

		EList<Node> nodes = graph.getNodes();
		
		Node field = null;
		EList<Node> others = new BasicEList<Node>();
		
		for (Node n: nodes) {
			
			Boolean contains = false;
			for (Node n2: fieldNodes)
				if(n == n2)
					contains = true;
			
			if (contains) {
				if (field != null)
					throw new InvalidityException();
				field = n;
			}
			else
				others.add(n);	
		}
		
		if (field == null)
			throw new InvalidityException();
		
		EList<ConstraintRuleObject> rules = new BasicEList<ConstraintRuleObject>();
		
		EList<BooleanOperator> ops = field.getPredicates();
		
		for (Operator o: ops) {
			ConstraintRuleObject rule = transformOperator(o, field);
			rules.add(rule);
		}
		ConstraintRuleObject result = new FormulaConstraintRuleObject(LogicalOperator.AND, rules);

		return result;
	}
}

