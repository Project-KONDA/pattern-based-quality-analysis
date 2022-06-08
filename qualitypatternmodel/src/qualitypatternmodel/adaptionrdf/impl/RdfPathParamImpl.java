/**
 */
package qualitypatternmodel.adaptionrdf.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import qualitypatternmodel.adaptionrdf.AdaptionrdfPackage;
import qualitypatternmodel.adaptionrdf.RdfAxisPair;
import qualitypatternmodel.adaptionrdf.RdfPathParam;

import qualitypatternmodel.adaptionrdf.RdfPredicate;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.impl.ParameterImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rdf Path Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfPathParamImpl#getRdfAxisPair <em>Rdf Axis Pair</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfPathParamImpl#getRdfPredicate <em>Rdf Predicate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RdfPathParamImpl extends ParameterImpl implements RdfPathParam {
	/**
	 * The cached value of the '{@link #getRdfAxisPair() <em>Rdf Axis Pair</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdfAxisPair()
	 * @generated
	 * @ordered
	 */
	protected EList<RdfAxisPair> rdfAxisPair;
	/**
	 * The cached value of the '{@link #getRdfPredicate() <em>Rdf Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdfPredicate()
	 * @generated
	 * @ordered
	 */
	protected RdfPredicate rdfPredicate;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdfPathParamImpl() {
		super();
	}
	
	@Override
	public String generateSparql() throws InvalidityException {
		String query = "";
		int i = 0;
		for(RdfAxisPair p : getRdfAxisPair()) {
			if(i > 0) {
				query += "/";
			}
			query += p.generateSparql(); 
			i++;
		}
		// TODO
		return query;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionrdfPackage.Literals.RDF_PATH_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RdfAxisPair> getRdfAxisPair() {
		if (rdfAxisPair == null) {
			rdfAxisPair = new EObjectContainmentWithInverseEList<RdfAxisPair>(RdfAxisPair.class, this, AdaptionrdfPackage.RDF_PATH_PARAM__RDF_AXIS_PAIR, AdaptionrdfPackage.RDF_AXIS_PAIR__RDF_PATH_PARAM);
		}
		return rdfAxisPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RdfPredicate getRdfPredicate() {
		if (rdfPredicate != null && rdfPredicate.eIsProxy()) {
			InternalEObject oldRdfPredicate = (InternalEObject)rdfPredicate;
			rdfPredicate = (RdfPredicate)eResolveProxy(oldRdfPredicate);
			if (rdfPredicate != oldRdfPredicate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE, oldRdfPredicate, rdfPredicate));
			}
		}
		return rdfPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdfPredicate basicGetRdfPredicate() {
		return rdfPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRdfPredicate(RdfPredicate newRdfPredicate, NotificationChain msgs) {
		RdfPredicate oldRdfPredicate = rdfPredicate;
		rdfPredicate = newRdfPredicate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE, oldRdfPredicate, newRdfPredicate);
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
	public void setRdfPredicate(RdfPredicate newRdfPredicate) {
		if (newRdfPredicate != rdfPredicate) {
			NotificationChain msgs = null;
			if (rdfPredicate != null)
				msgs = ((InternalEObject)rdfPredicate).eInverseRemove(this, AdaptionrdfPackage.RDF_PREDICATE__RDF_PATH_PARAM, RdfPredicate.class, msgs);
			if (newRdfPredicate != null)
				msgs = ((InternalEObject)newRdfPredicate).eInverseAdd(this, AdaptionrdfPackage.RDF_PREDICATE__RDF_PATH_PARAM, RdfPredicate.class, msgs);
			msgs = basicSetRdfPredicate(newRdfPredicate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE, newRdfPredicate, newRdfPredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void createParameters() {
		ParameterList parameterList = getParameterList();		
		if(parameterList != null) {
			if(getRdfAxisPair().isEmpty()) {
				RdfAxisPair xmlAxisPair = new RdfAxisPairImpl();
				getRdfAxisPair().add(xmlAxisPair);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeParametersFromParameterList() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_AXIS_PAIR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRdfAxisPair()).basicAdd(otherEnd, msgs);
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE:
				if (rdfPredicate != null)
					msgs = ((InternalEObject)rdfPredicate).eInverseRemove(this, AdaptionrdfPackage.RDF_PREDICATE__RDF_PATH_PARAM, RdfPredicate.class, msgs);
				return basicSetRdfPredicate((RdfPredicate)otherEnd, msgs);
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
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_AXIS_PAIR:
				return ((InternalEList<?>)getRdfAxisPair()).basicRemove(otherEnd, msgs);
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE:
				return basicSetRdfPredicate(null, msgs);
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
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_AXIS_PAIR:
				return getRdfAxisPair();
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE:
				if (resolve) return getRdfPredicate();
				return basicGetRdfPredicate();
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
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_AXIS_PAIR:
				getRdfAxisPair().clear();
				getRdfAxisPair().addAll((Collection<? extends RdfAxisPair>)newValue);
				return;
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE:
				setRdfPredicate((RdfPredicate)newValue);
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
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_AXIS_PAIR:
				getRdfAxisPair().clear();
				return;
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE:
				setRdfPredicate((RdfPredicate)null);
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
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_AXIS_PAIR:
				return rdfAxisPair != null && !rdfAxisPair.isEmpty();
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE:
				return rdfPredicate != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Adaptable.class) {
			switch (baseOperationID) {
				case GraphstructurePackage.ADAPTABLE___CREATE_PARAMETERS: return AdaptionrdfPackage.RDF_PATH_PARAM___CREATE_PARAMETERS;
				case GraphstructurePackage.ADAPTABLE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST: return AdaptionrdfPackage.RDF_PATH_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AdaptionrdfPackage.RDF_PATH_PARAM___CREATE_PARAMETERS:
				createParameters();
				return null;
			case AdaptionrdfPackage.RDF_PATH_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST:
				removeParametersFromParameterList();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public boolean inputIsValid() {
		// TODO Auto-generated method stub
		return false;
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

} //RdfPathParamImpl
