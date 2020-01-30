/**
 */
package qualitypatternmodel.graphstructure;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.patternstructure.InvalidityException;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.MissingPatternContainerException;
import qualitypatternmodel.patternstructure.SingleElementMapping;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Element</b></em>'.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	int getOriginalID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getXQueryVariable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String translatePredicates(Location location) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String translatePathFromPrevious();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.MissingPatternContainerException"
	 * @generated
	 */
	void copyNextElements() throws MissingPatternContainerException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.MissingPatternContainerException"
	 * @generated
	 */
	void copyNextElement(SingleElement element) throws MissingPatternContainerException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeElementFromPreviousGraphs();

} // SingleElement
