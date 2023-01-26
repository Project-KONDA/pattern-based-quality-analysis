/**
 */
package qualitypatternmodel.adaptionneo4j.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage;
import qualitypatternmodel.adaptionneo4j.NeoNodeLabelsParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.utility.CypherSpecificConstants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo Node Labels Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NeoNodeLabelsParamImpl extends TextListParamImpl implements NeoNodeLabelsParam {
	private static final String OF_LABEL = " of Label";

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
	public String generateCypher() {
		final StringBuilder cypher = new StringBuilder();
		if (getValues() != null) {
			for (String label : getValues()) {
				if (!label.isEmpty()) { 
					cypher.append(CypherSpecificConstants.CYPHER_COMPARISON_OPERATOR_EQUAL_IN_GRAPH_MATCHING_LABELING);
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
		if (value == null) {
			return;
		}
		if (this.values == null) {
			this.values = new BasicEList<String>();
		}
		if (!this.values.contains(value)) {
			checkLabel(value);
			this.values.add(value);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setValueIfValid(EList<String> newValue) throws InvalidityException {
		if (newValue == null) {
			getValues().clear();
			return;
		}
		for (String tempValue : newValue) {
			try {
				checkLabel(tempValue);
			} catch (InvalidityException e) {
				throw new InvalidityException(e.getMessage() + OF_LABEL + tempValue);
			}
		}
		EList<String> oldValue = getValues();
		oldValue.clear();	
		oldValue.addAll(newValue);
	}
} //NeoNodeLabelsParamImpl
