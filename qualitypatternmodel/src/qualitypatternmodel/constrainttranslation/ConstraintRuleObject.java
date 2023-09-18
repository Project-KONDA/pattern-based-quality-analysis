package qualitypatternmodel.constrainttranslation;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.util.Pair;

import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.patternstructure.LogicalOperator;

public abstract class ConstraintRuleObject {
	abstract String getStringRepresentation();
	abstract Object getSchemaRepresentation();
	abstract EList<Pair<String, String>> getAllFields();


	private static String indent(String s) {
		return s.replace("\n", "  \n");
	}
	
	
	// TRANSLATION CLASSES 
	
	public static class FormulaConstraintRuleObject extends ConstraintRuleObject {
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
		
		Object getSchemaRepresentation() {
			// TODO
			return null;
		}
	}
	
	public static class NotConstraintRuleObject extends ConstraintRuleObject {
		public ConstraintRuleObject arg;
		
		NotConstraintRuleObject (ConstraintRuleObject a){
			arg = a;
		}
		String getStringRepresentation() {
			return "- not\n  " + indent(arg.getStringRepresentation()); 
		}
		
		EList<Pair<String, String>> getAllFields() {
			return arg.getAllFields();
		}
		
		Object getSchemaRepresentation() {
			// TODO
			return null;
		}
	}
	
	public static abstract class SingleConstraintRuleObject extends ConstraintRuleObject {
		EList<Pair<String, String>> getAllFields() {
			return null;
		}
	}
	
	public static class HasValueRuleObject extends SingleConstraintRuleObject {
		ComparisonOperator operator;
		Object value;
		
		public HasValueRuleObject(Object val, ComparisonOperator co) {
			value = val;
			operator = co;
		}
		String getStringRepresentation() {
			String res = "- hasValue \"" + value + "\"";
			if (operator == ComparisonOperator.NOTEQUAL)
				res = "- not\n  " + res;
			return res;
		}
		Object getSchemaRepresentation() {
			// TODO
			return null;
		}
	}
	
	public static class NumberComparisonRuleObject extends SingleConstraintRuleObject {
		Double number;
		ComparisonOperator operator;
		
		public NumberComparisonRuleObject(Double num, ComparisonOperator co) {
			number = num;
			operator = co;
		}
		
		String getStringRepresentation() {
			switch(operator) {
			case EQUAL: 
				return "-or\n  - minExclusive " + number + "\n  - maxExclusive " + number;
			case GREATER: 
				return "maxInclusive " + number;
			case LESS: 
				return "minInclusive " + number;
			case GREATEROREQUAL: 
				return "minExclusive " + number;
			case LESSOREQUAL: 
				return "maxExclusive " + number;
			case NOTEQUAL: 
				return "-and\n  - minInclusive " + number + "\n  - maxInclusive " + number;
		}
		return "";
		}
		Object getSchemaRepresentation() {
			// TODO
			return null;
		}
	}
	
	public static class ListComparisonRuleObject extends SingleConstraintRuleObject {
		EList<String> values;
		Boolean negate;
		public ListComparisonRuleObject(EList<String> vals, Boolean b) {
			values = vals;
			negate = !b;
		}
		String getStringRepresentation() {
			// TODO
			return null;
		}
		Object getSchemaRepresentation() {
			// TODO
			return null;
		}
	}
	
	public static class PatternRuleObject extends SingleConstraintRuleObject {
		String regularExpression;
		Boolean negate;
		public PatternRuleObject(String regex, Boolean neg) {
			regularExpression = regex;
			negate = neg;
		}
		String getStringRepresentation() {
			String result = "- pattern " + regularExpression;
			if (negate)
				result = "- not\n  " + result;
			return result;
		}
		Object getSchemaRepresentation() {
			// TODO
			return null;
		}
	}
	
	public static class StringLengthRuleObject extends SingleConstraintRuleObject {
		Double length; 
		Boolean negate;
		
		public StringLengthRuleObject(Double num, ComparisonOperator co) {
			length = num;
			negate = co == ComparisonOperator.NOTEQUAL;
		}
		
		String getStringRepresentation() {
			// TODO
			return null;
		}
		
		Object getSchemaRepresentation() {
			// TODO
			return null;
		}
	}
	
	public static class ComparisonRuleObject extends SingleConstraintRuleObject {
		String getStringRepresentation() {
			// TODO
			return null;
		}
		EList<Pair<String, String>> getAllFields() {
			return null;
		}
		Object getSchemaRepresentation() {
			// TODO
			return null;
		}
	}
	
	public static class CountRuleObject extends SingleConstraintRuleObject {
		String getStringRepresentation() {
			// TODO
			return null;
		}
		Object getSchemaRepresentation() {
			// TODO
			return null;
		}
	}
	
	public static class UniqueObject extends SingleConstraintRuleObject {
		String getStringRepresentation() {
			// TODO
			return null;
		}
		Object getSchemaRepresentation() {
			// TODO
			return null;
		}
	}
}
