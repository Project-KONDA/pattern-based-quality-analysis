/**
 */
package qualitypatternmodel.execution.impl;

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
import qualitypatternmodel.execution.XmlDatabase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Databases</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.execution.impl.DatabasesImpl#getXmlDatabases <em>Xml Databases</em>}</li>
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
	protected EList<XmlDatabase> xmlDatabases;
	
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
	public EList<XmlDatabase> getXmlDatabases() {
		if (xmlDatabases == null) {
			xmlDatabases = new EObjectContainmentEList<XmlDatabase>(XmlDatabase.class, this, ExecutionPackage.DATABASES__XML_DATABASES);
		}
		return xmlDatabases;
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
				getXmlDatabases().addAll((Collection<? extends XmlDatabase>)newValue);
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
		}
		return super.eIsSet(featureID);
	}

} //DatabasesImpl
