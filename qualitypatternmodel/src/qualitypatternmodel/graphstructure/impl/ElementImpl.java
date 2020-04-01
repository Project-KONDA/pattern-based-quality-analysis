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
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.PropertyLocation;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.operators.OperatorList;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.operators.impl.ComparisonImpl;
import qualitypatternmodel.operators.impl.MatchImpl;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.parameters.UnknownParameterValue;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.parameters.impl.UnknownParameterValueImpl;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.Morphism;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.RelationMapping;
import qualitypatternmodel.patternstructure.ElementMapping;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;
import qualitypatternmodel.patternstructure.impl.RelationMappingImpl;
import qualitypatternmodel.patternstructure.impl.ElementMappingImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Single
 * Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getComparison1 <em>Comparison1</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getComparison2 <em>Comparison2</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getMappingTo <em>Mapping To</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getMappingFrom <em>Mapping From</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getNextElements <em>Next Elements</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getPreviousElement <em>Previous Element</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getGraph <em>Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#isTranslated <em>Translated</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#isPredicatesAreBeingTranslated <em>Predicates Are Being Translated</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getRelationFromPrevious <em>Relation From Previous</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getPredicates <em>Predicates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementImpl extends PatternElementImpl implements Element {
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
	protected EList<ElementMapping> mappingTo;

	/**
	 * The cached value of the '{@link #getMappingFrom() <em>Mapping From</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMappingFrom()
	 * @generated
	 * @ordered
	 */
	protected ElementMapping mappingFrom;

	/**
	 * The cached value of the '{@link #getNextElements() <em>Next Elements</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNextElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> nextElements;

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
	public ElementImpl() {
		super();
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
				} else if (!getPredicates().isEmpty()) {
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
				} else if (!getPredicates().isEmpty()) {
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

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean isRootElement() {
		return getRoot() != null;
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

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @throws MissingPatternContainerException
	 * @generated NOT
	 */
	@Override
	public void copyNextElementsToNextGraphs() throws MissingPatternContainerException {
		for (Element nextSingleElement : getNextElements()) {
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
	public void copyNextElementToNextGraphs(Element nextElement) throws MissingPatternContainerException {
		for (ElementMapping mapping : getMappingTo()) {
			boolean mappingExistsAlready = false;
			for (ElementMapping nextElementMappingTo : nextElement.getMappingTo()) {
				if (nextElementMappingTo.getMorphism().equals(mapping.getMorphism())) {
					mappingExistsAlready = true;
				}
			}
			if (!mappingExistsAlready) {
				Element newElementInNextGraph = new ElementImpl();
				mapping.getTo().getNextElements().add(newElementInNextGraph);

				if (nextElement.getGraph() != null) {
					Graph nextGraph = mapping.getMorphism().getTo();
					nextGraph.getReturnElements().add(newElementInNextGraph);
				}

				ElementMapping newNextElementMapping = new ElementMappingImpl();
				mapping.getMorphism().getMappings().add(newNextElementMapping);
				newNextElementMapping.setFrom(nextElement);
				newNextElementMapping.setTo(newElementInNextGraph);

				if (nextElement.getRelationFromPrevious() != null) {
					RelationMapping newRelationMapping = new RelationMappingImpl();
					mapping.getMorphism().getMappings().add(newRelationMapping);
					newRelationMapping.setFrom(nextElement.getRelationFromPrevious());
					newRelationMapping.setTo(newElementInNextGraph.getRelationFromPrevious());
				}

			}
			nextElement.copyNextElementsToNextGraphs();
		}
	}
	
	private void removeElementFromPreviousGraphs() {
		Element correspondingPreviousElement = getMappingFrom().getFrom();
		correspondingPreviousElement.setPreviousElement(null);
		correspondingPreviousElement.setRoot(null);
//		getMappingFrom().getMorphism().getMappings().remove(getMappingFrom());
		EList<Element> nextSingleElementsCopy = new BasicEList<Element>();
		nextSingleElementsCopy.addAll(getNextElements());
		for (Element element : nextSingleElementsCopy) {
			element.setPreviousElement(null);
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
	public void copyNextElementToPreviousGraphs(Element nextElement, boolean recursive) {
		Element newElementInPreviousGraph = new ElementImpl();
		ElementMapping mapping = getMappingFrom();
		Element sourceElement = mapping.getFrom();
		sourceElement.getNextElements().add(newElementInPreviousGraph);
		ElementMapping newNextElementMapping = new ElementMappingImpl();
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
		for (Element nextSingleElement : getNextElements()) {
			copyNextElementToPreviousGraphs(nextSingleElement, recursive);
		}
	}

	@Override
	public void isValid(boolean isDefinedPattern)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValidLocal(isDefinedPattern);
		for (Element next : getNextElements())
			next.isValid(isDefinedPattern);
		for (BooleanOperator predicate : getPredicates())
			predicate.isValid(isDefinedPattern);
		if (!eIsSet(GraphstructurePackage.ELEMENT__ROOT))
			relationFromPrevious.isValid(isDefinedPattern);
		
		if(getPreviousElement() != null) {
			for(ElementMapping mapping : getMappingTo()) {
				if(!mapping.getTo().getPreviousElement().getMappingFrom().getFrom().equals(getPreviousElement())) {
					throw new InvalidityException("mapping invalid");
				}
			}
		}
	}

	@Override
	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {	
		CountPattern countPattern = null;				
		try {
			countPattern = (CountPattern) getAncestor(CountPattern.class);
		} catch (MissingPatternContainerException e) {
			// do nothing
		}
	
		if (getGraphDepth() == 0 && mappingFrom != null && countPattern == null) // depth=0 => ReturnGraph
			throw new InvalidityException("invalid SingleElementMapping to returnGraph: " + mappingFrom + " "
					+ mappingFrom.getId() + " - (" + mappingTo + ")");
			
		if (!eIsSet(GraphstructurePackage.ELEMENT__ROOT)
				&& !eIsSet(GraphstructurePackage.ELEMENT__PREVIOUS_ELEMENT))
			throw new InvalidityException("previousElement null at SingleElement " + getId());
		if (eIsSet(GraphstructurePackage.ELEMENT__ROOT)
				&& eIsSet(GraphstructurePackage.ELEMENT__PREVIOUS_ELEMENT))
			throw new InvalidityException("root has previous Element");
		if (!eIsSet(GraphstructurePackage.ELEMENT__ROOT)
				&& !eIsSet(GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS))
			throw new InvalidityException("relation not specified");
		if (isRootElement() && getRelationFromPrevious() != null)
			throw new InvalidityException("relation specified for root element");

		if(getPreviousElement() == null && getRoot() == null) {
			throw new InvalidityException("missing previous element or root graph");
		}
		if(isRootElement() && !getPredicates().isEmpty()) {
			throw new InvalidityException("root has predicate");
		}
		
		for (Element next : getNextElements()) {
			if (next == null)
				throw new InvalidityException("nextElement null (" + next + ")");
			if (next.getPreviousElement() == null || !next.getPreviousElement().equals(this))
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
			if (getPreviousElement() != null)
				return getPreviousElement().getGraphDepth();
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
			return ".";
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
	public EList<Element> getAllArgumentElements() {
		EList<Element> list = new BasicEList<Element>();
		list.add(this);
		return list;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphstructurePackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comparison> getComparison1() {
		if (comparison1 == null) {
			comparison1 = new EObjectWithInverseResolvingEList<Comparison>(Comparison.class, this, GraphstructurePackage.ELEMENT__COMPARISON1, OperatorsPackage.COMPARISON__ARGUMENT1);
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
			comparison2 = new EObjectWithInverseResolvingEList<Comparison>(Comparison.class, this, GraphstructurePackage.ELEMENT__COMPARISON2, OperatorsPackage.COMPARISON__ARGUMENT2);
		}
		return comparison2;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementMapping getMappingFrom() {
		if (mappingFrom != null && mappingFrom.eIsProxy()) {
			InternalEObject oldMappingFrom = (InternalEObject)mappingFrom;
			mappingFrom = (ElementMapping)eResolveProxy(oldMappingFrom);
			if (mappingFrom != oldMappingFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphstructurePackage.ELEMENT__MAPPING_FROM, oldMappingFrom, mappingFrom));
			}
		}
		return mappingFrom;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ElementMapping basicGetMappingFrom() {
		return mappingFrom;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappingFrom(ElementMapping newMappingFrom, NotificationChain msgs) {
		ElementMapping oldMappingFrom = mappingFrom;
		mappingFrom = newMappingFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.ELEMENT__MAPPING_FROM, oldMappingFrom, newMappingFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMappingFrom(ElementMapping newMappingFrom) {
		if (newMappingFrom != mappingFrom) {
			NotificationChain msgs = null;
			if (mappingFrom != null)
				msgs = ((InternalEObject)mappingFrom).eInverseRemove(this, PatternstructurePackage.ELEMENT_MAPPING__TO, ElementMapping.class, msgs);
			if (newMappingFrom != null)
				msgs = ((InternalEObject)newMappingFrom).eInverseAdd(this, PatternstructurePackage.ELEMENT_MAPPING__TO, ElementMapping.class, msgs);
			msgs = basicSetMappingFrom(newMappingFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.ELEMENT__MAPPING_FROM, newMappingFrom, newMappingFrom));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementMapping> getMappingTo() {
		if (mappingTo == null) {
			mappingTo = new EObjectWithInverseResolvingEList<ElementMapping>(ElementMapping.class, this, GraphstructurePackage.ELEMENT__MAPPING_TO, PatternstructurePackage.ELEMENT_MAPPING__FROM);
		}
		return mappingTo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Graph getRoot() {
		if (eContainerFeatureID() != GraphstructurePackage.ELEMENT__ROOT) return null;
		return (Graph)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public NotificationChain basicSetRoot(Graph newRoot, NotificationChain msgs) {
		if(newRoot != null) {
			for(Morphism morphism : newRoot.getMorphismTo()) {
				Graph nextGraph = morphism.getTo();
				Element newElementInNextGraph = new ElementImpl();
				nextGraph.setRootElement(newElementInNextGraph);
				if(this.getGraph() != null) {
					nextGraph.getReturnElements().add(newElementInNextGraph);
				}
				ElementMapping newNextElementMapping = new ElementMappingImpl();	
				newNextElementMapping.setFrom(this);
				newNextElementMapping.setTo(newElementInNextGraph);
				morphism.getMappings().add(newNextElementMapping);				
					
				try {
					copyNextElementsToNextGraphs();
				} catch (MissingPatternContainerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
		}
		
		updateParameters(newRoot.getParameterList());
		updateOperators(newRoot.getOperatorList());
		
		if (getRelationFromPrevious() != null) {
			setRelationFromPrevious(null);
		}
		
		if(getMappingFrom() != null) {
			removeElementFromPreviousGraphs();
		}

		msgs = eBasicSetContainer((InternalEObject) newRoot, GraphstructurePackage.ELEMENT__ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoot(Graph newRoot) {
		if (newRoot != eInternalContainer() || (eContainerFeatureID() != GraphstructurePackage.ELEMENT__ROOT && newRoot != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.ELEMENT__ROOT, newRoot, newRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getNextElements() {
		if (nextElements == null) {
			nextElements = new EObjectContainmentWithInverseEList<Element>(Element.class, this, GraphstructurePackage.ELEMENT__NEXT_ELEMENTS, GraphstructurePackage.ELEMENT__PREVIOUS_ELEMENT);
		}
		return nextElements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getPreviousElement() {
		if (eContainerFeatureID() != GraphstructurePackage.ELEMENT__PREVIOUS_ELEMENT) return null;
		return (Element)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreviousElement(Element newPreviousElement) {
		if (newPreviousElement != eInternalContainer() || (eContainerFeatureID() != GraphstructurePackage.ELEMENT__PREVIOUS_ELEMENT && newPreviousElement != null)) {
			if (EcoreUtil.isAncestor(this, newPreviousElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPreviousElement != null)
				msgs = ((InternalEObject)newPreviousElement).eInverseAdd(this, GraphstructurePackage.ELEMENT__NEXT_ELEMENTS, Element.class, msgs);
			msgs = basicSetPreviousElement(newPreviousElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.ELEMENT__PREVIOUS_ELEMENT, newPreviousElement, newPreviousElement));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public NotificationChain basicSetPreviousElement(Element newPrevious, NotificationChain msgs) {
//		clearComparisonRecursively();
//		clearPropertyRecursively();		
		
		if(newPrevious != null) {
			updateParameters(newPrevious.getParameterList());
			updateOperators(newPrevious.getOperatorList());
		}
		
//		clearMatchRecursively();
		removeFromReturnElementsRecursively();
//		clearPredicatesRecursively();
		if (getRelationFromPrevious() != null) {
			getRelationFromPrevious().removeRelationFromPreviousGraphs();
			getRelationFromPrevious().removeMappingsToNext();
			getRelationFromPrevious().removeParametersFromParameterList();
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
		msgs = eBasicSetContainer((InternalEObject) newPrevious, GraphstructurePackage.ELEMENT__PREVIOUS_ELEMENT, msgs);
		if(newPrevious != null) {
			setRelationFromPrevious(new RelationImpl());
		}
		return msgs;
	}

	public void removeFromReturnElementsRecursively() {
		setGraph(null);
		for (Element child : getNextElements()) {
			child.removeFromReturnElementsRecursively();
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

	private void removeMappingsToNext() {
		EList<ElementMapping> mappingToCopy = new BasicEList<ElementMapping>();
		mappingToCopy.addAll(getMappingTo());
		for (ElementMapping mapping : mappingToCopy) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.ELEMENT__NAME, oldName, name));
	
		if (getMappingFrom() != null) {
			Element se = getMappingFrom().getFrom();
			if (newName != null && !newName.equals(se.getName()))
				se.setName(newName);
		}
		for (ElementMapping m : getMappingTo()) {
			if (m.getTo() != null) {
				Element se = m.getTo();
				if (newName != null && !newName.equals(se.getName())) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.ELEMENT__TRANSLATED, oldTranslated, translated));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.ELEMENT__PREDICATES_ARE_BEING_TRANSLATED, oldPredicatesAreBeingTranslated, predicatesAreBeingTranslated));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS, oldRelationFromPrevious, newRelationFromPrevious);
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
				msgs = ((InternalEObject)relationFromPrevious).eInverseRemove(this, GraphstructurePackage.RELATION__ELEMENT, Relation.class, msgs);
			if (newRelationFromPrevious != null)
				msgs = ((InternalEObject)newRelationFromPrevious).eInverseAdd(this, GraphstructurePackage.RELATION__ELEMENT, Relation.class, msgs);
			msgs = basicSetRelationFromPrevious(newRelationFromPrevious, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS, newRelationFromPrevious, newRelationFromPrevious));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentWithInverseEList<Property>(Property.class, this, GraphstructurePackage.ELEMENT__PROPERTIES, GraphstructurePackage.PROPERTY__ELEMENT);
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
			predicates = new EObjectWithInverseResolvingEList.ManyInverse<BooleanOperator>(BooleanOperator.class, this, GraphstructurePackage.ELEMENT__PREDICATES, OperatorsPackage.BOOLEAN_OPERATOR__ELEMENTS);
		}
		return predicates;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphstructurePackage.ELEMENT__GRAPH, oldGraph, graph));
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
					GraphstructurePackage.ELEMENT__GRAPH, oldGraph, newGraph);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	private void setGraphForCorrespondingElements(Graph newGraph) {
		for (ElementMapping mapping : getMappingTo()) {
//			PatternElement elem;
//			try {
//				elem = mapping.getMorphism().getContainer();
//			} catch (MissingPatternContainerException e1) {
//				elem = null;
//			}
//			if (!( elem instanceof CountPattern)) {
			if (!( mapping.getMorphism().getMorphismContainer() instanceof CountPattern)) {
				Element element = mapping.getTo();
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
		if (getMappingFrom() != null && !(getMappingFrom().getMorphism().getMorphismContainer() instanceof CountPattern)) {

//			PatternElement elem;
//			try {
//				elem = getMappingFrom().getMorphism().getContainer();
//			} catch (MissingPatternContainerException e1) {
//				elem = null;
//			}
//			if (!(elem instanceof CountPattern)) {
			
			Element element = getMappingFrom().getFrom();
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
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.ELEMENT__GRAPH, newGraph, newGraph));
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

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphstructurePackage.ELEMENT__COMPARISON1:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComparison1()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.ELEMENT__COMPARISON2:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComparison2()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.ELEMENT__MAPPING_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMappingTo()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.ELEMENT__MAPPING_FROM:
				if (mappingFrom != null)
					msgs = ((InternalEObject)mappingFrom).eInverseRemove(this, PatternstructurePackage.ELEMENT_MAPPING__TO, ElementMapping.class, msgs);
				return basicSetMappingFrom((ElementMapping)otherEnd, msgs);
			case GraphstructurePackage.ELEMENT__ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRoot((Graph)otherEnd, msgs);
			case GraphstructurePackage.ELEMENT__NEXT_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNextElements()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.ELEMENT__PREVIOUS_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPreviousElement((Element)otherEnd, msgs);
			case GraphstructurePackage.ELEMENT__GRAPH:
				if (graph != null)
					msgs = ((InternalEObject)graph).eInverseRemove(this, GraphstructurePackage.GRAPH__RETURN_ELEMENTS, Graph.class, msgs);
				return basicSetGraph((Graph)otherEnd, msgs);
			case GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS:
				if (relationFromPrevious != null)
					msgs = ((InternalEObject)relationFromPrevious).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS, null, msgs);
				return basicSetRelationFromPrevious((Relation)otherEnd, msgs);
			case GraphstructurePackage.ELEMENT__PROPERTIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProperties()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.ELEMENT__PREDICATES:
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
			case GraphstructurePackage.ELEMENT__COMPARISON1:
				return ((InternalEList<?>)getComparison1()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.ELEMENT__COMPARISON2:
				return ((InternalEList<?>)getComparison2()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.ELEMENT__MAPPING_TO:
				return ((InternalEList<?>)getMappingTo()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.ELEMENT__MAPPING_FROM:
				return basicSetMappingFrom(null, msgs);
			case GraphstructurePackage.ELEMENT__ROOT:
				return basicSetRoot(null, msgs);
			case GraphstructurePackage.ELEMENT__NEXT_ELEMENTS:
				return ((InternalEList<?>)getNextElements()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.ELEMENT__PREVIOUS_ELEMENT:
				return basicSetPreviousElement(null, msgs);
			case GraphstructurePackage.ELEMENT__GRAPH:
				return basicSetGraph(null, msgs);
			case GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS:
				return basicSetRelationFromPrevious(null, msgs);
			case GraphstructurePackage.ELEMENT__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.ELEMENT__PREDICATES:
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
			case GraphstructurePackage.ELEMENT__ROOT:
				return eInternalContainer().eInverseRemove(this, GraphstructurePackage.GRAPH__ROOT_ELEMENT, Graph.class, msgs);
			case GraphstructurePackage.ELEMENT__PREVIOUS_ELEMENT:
				return eInternalContainer().eInverseRemove(this, GraphstructurePackage.ELEMENT__NEXT_ELEMENTS, Element.class, msgs);
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
			case GraphstructurePackage.ELEMENT__COMPARISON1:
				return getComparison1();
			case GraphstructurePackage.ELEMENT__COMPARISON2:
				return getComparison2();
			case GraphstructurePackage.ELEMENT__MAPPING_TO:
				return getMappingTo();
			case GraphstructurePackage.ELEMENT__MAPPING_FROM:
				if (resolve) return getMappingFrom();
				return basicGetMappingFrom();
			case GraphstructurePackage.ELEMENT__ROOT:
				return getRoot();
			case GraphstructurePackage.ELEMENT__NEXT_ELEMENTS:
				return getNextElements();
			case GraphstructurePackage.ELEMENT__PREVIOUS_ELEMENT:
				return getPreviousElement();
			case GraphstructurePackage.ELEMENT__GRAPH:
				if (resolve) return getGraph();
				return basicGetGraph();
			case GraphstructurePackage.ELEMENT__NAME:
				return getName();
			case GraphstructurePackage.ELEMENT__TRANSLATED:
				return isTranslated();
			case GraphstructurePackage.ELEMENT__PREDICATES_ARE_BEING_TRANSLATED:
				return isPredicatesAreBeingTranslated();
			case GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS:
				return getRelationFromPrevious();
			case GraphstructurePackage.ELEMENT__PROPERTIES:
				return getProperties();
			case GraphstructurePackage.ELEMENT__PREDICATES:
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
			case GraphstructurePackage.ELEMENT__COMPARISON1:
				getComparison1().clear();
				getComparison1().addAll((Collection<? extends Comparison>)newValue);
				return;
			case GraphstructurePackage.ELEMENT__COMPARISON2:
				getComparison2().clear();
				getComparison2().addAll((Collection<? extends Comparison>)newValue);
				return;
			case GraphstructurePackage.ELEMENT__MAPPING_TO:
				getMappingTo().clear();
				getMappingTo().addAll((Collection<? extends ElementMapping>)newValue);
				return;
			case GraphstructurePackage.ELEMENT__MAPPING_FROM:
				setMappingFrom((ElementMapping)newValue);
				return;
			case GraphstructurePackage.ELEMENT__ROOT:
				setRoot((Graph)newValue);
				return;
			case GraphstructurePackage.ELEMENT__NEXT_ELEMENTS:
				getNextElements().clear();
				getNextElements().addAll((Collection<? extends Element>)newValue);
				return;
			case GraphstructurePackage.ELEMENT__PREVIOUS_ELEMENT:
				setPreviousElement((Element)newValue);
				return;
			case GraphstructurePackage.ELEMENT__GRAPH:
				setGraph((Graph)newValue);
				return;
			case GraphstructurePackage.ELEMENT__NAME:
				setName((String)newValue);
				return;
			case GraphstructurePackage.ELEMENT__TRANSLATED:
				setTranslated((Boolean)newValue);
				return;
			case GraphstructurePackage.ELEMENT__PREDICATES_ARE_BEING_TRANSLATED:
				setPredicatesAreBeingTranslated((Boolean)newValue);
				return;
			case GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS:
				setRelationFromPrevious((Relation)newValue);
				return;
			case GraphstructurePackage.ELEMENT__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case GraphstructurePackage.ELEMENT__PREDICATES:
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
			case GraphstructurePackage.ELEMENT__COMPARISON1:
				getComparison1().clear();
				return;
			case GraphstructurePackage.ELEMENT__COMPARISON2:
				getComparison2().clear();
				return;
			case GraphstructurePackage.ELEMENT__MAPPING_TO:
				getMappingTo().clear();
				return;
			case GraphstructurePackage.ELEMENT__MAPPING_FROM:
				setMappingFrom((ElementMapping)null);
				return;
			case GraphstructurePackage.ELEMENT__ROOT:
				setRoot((Graph)null);
				return;
			case GraphstructurePackage.ELEMENT__NEXT_ELEMENTS:
				getNextElements().clear();
				return;
			case GraphstructurePackage.ELEMENT__PREVIOUS_ELEMENT:
				setPreviousElement((Element)null);
				return;
			case GraphstructurePackage.ELEMENT__GRAPH:
				setGraph((Graph)null);
				return;
			case GraphstructurePackage.ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GraphstructurePackage.ELEMENT__TRANSLATED:
				setTranslated(TRANSLATED_EDEFAULT);
				return;
			case GraphstructurePackage.ELEMENT__PREDICATES_ARE_BEING_TRANSLATED:
				setPredicatesAreBeingTranslated(PREDICATES_ARE_BEING_TRANSLATED_EDEFAULT);
				return;
			case GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS:
				setRelationFromPrevious((Relation)null);
				return;
			case GraphstructurePackage.ELEMENT__PROPERTIES:
				getProperties().clear();
				return;
			case GraphstructurePackage.ELEMENT__PREDICATES:
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
			case GraphstructurePackage.ELEMENT__COMPARISON1:
				return comparison1 != null && !comparison1.isEmpty();
			case GraphstructurePackage.ELEMENT__COMPARISON2:
				return comparison2 != null && !comparison2.isEmpty();
			case GraphstructurePackage.ELEMENT__MAPPING_TO:
				return mappingTo != null && !mappingTo.isEmpty();
			case GraphstructurePackage.ELEMENT__MAPPING_FROM:
				return mappingFrom != null;
			case GraphstructurePackage.ELEMENT__ROOT:
				return getRoot() != null;
			case GraphstructurePackage.ELEMENT__NEXT_ELEMENTS:
				return nextElements != null && !nextElements.isEmpty();
			case GraphstructurePackage.ELEMENT__PREVIOUS_ELEMENT:
				return getPreviousElement() != null;
			case GraphstructurePackage.ELEMENT__GRAPH:
				return graph != null;
			case GraphstructurePackage.ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GraphstructurePackage.ELEMENT__TRANSLATED:
				return translated != TRANSLATED_EDEFAULT;
			case GraphstructurePackage.ELEMENT__PREDICATES_ARE_BEING_TRANSLATED:
				return predicatesAreBeingTranslated != PREDICATES_ARE_BEING_TRANSLATED_EDEFAULT;
			case GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS:
				return relationFromPrevious != null;
			case GraphstructurePackage.ELEMENT__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case GraphstructurePackage.ELEMENT__PREDICATES:
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
			case GraphstructurePackage.ELEMENT___COPY_NEXT_ELEMENTS_TO_NEXT_GRAPHS:
				try {
					copyNextElementsToNextGraphs();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.ELEMENT___COPY_NEXT_ELEMENT_TO_NEXT_GRAPHS__ELEMENT:
				try {
					copyNextElementToNextGraphs((Element)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.ELEMENT___COPY_NEXT_ELEMENT_TO_PREVIOUS_GRAPHS__ELEMENT_BOOLEAN:
				copyNextElementToPreviousGraphs((Element)arguments.get(0), (Boolean)arguments.get(1));
				return null;
			case GraphstructurePackage.ELEMENT___COPY_NEXT_ELEMENTS_TO_PREVIOUS_GRAPHS__BOOLEAN:
				copyNextElementsToPreviousGraphs((Boolean)arguments.get(0));
				return null;
			case GraphstructurePackage.ELEMENT___IS_ROOT_ELEMENT:
				return isRootElement();
			case GraphstructurePackage.ELEMENT___REMOVE_FROM_RETURN_ELEMENTS_RECURSIVELY:
				removeFromReturnElementsRecursively();
				return null;
			case GraphstructurePackage.ELEMENT___CLEAR_MATCH_RECURSIVELY:
				clearMatchRecursively();
				return null;
			case GraphstructurePackage.ELEMENT___GET_ALL_RELATIONS:
				return getAllRelations();
			case GraphstructurePackage.ELEMENT___CLEAR_PREDICATES_RECURSIVELY:
				clearPredicatesRecursively();
				return null;
			case GraphstructurePackage.ELEMENT___GET_ALL_ELEMENTS:
				return getAllElements();
			case GraphstructurePackage.ELEMENT___GET_ORIGINAL_ID:
				return getOriginalID();
			case GraphstructurePackage.ELEMENT___GET_XQUERY_REPRESENTATION__LOCATION:
				try {
					return getXQueryRepresentation((Location)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.ELEMENT___ADD_PRIMITIVE_MATCH__STRING:
				addPrimitiveMatch((String)arguments.get(0));
				return null;
			case GraphstructurePackage.ELEMENT___ADD_PRIMITIVE_COMPARISON__STRING:
				addPrimitiveComparison((String)arguments.get(0));
				return null;
			case GraphstructurePackage.ELEMENT___GET_XQUERY_VARIABLE:
				return getXQueryVariable();
			case GraphstructurePackage.ELEMENT___ADD_PRIMITIVE_MATCH:
				addPrimitiveMatch();
				return null;
			case GraphstructurePackage.ELEMENT___ADD_PRIMITIVE_COMPARISON:
				addPrimitiveComparison();
				return null;
			case GraphstructurePackage.ELEMENT___GET_GRAPH_DEPTH:
				try {
					return getGraphDepth();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.ELEMENT___GET_ALL_OPERATORS:
				try {
					return getAllOperators();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.ELEMENT___ADD_PRIMITIVE_COMPARISON__PROPERTYLOCATION_STRING_COMPARISONOPERATOR_PARAMETER:
				addPrimitiveComparison((PropertyLocation)arguments.get(0), (String)arguments.get(1), (ComparisonOperator)arguments.get(2), (Parameter)arguments.get(3));
				return null;
			case GraphstructurePackage.ELEMENT___ADD_PRIMITIVE_COMPARISON__PARAMETER:
				addPrimitiveComparison((Parameter)arguments.get(0));
				return null;
			case GraphstructurePackage.ELEMENT___CLEAR_COMPARISON_RECURSIVELY:
				clearComparisonRecursively();
				return null;
			case GraphstructurePackage.ELEMENT___CLEAR_PROPERTY_RECURSIVELY:
				clearPropertyRecursively();
				return null;
			case GraphstructurePackage.ELEMENT___COPY_PROPERTY__PROPERTY:
				return copyProperty((Property)arguments.get(0));
			case GraphstructurePackage.ELEMENT___COPY_PRIMITIVE_COMPARISON__COMPARISON:
				try {
					copyPrimitiveComparison((Comparison)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.ELEMENT___COPY_MATCH__MATCH:
				copyMatch((Match)arguments.get(0));
				return null;
			case GraphstructurePackage.ELEMENT___GET_RETURN_TYPE:
				return getReturnType();
			case GraphstructurePackage.ELEMENT___IS_TRANSLATABLE:
				try {
					return isTranslatable();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.ELEMENT___GET_ALL_ARGUMENT_ELEMENTS:
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
//		res += "Single";
		res += "Element " + getName() + " " + getInternalId();
		for (Property prop : getProperties())
			res += "\n  " + prop.myToString();
		if (getNextElements().size() > 0) {
//			res += "\n[";
			for (Element e : getNextElements()) {
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
		for (Element element : getNextElements()) {
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
			for (Element element : getNextElements()) {
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
	public void prepareTranslation() {
		translated = false;
		for (Element element : getNextElements()) {
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
			CompletePattern completePattern = (CompletePattern) getAncestor(CompletePattern.class);
			ParameterList varlist = completePattern.getParameterList();
			Graph graph = (Graph) getAncestor(Graph.class);
			OperatorList oplist = graph.getOperatorList();
			
			Property property = new PropertyImpl();			
			getProperties().add(property);
			property.createParameters();
	
			UnknownParameterValue unknownParameterValue = new UnknownParameterValueImpl();
			varlist.add(unknownParameterValue);
	
			oplist.add(comparison);	
			comparison.createParameters();
			comparison.setArgument1(property);
			comparison.setArgument2(unknownParameterValue);						
			
		} catch (Exception e) {			
			System.out.println("Adding Condition Failed: " + e.getMessage());		
			e.printStackTrace();
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
			CompletePattern completePattern = (CompletePattern) getAncestor(CompletePattern.class);
			ParameterList varlist = completePattern.getParameterList();
			Graph graph = (Graph) getAncestor(Graph.class);
			OperatorList oplist = graph.getOperatorList();
			
			Property property = new PropertyImpl();
			getProperties().add(property);
			property.createParameters();
			property.getOption().setValue(PropertyLocation.TAG);
			
			TextLiteralParamImpl textlit = new TextLiteralParamImpl();
			varlist.add(textlit);
			textlit.setValue(value);
	
			oplist.add(comparison);	
			comparison.createParameters();
			comparison.setArgument1(property);
			comparison.setArgument2(textlit);			
		} catch (Exception e) {
			System.out.println("Adding Condition Failed: " + e.getMessage());
			e.printStackTrace();
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
			CompletePattern completePattern = (CompletePattern) getAncestor(CompletePattern.class);
			ParameterList varlist = completePattern.getParameterList();
			Graph graph = (Graph) getAncestor(Graph.class);
			OperatorList oplist = graph.getOperatorList();
			
			Property property = new PropertyImpl();			
			getProperties().add(property);
			property.createParameters();
			property.getOption().setValue(PropertyLocation.TAG);
			
			varlist.add(parameter);
	
			oplist.add(comparison);	
			comparison.createParameters();
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
			CompletePattern completePattern = (CompletePattern) getAncestor(CompletePattern.class);
			ParameterList varlist = completePattern.getParameterList();
			Graph graph = (Graph) getAncestor(Graph.class);
			OperatorList oplist = graph.getOperatorList();
			Property property1 = new PropertyImpl();			
			getProperties().add(property1);
			property1.createParameters();
			property1.getOption().setValue(property);
			property1.getAttributeName().setValue(attr);
			
			varlist.add(parameter);
	
			oplist.add(comparison);	
			comparison.createParameters();
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
	public EList<Element> getAllElements() {
		EList<Element> result = new BasicEList<Element>();
		for(Element next : getNextElements()) {
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
		for(Element next : getNextElements()) {
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
				CompletePattern completePattern = (CompletePattern) getAncestor(CompletePattern.class);
				ParameterList varlist = completePattern.getParameterList();
				Graph graph = (Graph) getAncestor(Graph.class);
				OperatorList oplist = graph.getOperatorList();
				
				Property property = new PropertyImpl();
				getProperties().add(property);
				property.createParameters();
				
	//			TextLiteralImpl textlit = new TextLiteralImpl();
	//			varlist.add(textlit);
	//			textlit.setValue(regex);
	
				oplist.add(match);	
				match.createParameters();
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

	@Override
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
		for(Element child : getNextElements()) {
			child.clearComparisonRecursively();
		}
	}

	@Override
	public void clearMatchRecursively() {
		for(Property p : getProperties()) {
			p.getMatch().clear();
		}
		for(Element child : getNextElements()) {
			child.clearMatchRecursively();
		}
		
	}

	public void clearPropertyRecursively() {
		for(Property p : getProperties()) {
			p.reset();			
		}
		for(Element child : getNextElements()) {
			child.clearPropertyRecursively();
		}
	}
	
	@Override
	public void updateParameters(ParameterList newParameterList) {
		for(Property p : getProperties()) {
			p.updateParameters(newParameterList);			
		}
		for(Element child : getNextElements()) {
			child.updateParameters(newParameterList);
		}
		for(BooleanOperator predicate : getPredicates()) {
			predicate.updateParameters(newParameterList);
		}
		if(getRelationFromPrevious() != null) {
			getRelationFromPrevious().updateParameters(newParameterList);
		}
	}
	
	@Override
	public void updateOperators(OperatorList newOperatorList) {
		for(Element child : getNextElements()) {
			child.updateOperators(newOperatorList);
		}
		for(BooleanOperator predicate : getPredicates()) {
			predicate.updateOperators(newOperatorList);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Property copyProperty(Property property) {
		Property newProperty = property.copy();	
		getProperties().add(newProperty);		
		return newProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * @generated NOT
	 */
	@Override
	public void copyPrimitiveComparison(Comparison comparison) throws InvalidityException {
		if(!(comparison.getArgument1() instanceof Property) && !(comparison.getArgument2() instanceof Property)) {			
			throw new InvalidityException("comparison not primitive");
		}
		if(!(comparison.getArgument1() instanceof Parameter) && !(comparison.getArgument2() instanceof Parameter)) {			
			throw new InvalidityException("comparison not primitive");
		}
		Comparison newComparison = comparison.copy();
		if(comparison.getArgument1() instanceof Property) {
			Property property = (Property) comparison.getArgument1();
			Property newProperty = copyProperty(property);
			getProperties().add(newProperty);	
			newComparison.setArgument1(newProperty);
		} else {
			newComparison.setArgument1(comparison.getArgument1());
		}
		if(comparison.getArgument2() instanceof Property) {
			Property property = (Property) comparison.getArgument2();
			Property newProperty = copyProperty(property);
			getProperties().add(newProperty);
			newComparison.setArgument2(newProperty);
		} else {
			newComparison.setArgument2(comparison.getArgument2());
		}		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void copyMatch(Match match) {
		Match newMatch = match.copy();
		getProperties().add(newMatch.getProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public ReturnType getReturnType() {
		return ReturnType.ELEMENT;
	}

	public void clearPredicatesRecursively() {
		getPredicates().clear();
		for(Element child : getNextElements()) {
			child.clearPredicatesRecursively();
		}
	}

} // SingleElementImpl
