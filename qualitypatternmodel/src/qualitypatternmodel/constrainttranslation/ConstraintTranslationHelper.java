package qualitypatternmodel.constrainttranslation;

import java.util.ArrayList;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlRoot;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.Contains;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.operators.NullCheck;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.operators.StringLength;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;
//import de.gwdg.metadataqa.api.configuration.schema.Rule;
//import de.gwdg.metadataqa.api.json.DataElement;
//import de.gwdg.metadataqa.api.schema.BaseSchema;
//import de.gwdg.metadataqa.api.schema.Format;

public class ConstraintTranslationHelper {
	
	static Boolean checkPatternTranslatable (CompletePattern completePattern) {
		// check is valid and is XML
		Boolean xmlvalid = validatePatternXmlAdapted (completePattern);
		
		// check has valid Node configuration
		Boolean nodesValid = false;
		if (xmlvalid)
			nodesValid = validateNodeConfiguration (completePattern);
		
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
			record = FieldNodeIdentification.identifyRecordNode(FieldNodeIdentification.splitNodes(completePattern));
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
		
		// TODO
		
		return true;
	}
	
	static Node identifyFieldNodeInGraph (Graph graph, ComplexNode record) {
		EList<Node> nodes = graph.getNodes();
		if (nodes.size() == 1)
			return nodes.get(0);
		else {
			
			
		}
		return null;
	}
	
	
	
	
	
	
	

//	static Boolean isValidConstraint (Graph graph, Node node) {
//		throw new UnsupportedOperationException();
//	}
//
//	static Boolean checkIsCardinality (Graph graph) {
//		throw new UnsupportedOperationException();
//	}
//
//	static Boolean checkIsValueRange (Graph graph) {
//		throw new UnsupportedOperationException();
//	}
//
//	static Boolean checkIsValueComparison (Graph graph) {
//		throw new UnsupportedOperationException();
//	}
//
//	static Boolean checkIsListComparison (Graph graph) {
//		throw new UnsupportedOperationException();
//	}
//
//	static Boolean checkIsRegularExpressionMatching (Graph graph) {
//		throw new UnsupportedOperationException();
//	}
//	
//	static Boolean checkIsStringLength (Graph graph) {
//		throw new UnsupportedOperationException();
//	}
//
//	static Boolean checkIsPropertyComparison (Graph graph) {
//		throw new UnsupportedOperationException();
//	}
//	
//	static Boolean checkIsUnique (CompletePattern completePattern) {
//		throw new UnsupportedOperationException();
//	}
	
	

	/*
	 * Basic Schema  
	 */
//	static BaseSchema getBaseSchema() {
//		BaseSchema schema = new BaseSchema();
//		schema.setFormat(Format.XML);
//		DataElement field1 = new DataElement("label", "path");
//		schema.addField(field1);
//		Rule rule = new Rule();
//		field1.addRule(rule);
//		
//		// ADD RULES HERE
////		rule.withMinCount(4);
//		
//		return schema;
//	}
	
}
