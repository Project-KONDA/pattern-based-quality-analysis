/**
 */
package qualitypatternmodel.adaptionNeo4J;

import qualitypatternmodel.parameters.ParameterValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoLabel#getNeoLabel <em>Neo Label</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoLabel()
 * @model
 * @generated
 */
public interface NeoLabel extends ParameterValue {
	/**
	 * Returns the value of the '<em><b>Neo Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Label</em>' attribute.
	 * @see #setNeoLabel(String)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoLabel_NeoLabel()
	 * @model
	 * @generated
	 */
	String getNeoLabel();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoLabel#getNeoLabel <em>Neo Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Label</em>' attribute.
	 * @see #getNeoLabel()
	 * @generated
	 */
	void setNeoLabel(String value);

} // NeoLabel
