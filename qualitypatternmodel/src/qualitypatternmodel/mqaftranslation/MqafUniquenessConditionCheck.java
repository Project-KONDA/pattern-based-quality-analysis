 package qualitypatternmodel.mqaftranslation;

import org.basex.util.Pair;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Comparable;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;
import qualitypatternmodel.patternstructure.TrueElement;

public class MqafUniquenessConditionCheck {

	public static Pair<Node, Boolean> uniquenessConditionField(CompletePattern pattern) throws InvalidityException {
		ComplexNode recordNode = MqafFieldNodeIdentification.identifyRecordNode(pattern);
		return uniquenessConditionField(pattern.getCondition(), recordNode);
	}

	public static Pair<Node, Boolean> uniquenessConditionField (PatternElement element, ComplexNode recordNode) {
		Pair<Node, Boolean> n = null;
		if (element instanceof QuantifiedCondition || element instanceof NotCondition) {
			n = isUniquenessExistsCondition( (Condition) element, recordNode);
		}
		else if (element instanceof CountCondition) {
			n = isUniquenessCountCondition((CountCondition) element, recordNode);
		}
		return n;
	}


	static Pair<Node, Boolean> isUniquenessExistsCondition (Condition element, ComplexNode recordNode) {
		if (element instanceof NotCondition) {
			NotCondition not = (NotCondition) element;
			Pair<Node, Boolean> result = isUniquenessExistsCondition(not.getCondition(), recordNode);
			if (result == null) {
				return null;
			} else {
				return new Pair<Node, Boolean> (result.name(), !result.value());
			}
		}
		else if (element instanceof QuantifiedCondition) {
			QuantifiedCondition condition = (QuantifiedCondition) element;
			if (condition.getQuantifier() != Quantifier.EXISTS) {
				return null;
			}

			Condition next = condition.getCondition();
			if (next instanceof QuantifiedCondition) {
				return isUniquenessExists2Condition(element, recordNode);
			}
			if (next != null && !(next instanceof TrueElement)) {
				return null;
			}


			// validate record node copy
			ComplexNode recordCopy = identifyRecordCopy(condition.getGraph().getNodes(), recordNode);
			if (recordCopy == null) {
				return null;
			}
			EList<BooleanOperator> ops = recordCopy.getPredicates();
			if (ops.size() != 1 || !(ops.get(0) instanceof Comparison)) {
				return null;
			}
			Comparison c = (Comparison) ops.get(0);
			if (c.getOption().getValue() != ComparisonOperator.NOTEQUAL) {
				return null;
			}
			EList<Comparable> comparisonarguments = c.getArguments();
			comparisonarguments.remove(recordCopy);
			if (!(comparisonarguments.get(0)).equals(recordNode)) {
				return null;
			}

			EList<Node> othernodes = new BasicEList<Node>();
			for (Node n:condition.getGraph().getNodes()) {
				if (!(MqafFieldNodeIdentification.areEqualNodes(n, recordNode))) {
					othernodes.add(n);
				}
			}

			if (othernodes.size() == 1) {
				Node field = othernodes.get(0);
				if ((field.getIncoming().size() != 2) || recordNode.getRelationsTo(field).size() != 1 || recordCopy.getRelationsTo(field).size() != 1) {
					return null;
				}
				return new Pair<Node, Boolean> (field, false);
			}

			if (othernodes.size() == 2) {
				Node field1 = (recordNode.getRelationsTo(othernodes.get(0)).size() == 1)? othernodes.get(0) : (recordNode.getRelationsTo(othernodes.get(1)).size() == 1)? othernodes.get(1) : null;
				Node field2 = (recordCopy.getRelationsTo(othernodes.get(0)).size() == 1)? othernodes.get(0) : (recordCopy.getRelationsTo(othernodes.get(1)).size() == 1)? othernodes.get(1) : null;

				if (field1 == null || field2 == null || field1 == field2) {
					return null;
				}

				EList<BooleanOperator> ops2 = field1.getPredicates();
				if (ops2.size() != 1 || !(ops2.get(0) instanceof Comparison)) {
					return null;
				}
				Comparison c2 = (Comparison) ops2.get(0);
				if (c2.getOption().getValue() != ComparisonOperator.EQUAL) {
					return null;
				}
				EList<Comparable> comparison2arguments = c2.getArguments();
				comparison2arguments.remove(field1);
				if (!(comparison2arguments.get(0) == field2)) {
					return null;
				}

				return new Pair<Node, Boolean> (field1, false);
			}
		}
		return null;
	}

