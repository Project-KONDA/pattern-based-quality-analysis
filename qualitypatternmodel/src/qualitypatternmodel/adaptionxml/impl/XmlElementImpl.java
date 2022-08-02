/**
 */
package qualitypatternmodel.adaptionxml.impl;

import static qualitypatternmodel.utility.Constants.VARIABLE;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlNode;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.impl.ComplexNodeImpl;
import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlElementImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlElementImpl#isXQueryDeepEqual <em>XQuery Deep Equal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XmlElementImpl extends ComplexNodeImpl implements XmlElement {
	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<String> variables;
	/**
	 * The default value of the '{@link #isXQueryDeepEqual() <em>XQuery Deep Equal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isXQueryDeepEqual()
	 * @generated
	 * @ordered
	 */
	protected static final boolean XQUERY_DEEP_EQUAL_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isXQueryDeepEqual() <em>XQuery Deep Equal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isXQueryDeepEqual()
	 * @generated
	 * @ordered
	 */
	protected boolean xQueryDeepEqual = XQUERY_DEEP_EQUAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public XmlElementImpl() {
		super();
	}
	
	@Override
	public String getName() {
		if(name == null || name.equals("")) {
			if(getOriginalID() > -1) {
				name = "XmlElement " + getOriginalID();
				return name;
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionxmlPackage.Literals.XML_ELEMENT;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getVariables() {
		if (variables == null) {
			variables = new EDataTypeUniqueEList<String>(String.class, this, AdaptionxmlPackage.XML_ELEMENT__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isXQueryDeepEqual() {
		return xQueryDeepEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXQueryDeepEqual(boolean newXQueryDeepEqual) {
		boolean oldXQueryDeepEqual = xQueryDeepEqual;
		xQueryDeepEqual = newXQueryDeepEqual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_ELEMENT__XQUERY_DEEP_EQUAL, oldXQueryDeepEqual, xQueryDeepEqual));
	}

	@Override
	public String generateXQuery() throws InvalidityException {
		translated = true;
		String query = "";
		if(getVariables().isEmpty()) {
			throw new InvalidityException("XmlElement without variables cannot be translated");
		}
		if(xQueryDeepEqual || getVariables().size() == 1) {
			for(Relation relation : getOutgoing()) {
				if(relation instanceof XmlPropertyNavigation) {
					XmlPropertyNavigation nav = (XmlPropertyNavigation) relation;
					boolean hasAxis = !nav.getXmlPathParam().getXmlAxisPairs().isEmpty();
					boolean isNew = getIncomingMapping() != null && nav.getTarget().getIncomingMapping() == null;
					if (hasAxis || isNew) {
						nav.setSourceVariable(getVariables().get(getVariables().size()-1));
						query += relation.generateXQuery();
					}
				}
				if(relation instanceof XmlElementNavigation) {
					XmlElementNavigation nav = (XmlElementNavigation) relation;
					nav.setSourceVariable(getVariables().get(getVariables().size()-1));
					query += relation.generateXQuery();
				}
			}		
		}
		return query;					
	}

	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (abstractionLevel.getValue() < AbstractionLevel.SEMI_ABSTRACT_VALUE)
			throw new InvalidityException("non-generic class in generic pattern");
		super.isValid(abstractionLevel);
	}
	
	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {	
		super.isValidLocal(abstractionLevel);
		
		validateCycles();
		
		
		if ( getIncoming() == null && abstractionLevel.getValue() > AbstractionLevel.SEMI_ABSTRACT_VALUE ) {
			throw new InvalidityException("no incoming relation at XMLElement " + getId());
		}
		boolean hasIncomingXMLNavigation = false;
		for(Relation relation : getIncoming()) {
			if(relation instanceof XmlElementNavigation) {
				hasIncomingXMLNavigation = true;
				break;
			}
		}
		if ( !hasIncomingXMLNavigation  && abstractionLevel.getValue() > AbstractionLevel.SEMI_ABSTRACT_VALUE ) {
			throw new InvalidityException("no incoming XMLNavigations at XMLElement " + getId());
		}
		
	}
	
	private void validateCycles() throws InvalidityException {
		EList<EList<XmlElementImpl>> cycles = findCycles(new BasicEList<XmlElementImpl>());
		for(EList<XmlElementImpl> cycle : cycles) {
			boolean deepEqualFalse = false;
			for(XmlElementImpl node : cycle) {
				deepEqualFalse = deepEqualFalse || !node.isXQueryDeepEqual();
			}
			if(!deepEqualFalse) {
				throw new InvalidityException("Cycle must contain at least one XmlElement with xQueryDeepEqual false");
			}
		}		
	}

	private EList<EList<XmlElementImpl>> findCycles(EList<XmlElementImpl> path){
		EList<EList<XmlElementImpl>> cycles = new BasicEList<EList<XmlElementImpl>>();
		if(!path.isEmpty() && path.get(0).equals(this)) {
			cycles.add(path);
		} else if(!path.contains(this)) {
			for(Relation r : getOutgoing()) {			
				if(r.getTarget() instanceof XmlElementImpl) {
					XmlElementImpl target = (XmlElementImpl) r.getTarget();					
					EList<XmlElementImpl> nextPath = new BasicEList<XmlElementImpl>();
					nextPath.addAll(path);
					nextPath.add(this);
					cycles.addAll(target.findCycles(nextPath));
				}
			}
		}		
		return cycles;
	}

	
	@Override
	public boolean isTranslatable() {
		return translated;
	}
	
	@Override
	public String translatePredicates() throws InvalidityException {
		String xPredicates = "";
		predicatesAreBeingTranslated = true;
		
		for (BooleanOperator predicate : predicates) {
			if (predicate.isTranslatable()) {
				xPredicates += "[" + predicate.generateXQuery() + "]";
			}
		}
		
		if(xQueryDeepEqual || getVariables().size() == 1) {
			for(Relation relation : getOutgoing()) {
				if(relation instanceof XmlPropertyNavigation) {
					XmlPropertyNavigation nav = (XmlPropertyNavigation) relation;
					boolean hasAxis = !nav.getXmlPathParam().getXmlAxisPairs().isEmpty();
					boolean isNew = getIncomingMapping() != null && nav.getTarget().getIncomingMapping() == null;
					if (!hasAxis && !isNew) {
//						nav.setSourceVariable(getVariables().get(getVariables().size()-1));
						xPredicates += relation.generateXQuery();
					}
				}
			}
		}
		
		predicatesAreBeingTranslated = false;
		return xPredicates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String translateMultipleIncoming() {
		String xPredicates = "";
		if(xQueryDeepEqual) {
			for (int i = 0; i < getVariables().size()-1; i++) {
				xPredicates += "[deep-equal(.," + getVariables().get(i) + ")]"; 
			}
		} else {
			for (int i = 0; i < getVariables().size()-1; i++) {
				xPredicates += "[. is " + getVariables().get(i) + "]";
			}			
		}
		return xPredicates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<String> getXQueryRepresentation() throws InvalidityException {
		if (predicatesAreBeingTranslated) {
			BasicEList<String> list = new BasicEList<String>();
			list.add(".");
			return list;
		} else {
			if (translated) {
				return getVariables();
			} else {
				throw new InvalidityException("XmlElement not yet translated");
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptionxmlPackage.XML_ELEMENT__VARIABLES:
				return getVariables();
			case AdaptionxmlPackage.XML_ELEMENT__XQUERY_DEEP_EQUAL:
				return isXQueryDeepEqual();
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
			case AdaptionxmlPackage.XML_ELEMENT__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends String>)newValue);
				return;
			case AdaptionxmlPackage.XML_ELEMENT__XQUERY_DEEP_EQUAL:
				setXQueryDeepEqual((Boolean)newValue);
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
			case AdaptionxmlPackage.XML_ELEMENT__VARIABLES:
				getVariables().clear();
				return;
			case AdaptionxmlPackage.XML_ELEMENT__XQUERY_DEEP_EQUAL:
				setXQueryDeepEqual(XQUERY_DEEP_EQUAL_EDEFAULT);
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
			case AdaptionxmlPackage.XML_ELEMENT__VARIABLES:
				return variables != null && !variables.isEmpty();
			case AdaptionxmlPackage.XML_ELEMENT__XQUERY_DEEP_EQUAL:
				return xQueryDeepEqual != XQUERY_DEEP_EQUAL_EDEFAULT;
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
		if (baseClass == XmlNode.class) {
			switch (derivedFeatureID) {
				case AdaptionxmlPackage.XML_ELEMENT__VARIABLES: return AdaptionxmlPackage.XML_NODE__VARIABLES;
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
		if (baseClass == XmlNode.class) {
			switch (baseFeatureID) {
				case AdaptionxmlPackage.XML_NODE__VARIABLES: return AdaptionxmlPackage.XML_ELEMENT__VARIABLES;
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
		if (baseClass == XmlNode.class) {
			switch (baseOperationID) {
				case AdaptionxmlPackage.XML_NODE___TRANSLATE_PREDICATES: return AdaptionxmlPackage.XML_ELEMENT___TRANSLATE_PREDICATES;
				case AdaptionxmlPackage.XML_NODE___GET_XQUERY_REPRESENTATION: return AdaptionxmlPackage.XML_ELEMENT___GET_XQUERY_REPRESENTATION;
				case AdaptionxmlPackage.XML_NODE___TRANSLATE_MULTIPLE_INCOMING: return AdaptionxmlPackage.XML_ELEMENT___TRANSLATE_MULTIPLE_INCOMING;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	@Override
	public PatternElement createXmlAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return this;
	}
	
	@Override
	public XmlElement adaptAsXmlElement() throws InvalidityException {
		return this;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getTagFromComparisons() {
		for(Relation r : getOutgoing()) {
			if(r instanceof XmlPropertyNavigation) {
				XmlPropertyNavigation nav = (XmlPropertyNavigation) r;
				if(nav.getXmlPathParam() != null && nav.getXmlPathParam().getXmlPropertyOptionParam() != null 
						&& nav.getXmlPathParam().getXmlPropertyOptionParam().getValue() == XmlPropertyKind.TAG) {
					Node target = nav.getTarget();
					if(target instanceof XmlProperty) {
						XmlProperty prop = (XmlProperty) target;
						for(BooleanOperator boolOp : prop.getPredicates()){
							if(boolOp instanceof Comparison) {
								Comparison comp = (Comparison) boolOp;
								if(comp.getOption().getValue() == ComparisonOperator.EQUAL) {
									if(comp.getArgument1().equals(prop)) {
										if(comp.getArgument2() instanceof TextLiteralParam) {
											TextLiteralParam text = (TextLiteralParam) comp.getArgument2();
											return text.getValue();
										}
									}
									if(comp.getArgument2().equals(prop)) {
										if(comp.getArgument1() instanceof TextLiteralParam) {
											TextLiteralParam text = (TextLiteralParam) comp.getArgument1();
											return text.getValue();
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	@Override
	public Node makeGeneric() throws InvalidityException{
		throw new InvalidityException("This node can not become generic!");
	}
	
	@Override
	public Node makeGenericRecursive() throws InvalidityException{
		throw new InvalidityException("This node can not become generic!");
	}
	
	@Override
	public void checkGeneric() throws InvalidityException{
		throw new InvalidityException("This node can not become generic!");
	}
	
	@Override
	public PrimitiveNode makePrimitive() throws InvalidityException{
		throw new InvalidityException("This node can not become generic!");
	}
	
	@Override
	public PrimitiveNode makePrimitiveRecursive() throws InvalidityException{
		throw new InvalidityException("This node can not become generic!");
	}
	
	@Override
	public void checkPrimitive() throws InvalidityException{
		throw new InvalidityException("This node can not become generic!");
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AdaptionxmlPackage.XML_ELEMENT___GET_TAG_FROM_COMPARISONS:
				return getTagFromComparisons();
			case AdaptionxmlPackage.XML_ELEMENT___TRANSLATE_PREDICATES:
				try {
					return translatePredicates();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionxmlPackage.XML_ELEMENT___GET_XQUERY_REPRESENTATION:
				try {
					return getXQueryRepresentation();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionxmlPackage.XML_ELEMENT___TRANSLATE_MULTIPLE_INCOMING:
				return translateMultipleIncoming();
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
		result.append(" (variables: ");
		result.append(variables);
		result.append(", xQueryDeepEqual: ");
		result.append(xQueryDeepEqual);
		result.append(')');
		return result.toString();
	}

} //XMLElementImpl
