package qualitypatternmodel.constrainttranslation;

import java.util.List;

import org.basex.util.Pair;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import de.gwdg.metadataqa.api.configuration.schema.Rule;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.patternstructure.LogicalOperator;

public abstract class ConstraintRuleObject {
	abstract String getStringRepresentation() throws InvalidityException;
	abstract void addConstraintRuleTo(Rule rule);
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
			return indent(result);
		}
		
		void addConstraintRuleTo (Rule rule) {
			Rule arg1 = new Rule();
			Rule arg2 = new Rule();
			argument1.addConstraintRuleTo(arg1);
			argument2.addConstraintRuleTo(arg2);
			
			switch(op) {
			case AND:
				rule.setAnd(new BasicEList<Rule>());
				rule.getAnd().add(arg1);
				rule.getAnd().add(arg2);
				return;
				
			case OR:
				rule.setOr(new BasicEList<Rule>());
				rule.getOr().add(arg1);
				rule.getOr().add(arg2);
				return;
			case IMPLIES:
				rule.setOr(new BasicEList<Rule>());
				rule.getOr().add(new Rule().withNot(getListWith(arg1)));
				rule.getOr().add(arg2);
				return;
			case XOR:
				Rule impliesand1 = new Rule();
				List<Rule> impliesand1list = new BasicEList<Rule>();
				Rule impliesnot1 = new Rule();
				impliesnot1.setNot(getListWith(arg1));
				impliesand1list.add(impliesnot1);
				impliesand1list.add(arg2);
				impliesand1.setAnd(impliesand1list);
				
				Rule impliesand2 = new Rule();
				List<Rule> impliesand2list = new BasicEList<Rule>();
				Rule impliesnot2 = new Rule();
				impliesnot2.setNot(getListWith(arg2));
				impliesand2list.add(arg1);
				impliesand2list.add(impliesnot2);
				impliesand2.setAnd(impliesand2list);
				
				List<Rule> xorlist = new BasicEList<Rule>();
				xorlist.add(new Rule().withNot(getListWith(arg1)));
				xorlist.add(arg2);
				rule.setOr(xorlist);	
				return;
			case EQUAL:
				Rule equaland1 = new Rule();
				List<Rule> equaland1list = new BasicEList<Rule>();
				equaland1list.add(arg1);
				equaland1list.add(arg2);
				equaland1.setAnd(equaland1list);
				
				Rule equaland2 = new Rule();
				List<Rule> equaland2list = new BasicEList<Rule>();
				Rule equalnot1 = new Rule();
				equalnot1.setNot(getListWith(arg1));
				Rule equalnot2 = new Rule();
				equalnot2.setNot(getListWith(arg2));
				equaland2list.add(equalnot1);
				equaland2list.add(equalnot2);
				equaland2.setAnd(equaland2list);
				
				List<Rule> equallist = new BasicEList<Rule>();
				equallist.add(new Rule().withNot(getListWith(arg1)));
				equallist.add(arg2);
				rule.setOr(equallist);	
				return;
			}
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
		
		void addConstraintRuleTo (Rule rule) {
			Rule notrule = new Rule();
			arg.addConstraintRuleTo(notrule);
			rule.setNot(getListWith(notrule));
		}
		
		EList<Pair<String, String>> getAllFields() {
			return arg.getAllFields();
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
		String value;
		
		public HasValueRuleObject(String val, ComparisonOperator co) {
			value = val;
			operator = co;
		}
		
		String getStringRepresentation() {
			String res = "- hasValue \"" + value + "\"";
			if (operator == ComparisonOperator.NOTEQUAL)
				res = "- not\n" + indent(res);
			return indent(res);
		}
		
		void addConstraintRuleTo (Rule rule) {
			if (operator == ComparisonOperator.NOTEQUAL) {
				rule.setNot(getListWith(new Rule().withHasValue(value)));
			}
			else 
				rule.setHasValue(value);
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
				result = "-and\n  - minInclusive " + number + "\n  - maxInclusive " + number;
				break;
			case GREATER: 
				result = "minExclusive " + number;
				break;
			case LESS: 
				result = "maxExclusive " + number;
				break;
			case GREATEROREQUAL: 
				result = "minInclusive " + number;
				break;
			case LESSOREQUAL: 
				result = "maxInclusive " + number;
				break;
			case NOTEQUAL: 
				result = "-and\n  - minExclusive " + number + "\n  - maxExclusive " + number;
				break;
			}
			return indent(result);
		}
		
		void addConstraintRuleTo (Rule rule) {
			switch(operator) {
			case EQUAL: 
				rule.setAnd(new BasicEList<Rule>());
				rule.getAnd().add(new Rule().withMinInclusive(number));
				rule.getAnd().add(new Rule().withMaxInclusive(number));
				return;
			case GREATER: 
				rule.setMinExclusive(number);
				return;
			case LESS: 
				rule.setMaxExclusive(number);
				return;
			case GREATEROREQUAL: 
				rule.setMinInclusive(number);
				return;
			case LESSOREQUAL: 
				rule.setMaxInclusive(number);
				return;
			case NOTEQUAL: 
				rule.setOr(new BasicEList<Rule>());
				rule.getOr().add(new Rule().withMinExclusive(number));
				rule.getOr().add(new Rule().withMaxExclusive(number));
				return;
			}
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
		
		void addConstraintRuleTo (Rule rule) {
			// TODO
			return;
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
		
		void addConstraintRuleTo (Rule rule) {
			if (negate) {
				rule.setNot(getListWith(new Rule().withPattern(regularExpression)));
			}
			else 
				rule.setPattern(regularExpression);
			return;
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
		
		void addConstraintRuleTo (Rule rule) {
			switch(operator) {
			case EQUAL:
				rule.setAnd(new BasicEList<Rule>());
				rule.getAnd().add(new Rule().withMinLength(length));
				rule.getAnd().add(new Rule().withMaxLength(length));
				return;
			case GREATER: 
				rule.setMinLength(length+1);
				return;
			case LESS: 
				rule.setMaxLength(length-1);
				return;
			case GREATEROREQUAL: 
				rule.setMinLength(length);
				return;
			case LESSOREQUAL: 
				rule.setMaxLength(length);
				return;
			case NOTEQUAL:
				rule.setOr(new BasicEList<Rule>());
				rule.getOr().add(new Rule().withMinLength(length-1));
				rule.getOr().add(new Rule().withMaxLength(length+1));
				return;
			}
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
		
		void addConstraintRuleTo (Rule rule) {
			switch(operator) {
			case EQUAL:
				rule.setEquals(nodename);
				return;
			case GREATER:
				rule.setNot(getListWith(new Rule().withLessThanOrEquals(nodename)));
				return;
			case LESSOREQUAL:
				rule.withLessThanOrEquals(nodename);
				return;
			case GREATEROREQUAL:
				rule.setNot(getListWith(new Rule().withLessThan(nodename)));
				return;
			case LESS:
				rule.withLessThan(nodename);
				return;
			case NOTEQUAL:
				rule.withDisjoint(nodename);
				return;
			}
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
		
		void addConstraintRuleTo (Rule rule) {
			rule.setUnique(negate);
		}
		
		Boolean invert() {
			negate = !negate;
			return true;
		}
	}
}
