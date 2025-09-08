/**
 */
package qualitypatternmodel.javaoperators.impl;

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
import qualitypatternmodel.javaoperators.TwoArgJavaOperator;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Two Arg Java Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaoperators.impl.TwoArgJavaOperatorImpl#getArgument1 <em>Argument1</em>}</li>
 *   <li>{@link qualitypatternmodel.javaoperators.impl.TwoArgJavaOperatorImpl#getArgument2 <em>Argument2</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TwoArgJavaOperatorImpl extends JavaOperatorImpl implements TwoArgJavaOperator {
	/**
	 * The cached value of the '{@link #getArgument1() <em>Argument1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument1()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveNode argument1;
	/**
	 * The cached value of the '{@link #getArgument2() <em>Argument2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument2()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveNode argument2;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TwoArgJavaOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	abstract public Boolean apply(String param1, String param2);

	@Override
	public String generateXQueryIsolated() throws InvalidityException {
		if (!(getArgument1() instanceof XmlProperty) || !(getArgument2() instanceof XmlProperty))
			throw new InvalidityException();
		return ((XmlProperty) getArgument1()).getVariables().get(0) + ", " + ((XmlProperty) getArgument2()).getVariables().get(0);
	}

	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		super.isValid(abstractionLevel);
	}

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (abstractionLevel != AbstractionLevel.SEMI_GENERIC) {
			if (argument1 == null) {
				throw new InvalidityException("argument1 null");
			}
			if (argument2 == null) {
				throw new InvalidityException("argument2 null");
			}
		}
		super.isValidLocal(abstractionLevel);
	}

	@Override
	public EList<Parameter> getAllParameters() throws InvalidityException {
		EList<Parameter> res = new BasicEList<Parameter>();
		return res;
	}

	@Override
	public EList<Comparable> getArguments(){
		EList<Comparable> list = new BasicEList<Comparable>();
		list.add(getArgument1());
		list.add(getArgument2());
		return list;
	}

	@Override
	public void createParameters() {
//		ParameterList parameterList = getParameterList();
//		if(parameterList != null) {
//		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaoperatorsPackage.Literals.TWO_ARG_JAVA_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveNode getArgument1() {
		if (argument1 != null && argument1.eIsProxy()) {
			InternalEObject oldArgument1 = (InternalEObject)argument1;
			argument1 = (PrimitiveNode)eResolveProxy(oldArgument1);
			if (argument1 != oldArgument1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaoperatorsPackage.TWO_ARG_JAVA_OPERATOR__ARGUMENT1, oldArgument1, argument1));
			}
		}
		return argument1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveNode basicGetArgument1() {
		return argument1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetArgument1(PrimitiveNode newArgument1, NotificationChain msgs) {
		PrimitiveNode oldPrimitiveNode = argument1;
		argument1 = newArgument1;

		if(oldPrimitiveNode instanceof PrimitiveNode && newArgument1 == null) {
			try {
				((Node) oldPrimitiveNode).makeGeneric();
			} catch (InvalidityException e) {
				// there is another reason why this node needs to be PrimitiveNode
			}
		}

		if(oldPrimitiveNode != null) {
			oldPrimitiveNode.getPredicates().remove(this);
		}
		newArgument1.getPredicates().add(this);

		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperatorsPackage.MATCH__PRIMITIVE_NODE, oldPrimitiveNode, newArgument1);
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
	public void setArgument1(PrimitiveNode newArgument1) {
		if (newArgument1 != argument1) {
			NotificationChain msgs = null;
			if (argument1 != null)
				msgs = ((InternalEObject)argument1).eInverseRemove(this, GraphstructurePackage.PRIMITIVE_NODE__TWO_ARG_JAVA_OPERATOR1, PrimitiveNode.class, msgs);
			if (newArgument1 != null)
				msgs = ((InternalEObject)newArgument1).eInverseAdd(this, GraphstructurePackage.PRIMITIVE_NODE__TWO_ARG_JAVA_OPERATOR1, PrimitiveNode.class, msgs);
			msgs = basicSetArgument1(newArgument1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaoperatorsPackage.TWO_ARG_JAVA_OPERATOR__ARGUMENT1, newArgument1, newArgument1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveNode getArgument2() {
		if (argument2 != null && argument2.eIsProxy()) {
			InternalEObject oldArgument2 = (InternalEObject)argument2;
			argument2 = (PrimitiveNode)eResolveProxy(oldArgument2);
			if (argument2 != oldArgument2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaoperatorsPackage.TWO_ARG_JAVA_OPERATOR__ARGUMENT2, oldArgument2, argument2));
			}
		}
		return argument2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveNode basicGetArgument2() {
		return argument2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetArgument2(PrimitiveNode newArgument2, NotificationChain msgs) {
		PrimitiveNode oldPrimitiveNode = argument2;
		argument2 = newArgument2;

		if(oldPrimitiveNode instanceof PrimitiveNode && newArgument2 == null) {
			try {
				((Node) oldPrimitiveNode).makeGeneric();
			} catch (InvalidityException e) {
				// there is another reason why this node needs to be PrimitiveNode
			}
		}

		if(oldPrimitiveNode != null) {
			oldPrimitiveNode.getPredicates().remove(this);
		}
		newArgument2.getPredicates().add(this);

		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperatorsPackage.MATCH__PRIMITIVE_NODE, oldPrimitiveNode, newArgument2);
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
	public void setArgument2(PrimitiveNode newArgument2) {
		if (newArgument2 != argument2) {
			NotificationChain msgs = null;
			if (argument2 != null)
				msgs = ((InternalEObject)argument2).eInverseRemove(this, GraphstructurePackage.PRIMITIVE_NODE__TWO_ARG_JAVA_OPERATOR2, PrimitiveNode.class, msgs);
			if (newArgument2 != null)
				msgs = ((InternalEObject)newArgument2).eInverseAdd(this, GraphstructurePackage.PRIMITIVE_NODE__TWO_ARG_JAVA_OPERATOR2, PrimitiveNode.class, msgs);
			msgs = basicSetArgument2(newArgument2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaoperatorsPackage.TWO_ARG_JAVA_OPERATOR__ARGUMENT2, newArgument2, newArgument2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Node getElement() {
		return getArgument1();
	}

	@Override
	public EList<PatternElement> prepareParameterUpdates() {
		EList<PatternElement> patternElements = new BasicEList<PatternElement>();
		return patternElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaoperatorsPackage.TWO_ARG_JAVA_OPERATOR__ARGUMENT1:
				if (argument1 != null)
					msgs = ((InternalEObject)argument1).eInverseRemove(this, GraphstructurePackage.PRIMITIVE_NODE__TWO_ARG_JAVA_OPERATOR1, PrimitiveNode.class, msgs);
				return basicSetArgument1((PrimitiveNode)otherEnd, msgs);
			case JavaoperatorsPackage.TWO_ARG_JAVA_OPERATOR__ARGUMENT2:
				if (argument2 != null)
					msgs = ((InternalEObject)argument2).eInverseRemove(this, GraphstructurePackage.PRIMITIVE_NODE__TWO_ARG_JAVA_OPERATOR2, PrimitiveNode.class, msgs);
				return basicSetArgument2((PrimitiveNode)otherEnd, msgs);
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
			case JavaoperatorsPackage.TWO_ARG_JAVA_OPERATOR__ARGUMENT1:
				return basicSetArgument1(null, msgs);
			case JavaoperatorsPackage.TWO_ARG_JAVA_OPERATOR__ARGUMENT2:
				return basicSetArgument2(null, msgs);
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
			case JavaoperatorsPackage.TWO_ARG_JAVA_OPERATOR__ARGUMENT1:
				if (resolve) return getArgument1();
				return basicGetArgument1();
			case JavaoperatorsPackage.TWO_ARG_JAVA_OPERATOR__ARGUMENT2:
				if (resolve) return getArgument2();
				return basicGetArgument2();
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
			case JavaoperatorsPackage.TWO_ARG_JAVA_OPERATOR__ARGUMENT1:
				setArgument1((PrimitiveNode)newValue);
				return;
			case JavaoperatorsPackage.TWO_ARG_JAVA_OPERATOR__ARGUMENT2:
				setArgument2((PrimitiveNode)newValue);
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
			case JavaoperatorsPackage.TWO_ARG_JAVA_OPERATOR__ARGUMENT1:
				setArgument1((PrimitiveNode)null);
				return;
			case JavaoperatorsPackage.TWO_ARG_JAVA_OPERATOR__ARGUMENT2:
				setArgument2((PrimitiveNode)null);
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
			case JavaoperatorsPackage.TWO_ARG_JAVA_OPERATOR__ARGUMENT1:
				return argument1 != null;
			case JavaoperatorsPackage.TWO_ARG_JAVA_OPERATOR__ARGUMENT2:
				return argument2 != null;
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
			case JavaoperatorsPackage.TWO_ARG_JAVA_OPERATOR___APPLY__STRING_STRING:
				return apply((String)arguments.get(0), (String)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	abstract public String myToString();

} //TwoArgJavaOperatorImpl
