/**
 */
package qualitypatternmodel.adaptionxml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.AxisOptionParam;
import qualitypatternmodel.adaptionxml.AxisPair;
import qualitypatternmodel.adaptionxml.PathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Axis Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.AxisPairImpl#getTextLiteralParam <em>Text Literal Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.AxisPairImpl#getAxisOptionParam <em>Axis Option Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.AxisPairImpl#getPathParam <em>Path Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AxisPairImpl extends PatternElementImpl implements AxisPair {
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
	 * The cached value of the '{@link #getAxisOptionParam() <em>Axis Option Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisOptionParam()
	 * @generated
	 * @ordered
	 */
	protected AxisOptionParam axisOptionParam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AxisPairImpl() {
		super();
	}
	
	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (abstractionLevel.getValue() < AbstractionLevel.SEMI_ABSTRACT_VALUE)
			throw new InvalidityException("non-generic class in generic pattern");
		super.isValid(abstractionLevel);
		if (textLiteralParam != null) 
			textLiteralParam.isValid(abstractionLevel);
		if (axisOptionParam != null) 
			axisOptionParam.isValid(abstractionLevel);
	}
	
	
	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		if (textLiteralParam == null) {
			throw new InvalidityException("textLiteralParam null");
		}
		if (axisOptionParam == null) {
			throw new InvalidityException("axisOptionParam null");
		}
		
	}
	
	@Override
	public EList<Parameter> getAllParameters() throws InvalidityException {
		EList<Parameter> res = new BasicEList<Parameter>();		
		if (textLiteralParam != null) {
			res.add(textLiteralParam);
		}
		if (axisOptionParam != null) {
			res.add(axisOptionParam);
		}
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionxmlPackage.Literals.AXIS_PAIR;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.AXIS_PAIR__TEXT_LITERAL_PARAM, oldTextLiteralParam, newTextLiteralParam);
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
				msgs = ((InternalEObject)textLiteralParam).eInverseRemove(this, ParametersPackage.TEXT_LITERAL_PARAM__AXIS_PAIR, TextLiteralParam.class, msgs);
			if (newTextLiteralParam != null)
				msgs = ((InternalEObject)newTextLiteralParam).eInverseAdd(this, ParametersPackage.TEXT_LITERAL_PARAM__AXIS_PAIR, TextLiteralParam.class, msgs);
			msgs = basicSetTextLiteralParam(newTextLiteralParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.AXIS_PAIR__TEXT_LITERAL_PARAM, newTextLiteralParam, newTextLiteralParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AxisOptionParam getAxisOptionParam() {
		return axisOptionParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxisOptionParam(AxisOptionParam newAxisOptionParam, NotificationChain msgs) {
		AxisOptionParam oldAxisOptionParam = axisOptionParam;
		axisOptionParam = newAxisOptionParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.AXIS_PAIR__AXIS_OPTION_PARAM, oldAxisOptionParam, newAxisOptionParam);
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
	public void setAxisOptionParam(AxisOptionParam newAxisOptionParam) {
		if (newAxisOptionParam != axisOptionParam) {
			NotificationChain msgs = null;
			if (axisOptionParam != null)
				msgs = ((InternalEObject)axisOptionParam).eInverseRemove(this, AdaptionxmlPackage.AXIS_OPTION_PARAM__AXIS_PAIR, AxisOptionParam.class, msgs);
			if (newAxisOptionParam != null)
				msgs = ((InternalEObject)newAxisOptionParam).eInverseAdd(this, AdaptionxmlPackage.AXIS_OPTION_PARAM__AXIS_PAIR, AxisOptionParam.class, msgs);
			msgs = basicSetAxisOptionParam(newAxisOptionParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.AXIS_PAIR__AXIS_OPTION_PARAM, newAxisOptionParam, newAxisOptionParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PathParam getPathParam() {
		if (eContainerFeatureID() != AdaptionxmlPackage.AXIS_PAIR__PATH_PARAM) return null;
		return (PathParam)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPathParam(PathParam newPathParam, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPathParam, AdaptionxmlPackage.AXIS_PAIR__PATH_PARAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathParam(PathParam newPathParam) {
		if (newPathParam != eInternalContainer() || (eContainerFeatureID() != AdaptionxmlPackage.AXIS_PAIR__PATH_PARAM && newPathParam != null)) {
			if (EcoreUtil.isAncestor(this, newPathParam))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPathParam != null)
				msgs = ((InternalEObject)newPathParam).eInverseAdd(this, AdaptionxmlPackage.PATH_PARAM__AXIS_PAIRS, PathParam.class, msgs);
			msgs = basicSetPathParam(newPathParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.AXIS_PAIR__PATH_PARAM, newPathParam, newPathParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionxmlPackage.AXIS_PAIR__TEXT_LITERAL_PARAM:
				if (textLiteralParam != null)
					msgs = ((InternalEObject)textLiteralParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptionxmlPackage.AXIS_PAIR__TEXT_LITERAL_PARAM, null, msgs);
				return basicSetTextLiteralParam((TextLiteralParam)otherEnd, msgs);
			case AdaptionxmlPackage.AXIS_PAIR__AXIS_OPTION_PARAM:
				if (axisOptionParam != null)
					msgs = ((InternalEObject)axisOptionParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptionxmlPackage.AXIS_PAIR__AXIS_OPTION_PARAM, null, msgs);
				return basicSetAxisOptionParam((AxisOptionParam)otherEnd, msgs);
			case AdaptionxmlPackage.AXIS_PAIR__PATH_PARAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPathParam((PathParam)otherEnd, msgs);
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
			case AdaptionxmlPackage.AXIS_PAIR__TEXT_LITERAL_PARAM:
				return basicSetTextLiteralParam(null, msgs);
			case AdaptionxmlPackage.AXIS_PAIR__AXIS_OPTION_PARAM:
				return basicSetAxisOptionParam(null, msgs);
			case AdaptionxmlPackage.AXIS_PAIR__PATH_PARAM:
				return basicSetPathParam(null, msgs);
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
			case AdaptionxmlPackage.AXIS_PAIR__PATH_PARAM:
				return eInternalContainer().eInverseRemove(this, AdaptionxmlPackage.PATH_PARAM__AXIS_PAIRS, PathParam.class, msgs);
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
			case AdaptionxmlPackage.AXIS_PAIR__TEXT_LITERAL_PARAM:
				return getTextLiteralParam();
			case AdaptionxmlPackage.AXIS_PAIR__AXIS_OPTION_PARAM:
				return getAxisOptionParam();
			case AdaptionxmlPackage.AXIS_PAIR__PATH_PARAM:
				return getPathParam();
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
			case AdaptionxmlPackage.AXIS_PAIR__TEXT_LITERAL_PARAM:
				setTextLiteralParam((TextLiteralParam)newValue);
				return;
			case AdaptionxmlPackage.AXIS_PAIR__AXIS_OPTION_PARAM:
				setAxisOptionParam((AxisOptionParam)newValue);
				return;
			case AdaptionxmlPackage.AXIS_PAIR__PATH_PARAM:
				setPathParam((PathParam)newValue);
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
			case AdaptionxmlPackage.AXIS_PAIR__TEXT_LITERAL_PARAM:
				setTextLiteralParam((TextLiteralParam)null);
				return;
			case AdaptionxmlPackage.AXIS_PAIR__AXIS_OPTION_PARAM:
				setAxisOptionParam((AxisOptionParam)null);
				return;
			case AdaptionxmlPackage.AXIS_PAIR__PATH_PARAM:
				setPathParam((PathParam)null);
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
			case AdaptionxmlPackage.AXIS_PAIR__TEXT_LITERAL_PARAM:
				return textLiteralParam != null;
			case AdaptionxmlPackage.AXIS_PAIR__AXIS_OPTION_PARAM:
				return axisOptionParam != null;
			case AdaptionxmlPackage.AXIS_PAIR__PATH_PARAM:
				return getPathParam() != null;
		}
		return super.eIsSet(featureID);
	}

} //AxisPairImpl
