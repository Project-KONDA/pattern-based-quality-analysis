package qualitypatternmodel.constrainttranslation;

import org.basex.util.Pair;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.patternstructure.LogicalOperator;

public abstract class ConstraintRuleObject {
	abstract String getStringRepresentation() throws InvalidityException;
	abstract Object getSchemaRepresentation();
	abstract EList<Pair<String, String>> getAllFields();
	abstract Boolean invert();
	
	@Override
	public String toString() {
		try {
			return getStringRepresentation();
		} catch (InvalidityException e) {
			return getClass().getSimpleName();
		}
	}

	private static String indent(String s) {
		return "  " + s.replace("\n", "\n  ");
	}

	
	public ConstraintRuleObject realInvert() {
		if (this.invert())
			return this;
		else {
			if (this instanceof NotConstraintRuleObject) {
				return ((NotConstraintRuleObject) this).arg;
			}
			else
				return new NotConstraintRuleObject(this);
		}
	}
	
	private static List<Rule> getListWith(Rule rule){
		List<Rule> list = new BasicEList<Rule>();
		list.add(rule);
		return list;
	}
	
	
	// TRANSLATION CLASSES 
	
	public static class FormulaConstraintRuleObject extends ConstraintRuleObject {
		public LogicalOperator op;
		public ConstraintRuleObject argument1;
		public ConstraintRuleObject argument2;
		
		FormulaConstraintRuleObject(LogicalOperator o, ConstraintRuleObject arg1, ConstraintRuleObject arg2) throws InvalidityException {
			if (arg1 == null)
				throw new InvalidityException();
			if (arg2 == null)
				throw new InvalidityException();
			op = o;
			argument1 = arg1;
			argument2 = arg2;
		}
		
		String getStringRepresentation() throws InvalidityException {
			String arg1 = "", arg2 = "";
			if (argument1 != null)
				arg1 = argument1.getStringRepresentation();
			if (argument2 != null)
				arg2 = argument2.getStringRepresentation();
			
			String result = "";
			switch(op) {
			case AND:
				result = "- and\n" + arg1 + "\n" + arg2;
				break;
			case OR:
				result = "- or\n" + arg1 + "\n" + arg2;
				break;
			case IMPLIES:
				result = "- or\n" + arg1 + "\n" + indent("- not\n" + arg2);
				break;
			case XOR:
				String s1 = "- and\n" + arg1 + "\n" + indent("- not\n" + arg2);
				String s2 = "- and\n"+ indent("- not\n" + arg1) + "\n" + arg2;
				result = "- or\n" + s1 + "\n" + s2;
				break;
			case EQUAL:
				String s3 = "- and\n" + arg1 + "\n" + arg2;
				String s4 = "- and\n"+ indent("- not\n" + arg2) + "\n" + indent("- not\n" + arg2);
				result = "- or\n" + s3 + "\n" + s4;
				break;
			}
//			String result = "";
//			for (ConstraintRuleObject arg: args)
//				result += indent(arg.getStringRepresentation()) + "\n";
//			result = "- " + op.getLiteral() + "\n" + result;
			return indent(result);
		}
		
		EList<Pair<String, String>> getAllFields() {
			EList<Pair<String, String>> fields = new BasicEList<Pair<String, String>>();

			EList<Pair<String, String>> list = argument1.getAllFields();
			if (list != null)
				fields.addAll(list);
			list = argument2.getAllFields();
			if (list != null)
				fields.addAll(list);
			return fields;
		}
		
		Object getSchemaRepresentation() {
			// TODO
			return null;
		}
		
		Boolean invert() {
			switch(op) {
			case AND:
				argument1 = argument1.realInvert();
				argument2 = argument2.realInvert();
				op = LogicalOperator.OR;
				return true;
				
			case OR:
				argument1 = argument1.realInvert();
				argument2 = argument2.realInvert();
				op = LogicalOperator.AND;
				return true;
			case IMPLIES:
				argument2 = argument2.realInvert();
				op = LogicalOperator.AND;
				return true;
			case XOR:
				op = LogicalOperator.EQUAL;
				return true;
			case EQUAL:
				op = LogicalOperator.XOR;
				return true;
			}
			return false;
		}
		
	}
	
	public static class NotConstraintRuleObject extends ConstraintRuleObject {
		public ConstraintRuleObject arg;
		
		NotConstraintRuleObject (ConstraintRuleObject a){
			arg = a;
		}
		
		String getStringRepresentation() throws InvalidityException {
			if (arg.invert()) {
				String result = arg.getStringRepresentation();
				arg.invert();
				return result;
			}
			return indent("- not\n" + arg.getStringRepresentation()); 
		}
		
		EList<Pair<String, String>> getAllFields() {
			return arg.getAllFields();
		}
		
		Object getSchemaRepresentation() {
			// TODO
			return null;
		}
		