	static Pair<Node, Boolean> isUniquenessExists2Condition (PatternElement condition, ComplexNode recordNode) {
		QuantifiedCondition next;
		Graph conditiongraph;

		if (condition instanceof QuantifiedCondition) {
			next = (QuantifiedCondition) ((QuantifiedCondition) condition).getCondition();
			conditiongraph = ((QuantifiedCondition) condition).getGraph();
		} else if (condition instanceof CountPattern) {
			Condition nextCondition = ((CountPattern) condition).getCondition();
			if (!(nextCondition instanceof QuantifiedCondition)) {
				return null;
			}
			next = (QuantifiedCondition) nextCondition;
			conditiongraph = ((CountPattern) condition).getGraph();
		} else {
			return null;
		}

		// validate record node copy
		ComplexNode recordCopy = identifyRecordCopy(conditiongraph.getNodes(), recordNode);
		if (recordCopy == null) {
			return null;
		}

		if (condition instanceof QuantifiedCondition) {
			EList<BooleanOperator> ops = recordCopy.getPredicates();
			if (ops.size() != 1 || !(ops.get(0) instanceof Comparison)) {
				return null;
			}
			Comparison c = (Comparison) ops.get(0);
			if (c.getOption().getValue() != ComparisonOperator.NOTEQUAL) {
				return null;
			}
			EList<Comparable> comparisonarguments = c.getArguments();
			comparisonarguments.remove(recordCopy);
			if (!(comparisonarguments.get(0)).equals(recordNode)) {
				return null;
			}

		}

		for (Node n: conditiongraph.getNodes()) {
			if (!(MqafFieldNodeIdentification.areEqualNodes(n, recordNode))) {
				return null;
			}
		}

		EList<Node> nextnodes = next.getGraph().getNodes();

		if (nextnodes.size() == 1) {
			Node field = nextnodes.get(0);
			if ((field.getIncoming().size() != 2) || recordNode.getRelationsTo(field).size() != 1 || recordCopy.getRelationsTo(field).size() != 1) {
				return null;
			}
			return new Pair<Node, Boolean> (field, false);
		}

		if (nextnodes.size() == 2) {
			Node field1 = (recordNode.getRelationsTo(nextnodes.get(0)).size() == 1)? nextnodes.get(0) : (recordNode.getRelationsTo(nextnodes.get(1)).size() == 1)? nextnodes.get(1) : null;
			Node field2 = (recordCopy.getRelationsTo(nextnodes.get(0)).size() == 1)? nextnodes.get(0) : (recordCopy.getRelationsTo(nextnodes.get(1)).size() == 1)? nextnodes.get(1) : null;

			if (field1 == null || field2 == null) {
				return null;
			}

			EList<BooleanOperator> ops2 = field1.getPredicates();
			if (ops2.size() != 1 || !(ops2.get(0) instanceof Comparison)) {
				return null;
			}
			Comparison c2 = (Comparison) ops2.get(0);
			if (c2.getOption().getValue() != ComparisonOperator.EQUAL) {
				return null;
			}
			EList<Comparable> comparison2arguments = c2.getArguments();
			comparison2arguments.remove(field1);
			if (!(comparison2arguments.get(0)).equals(field2)) {
				return null;
			}

			return new Pair<Node, Boolean> (field1, false);
		}
		return null;
	}

