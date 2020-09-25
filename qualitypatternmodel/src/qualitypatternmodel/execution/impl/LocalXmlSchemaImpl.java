/**
 */
package qualitypatternmodel.execution.impl;

import java.lang.reflect.InvocationTargetException;
import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.CreateDB;
import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.LocalXmlSchema;
import qualitypatternmodel.utilityclasses.Constants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Xml Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.execution.impl.LocalXmlSchemaImpl#getSchemaPath <em>Schema Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalXmlSchemaImpl extends XmlSchemaImpl implements LocalXmlSchema {
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
	protected LocalXmlSchemaImpl() {
		super();
	}
	
	public LocalXmlSchemaImpl(String path) {
		super();
		setSchemaPath(path);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void createSchemaDatabase() throws BaseXException {
		new CreateDB(name, schemaPath).execute(schemaContext);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void initSchemaDatabase() throws BaseXException, QueryException, QueryIOException {
		schemaContext = new Context();
		createSchemaDatabase(); // TODO: optional
		analyseSchema();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.LOCAL_XML_SCHEMA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.LOCAL_XML_SCHEMA__SCHEMA_PATH, oldSchemaPath, schemaPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutionPackage.LOCAL_XML_SCHEMA__SCHEMA_PATH:
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
			case ExecutionPackage.LOCAL_XML_SCHEMA__SCHEMA_PATH:
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
			case ExecutionPackage.LOCAL_XML_SCHEMA__SCHEMA_PATH:
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
			case ExecutionPackage.LOCAL_XML_SCHEMA__SCHEMA_PATH:
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
			case ExecutionPackage.LOCAL_XML_SCHEMA___CREATE_SCHEMA_DATABASE:
				try {
					createSchemaDatabase();
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
		result.append(" (schemaPath: ");
		result.append(schemaPath);
		result.append(')');
		return result.toString();
	}

} //LocalXmlSchemaImpl
