/**
 */
package qualitypatternmodel.graphstructure.impl;

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
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlRoot;
import qualitypatternmodel.adaptionxml.impl.XmlNavigationImpl;
import qualitypatternmodel.adaptionxml.impl.XmlRootImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.operators.OperatorList;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.operators.impl.OperatorListImpl;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.ElementMapping;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.Morphism;
import qualitypatternmodel.patternstructure.MorphismContainer;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.RelationMapping;
import qualitypatternmodel.patternstructure.impl.ElementMappingImpl;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;
import qualitypatternmodel.patternstructure.impl.RelationMappingImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Graph</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getOperatorList <em>Operator List</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getGraphDepth <em>Graph Depth</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getQuantifiedCondition <em>Quantified Condition</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getReturnElements <em>Return Elements</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getMorphismTo <em>Morphism To</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getMorphismFrom <em>Morphism From</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphImpl extends PatternElementImpl implements Graph {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> elements;

	/**
	 * The cached value of the '{@link #getOperatorList() <em>Operator List</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOperatorList()
	 * @generated
	 * @ordered
	 */
	protected OperatorList operatorList;

	
	protected static final int GRAPH_DEPTH_EDEFAULT = -1;
	
	protected int graphDepth = GRAPH_DEPTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReturnElements() <em>Return Elements</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getReturnElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> returnElements;

	/**
	 * The cached value of the '{@link #getMorphismTo() <em>Morphism To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMorphismTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Morphism> morphismTo;

	/**
	 * The cached value of the '{@link #getMorphismFrom() <em>Morphism From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMorphismFrom()
	 * @generated
	 * @ordered
	 */
	protected Morphism morphismFrom;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relations;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public GraphImpl() {
		super();
		setOperatorList(new OperatorListImpl());
//		setRootElement(new SingleElementImpl());
//		SingleElementImpl returnElement = new SingleElementImpl();
////		getRootElement().getNextSingle().add(returnElement); 
//		returnElement.setPrevious(getRootElement());
//		getReturnElements().add(returnElement);
	}

	@Override
	public String generateQuery(Location location) throws InvalidityException {
		String result = "";
		for(Element element : getElements()) {
			if(element instanceof XmlRoot) {
				result += element.generateQuery(location);
			}
		}
		return result;
	}

	@Override
	public void isValid(boolean isDefinedPattern)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValidLocal(isDefinedPattern);
		for(Element element : getElements()) {
			element.isValid(isDefinedPattern);
		}
		for(Relation relation: getRelations()) {
			relation.isValid(isDefinedPattern);
		}
		operatorList.isValid(isDefinedPattern);
	}

	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException, MissingPatternContainerException {
		if (returnElements == null || returnElements.isEmpty())
			throw new InvalidityException("returnElement empty (" + getInternalId() + ")");
		if (operatorList == null)
			throw new InvalidityException("operatorList null (" + getInternalId() + ")");
		boolean rootExists = false;
		for(Element element : getElements()) {
			if(element instanceof XmlRoot) {
				rootExists = true;
			}
		}
		if (!rootExists)
			throw new InvalidityException("XMLRoot missing (" + getInternalId() + ")");

		for (Element returnElement : returnElements) {
			if (!returnElement.getGraph().equals(this)) {
				throw new InvalidityException("returnElement not contained in this graph (" + getInternalId() + ")");
			}
		}
	}
	
	@Override
	public PatternElement createXMLAdaption() {
		EList<Element> elementsCopy = new BasicEList<Element>();
		elementsCopy.addAll(getElements());
		for(Element element : elementsCopy) {
			element.createXMLAdaption();
		}				
		return this;
	}
	
	@Override
	public void finalizeXMLAdaption() {
		XmlRoot root = null;
		for(Element element : getElements()) {
			if(element instanceof XmlRoot) {
				root = (XmlRoot) element;
			}
		}
		if(root == null) {	
			root = new XmlRootImpl();
			root.setGraphSimple(this);	
			try {
				if (getContainer() instanceof MorphismContainer) {
//			if (getQuantifiedCondition() != null || getPattern() instanceof MorphismContainer) {
//				Morphism morph = getQuantifiedCondition().getMorphism();
//				if (morph == null) morph = ((MorphismContainer) getPattern()).getMorphism();
					Morphism morph = ((MorphismContainer) getContainer()).getMorphism();
					Graph graph2 = morph.getFrom();
					XmlRoot root2 = null;
					for(Element element : graph2.getElements()) {
						if(element instanceof XmlRoot) {
							root2 = (XmlRoot) element;
						}
					}
					morph.addMapping(root2, root);
//				}
//		
//				if (getQuantifiedCondition() != null) {
//					Morphism morph = getQuantifiedCondition().getMorphism();
//					Graph graph2 = morph.getFrom();
					root2 = (XmlRoot) root.getMappingFrom().getFrom();
					for (Relation re : graph2.getRelations()) {
						if (re.getSource().equals(root2)) {
							Relation rel = new XmlNavigationImpl();
							rel.setGraphSimple(this);
							rel.createParameters();	
							rel.setSource(root);
							EList<ElementMapping> emaps = re.getTarget().getMappingTo();
							for (ElementMapping em : emaps) {
								if (getElements().contains(em.getTo())) {
									rel.setTarget(em.getTo());	
								}
							}					
							morph.addMapping(re, rel);
						}
					}
				}
			} catch (MissingPatternContainerException e) {}
		}
		for(Element element : getElements()) {
			if(element instanceof XmlElement) {
				boolean hasIncomingNavigation = false;
				for(Relation relation : element.getIncoming()) {
					if(relation instanceof XmlNavigation) {
						hasIncomingNavigation = true;
					}
				}
				if(!hasIncomingNavigation) {			
					XmlNavigation navigation = new XmlNavigationImpl();					
					navigation.setGraphSimple(this);
					navigation.createParameters();					
					navigation.setSource(root);
					navigation.setTarget(element);
				}
			}
		}
	}

	@Override
	public void prepareTranslation() {
		for(Element element : getElements()) {
			element.prepareTranslation();
		}
		for(Relation relation: getRelations()) {
			relation.prepareTranslation();
		}
	}

	@Override
	public EList<Parameter> getAllInputs() throws InvalidityException {
		EList<Parameter> res = new BasicEList<Parameter>();
		for(Element element : getElements()) {
			res.addAll(element.getAllInputs());
		}
		for(Relation relation: getRelations()) {
			res.addAll(relation.getAllInputs());
		}
		return res;
	}

	@Override
	public EList<Operator> getAllOperators() throws InvalidityException {
		EList<Operator> res = new BasicEList<Operator>();
		for(Element element : getElements()) {
			res.addAll(element.getAllOperators());
		}
		return res;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @throws MissingPatternContainerException
	 * @generated NOT
	 */
	@Override
	public void copyGraph(Graph graph) throws MissingPatternContainerException {
		// TODO: copy this to graph: copy all elements and relations! + return elements
		
		for(Element element : getElements()) {
			Element newElement = new ElementImpl();		
			newElement.setGraph(graph);
			if(element.getResultOf() != null) {
				newElement.setResultOf(graph);
			}
			ElementMapping newMapping = new ElementMappingImpl();
			if(graph.getQuantifiedCondition() != null) {
				graph.getQuantifiedCondition().getMorphism().getMappings().add(newMapping);
			} else if(graph.getPattern() instanceof CountPattern) {
				((CountPattern) graph.getPattern()).getMorphism().getMappings().add(newMapping);
			}
			
			newMapping.setFrom(element);
			newMapping.setTo(newElement);
			
		}
		
		for(Relation relation : getRelations()) {
			Relation newRelation = new RelationImpl();
			newRelation.setGraph(graph);		
			
			
			RelationMapping newMapping = new RelationMappingImpl();
			Morphism morphism = null;
			if(graph.getQuantifiedCondition() != null) {
				morphism = graph.getQuantifiedCondition().getMorphism();
				morphism.getMappings().add(newMapping);
			} else if(graph.getPattern() instanceof CountPattern) {
				morphism = ((CountPattern) graph.getPattern()).getMorphism();
				morphism.getMappings().add(newMapping);
			}
			
			newMapping.setFrom(relation);
			newMapping.setTo(newRelation);
			
			
			Element source = relation.getSource();
			Element target = relation.getTarget();
			
			Element mappedSource;
			for(ElementMapping mapping : source.getMappingTo()) {
				if(mapping.getMorphism().equals(morphism)) {
					mappedSource = mapping.getTo();
					newRelation.setSource(mappedSource);
				}
			}
			
			Element mappedTarget;
			for(ElementMapping mapping : target.getMappingTo()) {
				if(mapping.getMorphism().equals(morphism)) {
					mappedTarget = mapping.getTo();
					newRelation.setTarget(mappedTarget);
				}
			}
			
			
			
			
		}
		
		
//		Element newRootElement = new ElementImpl();		
//		newRootElement.setRoot(graph);		
//		ElementMapping newMapping = new ElementMappingImpl();
//		if(graph.getQuantifiedCondition() != null) {
//			graph.getQuantifiedCondition().getMorphism().getMappings().add(newMapping);
//		} else if(graph.getPattern() instanceof CountPattern) {
//			((CountPattern) graph.getPattern()).getMorphism().getMappings().add(newMapping);
//		}
//		
//		newMapping.setFrom(rootElement);
//		newMapping.setTo(newRootElement);
//		rootElement.copyNextElementsToNextGraphs();
	}

	private void addRootMapping(Graph graph) {
//		ElementMappingImpl mapping = new ElementMappingImpl();
//		graph.getQuantifiedCondition().getMorphism().getMappings()
//				.add(mapping);
//		mapping.setFrom(rootElement);
//		mapping.setTo(graph.getRootElement());
	}

	private boolean updateRootMapping(Graph graph) {
//		for (Mapping mapping : graph.getQuantifiedCondition().getMorphism().getMappings()) {
//			if (mapping instanceof ElementMapping) {
//				ElementMapping elementMapping = (ElementMapping) mapping;
//				if (elementMapping.getTo().equals(graph.getRootElement())) {
//					elementMapping.getFrom().getMappingTo().remove(elementMapping);
//					elementMapping.setFrom(rootElement);
//					return true;
//				}
//			}
//		}
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphstructurePackage.GRAPH__ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElements()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.GRAPH__OPERATOR_LIST:
				if (operatorList != null)
					msgs = ((InternalEObject)operatorList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphstructurePackage.GRAPH__OPERATOR_LIST, null, msgs);
				return basicSetOperatorList((OperatorList)otherEnd, msgs);
			case GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetQuantifiedCondition((QuantifiedCondition)otherEnd, msgs);
			case GraphstructurePackage.GRAPH__PATTERN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPattern((Pattern)otherEnd, msgs);
			case GraphstructurePackage.GRAPH__RETURN_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReturnElements()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.GRAPH__MORPHISM_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMorphismTo()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.GRAPH__MORPHISM_FROM:
				if (morphismFrom != null)
					msgs = ((InternalEObject)morphismFrom).eInverseRemove(this, PatternstructurePackage.MORPHISM__TO, Morphism.class, msgs);
				return basicSetMorphismFrom((Morphism)otherEnd, msgs);
			case GraphstructurePackage.GRAPH__RELATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphstructurePackage.Literals.GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentWithInverseEList<Element>(Element.class, this, GraphstructurePackage.GRAPH__ELEMENTS, GraphstructurePackage.ELEMENT__GRAPH);
		}
		return elements;
	}

