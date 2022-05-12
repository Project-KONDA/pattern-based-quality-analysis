/**
 */
package qualitypatternmodel.patternstructure.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.Morphism;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.ElementMapping;
/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Single
 * Element Mapping</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.ElementMappingImpl#getSource <em>Source</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.ElementMappingImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementMappingImpl extends MappingImpl implements ElementMapping {
	/**
	 * The cached value of the '{@link #getSource() <em>From</em>}' reference. <!--
	 * begin-user-doc -->
	 * The source <code>Element</code> of this <code>Mapping</code> in the previous <code>Graph</code> in the condition hierarchy.
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Node source;

	/**
	 * The cached value of the '{@link #getTarget() <em>To</em>}' reference. <!--
	 * begin-user-doc -->
	 * The target <code>Element</code> of this <code>Mapping</code> in the <code>Graph</code> contained in the container of <code>morphism</code>.
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Node target;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ElementMappingImpl() {
		super();
	}

	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		if (source == null)
			throw new InvalidityException("ElementMapping " + getInternalId() + ": source element null");
		if (target == null)
			throw new InvalidityException("ElementMapping " + getInternalId() + ": target element null");
		if (!target.getClass().equals(source.getClass())) {
			throw new InvalidityException("ElementMapping " + getInternalId() + 
					": unequal types of source (" + source.getInternalId() + " in " + source.getGraph().getInternalId() + ") "
					+ "and target (" + target.getInternalId() + " in " + target.getGraph().getInternalId() + ") elements");			
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternstructurePackage.Literals.ELEMENT_MAPPING;
	}
	
	@Override
	public NotificationChain basicSetMorphism(Morphism newMorphism, NotificationChain msgs) {
		Boolean delSource = getSource() != null
				&& (newMorphism == null
//				|| newMorphism.getSource() == null // maybe check consistency in Morphism.setSource() 
				|| !newMorphism.getSource().getNodes().contains(getSource()));
		Boolean delTarget = getTarget() != null
				&& (newMorphism == null
//				|| newMorphism.getTarget() == null // maybe check consistency in Morphism.setTarget() 
				|| !newMorphism.getTarget().getNodes().contains(getTarget()));
		if (delSource) setSource(null);
		if (delTarget) setTarget(null);
		return super.basicSetMorphism(newMorphism, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Node)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternstructurePackage.ELEMENT_MAPPING__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetSource(Node newSource, NotificationChain msgs) {
		Node oldFrom = source;
		source = newSource;
		if (newSource != null && getTarget() != null) {
			newSource.setName(getTarget().getName());
		}
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.ELEMENT_MAPPING__SOURCE, oldFrom, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(Node newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, GraphstructurePackage.NODE__OUTGOING_MAPPINGS, Node.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, GraphstructurePackage.NODE__OUTGOING_MAPPINGS, Node.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.ELEMENT_MAPPING__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Node)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternstructurePackage.ELEMENT_MAPPING__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetTarget(Node newTarget, NotificationChain msgs) {
		Node oldTo = target;
		target = newTarget;
		if (newTarget != null && getSource() != null) {
			newTarget.setName(getSource().getName());
		}
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.ELEMENT_MAPPING__TARGET, oldTo, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(Node newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, GraphstructurePackage.NODE__INCOMING_MAPPING, Node.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, GraphstructurePackage.NODE__INCOMING_MAPPING, Node.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.ELEMENT_MAPPING__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.ELEMENT_MAPPING__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, GraphstructurePackage.NODE__OUTGOING_MAPPINGS, Node.class, msgs);
				return basicSetSource((Node)otherEnd, msgs);
			case PatternstructurePackage.ELEMENT_MAPPING__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, GraphstructurePackage.NODE__INCOMING_MAPPING, Node.class, msgs);
				return basicSetTarget((Node)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.ELEMENT_MAPPING__SOURCE:
				return basicSetSource(null, msgs);
			case PatternstructurePackage.ELEMENT_MAPPING__TARGET:
				return basicSetTarget(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternstructurePackage.ELEMENT_MAPPING__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case PatternstructurePackage.ELEMENT_MAPPING__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PatternstructurePackage.ELEMENT_MAPPING__SOURCE:
				setSource((Node)newValue);
				return;
			case PatternstructurePackage.ELEMENT_MAPPING__TARGET:
				setTarget((Node)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PatternstructurePackage.ELEMENT_MAPPING__SOURCE:
				setSource((Node)null);
				return;
			case PatternstructurePackage.ELEMENT_MAPPING__TARGET:
				setTarget((Node)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PatternstructurePackage.ELEMENT_MAPPING__SOURCE:
				return source != null;
			case PatternstructurePackage.ELEMENT_MAPPING__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public String myToString() {
		String res = "ElementMapping [" + getInternalId() + "] ";
		res += "(";
		if (getSource()!= null) res += getSource().getInternalId();
		else res += "-";		
		res += " -> ";
		if (getTarget()!= null) res += getTarget().getInternalId() ;
		else res += "-";	
		res += ")";
		return res;
	}

} // ElementMappingImpl
