/**
 */
package qualitypatternmodel.adaptionrdf.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.json.JSONArray;
import org.json.JSONException;

import qualitypatternmodel.adaptionrdf.AdaptionrdfPackage;
import qualitypatternmodel.adaptionrdf.IriListParam;
import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.adaptionrdf.RdfIriNode;
import qualitypatternmodel.adaptionrdf.RdfPathPart;
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
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.IriListParamImpl#getIriParams <em>Iri Params</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.IriListParamImpl#getRdfIriNode <em>Rdf Iri Node</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.IriListParamImpl#getRdfPathPart <em>Rdf Path Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IriListParamImpl extends ParameterValueImpl implements IriListParam {
	/**
	 * The cached value of the '{@link #getIriParams() <em>Iri Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIriParams()
	 * @generated
	 * @ordered
	 */
	protected EList<IriParam> iriParams;

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
		if(getIriParams().isEmpty()) {
			return super.generateSparql();
		}
		String query = "";
		int i = 0;
		for(IriParam p : getIriParams()) {
			if (i>0) {
				query += ", ";
			}
			query += p.generateSparql();
			i++;
		}
		return query;		
	}

	@Override
	public String getValueAsString() {
		if (getIriParams().size() == 0) {
			return new JSONArray().toString();
		}
		else if (getIriParams().size() == 1) {
			return getIriParams().get(0).getValueAsString();
		} else {
			JSONArray jarr = new JSONArray();
			for (IriParam iri: getIriParams()) {
				jarr.put(iri.getValueAsString());
			}
			return jarr.toString();
		}
	}

	@Override
	public void setValueFromString(String value) throws InvalidityException {
		ArrayList<IriParam> x = new ArrayList<IriParam>();
		JSONArray jarr;
		try {
			jarr = new JSONArray(value);
	        for (int i = 0; i < jarr.length(); i++) {
	            IriParam iri = new IriParamImpl();
	            iri.setValueFromString(jarr.getString(i));
	            x.add(iri);   
	        }
		} catch (JSONException e) {
			try {
	            IriParam iri = new IriParamImpl();
	            iri.setValueFromString(value);
	            x.add(iri);   
			}
			catch (InvalidityException f) {
				throw new InvalidityException("", e);
			}
		}
        
        getIriParams().clear();
        getIriParams().addAll(x);
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
	public EList<IriParam> getIriParams() {
		if (iriParams == null) {
			iriParams = new EObjectContainmentWithInverseEList<IriParam>(IriParam.class, this, AdaptionrdfPackage.IRI_LIST_PARAM__IRI_PARAMS, AdaptionrdfPackage.IRI_PARAM__IRI_LIST_PARAM);
		}
		return iriParams;
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
	@Override
	public RdfPathPart getRdfPathPart() {
		if (eContainerFeatureID() != AdaptionrdfPackage.IRI_LIST_PARAM__RDF_PATH_PART) return null;
		return (RdfPathPart)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRdfPathPart(RdfPathPart newRdfPathPart, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRdfPathPart, AdaptionrdfPackage.IRI_LIST_PARAM__RDF_PATH_PART, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRdfPathPart(RdfPathPart newRdfPathPart) {
		if (newRdfPathPart != eInternalContainer() || (eContainerFeatureID() != AdaptionrdfPackage.IRI_LIST_PARAM__RDF_PATH_PART && newRdfPathPart != null)) {
			if (EcoreUtil.isAncestor(this, newRdfPathPart))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRdfPathPart != null)
				msgs = ((InternalEObject)newRdfPathPart).eInverseAdd(this, AdaptionrdfPackage.RDF_PATH_PART__TARGET_NODE_TYPES, RdfPathPart.class, msgs);
			msgs = basicSetRdfPathPart(newRdfPathPart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.IRI_LIST_PARAM__RDF_PATH_PART, newRdfPathPart, newRdfPathPart));
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
			case AdaptionrdfPackage.IRI_LIST_PARAM__IRI_PARAMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIriParams()).basicAdd(otherEnd, msgs);
			case AdaptionrdfPackage.IRI_LIST_PARAM__RDF_IRI_NODE:
				if (rdfIriNode != null)
					msgs = ((InternalEObject)rdfIriNode).eInverseRemove(this, AdaptionrdfPackage.RDF_IRI_NODE__RDF_IRI_NODE_TYPES, RdfIriNode.class, msgs);
				return basicSetRdfIriNode((RdfIriNode)otherEnd, msgs);
			case AdaptionrdfPackage.IRI_LIST_PARAM__RDF_PATH_PART:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
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
			case AdaptionrdfPackage.IRI_LIST_PARAM__IRI_PARAMS:
				return ((InternalEList<?>)getIriParams()).basicRemove(otherEnd, msgs);
			case AdaptionrdfPackage.IRI_LIST_PARAM__RDF_IRI_NODE:
				return basicSetRdfIriNode(null, msgs);
			case AdaptionrdfPackage.IRI_LIST_PARAM__RDF_PATH_PART:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AdaptionrdfPackage.IRI_LIST_PARAM__RDF_PATH_PART:
				return eInternalContainer().eInverseRemove(this, AdaptionrdfPackage.RDF_PATH_PART__TARGET_NODE_TYPES, RdfPathPart.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptionrdfPackage.IRI_LIST_PARAM__IRI_PARAMS:
				return getIriParams();
			case AdaptionrdfPackage.IRI_LIST_PARAM__RDF_IRI_NODE:
				if (resolve) return getRdfIriNode();
				return basicGetRdfIriNode();
			case AdaptionrdfPackage.IRI_LIST_PARAM__RDF_PATH_PART:
				return getRdfPathPart();
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
			case AdaptionrdfPackage.IRI_LIST_PARAM__IRI_PARAMS:
				getIriParams().clear();
				getIriParams().addAll((Collection<? extends IriParam>)newValue);
				return;
			case AdaptionrdfPackage.IRI_LIST_PARAM__RDF_IRI_NODE:
				setRdfIriNode((RdfIriNode)newValue);
				return;
			case AdaptionrdfPackage.IRI_LIST_PARAM__RDF_PATH_PART:
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
			case AdaptionrdfPackage.IRI_LIST_PARAM__IRI_PARAMS:
				getIriParams().clear();
				return;
			case AdaptionrdfPackage.IRI_LIST_PARAM__RDF_IRI_NODE:
				setRdfIriNode((RdfIriNode)null);
				return;
			case AdaptionrdfPackage.IRI_LIST_PARAM__RDF_PATH_PART:
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
			case AdaptionrdfPackage.IRI_LIST_PARAM__IRI_PARAMS:
				return iriParams != null && !iriParams.isEmpty();
			case AdaptionrdfPackage.IRI_LIST_PARAM__RDF_IRI_NODE:
				return rdfIriNode != null;
			case AdaptionrdfPackage.IRI_LIST_PARAM__RDF_PATH_PART:
				return getRdfPathPart() != null;
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
		String result = "irilist [" + getInternalId() + "] ( ";
		for (IriParam iri: getIriParams()) {
			try {
				result += iri.generateSparql() + " ";
			} catch (InvalidityException e) {
				result += "<?> ";
			}
		}
		return result + ")";
	}

} //IriListParamImpl
