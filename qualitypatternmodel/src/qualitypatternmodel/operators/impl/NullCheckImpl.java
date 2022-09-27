/**
 */
package qualitypatternmodel.operators.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.adaptionNeo4J.NeoPropertyNode;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Comparable;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;

import qualitypatternmodel.operators.EnumNullCheck;
import qualitypatternmodel.operators.NullCheck;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.impl.BooleanParamImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.utility.CypherSpecificConstants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Null Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.operators.impl.NullCheckImpl#getOption <em>Option</em>}</li>
 *   <li>{@link qualitypatternmodel.operators.impl.NullCheckImpl#getPrimitiveNode <em>Primitive Node</em>}</li>
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
	 * The cached value of the '{@link #getPrimitiveNode() <em>Primitive Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveNode()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveNode primitiveNode;

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
	
	@Override 
	public String generateXQuery() {
		throw new UnsupportedOperationException();
	}
	
	@Override 
	public String generateSparql() {
		throw new UnsupportedOperationException();
	}
	
	@Override 
	public String generateCypher() throws InvalidityException {
		if(option != null && primitiveNode != null) {
			String cypher;
			if (option == EnumNullCheck.ISNOTNULL) {
				cypher = ((NeoPropertyNode) primitiveNode).generateCypherPropertyAddressing() + CypherSpecificConstants.ONE_WHITESPACES + EnumNullCheck.ISNOTNULL;
			} else {
				cypher = ((NeoPropertyNode) primitiveNode).generateCypherPropertyAddressing() + CypherSpecificConstants.ONE_WHITESPACES + EnumNullCheck.ISNULL;
			}	
			return cypher;
		}
		throw new InvalidityException("Contains - invalid option");
	}

	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		super.isValid(abstractionLevel);
//		option.isValid(abstractionLevel);		
//		content.isValid(abstractionLevel);
	}
	
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException {
		if (option == null)
			throw new InvalidityException("options null");
		if (abstractionLevel != AbstractionLevel.SEMI_GENERIC && primitiveNode == null)
			throw new InvalidityException("property null");		
		
		super.isValidLocal(abstractionLevel);
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
	public PrimitiveNode getPrimitiveNode() {
		if (primitiveNode != null && primitiveNode.eIsProxy()) {
			InternalEObject oldPrimitiveNode = (InternalEObject)primitiveNode;
			primitiveNode = (PrimitiveNode)eResolveProxy(oldPrimitiveNode);
			if (primitiveNode != oldPrimitiveNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperatorsPackage.NULL_CHECK__PRIMITIVE_NODE, oldPrimitiveNode, primitiveNode));
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
	 * @generated
	 */
	public NotificationChain basicSetPrimitiveNode(PrimitiveNode newPrimitiveNode, NotificationChain msgs) {
		PrimitiveNode oldPrimitiveNode = primitiveNode;
		primitiveNode = newPrimitiveNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperatorsPackage.NULL_CHECK__PRIMITIVE_NODE, oldPrimitiveNode, newPrimitiveNode);
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
	public void setPrimitiveNode(PrimitiveNode newPrimitiveNode) {
		if (newPrimitiveNode != primitiveNode) {
			NotificationChain msgs = null;
			if (primitiveNode != null)
				msgs = ((InternalEObject)primitiveNode).eInverseRemove(this, GraphstructurePackage.PRIMITIVE_NODE__NULL_CHECK, PrimitiveNode.class, msgs);
			if (newPrimitiveNode != null)
				msgs = ((InternalEObject)newPrimitiveNode).eInverseAdd(this, GraphstructurePackage.PRIMITIVE_NODE__NULL_CHECK, PrimitiveNode.class, msgs);
			msgs = basicSetPrimitiveNode(newPrimitiveNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatorsPackage.NULL_CHECK__PRIMITIVE_NODE, newPrimitiveNode, newPrimitiveNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OperatorsPackage.NULL_CHECK__PRIMITIVE_NODE:
				if (primitiveNode != null)
					msgs = ((InternalEObject)primitiveNode).eInverseRemove(this, GraphstructurePackage.PRIMITIVE_NODE__NULL_CHECK, PrimitiveNode.class, msgs);
				return basicSetPrimitiveNode((PrimitiveNode)otherEnd, msgs);
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
			case OperatorsPackage.NULL_CHECK__PRIMITIVE_NODE:
				return basicSetPrimitiveNode(null, msgs);
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
			case OperatorsPackage.NULL_CHECK__PRIMITIVE_NODE:
				if (resolve) return getPrimitiveNode();
				return basicGetPrimitiveNode();
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
			case OperatorsPackage.NULL_CHECK__PRIMITIVE_NODE:
				setPrimitiveNode((PrimitiveNode)newValue);
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
			case OperatorsPackage.NULL_CHECK__PRIMITIVE_NODE:
				setPrimitiveNode((PrimitiveNode)null);
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
			case OperatorsPackage.NULL_CHECK__PRIMITIVE_NODE:
				return primitiveNode != null;
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
		ParameterList parameterList = getParameterList();
		if(parameterList != null) {
			if(getOption() == null) {
				BooleanParam bool = new BooleanParamImpl();				
				setOption(bool);
			} else {
				parameterList.add(getOption());
			}
			if(getContent() == null) {
				TextLiteralParam textLiteral = new TextLiteralParamImpl();				
				setContent(textLiteral);
			} else {
				parameterList.add(getContent());
			}
		}
	}

	@Override
	public EList<Comparable> getArguments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isTranslatable() {
		return primitiveNode.isTranslatable();
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
