/**
 */
package qualitypatternmodel.javaoperators.impl;

import java.lang.reflect.Constructor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Comparable;
import qualitypatternmodel.javaoperators.JavaoperatorsPackage;
import qualitypatternmodel.javaoperators.OneArgJavaTwoNumberOperator;
import qualitypatternmodel.javaquery.JavaFilterPart;
import qualitypatternmodel.javaquery.OneArgTwoNumberFunctionFilterPart;
import qualitypatternmodel.javaquery.impl.OneArgTwoNumberFunctionFilterPartImpl;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.impl.BooleanParamImpl;
import qualitypatternmodel.parameters.impl.NumberParamImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>One Arg Java Two Number Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaoperators.impl.OneArgJavaTwoNumberOperatorImpl#getNumber1 <em>Number1</em>}</li>
 *   <li>{@link qualitypatternmodel.javaoperators.impl.OneArgJavaTwoNumberOperatorImpl#getNumber2 <em>Number2</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OneArgJavaTwoNumberOperatorImpl extends OneArgJavaOperatorImpl implements OneArgJavaTwoNumberOperator {
	/**
	 * The cached value of the '{@link #getNumber1() <em>Number1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber1()
	 * @generated
	 * @ordered
	 */
	protected NumberParam number1;
	/**
	 * The cached value of the '{@link #getNumber2() <em>Number2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber2()
	 * @generated
	 * @ordered
	 */
	protected NumberParam number2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OneArgJavaTwoNumberOperatorImpl() {
		super();
	}

	@Override
	public JavaFilterPart generateQueryFilterPart() throws InvalidityException {
		OneArgTwoNumberFunctionFilterPart filterPart = new OneArgTwoNumberFunctionFilterPartImpl(this.getClass(), getNumber1().getValue(), getNumber2().getValue(), getOption().getValue());
		return filterPart;
	}

	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		super.isValid(abstractionLevel);
		number1.isValid(abstractionLevel);
		number2.isValid(abstractionLevel);
	}

    public static OneArgJavaTwoNumberOperatorImpl getOneInstanceOf(String subclassname, Double num1, Double num2, boolean negate) {
        try {
            String packageName = OneArgJavaOperatorImpl.class.getPackage().getName() + ".";
            Class<?> subclass = Class.forName(packageName + subclassname);
            Constructor<?> constructor = subclass.getDeclaredConstructor();
            constructor.setAccessible(true);
            OneArgJavaTwoNumberOperatorImpl instance = (OneArgJavaTwoNumberOperatorImpl) constructor.newInstance();

            BooleanParamImpl bool = new BooleanParamImpl();
            bool.setValue(negate);
            instance.setOption(bool);
            NumberParamImpl nump1 = new NumberParamImpl();
            nump1.setValue(num1);
            instance.setNumber1(nump1);
            NumberParamImpl nump2 = new NumberParamImpl();
            nump2.setValue(num2);
            instance.setNumber2(nump2);
            return instance;
        } catch (Exception e) {
            e.printStackTrace(); // Handle exception appropriately
            return null;
        }
    }

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (number1 == null) {
			throw new InvalidityException("number1 null");
		}
		if (number2 == null) {
			throw new InvalidityException("number2 null");
		}
		super.isValidLocal(abstractionLevel);
	}

	@Override
	public EList<Parameter> getAllParameters() throws InvalidityException {
		EList<Parameter> res = super.getAllParameters();
		res.add(number1);
		res.add(number2);
		return res;
	}

	@Override
	public EList<Comparable> getArguments(){
		EList<Comparable> list = super.getArguments();
		list.add(number1);
		list.add(number2);
		return list;
	}

	@Override
	public void createParameters() {
		super.createParameters();
		ParameterList parameterList = getParameterList();
		if(parameterList != null) {
			if(getNumber1() == null) {
				NumberParam num = new NumberParamImpl();
				setNumber1(num);
			}
			parameterList.add(getNumber1());
			if(getNumber2() == null) {
				NumberParam num = new NumberParamImpl();
				setNumber2(num);
			}
			parameterList.add(getNumber2());
		}
	}

	@Override
	public EList<PatternElement> prepareParameterUpdates() {
		EList<PatternElement> patternElements = super.prepareParameterUpdates();
		patternElements.add(getNumber1());
		setNumber1(null);
		patternElements.add(getNumber2());
		setNumber2(null);
		return patternElements;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaoperatorsPackage.Literals.ONE_ARG_JAVA_TWO_NUMBER_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberParam getNumber1() {
		if (number1 != null && number1.eIsProxy()) {
			InternalEObject oldNumber1 = (InternalEObject)number1;
			number1 = (NumberParam)eResolveProxy(oldNumber1);
			if (number1 != oldNumber1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaoperatorsPackage.ONE_ARG_JAVA_TWO_NUMBER_OPERATOR__NUMBER1, oldNumber1, number1));
			}
		}
		return number1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberParam basicGetNumber1() {
		return number1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetNumber1(NumberParam newNumber1, NotificationChain msgs) {
		NumberParam oldNumber1 = number1;

		ParameterList varlist = getParameterList();
		if (varlist != null) {
			varlist.remove(oldNumber1);
			varlist.add(newNumber1);
		}

		number1 = newNumber1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaoperatorsPackage.ONE_ARG_JAVA_TWO_NUMBER_OPERATOR__NUMBER1, oldNumber1, newNumber1);
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
	public void setNumber1(NumberParam newNumber1) {
		if (newNumber1 != number1) {
			NotificationChain msgs = null;
			if (number1 != null)
				msgs = ((InternalEObject)number1).eInverseRemove(this, ParametersPackage.NUMBER_PARAM__ONE_ARG_JAVA_TWO_NUMBER_OPERATOR1, NumberParam.class, msgs);
			if (newNumber1 != null)
				msgs = ((InternalEObject)newNumber1).eInverseAdd(this, ParametersPackage.NUMBER_PARAM__ONE_ARG_JAVA_TWO_NUMBER_OPERATOR1, NumberParam.class, msgs);
			msgs = basicSetNumber1(newNumber1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaoperatorsPackage.ONE_ARG_JAVA_TWO_NUMBER_OPERATOR__NUMBER1, newNumber1, newNumber1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberParam getNumber2() {
		if (number2 != null && number2.eIsProxy()) {
			InternalEObject oldNumber2 = (InternalEObject)number2;
			number2 = (NumberParam)eResolveProxy(oldNumber2);
			if (number2 != oldNumber2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaoperatorsPackage.ONE_ARG_JAVA_TWO_NUMBER_OPERATOR__NUMBER2, oldNumber2, number2));
			}
		}
		return number2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberParam basicGetNumber2() {
		return number2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetNumber2(NumberParam newNumber2, NotificationChain msgs) {
		NumberParam oldNumber2 = number2;

		ParameterList varlist = getParameterList();
		if (varlist != null) {
			varlist.remove(oldNumber2);
			varlist.add(newNumber2);
		}

		number2 = newNumber2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaoperatorsPackage.ONE_ARG_JAVA_TWO_NUMBER_OPERATOR__NUMBER2, oldNumber2, newNumber2);
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
	public void setNumber2(NumberParam newNumber2) {
		if (newNumber2 != number2) {
			NotificationChain msgs = null;
			if (number2 != null)
				msgs = ((InternalEObject)number2).eInverseRemove(this, ParametersPackage.NUMBER_PARAM__ONE_ARG_JAVA_TWO_NUMBER_OPERATOR2, NumberParam.class, msgs);
			if (newNumber2 != null)
				msgs = ((InternalEObject)newNumber2).eInverseAdd(this, ParametersPackage.NUMBER_PARAM__ONE_ARG_JAVA_TWO_NUMBER_OPERATOR2, NumberParam.class, msgs);
			msgs = basicSetNumber2(newNumber2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaoperatorsPackage.ONE_ARG_JAVA_TWO_NUMBER_OPERATOR__NUMBER2, newNumber2, newNumber2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaoperatorsPackage.ONE_ARG_JAVA_TWO_NUMBER_OPERATOR__NUMBER1:
				if (number1 != null)
					msgs = ((InternalEObject)number1).eInverseRemove(this, ParametersPackage.NUMBER_PARAM__ONE_ARG_JAVA_TWO_NUMBER_OPERATOR1, NumberParam.class, msgs);
				return basicSetNumber1((NumberParam)otherEnd, msgs);
			case JavaoperatorsPackage.ONE_ARG_JAVA_TWO_NUMBER_OPERATOR__NUMBER2:
				if (number2 != null)
					msgs = ((InternalEObject)number2).eInverseRemove(this, ParametersPackage.NUMBER_PARAM__ONE_ARG_JAVA_TWO_NUMBER_OPERATOR2, NumberParam.class, msgs);
				return basicSetNumber2((NumberParam)otherEnd, msgs);
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
			case JavaoperatorsPackage.ONE_ARG_JAVA_TWO_NUMBER_OPERATOR__NUMBER1:
				return basicSetNumber1(null, msgs);
			case JavaoperatorsPackage.ONE_ARG_JAVA_TWO_NUMBER_OPERATOR__NUMBER2:
				return basicSetNumber2(null, msgs);
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
			case JavaoperatorsPackage.ONE_ARG_JAVA_TWO_NUMBER_OPERATOR__NUMBER1:
				if (resolve) return getNumber1();
				return basicGetNumber1();
			case JavaoperatorsPackage.ONE_ARG_JAVA_TWO_NUMBER_OPERATOR__NUMBER2:
				if (resolve) return getNumber2();
				return basicGetNumber2();
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
			case JavaoperatorsPackage.ONE_ARG_JAVA_TWO_NUMBER_OPERATOR__NUMBER1:
				setNumber1((NumberParam)newValue);
				return;
			case JavaoperatorsPackage.ONE_ARG_JAVA_TWO_NUMBER_OPERATOR__NUMBER2:
				setNumber2((NumberParam)newValue);
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
			case JavaoperatorsPackage.ONE_ARG_JAVA_TWO_NUMBER_OPERATOR__NUMBER1:
				setNumber1((NumberParam)null);
				return;
			case JavaoperatorsPackage.ONE_ARG_JAVA_TWO_NUMBER_OPERATOR__NUMBER2:
				setNumber2((NumberParam)null);
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
			case JavaoperatorsPackage.ONE_ARG_JAVA_TWO_NUMBER_OPERATOR__NUMBER1:
				return number1 != null;
			case JavaoperatorsPackage.ONE_ARG_JAVA_TWO_NUMBER_OPERATOR__NUMBER2:
				return number2 != null;
		}
		return super.eIsSet(featureID);
	}

} //OneArgJavaTwoNumberOperatorImpl