		Boolean invert() {
			return false;
		}
	}
	
	public static abstract class SingleConstraintRuleObject extends ConstraintRuleObject {
		EList<Pair<String, String>> getAllFields() {
			return new BasicEList<Pair<String, String>>();
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
				res = "- not\n" + indent(res);
			return indent(res);
		}
		
		Object getSchemaRepresentation() {
			// TODO
			return null;
		}
		
		Boolean invert() {
			operator = ComparisonOperator.invert(operator);
			return true;
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
			String result = "";
			switch(operator) {
			case EQUAL: 
				result = "-or\n  - minExclusive " + number + "\n  - maxExclusive " + number;
				break;
			case GREATER: 
				result = "maxInclusive " + number;
				break;
			case LESS: 
				result = "minInclusive " + number;
				break;
			case GREATEROREQUAL: 
				result = "minExclusive " + number;
				break;
			case LESSOREQUAL: 
				result = "maxExclusive " + number;
				break;
			case NOTEQUAL: 
				result = "-and\n  - minInclusive " + number + "\n  - maxInclusive " + number;
				break;
			}
			return indent(result);
		}
		
		Object getSchemaRepresentation() {
			// TODO
			return null;
		}
		
		Boolean invert() {
			operator = ComparisonOperator.invert(operator);
			return true;
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
			return indent("");
		}
		
		Object getSchemaRepresentation() {
			// TODO
			return null;
		}
		
		Boolean invert() {
			negate = !negate;
			return true;
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
				result = "- not\n" + indent(result);
			return indent(result);
		}
		
		Object getSchemaRepresentation() {
			// TODO
			return null;
		}
		
		Boolean invert() {
			negate = !negate;
			return true;
		}
	}
	
	public static class StringLengthRuleObject extends SingleConstraintRuleObject {
		Integer length; 
		ComparisonOperator operator;
		
		public StringLengthRuleObject(Double num, ComparisonOperator co) {
			length = (int) (num + 0.5);
			operator = co;
		}
		
		String getStringRepresentation() throws InvalidityException {
			switch(operator) {
				case EQUAL:{
					String result = "- minLength " + length;
					result += "\n- maxLength " + length;
					return indent("- and\n" + indent(result));
				}
				case GREATER:
					return indent("- minLength " + (length + 1));
				case LESS: 
					return indent("- maxLength " + (length - 1));
				case GREATEROREQUAL: 
					return indent("- minLength " + length);
				case LESSOREQUAL: 
					return indent("- maxLength " + length);
				case NOTEQUAL: {
					String result = "- minLength " + (length-1);
					result += "\n- maxLength " + (length+1);
					return indent("-or\n" + indent(result));
				}
			}
			throw new InvalidityException("no valid ComparisonOperator for StringLength Constraint");
		}
		
		Object getSchemaRepresentation() {
			// TODO
			return null;
		}
		
		Boolean invert() {
			operator = ComparisonOperator.invert(operator);
			return true;
		}
	}
	
	public static class ComparisonRuleObject extends SingleConstraintRuleObject {
		Node node;
		String nodename;
		String nodepath;
		ComparisonOperator operator;
		
		public ComparisonRuleObject (Node n, ComparisonOperator co) throws InvalidityException {
			node = n;
			operator = co;
			nodename = node.getName().replace(" ", "_");
			nodepath = ((XmlNavigation) node.getIncoming().get(0)).getXmlPathParam().generateXQuery();
		}
		
		String getStringRepresentation() {
			String result = "- ";
			switch(operator) {
			case EQUAL:
				result += "equals";
				break;
			case GREATER:
				result += "not\n  - ";
			case LESSOREQUAL:
				result += "lessThanOrEquals";
				break;
			case GREATEROREQUAL:
				result += "not\n  - ";
			case LESS:
				result += "lessThan";
				break;
			case NOTEQUAL:
				result += "disjoint";
				break;
			}
			
			result += " " + nodename;
			return indent(result);
		}
		
		EList<Pair<String, String>> getAllFields() {
			EList<Pair<String, String>> fields = new BasicEList<Pair<String, String>>();
			fields.add(new Pair<String, String>(nodename, nodepath));
			return fields;
		}
		
		Object getSchemaRepresentation() {
			// TODO
			return null;
		}
		
		Boolean invert() {
			operator = ComparisonOperator.invert(operator);
			return true;
		}
	}
	
	public static class UniqueRuleObject extends SingleConstraintRuleObject {
		Boolean negate = true;
		public UniqueRuleObject(Boolean u) {
			negate = u;
		}
		
		String getStringRepresentation() {
			return indent("- unique " + negate);
		}
		
		Object getSchemaRepresentation() {
			// TODO
			return null;
		}
		
		Boolean invert() {
			negate = !negate;
			return true;
		}
	}
}
