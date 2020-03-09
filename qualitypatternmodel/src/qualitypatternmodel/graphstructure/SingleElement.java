/**
 */
package qualitypatternmodel.graphstructure;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.SingleElementMapping;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Element</b></em>'.
 * This represents a single data element.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#getMappingTo <em>Mapping To</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#getMappingFrom <em>Mapping From</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#getRoot <em>Root</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#getNextSingle <em>Next Single</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#getPrevious <em>Previous</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#getNextSet <em>Next Set</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#getGraph <em>Graph</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getSingleElement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasPreviousOrIsRoot correctMappingOfContainment'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot hasPreviousOrIsRoot='self.previous-&gt;notEmpty() or self.root-&gt;notEmpty()' correctMappingOfContainment='self.previous-&gt;notEmpty() implies self.mappingTo-&gt;forAll(m | m.to.previous.mappingFrom.from = self.previous)'"
 * @generated
 */
public interface SingleElement extends Element {
	/**
	 * Returns the value of the '<em><b>Mapping From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.SingleElementMapping#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping From</em>' reference.
	 * @see #setMappingFrom(SingleElementMapping)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getSingleElement_MappingFrom()
	 * @see qualitypatternmodel.patternstructure.SingleElementMapping#getTo
	 * @model opposite="to"
	 * @generated
	 */
	SingleElementMapping getMappingFrom();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.SingleElement#getMappingFrom <em>Mapping From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping From</em>' reference.
	 * @see #getMappingFrom()
	 * @generated
	 */
	void setMappingFrom(SingleElementMapping value);

	/**
	 * Returns the value of the '<em><b>Mapping To</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.patternstructure.SingleElementMapping}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.SingleElementMapping#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping To</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getSingleElement_MappingTo()
	 * @see qualitypatternmodel.patternstructure.SingleElementMapping#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<SingleElementMapping> getMappingTo();

	/**
	 * Returns the value of the '<em><b>Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Graph#getRootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' container reference.
	 * @see #setRoot(Graph)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getSingleElement_Root()
	 * @see qualitypatternmodel.graphstructure.Graph#getRootElement
	 * @model opposite="rootElement" transient="false"
	 * @generated
	 */
	Graph getRoot();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.SingleElement#getRoot <em>Root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' container reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Graph value);

	/**
	 * Returns the value of the '<em><b>Next Single</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.graphstructure.SingleElement}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.SingleElement#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Single</em>' containment reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getSingleElement_NextSingle()
	 * @see qualitypatternmodel.graphstructure.SingleElement#getPrevious
	 * @model opposite="previous" containment="true"
	 * @generated
	 */
	EList<SingleElement> getNextSingle();

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.SingleElement#getNextSingle <em>Next Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' container reference.
	 * @see #setPrevious(SingleElement)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getSingleElement_Previous()
	 * @see qualitypatternmodel.graphstructure.SingleElement#getNextSingle
	 * @model opposite="nextSingle" transient="false"
	 * @generated
	 */
	SingleElement getPrevious();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.SingleElement#getPrevious <em>Previous</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' container reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(SingleElement value);

	/**
	 * Returns the value of the '<em><b>Next Set</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.graphstructure.SetElement}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.SetElement#getPreviousSingle <em>Previous Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Set</em>' containment reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getSingleElement_NextSet()
	 * @see qualitypatternmodel.graphstructure.SetElement#getPreviousSingle
	 * @model opposite="previousSingle" containment="true"
	 * @generated
	 */
	EList<SetElement> getNextSet();

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Graph#getReturnElements <em>Return Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' reference.
	 * @see #setGraph(Graph)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getSingleElement_Graph()
	 * @see qualitypatternmodel.graphstructure.Graph#getReturnElements
	 * @model opposite="returnElements"
	 * @generated
	 */
	Graph getGraph();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.SingleElement#getGraph <em>Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(Graph value);

	/**
	 * <!-- begin-user-doc -->
	 * Copies all contained <code>SingleElement</code> objects to the next graphs.
	 * Corresponding <code>SingleElement</code> objects are created in these graphs and <code>SingleElementMapping</code> objects are added to the morphism.
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.MissingPatternContainerException"
	 * @generated
	 */
	void copyNextElementsToNextGraphs() throws MissingPatternContainerException;

	/**
	 * <!-- begin-user-doc -->
	 * Copies the contained <code>SingleElement</code> nextElement to the next graphs.
	 * A corresponding <code>SingleElement</code> object is created in these graphs and a SingleElementMapping object is added to the morphism.
	 * @param the <code>SingleElement</code> to be copied.
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.MissingPatternContainerException"
	 * @generated
	 */
	void copyNextElementToNextGraphs(SingleElement nextElement) throws MissingPatternContainerException;

	/**
	 * <!-- begin-user-doc -->
	 * Removes <code>SingleElement</code> objects in previous graphs which are directly or transitively connected to <code>this</code> via a <code>SingleElementMapping</code>.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeElementFromPreviousGraphs();

	/**
	 * <!-- begin-user-doc -->
	 * Copies the contained <code>SingleElement</code> nextElement to the previous graph or recursively all previous graphs in case recursive is true.
	 * A corresponding <code>SingleElement</code> object is created in these graphs and a <code>SingleElementMapping</code> object is added to the morphism.
	 * @param nextElement the <code>SingleElement</code> to be copied
	 * @param recursive if true, the object is copied recursively to all previous graphs
	 * <!-- end-user-doc -->
	 * @model recursiveRequired="true"
	 * @generated
	 */
	void copyNextElementToPreviousGraphs(SingleElement nextElement, boolean recursive);

	/**
	 * <!-- begin-user-doc -->
	 * Copies all contained <code>SingleElement</code> objects to the previous graph or recursively all previous graphs in case recursive is true.
	 * Corresponding <code>SingleElement</code> objects are created in these graphs and <code>SingleElementMapping</code> objects are added to the morphism.
	 * @param recursive if true, the objects are copied recursively to all previous graphs
	 * <!-- end-user-doc -->
	 * @model recursiveRequired="true"
	 * @generated
	 */
	void copyNextElementsToPreviousGraphs(boolean recursive);

	/**
	 * <!-- begin-user-doc -->
	 * Returns true if this <code>SingleElement</code> has a predicate of type count.
	 * @return true if this <code>SingleElement</code> has a predicate of type count
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean hasCountPredicate();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the query representing this <code>SingleElement</code>.
	 * The predicates are inserted after "satisfies".
	 * Is called in case this <code>SingleElement</code> has a count predicate.
	 * @param location the <code>Location</code> of the <code>Element</code> this in the pattern
	 * @return the query representing this <code>SingleElement</code>
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String toXQueryCount(Location location) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
 	 * Returns the query representing this <code>SingleElement</code>.
	 * The predicates are inserted as XPath predicates at the end of the path expression.
	 * Is called in case this <code>SingleElement</code> does not have a count predicate.
	 * @param location the <code>Location</code> of the <code>Element</code> this in the pattern
	 * @return the query representing this <code>SingleElement</code>
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String toXQueryNoCount(Location location) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isRootElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeMappingsToNext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeFromReturnElements();

} // SingleElement
