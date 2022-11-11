/**
 */
package qualitypatternmodel.adaptionrdf.impl;

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
import qualitypatternmodel.adaptionrdf.IriListParam;
import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.adaptionrdf.RdfIriNode;
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
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.IriListParamImpl#getRdfIriNode <em>Rdf Iri Node</em>}</li>
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
	 * The cached value of the '{@link #getRdfIriNode() <em>Rdf Iri Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdfIriNode()
	 * @generated
	 * @ordered
	 */
	protected RdfIriNode rdfIriNode;

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
		if(getIriParam().isEmpty()) {
			return super.generateSparql();
		}
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
	@Override
	public RdfIriNode getRdfIriNode() {
		if (rdfIriNode != null && rdfIriNode.eIsProxy()) {
			InternalEObject oldRdfIriNode = (InternalEObject)rdfIriNode;
			rdfIriNode = (RdfIriNode)eResolveProxy(oldRdfIriNode);
			if (rdfIriNode != oldRdfIriNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionrdfPackage.IRI_LIST_PARAM__RDF_IRI_NODE, oldRdfIriNode, rdfIriNode));
			}
		}
		return rdfIriNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdfIriNode basicGetRdfIriNode() {
		return rdfIriNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRdfIriNode(RdfIriNode newRdfIriNode, NotificationChain msgs) {
		RdfIriNode oldRdfIriNode = rdfIriNode;
		rdfIriNode = newRdfIriNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.IRI_LIST_PARAM__RDF_IRI_NODE, oldRdfIriNode, newRdfIriNode);
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
	public void setRdfIriNode(RdfIriNode newRdfIriNode) {
		if (newRdfIriNode != rdfIriNode) {
			NotificationChain msgs = null;
			if (rdfIriNode != null)
				msgs = ((InternalEObject)rdfIriNode).eInverseRemove(this, AdaptionrdfPackage.RDF_IRI_NODE__RDF_IRI_NODE_TYPES, RdfIriNode.class, msgs);
			if (newRdfIriNode != null)
				msgs = ((InternalEObject)newRdfIriNode).eInverseAdd(this, AdaptionrdfPackage.RDF_IRI_NODE__RDF_IRI_NODE_TYPES, RdfIriNode.class, msgs);
			msgs = basicSetRdfIriNode(newRdfIriNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.IRI_LIST_PARAM__RDF_IRI_NODE, newRdfIriNode, newRdfIriNode));
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
			case AdaptionrdfPackage.IRI_LIST_PARAM__RDF_IRI_NODE:
				if (rdfIriNode != null)
					msgs = ((InternalEObject)rdfIriNode).eInverseRemove(this, AdaptionrdfPackage.RDF_IRI_NODE__RDF_IRI_NODE_TYPES, RdfIriNode.class, msgs);
				return basicSetRdfIriNode((RdfIriNode)otherEnd, msgs);
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
			case AdaptionrdfPackage.IRI_LIST_PARAM__RDF_IRI_NODE:
				return basicSetRdfIriNode(null, msgs);
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
			case AdaptionrdfPackage.IRI_LIST_PARAM__RDF_IRI_NODE:
				if (resolve) return getRdfIriNode();
				return basicGetRdfIriNode();
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
			case AdaptionrdfPackage.IRI_LIST_PARAM__RDF_IRI_NODE:
				setRdfIriNode((RdfIriNode)newValue);
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
			case AdaptionrdfPackage.IRI_LIST_PARAM__RDF_IRI_NODE:
				setRdfIriNode((RdfIriNode)null);
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
			case AdaptionrdfPackage.IRI_LIST_PARAM__RDF_IRI_NODE:
				return rdfIriNode != null;
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
