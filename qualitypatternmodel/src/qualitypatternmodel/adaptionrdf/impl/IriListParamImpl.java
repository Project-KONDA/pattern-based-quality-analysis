/**
 */
package qualitypatternmodel.adaptionrdf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.adaptionrdf.AdaptionrdfPackage;
import qualitypatternmodel.adaptionrdf.IriListParam;
import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.parameters.impl.ParameterValueImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iri List Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.IriListParamImpl#getIriParam <em>Iri Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IriListParamImpl extends ParameterValueImpl implements IriListParam {
	/**
	 * The cached value of the '{@link #getIriParam() <em>Iri Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIriParam()
	 * @generated
	 * @ordered
	 */
	protected EList<IriParam> iriParam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IriListParamImpl() {
		super();
	}
	
	@Override
	public String generateSparql() throws InvalidityException {
		String query = "";
		int i = 0;
		for(IriParam p : getIriParam()) {
			if (i>0) {
				query += ", ";
			}
			query += p.generateSparql();
			i++;
		}
		return query;		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionrdfPackage.Literals.IRI_LIST_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IriParam> getIriParam() {
		if (iriParam == null) {
			iriParam = new EObjectContainmentWithInverseEList<IriParam>(IriParam.class, this, AdaptionrdfPackage.IRI_LIST_PARAM__IRI_PARAM, AdaptionrdfPackage.IRI_PARAM__IRI_LIST_PARAM);
		}
		return iriParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionrdfPackage.IRI_LIST_PARAM__IRI_PARAM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIriParam()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionrdfPackage.IRI_LIST_PARAM__IRI_PARAM:
				return ((InternalEList<?>)getIriParam()).basicRemove(otherEnd, msgs);
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
			case AdaptionrdfPackage.IRI_LIST_PARAM__IRI_PARAM:
				return getIriParam();
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
			case AdaptionrdfPackage.IRI_LIST_PARAM__IRI_PARAM:
				getIriParam().clear();
				getIriParam().addAll((Collection<? extends IriParam>)newValue);
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
			case AdaptionrdfPackage.IRI_LIST_PARAM__IRI_PARAM:
				getIriParam().clear();
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
			case AdaptionrdfPackage.IRI_LIST_PARAM__IRI_PARAM:
				return iriParam != null && !iriParam.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String generateDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String myToString() {
		// TODO Auto-generated method stub
		return null;
	}

} //IriListParamImpl
