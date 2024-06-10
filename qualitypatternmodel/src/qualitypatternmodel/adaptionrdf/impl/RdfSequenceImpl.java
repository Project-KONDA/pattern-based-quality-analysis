/**
 */
package qualitypatternmodel.adaptionrdf.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import qualitypatternmodel.adaptionrdf.AdaptionrdfPackage;
import qualitypatternmodel.adaptionrdf.RdfPathComponent;
import qualitypatternmodel.adaptionrdf.RdfSequence;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.utility.Constants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rdf Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfSequenceImpl#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RdfSequenceImpl extends RdfPathComponentImpl implements RdfSequence {
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<RdfPathComponent> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected RdfSequenceImpl() {
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
				query += "/";
			String itemQuery = getItems().get(i).generateSparql(); 
			if (itemQuery == null)
				return null;
			query += itemQuery;
		}
		
		
		query += ")" + getQuantifier().getLiteral();
		
		return query;
	}

	@Override
	public String getValueAsString() {
		JSONArray jarr = new JSONArray();
		for (RdfPathComponent component: getItems())
			jarr.put(component.getValueAsString());
		JSONObject jobj = new JSONObject();
		try {
			jobj.put(Constants.JSON_RDF_PATH_SEQUENCE, jarr);
		} catch (JSONException e) {
		}
		return jobj.toString();
	}

	@Override
	public void setValueFromString(String value) throws InvalidityException {
		try {
			JSONObject jobj = new JSONObject(value);
			if (!jobj.has(Constants.JSON_RDF_PATH_SEQUENCE))
				throw new InvalidityException(Constants.INVALID_VALUE);
			JSONArray arr = jobj.getJSONArray(Constants.JSON_RDF_PATH_SEQUENCE);
			if (arr.length() < 2)
				throw new InvalidityException("Not enough arguments for Rdf Sequence: '" + value + "'");
			ArrayList<RdfPathComponent> newItems = new ArrayList<RdfPathComponent>();
	        for (int i = 0; i < arr.length(); i++)
	        	newItems.add(RdfPathComponent.createNewRdfPathComponent(arr.get(i).toString()));
	        	
			getItems().clear();
			getItems().addAll(newItems);
		} catch (Exception e) {
			throw new InvalidityException(Constants.INVALID_VALUE + ": " + value, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionrdfPackage.Literals.RDF_SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RdfPathComponent> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<RdfPathComponent>(RdfPathComponent.class, this, AdaptionrdfPackage.RDF_SEQUENCE__ITEMS);
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
			case AdaptionrdfPackage.RDF_SEQUENCE__ITEMS:
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
			case AdaptionrdfPackage.RDF_SEQUENCE__ITEMS:
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
			case AdaptionrdfPackage.RDF_SEQUENCE__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends RdfPathComponent>)newValue);
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
			case AdaptionrdfPackage.RDF_SEQUENCE__ITEMS:
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
			case AdaptionrdfPackage.RDF_SEQUENCE__ITEMS:
				return items != null && !items.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public EList<RdfSinglePredicate> getRdfSinglePredicates() {
		EList<RdfSinglePredicate> list = new BasicEList<RdfSinglePredicate>();
		for(RdfPathComponent item : getItems()) {
			list.addAll(item.getRdfSinglePredicates());
		}
		return list;
	}

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (getItems().size() < 2)
			throw new InvalidityException("RdfSequence " + getId() + " contains not enough items");
	}

	@Override
	public String myToString() {
		String result = "RdfSequence [" + getId() + "] (";
		for (int i = 0; i < getItems().size(); i++){
			if (i > 0) result += ", ";
			result += getItems().get(i).myToString();
		}
		result += ")";
		return result;
	}

} //RdfSequenceImpl
