/**
 */
package qualitypatternmodel.graphstructure.impl;

import static qualitypatternmodel.utilityclasses.Constants.*;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.functions.BooleanOperator;
import qualitypatternmodel.functions.Comparison;
import qualitypatternmodel.functions.ComparisonOperator;
import qualitypatternmodel.functions.FunctionsPackage;
import qualitypatternmodel.functions.Match;
import qualitypatternmodel.functions.Operator;
import qualitypatternmodel.functions.OperatorList;
import qualitypatternmodel.functions.impl.ComparisonImpl;
import qualitypatternmodel.functions.impl.MatchImpl;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.ListOfElements;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.PropertyLocation;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.graphstructure.SingleElement;
import qualitypatternmodel.parameters.UnknownParameterValue;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.parameters.impl.UnknownParameterValueImpl;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.RelationMapping;
import qualitypatternmodel.patternstructure.SingleElementMapping;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;
import qualitypatternmodel.patternstructure.impl.RelationMappingImpl;
import qualitypatternmodel.patternstructure.impl.SingleElementMappingImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Single
 * Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SingleElementImpl#getComparison1 <em>Comparison1</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SingleElementImpl#getComparison2 <em>Comparison2</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SingleElementImpl#getMappingTo <em>Mapping To</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SingleElementImpl#getMappingFrom <em>Mapping From</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SingleElementImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SingleElementImpl#getNextSingle <em>Next Single</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SingleElementImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SingleElementImpl#getGraph <em>Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SingleElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SingleElementImpl#isTranslated <em>Translated</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SingleElementImpl#isPredicatesAreBeingTranslated <em>Predicates Are Being Translated</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SingleElementImpl#getRelationFromPrevious <em>Relation From Previous</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SingleElementImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SingleElementImpl#getPredicates <em>Predicates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleElementImpl extends PatternElementImpl implements SingleElement {
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
	 * The cached value of the '{@link #getMappingTo() <em>Mapping To</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMappingTo()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleElementMapping> mappingTo;

	/**
	 * The cached value of the '{@link #getMappingFrom() <em>Mapping From</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMappingFrom()
	 * @generated
	 * @ordered
	 */
	protected SingleElementMapping mappingFrom;

	/**
	 * The cached value of the '{@link #getNextSingle() <em>Next Single</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNextSingle()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleElement> nextSingle;

	/**
	 * The cached value of the '{@link #getGraph() <em>Graph</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getGraph()
	 * @generated
	 * @ordered
	 */
	protected Graph graph;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isTranslated() <em>Translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTranslated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSLATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTranslated() <em>Translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTranslated()
	 * @generated
	 * @ordered
	 */
	protected boolean translated = TRANSLATED_EDEFAULT;

	/**
	 * The default value of the '{@link #isPredicatesAreBeingTranslated() <em>Predicates Are Being Translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPredicatesAreBeingTranslated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PREDICATES_ARE_BEING_TRANSLATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPredicatesAreBeingTranslated() <em>Predicates Are Being Translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPredicatesAreBeingTranslated()
	 * @generated
	 * @ordered
	 */
	protected boolean predicatesAreBeingTranslated = PREDICATES_ARE_BEING_TRANSLATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelationFromPrevious() <em>Relation From Previous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationFromPrevious()
	 * @generated
	 * @ordered
	 */
	protected Relation relationFromPrevious;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached value of the '{@link #getPredicates() <em>Predicates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicates()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanOperator> predicates;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public SingleElementImpl() {
		super();
	}

	@Override
	public String toXQuery(Location location) throws InvalidityException {
		if (isRootElement()) {
			String result = "";
			for (SingleElement nextElement : getNextSingle()) {
				result += nextElement.toXQuery(location);
			}
			return result;
		} else {			
			return toXQueryNoCount(location);			
		}
	}

	@Override
	public String toXQueryNoCount(Location location) throws InvalidityException {
		translated = true;
		
		String xPredicates = translatePredicatesViaBrackets(location);

		String result = "";
		if (location == Location.RETURN) {
			result = FOR + getXQueryVariable() + IN; 			
			if (mappingFrom == null) {
				String xPathExpression = translatePathFromPrevious();
				result += xPathExpression + xPredicates;
			} else if (!getPredicates().isEmpty()) {
				result += getXQueryVariable() + xPredicates;
			} else {
				result = "";
			}
			
		} else {
			if (location == Location.EXISTS) {
				result += SOME;
			} else if (location == Location.FORALL) {
				result += EVERY;
			} else {
				throw new InvalidityException("invalid location");
			}
			result += getXQueryVariable() + IN;
			if (mappingFrom == null) {
				String xPathExpression = translatePathFromPrevious();
				result += xPathExpression + xPredicates + SATISFIES;
			} else if (!getPredicates().isEmpty()) {
				result += getXQueryVariable() + xPredicates + SATISFIES;
			} else {
				result = "";
			}
		}

		for (SingleElement nextElement : getNextSingle()) {
			result += nextElement.toXQuery(location);
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean isRootElement() {
		return getRoot() != null;
	}

//	@Override
//	public String toXQueryCount(Location location) throws InvalidityException {
//		translated = true;
//		
//		String xPredicates = translatePredicatesViaAnd(location);
//
//		String result = "";
//		if (location == Location.RETURN) {
//			String xPathExpression = translatePathFromPrevious();
//			result = FOR + getXQueryVariable() + IN + xPathExpression;
//		} else {
//			if (location == Location.EXISTS) {
//				result += "(" + SOME;
//			} else if (location == Location.FORALL) {
//				result += "(" + EVERY;
//			} else {
//				throw new InvalidityException("invalid location");
//			}
//			result += getXQueryVariable();
//			if (mappingFrom == null) {
//				String xPathExpression = translatePathFromPrevious();
//				result += IN + xPathExpression + SATISFIES;
//			} else if (!getPredicates().isEmpty()) {
//				result += IN + getXQueryVariable() + SATISFIES;
//			} else {
//				result = "";
//			}
//			if (!xPredicates.equals("")) {
//				if (location == Location.EXISTS) {
//					result += xPredicates;
////					if(getNextSingle().size() > 0) {
//					result += AND;
////					}
//				} else {
//					result += NOT + "(" + xPredicates + ")" + OR;
//				}
//			}
//
//		}
//
//		int counter = 0;
//		for (Element nextElement : getNextSingle()) {
//			String nextToXQuery = nextElement.toXQuery(location);
//			result += nextToXQuery;
//			if (location != Location.RETURN && !nextToXQuery.equals("") && counter != getNextSingle().size() - 1) {
//				result += AND;
//			}
//			counter++;
//		}
//
////		if(location != Location.RETURN && getNextSingle().isEmpty()) {
////			result += AND;
////		}
//
//		return result;
//	}

	@Override
	public String translatePathFromPrevious() throws InvalidityException {
		if(relationFromPrevious.getOption() != null) {
			if (getPrevious().isRootElement()) {
				return "/" + relationFromPrevious.getOption().getValue() + "::*";
			} else {
				return ((SingleElement) getPrevious()).getXQueryVariable() + "/" + relationFromPrevious.getOption().getValue() + "::*";
			}
		} else {
			throw new InvalidityException("relation option null");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @throws MissingPatternContainerException
	 * @generated NOT
	 */
	@Override
	public void copyNextElementsToNextGraphs() throws MissingPatternContainerException {
		for (SingleElement nextSingleElement : getNextSingle()) {
			copyNextElementToNextGraphs(nextSingleElement);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @throws MissingPatternContainerException
	 * @generated NOT
	 */
	@Override
	public void copyNextElementToNextGraphs(SingleElement nextElement) throws MissingPatternContainerException {
		for (SingleElementMapping mapping : getMappingTo()) {
			boolean mappingExistsAlready = false;
			for (SingleElementMapping nextElementMappingTo : nextElement.getMappingTo()) {
				if (nextElementMappingTo.getMorphism().equals(mapping.getMorphism())) {
					mappingExistsAlready = true;
				}
			}
			if (!mappingExistsAlready) {
				SingleElement newElementInNextGraph = new SingleElementImpl();
				mapping.getTo().getNextSingle().add(newElementInNextGraph);
//				System.out.println("--- 1 ---");
//				System.out.println(newElementInNextGraph.getRelationFromPrevious().getOption().getParameterList());
				if (nextElement.getGraph() != null) {
					Graph nextGraph = mapping.getMorphism().getTo();
					nextGraph.getReturnElements().add(newElementInNextGraph);
				}
//				System.out.println("--- 2 ---");
//				System.out.println(newElementInNextGraph.getRelationFromPrevious().getOption().getParameterList());
				SingleElementMapping newNextElementMapping = new SingleElementMappingImpl();
				mapping.getMorphism().getMappings().add(newNextElementMapping);
				newNextElementMapping.setFrom(nextElement);
				newNextElementMapping.setTo(newElementInNextGraph);
//				System.out.println("--- 3 ---");
//				System.out.println(newElementInNextGraph.getRelationFromPrevious().getOption().getParameterList());
				if (nextElement.getRelationFromPrevious() != null) {
					RelationMapping newRelationMapping = new RelationMappingImpl();
					mapping.getMorphism().getMappings().add(newRelationMapping);
					newRelationMapping.setFrom(nextElement.getRelationFromPrevious());
					newRelationMapping.setTo(newElementInNextGraph.getRelationFromPrevious());
				}
//				System.out.println("--- 4 ---");
//				System.out.println(newElementInNextGraph.getRelationFromPrevious().getOption().getParameterList());
			}
			nextElement.copyNextElementsToNextGraphs();
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	@Override
	public void removeElementFromPreviousGraphs() {
		SingleElement correspondingPreviousElement = getMappingFrom().getFrom();
		correspondingPreviousElement.setPrevious(null);
		correspondingPreviousElement.setRoot(null);
//		getMappingFrom().getMorphism().getMappings().remove(getMappingFrom());
		EList<SingleElement> nextSingleElementsCopy = new BasicEList<SingleElement>();
		nextSingleElementsCopy.addAll(getNextSingle());
		for (SingleElement singleElement : nextSingleElementsCopy) {
			singleElement.setPrevious(null);
		}
		if (getRelationFromPrevious() != null && getRelationFromPrevious().getMappingFrom() != null) {
			getRelationFromPrevious().getMappingFrom().getMorphism().getMappings()
					.remove(getRelationFromPrevious().getMappingFrom());
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void copyNextElementToPreviousGraphs(SingleElement nextElement, boolean recursive) {
		SingleElement newElementInPreviousGraph = new SingleElementImpl();
		SingleElementMapping mapping = getMappingFrom();
		SingleElement sourceElement = mapping.getFrom();
		sourceElement.getNextSingle().add(newElementInPreviousGraph);
		SingleElementMapping newNextElementMapping = new SingleElementMappingImpl();
		mapping.getMorphism().getMappings().add(newNextElementMapping);
		newNextElementMapping.setFrom(newElementInPreviousGraph);
		newNextElementMapping.setTo(nextElement);
		if (nextElement.getRelationFromPrevious() != null) {
			RelationMapping newRelationMapping = new RelationMappingImpl();
			mapping.getMorphism().getMappings().add(newRelationMapping);
			newRelationMapping.setFrom(newElementInPreviousGraph.getRelationFromPrevious());
			newRelationMapping.setTo(nextElement.getRelationFromPrevious());
		}
		nextElement.copyNextElementsToPreviousGraphs(recursive);
		if (recursive) {
			sourceElement.copyNextElementToPreviousGraphs(newElementInPreviousGraph, recursive);
		}

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void copyNextElementsToPreviousGraphs(boolean recursive) {
		for (SingleElement nextSingleElement : getNextSingle()) {
			copyNextElementToPreviousGraphs(nextSingleElement, recursive);
		}
	}

//	/**
//	 * <!-- begin-user-doc --> <!-- end-user-doc -->
//	 * 
//	 * @generated NOT
//	 */
//	@Override
//	public boolean hasCountPredicate() {
//		for (BooleanOperator operator : getPredicates()) {
//			if (operator.hasCountPredicate()) {
//				return true;
//			}
//		}
//		return false;
//	}

	@Override
	public void isValid(boolean isDefinedPattern)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValidLocal(isDefinedPattern);
		for (SingleElement next : getNextSingle())
			next.isValid(isDefinedPattern);
		for (BooleanOperator predicate : getPredicates())
			predicate.isValid(isDefinedPattern);
		if (!eIsSet(GraphstructurePackage.SINGLE_ELEMENT__ROOT))
			relationFromPrevious.isValid(isDefinedPattern);
		
		if(getPrevious() == null && getGraph() == null) {
			throw new InvalidityException("missing previous element or root graph");
		}
		if(getPrevious() != null) {
			for(SingleElementMapping mapping : getMappingTo()) {
				if(!mapping.getTo().getPrevious().getMappingFrom().equals(getPrevious())) {
					throw new InvalidityException("mapping invalid");
				}
			}
		}
	}

	@Override
	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {		
			
		try {
			Pattern pattern;
			pattern = (Pattern) getAncestor(Pattern.class);
			if (getGraphDepth() == 0 && mappingFrom != null && pattern.getCountPattern() == null) // depth=0 => ReturnGraph
				throw new InvalidityException("invalid SingleElementMapping to returnGraph: " + mappingFrom + " "
						+ mappingFrom.getId() + " - (" + mappingTo + ")");
		} catch (MissingPatternContainerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (!eIsSet(GraphstructurePackage.SINGLE_ELEMENT__ROOT)
				&& !eIsSet(GraphstructurePackage.SINGLE_ELEMENT__PREVIOUS))
			throw new InvalidityException("previousElement null at SingleElement " + getId());
		if (eIsSet(GraphstructurePackage.SINGLE_ELEMENT__ROOT)
				&& eIsSet(GraphstructurePackage.SINGLE_ELEMENT__PREVIOUS))
			throw new InvalidityException("root has previous Element");
		if (!eIsSet(GraphstructurePackage.SINGLE_ELEMENT__ROOT)
				&& !eIsSet(GraphstructurePackage.SINGLE_ELEMENT__RELATION_FROM_PREVIOUS))
			throw new InvalidityException("relation not specified");
		if (isRootElement() && getRelationFromPrevious() != null)
			throw new InvalidityException("relation specified for root element");

		for (SingleElement next : getNextSingle()) {
			if (next == null)
				throw new InvalidityException("nextElement null (" + next + ")");
			if (next.getPrevious() == null || !next.getPrevious().equals(this))
				throw new InvalidityException("nextElement not valid (" + next + ")");
		}
		for (BooleanOperator predicate : getPredicates())
			if (predicate == null)
				throw new InvalidityException("predicate null (" + predicate + ")");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @throws InvalidityException
	 * 
	 */
	public int getGraphDepth() throws InvalidityException {
		if (getRoot() != null) {
			return getRoot().getGraphDepth();
		} else {
			if (getPrevious() != null)
				return getPrevious().getGraphDepth();
			throw new InvalidityException("previous null");
		}
	}

	@Override
	public boolean isTranslatable() {
		return translated;
	}

	@Override
	public String getXQueryRepresentation(Location location) throws InvalidityException {
		if (predicatesAreBeingTranslated) {
			return "."; // TODO: remove
		} else {
			if (translated) {
				return getXQueryVariable();
			} else {
				throw new InvalidityException("element not yet translated");
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	@Override
	public EList<ListOfElements> getAllArgumentElements() {
		EList<ListOfElements> list = new BasicEList<ListOfElements>();
		ListOfElements listOfElements = new ListOfElements();
		listOfElements.add(this);
		list.add(listOfElements);
		return list;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphstructurePackage.Literals.SINGLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comparison> getComparison1() {
		if (comparison1 == null) {
			comparison1 = new EObjectWithInverseResolvingEList<Comparison>(Comparison.class, this, GraphstructurePackage.SINGLE_ELEMENT__COMPARISON1, FunctionsPackage.COMPARISON__ARGUMENT1);
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
			comparison2 = new EObjectWithInverseResolvingEList<Comparison>(Comparison.class, this, GraphstructurePackage.SINGLE_ELEMENT__COMPARISON2, FunctionsPackage.COMPARISON__ARGUMENT2);
		}
		return comparison2;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleElementMapping getMappingFrom() {
		if (mappingFrom != null && mappingFrom.eIsProxy()) {
			InternalEObject oldMappingFrom = (InternalEObject)mappingFrom;
			mappingFrom = (SingleElementMapping)eResolveProxy(oldMappingFrom);
			if (mappingFrom != oldMappingFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphstructurePackage.SINGLE_ELEMENT__MAPPING_FROM, oldMappingFrom, mappingFrom));
			}
		}
		return mappingFrom;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SingleElementMapping basicGetMappingFrom() {
		return mappingFrom;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappingFrom(SingleElementMapping newMappingFrom, NotificationChain msgs) {
		SingleElementMapping oldMappingFrom = mappingFrom;
		mappingFrom = newMappingFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.SINGLE_ELEMENT__MAPPING_FROM, oldMappingFrom, newMappingFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMappingFrom(SingleElementMapping newMappingFrom) {
		if (newMappingFrom != mappingFrom) {
			NotificationChain msgs = null;
			if (mappingFrom != null)
				msgs = ((InternalEObject)mappingFrom).eInverseRemove(this, PatternstructurePackage.SINGLE_ELEMENT_MAPPING__TO, SingleElementMapping.class, msgs);
			if (newMappingFrom != null)
				msgs = ((InternalEObject)newMappingFrom).eInverseAdd(this, PatternstructurePackage.SINGLE_ELEMENT_MAPPING__TO, SingleElementMapping.class, msgs);
			msgs = basicSetMappingFrom(newMappingFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.SINGLE_ELEMENT__MAPPING_FROM, newMappingFrom, newMappingFrom));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SingleElementMapping> getMappingTo() {
		if (mappingTo == null) {
			mappingTo = new EObjectWithInverseResolvingEList<SingleElementMapping>(SingleElementMapping.class, this, GraphstructurePackage.SINGLE_ELEMENT__MAPPING_TO, PatternstructurePackage.SINGLE_ELEMENT_MAPPING__FROM);
		}
		return mappingTo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Graph getRoot() {
		if (eContainerFeatureID() != GraphstructurePackage.SINGLE_ELEMENT__ROOT) return null;
		return (Graph)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public NotificationChain basicSetRoot(Graph newRoot, NotificationChain msgs) {
//		if(newRoot != null) {
//			for(Morphism morphism : newRoot.getMorphismTo()) {
//				Graph nextGraph = morphism.getTo();
//				SingleElement newElementInNextGraph = new SingleElementImpl();
//				nextGraph.getRootElements().add(newElementInNextGraph);
//				if(this.getGraph() != null) {
//					nextGraph.getReturnElements().add(newElementInNextGraph);
//				}
//				SingleElementMapping newNextElementMapping = new SingleElementMappingImpl(this, newElementInNextGraph);	
//				morphism.getMappings().add(newNextElementMapping);				
//					
//				try {
//					copyNextElementsToNextGraphs();
//				} catch (MissingPatternContainerException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} 
//			}
//		}
		if (getRelationFromPrevious() != null) {
			setRelationFromPrevious(null);
		}
//		
//		if(getMappingFrom() != null) {
//			removeElementFromPreviousGraphs();
//		}

		msgs = eBasicSetContainer((InternalEObject) newRoot, GraphstructurePackage.SINGLE_ELEMENT__ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoot(Graph newRoot) {
		if (newRoot != eInternalContainer() || (eContainerFeatureID() != GraphstructurePackage.SINGLE_ELEMENT__ROOT && newRoot != null)) {
			if (EcoreUtil.isAncestor(this, newRoot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRoot != null)
				msgs = ((InternalEObject)newRoot).eInverseAdd(this, GraphstructurePackage.GRAPH__ROOT_ELEMENT, Graph.class, msgs);
			msgs = basicSetRoot(newRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.SINGLE_ELEMENT__ROOT, newRoot, newRoot));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SingleElement> getNextSingle() {
		if (nextSingle == null) {
			nextSingle = new EObjectContainmentWithInverseEList<SingleElement>(SingleElement.class, this, GraphstructurePackage.SINGLE_ELEMENT__NEXT_SINGLE, GraphstructurePackage.SINGLE_ELEMENT__PREVIOUS);
		}
		return nextSingle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleElement getPrevious() {
		if (eContainerFeatureID() != GraphstructurePackage.SINGLE_ELEMENT__PREVIOUS) return null;
		return (SingleElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public NotificationChain basicSetPrevious(SingleElement newPrevious, NotificationChain msgs) {
		clearComparisonRecursively();
		clearPropertyRecursively();
		clearMatchRecursively();
		removeFromReturnElements();
		clearPredicatesRecursively();
		if (getRelationFromPrevious() != null) {
			getRelationFromPrevious().removeRelationFromPreviousGraphs();
			getRelationFromPrevious().removeMappingsToNext();
			getRelationFromPrevious().removeInputsFromVariableList();
			setRelationFromPrevious(null);
		}
		removeMappingsToNext();
		if (newPrevious != null) {
			try {
				newPrevious.copyNextElementToNextGraphs(this);
			} catch (MissingPatternContainerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (getMappingFrom() != null) {
			removeElementFromPreviousGraphs();
		}		
		msgs = eBasicSetContainer((InternalEObject) newPrevious, GraphstructurePackage.SINGLE_ELEMENT__PREVIOUS, msgs);
		if(newPrevious != null) {
			setRelationFromPrevious(new RelationImpl());
		}
		return msgs;
	}

	public void removeFromReturnElements() {
		setGraph(null);
		for (SingleElement child : getNextSingle()) {
			child.removeFromReturnElements();
		}
	}

//	/**
//	 * <!-- begin-user-doc --> <!-- end-user-doc -->
//	 * 
//	 * @generated NOT
//	 */
//	@Override
//	public void addCountOperation() {
//
//		try {
//			GraphstructurePackage.eINSTANCE.eClass();
//			GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
//			FunctionsPackage.eINSTANCE.eClass();
//			FunctionsFactory functionFactory = FunctionsFactory.eINSTANCE;
//			ParametersPackage.eINSTANCE.eClass();
//			ParametersFactory inputsFactory = ParametersFactory.eINSTANCE;
//			
//			OperatorList oplist = ((Graph) getAncestor(Graph.class)).getOperatorList();
//			ParameterList varlist = ((Pattern) getAncestor(Pattern.class)).getParameterList();
//
//			SetElement set = graphFactory.createSetElement();
//			this.getNextSet().add(set);
//
//			Count count = functionFactory.createCount();
//			Comparison comp = functionFactory.createComparison();
//
//			oplist.add(comp);
//			oplist.add(count);
//
//			getPredicates().add(comp);
//			qualitypatternmodel.parameters.NumberParam number = inputsFactory.createNumberParam();
//			varlist.add(number);
//
//			comp.setArgument1(count);
//			comp.setArgument2(number);
//			
//			count.setArgument(set);
//		} catch (MissingPatternContainerException e) {
//			e.printStackTrace();
//		}
//	}

	@Override
	public void removeMappingsToNext() {
		EList<SingleElementMapping> mappingToCopy = new BasicEList<SingleElementMapping>();
		mappingToCopy.addAll(getMappingTo());
		for (SingleElementMapping mapping : mappingToCopy) {
			mapping.setFrom(null);
			mapping.setTo(null);
			mapping.getMorphism().getMappings().remove(mapping);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.SINGLE_ELEMENT__NAME, oldName, name));
	
		if (getMappingFrom() != null) {
			SingleElement se = getMappingFrom().getFrom();
			if (!se.getName().equals(newName))
				se.setName(newName);
		}
		for (SingleElementMapping m : getMappingTo()) {
			if (m.getTo() != null) {
				SingleElement se = m.getTo();
				if (!se.getName().equals(newName)) {
					se.setName(newName);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTranslated() {
		return translated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTranslated(boolean newTranslated) {
		boolean oldTranslated = translated;
		translated = newTranslated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.SINGLE_ELEMENT__TRANSLATED, oldTranslated, translated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPredicatesAreBeingTranslated() {
		return predicatesAreBeingTranslated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPredicatesAreBeingTranslated(boolean newPredicatesAreBeingTranslated) {
		boolean oldPredicatesAreBeingTranslated = predicatesAreBeingTranslated;
		predicatesAreBeingTranslated = newPredicatesAreBeingTranslated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.SINGLE_ELEMENT__PREDICATES_ARE_BEING_TRANSLATED, oldPredicatesAreBeingTranslated, predicatesAreBeingTranslated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relation getRelationFromPrevious() {
		return relationFromPrevious;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationFromPrevious(Relation newRelationFromPrevious, NotificationChain msgs) {
		Relation oldRelationFromPrevious = relationFromPrevious;
		relationFromPrevious = newRelationFromPrevious;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.SINGLE_ELEMENT__RELATION_FROM_PREVIOUS, oldRelationFromPrevious, newRelationFromPrevious);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelationFromPrevious(Relation newRelationFromPrevious) {
		if (newRelationFromPrevious != relationFromPrevious) {
			NotificationChain msgs = null;
			if (relationFromPrevious != null)
				msgs = ((InternalEObject)relationFromPrevious).eInverseRemove(this, GraphstructurePackage.RELATION__RELATION_TO, Relation.class, msgs);
			if (newRelationFromPrevious != null)
				msgs = ((InternalEObject)newRelationFromPrevious).eInverseAdd(this, GraphstructurePackage.RELATION__RELATION_TO, Relation.class, msgs);
			msgs = basicSetRelationFromPrevious(newRelationFromPrevious, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.SINGLE_ELEMENT__RELATION_FROM_PREVIOUS, newRelationFromPrevious, newRelationFromPrevious));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentWithInverseEList<Property>(Property.class, this, GraphstructurePackage.SINGLE_ELEMENT__PROPERTIES, GraphstructurePackage.PROPERTY__ELEMENT);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BooleanOperator> getPredicates() {
		if (predicates == null) {
			predicates = new EObjectWithInverseResolvingEList.ManyInverse<BooleanOperator>(BooleanOperator.class, this, GraphstructurePackage.SINGLE_ELEMENT__PREDICATES, FunctionsPackage.BOOLEAN_OPERATOR__ELEMENTS);
		}
		return predicates;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrevious(SingleElement newPrevious) {
		if (newPrevious != eInternalContainer() || (eContainerFeatureID() != GraphstructurePackage.SINGLE_ELEMENT__PREVIOUS && newPrevious != null)) {
			if (EcoreUtil.isAncestor(this, newPrevious))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject)newPrevious).eInverseAdd(this, GraphstructurePackage.SINGLE_ELEMENT__NEXT_SINGLE, SingleElement.class, msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.SINGLE_ELEMENT__PREVIOUS, newPrevious, newPrevious));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Graph getGraph() {
		if (graph != null && graph.eIsProxy()) {
			InternalEObject oldGraph = (InternalEObject)graph;
			graph = (Graph)eResolveProxy(oldGraph);
			if (graph != oldGraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphstructurePackage.SINGLE_ELEMENT__GRAPH, oldGraph, graph));
			}
		}
		return graph;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Graph basicGetGraph() {
		return graph;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public NotificationChain basicSetGraph(Graph newGraph, NotificationChain msgs) {
		Graph oldGraph = graph;
		graph = newGraph;
		setGraphForCorrespondingElements(newGraph);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GraphstructurePackage.SINGLE_ELEMENT__GRAPH, oldGraph, newGraph);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	private void setGraphForCorrespondingElements(Graph newGraph) {
		for (SingleElementMapping mapping : getMappingTo()) {
			if(mapping.getMorphism().getCountPattern() == null) {
				SingleElement element = mapping.getTo();
				if (newGraph == null && element.getGraph() != null) {
					element.setGraph(null);
				}
				if (newGraph != null && element.getGraph() == null) {
					try {
						element.setGraph((Graph) element.getAncestor(GraphImpl.class));
					} catch (MissingPatternContainerException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}			
		}
		if (getMappingFrom() != null && getMappingFrom().getMorphism().getCountPattern() == null) {
			SingleElement element = getMappingFrom().getFrom();
			if (newGraph == null && element.getGraph() != null) {
				element.setGraph(null);
			}
			if (newGraph != null && element.getGraph() == null) {
				try {
					element.setGraph((Graph) element.getAncestor(GraphImpl.class));
				} catch (MissingPatternContainerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGraph(Graph newGraph) {
		if (newGraph != graph) {
			NotificationChain msgs = null;
			if (graph != null)
				msgs = ((InternalEObject)graph).eInverseRemove(this, GraphstructurePackage.GRAPH__RETURN_ELEMENTS, Graph.class, msgs);
			if (newGraph != null)
				msgs = ((InternalEObject)newGraph).eInverseAdd(this, GraphstructurePackage.GRAPH__RETURN_ELEMENTS, Graph.class, msgs);
			msgs = basicSetGraph(newGraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.SINGLE_ELEMENT__GRAPH, newGraph, newGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getOriginalID() {
		if (mappingFrom == null)
			return this.getInternalId();
		else
			return mappingFrom.getFrom().getOriginalID();
	}

//	/**
//	 * <!-- begin-user-doc --> <!-- end-user-doc -->
//	 * 
//	 * @generated NOT
//	 */
//	@Override
//	public String translateElementExistencePredicates(Location location) throws InvalidityException {
//		String predicates = "";
//		for (Element nextElement : getNextElements()) {
//			if (nextElement instanceof SetElement) {
//				SetElement nextSetElement = (SetElement) nextElement;
//				if (!nextSetElement.isTranslated()) {
//					nextSetElement.setTranslated(true);
//					// TODO: in SetElementImpl create for clause: String result = FOR +
//					// getXQueryVariable() + IN + xPathExpression + xPredicates;
//					predicates += "[." + nextSetElement.translatePathFromPrevious()
//							+ nextSetElement.translatePredicatesViaBrackets(location) // TODO: depth+1 ?
//							+ nextSetElement.translateElementExistencePredicates(location) + "]"; // TODO: depth+1 ?
//				}
//			}
//
//		}
//		return predicates;
//
//	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphstructurePackage.SINGLE_ELEMENT__COMPARISON1:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComparison1()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.SINGLE_ELEMENT__COMPARISON2:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComparison2()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.SINGLE_ELEMENT__MAPPING_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMappingTo()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.SINGLE_ELEMENT__MAPPING_FROM:
				if (mappingFrom != null)
					msgs = ((InternalEObject)mappingFrom).eInverseRemove(this, PatternstructurePackage.SINGLE_ELEMENT_MAPPING__TO, SingleElementMapping.class, msgs);
				return basicSetMappingFrom((SingleElementMapping)otherEnd, msgs);
			case GraphstructurePackage.SINGLE_ELEMENT__ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRoot((Graph)otherEnd, msgs);
			case GraphstructurePackage.SINGLE_ELEMENT__NEXT_SINGLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNextSingle()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.SINGLE_ELEMENT__PREVIOUS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPrevious((SingleElement)otherEnd, msgs);
			case GraphstructurePackage.SINGLE_ELEMENT__GRAPH:
				if (graph != null)
					msgs = ((InternalEObject)graph).eInverseRemove(this, GraphstructurePackage.GRAPH__RETURN_ELEMENTS, Graph.class, msgs);
				return basicSetGraph((Graph)otherEnd, msgs);
			case GraphstructurePackage.SINGLE_ELEMENT__RELATION_FROM_PREVIOUS:
				if (relationFromPrevious != null)
					msgs = ((InternalEObject)relationFromPrevious).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphstructurePackage.SINGLE_ELEMENT__RELATION_FROM_PREVIOUS, null, msgs);
				return basicSetRelationFromPrevious((Relation)otherEnd, msgs);
			case GraphstructurePackage.SINGLE_ELEMENT__PROPERTIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProperties()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.SINGLE_ELEMENT__PREDICATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPredicates()).basicAdd(otherEnd, msgs);
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
			case GraphstructurePackage.SINGLE_ELEMENT__COMPARISON1:
				return ((InternalEList<?>)getComparison1()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.SINGLE_ELEMENT__COMPARISON2:
				return ((InternalEList<?>)getComparison2()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.SINGLE_ELEMENT__MAPPING_TO:
				return ((InternalEList<?>)getMappingTo()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.SINGLE_ELEMENT__MAPPING_FROM:
				return basicSetMappingFrom(null, msgs);
			case GraphstructurePackage.SINGLE_ELEMENT__ROOT:
				return basicSetRoot(null, msgs);
			case GraphstructurePackage.SINGLE_ELEMENT__NEXT_SINGLE:
				return ((InternalEList<?>)getNextSingle()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.SINGLE_ELEMENT__PREVIOUS:
				return basicSetPrevious(null, msgs);
			case GraphstructurePackage.SINGLE_ELEMENT__GRAPH:
				return basicSetGraph(null, msgs);
			case GraphstructurePackage.SINGLE_ELEMENT__RELATION_FROM_PREVIOUS:
				return basicSetRelationFromPrevious(null, msgs);
			case GraphstructurePackage.SINGLE_ELEMENT__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.SINGLE_ELEMENT__PREDICATES:
				return ((InternalEList<?>)getPredicates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GraphstructurePackage.SINGLE_ELEMENT__ROOT:
				return eInternalContainer().eInverseRemove(this, GraphstructurePackage.GRAPH__ROOT_ELEMENT, Graph.class, msgs);
			case GraphstructurePackage.SINGLE_ELEMENT__PREVIOUS:
				return eInternalContainer().eInverseRemove(this, GraphstructurePackage.SINGLE_ELEMENT__NEXT_SINGLE, SingleElement.class, msgs);
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
			case GraphstructurePackage.SINGLE_ELEMENT__COMPARISON1:
				return getComparison1();
			case GraphstructurePackage.SINGLE_ELEMENT__COMPARISON2:
				return getComparison2();
			case GraphstructurePackage.SINGLE_ELEMENT__MAPPING_TO:
				return getMappingTo();
			case GraphstructurePackage.SINGLE_ELEMENT__MAPPING_FROM:
				if (resolve) return getMappingFrom();
				return basicGetMappingFrom();
			case GraphstructurePackage.SINGLE_ELEMENT__ROOT:
				return getRoot();
			case GraphstructurePackage.SINGLE_ELEMENT__NEXT_SINGLE:
				return getNextSingle();
			case GraphstructurePackage.SINGLE_ELEMENT__PREVIOUS:
				return getPrevious();
			case GraphstructurePackage.SINGLE_ELEMENT__GRAPH:
				if (resolve) return getGraph();
				return basicGetGraph();
			case GraphstructurePackage.SINGLE_ELEMENT__NAME:
				return getName();
			case GraphstructurePackage.SINGLE_ELEMENT__TRANSLATED:
				return isTranslated();
			case GraphstructurePackage.SINGLE_ELEMENT__PREDICATES_ARE_BEING_TRANSLATED:
				return isPredicatesAreBeingTranslated();
			case GraphstructurePackage.SINGLE_ELEMENT__RELATION_FROM_PREVIOUS:
				return getRelationFromPrevious();
			case GraphstructurePackage.SINGLE_ELEMENT__PROPERTIES:
				return getProperties();
			case GraphstructurePackage.SINGLE_ELEMENT__PREDICATES:
				return getPredicates();
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
			case GraphstructurePackage.SINGLE_ELEMENT__COMPARISON1:
				getComparison1().clear();
				getComparison1().addAll((Collection<? extends Comparison>)newValue);
				return;
			case GraphstructurePackage.SINGLE_ELEMENT__COMPARISON2:
				getComparison2().clear();
				getComparison2().addAll((Collection<? extends Comparison>)newValue);
				return;
			case GraphstructurePackage.SINGLE_ELEMENT__MAPPING_TO:
				getMappingTo().clear();
				getMappingTo().addAll((Collection<? extends SingleElementMapping>)newValue);
				return;
			case GraphstructurePackage.SINGLE_ELEMENT__MAPPING_FROM:
				setMappingFrom((SingleElementMapping)newValue);
				return;
			case GraphstructurePackage.SINGLE_ELEMENT__ROOT:
				setRoot((Graph)newValue);
				return;
			case GraphstructurePackage.SINGLE_ELEMENT__NEXT_SINGLE:
				getNextSingle().clear();
				getNextSingle().addAll((Collection<? extends SingleElement>)newValue);
				return;
			case GraphstructurePackage.SINGLE_ELEMENT__PREVIOUS:
				setPrevious((SingleElement)newValue);
				return;
			case GraphstructurePackage.SINGLE_ELEMENT__GRAPH:
				setGraph((Graph)newValue);
				return;
			case GraphstructurePackage.SINGLE_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case GraphstructurePackage.SINGLE_ELEMENT__TRANSLATED:
				setTranslated((Boolean)newValue);
				return;
			case GraphstructurePackage.SINGLE_ELEMENT__PREDICATES_ARE_BEING_TRANSLATED:
				setPredicatesAreBeingTranslated((Boolean)newValue);
				return;
			case GraphstructurePackage.SINGLE_ELEMENT__RELATION_FROM_PREVIOUS:
				setRelationFromPrevious((Relation)newValue);
				return;
			case GraphstructurePackage.SINGLE_ELEMENT__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case GraphstructurePackage.SINGLE_ELEMENT__PREDICATES:
				getPredicates().clear();
				getPredicates().addAll((Collection<? extends BooleanOperator>)newValue);
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
			case GraphstructurePackage.SINGLE_ELEMENT__COMPARISON1:
				getComparison1().clear();
				return;
			case GraphstructurePackage.SINGLE_ELEMENT__COMPARISON2:
				getComparison2().clear();
				return;
			case GraphstructurePackage.SINGLE_ELEMENT__MAPPING_TO:
				getMappingTo().clear();
				return;
			case GraphstructurePackage.SINGLE_ELEMENT__MAPPING_FROM:
				setMappingFrom((SingleElementMapping)null);
				return;
			case GraphstructurePackage.SINGLE_ELEMENT__ROOT:
				setRoot((Graph)null);
				return;
			case GraphstructurePackage.SINGLE_ELEMENT__NEXT_SINGLE:
				getNextSingle().clear();
				return;
			case GraphstructurePackage.SINGLE_ELEMENT__PREVIOUS:
				setPrevious((SingleElement)null);
				return;
			case GraphstructurePackage.SINGLE_ELEMENT__GRAPH:
				setGraph((Graph)null);
				return;
			case GraphstructurePackage.SINGLE_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GraphstructurePackage.SINGLE_ELEMENT__TRANSLATED:
				setTranslated(TRANSLATED_EDEFAULT);
				return;
			case GraphstructurePackage.SINGLE_ELEMENT__PREDICATES_ARE_BEING_TRANSLATED:
				setPredicatesAreBeingTranslated(PREDICATES_ARE_BEING_TRANSLATED_EDEFAULT);
				return;
			case GraphstructurePackage.SINGLE_ELEMENT__RELATION_FROM_PREVIOUS:
				setRelationFromPrevious((Relation)null);
				return;
			case GraphstructurePackage.SINGLE_ELEMENT__PROPERTIES:
				getProperties().clear();
				return;
			case GraphstructurePackage.SINGLE_ELEMENT__PREDICATES:
				getPredicates().clear();
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
			case GraphstructurePackage.SINGLE_ELEMENT__COMPARISON1:
				return comparison1 != null && !comparison1.isEmpty();
			case GraphstructurePackage.SINGLE_ELEMENT__COMPARISON2:
				return comparison2 != null && !comparison2.isEmpty();
			case GraphstructurePackage.SINGLE_ELEMENT__MAPPING_TO:
				return mappingTo != null && !mappingTo.isEmpty();
			case GraphstructurePackage.SINGLE_ELEMENT__MAPPING_FROM:
				return mappingFrom != null;
			case GraphstructurePackage.SINGLE_ELEMENT__ROOT:
				return getRoot() != null;
			case GraphstructurePackage.SINGLE_ELEMENT__NEXT_SINGLE:
				return nextSingle != null && !nextSingle.isEmpty();
			case GraphstructurePackage.SINGLE_ELEMENT__PREVIOUS:
				return getPrevious() != null;
			case GraphstructurePackage.SINGLE_ELEMENT__GRAPH:
				return graph != null;
			case GraphstructurePackage.SINGLE_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GraphstructurePackage.SINGLE_ELEMENT__TRANSLATED:
				return translated != TRANSLATED_EDEFAULT;
			case GraphstructurePackage.SINGLE_ELEMENT__PREDICATES_ARE_BEING_TRANSLATED:
				return predicatesAreBeingTranslated != PREDICATES_ARE_BEING_TRANSLATED_EDEFAULT;
			case GraphstructurePackage.SINGLE_ELEMENT__RELATION_FROM_PREVIOUS:
				return relationFromPrevious != null;
			case GraphstructurePackage.SINGLE_ELEMENT__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case GraphstructurePackage.SINGLE_ELEMENT__PREDICATES:
				return predicates != null && !predicates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GraphstructurePackage.SINGLE_ELEMENT___COPY_NEXT_ELEMENTS_TO_NEXT_GRAPHS:
				try {
					copyNextElementsToNextGraphs();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.SINGLE_ELEMENT___COPY_NEXT_ELEMENT_TO_NEXT_GRAPHS__SINGLEELEMENT:
				try {
					copyNextElementToNextGraphs((SingleElement)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.SINGLE_ELEMENT___REMOVE_ELEMENT_FROM_PREVIOUS_GRAPHS:
				removeElementFromPreviousGraphs();
				return null;
			case GraphstructurePackage.SINGLE_ELEMENT___COPY_NEXT_ELEMENT_TO_PREVIOUS_GRAPHS__SINGLEELEMENT_BOOLEAN:
				copyNextElementToPreviousGraphs((SingleElement)arguments.get(0), (Boolean)arguments.get(1));
				return null;
			case GraphstructurePackage.SINGLE_ELEMENT___COPY_NEXT_ELEMENTS_TO_PREVIOUS_GRAPHS__BOOLEAN:
				copyNextElementsToPreviousGraphs((Boolean)arguments.get(0));
				return null;
			case GraphstructurePackage.SINGLE_ELEMENT___TO_XQUERY_NO_COUNT__LOCATION:
				try {
					return toXQueryNoCount((Location)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.SINGLE_ELEMENT___IS_ROOT_ELEMENT:
				return isRootElement();
			case GraphstructurePackage.SINGLE_ELEMENT___REMOVE_MAPPINGS_TO_NEXT:
				removeMappingsToNext();
				return null;
			case GraphstructurePackage.SINGLE_ELEMENT___REMOVE_FROM_RETURN_ELEMENTS:
				removeFromReturnElements();
				return null;
			case GraphstructurePackage.SINGLE_ELEMENT___CLEAR_MATCH_RECURSIVELY:
				clearMatchRecursively();
				return null;
			case GraphstructurePackage.SINGLE_ELEMENT___GET_ALL_RELATIONS:
				return getAllRelations();
			case GraphstructurePackage.SINGLE_ELEMENT___TRANSLATE_PREDICATES_VIA_AND__LOCATION:
				try {
					return translatePredicatesViaAnd((Location)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.SINGLE_ELEMENT___CLEAR_PREDICATES_RECURSIVELY:
				clearPredicatesRecursively();
				return null;
			case GraphstructurePackage.SINGLE_ELEMENT___TRANSLATE_PREDICATES_VIA_BRACKETS__LOCATION:
				try {
					return translatePredicatesViaBrackets((Location)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.SINGLE_ELEMENT___GET_ALL_ELEMENTS:
				return getAllElements();
			case GraphstructurePackage.SINGLE_ELEMENT___GET_ORIGINAL_ID:
				return getOriginalID();
			case GraphstructurePackage.SINGLE_ELEMENT___GET_XQUERY_REPRESENTATION__LOCATION:
				try {
					return getXQueryRepresentation((Location)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.SINGLE_ELEMENT___ADD_PRIMITIVE_MATCH__STRING:
				addPrimitiveMatch((String)arguments.get(0));
				return null;
			case GraphstructurePackage.SINGLE_ELEMENT___ADD_PRIMITIVE_COMPARISON__STRING:
				addPrimitiveComparison((String)arguments.get(0));
				return null;
			case GraphstructurePackage.SINGLE_ELEMENT___GET_XQUERY_VARIABLE:
				return getXQueryVariable();
			case GraphstructurePackage.SINGLE_ELEMENT___ADD_PRIMITIVE_MATCH:
				addPrimitiveMatch();
				return null;
			case GraphstructurePackage.SINGLE_ELEMENT___ADD_PRIMITIVE_COMPARISON:
				addPrimitiveComparison();
				return null;
			case GraphstructurePackage.SINGLE_ELEMENT___GET_GRAPH_DEPTH:
				try {
					return getGraphDepth();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.SINGLE_ELEMENT___TRANSLATE_PATH_FROM_PREVIOUS:
				try {
					return translatePathFromPrevious();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.SINGLE_ELEMENT___GET_ALL_OPERATORS:
				try {
					return getAllOperators();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.SINGLE_ELEMENT___ADD_PRIMITIVE_COMPARISON__PROPERTYLOCATION_STRING_COMPARISONOPERATOR_PARAMETER:
				addPrimitiveComparison((PropertyLocation)arguments.get(0), (String)arguments.get(1), (ComparisonOperator)arguments.get(2), (Parameter)arguments.get(3));
				return null;
			case GraphstructurePackage.SINGLE_ELEMENT___ADD_PRIMITIVE_COMPARISON__PARAMETER:
				addPrimitiveComparison((Parameter)arguments.get(0));
				return null;
			case GraphstructurePackage.SINGLE_ELEMENT___CLEAR_COMPARISON_RECURSIVELY:
				clearComparisonRecursively();
				return null;
			case GraphstructurePackage.SINGLE_ELEMENT___CLEAR_PROPERTY_RECURSIVELY:
				clearPropertyRecursively();
				return null;
			case GraphstructurePackage.SINGLE_ELEMENT___GET_RETURN_TYPE:
				return getReturnType();
			case GraphstructurePackage.SINGLE_ELEMENT___IS_TRANSLATABLE:
				try {
					return isTranslatable();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.SINGLE_ELEMENT___GET_ALL_ARGUMENT_ELEMENTS:
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
		String res = "";
		if (isRootElement())
			res += "Root-";
		else
			res += getRelationFromPrevious().myToString() + " ";
		if (getGraph() != null)
			res += "Return-";
		res += "Single";
		res += "Element " + getName() + " " + getInternalId();
		for (Property prop : getProperties())
			res += "\n  " + prop.myToString();
		if (getNextSingle().size() > 0) {
//			res += "\n[";
			for (SingleElement e : getNextSingle()) {
				res += "\n  " + e.myToString().replace("\n", "\n  ");
			}
//			res += "\n]";
		}
		return res;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public EList<Operator> getAllOperators() throws InvalidityException {
		EList<Operator> res = new BasicEList<Operator>();
		for (SingleElement element : getNextSingle()) {
			res.addAll(element.getAllOperators());
		}
		for (Operator op : getPredicates()) {
			res.addAll(op.getAllOperators());
		}
		return res;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public EList<Parameter> getAllInputs() throws InvalidityException {
			EList<Parameter> res = new BasicEList<Parameter>();
			if(getRelationFromPrevious() != null) {
				res.addAll(getRelationFromPrevious().getAllInputs());
			}
			for (SingleElement element : getNextSingle()) {
				res.addAll(element.getAllInputs());
			}
	//		res.addAll(getRelationFromPrevious().getAllVariables());
			for (Property p : getProperties()) {
				res.addAll(p.getAllInputs());
			}
			for (Operator op : getPredicates()) {
				res.addAll(op.getAllInputs());
			}
			return res;
		}

	@Override
	public String translatePredicatesViaBrackets(Location location) throws InvalidityException {
		String xPredicates = "";
		predicatesAreBeingTranslated = true;
		for (BooleanOperator predicate : predicates) {
			if (predicate.isTranslatable()) {
				xPredicates += "[" + predicate.toXQuery(location) + "]";
			}
		}
		predicatesAreBeingTranslated = false;
		return xPredicates;
	}

	@Override
	public String translatePredicatesViaAnd(Location location) throws InvalidityException {
		String xPredicates = "";
		int counter = 0;
		for (BooleanOperator predicate : predicates) {
			if (predicate.isTranslatable()) {
				xPredicates += predicate.toXQuery(location);
				if (counter != predicates.size() - 1 && predicates.get(counter + 1).isTranslatable()) {
					xPredicates += AND;
				}
				counter++;
			}
		}
		return xPredicates;
	}

	@Override
	public void prepareTranslation() {
		translated = false;
		for (SingleElement element : getNextSingle()) {
			element.prepareTranslation();
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void addPrimitiveComparison() {
		Comparison comparison = new ComparisonImpl();
		try {
			Pattern pattern = (Pattern) getAncestor(Pattern.class);
			ParameterList varlist = pattern.getParameterList();
			Graph graph = (Graph) getAncestor(Graph.class);
			OperatorList oplist = graph.getOperatorList();
			
			Property property = new PropertyImpl();
			getProperties().add(property);
	
			UnknownParameterValue unknownParameterValue = new UnknownParameterValueImpl();
			varlist.add(unknownParameterValue);
	
			oplist.add(comparison);	
			comparison.setArgument1(property);
			comparison.setArgument2(unknownParameterValue);						
			
		} catch (Exception e) {
			System.out.println("Adding Condition Failed: " + e.getMessage());			
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void addPrimitiveComparison(String value) {
		Comparison comparison = new ComparisonImpl();
		try {			
			Pattern pattern = (Pattern) getAncestor(Pattern.class);
			ParameterList varlist = pattern.getParameterList();
			Graph graph = (Graph) getAncestor(Graph.class);
			OperatorList oplist = graph.getOperatorList();
			
			Property property = new PropertyImpl();
			getProperties().add(property);
			property.getOption().setValue(PropertyLocation.TAG);
			
			TextLiteralParamImpl textlit = new TextLiteralParamImpl();
			varlist.add(textlit);
			textlit.setValue(value);
	
			oplist.add(comparison);	
			comparison.setArgument1(property);
			comparison.setArgument2(textlit);			
		} catch (Exception e) {
			System.out.println("Adding Condition Failed: " + e.getMessage());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void addPrimitiveComparison(Parameter parameter) {
		Comparison comparison = new ComparisonImpl();
		try {			
			Pattern pattern = (Pattern) getAncestor(Pattern.class);
			ParameterList varlist = pattern.getParameterList();
			Graph graph = (Graph) getAncestor(Graph.class);
			OperatorList oplist = graph.getOperatorList();
			
			Property property = new PropertyImpl();
			getProperties().add(property);
			property.getOption().setValue(PropertyLocation.TAG);
			
			varlist.add(parameter);
	
			oplist.add(comparison);	
			comparison.setArgument1(property);
			comparison.setArgument2(parameter);			
		} catch (Exception e) {
			System.out.println("Adding Condition Failed: " + e.getMessage());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void addPrimitiveComparison(PropertyLocation property, String attr, ComparisonOperator operator, Parameter parameter) {
		Comparison comparison = new ComparisonImpl();
		try {		
			Pattern pattern = (Pattern) getAncestor(Pattern.class);
			ParameterList varlist = pattern.getParameterList();
			Graph graph = (Graph) getAncestor(Graph.class);
			OperatorList oplist = graph.getOperatorList();
			Property property1 = new PropertyImpl();
			
			getProperties().add(property1);
			property1.getOption().setValue(property);
			property1.getAttributeName().setValue(attr);
			
			varlist.add(parameter);
	
			oplist.add(comparison);	
			comparison.getOption().setValue(operator);
			comparison.setArgument1(property1);
			comparison.setArgument2(parameter);				
		} catch (Exception e) {
			System.out.println("Adding Condition Failed: " + e.getMessage());
		}
	}

	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<SingleElement> getAllElements() {
		EList<SingleElement> result = new BasicEList<SingleElement>();
		for(SingleElement next : getNextSingle()) {
			result.addAll(next.getAllElements());
		}
		result.add(this);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Relation> getAllRelations() {
		EList<Relation> result = new BasicEList<Relation>();
		for(SingleElement next : getNextSingle()) {
			result.addAll(next.getAllRelations());
		}
		if(getRelationFromPrevious() != null) {
			result.add(getRelationFromPrevious());
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void addPrimitiveMatch() {
		addPrimitiveMatch(null);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void addPrimitiveMatch(String regex) {
	//		Match match = new MatchImpl();
	//		Property property = new PropertyImpl();
	//		getPredicates().add(match);
	//		getProperties().add(property);
	//		match.setProperty(property);
			Match match = new MatchImpl();
			try {			
				Pattern pattern = (Pattern) getAncestor(Pattern.class);
				ParameterList varlist = pattern.getParameterList();
				Graph graph = (Graph) getAncestor(Graph.class);
				OperatorList oplist = graph.getOperatorList();
				
				Property property = new PropertyImpl();
				getProperties().add(property);
				
	//			TextLiteralImpl textlit = new TextLiteralImpl();
	//			varlist.add(textlit);
	//			textlit.setValue(regex);
	
				oplist.add(match);	
				match.setProperty(property);
	//			match.setArgument1(property);
	//			match.setRegularExpression(textlit);
	//			match.setArgument2(textlit);		
				if(regex != null) {
					match.getRegularExpression().setValue(regex);
				}
			} catch (Exception e) {
				System.out.println("ADDING CONDITION FAILED: " + e.getMessage());
			}
		}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getXQueryVariable() {
		return VARIABLE + getOriginalID();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", translated: ");
		result.append(translated);
		result.append(", predicatesAreBeingTranslated: ");
		result.append(predicatesAreBeingTranslated);
		result.append(')');
		return result.toString();
	}

	public void clearComparisonRecursively() {
		getComparison1().clear();
		getComparison2().clear();
		for(Property p : getProperties()) {
			p.getComparison1().clear();
			p.getComparison2().clear();
		}
		for(SingleElement child : getNextSingle()) {
			child.clearComparisonRecursively();
		}
	}

	@Override
	public void clearMatchRecursively() {
		for(Property p : getProperties()) {
			p.getMatch().clear();
		}
		for(SingleElement child : getNextSingle()) {
			child.clearMatchRecursively();
		}
		
	}

	public void clearPropertyRecursively() {
		for(Property p : getProperties()) {
			p.reset();			
		}
		for(SingleElement child : getNextSingle()) {
			child.clearPropertyRecursively();
		}
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

	public void clearPredicatesRecursively() {
		getPredicates().clear();
		for(SingleElement child : getNextSingle()) {
			child.clearPredicatesRecursively();
		}
	}

	


	

	

} // SingleElementImpl
