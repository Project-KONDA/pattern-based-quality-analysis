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
import qualitypatternmodel.adaptionxml.XmlAxisPair;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Contains;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.PatternElement;
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
 *   <li>{@link qualitypatternmodel.parameters.impl.TextLiteralParamImpl#getXmlPropertyOptionParam <em>Xml Property Option Param</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.TextLiteralParamImpl#getXmlAxisPair <em>Xml Axis Pair</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.TextLiteralParamImpl#getContains <em>Contains</em>}</li>
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
	 * @generated not
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

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
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<Contains> contains;

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
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		String container = "";
		if (eContainer() instanceof PatternElement)
			container += " in " + eContainer().getClass().getSimpleName() + " [" + ((PatternElement) eContainer()).getInternalId() + "]";
		if (getParameterList() == null && getXmlAxisPair() == null && getXmlPropertyOptionParam() == null)
			throw new InvalidityException("variableList and axisPair null" + " (" + getInternalId() + container + ")");
		if ((abstractionLevel == AbstractionLevel.CONCRETE && !inputIsValid()))
			throw new InvalidityException("input missing or invalid" + " (" + getInternalId() + container + ")");
		if(isPredefined() && !inputIsValid()) {
			throw new InvalidityException("predefined input invalid" + " (" + getInternalId() + container + ")");
		}		
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
	public String generateXQuery() throws InvalidityException {
		if(inputIsValid()) {
			return "\"" + getValue() + "\"";
		} else {
			throw new InvalidityException("invalid string");
		}
	}
	
	@Override
	public String generateSparql() throws InvalidityException {
		if(inputIsValid()) {
			return "\"" + getValue() + "\"";
		} else {
			return super.generateSparql();
		}
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @return String
	 * @throws InvalidityException
	 * Generates the sub-query for TextLiteralParam.
	 */
	@Override 
	public String generateCypher() throws InvalidityException {
		if(inputIsValid()) {
			return "\"" + getValue() + "\"";
		}
		return super.generateCypher();
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
		return super.isUsed() || !getMatches().isEmpty() || getXmlPropertyOptionParam() != null;
	}
	
	@Override
	public EList<String> getSuggestions() {
		EList<String> suggestions = super.getSuggestions();			
		if(getXmlPropertyOptionParam().getValue() == XmlPropertyKind.ATTRIBUTE) {
			suggestions.addAll(Constants.sortByValue(getAttributeNames()).keySet());
		}			
		return suggestions;
	}
	
	@Override
	public EList<String> inferSuggestions() {
		EList<String> suggestions = super.inferSuggestions();
		XmlAxisPair pair = getXmlAxisPair();
		EList<String> suggestionsFromPath = pair.inferElementTagSuggestions();

		if(suggestions.isEmpty() || suggestionsFromPath.isEmpty()) {
			suggestions.addAll(suggestionsFromPath);
		} else {
			suggestions.retainAll(suggestionsFromPath);
		}
				
		return suggestions;
	}
	
	@Override
	protected EList<XmlPropertyKind> getPrimitiveComparisonPropertyKinds() {
		EList<XmlPropertyKind> list = super.getPrimitiveComparisonPropertyKinds();
		if(this instanceof TextLiteralParam) {
			TextLiteralParam text = (TextLiteralParam) this;
			if(text.getXmlAxisPair() != null) {
				list.add(XmlPropertyKind.TAG);
			}
		}
		return list;
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
			setXmlPropertyOptionParam(null);
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
	public XmlPropertyOptionParam getXmlPropertyOptionParam() {
		if (eContainerFeatureID() != ParametersPackage.TEXT_LITERAL_PARAM__XML_PROPERTY_OPTION_PARAM) return null;
		return (XmlPropertyOptionParam)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXmlPropertyOptionParam(XmlPropertyOptionParam newXmlPropertyOptionParam, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newXmlPropertyOptionParam, ParametersPackage.TEXT_LITERAL_PARAM__XML_PROPERTY_OPTION_PARAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXmlPropertyOptionParam(XmlPropertyOptionParam newXmlPropertyOptionParam) {
		if (newXmlPropertyOptionParam != eInternalContainer() || (eContainerFeatureID() != ParametersPackage.TEXT_LITERAL_PARAM__XML_PROPERTY_OPTION_PARAM && newXmlPropertyOptionParam != null)) {
			if (EcoreUtil.isAncestor(this, newXmlPropertyOptionParam))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newXmlPropertyOptionParam != null)
				msgs = ((InternalEObject)newXmlPropertyOptionParam).eInverseAdd(this, AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__ATTRIBUTE_NAME, XmlPropertyOptionParam.class, msgs);
			msgs = basicSetXmlPropertyOptionParam(newXmlPropertyOptionParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.TEXT_LITERAL_PARAM__XML_PROPERTY_OPTION_PARAM, newXmlPropertyOptionParam, newXmlPropertyOptionParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlAxisPair getXmlAxisPair() {
		if (eContainerFeatureID() != ParametersPackage.TEXT_LITERAL_PARAM__XML_AXIS_PAIR) return null;
		return (XmlAxisPair)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXmlAxisPair(XmlAxisPair newXmlAxisPair, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newXmlAxisPair, ParametersPackage.TEXT_LITERAL_PARAM__XML_AXIS_PAIR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXmlAxisPair(XmlAxisPair newXmlAxisPair) {
		if (newXmlAxisPair != eInternalContainer() || (eContainerFeatureID() != ParametersPackage.TEXT_LITERAL_PARAM__XML_AXIS_PAIR && newXmlAxisPair != null)) {
			if (EcoreUtil.isAncestor(this, newXmlAxisPair))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newXmlAxisPair != null)
				msgs = ((InternalEObject)newXmlAxisPair).eInverseAdd(this, AdaptionxmlPackage.XML_AXIS_PAIR__TEXT_LITERAL_PARAM, XmlAxisPair.class, msgs);
			msgs = basicSetXmlAxisPair(newXmlAxisPair, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.TEXT_LITERAL_PARAM__XML_AXIS_PAIR, newXmlAxisPair, newXmlAxisPair));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Contains> getContains() {
		if (contains == null) {
			contains = new EObjectWithInverseResolvingEList<Contains>(Contains.class, this, ParametersPackage.TEXT_LITERAL_PARAM__CONTAINS, OperatorsPackage.CONTAINS__CONTENT);
		}
		return contains;
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
			case ParametersPackage.TEXT_LITERAL_PARAM__XML_PROPERTY_OPTION_PARAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetXmlPropertyOptionParam((XmlPropertyOptionParam)otherEnd, msgs);
			case ParametersPackage.TEXT_LITERAL_PARAM__XML_AXIS_PAIR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetXmlAxisPair((XmlAxisPair)otherEnd, msgs);
			case ParametersPackage.TEXT_LITERAL_PARAM__CONTAINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContains()).basicAdd(otherEnd, msgs);
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
			case ParametersPackage.TEXT_LITERAL_PARAM__XML_PROPERTY_OPTION_PARAM:
				return basicSetXmlPropertyOptionParam(null, msgs);
			case ParametersPackage.TEXT_LITERAL_PARAM__XML_AXIS_PAIR:
				return basicSetXmlAxisPair(null, msgs);
			case ParametersPackage.TEXT_LITERAL_PARAM__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
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
			case ParametersPackage.TEXT_LITERAL_PARAM__XML_PROPERTY_OPTION_PARAM:
				return eInternalContainer().eInverseRemove(this, AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__ATTRIBUTE_NAME, XmlPropertyOptionParam.class, msgs);
			case ParametersPackage.TEXT_LITERAL_PARAM__XML_AXIS_PAIR:
				return eInternalContainer().eInverseRemove(this, AdaptionxmlPackage.XML_AXIS_PAIR__TEXT_LITERAL_PARAM, XmlAxisPair.class, msgs);
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
			case ParametersPackage.TEXT_LITERAL_PARAM__XML_PROPERTY_OPTION_PARAM:
				return getXmlPropertyOptionParam();
			case ParametersPackage.TEXT_LITERAL_PARAM__XML_AXIS_PAIR:
				return getXmlAxisPair();
			case ParametersPackage.TEXT_LITERAL_PARAM__CONTAINS:
				return getContains();
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
			case ParametersPackage.TEXT_LITERAL_PARAM__XML_PROPERTY_OPTION_PARAM:
				setXmlPropertyOptionParam((XmlPropertyOptionParam)newValue);
				return;
			case ParametersPackage.TEXT_LITERAL_PARAM__XML_AXIS_PAIR:
				setXmlAxisPair((XmlAxisPair)newValue);
				return;
			case ParametersPackage.TEXT_LITERAL_PARAM__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends Contains>)newValue);
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
			case ParametersPackage.TEXT_LITERAL_PARAM__XML_PROPERTY_OPTION_PARAM:
				setXmlPropertyOptionParam((XmlPropertyOptionParam)null);
				return;
			case ParametersPackage.TEXT_LITERAL_PARAM__XML_AXIS_PAIR:
				setXmlAxisPair((XmlAxisPair)null);
				return;
			case ParametersPackage.TEXT_LITERAL_PARAM__CONTAINS:
				getContains().clear();
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
			case ParametersPackage.TEXT_LITERAL_PARAM__XML_PROPERTY_OPTION_PARAM:
				return getXmlPropertyOptionParam() != null;
			case ParametersPackage.TEXT_LITERAL_PARAM__XML_AXIS_PAIR:
				return getXmlAxisPair() != null;
			case ParametersPackage.TEXT_LITERAL_PARAM__CONTAINS:
				return contains != null && !contains.isEmpty();
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
