/**
 */
package qualitypatternmodel.javaqueryoutput.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.json.JSONException;
import org.json.JSONObject;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaqueryoutput.InterimResultPart;
import qualitypatternmodel.javaqueryoutput.InterimResultStructure;
import qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interim Results Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.impl.InterimResultStructureImpl#getSubstructure <em>Substructure</em>}</li>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.impl.InterimResultStructureImpl#getRecord <em>Record</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterimResultStructureImpl extends MinimalEObjectImpl.Container implements InterimResultStructure {
	/**
	 * The cached value of the '{@link #getSubstructure() <em>Substructure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstructure()
	 * @generated
	 * @ordered
	 */
	protected InterimResultPart substructure;

	/**
	 * The cached value of the '{@link #getRecord() <em>Record</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecord()
	 * @generated
	 * @ordered
	 */
	protected InterimResultPart record;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public InterimResultStructureImpl() {
		super();
		setRecord(new ValueInterimImpl());
	}

	@Override
	public JSONObject toJson() {
		JSONObject result = new JSONObject();
		try {
			result.put("class", getClass().getSimpleName());
			result.put("record", getRecord().toJson());
			if (getSubstructure() != null) {
				result.put("substructure", getSubstructure().toJson());
			}
		} catch (JSONException e) {
		}
		return result;
	}

	public static InterimResultStructureImpl fromJson(JSONObject json) throws InvalidityException {
		InterimResultStructureImpl structure = new InterimResultStructureImpl();
		if (json.has("record")) {
			JSONObject recordjson = json.getJSONObject("record");
			structure.setRecord(InterimResultPartImpl.fromJson(recordjson));
		}
		if (json.has("substructure")) {
			JSONObject substructurejson = json.getJSONObject("substructure");
			structure.setSubstructure(InterimResultPartImpl.fromJson(substructurejson));
		}
		return structure;
	}

	public Map<Integer, InterimResultPart> getInterimResultParts() {
		Map<Integer, InterimResultPart> map = ((InterimResultPartImpl) getRecord()).getInterimResultParts();
		InterimResultPartImpl substructure = (InterimResultPartImpl) getSubstructure();
		if (substructure != null)
			map.putAll(substructure.getInterimResultParts());
		return map;
	}

	@Override
	public String toString(){
		String res = "";
		if (getRecord() != null) {
			res += getRecord().toString();
		} else {
			res += "no record";
		}
		res += " | ";
		if (getSubstructure() != null) {
			res += getSubstructure().toString();
		} else {
			res += "no substructure";
		}
		return "[" + res + "]";
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryoutputPackage.Literals.INTERIM_RESULT_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterimResultPart getSubstructure() {
		return substructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstructure(InterimResultPart newSubstructure, NotificationChain msgs) {
		InterimResultPart oldSubstructure = substructure;
		substructure = newSubstructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaqueryoutputPackage.INTERIM_RESULT_STRUCTURE__SUBSTRUCTURE, oldSubstructure, newSubstructure);
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
	public void setSubstructure(InterimResultPart newSubstructure) {
		if (newSubstructure != substructure) {
			NotificationChain msgs = null;
			if (substructure != null)
				msgs = ((InternalEObject)substructure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaqueryoutputPackage.INTERIM_RESULT_STRUCTURE__SUBSTRUCTURE, null, msgs);
			if (newSubstructure != null)
				msgs = ((InternalEObject)newSubstructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaqueryoutputPackage.INTERIM_RESULT_STRUCTURE__SUBSTRUCTURE, null, msgs);
			msgs = basicSetSubstructure(newSubstructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryoutputPackage.INTERIM_RESULT_STRUCTURE__SUBSTRUCTURE, newSubstructure, newSubstructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterimResultPart getRecord() {
		return record;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecord(InterimResultPart newRecord, NotificationChain msgs) {
		InterimResultPart oldRecord = record;
		record = newRecord;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaqueryoutputPackage.INTERIM_RESULT_STRUCTURE__RECORD, oldRecord, newRecord);
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
	public void setRecord(InterimResultPart newRecord) {
		if (newRecord != record) {
			NotificationChain msgs = null;
			if (record != null)
				msgs = ((InternalEObject)record).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaqueryoutputPackage.INTERIM_RESULT_STRUCTURE__RECORD, null, msgs);
			if (newRecord != null)
				msgs = ((InternalEObject)newRecord).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaqueryoutputPackage.INTERIM_RESULT_STRUCTURE__RECORD, null, msgs);
			msgs = basicSetRecord(newRecord, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryoutputPackage.INTERIM_RESULT_STRUCTURE__RECORD, newRecord, newRecord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaqueryoutputPackage.INTERIM_RESULT_STRUCTURE__SUBSTRUCTURE:
				return basicSetSubstructure(null, msgs);
			case JavaqueryoutputPackage.INTERIM_RESULT_STRUCTURE__RECORD:
				return basicSetRecord(null, msgs);
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
			case JavaqueryoutputPackage.INTERIM_RESULT_STRUCTURE__SUBSTRUCTURE:
				return getSubstructure();
			case JavaqueryoutputPackage.INTERIM_RESULT_STRUCTURE__RECORD:
				return getRecord();
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
			case JavaqueryoutputPackage.INTERIM_RESULT_STRUCTURE__SUBSTRUCTURE:
				setSubstructure((InterimResultPart)newValue);
				return;
			case JavaqueryoutputPackage.INTERIM_RESULT_STRUCTURE__RECORD:
				setRecord((InterimResultPart)newValue);
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
			case JavaqueryoutputPackage.INTERIM_RESULT_STRUCTURE__SUBSTRUCTURE:
				setSubstructure((InterimResultPart)null);
				return;
			case JavaqueryoutputPackage.INTERIM_RESULT_STRUCTURE__RECORD:
				setRecord((InterimResultPart)null);
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
			case JavaqueryoutputPackage.INTERIM_RESULT_STRUCTURE__SUBSTRUCTURE:
				return substructure != null;
			case JavaqueryoutputPackage.INTERIM_RESULT_STRUCTURE__RECORD:
				return record != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JavaqueryoutputPackage.INTERIM_RESULT_STRUCTURE___TO_JSON:
				return toJson();
		}
		return super.eInvoke(operationID, arguments);
	}

} //InterimResultsStructureImpl
