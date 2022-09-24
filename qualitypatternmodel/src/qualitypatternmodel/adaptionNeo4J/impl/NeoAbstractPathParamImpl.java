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

import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.parameters.impl.ParameterImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo Abstract Path Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoAbstractPathParamImpl#getInnerEdgeCount <em>Inner Edge Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NeoAbstractPathParamImpl extends ParameterImpl implements NeoAbstractPathParam {
	/**
	 * The default value of the '{@link #getInnerEdgeCount() <em>Inner Edge Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerEdgeCount()
	 * @generated
	 * @ordered
	 */
	protected static final int INNER_EDGE_COUNT_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getInnerEdgeCount() <em>Inner Edge Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerEdgeCount()
	 * @generated
	 * @ordered
	 */
	protected int innerEdgeCount = INNER_EDGE_COUNT_EDEFAULT;

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
	public int getInnerEdgeCount() {
		return innerEdgeCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInnerEdgeCount(int newInnerEdgeCount) {
		int oldInnerEdgeCount = innerEdgeCount;
		innerEdgeCount = newInnerEdgeCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_ABSTRACT_PATH_PARAM__INNER_EDGE_COUNT, oldInnerEdgeCount, innerEdgeCount));
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
	public void increaseInnerEdgeCount() {
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
	public void createParameters() {
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
	public void removeParametersFromParameterList() {
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
			case AdaptionNeo4JPackage.NEO_ABSTRACT_PATH_PARAM__INNER_EDGE_COUNT:
				return getInnerEdgeCount();
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
			case AdaptionNeo4JPackage.NEO_ABSTRACT_PATH_PARAM__INNER_EDGE_COUNT:
				setInnerEdgeCount((Integer)newValue);
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
			case AdaptionNeo4JPackage.NEO_ABSTRACT_PATH_PARAM__INNER_EDGE_COUNT:
				setInnerEdgeCount(INNER_EDGE_COUNT_EDEFAULT);
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
			case AdaptionNeo4JPackage.NEO_ABSTRACT_PATH_PARAM__INNER_EDGE_COUNT:
				return innerEdgeCount != INNER_EDGE_COUNT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Adaptable.class) {
			switch (baseOperationID) {
				case GraphstructurePackage.ADAPTABLE___CREATE_PARAMETERS: return AdaptionNeo4JPackage.NEO_ABSTRACT_PATH_PARAM___CREATE_PARAMETERS;
				case GraphstructurePackage.ADAPTABLE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST: return AdaptionNeo4JPackage.NEO_ABSTRACT_PATH_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case AdaptionNeo4JPackage.NEO_ABSTRACT_PATH_PARAM___INCREASE_INNER_EDGE_COUNT:
				increaseInnerEdgeCount();
				return null;
			case AdaptionNeo4JPackage.NEO_ABSTRACT_PATH_PARAM___CREATE_PARAMETERS:
				createParameters();
				return null;
			case AdaptionNeo4JPackage.NEO_ABSTRACT_PATH_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST:
				removeParametersFromParameterList();
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
		result.append(" (innerEdgeCount: ");
		result.append(innerEdgeCount);
		result.append(')');
		return result.toString();
	}

} //NeoAbstractPathParamImpl
