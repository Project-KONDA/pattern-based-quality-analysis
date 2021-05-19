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
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.RelationKind;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.execution.Database;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.parameters.RelationOptionParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.impl.CompletePatternImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Axis
 * Option</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.impl.RelationOptionParamImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.RelationOptionParamImpl#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.RelationOptionParamImpl#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationOptionParamImpl extends ParameterImpl implements RelationOptionParam {
	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * A subset of all XPath axes to choose from during the concretization.
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationKind> options;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final RelationKind VALUE_EDEFAULT = RelationKind.CHILD;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute. <!--
	 * begin-user-doc -->
	 * The chosen <code>RelationKind</code> (i.e. XPath axis).
	 * <!-- end-user-doc -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected RelationKind value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <code>XmlNavigation</code>s that are specified through <code>this</code>.
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<XmlNavigation> relations;

	/**
	 * <!-- begin-user-doc -->
	 * Constructor.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public RelationOptionParamImpl() {
		super();
		getOptions().addAll(RelationKind.VALUES);
	}
	
	@Override
	public String getValueAsString() {
		return getValue().toString();
	}

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		if (abstractionLevel.getValue() < AbstractionLevel.SEMI_ABSTRACT_VALUE)
			throw new InvalidityException("non-generic class in generic pattern");
		
		if (getOptions() == null)
			throw new InvalidityException("options null");
		if (abstractionLevel != AbstractionLevel.SEMI_GENERIC && getOptions().isEmpty())
			throw new InvalidityException("not enough options");
		super.isValidLocal(abstractionLevel);
	}

	@Override
	public String generateQuery() throws InvalidityException {
		return value.getLiteral();
	}

	@Override
	public boolean inputIsValid() {
		return getValue() != null && options.contains(getValue());
	}
	
	@Override
	public boolean isUsed() {
		return !getRelations().isEmpty();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.RELATION_OPTION_PARAM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public NotificationChain basicSetParameterList(ParameterList newVariableList, NotificationChain msgs) {
		if(newVariableList == null) {
			getRelations().clear();
		}
		return super.basicSetParameterList(newVariableList, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelationKind> getOptions() {
		if (options == null) {
			options = new EDataTypeUniqueEList<RelationKind>(RelationKind.class, this, ParametersPackage.RELATION_OPTION_PARAM__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationKind getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(RelationKind newValue) {
		RelationKind oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.RELATION_OPTION_PARAM__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XmlNavigation> getRelations() {
		if (relations == null) {
			relations = new EObjectWithInverseResolvingEList<XmlNavigation>(XmlNavigation.class, this, ParametersPackage.RELATION_OPTION_PARAM__RELATIONS, AdaptionxmlPackage.XML_NAVIGATION__OPTION);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<RelationKind> inferSuggestions() {
		EList<RelationKind> suggestions = new BasicEList<RelationKind>();		
		for(XmlNavigation xmlNavigation : getRelations()) {
			String sourceTag = getTag(xmlNavigation.getSource());	
			String targetTag = getTag(xmlNavigation.getTarget());
			if(sourceTag != null && targetTag != null) {
				try {
					Database db = ((CompletePattern) getAncestor(CompletePatternImpl.class)).getDatabase();
					if(db instanceof XmlDataDatabase) {
						XmlDataDatabase xmlDataDatabase = (XmlDataDatabase) db;
						
						try {
							
							if(xmlDataDatabase.getXmlSchema().checkChildInSchema(sourceTag, targetTag)) {
								suggestions.add(RelationKind.CHILD);
								suggestions.add(RelationKind.DESCENDANT);
							} else if(xmlDataDatabase.getXmlSchema().checkDescendantInSchema(sourceTag, targetTag)) {
								suggestions.add(RelationKind.DESCENDANT);
							}
							
							if(xmlDataDatabase.getXmlSchema().checkParentInSchema(sourceTag, targetTag)) {
								suggestions.add(RelationKind.PARENT);
								suggestions.add(RelationKind.ANCESTOR);
							} else if(xmlDataDatabase.getXmlSchema().checkAncestorInSchema(sourceTag, targetTag)) {
								suggestions.add(RelationKind.ANCESTOR);
							}
							
							if(xmlDataDatabase.getXmlSchema().checkFollowingSiblingInSchema(sourceTag, targetTag)) {
								suggestions.add(RelationKind.FOLLOWING_SIBLING);
								suggestions.add(RelationKind.FOLLOWING);
							} else if(xmlDataDatabase.getXmlSchema().checkFollowingInSchema(sourceTag, targetTag)) {
								suggestions.add(RelationKind.FOLLOWING);
							}
							
							// TODO:
//							if(xmlDatabase.getXmlSchema().checkPrecedingSiblingInSchema(sourceTag, targetTag)) {
//								suggestions.add(RelationKind.PRECEDING_SIBLING);
//								suggestions.add(RelationKind.PRECEDING);
//							} else if(xmlDatabase.getXmlSchema().checkPrecedingInSchema(sourceTag, targetTag)) {
//								suggestions.add(RelationKind.PRECEDING);
//							}
							
							suggestions.add(RelationKind.SELF);
							suggestions.add(RelationKind.DESCENDANT_OR_SELF);
							suggestions.add(RelationKind.ANCESTOR_OR_SELF);
														
						} catch (BaseXException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (QueryIOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (QueryException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}						
					}
				} catch (MissingPatternContainerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		}		
		return suggestions;
	}

	private String getTag(Element element) {
		if(element instanceof XmlElement) {
			XmlElement xmlElement = (XmlElement) element;
			if(xmlElement.getTagComparisons().size() == 1) {
				Comparison tagComparison = xmlElement.getTagComparisons().get(0);
				if(tagComparison.getArgument1() instanceof TextLiteralParam) {
					TextLiteralParam text = (TextLiteralParam) tagComparison.getArgument1();
					if(text != null && text.getValue() != null && !text.getValue().equals("")) {
						return text.getValue();
					}
				}
				if(tagComparison.getArgument2() instanceof TextLiteralParam) {
					TextLiteralParam text = (TextLiteralParam) tagComparison.getArgument2();
					if(text != null && text.getValue() != null && !text.getValue().equals("")) {
						return text.getValue();
					}
				}
			}				
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParametersPackage.RELATION_OPTION_PARAM__RELATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParametersPackage.RELATION_OPTION_PARAM__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParametersPackage.RELATION_OPTION_PARAM__OPTIONS:
				return getOptions();
			case ParametersPackage.RELATION_OPTION_PARAM__VALUE:
				return getValue();
			case ParametersPackage.RELATION_OPTION_PARAM__RELATIONS:
				return getRelations();
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
			case ParametersPackage.RELATION_OPTION_PARAM__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends RelationKind>)newValue);
				return;
			case ParametersPackage.RELATION_OPTION_PARAM__VALUE:
				setValue((RelationKind)newValue);
				return;
			case ParametersPackage.RELATION_OPTION_PARAM__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends XmlNavigation>)newValue);
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
			case ParametersPackage.RELATION_OPTION_PARAM__OPTIONS:
				getOptions().clear();
				return;
			case ParametersPackage.RELATION_OPTION_PARAM__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ParametersPackage.RELATION_OPTION_PARAM__RELATIONS:
				getRelations().clear();
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
			case ParametersPackage.RELATION_OPTION_PARAM__OPTIONS:
				return options != null && !options.isEmpty();
			case ParametersPackage.RELATION_OPTION_PARAM__VALUE:
				return value != VALUE_EDEFAULT;
			case ParametersPackage.RELATION_OPTION_PARAM__RELATIONS:
				return relations != null && !relations.isEmpty();
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
			case ParametersPackage.RELATION_OPTION_PARAM___INFER_SUGGESTIONS:
				return inferSuggestions();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (options: ");
		result.append(options);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

	@Override
	public String myToString() {
		return "axis [" + getInternalId() + "] " + getValue();
	}

	@Override
	public String generateDescription() {
		String res = "Beziehung: XPath-Achse";
		try {			
			for(Relation relation : getRelations()) {
				Element to = relation.getTarget();
				Element from = relation.getSource();
				res += " zur Navigation von " + from.getName() + " zu " + to.getName();		
			}
					
		} catch (Exception e) {}
		return res;
//		setDescription(res);
	}

} // AxisOptionImpl
