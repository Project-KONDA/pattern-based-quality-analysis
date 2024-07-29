/**
 */
package qualitypatternmodel.operators.impl;

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
import qualitypatternmodel.graphstructure.Comparable;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.operators.Contains;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.impl.BooleanParamImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.utility.ConstantsError;
import qualitypatternmodel.utility.ConstantsNeo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contains</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.operators.impl.ContainsImpl#getPrimitiveNode <em>Primitive Node</em>}</li>
 *   <li>{@link qualitypatternmodel.operators.impl.ContainsImpl#getOption <em>Option</em>}</li>
 *   <li>{@link qualitypatternmodel.operators.impl.ContainsImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainsImpl extends BooleanOperatorImpl implements Contains {
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
	 * The cached value of the '{@link #getContent() <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected TextLiteralParam content;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ContainsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperatorsPackage.Literals.CONTAINS;
	}

	@Override
	public String generateXQuery() throws InvalidityException {
		if(option!=null && content != null && content.getValue() != null && primitiveNode != null) {
			if (option.getValue()){
				return primitiveNode.generateXQuery() + "contains(., \"" + content.getValue() + "\")";
			} else {
				return primitiveNode.generateXQuery() + "not(contains(., \"" + content.getValue() + "\"))";
			}
		} else {
			throw new InvalidityException("invalid option");
		}
	}

	@Override
	public String generateSparql() throws InvalidityException {
		if(option!=null && content != null && content.getValue() != null && primitiveNode != null) {
			if (option.getValue()){
				String result = "\nFILTER (contains(";
				result += primitiveNode.generateSparql();
				result += ", ";
				result += content.generateSparql();
				result += "))";
				return result;
			} else {
				return "\nFILTER (!contains(" + primitiveNode.generateSparql() + ", " + content.generateSparql() + "))";
			}
		} else {
			throw new InvalidityException("invalid option");
		}
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @throws InvalidityException
	 * Generates the substring for contains.
	 */
	@Override
	public String generateCypher() throws InvalidityException {
		if(option != null && content != null && content.getValue() != null && primitiveNode != null) {
			String tempCypherPropertyAddressing = ((NeoPropertyNode) primitiveNode).generateCypherPropertyAddressing().get(ConstantsNeo.FIRST_CYPHER_PROPERTY_ADDRESSING);
			if (!tempCypherPropertyAddressing.isEmpty()) {
				if (option.getValue()) {
					return tempCypherPropertyAddressing + ConstantsNeo.ONE_WHITESPACE +
							  ConstantsNeo.OPERATOR_CONTAINS + ConstantsNeo.ONE_WHITESPACE + ConstantsNeo.SIGNLE_OPENING_ROUND_BRACKET + ConstantsNeo.CYPHER_QUOTATION_MARK + content.getValue() +
							  ConstantsNeo.CYPHER_QUOTATION_MARK + ConstantsNeo.SIGNLE_CLOSING_ROUND_BRACKET;
				}
				return  ConstantsNeo.BOOLEAN_OPERATOR_NOT+ ConstantsNeo.ONE_WHITESPACE + ConstantsNeo.SIGNLE_OPENING_ROUND_BRACKET + tempCypherPropertyAddressing + ConstantsNeo.ONE_WHITESPACE +
						  ConstantsNeo.OPERATOR_CONTAINS + ConstantsNeo.ONE_WHITESPACE + ConstantsNeo.SIGNLE_OPENING_ROUND_BRACKET +  ConstantsNeo.CYPHER_QUOTATION_MARK + content.getValue() +
						  ConstantsNeo.CYPHER_QUOTATION_MARK + ConstantsNeo.SIGNLE_CLOSING_ROUND_BRACKET + ConstantsNeo.SIGNLE_CLOSING_ROUND_BRACKET;
			}
			throw new InvalidityException(ConstantsNeo.NO_VALID_PROPERTY_IS_ACCESSABLE);
		}
		throw new InvalidityException(ConstantsError.INVALID_OPTION);
	}

	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		super.isValid(abstractionLevel);
		option.isValid(abstractionLevel);
		content.isValid(abstractionLevel);
	}

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException {
		if (option == null) {
			throw new InvalidityException("options null");
		}
		if (content == null) {
			throw new InvalidityException("content null");
		}
		if (abstractionLevel != AbstractionLevel.SEMI_GENERIC && primitiveNode == null) {
			throw new InvalidityException("property null");
		}

		super.isValidLocal(abstractionLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public EList<Parameter> getAllParameters() throws InvalidityException {
		EList<Parameter> res = new BasicEList<Parameter>();
		res.add(content);
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
		list.add(content);
		list.add(option);
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
			if(getContent() == null) {
				TextLiteralParam textLiteral = new TextLiteralParamImpl();
				setContent(textLiteral);
			}
			parameterList.add(getContent());
		}
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperatorsPackage.CONTAINS__PRIMITIVE_NODE, oldPrimitiveNode, primitiveNode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperatorsPackage.CONTAINS__PRIMITIVE_NODE, oldPrimitiveNode, newPrimitiveNode);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperatorsPackage.CONTAINS__PRIMITIVE_NODE, oldProperty, newProperty);
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
				msgs = ((InternalEObject)primitiveNode).eInverseRemove(this, GraphstructurePackage.PRIMITIVE_NODE__CONTAINS, PrimitiveNode.class, msgs);
			if (newPrimitiveNode != null)
				msgs = ((InternalEObject)newPrimitiveNode).eInverseAdd(this, GraphstructurePackage.PRIMITIVE_NODE__CONTAINS, PrimitiveNode.class, msgs);
			msgs = basicSetPrimitiveNode(newPrimitiveNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatorsPackage.CONTAINS__PRIMITIVE_NODE, newPrimitiveNode, newPrimitiveNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextLiteralParam getContent() {
		if (content != null && content.eIsProxy()) {
			InternalEObject oldContent = (InternalEObject)content;
			content = (TextLiteralParam)eResolveProxy(oldContent);
			if (content != oldContent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperatorsPackage.CONTAINS__CONTENT, oldContent, content));
			}
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextLiteralParam basicGetContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetContent(TextLiteralParam newContent, NotificationChain msgs) {
		TextLiteralParam oldContent = content;

		ParameterList varlist = getParameterList();
		varlist.remove(oldContent);
		varlist.add(newContent);

		content = newContent;


		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperatorsPackage.CONTAINS__CONTENT, oldContent, newContent);
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
	public void setContent(TextLiteralParam newContent) {
		if (newContent != content) {
			NotificationChain msgs = null;
			if (content != null)
				msgs = ((InternalEObject)content).eInverseRemove(this, ParametersPackage.TEXT_LITERAL_PARAM__CONTAINS, TextLiteralParam.class, msgs);
			if (newContent != null)
				msgs = ((InternalEObject)newContent).eInverseAdd(this, ParametersPackage.TEXT_LITERAL_PARAM__CONTAINS, TextLiteralParam.class, msgs);
			msgs = basicSetContent(newContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatorsPackage.CONTAINS__CONTENT, newContent, newContent));
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
		patternElements.add(getContent());
		setOption(null);
		setContent(null);
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
			case OperatorsPackage.CONTAINS__PRIMITIVE_NODE:
				if (primitiveNode != null)
					msgs = ((InternalEObject)primitiveNode).eInverseRemove(this, GraphstructurePackage.PRIMITIVE_NODE__CONTAINS, PrimitiveNode.class, msgs);
				return basicSetPrimitiveNode((PrimitiveNode)otherEnd, msgs);
			case OperatorsPackage.CONTAINS__OPTION:
				if (option != null)
					msgs = ((InternalEObject)option).eInverseRemove(this, ParametersPackage.BOOLEAN_PARAM__CONTAINS, BooleanParam.class, msgs);
				return basicSetOption((BooleanParam)otherEnd, msgs);
			case OperatorsPackage.CONTAINS__CONTENT:
				if (content != null)
					msgs = ((InternalEObject)content).eInverseRemove(this, ParametersPackage.TEXT_LITERAL_PARAM__CONTAINS, TextLiteralParam.class, msgs);
				return basicSetContent((TextLiteralParam)otherEnd, msgs);
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
			case OperatorsPackage.CONTAINS__PRIMITIVE_NODE:
				return basicSetPrimitiveNode(null, msgs);
			case OperatorsPackage.CONTAINS__OPTION:
				return basicSetOption(null, msgs);
			case OperatorsPackage.CONTAINS__CONTENT:
				return basicSetContent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperatorsPackage.CONTAINS__OPTION, oldOption, option));
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
		varlist.remove(oldOption);
		varlist.add(newOption);

		option = newOption;

		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperatorsPackage.CONTAINS__OPTION, oldOption, newOption);
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
	public void setOption(BooleanParam newOption) {
		if (newOption != option) {
			NotificationChain msgs = null;
			if (option != null)
				msgs = ((InternalEObject)option).eInverseRemove(this, ParametersPackage.BOOLEAN_PARAM__CONTAINS, BooleanParam.class, msgs);
			if (newOption != null)
				msgs = ((InternalEObject)newOption).eInverseAdd(this, ParametersPackage.BOOLEAN_PARAM__CONTAINS, BooleanParam.class, msgs);
			msgs = basicSetOption(newOption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatorsPackage.CONTAINS__OPTION, newOption, newOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperatorsPackage.CONTAINS__PRIMITIVE_NODE:
				if (resolve) return getPrimitiveNode();
				return basicGetPrimitiveNode();
			case OperatorsPackage.CONTAINS__OPTION:
				if (resolve) return getOption();
				return basicGetOption();
			case OperatorsPackage.CONTAINS__CONTENT:
				if (resolve) return getContent();
				return basicGetContent();
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
			case OperatorsPackage.CONTAINS__PRIMITIVE_NODE:
				setPrimitiveNode((PrimitiveNode)newValue);
				return;
			case OperatorsPackage.CONTAINS__OPTION:
				setOption((BooleanParam)newValue);
				return;
			case OperatorsPackage.CONTAINS__CONTENT:
				setContent((TextLiteralParam)newValue);
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
			case OperatorsPackage.CONTAINS__PRIMITIVE_NODE:
				setPrimitiveNode((PrimitiveNode)null);
				return;
			case OperatorsPackage.CONTAINS__OPTION:
				setOption((BooleanParam)null);
				return;
			case OperatorsPackage.CONTAINS__CONTENT:
				setContent((TextLiteralParam)null);
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
			case OperatorsPackage.CONTAINS__PRIMITIVE_NODE:
				return primitiveNode != null;
			case OperatorsPackage.CONTAINS__OPTION:
				return option != null;
			case OperatorsPackage.CONTAINS__CONTENT:
				return content != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String myToString() {
		String res = "CONTAINS (" + getInternalId() + ") [";
		if (!getOption().getValue()) {
			res += "not ";
		}
		res += getOption().getInternalId() + "]";
		res += "[" + getPrimitiveNode().getInternalId() + ", " + getContent().getInternalId() + "]";
		return res;
	}

}