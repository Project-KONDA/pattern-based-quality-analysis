/**
 */
package qualitypatternmodel.javaoperators.impl;

import java.lang.reflect.Constructor;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.json.JSONArray;
import org.json.JSONObject;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Comparable;
import qualitypatternmodel.javaoperators.JavaoperatorsPackage;
import qualitypatternmodel.javaoperators.OneArgJavaListOperator;
import qualitypatternmodel.javaquery.JavaFilterPart;
import qualitypatternmodel.javaquery.OneArgListFunctionFilterPart;
import qualitypatternmodel.javaquery.impl.OneArgListFunctionFilterPartImpl;
import qualitypatternmodel.javaqueryoutput.InterimResultPart;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.impl.BooleanParamImpl;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>One Arg Java List Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaoperators.impl.OneArgJavaListOperatorImpl#getTextListParam <em>Text List Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OneArgJavaListOperatorImpl extends OneArgJavaOperatorImpl implements OneArgJavaListOperator {
	/**
	 * The cached value of the '{@link #getTextListParam() <em>Text List Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextListParam()
	 * @generated
	 * @ordered
	 */
	protected TextListParam textListParam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OneArgJavaListOperatorImpl() {
		super();
	}

	public OneArgJavaListOperatorImpl(JSONObject json, Map<Integer, InterimResultPart> map) throws InvalidityException {
		super();
		try {
			JSONArray list = json.getJSONArray("list");
			getTextListParam().clear();
			for (int i = 0; i<list.length(); i++)
				getTextListParam().addStringValue(list.getString(i));
		}
		catch (Exception e) {
			throw new InvalidityException();
		}
	}

	@Override
	public JavaFilterPart generateQueryFilterPart() throws InvalidityException {
		OneArgListFunctionFilterPart filterPart = new OneArgListFunctionFilterPartImpl(this.getClass(), getTextListParam().getValues(), getOption().getValue());
		return filterPart;
	}

	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		super.isValid(abstractionLevel);
		textListParam.isValid(abstractionLevel);
	}

    public static OneArgJavaListOperatorImpl getOneInstanceOf(String subclassname, EList<String> list, boolean negate) {
        try {
            String packageName = OneArgJavaOperatorImpl.class.getPackage().getName() + ".";
            Class<?> subclass = Class.forName(packageName + subclassname);
            Constructor<?> constructor = subclass.getDeclaredConstructor();
            constructor.setAccessible(true);
            OneArgJavaListOperatorImpl instance = (OneArgJavaListOperatorImpl) constructor.newInstance();

            BooleanParamImpl bool = new BooleanParamImpl();
            bool.setValue(negate);
            instance.setOption(bool);
            TextListParamImpl textlist = new TextListParamImpl();
            textlist.clear();
            textlist.getValues().addAll(list);
            instance.setTextListParam(textlist);
            return instance;
        } catch (Exception e) {
            e.printStackTrace(); // Handle exception appropriately
            return null;
        }
    }

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (textListParam == null) {
			throw new InvalidityException("textlist null");
		}
		super.isValidLocal(abstractionLevel);
	}

	@Override
	public EList<Parameter> getAllParameters() throws InvalidityException {
		EList<Parameter> res = super.getAllParameters();
		res.add(textListParam);
		return res;
	}

	@Override
	public EList<Comparable> getArguments() {
		EList<Comparable> list = super.getArguments();
		list.add(getTextListParam());
		return list;
	}

	@Override
	public void createParameters() {
		super.createParameters();
		ParameterList parameterList = getParameterList();
		if(parameterList != null) {
			if(getTextListParam() == null) {
				TextListParam textLiteral = new TextListParamImpl();
				setTextListParam(textLiteral);
			}
			parameterList.add(getTextListParam());
		}
	}

	@Override
	public EList<PatternElement> prepareParameterUpdates() {
		EList<PatternElement> patternElements = super.prepareParameterUpdates();
		patternElements.add(getTextListParam());
		setTextListParam(null);
		return patternElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaoperatorsPackage.Literals.ONE_ARG_JAVA_LIST_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextListParam getTextListParam() {
		if (textListParam != null && textListParam.eIsProxy()) {
			InternalEObject oldTextListParam = (InternalEObject)textListParam;
			textListParam = (TextListParam)eResolveProxy(oldTextListParam);
			if (textListParam != oldTextListParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaoperatorsPackage.ONE_ARG_JAVA_LIST_OPERATOR__TEXT_LIST_PARAM, oldTextListParam, textListParam));
			}
		}
		return textListParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextListParam basicGetTextListParam() {
		return textListParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetTextListParam(TextListParam newTextListParam, NotificationChain msgs) {
		TextListParam oldTextListParam = textListParam;

		ParameterList varlist = getParameterList();
		if (varlist != null) {
			varlist.remove(oldTextListParam);
			varlist.add(newTextListParam);
		}

		textListParam = newTextListParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaoperatorsPackage.ONE_ARG_JAVA_LIST_OPERATOR__TEXT_LIST_PARAM, oldTextListParam, newTextListParam);
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
	public void setTextListParam(TextListParam newTextListParam) {
		if (newTextListParam != textListParam) {
			NotificationChain msgs = null;
			if (textListParam != null)
				msgs = ((InternalEObject)textListParam).eInverseRemove(this, ParametersPackage.TEXT_LIST_PARAM__JAVA_LIST_OPERATOR, TextListParam.class, msgs);
			if (newTextListParam != null)
				msgs = ((InternalEObject)newTextListParam).eInverseAdd(this, ParametersPackage.TEXT_LIST_PARAM__JAVA_LIST_OPERATOR, TextListParam.class, msgs);
			msgs = basicSetTextListParam(newTextListParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaoperatorsPackage.ONE_ARG_JAVA_LIST_OPERATOR__TEXT_LIST_PARAM, newTextListParam, newTextListParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaoperatorsPackage.ONE_ARG_JAVA_LIST_OPERATOR__TEXT_LIST_PARAM:
				if (textListParam != null)
					msgs = ((InternalEObject)textListParam).eInverseRemove(this, ParametersPackage.TEXT_LIST_PARAM__JAVA_LIST_OPERATOR, TextListParam.class, msgs);
				return basicSetTextListParam((TextListParam)otherEnd, msgs);
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
			case JavaoperatorsPackage.ONE_ARG_JAVA_LIST_OPERATOR__TEXT_LIST_PARAM:
				return basicSetTextListParam(null, msgs);
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
			case JavaoperatorsPackage.ONE_ARG_JAVA_LIST_OPERATOR__TEXT_LIST_PARAM:
				if (resolve) return getTextListParam();
				return basicGetTextListParam();
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
			case JavaoperatorsPackage.ONE_ARG_JAVA_LIST_OPERATOR__TEXT_LIST_PARAM:
				setTextListParam((TextListParam)newValue);
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
			case JavaoperatorsPackage.ONE_ARG_JAVA_LIST_OPERATOR__TEXT_LIST_PARAM:
				setTextListParam((TextListParam)null);
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
			case JavaoperatorsPackage.ONE_ARG_JAVA_LIST_OPERATOR__TEXT_LIST_PARAM:
				return textListParam != null;
		}
		return super.eIsSet(featureID);
	}

} //OneArgJavaListOperatorImpl
