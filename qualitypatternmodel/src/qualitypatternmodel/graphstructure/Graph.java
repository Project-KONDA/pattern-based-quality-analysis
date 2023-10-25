/**
 */
package qualitypatternmodel.graphstructure;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.operators.OperatorList;
import qualitypatternmodel.patternstructure.Morphism;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * Abstract representation of data of interest by means of <code>Elements</code>, <code>Relations</code> and <code>Properties</code>.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.Graph#getNodes <em>Nodes</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Graph#getOperatorList <em>Operator List</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Graph#getQuantifiedCondition <em>Quantified Condition</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Graph#getPattern <em>Pattern</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Graph#getOutgoingMorphisms <em>Outgoing Morphisms</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Graph#getIncomingMorphism <em>Incoming Morphism</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Graph#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.graphstructure.Node}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Node#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getGraph_Nodes()
	 * @see qualitypatternmodel.graphstructure.Node#getGraph
	 * @model opposite="graph" containment="true" required="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Outgoing Morphisms</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.patternstructure.Morphism}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.Morphism#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Morphisms</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getGraph_OutgoingMorphisms()
	 * @see qualitypatternmodel.patternstructure.Morphism#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Morphism> getOutgoingMorphisms();

	/**
	 * Returns the value of the '<em><b>Incoming Morphism</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.Morphism#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Morphism</em>' reference.
	 * @see #setIncomingMorphism(Morphism)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getGraph_IncomingMorphism()
	 * @see qualitypatternmodel.patternstructure.Morphism#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	Morphism getIncomingMorphism();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Graph#getIncomingMorphism <em>Incoming Morphism</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Morphism</em>' reference.
	 * @see #getIncomingMorphism()
	 * @generated
	 */
	void setIncomingMorphism(Morphism value);

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.graphstructure.Relation}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Relation#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getGraph_Relations()
	 * @see qualitypatternmodel.graphstructure.Relation#getGraph
	 * @model opposite="graph" containment="true"
	 * @generated
	 */
	EList<Relation> getRelations();

	/**
	 * Returns the value of the '<em><b>Operator List</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.operators.OperatorList#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator List</em>' containment reference.
	 * @see #setOperatorList(OperatorList)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getGraph_OperatorList()
	 * @see qualitypatternmodel.operators.OperatorList#getGraph
	 * @model opposite="graph" containment="true" required="true"
	 * @generated
	 */
	OperatorList getOperatorList();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Graph#getOperatorList <em>Operator List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator List</em>' containment reference.
	 * @see #getOperatorList()
	 * @generated
	 */
	void setOperatorList(OperatorList value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns true if <code>this</code> serves as the context graph of a <code>Pattern</code>, thus is contained in a <code>Pattern</code>.
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isReturnGraph();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Relation addRelation(ComplexNode from, Node to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Node addNode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ComplexNode addComplexNode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PrimitiveNode addPrimitiveNode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String generateCypherWhere() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" many="false"
	 * @generated NOT
	 */
	EList<EList<Node>> getAllSubGraphs() throws InvalidityException;

	/**
	 * Returns the value of the '<em><b>Quantified Condition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantified Condition</em>' container reference.
	 * @see #setQuantifiedCondition(QuantifiedCondition)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getGraph_QuantifiedCondition()
	 * @see qualitypatternmodel.patternstructure.QuantifiedCondition#getGraph
	 * @model opposite="graph" transient="false"
	 * @generated
	 */
	QuantifiedCondition getQuantifiedCondition();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Graph#getQuantifiedCondition <em>Quantified Condition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantified Condition</em>' container reference.
	 * @see #getQuantifiedCondition()
	 * @generated
	 */
	void setQuantifiedCondition(QuantifiedCondition value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.Pattern#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' container reference.
	 * @see #setPattern(Pattern)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getGraph_Pattern()
	 * @see qualitypatternmodel.patternstructure.Pattern#getGraph
	 * @model opposite="graph" transient="false"
	 * @generated
	 */
	Pattern getPattern();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Graph#getPattern <em>Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' container reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(Pattern value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Node> getReturnNodes();

	Boolean isBefore(Graph other);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Node> getNodesFromAllPreviousGraphs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Relation> getRelationsFromAllPreviousGraphs();
} // Graph
