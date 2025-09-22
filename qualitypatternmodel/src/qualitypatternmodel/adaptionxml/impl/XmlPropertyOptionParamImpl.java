/**
 */
package qualitypatternmodel.adaptionxml.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.json.JSONArray;

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlAxisPartCondition;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.impl.ParameterImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.ConstantsXml;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlPropertyOptionParamImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlPropertyOptionParamImpl#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlPropertyOptionParamImpl#getXmlPathParam <em>Xml Path Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlPropertyOptionParamImpl#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlPropertyOptionParamImpl#getXmlAxisPartCondition <em>Xml Axis Part Condition</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlPropertyOptionParamImpl#getAxis <em>Axis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XmlPropertyOptionParamImpl extends ParameterImpl implements XmlPropertyOptionParam {
	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * A subset of all XML property types to choose from during the concretization.
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated NOT
	 * @ordered
	 */
	protected EList<XmlPropertyKind> options = new BasicEList<XmlPropertyKind>(XmlPropertyKind.VALUES);

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated NOT
	 * @ordered
	 */
	protected static final XmlPropertyKind VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * The chosen concrete property type.
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected XmlPropertyKind value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributeName() <em>Attribute Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeName()
	 * @generated
	 * @ordered
	 */
	protected TextLiteralParam attributeName;

	/**
	 * The default value of the '{@link #getAxis() <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected static final XmlAxisKind AXIS_EDEFAULT = XmlAxisKind.CHILD;

	/**
	 * The cached value of the '{@link #getAxis() <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected XmlAxisKind axis = AXIS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * Constructor.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public XmlPropertyOptionParamImpl() {
		super();
	}

	public XmlPropertyOptionParamImpl(String value) throws InvalidityException {
		super();
		setValueFromString(value);
	}

	@Override
	public String getValueAsString() {
		if (getValue() == null) {
			return null;
		}
		return getValue().getName();
	}

	@Override
	public void setValueFromString(String value) throws InvalidityException {
		if (value == null) {
			clear();
			return;
		}

		if (!value.matches(ConstantsXml.REGEX_PROPERTY_AXIS_OPTIONAL))
			throw new InvalidityException("new property kind value '" + value + "'invalid in " + myToString());

		XmlAxisKind ax = null;
		XmlPropertyKind pro = null;
		String attName = "";

		// identify axis & remove from value
		for (XmlAxisKind axiskind: XmlAxisKind.VALUES) {
			String literal = axiskind.getLiteral();
			if (value.startsWith(literal)) {
				value = value.replace(literal, "");
				ax = axiskind;
				break;
			}
		}
		if (ax == null) {
			if (value.startsWith("//")) {
				value = value.substring(2);
				ax = XmlAxisKind.DESCENDANT;
			} else if (value.startsWith("/")) {
				value = value.substring(1);
				ax = XmlAxisKind.CHILD;
			} else 
				ax = XmlAxisKind.CHILD;
//				throw new InvalidityException("Invalid configuration: no valid axis");
		}

		// identify property kind
		if (value.equals("text()") || value.equals("data()"))
			pro = XmlPropertyKind.DATA;
		else if (value.equals("name()"))
			pro = XmlPropertyKind.TAG;
		else if (value.startsWith("@")) {
			pro = XmlPropertyKind.ATTRIBUTE;
			if (value.matches(ConstantsXml.REGEX_ATTRIBUTE)){
				if (value.substring(1).matches(ConstantsXml.REGEX_ATTRIBUTE_NAME))
					attName = value.substring(1);
				else {
					String[] parts = value.split("\"");
					if (parts.length != 3)
						throw new InvalidityException("Invalid configuration: invalid attribute specification.");
					 attName = parts[1];
				}	
			}
			if (attName == null || !attName.matches(ConstantsXml.REGEX_ATTRIBUTE_NAME))
				throw new InvalidityException("Invalid configuration: invalid attribute name: " + attName);	
		} else 
			throw new InvalidityException("Invalid configuration: no valid property");

		if (pro == null)
			throw new InvalidityException("Invalid configuration: no valid property kind");
		setAxis(ax);
		setValue(pro);
		if (pro == XmlPropertyKind.ATTRIBUTE) {
			// attName cannot be invalid at this point
			getAttributeName().setValue(attName);	
		}
	}

	@Override
	public void clear() {
		setValue(null);
		setAttributeName(null);
	}

	@Override
	public JSONArray getOptionsAsJsonArray() {
		JSONArray jarray = new JSONArray();
		for (XmlPropertyKind axis: getOptions()) {
			jarray.put(axis);
		}
		return jarray;
	}

	@Override
	public void checkComparisonConsistency() throws InvalidityException {
		XmlPathParam xpath = getXmlPathParam();
		if (xpath != null) {
			XmlNavigation xnav = xpath.getXmlNavigation();
			if (xnav != null) {
				Node tar = getXmlPathParam().getXmlNavigation().getTarget();
				if (tar != null) {
					tar.checkComparisonConsistency();
				}
			}
		}
	}

	@Override
	public String generateXQuery() throws InvalidityException {

		if(getValue() == null) {
			throw new InvalidityException("propertyOption invalid");
		}
		String axis = getAxis().getLiteral();
		if (getAxis().equals(XmlAxisKind.CHILD))
			axis = "/";
		if (getAxis().equals(XmlAxisKind.DESCENDANT))
			axis = "//"; 

		switch (getValue()) {
		case ATTRIBUTE:
			if (attributeName == null || attributeName.getValue() == null) {
				throw new InvalidityException("attributeName invalid");
			} else {
				if (attributeName.getValue().contains(":")) {
					String ns = attributeName.getValue().split(":")[0];
					try {
						CompletePattern p = (CompletePattern) getAncestor(CompletePattern.class);
						if (!p.getNamespaces().getKeys().contains(ns))
							return axis + "@*[name()=\"" + attributeName.getValue() + "\"]";
					} catch (MissingPatternContainerException e) {}
				}
				return axis + "@" + attributeName.getValue() + "";
			}
		case DATA:
			return axis + "text()";
		case TAG:
			return axis + "name()";
		default:
			throw new InvalidityException("error in location specification");
		}
	}

	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException  {
		super.isValid(abstractionLevel);
		if(getAttributeName() != null && getValue() == XmlPropertyKind.ATTRIBUTE) {
			getAttributeName().isValid(abstractionLevel);
		}
	}

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		if (getOptions() == null) {
			throw new InvalidityException("options null");
		}
		if (abstractionLevel != AbstractionLevel.SEMI_GENERIC && getOptions().isEmpty()) {
			throw new InvalidityException("not enough options");
		}
		if ((abstractionLevel == AbstractionLevel.CONCRETE && !inputIsValid())) {
			throw new InvalidityException("input missing or invalid" + " (" + getInternalId() + ")");
		}
		if(isPredefined() && !inputIsValid()) {
			throw new InvalidityException("predefined input invalid" + " (" + getInternalId() + ")");
		}
		if (getAttributeName() == null && getValue() == XmlPropertyKind.ATTRIBUTE) {
			throw new InvalidityException("attributeName null");
		}
		if(getParameterList() != null) {
			throw new InvalidityException("PropertyOptionParam contained in ParameterList instead of PathParam");
		}
	}

	@Override
	public boolean inputIsValid() {
		return getAxis() != null && getValue() != null && getOptions().contains(getValue());
	}

	@Override
	public void createParameters() {
		ParameterList parameterList = getParameterList();
		if(parameterList != null) {
			if(getAttributeName() == null) {
				TextLiteralParam textLiteral = new TextLiteralParamImpl();
				setAttributeName(textLiteral);
			}
		}
	}

	@Override
	public boolean isUsed() {
		return !(getXmlPathParam() == null) && !(getXmlPathParam().getXmlNavigation() == null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NotificationChain basicSetParameterList(ParameterList newVariableList, NotificationChain msgs) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionxmlPackage.Literals.XML_PROPERTY_OPTION_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<XmlPropertyKind> getOptions() {
		if (options == null) {
			options = new EDataTypeUniqueEList<XmlPropertyKind>(XmlPropertyKind.class, this, AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__OPTIONS);
		}
		else if (options.size() > 1){
			EList<XmlPropertyKind> options2 = new EDataTypeUniqueEList<XmlPropertyKind>(XmlPropertyKind.class, this, AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__OPTIONS);
			for (XmlPropertyKind cop: options) {
				if (!options2.contains(cop)) {
					options2.add(cop);
				}
			}
			options = options2;
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlPropertyKind getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setValue(XmlPropertyKind newValue) {
		XmlPropertyKind oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		if (newValue == XmlPropertyKind.ATTRIBUTE) {
			if (getAttributeName() == null) {
				TextLiteralParam text = new TextLiteralParamImpl();
				setAttributeName(text);
			}
		} else {
			setAttributeName(null);
		}

		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__VALUE, oldValue, value));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlPathParam getXmlPathParam() {
		if (eContainerFeatureID() != AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__XML_PATH_PARAM) return null;
		return (XmlPathParam)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXmlPathParam(XmlPathParam newXmlPathParam, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newXmlPathParam, AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__XML_PATH_PARAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXmlPathParam(XmlPathParam newXmlPathParam) {
		if (newXmlPathParam != eInternalContainer() || (eContainerFeatureID() != AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__XML_PATH_PARAM && newXmlPathParam != null)) {
			if (EcoreUtil.isAncestor(this, newXmlPathParam))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newXmlPathParam != null)
				msgs = ((InternalEObject)newXmlPathParam).eInverseAdd(this, AdaptionxmlPackage.XML_PATH_PARAM__XML_PROPERTY_OPTION_PARAM, XmlPathParam.class, msgs);
			msgs = basicSetXmlPathParam(newXmlPathParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__XML_PATH_PARAM, newXmlPathParam, newXmlPathParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextLiteralParam getAttributeName() {
		return attributeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetAttributeName(TextLiteralParam newAttributeName, NotificationChain msgs) {
		TextLiteralParam oldAttributeName = attributeName;

		ParameterList varlist = getParameterList();
		if (varlist != null){
			if (oldAttributeName != null) {
				varlist.remove(oldAttributeName);
			}
			if (newAttributeName != null) {
				newAttributeName.setParameterList(varlist);
			}
		}

		attributeName = newAttributeName;

		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__ATTRIBUTE_NAME, oldAttributeName, newAttributeName);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttributeName(TextLiteralParam newAttributeName) {
		if (newAttributeName != attributeName) {
			NotificationChain msgs = null;
			if (attributeName != null)
				msgs = ((InternalEObject)attributeName).eInverseRemove(this, ParametersPackage.TEXT_LITERAL_PARAM__XML_PROPERTY_OPTION_PARAM, TextLiteralParam.class, msgs);
			if (newAttributeName != null)
				msgs = ((InternalEObject)newAttributeName).eInverseAdd(this, ParametersPackage.TEXT_LITERAL_PARAM__XML_PROPERTY_OPTION_PARAM, TextLiteralParam.class, msgs);
			msgs = basicSetAttributeName(newAttributeName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__ATTRIBUTE_NAME, newAttributeName, newAttributeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlAxisPartCondition getXmlAxisPartCondition() {
		if (eContainerFeatureID() != AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__XML_AXIS_PART_CONDITION) return null;
		return (XmlAxisPartCondition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXmlAxisPartCondition(XmlAxisPartCondition newXmlAxisPartCondition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newXmlAxisPartCondition, AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__XML_AXIS_PART_CONDITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXmlAxisPartCondition(XmlAxisPartCondition newXmlAxisPartCondition) {
		if (newXmlAxisPartCondition != eInternalContainer() || (eContainerFeatureID() != AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__XML_AXIS_PART_CONDITION && newXmlAxisPartCondition != null)) {
			if (EcoreUtil.isAncestor(this, newXmlAxisPartCondition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newXmlAxisPartCondition != null)
				msgs = ((InternalEObject)newXmlAxisPartCondition).eInverseAdd(this, AdaptionxmlPackage.XML_AXIS_PART_CONDITION__XML_PROPERTY_OPTION, XmlAxisPartCondition.class, msgs);
			msgs = basicSetXmlAxisPartCondition(newXmlAxisPartCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__XML_AXIS_PART_CONDITION, newXmlAxisPartCondition, newXmlAxisPartCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlAxisKind getAxis() {
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAxis(XmlAxisKind newAxis) {
		XmlAxisKind oldAxis = axis;
		axis = newAxis == null ? AXIS_EDEFAULT : newAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__AXIS, oldAxis, axis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setValueIfValid(XmlPropertyKind newValue) throws InvalidityException {
		XmlPropertyKind oldValue = getValue();
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
	@Override
	public void removeParametersFromParameterList() {
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__XML_PATH_PARAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetXmlPathParam((XmlPathParam)otherEnd, msgs);
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__ATTRIBUTE_NAME:
				if (attributeName != null)
					msgs = ((InternalEObject)attributeName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__ATTRIBUTE_NAME, null, msgs);
				return basicSetAttributeName((TextLiteralParam)otherEnd, msgs);
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__XML_AXIS_PART_CONDITION:
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
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__XML_PATH_PARAM:
				return basicSetXmlPathParam(null, msgs);
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__ATTRIBUTE_NAME:
				return basicSetAttributeName(null, msgs);
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__XML_AXIS_PART_CONDITION:
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
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__XML_PATH_PARAM:
				return eInternalContainer().eInverseRemove(this, AdaptionxmlPackage.XML_PATH_PARAM__XML_PROPERTY_OPTION_PARAM, XmlPathParam.class, msgs);
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__XML_AXIS_PART_CONDITION:
				return eInternalContainer().eInverseRemove(this, AdaptionxmlPackage.XML_AXIS_PART_CONDITION__XML_PROPERTY_OPTION, XmlAxisPartCondition.class, msgs);
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
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__OPTIONS:
				return getOptions();
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__VALUE:
				return getValue();
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__XML_PATH_PARAM:
				return getXmlPathParam();
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__ATTRIBUTE_NAME:
				return getAttributeName();
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__XML_AXIS_PART_CONDITION:
				return getXmlAxisPartCondition();
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__AXIS:
				return getAxis();
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
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends XmlPropertyKind>)newValue);
				return;
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__VALUE:
				setValue((XmlPropertyKind)newValue);
				return;
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__XML_PATH_PARAM:
				setXmlPathParam((XmlPathParam)newValue);
				return;
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__ATTRIBUTE_NAME:
				setAttributeName((TextLiteralParam)newValue);
				return;
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__XML_AXIS_PART_CONDITION:
				setXmlAxisPartCondition((XmlAxisPartCondition)newValue);
				return;
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__AXIS:
				setAxis((XmlAxisKind)newValue);
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
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__OPTIONS:
				getOptions().clear();
				return;
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__XML_PATH_PARAM:
				setXmlPathParam((XmlPathParam)null);
				return;
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__ATTRIBUTE_NAME:
				setAttributeName((TextLiteralParam)null);
				return;
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__XML_AXIS_PART_CONDITION:
				setXmlAxisPartCondition((XmlAxisPartCondition)null);
				return;
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__AXIS:
				setAxis(AXIS_EDEFAULT);
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
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__OPTIONS:
				return options != null && !options.isEmpty();
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__VALUE:
				return value != VALUE_EDEFAULT;
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__XML_PATH_PARAM:
				return getXmlPathParam() != null;
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__ATTRIBUTE_NAME:
				return attributeName != null;
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__XML_AXIS_PART_CONDITION:
				return getXmlAxisPartCondition() != null;
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__AXIS:
				return axis != AXIS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Adaptable.class) {
			switch (baseOperationID) {
				case GraphstructurePackage.ADAPTABLE___CREATE_PARAMETERS: return AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM___CREATE_PARAMETERS;
				case GraphstructurePackage.ADAPTABLE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST: return AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM___SET_VALUE_IF_VALID__XMLPROPERTYKIND:
				try {
					setValueIfValid((XmlPropertyKind)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM___CREATE_PARAMETERS:
				createParameters();
				return null;
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST:
				removeParametersFromParameterList();
				return null;
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
		result.append(" (options: ");
		result.append(options);
		result.append(", value: ");
		result.append(value);
		result.append(", axis: ");
		result.append(axis);
		result.append(')');
		return result.toString();
	}

	@Override
	public String myToString() {
		String result = "{";
		result += getAxis().getName();
		result += ", ";
		result += getValueAsString();
		if (getAttributeName() != null && getAttributeName().getValue() != null) {
			result += ", " + getAttributeName().myToString();
		}
		result += "}";
		return result;
	}

	@Override
	public String generateDescription() {
		String res = "Angabe des Eigenschaft-Types";
		try {
			res += " von " + getXmlPathParam().getXmlNavigation().getName();
		} catch (Exception e) {}

		return res;
//		setDescription(res);
	}

} //PropertyOptionImpl
