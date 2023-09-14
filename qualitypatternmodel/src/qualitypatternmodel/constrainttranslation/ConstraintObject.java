package qualitypatternmodel.constrainttranslation;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.util.Pair;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class ConstraintObject {
	CompletePattern pattern = null;
	ComplexNode record = null;
	EList<Node> fieldNodes = new BasicEList<Node>();
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
			NotConstraintRuleObject frule = new NotConstraintRuleObject();
			frule.arg = transformCondition(notc.getCondition());
			return frule;
		} else if (condition instanceof QuantifiedCondition) {
			QuantifiedCondition qcond = (QuantifiedCondition) condition;
			ConstraintRuleObject rule = transformQuantifiedCondition(qcond);
			return rule;
		}
		throw new InvalidityException();
	}
	
	private static ConstraintRuleObject transformQuantifiedCondition(QuantifiedCondition condition) {
		return null;
	}
	
	
	
	
	
	// ConstraintRuleObject declaration
	
	private static abstract class ConstraintRuleObject {
		abstract String getStringRepresentation();
		abstract String getSchemaRepresentation();
		abstract EList<Pair<String, String>> getAllFields();
	}
	
	private static class FormulaConstraintRuleObject extends ConstraintRuleObject {
		public LogicalOperator op;
		public EList<ConstraintRuleObject> args;
		
		String getStringRepresentation() {
			String result = "";
			for (ConstraintRuleObject arg: args)
				result += arg.getStringRepresentation() + "\n";
			result = indent(result);
			result = "- " + op.getLiteral() + "\n  " + result;
			return result;
		}
		
		EList<Pair<String, String>> getAllFields() {
			EList<Pair<String, String>> fields = new BasicEList<Pair<String, String>>();
			for (ConstraintRuleObject arg: args)
				fields.addAll(arg.getAllFields());
			return fields;
		}
		String getSchemaRepresentation() {
			// TODO
			return null;
		}
	}
	
	private static class NotConstraintRuleObject extends ConstraintRuleObject {
		public ConstraintRuleObject arg;
		
		String getStringRepresentation() {
			return "- not\n  " + indent(arg.getStringRepresentation()); 
		}
		
		EList<Pair<String, String>> getAllFields() {
			return arg.getAllFields();
		}
		String getSchemaRepresentation() {
			// TODO
			return null;
		}
	}
	
	private static class SingleConstraintRuleObject extends ConstraintRuleObject {
		EList<Pair<String, String>> fieldsNamePath = new BasicEList<Pair<String, String>>();
		String constraint;
		
		String getStringRepresentation() {
			return constraint;
		}
		EList<Pair<String, String>> getAllFields() {
			EList<Pair<String, String>> fields = new BasicEList<Pair<String, String>>();
			fields.addAll(fieldsNamePath);
			return fields;
		}
		String getSchemaRepresentation() {
			// TODO
			return null;
		}
	}
	
	private static String indent(String s) {
		return s.replace("\n", "  \n");
	}
	
}

