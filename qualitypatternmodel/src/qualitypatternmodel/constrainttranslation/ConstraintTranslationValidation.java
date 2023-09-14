package qualitypatternmodel.constrainttranslation;

import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;
import qualitypatternmodel.patternstructure.TrueElement;
//import de.gwdg.metadataqa.api.configuration.schema.Rule;
//import de.gwdg.metadataqa.api.json.DataElement;
//import de.gwdg.metadataqa.api.schema.BaseSchema;
//import de.gwdg.metadataqa.api.schema.Format;

public class ConstraintTranslationValidation {
	
	static Boolean checkPatternTranslatable (CompletePattern completePattern) {
		// check is valid and is XML
		Boolean xmlvalid = validatePatternXmlAdapted(completePattern);
		
		// check has valid Node configuration
		Boolean nodesValid = false;
		if (xmlvalid)
			nodesValid = validateNodeConfiguration(completePattern);
		
		return nodesValid;
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
	

	static Boolean validateNodeConfiguration (CompletePattern completePattern) {
//		Graph graph = completePattern.getGraph();
		
		ComplexNode record;
		try{
			record = ConstraintTranslationHelper.identifyRecordNode(ConstraintTranslationHelper.splitNodes(completePattern));
		} catch (Exception e) {
			return false;
		}
		
		// TODO
		
		Condition cond = completePattern.getCondition();
		return validateNodeConfigurationCondition(cond, record);
	}
	
	
	static Boolean validateNodeConfigurationCondition (Condition condition, ComplexNode record) {
		
		if (condition instanceof TrueElement || condition == null) {
			return true;
			
		} else if (condition instanceof NotCondition) {
			NotCondition not = (NotCondition) condition;
			return validateNodeConfigurationCondition( not.getCondition(), record);
			
		} else if (condition instanceof Formula) {
			Formula formula = (Formula) condition;

			if (!( formula.getOperator().equals(LogicalOperator.AND) || formula.getOperator().equals(LogicalOperator.OR)))
				return false;
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
		return false;
	}
	
	
	static Boolean validateNodeConfigurationGraph (Graph graph, ComplexNode record) {
//		EList<Operator> ops = graph.getOperatorList().getOperators();
		
		// TODO
		
		return true;
	}
}
