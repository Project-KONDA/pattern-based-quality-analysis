/**
 */
package qualitypatternmodel.patternstructure.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import qualitypatternmodel.patternstructure.Mapping;
import qualitypatternmodel.patternstructure.Morphism;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.MappingImpl#getMappingDepth <em>Mapping Depth</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.MappingImpl#getMorphism <em>Morphism</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MappingImpl extends PatternElementImpl implements Mapping {
	/**
	 * The default value of the '{@link #getMappingDepth() <em>Mapping Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingDepth()
	 * @generated
	 * @ordered
	 */
	protected static final int MAPPING_DEPTH_EDEFAULT = -1;
	/**
	 * The cached value of the '{@link #getMappingDepth() <em>Mapping Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingDepth()
	 * @generated
	 * @ordered
	 */
	protected int mappingDepth = MAPPING_DEPTH_EDEFAULT;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingImpl() {
		super();
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternstructurePackage.Literals.MAPPING;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMappingDepth() {
		return mappingDepth;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMappingDepth(int newMappingDepth) {
		int oldMappingDepth = mappingDepth;
		mappingDepth = newMappingDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.MAPPING__MAPPING_DEPTH, oldMappingDepth, mappingDepth));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Morphism getMorphism() {
		if (eContainerFeatureID() != PatternstructurePackage.MAPPING__MORPHISM) return null;
		return (Morphism)eInternalContainer();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMorphism(Morphism newMorphism, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMorphism, PatternstructurePackage.MAPPING__MORPHISM, msgs);
		return msgs;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMorphism(Morphism newMorphism) {
		if (newMorphism != eInternalContainer() || (eContainerFeatureID() != PatternstructurePackage.MAPPING__MORPHISM && newMorphism != null)) {
			if (EcoreUtil.isAncestor(this, newMorphism))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMorphism != null)
				msgs = ((InternalEObject)newMorphism).eInverseAdd(this, PatternstructurePackage.MORPHISM__MAPPINGS, Morphism.class, msgs);
			msgs = basicSetMorphism(newMorphism, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.MAPPING__MORPHISM, newMorphism, newMorphism));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.MAPPING__MORPHISM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMorphism((Morphism)otherEnd, msgs);
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
			case PatternstructurePackage.MAPPING__MORPHISM:
				return basicSetMorphism(null, msgs);
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
			case PatternstructurePackage.MAPPING__MORPHISM:
				return eInternalContainer().eInverseRemove(this, PatternstructurePackage.MORPHISM__MAPPINGS, Morphism.class, msgs);
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
			case PatternstructurePackage.MAPPING__MAPPING_DEPTH:
				return getMappingDepth();
			case PatternstructurePackage.MAPPING__MORPHISM:
				return getMorphism();
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
			case PatternstructurePackage.MAPPING__MAPPING_DEPTH:
				setMappingDepth((Integer)newValue);
				return;
			case PatternstructurePackage.MAPPING__MORPHISM:
				setMorphism((Morphism)newValue);
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
			case PatternstructurePackage.MAPPING__MAPPING_DEPTH:
				setMappingDepth(MAPPING_DEPTH_EDEFAULT);
				return;
			case PatternstructurePackage.MAPPING__MORPHISM:
				setMorphism((Morphism)null);
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
			case PatternstructurePackage.MAPPING__MAPPING_DEPTH:
				return mappingDepth != MAPPING_DEPTH_EDEFAULT;
			case PatternstructurePackage.MAPPING__MORPHISM:
				return getMorphism() != null;
		}
		return super.eIsSet(featureID);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mappingDepth: ");
		result.append(mappingDepth);
		result.append(')');
		return result.toString();
	}

} //MappingImpl
