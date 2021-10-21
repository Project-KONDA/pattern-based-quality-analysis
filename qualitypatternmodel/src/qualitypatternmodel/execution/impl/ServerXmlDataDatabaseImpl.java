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
import qualitypatternmodel.execution.BaseXClient;
import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.ServerXmlDataDatabase;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerXmlDataDatabaseImpl() {
		super();
	}
	
	public ServerXmlDataDatabaseImpl(String name, String host, int port, String username, String password) throws IOException {
		super();
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
				setBaseXClient((BaseXClient)null);
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
		}
		return super.eIsSet(featureID);
	}

} //ServerXmlDatabaseImpl
