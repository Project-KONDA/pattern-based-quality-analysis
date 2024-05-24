package qualitypatternmodel.constrainttranslation;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.basex.util.Pair;

import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.adaptionxml.XmlRoot;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class FieldNodeIdentification {

	static Boolean validateNodes (CompletePattern pattern) throws InvalidityException {
		EList<Node> allNodes = getAllPatternNodes(pattern);
		
		if (!allNodes.stream().allMatch(t -> (t instanceof XmlRoot || (t.getIncoming().size() == 1 && !(t.getIncoming().get(0) instanceof XmlReference))))) {
			return false;
		}
		
		return true;
	}
	
	static ComplexNode identifyRecordNode (CompletePattern pattern) throws InvalidityException {
		XmlRoot root = getXmlRoot (pattern);
		EList<Node> potential = getAllFollowing(root);
		
		if (potential.size() == 0)
			throw new InvalidityException();
		else {
			if (!potential.stream().allMatch(t -> (t instanceof ComplexNode)))
				throw new InvalidityException();
			if (potential.size() == 1) {
				return (ComplexNode) potential.get(0);
			} else {
				
				
				return (ComplexNode) potential.get(0);
			}
		}
	}
	

	public static Node[] identifyFieldNodes (CompletePattern pattern) throws InvalidityException {
		EList<EList<Node>> potential = identifyPotentialFieldNodes(pattern, identifyRecordNode(pattern));
		Node[] nodes = new Node[potential.size()];
		
		for (int i= 0; i < potential.size(); i++) {
			if (potential.get(i).isEmpty())
				throw new InvalidityException();
			else if (potential.get(i).size() == 1) {
				nodes[i] = potential.get(i).get(0);
			}
		}
		

		// identify which node of the list is correct
		for (int twice = 0; twice <2; twice++)
			for (int i= 0; i < potential.size(); i++) {
				if (nodes[i] == null && potential.get(i).size() > 1) {
					if (potential.size() == 1)
						nodes[i] = potential.get(i).get(0);
					else {
						EList<Node> newpotential = new BasicEList<Node>();
						for (Node n: potential.get(i)) {
							Boolean canbe = true;
	
							for (Node others: nodes) {
								canbe &= (others == null || areEqualNodes(others, n));
							}
							if (canbe)
								for (EList<Node> nlist: potential) {
									canbe &= !nlist.stream().allMatch(t -> !areEqualNodes(t, n));
								}
							if (canbe)
								newpotential.add(n);
						}
						potential.set(i, newpotential);
					}
				}
			}
		
		// just pick the first
		for (int i= 0; i < potential.size(); i++) {
			if (nodes[i] == null && potential.get(i).size() > 0) {
				nodes[i] = potential.get(i).get(0);
			}
		}
		
		if (validateIdentifiedFieldNodes(nodes))
			return nodes;
		else
			throw new InvalidityException("Identified Field Nodes invalid");
	}
	
	static Boolean areEqualNodes(Node node1, Node node2) {
		if (node1 == null || node2 == null)
//			throw new UnsupportedOperationException("both nodes null");
			return false;
		if (node1.getClass() != node2.getClass())
//			throw new UnsupportedOperationException("not equal node classes");
			return false;
		if (node1.getIncoming().size() != 1 || node2.getIncoming().size() != 1)
//			throw new UnsupportedOperationException("relations invalid");
			return false;
		if (!(node1.getIncoming().get(0) instanceof XmlNavigation) || !(node2.getIncoming().get(0) instanceof XmlNavigation))
//			throw new UnsupportedOperationException("relations invalid");
			return false;
		XmlNavigation nav1 = (XmlNavigation) node1.getIncoming().get(0);
		XmlNavigation nav2 = (XmlNavigation) node2.getIncoming().get(0);
		try {
			return nav1.getXmlPathParam().generateXQuery().equals(nav2.getXmlPathParam().generateXQuery());
		} catch (Exception e) {
			return false;
		}
	}
	
	private static Boolean validateIdentifiedFieldNodes(Node[] identified) {
		if (identified.length == 0)
			return false;
		if (identified.length == 1)
			return true;
		
		for (Node n: identified) {
			
			if (n == null) {
				throw new UnsupportedOperationException("node null");
//				return false;
			}
				
			for (Node n2: identified)
				if (!areEqualNodes(n, n2))
					throw new UnsupportedOperationException("nodes not equal: " + n.myToString() + " - " + n2.myToString());
//					return false;
		}
		return true;
	}
	

	public static EList<EList<Node>> identifyPotentialFieldNodes (PatternElement element, ComplexNode rec) throws InvalidityException {
		EList<EList<Node>> nodes = new BasicEList<EList<Node>>();
		
		Pair<Node, Boolean> pair = UniquenessConditionCheck.uniquenessConditionField (element, rec);
		
		if (pair != null) {
			EList<Node> uniquefieldnode = new BasicEList<Node>();
			uniquefieldnode.add(pair.name());
			nodes.add(uniquefieldnode);
		}
		
		else if (element instanceof Pattern) {
			Pattern cp = (Pattern) element;
			nodes = identifyPotentialFieldNodes(cp.getCondition(), rec);
		} 
		
		else if (element instanceof QuantifiedCondition) {
			QuantifiedCondition cp = (QuantifiedCondition) element;
			
			EList<EList<Node>> graphnodes = identifyPotentialFieldNodes(cp.getGraph(), rec);
			EList<EList<Node>> list = identifyPotentialFieldNodes(cp.getCondition(), rec);
			
			if(list.isEmpty()) {
				if (graphnodes.isEmpty())
					throw new InvalidityException("no nodes in condition");
				nodes.addAll(graphnodes);
			} else {
				
				if (!(graphnodes == null || graphnodes.isEmpty() || graphnodes.get(0).isEmpty()))
					for (EList<Node> lst: list) {
						lst.addAll(graphnodes.get(0));
					}
				nodes.addAll(list);
			}
		} 
		
		else if (element instanceof Formula) {
			Formula cp = (Formula) element;
			nodes.addAll(identifyPotentialFieldNodes(cp.getCondition1(), rec));
			nodes.addAll(identifyPotentialFieldNodes(cp.getCondition2(), rec));
		}
		
		else if (element instanceof NotCondition) {
			NotCondition cp = (NotCondition) element;
			nodes.addAll(identifyPotentialFieldNodes(cp.getCondition(), rec));
		}

		else if (element instanceof Graph) {
			Graph cp = (Graph) element;
			EList<Node> potential = new BasicEList<Node>();

			EList<Node> graphnodes = cp.getNodes();
			EList<Operator> allOps = new BasicEList<Operator>();
	
			for (Node n: graphnodes) {
				if (n.getPredicates().isEmpty() && n.getGraph().getQuantifiedCondition() != null)
					throw new InvalidityException("node without predicates");
				allOps.addAll(n.getPredicates());
			}
			
			for (Node n: graphnodes) {
				Boolean p = true;
				for(Operator o: n.getPredicates())
					p = p && allOps.contains(o);
				if (p)
					potential.add(n);
			}

			EList<Node> add = new BasicEList<Node>();
			add.addAll(potential); 
			nodes.add(add);
		} 
		
		else if (element instanceof CountCondition) {
			CountCondition cp = (CountCondition) element;
			nodes.addAll(identifyPotentialFieldNodes(cp.getCountPattern().getGraph(), rec));
			nodes.addAll(identifyPotentialFieldNodes(cp.getCountPattern().getCondition(), rec));
			nodes.addAll(identifyPotentialFieldNodes(cp.getArgument2(), rec));
		} 
		
		else if (element instanceof CountPattern) {
			CountPattern cp = (CountPattern) element;
			nodes.addAll(identifyPotentialFieldNodes(cp.getGraph(), rec));
			nodes.addAll(identifyPotentialFieldNodes(cp.getCondition(), rec));
		} 
		
		return nodes;
	}

	static XmlRoot getXmlRoot (CompletePattern pattern) throws InvalidityException {
		Graph g = pattern.getGraph();
		EList<Node> nodes = g.getNodes();
		XmlRoot root = null;
		
		for (Node n: nodes) {
			if (n instanceof XmlRoot) {
				if (root != null)
					throw new InvalidityException("Multiple XmlRoot Elements");
				root = (XmlRoot) n;
			}
		}
		if (root == null)
			throw new InvalidityException("No XmlRoot Elements");
		return root;
	}
	
	static EList<Node> getAllFollowing(ComplexNode node) throws InvalidityException{
		EList<Node> nodes = new BasicEList<Node>();
		EList<Relation> relations = node.getOutgoing();
		for (Relation r: relations) {
			Node n = r.getTarget();
			if (n == null)
				throw new InvalidityException("Invalid Relationship " + r.myToString());
			nodes.add(n);
		}
		return nodes;
	}
	
	static EList<Node> getAllPatternNodes (PatternElement element) throws InvalidityException {
		EList<Node> nodes = new BasicEList<Node>();
		
		if (element instanceof Pattern) {
			Pattern cp = (Pattern) element;
			nodes.addAll(getAllPatternNodes(cp.getGraph()));
			nodes.addAll(getAllPatternNodes(cp.getCondition()));
		} 
		
		else if (element instanceof QuantifiedCondition) {
			QuantifiedCondition cp = (QuantifiedCondition) element;
			nodes.addAll(getAllPatternNodes(cp.getGraph()));
			nodes.addAll(getAllPatternNodes(cp.getCondition()));
		}

		else if (element instanceof Formula) {
			Formula cp = (Formula) element;
			nodes.addAll(getAllPatternNodes(cp.getCondition1()));
			nodes.addAll(getAllPatternNodes(cp.getCondition2()));
		}
		
		else if (element instanceof NotCondition) {
			NotCondition cp = (NotCondition) element;
			nodes.addAll(getAllPatternNodes(cp.getCondition()));
		}

		else if (element instanceof Graph) {
			Graph cp = (Graph) element;
			nodes.addAll(cp.getNodes());
		} 
		
		else if (element instanceof CountCondition) {
			CountCondition cp = (CountCondition) element;
			nodes.addAll(getAllPatternNodes(cp.getCountPattern()));
			nodes.addAll(getAllPatternNodes(cp.getArgument2()));
		} 
		
		return nodes;
	}
	
	static EList<Relation> getAllPatternRelations (PatternElement element) throws InvalidityException {
		EList<Relation> relations = new BasicEList<Relation>();
		
		if (element instanceof Pattern) {
			Pattern cp = (Pattern) element;
			relations.addAll(getAllPatternRelations(cp.getGraph()));
			relations.addAll(getAllPatternRelations(cp.getCondition()));
		} 
		
		else if (element instanceof QuantifiedCondition) {
			QuantifiedCondition cp = (QuantifiedCondition) element;
			relations.addAll(getAllPatternRelations(cp.getGraph()));
			relations.addAll(getAllPatternRelations(cp.getCondition()));
		} 

		else if (element instanceof Formula) {
			Formula cp = (Formula) element;
			relations.addAll(getAllPatternRelations(cp.getCondition1()));
			relations.addAll(getAllPatternRelations(cp.getCondition2()));
		}
		
		else if (element instanceof NotCondition) {
			NotCondition cp = (NotCondition) element;
			relations.addAll(getAllPatternRelations(cp.getCondition()));
		}

		else if (element instanceof Graph) {
			Graph cp = (Graph) element;
			relations.addAll(cp.getRelations());
		} 
		
		else if (element instanceof CountCondition) {
			CountCondition cp = (CountCondition) element;
			relations.addAll(getAllPatternRelations(cp.getCountPattern()));
			relations.addAll(getAllPatternRelations(cp.getArgument2()));
		} 
		
		return relations;
	}
	
	
//	static ComplexNode identifyRecordNode (CompletePattern pattern) throws InvalidityException {
//		return identifyRecordNode( splitNodes(pattern) );
//	}
//	
//	static ComplexNode identifyRecordNode (EList<EList<Node>> nodeList) throws InvalidityException {
//		if ( nodeList == null 
//				|| nodeList.size() != 3
//				|| nodeList.get(0) == null
//				|| nodeList.get(0).size() != 1
//				|| !(nodeList.get(0).get(0) instanceof XmlRoot)
//				|| nodeList.get(1) == null
//				|| nodeList.get(1).size() != 1
//				|| !(nodeList.get(1).get(0) instanceof ComplexNode)
//				|| nodeList.get(2) == null
//				|| nodeList.get(2).size() < 1
//			)
//		throw new InvalidityException("Node Configuration not valid");
//		
//		return (ComplexNode) nodeList.get(1).get(0);
//	}
//	
//
//	public static  Node[] identifyFieldNodes (CompletePattern pattern) throws InvalidityException {
//		EList<EList<Node>> nodeList = splitNodes(pattern);
//		ComplexNode recordNode = identifyRecordNode(nodeList);
//		EList<Operator> operators = extractOperatorsFromPattern(pattern);
//		
//		return identifyFieldNodes(nodeList, recordNode, operators);
//	}
//	
//	
//	static Node[] identifyFieldNodes (EList<EList<Node>> nodeList, ComplexNode recordNode, EList<Operator> operators) throws InvalidityException {
//		
//		// Fetch all nodes that are connected to the record node
//		EList<Node> allFollowing = new BasicEList<Node>();
//		for (Relation r: recordNode.getOutgoing())
//			allFollowing.add(r.getTarget());
//
////			System.out.println("__");
////			for (Node n: allFollowing)
////				System.out.println(n.myToString());
////			System.out.println("__");
//		
//		EList<EList<Node>> splitNodes = splitListGraphwise(allFollowing);
//		
////			System.out.println("[");
////			for (EList<Node> lst: splitNodes) {
////				System.out.println("  [");
////				for (Node n: lst)
////					System.out.println("  " + n.myToString());
////				System.out.println("  ]");
////			}
////			System.out.println("]");
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
//				// TODO
//				fieldNodes[i] = o2.get(0);
//				
//			}
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
//	
//	
//	
//	static Object identifyPotentialFieldNodes(EList<Node> nodes) throws InvalidityException {
//		EList<Node> potential = new BasicEList<Node>();
//		
//		EList<Operator> allOps = new BasicEList<Operator>();
//
//		for (Node n: nodes) {
//			if (n.getPredicates().isEmpty())
//				throw new InvalidityException("node without predicates");
//			allOps.addAll(n.getPredicates());
//		}
//		
//		for (Node n: nodes) {
//			Boolean p = true;
//			for(Operator o: n.getPredicates())
//				p = p && allOps.contains(o);
//			if (p)
//				potential.add(n);
//		}
//		
//		if (potential.size() == 1)
//			return potential.get(0);
//
//		else if (potential.size() == 0)
//			throw new InvalidityException("no potential node found");
//		else return potential;
//	}
//	
//	// HELPER FUNCTIONS INDIRECT
//	
//	static EList<EList<Node>> splitNodes(CompletePattern completePattern) {
//		EList<EList<Node>> nodeList = new BasicEList<EList<Node>>();
//		EList<Node> allNodes = new BasicEList<Node>();
//		EList<Node> nodes1 = new BasicEList<Node>();
//		EList<Node> nodes2 = new BasicEList<Node>();
//		
//		XmlRoot root = null; 
//		for (Node n: completePattern.getGraph().getNodes())
//			if (n instanceof XmlRoot) {
//				root = (XmlRoot) n;
//				allNodes.add(root);
//				nodes1.add(root);
//				break;
//			}
//		
//		while (!nodes1.isEmpty()) {
//			EList<Node> nextNodes = new BasicEList<Node>();
//			nextNodes.addAll(nodes1);
//			nodeList.add(nextNodes);
//			
//			for (Node n: nodes1) {
//				if (n instanceof ComplexNode)
//					for (Relation r: ((ComplexNode) n).getOutgoing()) {
//						Node x = r.getTarget();
//						if (!allNodes.contains(x)) {
//							allNodes.add(x);
//							nodes2.add(x);
//						}
//					}
//			}
//			nodes1.clear();
//			nodes1.addAll(nodes2);
//			nodes2.clear();
//		}
//		return nodeList;
//	}
//	
//	
//	static EList<EList<Node>> splitListGraphwise(EList<Node> nodes){
//		EList<EList<Node>> splitNodes = new BasicEList<EList<Node>>();
//		for (Node n: nodes) {
//			Boolean done = false;
//			for (EList<Node> lst1: splitNodes) {
//				if (!done && lst1.get(0).getGraph().equals(n.getGraph())) {
//					done = true;
//					lst1.add(n);
//				}				
//			}
//			if (!done) {
//				EList<Node> newlst = new BasicEList<Node>();
//				newlst.add(n);
//				splitNodes.add(newlst);
//			}	
//		}
//		return splitNodes;
//	}
//	
//	
//	static EList<EList<Operator>> splitOperatorsByNodeArgumentNumber(EList<Operator> operators) throws InvalidityException {
//
//		EList<Operator> oneArg = new BasicEList<Operator>();;
//		EList<Operator> twoArg = new BasicEList<Operator>();;
//		
//		for (Operator o: operators) {
//			if (o instanceof Comparison) {
//				Comparison co = (Comparison) o;
//				if (co.getArgument1() instanceof Node && co.getArgument2() instanceof Node)
//					twoArg.add(co);
//				else oneArg.add(co);
//				
//			}
//			else if (o instanceof NullCheck
//					|| o instanceof Match
//					|| o instanceof StringLength
//					|| o instanceof Contains)
//				oneArg.add(o);	
//			else 
//				throw new InvalidityException("Unknown Operator found");
//		}
//		
//		EList<EList<Operator>> splitOperators = new BasicEList<EList<Operator>>();
//		splitOperators.add(oneArg);
//		splitOperators.add(twoArg);
//		return splitOperators;
//	}
//	
//	
//	static EList<Operator> extractOperatorsFromPattern(PatternElement patternElement) throws InvalidityException {
//		try {
//			EList<Operator> ops = new BasicEList<Operator>();
//			if (patternElement == null || patternElement instanceof TrueElement ) {
//				
//			}
//			else if (patternElement instanceof CompletePattern) {
//				ops.addAll( ((CompletePattern) patternElement).getGraph().getAllOperators() );
//				ops.addAll( extractOperatorsFromPattern(((CompletePattern) patternElement).getCondition()));
//			}
//			else if (patternElement instanceof Formula) {
//				ops.addAll( extractOperatorsFromPattern(((Formula) patternElement).getCondition1()));
//				ops.addAll( extractOperatorsFromPattern(((Formula) patternElement).getCondition2()));
//			}
//			
//			else if (patternElement instanceof QuantifiedCondition) {
//				ops.addAll( ((QuantifiedCondition) patternElement).getGraph().getAllOperators() );
//				ops.addAll( extractOperatorsFromPattern(((QuantifiedCondition) patternElement).getCondition()));
//			}
//			
//			return ops;
//		} catch(Exception e) {
//			InvalidityException ex = new InvalidityException();
//			ex.setStackTrace(e.getStackTrace());
//			throw ex;
//		}
//	}
}
