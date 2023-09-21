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


	private static String indent(String s) {
		return "  " + s.replace("\n", "\n  ");
	}
	
	
	// TRANSLATION CLASSES 
	
	public static class FormulaConstraintRuleObject extends ConstraintRuleObject {
		public LogicalOperator op;
		public EList<ConstraintRuleObject> args;
		
		FormulaConstraintRuleObject(LogicalOperator o){
			op = o;
			args = new BasicEList<ConstraintRuleObject>();
		}
		String getStringRepresentation() throws InvalidityException {
			if (args.size() != 2)
				throw new InvalidityException();
			
			String arg1 = args.get(0).getStringRepresentation();
			String arg2 = args.get(1).getStringRepresentation();
			
			String result = "";
			switch(op) {
			case AND:
				result = "- and\n" + indent(arg1) + "\n" + indent(arg2);
				break;
			case OR:
				result = "- or\n" + indent(arg1) + "\n" + indent(arg2);
				break;
			case IMPLIES:
				result = "- or\n" + indent(arg1) + "\n  - not\n" + indent(indent(arg2));
				break;
			case XOR:
				String s1 = "- and\n" + indent(arg1) + "\n  - not\n" + indent(indent(arg2));
				String s2 = "- and\n  - not\n" + indent(indent(arg1)) + "\n" + indent(arg2);
				result = "- or\n" + indent(s1) + "\n" + indent(s2);
				break;
			case EQUAL:
				String s3 = "- and\n" + indent(arg1) + "\n" + indent(arg2);
				String s4 = "- and\n  - not\n" + indent(indent(arg2)) + "\n  - not\n" + indent(indent(arg2));
				result = "- or\n" + indent(s3) + "\n" + indent(s4);
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
			for (ConstraintRuleObject arg: args) {
				EList<Pair<String, String>> list = arg.getAllFields();
				if (list != null)
					fields.addAll(list);
			}
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
		String getStringRepresentation() throws InvalidityException {
			return indent("- not\n" + indent(arg.getStringRepresentation())); 
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
				result = "- not\n  " + indent(result);
			return indent(result);
		}
		Object getSchemaRepresentation() {
			// TODO
			return null;
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
					return indent("-and\n" + indent(result));
				}
				case GREATER:
					return indent("- maxLength " + (length + 1));
				case LESS: 
					return indent("- minLength " + (length + 1));
				case GREATEROREQUAL: 
					return indent("- maxLength " + length);
				case LESSOREQUAL: 
					return indent("- minLength " + length);
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
				result = "disjoint";
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
	}
	
	public static class CountRuleObject extends SingleConstraintRuleObject {
		String getStringRepresentation() {
			// TODO
			return indent("");
		}
		Object getSchemaRepresentation() {
			// TODO
			return null;
		}
	}
	
	public static class UniqueObject extends SingleConstraintRuleObject {
		String getStringRepresentation() {
			// TODO
			return indent("");
		}
		Object getSchemaRepresentation() {
			// TODO
			return null;
		}
	}
}
