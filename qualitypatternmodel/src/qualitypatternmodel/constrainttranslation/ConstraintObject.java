package qualitypatternmodel.constrainttranslation;

import org.basex.util.Pair;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.constrainttranslation.ConstraintRuleObject.FormulaConstraintRuleObject;
import qualitypatternmodel.constrainttranslation.ConstraintRuleObject.HasValueRuleObject;
import qualitypatternmodel.constrainttranslation.ConstraintRuleObject.ListComparisonRuleObject;
import qualitypatternmodel.constrainttranslation.ConstraintRuleObject.NotConstraintRuleObject;
import qualitypatternmodel.constrainttranslation.ConstraintRuleObject.NumberComparisonRuleObject;
import qualitypatternmodel.constrainttranslation.ConstraintRuleObject.PatternRuleObject;
import qualitypatternmodel.constrainttranslation.ConstraintRuleObject.SingleConstraintRuleObject;
import qualitypatternmodel.constrainttranslation.ConstraintRuleObject.StringLengthRuleObject;
import qualitypatternmodel.constrainttranslation.ConstraintRuleObject.UniqueRuleObject;
import qualitypatternmodel.adaptionxml.XmlNavigation;
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
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;
import qualitypatternmodel.patternstructure.TrueElement;
import de.gwdg.metadataqa.api.configuration.schema.Rule;
import de.gwdg.metadataqa.api.json.DataElement;
import de.gwdg.metadataqa.api.schema.BaseSchema;
import de.gwdg.metadataqa.api.schema.Format;

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
		
		XmlNavigation r = (XmlNavigation) fieldNodes[0].getIncoming().get(0);
		fieldPath = r.getXmlPathParam().generateXQuery();
		if (rule != null)
			fieldPaths = rule.getAllFields();
	}
	
	
	// public functions
	public String getStringRepresentation() throws InvalidityException {
		if (rule == null)
			return "ERROR";
		String result = "format XML\nfields:\n";
		
		EList<Pair<String, String>> fields = rule.getAllFields();
		
		for (Pair<String, String> fieldpair: fields) {
			result += "- field: " + fieldpair.name() +
					"\n  path: " + fieldpair.value() + "\n";
		}
		
		result += "- field: " + fieldNodes[0].getName() + "\n";
		result += "  path: " + fieldPath + "\n";
		result += "  rules:\n" + rule.getStringRepresentation();
		
		return result;
	}
	
	public Object getConstraintSchema() {
		if (rule == null)
			return null;
		BaseSchema schema = new BaseSchema();
		schema.setFormat(Format.XML);

		EList<Pair<String, String>> fields = rule.getAllFields();
		
		for (Pair<String, String> fieldpair: fields) {
			DataElement field = new DataElement("label", "path");
			schema.addField(field);
		}
		
		DataElement field1 = new DataElement(fieldNodes[0].getName(), fieldPath);
		
		Rule constraintrule = new Rule();
		field1.addRule(constraintrule);
		
		rule.addConstraintRuleTo(constraintrule);
		return schema;
	}
	
	// local functions
	
	private static ConstraintRuleObject transformCondition(Condition condition, ComplexNode recordNode, Node[] fieldNodes2) throws InvalidityException {
		
		Pair<Node, Boolean> pair = UniquenessConditionCheck.uniquenessConditionField (condition, recordNode);
		if (pair != null)
			return new UniqueRuleObject(pair.value());
		
		if (condition instanceof Formula) {
			Formula formula = (Formula) condition;
			ConstraintRuleObject arg1 = transformCondition(formula.getCondition1(), recordNode, fieldNodes2);
			ConstraintRuleObject arg2 = transformCondition(formula.getCondition2(), recordNode, fieldNodes2);
			FormulaConstraintRuleObject frule = new FormulaConstraintRuleObject(formula.getOperator(), arg1, arg2);
			return frule;
		} else if (condition instanceof NotCondition) {
			NotCondition notc = (NotCondition) condition;
			NotConstraintRuleObject frule = new NotConstraintRuleObject(transformCondition(notc.getCondition(), recordNode, fieldNodes2));
			return frule;
		} else if (condition instanceof QuantifiedCondition) {
			QuantifiedCondition qcond = (QuantifiedCondition) condition;
			ConstraintRuleObject rule = transformQuantifiedCondition(qcond, fieldNodes2);
			return rule;
		}
		throw new InvalidityException();
	}
	
	private static ConstraintRuleObject transformQuantifiedCondition(QuantifiedCondition condition, Node[] fieldNodes2) throws InvalidityException {
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
		if (graph.getNodes().size() == 1 && graph.getOperatorList().getOperators().size() == 1) {
			return transformSingleNodeGraph(graph, fieldNodes2);
		}
		else if (graph.getNodes().size() == 2 && graph.getOperatorList().getOperators().size() == 1) {
			return transformNodeComparisonGraph(graph, fieldNodes2);
		}
		else 
			return transformCombinationGraph(graph, fieldNodes2);
	}
	
	private static ConstraintRuleObject transformSingleNodeGraph (Graph graph, Node[] fieldNodes2) throws InvalidityException {
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
			rule = new PatternRuleObject( match.getRegularExpression().getValue(), match.getOption().getValue() );
			
		} else if (op instanceof Contains) {
//			contains
			Contains contains = (Contains) op;
			String containsAsRegex = ".*" + java.util.regex.Pattern.quote(contains.getContent().getValue()) + ".*";
			rule = new PatternRuleObject(containsAsRegex, contains.getOption().getValue());
			
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

	private static ConstraintRuleObject transformNodeComparisonGraph (Graph graph, Node[] fieldNodes2) throws InvalidityException {
		
		EList<Node> nodes = graph.getNodes();
		
		if (nodes.size() != 2)
			throw new InvalidityException();
		
		Node field = null;
		Node other = null;
		
		for (Node n: nodes) {
			Boolean contains = false;
			for (Node n2: fieldNodes2)
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

	private static ConstraintRuleObject transformCombinationGraph (Graph graph, Node[] fieldNodes2) throws InvalidityException {

		EList<Node> nodes = graph.getNodes();
		
		Node field = null;
		EList<Node> others = new BasicEList<Node>();
		
		for (Node n: nodes) {
			
			Boolean contains = false;
			for (Node n2: fieldNodes2)
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
		ConstraintRuleObject result = combineWithAnd(rules);
		return result;
	}

	static ConstraintRuleObject combineWithAnd (EList<ConstraintRuleObject> rules) throws InvalidityException {
		if (rules.size() == 1)
			return rules.get(0);
		else if (rules.size() > 1) {
			ConstraintRuleObject rule1 = rules.get(0);
			EList<ConstraintRuleObject> newrules = new BasicEList<ConstraintRuleObject>();
			for (int i = 1; i<rules.size(); i++)
				newrules.add(rules.get(i));
			ConstraintRuleObject argument2 = combineWithAnd(newrules);
			FormulaConstraintRuleObject and = new FormulaConstraintRuleObject(LogicalOperator.AND, rule1, argument2);
			return and;
		}
		else throw new InvalidityException();
	}
}

