/**
 */
package qualitypatternmodel.execution.impl;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.basex.core.BaseXException;
import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.Database;
import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.LocalXmlSchemaDatabase;
import qualitypatternmodel.execution.Result;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.execution.XmlSchemaDatabase;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.utility.XmlServletUtility;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xml Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.execution.impl.XmlDataDatabaseImpl#getResults <em>Results</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.XmlDataDatabaseImpl#getPatterns <em>Patterns</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.XmlDataDatabaseImpl#getRecordedAttributeValues <em>Recorded Attribute Values</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.XmlDataDatabaseImpl#getRecordedDataValues <em>Recorded Data Values</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.XmlDataDatabaseImpl#getXmlSchema <em>Xml Schema</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.XmlDataDatabaseImpl#getElementNames <em>Element Names</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.XmlDataDatabaseImpl#getAttributeNames <em>Attribute Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XmlDataDatabaseImpl extends XmlDatabaseImpl implements XmlDataDatabase {
	/**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * A list of all results of pattern applications to <code>this</code> <code>Database</code>.
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList<Result> results;

	/**
	 * The cached value of the '{@link #getPatterns() <em>Patterns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * A list of all patterns concretized for <code>this</code> <code>Database</code>.
	 * <!-- end-user-doc -->
	 * @see #getPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<CompletePattern> patterns;

	/**
	 * The cached value of the '{@link #getRecordedAttributeValues() <em>Recorded Attribute Values</em>}' map.
	 * <!-- begin-user-doc -->
	 * A map of all XML attribute values that have been entered into patterns as parameter values and the number of times the attribute value has been used.
	 * <!-- end-user-doc -->
	 * @see #getRecordedAttributeValues()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Integer> recordedAttributeValues;

	/**
	 * The cached value of the '{@link #getRecordedDataValues() <em>Recorded Data Values</em>}' map.
	 * <!-- begin-user-doc -->
	 * A map of all XML data values that have been entered into patterns as parameter values and the number of times the data value has been used.
	 * <!-- end-user-doc -->
	 * @see #getRecordedDataValues()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Integer> recordedDataValues;

	/**
	 * The cached value of the '{@link #getXmlSchema() <em>Xml Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * The BaseX database containing the XML schema definition of <code>this</code>.
	 * <!-- end-user-doc -->
	 * @see #getXmlSchema()
	 * @generated
	 * @ordered
	 */
	protected XmlSchemaDatabase xmlSchema;

	/**
	 * The cached value of the '{@link #getElementNames() <em>Element Names</em>}' map.
	 * <!-- begin-user-doc -->
	 * A map of all XML element names that are defined in the <code>xmlSchema</code> or occur in <code>this</code> database or that
	 * have been entered into patterns as parameter values.
	 * The map value is the number of times the element name has been used in a pattern.
	 * <!-- end-user-doc -->
	 * @see #getElementNames()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Integer> elementNames;

	/**
	 * The cached value of the '{@link #getAttributeNames() <em>Attribute Names</em>}' map.
	 * <!-- begin-user-doc -->
	 * A map of all XML attribute names that are defined in the <code>xmlSchema</code> or occur in <code>this</code> database or that
	 * have been entered into patterns as parameter values.
	 * The map value is the number of times the attribute name has been used in a pattern.
	 * <!-- end-user-doc -->
	 * @see #getAttributeNames()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Integer> attributeNames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected XmlDataDatabaseImpl() {
		super();
		DatabasesImpl.getInstance().getXmlDatabases().add(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.XML_DATA_DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Result> getResults() {
		if (results == null) {
			results = new EObjectContainmentWithInverseEList<Result>(Result.class, this, ExecutionPackage.XML_DATA_DATABASE__RESULTS, ExecutionPackage.RESULT__DATABASE);
		}
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CompletePattern> getPatterns() {
		if (patterns == null) {
			patterns = new EObjectWithInverseResolvingEList<CompletePattern>(CompletePattern.class, this, ExecutionPackage.XML_DATA_DATABASE__PATTERNS, PatternstructurePackage.COMPLETE_PATTERN__DATABASE);
		}
		return patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, Integer> getRecordedAttributeValues() {
		if (recordedAttributeValues == null) {
			recordedAttributeValues = new EcoreEMap<String,Integer>(ExecutionPackage.Literals.STRING_TO_INT_MAP, StringToIntMapImpl.class, this, ExecutionPackage.XML_DATA_DATABASE__RECORDED_ATTRIBUTE_VALUES);
		}
		return recordedAttributeValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, Integer> getRecordedDataValues() {
		if (recordedDataValues == null) {
			recordedDataValues = new EcoreEMap<String,Integer>(ExecutionPackage.Literals.STRING_TO_INT_MAP, StringToIntMapImpl.class, this, ExecutionPackage.XML_DATA_DATABASE__RECORDED_DATA_VALUES);
		}
		return recordedDataValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlSchemaDatabase getXmlSchema() {
		if (xmlSchema != null && xmlSchema.eIsProxy()) {
			InternalEObject oldXmlSchema = (InternalEObject)xmlSchema;
			xmlSchema = (XmlSchemaDatabase)eResolveProxy(oldXmlSchema);
			if (xmlSchema != oldXmlSchema) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecutionPackage.XML_DATA_DATABASE__XML_SCHEMA, oldXmlSchema, xmlSchema));
			}
		}
		return xmlSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlSchemaDatabase basicGetXmlSchema() {
		return xmlSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetXmlSchema(XmlSchemaDatabase newXmlSchema, NotificationChain msgs) {
		XmlSchemaDatabase oldXmlSchema = xmlSchema;
		xmlSchema = newXmlSchema;

		if(oldXmlSchema != null) {
			getElementNames().clear();
			getAttributeNames().clear();
//			removeUnusedElementNames();
//			removeUnusedAttributeNames();
		}

		if(newXmlSchema != null) {
			try {
				xmlSchema.init();
			} catch (QueryException | IOException | InvalidityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			setNamespace(xmlSchema.getNamespace());

			addElementNames(newXmlSchema.getElementNames());
			addAttributeNames(newXmlSchema.getAttributeNames());
		}

		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutionPackage.XML_DATA_DATABASE__XML_SCHEMA, oldXmlSchema, newXmlSchema);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	@SuppressWarnings("unused")
	private void removeUnusedAttributeNames() {
		EMap<String,Integer> attributeNamesCopy = new BasicEMap<String,Integer>();
		attributeNamesCopy.addAll(getAttributeNames());
		for(String key : attributeNamesCopy.keySet()) {
			if(attributeNamesCopy.get(key) == 0) {
				getAttributeNames().removeKey(key);
			}
		}
	}

	@SuppressWarnings("unused")
	private void removeUnusedElementNames() {
		EMap<String,Integer> elementNamesCopy = new BasicEMap<String,Integer>();
		elementNamesCopy.addAll(getElementNames());
		for(String key : elementNamesCopy.keySet()) {
			if(elementNamesCopy.get(key) == 0) {
				getElementNames().removeKey(key);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXmlSchema(XmlSchemaDatabase newXmlSchema) {
		if (newXmlSchema != xmlSchema) {
			NotificationChain msgs = null;
			if (xmlSchema != null)
				msgs = ((InternalEObject)xmlSchema).eInverseRemove(this, ExecutionPackage.XML_SCHEMA_DATABASE__XML_DATABASES, XmlSchemaDatabase.class, msgs);
			if (newXmlSchema != null)
				msgs = ((InternalEObject)newXmlSchema).eInverseAdd(this, ExecutionPackage.XML_SCHEMA_DATABASE__XML_DATABASES, XmlSchemaDatabase.class, msgs);
			msgs = basicSetXmlSchema(newXmlSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.XML_DATA_DATABASE__XML_SCHEMA, newXmlSchema, newXmlSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, Integer> getElementNames() {
		if (elementNames == null) {
			elementNames = new EcoreEMap<String,Integer>(ExecutionPackage.Literals.STRING_TO_INT_MAP, StringToIntMapImpl.class, this, ExecutionPackage.XML_DATA_DATABASE__ELEMENT_NAMES);
		}
		return elementNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, Integer> getAttributeNames() {
		if (attributeNames == null) {
			attributeNames = new EcoreEMap<String,Integer>(ExecutionPackage.Literals.STRING_TO_INT_MAP, StringToIntMapImpl.class, this, ExecutionPackage.XML_DATA_DATABASE__ATTRIBUTE_NAMES);
		}
		return attributeNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws QueryException
	 * @throws IOException
	 * @generated NOT
	 */
	@Override
	public void analyse() throws QueryException, IOException {
//		if(getXmlSchema() != null) {
//			getXmlSchema().analyse();
//		} else {
			open();
			executeAnalysis("distinct-values(//*/name())", getElementNames());
			executeAnalysis("distinct-values(//*/@*/name()))", getAttributeNames());
			close();
//		}
	}

	private void executeAnalysis(String query, EMap<String,Integer> valueStorage) throws QueryException, IOException {
		List<String> result = execute(query);
		for (String element : result) {
			valueStorage.put(getNamespace() + element,0);
		}
	}

	@Override
	public void delete() {
		setXmlSchema(null);
		getPatterns().clear();
		DatabasesImpl.getInstance().getXmlDatabases().remove(this);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void recordAttributeValue(String value) {
		increaseCountOrInsert(value,getRecordedAttributeValues());
	}

	private void increaseCountOrInsert(String value, EMap<String,Integer> map) {
		if(map.containsKey(value)) {
			map.put(value, map.get(value)+1);
		} else {
			map.put(value, 1);
		}
	}

	private void increaseCount(String value, EMap<String,Integer> map) {
		if(map.containsKey(value)) {
			map.put(value, map.get(value)+1);
		}
		// TODO: else throw exception?
	}

	private void decreaseCountOrRemove(String value, EMap<String,Integer> map) {
		if(map.containsKey(value)) {
			if(map.get(value) > 1) {
				map.put(value, map.get(value)-1);
			} else {
				map.removeKey(value);
			}
		}
	}

	private void decreaseCount(String value, EMap<String,Integer> map) {
		if(map.containsKey(value)) {
			if(map.get(value) > 0) {
				map.put(value, map.get(value)-1);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void recordDataValue(String value) {
		increaseCountOrInsert(value,getRecordedDataValues());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void removeAttributeValue(String value) {
		decreaseCountOrRemove(value, getRecordedAttributeValues());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void removeDataValue(String value) {
		decreaseCountOrRemove(value, getRecordedDataValues());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void recordElementName(String name) {
		increaseCount(name, getElementNames());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void recordAttributeName(String name) {
		increaseCount(name, getAttributeNames());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void removeElementName(String name) {
		decreaseCount(name, getElementNames());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void removeAttributeName(String name) {
		decreaseCount(name, getAttributeNames());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void addAttributeNames(EList<String> attributeNames) {
		for (String attributeName : attributeNames) {
			getAttributeNames().put(attributeName,0);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void addElementNames(EList<String> elementNames) {
		for (String elementName : elementNames) {
			getElementNames().put(elementName,0);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException
	 * @throws QueryException
	 * @throws IOException
	 * @generated NOT
	 */
	@Override
	public LocalXmlSchemaDatabase createSchemaDatabaseFromReferencedSchema() throws IOException, QueryException, InvalidityException {
		String url = findXSDURL();

		HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
		connection.setRequestMethod("GET");

		int responseCode = connection.getResponseCode();
		if(responseCode < 200 || responseCode >= 300) {
			throw new InvalidityException("Fetching XSD failed");
		}
		String result = XmlServletUtility.getResult(connection);
		Date d = new Date();
		String fileName = d.toString().replace(" ", "_").replace(":", "-");

		String path = this.getClass().getClassLoader().getResource("").getPath();
	    String fullPath = URLDecoder.decode(path, "UTF-8");
	    String pathArr[] = fullPath.split("/WEB-INF/classes/");
	    fullPath = pathArr[0];

	    String schemaPath = fullPath + "/schemata/" + fileName + ".xml";
	    System.out.println(schemaPath);

		java.io.FileWriter fw = new java.io.FileWriter(schemaPath);
	    fw.write(result);
	    fw.close();

		LocalXmlSchemaDatabase db = new LocalXmlSchemaDatabaseImpl(fileName, schemaPath);
		setXmlSchema(db);
		return db;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws QueryException
	 * @throws InvalidityException
	 * @generated NOT
	 */
	@Override
	public String findXSDURL() throws IOException, QueryException, InvalidityException {
		String query = "/*/@xsi:schemaLocation/data()";
		EList<String> result = execute(query);
		String value = result.get(0);
		for(String r : result) {
			if(!value.equals(r)) {
				throw new InvalidityException("Multiple XSDs referenced");
			}
		}
		String[] valueSplit = value.split(" ");
		String url = null;
		for(String s : valueSplit) {
			if(s.startsWith("http") && s.endsWith(".xsd")) {
				url = s;
			}
		}
		if(url == null) {
			throw new InvalidityException("XSD reference invalid");
		}
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws IOException
	 * @throws QueryException
	 * @throws QueryIOException
	 * @throws BaseXException
	 * @generated NOT
	 */
	@Override
	public EList<String> getSuggestionsFromAxisPreviousTag(XmlAxisKind xmlAxisKind, String previousTag) throws BaseXException, QueryIOException, QueryException, IOException {
		EList<String> suggestions = new BasicEList<String>();

		switch (xmlAxisKind) {
		case CHILD:
			return getXmlSchema().getChildrenInSchema(previousTag);
		case DESCENDANT:
			return getXmlSchema().getDescendantsInSchema(previousTag);
		case PARENT:
			return getXmlSchema().getParentsInSchema(previousTag);
		case ANCESTOR:
			return getXmlSchema().getAncestorsInSchema(previousTag);
		case FOLLOWING_SIBLING:
			return getXmlSchema().getFollowingSiblingsInSchema(previousTag);
		case FOLLOWING:
			return getXmlSchema().getFollowingInSchema(previousTag);
		case PRECEDING:
			return getXmlSchema().getPrecedingInSchema(previousTag);
		case PRECEDING_SIBLING:
			return getXmlSchema().getPrecedingSiblingsInSchema(previousTag);
		case SELF:
			suggestions.add(previousTag);
			return suggestions;
		case DESCENDANT_OR_SELF:
			suggestions.add(previousTag);
			suggestions.addAll(getXmlSchema().getDescendantsInSchema(previousTag));
			return suggestions;
		case ANCESTOR_OR_SELF:
			suggestions.add(previousTag);
			suggestions.addAll(getXmlSchema().getAncestorsInSchema(previousTag));
			return suggestions;
		default:
			return suggestions;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws IOException
	 * @throws QueryException
	 * @throws QueryIOException
	 * @throws BaseXException
	 * @generated NOT
	 */
	@Override
	public EList<String> getSuggestionsFromAxisNextTag(XmlAxisKind xmlAxisKind, String nextTag) throws BaseXException, QueryIOException, QueryException, IOException {
		EList<String> suggestions = new BasicEList<String>();

		switch (xmlAxisKind) {
		case CHILD:
			return getXmlSchema().getParentsInSchema(nextTag);
		case DESCENDANT:
			return getXmlSchema().getAncestorsInSchema(nextTag);
		case PARENT:
			return getXmlSchema().getChildrenInSchema(nextTag);
		case ANCESTOR:
			return getXmlSchema().getDescendantsInSchema(nextTag);
		case FOLLOWING_SIBLING:
			return getXmlSchema().getPrecedingSiblingsInSchema(nextTag);
		case FOLLOWING:
			// TODO
			return suggestions;
		case PRECEDING:
			// TODO
			return suggestions;
		case PRECEDING_SIBLING:
			return getXmlSchema().getFollowingSiblingsInSchema(nextTag);
		case SELF:
			suggestions.add(nextTag);
			return suggestions;
		case DESCENDANT_OR_SELF:
			suggestions.add(nextTag);
			suggestions.addAll(getXmlSchema().getAncestorsInSchema(nextTag));
			return suggestions;
		case ANCESTOR_OR_SELF:
			suggestions.add(nextTag);
			suggestions.addAll(getXmlSchema().getDescendantsInSchema(nextTag));
			return suggestions;
		default:
			return suggestions;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws IOException
	 * @throws QueryException
	 * @throws QueryIOException
	 * @throws BaseXException
	 * @generated NOT
	 */
	@Override
	public EList<String> getSuggestionsFromAxisPreviousRoot(XmlAxisKind xmlAxisKind) throws BaseXException, QueryIOException, QueryException, IOException {
		EList<String> suggestions = new BasicEList<String>();

		for(String rootElementName : getXmlSchema().getRootElementNames()) {
			switch (xmlAxisKind) {
			case CHILD:
				suggestions.addAll(getXmlSchema().getChildrenInSchema(rootElementName));
			case DESCENDANT:
				suggestions.addAll(getXmlSchema().getDescendantsInSchema(rootElementName));
			default:
				break;
			}
		}
		return suggestions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<XmlAxisKind> getSuggestionsFromSourceTargetTag(String sourceTag, String targetTag) throws IOException, QueryException, QueryIOException, BaseXException {
		EList<XmlAxisKind> suggestions = new BasicEList<XmlAxisKind>();

		if(getXmlSchema().checkChildInSchema(sourceTag, targetTag)) {
			suggestions.add(XmlAxisKind.CHILD);
			suggestions.add(XmlAxisKind.DESCENDANT);
			suggestions.add(XmlAxisKind.DESCENDANT_OR_SELF);
		} else if(getXmlSchema().checkDescendantInSchema(sourceTag, targetTag)) {
			suggestions.add(XmlAxisKind.DESCENDANT);
			suggestions.add(XmlAxisKind.DESCENDANT_OR_SELF);
		}

		if(getXmlSchema().checkParentInSchema(sourceTag, targetTag)) {
			suggestions.add(XmlAxisKind.PARENT);
			suggestions.add(XmlAxisKind.ANCESTOR);
			suggestions.add(XmlAxisKind.ANCESTOR_OR_SELF);
		} else if(getXmlSchema().checkAncestorInSchema(sourceTag, targetTag)) {
			suggestions.add(XmlAxisKind.ANCESTOR);
			suggestions.add(XmlAxisKind.ANCESTOR_OR_SELF);
		}

		if(getXmlSchema().checkFollowingSiblingInSchema(sourceTag, targetTag)) {
			suggestions.add(XmlAxisKind.FOLLOWING_SIBLING);
			suggestions.add(XmlAxisKind.FOLLOWING);
		} else if(getXmlSchema().checkFollowingInSchema(sourceTag, targetTag)) {
			suggestions.add(XmlAxisKind.FOLLOWING);
		}

		// TODO:
//			if(xmlDatabase.getXmlSchema().checkPrecedingSiblingInSchema(sourceTag, targetTag)) {
//				suggestions.add(RelationKind.PRECEDING_SIBLING);
//				suggestions.add(RelationKind.PRECEDING);
//			} else if(xmlDatabase.getXmlSchema().checkPrecedingInSchema(sourceTag, targetTag)) {
//				suggestions.add(RelationKind.PRECEDING);
//			}

		if(sourceTag.equals(targetTag)) {
			suggestions.add(XmlAxisKind.SELF);
			suggestions.add(XmlAxisKind.DESCENDANT_OR_SELF);
			suggestions.add(XmlAxisKind.ANCESTOR_OR_SELF);
		}

		return suggestions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutionPackage.XML_DATA_DATABASE__RESULTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResults()).basicAdd(otherEnd, msgs);
			case ExecutionPackage.XML_DATA_DATABASE__PATTERNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPatterns()).basicAdd(otherEnd, msgs);
			case ExecutionPackage.XML_DATA_DATABASE__XML_SCHEMA:
				if (xmlSchema != null)
					msgs = ((InternalEObject)xmlSchema).eInverseRemove(this, ExecutionPackage.XML_SCHEMA_DATABASE__XML_DATABASES, XmlSchemaDatabase.class, msgs);
				return basicSetXmlSchema((XmlSchemaDatabase)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutionPackage.XML_DATA_DATABASE__RESULTS:
				return ((InternalEList<?>)getResults()).basicRemove(otherEnd, msgs);
			case ExecutionPackage.XML_DATA_DATABASE__PATTERNS:
				return ((InternalEList<?>)getPatterns()).basicRemove(otherEnd, msgs);
			case ExecutionPackage.XML_DATA_DATABASE__RECORDED_ATTRIBUTE_VALUES:
				return ((InternalEList<?>)getRecordedAttributeValues()).basicRemove(otherEnd, msgs);
			case ExecutionPackage.XML_DATA_DATABASE__RECORDED_DATA_VALUES:
				return ((InternalEList<?>)getRecordedDataValues()).basicRemove(otherEnd, msgs);
			case ExecutionPackage.XML_DATA_DATABASE__XML_SCHEMA:
				return basicSetXmlSchema(null, msgs);
			case ExecutionPackage.XML_DATA_DATABASE__ELEMENT_NAMES:
				return ((InternalEList<?>)getElementNames()).basicRemove(otherEnd, msgs);
			case ExecutionPackage.XML_DATA_DATABASE__ATTRIBUTE_NAMES:
				return ((InternalEList<?>)getAttributeNames()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutionPackage.XML_DATA_DATABASE__RESULTS:
				return getResults();
			case ExecutionPackage.XML_DATA_DATABASE__PATTERNS:
				return getPatterns();
			case ExecutionPackage.XML_DATA_DATABASE__RECORDED_ATTRIBUTE_VALUES:
				if (coreType) return getRecordedAttributeValues();
				else return getRecordedAttributeValues().map();
			case ExecutionPackage.XML_DATA_DATABASE__RECORDED_DATA_VALUES:
				if (coreType) return getRecordedDataValues();
				else return getRecordedDataValues().map();
			case ExecutionPackage.XML_DATA_DATABASE__XML_SCHEMA:
				if (resolve) return getXmlSchema();
				return basicGetXmlSchema();
			case ExecutionPackage.XML_DATA_DATABASE__ELEMENT_NAMES:
				if (coreType) return getElementNames();
				else return getElementNames().map();
			case ExecutionPackage.XML_DATA_DATABASE__ATTRIBUTE_NAMES:
				if (coreType) return getAttributeNames();
				else return getAttributeNames().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExecutionPackage.XML_DATA_DATABASE__RESULTS:
				getResults().clear();
				getResults().addAll((Collection<? extends Result>)newValue);
				return;
			case ExecutionPackage.XML_DATA_DATABASE__PATTERNS:
				getPatterns().clear();
				getPatterns().addAll((Collection<? extends CompletePattern>)newValue);
				return;
			case ExecutionPackage.XML_DATA_DATABASE__RECORDED_ATTRIBUTE_VALUES:
				((EStructuralFeature.Setting)getRecordedAttributeValues()).set(newValue);
				return;
			case ExecutionPackage.XML_DATA_DATABASE__RECORDED_DATA_VALUES:
				((EStructuralFeature.Setting)getRecordedDataValues()).set(newValue);
				return;
			case ExecutionPackage.XML_DATA_DATABASE__XML_SCHEMA:
				setXmlSchema((XmlSchemaDatabase)newValue);
				return;
			case ExecutionPackage.XML_DATA_DATABASE__ELEMENT_NAMES:
				((EStructuralFeature.Setting)getElementNames()).set(newValue);
				return;
			case ExecutionPackage.XML_DATA_DATABASE__ATTRIBUTE_NAMES:
				((EStructuralFeature.Setting)getAttributeNames()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExecutionPackage.XML_DATA_DATABASE__RESULTS:
				getResults().clear();
				return;
			case ExecutionPackage.XML_DATA_DATABASE__PATTERNS:
				getPatterns().clear();
				return;
			case ExecutionPackage.XML_DATA_DATABASE__RECORDED_ATTRIBUTE_VALUES:
				getRecordedAttributeValues().clear();
				return;
			case ExecutionPackage.XML_DATA_DATABASE__RECORDED_DATA_VALUES:
				getRecordedDataValues().clear();
				return;
			case ExecutionPackage.XML_DATA_DATABASE__XML_SCHEMA:
				setXmlSchema((XmlSchemaDatabase)null);
				return;
			case ExecutionPackage.XML_DATA_DATABASE__ELEMENT_NAMES:
				getElementNames().clear();
				return;
			case ExecutionPackage.XML_DATA_DATABASE__ATTRIBUTE_NAMES:
				getAttributeNames().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExecutionPackage.XML_DATA_DATABASE__RESULTS:
				return results != null && !results.isEmpty();
			case ExecutionPackage.XML_DATA_DATABASE__PATTERNS:
				return patterns != null && !patterns.isEmpty();
			case ExecutionPackage.XML_DATA_DATABASE__RECORDED_ATTRIBUTE_VALUES:
				return recordedAttributeValues != null && !recordedAttributeValues.isEmpty();
			case ExecutionPackage.XML_DATA_DATABASE__RECORDED_DATA_VALUES:
				return recordedDataValues != null && !recordedDataValues.isEmpty();
			case ExecutionPackage.XML_DATA_DATABASE__XML_SCHEMA:
				return xmlSchema != null;
			case ExecutionPackage.XML_DATA_DATABASE__ELEMENT_NAMES:
				return elementNames != null && !elementNames.isEmpty();
			case ExecutionPackage.XML_DATA_DATABASE__ATTRIBUTE_NAMES:
				return attributeNames != null && !attributeNames.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Database.class) {
			switch (derivedFeatureID) {
				case ExecutionPackage.XML_DATA_DATABASE__RESULTS: return ExecutionPackage.DATABASE__RESULTS;
				case ExecutionPackage.XML_DATA_DATABASE__PATTERNS: return ExecutionPackage.DATABASE__PATTERNS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Database.class) {
			switch (baseFeatureID) {
				case ExecutionPackage.DATABASE__RESULTS: return ExecutionPackage.XML_DATA_DATABASE__RESULTS;
				case ExecutionPackage.DATABASE__PATTERNS: return ExecutionPackage.XML_DATA_DATABASE__PATTERNS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Database.class) {
			switch (baseOperationID) {
				case ExecutionPackage.DATABASE___EXECUTE__COMPLETEPATTERN_STRING_STRING: return ExecutionPackage.XML_DATA_DATABASE___EXECUTE__COMPLETEPATTERN_STRING_STRING;
				case ExecutionPackage.DATABASE___COUNT_MATCHES__COMPLETEPATTERN: return ExecutionPackage.XML_DATA_DATABASE___COUNT_MATCHES__COMPLETEPATTERN;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ExecutionPackage.XML_DATA_DATABASE___RECORD_ELEMENT_NAME__STRING:
				recordElementName((String)arguments.get(0));
				return null;
			case ExecutionPackage.XML_DATA_DATABASE___REMOVE_ELEMENT_NAME__STRING:
				removeElementName((String)arguments.get(0));
				return null;
			case ExecutionPackage.XML_DATA_DATABASE___ADD_ELEMENT_NAMES__ELIST:
				addElementNames((EList<String>)arguments.get(0));
				return null;
			case ExecutionPackage.XML_DATA_DATABASE___RECORD_DATA_VALUE__STRING:
				recordDataValue((String)arguments.get(0));
				return null;
			case ExecutionPackage.XML_DATA_DATABASE___REMOVE_DATA_VALUE__STRING:
				removeDataValue((String)arguments.get(0));
				return null;
			case ExecutionPackage.XML_DATA_DATABASE___RECORD_ATTRIBUTE_NAME__STRING:
				recordAttributeName((String)arguments.get(0));
				return null;
			case ExecutionPackage.XML_DATA_DATABASE___REMOVE_ATTRIBUTE_NAME__STRING:
				removeAttributeName((String)arguments.get(0));
				return null;
			case ExecutionPackage.XML_DATA_DATABASE___ADD_ATTRIBUTE_NAMES__ELIST:
				addAttributeNames((EList<String>)arguments.get(0));
				return null;
			case ExecutionPackage.XML_DATA_DATABASE___RECORD_ATTRIBUTE_VALUE__STRING:
				recordAttributeValue((String)arguments.get(0));
				return null;
			case ExecutionPackage.XML_DATA_DATABASE___REMOVE_ATTRIBUTE_VALUE__STRING:
				removeAttributeValue((String)arguments.get(0));
				return null;
			case ExecutionPackage.XML_DATA_DATABASE___CREATE_SCHEMA_DATABASE_FROM_REFERENCED_SCHEMA:
				try {
					return createSchemaDatabaseFromReferencedSchema();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.XML_DATA_DATABASE___GET_SUGGESTIONS_FROM_AXIS_PREVIOUS_TAG__XMLAXISKIND_STRING:
				try {
					return getSuggestionsFromAxisPreviousTag((XmlAxisKind)arguments.get(0), (String)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.XML_DATA_DATABASE___GET_SUGGESTIONS_FROM_AXIS_PREVIOUS_ROOT__XMLAXISKIND:
				try {
					return getSuggestionsFromAxisPreviousRoot((XmlAxisKind)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.XML_DATA_DATABASE___GET_SUGGESTIONS_FROM_SOURCE_TARGET_TAG__STRING_STRING:
				try {
					return getSuggestionsFromSourceTargetTag((String)arguments.get(0), (String)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.XML_DATA_DATABASE___GET_SUGGESTIONS_FROM_AXIS_NEXT_TAG__XMLAXISKIND_STRING:
				try {
					return getSuggestionsFromAxisNextTag((XmlAxisKind)arguments.get(0), (String)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.XML_DATA_DATABASE___FIND_XSDURL:
				try {
					return findXSDURL();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.XML_DATA_DATABASE___EXECUTE__COMPLETEPATTERN_STRING_STRING:
				try {
					return execute((CompletePattern)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.XML_DATA_DATABASE___COUNT_MATCHES__COMPLETEPATTERN:
				try {
					return countMatches((CompletePattern)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public Result execute(CompletePattern pattern, String name, String person) throws InvalidityException, OperatorCycleException, MissingPatternContainerException, QueryException, IOException {

		pattern.isValid(AbstractionLevel.CONCRETE);

//		open();

		String query;
		if(pattern.getXmlQuery() == null) {
			query = pattern.generateXQuery();
		} else {
			query = pattern.getXmlQuery();
		}
//		XQuery xquery = new XQuery(query);

		Date startDate = new Date();

		List<String> queryResult = execute(query);

////		String queryResult = xquery.execute(context);
//		List<String> queryResult = new ArrayList<String>();
//		// Create a query processor
//	    try(QueryProcessor proc = new QueryProcessor(query, context)) {
//	      // Store the pointer to the result in an iterator:
//	      Iter iter = proc.iter();
//	      for(Item item; (item = iter.next()) != null;) {
//	    	  queryResult.add(item.serialize().toString());
//	        }
//	    }

		Date endDate = new Date();
		long runtime = endDate.getTime() - startDate.getTime();

		int matchNo = countMatches(pattern);

		Result result = new XmlResultImpl();
		result.setDatabase(this);
		result.setName(name);
		result.setPerson(person);
		result.setPattern(pattern); // TODO: may be modified!!
//		result.setQueryResult(queryResult);
		result.setStartDate(startDate);
		result.setEndDate(endDate);
		result.setRuntime(runtime);
		result.setMatchNumber(matchNo);
		result.getSplitResult().addAll(queryResult);
		result.setProblemNumber(queryResult.size());

		results.add(result);

		return result;
	}

	@Override
	public int countMatches(CompletePattern pattern) throws QueryException, InvalidityException, OperatorCycleException, MissingPatternContainerException, IOException {
		pattern.isValid(AbstractionLevel.CONCRETE);

//		open();

		String query;
		if(pattern.getPartialXmlQuery() == null) {
			pattern.generateXQuery();
		}
		query = pattern.getPartialXmlQuery();

		List<String> queryResult = execute(query);

//		List<String> queryResult = new ArrayList<String>();
//	    try(QueryProcessor proc = new QueryProcessor(query, context)) {
//	      Iter iter = proc.iter();
//	      for(Item item; (item = iter.next()) != null;) {
//	    	  queryResult.add(item.serialize().toString());
//	        }
//	    }

	    return queryResult.size();
	}


} //XmlDatabaseImpl
