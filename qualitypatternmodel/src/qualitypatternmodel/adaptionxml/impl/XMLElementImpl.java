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
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.XMLElement;
import qualitypatternmodel.adaptionxml.XMLNavigation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.impl.ElementImpl;
import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.patternstructure.Location;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XMLElementImpl extends ElementImpl implements XMLElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLElementImpl() {
		super();
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
	public String generateQuery(Location location) throws InvalidityException {
		String query = "";
		translated = true;
		
		if(!isRootElement()) {
			String xPredicates = translatePredicates(location);
			if (location == Location.RETURN) {
				query = FOR + getXQueryVariable() + IN; 			
				if (mappingFrom == null) {
					String xPathExpression = translatePathFromPrevious();
					query += xPathExpression + xPredicates;
				} else if (!xPredicates.equals("")) {
					query += getXQueryVariable() + xPredicates;
				} else {
					query = "";
				}
				
			} else {
				if (location == Location.EXISTS) {
					query += SOME;
				} else if (location == Location.FORALL) {
					query += EVERY;
				} else {
					throw new InvalidityException("invalid location");
				}
				query += getXQueryVariable() + IN;
				if (mappingFrom == null) {
					String xPathExpression = translatePathFromPrevious();
					query += xPathExpression + xPredicates + SATISFIES;
				} else if (!xPredicates.equals("")) {
					query += getXQueryVariable() + xPredicates + SATISFIES;
				} else {
					query = "";
				}
			}
		}
		String following = "";
		for (Element nextElement : getNextElements()) {
			following += nextElement.generateQuery(location);
		}
//		if (!isRootElement()) following = following.replace("\n", "\n  ");
			
		return query + following;			
		
	}
	
	@Override
	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {	
		super.isValidLocal(isDefinedPattern);
		if(getIncoming() == null) {
			throw new InvalidityException("no incoming relation at XMLElement " + getId());
		}
		boolean hasIncomingXMLNavigation = false;
		for(Relation relation : getIncoming()) {
			if(relation instanceof XMLNavigation) {
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
	
	private String translatePathFromPrevious() throws InvalidityException {
		if(relationFromPrevious.getOption() != null) {
			if (getPreviousElement().isRootElement()) {
				return "/" + relationFromPrevious.getOption().getValue() + "::*";
			} else {
				return ((Element) getPreviousElement()).getXQueryVariable() + "/" + relationFromPrevious.getOption().getValue() + "::*";
			}
		} else {
			throw new InvalidityException("relation option null");
		}
	}
	
	@Override
	public String getXQueryRepresentation(Location location) throws InvalidityException {
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
	
	private String translatePredicates(Location location) throws InvalidityException {
		String xPredicates = "";
		predicatesAreBeingTranslated = true;
		for (BooleanOperator predicate : predicates) {
			if (predicate.isTranslatable()) {
				xPredicates += "[" + predicate.generateQuery(location) + "]";
			}
		}
		predicatesAreBeingTranslated = false;
		return xPredicates;
	}

	
	@Override
	public String getXQueryVariable() {
		return VARIABLE + getOriginalID();
	}

	@Override
	public NotificationChain basicSetGraph(Graph newGraph, NotificationChain msgs) {
		if(newGraph != null) {
			updateParameters(newGraph.getParameterList());
			updateOperators(newGraph.getOperatorList());
		}
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
			case AdaptionxmlPackage.XML_ELEMENT___GET_XQUERY_REPRESENTATION__LOCATION:
				try {
					return getXQueryRepresentation((Location)arguments.get(0));
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
