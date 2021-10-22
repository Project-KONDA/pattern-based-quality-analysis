/**
 */
package qualitypatternmodel.execution.impl;

import java.io.IOException;
import org.basex.core.BaseXException;
import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.execution.BaseXClient;
import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.ServerXmlDataDatabase;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.execution.impl.BaseXClientImpl.Query;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server Xml Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.execution.impl.ServerXmlDataDatabaseImpl#getBaseXClient <em>Base XClient</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.ServerXmlDataDatabaseImpl#getLocalName <em>Local Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerXmlDataDatabaseImpl extends XmlDataDatabaseImpl implements ServerXmlDataDatabase {
	/**
	 * The cached value of the '{@link #getBaseXClient() <em>Base XClient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseXClient()
	 * @generated
	 * @ordered
	 */
	protected BaseXClient baseXClient;

	/**
	 * The default value of the '{@link #getLocalName() <em>Local Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalName()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLocalName() <em>Local Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalName()
	 * @generated
	 * @ordered
	 */
	protected String localName = LOCAL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerXmlDataDatabaseImpl() {
		super();
	}
	
	public ServerXmlDataDatabaseImpl(String localName, String host, int port, String name, String username, String password) throws IOException, InvalidityException {
		super();
		for(XmlDataDatabase db : DatabasesImpl.getInstance().getXmlDatabases()) {
			if(db instanceof ServerXmlDataDatabaseImpl) {
				ServerXmlDataDatabaseImpl serverDb = (ServerXmlDataDatabaseImpl) db;	
				if(serverDb.getLocalName() != null && serverDb.getLocalName().equals(localName)) {
					throw new InvalidityException("Local database name already used");
				}
			}			
		}
		setLocalName(localName);
		setName(name);
		setBaseXClient(new BaseXClientImpl(host, port, username, password));		
	}
	
	@Override
	public void init() throws QueryException, IOException {
//		open();
		// TODO
		analyse();		
	}
	
	@Override
	public EList<String> execute(String queryString) throws QueryException, QueryIOException, BaseXException, IOException {	
		EList<String> resultList = new BasicEList<String>();
		getBaseXClient().execute("OPEN " + getName());
		Query query = getBaseXClient().query(queryString);		
        while(query.more()) {
        	resultList.add(query.next());
        } 			
        return resultList;		
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
	public NotificationChain basicSetBaseXClient(BaseXClient newBaseXClient, NotificationChain msgs) {
		BaseXClient oldBaseXClient = baseXClient;
		baseXClient = newBaseXClient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutionPackage.SERVER_XML_DATA_DATABASE__BASE_XCLIENT, oldBaseXClient, newBaseXClient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseXClient(BaseXClient newBaseXClient) {
		if (newBaseXClient != baseXClient) {
			NotificationChain msgs = null;
			if (baseXClient != null)
				msgs = ((InternalEObject)baseXClient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutionPackage.SERVER_XML_DATA_DATABASE__BASE_XCLIENT, null, msgs);
			if (newBaseXClient != null)
				msgs = ((InternalEObject)newBaseXClient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutionPackage.SERVER_XML_DATA_DATABASE__BASE_XCLIENT, null, msgs);
			msgs = basicSetBaseXClient(newBaseXClient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.SERVER_XML_DATA_DATABASE__BASE_XCLIENT, newBaseXClient, newBaseXClient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalName() {
		return localName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalName(String newLocalName) {
		String oldLocalName = localName;
		localName = newLocalName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.SERVER_XML_DATA_DATABASE__LOCAL_NAME, oldLocalName, localName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutionPackage.SERVER_XML_DATA_DATABASE__BASE_XCLIENT:
				return basicSetBaseXClient(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case ExecutionPackage.SERVER_XML_DATA_DATABASE__LOCAL_NAME:
				return getLocalName();
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
			case ExecutionPackage.SERVER_XML_DATA_DATABASE__LOCAL_NAME:
				setLocalName((String)newValue);
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
				setBaseXClient((BaseXClient)null);
				return;
			case ExecutionPackage.SERVER_XML_DATA_DATABASE__LOCAL_NAME:
				setLocalName(LOCAL_NAME_EDEFAULT);
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
				return baseXClient != null;
			case ExecutionPackage.SERVER_XML_DATA_DATABASE__LOCAL_NAME:
				return LOCAL_NAME_EDEFAULT == null ? localName != null : !LOCAL_NAME_EDEFAULT.equals(localName);
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
		result.append(" (localName: ");
		result.append(localName);
		result.append(')');
		return result.toString();
	}

} //ServerXmlDatabaseImpl
