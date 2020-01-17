/**
 */
package qualitypatternmodel.patternstructure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.Mapping#getMappingDepth <em>Mapping Depth</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMapping()
 * @model abstract="true"
 * @generated
 */
public interface Mapping extends PatternElement {

	/**
	 * Returns the value of the '<em><b>Mapping Depth</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Depth</em>' attribute.
	 * @see #setMappingDepth(int)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMapping_MappingDepth()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getMappingDepth();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Mapping#getMappingDepth <em>Mapping Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Depth</em>' attribute.
	 * @see #getMappingDepth()
	 * @generated
	 */
	void setMappingDepth(int value);
} // Mapping
