package qualitypatternmodel.constrainttranslation;

import java.util.ArrayList;

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
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Comparable;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.operators.StringLength;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;
import qualitypatternmodel.patternstructure.TrueElement;

public class ConstraintObject {
	CompletePattern pattern;
	ComplexNode record;
	ArrayList<Node> fieldNodes;
	String fieldPath = "";
	
	ConstraintRuleObject rule = null;
	
	EList<String> rules = new BasicEList<String>();
	EList<String> fieldPaths = new BasicEList<String>();
	
	
	public ConstraintObject (CompletePattern completePattern) throws InvalidityException {
		
		if (!ConstraintTranslationValidation.checkPatternTranslatable (completePattern))
			throw new InvalidityException();
		
		pattern = completePattern;
		record = ConstraintTranslationHelper.identifyRecordNode(pattern);
		fieldNodes = ConstraintTranslationHelper.identifyFieldNodes(pattern);
		rule = transformCondition(completePattern.getCondition());
	}
	
	
	// public functions
	
	public Object getConstraintObject() {
		return rule.getSchemaRepresentation();
	}

	public String getStringRepresentation() {
		return "";
	}
	
	
	
	// local functions
	
	private static ConstraintRuleObject transformCondition(Condition condition) throws InvalidityException {
		if (condition instanceof Formula) {
			Formula formula = (Formula) condition;
			FormulaConstraintRuleObject frule = new FormulaConstraintRuleObject();
			frule.op = formula.getOperator();
			frule.args.add(transformCondition(formula.getCondition1()));
			frule.args.add(transformCondition(formula.getCondition2()));
			return frule;
		} else if (condition instanceof NotCondition) {
			NotCondition notc = (NotCondition) condition;
			NotConstraintRuleObject frule = new NotConstraintRuleObject(transformCondition(notc.getCondition()));
			return frule;
		} else if (condition instanceof QuantifiedCondition) {
			QuantifiedCondition qcond = (QuantifiedCondition) condition;
			ConstraintRuleObject rule = transformQuantifiedCondition(qcond);
			return rule;
		}
		throw new InvalidityException();
	}
	
	private static ConstraintRuleObject transformQuantifiedCondition(QuantifiedCondition condition) throws InvalidityException {
		if (!condition.getQuantifier().equals(Quantifier.EXISTS))
			throw new InvalidityException();
		if (condition.getCondition() != null && !(condition.getCondition() instanceof TrueElement))
			throw new InvalidityException();
		
		Graph graph = condition.getGraph(); 
		if (graph.getNodes().size() == 1 && graph.getOperatorList().getOperators().size() == 1) {
			return transformSingleNodeGraph(graph);
		}
		else if (graph.getNodes().size() == 2 && graph.getOperatorList().getOperators().size() == 1) {
			return transformNodeComparisonGraph(graph);
		}
		else 
			return transformCombinationGraph(graph);
	}
	
	private static ConstraintRuleObject transformSingleNodeGraph (Graph graph) throws InvalidityException {
		Node node = graph.getNodes().get(0);
		Operator op = graph.getOperatorList().getOperators().get(0);
		SingleConstraintRuleObject rule = null;
		
		if (op instanceof Comparison) {
			Comparison cf = (Comparison) op;
			ComparisonOperator co = cf.getOption().getValue();
			EList<Comparable> args = cf.getArguments();
			if (args.size() != 2)
				throw new InvalidityException();
			
			Boolean isRightDirection = args.get(0) == node;
			Comparable otherArg = (isRightDirection)? args.get(1) : args.get(0);
			co = (isRightDirection)? co: ComparisonOperator.invert(co);
			
			
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
			}
			
		} else if (op instanceof Match) {
//			"pattern" <regex>
//			"minWords", "maxWords"
			Match match = (Match) op;

			rule = new PatternRuleObject( match.getRegularExpression().getValue(), match.getOption().getValue() );
			// TODO
			
		} else if (op instanceof StringLength) {
//			"minLength" , "maxLength"
			StringLength len = (StringLength) op;
			
			ComparisonOperator co = len.getOption().getValue();
			if (co != ComparisonOperator.EQUAL && co != ComparisonOperator.NOTEQUAL)
				return null;
			Double num = len.getNumber().getValue();
			rule = new StringLengthRuleObject(num, co);
			// TODO
		}
		return rule;
	}
	

	private static ConstraintRuleObject transformNodeComparisonGraph (Graph graph) {
		
		
		return null;
	}

	private static ConstraintRuleObject transformCombinationGraph (Graph graph) {
		
		return null;
	}
}

