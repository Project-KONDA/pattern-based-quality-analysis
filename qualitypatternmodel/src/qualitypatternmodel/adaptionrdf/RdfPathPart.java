/**
 */
package qualitypatternmodel.adaptionrdf;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rdf Path Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionrdf.RdfPathPart#getRdfPathParam <em>Rdf Path Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.RdfPathPart#getRdfPath <em>Rdf Path</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.RdfPathPart#getTargetNodeTypes <em>Target Node Types</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfPathPart()
 * @model
 * @generated
 */
public interface RdfPathPart extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Rdf Path Param</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionrdf.RdfPathParam#getRdfPathParts <em>Rdf Path Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdf Path Param</em>' container reference.
	 * @see #setRdfPathParam(RdfPathParam)
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfPathPart_RdfPathParam()
	 * @see qualitypatternmodel.adaptionrdf.RdfPathParam#getRdfPathParts
	 * @model opposite="rdfPathParts" transient="false"
	 * @generated
	 */
	RdfPathParam getRdfPathParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionrdf.RdfPathPart#getRdfPathParam <em>Rdf Path Param</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdf Path Param</em>' container reference.
	 * @see #getRdfPathParam()
	 * @generated
	 */
	void setRdfPathParam(RdfPathParam value);

	/**
	 * Returns the value of the '<em><b>Rdf Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdf Path</em>' containment reference.
	 * @see #setRdfPath(RdfPath)
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfPathPart_RdfPath()
	 * @model containment="true"
	 * @generated
	 */
	RdfPath getRdfPath();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionrdf.RdfPathPart#getRdfPath <em>Rdf Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdf Path</em>' containment reference.
	 * @see #getRdfPath()
	 * @generated
	 */
	void setRdfPath(RdfPath value);

	/**
	 * Returns the value of the '<em><b>Target Node Types</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionrdf.IriListParam#getRdfPathPart <em>Rdf Path Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Node Types</em>' containment reference.
	 * @see #setTargetNodeTypes(IriListParam)
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfPathPart_TargetNodeTypes()
	 * @see qualitypatternmodel.adaptionrdf.IriListParam#getRdfPathPart
	 * @model opposite="rdfPathPart" containment="true"
	 * @generated
	 */
	IriListParam getTargetNodeTypes();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionrdf.RdfPathPart#getTargetNodeTypes <em>Target Node Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Node Types</em>' containment reference.
	 * @see #getTargetNodeTypes()
	 * @generated
	 */
	void setTargetNodeTypes(IriListParam value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String generateRdfPartTypes(String variable) throws InvalidityException;

} // RdfPathPart
