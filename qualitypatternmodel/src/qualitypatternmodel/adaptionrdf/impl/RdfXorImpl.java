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
import qualitypatternmodel.adaptionrdf.RdfPathPart;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.adaptionrdf.RdfXor;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.AbstractionLevel;

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
public class RdfXorImpl extends RdfPathPartImpl implements RdfXor {
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<RdfPathPart> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected RdfXorImpl() {
		super();
		getItems().add(new RdfSinglePredicateImpl());
		getItems().add(new RdfSinglePredicateImpl());
	}
	
	@Override
	public String generateSparql() throws InvalidityException {
		if (getItems().size() < 2)
			return null;
		String query = (invert ? "^" : "" ) + "(";
		for (int i = 0; i < getItems().size(); i++) {
			if(i > 0)
				query += "|";
			String itemQuery = getItems().get(i).generateSparql(); 
			if (itemQuery == null)
				return null;
			query += itemQuery;
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
	public EList<RdfPathPart> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<RdfPathPart>(RdfPathPart.class, this, AdaptionrdfPackage.RDF_XOR__ITEMS);
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
				getItems().addAll((Collection<? extends RdfPathPart>)newValue);
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
	public EList<RdfSinglePredicate> getRdfSinglePredicates() {
		EList<RdfSinglePredicate> list = new BasicEList<RdfSinglePredicate>();
		for(RdfPathPart item : getItems()) {
			list.addAll(item.getRdfSinglePredicates());
		}
		return list;
	}

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String myToString() {
		String result = "RdfXor [" + getId() + "] (";
		for (int i = 0; i < getItems().size(); i++){
			if (i > 0) result += ", ";
			result += getItems().get(i).myToString();
		}
		result += ")";
		return result;
	}

} //RdfXorImpl
