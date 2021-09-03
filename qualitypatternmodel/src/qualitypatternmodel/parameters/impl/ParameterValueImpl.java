/**
 */
package qualitypatternmodel.parameters.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.basex.core.BaseXException;
import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.RelationKind;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.XmlRoot;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.execution.Database;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.impl.CompletePatternImpl;
import qualitypatternmodel.textrepresentation.ParameterReference;
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.parameters.ParameterValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ParameterValue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.impl.ParameterValueImpl#getComparison1 <em>Comparison1</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.ParameterValueImpl#getComparison2 <em>Comparison2</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.ParameterValueImpl#isTypeModifiable <em>Type Modifiable</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ParameterValueImpl extends ParameterImpl implements ParameterValue {
	/**
	 * The cached value of the '{@link #getComparison1() <em>Comparison1</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * A list of <code>Comparisons</code> that reference <code>this</code> as <code>argument1</code>.
	 * <!-- end-user-doc -->
	 * @see #getComparison1()
	 * @generated
	 * @ordered
	 */
	protected EList<Comparison> comparison1;
	/**
	 * The cached value of the '{@link #getComparison2() <em>Comparison2</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * A list of <code>Comparisons</code> that reference <code>this</code> as <code>argument2</code>.
	 * <!-- end-user-doc -->
	 * @see #getComparison2()
	 * @generated
	 * @ordered
	 */
	protected EList<Comparison> comparison2;


	/**
	 * The default value of the '{@link #isTypeModifiable() <em>Type Modifiable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTypeModifiable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TYPE_MODIFIABLE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isTypeModifiable() <em>Type Modifiable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * True if user is allowed to replace <code>this</code> with another <code>ParameterValue</code>.
	 * <!-- end-user-doc -->
	 * @see #isTypeModifiable()
	 * @generated
	 * @ordered
	 */
	protected boolean typeModifiable = TYPE_MODIFIABLE_EDEFAULT;


	/**
	 * <!-- begin-user-doc -->
	 * Constructor.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.PARAMETER_VALUE;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comparison> getComparison1() {
		if (comparison1 == null) {
			comparison1 = new EObjectWithInverseResolvingEList<Comparison>(Comparison.class, this, ParametersPackage.PARAMETER_VALUE__COMPARISON1, OperatorsPackage.COMPARISON__ARGUMENT1);
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
			comparison2 = new EObjectWithInverseResolvingEList<Comparison>(Comparison.class, this, ParametersPackage.PARAMETER_VALUE__COMPARISON2, OperatorsPackage.COMPARISON__ARGUMENT2);
		}
		return comparison2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTypeModifiable() {
		return typeModifiable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeModifiable(boolean newTypeModifiable) {
		boolean oldTypeModifiable = typeModifiable;
		typeModifiable = newTypeModifiable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.PARAMETER_VALUE__TYPE_MODIFIABLE, oldTypeModifiable, typeModifiable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isInTagComparison() {
		return getPrimitiveComparisonPropertyKinds().contains(PropertyKind.TAG);
	}

	private EList<PropertyKind> getPrimitiveComparisonPropertyKinds() {
		EList<PropertyKind> propertyKinds = new BasicEList<PropertyKind>();
		EList<Comparison> comparisons = new BasicEList<Comparison>();
		comparisons.addAll(getComparison1());
		comparisons.addAll(getComparison2());
		for(Comparison comparison : comparisons) {
			if(comparison.isPrimitive()) {
				if(comparison.getArgument1() instanceof XmlProperty) {
					XmlProperty property = (XmlProperty) comparison.getArgument1();
					if(property.getOption() != null) {
						propertyKinds.add(property.getOption().getValue());				
					}
				}
				if(comparison.getArgument2() instanceof XmlProperty) {
					XmlProperty property = (XmlProperty) comparison.getArgument2();
					if(property.getOption() != null) {
						propertyKinds.add(property.getOption().getValue());
					}
				}				
			}
		}
		return propertyKinds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isInAttributeComparison() {
		return getPrimitiveComparisonPropertyKinds().contains(PropertyKind.ATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isInDataComparison() {
		return getPrimitiveComparisonPropertyKinds().contains(PropertyKind.DATA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType getReturnType() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isTranslatable() {
		return true;
	}
	
	@Override
	public boolean isUsed() {
		return !getComparison1().isEmpty() || !getComparison2().isEmpty();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Element> getAllArgumentElements() {
		return new BasicEList<Element>();
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
			case ParametersPackage.PARAMETER_VALUE__COMPARISON1:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComparison1()).basicAdd(otherEnd, msgs);
			case ParametersPackage.PARAMETER_VALUE__COMPARISON2:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComparison2()).basicAdd(otherEnd, msgs);
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
			case ParametersPackage.PARAMETER_VALUE__COMPARISON1:
				return ((InternalEList<?>)getComparison1()).basicRemove(otherEnd, msgs);
			case ParametersPackage.PARAMETER_VALUE__COMPARISON2:
				return ((InternalEList<?>)getComparison2()).basicRemove(otherEnd, msgs);
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
			case ParametersPackage.PARAMETER_VALUE__COMPARISON1:
				return getComparison1();
			case ParametersPackage.PARAMETER_VALUE__COMPARISON2:
				return getComparison2();
			case ParametersPackage.PARAMETER_VALUE__TYPE_MODIFIABLE:
				return isTypeModifiable();
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
			case ParametersPackage.PARAMETER_VALUE__COMPARISON1:
				getComparison1().clear();
				getComparison1().addAll((Collection<? extends Comparison>)newValue);
				return;
			case ParametersPackage.PARAMETER_VALUE__COMPARISON2:
				getComparison2().clear();
				getComparison2().addAll((Collection<? extends Comparison>)newValue);
				return;
			case ParametersPackage.PARAMETER_VALUE__TYPE_MODIFIABLE:
				setTypeModifiable((Boolean)newValue);
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
			case ParametersPackage.PARAMETER_VALUE__COMPARISON1:
				getComparison1().clear();
				return;
			case ParametersPackage.PARAMETER_VALUE__COMPARISON2:
				getComparison2().clear();
				return;
			case ParametersPackage.PARAMETER_VALUE__TYPE_MODIFIABLE:
				setTypeModifiable(TYPE_MODIFIABLE_EDEFAULT);
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
			case ParametersPackage.PARAMETER_VALUE__COMPARISON1:
				return comparison1 != null && !comparison1.isEmpty();
			case ParametersPackage.PARAMETER_VALUE__COMPARISON2:
				return comparison2 != null && !comparison2.isEmpty();
			case ParametersPackage.PARAMETER_VALUE__TYPE_MODIFIABLE:
				return typeModifiable != TYPE_MODIFIABLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == qualitypatternmodel.graphstructure.Comparable.class) {
			switch (derivedFeatureID) {
				case ParametersPackage.PARAMETER_VALUE__COMPARISON1: return GraphstructurePackage.COMPARABLE__COMPARISON1;
				case ParametersPackage.PARAMETER_VALUE__COMPARISON2: return GraphstructurePackage.COMPARABLE__COMPARISON2;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == qualitypatternmodel.graphstructure.Comparable.class) {
			switch (baseFeatureID) {
				case GraphstructurePackage.COMPARABLE__COMPARISON1: return ParametersPackage.PARAMETER_VALUE__COMPARISON1;
				case GraphstructurePackage.COMPARABLE__COMPARISON2: return ParametersPackage.PARAMETER_VALUE__COMPARISON2;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == qualitypatternmodel.graphstructure.Comparable.class) {
			switch (baseOperationID) {
				case GraphstructurePackage.COMPARABLE___GET_RETURN_TYPE: return ParametersPackage.PARAMETER_VALUE___GET_RETURN_TYPE;
				case GraphstructurePackage.COMPARABLE___IS_TRANSLATABLE: return ParametersPackage.PARAMETER_VALUE___IS_TRANSLATABLE;
				case GraphstructurePackage.COMPARABLE___GET_ALL_ARGUMENT_ELEMENTS: return ParametersPackage.PARAMETER_VALUE___GET_ALL_ARGUMENT_ELEMENTS;
				case GraphstructurePackage.COMPARABLE___VALIDATE__DIAGNOSTICCHAIN_MAP: return ParametersPackage.PARAMETER_VALUE___VALIDATE__DIAGNOSTICCHAIN_MAP;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ParametersPackage.PARAMETER_VALUE___IS_IN_TAG_COMPARISON:
				return isInTagComparison();
			case ParametersPackage.PARAMETER_VALUE___IS_IN_ATTRIBUTE_COMPARISON:
				return isInAttributeComparison();
			case ParametersPackage.PARAMETER_VALUE___IS_IN_DATA_COMPARISON:
				return isInDataComparison();
			case ParametersPackage.PARAMETER_VALUE___GET_TAG_COMPARISON_ELEMENTS:
				return getTagComparisonElements();
			case ParametersPackage.PARAMETER_VALUE___INFER_ELEMENT_TAG_SUGGESTIONS:
				return inferElementTagSuggestions();
			case ParametersPackage.PARAMETER_VALUE___GET_ELEMENT_TAGS:
				return getElementTags();
			case ParametersPackage.PARAMETER_VALUE___GET_ATTRIBUTE_NAMES:
				return getAttributeNames();
			case ParametersPackage.PARAMETER_VALUE___GET_DATA_VALUES:
				return getDataValues();
			case ParametersPackage.PARAMETER_VALUE___GET_ATTRIBUTE_VALUES:
				return getAttributeValues();
			case ParametersPackage.PARAMETER_VALUE___GET_SUGGESTIONS:
				return getSuggestions();
			case ParametersPackage.PARAMETER_VALUE___REPLACE__PARAMETERVALUE:
				replace((ParameterValue)arguments.get(0));
				return null;
			case ParametersPackage.PARAMETER_VALUE___GET_RETURN_TYPE:
				return getReturnType();
			case ParametersPackage.PARAMETER_VALUE___IS_TRANSLATABLE:
				return isTranslatable();
			case ParametersPackage.PARAMETER_VALUE___GET_ALL_ARGUMENT_ELEMENTS:
				return getAllArgumentElements();
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
		result.append(" (typeModifiable: ");
		result.append(typeModifiable);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean inputIsValid() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EMap<String, Integer> getElementTags() {		
		Database db;
		try {
			db = ((CompletePattern) getAncestor(CompletePatternImpl.class)).getDatabase();
			if(db instanceof XmlDataDatabase) {
				XmlDataDatabase xmlDb = (XmlDataDatabase) db;
				return xmlDb.getElementNames();
			}
		} catch (MissingPatternContainerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}	
		return new BasicEMap<String, Integer>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EMap<String, Integer> getAttributeNames() {
		Database db;
		try {
			db = ((CompletePattern) getAncestor(CompletePatternImpl.class)).getDatabase();
			if(db instanceof XmlDataDatabase) {
				XmlDataDatabase xmlDb = (XmlDataDatabase) db;
				return xmlDb.getAttributeNames();
			}
		} catch (MissingPatternContainerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}	
		return new BasicEMap<String, Integer>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EMap<String, Integer> getDataValues() {
		Database db;
		try {
			db = ((CompletePattern) getAncestor(CompletePatternImpl.class)).getDatabase();
			if(db instanceof XmlDataDatabase) {
				XmlDataDatabase xmlDb = (XmlDataDatabase) db;
				return xmlDb.getRecordedDataValues();
			}
		} catch (MissingPatternContainerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}	
		return new BasicEMap<String, Integer>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EMap<String, Integer> getAttributeValues() {
		Database db;
		try {
			db = ((CompletePattern) getAncestor(CompletePatternImpl.class)).getDatabase();
			if(db instanceof XmlDataDatabase) {
				XmlDataDatabase xmlDb = (XmlDataDatabase) db;
				return xmlDb.getRecordedAttributeValues();
			}
		} catch (MissingPatternContainerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}	
		return new BasicEMap<String, Integer>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<String> getSuggestions() {
		EList<String> suggestions = new BasicEList<String>();
		if(isInTagComparison()) {
			suggestions.addAll(Constants.sortByValue(getElementTags()).keySet());
		}	
		if(isInAttributeComparison()) {
			suggestions.addAll(Constants.sortByValue(getAttributeValues()).keySet());
		}		
		if(isInDataComparison()) {
			suggestions.addAll(Constants.sortByValue(getDataValues()).keySet());
		}		
		return suggestions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void replace(ParameterValue concreteValue) {
		
		if(isTypeModifiable()) {		
			
			int index = getParameterList().getParameters().indexOf(this);
			getParameterList().getParameters().set(index, concreteValue);
			
			EList<Comparison> comparison1Copy = new BasicEList<Comparison>();
			comparison1Copy.addAll(getComparison1());
			for(Comparison comparison : comparison1Copy) {
				comparison.setArgument1(concreteValue);
			}
			EList<Comparison> comparison2Copy = new BasicEList<Comparison>();
			comparison2Copy.addAll(getComparison2());
			for(Comparison comparison : comparison2Copy) {
				comparison.setArgument2(concreteValue);	
			}
			
			EList<ParameterReference> fragmentCopy = new BasicEList<ParameterReference>();
			fragmentCopy.addAll(getParameterFragments());
			for(ParameterReference fragment : fragmentCopy) {
				fragment.setParameter(concreteValue);
			}
			
			concreteValue.setTypeModifiable(true);

		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<String> inferElementTagSuggestions() {
		EList<String> suggestions = new BasicEList<String>();
		for(XmlElement element : getTagComparisonElements()) {			
			analyseIncomingRelations(suggestions, element);			
			analyseOutgoingRelations(suggestions, element);			
		}
		return suggestions;
	}
	
	/**
	 * Calculates suggestions for the tag name of <code>element</code> based on
	 * specified outgoing <code>XmlNavigations</code> to <code>XmlElements</code>
	 * with an already specified tag name  via the XML schema of the database associated with the pattern.
	 * 
	 * @param suggestions a list of suggestions to which newly calculated suggestions are appended
	 * @param element the <code>XmlElement</code> for which tag suggestions are calculated
	 */
	private void analyseOutgoingRelations(EList<String> suggestions, XmlElement element) {
		for(Relation outgoingRelation : element.getOutgoing()) {
			if(outgoingRelation instanceof XmlNavigation) {
				XmlNavigation outgoingNavigation = (XmlNavigation) outgoingRelation;					
				if(outgoingNavigation.getOption() != null && outgoingNavigation.getTarget() instanceof XmlElement) {
					XmlElement target = (XmlElement) outgoingNavigation.getTarget();
					for(Comparison tagComparison : target.getTagComparisons()) {
						TextLiteralParam text = null;
						if(tagComparison.getArgument1() instanceof TextLiteralParam){
							text = (TextLiteralParam) tagComparison.getArgument1();								
						}
						if(tagComparison.getArgument2() instanceof TextLiteralParam){
							text = (TextLiteralParam) tagComparison.getArgument2();								
						}
						if(text != null && text.getValue() != null && !text.getValue().equals("")) {
							String tag = text.getValue();										
							Database db;
							try {
								db = ((CompletePattern) getAncestor(CompletePatternImpl.class)).getDatabase();
								if (db instanceof XmlDataDatabase) {
									XmlDataDatabase xmlDataDatabase = (XmlDataDatabase) db;

									if (outgoingNavigation.getOption().getValue() == RelationKind.CHILD) {
										suggestions.addAll(xmlDataDatabase.getXmlSchema().getParentsInSchema(tag));
									}
									if (outgoingNavigation.getOption().getValue() == RelationKind.DESCENDANT) {
										suggestions.addAll(xmlDataDatabase.getXmlSchema().getAncestorsInSchema(tag));
									}

									if (outgoingNavigation.getOption().getValue() == RelationKind.PARENT) {
										suggestions.addAll(xmlDataDatabase.getXmlSchema().getChildrenInSchema(tag));
									}
									if (outgoingNavigation.getOption().getValue() == RelationKind.ANCESTOR) {
										suggestions.addAll(xmlDataDatabase.getXmlSchema().getDescendantsInSchema(tag));
									}

									if (outgoingNavigation.getOption()
											.getValue() == RelationKind.FOLLOWING_SIBLING) {
										suggestions.addAll(xmlDataDatabase.getXmlSchema().getPrecedingSiblingsInSchema(tag));
									}
									if (outgoingNavigation.getOption().getValue() == RelationKind.FOLLOWING) {
										// TODO
									}

									if (outgoingNavigation.getOption().getValue() == RelationKind.PRECEDING) {
										// TODO
									}
									if (outgoingNavigation.getOption()
											.getValue() == RelationKind.PRECEDING_SIBLING) {
										suggestions.addAll(xmlDataDatabase.getXmlSchema().getFollowingSiblingsInSchema(tag));
									}

									if (outgoingNavigation.getOption().getValue() == RelationKind.SELF) {
										suggestions.add(tag);
									}

									if (outgoingNavigation.getOption()
											.getValue() == RelationKind.DESCENDANT_OR_SELF) {
										suggestions.add(tag);
										suggestions.addAll(xmlDataDatabase.getXmlSchema().getAncestorsInSchema(tag));
									}

									if (outgoingNavigation.getOption()
											.getValue() == RelationKind.ANCESTOR_OR_SELF) {
										suggestions.add(tag);
										suggestions.addAll(xmlDataDatabase.getXmlSchema().getDescendantsInSchema(tag));
									}
								}
							} catch (MissingPatternContainerException | BaseXException | QueryIOException
									| QueryException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}								
						}
					}
				}					
			}
		}
	}

	/**
	 * Calculates suggestions for the tag name of <code>element</code> based on
	 * specified incoming <code>XmlNavigations</code> from <code>XmlElements</code>
	 * with an already specified tag name via the XML schema of the database associated with the pattern.
	 * 
	 * @param suggestions a list of suggestions to which newly calculated suggestions are appended
	 * @param element the <code>XmlElement</code> for which tag suggestions are calculated
	 */
	private void analyseIncomingRelations(EList<String> suggestions, XmlElement element) {
		for(Relation incomingRelation : element.getIncoming()) {
			if(incomingRelation instanceof XmlNavigation) {
				XmlNavigation incomingNavigation = (XmlNavigation) incomingRelation;					
				if(incomingNavigation.getOption() != null && incomingNavigation.getSource() instanceof XmlElement) {
					XmlElement source = (XmlElement) incomingNavigation.getSource();
					for(Comparison tagComparison : source.getTagComparisons()) {
						TextLiteralParam text = null;
						if(tagComparison.getArgument1() instanceof TextLiteralParam){
							text = (TextLiteralParam) tagComparison.getArgument1();								
						}
						if(tagComparison.getArgument2() instanceof TextLiteralParam){
							text = (TextLiteralParam) tagComparison.getArgument2();								
						}
						if(text != null && text.getValue() != null && !text.getValue().equals("")) {
							String tag = text.getValue();										
							Database db;
							try {
								db = ((CompletePattern) getAncestor(CompletePatternImpl.class)).getDatabase();
								if (db instanceof XmlDataDatabase) {
									XmlDataDatabase xmlDataDatabase = (XmlDataDatabase) db;

									if (incomingNavigation.getOption().getValue() == RelationKind.CHILD) {
										suggestions.addAll(xmlDataDatabase.getXmlSchema().getChildrenInSchema(tag));
									}
									if (incomingNavigation.getOption().getValue() == RelationKind.DESCENDANT) {
										suggestions.addAll(xmlDataDatabase.getXmlSchema().getDescendantsInSchema(tag));
									}

									if (incomingNavigation.getOption().getValue() == RelationKind.PARENT) {
										suggestions.addAll(xmlDataDatabase.getXmlSchema().getParentsInSchema(tag));
									}
									if (incomingNavigation.getOption().getValue() == RelationKind.ANCESTOR) {
										suggestions.addAll(xmlDataDatabase.getXmlSchema().getAncestorsInSchema(tag));
									}

									if (incomingNavigation.getOption()
											.getValue() == RelationKind.FOLLOWING_SIBLING) {
										suggestions.addAll(xmlDataDatabase.getXmlSchema().getFollowingSiblingsInSchema(tag));
									}
									if (incomingNavigation.getOption().getValue() == RelationKind.FOLLOWING) {
										suggestions.addAll(xmlDataDatabase.getXmlSchema().getFollowingInSchema(tag));
									}

									if (incomingNavigation.getOption().getValue() == RelationKind.PRECEDING) {
										suggestions.addAll(xmlDataDatabase.getXmlSchema().getPrecedingInSchema(tag));
									}
									if (incomingNavigation.getOption()
											.getValue() == RelationKind.PRECEDING_SIBLING) {
										suggestions.addAll(xmlDataDatabase.getXmlSchema().getPrecedingSiblingsInSchema(tag));
									}

									if (incomingNavigation.getOption().getValue() == RelationKind.SELF) {
										suggestions.add(tag);
									}

									if (incomingNavigation.getOption()
											.getValue() == RelationKind.DESCENDANT_OR_SELF) {
										suggestions.add(tag);
										suggestions.addAll(xmlDataDatabase.getXmlSchema().getDescendantsInSchema(tag));
									}

									if (incomingNavigation.getOption()
											.getValue() == RelationKind.ANCESTOR_OR_SELF) {
										suggestions.add(tag);
										suggestions.addAll(xmlDataDatabase.getXmlSchema().getAncestorsInSchema(tag));
									}
								}
							} catch (MissingPatternContainerException | BaseXException | QueryIOException
									| QueryException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}								
						}
					}
				} else if(incomingNavigation.getOption() != null && incomingNavigation.getSource() instanceof XmlRoot) {			
					
					Database db;
					try {
						db = ((CompletePattern) getAncestor(CompletePatternImpl.class)).getDatabase();
						if (db instanceof XmlDataDatabase) {
							XmlDataDatabase xmlDataDatabase = (XmlDataDatabase) db;
							
							for(String rootElementName : xmlDataDatabase.getXmlSchema().getRootElementNames()) {

								if (incomingNavigation.getOption().getValue() == RelationKind.CHILD) {
									suggestions.addAll(xmlDataDatabase.getXmlSchema().getChildrenInSchema(rootElementName));
								}
								if (incomingNavigation.getOption().getValue() == RelationKind.DESCENDANT) {
									suggestions.addAll(xmlDataDatabase.getXmlSchema().getDescendantsInSchema(rootElementName));
								}
							}
						}
					} catch (MissingPatternContainerException | BaseXException | QueryIOException | QueryException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
		}
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

} //XSTypeImpl
