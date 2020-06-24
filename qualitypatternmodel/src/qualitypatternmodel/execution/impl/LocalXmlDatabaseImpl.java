/**
 */
package qualitypatternmodel.execution.impl;

import java.lang.reflect.InvocationTargetException;

import org.basex.core.BaseXException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.LocalXmlDatabase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Xml Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.execution.impl.LocalXmlDatabaseImpl#getDataPath <em>Data Path</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.LocalXmlDatabaseImpl#getSchemaPath <em>Schema Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalXmlDatabaseImpl extends XmlDatabaseImpl implements LocalXmlDatabase {
	/**
	 * The default value of the '{@link #getDataPath() <em>Data Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPath()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataPath() <em>Data Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPath()
	 * @generated
	 * @ordered
	 */
	protected String dataPath = DATA_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchemaPath() <em>Schema Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaPath()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemaPath() <em>Schema Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaPath()
	 * @generated
	 * @ordered
	 */
	protected String schemaPath = SCHEMA_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalXmlDatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.LOCAL_XML_DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataPath() {
		return dataPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataPath(String newDataPath) {
		String oldDataPath = dataPath;
		dataPath = newDataPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.LOCAL_XML_DATABASE__DATA_PATH, oldDataPath, dataPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSchemaPath() {
		return schemaPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchemaPath(String newSchemaPath) {
		String oldSchemaPath = schemaPath;
		schemaPath = newSchemaPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.LOCAL_XML_DATABASE__SCHEMA_PATH, oldSchemaPath, schemaPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void create() throws BaseXException {
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
			case ExecutionPackage.LOCAL_XML_DATABASE__DATA_PATH:
				return getDataPath();
			case ExecutionPackage.LOCAL_XML_DATABASE__SCHEMA_PATH:
				return getSchemaPath();
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
			case ExecutionPackage.LOCAL_XML_DATABASE__DATA_PATH:
				setDataPath((String)newValue);
				return;
			case ExecutionPackage.LOCAL_XML_DATABASE__SCHEMA_PATH:
				setSchemaPath((String)newValue);
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
			case ExecutionPackage.LOCAL_XML_DATABASE__DATA_PATH:
				setDataPath(DATA_PATH_EDEFAULT);
				return;
			case ExecutionPackage.LOCAL_XML_DATABASE__SCHEMA_PATH:
				setSchemaPath(SCHEMA_PATH_EDEFAULT);
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
			case ExecutionPackage.LOCAL_XML_DATABASE__DATA_PATH:
				return DATA_PATH_EDEFAULT == null ? dataPath != null : !DATA_PATH_EDEFAULT.equals(dataPath);
			case ExecutionPackage.LOCAL_XML_DATABASE__SCHEMA_PATH:
				return SCHEMA_PATH_EDEFAULT == null ? schemaPath != null : !SCHEMA_PATH_EDEFAULT.equals(schemaPath);
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
			case ExecutionPackage.LOCAL_XML_DATABASE___CREATE:
				try {
					create();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
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
		result.append(" (dataPath: ");
		result.append(dataPath);
		result.append(", schemaPath: ");
		result.append(schemaPath);
		result.append(')');
		return result.toString();
	}

} //LocalXmlDatabaseImpl
