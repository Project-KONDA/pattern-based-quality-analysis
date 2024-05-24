package qualitypatternmodel.constrainttranslation;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionxml.XmlAxisPart;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
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
			record = FieldNodeIdentification.identifyRecordNode(completePattern);
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
	
	public static String PATH_PRAEFIX = "/child::*";
	public static String getRelationPathTo(Node node) throws InvalidityException {
		if (node.getIncoming().isEmpty())
			throw new InvalidityException("no incomming relation");
		if (! (node.getIncoming().get(0) instanceof XmlNavigation))
			throw new InvalidityException("no valid relation");
		XmlNavigation relation = (XmlNavigation) node.getIncoming().get(0);
		String path = "";
		XmlPathParam pathparam = relation.getXmlPathParam();
		XmlPropertyOptionParam param = pathparam.getXmlPropertyOptionParam();
		if (param != null) {
			String generated = pathparam.getXmlPropertyOptionParam().generateXQuery();
			if (!generated.equals("/text()"))
				throw new InvalidityException("fieldnode cannot be translated to constraint due to limitations to only support values between xml-tags.");
		}
		if (pathparam.getXmlAxisParts() != null) {
			for (XmlAxisPart xmlAxisPart : pathparam.getXmlAxisParts()) {
				path += xmlAxisPart.generateXQuery();
			}
		}
		return PATH_PRAEFIX + path;
	}
}
