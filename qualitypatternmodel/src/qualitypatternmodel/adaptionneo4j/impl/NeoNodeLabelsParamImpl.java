/**
 */
package qualitypatternmodel.adaptionneo4j.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.json.JSONArray;
import org.json.JSONException;

import qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage;
import qualitypatternmodel.adaptionneo4j.NeoNodeLabelsParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.utility.ConstantsNeo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo Node Labels Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NeoNodeLabelsParamImpl extends TextListParamImpl implements NeoNodeLabelsParam {
//	private static final String OF_LABEL = " of Label";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoNodeLabelsParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Adaptionneo4jPackage.Literals.NEO_NODE_LABELS_PARAM;
	}

	@Override
	public void setValueFromString(String value) throws InvalidityException {
		if (value == null) {
			clear();
			return;
		}
		EList<String> newVals = new BasicEList<String>();
		try {
			JSONArray jarray = new JSONArray(value);
	        for (int i = 0; i<jarray.length();i++) {
	        	String v = jarray.getString(i);
	        	checkLabel(v);
	        	newVals.add(v);
	        }
		}
		catch (JSONException e) {
			checkLabel(value);
        	newVals.add(value);
		}
		setValueIfValid(newVals);
	}

	@Override
	public String generateCypher() {
		if (getValues() != null) {
			final StringBuilder cypher = new StringBuilder();
			for (String label : getValues()) {
				if (!label.isEmpty()) {
					cypher.append(ConstantsNeo.CYPHER_EQUAL_IN_GRAPH_MATCHING_LABELING);
					cypher.append(label);
				}
			}
			return cypher.toString();
		}
		return new String();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException
	 * @generated NOT
	 */
	@Override
	public void addStringValue(String value) throws InvalidityException {
		if (value != null) {
			checkLabel(value);
		}
		super.addStringValue(value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setValueIfValid(EList<String> newValue) throws InvalidityException {
		for (String value: newValue) {
			checkLabel(value);
		}
		super.setValueIfValid(newValue);
	}

	@Override
	public String myToString() {
		final String result = super.myToString().replace("TextListParam", "NeoNodeLabels");
		return result;
	}

	@Override
	public String generateXQuery() throws InvalidityException {
		throw new UnsupportedOperationException();
	}

	@Override
	public String generateSparql() throws InvalidityException {
		throw new UnsupportedOperationException();
	}
} //NeoNodeLabelsParamImpl
