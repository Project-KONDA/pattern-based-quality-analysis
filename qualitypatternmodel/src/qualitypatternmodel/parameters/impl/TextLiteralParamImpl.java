/**
 */
package qualitypatternmodel.parameters.impl;

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
import org.eclipse.emf.ecore.util.InternalEList;
import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.RelationKind;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.execution.Database;
import qualitypatternmodel.execution.XmlDatabase;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.impl.CompletePatternImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.impl.TextLiteralParamImpl#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.TextLiteralParamImpl#getMatches <em>Matches</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.TextLiteralParamImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextLiteralParamImpl extends ParameterValueImpl implements TextLiteralParam {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMatches() <em>Matches</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatches()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> matches;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<XmlProperty> properties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TextLiteralParamImpl() {
		super();
	}
	
	public TextLiteralParamImpl(String value) {
		super();
		this.value = value;
	}
	
	@Override
	public String generateQuery() throws InvalidityException {
		if(inputIsValid()) {
			return "\"" + getValue() + "\"";
		} else {
			throw new InvalidityException("invalid string");
		}
	}

	
	@Override
	public boolean inputIsValid() {
		return getValue() != null;
	}
	
	@Override
	public ReturnType getReturnType() {
		return ReturnType.STRING;
	}
	
	@Override
	public boolean isUsed() {		
		return super.isUsed() || !getMatches().isEmpty() || !getProperties().isEmpty();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.TEXT_LITERAL_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetVariableList(ParameterList newVariableList, NotificationChain msgs) {
		getMatches().clear();
		getProperties().clear();
		return super.basicSetParameterList(newVariableList, msgs);
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.TEXT_LITERAL_PARAM__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Match> getMatches() {
		if (matches == null) {
			matches = new EObjectWithInverseResolvingEList<Match>(Match.class, this, ParametersPackage.TEXT_LITERAL_PARAM__MATCHES, OperatorsPackage.MATCH__REGULAR_EXPRESSION);
		}
		return matches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XmlProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectWithInverseResolvingEList<XmlProperty>(XmlProperty.class, this, ParametersPackage.TEXT_LITERAL_PARAM__PROPERTIES, AdaptionxmlPackage.XML_PROPERTY__ATTRIBUTE_NAME);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<XmlElement> getTagComparisonElements() {
		EList<XmlElement> tagComparisonElements = new BasicEList<XmlElement>();
		EList<Comparison> comparisons = new BasicEList<Comparison>();
		comparisons.addAll(getComparison1());
		comparisons.addAll(getComparison2());
		for(Comparison comparison : comparisons) {
			if(comparison.getOption() != null && comparison.getOption().getValue() == ComparisonOperator.EQUAL && comparison.isPrimitive()) {
				boolean isTagProperty = false;
				if(comparison.getArgument1() instanceof XmlProperty) {
					XmlProperty property = (XmlProperty) comparison.getArgument1();
					if(property.getOption().getValue() == PropertyKind.TAG) {
						isTagProperty = true;
					}
				}
				if(comparison.getArgument2() instanceof XmlProperty) {
					XmlProperty property = (XmlProperty) comparison.getArgument2();
					if(property.getOption().getValue() == PropertyKind.TAG) {
						isTagProperty = true;
					}
				}
				if(isTagProperty && comparison.getElements().size() == 1 && comparison.getElements().get(0) instanceof XmlElement) {
					tagComparisonElements.add((XmlElement) comparison.getElements().get(0));
				}
			}
		}
		return tagComparisonElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<String> generateSuggestions() {
		EList<String> suggestions = new BasicEList<String>();
		for(XmlElement element : getTagComparisonElements()) {
			for(Relation incomingRelation : element.getIncoming()) {
				if(incomingRelation instanceof XmlNavigation) {
					XmlNavigation incomingNavigation = (XmlNavigation) incomingRelation;					
					if(incomingNavigation.getOption() != null && incomingNavigation.getSource() instanceof XmlElement) {
						XmlElement source = (XmlElement) incomingNavigation.getSource();
						for(Comparison tagComparison : source.getTagComparisons()) {
							if(tagComparison.getArgument1() instanceof TextLiteralParam){
								TextLiteralParam text = (TextLiteralParam) tagComparison.getArgument1();
								if(text.getValue() != null) {
									String tag = text.getValue();
									
									Database db;
									try {
										db = ((CompletePattern) getAncestor(CompletePatternImpl.class)).getDatabase();
										if(db instanceof XmlDatabase) {
											XmlDatabase xmlDatabase = (XmlDatabase) db;
											
											
											if(incomingNavigation.getOption().getValue() == RelationKind.CHILD) {
												// TODO: suggest all get children
											}
											
											// TODO: other axes
											
										}
									} catch (MissingPatternContainerException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									
									
									
								}
								
							}
						}
					}
					
				}
			}
		}
		return suggestions;
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
			case ParametersPackage.TEXT_LITERAL_PARAM__MATCHES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMatches()).basicAdd(otherEnd, msgs);
			case ParametersPackage.TEXT_LITERAL_PARAM__PROPERTIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProperties()).basicAdd(otherEnd, msgs);
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
			case ParametersPackage.TEXT_LITERAL_PARAM__MATCHES:
				return ((InternalEList<?>)getMatches()).basicRemove(otherEnd, msgs);
			case ParametersPackage.TEXT_LITERAL_PARAM__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case ParametersPackage.TEXT_LITERAL_PARAM__VALUE:
				return getValue();
			case ParametersPackage.TEXT_LITERAL_PARAM__MATCHES:
				return getMatches();
			case ParametersPackage.TEXT_LITERAL_PARAM__PROPERTIES:
				return getProperties();
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
			case ParametersPackage.TEXT_LITERAL_PARAM__VALUE:
				setValue((String)newValue);
				return;
			case ParametersPackage.TEXT_LITERAL_PARAM__MATCHES:
				getMatches().clear();
				getMatches().addAll((Collection<? extends Match>)newValue);
				return;
			case ParametersPackage.TEXT_LITERAL_PARAM__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends XmlProperty>)newValue);
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
			case ParametersPackage.TEXT_LITERAL_PARAM__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ParametersPackage.TEXT_LITERAL_PARAM__MATCHES:
				getMatches().clear();
				return;
			case ParametersPackage.TEXT_LITERAL_PARAM__PROPERTIES:
				getProperties().clear();
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
			case ParametersPackage.TEXT_LITERAL_PARAM__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case ParametersPackage.TEXT_LITERAL_PARAM__MATCHES:
				return matches != null && !matches.isEmpty();
			case ParametersPackage.TEXT_LITERAL_PARAM__PROPERTIES:
				return properties != null && !properties.isEmpty();
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
			case ParametersPackage.TEXT_LITERAL_PARAM___GET_TAG_COMPARISON_ELEMENTS:
				return getTagComparisonElements();
			case ParametersPackage.TEXT_LITERAL_PARAM___GENERATE_SUGGESTIONS:
				return generateSuggestions();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}
	
	@Override 
	public String myToString() {
		
		return "text [" + getInternalId() + "] '" + getValue() + "'";
	}
	
	@Override
	public String generateDescription() {
		String res = "Textfeld";
		return res;
//		try {} catch (Exception e) {}
//		setDescription(res);
	}

} //TextLiteralImpl
