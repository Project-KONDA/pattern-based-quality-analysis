/**
 */
package qualitypatternmodel.javaoperators.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.PrimitiveNode;

import qualitypatternmodel.javaoperators.JavaoperatorsPackage;
import qualitypatternmodel.javaoperators.TwoArgJavaOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Two Arg Java Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaoperators.impl.TwoArgJavaOperatorImpl#getPrimitiveNodes <em>Primitive Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TwoArgJavaOperatorImpl extends JavaOperatorImpl implements TwoArgJavaOperator {
	/**
	 * The cached value of the '{@link #getPrimitiveNodes() <em>Primitive Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<PrimitiveNode> primitiveNodes;

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
	public EList<PrimitiveNode> getPrimitiveNodes() {
		if (primitiveNodes == null) {
			primitiveNodes = new EObjectWithInverseResolvingEList.ManyInverse<PrimitiveNode>(PrimitiveNode.class, this, JavaoperatorsPackage.TWO_ARG_JAVA_OPERATOR__PRIMITIVE_NODES, GraphstructurePackage.PRIMITIVE_NODE__TWO_ARG_JAVA_OPERATOR);
		}
		return primitiveNodes;
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
			case JavaoperatorsPackage.TWO_ARG_JAVA_OPERATOR__PRIMITIVE_NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPrimitiveNodes()).basicAdd(otherEnd, msgs);
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
			case JavaoperatorsPackage.TWO_ARG_JAVA_OPERATOR__PRIMITIVE_NODES:
				return ((InternalEList<?>)getPrimitiveNodes()).basicRemove(otherEnd, msgs);
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
			case JavaoperatorsPackage.TWO_ARG_JAVA_OPERATOR__PRIMITIVE_NODES:
				return getPrimitiveNodes();
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
			case JavaoperatorsPackage.TWO_ARG_JAVA_OPERATOR__PRIMITIVE_NODES:
				getPrimitiveNodes().clear();
				getPrimitiveNodes().addAll((Collection<? extends PrimitiveNode>)newValue);
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
			case JavaoperatorsPackage.TWO_ARG_JAVA_OPERATOR__PRIMITIVE_NODES:
				getPrimitiveNodes().clear();
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
			case JavaoperatorsPackage.TWO_ARG_JAVA_OPERATOR__PRIMITIVE_NODES:
				return primitiveNodes != null && !primitiveNodes.isEmpty();
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

} //TwoArgJavaOperatorImpl
