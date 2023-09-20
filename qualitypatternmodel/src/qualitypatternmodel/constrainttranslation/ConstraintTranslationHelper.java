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
			record = identifyRecordNode(splitNodes(completePattern));
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
	
	
	// HELPER FUNCTIONS DIRECT

	static ComplexNode identifyRecordNode (CompletePattern pattern) throws InvalidityException {
		return identifyRecordNode( splitNodes(pattern) );
	}
	
	static ComplexNode identifyRecordNode (EList<EList<Node>> nodeList) throws InvalidityException {
		if ( nodeList == null 
				|| nodeList.size() != 3
				|| nodeList.get(0) == null
				|| nodeList.get(0).size() != 1
				|| !(nodeList.get(0).get(0) instanceof XmlRoot)
				|| nodeList.get(1) == null
				|| nodeList.get(1).size() != 1
				|| !(nodeList.get(1).get(0) instanceof ComplexNode)
				|| nodeList.get(2) == null
				|| nodeList.get(2).size() < 1
			)
		throw new InvalidityException("Node Configuration not valid");
		
		return (ComplexNode) nodeList.get(1).get(0);
	}
	

//	public static  Node[] identifyFieldNodes (CompletePattern pattern) throws InvalidityException {
//		EList<EList<Node>> nodeList = splitNodes(pattern);
//		ComplexNode recordNode = identifyRecordNode(nodeList);
//		EList<Operator> operators = extractOperatorsFromPattern(pattern);
//		
//		return identifyFieldNodes(nodeList, recordNode, operators);
//	}
	
	
//	static Node[] identifyFieldNodes (EList<EList<Node>> nodeList, ComplexNode recordNode, EList<Operator> operators) throws InvalidityException {
//		
//		// Fetch all nodes that are connected to the record node
//		EList<Node> allFollowing = new BasicEList<Node>();
//		for (Relation r: recordNode.getOutgoing())
//			allFollowing.add(r.getTarget());
//
//		for (Node n: allFollowing)
//			System.out.println(n.myToString());
//		
//		EList<EList<Node>> splitNodes = splitListGraphwise(allFollowing);
//		
//		System.out.println("[");
//		for (EList<Node> lst: splitNodes) {
//			System.out.println("  [");
//			for (Node n: lst)
//				System.out.println("  " + n.myToString());
//			System.out.println("  ]");
//		}
//		System.out.println("]");
//		
//
//		// first Filter: remove nodes and potentially get error
//		Object[] fields = new Object[splitNodes.size()];
//
//		for (int i = 0; i < splitNodes.size(); i++)
//			if (splitNodes.get(i).size() == 1) {
//				Node n = splitNodes.get(i).get(0);
//				fields[i] = n;
//			}
//		
//		for (int i = 0; i < splitNodes.size(); i++)
//			if (splitNodes.get(i).size() > 1)
//				fields[i] = identifyPotentialFieldNodes(splitNodes.get(i));
//		
//
//		// second filter
//		Node[] fieldNodes = new Node[splitNodes.size()];
//		for (int i = 0; i < splitNodes.size(); i++) {
//			Object o = fields[i];
//			if (o instanceof Node)
//				fieldNodes[i] = (Node) o;
//		}
//		EList<Node> confirmedNodes = new BasicEList<Node>();
//		for (Node f: fieldNodes)
//			confirmedNodes.add(f);
//		
//			
//		for (int i = 0; i < splitNodes.size(); i++) {
//			Object o = fields[i];
//			if (o instanceof EList) {
//				EList<Node> o2 = (EList<Node>) o;
//				
//				System.out.println("lololol");
//				// TODO
//				
//			}
//			
//		}
//		
//		// validate
//		for (Node node: fieldNodes)
//			if (node == null)
//				throw new InvalidityException();
//		for (Node node: fieldNodes) {
//			for (Node node2: fieldNodes) {
//				try {
//					String nav1 = ((XmlNavigation) node.getIncoming().get(0)).getXmlPathParam().generateXQuery();
//					String nav2 = ((XmlNavigation) node2.getIncoming().get(0)).getXmlPathParam().generateXQuery();
//					
//					if ( !(nav1.equals(nav2)))
//						throw new InvalidityException(node.myToString() + " and " + node2.myToString());
//				} catch(Exception e) {
//					InvalidityException exception = new InvalidityException();
//					exception.setStackTrace(e.getStackTrace());
//					throw exception;
//				}
//			}
//		}
//		
//		return fieldNodes;
//	}
	
	
	
//	static Object identifyPotentialFieldNodes(EList<Node> nodes) throws InvalidityException {
//		EList<Node> must = new BasicEList<Node>();
//		EList<Node> potential = new BasicEList<Node>();
//		
//		for (Node n: nodes) {
//			EList<Operator> ops = new BasicEList<Operator>();
//			ops.addAll(n.getPredicates());
//			
//			Boolean m = false;
//			
//			for (Operator o: ops) {
//				if (o instanceof Comparison) {
//					Comparison c = (Comparison) o;
//					if (c.getArgument1().equals(n)) {
//						m = m || !(c.getArgument2() instanceof Node);
//					}
//					else {
//						m = m || !(c.getArgument1() instanceof Node);
//					}
//				}
//				else m = true;
//			}
//			if (m)
//				must.add(n);
//			else 
//				potential.add(n);
//		}
//		
//		if (must.size() == 1)
//			return must.get(0);
//		else if (must.size() == 0 && potential.size() > 0)
//			return potential;
//		else 
//			throw new InvalidityException("not enough nodes?");
//	}
	
	
	
	// HELPER FUNCTIONS INDIRECT
	
	static EList<EList<Node>> splitNodes(CompletePattern completePattern) {
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
	
	
	static EList<EList<Node>> splitListGraphwise(EList<Node> nodes){
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
	
	
	static EList<EList<Operator>> splitOperatorsByNodeArgumentNumber(EList<Operator> operators) throws InvalidityException {

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
					|| o instanceof StringLength
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
	
	
	static EList<Operator> extractOperatorsFromPattern(PatternElement patternElement) throws InvalidityException {
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
