/**
 */
package qualitypatternmodel.execution.impl;

import org.basex.core.BaseXException;
import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.ServerXmlDataDatabase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server Xml Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.execution.impl.ServerXmlDataDatabaseImpl#getBaseXClient <em>Base XClient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerXmlDataDatabaseImpl extends XmlDataDatabaseImpl implements ServerXmlDataDatabase {
	/**
	 * The default value of the '{@link #getBaseXClient() <em>Base XClient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseXClient()
	 * @generated
	 * @ordered
	 */
	protected static final BaseXClient BASE_XCLIENT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBaseXClient() <em>Base XClient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseXClient()
	 * @generated
	 * @ordered
	 */
	protected BaseXClient baseXClient = BASE_XCLIENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerXmlDataDatabaseImpl() {
		super();
	}
	
	@Override
	public void init() throws BaseXException, QueryIOException, QueryException {
		open();
		analyse();		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.SERVER_XML_DATA_DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseXClient getBaseXClient() {
		return baseXClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseXClient(BaseXClient newBaseXClient) {
		BaseXClient oldBaseXClient = baseXClient;
		baseXClient = newBaseXClient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.SERVER_XML_DATA_DATABASE__BASE_XCLIENT, oldBaseXClient, baseXClient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutionPackage.SERVER_XML_DATA_DATABASE__BASE_XCLIENT:
				return getBaseXClient();
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
			case ExecutionPackage.SERVER_XML_DATA_DATABASE__BASE_XCLIENT:
				setBaseXClient((BaseXClient)newValue);
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
			case ExecutionPackage.SERVER_XML_DATA_DATABASE__BASE_XCLIENT:
				setBaseXClient(BASE_XCLIENT_EDEFAULT);
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
			case ExecutionPackage.SERVER_XML_DATA_DATABASE__BASE_XCLIENT:
				return BASE_XCLIENT_EDEFAULT == null ? baseXClient != null : !BASE_XCLIENT_EDEFAULT.equals(baseXClient);
		}
		return super.eIsSet(featureID);
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
		result.append(" (baseXClient: ");
		result.append(baseXClient);
		result.append(')');
		return result.toString();
	}

} //ServerXmlDatabaseImpl
