/**
 */
package qualitypatternmodel.graphstructure;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.parameters.AxisOptionParam;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.RelationMapping;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.Relation#getMappingFrom <em>Mapping From</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Relation#getMappingTo <em>Mapping To</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Relation#getRelationTo <em>Relation To</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Relation#getOption <em>Option</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Mapping To</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.patternstructure.RelationMapping}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.RelationMapping#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping To</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getRelation_MappingTo()
	 * @see qualitypatternmodel.patternstructure.RelationMapping#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<RelationMapping> getMappingTo();

	/**
	 * Returns the value of the '<em><b>Mapping From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.RelationMapping#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping From</em>' reference.
	 * @see #setMappingFrom(RelationMapping)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getRelation_MappingFrom()
	 * @see qualitypatternmodel.patternstructure.RelationMapping#getTo
	 * @model opposite="to"
	 * @generated
	 */
	RelationMapping getMappingFrom();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Relation#getMappingFrom <em>Mapping From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping From</em>' reference.
	 * @see #getMappingFrom()
	 * @generated
	 */
	void setMappingFrom(RelationMapping value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	int getGraphDepth() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeRelationFromPreviousGraphs();

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
	void copyToNewNextGraphs(SingleElement newRelationTo);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createInputs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeInputsFromVariableList();

	/**
	 * Returns the value of the '<em><b>Relation To</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.SingleElement#getRelationFromPrevious <em>Relation From Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation To</em>' container reference.
	 * @see #setRelationTo(SingleElement)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getRelation_RelationTo()
	 * @see qualitypatternmodel.graphstructure.SingleElement#getRelationFromPrevious
	 * @model opposite="relationFromPrevious" required="true" transient="false"
	 * @generated
	 */
	SingleElement getRelationTo();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Relation#getRelationTo <em>Relation To</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation To</em>' container reference.
	 * @see #getRelationTo()
	 * @generated
	 */
	void setRelationTo(SingleElement value);

	/**
	 * Returns the value of the '<em><b>Option</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.AxisOptionParam#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' reference.
	 * @see #setOption(AxisOptionParam)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getRelation_Option()
	 * @see qualitypatternmodel.parameters.AxisOptionParam#getRelation
	 * @model opposite="relation"
	 * @generated
	 */
	AxisOptionParam getOption();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Relation#getOption <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(AxisOptionParam value);

} // Relation
