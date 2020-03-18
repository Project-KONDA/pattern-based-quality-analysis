/**
 */
package qualitypatternmodel.functions.impl;

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
import qualitypatternmodel.functions.BooleanOperator;
import qualitypatternmodel.functions.FunctionsPackage;
import qualitypatternmodel.functions.Match;
import qualitypatternmodel.functions.OperatorList;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Comparable;
import qualitypatternmodel.graphstructure.ListOfElements;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.inputfields.Parameter;
import qualitypatternmodel.inputfields.InputfieldsPackage;
import qualitypatternmodel.inputfields.TextLiteral;
import qualitypatternmodel.inputfields.ParameterList;
import qualitypatternmodel.inputfields.impl.BooleanImpl;
import qualitypatternmodel.inputfields.Boolean;
import qualitypatternmodel.inputfields.impl.TextLiteralImpl;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.impl.PatternImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.functions.impl.MatchImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.impl.MatchImpl#getOption <em>Option</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.impl.MatchImpl#getRegularExpression <em>Regular Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchImpl extends BooleanOperatorImpl implements Match {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected Property property;

	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected qualitypatternmodel.inputfields.Boolean option;

	/**
	 * The cached value of the '{@link #getRegularExpression() <em>Regular Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegularExpression()
	 * @generated
	 * @ordered
	 */
	protected TextLiteral regularExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public MatchImpl() {
		super();	
	}
	
	@Override
	public String toXQuery(Location location) throws InvalidityException {
		if(option!=null && regularExpression != null && regularExpression.getValue() != null && property != null) {
			if (option.getValue()){
				return "matches(" + property.toXQuery(location) + ", \"" + regularExpression.getValue() + "\")";
			} else {
				return "not(matches(" + property.toXQuery(location) + ", \"" + regularExpression.getValue() + "\"))";
			}	
		} else {
			throw new InvalidityException("invalid option");
		}
	}
	
	@Override
	public void isValid(boolean isDefinedPattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValidLocal(isDefinedPattern);
		option.isValid(isDefinedPattern);		
		regularExpression.isValid(isDefinedPattern);		
		property.isValid(isDefinedPattern);
	}
	
	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException{
		if (option == null)
			throw new InvalidityException("options null");
		if (regularExpression == null)
			throw new InvalidityException("regularExpression null");
		if (property == null)
			throw new InvalidityException("property null");		
	}
	
	@Override
	public boolean hasCountPredicate() {
		return false;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Parameter> getAllInputs() throws InvalidityException {
		EList<Parameter> res = new BasicEList<Parameter>();
		res.add(regularExpression);
		res.add(option);
		return res;
	}

	@Override
	public boolean isTranslatable() throws InvalidityException {
		return property.isTranslatable();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * 
	 */
	@Override
	public EList<ListOfElements> getAllArgumentElements() throws InvalidityException {		
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
	public void createInputs() {
		try {
			Pattern pattern = (Pattern) getAncestor(PatternImpl.class);
			
			if(getOption() == null) {
				Boolean bool = new BooleanImpl();			
				pattern.getParameterList().add(bool);
				setOption(bool);
			} else {
				pattern.getParameterList().add(getOption());
			}
			if(getRegularExpression() == null) {
				TextLiteral textLiteral = new TextLiteralImpl();
				pattern.getParameterList().add(textLiteral);
				setRegularExpression(textLiteral);
			} else {
				pattern.getParameterList().add(getRegularExpression());
			}
		} catch (MissingPatternContainerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void removeInputsFromVariableList() {
		try {
			Pattern pattern = (Pattern) getAncestor(PatternImpl.class);
			pattern.getParameterList().getParameters().remove(getOption());
		} catch (MissingPatternContainerException e) {
			// since this comparison is not contained in a pattern, do nothing
		}
		try {
			Pattern pattern = (Pattern) getAncestor(PatternImpl.class);
			pattern.getParameterList().getParameters().remove(getRegularExpression());
		} catch (MissingPatternContainerException e) {
			// since this comparison is not contained in a pattern, do nothing
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.MATCH;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.MATCH__PROPERTY, oldProperty, property));
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
	 * @generated
	 */
	public NotificationChain basicSetProperty(Property newProperty, NotificationChain msgs) {
		Property oldProperty = property;
		property = newProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionsPackage.MATCH__PROPERTY, oldProperty, newProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setProperty(Property newProperty) {
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.MATCH__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextLiteral getRegularExpression() {
		if (regularExpression != null && regularExpression.eIsProxy()) {
			InternalEObject oldRegularExpression = (InternalEObject)regularExpression;
			regularExpression = (TextLiteral)eResolveProxy(oldRegularExpression);
			if (regularExpression != oldRegularExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.MATCH__REGULAR_EXPRESSION, oldRegularExpression, regularExpression));
			}
		}
		return regularExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextLiteral basicGetRegularExpression() {
		return regularExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetRegularExpression(TextLiteral newRegularExpression, NotificationChain msgs) {
		TextLiteral oldRegularExpression = regularExpression;
		regularExpression = newRegularExpression;
		
		try {
			Pattern pattern;
			pattern = (Pattern) getAncestor(Pattern.class);
			ParameterList varlist = pattern.getParameterList();
			if(oldRegularExpression != null) {				
				varlist.getParameters().remove(oldRegularExpression);
			}
			if(newRegularExpression != null) {
				varlist.add(newRegularExpression);
			}
		} catch (MissingPatternContainerException e) {
			// do nothing
		}	
		
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionsPackage.MATCH__REGULAR_EXPRESSION, oldRegularExpression, newRegularExpression);
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
	public void setRegularExpression(TextLiteral newRegularExpression) {
		if (newRegularExpression != regularExpression) {
			NotificationChain msgs = null;
			if (regularExpression != null)
				msgs = ((InternalEObject)regularExpression).eInverseRemove(this, InputfieldsPackage.TEXT_LITERAL__MATCH, TextLiteral.class, msgs);
			if (newRegularExpression != null)
				msgs = ((InternalEObject)newRegularExpression).eInverseAdd(this, InputfieldsPackage.TEXT_LITERAL__MATCH, TextLiteral.class, msgs);
			msgs = basicSetRegularExpression(newRegularExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.MATCH__REGULAR_EXPRESSION, newRegularExpression, newRegularExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionsPackage.MATCH__PROPERTY:
				if (property != null)
					msgs = ((InternalEObject)property).eInverseRemove(this, GraphstructurePackage.PROPERTY__MATCH, Property.class, msgs);
				return basicSetProperty((Property)otherEnd, msgs);
			case FunctionsPackage.MATCH__OPTION:
				if (option != null)
					msgs = ((InternalEObject)option).eInverseRemove(this, InputfieldsPackage.BOOLEAN__MATCH, qualitypatternmodel.inputfields.Boolean.class, msgs);
				return basicSetOption((qualitypatternmodel.inputfields.Boolean)otherEnd, msgs);
			case FunctionsPackage.MATCH__REGULAR_EXPRESSION:
				if (regularExpression != null)
					msgs = ((InternalEObject)regularExpression).eInverseRemove(this, InputfieldsPackage.TEXT_LITERAL__MATCH, TextLiteral.class, msgs);
				return basicSetRegularExpression((TextLiteral)otherEnd, msgs);
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
			case FunctionsPackage.MATCH__PROPERTY:
				return basicSetProperty(null, msgs);
			case FunctionsPackage.MATCH__OPTION:
				return basicSetOption(null, msgs);
			case FunctionsPackage.MATCH__REGULAR_EXPRESSION:
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
	public qualitypatternmodel.inputfields.Boolean getOption() {
		if (option != null && option.eIsProxy()) {
			InternalEObject oldOption = (InternalEObject)option;
			option = (qualitypatternmodel.inputfields.Boolean)eResolveProxy(oldOption);
			if (option != oldOption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.MATCH__OPTION, oldOption, option));
			}
		}
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public qualitypatternmodel.inputfields.Boolean basicGetOption() {
		return option;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NotificationChain basicSetOperatorList(OperatorList newOperatorList, NotificationChain msgs) {
		reset();
		return super.basicSetOperatorList(newOperatorList, msgs);		
	}

	public void reset() {
		setProperty(null);
		setOption(null);
		setRegularExpression(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetOption(qualitypatternmodel.inputfields.Boolean newOption, NotificationChain msgs) {
		qualitypatternmodel.inputfields.Boolean oldOption = option;
		option = newOption;
		
		try {
			Pattern pattern;
			pattern = (Pattern) getAncestor(Pattern.class);
			ParameterList varlist = pattern.getParameterList();
			if(oldOption != null) {				
				varlist.getParameters().remove(oldOption);
			}
			if(newOption != null) {
				varlist.add(newOption);
			}
		} catch (MissingPatternContainerException e) {
			// do nothing
		}	
		
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionsPackage.MATCH__OPTION, oldOption, newOption);
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
	public void setOption(qualitypatternmodel.inputfields.Boolean newOption) {
		if (newOption != option) {
			NotificationChain msgs = null;
			if (option != null)
				msgs = ((InternalEObject)option).eInverseRemove(this, InputfieldsPackage.BOOLEAN__MATCH, qualitypatternmodel.inputfields.Boolean.class, msgs);
			if (newOption != null)
				msgs = ((InternalEObject)newOption).eInverseAdd(this, InputfieldsPackage.BOOLEAN__MATCH, qualitypatternmodel.inputfields.Boolean.class, msgs);
			msgs = basicSetOption(newOption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.MATCH__OPTION, newOption, newOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunctionsPackage.MATCH__PROPERTY:
				if (resolve) return getProperty();
				return basicGetProperty();
			case FunctionsPackage.MATCH__OPTION:
				if (resolve) return getOption();
				return basicGetOption();
			case FunctionsPackage.MATCH__REGULAR_EXPRESSION:
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
			case FunctionsPackage.MATCH__PROPERTY:
				setProperty((Property)newValue);
				return;
			case FunctionsPackage.MATCH__OPTION:
				setOption((qualitypatternmodel.inputfields.Boolean)newValue);
				return;
			case FunctionsPackage.MATCH__REGULAR_EXPRESSION:
				setRegularExpression((TextLiteral)newValue);
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
			case FunctionsPackage.MATCH__PROPERTY:
				setProperty((Property)null);
				return;
			case FunctionsPackage.MATCH__OPTION:
				setOption((qualitypatternmodel.inputfields.Boolean)null);
				return;
			case FunctionsPackage.MATCH__REGULAR_EXPRESSION:
				setRegularExpression((TextLiteral)null);
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
			case FunctionsPackage.MATCH__PROPERTY:
				return property != null;
			case FunctionsPackage.MATCH__OPTION:
				return option != null;
			case FunctionsPackage.MATCH__REGULAR_EXPRESSION:
				return regularExpression != null;
		}
		return super.eIsSet(featureID);
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
