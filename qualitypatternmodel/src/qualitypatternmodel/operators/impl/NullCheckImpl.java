/**
 */
package qualitypatternmodel.operators.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.graphstructure.Comparable;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;

import qualitypatternmodel.operators.EnumNullCheck;
import qualitypatternmodel.operators.NullCheck;
import qualitypatternmodel.operators.OperatorsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Null Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.operators.impl.NullCheckImpl#getOption <em>Option</em>}</li>
 *   <li>{@link qualitypatternmodel.operators.impl.NullCheckImpl#getPrimitivenode <em>Primitivenode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NullCheckImpl extends BooleanOperatorImpl implements NullCheck {
	/**
	 * The default value of the '{@link #getOption() <em>Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected static final EnumNullCheck OPTION_EDEFAULT = EnumNullCheck.ISNULL;

	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected EnumNullCheck option = OPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrimitivenode() <em>Primitivenode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitivenode()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveNode primitivenode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NullCheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperatorsPackage.Literals.NULL_CHECK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumNullCheck getOption() {
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOption(EnumNullCheck newOption) {
		EnumNullCheck oldOption = option;
		option = newOption == null ? OPTION_EDEFAULT : newOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatorsPackage.NULL_CHECK__OPTION, oldOption, option));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveNode getPrimitivenode() {
		if (primitivenode != null && primitivenode.eIsProxy()) {
			InternalEObject oldPrimitivenode = (InternalEObject)primitivenode;
			primitivenode = (PrimitiveNode)eResolveProxy(oldPrimitivenode);
			if (primitivenode != oldPrimitivenode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperatorsPackage.NULL_CHECK__PRIMITIVENODE, oldPrimitivenode, primitivenode));
			}
		}
		return primitivenode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveNode basicGetPrimitivenode() {
		return primitivenode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimitivenode(PrimitiveNode newPrimitivenode, NotificationChain msgs) {
		PrimitiveNode oldPrimitivenode = primitivenode;
		primitivenode = newPrimitivenode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperatorsPackage.NULL_CHECK__PRIMITIVENODE, oldPrimitivenode, newPrimitivenode);
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
	public void setPrimitivenode(PrimitiveNode newPrimitivenode) {
		if (newPrimitivenode != primitivenode) {
			NotificationChain msgs = null;
			if (primitivenode != null)
				msgs = ((InternalEObject)primitivenode).eInverseRemove(this, GraphstructurePackage.PRIMITIVE_NODE__NULL_CHECK, PrimitiveNode.class, msgs);
			if (newPrimitivenode != null)
				msgs = ((InternalEObject)newPrimitivenode).eInverseAdd(this, GraphstructurePackage.PRIMITIVE_NODE__NULL_CHECK, PrimitiveNode.class, msgs);
			msgs = basicSetPrimitivenode(newPrimitivenode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatorsPackage.NULL_CHECK__PRIMITIVENODE, newPrimitivenode, newPrimitivenode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OperatorsPackage.NULL_CHECK__PRIMITIVENODE:
				if (primitivenode != null)
					msgs = ((InternalEObject)primitivenode).eInverseRemove(this, GraphstructurePackage.PRIMITIVE_NODE__NULL_CHECK, PrimitiveNode.class, msgs);
				return basicSetPrimitivenode((PrimitiveNode)otherEnd, msgs);
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
			case OperatorsPackage.NULL_CHECK__PRIMITIVENODE:
				return basicSetPrimitivenode(null, msgs);
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
			case OperatorsPackage.NULL_CHECK__OPTION:
				return getOption();
			case OperatorsPackage.NULL_CHECK__PRIMITIVENODE:
				if (resolve) return getPrimitivenode();
				return basicGetPrimitivenode();
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
			case OperatorsPackage.NULL_CHECK__OPTION:
				setOption((EnumNullCheck)newValue);
				return;
			case OperatorsPackage.NULL_CHECK__PRIMITIVENODE:
				setPrimitivenode((PrimitiveNode)newValue);
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
			case OperatorsPackage.NULL_CHECK__OPTION:
				setOption(OPTION_EDEFAULT);
				return;
			case OperatorsPackage.NULL_CHECK__PRIMITIVENODE:
				setPrimitivenode((PrimitiveNode)null);
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
			case OperatorsPackage.NULL_CHECK__OPTION:
				return option != OPTION_EDEFAULT;
			case OperatorsPackage.NULL_CHECK__PRIMITIVENODE:
				return primitivenode != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (option: ");
		result.append(option);
		result.append(')');
		return result.toString();
	}

	@Override
	public void createParameters() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EList<Comparable> getArguments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isTranslatable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EList<Node> getAllArgumentElements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String myToString() {
		// TODO Auto-generated method stub
		return null;
	}

} //NullCheckImpl
