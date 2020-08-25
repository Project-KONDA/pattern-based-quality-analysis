/**
 */
package qualitypatternmodel.adaptionxml.impl;

import static qualitypatternmodel.utilityclasses.Constants.EVERY;
import static qualitypatternmodel.utilityclasses.Constants.FOR;
import static qualitypatternmodel.utilityclasses.Constants.IN;
import static qualitypatternmodel.utilityclasses.Constants.SATISFIES;
import static qualitypatternmodel.utilityclasses.Constants.SOME;
import static qualitypatternmodel.utilityclasses.Constants.VARIABLE;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.impl.ElementImpl;
import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.operators.OperatorList;
import qualitypatternmodel.operators.impl.ComparisonImpl;
import qualitypatternmodel.operators.impl.MatchImpl;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.parameters.impl.UntypedParameterValueImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XmlElementImpl extends ElementImpl implements XmlElement {
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
		
//		if(!isRootElement()) {
//			String xPredicates = translatePredicates(location);
//			if (location == Location.RETURN) {
//				query = FOR + getXQueryVariable() + IN; 			
//				if (mappingFrom == null) {
//					String xPathExpression = translatePathFromPrevious();
//					query += xPathExpression + xPredicates;
//				} else if (!xPredicates.equals("")) {
//					query += getXQueryVariable() + xPredicates;
//				} else {
//					query = "";
//				}
//				
//			} else {
//				if (location == Location.EXISTS) {
//					query += SOME;
//				} else if (location == Location.FORALL) {
//					query += EVERY;
//				} else {
//					throw new InvalidityException("invalid location");
//				}
//				query += getXQueryVariable() + IN;
//				if (mappingFrom == null) {
//					String xPathExpression = translatePathFromPrevious();
//					query += xPathExpression + xPredicates + SATISFIES;
//				} else if (!xPredicates.equals("")) {
//					query += getXQueryVariable() + xPredicates + SATISFIES;
//				} else {
//					query = "";
//				}
//			}
//		}
//		String following = "";
//		for (Element nextElement : getNextElements()) {
//			following += nextElement.generateQuery(location);
//		}
//		if (!isRootElement()) following = following.replace("\n", "\n  ");
					
	}
	
	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {	
		super.isValidLocal(abstractionLevel);
		if(getIncoming() == null) {
			throw new InvalidityException("no incoming relation at XMLElement " + getId());
		}
		boolean hasIncomingXMLNavigation = false;
		for(Relation relation : getIncoming()) {
			if(relation instanceof XmlNavigation) {
				if(hasIncomingXMLNavigation) {
					throw new InvalidityException("too many incoming XMLNavigations at XMLElement " + getId());
				} else {
					hasIncomingXMLNavigation = true;
				}
			}
		}
		if(!hasIncomingXMLNavigation) {
			throw new InvalidityException("no incoming XMLNavigations at XMLElement " + getId());
		}
		
	}
	
