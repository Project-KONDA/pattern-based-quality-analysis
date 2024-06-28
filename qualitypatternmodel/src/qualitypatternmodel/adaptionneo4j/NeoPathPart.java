/**
 */
package qualitypatternmodel.adaptionneo4j;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.exceptions.InvalidityException;

import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo Path Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.NeoPathPart#getNeoPathParam <em>Neo Path Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.NeoPathPart#getNeoComplexEdge <em>Neo Complex Edge</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoPathPart()
 * @model abstract="true"
 * @generated
 */
public interface NeoPathPart extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Neo Param</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionneo4j.NeoPathParam#getNeoPathPart <em>Neo Path Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Param</em>' container reference.
	 * @throws InvalidityException 
	 * @see #setNeoPathParam(NeoPathParam)
	 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoPathPart_NeoParam()
	 * @see qualitypatternmodel.adaptionneo4j.NeoPathParam#getNeoPathPart
	 * @model opposite="neoPathPart" transient="false"
	 * @generated NOT 
	 */
	NeoPathParam getNeoPathParam() throws InvalidityException;

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionneo4j.NeoPathPart#getNeoPathParam <em>Neo Path Param</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Path Param</em>' container reference.
	 * @see #getNeoPathParam()
	 * @generated
	 */
	void setNeoPathParam(NeoPathParam value);

	/**
	 * Returns the value of the '<em><b>Neo Complex Edge</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionneo4j.NeoComplexEdge#getNeoPathParts <em>Neo Path Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Complex Edge</em>' container reference.
	 * @see #setNeoComplexEdge(NeoComplexEdge)
	 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoPathPart_NeoComplexEdge()
	 * @see qualitypatternmodel.adaptionneo4j.NeoComplexEdge#getNeoPathParts
	 * @model opposite="neoPathParts" transient="false"
	 * @generated
	 */
	NeoComplexEdge getNeoComplexEdge();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionneo4j.NeoPathPart#getNeoComplexEdge <em>Neo Complex Edge</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Complex Edge</em>' container reference.
	 * @see #getNeoComplexEdge()
	 * @generated
	 */
	void setNeoComplexEdge(NeoComplexEdge value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<NeoPathPart> getNeoPathPartEdgeLeafs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String getCypherVariable() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String getCypherInnerEdgeNodes(boolean isReturn) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	NeoPathPart getNeoLastEdge() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void setValueFromString(String value) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getValueAsString();

} // NeoPathPart
