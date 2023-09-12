package qualitypatternmodel.patternstructure.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionxml.XmlRoot;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.Contains;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.operators.NullCheck;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;
import de.gwdg.metadataqa.api.configuration.schema.Rule;
import de.gwdg.metadataqa.api.json.DataElement;
import de.gwdg.metadataqa.api.schema.BaseSchema;
import de.gwdg.metadataqa.api.schema.Format;

public class ConstraintTranslationModule {
	
	public static void translateToConstraint(CompletePattern completePattern) throws InvalidityException {
		
		if(!checkPatternTranslatable(completePattern))
			throw new InvalidityException("Pattern incompatible");
		
		
		EList<EList<Node>> nodes = splitNodes(completePattern);
		EList<Operator> operators = extractOperatorsFromPattern(completePattern);
		
		
		ComplexNode record = identifyRecordNode(nodes);
		EList<Node> fieldsnodes = identifyFieldNodes (nodes, operators);
		
		
		// TODO
		
	}
	
	// CHECKS
	
	private static Boolean checkPatternTranslatable (CompletePattern completePattern) {
		// check is valid and is XML
		Boolean xmlvalid = validatePatternXmlAdapted(completePattern);
		
		// check has valid Node configuration
		Boolean nodesValid = false;
		if (xmlvalid)
			nodesValid = validateNodeConfiguration(completePattern);
		
		return nodesValid;
	}

	private static Boolean validatePatternXmlAdapted (CompletePattern completePattern) {
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
	

	private static Boolean validateNodeConfiguration (CompletePattern completePattern) {
		
		
		// TODO
		
		return false;
	}
	
	private static ComplexNode identifyRecordNode (EList<EList<Node>> nodeList) {
		assert(nodeList.size() == 2 );
		assert(nodeList.get(0).size() == 1);
		assert(nodeList.get(0).get(0) instanceof XmlRoot);
		assert(nodeList.get(1).size() == 1);
		assert(nodeList.get(1).get(0) instanceof ComplexNode);
		assert(nodeList.get(2).size() > 0);
		
		// TODO
		
		return (ComplexNode) nodeList.get(1).get(0);
		
	}

	private static EList<Node> identifyFieldNodes (EList<EList<Node>> nodeList, EList<Operator> operators) {
		// TODO
		return null;
	}
	
	
	/*
	 * Basic Schema  
	 */
//	private static BaseSchema getBaseSchema() {
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
	
	
	private static EList<EList<Node>> splitNodes(CompletePattern completePattern) {
		EList<EList<Node>> nodeList = new BasicEList<EList<Node>>();
		EList<Node> allNodes = new BasicEList<Node>();
		EList<Node> nodes1 = new BasicEList<Node>();
		EList<Node> nodes2 = new BasicEList<Node>();
		
		XmlRoot root = null; 
		for (Node n: completePattern.getGraph().getNodes())
			if (n instanceof XmlRoot) {
				root = (XmlRoot) n;
				allNodes.add(root);
				nodes1.add(root);
				break;
			}
		
		while (!nodes1.isEmpty()) {
			EList<Node> nextNodes = new BasicEList<Node>();
			nextNodes.addAll(nodes1);
			nodeList.add(nextNodes);
			
			for (Node n: nodes1) {
				if (n instanceof ComplexNode)
					for (Relation r: ((ComplexNode) n).getOutgoing()) {
						Node x = r.getTarget();
						if (!allNodes.contains(x)) {
							allNodes.add(x);
							nodes2.add(x);
						}
					}
			}
			nodes1.clear();
			nodes1.addAll(nodes2);
			nodes2.clear();
		}
		return nodeList;
	}
	
	private static EList<EList<Node>> splitListGraphwise(EList<Node> nodes){
		EList<EList<Node>> splitNodes = new BasicEList<EList<Node>>();
		for (Node n: nodes) {
			Boolean done = false;
			for (EList<Node> lst1: splitNodes) {
				if (!done && lst1.get(0).getGraph().equals(n.getGraph())) {
					done = true;
					lst1.add(n);
				}				
			}
			if (!done) {
				EList<Node> newlst = new BasicEList<Node>();
				newlst.add(n);
				splitNodes.add(newlst);
			}	
		}
		return splitNodes;
	}
	
	private static EList<EList<Operator>> splitOperatorsByNodeArgumentNumber(EList<Operator> operators) throws InvalidityException {

		EList<Operator> oneArg = new BasicEList<Operator>();;
		EList<Operator> twoArg = new BasicEList<Operator>();;
		
		for (Operator o: operators) {
			if (o instanceof Comparison) {
				Comparison co = (Comparison) o;
				if (co.getArgument1() instanceof Node && co.getArgument2() instanceof Node)
					twoArg.add(co);
				else oneArg.add(co);
				
			}
			else if (o instanceof NullCheck
					|| o instanceof Match
					|| o instanceof Contains)
				oneArg.add(o);	
			else 
				throw new InvalidityException("Unknown Operator found");
		}
		
		EList<EList<Operator>> splitOperators = new BasicEList<EList<Operator>>();
		splitOperators.add(oneArg);
		splitOperators.add(twoArg);
		return splitOperators;
	}
	
	private static EList<Operator> extractOperatorsFromPattern(PatternElement patternElement) throws InvalidityException {
		try {
			EList<Operator> ops = new BasicEList<Operator>();
			if (patternElement == null || patternElement instanceof TrueElement ) {
				
			}
			else if (patternElement instanceof CompletePattern) {
				ops.addAll( ((CompletePattern) patternElement).getGraph().getAllOperators() );
				ops.addAll( extractOperatorsFromPattern(((CompletePattern) patternElement).getCondition()));
			}
			else if (patternElement instanceof Formula) {
				ops.addAll( extractOperatorsFromPattern(((Formula) patternElement).getCondition1()));
				ops.addAll( extractOperatorsFromPattern(((Formula) patternElement).getCondition2()));
			}
			
			else if (patternElement instanceof QuantifiedCondition) {
				ops.addAll( ((QuantifiedCondition) patternElement).getGraph().getAllOperators() );
				ops.addAll( extractOperatorsFromPattern(((QuantifiedCondition) patternElement).getCondition()));
			}
			
			return ops;
		} catch(Exception e) {
			InvalidityException ex = new InvalidityException();
			ex.setStackTrace(e.getStackTrace());
			throw ex;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	private static Boolean checkIsCardinality (CompletePattern completePattern) {
//		throw new UnsupportedOperationException();
//	}
//
//	private static Boolean checkIsValueRange (CompletePattern completePattern) {
//		throw new UnsupportedOperationException();
//	}
//
//	private static Boolean checkIsValueComparison (CompletePattern completePattern) {
//		throw new UnsupportedOperationException();
//	}
//
//	private static Boolean checkIsListComparison (CompletePattern completePattern) {
//		throw new UnsupportedOperationException();
//	}
//
//	private static Boolean checkIsRegularExpressionMatching (CompletePattern completePattern) {
//		throw new UnsupportedOperationException();
//	}
//	
//	private static Boolean checkIsStringLength (CompletePattern completePattern) {
//		throw new UnsupportedOperationException();
//	}
//
//	private static Boolean checkIsPropertyComparison (CompletePattern completePattern) {
//		throw new UnsupportedOperationException();
//	}
//	
//	private static Boolean checkIsUnique (CompletePattern completePattern) {
//		throw new UnsupportedOperationException();
//	}
	
	
}
