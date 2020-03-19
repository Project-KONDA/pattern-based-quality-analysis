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
import qualitypatternmodel.functions.Count;
import qualitypatternmodel.functions.FunctionsFactory;
import qualitypatternmodel.functions.FunctionsPackage;
import qualitypatternmodel.functions.OperatorList;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.ListOfElements;
import qualitypatternmodel.graphstructure.SetElement;
import qualitypatternmodel.graphstructure.SingleElement;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.RelationMapping;
import qualitypatternmodel.patternstructure.SingleElementMapping;
import qualitypatternmodel.patternstructure.impl.RelationMappingImpl;
import qualitypatternmodel.patternstructure.impl.SingleElementMappingImpl;

import static qualitypatternmodel.utilityclasses.Constants.*;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Single
 * Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SingleElementImpl#getMappingTo <em>Mapping To</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SingleElementImpl#getMappingFrom <em>Mapping From</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SingleElementImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SingleElementImpl#getNextSingle <em>Next Single</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SingleElementImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SingleElementImpl#getNextSet <em>Next Set</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SingleElementImpl#getGraph <em>Graph</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleElementImpl extends ElementImpl implements SingleElement {
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
	 * The cached value of the '{@link #getNextSet() <em>Next Set</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNextSet()
	 * @generated
	 * @ordered
	 */
	protected EList<SetElement> nextSet;

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
			for (Element nextElement : getNextSingle()) {
				result += nextElement.toXQuery(location);
			}
			return result;
		} else {
			if (hasCountPredicate()) {
				return toXQueryCount(location);
			} else {
				return toXQueryNoCount(location);
			}
		}
	}

	@Override
	public String toXQueryNoCount(Location location) throws InvalidityException {
		translated = true;
		
		String xPredicates = translatePredicatesViaBrackets(location);

		String result = "";
		if (location == Location.RETURN) {
			String xPathExpression = translatePathFromPrevious();
			result = FOR + getXQueryVariable() + IN + xPathExpression + xPredicates;
		} else {
			if (location == Location.EXISTS) {
				result += SOME;
			} else if (location == Location.FORALL) {
				result += EVERY;
			} else {
				throw new InvalidityException("invalid location");
			}
			result += getXQueryVariable();
			if (mappingFrom == null) {
				String xPathExpression = translatePathFromPrevious();
				result += IN + xPathExpression + xPredicates + SATISFIES;
			} else if (!getPredicates().isEmpty()) {
				result += IN + getXQueryVariable() + xPredicates + SATISFIES;
			} else {
				result = "";
			}
		}

		for (Element nextElement : getNextSingle()) {
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

	@Override
	public String toXQueryCount(Location location) throws InvalidityException {
		translated = true;
		String xPathExpression = translatePathFromPrevious();
		String xPredicates = translatePredicatesViaAnd(location);

		String result = "";
		if (location == Location.RETURN) {
			result = FOR + getXQueryVariable() + IN + xPathExpression;
		} else {
			if (location == Location.EXISTS) {
				result += "(" + SOME;
			} else if (location == Location.FORALL) {
				result += "(" + EVERY;
			} else {
				throw new InvalidityException("invalid location");
			}
			result += getXQueryVariable();
			if (mappingFrom == null) {
				result += IN + xPathExpression + SATISFIES;
			} else if (!getPredicates().isEmpty()) {
				result += IN + getXQueryVariable() + SATISFIES;
			} else {
				result = "";
			}
			if (!xPredicates.equals("")) {
				if (location == Location.EXISTS) {
					result += xPredicates;
//					if(getNextSingle().size() > 0) {
					result += AND;
//					}
				} else {
					result += NOT + "(" + xPredicates + ")" + OR;
				}
			}

		}

		int counter = 0;
		for (Element nextElement : getNextSingle()) {
			String nextToXQuery = nextElement.toXQuery(location);
			result += nextToXQuery;
			if (location != Location.RETURN && !nextToXQuery.equals("") && counter != getNextSingle().size() - 1) {
				result += AND;
			}
			counter++;
		}

//		if(location != Location.RETURN && getNextSingle().isEmpty()) {
//			result += AND;
//		}

		return result;
	}

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

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean hasCountPredicate() {
		for (BooleanOperator operator : getPredicates()) {
			if (operator.hasCountPredicate()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void isValid(boolean isDefinedPattern)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		super.isValid(isDefinedPattern);
		if (!eIsSet(GraphstructurePackage.SINGLE_ELEMENT__ROOT))
			relationFromPrevious.isValid(isDefinedPattern);
	}

	@Override
	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {
		if (getGraphDepth() == 0 && mappingFrom != null) // depth=0 => ReturnGraph
			throw new InvalidityException("invalid SingleElementMapping to returnGraph: " + mappingFrom + " "
					+ mappingFrom.getId() + " - (" + mappingTo + ")");
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

		super.isValidLocal(isDefinedPattern);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @throws InvalidityException
	 * 
	 */
	public int getGraphDepth() throws InvalidityException {
		if (getRoot() != null)
			return getRoot().getGraphDepth();
		else
			return super.getGraphDepth();
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
		resetCountOperatorRecursively();
		clearMatchRecursively();
		removeFromReturnElements();
		clearPredicatesRecursively();
		if (getRelationFromPrevious() != null) {
			getRelationFromPrevious().removeRelationFromPreviousGraphs();
			getRelationFromPrevious().removeMappingsToNext();
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
		setRelationFromPrevious(new RelationImpl());
		return msgs;
	}

	public void removeFromReturnElements() {
		setGraph(null);
		for (SingleElement child : getNextSingle()) {
			child.removeFromReturnElements();
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void addCountOperation() {

		try {
			GraphstructurePackage.eINSTANCE.eClass();
			GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
			FunctionsPackage.eINSTANCE.eClass();
			FunctionsFactory functionFactory = FunctionsFactory.eINSTANCE;
			ParametersPackage.eINSTANCE.eClass();
			ParametersFactory inputsFactory = ParametersFactory.eINSTANCE;
			
			OperatorList oplist = ((Graph) getAncestor(Graph.class)).getOperatorList();
			ParameterList varlist = ((Pattern) getAncestor(Pattern.class)).getParameterList();

			SetElement set = graphFactory.createSetElement();
			this.getNextSet().add(set);

			Count count = functionFactory.createCount();
			Comparison comp = functionFactory.createComparison();

			oplist.add(comp);
			oplist.add(count);

			getPredicates().add(comp);
			qualitypatternmodel.parameters.NumberParam number = inputsFactory.createNumberParam();
			varlist.add(number);

			comp.setArgument1(count);
			comp.setArgument2(number);
			
			count.setArgument(set);
		} catch (MissingPatternContainerException e) {
			e.printStackTrace();
		}
	}

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

	@Override
	public void setName(String newName) {
		super.setName(newName);
		if (getMappingFrom() != null) {
			SingleElement se = getMappingFrom().getFrom();
			if (se.getName() != newName)
				se.setName(newName);
		}
		for (SingleElementMapping m : getMappingTo()) {
			if (m.getTo() != null) {
				SingleElement se = m.getTo();
				if (se.getName() != newName) {
					se.setName(newName);
				}
			}
		}
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
	public EList<SetElement> getNextSet() {
		if (nextSet == null) {
			nextSet = new EObjectContainmentWithInverseEList<SetElement>(SetElement.class, this, GraphstructurePackage.SINGLE_ELEMENT__NEXT_SET, GraphstructurePackage.SET_ELEMENT__PREVIOUS_SINGLE);
		}
		return nextSet;
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
		if (getMappingFrom() != null) {
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

	@Override
	public int getOriginalID() {
		if (mappingFrom == null)
			return this.getInternalId();
		else
			return mappingFrom.getFrom().getOriginalID();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String translateElementExistencePredicates(Location location) throws InvalidityException {
		String predicates = "";
		for (Element nextElement : getNextElements()) {
			if (nextElement instanceof SetElement) {
				SetElement nextSetElement = (SetElement) nextElement;
				if (!nextSetElement.isTranslated()) {
					nextSetElement.setTranslated(true);
					// TODO: in SetElementImpl create for clause: String result = FOR +
					// getXQueryVariable() + IN + xPathExpression + xPredicates;
					predicates += "[." + nextSetElement.translatePathFromPrevious()
							+ nextSetElement.translatePredicatesViaBrackets(location) // TODO: depth+1 ?
							+ nextSetElement.translateElementExistencePredicates(location) + "]"; // TODO: depth+1 ?
				}
			}

		}
		return predicates;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
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
			case GraphstructurePackage.SINGLE_ELEMENT__NEXT_SET:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNextSet()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.SINGLE_ELEMENT__GRAPH:
				if (graph != null)
					msgs = ((InternalEObject)graph).eInverseRemove(this, GraphstructurePackage.GRAPH__RETURN_ELEMENTS, Graph.class, msgs);
				return basicSetGraph((Graph)otherEnd, msgs);
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
			case GraphstructurePackage.SINGLE_ELEMENT__NEXT_SET:
				return ((InternalEList<?>)getNextSet()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.SINGLE_ELEMENT__GRAPH:
				return basicSetGraph(null, msgs);
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
			case GraphstructurePackage.SINGLE_ELEMENT__NEXT_SET:
				return getNextSet();
			case GraphstructurePackage.SINGLE_ELEMENT__GRAPH:
				if (resolve) return getGraph();
				return basicGetGraph();
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
			case GraphstructurePackage.SINGLE_ELEMENT__NEXT_SET:
				getNextSet().clear();
				getNextSet().addAll((Collection<? extends SetElement>)newValue);
				return;
			case GraphstructurePackage.SINGLE_ELEMENT__GRAPH:
				setGraph((Graph)newValue);
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
			case GraphstructurePackage.SINGLE_ELEMENT__NEXT_SET:
				getNextSet().clear();
				return;
			case GraphstructurePackage.SINGLE_ELEMENT__GRAPH:
				setGraph((Graph)null);
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
			case GraphstructurePackage.SINGLE_ELEMENT__NEXT_SET:
				return nextSet != null && !nextSet.isEmpty();
			case GraphstructurePackage.SINGLE_ELEMENT__GRAPH:
				return graph != null;
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
			case GraphstructurePackage.SINGLE_ELEMENT___HAS_COUNT_PREDICATE:
				return hasCountPredicate();
			case GraphstructurePackage.SINGLE_ELEMENT___TO_XQUERY_COUNT__LOCATION:
				try {
					return toXQueryCount((Location)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
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
			case GraphstructurePackage.SINGLE_ELEMENT___ADD_COUNT_OPERATION:
				addCountOperation();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public EList<Element> getNextElements() {
		EList<Element> elementListNext = new BasicEList<Element>();
		for (Element element : getNextSingle()) {
			elementListNext.add(element);
		}
		for (Element element : getNextSet()) {
			elementListNext.add(element);
		}
		return elementListNext;
	}

	@Override
	public Element getPreviousElement() {
		return getPrevious();
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
		return res + "Single" + super.myToString();
	}

} // SingleElementImpl
