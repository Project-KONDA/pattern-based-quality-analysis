/**
 */
package qualitypatternmodel.adaptionxml.impl;

import static qualitypatternmodel.utility.Constants.VARIABLE;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
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
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlElementImpl#isXQueryDeepEqual <em>XQuery Deep Equal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XmlElementImpl extends ComplexNodeImpl implements XmlElement {
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
	public String generateQuery() throws InvalidityException {
		translated = true;
		String query = "";
		for(Relation relation : getOutgoing()) {
			if(relation instanceof XmlNavigation) {
				query += relation.generateQuery();
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
		
		
		if ( getIncoming() == null && abstractionLevel.getValue() > AbstractionLevel.SEMI_ABSTRACT_VALUE ) {
			throw new InvalidityException("no incoming relation at XMLElement " + getId());
		}
		boolean hasIncomingXMLNavigation = false;
		for(Relation relation : getIncoming()) {
			if(relation instanceof XmlElementNavigation) {
				if(hasIncomingXMLNavigation) {
					throw new InvalidityException("too many incoming XMLNavigations at XMLElement " + getId());
				} else {
					hasIncomingXMLNavigation = true;
				}
			}
		}
		if ( !hasIncomingXMLNavigation  && abstractionLevel.getValue() > AbstractionLevel.SEMI_ABSTRACT_VALUE ) {
			throw new InvalidityException("no incoming XMLNavigations at XMLElement " + getId());
		}
		
	}
	
	@Override
	public String translatePredicates() throws InvalidityException {
		String xPredicates = "";
		predicatesAreBeingTranslated = true;
		
		for (BooleanOperator predicate : predicates) {
			if (predicate.isTranslatable()) {
				xPredicates += "[" + predicate.generateQuery() + "]";
			}
		}
				
		for(Relation r : getIncoming()) {
			if(r.isTranslated()) {
				if(r instanceof XmlNavigation) {
					XmlNavigation nav = (XmlNavigation) r;
					// TODO: check for cycles with only deep-equals (also in isValid())
					if(xQueryDeepEqual) {
						xPredicates += "[deep-equal(.," + nav.getXQueryRepresentation() + ")]";
					} else {
						xPredicates += "[. is " + nav.getXQueryRepresentation() + "]";
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
	 * @throws InvalidityException 
	 * @generated NOT
	 */
	@Override
	public String getXQueryVariable() throws InvalidityException {
		for(Relation r : getIncoming()) {
			if(r.isTranslated() && r instanceof XmlNavigation) {
				XmlNavigation nav = (XmlNavigation) r;
				return nav.getXQueryVariable();
			}
		}
		throw new InvalidityException("XmlElement does not have XQuery variable");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getXQueryRepresentation() throws InvalidityException {
		if (predicatesAreBeingTranslated) {
			return ".";
		} else {
			if (translated) {
				return getXQueryVariable();
			} else {
				throw new InvalidityException("XmlNavigation not yet translated");
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
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
			case AdaptionxmlPackage.XML_ELEMENT__XQUERY_DEEP_EQUAL:
				return xQueryDeepEqual != XQUERY_DEEP_EQUAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public PatternElement createXMLAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
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
				if(nav.getPathParam() != null && nav.getPathParam().getPropertyOptionParam() != null 
						&& nav.getPathParam().getPropertyOptionParam().getValue() == PropertyKind.TAG) {
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
	
	public ComplexNode makeComplex() throws InvalidityException{
		throw new InvalidityException("This node can not become generic!");
	}
	
	@Override
	public ComplexNode makeComplexRecursive() throws InvalidityException{
		throw new InvalidityException("This node can not become generic!");
	}
	
	@Override
	public void checkComplex() throws InvalidityException{
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
			case AdaptionxmlPackage.XML_ELEMENT___GET_XQUERY_VARIABLE:
				try {
					return getXQueryVariable();
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
		result.append(" (xQueryDeepEqual: ");
		result.append(xQueryDeepEqual);
		result.append(')');
		return result.toString();
	}

} //XMLElementImpl
