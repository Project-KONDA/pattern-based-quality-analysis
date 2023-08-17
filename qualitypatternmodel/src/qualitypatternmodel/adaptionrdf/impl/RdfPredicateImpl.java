/**
 */
package qualitypatternmodel.adaptionrdf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.adaptionrdf.AdaptionrdfPackage;
import qualitypatternmodel.adaptionrdf.RdfPathParam;
import qualitypatternmodel.adaptionrdf.RdfPredicate;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.impl.RelationImpl;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rdf Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfPredicateImpl#getRdfPathParam <em>Rdf Path Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RdfPredicateImpl extends RelationImpl implements RdfPredicate {
	/**
	 * The cached value of the '{@link #getRdfPathParam() <em>Rdf Path Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdfPathParam()
	 * @generated
	 * @ordered
	 */
	protected RdfPathParam rdfPathParam;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RdfPredicateImpl() {
		super();
	}
		
	@Override
	public PatternElement createRdfAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return this;
	}
	
	
	@Override
	public String generateSparql() throws InvalidityException {
		String query = "";
		if(!translated) {
			translated = true;
			query = getRdfPathParam().generateSparql();
			if(getTarget() instanceof ComplexNode) {
				ComplexNode complexNode = (ComplexNode) getTarget();
				for(Relation relation : complexNode.getOutgoing()) {
					query += relation.generateSparql();
				}
			}
		}
		return query;
	}
	
	@Override
	public void createParameters() {
		ParameterList parameterList = getParameterList();
		if(parameterList != null) {
			RdfPathParam pp = getRdfPathParam();
			if (pp == null) {
				pp = new RdfPathParamImpl();
				setRdfPathParam(pp);
				parameterList.add(pp);
			}
			if (!parameterList.equals(pp.getParameterList())){
				parameterList.add(pp);
			}
		}
	}
	
	@Override
	public EList<Parameter> getAllParameters() throws InvalidityException {
		EList<Parameter> res = new BasicEList<Parameter>();		
		if (rdfPathParam != null) {
			res.addAll(rdfPathParam.getAllParameters());
		} else {
			throw new InvalidityException("rdfPathParam missing on " + this + " " + getName());
		}
		return res;
	}	
	
	@Override
	public NotificationChain basicSetGraph(Graph newGraph, NotificationChain msgs) {		
		NotificationChain res = super.basicSetGraph(newGraph, msgs);		
		createParameters();
		return res;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionrdfPackage.Literals.RDF_PREDICATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RdfPathParam getRdfPathParam() {
		if (rdfPathParam != null && rdfPathParam.eIsProxy()) {
			InternalEObject oldRdfPathParam = (InternalEObject)rdfPathParam;
			rdfPathParam = (RdfPathParam)eResolveProxy(oldRdfPathParam);
			if (rdfPathParam != oldRdfPathParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionrdfPackage.RDF_PREDICATE__RDF_PATH_PARAM, oldRdfPathParam, rdfPathParam));
			}
		}
		return rdfPathParam;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdfPathParam basicGetRdfPathParam() {
		return rdfPathParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRdfPathParam(RdfPathParam newRdfPathParam) {
		if (newRdfPathParam != rdfPathParam) {
			NotificationChain msgs = null;
			if (rdfPathParam != null)
				msgs = ((InternalEObject)rdfPathParam).eInverseRemove(this, AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE, RdfPathParam.class, msgs);
			if (newRdfPathParam != null)
				msgs = ((InternalEObject)newRdfPathParam).eInverseAdd(this, AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE, RdfPathParam.class, msgs);
			msgs = basicSetRdfPathParam(newRdfPathParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_PREDICATE__RDF_PATH_PARAM, newRdfPathParam, newRdfPathParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetRdfPathParam(RdfPathParam newRdfPathParam, NotificationChain msgs) {
		RdfPathParam oldRdfPathParam = rdfPathParam;
		rdfPathParam = newRdfPathParam;
		
		createParameters();
		
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_PREDICATE__RDF_PATH_PARAM, oldRdfPathParam, newRdfPathParam);
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionrdfPackage.RDF_PREDICATE__RDF_PATH_PARAM:
				if (rdfPathParam != null)
					msgs = ((InternalEObject)rdfPathParam).eInverseRemove(this, AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE, RdfPathParam.class, msgs);
				return basicSetRdfPathParam((RdfPathParam)otherEnd, msgs);
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
			case AdaptionrdfPackage.RDF_PREDICATE__RDF_PATH_PARAM:
				return basicSetRdfPathParam(null, msgs);
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
			case AdaptionrdfPackage.RDF_PREDICATE__RDF_PATH_PARAM:
				if (resolve) return getRdfPathParam();
				return basicGetRdfPathParam();
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
			case AdaptionrdfPackage.RDF_PREDICATE__RDF_PATH_PARAM:
				setRdfPathParam((RdfPathParam)newValue);
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
			case AdaptionrdfPackage.RDF_PREDICATE__RDF_PATH_PARAM:
				setRdfPathParam((RdfPathParam)null);
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
			case AdaptionrdfPackage.RDF_PREDICATE__RDF_PATH_PARAM:
				return rdfPathParam != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public String myToString() {
		String result = super.myToString();
		if (getRdfPathParam() != null) 
			result += " " + getRdfPathParam().myToString();
		return result;
	}

} //RdfPredicateImpl
