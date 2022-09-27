/**
 */
package qualitypatternmodel.parameters;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.exceptions.InvalidityException;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text List</b></em>'.
 * Defines input parameter of type List<String>.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.TextListParam#getValues <em>Values</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.TextListParam#isIsListTranslatable <em>Is List Translatable</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.parameters.ParametersPackage#getTextListParam()
 * @model
 * @generated
 */
public interface TextListParam extends ParameterValue {

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see qualitypatternmodel.parameters.ParametersPackage#getTextListParam_Values()
	 * @model default=""
	 * @generated
	 */
	EList<String> getValues();

	/**
	 * Returns the value of the '<em><b>Is List Translatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is List Translatable</em>' attribute.
	 * @see #setIsListTranslatable(boolean)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getTextListParam_IsListTranslatable()
	 * @model
	 * @generated
	 */
	boolean isIsListTranslatable();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.TextListParam#isIsListTranslatable <em>Is List Translatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is List Translatable</em>' attribute.
	 * @see #isIsListTranslatable()
	 * @generated
	 */
	void setIsListTranslatable(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns an XQuery LET clause representing the list <code>values</code>.
	 * 
	 * @return an XQuery LET clause representing the list <code>values</code>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getListDeclaration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addStringValue(String value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the XQuery variable representing the list <code>values</code>.
	 * 
	 * @return the XQuery variable representing the list <code>values</code>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getListVar();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper" newValueMany="true"
	 * @generated
	 */
	void setValueIfValid(EList<String> newValue) throws InvalidityException;
} // TextList
