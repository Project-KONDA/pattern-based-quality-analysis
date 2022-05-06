/**
 */
package qualitypatternmodel.adaptionxml.impl;

import static qualitypatternmodel.utility.Constants.VARIABLE;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
import qualitypatternmodel.adaptionxml.XmlTranslatableNode;
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
 *
 * @generated
 */
public class XmlElementImpl extends ComplexNodeImpl implements XmlElement {
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
	public String getXQueryRepresentation() throws InvalidityException {
		if (predicatesAreBeingTranslated) {
			return ".";
		} else {
			if (translated) {
				return getXQueryVariable();
			} else {
				throw new InvalidityException("element not yet translated");
			}
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
		
		// TODO: translate multiple incoming relations into predicate(s)
		
//		for(PrimitiveNode primitiveNode : getProperties()) {
//			if(!primitiveNode.isOperatorArgument()) {
//				xPredicates += "[" + "exists(" + primitiveNode.generateQuery() + ")" + "]";
//			}
//		}
		
		// translate XMLReferences:
//		for (Relation relation : getIncoming()) {
//			if(relation instanceof XmlReference) {
//				XmlReference reference = (XmlReference) relation;
//				if (reference.isTranslatable()) {
//					xPredicates += "[" + relation.generateQuery() + "]";
//				}
//			}			
//		}
//		for (Relation relation : getOutgoing()) {
//			if(relation instanceof XmlReference) {
//				XmlReference reference = (XmlReference) relation;
//				if (reference.isTranslatable()) {
//					xPredicates += "[" + relation.generateQuery() + "]";
//				}
//			}			
//		}
		
		predicatesAreBeingTranslated = false;
		return xPredicates;
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
	public String getXQueryVariable() {
		return VARIABLE + getOriginalID();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == XmlTranslatableNode.class) {
			switch (baseOperationID) {
				case AdaptionxmlPackage.XML_TRANSLATABLE_NODE___GET_XQUERY_REPRESENTATION: return AdaptionxmlPackage.XML_ELEMENT___GET_XQUERY_REPRESENTATION;
				case AdaptionxmlPackage.XML_TRANSLATABLE_NODE___TRANSLATE_PREDICATES: return AdaptionxmlPackage.XML_ELEMENT___TRANSLATE_PREDICATES;
				case AdaptionxmlPackage.XML_TRANSLATABLE_NODE___GET_XQUERY_VARIABLE: return AdaptionxmlPackage.XML_ELEMENT___GET_XQUERY_VARIABLE;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case AdaptionxmlPackage.XML_ELEMENT___GET_XQUERY_REPRESENTATION:
				try {
					return getXQueryRepresentation();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionxmlPackage.XML_ELEMENT___TRANSLATE_PREDICATES:
				try {
					return translatePredicates();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionxmlPackage.XML_ELEMENT___GET_XQUERY_VARIABLE:
				return getXQueryVariable();
		}
		return super.eInvoke(operationID, arguments);
	}

} //XMLElementImpl
