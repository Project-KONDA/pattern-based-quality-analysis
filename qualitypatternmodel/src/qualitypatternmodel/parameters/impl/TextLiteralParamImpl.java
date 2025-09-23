/**
 */
package qualitypatternmodel.parameters.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.XmlAxisPartCondition;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Contains;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.TextParam;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Literal</b></em>'.
 * A parameter of type <code>String</code>.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.impl.TextLiteralParamImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.TextLiteralParamImpl#getMatches <em>Matches</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.TextLiteralParamImpl#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.TextLiteralParamImpl#getXmlPropertyOptionParam <em>Xml Property Option Param</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.TextLiteralParamImpl#getXmlAxisPartCondition <em>Xml Axis Part Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextLiteralParamImpl extends ParameterValueImpl implements TextLiteralParam {
	private static final String TEXT_CYPHER = "\"%s\"";

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
		if (eContainer() instanceof PatternElement) {
			container += " in " + eContainer().getClass().getSimpleName() + " [" + ((PatternElement) eContainer()).getInternalId() + "]";
		}
		if (getParameterList() == null && getXmlAxisPartCondition() == null && getXmlPropertyOptionParam() == null) {
			throw new InvalidityException("variableList and axisPart null" + " (" + getInternalId() + container + ")");
		}
		if ((abstractionLevel == AbstractionLevel.CONCRETE && !inputIsValid())) {
			throw new InvalidityException("input missing or invalid" + " (" + getInternalId() + container + ")");
		}
		if (isPredefined() && !inputIsValid()) {
			throw new InvalidityException("predefined input invalid" + " (" + getInternalId() + container + ")");
		}
	}

	@Override
	public String getValueAsString() {
		return getValue();
	}

	@Override
	public void setValueFromString(String value) throws InvalidityException {
		if (value == null) {
			clear();
			return;
		}
		setValueIfValid(value);
	}

	@Override
	public void clear() {
		setValue(null);
	}

	public TextLiteralParamImpl(String value) {
		super();
		this.value = value;
	}

	@Override
	public String generateXQuery() throws InvalidityException {
		if (inputIsValid()) {
			return "\"" + getValue() + "\"";
		} else {
			throw new InvalidityException("invalid string at textlistparam " + getInternalId());
		}
	}

	@Override
	public String generateSparql() throws InvalidityException {
		if (inputIsValid()) {
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
		if (inputIsValid()) {
			return String.format(TextLiteralParamImpl.TEXT_CYPHER, getValue());
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
	protected EList<XmlPropertyKind> getPrimitiveComparisonPropertyKinds() {
		EList<XmlPropertyKind> list = super.getPrimitiveComparisonPropertyKinds();
		if (this instanceof TextLiteralParam) {
			TextLiteralParam text = this;
			if (text.getXmlAxisPartCondition() != null) {
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
	@Override
	public NotificationChain basicSetParameterList(ParameterList newVariableList, NotificationChain msgs) {
		if (newVariableList == null) {
			((TextParam) this).getMatches().clear();
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
	public XmlAxisPartCondition getXmlAxisPartCondition() {
		if (eContainerFeatureID() != ParametersPackage.TEXT_LITERAL_PARAM__XML_AXIS_PART_CONDITION) return null;
		return (XmlAxisPartCondition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXmlAxisPartCondition(XmlAxisPartCondition newXmlAxisPartCondition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newXmlAxisPartCondition, ParametersPackage.TEXT_LITERAL_PARAM__XML_AXIS_PART_CONDITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXmlAxisPartCondition(XmlAxisPartCondition newXmlAxisPartCondition) {
		if (newXmlAxisPartCondition != eInternalContainer() || (eContainerFeatureID() != ParametersPackage.TEXT_LITERAL_PARAM__XML_AXIS_PART_CONDITION && newXmlAxisPartCondition != null)) {
			if (EcoreUtil.isAncestor(this, newXmlAxisPartCondition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newXmlAxisPartCondition != null)
				msgs = ((InternalEObject)newXmlAxisPartCondition).eInverseAdd(this, AdaptionxmlPackage.XML_AXIS_PART_CONDITION__TEXT_LITERAL_PARAM, XmlAxisPartCondition.class, msgs);
			msgs = basicSetXmlAxisPartCondition(newXmlAxisPartCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.TEXT_LITERAL_PARAM__XML_AXIS_PART_CONDITION, newXmlAxisPartCondition, newXmlAxisPartCondition));
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
			if (newValue != null) {
				checkComparisonConsistency();
				for (Operator operator: getOperators()) {
					operator.isValid(AbstractionLevel.CONCRETE);
				}
				for (Parameter parameter: getParameters()) {
					parameter.isValid(AbstractionLevel.CONCRETE);
				}
			}
		} catch (Exception e) {
			setValue(oldValue);
			throw new InvalidityException(e.getMessage(), e);
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
			case ParametersPackage.TEXT_LITERAL_PARAM__CONTAINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContains()).basicAdd(otherEnd, msgs);
			case ParametersPackage.TEXT_LITERAL_PARAM__MATCHES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMatches()).basicAdd(otherEnd, msgs);
			case ParametersPackage.TEXT_LITERAL_PARAM__XML_PROPERTY_OPTION_PARAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetXmlPropertyOptionParam((XmlPropertyOptionParam)otherEnd, msgs);
			case ParametersPackage.TEXT_LITERAL_PARAM__XML_AXIS_PART_CONDITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetXmlAxisPartCondition((XmlAxisPartCondition)otherEnd, msgs);
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
			case ParametersPackage.TEXT_LITERAL_PARAM__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
			case ParametersPackage.TEXT_LITERAL_PARAM__MATCHES:
				return ((InternalEList<?>)getMatches()).basicRemove(otherEnd, msgs);
			case ParametersPackage.TEXT_LITERAL_PARAM__XML_PROPERTY_OPTION_PARAM:
				return basicSetXmlPropertyOptionParam(null, msgs);
			case ParametersPackage.TEXT_LITERAL_PARAM__XML_AXIS_PART_CONDITION:
				return basicSetXmlAxisPartCondition(null, msgs);
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
			case ParametersPackage.TEXT_LITERAL_PARAM__XML_AXIS_PART_CONDITION:
				return eInternalContainer().eInverseRemove(this, AdaptionxmlPackage.XML_AXIS_PART_CONDITION__TEXT_LITERAL_PARAM, XmlAxisPartCondition.class, msgs);
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
			case ParametersPackage.TEXT_LITERAL_PARAM__CONTAINS:
				return getContains();
			case ParametersPackage.TEXT_LITERAL_PARAM__MATCHES:
				return getMatches();
			case ParametersPackage.TEXT_LITERAL_PARAM__VALUE:
				return getValue();
			case ParametersPackage.TEXT_LITERAL_PARAM__XML_PROPERTY_OPTION_PARAM:
				return getXmlPropertyOptionParam();
			case ParametersPackage.TEXT_LITERAL_PARAM__XML_AXIS_PART_CONDITION:
				return getXmlAxisPartCondition();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public EList<Operator> getOperators() {
		EList<Operator> parameters = new BasicEList<>();
		parameters.addAll((EList<? extends Operator>) getMatches());
		parameters.addAll((EList<? extends Operator>) getContains());
		return parameters;
	}
	
	@Override
	public EList<Parameter> getParameters() {
		EList<Parameter> parameters = new BasicEList<Parameter>();
		if (getXmlPropertyOptionParam() != null)
			parameters.add(getXmlPropertyOptionParam());
		if (getXmlAxisPartCondition() != null)
			parameters.add(getXmlAxisPartCondition());
		return parameters;
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
			case ParametersPackage.TEXT_LITERAL_PARAM__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends Contains>)newValue);
				return;
			case ParametersPackage.TEXT_LITERAL_PARAM__MATCHES:
				getMatches().clear();
				getMatches().addAll((Collection<? extends Match>)newValue);
				return;
			case ParametersPackage.TEXT_LITERAL_PARAM__VALUE:
				setValue((String)newValue);
				return;
			case ParametersPackage.TEXT_LITERAL_PARAM__XML_PROPERTY_OPTION_PARAM:
				setXmlPropertyOptionParam((XmlPropertyOptionParam)newValue);
				return;
			case ParametersPackage.TEXT_LITERAL_PARAM__XML_AXIS_PART_CONDITION:
				setXmlAxisPartCondition((XmlAxisPartCondition)newValue);
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
			case ParametersPackage.TEXT_LITERAL_PARAM__CONTAINS:
				getContains().clear();
				return;
			case ParametersPackage.TEXT_LITERAL_PARAM__MATCHES:
				getMatches().clear();
				return;
			case ParametersPackage.TEXT_LITERAL_PARAM__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ParametersPackage.TEXT_LITERAL_PARAM__XML_PROPERTY_OPTION_PARAM:
				setXmlPropertyOptionParam((XmlPropertyOptionParam)null);
				return;
			case ParametersPackage.TEXT_LITERAL_PARAM__XML_AXIS_PART_CONDITION:
				setXmlAxisPartCondition((XmlAxisPartCondition)null);
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
			case ParametersPackage.TEXT_LITERAL_PARAM__CONTAINS:
				return contains != null && !contains.isEmpty();
			case ParametersPackage.TEXT_LITERAL_PARAM__MATCHES:
				return matches != null && !matches.isEmpty();
			case ParametersPackage.TEXT_LITERAL_PARAM__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case ParametersPackage.TEXT_LITERAL_PARAM__XML_PROPERTY_OPTION_PARAM:
				return getXmlPropertyOptionParam() != null;
			case ParametersPackage.TEXT_LITERAL_PARAM__XML_AXIS_PART_CONDITION:
				return getXmlAxisPartCondition() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TextParam.class) {
			switch (derivedFeatureID) {
				case ParametersPackage.TEXT_LITERAL_PARAM__CONTAINS: return ParametersPackage.TEXT_PARAM__CONTAINS;
				case ParametersPackage.TEXT_LITERAL_PARAM__MATCHES: return ParametersPackage.TEXT_PARAM__MATCHES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TextParam.class) {
			switch (baseFeatureID) {
				case ParametersPackage.TEXT_PARAM__CONTAINS: return ParametersPackage.TEXT_LITERAL_PARAM__CONTAINS;
				case ParametersPackage.TEXT_PARAM__MATCHES: return ParametersPackage.TEXT_LITERAL_PARAM__MATCHES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
