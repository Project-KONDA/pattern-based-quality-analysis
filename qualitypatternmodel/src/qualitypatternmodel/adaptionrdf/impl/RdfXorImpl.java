/**
 */
package qualitypatternmodel.adaptionrdf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.adaptionrdf.AdaptionrdfPackage;
import qualitypatternmodel.adaptionrdf.RdfPathParam;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.adaptionrdf.RdfXor;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.parameters.ParameterList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rdf Xor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfXorImpl#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RdfXorImpl extends RdfPathParamImpl implements RdfXor {
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<RdfPathParam> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdfXorImpl() {
		super();
	}
	
	@Override
	public String generateSparql() throws InvalidityException {
		String query = (invert ? "^" : "" ) + "(";
		int i = 0;
		for(RdfPathParam p : getItems()) {
			if(i > 0) {
				query += "|";
			}
			query += p.generateSparql(); 
			i++;
		}
		query += ")" + getQuantifier().getLiteral();
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionrdfPackage.Literals.RDF_XOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RdfPathParam> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<RdfPathParam>(RdfPathParam.class, this, AdaptionrdfPackage.RDF_XOR__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionrdfPackage.RDF_XOR__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
			case AdaptionrdfPackage.RDF_XOR__ITEMS:
				return getItems();
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
			case AdaptionrdfPackage.RDF_XOR__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends RdfPathParam>)newValue);
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
			case AdaptionrdfPackage.RDF_XOR__ITEMS:
				getItems().clear();
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
			case AdaptionrdfPackage.RDF_XOR__ITEMS:
				return items != null && !items.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void createParameters() {
		
		ParameterList parameterList = getParameterList();
		if(parameterList != null) {
			if (getItems().isEmpty()) {
				RdfSinglePredicate pp = new RdfSinglePredicateImpl();
				getItems().add(pp);
				parameterList.add(pp);
				pp.createParameters();
				
				RdfSinglePredicate pp2 = new RdfSinglePredicateImpl();
				getItems().add(pp2);
				parameterList.add(pp2);
				pp2.createParameters();
			} else if(getItems().size() == 1) {
				parameterList.add(getItems().get(0));
				
				RdfSinglePredicate pp = new RdfSinglePredicateImpl();
				getItems().add(pp);
				parameterList.add(pp);
				pp.createParameters();
			} else {
				for(RdfPathParam item : getItems()) {
					parameterList.add(item);
				}
			}
		}
		
	}
	
	@Override
	public EList<RdfSinglePredicate> getRdfSinglePredicates() {
		EList<RdfSinglePredicate> list = new BasicEList<RdfSinglePredicate>();
		for(RdfPathParam item : getItems()) {
			list.addAll(item.getRdfSinglePredicates());
		}
		return list;
	}

} //RdfXorImpl
