/**
 */
package qualitypatternmodel.parameters.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.AxisPair;
import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.PropertyOptionParam;
import qualitypatternmodel.adaptionxml.impl.XmlPropertyImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.utility.Constants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Literal</b></em>'.
 * A parameter of type <code>String</code>.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.impl.TextLiteralParamImpl#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.TextLiteralParamImpl#getMatches <em>Matches</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.TextLiteralParamImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.TextLiteralParamImpl#getAxisPair <em>Axis Pair</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextLiteralParamImpl extends ParameterValueImpl implements TextLiteralParam {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * Concrete value of this parameter specified during concretization.
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMatches() <em>Matches</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * A list of <code>Matches</code> whose regular expression is specified through <code>this</code>.
	 * <!-- end-user-doc -->
	 * @see #getMatches()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> matches;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * A list of <code>XmlProperties</code> whose attribute name is specified through <code>this</code>.
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyOptionParam> properties;

	/**
	 * <!-- begin-user-doc -->
	 * Constructor.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TextLiteralParamImpl() {
		super();
	}
	
	@Override
	public String getValueAsString() {
		return getValue();
	}
	
	@Override
	public void setValueFromString(String value) throws InvalidityException {
		setValueIfValid(value);
	}
	
	public TextLiteralParamImpl(String value) {
		super();
		this.value = value;
	}
	
	@Override
	public String generateQuery() throws InvalidityException {
		if(inputIsValid()) {
			return "\"" + getValue() + "\"";
		} else {
			throw new InvalidityException("invalid string");
		}
	}

	
	@Override
	public boolean inputIsValid() {
		return getValue() != null;
	}
	
	@Override
	public ReturnType getReturnType() {
		return ReturnType.STRING;
	}
	
	@Override
	public boolean isUsed() {		
		return super.isUsed() || !getMatches().isEmpty() || !getProperties().isEmpty();
	}
	
	@Override
	public EList<String> getSuggestions() {
		EList<String> suggestions = super.getSuggestions();		
		for(PropertyOptionParam p : getProperties()) {			
			if(p.getValue() == PropertyKind.ATTRIBUTE) {
				suggestions.addAll(Constants.sortByValue(getAttributeNames()).keySet());
				break;
			}			
		}			
		return suggestions;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.TEXT_LITERAL_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetParameterList(ParameterList newVariableList, NotificationChain msgs) {
		if(newVariableList == null) {
			getMatches().clear();
			getProperties().clear();
		}
		return super.basicSetParameterList(newVariableList, msgs);
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.TEXT_LITERAL_PARAM__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Match> getMatches() {
		if (matches == null) {
			matches = new EObjectWithInverseResolvingEList<Match>(Match.class, this, ParametersPackage.TEXT_LITERAL_PARAM__MATCHES, OperatorsPackage.MATCH__REGULAR_EXPRESSION);
		}
		return matches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyOptionParam> getProperties() {
		if (properties == null) {
			properties = new EObjectWithInverseResolvingEList<PropertyOptionParam>(PropertyOptionParam.class, this, ParametersPackage.TEXT_LITERAL_PARAM__PROPERTIES, AdaptionxmlPackage.PROPERTY_OPTION_PARAM__ATTRIBUTE_NAME);
		}
		return properties;
	}	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AxisPair getAxisPair() {
		if (eContainerFeatureID() != ParametersPackage.TEXT_LITERAL_PARAM__AXIS_PAIR) return null;
		return (AxisPair)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxisPair(AxisPair newAxisPair, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAxisPair, ParametersPackage.TEXT_LITERAL_PARAM__AXIS_PAIR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAxisPair(AxisPair newAxisPair) {
		if (newAxisPair != eInternalContainer() || (eContainerFeatureID() != ParametersPackage.TEXT_LITERAL_PARAM__AXIS_PAIR && newAxisPair != null)) {
			if (EcoreUtil.isAncestor(this, newAxisPair))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAxisPair != null)
				msgs = ((InternalEObject)newAxisPair).eInverseAdd(this, AdaptionxmlPackage.AXIS_PAIR__TEXT_LITERAL_PARAM, AxisPair.class, msgs);
			msgs = basicSetAxisPair(newAxisPair, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.TEXT_LITERAL_PARAM__AXIS_PAIR, newAxisPair, newAxisPair));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setValueIfValid(String newValue) throws InvalidityException {
		String oldValue = getValue();
		setValue(newValue);		
		try {
			checkComparisonConsistency();
		} catch (Exception e) {
			setValue(oldValue);
			throw e;
		}		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParametersPackage.TEXT_LITERAL_PARAM__MATCHES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMatches()).basicAdd(otherEnd, msgs);
			case ParametersPackage.TEXT_LITERAL_PARAM__PROPERTIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProperties()).basicAdd(otherEnd, msgs);
			case ParametersPackage.TEXT_LITERAL_PARAM__AXIS_PAIR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAxisPair((AxisPair)otherEnd, msgs);
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
			case ParametersPackage.TEXT_LITERAL_PARAM__MATCHES:
				return ((InternalEList<?>)getMatches()).basicRemove(otherEnd, msgs);
			case ParametersPackage.TEXT_LITERAL_PARAM__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case ParametersPackage.TEXT_LITERAL_PARAM__AXIS_PAIR:
				return basicSetAxisPair(null, msgs);
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
			case ParametersPackage.TEXT_LITERAL_PARAM__AXIS_PAIR:
				return eInternalContainer().eInverseRemove(this, AdaptionxmlPackage.AXIS_PAIR__TEXT_LITERAL_PARAM, AxisPair.class, msgs);
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
			case ParametersPackage.TEXT_LITERAL_PARAM__VALUE:
				return getValue();
			case ParametersPackage.TEXT_LITERAL_PARAM__MATCHES:
				return getMatches();
			case ParametersPackage.TEXT_LITERAL_PARAM__PROPERTIES:
				return getProperties();
			case ParametersPackage.TEXT_LITERAL_PARAM__AXIS_PAIR:
				return getAxisPair();
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
			case ParametersPackage.TEXT_LITERAL_PARAM__VALUE:
				setValue((String)newValue);
				return;
			case ParametersPackage.TEXT_LITERAL_PARAM__MATCHES:
				getMatches().clear();
				getMatches().addAll((Collection<? extends Match>)newValue);
				return;
			case ParametersPackage.TEXT_LITERAL_PARAM__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends PropertyOptionParam>)newValue);
				return;
			case ParametersPackage.TEXT_LITERAL_PARAM__AXIS_PAIR:
				setAxisPair((AxisPair)newValue);
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
			case ParametersPackage.TEXT_LITERAL_PARAM__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ParametersPackage.TEXT_LITERAL_PARAM__MATCHES:
				getMatches().clear();
				return;
			case ParametersPackage.TEXT_LITERAL_PARAM__PROPERTIES:
				getProperties().clear();
				return;
			case ParametersPackage.TEXT_LITERAL_PARAM__AXIS_PAIR:
				setAxisPair((AxisPair)null);
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
			case ParametersPackage.TEXT_LITERAL_PARAM__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case ParametersPackage.TEXT_LITERAL_PARAM__MATCHES:
				return matches != null && !matches.isEmpty();
			case ParametersPackage.TEXT_LITERAL_PARAM__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case ParametersPackage.TEXT_LITERAL_PARAM__AXIS_PAIR:
				return getAxisPair() != null;
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
			case ParametersPackage.TEXT_LITERAL_PARAM___SET_VALUE_IF_VALID__STRING:
				try {
					setValueIfValid((String)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}
	
	@Override 
	public String myToString() {
		
		return "text [" + getInternalId() + "] '" + getValue() + "'";
	}
	
	@Override
	public String generateDescription() {
		String res = "Textfeld";
		return res;
//		try {} catch (Exception e) {}
//		setDescription(res);
	}

} //TextLiteralImpl
