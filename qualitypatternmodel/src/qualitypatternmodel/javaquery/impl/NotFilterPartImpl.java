/**
 */
package qualitypatternmodel.javaquery.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.json.JSONException;
import org.json.JSONObject;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaquery.BooleanFilterPart;
import qualitypatternmodel.javaquery.JavaqueryPackage;
import qualitypatternmodel.javaquery.NotFilterPart;
import qualitypatternmodel.javaqueryoutput.InterimResult;
import qualitypatternmodel.javaqueryoutput.InterimResultPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Filter Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.impl.NotFilterPartImpl#getSubfilter <em>Subfilter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotFilterPartImpl extends BooleanFilterPartImpl implements NotFilterPart {
	/**
	 * The cached value of the '{@link #getSubfilter() <em>Subfilter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubfilter()
	 * @generated
	 * @ordered
	 */
	protected BooleanFilterPart subfilter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotFilterPartImpl() {
		super();
	}

	public NotFilterPartImpl(BooleanFilterPart subfilter) {
		super();
		setSubfilter(subfilter);
	}

	public NotFilterPartImpl(JSONObject json, Map<Integer, InterimResultPart> map) throws InvalidityException {
		super();
		try {
			setSubfilter((BooleanFilterPart) JavaFilterPartImpl.fromJson(json.getJSONObject("subfilter"), map));
		}
		catch (Exception e) {
			throw new InvalidityException();
		}
	}

	@Override
	public Boolean apply(InterimResult parameter) throws InvalidityException {
		return !getSubfilter().apply(parameter);
	}

	@Override
	public EList<InterimResultPart> getArguments() {
		return getSubfilter().getArguments();
	}

	@Override
	public JSONObject toJson() {
		JSONObject result = new JSONObject();
		try {
			result.put("class", getClass().getSimpleName());
			result.put("subfilter", getSubfilter().toJson());
		} catch (JSONException e) {
		}
		return result;
	}

	@Override
	public String toString() {
		return "[not " + getJavaFilterPartId() + " " + getSubfilter().toString() + "]";
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryPackage.Literals.NOT_FILTER_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanFilterPart getSubfilter() {
		return subfilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubfilter(BooleanFilterPart newSubfilter, NotificationChain msgs) {
		BooleanFilterPart oldSubfilter = subfilter;
		subfilter = newSubfilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaqueryPackage.NOT_FILTER_PART__SUBFILTER, oldSubfilter, newSubfilter);
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
	public void setSubfilter(BooleanFilterPart newSubfilter) {
		if (newSubfilter != subfilter) {
			NotificationChain msgs = null;
			if (subfilter != null)
				msgs = ((InternalEObject)subfilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaqueryPackage.NOT_FILTER_PART__SUBFILTER, null, msgs);
			if (newSubfilter != null)
				msgs = ((InternalEObject)newSubfilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaqueryPackage.NOT_FILTER_PART__SUBFILTER, null, msgs);
			msgs = basicSetSubfilter(newSubfilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.NOT_FILTER_PART__SUBFILTER, newSubfilter, newSubfilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaqueryPackage.NOT_FILTER_PART__SUBFILTER:
				return basicSetSubfilter(null, msgs);
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
			case JavaqueryPackage.NOT_FILTER_PART__SUBFILTER:
				return getSubfilter();
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
			case JavaqueryPackage.NOT_FILTER_PART__SUBFILTER:
				setSubfilter((BooleanFilterPart)newValue);
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
			case JavaqueryPackage.NOT_FILTER_PART__SUBFILTER:
				setSubfilter((BooleanFilterPart)null);
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
			case JavaqueryPackage.NOT_FILTER_PART__SUBFILTER:
				return subfilter != null;
		}
		return super.eIsSet(featureID);
	}

} //NotFilterPartImpl
