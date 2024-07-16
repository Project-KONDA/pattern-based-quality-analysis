/**
 */
package qualitypatternmodel.javaqueryoutput.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.json.JSONException;
import org.json.JSONObject;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaqueryoutput.InterimResultPart;
import qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interim Result Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class InterimResultPartImpl extends MinimalEObjectImpl.Container implements InterimResultPart {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterimResultPartImpl() {
		super();
	}

	private static Integer idCounter = 1;
	private Integer interimPartId = -1;
	@Override
	public Integer getInterimPartId() {
		if (interimPartId == -1) {
			idCounter++;
			interimPartId = idCounter;
		}
		return interimPartId;
	}

	protected void setInterimPartId(Integer id) {
		interimPartId = id;
		if (idCounter < id) {
			idCounter = id;
		}
	}

	abstract public Map<Integer, InterimResultPart> getInterimResultParts();


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryoutputPackage.Literals.INTERIM_RESULT_PART;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JSONObject toJson() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JavaqueryoutputPackage.INTERIM_RESULT_PART___TO_JSON:
				return toJson();
		}
		return super.eInvoke(operationID, arguments);
	}

	public static InterimResultPartImpl fromJson(String json) throws InvalidityException {
		try {
			JSONObject jsono = new JSONObject(json);
			String clazz = jsono.getString("class");
			if (clazz.equals(ValueInterimImpl.class.getSimpleName())) {
				return new ValueInterimImpl(json);
			}
			if (clazz.equals(VariableContainerInterimImpl.class.getSimpleName())) {
				return new VariableContainerInterimImpl(json);
			}
			if (clazz.equals(FixedContainerInterimImpl.class.getSimpleName())) {
				return new FixedContainerInterimImpl(json);
			}
		} catch (JSONException e) {}
		return null;
	}

} //InterimResultPartImpl
