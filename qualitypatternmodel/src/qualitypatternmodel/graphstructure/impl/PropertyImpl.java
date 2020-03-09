/**
 */
package qualitypatternmodel.graphstructure.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.ecore.util.InternalEList;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.functions.Comparison;
import qualitypatternmodel.functions.FunctionsPackage;
import qualitypatternmodel.functions.Match;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.ListOfElements;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.PropertyLocation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.inputfields.Input;
import qualitypatternmodel.inputfields.PropertyOption;
import qualitypatternmodel.inputfields.TextLiteral;
import qualitypatternmodel.inputfields.impl.PropertyOptionImpl;
import qualitypatternmodel.inputfields.impl.TextLiteralImpl;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;
import qualitypatternmodel.patternstructure.impl.PatternImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Property</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.PropertyImpl#getComparison1 <em>Comparison1</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.PropertyImpl#getComparison2 <em>Comparison2</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.PropertyImpl#getPropertyOption <em>Property Option</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.PropertyImpl#getElement <em>Element</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.PropertyImpl#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.PropertyImpl#getMatch <em>Match</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends PatternElementImpl implements Property {
	/**
	 * The cached value of the '{@link #getComparison1() <em>Comparison1</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparison1()
	 * @generated
	 * @ordered
	 */
	protected EList<Comparison> comparison1;

	/**
	 * The cached value of the '{@link #getComparison2() <em>Comparison2</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparison2()
	 * @generated
	 * @ordered
	 */
	protected EList<Comparison> comparison2;

	/**
	 * The cached value of the '{@link #getPropertyOption() <em>Property Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyOption()
	 * @generated
	 * @ordered
	 */
	protected PropertyOption propertyOption;

	/**
	 * The cached value of the '{@link #getAttributeName() <em>Attribute Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeName()
	 * @generated
	 * @ordered
	 */
	protected TextLiteral attributeName;

	/**
	 * The cached value of the '{@link #getMatch() <em>Match</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatch()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> match;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}
	
	@Override
	public void isValid(boolean isDefinedPattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException  {
		isValidLocal(isDefinedPattern);
		propertyOption.isValid(isDefinedPattern);
	}
	
	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException{
		if (getElement() == null) 
			throw new InvalidityException("element null");
		if (propertyOption == null) 
			throw new InvalidityException("location or propertyOptions invalid");
		if (propertyOption.getValue() != null && propertyOption.getValue() == PropertyLocation.ATTRIBUTE && attributeName == null)
			throw new InvalidityException("attributeName null");		
	}

	@Override
	public String toXQuery(Location location) throws InvalidityException {		
		if(propertyOption == null || propertyOption.getValue() == null) {
			throw new InvalidityException("propertyOptions invalid");
		}				
		String propertyElementTranslation = getElement().getXQueryRepresentation(location);
		switch (propertyOption.getValue()) {
			case ATTRIBUTE: 
				if(attributeName == null || attributeName.getValue() == null) {
					throw new InvalidityException("attributeName invalid");
				} else {
					return propertyElementTranslation + "/@" + attributeName.getValue() + "";
				}
			case DATA: return propertyElementTranslation + "/data()";
			case TAG: return propertyElementTranslation + "/name()";
			default:
				throw new InvalidityException("error in location specification");
		}
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Input> getAllInputs() throws InvalidityException {
		EList<Input> res = new BasicEList<Input>();
		res.add(getAttributeName());
		res.add(getPropertyOption());
		return res;
	}

	@Override
	public ReturnType getReturnType() {
		return ReturnType.UNSPECIFIED;
	}
	
	@Override
	public boolean isTranslatable() throws InvalidityException {
		return getElement().isTranslatable();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * 
	 */
	@Override
	public EList<ListOfElements> getAllArgumentElements() throws InvalidityException {		
		return getElement().getAllArgumentElements();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void createInputs() {
		try {
			Pattern pattern = (Pattern) getAncestor(PatternImpl.class);
			
			if(getPropertyOption() == null) {
				PropertyOption propertyOption = new PropertyOptionImpl();			
				pattern.getVariableList().getVariables().add(propertyOption);
				setPropertyOption(propertyOption);
			} else {
				pattern.getVariableList().getVariables().add(getPropertyOption());
			}
			if(getAttributeName() == null) {
				TextLiteral textLiteral = new TextLiteralImpl();
				pattern.getVariableList().getVariables().add(textLiteral);
				setAttributeName(textLiteral);
			} else {
				pattern.getVariableList().getVariables().add(getAttributeName());
			}
		} catch (MissingPatternContainerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphstructurePackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comparison> getComparison1() {
		if (comparison1 == null) {
			comparison1 = new EObjectWithInverseResolvingEList<Comparison>(Comparison.class, this, GraphstructurePackage.PROPERTY__COMPARISON1, FunctionsPackage.COMPARISON__ARGUMENT1);
		}
		return comparison1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comparison> getComparison2() {
		if (comparison2 == null) {
			comparison2 = new EObjectWithInverseResolvingEList<Comparison>(Comparison.class, this, GraphstructurePackage.PROPERTY__COMPARISON2, FunctionsPackage.COMPARISON__ARGUMENT2);
		}
		return comparison2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public PropertyOption getPropertyOption() {
		if (propertyOption != null && propertyOption.eIsProxy()) {
			InternalEObject oldPropertyOption = (InternalEObject)propertyOption;
			propertyOption = (PropertyOption)eResolveProxy(oldPropertyOption);
			if (propertyOption != oldPropertyOption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphstructurePackage.PROPERTY__PROPERTY_OPTION, oldPropertyOption, propertyOption));
			}
		}
		return propertyOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyOption basicGetPropertyOption() {
		return propertyOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyOption(PropertyOption newPropertyOption) {
		PropertyOption oldPropertyOption = propertyOption;
		propertyOption = newPropertyOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.PROPERTY__PROPERTY_OPTION, oldPropertyOption, propertyOption));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getElement() {
		if (eContainerFeatureID() != GraphstructurePackage.PROPERTY__ELEMENT) return null;
		return (Element)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetElement(Element newElement, NotificationChain msgs) {
		getMatch().clear();
		if(newElement == null) {
			removeInputsFromVariableList();		
		}
		msgs = eBasicSetContainer((InternalEObject)newElement, GraphstructurePackage.PROPERTY__ELEMENT, msgs);
		if(newElement != null) {
			createInputs();
		} 
		return msgs;
	}

	@Override
	public void removeInputsFromVariableList() {
		try {
			Pattern pattern = (Pattern) getAncestor(PatternImpl.class);
			pattern.getVariableList().getVariables().remove(getPropertyOption());
		} catch (MissingPatternContainerException e) {
			// since this property is not contained in a pattern, do nothing
		}				
		try {
			Pattern pattern = (Pattern) getAncestor(PatternImpl.class);
			pattern.getVariableList().getVariables().remove(getAttributeName());
		} catch (MissingPatternContainerException e) {
			// since this property is not contained in a pattern, do nothing
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElement(Element newElement) {
		if (newElement != eInternalContainer() || (eContainerFeatureID() != GraphstructurePackage.PROPERTY__ELEMENT && newElement != null)) {
			if (EcoreUtil.isAncestor(this, newElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, GraphstructurePackage.ELEMENT__PROPERTIES, Element.class, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.PROPERTY__ELEMENT, newElement, newElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextLiteral getAttributeName() {
		if (attributeName != null && attributeName.eIsProxy()) {
			InternalEObject oldAttributeName = (InternalEObject)attributeName;
			attributeName = (TextLiteral)eResolveProxy(oldAttributeName);
			if (attributeName != oldAttributeName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphstructurePackage.PROPERTY__ATTRIBUTE_NAME, oldAttributeName, attributeName));
			}
		}
		return attributeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextLiteral basicGetAttributeName() {
		return attributeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttributeName(TextLiteral newAttributeName) {
		TextLiteral oldAttributeName = attributeName;
		attributeName = newAttributeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.PROPERTY__ATTRIBUTE_NAME, oldAttributeName, attributeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Match> getMatch() {
		if (match == null) {
			match = new EObjectWithInverseResolvingEList<Match>(Match.class, this, GraphstructurePackage.PROPERTY__MATCH, FunctionsPackage.MATCH__PROPERTY);
		}
		return match;
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
			case GraphstructurePackage.PROPERTY__COMPARISON1:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComparison1()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.PROPERTY__COMPARISON2:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComparison2()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.PROPERTY__ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetElement((Element)otherEnd, msgs);
			case GraphstructurePackage.PROPERTY__MATCH:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMatch()).basicAdd(otherEnd, msgs);
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
			case GraphstructurePackage.PROPERTY__COMPARISON1:
				return ((InternalEList<?>)getComparison1()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.PROPERTY__COMPARISON2:
				return ((InternalEList<?>)getComparison2()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.PROPERTY__ELEMENT:
				return basicSetElement(null, msgs);
			case GraphstructurePackage.PROPERTY__MATCH:
				return ((InternalEList<?>)getMatch()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GraphstructurePackage.PROPERTY__ELEMENT:
				return eInternalContainer().eInverseRemove(this, GraphstructurePackage.ELEMENT__PROPERTIES, Element.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphstructurePackage.PROPERTY__COMPARISON1:
				return getComparison1();
			case GraphstructurePackage.PROPERTY__COMPARISON2:
				return getComparison2();
			case GraphstructurePackage.PROPERTY__PROPERTY_OPTION:
				if (resolve) return getPropertyOption();
				return basicGetPropertyOption();
			case GraphstructurePackage.PROPERTY__ELEMENT:
				return getElement();
			case GraphstructurePackage.PROPERTY__ATTRIBUTE_NAME:
				if (resolve) return getAttributeName();
				return basicGetAttributeName();
			case GraphstructurePackage.PROPERTY__MATCH:
				return getMatch();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphstructurePackage.PROPERTY__COMPARISON1:
				getComparison1().clear();
				getComparison1().addAll((Collection<? extends Comparison>)newValue);
				return;
			case GraphstructurePackage.PROPERTY__COMPARISON2:
				getComparison2().clear();
				getComparison2().addAll((Collection<? extends Comparison>)newValue);
				return;
			case GraphstructurePackage.PROPERTY__PROPERTY_OPTION:
				setPropertyOption((PropertyOption)newValue);
				return;
			case GraphstructurePackage.PROPERTY__ELEMENT:
				setElement((Element)newValue);
				return;
			case GraphstructurePackage.PROPERTY__ATTRIBUTE_NAME:
				setAttributeName((TextLiteral)newValue);
				return;
			case GraphstructurePackage.PROPERTY__MATCH:
				getMatch().clear();
				getMatch().addAll((Collection<? extends Match>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GraphstructurePackage.PROPERTY__COMPARISON1:
				getComparison1().clear();
				return;
			case GraphstructurePackage.PROPERTY__COMPARISON2:
				getComparison2().clear();
				return;
			case GraphstructurePackage.PROPERTY__PROPERTY_OPTION:
				setPropertyOption((PropertyOption)null);
				return;
			case GraphstructurePackage.PROPERTY__ELEMENT:
				setElement((Element)null);
				return;
			case GraphstructurePackage.PROPERTY__ATTRIBUTE_NAME:
				setAttributeName((TextLiteral)null);
				return;
			case GraphstructurePackage.PROPERTY__MATCH:
				getMatch().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GraphstructurePackage.PROPERTY__COMPARISON1:
				return comparison1 != null && !comparison1.isEmpty();
			case GraphstructurePackage.PROPERTY__COMPARISON2:
				return comparison2 != null && !comparison2.isEmpty();
			case GraphstructurePackage.PROPERTY__PROPERTY_OPTION:
				return propertyOption != null;
			case GraphstructurePackage.PROPERTY__ELEMENT:
				return getElement() != null;
			case GraphstructurePackage.PROPERTY__ATTRIBUTE_NAME:
				return attributeName != null;
			case GraphstructurePackage.PROPERTY__MATCH:
				return match != null && !match.isEmpty();
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
			case GraphstructurePackage.PROPERTY___CREATE_INPUTS:
				createInputs();
				return null;
			case GraphstructurePackage.PROPERTY___REMOVE_INPUTS_FROM_VARIABLE_LIST:
				removeInputsFromVariableList();
				return null;
			case GraphstructurePackage.PROPERTY___GET_RETURN_TYPE:
				return getReturnType();
			case GraphstructurePackage.PROPERTY___IS_TRANSLATABLE:
				try {
					return isTranslatable();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.PROPERTY___GET_ALL_ARGUMENT_ELEMENTS:
				try {
					return getAllArgumentElements();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}
	
	@Override
	public String myToString() {
		String res = getPropertyOption().getValue().getLiteral();
		if (res == PropertyLocation.ATTRIBUTE.getLiteral()) res += " (" + getAttributeName().getValue() + ")";
		res += " (" + getShortPatternInternalId() + ")";		
		return res;
	}

} // PropertyImpl
