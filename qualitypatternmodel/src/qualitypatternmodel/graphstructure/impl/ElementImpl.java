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

import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlRoot;
import qualitypatternmodel.adaptionxml.impl.XmlElementImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Property;
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
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.ElementMapping;
import qualitypatternmodel.patternstructure.Morphism;
import qualitypatternmodel.patternstructure.MorphismContainer;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.impl.ElementMappingImpl;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Single
 * Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getComparison1 <em>Comparison1</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getComparison2 <em>Comparison2</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getOutgoingMappings <em>Outgoing Mappings</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getIncomingMapping <em>Incoming Mapping</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getGraph <em>Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getResultOf <em>Result Of</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#isTranslated <em>Translated</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#isPredicatesAreBeingTranslated <em>Predicates Are Being Translated</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getPredicates <em>Predicates</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getIncoming <em>Incoming</em>}</li>
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
	 * The cached value of the '{@link #getOutgoingMappings() <em>Outgoing Mappings</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOutgoingMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementMapping> outgoingMappings;

	/**
	 * The cached value of the '{@link #getIncomingMapping() <em>Incoming Mapping</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getIncomingMapping()
	 * @generated
	 * @ordered
	 */
	protected ElementMapping incomingMapping;

	/**
	 * The cached value of the '{@link #getResultOf() <em>Result Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultOf()
	 * @generated
	 * @ordered
	 */
	protected Graph resultOf;

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
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> outgoing;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> incoming;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public ElementImpl() {
		super();
	}	

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @throws MissingPatternContainerException
	 * @generated NOT
	 */
	@Override
	public void copyNextElementsToNextGraphs() throws MissingPatternContainerException {
		// TODO: not needed anymore
//		for (Element nextSingleElement : getNextElements()) {
//			copyNextElementToNextGraphs(nextSingleElement);
//		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @throws MissingPatternContainerException
	 * @generated NOT
	 */
	@Override
	public void copyNextElementToNextGraphs(Element nextElement) throws MissingPatternContainerException {
		// TODO: not needed anymore
//		for (ElementMapping mapping : getMappingTo()) {
//			boolean mappingExistsAlready = false;
//			for (ElementMapping nextElementMappingTo : nextElement.getMappingTo()) {
//				if (nextElementMappingTo.getMorphism().equals(mapping.getMorphism())) {
//					mappingExistsAlready = true;
//				}
//			}
//			if (!mappingExistsAlready) {
//				Element newElementInNextGraph = new ElementImpl();
//				mapping.getTo().getNextElements().add(newElementInNextGraph);
//
//				if (nextElement.getGraph() != null) {
//					Graph nextGraph = mapping.getMorphism().getTo();
//					nextGraph.getReturnElements().add(newElementInNextGraph);
//				}
//
//				ElementMapping newNextElementMapping = new ElementMappingImpl();
//				mapping.getMorphism().getMappings().add(newNextElementMapping);
//				newNextElementMapping.setFrom(nextElement);
//				newNextElementMapping.setTo(newElementInNextGraph);
//
//				if (nextElement.getRelationFromPrevious() != null) {
//					RelationMapping newRelationMapping = new RelationMappingImpl();
//					mapping.getMorphism().getMappings().add(newRelationMapping);
//					newRelationMapping.setFrom(nextElement.getRelationFromPrevious());
//					newRelationMapping.setTo(newElementInNextGraph.getRelationFromPrevious());
//				}
//
//			}
//			nextElement.copyNextElementsToNextGraphs();
//		}
	}
	
	private void removeElementFromPreviousGraphs() {

		if (getIncomingMapping() != null && getIncomingMapping().getSource() != null) {
			Element correspondingPreviousElement = getIncomingMapping().getSource();
			correspondingPreviousElement.setGraph(null);
		}

//		getIncomingMapping().getMorphism().getMappings().remove(getIncomingMapping());
//		correspondingPreviousElement.setPreviousElement(null);
//		correspondingPreviousElement.setRoot(null);
////		getMappingFrom().getMorphism().getMappings().remove(getMappingFrom());
//		EList<Element> nextSingleElementsCopy = new BasicEList<Element>();
//		nextSingleElementsCopy.addAll(getNextElements());
//		for (Element element : nextSingleElementsCopy) {
//			element.setPreviousElement(null);
//		}
//		if (getRelationFromPrevious() != null && getRelationFromPrevious().getMappingFrom() != null) {
//			getRelationFromPrevious().getMappingFrom().getMorphism().getMappings()
//					.remove(getRelationFromPrevious().getMappingFrom());
//		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void copyNextElementToPreviousGraphs(Element nextElement, boolean recursive) {
		// TODO: still needed?
//		Element newElementInPreviousGraph = new ElementImpl();
//		ElementMapping mapping = getMappingFrom();
//		Element sourceElement = mapping.getFrom();
//		sourceElement.getNextElements().add(newElementInPreviousGraph);
//		ElementMapping newNextElementMapping = new ElementMappingImpl();
//		mapping.getMorphism().getMappings().add(newNextElementMapping);
//		newNextElementMapping.setFrom(newElementInPreviousGraph);
//		newNextElementMapping.setTo(nextElement);
//		if (nextElement.getRelationFromPrevious() != null) {
//			RelationMapping newRelationMapping = new RelationMappingImpl();
//			mapping.getMorphism().getMappings().add(newRelationMapping);
//			newRelationMapping.setFrom(newElementInPreviousGraph.getRelationFromPrevious());
//			newRelationMapping.setTo(nextElement.getRelationFromPrevious());
//		}
//		nextElement.copyNextElementsToPreviousGraphs(recursive);
//		if (recursive) {
//			sourceElement.copyNextElementToPreviousGraphs(newElementInPreviousGraph, recursive);
//		}

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void copyNextElementsToPreviousGraphs(boolean recursive) {
		// TODO: still needed?
//		for (Element nextSingleElement : getNextElements()) {
//			copyNextElementToPreviousGraphs(nextSingleElement, recursive);
//		}
	}

	@Override
	public void isValid(AbstractionLevel abstractionLevel)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValidLocal(abstractionLevel);
//		for (Element next : getNextElements())
//			next.isValid(isDefinedPattern);
		for (BooleanOperator predicate : getPredicates())
			predicate.isValid(abstractionLevel);
//		if (!eIsSet(GraphstructurePackage.ELEMENT__ROOT))
//			relationFromPrevious.isValid(isDefinedPattern);
		
	}

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {	
//		CountPattern countPattern = null;				
//		try {
//			countPattern = (CountPattern) getAncestor(CountPattern.class);
//		} catch (MissingPatternContainerException e) {
//			// do nothing
//		}
	
		if (getGraph().getPattern() != null && getGraph().getPattern() instanceof CompletePattern && incomingMapping != null) // depth=0 => ReturnGraph
			throw new InvalidityException("invalid ElementMapping to returnGraph: " + incomingMapping + " "
					+ incomingMapping.getId() + " - (" + outgoingMappings + ")");
			
//		if (!eIsSet(GraphstructurePackage.ELEMENT__ROOT)
//				&& !eIsSet(GraphstructurePackage.ELEMENT__PREVIOUS_ELEMENT))
//			throw new InvalidityException("previousElement null at SingleElement " + getId());
//		if (eIsSet(GraphstructurePackage.ELEMENT__ROOT)
//				&& eIsSet(GraphstructurePackage.ELEMENT__PREVIOUS_ELEMENT))
//			throw new InvalidityException("root has previous Element");
//		if (!eIsSet(GraphstructurePackage.ELEMENT__ROOT)
//				&& !eIsSet(GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS))
//			throw new InvalidityException("relation not specified");
//		if (isRootElement() && getRelationFromPrevious() != null)
//			throw new InvalidityException("relation specified for root element");
//
//		if(getPreviousElement() == null && getRoot() == null) {
//			throw new InvalidityException("missing previous element or root graph");
//		}
//		if(isRootElement() && !getPredicates().isEmpty()) {
//			throw new InvalidityException("root has predicate");
//		}
		
//		for (Element next : getNextElements()) {
//			if (next == null)
//				throw new InvalidityException("nextElement null (" + next + ")");
//			if (next.getPreviousElement() == null || !next.getPreviousElement().equals(this))
//				throw new InvalidityException("nextElement not valid (" + next + ")");
//		}
		for (BooleanOperator predicate : getPredicates())
			if (predicate == null)
				throw new InvalidityException("predicate null (" + predicate + ")");
		
		if(abstractionLevel == AbstractionLevel.GENERIC) {
			for(Property property : getProperties()) {
				if(!property.getClass().equals(PropertyImpl.class)) {
					throw new InvalidityException("Generic pattern contains non-generic class (" + getInternalId() + ")");
				}
			}
		} else {
			for(Property property : getProperties()) {
				if(property.getClass().equals(PropertyImpl.class)) {
					throw new InvalidityException("Non-generic pattern contains Property (" + getInternalId() + ")");
				}
				
			}			
		}
		
	}

	@Override
	public PatternElement createXMLAdaption() {
		EList<Property> propertiesCopy = new BasicEList<Property>();
		propertiesCopy.addAll(getProperties());
		for(Property property : propertiesCopy) {
			property.createXMLAdaption();
		}
		if(!(this instanceof XmlElement) && !(this instanceof XmlRoot)) {
			XmlElement xmlElement = new XmlElementImpl();
			xmlElement.setGraphSimple(getGraph());	
			xmlElement.setName(getName());
			
//			for(ElementMapping mapping : xmlElement.getMappingTo()) {
//				mapping.getTo().setGraph(null);
//			}
//			xmlElement.getMappingTo().clear();
			
			xmlElement.setResultOf(getResultOf());
			xmlElement.getPredicates().addAll(getPredicates());
			getPredicates().clear();
			xmlElement.getOutgoingMappings().addAll(getOutgoingMappings());
			getOutgoingMappings().clear();
			xmlElement.setIncomingMapping(getIncomingMapping());
			setIncomingMapping(null);
			setResultOf(null);
			setGraph(null);
			EList<Relation> outgoingCopy = new BasicEList<Relation>();
			outgoingCopy.addAll(getOutgoing());
			for(Relation relation : outgoingCopy) {
				relation.setSource(xmlElement);
			}
			EList<Relation> incomingCopy = new BasicEList<Relation>();
			incomingCopy.addAll(getIncoming());
			for(Relation relation : incomingCopy) {
				relation.setTarget(xmlElement);
			}
			xmlElement.getComparison1().addAll(getComparison1());
			getComparison1().clear();
			xmlElement.getComparison2().addAll(getComparison2());
			getComparison2().clear();	
			EList<Property> propertiesCopy2 = new BasicEList<Property>();
			propertiesCopy2.addAll(getProperties());
			for(Property property : propertiesCopy2) {
				property.setElement(xmlElement);
			}		
			return xmlElement;
		}
		return this;		
		
	}
	
	@Override
	public boolean isTranslatable() {
		return translated;
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
	public ElementMapping getIncomingMapping() {
		if (incomingMapping != null && incomingMapping.eIsProxy()) {
			InternalEObject oldIncomingMapping = (InternalEObject)incomingMapping;
			incomingMapping = (ElementMapping)eResolveProxy(oldIncomingMapping);
			if (incomingMapping != oldIncomingMapping) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphstructurePackage.ELEMENT__INCOMING_MAPPING, oldIncomingMapping, incomingMapping));
			}
		}
		return incomingMapping;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ElementMapping basicGetIncomingMapping() {
		return incomingMapping;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomingMapping(ElementMapping newIncomingMapping, NotificationChain msgs) {
		ElementMapping oldIncomingMapping = incomingMapping;
		incomingMapping = newIncomingMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.ELEMENT__INCOMING_MAPPING, oldIncomingMapping, newIncomingMapping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncomingMapping(ElementMapping newIncomingMapping) {
		if (newIncomingMapping != incomingMapping) {
			NotificationChain msgs = null;
			if (incomingMapping != null)
				msgs = ((InternalEObject)incomingMapping).eInverseRemove(this, PatternstructurePackage.ELEMENT_MAPPING__TARGET, ElementMapping.class, msgs);
			if (newIncomingMapping != null)
				msgs = ((InternalEObject)newIncomingMapping).eInverseAdd(this, PatternstructurePackage.ELEMENT_MAPPING__TARGET, ElementMapping.class, msgs);
			msgs = basicSetIncomingMapping(newIncomingMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.ELEMENT__INCOMING_MAPPING, newIncomingMapping, newIncomingMapping));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementMapping> getOutgoingMappings() {
		if (outgoingMappings == null) {
			outgoingMappings = new EObjectWithInverseResolvingEList<ElementMapping>(ElementMapping.class, this, GraphstructurePackage.ELEMENT__OUTGOING_MAPPINGS, PatternstructurePackage.ELEMENT_MAPPING__SOURCE);
		}
		return outgoingMappings;
	}

//	/**
//	 * <!-- begin-user-doc --> <!-- end-user-doc -->
//	 * 
//	 * @generated NOT
//	 */
//	public NotificationChain basicSetRoot(Graph newRoot, NotificationChain msgs) {
//		if(newRoot != null) {
//			for(Morphism morphism : newRoot.getMorphismTo()) {
//				Graph nextGraph = morphism.getTo();
//				Element newElementInNextGraph = new ElementImpl();
//				nextGraph.setRootElement(newElementInNextGraph);
//				if(this.getGraph() != null) {
//					nextGraph.getReturnElements().add(newElementInNextGraph);
//				}
//				ElementMapping newNextElementMapping = new ElementMappingImpl();	
//				newNextElementMapping.setFrom(this);
//				newNextElementMapping.setTo(newElementInNextGraph);
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
//		
//		updateParameters(newRoot.getParameterList());
//		updateOperators(newRoot.getOperatorList());
//		
//		if (getRelationFromPrevious() != null) {
//			setRelationFromPrevious(null);
//		}
//		
//		if(getMappingFrom() != null) {
//			removeElementFromPreviousGraphs();
//		}
//
//		msgs = eBasicSetContainer((InternalEObject) newRoot, GraphstructurePackage.ELEMENT__ROOT, msgs);
//		return msgs;
//	}

//	/**
//	 * <!-- begin-user-doc --> <!-- end-user-doc -->
//	 * 
//	 * @generated NOT
//	 */
//	public NotificationChain basicSetPreviousElement(Element newPrevious, NotificationChain msgs) {
////		clearComparisonRecursively();
////		clearPropertyRecursively();		
//		
//		if(newPrevious != null) {
//			updateParameters(newPrevious.getParameterList());
//			updateOperators(newPrevious.getOperatorList());
//		}
//		
////		clearMatchRecursively();
//		removeFromReturnElementsRecursively();
////		clearPredicatesRecursively();
//		if (getRelationFromPrevious() != null) {
//			getRelationFromPrevious().removeRelationFromPreviousGraphs();
//			getRelationFromPrevious().removeMappingsToNext();
//			getRelationFromPrevious().removeParametersFromParameterList();
//			setRelationFromPrevious(null);
//		}
//		removeMappingsToNext();
//		if (newPrevious != null) {
//			try {
//				newPrevious.copyNextElementToNextGraphs(this);
//			} catch (MissingPatternContainerException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		if (getMappingFrom() != null) {
//			removeElementFromPreviousGraphs();
//		}		
//		msgs = eBasicSetContainer((InternalEObject) newPrevious, GraphstructurePackage.ELEMENT__PREVIOUS_ELEMENT, msgs);
//		if(newPrevious != null) {
//			setRelationFromPrevious(new RelationImpl());
//		}
//		return msgs;
//	}

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
		mappingToCopy.addAll(getOutgoingMappings());
		for (ElementMapping mapping : mappingToCopy) {
			mapping.setSource(null);
			mapping.setTarget(null);
			mapping.getMorphism().getMappings().remove(mapping);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.ELEMENT__NAME, oldName, name));
	
		if (getIncomingMapping() != null) {
			Element se = getIncomingMapping().getSource();
			if (newName != null && !newName.equals(se.getName()))
				se.setName(newName);
		}
		for (ElementMapping m : getOutgoingMappings()) {
			if (m.getTarget() != null) {
				Element se = m.getTarget();
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relation> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList<Relation>(Relation.class, this, GraphstructurePackage.ELEMENT__OUTGOING, GraphstructurePackage.RELATION__SOURCE);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relation> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList<Relation>(Relation.class, this, GraphstructurePackage.ELEMENT__INCOMING, GraphstructurePackage.RELATION__TARGET);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Graph getGraph() {
		if (eContainerFeatureID() != GraphstructurePackage.ELEMENT__GRAPH) return null;
		return (Graph)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetGraph(Graph newGraph, NotificationChain msgs) {
		if (newGraph == null || getGraph() != null && !newGraph.equals(getGraph())) {
			removeElementFromPreviousGraphs();
			removeMappingsToNext();
			setResultOf(null);
//			for(BooleanOperator boolOp : getPredicates()) {
//				boolOp.reset();				
//			}
			getPredicates().clear();
		}
		
		deleteRelations(newGraph);
		
		if(newGraph != null) {
			for(Morphism morphism : newGraph.getOutgoingMorphisms()) {
				MorphismContainer container = morphism.getMorphismContainer();
				Element newElement = new ElementImpl();
				newElement.setGraph(container.getGraph());
				ElementMapping newMapping = new ElementMappingImpl();
				newMapping.setMorphism(morphism);
				newMapping.setSource(this);
				newMapping.setTarget(newElement);
			}		
		}
		
		// TODO: reset incoming and outgoing ?
		
		msgs = eBasicSetContainer((InternalEObject)newGraph, GraphstructurePackage.ELEMENT__GRAPH, msgs);
		return msgs;
	}
	
	private void deleteRelations(Graph newGraph) {
		EList<Relation> relations = new BasicEList<Relation>();
		relations.addAll(getIncoming());
		relations.addAll(getOutgoing());
		for (Relation rel : relations) {
			if(rel.getGraph() != null && !rel.getGraph().equals(newGraph)) {
				rel.setGraph(null);			
			}
		}
	}
	
	public NotificationChain basicSetGraphSimple(Graph newGraph, NotificationChain msgs) {
//		if (getMappingFrom() != null) {
//			removeElementFromPreviousGraphs();
//		}
//		
//		if(newGraph != null) {
//			for(Morphism morphism : newGraph.getMorphismTo()) {
//				MorphismContainer container = morphism.getMorphismContainer();
//				Element newElement = new ElementImpl();
//				newElement.setGraph(container.getGraph());
//				ElementMapping newMapping = new ElementMappingImpl();
//				newMapping.setMorphism(morphism);
//				newMapping.setFrom(this);
//				newMapping.setTo(newElement);
//			}		
//		}
		
//		setResultOf(null);
		
//		removeMappingsToNext();
		
		// TODO: reset incoming and outgoing ?
		
		msgs = eBasicSetContainer((InternalEObject)newGraph, GraphstructurePackage.ELEMENT__GRAPH, msgs);
		return msgs;
	}

	private void setGraphForCorrespondingElements(Graph newGraph) {
		for (ElementMapping mapping : getOutgoingMappings()) {
//			PatternElement elem;
//			try {
//				elem = mapping.getMorphism().getContainer();
//			} catch (MissingPatternContainerException e1) {
//				elem = null;
//			}
//			if (!( elem instanceof CountPattern)) {
			if (!( mapping.getMorphism().getMorphismContainer() instanceof CountPattern)) {
				Element element = mapping.getTarget();
				if (newGraph == null && element.getResultOf() != null) {
					element.setResultOf(null);
				}
				if (newGraph != null && element.getResultOf() == null) {
					element.setResultOf(element.getGraph());
				}
			}			
		}
		if (getIncomingMapping() != null && !(getIncomingMapping().getMorphism().getMorphismContainer() instanceof CountPattern)) {

//			PatternElement elem;
//			try {
//				elem = getMappingFrom().getMorphism().getContainer();
//			} catch (MissingPatternContainerException e1) {
//				elem = null;
//			}
//			if (!(elem instanceof CountPattern)) {
			
			Element element = getIncomingMapping().getSource();
			if (newGraph == null && element.getResultOf() != null) {
				element.setResultOf(null);
			}
			if (newGraph != null && element.getResultOf() == null) {
				element.setResultOf(element.getGraph());
			}		
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGraph(Graph newGraph) {
		if (newGraph != eInternalContainer() || (eContainerFeatureID() != GraphstructurePackage.ELEMENT__GRAPH && newGraph != null)) {
			if (EcoreUtil.isAncestor(this, newGraph))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGraph != null)
				msgs = ((InternalEObject)newGraph).eInverseAdd(this, GraphstructurePackage.GRAPH__ELEMENTS, Graph.class, msgs);
			msgs = basicSetGraph(newGraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.ELEMENT__GRAPH, newGraph, newGraph));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setGraphSimple(Graph newGraph) {
		if (newGraph != eInternalContainer() || (eContainerFeatureID() != GraphstructurePackage.ELEMENT__GRAPH && newGraph != null)) {
			if (EcoreUtil.isAncestor(this, newGraph))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGraph != null)
				msgs = ((InternalEObject)newGraph).eInverseAdd(this, GraphstructurePackage.GRAPH__ELEMENTS, Graph.class, msgs);
			msgs = basicSetGraphSimple(newGraph, msgs);
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
	public Graph getResultOf() {
		if (resultOf != null && resultOf.eIsProxy()) {
			InternalEObject oldResultOf = (InternalEObject)resultOf;
			resultOf = (Graph)eResolveProxy(oldResultOf);
			if (resultOf != oldResultOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphstructurePackage.ELEMENT__RESULT_OF, oldResultOf, resultOf));
			}
		}
		return resultOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph basicGetResultOf() {
		return resultOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetResultOf(Graph newResultOf, NotificationChain msgs) {
		Graph oldResultOf = resultOf;
		resultOf = newResultOf;
		setGraphForCorrespondingElements(newResultOf);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.ELEMENT__RESULT_OF, oldResultOf, newResultOf);
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
	public void setResultOf(Graph newResultOf) {
		if (newResultOf != resultOf) {
			NotificationChain msgs = null;
			if (resultOf != null)
				msgs = ((InternalEObject)resultOf).eInverseRemove(this, GraphstructurePackage.GRAPH__RETURN_ELEMENTS, Graph.class, msgs);
			if (newResultOf != null)
				msgs = ((InternalEObject)newResultOf).eInverseAdd(this, GraphstructurePackage.GRAPH__RETURN_ELEMENTS, Graph.class, msgs);
			msgs = basicSetResultOf(newResultOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.ELEMENT__RESULT_OF, newResultOf, newResultOf));
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
		if (incomingMapping == null)
			return this.getInternalId();
		else
			return incomingMapping.getSource().getOriginalID();
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
			case GraphstructurePackage.ELEMENT__OUTGOING_MAPPINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingMappings()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.ELEMENT__INCOMING_MAPPING:
				if (incomingMapping != null)
					msgs = ((InternalEObject)incomingMapping).eInverseRemove(this, PatternstructurePackage.ELEMENT_MAPPING__TARGET, ElementMapping.class, msgs);
				return basicSetIncomingMapping((ElementMapping)otherEnd, msgs);
			case GraphstructurePackage.ELEMENT__GRAPH:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGraph((Graph)otherEnd, msgs);
			case GraphstructurePackage.ELEMENT__RESULT_OF:
				if (resultOf != null)
					msgs = ((InternalEObject)resultOf).eInverseRemove(this, GraphstructurePackage.GRAPH__RETURN_ELEMENTS, Graph.class, msgs);
				return basicSetResultOf((Graph)otherEnd, msgs);
			case GraphstructurePackage.ELEMENT__PROPERTIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProperties()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.ELEMENT__PREDICATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPredicates()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.ELEMENT__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.ELEMENT__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
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
			case GraphstructurePackage.ELEMENT__OUTGOING_MAPPINGS:
				return ((InternalEList<?>)getOutgoingMappings()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.ELEMENT__INCOMING_MAPPING:
				return basicSetIncomingMapping(null, msgs);
			case GraphstructurePackage.ELEMENT__GRAPH:
				return basicSetGraph(null, msgs);
			case GraphstructurePackage.ELEMENT__RESULT_OF:
				return basicSetResultOf(null, msgs);
			case GraphstructurePackage.ELEMENT__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.ELEMENT__PREDICATES:
				return ((InternalEList<?>)getPredicates()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.ELEMENT__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.ELEMENT__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
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
			case GraphstructurePackage.ELEMENT__GRAPH:
				return eInternalContainer().eInverseRemove(this, GraphstructurePackage.GRAPH__ELEMENTS, Graph.class, msgs);
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
			case GraphstructurePackage.ELEMENT__OUTGOING_MAPPINGS:
				return getOutgoingMappings();
			case GraphstructurePackage.ELEMENT__INCOMING_MAPPING:
				if (resolve) return getIncomingMapping();
				return basicGetIncomingMapping();
			case GraphstructurePackage.ELEMENT__GRAPH:
				return getGraph();
			case GraphstructurePackage.ELEMENT__RESULT_OF:
				if (resolve) return getResultOf();
				return basicGetResultOf();
			case GraphstructurePackage.ELEMENT__NAME:
				return getName();
			case GraphstructurePackage.ELEMENT__TRANSLATED:
				return isTranslated();
			case GraphstructurePackage.ELEMENT__PREDICATES_ARE_BEING_TRANSLATED:
				return isPredicatesAreBeingTranslated();
			case GraphstructurePackage.ELEMENT__PROPERTIES:
				return getProperties();
			case GraphstructurePackage.ELEMENT__PREDICATES:
				return getPredicates();
			case GraphstructurePackage.ELEMENT__OUTGOING:
				return getOutgoing();
			case GraphstructurePackage.ELEMENT__INCOMING:
				return getIncoming();
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
			case GraphstructurePackage.ELEMENT__OUTGOING_MAPPINGS:
				getOutgoingMappings().clear();
				getOutgoingMappings().addAll((Collection<? extends ElementMapping>)newValue);
				return;
			case GraphstructurePackage.ELEMENT__INCOMING_MAPPING:
				setIncomingMapping((ElementMapping)newValue);
				return;
			case GraphstructurePackage.ELEMENT__GRAPH:
				setGraph((Graph)newValue);
				return;
			case GraphstructurePackage.ELEMENT__RESULT_OF:
				setResultOf((Graph)newValue);
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
			case GraphstructurePackage.ELEMENT__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case GraphstructurePackage.ELEMENT__PREDICATES:
				getPredicates().clear();
				getPredicates().addAll((Collection<? extends BooleanOperator>)newValue);
				return;
			case GraphstructurePackage.ELEMENT__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends Relation>)newValue);
				return;
			case GraphstructurePackage.ELEMENT__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends Relation>)newValue);
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
			case GraphstructurePackage.ELEMENT__OUTGOING_MAPPINGS:
				getOutgoingMappings().clear();
				return;
			case GraphstructurePackage.ELEMENT__INCOMING_MAPPING:
				setIncomingMapping((ElementMapping)null);
				return;
			case GraphstructurePackage.ELEMENT__GRAPH:
				setGraph((Graph)null);
				return;
			case GraphstructurePackage.ELEMENT__RESULT_OF:
				setResultOf((Graph)null);
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
			case GraphstructurePackage.ELEMENT__PROPERTIES:
				getProperties().clear();
				return;
			case GraphstructurePackage.ELEMENT__PREDICATES:
				getPredicates().clear();
				return;
			case GraphstructurePackage.ELEMENT__OUTGOING:
				getOutgoing().clear();
				return;
			case GraphstructurePackage.ELEMENT__INCOMING:
				getIncoming().clear();
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
			case GraphstructurePackage.ELEMENT__OUTGOING_MAPPINGS:
				return outgoingMappings != null && !outgoingMappings.isEmpty();
			case GraphstructurePackage.ELEMENT__INCOMING_MAPPING:
				return incomingMapping != null;
			case GraphstructurePackage.ELEMENT__GRAPH:
				return getGraph() != null;
			case GraphstructurePackage.ELEMENT__RESULT_OF:
				return resultOf != null;
			case GraphstructurePackage.ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GraphstructurePackage.ELEMENT__TRANSLATED:
				return translated != TRANSLATED_EDEFAULT;
			case GraphstructurePackage.ELEMENT__PREDICATES_ARE_BEING_TRANSLATED:
				return predicatesAreBeingTranslated != PREDICATES_ARE_BEING_TRANSLATED_EDEFAULT;
			case GraphstructurePackage.ELEMENT__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case GraphstructurePackage.ELEMENT__PREDICATES:
				return predicates != null && !predicates.isEmpty();
			case GraphstructurePackage.ELEMENT__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case GraphstructurePackage.ELEMENT__INCOMING:
				return incoming != null && !incoming.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Adaptable.class) {
			switch (baseOperationID) {
				case GraphstructurePackage.ADAPTABLE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST: return GraphstructurePackage.ELEMENT___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;
				case GraphstructurePackage.ADAPTABLE___CREATE_PARAMETERS: return GraphstructurePackage.ELEMENT___CREATE_PARAMETERS;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case GraphstructurePackage.ELEMENT___CLEAR_MATCH_RECURSIVELY:
				clearMatchRecursively();
				return null;
			case GraphstructurePackage.ELEMENT___CLEAR_PREDICATES_RECURSIVELY:
				clearPredicatesRecursively();
				return null;
			case GraphstructurePackage.ELEMENT___GET_ORIGINAL_ID:
				return getOriginalID();
			case GraphstructurePackage.ELEMENT___ADD_PRIMITIVE_MATCH__STRING:
				addPrimitiveMatch((String)arguments.get(0));
				return null;
			case GraphstructurePackage.ELEMENT___ADD_PRIMITIVE_COMPARISON__STRING:
				addPrimitiveComparison((String)arguments.get(0));
				return null;
			case GraphstructurePackage.ELEMENT___ADD_PRIMITIVE_MATCH:
				addPrimitiveMatch();
				return null;
			case GraphstructurePackage.ELEMENT___ADD_PRIMITIVE_COMPARISON:
				return addPrimitiveComparison();
			case GraphstructurePackage.ELEMENT___GET_ALL_OPERATORS:
				try {
					return getAllOperators();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.ELEMENT___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE:
				addPrimitiveComparison((ComparisonOperator)arguments.get(0), (ParameterValue)arguments.get(1));
				return null;
			case GraphstructurePackage.ELEMENT___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE:
				addPrimitiveComparison((ParameterValue)arguments.get(0));
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
			case GraphstructurePackage.ELEMENT___ADD_NEW_PROPERTY:
				return addNewProperty();
			case GraphstructurePackage.ELEMENT___SET_GRAPH_SIMPLE__GRAPH:
				setGraphSimple((Graph)arguments.get(0));
				return null;
			case GraphstructurePackage.ELEMENT___REMOVE_PARAMETERS_FROM_PARAMETER_LIST:
				removeParametersFromParameterList();
				return null;
			case GraphstructurePackage.ELEMENT___CREATE_PARAMETERS:
				createParameters();
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
		if (getResultOf() != null)
			res += "Return-";
		res += this.getClass().getSimpleName();
		if (getName() != null) res +=  " " + getName();
		res += " [" + getInternalId() + "]";
		for (Property prop : getProperties())
			res += "\n  " + prop.myToString();
		return res;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public EList<Operator> getAllOperators() throws InvalidityException {
		EList<Operator> res = new BasicEList<Operator>();
//		for (Element element : getNextElements()) {
//			res.addAll(element.getAllOperators());
//		}
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
//			if(getRelationFromPrevious() != null) {
//				res.addAll(getRelationFromPrevious().getAllInputs());
//			}
//			for (Element element : getNextElements()) {
//				res.addAll(element.getAllInputs());
//			}
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
	public void prepareTranslation() {
		translated = false;
//		for (Element element : getNextElements()) {
//			element.prepareTranslation();
//		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return 
	 * 
	 * @generated NOT
	 */
	@Override
	public UnknownParameterValue addPrimitiveComparison() {
		try {
			Comparison comparison = new ComparisonImpl();
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
			
			return unknownParameterValue;
			
		} catch (Exception e) {			
			System.out.println("Adding Condition Failed: " + e.getMessage());		
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void addPrimitiveComparison(String value) {
		// TODO: move to XMLElement ?
		Comparison comparison = new ComparisonImpl();		
		try {			
			CompletePattern completePattern = (CompletePattern) getAncestor(CompletePattern.class);
			ParameterList varlist = completePattern.getParameterList();
			Graph graph = getGraph();
			OperatorList oplist = graph.getOperatorList();
			
			Property property = new PropertyImpl();
			getProperties().add(property);
//			property.createParameters();
//			property.getOption().setValue(PropertyLocation.TAG);
			
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
	public void addPrimitiveComparison(ParameterValue parameter) {
		// TODO: move to XMLElement ?
		
		addPrimitiveComparison().concretize(parameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void addPrimitiveComparison(ComparisonOperator operator, ParameterValue parameter) {
		// TODO: move to XMLElement ?
		Comparison comparison = new ComparisonImpl();
		try {		
			CompletePattern completePattern = (CompletePattern) getAncestor(CompletePattern.class);
			ParameterList varlist = completePattern.getParameterList();
			Graph graph = (Graph) getAncestor(Graph.class);
			OperatorList oplist = graph.getOperatorList();
			Property property1 = new PropertyImpl();			
			getProperties().add(property1);
//			property1.createParameters();
//			property1.getOption().setValue(property);
//			property1.getAttributeName().setValue(attr);
			
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
		// TODO: move to XMLElement ?
	//		Match match = new MatchImpl();
	//		Property property = new PropertyImpl();
	//		getPredicates().add(match);
	//		getProperties().add(property);
	//		match.setProperty(property);
			Match match = new MatchImpl();
			try {			
				CompletePattern completePattern = (CompletePattern) getAncestor(CompletePattern.class);
//				ParameterList varlist = completePattern.getParameterList();
				Graph graph = (Graph) getAncestor(Graph.class);
				OperatorList oplist = graph.getOperatorList();
				
				Property property = new PropertyImpl();
				getProperties().add(property);
//				property.createParameters();
				
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
				e.printStackTrace();
			}
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
//		for(Element child : getNextElements()) {
//			child.clearComparisonRecursively();
//		}
	}

	@Override
	public void clearMatchRecursively() {
		for(Property p : getProperties()) {
			p.getMatch().clear();
		}
//		for(Element child : getNextElements()) {
//			child.clearMatchRecursively();
//		}
		
	}

	public void clearPropertyRecursively() {
		// TODO
//		for(Property p : getProperties()) {
//			p.reset();			
//		}
		
//		for(Element child : getNextElements()) {
//			child.clearPropertyRecursively();
//		}
	}
	
	@Override
	public void updateParameters(ParameterList newParameterList) {
		for(Property p : getProperties()) {
			p.updateParameters(newParameterList);			
		}
//		for(Element child : getNextElements()) {
//			child.updateParameters(newParameterList);
//		}
		for(BooleanOperator predicate : getPredicates()) {
			predicate.updateParameters(newParameterList);
		}
//		if(getRelationFromPrevious() != null) {
//			getRelationFromPrevious().updateParameters(newParameterList);
//		}
	}
	
	@Override
	public void updateOperators(OperatorList newOperatorList) {
//		for(Element child : getNextElements()) {
//			child.updateOperators(newOperatorList);
//		}
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
		// TODO: move to XMLElement ?
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
		// TODO: move to XMLElement ?
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
		// TODO: move to XMLElement ?
		Match newMatch = match.copy();
		getProperties().add(newMatch.getProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Property addNewProperty() {
		// Overritten in XMLElement
		Property prop = new PropertyImpl();
		getProperties().add(prop);
		prop.createParameters();
		return prop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeParametersFromParameterList() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void createParameters() {
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
	public ReturnType getReturnType() {
		return ReturnType.ELEMENT;
	}

	public void clearPredicatesRecursively() {
		getPredicates().clear();
//		for(Element child : getNextElements()) {
//			child.clearPredicatesRecursively();
//		}
	}

} // SingleElementImpl
