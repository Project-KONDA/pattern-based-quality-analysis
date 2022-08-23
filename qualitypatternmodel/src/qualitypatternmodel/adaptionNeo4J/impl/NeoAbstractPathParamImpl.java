/**
 */
package qualitypatternmodel.adaptionNeo4J.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.NeoAbstractEdge;
import qualitypatternmodel.adaptionNeo4J.NeoAbstractPathParam;

import qualitypatternmodel.parameters.impl.ParameterImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo Abstract Path Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoAbstractPathParamImpl#isReturnElement <em>Return Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NeoAbstractPathParamImpl extends ParameterImpl implements NeoAbstractPathParam {
	/**
	 * The default value of the '{@link #isReturnElement() <em>Return Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturnElement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETURN_ELEMENT_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isReturnElement() <em>Return Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturnElement()
	 * @generated
	 * @ordered
	 */
	protected boolean returnElement = RETURN_ELEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoAbstractPathParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionNeo4JPackage.Literals.NEO_ABSTRACT_PATH_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReturnElement() {
		return returnElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnElement(boolean newReturnElement) {
		boolean oldReturnElement = returnElement;
		returnElement = newReturnElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_ABSTRACT_PATH_PARAM__RETURN_ELEMENT, oldReturnElement, returnElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NeoAbstractEdge> getLastRelations() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsReturnElement(boolean returnElement) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_ABSTRACT_PATH_PARAM__RETURN_ELEMENT:
				return isReturnElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_ABSTRACT_PATH_PARAM__RETURN_ELEMENT:
				setReturnElement((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_ABSTRACT_PATH_PARAM__RETURN_ELEMENT:
				setReturnElement(RETURN_ELEMENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_ABSTRACT_PATH_PARAM__RETURN_ELEMENT:
				return returnElement != RETURN_ELEMENT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AdaptionNeo4JPackage.NEO_ABSTRACT_PATH_PARAM___GET_LAST_RELATIONS:
				return getLastRelations();
			case AdaptionNeo4JPackage.NEO_ABSTRACT_PATH_PARAM___SET_IS_RETURN_ELEMENT__BOOLEAN:
				setIsReturnElement((Boolean)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (returnElement: ");
		result.append(returnElement);
		result.append(')');
		return result.toString();
	}

} //NeoAbstractPathParamImpl
