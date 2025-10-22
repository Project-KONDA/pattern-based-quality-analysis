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
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Comparable;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.TextParam;
import qualitypatternmodel.parameters.impl.BooleanParamImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.utility.ConstantsError;
import qualitypatternmodel.utility.ConstantsNeo;
import qualitypatternmodel.utility.XmlServletUtility;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.operators.impl.MatchImpl#getPrimitiveNode <em>Primitive Node</em>}</li>
 *   <li>{@link qualitypatternmodel.operators.impl.MatchImpl#getOption <em>Option</em>}</li>
 *   <li>{@link qualitypatternmodel.operators.impl.MatchImpl#getRegularExpression <em>Regular Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchImpl extends BooleanOperatorImpl implements Match {
	private final static String CYPHER_REGEX = "%1$s" + ConstantsNeo.ONE_WHITESPACE + ConstantsNeo.SPECIAL_CYPHER_REGEX_EXPRESSION + ConstantsNeo.ONE_WHITESPACE + "%2$s";
	private final static String CYPHER_NOT_REGEX = ConstantsNeo.BOOLEAN_OPERATOR_NOT + ConstantsNeo.ONE_WHITESPACE + ConstantsNeo.SIGNLE_OPENING_ROUND_BRACKET + "%1$s" + ConstantsNeo.ONE_WHITESPACE +	ConstantsNeo.SPECIAL_CYPHER_REGEX_EXPRESSION + ConstantsNeo.ONE_WHITESPACE + "%2$s" + ConstantsNeo.SIGNLE_CLOSING_ROUND_BRACKET;

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
	 * Boolean parameter to determine whether to negate the matching result.
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected BooleanParam option;

	/**
	 * The cached value of the '{@link #getRegularExpression() <em>Regular Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * Parameter to determine the regular expression.
	 * <!-- end-user-doc -->
	 * @see #getRegularExpression()
	 * @generated
	 * @ordered
	 */
	protected TextParam regularExpression;

	/**
	 * <!-- begin-user-doc -->
	 * Constructor.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public MatchImpl() {
		super();
	}

	@Override
	public String generateXQuery() throws InvalidityException {
		if (option == null)
			throw new InvalidityException("option null");
		if (regularExpression == null)
			throw new InvalidityException("content null");
		if (!regularExpression.inputIsValid())
			throw new InvalidityException("content input invalid: " + regularExpression.myToString() + ": "+ regularExpression.getValueAsString());
		if (primitiveNode == null)
			throw new InvalidityException("node null");
		
		String matches;
		if (regularExpression instanceof TextLiteralParam)
			matches = "matches(., " + regularExpression.generateXQuery() + ")";
		else {
			String var = "$contains" + getInternalId();
			matches = "some " + var + " in " + regularExpression.generateXQuery() + " satisfies matches(., " + var + ")";
		}	
		
		if (option.getValue()){
			return primitiveNode.generateXQuery() + matches;
		} else {
			return primitiveNode.generateXQuery() + "not(" + matches + ")";
		}
	}

	@Override
	public String generateXQueryIsolated() throws InvalidityException {
		String query = generateXQuery();
		EList<String> vars = ((XmlProperty) primitiveNode).getXQueryRepresentation();
		String var = vars.get(vars.size()-1);
		query = query.replace("matches(.,", "matches(" + var + ",");
		return query;
	}

	@Override
	public String generateSparql() throws InvalidityException {
		if (! (regularExpression instanceof TextLiteralParam))
			throw new InvalidityException(ConstantsError.NOT_IMPLEMENTED_RDF);
		if(option!=null && regularExpression != null && regularExpression.inputIsValid() && primitiveNode != null) {
			if (option.getValue()){
				return "\nFILTER (regex(" + primitiveNode.generateSparql() + ", " + regularExpression.generateSparql() + "))";
			} else {
				return "\nFILTER (!regex(" + primitiveNode.generateSparql() + ", " + regularExpression.generateSparql() + "))";
			}
		} else {
			throw new InvalidityException("invalid option");
		}
	}


	/**
	 * @author Lukas Sebastian Hofmann
	 * @throws InvalidityException
	 * Generates the substring for match/regex.
	 */
	@Override
	public String generateCypher() throws InvalidityException {
		if (! (regularExpression instanceof TextLiteralParam))
			throw new InvalidityException(ConstantsError.NOT_IMPLEMENTED_NEO);
		if (option != null && regularExpression != null && regularExpression.inputIsValid() && primitiveNode != null) {
			String tempCypherPropertyAddressing = ((NeoPropertyNode) primitiveNode).generateCypherPropertyAddressing().get(ConstantsNeo.FIRST_CYPHER_PROPERTY_ADDRESSING);
			if (!tempCypherPropertyAddressing.isEmpty()) {
				if (option.getValue()) {
					return String.format(CYPHER_REGEX, tempCypherPropertyAddressing, regularExpression.generateCypher());
				}
				return  String.format(CYPHER_NOT_REGEX, tempCypherPropertyAddressing, regularExpression.generateCypher());
			}
			throw new InvalidityException(ConstantsNeo.NO_VALID_PROPERTY_IS_ACCESSABLE);
		}
		throw new InvalidityException(ConstantsError.INVALID_OPTION);
	}

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (option == null) {
			throw new InvalidityException("options null");
		} else {
			option.isValid(abstractionLevel);
		}
		if (regularExpression == null) {
			throw new InvalidityException("regularExpression null");
		} else {
			regularExpression.isValid(abstractionLevel);

			if (abstractionLevel == AbstractionLevel.CONCRETE) {
				if (regularExpression instanceof TextLiteralParam) {
					TextLiteralParam regex = (TextLiteralParam) regularExpression;
					if (!isValidRegex(regex.getValue(), ((CompletePattern) getAncestor(CompletePattern.class)).getLanguage()))
						throw new InvalidityException("Regular Expression invalid: " + regex.getValue());
				}
				else {
					TextListParam regex = (TextListParam) regularExpression;
					for (String value : regex.getValues()) {
						String failed = "";
						if (!isValidRegex(value, ((CompletePattern) getAncestor(CompletePattern.class)).getLanguage()))
							failed += "'" + value + "'";
						if (!failed.equals(""))
							new InvalidityException("Regular Expressions invalid: [" + failed + "]");
					}
				}
				
			}
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
		res.add(regularExpression);
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
		list.add(regularExpression);
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
			if(getRegularExpression() == null) {
				TextLiteralParam textLiteral = new TextLiteralParamImpl();
				setRegularExpression(textLiteral);
			}
			parameterList.add(getRegularExpression());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperatorsPackage.Literals.MATCH;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperatorsPackage.MATCH__PRIMITIVE_NODE, oldPrimitiveNode, primitiveNode));
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
				msgs = ((InternalEObject)primitiveNode).eInverseRemove(this, GraphstructurePackage.PRIMITIVE_NODE__MATCH, PrimitiveNode.class, msgs);
			if (newPrimitiveNode != null)
				msgs = ((InternalEObject)newPrimitiveNode).eInverseAdd(this, GraphstructurePackage.PRIMITIVE_NODE__MATCH, PrimitiveNode.class, msgs);
			msgs = basicSetPrimitiveNode(newPrimitiveNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatorsPackage.MATCH__PRIMITIVE_NODE, newPrimitiveNode, newPrimitiveNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextParam getRegularExpression() {
		if (regularExpression != null && regularExpression.eIsProxy()) {
			InternalEObject oldRegularExpression = (InternalEObject)regularExpression;
			regularExpression = (TextParam)eResolveProxy(oldRegularExpression);
			if (regularExpression != oldRegularExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperatorsPackage.MATCH__REGULAR_EXPRESSION, oldRegularExpression, regularExpression));
			}
		}
		return regularExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextParam basicGetRegularExpression() {
		return regularExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegularExpression(TextParam newRegularExpression) {
		if (newRegularExpression != regularExpression) {
			NotificationChain msgs = null;
			if (regularExpression != null)
				msgs = ((InternalEObject)regularExpression).eInverseRemove(this, ParametersPackage.TEXT_PARAM__MATCHES, TextParam.class, msgs);
			if (newRegularExpression != null)
				msgs = ((InternalEObject)newRegularExpression).eInverseAdd(this, ParametersPackage.TEXT_PARAM__MATCHES, TextParam.class, msgs);
			msgs = basicSetRegularExpression(newRegularExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatorsPackage.MATCH__REGULAR_EXPRESSION, newRegularExpression, newRegularExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetRegularExpression(TextParam newRegularExpression, NotificationChain msgs) {
		TextParam oldRegularExpression = regularExpression;

		ParameterList varlist = getParameterList();
		if (varlist != null) {
			varlist.remove(oldRegularExpression);
			varlist.add(newRegularExpression);
		}

		regularExpression = newRegularExpression;


		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperatorsPackage.MATCH__REGULAR_EXPRESSION, oldRegularExpression, newRegularExpression);
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
	@Override
	public Node getElement() {
		return getPrimitiveNode();
	}

	@Override
	public EList<PatternElement> prepareParameterUpdates() {
		EList<PatternElement> patternElements = new BasicEList<PatternElement>();
		patternElements.add(getOption());
		patternElements.add(getRegularExpression());
//		setOption(null);
//		setRegularExpression(null);
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
			case OperatorsPackage.MATCH__PRIMITIVE_NODE:
				if (primitiveNode != null)
					msgs = ((InternalEObject)primitiveNode).eInverseRemove(this, GraphstructurePackage.PRIMITIVE_NODE__MATCH, PrimitiveNode.class, msgs);
				return basicSetPrimitiveNode((PrimitiveNode)otherEnd, msgs);
			case OperatorsPackage.MATCH__OPTION:
				if (option != null)
					msgs = ((InternalEObject)option).eInverseRemove(this, ParametersPackage.BOOLEAN_PARAM__MATCHES, BooleanParam.class, msgs);
				return basicSetOption((BooleanParam)otherEnd, msgs);
			case OperatorsPackage.MATCH__REGULAR_EXPRESSION:
				if (regularExpression != null)
					msgs = ((InternalEObject)regularExpression).eInverseRemove(this, ParametersPackage.TEXT_PARAM__MATCHES, TextParam.class, msgs);
				return basicSetRegularExpression((TextParam)otherEnd, msgs);
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
			case OperatorsPackage.MATCH__PRIMITIVE_NODE:
				return basicSetPrimitiveNode(null, msgs);
			case OperatorsPackage.MATCH__OPTION:
				return basicSetOption(null, msgs);
			case OperatorsPackage.MATCH__REGULAR_EXPRESSION:
				return basicSetRegularExpression(null, msgs);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperatorsPackage.MATCH__OPTION, oldOption, option));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperatorsPackage.MATCH__OPTION, oldOption, newOption);
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
				msgs = ((InternalEObject)option).eInverseRemove(this, ParametersPackage.BOOLEAN_PARAM__MATCHES, BooleanParam.class, msgs);
			if (newOption != null)
				msgs = ((InternalEObject)newOption).eInverseAdd(this, ParametersPackage.BOOLEAN_PARAM__MATCHES, BooleanParam.class, msgs);
			msgs = basicSetOption(newOption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatorsPackage.MATCH__OPTION, newOption, newOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperatorsPackage.MATCH__PRIMITIVE_NODE:
				if (resolve) return getPrimitiveNode();
				return basicGetPrimitiveNode();
			case OperatorsPackage.MATCH__OPTION:
				if (resolve) return getOption();
				return basicGetOption();
			case OperatorsPackage.MATCH__REGULAR_EXPRESSION:
				if (resolve) return getRegularExpression();
				return basicGetRegularExpression();
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
			case OperatorsPackage.MATCH__PRIMITIVE_NODE:
				setPrimitiveNode((PrimitiveNode)newValue);
				return;
			case OperatorsPackage.MATCH__OPTION:
				setOption((BooleanParam)newValue);
				return;
			case OperatorsPackage.MATCH__REGULAR_EXPRESSION:
				setRegularExpression((TextParam)newValue);
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
			case OperatorsPackage.MATCH__PRIMITIVE_NODE:
				setPrimitiveNode((PrimitiveNode)null);
				return;
			case OperatorsPackage.MATCH__OPTION:
				setOption((BooleanParam)null);
				return;
			case OperatorsPackage.MATCH__REGULAR_EXPRESSION:
				setRegularExpression((TextParam)null);
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
			case OperatorsPackage.MATCH__PRIMITIVE_NODE:
				return primitiveNode != null;
			case OperatorsPackage.MATCH__OPTION:
				return option != null;
			case OperatorsPackage.MATCH__REGULAR_EXPRESSION:
				return regularExpression != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String myToString() {
		String res = "MATCH (" + getInternalId() + ") [";
		if (getOption() == null)
			res += "null]";
		else {
			if (!getOption().getValue()) {
				res += "not ";
			}
			res += getOption().getInternalId() + "]";
		}
		res += "[";
		if (getPrimitiveNode() == null) {
			res += "null, ";
		}
		else 
			res +=  getPrimitiveNode().getInternalId() + ", ";
		if (getRegularExpression() == null)
			res += "null]";
		else 
			res += getRegularExpression().getInternalId() + "]";
		return res;
	}

	@Override
	public Boolean isValidRegex(String regex, Language lang) {
		try {
			matches( "", regex, lang);
			return true;
		} catch (InvalidityException e) {
			return false;
		}
		
	}
	
	public static String matches (String teststring, String regex, Language lang) throws InvalidityException {
		switch (lang) {
		case XML:
			String query = "matches(\'" + teststring + "\', \'" + regex + "\')";
			return XmlServletUtility.executeXQueryJava(query).get(0);
		case RDF:
		case NEO4J:
		default:
			System.err.println("RegEx-Validation not implemented for " + lang);
			return "";
	}
		
		
	}

} //MatchImpl
