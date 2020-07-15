/**
 */
package qualitypatternmodel.patternstructure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * This is an abstract class for marking corresponding elements between two graphs.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.Mapping#getMorphism <em>Morphism</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMapping()
 * @model abstract="true"
 * @generated
 */
public interface Mapping extends PatternElement {

	/**
	 * Returns the value of the '<em><b>Morphism</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.Morphism#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Morphism</em>' container reference.
	 * @see #setMorphism(Morphism)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMapping_Morphism()
	 * @see qualitypatternmodel.patternstructure.Morphism#getMappings
	 * @model opposite="mappings" required="true" transient="false"
	 * @generated
	 */
	Morphism getMorphism();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Mapping#getMorphism <em>Morphism</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Morphism</em>' container reference.
	 * @see #getMorphism()
	 * @generated
	 */
	void setMorphism(Morphism value);
} // Mapping
