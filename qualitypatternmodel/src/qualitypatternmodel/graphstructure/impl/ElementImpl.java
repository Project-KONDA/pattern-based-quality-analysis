/**
 */
package qualitypatternmodel.graphstructure.impl;

import static qualitypatternmodel.utilityclasses.Constants.AND;
import static qualitypatternmodel.utilityclasses.Constants.VARIABLE;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
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
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.ListOfElements;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.PropertyLocation;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.inputfields.Input;
import qualitypatternmodel.inputfields.UnknownInputValue;
import qualitypatternmodel.inputfields.VariableList;
import qualitypatternmodel.inputfields.impl.TextLiteralImpl;
import qualitypatternmodel.inputfields.impl.UnknownInputValueImpl;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getComparison1 <em>Comparison1</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getComparison2 <em>Comparison2</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getRelationFromPrevious <em>Relation From Previous</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#isTranslated <em>Translated</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getGetAllElements <em>Get All Elements</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getGetAllRelations <em>Get All Relations</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getPredicates <em>Predicates</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#isPredicatesAreBeingTranslated <em>Predicates Are Being Translated</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementImpl extends PatternElementImpl implements Element {
	/**
	 * The cached value of the '{@link #getComparison1() <em>Comparison1</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getComparison1()
	 * @generated
	 * @ordered
	 */
	protected EList<Comparison> comparison1;

	/**
	 * The cached value of the '{@link #getComparison2() <em>Comparison2</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getComparison2()
	 * @generated
	 * @ordered
	 */
	protected EList<Comparison> comparison2;

	/**
	 * The cached value of the '{@link #getRelationFromPrevious() <em>Relation From
	 * Previous</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getRelationFromPrevious()
	 * @ordered
	 */
	protected Relation relationFromPrevious;

	/**
	 * The default value of the '{@link #isTranslated() <em>Translated</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isTranslated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSLATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTranslated() <em>Translated</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isTranslated()
	 * @generated
	 * @ordered
	 */
	protected boolean translated = TRANSLATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached setting delegate for the '{@link #getGetAllElements() <em>Get All Elements</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getGetAllElements()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate GET_ALL_ELEMENTS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)GraphstructurePackage.Literals.ELEMENT__GET_ALL_ELEMENTS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getGetAllRelations() <em>Get All
	 * Relations</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getGetAllRelations()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate GET_ALL_RELATIONS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)GraphstructurePackage.Literals.ELEMENT__GET_ALL_RELATIONS).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getPredicates() <em>Predicates</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPredicates()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanOperator> predicates;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected ElementImpl() {
		super();
		setRelationFromPrevious(new RelationImpl());
	}

	@Override
	public void isValid(boolean isDefinedPattern)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValidLocal(isDefinedPattern);
		for (Element next : getNextElements())
			next.isValid(isDefinedPattern);
		for (BooleanOperator predicate : getPredicates())
			predicate.isValid(isDefinedPattern);
	}

	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {
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
	 * @generated
	 */
	@Override
	public EList<Input> getAllVariables() throws InvalidityException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public EList<Input> getAllInputs() throws InvalidityException {
		EList<Input> res = new BasicEList<Input>();
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

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getXQueryRepresentation(Location location) throws InvalidityException {
		if (translated) {
			return getXQueryVariable();
		} else {
			System.out.println(getXQueryVariable());
			throw new InvalidityException("element not yet translated");
		}
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
		for (Element element : getNextElements()) {
			element.prepareTranslation();
		}
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comparison> getComparison1() {
		if (comparison1 == null) {
			comparison1 = new EObjectWithInverseResolvingEList<Comparison>(Comparison.class, this, GraphstructurePackage.ELEMENT__COMPARISON1, FunctionsPackage.COMPARISON__ARGUMENT1);
		}
		return comparison1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comparison> getComparison2() {
		if (comparison2 == null) {
			comparison2 = new EObjectWithInverseResolvingEList<Comparison>(Comparison.class, this, GraphstructurePackage.ELEMENT__COMPARISON2, FunctionsPackage.COMPARISON__ARGUMENT2);
		}
		return comparison2;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BooleanOperator> getPredicates() {
		if (predicates == null) {
			predicates = new EObjectWithInverseResolvingEList.ManyInverse<BooleanOperator>(BooleanOperator.class, this, GraphstructurePackage.ELEMENT__PREDICATES, FunctionsPackage.BOOLEAN_OPERATOR__ELEMENTS);
		}
		return predicates;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPredicatesAreBeingTranslated() {
		return predicatesAreBeingTranslated;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relation getRelationFromPrevious() {
		return relationFromPrevious;
	}

	@Override
	public ReturnType getReturnType() {
		return ReturnType.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTranslatable() throws InvalidityException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ListOfElements> getAllArgumentElements() throws InvalidityException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS, newRelationFromPrevious, newRelationFromPrevious));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTranslated() {
		return translated;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Element> getGetAllElements() {
		return (EList<Element>)GET_ALL_ELEMENTS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Relation> getGetAllRelations() {
		return (EList<Relation>)GET_ALL_RELATIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @throws InvalidityException
	 */
	public int getGraphDepth() throws InvalidityException {
		if (getPreviousElement() != null)
			return getPreviousElement().getGraphDepth();
		throw new InvalidityException("previous null");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String translateElementExistencePredicates(Location location) throws InvalidityException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			VariableList varlist = pattern.getVariableList();
			Graph graph = (Graph) getAncestor(Graph.class);
			OperatorList oplist = graph.getOperatorList();
			
			Property property = new PropertyImpl();
			getProperties().add(property);

			UnknownInputValue unknownInputValue = new UnknownInputValueImpl();
			varlist.add(unknownInputValue);

			oplist.add(comparison);	
			comparison.setArgument1(property);
			comparison.setArgument2(unknownInputValue);						
			
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
			VariableList varlist = pattern.getVariableList();
			Graph graph = (Graph) getAncestor(Graph.class);
			OperatorList oplist = graph.getOperatorList();
			
			Property property = new PropertyImpl();
			getProperties().add(property);
			property.getOption().setValue(PropertyLocation.TAG);
			
			TextLiteralImpl textlit = new TextLiteralImpl();
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
	public void addPrimitiveComparison(Input input) {
		Comparison comparison = new ComparisonImpl();
		try {			
			Pattern pattern = (Pattern) getAncestor(Pattern.class);
			VariableList varlist = pattern.getVariableList();
			Graph graph = (Graph) getAncestor(Graph.class);
			OperatorList oplist = graph.getOperatorList();
			
			Property property = new PropertyImpl();
			getProperties().add(property);
			property.getOption().setValue(PropertyLocation.TAG);
			
			varlist.add(input);

			oplist.add(comparison);	
			comparison.setArgument1(property);
			comparison.setArgument2(input);			
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
	public void addPrimitiveComparison(PropertyLocation property, String attr, ComparisonOperator operator, Input input) {
		Comparison comparison = new ComparisonImpl();
		try {		
			Pattern pattern = (Pattern) getAncestor(Pattern.class);
			VariableList varlist = pattern.getVariableList();
			Graph graph = (Graph) getAncestor(Graph.class);
			OperatorList oplist = graph.getOperatorList();
			Property property1 = new PropertyImpl();
			
			getProperties().add(property1);
			property1.getOption().setValue(property);
			property1.getAttributeName().setValue(attr);
			
			varlist.add(input);

			oplist.add(comparison);	
			comparison.getOption().setValue(operator);
			comparison.setArgument1(property1);
			comparison.setArgument2(input);				
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
//		Match match = new MatchImpl();
//		Property property = new PropertyImpl();
//		getPredicates().add(match);
//		getProperties().add(property);
//		match.setProperty(property);
		Match match = new MatchImpl();
		try {			
			Pattern pattern = (Pattern) getAncestor(Pattern.class);
			VariableList varlist = pattern.getVariableList();
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
	 * @generated
	 */
	@Override
	public String translatePathFromPrevious() throws InvalidityException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	public int getOriginalID() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public abstract EList<Element> getNextElements();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	public abstract Element getPreviousElement();

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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphstructurePackage.ELEMENT__COMPARISON1:
				return getComparison1();
			case GraphstructurePackage.ELEMENT__COMPARISON2:
				return getComparison2();
			case GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS:
				return getRelationFromPrevious();
			case GraphstructurePackage.ELEMENT__TRANSLATED:
				return isTranslated();
			case GraphstructurePackage.ELEMENT__PROPERTIES:
				return getProperties();
			case GraphstructurePackage.ELEMENT__GET_ALL_ELEMENTS:
				return getGetAllElements();
			case GraphstructurePackage.ELEMENT__GET_ALL_RELATIONS:
				return getGetAllRelations();
			case GraphstructurePackage.ELEMENT__PREDICATES:
				return getPredicates();
			case GraphstructurePackage.ELEMENT__PREDICATES_ARE_BEING_TRANSLATED:
				return isPredicatesAreBeingTranslated();
			case GraphstructurePackage.ELEMENT__NAME:
				return getName();
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
			case GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS:
				setRelationFromPrevious((Relation)newValue);
				return;
			case GraphstructurePackage.ELEMENT__TRANSLATED:
				setTranslated((Boolean)newValue);
				return;
			case GraphstructurePackage.ELEMENT__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case GraphstructurePackage.ELEMENT__PREDICATES:
				getPredicates().clear();
				getPredicates().addAll((Collection<? extends BooleanOperator>)newValue);
				return;
			case GraphstructurePackage.ELEMENT__PREDICATES_ARE_BEING_TRANSLATED:
				setPredicatesAreBeingTranslated((Boolean)newValue);
				return;
			case GraphstructurePackage.ELEMENT__NAME:
				setName((String)newValue);
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
			case GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS:
				setRelationFromPrevious((Relation)null);
				return;
			case GraphstructurePackage.ELEMENT__TRANSLATED:
				setTranslated(TRANSLATED_EDEFAULT);
				return;
			case GraphstructurePackage.ELEMENT__PROPERTIES:
				getProperties().clear();
				return;
			case GraphstructurePackage.ELEMENT__PREDICATES:
				getPredicates().clear();
				return;
			case GraphstructurePackage.ELEMENT__PREDICATES_ARE_BEING_TRANSLATED:
				setPredicatesAreBeingTranslated(PREDICATES_ARE_BEING_TRANSLATED_EDEFAULT);
				return;
			case GraphstructurePackage.ELEMENT__NAME:
				setName(NAME_EDEFAULT);
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
			case GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS:
				return relationFromPrevious != null;
			case GraphstructurePackage.ELEMENT__TRANSLATED:
				return translated != TRANSLATED_EDEFAULT;
			case GraphstructurePackage.ELEMENT__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case GraphstructurePackage.ELEMENT__GET_ALL_ELEMENTS:
				return GET_ALL_ELEMENTS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case GraphstructurePackage.ELEMENT__GET_ALL_RELATIONS:
				return GET_ALL_RELATIONS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case GraphstructurePackage.ELEMENT__PREDICATES:
				return predicates != null && !predicates.isEmpty();
			case GraphstructurePackage.ELEMENT__PREDICATES_ARE_BEING_TRANSLATED:
				return predicatesAreBeingTranslated != PREDICATES_ARE_BEING_TRANSLATED_EDEFAULT;
			case GraphstructurePackage.ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
			case GraphstructurePackage.ELEMENT___GET_NEXT_ELEMENTS:
				return getNextElements();
			case GraphstructurePackage.ELEMENT___GET_PREVIOUS_ELEMENT:
				return getPreviousElement();
			case GraphstructurePackage.ELEMENT___GET_ALL_OPERATORS:
				try {
					return getAllOperators();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.ELEMENT___GET_ALL_VARIABLES:
				try {
					return getAllVariables();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.ELEMENT___GET_XQUERY_REPRESENTATION__LOCATION:
				try {
					return getXQueryRepresentation((Location)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.ELEMENT___GET_GRAPH_DEPTH:
				try {
					return getGraphDepth();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.ELEMENT___TRANSLATE_ELEMENT_EXISTENCE_PREDICATES__LOCATION:
				try {
					return translateElementExistencePredicates((Location)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.ELEMENT___ADD_PRIMITIVE_COMPARISON:
				addPrimitiveComparison();
				return null;
			case GraphstructurePackage.ELEMENT___ADD_PRIMITIVE_MATCH__STRING:
				addPrimitiveMatch((String)arguments.get(0));
				return null;
			case GraphstructurePackage.ELEMENT___TRANSLATE_PATH_FROM_PREVIOUS:
				try {
					return translatePathFromPrevious();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.ELEMENT___GET_XQUERY_VARIABLE:
				return getXQueryVariable();
			case GraphstructurePackage.ELEMENT___GET_ORIGINAL_ID:
				return getOriginalID();
			case GraphstructurePackage.ELEMENT___TRANSLATE_PREDICATES_VIA_BRACKETS__LOCATION:
				try {
					return translatePredicatesViaBrackets((Location)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.ELEMENT___TRANSLATE_PREDICATES_VIA_AND__LOCATION:
				try {
					return translatePredicatesViaAnd((Location)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.ELEMENT___RESET_COUNT_OPERATOR_RECURSIVELY:
				resetCountOperatorRecursively();
				return null;
			case GraphstructurePackage.ELEMENT___CLEAR_MATCH_RECURSIVELY:
				clearMatchRecursively();
				return null;
			case GraphstructurePackage.ELEMENT___CLEAR_COMPARISON_RECURSIVELY:
				clearComparisonRecursively();
				return null;
			case GraphstructurePackage.ELEMENT___CLEAR_PREDICATES_RECURSIVELY:
				clearPredicatesRecursively();
				return null;
			case GraphstructurePackage.ELEMENT___ADD_PRIMITIVE_COMPARISON__STRING:
				addPrimitiveComparison((String)arguments.get(0));
				return null;
			case GraphstructurePackage.ELEMENT___ADD_PRIMITIVE_COMPARISON__INPUT:
				addPrimitiveComparison((Input)arguments.get(0));
				return null;
			case GraphstructurePackage.ELEMENT___ADD_PRIMITIVE_MATCH:
				addPrimitiveMatch();
				return null;
			case GraphstructurePackage.ELEMENT___ADD_PRIMITIVE_COMPARISON__PROPERTYLOCATION_STRING_COMPARISONOPERATOR_INPUT:
				addPrimitiveComparison((PropertyLocation)arguments.get(0), (String)arguments.get(1), (ComparisonOperator)arguments.get(2), (Input)arguments.get(3));
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

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (translated: ");
		result.append(translated);
		result.append(", predicatesAreBeingTranslated: ");
		result.append(predicatesAreBeingTranslated);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	@Override
	public String myToString() {
		String res = "Element " + getName() + " " + getInternalId();
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
			((ElementImpl)child).clearMatchRecursively();
		}
		
	}

	public void clearPropertyRecursively() {
		for(Property p : getProperties()) {
			p.reset();			
		}
		for(Element child : getNextElements()) {
			((ElementImpl) child).clearPropertyRecursively();
		}
	}

	public void resetCountOperatorRecursively() {
		for(Element child : getNextElements()) {
			child.resetCountOperatorRecursively();
		}		
	}
	public void clearPredicatesRecursively() {
		getPredicates().clear();
		for(Element child : getNextElements()) {
			child.clearPredicatesRecursively();
		}
	}

} // ElementImpl
