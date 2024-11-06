/**
 */
package qualitypatternmodel.patternstructure.impl;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.gwdg.metadataqa.api.schema.BaseSchema;
import qualitypatternmodel.adaptionneo4j.NeoElementNode;
import qualitypatternmodel.adaptionneo4j.NeoNode;
import qualitypatternmodel.adaptionneo4j.NeoPlace;
import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.adaptionrdf.RdfPathComponent;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.adaptionrdf.impl.RdfIriNodeImpl;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.impl.GraphImpl;
import qualitypatternmodel.graphstructure.impl.NodeImpl;
import qualitypatternmodel.graphstructure.impl.RelationImpl;
import qualitypatternmodel.javaquery.BooleanFilterPart;
import qualitypatternmodel.javaquery.FormulaFilterPart;
import qualitypatternmodel.javaquery.JavaFilter;
import qualitypatternmodel.javaquery.JavaFilterPart;
import qualitypatternmodel.javaquery.impl.FormulaFilterPartImpl;
import qualitypatternmodel.javaquery.impl.JavaFilterImpl;
import qualitypatternmodel.javaqueryoutput.impl.InterimResultPartImpl;
import qualitypatternmodel.mqaftranslation.MqafTranslation;
import qualitypatternmodel.operators.impl.OperatorImpl;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.impl.ParameterImpl;
import qualitypatternmodel.parameters.impl.ParameterListImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.textrepresentation.TextrepresentationPackage;
import qualitypatternmodel.textrepresentation.ValueMap;
import qualitypatternmodel.textrepresentation.impl.ValueMapImpl;
import qualitypatternmodel.utility.ConstantsNeo;
import qualitypatternmodel.utility.ConstantsRdf;
import qualitypatternmodel.utility.ConstantsXml;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Pattern</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getParameterList <em>Parameter List</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getText <em>Text</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getPatternId <em>Pattern Id</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getName <em>Name</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getAbstractId <em>Abstract Id</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getDataModelName <em>Data Model Name</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getParameterCounter <em>Parameter Counter</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getCounter <em>Counter</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getElementCounter <em>Element Counter</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getRelationCounter <em>Relation Counter</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getOperatorCounter <em>Operator Counter</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getLastSaved <em>Last Saved</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getNamespaces <em>Namespaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompletePatternImpl extends PatternImpl implements CompletePattern {
	/**
	 * The cached value of the '{@link #getParameterList() <em>Parameter List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * The list of all <code>Parameters</code> in this <code>CompletePattern</code>
	 * They can be referenced from components of <code>Graphs</code> directly or indirectly contained in this <code>CompletePattern</code>.
	 * <!-- end-user-doc -->
	 * @see #getParameterList()
	 * @generated
	 * @ordered
	 */
	protected ParameterList parameterList;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected EList<PatternText> text;

	/**
	 * The default value of the '{@link #getPatternId() <em>Pattern Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternId()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPatternId() <em>Pattern Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternId()
	 * @generated
	 * @ordered
	 */
	protected String patternId = PATTERN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getName()
	 * @generated NOT
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Pattern";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc -->
	 * The user defined name of this pattern. It should describe roughly the pattern's purpose.
	 * <!-- end-user-doc -->
	 *
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbstractId() <em>Abstract Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractId()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSTRACT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbstractId() <em>Abstract Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractId()
	 * @generated
	 * @ordered
	 */
	protected String abstractId = ABSTRACT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final Language LANGUAGE_EDEFAULT = Language.GENERIC;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected Language language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataModelName() <em>Data Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataModelName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_MODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataModelName() <em>Data Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataModelName()
	 * @generated
	 * @ordered
	 */
	protected String dataModelName = DATA_MODEL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseName()
	 * @generated
	 * @ordered
	 */
	protected String databaseName = DATABASE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKeywords() <em>Keywords</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywords()
	 * @generated
	 * @ordered
	 */
	protected EList<String> keywords;

	/**
	 * The default value of the '{@link #getParameterCounter() <em>Parameter Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	 * @see #getParameterCounter()
	 * @generated NOT
	 * @ordered
	 */
	protected static final Integer PARAMETER_COUNTER_EDEFAULT = Integer.valueOf(1);

	/**
	 * The cached value of the '{@link #getParameterCounter() <em>Parameter Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
		 * Counter for {@link qualitypatternmodel.patternstructure.PatternElement#getInternalId internalId} of <code>Parameters</code>.
		 * <!-- end-user-doc -->
	 * @see #getParameterCounter()
	 * @generated
	 * @ordered
	 */
	protected Integer parameterCounter = PARAMETER_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCounter() <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	 * @see #getCounter()
	 * @generated NOT
	 * @ordered
	 */
	protected static final Integer COUNTER_EDEFAULT = Integer.valueOf(1);

	/**
	 * The cached value of the '{@link #getCounter() <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
		 * Counter for {@link qualitypatternmodel.patternstructure.PatternElement#getInternalId internalId} of classes other than <code>Element</code>, <code>Relation</code>,
		 * <code>Property</code>, <code>Parameter</code> and <code>Operator</code>.
		 * <!-- end-user-doc -->
	 * @see #getCounter()
	 * @generated
	 * @ordered
	 */
	protected Integer counter = COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementCounter() <em>Element Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementCounter()
	 * @generated NOT
	 * @ordered
	 */
	protected static final Integer ELEMENT_COUNTER_EDEFAULT = Integer.valueOf(1);

	/**
	 * The cached value of the '{@link #getElementCounter() <em>Element Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
		 * Counter for {@link qualitypatternmodel.patternstructure.PatternElement#getInternalId internalId} of <code>Elements</code>.
		 * <!-- end-user-doc -->
	 * @see #getElementCounter()
	 * @generated
	 * @ordered
	 */
	protected Integer elementCounter = ELEMENT_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelationCounter() <em>Relation Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationCounter()
	 * @generated NOT
	 * @ordered
	 */
	protected static final Integer RELATION_COUNTER_EDEFAULT = Integer.valueOf(1);

	/**
	 * The cached value of the '{@link #getRelationCounter() <em>Relation Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
		 * Counter for {@link qualitypatternmodel.patternstructure.PatternElement#getInternalId internalId} of <code>Relations</code>.
		 * <!-- end-user-doc -->
	 * @see #getRelationCounter()
	 * @generated
	 * @ordered
	 */
	protected Integer relationCounter = RELATION_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperatorCounter() <em>Operator Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	 * @see #getOperatorCounter()
	 * @generated NOT
	 * @ordered
	 */
	protected static final Integer OPERATOR_COUNTER_EDEFAULT = Integer.valueOf(1);

	/**
	 * The cached value of the '{@link #getOperatorCounter() <em>Operator Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
		 * Counter for {@link qualitypatternmodel.patternstructure.PatternElement#getInternalId internalId} of <code>Operators</code>.
		 * <!-- end-user-doc -->
	 * @see #getOperatorCounter()
	 * @generated
	 * @ordered
	 */
	protected Integer operatorCounter = OPERATOR_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastSaved() <em>Last Saved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSaved()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_SAVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastSaved() <em>Last Saved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSaved()
	 * @generated
	 * @ordered
	 */
	protected Date lastSaved = LAST_SAVED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNamespaces() <em>Namespaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaces()
	 * @generated
	 * @ordered
	 */
	protected ValueMap namespaces;

	//	protected int[] elementCounter = {1,1,1,1,1,1};

	protected CompletePatternImpl() {
		super();
		setParameterList(new ParameterListImpl(this));
		setGraph(new GraphImpl());
		setCondition(null);

		NodeImpl element = new NodeImpl();
		element.setGraph(getGraph());
		element.setReturnNode(true);

		getInternalId();
	}


	@Override
	public void isValid(AbstractionLevel abstractionLevel)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// If adaptationFinalized is true, Pattern can only be SEMI_ABSTRACT if it is ABSTRACT.
		super.isValid(abstractionLevel);
		parameterList.isValid(abstractionLevel);
		if(abstractionLevel == AbstractionLevel.CONCRETE && getText().size() > 1) {
			throw new InvalidityException("concrete pattern has too many fragments");
		}

//		Boolean db = getDatabaseName() == null || getDatabaseName().equals("");
//		Boolean dm = getDataModelName() == null || getDataModelName().equals("");
//		if(abstractionLevel == AbstractionLevel.CONCRETE && dm) {
//			throw new InvalidityException("pattern has no datamodel specified.");
//		}
//		if(abstractionLevel == AbstractionLevel.CONCRETE && ( db || dm)) {
//			throw new InvalidityException("pattern has " + (db? "no database ":"") + (db&&dm? "and ":"") + (dm? "no datamodel": "") + "specified.");
//		}
		for(PatternText p : getText()) {
			p.isValid(abstractionLevel);
		}
	}

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		super.isValidLocal(abstractionLevel);
		if (parameterList == null) {
			throw new InvalidityException("variableList null" + " (" + getInternalId() + ")");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public JavaFilter generateQueryFilter() throws InvalidityException {
		if (getLanguage() != Language.XML) {
			throw new InvalidityException("Query Filter not implemented for Language " + getLanguage().getName());
		}
		String query = generateXQueryJava();
		JavaFilterPart filterpart = generateQueryFilterPart();
		JavaFilter filter = new JavaFilterImpl();
		filter.setLanguage(getLanguage());
		filter.setPatternId(getId());
		filter.setPatternName(getName());
		filter.setQuery(query);
		filter.setFilter((BooleanFilterPart) filterpart);
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void updateLastSaved() {
		lastSaved = new Date();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String generateXQueryNamespaces() throws InvalidityException {
		ValueMap namespaces = getNamespaces();
		if (namespaces == null || namespaces.isEmpty()) {
			return null;
		}

		String result = "";
		for (String prefix: namespaces.getKeys()) {
			String uri = namespaces.get(prefix);
			if (prefix.equals("")) {
				result += "declare default element namespace \"" + uri + "\";\n";
			} else if (prefix.matches(ConstantsXml.REGEX_PREFIX)) {
				result += "declare namespace " + prefix + "=\"" + uri + "\";\n";
			} else 
				throw new InvalidityException("Invalid Namespace : \"" + prefix + "\" : \"" + uri + "\"");
		}
		return result;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void printParameters(boolean vars) {
		int i=0;
		System.out.println("List<Parameter> params = completePattern.getParameterList().getParameters();");
		for (Parameter p: getParameterList().getParameters()){
			String out = "";
			if (vars) {
				out += " p" + i + " = ";
				out += "((" + p.getClass().getSimpleName().replace("Impl", "");
				out += ") ";
			}
			out += "params.get(" + i + ")";
			if (!vars) {
				String value = p.getValueAsString();
				if (value != null)
					value = "\"" + value.replace("\"", "\\\"") + "\"";
				out += ".setValueFromString(" + value + ");";
			}
				
			out += " // " + p.getClass().getSimpleName().replace("Impl", "");
			if (p instanceof XmlPathParam && ((XmlPathParam) p).isProperty())
				out += " Property";
			System.out.println(out);
			i++;
		}
	}


	@Override
	public JavaFilterPart generateQueryFilterPart() throws InvalidityException {
		InterimResultPartImpl.resetIdCounter();
		Boolean graph = getGraph().containsJavaOperator();
		Boolean condition = false;
		if (getCondition() != null)
			condition = getCondition().containsJavaOperator();

		if (graph && condition) {
			BooleanFilterPart sub1 = (BooleanFilterPart) getGraph().generateQueryFilterPart();
			BooleanFilterPart sub2 = (BooleanFilterPart) getCondition().generateQueryFilterPart();
			FormulaFilterPart container = new FormulaFilterPartImpl(LogicalOperator.AND, sub1, sub2);
			return container;
		}
		else if (graph) {
			JavaFilterPart graphfilter = getGraph().generateQueryFilterPart();
			return graphfilter;
		} else if (condition) {
			JavaFilterPart conditionfilter = getCondition().generateQueryFilterPart();
			return conditionfilter;
		} else {
			return null;
		}
	}

	@Override
	public String generateXQuery() throws InvalidityException {
		if (containsJavaOperator()) {
			throw new InvalidityException("This pattern cannot be executed via default XQuery. A custom Java Filter build is required.");
		}
		return super.generateXQuery();
	}

	@Override
	public String generateXQueryJava() throws InvalidityException {
		if (!containsJavaOperator()) {
			return generateXQuery();
		}
		initializeTranslation();

		String preClauses = "";
		if (this instanceof CompletePattern) {
			initializeTranslation();
			CompletePattern t = (CompletePattern) this;
			if (t.getNamespaces() != null && !t.getNamespaces().isEmpty()) {
				preClauses = t.generateXQueryNamespaces();
			}
			preClauses += getParameterList().generateXQuery();
		}
		String res = getParameterList().generateXQuery();
		res += super.generateXQueryJava();
		if (res.startsWith("\n")) {
			res = res.substring(1);
		}
		res = preClauses + res;

		if (getPartialXmlQuery().startsWith("\n")) {
			setPartialXmlQuery(getPartialXmlQuery().substring(1));
		}
		setPartialXmlQuery(preClauses + getPartialXmlQuery());
		return res;
	}

	@Override
	public String generateSparql() throws InvalidityException {
		if (containsJavaOperator()) {
			throw new InvalidityException("This pattern cannot be executed via default Sparql query. A custom Java Filter build is required. However this is not implemented for RDF yet.");
		}
		initializeTranslation();
		if (graph.getReturnNodes() == null || graph.getReturnNodes().isEmpty()) {
			throw new InvalidityException("return elements missing");
		}

		EList<String> prefixes = new BasicEList<String>();
		for(Parameter p : getParameterList().getParameters()) {
			if(p instanceof RdfPathComponent) {
				RdfPathComponent rdfPathComponent = (RdfPathComponent) p;
				for(RdfSinglePredicate rdfSinglePredicate : rdfPathComponent.getRdfSinglePredicates()) {
					if(rdfSinglePredicate.getIriParam() != null) {
						IriParam iriParam = rdfSinglePredicate.getIriParam();
						if(iriParam.getPrefix() != null) {
							String standardIri = iriParam.getStandardIri();
							if(standardIri == null) {
								throw new InvalidityException("Invalid prefix");
							}
							String prefixDeclaration = ConstantsRdf.PREFIX + iriParam.getPrefix() + ": <" + standardIri + ">";
							boolean found = false;
							for(String s : prefixes) {
								if(s.equals(prefixDeclaration)) {
									found = true;
								}
							}
							if(!found) {
								prefixes.add(prefixDeclaration);
							}
						}
					}
				}
			}
		}

		EList<Node> selects = graph.getReturnNodes();

		String query = "";
		for (String p: prefixes) {
			query += "\n" + p;
		}
		query += ConstantsRdf.SELECT;
		for (Node s: selects) {
			query += "\n  ?var" + s.getInternalId();
		}
		query += ConstantsRdf.WHERE +"{";
		query += super.generateSparql().replace("\n", "\n  ");
		query += "\n}";

		return query;
	}

	//BEGIN - NEO4J/CYPHER

	/**
	 * @author Lukas Sebastian Hofmann
	 * @return String
	 * Return the complete Cypher-Read/Quality-Query.
	 * <i>At least on Return-Node has to be given.</i>
	 */
	@Override
	public String generateCypher() throws InvalidityException {
		if (containsJavaOperator()) {
			throw new InvalidityException("This pattern cannot be executed via default Cypher query. A custom Java Filter build is required. However this is not implemented for Neo4j yet.");
		}

		initializeTranslation();

		if (graph.getReturnNodes() == null || graph.getReturnNodes().isEmpty()) {
			throw new InvalidityException(ConstantsRdf.RETURN_ELEMENT_S_MISSING);
		}

		String completeCyString = super.generateCypher();

		String returnClause = this.generateCypherReturn();
		returnClause = ConstantsNeo.CLAUSE_RETURN + returnClause;
		completeCyString += returnClause;

		return completeCyString;
	}
	//PROTOTYP: in future versions a SET/REMOVE for COUNT-Pattern must be ingegrated. This is not intended in the current version

	/**
	 * <!-- begin-user-doc -->
	 * Generates for the Nodes and the Edges the Return values.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String generateCypherReturn() throws InvalidityException {
		String cypher = new String();
		cypher = generateCypherReturnNodes(cypher);
		cypher = generateCypherReturnEdges(cypher);
		return cypher;
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * @return String
	 * This method generates the substring for all Nodes and Properties which shall be returned.
	 */
	@Override
	protected final String generateCypherReturnNodes(String cypher) throws InvalidityException {
		if (graph.getNodes().size() != 0) {
			//Building the generic Nodes for Return
			final Map<Integer, String> cypherReturn = buildCypherReturnSortedMap(true);
			//The implicit defined nodes for the NeoPropertyNodes will not be printed, except via the edge it they will be called.
			cypher = formattingCypherReturnTypes(cypher, cypherReturn);
		}
		return cypher;
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * @return string
	 * This method generates the substring for all Edges which shall be returned.
	 */
	@Override
	protected final String generateCypherReturnEdges(String cypher) throws InvalidityException {
		if (graph.getRelations().size() != 0) {
			//Building the generic Relations for Return
			final Map<Integer, String> cypherReturn = buildCypherReturnSortedMap(false);
			cypher = formattingCypherReturnTypes(cypher, cypherReturn);

			//Adding the Inner Edges to the Return
			cypher = generateCypherSpecialInnerEdgeNodesString(cypher);
		}
		return cypher;
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * @return String
	 * This methods generates the substring for all special return types which can not be handled in {@generateCypherReturnEdges} or {generateCypherReturnNodes}.
	 */
	@Override
	protected final String generateCypherSpecialInnerEdgeNodesString(String cypher) throws InvalidityException {
		final StringBuilder cypherInnerEdgeNodes = new StringBuilder(super.generateCypherSpecialInnerEdgeNodesString(""));
		if (cypherInnerEdgeNodes.length() != 0) {
			if (cypher.length() != 0) {
				cypher += ConstantsNeo.CYPHER_SEPERATOR + "\n" + ConstantsNeo.THREE_WHITESPACES + cypherInnerEdgeNodes.toString();
			} else {
				cypher = ConstantsNeo.ONE_WHITESPACE + cypherInnerEdgeNodes.toString();
			}
		}
		return cypher;
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * @param cypherReturn
	 * @return String
	 * This method formats the Return-Clause String.
	 * It does not add the <i>KEY-WORD</i> "<p>RETURN</p>".
	 */
	private final String formattingCypherReturnTypes(String cypher, final Map<Integer, String> cypherReturn) {
		for (Map.Entry<Integer, String> mapElement : cypherReturn.entrySet()) {
		    if (cypher.length() != 0) {
		    	cypher += ConstantsNeo.CYPHER_SEPERATOR_WITH_ONE_WITHESPACE + "\n";
		    	cypher += ConstantsNeo.THREE_WHITESPACES;
		    } else {
		    	cypher = ConstantsNeo.ONE_WHITESPACE;
		    }
			cypher += mapElement.getValue();
		}
		return cypher;
	}

	//BEGIN - AUTOMATIC SETTING OF THE BEGINNING
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param patternElement
	 * @throws InvalidityException
	 * This methods sets the beginning in each subgraph. It determines where later on the generating of the match clause shall start.
	 * Furthermore, it reduces the time of cypher-query-generation.
	 * We used this flagging automation for reducing the traversels during the abstraction and the concretization.
	 * Hence no new Node instance can be added.
	 */
	private final void setNeo4jBeginnings(PatternElement patternElement) throws InvalidityException {
		final EList<EList<Node>> genericGraphs = this.getGraph().getAllSubGraphs();
		final EList<EList<NeoNode>> graphs = new BasicEList<EList<NeoNode>>();
		EList<NeoNode> graphList = null;
		for (EList<Node> graph : genericGraphs) {
			graphList = new BasicEList<NeoNode>();
			for (Node n : graph) {
				graphList.add((NeoNode) n);
			}
			graphs.add(graphList);
		}
		setNeo4jBeginningsInSubGraph(graphs);
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @param graphs
	 * Sets for subgraphs the BEGINNING.
	 * If a subgraph is not cyclic the node which has no incoming relation is the starting point.
	 * If a subgraph is cyclic the first NeoElementNode will be flagged as beginning.
	 */
	private final void setNeo4jBeginningsInSubGraph(final EList<EList<NeoNode>> graphs) {
		boolean hasBeginning = false;
		Node node = null;
		NeoElementNode tempNeoNode = null;
		for (EList<NeoNode> graph : graphs) {
			for (NeoNode neoNode : graph) {
				node = (Node) neoNode;
				if (node.getIncoming().size() == 0 && node instanceof NeoElementNode) {
					tempNeoNode = (NeoElementNode) node;
					tempNeoNode.setNeoPlace(NeoPlace.BEGINNING);
					hasBeginning = true;
				}
			}
			if (!hasBeginning) {
				for (int i = 0; i < graph.size(); i++) {
					node = (Node) graph.get(i);
					if (node instanceof NeoElementNode) {
						tempNeoNode = (NeoElementNode) node;
						tempNeoNode.setNeoPlace(NeoPlace.BEGINNING);
						hasBeginning = true;
						i = graph.size();
					}
				}
			}
			hasBeginning = false;
		}
	}
	//END - AUTOMATIC SETTING OF THE BEGINNING
	//END - NEO4J/CYPHER

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public int getNewRefNo(Class<?> type) {
		getElementCounter();
		if (NodeImpl.class.isAssignableFrom(type)) {
			return elementCounter++;
		}
		if (RelationImpl.class.isAssignableFrom(type)) {
			return relationCounter++;
		}
		if (ParameterImpl.class.isAssignableFrom(type)) {
			return parameterCounter++;
		}
		if (OperatorImpl.class.isAssignableFrom(type)) {
			return operatorCounter++;
		}

		return counter++;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void recordValues() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
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
	public AbstractionLevel getAbstractionLevel() {

		try {
			isValid(AbstractionLevel.SEMI_CONCRETE);

			try {
				isValid(AbstractionLevel.CONCRETE);
				return AbstractionLevel.CONCRETE;
			} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e1) {
				try {
					isValid(AbstractionLevel.ABSTRACT);
					return AbstractionLevel.ABSTRACT;
				} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e2) {
					return AbstractionLevel.SEMI_CONCRETE;
				}
			}

		} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e3) {
			try {
				isValid(AbstractionLevel.SEMI_ABSTRACT);
				try {
					isValid(AbstractionLevel.GENERIC);
					return AbstractionLevel.GENERIC;
				} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e4) {
					return AbstractionLevel.SEMI_ABSTRACT;
				}
			} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e5) {
				try {
					isValid(AbstractionLevel.SEMI_GENERIC);
					return AbstractionLevel.SEMI_GENERIC;
				} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e6) {
					// pattern invalid
					return null;
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void resetQuery() {
		setXmlQuery(null);
		setPartialXmlQuery(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException
	 * @generated NOT
	 */
	@Override
	public String generateWikidataSparql() throws InvalidityException {
		String oldVariable = RdfIriNodeImpl.RDF_PREDICATE;
		RdfIriNodeImpl.RDF_PREDICATE = ConstantsRdf.PREDICATE_WIKIDATA;
		String result = generateSparql();
		RdfIriNodeImpl.RDF_PREDICATE = oldVariable;
		return result;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public BaseSchema generateXmlConstraintSchema() throws InvalidityException {
		return MqafTranslation.translateToConstraintSchema(this);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws IOException
	 * @generated NOT
	 */
	@Override
	public void generateXmlConstraintYAMLFile(String path) throws InvalidityException, IOException {
		String content = MqafTranslation.translateToConstraintString(this);
		Files.write( Paths.get(path), content.getBytes());
	}

	@Override
	public String generateXmlConstraintYAMLFileContent() throws InvalidityException {
		return MqafTranslation.translateToConstraintString(this);
	}


	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternstructurePackage.Literals.COMPLETE_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterList getParameterList() {
		return parameterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterList(ParameterList newParameterList, NotificationChain msgs) {
		ParameterList oldParameterList = parameterList;
		parameterList = newParameterList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST, oldParameterList, newParameterList);
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
	public void setParameterList(ParameterList newParameterList) {
		if (newParameterList != parameterList) {
			NotificationChain msgs = null;
			if (parameterList != null)
				msgs = ((InternalEObject)parameterList).eInverseRemove(this, ParametersPackage.PARAMETER_LIST__PATTERN, ParameterList.class, msgs);
			if (newParameterList != null)
				msgs = ((InternalEObject)newParameterList).eInverseAdd(this, ParametersPackage.PARAMETER_LIST__PATTERN, ParameterList.class, msgs);
			msgs = basicSetParameterList(newParameterList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST, newParameterList, newParameterList));
	}

	@Override
	public Graph getGraph() {
		return graph;
	}

	@Override
	public void setGraph(Graph newGraph) {
		if (newGraph != graph) {
			NotificationChain msgs = null;
			if (graph != null) {
				msgs = ((InternalEObject)graph).eInverseRemove(this, GraphstructurePackage.GRAPH__PATTERN, Graph.class, msgs);
			}
			if (newGraph != null) {
				msgs = ((InternalEObject)newGraph).eInverseAdd(this, GraphstructurePackage.GRAPH__PATTERN, Graph.class, msgs);
			}
			msgs = basicSetGraph(newGraph, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__GRAPH, newGraph, newGraph));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public String getName() {
		if (name == null) {
			return patternId;
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setName(String newName) {
		if(newName == null || newName.equals("")) {
			newName = NAME_EDEFAULT;
		}
		String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__NAME, oldName, name));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAbstractId() {
		return abstractId;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstractId(String newAbstractId) {
		String oldAbstractId = abstractId;
		abstractId = newAbstractId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__ABSTRACT_ID, oldAbstractId, abstractId));
	}


	@Override
	public PatternElement createXmlAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValid(AbstractionLevel.GENERIC);
		PatternElement result = super.createXmlAdaption();
		setLanguage(Language.XML);
		isValid(AbstractionLevel.ABSTRACT);
		return result;
	}

	@Override
	public PatternElement createRdfAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValid(AbstractionLevel.GENERIC);
		PatternElement result = super.createRdfAdaption();
		setLanguage(Language.RDF);
		isValid(AbstractionLevel.ABSTRACT);
		return result;
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @throws InvalidityException, OperatorCycleException, MissingPatternContainerException
	 * @return {@link PatternElement}
	 * This method adapts the Patternstructure to Neo4J/Cypher.
	 * Furthermore, it sets the Beginnings for the graph traversal.
	 */
	@Override
	public PatternElement createNeo4jAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValid(AbstractionLevel.GENERIC);

		PatternElement patternElement = super.createNeo4jAdaption();
		setLanguage(Language.NEO4J);
		setNeo4jBeginnings(patternElement);

		return patternElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getElementCounter() {
		return elementCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementCounter(Integer newElementCounter) {
		Integer oldElementCounter = elementCounter;
		elementCounter = newElementCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__ELEMENT_COUNTER, oldElementCounter, elementCounter));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRelationCounter() {
		return relationCounter;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelationCounter(Integer newRelationCounter) {
		Integer oldRelationCounter = relationCounter;
		relationCounter = newRelationCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__RELATION_COUNTER, oldRelationCounter, relationCounter));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getParameterCounter() {
		return parameterCounter;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterCounter(Integer newParameterCounter) {
		Integer oldParameterCounter = parameterCounter;
		parameterCounter = newParameterCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_COUNTER, oldParameterCounter, parameterCounter));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Language getLanguage() {
		return language;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(Language newLanguage) {
		Language oldLanguage = language;
		language = newLanguage == null ? LANGUAGE_EDEFAULT : newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__LANGUAGE, oldLanguage, language));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataModelName() {
		return dataModelName;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataModelName(String newDataModelName) {
		String oldDataModelName = dataModelName;
		dataModelName = newDataModelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__DATA_MODEL_NAME, oldDataModelName, dataModelName));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDatabaseName() {
		return databaseName;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatabaseName(String newDatabaseName) {
		String oldDatabaseName = databaseName;
		databaseName = newDatabaseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__DATABASE_NAME, oldDatabaseName, databaseName));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getKeywords() {
		if (keywords == null) {
			keywords = new EDataTypeUniqueEList<String>(String.class, this, PatternstructurePackage.COMPLETE_PATTERN__KEYWORDS);
		}
		return keywords;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOperatorCounter() {
		return operatorCounter;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperatorCounter(Integer newOperatorCounter) {
		Integer oldOperatorCounter = operatorCounter;
		operatorCounter = newOperatorCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__OPERATOR_COUNTER, oldOperatorCounter, operatorCounter));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastSaved() {
		return lastSaved;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastSaved(Date newLastSaved) {
		Date oldLastSaved = lastSaved;
		lastSaved = newLastSaved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__LAST_SAVED, oldLastSaved, lastSaved));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public ValueMap getNamespaces() {
		if (namespaces == null)
			namespaces = new ValueMapImpl();
		return namespaces;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamespaces(ValueMap newNamespaces, NotificationChain msgs) {
		ValueMap oldNamespaces = namespaces;
		namespaces = newNamespaces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__NAMESPACES, oldNamespaces, newNamespaces);
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
	public void setNamespaces(ValueMap newNamespaces) {
		if (newNamespaces != namespaces) {
			NotificationChain msgs = null;
			if (namespaces != null)
				msgs = ((InternalEObject)namespaces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.COMPLETE_PATTERN__NAMESPACES, null, msgs);
			if (newNamespaces != null)
				msgs = ((InternalEObject)newNamespaces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.COMPLETE_PATTERN__NAMESPACES, null, msgs);
			msgs = basicSetNamespaces(newNamespaces, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__NAMESPACES, newNamespaces, newNamespaces));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> validateAgainstSchema() throws InvalidityException {
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
	public Integer getCounter() {
		return counter;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCounter(Integer newCounter) {
		Integer oldCounter = counter;
		counter = newCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__COUNTER, oldCounter, counter));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PatternText> getText() {
		if (text == null) {
			text = new EObjectContainmentWithInverseEList<PatternText>(PatternText.class, this, PatternstructurePackage.COMPLETE_PATTERN__TEXT, TextrepresentationPackage.PATTERN_TEXT__PATTERN);
		}
		return text;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPatternId() {
		return patternId;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatternId(String newPatternId) {
		String oldPatternId = patternId;
		patternId = newPatternId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__PATTERN_ID, oldPatternId, patternId));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__DESCRIPTION, oldDescription, description));
	}


	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST:
				if (parameterList != null)
					msgs = ((InternalEObject)parameterList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST, null, msgs);
				return basicSetParameterList((ParameterList)otherEnd, msgs);
			case PatternstructurePackage.COMPLETE_PATTERN__TEXT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getText()).basicAdd(otherEnd, msgs);
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
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST:
				return basicSetParameterList(null, msgs);
			case PatternstructurePackage.COMPLETE_PATTERN__TEXT:
				return ((InternalEList<?>)getText()).basicRemove(otherEnd, msgs);
			case PatternstructurePackage.COMPLETE_PATTERN__NAMESPACES:
				return basicSetNamespaces(null, msgs);
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
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST:
				return getParameterList();
			case PatternstructurePackage.COMPLETE_PATTERN__TEXT:
				return getText();
			case PatternstructurePackage.COMPLETE_PATTERN__PATTERN_ID:
				return getPatternId();
			case PatternstructurePackage.COMPLETE_PATTERN__NAME:
				return getName();
			case PatternstructurePackage.COMPLETE_PATTERN__ABSTRACT_ID:
				return getAbstractId();
			case PatternstructurePackage.COMPLETE_PATTERN__DESCRIPTION:
				return getDescription();
			case PatternstructurePackage.COMPLETE_PATTERN__LANGUAGE:
				return getLanguage();
			case PatternstructurePackage.COMPLETE_PATTERN__DATA_MODEL_NAME:
				return getDataModelName();
			case PatternstructurePackage.COMPLETE_PATTERN__DATABASE_NAME:
				return getDatabaseName();
			case PatternstructurePackage.COMPLETE_PATTERN__KEYWORDS:
				return getKeywords();
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_COUNTER:
				return getParameterCounter();
			case PatternstructurePackage.COMPLETE_PATTERN__COUNTER:
				return getCounter();
			case PatternstructurePackage.COMPLETE_PATTERN__ELEMENT_COUNTER:
				return getElementCounter();
			case PatternstructurePackage.COMPLETE_PATTERN__RELATION_COUNTER:
				return getRelationCounter();
			case PatternstructurePackage.COMPLETE_PATTERN__OPERATOR_COUNTER:
				return getOperatorCounter();
			case PatternstructurePackage.COMPLETE_PATTERN__LAST_SAVED:
				return getLastSaved();
			case PatternstructurePackage.COMPLETE_PATTERN__NAMESPACES:
				return getNamespaces();
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
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST:
				setParameterList((ParameterList)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends PatternText>)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__PATTERN_ID:
				setPatternId((String)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__NAME:
				setName((String)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__ABSTRACT_ID:
				setAbstractId((String)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__LANGUAGE:
				setLanguage((Language)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__DATA_MODEL_NAME:
				setDataModelName((String)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__DATABASE_NAME:
				setDatabaseName((String)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__KEYWORDS:
				getKeywords().clear();
				getKeywords().addAll((Collection<? extends String>)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_COUNTER:
				setParameterCounter((Integer)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__COUNTER:
				setCounter((Integer)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__ELEMENT_COUNTER:
				setElementCounter((Integer)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__RELATION_COUNTER:
				setRelationCounter((Integer)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__OPERATOR_COUNTER:
				setOperatorCounter((Integer)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__LAST_SAVED:
				setLastSaved((Date)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__NAMESPACES:
				setNamespaces((ValueMap)newValue);
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
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST:
				setParameterList((ParameterList)null);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__TEXT:
				getText().clear();
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__PATTERN_ID:
				setPatternId(PATTERN_ID_EDEFAULT);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__ABSTRACT_ID:
				setAbstractId(ABSTRACT_ID_EDEFAULT);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__DATA_MODEL_NAME:
				setDataModelName(DATA_MODEL_NAME_EDEFAULT);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__DATABASE_NAME:
				setDatabaseName(DATABASE_NAME_EDEFAULT);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__KEYWORDS:
				getKeywords().clear();
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_COUNTER:
				setParameterCounter(PARAMETER_COUNTER_EDEFAULT);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__COUNTER:
				setCounter(COUNTER_EDEFAULT);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__ELEMENT_COUNTER:
				setElementCounter(ELEMENT_COUNTER_EDEFAULT);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__RELATION_COUNTER:
				setRelationCounter(RELATION_COUNTER_EDEFAULT);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__OPERATOR_COUNTER:
				setOperatorCounter(OPERATOR_COUNTER_EDEFAULT);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__LAST_SAVED:
				setLastSaved(LAST_SAVED_EDEFAULT);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__NAMESPACES:
				setNamespaces((ValueMap)null);
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
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST:
				return parameterList != null;
			case PatternstructurePackage.COMPLETE_PATTERN__TEXT:
				return text != null && !text.isEmpty();
			case PatternstructurePackage.COMPLETE_PATTERN__PATTERN_ID:
				return PATTERN_ID_EDEFAULT == null ? patternId != null : !PATTERN_ID_EDEFAULT.equals(patternId);
			case PatternstructurePackage.COMPLETE_PATTERN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PatternstructurePackage.COMPLETE_PATTERN__ABSTRACT_ID:
				return ABSTRACT_ID_EDEFAULT == null ? abstractId != null : !ABSTRACT_ID_EDEFAULT.equals(abstractId);
			case PatternstructurePackage.COMPLETE_PATTERN__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PatternstructurePackage.COMPLETE_PATTERN__LANGUAGE:
				return language != LANGUAGE_EDEFAULT;
			case PatternstructurePackage.COMPLETE_PATTERN__DATA_MODEL_NAME:
				return DATA_MODEL_NAME_EDEFAULT == null ? dataModelName != null : !DATA_MODEL_NAME_EDEFAULT.equals(dataModelName);
			case PatternstructurePackage.COMPLETE_PATTERN__DATABASE_NAME:
				return DATABASE_NAME_EDEFAULT == null ? databaseName != null : !DATABASE_NAME_EDEFAULT.equals(databaseName);
			case PatternstructurePackage.COMPLETE_PATTERN__KEYWORDS:
				return keywords != null && !keywords.isEmpty();
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_COUNTER:
				return PARAMETER_COUNTER_EDEFAULT == null ? parameterCounter != null : !PARAMETER_COUNTER_EDEFAULT.equals(parameterCounter);
			case PatternstructurePackage.COMPLETE_PATTERN__COUNTER:
				return COUNTER_EDEFAULT == null ? counter != null : !COUNTER_EDEFAULT.equals(counter);
			case PatternstructurePackage.COMPLETE_PATTERN__ELEMENT_COUNTER:
				return ELEMENT_COUNTER_EDEFAULT == null ? elementCounter != null : !ELEMENT_COUNTER_EDEFAULT.equals(elementCounter);
			case PatternstructurePackage.COMPLETE_PATTERN__RELATION_COUNTER:
				return RELATION_COUNTER_EDEFAULT == null ? relationCounter != null : !RELATION_COUNTER_EDEFAULT.equals(relationCounter);
			case PatternstructurePackage.COMPLETE_PATTERN__OPERATOR_COUNTER:
				return OPERATOR_COUNTER_EDEFAULT == null ? operatorCounter != null : !OPERATOR_COUNTER_EDEFAULT.equals(operatorCounter);
			case PatternstructurePackage.COMPLETE_PATTERN__LAST_SAVED:
				return LAST_SAVED_EDEFAULT == null ? lastSaved != null : !LAST_SAVED_EDEFAULT.equals(lastSaved);
			case PatternstructurePackage.COMPLETE_PATTERN__NAMESPACES:
				return namespaces != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PatternstructurePackage.COMPLETE_PATTERN___VALIDATE_AGAINST_SCHEMA:
				try {
					return validateAgainstSchema();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.COMPLETE_PATTERN___GET_ABSTRACTION_LEVEL:
				return getAbstractionLevel();
			case PatternstructurePackage.COMPLETE_PATTERN___GET_NEW_REF_NO__CLASS:
				return getNewRefNo((Class)arguments.get(0));
			case PatternstructurePackage.COMPLETE_PATTERN___RECORD_VALUES:
				try {
					recordValues();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.COMPLETE_PATTERN___RESET_QUERY:
				resetQuery();
				return null;
			case PatternstructurePackage.COMPLETE_PATTERN___GENERATE_CYPHER_RETURN:
				try {
					return generateCypherReturn();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.COMPLETE_PATTERN___GENERATE_WIKIDATA_SPARQL:
				try {
					return generateWikidataSparql();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.COMPLETE_PATTERN___GENERATE_XML_CONSTRAINT_SCHEMA:
				try {
					return generateXmlConstraintSchema();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.COMPLETE_PATTERN___GENERATE_XML_CONSTRAINT_YAML_FILE__STRING:
				try {
					generateXmlConstraintYAMLFile((String)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.COMPLETE_PATTERN___GENERATE_QUERY_FILTER:
				try {
					return generateQueryFilter();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.COMPLETE_PATTERN___UPDATE_LAST_SAVED:
				updateLastSaved();
				return null;
			case PatternstructurePackage.COMPLETE_PATTERN___GENERATE_XQUERY_NAMESPACES:
				try {
					return generateXQueryNamespaces();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.COMPLETE_PATTERN___PRINT_PARAMETERS__BOOLEAN:
				printParameters((Boolean)arguments.get(0));
				return null;
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
		result.append(" (patternId: ");
		result.append(patternId);
		result.append(", name: ");
		result.append(name);
		result.append(", abstractId: ");
		result.append(abstractId);
		result.append(", description: ");
		result.append(description);
		result.append(", language: ");
		result.append(language);
		result.append(", dataModelName: ");
		result.append(dataModelName);
		result.append(", databaseName: ");
		result.append(databaseName);
		result.append(", keywords: ");
		result.append(keywords);
		result.append(", parameterCounter: ");
		result.append(parameterCounter);
		result.append(", counter: ");
		result.append(counter);
		result.append(", elementCounter: ");
		result.append(elementCounter);
		result.append(", relationCounter: ");
		result.append(relationCounter);
		result.append(", operatorCounter: ");
		result.append(operatorCounter);
		result.append(", lastSaved: ");
		result.append(lastSaved);
		result.append(')');
		return result.toString();
	}

	@Override
	public String myToString() {
//		String res = "Pattern [" + getInternalId() + "] " + name;
		String res = "Pattern " + name;
		res += "\n  " + getGraph().myToString().replace("\n", "\n  ");
		if (getCondition() != null)
			res += "\n  " + getCondition().myToString().replace("\n", "\n  ");
		else 
			res += "\n  TRUE";
		res += getParameterList().myToString().replace("\n", "\n  ");
		return res;
	}

} // PatternImpl
