package qualitypatternmodel.mqaftranslation;

import org.basex.util.Pair;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;
import qualitypatternmodel.patternstructure.TrueElement;
//import de.gwdg.metadataqa.api.configuration.schema.Rule;
//import de.gwdg.metadataqa.api.json.DataElement;
//import de.gwdg.metadataqa.api.schema.BaseSchema;
//import de.gwdg.metadataqa.api.schema.Format;

public class MqafTranslationValidation {
	
	public static Boolean checkPatternTranslatable (CompletePattern completePattern) throws InvalidityException {
		// check is valid and is XML
		Boolean xmlvalid = validatePatternXmlAdapted(completePattern);
		// check for JavaOperators
		if (!validateOperatorConfiguration(completePattern))
			return false;
		// check has valid Node configuration
		Boolean nodesValid = false;
		if (xmlvalid)
			nodesValid = validateNodeConfiguration(completePattern);
		
		return nodesValid;
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
		if (pair != null)
			return true;
		
		if (condition instanceof TrueElement || condition == null) {
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
				if (following instanceof TrueElement || following == null) {
					return true;
				}
			}
			return false;

		} else if (condition instanceof QuantifiedCondition) {
			QuantifiedCondition quantified = (QuantifiedCondition) condition;
			if (quantified.getQuantifier().equals(Quantifier.FORALL))
				return false;
			
			if (validateNodeConfigurationGraph(quantified.getGraph(), record))
				return true;

			Condition following = quantified.getCondition();
			if (following instanceof TrueElement || following == null) {
				return true;
			}
		}
		
		else throw new InvalidityException(condition.getClass().getName());
		return false;
	}
	
	
	static Boolean validateNodeConfigurationGraph (Graph graph, ComplexNode record) {
//		EList<Operator> ops = graph.getOperatorList().getOperators();
		
		// TODO
		
		return true;
	}
}
