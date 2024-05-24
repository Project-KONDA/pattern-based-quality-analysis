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
import qualitypatternmodel.adaptionrdf.RdfPathParam;
import qualitypatternmodel.adaptionrdf.RdfPathPart;
import qualitypatternmodel.adaptionrdf.RdfPredicate;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.parameters.impl.ParameterImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.utility.ConstantsRdf;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rdf Path Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfPathParamImpl#getRdfPredicate <em>Rdf Predicate</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfPathParamImpl#getRdfPathParts <em>Rdf Path Parts</em>}</li>
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
	 * The cached value of the '{@link #getRdfPathParts() <em>Rdf Path Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdfPathParts()
	 * @generated
	 * @ordered
	 */
	protected EList<RdfPathPart> rdfPathParts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected RdfPathParamImpl() {
		super();
		getRdfPathParts().add(new RdfPathPartImpl());
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
		EList<RdfPathPart> parts =  getRdfPathParts();
		int size = parts.size();
		
		String[] vars = new String[size+1];
		String[] sparqlparts = new String[size];
		String sparql = "";
		
		vars[0] = getRdfPredicate().getSource().generateSparql();
		vars[vars.length-1] = getRdfPredicate().getTarget().generateSparql();
		for (int i = 1; i < vars.length-1; i++){
			vars[i] = ConstantsRdf.TEMPVAR + getRdfPredicate().getInternalId() + "_" + i;
		}
		
		for (int i = 0; i < sparqlparts.length; i++){
			sparqlparts[i] = parts.get(i).generateSparql();
		} 
		
		for (int i = 0; i < sparqlparts.length; i++){
			sparql += "\n" + vars[i] + " " + sparqlparts[i] + " " + vars[i+1] + ".";
			sparql += parts.get(i).generateRdfPartTypes(vars[i+1]);
		} 		
				
		if (sparql == "") {
			sparql = super.generateSparql(); 
		}
		return sparql;
	}

	/**
	 * <!-- begin-user-doc -->S
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
	public EList<RdfPathPart> getRdfPathParts() {
		if (rdfPathParts == null) {
			rdfPathParts = new EObjectContainmentWithInverseEList<RdfPathPart>(RdfPathPart.class, this, AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PATH_PARTS, AdaptionrdfPackage.RDF_PATH_PART__RDF_PATH_PARAM);
		}
		return rdfPathParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setRdfPathPart(RdfPathPart path) {	
		getRdfPathParts().clear();
		addRdfPart(path);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void addRdfPart(RdfPathPart path) {
		getRdfPathParts().add(path);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void createParameters() {
		RdfPathPart part = new RdfPathPartImpl();
		setRdfPathPart(part);
		RdfSinglePredicate rsp = new RdfSinglePredicateImpl();
		part.setRdfPath(rsp);		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void removeParametersFromParameterList() {
		setParameterList(null);
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
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE:
				if (rdfPredicate != null)
					msgs = ((InternalEObject)rdfPredicate).eInverseRemove(this, AdaptionrdfPackage.RDF_PREDICATE__RDF_PATH_PARAM, RdfPredicate.class, msgs);
				return basicSetRdfPredicate((RdfPredicate)otherEnd, msgs);
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PATH_PARTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRdfPathParts()).basicAdd(otherEnd, msgs);
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
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PATH_PARTS:
				return ((InternalEList<?>)getRdfPathParts()).basicRemove(otherEnd, msgs);
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
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PATH_PARTS:
				return getRdfPathParts();
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
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE:
				setRdfPredicate((RdfPredicate)newValue);
				return;
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PATH_PARTS:
				getRdfPathParts().clear();
				getRdfPathParts().addAll((Collection<? extends RdfPathPart>)newValue);
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
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PATH_PARTS:
				getRdfPathParts().clear();
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
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PATH_PARTS:
				return rdfPathParts != null && !rdfPathParts.isEmpty();
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
			case AdaptionrdfPackage.RDF_PATH_PARAM___SET_RDF_PATH_PART__RDFPATHPART:
				setRdfPathPart((RdfPathPart)arguments.get(0));
				return null;
			case AdaptionrdfPackage.RDF_PATH_PARAM___ADD_RDF_PART__RDFPATHPART:
				addRdfPart((RdfPathPart)arguments.get(0));
				return null;
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
			for (RdfPathPart part: getRdfPathParts())
				part.isValid(AbstractionLevel.CONCRETE);
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
		for (RdfPathPart part: getRdfPathParts()) {
			result += "-";
			try {
				result += part.generateSparql() + " ";
			} catch (InvalidityException e) {
			}
		}
		return result;
	}

} //RdfPathParamImpl
