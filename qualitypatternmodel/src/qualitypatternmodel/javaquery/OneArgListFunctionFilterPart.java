/**
 */
package qualitypatternmodel.javaquery;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One Arg List Function Filter Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.OneArgListFunctionFilterPart#getList <em>List</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getOneArgListFunctionFilterPart()
 * @model
 * @generated
 */
public interface OneArgListFunctionFilterPart extends OneArgFunctionFilterPart {
	/**
	 * Returns the value of the '<em><b>List</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' attribute list.
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getOneArgListFunctionFilterPart_List()
	 * @model default=""
	 * @generated
	 */
	EList<String> getList();

} // OneArgListFunctionFilterPart
