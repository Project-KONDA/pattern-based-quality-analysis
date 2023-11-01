/**
 */
package qualitypatternmodel.javaquery;

import qualitypatternmodel.exceptions.InvalidityException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Filter Part</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getNumberFilterPart()
 * @model abstract="true"
 * @generated
 */
public interface NumberFilterPart extends JavaFilterPart {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	Double apply() throws InvalidityException;

} // NumberFilterPart