//	private String translatePathFromPrevious() throws InvalidityException {
//		if(relationFromPrevious.getOption() != null) {
//			if (getPreviousElement().isRootElement()) {
//				return "/" + relationFromPrevious.getOption().getValue() + "::*";
//			} else {
//				return ((Element) getPreviousElement()).getXQueryVariable() + "/" + relationFromPrevious.getOption().getValue() + "::*";
//			}
//		} else {
//			throw new InvalidityException("relation option null");
//		}
//	}
	
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
		
		for(Property property : getProperties()) {
			if(!property.isOperatorArgument()) {
				xPredicates += "[" + "exists(" + property.generateQuery() + ")" + "]";
			}
		}
		
		// translate XMLReferences:
		for (Relation relation : getIncoming()) {
			if(relation instanceof XmlReference) {
				XmlReference reference = (XmlReference) relation;
				if (reference.isTranslatable()) {
					xPredicates += "[" + relation.generateQuery() + "]";
				}
			}			
		}
		for (Relation relation : getOutgoing()) {
			if(relation instanceof XmlReference) {
				XmlReference reference = (XmlReference) relation;
				if (reference.isTranslatable()) {
					xPredicates += "[" + relation.generateQuery() + "]";
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
	public EList<Comparison> getTagComparisons() {
		EList<Comparison> tagComparisons = new BasicEList<Comparison>();
		for(BooleanOperator predicate : getPredicates()) {
			if(predicate instanceof Comparison) {
				Comparison comparison = (Comparison) predicate;
				if(comparison.isPrimitive() && comparison.getOption() != null && comparison.getOption().getValue() == ComparisonOperator.EQUAL) {
					if(comparison.getArgument1() instanceof XmlProperty) {
						XmlProperty property = (XmlProperty) comparison.getArgument1();
						if(property.getOption().getValue() == PropertyKind.TAG) {
							if(comparison.getArgument2() instanceof TextLiteralParam) {
								tagComparisons.add(comparison);
							}
						}
					}
					if(comparison.getArgument2() instanceof XmlProperty) {
						XmlProperty property = (XmlProperty) comparison.getArgument2();
						if(property.getOption().getValue() == PropertyKind.TAG) {
							if(comparison.getArgument1() instanceof TextLiteralParam) {
								tagComparisons.add(comparison);
							}
						}
					}
				}
			}
		}
		return tagComparisons;
	}

	@Override
	public String getXQueryVariable() {
		return VARIABLE + getOriginalID();
	}
	
	@Override
	public UntypedParameterValue addPrimitiveComparison() {
		try {
			Comparison comparison = new ComparisonImpl();
			CompletePattern completePattern = (CompletePattern) getAncestor(CompletePattern.class);
			ParameterList varlist = completePattern.getParameterList();
			Graph graph = (Graph) getAncestor(Graph.class);
			OperatorList oplist = graph.getOperatorList();
			
			XmlProperty property = new XmlPropertyImpl();			
			getProperties().add(property);
			property.createParameters();
	
			UntypedParameterValue untypedParameterValue = new UntypedParameterValueImpl();
			varlist.add(untypedParameterValue);
	
			oplist.add(comparison);	
			comparison.createParameters();
			comparison.setArgument1(property);
			comparison.setArgument2(untypedParameterValue);						
			
			return untypedParameterValue;
			
		} catch (Exception e) {			
			System.out.println("Adding Condition Failed: " + e.getMessage());		
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public void addPrimitiveComparison(String value) {
		Comparison comparison = new ComparisonImpl();		
		try {			
			CompletePattern completePattern = (CompletePattern) getAncestor(CompletePattern.class);
			ParameterList varlist = completePattern.getParameterList();
			Graph graph = getGraph();
			OperatorList oplist = graph.getOperatorList();
			
			XmlProperty property = new XmlPropertyImpl();
			getProperties().add(property);
			property.createParameters();
			property.getOption().setValue(PropertyKind.TAG);
						
			TextLiteralParamImpl textlit = new TextLiteralParamImpl();
			varlist.add(textlit);
			textlit.setValue(value);
	
			oplist.add(comparison);	
			comparison.createParameters();
			comparison.setArgument1(property);
			comparison.setArgument2(textlit);			
		} catch (Exception e) {
			System.out.println("addPrimitiveComparison failed: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Override
	public void addPrimitiveMatch(String regex) {
		Match match = new MatchImpl();
		try {			
			CompletePattern completePattern = (CompletePattern) getAncestor(CompletePattern.class);
			Graph graph = (Graph) getAncestor(Graph.class);
			OperatorList oplist = graph.getOperatorList();
			
			XmlProperty property = new XmlPropertyImpl();
			getProperties().add(property);
			property.createParameters();	

			oplist.add(match);	
			match.createParameters();
			match.setProperty(property);
	
			if(regex != null) {
				match.getRegularExpression().setValue(regex);
			}
		} catch (Exception e) {
			System.out.println("addPrimitiveMatch failed: " + e.getMessage());
		}
	}
	
	@Override
	public Property addNewProperty() {
		XmlProperty prop = new XmlPropertyImpl();
		getProperties().add(prop);
		prop.createParameters();
		return prop;
	}


	@Override
	public NotificationChain basicSetGraph(Graph newGraph, NotificationChain msgs) {
//		if(newGraph != null) {
////			prepareParameterUpdates(newGraph.getParameterList());
//			updateOperators(newGraph.getOperatorList());
//		}
		NotificationChain res = super.basicSetGraph(newGraph, msgs);
		return res;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AdaptionxmlPackage.XML_ELEMENT___GET_XQUERY_REPRESENTATION:
				try {
					return getXQueryRepresentation();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionxmlPackage.XML_ELEMENT___GET_XQUERY_VARIABLE:
				return getXQueryVariable();
			case AdaptionxmlPackage.XML_ELEMENT___TRANSLATE_PREDICATES:
				try {
					return translatePredicates();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionxmlPackage.XML_ELEMENT___GET_TAG_COMPARISONS:
				return getTagComparisons();
		}
		return super.eInvoke(operationID, arguments);
	}

} //XMLElementImpl
