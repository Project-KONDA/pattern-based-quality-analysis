/**
 */
package qualitypatternmodel.adaptionxml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.XmlAxisPart;
import qualitypatternmodel.adaptionxml.XmlAxisPartCondition;
import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.impl.ParameterImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.utility.ConstantsXml;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xml Axis Part Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlAxisPartConditionImpl#getXmlPropertyOption <em>Xml Property Option</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlAxisPartConditionImpl#getTextLiteralParam <em>Text Literal Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlAxisPartConditionImpl#getXmlAxisPart <em>Xml Axis Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XmlAxisPartConditionImpl extends ParameterImpl implements XmlAxisPartCondition {
	/**
	 * The cached value of the '{@link #getXmlPropertyOption() <em>Xml Property Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlPropertyOption()
	 * @generated
	 * @ordered
	 */
	protected XmlPropertyOptionParam xmlPropertyOption;

	/**
	 * The cached value of the '{@link #getTextLiteralParam() <em>Text Literal Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextLiteralParam()
	 * @generated
	 * @ordered
	 */
	protected TextLiteralParam textLiteralParam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public XmlAxisPartConditionImpl() {
		super();
	}

	@Override
	public String generateXQuery() throws InvalidityException {
		String query = getXmlPropertyOption().generateXQuery().substring(1); // remove '/'
		if (getTextLiteralParam() != null) {
			query += "=" + getTextLiteralParam().generateXQuery();
		}
		if (query.equals("name()"))
			return "";
		return "[" + query + "]";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setValueFromString(String value) throws InvalidityException {
		if (!(value.startsWith("[") && value.endsWith("]"))) {
			throw new InvalidityException("new property value invalid in " + myToString() + ": " + value);
		}

		value = value.substring(1, value.length() - 1).trim();
		String[] propertySplit = value.split("=", 2);

		propertySplit[0] = propertySplit[0].trim();

		if (!propertySplit[0].matches(ConstantsXml.REGEX_PROPERTY_SPEC)) {
			throw new InvalidityException("new property value invalid in " + myToString() + ": '" + value + "', [" + propertySplit[0] + "]");
		}

		if(getXmlPropertyOption() == null) {
			setXmlPropertyOption(new XmlPropertyOptionParamImpl());
		}
		getXmlPropertyOption().setValueFromString(propertySplit[0]);

		if (propertySplit.length>1) {
			propertySplit[1] = propertySplit[1].trim();
			if (!propertySplit[1].startsWith("\"") || !propertySplit[1].endsWith("\"")) {
				throw new InvalidityException("new property value invalid in " + myToString() + ": " + value);
			}
			String propertyvalue = propertySplit[1].substring(1, propertySplit[1].length() - 1);
			if(getTextLiteralParam() == null) {
				setTextLiteralParam(new TextLiteralParamImpl(propertyvalue));
			} else {
				getTextLiteralParam().setValue(propertyvalue);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getValueAsString() {
		try {
			return generateXQuery();
		} catch (InvalidityException e) {
			return null;
		}
	}

	@Override
	public void clear() {
		if (getXmlPropertyOption() != null) {
			getXmlPropertyOption().clear();
		}
		if (getTextLiteralParam() != null) {
			getTextLiteralParam().clear();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionxmlPackage.Literals.XML_AXIS_PART_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlPropertyOptionParam getXmlPropertyOption() {
		return xmlPropertyOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXmlPropertyOption(XmlPropertyOptionParam newXmlPropertyOption, NotificationChain msgs) {
		XmlPropertyOptionParam oldXmlPropertyOption = xmlPropertyOption;
		xmlPropertyOption = newXmlPropertyOption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_AXIS_PART_CONDITION__XML_PROPERTY_OPTION, oldXmlPropertyOption, newXmlPropertyOption);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXmlPropertyOption(XmlPropertyOptionParam newXmlPropertyOption) {
		if (newXmlPropertyOption != xmlPropertyOption) {
			NotificationChain msgs = null;
			if (xmlPropertyOption != null)
				msgs = ((InternalEObject)xmlPropertyOption).eInverseRemove(this, AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__XML_AXIS_PART_CONDITION, XmlPropertyOptionParam.class, msgs);
			if (newXmlPropertyOption != null)
				msgs = ((InternalEObject)newXmlPropertyOption).eInverseAdd(this, AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__XML_AXIS_PART_CONDITION, XmlPropertyOptionParam.class, msgs);
			msgs = basicSetXmlPropertyOption(newXmlPropertyOption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_AXIS_PART_CONDITION__XML_PROPERTY_OPTION, newXmlPropertyOption, newXmlPropertyOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextLiteralParam getTextLiteralParam() {
		return textLiteralParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextLiteralParam(TextLiteralParam newTextLiteralParam, NotificationChain msgs) {
		TextLiteralParam oldTextLiteralParam = textLiteralParam;
		textLiteralParam = newTextLiteralParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_AXIS_PART_CONDITION__TEXT_LITERAL_PARAM, oldTextLiteralParam, newTextLiteralParam);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextLiteralParam(TextLiteralParam newTextLiteralParam) {
		if (newTextLiteralParam != textLiteralParam) {
			NotificationChain msgs = null;
			if (textLiteralParam != null)
				msgs = ((InternalEObject)textLiteralParam).eInverseRemove(this, ParametersPackage.TEXT_LITERAL_PARAM__XML_AXIS_PART_CONDITION, TextLiteralParam.class, msgs);
			if (newTextLiteralParam != null)
				msgs = ((InternalEObject)newTextLiteralParam).eInverseAdd(this, ParametersPackage.TEXT_LITERAL_PARAM__XML_AXIS_PART_CONDITION, TextLiteralParam.class, msgs);
			msgs = basicSetTextLiteralParam(newTextLiteralParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_AXIS_PART_CONDITION__TEXT_LITERAL_PARAM, newTextLiteralParam, newTextLiteralParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlAxisPart getXmlAxisPart() {
		if (eContainerFeatureID() != AdaptionxmlPackage.XML_AXIS_PART_CONDITION__XML_AXIS_PART) return null;
		return (XmlAxisPart)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXmlAxisPart(XmlAxisPart newXmlAxisPart, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newXmlAxisPart, AdaptionxmlPackage.XML_AXIS_PART_CONDITION__XML_AXIS_PART, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXmlAxisPart(XmlAxisPart newXmlAxisPart) {
		if (newXmlAxisPart != eInternalContainer() || (eContainerFeatureID() != AdaptionxmlPackage.XML_AXIS_PART_CONDITION__XML_AXIS_PART && newXmlAxisPart != null)) {
			if (EcoreUtil.isAncestor(this, newXmlAxisPart))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newXmlAxisPart != null)
				msgs = ((InternalEObject)newXmlAxisPart).eInverseAdd(this, AdaptionxmlPackage.XML_AXIS_PART__XML_AXIS_PART_CONDITIONS, XmlAxisPart.class, msgs);
			msgs = basicSetXmlAxisPart(newXmlAxisPart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_AXIS_PART_CONDITION__XML_AXIS_PART, newXmlAxisPart, newXmlAxisPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionxmlPackage.XML_AXIS_PART_CONDITION__XML_PROPERTY_OPTION:
				if (xmlPropertyOption != null)
					msgs = ((InternalEObject)xmlPropertyOption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptionxmlPackage.XML_AXIS_PART_CONDITION__XML_PROPERTY_OPTION, null, msgs);
				return basicSetXmlPropertyOption((XmlPropertyOptionParam)otherEnd, msgs);
			case AdaptionxmlPackage.XML_AXIS_PART_CONDITION__TEXT_LITERAL_PARAM:
				if (textLiteralParam != null)
					msgs = ((InternalEObject)textLiteralParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptionxmlPackage.XML_AXIS_PART_CONDITION__TEXT_LITERAL_PARAM, null, msgs);
				return basicSetTextLiteralParam((TextLiteralParam)otherEnd, msgs);
			case AdaptionxmlPackage.XML_AXIS_PART_CONDITION__XML_AXIS_PART:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetXmlAxisPart((XmlAxisPart)otherEnd, msgs);
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
			case AdaptionxmlPackage.XML_AXIS_PART_CONDITION__XML_PROPERTY_OPTION:
				return basicSetXmlPropertyOption(null, msgs);
			case AdaptionxmlPackage.XML_AXIS_PART_CONDITION__TEXT_LITERAL_PARAM:
				return basicSetTextLiteralParam(null, msgs);
			case AdaptionxmlPackage.XML_AXIS_PART_CONDITION__XML_AXIS_PART:
				return basicSetXmlAxisPart(null, msgs);
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
			case AdaptionxmlPackage.XML_AXIS_PART_CONDITION__XML_AXIS_PART:
				return eInternalContainer().eInverseRemove(this, AdaptionxmlPackage.XML_AXIS_PART__XML_AXIS_PART_CONDITIONS, XmlAxisPart.class, msgs);
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
			case AdaptionxmlPackage.XML_AXIS_PART_CONDITION__XML_PROPERTY_OPTION:
				return getXmlPropertyOption();
			case AdaptionxmlPackage.XML_AXIS_PART_CONDITION__TEXT_LITERAL_PARAM:
				return getTextLiteralParam();
			case AdaptionxmlPackage.XML_AXIS_PART_CONDITION__XML_AXIS_PART:
				return getXmlAxisPart();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdaptionxmlPackage.XML_AXIS_PART_CONDITION__XML_PROPERTY_OPTION:
				setXmlPropertyOption((XmlPropertyOptionParam)newValue);
				return;
			case AdaptionxmlPackage.XML_AXIS_PART_CONDITION__TEXT_LITERAL_PARAM:
				setTextLiteralParam((TextLiteralParam)newValue);
				return;
			case AdaptionxmlPackage.XML_AXIS_PART_CONDITION__XML_AXIS_PART:
				setXmlAxisPart((XmlAxisPart)newValue);
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
			case AdaptionxmlPackage.XML_AXIS_PART_CONDITION__XML_PROPERTY_OPTION:
				setXmlPropertyOption((XmlPropertyOptionParam)null);
				return;
			case AdaptionxmlPackage.XML_AXIS_PART_CONDITION__TEXT_LITERAL_PARAM:
				setTextLiteralParam((TextLiteralParam)null);
				return;
			case AdaptionxmlPackage.XML_AXIS_PART_CONDITION__XML_AXIS_PART:
				setXmlAxisPart((XmlAxisPart)null);
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
			case AdaptionxmlPackage.XML_AXIS_PART_CONDITION__XML_PROPERTY_OPTION:
				return xmlPropertyOption != null;
			case AdaptionxmlPackage.XML_AXIS_PART_CONDITION__TEXT_LITERAL_PARAM:
				return textLiteralParam != null;
			case AdaptionxmlPackage.XML_AXIS_PART_CONDITION__XML_AXIS_PART:
				return getXmlAxisPart() != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public boolean inputIsValid() {
		if ((getXmlPropertyOption() == null) || !getXmlPropertyOption().inputIsValid()) {
			return false;
		}
		return getTextLiteralParam().inputIsValid();
	}

	@Override
	public String generateDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isUsed() {
		return getXmlAxisPart() != null;
	}

	@Override
	public String myToString() {
		String result = "[cond (" + getInternalId() + "): ";
		if (getXmlPropertyOption() != null) {
			result += getXmlPropertyOption().myToString();
		}
		if (getXmlPropertyOption() != null && getTextLiteralParam() != null) {
			result += " ";
		}
		if (getTextLiteralParam() != null) {
			result += getTextLiteralParam().myToString();
		}
		return result += "]";
	}

} //XmlAxisPartConditionImpl
