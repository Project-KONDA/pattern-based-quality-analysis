/**
 */
package qualitypatternmodel.javaqueryoutput.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import qualitypatternmodel.javaqueryoutput.FixedContainerInterim;
import qualitypatternmodel.javaqueryoutput.InterimResultPart;
import qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Container Interim</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.impl.FixedContainerInterimImpl#getContained <em>Contained</em>}</li>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.impl.FixedContainerInterimImpl#getCanBeEmpty <em>Can Be Empty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FixedContainerInterimImpl extends ContainerInterimImpl implements FixedContainerInterim {
	/**
	 * The cached value of the '{@link #getContained() <em>Contained</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContained()
	 * @generated
	 * @ordered
	 */
	protected EList<InterimResultPart> contained;

	/**
	 * The default value of the '{@link #getCanBeEmpty() <em>Can Be Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanBeEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CAN_BE_EMPTY_EDEFAULT = Boolean.FALSE;
	/**
	 * The cached value of the '{@link #getCanBeEmpty() <em>Can Be Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanBeEmpty()
	 * @generated
	 * @ordered
	 */
	protected Boolean canBeEmpty = CAN_BE_EMPTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FixedContainerInterimImpl() {
		super();
	}

	public FixedContainerInterimImpl(EList<InterimResultPart> interims) {
		super();
		getContained().clear();
		getContained().addAll(interims);
	}
	
	@Override
	public Integer getSize() {
		return getContained().size();
	}
	
	@Override
	public JSONObject toJson() {
		JSONObject result = new JSONObject();
		try {
			result.put("class", getClass().getSimpleName());
			result.put("id", getInterimPartId());
			JSONArray contained = new JSONArray();
			for (InterimResultPart container: getContained())
				contained.put(container.toJson());
			result.put("contained", contained);
		} catch (JSONException e) {
		}
		return result;
	}

	@Override
	public Map<Integer, InterimResultPart> getInterimResultParts() {
		Map<Integer, InterimResultPart> map = new HashMap<Integer, InterimResultPart>();
		map.put(getInterimPartId(), this);
		for (InterimResultPart contained: getContained())
			map.putAll(((InterimResultPartImpl) contained).getInterimResultParts());
		return map;
	}

	@Override
	public String toString(){
		int containedSize = getContained().size();
		String containedString = "";
		for (int i = 0; i < containedSize; i++) {
			if (i>0)
				containedString += ", ";
			containedString += getContained().get(i); 
		}
		return "<containerF " + getInterimPartId() + " " + containedString + ">";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryoutputPackage.Literals.FIXED_CONTAINER_INTERIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterimResultPart> getContained() {
		if (contained == null) {
			contained = new EObjectContainmentEList<InterimResultPart>(InterimResultPart.class, this, JavaqueryoutputPackage.FIXED_CONTAINER_INTERIM__CONTAINED);
		}
		return contained;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCanBeEmpty() {
		return canBeEmpty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanBeEmpty(Boolean newCanBeEmpty) {
		Boolean oldCanBeEmpty = canBeEmpty;
		canBeEmpty = newCanBeEmpty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryoutputPackage.FIXED_CONTAINER_INTERIM__CAN_BE_EMPTY, oldCanBeEmpty, canBeEmpty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaqueryoutputPackage.FIXED_CONTAINER_INTERIM__CONTAINED:
				return ((InternalEList<?>)getContained()).basicRemove(otherEnd, msgs);
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
			case JavaqueryoutputPackage.FIXED_CONTAINER_INTERIM__CONTAINED:
				return getContained();
			case JavaqueryoutputPackage.FIXED_CONTAINER_INTERIM__CAN_BE_EMPTY:
				return getCanBeEmpty();
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
			case JavaqueryoutputPackage.FIXED_CONTAINER_INTERIM__CONTAINED:
				getContained().clear();
				getContained().addAll((Collection<? extends InterimResultPart>)newValue);
				return;
			case JavaqueryoutputPackage.FIXED_CONTAINER_INTERIM__CAN_BE_EMPTY:
				setCanBeEmpty((Boolean)newValue);
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
			case JavaqueryoutputPackage.FIXED_CONTAINER_INTERIM__CONTAINED:
				getContained().clear();
				return;
			case JavaqueryoutputPackage.FIXED_CONTAINER_INTERIM__CAN_BE_EMPTY:
				setCanBeEmpty(CAN_BE_EMPTY_EDEFAULT);
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
			case JavaqueryoutputPackage.FIXED_CONTAINER_INTERIM__CONTAINED:
				return contained != null && !contained.isEmpty();
			case JavaqueryoutputPackage.FIXED_CONTAINER_INTERIM__CAN_BE_EMPTY:
				return CAN_BE_EMPTY_EDEFAULT == null ? canBeEmpty != null : !CAN_BE_EMPTY_EDEFAULT.equals(canBeEmpty);
		}
		return super.eIsSet(featureID);
	}

} //FixedContainerInterimImpl
