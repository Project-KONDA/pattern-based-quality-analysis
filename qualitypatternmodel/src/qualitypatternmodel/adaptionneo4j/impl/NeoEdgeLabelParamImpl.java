/**
 */
package qualitypatternmodel.adaptionneo4j.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage;
import qualitypatternmodel.adaptionneo4j.NeoEdgeLabelParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.utility.CypherSpecificConstants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo Edge Label Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NeoEdgeLabelParamImpl extends TextLiteralParamImpl implements NeoEdgeLabelParam {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoEdgeLabelParamImpl() {
		super();
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Adaptionneo4jPackage.Literals.NEO_EDGE_LABEL_PARAM;
	}

	@Override
	public void setValueIfValid(String newValue) throws InvalidityException {
		try {
			setValue(newValue);					
		} catch (RuntimeException e) {
			throw new InvalidityException(e.getMessage());
		}
	}
	
	@Override
	public void setValue(String newValue) {
		if (newValue == null) {
			value = newValue;
			return;
		}
		if (newValue.isEmpty()) {
			return;
		}
		try {
			checkLabel(newValue);
		} catch (InvalidityException e) {
			throw new RuntimeException(e.getMessage());
		}		
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.TEXT_LITERAL_PARAM__VALUE, oldValue, value));
	}

	@Override
	public String generateCypher() {
		String cypher = new String();
		if (getValue() != null) {
			cypher = CypherSpecificConstants.CYPHER_COMPARISON_OPERATOR_EQUAL_IN_GRAPH_MATCHING + getValue();				
		}
		return cypher;
	}
	
	@Override
	public String myToString() {
		final String result = super.myToString().replace("text", "label");
		return result;		
	}
	
	@Override
	public String toString() {
		final String result = super.toString().replace("value", "label");
		return result;
	}
	
	@Override
	public String generateXQuery() throws InvalidityException {
		throw new UnsupportedOperationException();
	}
} //NeoEdgeLabelParamImpl
