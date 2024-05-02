/**
 */
package qualitypatternmodel.adaptionxml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.XmlAxisPart;
import qualitypatternmodel.adaptionxml.XmlAxisPartCondition;
import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;

import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.impl.ParameterImpl;

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
	 * The cached value of the '{@link #getXmlPropertyOption() <em>Xml Property Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlPropertyOption()
	 * @generated
	 * @ordered
	 */
	protected XmlPropertyOptionParam xmlPropertyOption;

	/**
	 * The cached value of the '{@link #getTextLiteralParam() <em>Text Literal Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextLiteralParam()
	 * @generated
	 * @ordered
	 */
	protected TextLiteralParam textLiteralParam;

	/**
	 * The cached value of the '{@link #getXmlAxisPart() <em>Xml Axis Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlAxisPart()
	 * @generated
	 * @ordered
	 */
	protected XmlAxisPart xmlAxisPart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmlAxisPartConditionImpl() {
		super();
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
		if (xmlPropertyOption != null && xmlPropertyOption.eIsProxy()) {
			InternalEObject oldXmlPropertyOption = (InternalEObject)xmlPropertyOption;
			xmlPropertyOption = (XmlPropertyOptionParam)eResolveProxy(oldXmlPropertyOption);
			if (xmlPropertyOption != oldXmlPropertyOption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionxmlPackage.XML_AXIS_PART_CONDITION__XML_PROPERTY_OPTION, oldXmlPropertyOption, xmlPropertyOption));
			}
		}
		return xmlPropertyOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlPropertyOptionParam basicGetXmlPropertyOption() {
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
		if (textLiteralParam != null && textLiteralParam.eIsProxy()) {
			InternalEObject oldTextLiteralParam = (InternalEObject)textLiteralParam;
			textLiteralParam = (TextLiteralParam)eResolveProxy(oldTextLiteralParam);
			if (textLiteralParam != oldTextLiteralParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionxmlPackage.XML_AXIS_PART_CONDITION__TEXT_LITERAL_PARAM, oldTextLiteralParam, textLiteralParam));
			}
		}
		return textLiteralParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextLiteralParam basicGetTextLiteralParam() {
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
		if (xmlAxisPart != null && xmlAxisPart.eIsProxy()) {
			InternalEObject oldXmlAxisPart = (InternalEObject)xmlAxisPart;
			xmlAxisPart = (XmlAxisPart)eResolveProxy(oldXmlAxisPart);
			if (xmlAxisPart != oldXmlAxisPart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionxmlPackage.XML_AXIS_PART_CONDITION__XML_AXIS_PART, oldXmlAxisPart, xmlAxisPart));
			}
		}
		return xmlAxisPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlAxisPart basicGetXmlAxisPart() {
		return xmlAxisPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXmlAxisPart(XmlAxisPart newXmlAxisPart, NotificationChain msgs) {
		XmlAxisPart oldXmlAxisPart = xmlAxisPart;
		xmlAxisPart = newXmlAxisPart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_AXIS_PART_CONDITION__XML_AXIS_PART, oldXmlAxisPart, newXmlAxisPart);
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
	public void setXmlAxisPart(XmlAxisPart newXmlAxisPart) {
		if (newXmlAxisPart != xmlAxisPart) {
			NotificationChain msgs = null;
			if (xmlAxisPart != null)
				msgs = ((InternalEObject)xmlAxisPart).eInverseRemove(this, AdaptionxmlPackage.XML_AXIS_PART__XML_AXIS_PART_CONDITIONS, XmlAxisPart.class, msgs);
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
					msgs = ((InternalEObject)xmlPropertyOption).eInverseRemove(this, AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__XML_AXIS_PART_CONDITION, XmlPropertyOptionParam.class, msgs);
				return basicSetXmlPropertyOption((XmlPropertyOptionParam)otherEnd, msgs);
			case AdaptionxmlPackage.XML_AXIS_PART_CONDITION__TEXT_LITERAL_PARAM:
				if (textLiteralParam != null)
					msgs = ((InternalEObject)textLiteralParam).eInverseRemove(this, ParametersPackage.TEXT_LITERAL_PARAM__XML_AXIS_PART_CONDITION, TextLiteralParam.class, msgs);
				return basicSetTextLiteralParam((TextLiteralParam)otherEnd, msgs);
			case AdaptionxmlPackage.XML_AXIS_PART_CONDITION__XML_AXIS_PART:
				if (xmlAxisPart != null)
					msgs = ((InternalEObject)xmlAxisPart).eInverseRemove(this, AdaptionxmlPackage.XML_AXIS_PART__XML_AXIS_PART_CONDITIONS, XmlAxisPart.class, msgs);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptionxmlPackage.XML_AXIS_PART_CONDITION__XML_PROPERTY_OPTION:
				if (resolve) return getXmlPropertyOption();
				return basicGetXmlPropertyOption();
			case AdaptionxmlPackage.XML_AXIS_PART_CONDITION__TEXT_LITERAL_PARAM:
				if (resolve) return getTextLiteralParam();
				return basicGetTextLiteralParam();
			case AdaptionxmlPackage.XML_AXIS_PART_CONDITION__XML_AXIS_PART:
				if (resolve) return getXmlAxisPart();
				return basicGetXmlAxisPart();
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
				return xmlAxisPart != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public boolean inputIsValid() {
		if (getXmlPropertyOption() == null)
			return false;
		if (!getXmlPropertyOption().inputIsValid())
			return false;
		return getTextLiteralParam().inputIsValid();
	}

	@Override
	public String generateDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String myToString() {
		// TODO Auto-generated method stub
		return null;
	}

} //XmlAxisPartConditionImpl
