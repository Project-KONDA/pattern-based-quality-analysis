/**
 */
package qualitypatternmodel.adaptionxml.impl;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

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
import org.eclipse.emf.ecore.util.EcoreUtil;
import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.AxisKind;
import qualitypatternmodel.adaptionxml.AxisOptionParam;
import qualitypatternmodel.adaptionxml.AxisPair;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.execution.Database;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.impl.ParameterImpl;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.impl.CompletePatternImpl;
import qualitypatternmodel.textrepresentation.impl.ParameterFragmentImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Axis
 * Option</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.AxisOptionParamImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.AxisOptionParamImpl#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.AxisOptionParamImpl#getAxisPair <em>Axis Pair</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AxisOptionParamImpl extends ParameterImpl implements AxisOptionParam {
	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * A subset of all XPath axes to choose from during the concretization.
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<AxisKind> options;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final AxisKind VALUE_EDEFAULT = AxisKind.CHILD;

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
	protected AxisKind value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * Constructor.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public AxisOptionParamImpl() {
		super();
		getOptions().addAll(AxisKind.VALUES);
	}
	
	@Override
	public EList<Parameter> validateAgainstSchema() {
		EList<Parameter> invalidParams = new BasicEList<Parameter>();
		EList<AxisKind> suggestions = inferSuggestions();		
		if(!suggestions.contains(getValue()) && !suggestions.isEmpty()) {
			invalidParams.add(this);
		}
		return invalidParams;
	}
	
	@Override
	public String getValueAsString() {
		return getValue().getName();
	}
	
	@Override
	public void setValueFromString(String value) throws InvalidityException {
		for(AxisKind kind : AxisKind.values()) {
			if(kind.getName().equals(value)) {			
				setValueIfValid(kind);
			}
		}		
	}
	
	@Override
	public String getOptionsAsStringList() {
		List<String> list = getOptions().stream().map(a -> a.getName()).collect(Collectors.toList());
		return ParameterFragmentImpl.generateJSONList(list);
	}

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		if (abstractionLevel.getValue() < AbstractionLevel.SEMI_ABSTRACT_VALUE)
			throw new InvalidityException("non-generic class in generic pattern");
		
		if (getOptions() == null)
			throw new InvalidityException("options null");
		if (abstractionLevel != AbstractionLevel.SEMI_GENERIC && getOptions().isEmpty())
			throw new InvalidityException("not enough options");
		
		if(getParameterList() != null) {
			throw new InvalidityException("AxisOptionParam contained in ParameterList instead of AxisPair");
		}
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
		
		if (getAxisPair() == null)
			return false;
		else if (getAxisPair().getPathParam() == null) 
			return false;
		else 
			return !(getAxisPair().getPathParam().getXmlNavigation() == null) 
					|| !(getAxisPair().getPathParam().getXmlPropertyNavigation() == null);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionxmlPackage.Literals.AXIS_OPTION_PARAM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public NotificationChain basicSetParameterList(ParameterList newVariableList, NotificationChain msgs) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<AxisKind> getOptions() {
		if (options == null) {
			options = new EDataTypeUniqueEList<AxisKind>(AxisKind.class, this, AdaptionxmlPackage.AXIS_OPTION_PARAM__OPTIONS);
		}
		else if (options.size() > 1){
			EList<AxisKind> options2 = new EDataTypeUniqueEList<AxisKind>(AxisKind.class, this, AdaptionxmlPackage.AXIS_OPTION_PARAM__OPTIONS);
			for (AxisKind cop: options) {
				if (!options2.contains(cop)) {
					options2.add(cop);				
				}
			}
			options = options2;
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AxisKind getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(AxisKind newValue) {
		AxisKind oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.AXIS_OPTION_PARAM__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AxisPair getAxisPair() {
		if (eContainerFeatureID() != AdaptionxmlPackage.AXIS_OPTION_PARAM__AXIS_PAIR) return null;
		return (AxisPair)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxisPair(AxisPair newAxisPair, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAxisPair, AdaptionxmlPackage.AXIS_OPTION_PARAM__AXIS_PAIR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAxisPair(AxisPair newAxisPair) {
		if (newAxisPair != eInternalContainer() || (eContainerFeatureID() != AdaptionxmlPackage.AXIS_OPTION_PARAM__AXIS_PAIR && newAxisPair != null)) {
			if (EcoreUtil.isAncestor(this, newAxisPair))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAxisPair != null)
				msgs = ((InternalEObject)newAxisPair).eInverseAdd(this, AdaptionxmlPackage.AXIS_PAIR__AXIS_OPTION_PARAM, AxisPair.class, msgs);
			msgs = basicSetAxisPair(newAxisPair, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.AXIS_OPTION_PARAM__AXIS_PAIR, newAxisPair, newAxisPair));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<AxisKind> inferSuggestions() {
		EList<AxisKind> suggestions = new BasicEList<AxisKind>();		
		Relation relation = getAxisPair().getPathParam().getRelation();
		String sourceTag = getTag(relation.getSource());	
		String targetTag = getTag(relation.getTarget());
		if(sourceTag != null && targetTag != null) {
			try {
				Database db = ((CompletePattern) getAncestor(CompletePatternImpl.class)).getDatabase();
				if(db instanceof XmlDataDatabase) {
					XmlDataDatabase xmlDataDatabase = (XmlDataDatabase) db;
					
					try {
						
						if(xmlDataDatabase.getXmlSchema().checkChildInSchema(sourceTag, targetTag)) {
							suggestions.add(AxisKind.CHILD);
							suggestions.add(AxisKind.DESCENDANT);
						} else if(xmlDataDatabase.getXmlSchema().checkDescendantInSchema(sourceTag, targetTag)) {
							suggestions.add(AxisKind.DESCENDANT);
						}
						
						if(xmlDataDatabase.getXmlSchema().checkParentInSchema(sourceTag, targetTag)) {
							suggestions.add(AxisKind.PARENT);
							suggestions.add(AxisKind.ANCESTOR);
						} else if(xmlDataDatabase.getXmlSchema().checkAncestorInSchema(sourceTag, targetTag)) {
							suggestions.add(AxisKind.ANCESTOR);
						}
						
						if(xmlDataDatabase.getXmlSchema().checkFollowingSiblingInSchema(sourceTag, targetTag)) {
							suggestions.add(AxisKind.FOLLOWING_SIBLING);
							suggestions.add(AxisKind.FOLLOWING);
						} else if(xmlDataDatabase.getXmlSchema().checkFollowingInSchema(sourceTag, targetTag)) {
							suggestions.add(AxisKind.FOLLOWING);
						}
						
						// TODO:
//							if(xmlDatabase.getXmlSchema().checkPrecedingSiblingInSchema(sourceTag, targetTag)) {
//								suggestions.add(RelationKind.PRECEDING_SIBLING);
//								suggestions.add(RelationKind.PRECEDING);
//							} else if(xmlDatabase.getXmlSchema().checkPrecedingInSchema(sourceTag, targetTag)) {
//								suggestions.add(RelationKind.PRECEDING);
//							}
						
						suggestions.add(AxisKind.SELF);
						suggestions.add(AxisKind.DESCENDANT_OR_SELF);
						suggestions.add(AxisKind.ANCESTOR_OR_SELF);
													
					} catch (BaseXException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (QueryIOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (QueryException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}						
				}
			} catch (MissingPatternContainerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
		return suggestions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated Not
	 */
	@Override
	public void setValueIfValid(AxisKind newValue) throws InvalidityException {
		if(newValue == AxisKind.SELF) {
			AxisKind oldValue = getValue();
			setValue(newValue);		
			try {
				checkComparisonConsistency();
			} catch (Exception e) {
				setValue(oldValue);
				throw e;
			}
		} else {
			setValue(newValue);
		}
	}
	
	@Override
	public void checkComparisonConsistency() throws InvalidityException {
		Relation relation = getAxisPair().getPathParam().getRelation();
		Node target = relation.getTarget();
		if(target instanceof PrimitiveNode){
			((PrimitiveNode) target).checkComparisonConsistency();	
		}
	}

	private String getTag(Node node) {
		if(node instanceof XmlElement) {
			XmlElement xmlElement = (XmlElement) node;
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionxmlPackage.AXIS_OPTION_PARAM__AXIS_PAIR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAxisPair((AxisPair)otherEnd, msgs);
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
			case AdaptionxmlPackage.AXIS_OPTION_PARAM__AXIS_PAIR:
				return basicSetAxisPair(null, msgs);
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
			case AdaptionxmlPackage.AXIS_OPTION_PARAM__AXIS_PAIR:
				return eInternalContainer().eInverseRemove(this, AdaptionxmlPackage.AXIS_PAIR__AXIS_OPTION_PARAM, AxisPair.class, msgs);
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
			case AdaptionxmlPackage.AXIS_OPTION_PARAM__OPTIONS:
				return getOptions();
			case AdaptionxmlPackage.AXIS_OPTION_PARAM__VALUE:
				return getValue();
			case AdaptionxmlPackage.AXIS_OPTION_PARAM__AXIS_PAIR:
				return getAxisPair();
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
			case AdaptionxmlPackage.AXIS_OPTION_PARAM__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends AxisKind>)newValue);
				return;
			case AdaptionxmlPackage.AXIS_OPTION_PARAM__VALUE:
				setValue((AxisKind)newValue);
				return;
			case AdaptionxmlPackage.AXIS_OPTION_PARAM__AXIS_PAIR:
				setAxisPair((AxisPair)newValue);
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
			case AdaptionxmlPackage.AXIS_OPTION_PARAM__OPTIONS:
				getOptions().clear();
				return;
			case AdaptionxmlPackage.AXIS_OPTION_PARAM__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case AdaptionxmlPackage.AXIS_OPTION_PARAM__AXIS_PAIR:
				setAxisPair((AxisPair)null);
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
			case AdaptionxmlPackage.AXIS_OPTION_PARAM__OPTIONS:
				return options != null && !options.isEmpty();
			case AdaptionxmlPackage.AXIS_OPTION_PARAM__VALUE:
				return value != VALUE_EDEFAULT;
			case AdaptionxmlPackage.AXIS_OPTION_PARAM__AXIS_PAIR:
				return getAxisPair() != null;
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
			case AdaptionxmlPackage.AXIS_OPTION_PARAM___INFER_SUGGESTIONS:
				return inferSuggestions();
			case AdaptionxmlPackage.AXIS_OPTION_PARAM___SET_VALUE_IF_VALID__AXISKIND:
				try {
					setValueIfValid((AxisKind)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
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
			Relation relation = getAxisPair().getPathParam().getRelation();
			Node to = relation.getTarget();
			Node from = relation.getSource();
			res += " zur Navigation von " + from.getName() + " zu " + to.getName();		
		} catch (Exception e) {}
		return res;
//		setDescription(res);
	}

} // AxisOptionImpl
