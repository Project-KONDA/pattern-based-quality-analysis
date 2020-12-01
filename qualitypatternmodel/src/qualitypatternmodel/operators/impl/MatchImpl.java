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
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Comparable;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.operators.Match;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.operators.impl.MatchImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link qualitypatternmodel.operators.impl.MatchImpl#getOption <em>Option</em>}</li>
 *   <li>{@link qualitypatternmodel.operators.impl.MatchImpl#getRegularExpression <em>Regular Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchImpl extends BooleanOperatorImpl implements Match {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * The <code>Property</code> that is matched to a regular expression.
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected Property property;

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
	protected TextLiteralParam regularExpression;

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
	public String generateQuery() throws InvalidityException {
		if(option!=null && regularExpression != null && regularExpression.getValue() != null && property != null) {
			if (option.getValue()){				
				return property.generateQuery() + "[matches(., \"" + regularExpression.getValue() + "\")]";				
			} else {
				return property.generateQuery() + "[not(matches(., \"" + regularExpression.getValue() + "\"))]";
			}	
		} else {
			throw new InvalidityException("invalid option");
		}
	}
	
	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		super.isValid(abstractionLevel);
		option.isValid(abstractionLevel);		
		regularExpression.isValid(abstractionLevel);
		
		if(property != null) {
			property.isValid(abstractionLevel);
		}
	}
	
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException {
		if (option == null)
			throw new InvalidityException("options null");
		if (regularExpression == null)
			throw new InvalidityException("regularExpression null");
		if (abstractionLevel != AbstractionLevel.SEMI_GENERIC && property == null)
			throw new InvalidityException("property null");		
		
		super.isValidLocal(abstractionLevel);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Parameter> getAllParameters() throws InvalidityException {
		EList<Parameter> res = new BasicEList<Parameter>();
		res.add(regularExpression);
		res.add(option);
		return res;
	}

	@Override
	public boolean isTranslatable() {
		return property.isTranslatable();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * 
	 */
	@Override
	public EList<Element> getAllArgumentElements() {		
		return property.getAllArgumentElements();
	}
	
	@Override
	public EList<Comparable> getArguments(){
		EList<Comparable> list = new BasicEList<Comparable>();		
		list.add(property);
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
			} else {
				parameterList.add(getOption());
			}
			if(getRegularExpression() == null) {
				TextLiteralParam textLiteral = new TextLiteralParamImpl();				
				setRegularExpression(textLiteral);
			} else {
				parameterList.add(getRegularExpression());
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
		return OperatorsPackage.Literals.MATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property getProperty() {
		if (property != null && property.eIsProxy()) {
			InternalEObject oldProperty = (InternalEObject)property;
			property = (Property)eResolveProxy(oldProperty);
			if (property != oldProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperatorsPackage.MATCH__PROPERTY, oldProperty, property));
			}
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetProperty(Property newProperty, NotificationChain msgs) {
		Property oldProperty = property;
		property = newProperty;
		if(newProperty != null || oldProperty != null) {
			for(BooleanOperator boolOp : getRootBooleanOperators()) {
				if(newProperty != null) {
					boolOp.addElement(newProperty.getElement());
				}
				if(oldProperty != null) {
					boolOp.removeElement(oldProperty.getElement());
				}
			}
		}
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperatorsPackage.MATCH__PROPERTY, oldProperty, newProperty);
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
	public void setProperty(Property newProperty) {
		if (newProperty != property) {
			NotificationChain msgs = null;
			if (property != null)
				msgs = ((InternalEObject)property).eInverseRemove(this, GraphstructurePackage.PROPERTY__MATCH, Property.class, msgs);
			if (newProperty != null)
				msgs = ((InternalEObject)newProperty).eInverseAdd(this, GraphstructurePackage.PROPERTY__MATCH, Property.class, msgs);
			msgs = basicSetProperty(newProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatorsPackage.MATCH__PROPERTY, newProperty, newProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextLiteralParam getRegularExpression() {
		if (regularExpression != null && regularExpression.eIsProxy()) {
			InternalEObject oldRegularExpression = (InternalEObject)regularExpression;
			regularExpression = (TextLiteralParam)eResolveProxy(oldRegularExpression);
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
	public TextLiteralParam basicGetRegularExpression() {
		return regularExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetRegularExpression(TextLiteralParam newRegularExpression, NotificationChain msgs) {
		TextLiteralParam oldRegularExpression = regularExpression;
		
		ParameterList varlist = getParameterList();
		varlist.remove(oldRegularExpression);
		varlist.add(newRegularExpression);			
	
		regularExpression = newRegularExpression;

			
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperatorsPackage.MATCH__REGULAR_EXPRESSION, oldRegularExpression, newRegularExpression);
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
	public void setRegularExpression(TextLiteralParam newRegularExpression) {
		if (newRegularExpression != regularExpression) {
			NotificationChain msgs = null;
			if (regularExpression != null)
				msgs = ((InternalEObject)regularExpression).eInverseRemove(this, ParametersPackage.TEXT_LITERAL_PARAM__MATCHES, TextLiteralParam.class, msgs);
			if (newRegularExpression != null)
				msgs = ((InternalEObject)newRegularExpression).eInverseAdd(this, ParametersPackage.TEXT_LITERAL_PARAM__MATCHES, TextLiteralParam.class, msgs);
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
	@Override
	public Element getElement() {
		return getProperty().getElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Match copy() {
		Match newMatch = new MatchImpl();
		newMatch.setOption(getOption());
		newMatch.setRegularExpression(getRegularExpression());		
		Property newProperty = getProperty().copy();
		newMatch.setProperty(newProperty);
		return newMatch;
	}
	
	@Override
	public EList<PatternElement> prepareParameterUpdates() {
		EList<PatternElement> patternElements = new BasicEList<PatternElement>();
		patternElements.add(getOption());
		patternElements.add(getRegularExpression());
		setOption(null);
		setRegularExpression(null);
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
			case OperatorsPackage.MATCH__PROPERTY:
				if (property != null)
					msgs = ((InternalEObject)property).eInverseRemove(this, GraphstructurePackage.PROPERTY__MATCH, Property.class, msgs);
				return basicSetProperty((Property)otherEnd, msgs);
			case OperatorsPackage.MATCH__OPTION:
				if (option != null)
					msgs = ((InternalEObject)option).eInverseRemove(this, ParametersPackage.BOOLEAN_PARAM__MATCHES, BooleanParam.class, msgs);
				return basicSetOption((BooleanParam)otherEnd, msgs);
			case OperatorsPackage.MATCH__REGULAR_EXPRESSION:
				if (regularExpression != null)
					msgs = ((InternalEObject)regularExpression).eInverseRemove(this, ParametersPackage.TEXT_LITERAL_PARAM__MATCHES, TextLiteralParam.class, msgs);
				return basicSetRegularExpression((TextLiteralParam)otherEnd, msgs);
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
			case OperatorsPackage.MATCH__PROPERTY:
				return basicSetProperty(null, msgs);
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
	@SuppressWarnings("unchecked")
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
			case OperatorsPackage.MATCH__PROPERTY:
				if (resolve) return getProperty();
				return basicGetProperty();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OperatorsPackage.MATCH__PROPERTY:
				setProperty((Property)newValue);
				return;
			case OperatorsPackage.MATCH__OPTION:
				setOption((BooleanParam)newValue);
				return;
			case OperatorsPackage.MATCH__REGULAR_EXPRESSION:
				setRegularExpression((TextLiteralParam)newValue);
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
			case OperatorsPackage.MATCH__PROPERTY:
				setProperty((Property)null);
				return;
			case OperatorsPackage.MATCH__OPTION:
				setOption((BooleanParam)null);
				return;
			case OperatorsPackage.MATCH__REGULAR_EXPRESSION:
				setRegularExpression((TextLiteralParam)null);
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
			case OperatorsPackage.MATCH__PROPERTY:
				return property != null;
			case OperatorsPackage.MATCH__OPTION:
				return option != null;
			case OperatorsPackage.MATCH__REGULAR_EXPRESSION:
				return regularExpression != null;
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
			case OperatorsPackage.MATCH___GET_ELEMENT:
				return getElement();
			case OperatorsPackage.MATCH___COPY:
				return copy();
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public String myToString() {
		String res = "MATCH (" + getInternalId() + ") [";
		if (!getOption().getValue()) res += "not ";
		res += getOption().getInternalId() + "]";
		res += "[" + getProperty().getInternalId() + ", " + getRegularExpression().getInternalId() + "]";
		return res;
	}

} //MatchImpl