//	/**
//	 * <!-- begin-user-doc --> <!-- end-user-doc -->
//	 * 
//	 * @generated NOT
//	 */
//	public NotificationChain basicSetRootElement(Element newRootElement, NotificationChain msgs) {
//		getReturnElements().clear();
////		if(getRootElement() != null) {
////			ElementImpl root = (ElementImpl) getRootElement();
//////			root.clearPredicatesRecursively();
//////			root.clearMatchRecursively();
//////			root.clearPropertyRecursively();	
////		}
//		
//		Element oldRootElement = rootElement;
//		rootElement = newRootElement;
//		
//		if (eNotificationRequired()) {
//			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
//					GraphstructurePackage.GRAPH__ROOT_ELEMENT, oldRootElement, newRootElement);
//			if (msgs == null)
//				msgs = notification;
//			else
//				msgs.add(notification);
//		}
//			
//		return msgs;
//	}
	
	@Override
	public void updateParameters(ParameterList newParameterList) {
		for(Element element : getElements()) {
			element.updateParameters(newParameterList);
		}
		for(Relation relation: getRelations()) {
			relation.updateParameters(newParameterList);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getReturnElements() {
		if (returnElements == null) {
			returnElements = new EObjectWithInverseResolvingEList<Element>(Element.class, this, GraphstructurePackage.GRAPH__RETURN_ELEMENTS, GraphstructurePackage.ELEMENT__RESULT_OF);
		}
		return returnElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Morphism> getMorphismTo() {
		if (morphismTo == null) {
			morphismTo = new EObjectWithInverseResolvingEList<Morphism>(Morphism.class, this, GraphstructurePackage.GRAPH__MORPHISM_TO, PatternstructurePackage.MORPHISM__FROM);
		}
		return morphismTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Morphism getMorphismFrom() {
		if (morphismFrom != null && morphismFrom.eIsProxy()) {
			InternalEObject oldMorphismFrom = (InternalEObject)morphismFrom;
			morphismFrom = (Morphism)eResolveProxy(oldMorphismFrom);
			if (morphismFrom != oldMorphismFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphstructurePackage.GRAPH__MORPHISM_FROM, oldMorphismFrom, morphismFrom));
			}
		}
		return morphismFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Morphism basicGetMorphismFrom() {
		return morphismFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMorphismFrom(Morphism newMorphismFrom, NotificationChain msgs) {
		Morphism oldMorphismFrom = morphismFrom;
		morphismFrom = newMorphismFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.GRAPH__MORPHISM_FROM, oldMorphismFrom, newMorphismFrom);
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
	public void setMorphismFrom(Morphism newMorphismFrom) {
		if (newMorphismFrom != morphismFrom) {
			NotificationChain msgs = null;
			if (morphismFrom != null)
				msgs = ((InternalEObject)morphismFrom).eInverseRemove(this, PatternstructurePackage.MORPHISM__TO, Morphism.class, msgs);
			if (newMorphismFrom != null)
				msgs = ((InternalEObject)newMorphismFrom).eInverseAdd(this, PatternstructurePackage.MORPHISM__TO, Morphism.class, msgs);
			msgs = basicSetMorphismFrom(newMorphismFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.GRAPH__MORPHISM_FROM, newMorphismFrom, newMorphismFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentWithInverseEList<Relation>(Relation.class, this, GraphstructurePackage.GRAPH__RELATIONS, GraphstructurePackage.RELATION__GRAPH);
		}
		return relations;
	}

	// /**
//	 * <!-- begin-user-doc --> <!-- end-user-doc -->
//	 * 
//	 */
//	public NotificationChain basicSetRootElement(SingleElement newRootElement, NotificationChain msgs) {
//		SingleElement oldRootElement = rootElements;
//		rootElements = newRootElement;
//		if (rootElements != null) {
//			rootElements.setRelationFromPrevious(null);
//		}
//		if (eNotificationRequired()) {
//			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
//					GraphstructurePackage.GRAPH__ROOT_ELEMENT, oldRootElement, newRootElement);
//			if (msgs == null)
//				msgs = notification;
//			else
//				msgs.add(notification);
//		}
//		return msgs;
//	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperatorList getOperatorList() {
		return operatorList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperatorList(OperatorList newOperatorList, NotificationChain msgs) {
		OperatorList oldOperatorList = operatorList;
		operatorList = newOperatorList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.GRAPH__OPERATOR_LIST, oldOperatorList, newOperatorList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperatorList(OperatorList newOperatorList) {
		if (newOperatorList != operatorList) {
			NotificationChain msgs = null;
			if (operatorList != null)
				msgs = ((InternalEObject)operatorList).eInverseRemove(this, OperatorsPackage.OPERATOR_LIST__GRAPH, OperatorList.class, msgs);
			if (newOperatorList != null)
				msgs = ((InternalEObject)newOperatorList).eInverseAdd(this, OperatorsPackage.OPERATOR_LIST__GRAPH, OperatorList.class, msgs);
			msgs = basicSetOperatorList(newOperatorList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.GRAPH__OPERATOR_LIST, newOperatorList, newOperatorList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getGraphDepth() {
		return graphDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGraphDepth(int newGraphDepth) {
		int oldGraphDepth = graphDepth;
		graphDepth = newGraphDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.GRAPH__GRAPH_DEPTH, oldGraphDepth, graphDepth));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isReturnGraph() {
		return getPattern() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Relation addRelation(Element from, Element to) {
		
		Relation r = new RelationImpl();
		r.setGraph(this);
		r.setSource(from);
		r.setTarget(to);
		return r;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantifiedCondition getQuantifiedCondition() {
		if (eContainerFeatureID() != GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION) return null;
		return (QuantifiedCondition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetQuantifiedCondition(QuantifiedCondition newQuantifiedCondition,
			NotificationChain msgs) {
		ParameterList parameterList = newQuantifiedCondition.getParameterList();
		if(parameterList != null) {
			updateParameters(parameterList);
		}	
		msgs = eBasicSetContainer((InternalEObject)newQuantifiedCondition, GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantifiedCondition(QuantifiedCondition newQuantifiedCondition) {
		if (newQuantifiedCondition != eInternalContainer() || (eContainerFeatureID() != GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION && newQuantifiedCondition != null)) {
			if (EcoreUtil.isAncestor(this, newQuantifiedCondition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newQuantifiedCondition != null)
				msgs = ((InternalEObject)newQuantifiedCondition).eInverseAdd(this, PatternstructurePackage.QUANTIFIED_CONDITION__GRAPH, QuantifiedCondition.class, msgs);
			msgs = basicSetQuantifiedCondition(newQuantifiedCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION, newQuantifiedCondition, newQuantifiedCondition));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern getPattern() {
		if (eContainerFeatureID() != GraphstructurePackage.GRAPH__PATTERN) return null;
		return (Pattern)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetPattern(Pattern newPattern, NotificationChain msgs) {
		if(newPattern != null) {
			ParameterList parameterList = newPattern.getParameterList();
			if(parameterList != null) {
				updateParameters(parameterList);
			}	
		}	
		msgs = eBasicSetContainer((InternalEObject)newPattern, GraphstructurePackage.GRAPH__PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPattern(Pattern newPattern) {
		if (newPattern != eInternalContainer() || (eContainerFeatureID() != GraphstructurePackage.GRAPH__PATTERN && newPattern != null)) {
			if (EcoreUtil.isAncestor(this, newPattern))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPattern != null)
				msgs = ((InternalEObject)newPattern).eInverseAdd(this, PatternstructurePackage.PATTERN__GRAPH, Pattern.class, msgs);
			msgs = basicSetPattern(newPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.GRAPH__PATTERN, newPattern, newPattern));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphstructurePackage.GRAPH__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.GRAPH__OPERATOR_LIST:
				return basicSetOperatorList(null, msgs);
			case GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION:
				return basicSetQuantifiedCondition(null, msgs);
			case GraphstructurePackage.GRAPH__PATTERN:
				return basicSetPattern(null, msgs);
			case GraphstructurePackage.GRAPH__RETURN_ELEMENTS:
				return ((InternalEList<?>)getReturnElements()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.GRAPH__MORPHISM_TO:
				return ((InternalEList<?>)getMorphismTo()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.GRAPH__MORPHISM_FROM:
				return basicSetMorphismFrom(null, msgs);
			case GraphstructurePackage.GRAPH__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
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
			case GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION:
				return eInternalContainer().eInverseRemove(this, PatternstructurePackage.QUANTIFIED_CONDITION__GRAPH, QuantifiedCondition.class, msgs);
			case GraphstructurePackage.GRAPH__PATTERN:
				return eInternalContainer().eInverseRemove(this, PatternstructurePackage.PATTERN__GRAPH, Pattern.class, msgs);
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
			case GraphstructurePackage.GRAPH__ELEMENTS:
				return getElements();
			case GraphstructurePackage.GRAPH__OPERATOR_LIST:
				return getOperatorList();
			case GraphstructurePackage.GRAPH__GRAPH_DEPTH:
				return getGraphDepth();
			case GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION:
				return getQuantifiedCondition();
			case GraphstructurePackage.GRAPH__PATTERN:
				return getPattern();
			case GraphstructurePackage.GRAPH__RETURN_ELEMENTS:
				return getReturnElements();
			case GraphstructurePackage.GRAPH__MORPHISM_TO:
				return getMorphismTo();
			case GraphstructurePackage.GRAPH__MORPHISM_FROM:
				if (resolve) return getMorphismFrom();
				return basicGetMorphismFrom();
			case GraphstructurePackage.GRAPH__RELATIONS:
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
			case GraphstructurePackage.GRAPH__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends Element>)newValue);
				return;
			case GraphstructurePackage.GRAPH__OPERATOR_LIST:
				setOperatorList((OperatorList)newValue);
				return;
			case GraphstructurePackage.GRAPH__GRAPH_DEPTH:
				setGraphDepth((Integer)newValue);
				return;
			case GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION:
				setQuantifiedCondition((QuantifiedCondition)newValue);
				return;
			case GraphstructurePackage.GRAPH__PATTERN:
				setPattern((Pattern)newValue);
				return;
			case GraphstructurePackage.GRAPH__RETURN_ELEMENTS:
				getReturnElements().clear();
				getReturnElements().addAll((Collection<? extends Element>)newValue);
				return;
			case GraphstructurePackage.GRAPH__MORPHISM_TO:
				getMorphismTo().clear();
				getMorphismTo().addAll((Collection<? extends Morphism>)newValue);
				return;
			case GraphstructurePackage.GRAPH__MORPHISM_FROM:
				setMorphismFrom((Morphism)newValue);
				return;
			case GraphstructurePackage.GRAPH__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
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
			case GraphstructurePackage.GRAPH__ELEMENTS:
				getElements().clear();
				return;
			case GraphstructurePackage.GRAPH__OPERATOR_LIST:
				setOperatorList((OperatorList)null);
				return;
			case GraphstructurePackage.GRAPH__GRAPH_DEPTH:
				setGraphDepth(GRAPH_DEPTH_EDEFAULT);
				return;
			case GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION:
				setQuantifiedCondition((QuantifiedCondition)null);
				return;
			case GraphstructurePackage.GRAPH__PATTERN:
				setPattern((Pattern)null);
				return;
			case GraphstructurePackage.GRAPH__RETURN_ELEMENTS:
				getReturnElements().clear();
				return;
			case GraphstructurePackage.GRAPH__MORPHISM_TO:
				getMorphismTo().clear();
				return;
			case GraphstructurePackage.GRAPH__MORPHISM_FROM:
				setMorphismFrom((Morphism)null);
				return;
			case GraphstructurePackage.GRAPH__RELATIONS:
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
			case GraphstructurePackage.GRAPH__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case GraphstructurePackage.GRAPH__OPERATOR_LIST:
				return operatorList != null;
			case GraphstructurePackage.GRAPH__GRAPH_DEPTH:
				return graphDepth != GRAPH_DEPTH_EDEFAULT;
			case GraphstructurePackage.GRAPH__QUANTIFIED_CONDITION:
				return getQuantifiedCondition() != null;
			case GraphstructurePackage.GRAPH__PATTERN:
				return getPattern() != null;
			case GraphstructurePackage.GRAPH__RETURN_ELEMENTS:
				return returnElements != null && !returnElements.isEmpty();
			case GraphstructurePackage.GRAPH__MORPHISM_TO:
				return morphismTo != null && !morphismTo.isEmpty();
			case GraphstructurePackage.GRAPH__MORPHISM_FROM:
				return morphismFrom != null;
			case GraphstructurePackage.GRAPH__RELATIONS:
				return relations != null && !relations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GraphstructurePackage.GRAPH___GET_ALL_OPERATORS:
				try {
					return getAllOperators();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.GRAPH___COPY_GRAPH__GRAPH:
				try {
					copyGraph((Graph)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.GRAPH___IS_RETURN_GRAPH:
				return isReturnGraph();
			case GraphstructurePackage.GRAPH___ADD_RELATION__ELEMENT_ELEMENT:
				return addRelation((Element)arguments.get(0), (Element)arguments.get(1));
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
		result.append(" (graphDepth: ");
		result.append(graphDepth);
		result.append(')');
		return result.toString();
	}

	@Override
	public String myToString() {
		String res = "";
		if (isReturnGraph())
			res += "Return-";
		res += "Graph " + getInternalId();
		for (Element e : getElements()) {
			res += "\n| > " + e.myToString().replace("\n", "\n|   ");
		}
		for (Relation r : getRelations()) {
			res += "\n| ~ " + r.myToString().replace("\n", "\n|   ");
		}
		// TODO: call Element.myToString()
//		if ( getRootElement() != null)
//		res += "\n| " + getRootElement().myToString().replace("\n", "\n| ");
		res += getOperatorList().myToString().replace("\n", "\n| ");
		return res;
	}

} // GraphImpl
