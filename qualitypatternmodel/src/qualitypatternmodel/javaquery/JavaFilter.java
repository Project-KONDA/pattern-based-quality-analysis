/**
 */
package qualitypatternmodel.javaquery;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import qualitypatternmodel.javaqueryoutput.InterimResult;
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
 *   <li>{@link qualitypatternmodel.javaquery.JavaFilter#getInterimResult <em>Interim Result</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Interim Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interim Result</em>' reference.
	 * @see #setInterimResult(InterimResult)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getJavaFilter_InterimResult()
	 * @model
	 * @generated
	 */
	InterimResult getInterimResult();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.JavaFilter#getInterimResult <em>Interim Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interim Result</em>' reference.
	 * @see #getInterimResult()
	 * @generated
	 */
	void setInterimResult(InterimResult value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model param1DataType="qualitypatternmodel.javaquery.StringListWrapper"
	 * @generated
	 */
	String filterXQueryResults(List<Object> param1);

} // JavaFilter
