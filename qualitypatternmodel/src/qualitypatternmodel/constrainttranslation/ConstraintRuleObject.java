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
		public LogicalOperator operator;
		public List<ConstraintRuleObject> arguments;

		private String getArgString(int index) throws InvalidityException {
			return arguments.get(index).getStringRepresentation();
		}
		private Rule getArgRule(int index) {
			Rule r = new Rule();
			arguments.get(index).addConstraintRuleTo(r);
			return r;
		}
		private List<Rule> getArgRuleList(){
			List<Rule> rulelist = new BasicEList<Rule>();
			for (int i = 0; i<arguments.size(); i++)
				rulelist.add(getArgRule(i));
			return rulelist;
		}
		
		FormulaConstraintRuleObject(LogicalOperator op, List<ConstraintRuleObject> args) throws InvalidityException {
			if (args.isEmpty() || args.size()<2 || args.contains(null))
				throw new InvalidityException();
			if (op != LogicalOperator.AND && op != LogicalOperator.OR && args.size() != 2)
				throw new InvalidityException();
			
			operator = op;
			arguments = args;
		}
		
		String getStringRepresentation() throws InvalidityException {
			assert (operator == LogicalOperator.AND || operator == LogicalOperator.OR || arguments.size() == 2);
			String result = "";
			switch(operator) {
			case AND:
				result = "- and";
				for (ConstraintRuleObject arg: arguments)
					result += "\n" + arg.getStringRepresentation();
				break;
			case OR:
				result = "- or";
				for (ConstraintRuleObject arg: arguments)
					result += "\n" + arg.getStringRepresentation();
				break;
			case IMPLIES:
				result = "- or\n" + getArgString(0) + "\n" + indent("- not\n" + getArgString(1));
				break;
			case XOR:
				String s1 = "- and\n" + getArgString(0) + "\n" + indent("- not\n" + getArgString(1));
				String s2 = "- and\n"+ indent("- not\n" + getArgString(0)) + "\n" + getArgString(1);
				result = "- or\n" + s1 + "\n" + s2;
				break;
			case EQUAL:
				String s3 = "- and\n" + getArgString(0) + "\n" + getArgString(1);
				String s4 = "- and\n"+ indent("- not\n" + getArgString(1)) + "\n" + indent("- not\n" + getArgString(1));
				result = "- or\n" + s3 + "\n" + s4;
				break;
			}
			return indent(result);
		}
		
		void addConstraintRuleTo (Rule rule) {
			assert (operator == LogicalOperator.AND || operator == LogicalOperator.OR || arguments.size() == 2);
			switch(operator) {
			case AND:
				rule.setAnd(getArgRuleList());
				return;
			case OR:
				rule.setOr(getArgRuleList());
				return;
			case IMPLIES:
				rule.setOr(new BasicEList<Rule>());
				rule.getOr().add(new Rule().withNot(getListWith(getArgRule(0))));
				rule.getOr().add(getArgRule(1));
				return;
			case XOR:
				Rule impliesand1 = new Rule();
				impliesand1.setAnd(new BasicEList<Rule>());
				impliesand1.getAnd().add(getArgRule(0));
				impliesand1.getAnd().add(new Rule().withNot(getListWith(getArgRule(1))));
				
				Rule impliesand2 = new Rule();
				impliesand2.setAnd(new BasicEList<Rule>());
				impliesand2.getAnd().add(new Rule().withNot(getListWith(getArgRule(0))));
				impliesand2.getAnd().add(getArgRule(1));

				rule.setOr(new BasicEList<Rule>());
				rule.getOr().add(impliesand1);
				rule.getOr().add(impliesand2);
				
				return;
			case EQUAL:
				Rule equaland1 = new Rule();
				equaland1.setAnd(new BasicEList<Rule>());
				equaland1.getAnd().add(getArgRule(0));
				equaland1.getAnd().add(getArgRule(1));
				
				Rule equaland2 = new Rule();
				equaland2.setAnd(new BasicEList<Rule>());
				equaland2.getAnd().add(new Rule().withNot(getListWith(getArgRule(0))));
				equaland2.getAnd().add(new Rule().withNot(getListWith(getArgRule(1))));

				rule.setOr(new BasicEList<Rule>());
				rule.getOr().add(equaland1);
				rule.getOr().add(equaland2);
				
				return;
			}
		}
		
		EList<Pair<String, String>> getAllFields() {
			EList<Pair<String, String>> fields = new BasicEList<Pair<String, String>>();
			for (ConstraintRuleObject arg: arguments) {
				EList<Pair<String, String>> list = arg.getAllFields();
				if (list != null)
					fields.addAll(list);
			}
			return fields;
		}
		
		Boolean invert() {
			switch(operator) {
			case AND:
			case OR:
				if (arguments.size() != 2)
					return false;
				arguments.set(0, arguments.get(0).realInvert());
				arguments.set(1, arguments.get(1).realInvert());
				operator = (operator == LogicalOperator.AND) ? LogicalOperator.OR : LogicalOperator.AND;
				return true;
			case IMPLIES:
				arguments.set(1, arguments.get(1).realInvert());
				operator = LogicalOperator.AND;
				return true;
			case XOR:
				operator = LogicalOperator.EQUAL;
				return true;
			case EQUAL:
				operator = LogicalOperator.XOR;
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
				result = "- and\n  - minInclusive " + number + "\n  - maxInclusive " + number;
				break;
			case GREATER: 
				result = "- minExclusive " + number;
				break;
			case LESS: 
				result = "- maxExclusive " + number;
				break;
			case GREATEROREQUAL: 
				result = "- minInclusive " + number;
				break;
			case LESSOREQUAL: 
				result = "- maxInclusive " + number;
				break;
			case NOTEQUAL: 
				result = "- or\n  - minExclusive " + number + "\n  - maxExclusive " + number;
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
			negate = b;
		}
		
		String getStringRepresentation() {
			String listing = "";
			if(values.size() > 0) {
				listing += values.get(0);
				for (int i = 1; i<values.size(); i++)
					listing += ", " + values.get(i);
			}
			String result = "- in: ["; 
			result = result + listing + "]";
			if (negate)
				result = "- not\n" + indent(result);
			return indent(result);
		}
		
		void addConstraintRuleTo (Rule rule) {
			if (negate)
				rule.setNot(getListWith(new Rule().withIn(values)));
			else
				rule.setIn(values);
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
					return indent("- or\n" + indent(result));
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
