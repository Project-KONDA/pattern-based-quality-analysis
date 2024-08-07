/**
 */
package qualitypatternmodel.graphstructure;

import qualitypatternmodel.adaptionneo4j.NeoElementEdge;
import qualitypatternmodel.adaptionneo4j.NeoPropertyEdge;
import qualitypatternmodel.adaptionrdf.RdfPredicate;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * The representation of a relation between two data units (represented by <code>Element</code>) within <code>Graphs</code>.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.Relation#getGraph <em>Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Relation#getSource <em>Source</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Relation#getTarget <em>Target</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Relation#getName <em>Name</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Relation#isTranslated <em>Translated</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Relation#isPredicatesAreBeingTranslated <em>Predicates Are Being Translated</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends PatternElement, Adaptable {

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Graph#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' container reference.
	 * @see #setGraph(Graph)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getRelation_Graph()
	 * @see qualitypatternmodel.graphstructure.Graph#getRelations
	 * @model opposite="relations" required="true" transient="false"
	 * @generated
	 */
	Graph getGraph();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Relation#getGraph <em>Graph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' container reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(Graph value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.ComplexNode#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ComplexNode)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getRelation_Source()
	 * @see qualitypatternmodel.graphstructure.ComplexNode#getOutgoing
	 * @model opposite="outgoing"
	 * @generated
	 */
	ComplexNode getSource();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Relation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ComplexNode value);

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Relation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference. Will become ComplexNode if it is not yet.
	 * @see #getSource()
	 * @generated NOT
	 */
	void setSource(Node value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Node#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Node)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getRelation_Target()
	 * @see qualitypatternmodel.graphstructure.Node#getIncoming
	 * @model opposite="incoming"
	 * @generated
	 */
	Node getTarget();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Relation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Node value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getRelation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Relation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translated</em>' attribute.
	 * @see #setTranslated(boolean)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getRelation_Translated()
	 * @model required="true"
	 * @generated
	 */
	boolean isTranslated();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Relation#isTranslated <em>Translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translated</em>' attribute.
	 * @see #isTranslated()
	 * @generated
	 */
	void setTranslated(boolean value);

	/**
	 * Returns the value of the '<em><b>Predicates Are Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicates Are Being Translated</em>' attribute.
	 * @see #setPredicatesAreBeingTranslated(boolean)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getRelation_PredicatesAreBeingTranslated()
	 * @model required="true"
	 * @generated
	 */
	boolean isPredicatesAreBeingTranslated();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Relation#isPredicatesAreBeingTranslated <em>Predicates Are Being Translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicates Are Being Translated</em>' attribute.
	 * @see #isPredicatesAreBeingTranslated()
	 * @generated
	 */
	void setPredicatesAreBeingTranslated(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * Replaces <code>this</code> and corresponding <code>Relations</code> in the previous and
	 * following <code>Graphs</code> by <code>XmlNavigations</code>.
	 *
	 * @return the <code>XmlNavigation</code> that replaces <code>this</code> in the pattern
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	XmlElementNavigation adaptAsXmlElementNavigation() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * Replaces <code>this</code> and corresponding <code>Relations</code> in the previous and
	 * following <code>Graphs</code> by <code>XmlReferences</code>.
	 *
	 * @return the <code>XmlReference</code> that replaces <code>this</code> in the pattern
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	XmlReference adaptAsXmlReference() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	RdfPredicate adaptAsRdfPredicate() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	NeoElementEdge adaptAsNeoElementEdge() throws InvalidityException;

	//ADD to the .ecore-Model
	NeoPropertyEdge adaptAsPropertyEdge() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean inJavaReturnRequired();

	/**
	 * <!-- begin-user-doc -->
	 * Sets <code>graph</code> of <code>this</code> to <code>newGraph</code>
	 * without updating corresponding <code>Relations</code> in previous and following <code>Graphs</code>,
	 * updating referenced <code>Parameters</code> and resetting <code>source</code> and <code>target</code>.
	 *
	 * @param newGraph the new container of <code>this</code>
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setGraphSimple(Graph newGraph);


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Boolean isCrossGraph();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	XmlPropertyNavigation adaptAsXmlPropertyNavigation() throws InvalidityException;

} // Relation