	static Pair<Node, Boolean> isUniquenessCountCondition (CountCondition countcond, ComplexNode recordNode) {
		// not exists other record, that have the same value in a specific field
		//record |exists| record2 |exists| => field

		CountPattern countpattern = countcond.getCountPattern();

		countcond.getOption().getValue();

		if (!(countcond.getArgument2() instanceof NumberElement)) {
			return null;
		}

		Double number = ((NumberElement) countcond.getArgument2()).getNumberParam().getValue();
		ComparisonOperator operator = countcond.getOption().getValue();

		boolean negate = false;
		if (number == 1.) {
			if (operator == ComparisonOperator.NOTEQUAL || operator == ComparisonOperator.GREATER) {
				negate = false;
			} else if (operator == ComparisonOperator.EQUAL) {
				negate = true;
			}
		} else if (number == 2.) {
			if (operator == ComparisonOperator.GREATEROREQUAL) {
				negate = false;
			} else if (operator == ComparisonOperator.LESS) {
				negate = true;
			}
		} else {
			return null;
		}

		Pair<Node, Boolean> resultpair = isUniquenessExists2Condition(countpattern, recordNode);

		if (resultpair == null) {
			return null;
		}
		if (negate) {
			return new Pair<Node, Boolean> (resultpair.name(), !resultpair.value());
		} else {
			return resultpair;
		}

	}


	static ComplexNode identifyRecordCopy (EList<Node> nodes, ComplexNode recordNode) {
		EList<Node> records = new BasicEList<Node>();

		for (Node n: nodes) {
			if (MqafFieldNodeIdentification.areEqualNodes(n, recordNode)) {
				records.add(n);
			}
		}

		if (records.size() == 1 && records.get(0) instanceof ComplexNode) {
			return (ComplexNode) records.get(0);
		}

		return null;
	}



//	Node isUniquenessExists2Condition (QuantifiedCondition element, ComplexNode recordNode) {
//		// not exists other record, that have the same value in a specific field
//		//record |exists| record2 |exists| => field
//
//		if (!(element instanceof QuantifiedCondition))
//			return null;
//
//		Graph g = element.getGraph();
//		EList<Node> n = g.getNodes();
//		if (n.size() != 1 || !MqafFieldNodeIdentification.areEqualNodes(n.get(0), recordNode))
//			return null;
//
//		QuantifiedCondition quantified2 = (QuantifiedCondition) element.getCondition();
//		return isSubUniquenessQuantifiedCondition(quantified2, recordNode);
//	}
//
//	Node isUniquenessCountCondition (CountCondition countcondition, ComplexNode recordNode) {
//		// count records, that have the same value in a specific field
//
//		CountPattern countpattern = countcondition.getCountPattern();
//		Graph g = countpattern.getGraph();
//
//		NumberElement number;
//		if (countcondition.getArgument2() instanceof NumberElement) {
//			number = (NumberElement) countcondition.getArgument2();
//			Double num = number.getNumberParam().getValue();
//			ComparisonOperator cp = countcondition.getOption().getValue();
//
//
//		} else return null;
//
//		MqafFieldNodeIdentification.areEqualNodes(recordNode, recordNode);
//
//		return null;
//	}
//
//
//	Node isSubUniquenessQuantifiedCondition(QuantifiedCondition condition, ComplexNode recordNode) {
//		if (condition.getCondition() == null || condition.getCondition() instanceof TrueElement)
//			return null;
//		Graph g = condition.getGraph();
//		EList<Node> fieldnodes = new BasicEList<Node>();
//		EList<Node> recordnodes = new BasicEList<Node>();
//		recordnodes.add(recordNode);
//
//		if (fieldnodes.size() == 0 || fieldnodes.size() > 2)
//			return null;
//		if (!eachFieldHasXmlNavigationFrom(recordnodes,fieldnodes))
//			return null;
//		if (fieldnodes.size() == 2 && !MqafFieldNodeIdentification.areEqualNodes(fieldnodes.get(0), fieldnodes.get(1)))
//			return null;
//
//		for (Node field: fieldnodes)
//			if (!recordNode.getRelationsTo(field).isEmpty())
//				return field;
//
//		return null;
//
//	}
//
//	Boolean eachFieldHasXmlNavigationFrom(EList<Node> sources, EList<Node> targets) {
//		for (Node target: targets) {
//			Boolean hasNav = false;
//
//			for (Node source: sources)
//				hasNav = hasNav || !source.getRelationsTo(target).isEmpty();
//			if (!hasNav)
//				return false;
//		}
//		return true;
//	}
//
//	Boolean areAllEqual(EList<Node> nodes) {
//		for (Node n: nodes)
//			for (Node n2: nodes)
//				if (!(MqafFieldNodeIdentification.areEqualNodes(n, n2)))
//					return false;
//		return true;
//	}
}