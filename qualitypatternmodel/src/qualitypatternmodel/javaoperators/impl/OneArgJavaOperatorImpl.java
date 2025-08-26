/**
 */
package qualitypatternmodel.javaoperators.impl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Comparable;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.javaoperators.JavaoperatorsPackage;
import qualitypatternmodel.javaoperators.OneArgJavaOperator;
import qualitypatternmodel.javaquery.JavaFilterPart;
import qualitypatternmodel.javaquery.OneArgFunctionFilterPart;
import qualitypatternmodel.javaquery.impl.OneArgFunctionFilterPartImpl;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.impl.BooleanParamImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>One Arg Java Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaoperators.impl.OneArgJavaOperatorImpl#getPrimitiveNode <em>Primitive Node</em>}</li>
 *   <li>{@link qualitypatternmodel.javaoperators.impl.OneArgJavaOperatorImpl#getOption <em>Option</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OneArgJavaOperatorImpl extends JavaOperatorImpl implements OneArgJavaOperator {
	/**
	 * The cached value of the '{@link #getPrimitiveNode() <em>Primitive Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveNode()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveNode primitiveNode;

	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected BooleanParam option;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OneArgJavaOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	abstract public Boolean apply(String param1);

	@Override
	public JavaFilterPart generateQueryFilterPart() throws InvalidityException {
		OneArgFunctionFilterPart filterPart = new OneArgFunctionFilterPartImpl(this.getClass(), getOption().getValue());
		return filterPart;
	}

	@Override
	public String generateXQueryIsolated() throws InvalidityException {
		if (!(getPrimitiveNode() instanceof XmlProperty))
			throw new InvalidityException();
		return ((XmlProperty) getPrimitiveNode()).getVariables().get(0);
	}

	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		super.isValid(abstractionLevel);
		option.isValid(abstractionLevel);
	}

    public static OneArgJavaOperatorImpl getOneInstanceOf(String subclassname, boolean negate) {
        try {
            String packageName = OneArgJavaOperatorImpl.class.getPackage().getName() + ".";
            Class<?> subclass = Class.forName(packageName + subclassname);
            Constructor<?> constructor = subclass.getDeclaredConstructor();
            constructor.setAccessible(true);
            OneArgJavaOperatorImpl instance = (OneArgJavaOperatorImpl) constructor.newInstance();

            BooleanParamImpl bool = new BooleanParamImpl();
            bool.setValue(negate);
            instance.setOption(bool);
            return instance;
        } catch (Exception e) {
            e.printStackTrace(); // Handle exception appropriately
            return null;
        }
    }

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (option == null) {
			throw new InvalidityException("options null");
		}
		if (abstractionLevel != AbstractionLevel.SEMI_GENERIC && primitiveNode == null) {
			throw new InvalidityException("property null");
		}

		super.isValidLocal(abstractionLevel);
	}

	@Override
	public EList<Parameter> getAllParameters() throws InvalidityException {
		EList<Parameter> res = new BasicEList<Parameter>();
		res.add(option);
		return res;
	}

	@Override
	public EList<Comparable> getArguments(){
		EList<Comparable> list = new BasicEList<Comparable>();
		list.add(getPrimitiveNode());
		list.add(getOption());
		return list;
	}

	@Override
	public void createParameters() {
		ParameterList parameterList = getParameterList();
		if(parameterList != null) {
			if(getOption() == null) {
				BooleanParam bool = new BooleanParamImpl();
				setOption(bool);
			}
			parameterList.add(getOption());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaoperatorsPackage.Literals.ONE_ARG_JAVA_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveNode getPrimitiveNode() {
		if (primitiveNode != null && primitiveNode.eIsProxy()) {
			InternalEObject oldPrimitiveNode = (InternalEObject)primitiveNode;
			primitiveNode = (PrimitiveNode)eResolveProxy(oldPrimitiveNode);
			if (primitiveNode != oldPrimitiveNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaoperatorsPackage.ONE_ARG_JAVA_OPERATOR__PRIMITIVE_NODE, oldPrimitiveNode, primitiveNode));
			}
		}
		return primitiveNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveNode basicGetPrimitiveNode() {
		return primitiveNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetPrimitiveNode(PrimitiveNode newPrimitiveNode, NotificationChain msgs) {
		PrimitiveNode oldPrimitiveNode = primitiveNode;
		primitiveNode = newPrimitiveNode;

		if(oldPrimitiveNode instanceof PrimitiveNode && newPrimitiveNode == null) {
			try {
				((Node) oldPrimitiveNode).makeGeneric();
			} catch (InvalidityException e) {
				// there is another reason why this node needs to be PrimitiveNode
			}
		}

		if(oldPrimitiveNode != null) {
			oldPrimitiveNode.getPredicates().remove(this);
		}
		newPrimitiveNode.getPredicates().add(this);

		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperatorsPackage.MATCH__PRIMITIVE_NODE, oldPrimitiveNode, newPrimitiveNode);
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
	public void setPrimitiveNode(PrimitiveNode newPrimitiveNode) {
		if (newPrimitiveNode != primitiveNode) {
			NotificationChain msgs = null;
			if (primitiveNode != null)
				msgs = ((InternalEObject)primitiveNode).eInverseRemove(this, GraphstructurePackage.PRIMITIVE_NODE__ONE_ARG_JAVA_OPERATOR, PrimitiveNode.class, msgs);
			if (newPrimitiveNode != null)
				msgs = ((InternalEObject)newPrimitiveNode).eInverseAdd(this, GraphstructurePackage.PRIMITIVE_NODE__ONE_ARG_JAVA_OPERATOR, PrimitiveNode.class, msgs);
			msgs = basicSetPrimitiveNode(newPrimitiveNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaoperatorsPackage.ONE_ARG_JAVA_OPERATOR__PRIMITIVE_NODE, newPrimitiveNode, newPrimitiveNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanParam getOption() {
		if (option != null && option.eIsProxy()) {
			InternalEObject oldOption = (InternalEObject)option;
			option = (BooleanParam)eResolveProxy(oldOption);
			if (option != oldOption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaoperatorsPackage.ONE_ARG_JAVA_OPERATOR__OPTION, oldOption, option));
			}
		}
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanParam basicGetOption() {
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetOption(BooleanParam newOption, NotificationChain msgs) {
		BooleanParam oldOption = option;

		ParameterList varlist = getParameterList();
		if (varlist != null) {
			varlist.remove(oldOption);
			varlist.add(newOption);
		}

		option = newOption;
		
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaoperatorsPackage.ONE_ARG_JAVA_OPERATOR__OPTION, oldOption, newOption);
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
	public void setOption(BooleanParam newOption) {
		if (newOption != option) {
			NotificationChain msgs = null;
			if (option != null)
				msgs = ((InternalEObject)option).eInverseRemove(this, ParametersPackage.BOOLEAN_PARAM__ONE_ARG_JAVA_OPERATOR, BooleanParam.class, msgs);
			if (newOption != null)
				msgs = ((InternalEObject)newOption).eInverseAdd(this, ParametersPackage.BOOLEAN_PARAM__ONE_ARG_JAVA_OPERATOR, BooleanParam.class, msgs);
			msgs = basicSetOption(newOption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaoperatorsPackage.ONE_ARG_JAVA_OPERATOR__OPTION, newOption, newOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Node getElement() {
		return getPrimitiveNode();
	}

	@Override
	public EList<PatternElement> prepareParameterUpdates() {
		EList<PatternElement> patternElements = new BasicEList<PatternElement>();
		patternElements.add(getOption());
		setOption(null);
		return patternElements;
	}

	@Override
	public EList<Node> getAllArgumentElements() {
		return primitiveNode.getAllArgumentElements();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaoperatorsPackage.ONE_ARG_JAVA_OPERATOR__PRIMITIVE_NODE:
				if (primitiveNode != null)
					msgs = ((InternalEObject)primitiveNode).eInverseRemove(this, GraphstructurePackage.PRIMITIVE_NODE__ONE_ARG_JAVA_OPERATOR, PrimitiveNode.class, msgs);
				return basicSetPrimitiveNode((PrimitiveNode)otherEnd, msgs);
			case JavaoperatorsPackage.ONE_ARG_JAVA_OPERATOR__OPTION:
				if (option != null)
					msgs = ((InternalEObject)option).eInverseRemove(this, ParametersPackage.BOOLEAN_PARAM__ONE_ARG_JAVA_OPERATOR, BooleanParam.class, msgs);
				return basicSetOption((BooleanParam)otherEnd, msgs);
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
			case JavaoperatorsPackage.ONE_ARG_JAVA_OPERATOR__PRIMITIVE_NODE:
				return basicSetPrimitiveNode(null, msgs);
			case JavaoperatorsPackage.ONE_ARG_JAVA_OPERATOR__OPTION:
				return basicSetOption(null, msgs);
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
			case JavaoperatorsPackage.ONE_ARG_JAVA_OPERATOR__PRIMITIVE_NODE:
				if (resolve) return getPrimitiveNode();
				return basicGetPrimitiveNode();
			case JavaoperatorsPackage.ONE_ARG_JAVA_OPERATOR__OPTION:
				if (resolve) return getOption();
				return basicGetOption();
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
			case JavaoperatorsPackage.ONE_ARG_JAVA_OPERATOR__PRIMITIVE_NODE:
				setPrimitiveNode((PrimitiveNode)newValue);
				return;
			case JavaoperatorsPackage.ONE_ARG_JAVA_OPERATOR__OPTION:
				setOption((BooleanParam)newValue);
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
			case JavaoperatorsPackage.ONE_ARG_JAVA_OPERATOR__PRIMITIVE_NODE:
				setPrimitiveNode((PrimitiveNode)null);
				return;
			case JavaoperatorsPackage.ONE_ARG_JAVA_OPERATOR__OPTION:
				setOption((BooleanParam)null);
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
			case JavaoperatorsPackage.ONE_ARG_JAVA_OPERATOR__PRIMITIVE_NODE:
				return primitiveNode != null;
			case JavaoperatorsPackage.ONE_ARG_JAVA_OPERATOR__OPTION:
				return option != null;
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
			case JavaoperatorsPackage.ONE_ARG_JAVA_OPERATOR___APPLY__STRING:
				return apply((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	abstract public String myToString();


} //OneArgJavaOperatorImpl
