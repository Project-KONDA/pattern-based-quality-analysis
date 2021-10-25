/**
 */
package qualitypatternmodel.execution.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.execution.Databases;
import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.execution.XmlSchemaDatabase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Databases</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.execution.impl.DatabasesImpl#getXmlDatabases <em>Xml Databases</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.DatabasesImpl#getXmlSchemata <em>Xml Schemata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabasesImpl extends MinimalEObjectImpl.Container implements Databases {
	/**
	 * The cached value of the '{@link #getXmlDatabases() <em>Xml Databases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlDatabases()
	 * @generated
	 * @ordered
	 */
	protected EList<XmlDataDatabase> xmlDatabases;

	/**
	 * The cached value of the '{@link #getXmlSchemata() <em>Xml Schemata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlSchemata()
	 * @generated
	 * @ordered
	 */
	protected EList<XmlSchemaDatabase> xmlSchemata;

	private static DatabasesImpl instance;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private DatabasesImpl() {
		super();
	}
	
	public static DatabasesImpl getInstance() {
		if (DatabasesImpl.instance == null) {
			DatabasesImpl.instance = new DatabasesImpl();
	    }
	    return DatabasesImpl.instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.DATABASES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XmlDataDatabase> getXmlDatabases() {
		if (xmlDatabases == null) {
			xmlDatabases = new EObjectContainmentEList<XmlDataDatabase>(XmlDataDatabase.class, this, ExecutionPackage.DATABASES__XML_DATABASES);
		}
		return xmlDatabases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XmlSchemaDatabase> getXmlSchemata() {
		if (xmlSchemata == null) {
			xmlSchemata = new EObjectContainmentEList<XmlSchemaDatabase>(XmlSchemaDatabase.class, this, ExecutionPackage.DATABASES__XML_SCHEMATA);
		}
		return xmlSchemata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void clear() {
		getXmlDatabases().clear();
		getXmlSchemata().clear();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutionPackage.DATABASES__XML_DATABASES:
				return ((InternalEList<?>)getXmlDatabases()).basicRemove(otherEnd, msgs);
			case ExecutionPackage.DATABASES__XML_SCHEMATA:
				return ((InternalEList<?>)getXmlSchemata()).basicRemove(otherEnd, msgs);
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
			case ExecutionPackage.DATABASES__XML_DATABASES:
				return getXmlDatabases();
			case ExecutionPackage.DATABASES__XML_SCHEMATA:
				return getXmlSchemata();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExecutionPackage.DATABASES__XML_DATABASES:
				getXmlDatabases().clear();
				getXmlDatabases().addAll((Collection<? extends XmlDataDatabase>)newValue);
				return;
			case ExecutionPackage.DATABASES__XML_SCHEMATA:
				getXmlSchemata().clear();
				getXmlSchemata().addAll((Collection<? extends XmlSchemaDatabase>)newValue);
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
			case ExecutionPackage.DATABASES__XML_DATABASES:
				getXmlDatabases().clear();
				return;
			case ExecutionPackage.DATABASES__XML_SCHEMATA:
				getXmlSchemata().clear();
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
			case ExecutionPackage.DATABASES__XML_DATABASES:
				return xmlDatabases != null && !xmlDatabases.isEmpty();
			case ExecutionPackage.DATABASES__XML_SCHEMATA:
				return xmlSchemata != null && !xmlSchemata.isEmpty();
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
			case ExecutionPackage.DATABASES___CLEAR:
				clear();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DatabasesImpl
