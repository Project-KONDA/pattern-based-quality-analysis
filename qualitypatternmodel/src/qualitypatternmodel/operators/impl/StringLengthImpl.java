/**
 */
package qualitypatternmodel.operators.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.adaptionneo4j.NeoPropertyNode;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Comparable;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.operators.StringLength;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl;
import qualitypatternmodel.parameters.impl.NumberParamImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.CypherSpecificConstants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.operators.impl.StringLengthImpl#getPrimitiveNode <em>Primitive Node</em>}</li>
 *   <li>{@link qualitypatternmodel.operators.impl.StringLengthImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link qualitypatternmodel.operators.impl.StringLengthImpl#getOption <em>Option</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringLengthImpl extends BooleanOperatorImpl implements StringLength {

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
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected NumberParam number;
	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected ComparisonOptionParam option;
	/**
	 * <!-- begin-user-doc -->
	 * Constructor.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public StringLengthImpl() {
		super();	
	}
	
	@Override
	public String generateXQuery() throws InvalidityException {
		if(number != null && number.getValue() != null && option != null && option.getValue() != null && primitiveNode != null) {
			return primitiveNode.generateXQuery() + "string-length(.) " + option.generateXQuery() + " " + number.generateXQuery();	
		} else {
			throw new InvalidityException("invalid option");
		}
	}
	
	@Override
	public String generateSparql() throws InvalidityException {
		if(number != null && number.getValue() != null && option != null && option.getValue() != null && primitiveNode != null) {
			return "\nFILTER (strlen(" + primitiveNode.generateSparql() + ") " + option.generateXQuery() + " " + number.generateXQuery() + ")";
		} else {
			throw new InvalidityException("invalid option");
		}
	}
	
	@Override 
	public String generateCypher() throws InvalidityException {
		if(number != null && number.getValue() != null && option != null && option.getValue() != null && primitiveNode != null) {
			String tempCypherPropertyAddressing = (String) ((NeoPropertyNode) primitiveNode).generateCypherPropertyAddressing().get(CypherSpecificConstants.FIRST_CYPHER_PROPERTY_ADDRESSING);
			String res = "size (" + tempCypherPropertyAddressing + ") " + option.generateCypher() + " " + number.generateCypher();
			return res;
		}
		throw new InvalidityException(Constants.INVALID_OPTION);
	}
	
	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		super.isValid(abstractionLevel);
		option.isValid(abstractionLevel);		
		number.isValid(abstractionLevel);
	}
	
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException {
		if (option == null)
			throw new InvalidityException("options null");
		if (number == null)
			throw new InvalidityException("regularExpression null");
		if (abstractionLevel != AbstractionLevel.SEMI_GENERIC && primitiveNode == null)
			throw new InvalidityException("property null");		
		
		super.isValidLocal(abstractionLevel);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Parameter> getAllParameters() throws InvalidityException {
		EList<Parameter> res = new BasicEList<Parameter>();
		res.add(number);
		res.add(option);
		return res;
	}

	@Override
	public boolean isTranslatable() {
		return primitiveNode.isTranslatable();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * 
	 */
	@Override
	public EList<Node> getAllArgumentElements() {		
		return primitiveNode.getAllArgumentElements();
	}
	
	@Override
	public EList<Comparable> getArguments(){
		EList<Comparable> list = new BasicEList<Comparable>();		
		list.add(primitiveNode);
		list.add(number);
//		list.add(option);
		return list;
	}
	
	@Override
	public void createParameters() {		
		ParameterList parameterList = getParameterList();	
		if(parameterList != null) {
			if(getOption() == null) {
				ComparisonOptionParam op = new ComparisonOptionParamImpl();				
				setOption(op);
			} else {
				parameterList.add(getOption());
			}
			if(getNumber() == null) {
				NumberParam numb = new NumberParamImpl();				
				setNumber(numb);
			} else {
				parameterList.add(getNumber());
			}
		}
		
	}	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperatorsPackage.Literals.STRING_LENGTH;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperatorsPackage.STRING_LENGTH__PRIMITIVE_NODE, oldPrimitiveNode, primitiveNode));
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
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetProperty(PrimitiveNode newProperty, NotificationChain msgs) {
		PrimitiveNode oldProperty = primitiveNode;
		primitiveNode = newProperty;
		if(newProperty != null || oldProperty != null) {
			for(BooleanOperator boolOp : getRootBooleanOperators()) {
				if(newProperty != null) {
					boolOp.addElement(newProperty);
				}
				if(oldProperty != null) {
					boolOp.removeElement(oldProperty);
				}
			}
		}
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperatorsPackage.MATCH__PRIMITIVE_NODE, oldProperty, newProperty);
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
				msgs = ((InternalEObject)primitiveNode).eInverseRemove(this, GraphstructurePackage.PRIMITIVE_NODE__STRING_LENGTH, PrimitiveNode.class, msgs);
			if (newPrimitiveNode != null)
				msgs = ((InternalEObject)newPrimitiveNode).eInverseAdd(this, GraphstructurePackage.PRIMITIVE_NODE__STRING_LENGTH, PrimitiveNode.class, msgs);
			msgs = basicSetPrimitiveNode(newPrimitiveNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatorsPackage.STRING_LENGTH__PRIMITIVE_NODE, newPrimitiveNode, newPrimitiveNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberParam getNumber() {
		if (number != null && number.eIsProxy()) {
			InternalEObject oldNumber = (InternalEObject)number;
			number = (NumberParam)eResolveProxy(oldNumber);
			if (number != oldNumber) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperatorsPackage.STRING_LENGTH__NUMBER, oldNumber, number));
			}
		}
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberParam basicGetNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumber(NumberParam newNumber, NotificationChain msgs) {
		NumberParam oldNumber = number;
		number = newNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperatorsPackage.STRING_LENGTH__NUMBER, oldNumber, newNumber);
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
	public void setNumber(NumberParam newNumber) {
		if (newNumber != number) {
			NotificationChain msgs = null;
			if (number != null)
				msgs = ((InternalEObject)number).eInverseRemove(this, ParametersPackage.NUMBER_PARAM__STRING_LENGTH, NumberParam.class, msgs);
			if (newNumber != null)
				msgs = ((InternalEObject)newNumber).eInverseAdd(this, ParametersPackage.NUMBER_PARAM__STRING_LENGTH, NumberParam.class, msgs);
			msgs = basicSetNumber(newNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatorsPackage.STRING_LENGTH__NUMBER, newNumber, newNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComparisonOptionParam getOption() {
		if (option != null && option.eIsProxy()) {
			InternalEObject oldOption = (InternalEObject)option;
			option = (ComparisonOptionParam)eResolveProxy(oldOption);
			if (option != oldOption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperatorsPackage.STRING_LENGTH__OPTION, oldOption, option));
			}
		}
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOptionParam basicGetOption() {
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOption(ComparisonOptionParam newOption) {
		if (newOption != option) {
			NotificationChain msgs = null;
			if (option != null)
				msgs = ((InternalEObject)option).eInverseRemove(this, ParametersPackage.COMPARISON_OPTION_PARAM__STRING_LENGTH, ComparisonOptionParam.class, msgs);
			if (newOption != null)
				msgs = ((InternalEObject)newOption).eInverseAdd(this, ParametersPackage.COMPARISON_OPTION_PARAM__STRING_LENGTH, ComparisonOptionParam.class, msgs);
			msgs = basicSetOption(newOption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatorsPackage.STRING_LENGTH__OPTION, newOption, newOption));
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
		patternElements.add(getNumber());
		setOption(null);
		setNumber(null);
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
			case OperatorsPackage.STRING_LENGTH__PRIMITIVE_NODE:
				if (primitiveNode != null)
					msgs = ((InternalEObject)primitiveNode).eInverseRemove(this, GraphstructurePackage.PRIMITIVE_NODE__STRING_LENGTH, PrimitiveNode.class, msgs);
				return basicSetPrimitiveNode((PrimitiveNode)otherEnd, msgs);
			case OperatorsPackage.STRING_LENGTH__NUMBER:
				if (number != null)
					msgs = ((InternalEObject)number).eInverseRemove(this, ParametersPackage.NUMBER_PARAM__STRING_LENGTH, NumberParam.class, msgs);
				return basicSetNumber((NumberParam)otherEnd, msgs);
			case OperatorsPackage.STRING_LENGTH__OPTION:
				if (option != null)
					msgs = ((InternalEObject)option).eInverseRemove(this, ParametersPackage.COMPARISON_OPTION_PARAM__STRING_LENGTH, ComparisonOptionParam.class, msgs);
				return basicSetOption((ComparisonOptionParam)otherEnd, msgs);
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
			case OperatorsPackage.STRING_LENGTH__PRIMITIVE_NODE:
				return basicSetPrimitiveNode(null, msgs);
			case OperatorsPackage.STRING_LENGTH__NUMBER:
				return basicSetNumber(null, msgs);
			case OperatorsPackage.STRING_LENGTH__OPTION:
				return basicSetOption(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetOption(ComparisonOptionParam newOption, NotificationChain msgs) {
		ComparisonOptionParam oldOption = option;		

		ParameterList varlist = getParameterList();				
		varlist.remove(oldOption);					
		varlist.add(newOption);				
		
		option = newOption;
		
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperatorsPackage.MATCH__OPTION, oldOption, newOption);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperatorsPackage.STRING_LENGTH__PRIMITIVE_NODE:
				if (resolve) return getPrimitiveNode();
				return basicGetPrimitiveNode();
			case OperatorsPackage.STRING_LENGTH__NUMBER:
				if (resolve) return getNumber();
				return basicGetNumber();
			case OperatorsPackage.STRING_LENGTH__OPTION:
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
			case OperatorsPackage.STRING_LENGTH__PRIMITIVE_NODE:
				setPrimitiveNode((PrimitiveNode)newValue);
				return;
			case OperatorsPackage.STRING_LENGTH__NUMBER:
				setNumber((NumberParam)newValue);
				return;
			case OperatorsPackage.STRING_LENGTH__OPTION:
				setOption((ComparisonOptionParam)newValue);
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
			case OperatorsPackage.STRING_LENGTH__PRIMITIVE_NODE:
				setPrimitiveNode((PrimitiveNode)null);
				return;
			case OperatorsPackage.STRING_LENGTH__NUMBER:
				setNumber((NumberParam)null);
				return;
			case OperatorsPackage.STRING_LENGTH__OPTION:
				setOption((ComparisonOptionParam)null);
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
			case OperatorsPackage.STRING_LENGTH__PRIMITIVE_NODE:
				return primitiveNode != null;
			case OperatorsPackage.STRING_LENGTH__NUMBER:
				return number != null;
			case OperatorsPackage.STRING_LENGTH__OPTION:
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
			case OperatorsPackage.STRING_LENGTH___GET_ELEMENT:
				return getElement();
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public String myToString() {
		String res = "LENGTH (" + getInternalId() + ") [";
		if (getOption() != null) {
			if (getOption().getValue() != null) 
				res += getOption().getValue();
				res += " (" + getOption().getInternalId() + ")";
		}
		if (getPrimitiveNode() != null)
			res += " (" + getPrimitiveNode().getInternalId() + ")";
		if (getNumber() != null)
			res += " (" + getNumber().getInternalId() + ")";
		return res + "]";
	}

} //StringLengthImpl
