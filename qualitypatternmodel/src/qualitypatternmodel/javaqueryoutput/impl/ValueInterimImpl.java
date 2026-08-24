/**
 */
package qualitypatternmodel.javaqueryoutput.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import com.fasterxml.jackson.databind.node.ObjectNode;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaqueryoutput.InterimResultPart;
import qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage;
import qualitypatternmodel.javaqueryoutput.ValueInterim;
import qualitypatternmodel.utility.Util;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value List Interim</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ValueInterimImpl extends InterimResultPartImpl implements ValueInterim {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ValueInterimImpl() {
		super();
	}

	public ValueInterimImpl(ObjectNode json) throws InvalidityException {
		super();
		try {
			if (!json.get("class").asText().equals(getClass().getSimpleName())) {
				throw new InvalidityException("Wrong class");
			}
			setInterimPartId(json.get("id").asInt());
		} catch (RuntimeException e) {
			throw new InvalidityException("Wrong class");
		}
	}

	@Override
	public ObjectNode toJson() {
		ObjectNode result = Util.jsonCreateObject();
		try {
			result.put("class", getClass().getSimpleName());
			result.put("id", getInterimPartId());
		} catch (RuntimeException e) {
		}
		return result;
	}

	@Override
	public Map<Integer, InterimResultPart> getInterimResultParts() {
		Map<Integer, InterimResultPart> map = new HashMap<Integer, InterimResultPart>();
		map.put(getInterimPartId(), this);
		return map;
	}

	@Override
	public String toString(){
		return "<value " + getInterimPartId() + ">";
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryoutputPackage.Literals.VALUE_INTERIM;
	}

} //ValueListInterimImpl
