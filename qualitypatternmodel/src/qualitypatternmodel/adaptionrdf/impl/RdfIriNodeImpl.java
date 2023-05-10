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
import qualitypatternmodel.adaptionrdf.IriListParam;
import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.adaptionrdf.RdfIriNode;
import qualitypatternmodel.adaptionrdf.RdfNode;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.impl.ComplexNodeImpl;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rdf Iri Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfIriNodeImpl#getRdfIriNodeTypes <em>Rdf Iri Node Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RdfIriNodeImpl extends ComplexNodeImpl implements RdfIriNode {
	
	public static String RDF_TYPE_PREDICATE = "rdf:type";
	
	/**
	 * The cached value of the '{@link #getRdfIriNodeTypes() <em>Rdf Iri Node Types</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdfIriNodeTypes()
	 * @generated
	 * @ordered
	 */
	protected IriListParam rdfIriNodeTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RdfIriNodeImpl() {
		super();
		createParameters();
	}
	
	@Override
	public String generateSparql() {
		return "?var" + getOriginalID();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String generateRdfTypes() throws InvalidityException {
		String result = "";
		if (this.equals(getOriginalNode()) && getRdfIriNodeTypes() != null) {
			for (IriParam iri: getRdfIriNodeTypes().getIriParams()) {
				result += "\n" + this.generateSparql() + " " + RDF_TYPE_PREDICATE + " " + iri.generateSparql() + ".";
			}
		}
		return result;
	}
	
	@Override
	public EList<Parameter> getAllParameters() throws InvalidityException {
		EList<Parameter> res = super.getAllParameters();
		if (this == getOriginalNode())
			res.add(getRdfIriNodeTypes());
		return res;
	}
	
	@Override
	public PatternElement createRdfAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return this;
	}

	@Override
	public Node makeGeneric() throws InvalidityException{
		throw new InvalidityException("This node can not become generic!");
	}
	
	@Override
	public Node makeGenericRecursive() throws InvalidityException{
		throw new InvalidityException("This node can not become generic!");
	}
	
	@Override
	public void checkGeneric() throws InvalidityException{
		throw new InvalidityException("This node can not become generic!");
	}
	
	@Override
	public PrimitiveNode makePrimitive() throws InvalidityException{
		throw new InvalidityException("This node can not become generic!");
	}
	
	@Override
	public PrimitiveNode makePrimitiveRecursive() throws InvalidityException{
		throw new InvalidityException("This node can not become generic!");
	}
	
	@Override
	public void checkPrimitive() throws InvalidityException{
		throw new InvalidityException("This node can not become generic!");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionrdfPackage.Literals.RDF_IRI_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IriListParam getRdfIriNodeTypes() {
		if (rdfIriNodeTypes != null && rdfIriNodeTypes.eIsProxy()) {
			InternalEObject oldRdfIriNodeTypes = (InternalEObject)rdfIriNodeTypes;
			rdfIriNodeTypes = (IriListParam)eResolveProxy(oldRdfIriNodeTypes);
			if (rdfIriNodeTypes != oldRdfIriNodeTypes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionrdfPackage.RDF_IRI_NODE__RDF_IRI_NODE_TYPES, oldRdfIriNodeTypes, rdfIriNodeTypes));
			}
		}
		return rdfIriNodeTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IriListParam basicGetRdfIriNodeTypes() {
		return rdfIriNodeTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRdfIriNodeTypes(IriListParam newRdfIriNodeTypes, NotificationChain msgs) {
		IriListParam oldRdfIriNodeTypes = rdfIriNodeTypes;
		rdfIriNodeTypes = newRdfIriNodeTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_IRI_NODE__RDF_IRI_NODE_TYPES, oldRdfIriNodeTypes, newRdfIriNodeTypes);
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
	public void setRdfIriNodeTypes(IriListParam newRdfIriNodeTypes) {
		if (newRdfIriNodeTypes != rdfIriNodeTypes) {
			NotificationChain msgs = null;
			if (rdfIriNodeTypes != null)
				msgs = ((InternalEObject)rdfIriNodeTypes).eInverseRemove(this, AdaptionrdfPackage.IRI_LIST_PARAM__RDF_IRI_NODE, IriListParam.class, msgs);
			if (newRdfIriNodeTypes != null)
				msgs = ((InternalEObject)newRdfIriNodeTypes).eInverseAdd(this, AdaptionrdfPackage.IRI_LIST_PARAM__RDF_IRI_NODE, IriListParam.class, msgs);
			msgs = basicSetRdfIriNodeTypes(newRdfIriNodeTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_IRI_NODE__RDF_IRI_NODE_TYPES, newRdfIriNodeTypes, newRdfIriNodeTypes));
	}
	
	@Override
	public void setGraph(Graph newGraph) {
		super.setGraph(newGraph);
		createParameters();
	}

	@Override
	public void createParameters() {
		if (this == getOriginalNode()) {
			if (getRdfIriNodeTypes() == null)
				setRdfIriNodeTypes(new IriListParamImpl());
			if (getParameterList() != null && getParameterList() != getRdfIriNodeTypes().getParameterList())
				getRdfIriNodeTypes().setParameterList(getParameterList());
		} else {
			if (getRdfIriNodeTypes() != null) {
				getRdfIriNodeTypes().setParameterList(null);
				setRdfIriNodeTypes(null);
			}
			getOriginalNode().createParameters();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionrdfPackage.RDF_IRI_NODE__RDF_IRI_NODE_TYPES:
				if (rdfIriNodeTypes != null)
					msgs = ((InternalEObject)rdfIriNodeTypes).eInverseRemove(this, AdaptionrdfPackage.IRI_LIST_PARAM__RDF_IRI_NODE, IriListParam.class, msgs);
				return basicSetRdfIriNodeTypes((IriListParam)otherEnd, msgs);
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
			case AdaptionrdfPackage.RDF_IRI_NODE__RDF_IRI_NODE_TYPES:
				return basicSetRdfIriNodeTypes(null, msgs);
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
			case AdaptionrdfPackage.RDF_IRI_NODE__RDF_IRI_NODE_TYPES:
				if (resolve) return getRdfIriNodeTypes();
				return basicGetRdfIriNodeTypes();
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
			case AdaptionrdfPackage.RDF_IRI_NODE__RDF_IRI_NODE_TYPES:
				setRdfIriNodeTypes((IriListParam)newValue);
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
			case AdaptionrdfPackage.RDF_IRI_NODE__RDF_IRI_NODE_TYPES:
				setRdfIriNodeTypes((IriListParam)null);
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
			case AdaptionrdfPackage.RDF_IRI_NODE__RDF_IRI_NODE_TYPES:
				return rdfIriNodeTypes != null;
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
		if (baseClass == RdfNode.class) {
			switch (baseOperationID) {
				case AdaptionrdfPackage.RDF_NODE___GENERATE_RDF_TYPES: return AdaptionrdfPackage.RDF_IRI_NODE___GENERATE_RDF_TYPES;
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
			case AdaptionrdfPackage.RDF_IRI_NODE___GENERATE_RDF_TYPES:
				try {
					return generateRdfTypes();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

} //RdfIriNodeImpl
