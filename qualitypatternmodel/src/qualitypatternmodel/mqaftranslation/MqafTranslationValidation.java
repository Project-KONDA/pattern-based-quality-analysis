package qualitypatternmodel.mqaftranslation;

import org.basex.util.Pair;
import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;

public class MqafTranslationValidation {

	public static void checkPatternTranslatable (CompletePattern completePattern) throws InvalidityException {
		// check is valid and is XML
		if (!validatePatternXmlAdapted(completePattern)) {
			throw new InvalidityException ("Pattern not MQAF compatible: not xml concrete");
		}
		// check for JavaOperators
		if (!validateOperatorConfiguration(completePattern)) {
			throw new InvalidityException ("Pattern not MQAF compatible: Operator Configuration invalid");
		}
		// check has valid Node configuration
		if (!validateNodeConfiguration(completePattern)) {
			throw new InvalidityException ("Pattern not MQAF compatible: Node Configuration invalid");
		}
		// check has valid Edge configuration
		if (!validateEdgeConfiguration(completePattern)) {
			throw new InvalidityException ("Pattern not MQAF compatible: Edge Configuration invalid");
		}
	}


	static Boolean validateOperatorConfiguration(CompletePattern completePattern) throws InvalidityException {
		return !completePattern.containsJavaOperator();
	}


	static Boolean validatePatternXmlAdapted (CompletePattern completePattern) {
		try {
			if (completePattern.getLanguage() != Language.XML) {
				return false;
			}
			completePattern.isValid(AbstractionLevel.CONCRETE);
		} catch (Exception e) {
			return false;
		}
		return true;
	}


	static Boolean validateNodeConfiguration (CompletePattern completePattern) throws InvalidityException {
//		Graph graph = completePattern.getGraph();

		ComplexNode record;
		try{
			record = MqafFieldNodeIdentification.identifyRecordNode(completePattern);
		} catch (Exception e) {
			return false;
		}

		Condition cond = completePattern.getCondition();
		return validateNodeConfigurationCondition(cond, record);
	}


	static Boolean validateNodeConfigurationCondition (Condition condition, ComplexNode record) throws InvalidityException {

		Pair<Node, Boolean> pair = MqafUniquenessConditionCheck.uniquenessConditionField(condition, record);
		if (pair != null) {
			return true;
		}

		if (condition == null) {
			return true;

		} else if (condition instanceof NotCondition) {
			NotCondition not = (NotCondition) condition;
			return validateNodeConfigurationCondition( not.getCondition(), record);

		} else if (condition instanceof Formula) {
			Formula formula = (Formula) condition;

//			if (!( formula.getOperator().equals(LogicalOperator.AND) || formula.getOperator().equals(LogicalOperator.OR)))
//				return false;
			Boolean cond1 = validateNodeConfigurationCondition (formula.getCondition1(), record);
			Boolean cond2 = validateNodeConfigurationCondition (formula.getCondition2(), record);
			return cond1 && cond2;

		} else if (condition instanceof CountCondition) {
			CountCondition countcond = (CountCondition) condition;
			CountPattern countPattern = countcond.getCountPattern();
			if (validateNodeConfigurationGraph(countPattern.getGraph(), record)) {
				Condition following = countPattern.getCondition();
				if (following == null) {
					return true;
				}
			}
			return false;

		} else if (condition instanceof QuantifiedCondition) {
			QuantifiedCondition quantified = (QuantifiedCondition) condition;
			if (quantified.getQuantifier().equals(Quantifier.FORALL)) {
				return false;
			}

			if (validateNodeConfigurationGraph(quantified.getGraph(), record)) {
				return true;
			}

			Condition following = quantified.getCondition();
			if (following == null) {
				return true;
			}
		} else {
			throw new InvalidityException(condition.getClass().getName());
		}
		return false;
	}


	static Boolean validateEdgeConfiguration(PatternElement element) {
		if (element instanceof Pattern) {
			Pattern pattern = (Pattern) element;
			return validateEdgeConfiguration(pattern.getGraph()) && validateEdgeConfiguration(pattern.getCondition());
		} else if (element instanceof QuantifiedCondition) {
			QuantifiedCondition quantified = (QuantifiedCondition) element;
			return validateEdgeConfiguration(quantified.getCondition()) && validateEdgeConfiguration(quantified.getGraph());
		} else if (element instanceof Formula) {
			Formula formula = (Formula) element;
			return validateEdgeConfiguration(formula.getCondition1()) && validateEdgeConfiguration(formula.getCondition2());
		} else if (element instanceof NotCondition) {
			NotCondition not = (NotCondition) element;
			return validateEdgeConfiguration(not.getCondition());
		} else if (element instanceof CountCondition) {
			CountCondition count = (CountCondition) element;
			return validateEdgeConfiguration(count.getCountPattern()) && validateEdgeConfiguration(count.getArgument2());
		} else if (element == null || element instanceof NumberElement) {
			return true;
		} else if (element instanceof Graph) {
			Graph graph = (Graph) element;
			EList<Relation> relations = graph.getRelations();
			for (Relation r : relations) {
				if (!(r instanceof XmlNavigation)) {
					System.err.println("Relation is not XmlNavigation");
					return false;
				}	
				EList<XmlPathParam> alts = ((XmlNavigation) r).getXmlPathParam().getAlternatives();
				if (alts != null && !alts.isEmpty()) {
					System.err.println("Xml Navigation has Alternatives");
					return false;
				}
			}
			return true;
		} else
			return false;
	}


	static Boolean validateNodeConfigurationGraph (Graph graph, ComplexNode record) {
//		EList<Operator> ops = graph.getOperatorList().getOperators();

		// TODO

		return true;
	}
}
