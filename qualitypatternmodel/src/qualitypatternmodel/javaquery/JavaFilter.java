/**
 */
package qualitypatternmodel.javaquery;

import org.eclipse.emf.ecore.EObject;
import qualitypatternmodel.javaqueryoutput.InterimResultStructure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.JavaFilter#getFilter <em>Filter</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.JavaFilter#getStructure <em>Structure</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getJavaFilter()
 * @model
 * @generated
 */
public interface JavaFilter extends EObject {
	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(BooleanFilterPart)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getJavaFilter_Filter()
	 * @model containment="true"
	 * @generated
	 */
	BooleanFilterPart getFilter();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.JavaFilter#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(BooleanFilterPart value);

	/**
	 * Returns the value of the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure</em>' containment reference.
	 * @see #setStructure(InterimResultStructure)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getJavaFilter_Structure()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InterimResultStructure getStructure();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.JavaFilter#getStructure <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' containment reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(InterimResultStructure value);

} // JavaFilter
