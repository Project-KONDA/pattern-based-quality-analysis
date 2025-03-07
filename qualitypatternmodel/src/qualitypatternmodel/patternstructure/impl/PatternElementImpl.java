/**
 */
package qualitypatternmodel.patternstructure.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.impl.GraphImpl;
import qualitypatternmodel.javaoperators.JavaOperator;
import qualitypatternmodel.javaquery.JavaFilterPart;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.operators.OperatorList;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.util.PatternstructureValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Pattern
 * Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.PatternElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.PatternElementImpl#getInternalId <em>Internal Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PatternElementImpl extends MinimalEObjectImpl.Container implements PatternElement {

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!--* begin-user-doc -->
	 * A generated UUID.
	 * <!-- end-user-doc -->
	 *
	 * @see #getId()
	 * @ordered
	 */
	protected String id = EcoreUtil.generateUUID();

	/**
	 * The default value of the '{@link #getInternalId() <em>Internal Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalId()
	 * @generated
	 * @ordered
	 */
	protected static final int INTERNAL_ID_EDEFAULT = -1;
	/**
	 * The cached value of the '{@link #getInternalId() <em>Ref No</em>}' attribute.
	 * <!--* begin-user-doc -->
	 * A simple numerical identifier.
	 * It is automatically set when a <code>PatternElement</code> is inserted into a <code>CompletePattern</code>.
	 * It is unique at least within all instances of the same class.
	 * <!-- end-user-doc -->
	 *
	 * @see #getInternalId()
	 * @generated
	 * @ordered
	 */
	protected int internalId = INTERNAL_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	@Override
	public EList<Parameter> getAllParameters() throws InvalidityException {
		return new BasicEList<Parameter>();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	@Override
	public EList<Operator> getAllOperators() throws InvalidityException {
		return new BasicEList<Operator>();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @throws OperatorCycleException
	 * @throws MissingPatternContainerException
	 */
	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValidLocal(abstractionLevel);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @throws OperatorCycleException
	 * @throws MissingPatternContainerException
	 */
	@Override
	abstract public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String generateQuery(Language language) throws InvalidityException {
		switch(language) {
		case XML:
			return generateXQuery();
		case RDF:
			return generateSparql();
		case NEO4J:
			return generateCypher();
		default:
			throw new InvalidityException(language + " is not a valid langauge.");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public boolean validate(DiagnosticChain chain, Map<Object, Object> context) {
		try {
			isValidLocal(AbstractionLevel.GENERIC);
		} catch (Exception e) {
			if (chain != null) {
				chain.add(
						new BasicDiagnostic(Diagnostic.ERROR, PatternstructureValidator.DIAGNOSTIC_SOURCE,
								PatternstructureValidator.PATTERN_ELEMENT__VALIDATE,
								EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic",
										new Object[] { "not " + e.getMessage(),
												EObjectValidator.getObjectLabel(this, context) }),
								new Object[] { this }));
			}
			System.out.println(
					"Validation failed at " + this.getClass().getSimpleName() + " " + this.getId() + " with message: ");
			e.printStackTrace();
			return false;
		}
//		System.out.println("Validation successful at " + this.getClass().getSimpleName() + " " + this.getId() + "!");
		return true;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<PatternElement> prepareParameterUpdates() {
		throw new UnsupportedOperationException("Operation 'prepareParameterUpdates' not implemented for class " + getClass().getSimpleName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public ParameterList getParameterList() {
		ParameterList newParameterList = null;
		try {
			newParameterList = ((CompletePattern) getAncestor(CompletePatternImpl.class)).getParameterList();
		} catch (MissingPatternContainerException e) {
			// do nothing
//			e.printStackTrace();
		}
		return newParameterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public OperatorList getOperatorList() {
		OperatorList newOperatorList = null;
		try {
			newOperatorList = ((Graph) getAncestor(GraphImpl.class)).getOperatorList();
		} catch (MissingPatternContainerException e) {
			// do nothing
		}
		return newOperatorList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws MissingPatternContainerException
	 * @throws OperatorCycleException
	 * @generated NOT
	 */
	@Override
	public PatternElement createXmlAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public PatternElement createRdfAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public PatternElement createNeo4jAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Boolean containsJavaOperator() throws InvalidityException {
		List<Operator> ops = getAllOperators();
		for (Operator o: ops) {
			if (o instanceof JavaOperator) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public PatternElement createAdaption(Language language) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		switch(language) {
		case XML:
			return createXmlAdaption();
		case RDF:
			return createRdfAdaption();
		case NEO4J:
			return createNeo4jAdaption();
		default:
			throw new InvalidityException(language + " is not a valid langauge.");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public JavaFilterPart generateQueryFilterPart() throws InvalidityException {
		throw new UnsupportedOperationException("Class " + getClass().getSimpleName() + " does not implement generateQueryFilterPart().");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean relationsXmlAdapted() {
		return true;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void triggerParameterUpdates(PatternElement newContainer, EList<PatternElement> patternElements) {
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
	public void triggerParameterUpdates(PatternElement newContainer) {
//		ParameterList oldParameterList = getParameterList();

		ParameterList newParameterList = null;
		if(newContainer != null) {
			newParameterList = newContainer.getParameterList();
		}

//		if(oldParameterList == null) {
//			// TODO
//		} else if(newParameterList == null) {
//			// TODO
//		} else if(oldParameterList.equals(newParameterList)) {
//			// TODO
//		}

		updateParameters(newParameterList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void updateParameters(ParameterList newParameterList) {
		EList<PatternElement> patternElements = prepareParameterUpdates();

		for(PatternElement patternElement : patternElements) {
			if(patternElement != null) {
				patternElement.updateParameters(newParameterList);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void initializeTranslation() {

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @throws MissingPatternContainerException
	 * @throws Exception
	 *
	 * @generated NOT
	 */
	@Override
	public PatternElement getContainer() throws MissingPatternContainerException {
		if (eInternalContainer() instanceof PatternElement) {
			return (PatternElement)eInternalContainer();
		}
		throw new MissingPatternContainerException("container object invalid");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @throws InvalidityException
	 *
	 * @generated NOT
	 */
	@Override
	public PatternElement getAncestor(Class<?> cls) throws MissingPatternContainerException {
		if (cls.isInstance(this)) {
			return this;
		} else {
			return getContainer().getAncestor(cls);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	abstract public String myToString();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void prepareTranslation() {}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternstructurePackage.Literals.PATTERN_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.PATTERN_ELEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalId(int newInternalId) {
		int oldInternalId = internalId;
		internalId = newInternalId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.PATTERN_ELEMENT__INTERNAL_ID, oldInternalId, internalId));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public int getInternalId() {
		if (internalId == -1) {
			try {
				internalId = ((CompletePatternImpl) this.getAncestor(CompletePatternImpl.class)).getNewRefNo(this.getClass());
			} catch (MissingPatternContainerException e) {
				// do nothing
//				e.printStackTrace();
			}
		}
		return internalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String generateXQuery() throws InvalidityException {
		throw new UnsupportedOperationException(this.getClass().getSimpleName());
	}

	@Override
	public String generateXQueryJavaReturn() throws InvalidityException {
		if (containsJavaOperator()) {
			throw new UnsupportedOperationException(getClass().getSimpleName());
		} else {
			return generateXQuery();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String generateXQueryJava() throws InvalidityException {
		throw new UnsupportedOperationException(this.getClass().getSimpleName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String generateSparql() throws InvalidityException {
		throw new UnsupportedOperationException(this.getClass().getSimpleName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String generateCypher() throws InvalidityException {
		throw new UnsupportedOperationException(this.getClass().getSimpleName());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternstructurePackage.PATTERN_ELEMENT__ID:
				return getId();
			case PatternstructurePackage.PATTERN_ELEMENT__INTERNAL_ID:
				return getInternalId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PatternstructurePackage.PATTERN_ELEMENT__ID:
				setId((String)newValue);
				return;
			case PatternstructurePackage.PATTERN_ELEMENT__INTERNAL_ID:
				setInternalId((Integer)newValue);
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
			case PatternstructurePackage.PATTERN_ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case PatternstructurePackage.PATTERN_ELEMENT__INTERNAL_ID:
				setInternalId(INTERNAL_ID_EDEFAULT);
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
			case PatternstructurePackage.PATTERN_ELEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PatternstructurePackage.PATTERN_ELEMENT__INTERNAL_ID:
				return internalId != INTERNAL_ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PatternstructurePackage.PATTERN_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case PatternstructurePackage.PATTERN_ELEMENT___IS_VALID__ABSTRACTIONLEVEL:
				try {
					isValid((AbstractionLevel)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.PATTERN_ELEMENT___IS_VALID_LOCAL__ABSTRACTIONLEVEL:
				try {
					isValidLocal((AbstractionLevel)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.PATTERN_ELEMENT___GENERATE_QUERY__LANGUAGE:
				try {
					return generateQuery((Language)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY:
				try {
					return generateXQuery();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.PATTERN_ELEMENT___GENERATE_SPARQL:
				try {
					return generateSparql();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.PATTERN_ELEMENT___GENERATE_CYPHER:
				try {
					return generateCypher();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY_JAVA:
				try {
					return generateXQueryJava();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.PATTERN_ELEMENT___GENERATE_XQUERY_JAVA_RETURN:
				try {
					return generateXQueryJavaReturn();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.PATTERN_ELEMENT___GENERATE_QUERY_FILTER_PART:
				try {
					return generateQueryFilterPart();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.PATTERN_ELEMENT___CONTAINS_JAVA_OPERATOR:
				try {
					return containsJavaOperator();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.PATTERN_ELEMENT___CREATE_ADAPTION__LANGUAGE:
				try {
					return createAdaption((Language)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.PATTERN_ELEMENT___CREATE_XML_ADAPTION:
				try {
					return createXmlAdaption();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.PATTERN_ELEMENT___CREATE_RDF_ADAPTION:
				try {
					return createRdfAdaption();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.PATTERN_ELEMENT___CREATE_NEO4J_ADAPTION:
				try {
					return createNeo4jAdaption();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.PATTERN_ELEMENT___RELATIONS_XML_ADAPTED:
				return relationsXmlAdapted();
			case PatternstructurePackage.PATTERN_ELEMENT___PREPARE_TRANSLATION:
				prepareTranslation();
				return null;
			case PatternstructurePackage.PATTERN_ELEMENT___INITIALIZE_TRANSLATION:
				initializeTranslation();
				return null;
			case PatternstructurePackage.PATTERN_ELEMENT___PREPARE_PARAMETER_UPDATES:
				return prepareParameterUpdates();
			case PatternstructurePackage.PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT_ELIST:
				triggerParameterUpdates((PatternElement)arguments.get(0), (EList<PatternElement>)arguments.get(1));
				return null;
			case PatternstructurePackage.PATTERN_ELEMENT___UPDATE_PARAMETERS__PARAMETERLIST:
				updateParameters((ParameterList)arguments.get(0));
				return null;
			case PatternstructurePackage.PATTERN_ELEMENT___TRIGGER_PARAMETER_UPDATES__PATTERNELEMENT:
				triggerParameterUpdates((PatternElement)arguments.get(0));
				return null;
			case PatternstructurePackage.PATTERN_ELEMENT___GET_CONTAINER:
				try {
					return getContainer();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.PATTERN_ELEMENT___GET_ANCESTOR__CLASS:
				try {
					return getAncestor((Class)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.PATTERN_ELEMENT___GET_OPERATOR_LIST:
				return getOperatorList();
			case PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_OPERATORS:
				try {
					return getAllOperators();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.PATTERN_ELEMENT___GET_PARAMETER_LIST:
				return getParameterList();
			case PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_PARAMETERS:
				try {
					return getAllParameters();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.PATTERN_ELEMENT___MY_TO_STRING:
				return myToString();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", internalId: ");
		result.append(getInternalId());
		result.append(')');
		return result.toString();
	}

} // PatternElementImpl
