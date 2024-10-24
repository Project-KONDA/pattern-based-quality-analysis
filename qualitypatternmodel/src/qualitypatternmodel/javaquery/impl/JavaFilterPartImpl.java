/**
 */
package qualitypatternmodel.javaquery.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.json.JSONException;
import org.json.JSONObject;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaquery.JavaFilterPart;
import qualitypatternmodel.javaquery.JavaqueryPackage;
import qualitypatternmodel.javaqueryoutput.InterimResultPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Filter Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class JavaFilterPartImpl extends MinimalEObjectImpl.Container implements JavaFilterPart {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaFilterPartImpl() {
		super();
	}

	@Override
	abstract public JSONObject toJson();

	@Override
	abstract public String toString();

	private static Integer idCounter = 1;
	private Integer javaFilterPartId = -1;
	public Integer getJavaFilterPartId() {
		if (javaFilterPartId == -1) {
			idCounter++;
			javaFilterPartId = idCounter;
		}
		return javaFilterPartId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryPackage.Literals.JAVA_FILTER_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterimResultPart> getArguments() {
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
			case JavaqueryPackage.JAVA_FILTER_PART___GET_ARGUMENTS:
				return getArguments();
			case JavaqueryPackage.JAVA_FILTER_PART___TO_JSON:
				return toJson();
		}
		return super.eInvoke(operationID, arguments);
	}

	public static JavaFilterPartImpl fromJson(JSONObject json, Map<Integer, InterimResultPart> map) throws InvalidityException {
		try {
			String clazz = json.getString("class");

			//BooleanFilterParts
			if (clazz.equals(FormulaFilterPartImpl.class.getSimpleName())) {
				return new FormulaFilterPartImpl(json, map);
			}
			if (clazz.equals(BooleanFilterElementImpl.class.getSimpleName())) {
				return new BooleanFilterElementImpl(json, map);
			}
			if (clazz.equals(NotFilterPartImpl.class.getSimpleName())) {
				return new NotFilterPartImpl(json, map);
			}
			if (clazz.equals(QuantifierFilterPartImpl.class.getSimpleName())) {
				return new QuantifierFilterPartImpl(json, map);
			}
			if (clazz.equals(OneArgFunctionFilterPartImpl.class.getSimpleName())) {
				return new OneArgFunctionFilterPartImpl(json, map);
			}
			if (clazz.equals(CountFilterPartImpl.class.getSimpleName())) {
				return new CountFilterPartImpl(json, map);
			}
			if (clazz.equals(ListFilterPartImpl.class.getSimpleName())) {
				return new ListFilterPartImpl(json, map);
			}

			//NumberFilterParts
			if (clazz.equals(CountFilterElementImpl.class.getSimpleName())) {
				return new CountFilterElementImpl(json, map);
			}
			if (clazz.equals(NumberFilterElementImpl.class.getSimpleName())) {
				return new NumberFilterElementImpl(json, map);
			}
			if (clazz.equals(NumberValueFilterElementImpl.class.getSimpleName())) {
				return new NumberValueFilterElementImpl(json, map);
			}
			throw new InvalidityException("Class '" + clazz + "' not implemented in JavaFilterPart.fromJson()");
		} catch (JSONException e) {
			throw new InvalidityException("JavaFilterPart.fromJson failed for " + json, e);
		}
	}

} //JavaFilterPartImpl
