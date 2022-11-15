/**
 */
package qualitypatternmodel.adaptionrdf.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.adaptionrdf.AdaptionrdfPackage;
import qualitypatternmodel.adaptionrdf.RdfPathParam;
import qualitypatternmodel.adaptionrdf.RdfPathPart;
import qualitypatternmodel.adaptionrdf.RdfPredicate;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.parameters.impl.ParameterImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rdf Path Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfPathParamImpl#getRdfPredicate <em>Rdf Predicate</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfPathParamImpl#getRdfPathPart <em>Rdf Path Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RdfPathParamImpl extends ParameterImpl implements RdfPathParam {
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
	 * The cached value of the '{@link #getRdfPathPart() <em>Rdf Path Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdfPathPart()
	 * @generated
	 * @ordered
	 */
	protected RdfPathPart rdfPathPart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected RdfPathParamImpl() {
		super();
		setRdfPathPart(new RdfSinglePredicateImpl());
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
	
	@Override
	public String generateSparql() throws InvalidityException {
		String sparql = getRdfPathPart().generateSparql();
		if (sparql == null) {
			sparql = super.generateSparql(); 
//			try {
//			} catch (InvalidityException e) {
//				throw new InvalidityException("RdfPathParam not (fully) concretized or no ParameterReference defined :" + e.getMessage());
//			}
		}
		return sparql;
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
	 * @generated NOT
	 */
	public NotificationChain basicSetRdfPredicate(RdfPredicate newRdfPredicate, NotificationChain msgs) {
		triggerParameterUpdates(newRdfPredicate);
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
	 * @generated
	 */
	@Override
	public RdfPathPart getRdfPathPart() {
		return rdfPathPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRdfPathPart(RdfPathPart newRdfPathPart, NotificationChain msgs) {
		RdfPathPart oldRdfPathPart = rdfPathPart;
		rdfPathPart = newRdfPathPart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PATH_PART, oldRdfPathPart, newRdfPathPart);
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
	public void setRdfPathPart(RdfPathPart newRdfPathPart) {
		if (newRdfPathPart != rdfPathPart) {
			NotificationChain msgs = null;
			if (rdfPathPart != null)
				msgs = ((InternalEObject)rdfPathPart).eInverseRemove(this, AdaptionrdfPackage.RDF_PATH_PART__RDF_PATH_PARAM, RdfPathPart.class, msgs);
			if (newRdfPathPart != null)
				msgs = ((InternalEObject)newRdfPathPart).eInverseAdd(this, AdaptionrdfPackage.RDF_PATH_PART__RDF_PATH_PARAM, RdfPathPart.class, msgs);
			msgs = basicSetRdfPathPart(newRdfPathPart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PATH_PART, newRdfPathPart, newRdfPathPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void createParameters() {
		RdfSinglePredicate rsp = new RdfSinglePredicateImpl();
		setRdfPathPart(rsp);
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE:
				if (rdfPredicate != null)
					msgs = ((InternalEObject)rdfPredicate).eInverseRemove(this, AdaptionrdfPackage.RDF_PREDICATE__RDF_PATH_PARAM, RdfPredicate.class, msgs);
				return basicSetRdfPredicate((RdfPredicate)otherEnd, msgs);
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PATH_PART:
				if (rdfPathPart != null)
					msgs = ((InternalEObject)rdfPathPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PATH_PART, null, msgs);
				return basicSetRdfPathPart((RdfPathPart)otherEnd, msgs);
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
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE:
				return basicSetRdfPredicate(null, msgs);
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PATH_PART:
				return basicSetRdfPathPart(null, msgs);
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
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE:
				if (resolve) return getRdfPredicate();
				return basicGetRdfPredicate();
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PATH_PART:
				return getRdfPathPart();
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
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE:
				setRdfPredicate((RdfPredicate)newValue);
				return;
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PATH_PART:
				setRdfPathPart((RdfPathPart)newValue);
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
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE:
				setRdfPredicate((RdfPredicate)null);
				return;
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PATH_PART:
				setRdfPathPart((RdfPathPart)null);
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
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE:
				return rdfPredicate != null;
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PATH_PART:
				return rdfPathPart != null;
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
		try{
			getRdfPathPart().isValid(AbstractionLevel.CONCRETE);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public String generateDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String myToString() {
		String result = "rdfpath [" + getInternalId() + "] ";
		try {
			result += " " + generateSparql();
		} catch (InvalidityException e) {
		} 
		return result;
	}

} //RdfPathParamImpl
