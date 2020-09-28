/**
 */
package qualitypatternmodel.execution.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.basex.query.QueryProcessor;
import org.basex.query.iter.Iter;
import org.basex.query.value.item.Item;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.Database;
import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.Result;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.execution.XmlSchemaDatabase;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

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
 *   <li>{@link qualitypatternmodel.execution.impl.XmlDataDatabaseImpl#getContext <em>Context</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.XmlDataDatabaseImpl#getRecordedAttributeValues <em>Recorded Attribute Values</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.XmlDataDatabaseImpl#getRecordedDataValues <em>Recorded Data Values</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.XmlDataDatabaseImpl#getNamespace <em>Namespace</em>}</li>
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
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList<Result> results;

	/**
	 * The cached value of the '{@link #getPatterns() <em>Patterns</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatterns()
	 * @generated
	 * @ordered
	 */
	protected CompletePattern patterns;

	/**
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final Context CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Context context = CONTEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRecordedAttributeValues() <em>Recorded Attribute Values</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordedAttributeValues()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Integer> recordedAttributeValues;

	/**
	 * The cached value of the '{@link #getRecordedDataValues() <em>Recorded Data Values</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordedDataValues()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Integer> recordedDataValues;

	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getXmlSchema() <em>Xml Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlSchema()
	 * @generated
	 * @ordered
	 */
	protected XmlSchemaDatabase xmlSchema;

	/**
	 * The cached value of the '{@link #getElementNames() <em>Element Names</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementNames()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Integer> elementNames;

	/**
	 * The cached value of the '{@link #getAttributeNames() <em>Attribute Names</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeNames()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Integer> attributeNames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmlDataDatabaseImpl() {
		super();
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
	public CompletePattern getPatterns() {
		if (patterns != null && patterns.eIsProxy()) {
			InternalEObject oldPatterns = (InternalEObject)patterns;
			patterns = (CompletePattern)eResolveProxy(oldPatterns);
			if (patterns != oldPatterns) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecutionPackage.XML_DATA_DATABASE__PATTERNS, oldPatterns, patterns));
			}
		}
		return patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompletePattern basicGetPatterns() {
		return patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatterns(CompletePattern newPatterns, NotificationChain msgs) {
		CompletePattern oldPatterns = patterns;
		patterns = newPatterns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutionPackage.XML_DATA_DATABASE__PATTERNS, oldPatterns, newPatterns);
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
	public void setPatterns(CompletePattern newPatterns) {
		if (newPatterns != patterns) {
			NotificationChain msgs = null;
			if (patterns != null)
				msgs = ((InternalEObject)patterns).eInverseRemove(this, PatternstructurePackage.COMPLETE_PATTERN__DATABASE, CompletePattern.class, msgs);
			if (newPatterns != null)
				msgs = ((InternalEObject)newPatterns).eInverseAdd(this, PatternstructurePackage.COMPLETE_PATTERN__DATABASE, CompletePattern.class, msgs);
			msgs = basicSetPatterns(newPatterns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.XML_DATA_DATABASE__PATTERNS, newPatterns, newPatterns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Context getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(Context newContext) {
		Context oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.XML_DATA_DATABASE__CONTEXT, oldContext, context));
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
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.XML_DATA_DATABASE__NAMESPACE, oldNamespace, namespace));
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
	 * @generated
	 */
	public NotificationChain basicSetXmlSchema(XmlSchemaDatabase newXmlSchema, NotificationChain msgs) {
		XmlSchemaDatabase oldXmlSchema = xmlSchema;
		xmlSchema = newXmlSchema;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutionPackage.XML_DATA_DATABASE__XML_SCHEMA, oldXmlSchema, newXmlSchema);
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
	 * @throws QueryIOException 
	 * @generated NOT
	 */
	@Override
	public void analyseDatabase() throws BaseXException, QueryIOException, QueryException {
		open();				
		executeAnalysis("distinct-values(//*/name())", getElementNames(), context);
		executeAnalysis("distinct-values(//*/@*/name()))", getAttributeNames(), context);
	}
	
	private void executeAnalysis(String query, EMap<String,Integer> valueStorage, Context context) throws BaseXException, QueryIOException, QueryException {
		List<String> result = executeQuery(query, context);
		for(int i = 0; i < result.size(); i++) {
			valueStorage.put(getNamespace() + result.get(i),0);
		}
	}
	
	private List<String> executeQuery(String query, Context context) throws QueryException, QueryIOException {
		List<String> queryResult = new ArrayList<String>();		
	    try(QueryProcessor proc = new QueryProcessor(query, context)) {
	      Iter iter = proc.iter();
	      for(Item item; (item = iter.next()) != null;) {
	    	  queryResult.add(item.serialize().toString());
	        }
	    }
		return queryResult;
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
	 * @generated
	 */
	@Override
	public void init() throws BaseXException, QueryException, QueryIOException {
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
	public void open() throws BaseXException {
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
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutionPackage.XML_DATA_DATABASE__RESULTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResults()).basicAdd(otherEnd, msgs);
			case ExecutionPackage.XML_DATA_DATABASE__PATTERNS:
				if (patterns != null)
					msgs = ((InternalEObject)patterns).eInverseRemove(this, PatternstructurePackage.COMPLETE_PATTERN__DATABASE, CompletePattern.class, msgs);
				return basicSetPatterns((CompletePattern)otherEnd, msgs);
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
				return basicSetPatterns(null, msgs);
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
				if (resolve) return getPatterns();
				return basicGetPatterns();
			case ExecutionPackage.XML_DATA_DATABASE__CONTEXT:
				return getContext();
			case ExecutionPackage.XML_DATA_DATABASE__RECORDED_ATTRIBUTE_VALUES:
				if (coreType) return getRecordedAttributeValues();
				else return getRecordedAttributeValues().map();
			case ExecutionPackage.XML_DATA_DATABASE__RECORDED_DATA_VALUES:
				if (coreType) return getRecordedDataValues();
				else return getRecordedDataValues().map();
			case ExecutionPackage.XML_DATA_DATABASE__NAMESPACE:
				return getNamespace();
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
				setPatterns((CompletePattern)newValue);
				return;
			case ExecutionPackage.XML_DATA_DATABASE__CONTEXT:
				setContext((Context)newValue);
				return;
			case ExecutionPackage.XML_DATA_DATABASE__RECORDED_ATTRIBUTE_VALUES:
				((EStructuralFeature.Setting)getRecordedAttributeValues()).set(newValue);
				return;
			case ExecutionPackage.XML_DATA_DATABASE__RECORDED_DATA_VALUES:
				((EStructuralFeature.Setting)getRecordedDataValues()).set(newValue);
				return;
			case ExecutionPackage.XML_DATA_DATABASE__NAMESPACE:
				setNamespace((String)newValue);
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
				setPatterns((CompletePattern)null);
				return;
			case ExecutionPackage.XML_DATA_DATABASE__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
				return;
			case ExecutionPackage.XML_DATA_DATABASE__RECORDED_ATTRIBUTE_VALUES:
				getRecordedAttributeValues().clear();
				return;
			case ExecutionPackage.XML_DATA_DATABASE__RECORDED_DATA_VALUES:
				getRecordedDataValues().clear();
				return;
			case ExecutionPackage.XML_DATA_DATABASE__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
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
				return patterns != null;
			case ExecutionPackage.XML_DATA_DATABASE__CONTEXT:
				return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
			case ExecutionPackage.XML_DATA_DATABASE__RECORDED_ATTRIBUTE_VALUES:
				return recordedAttributeValues != null && !recordedAttributeValues.isEmpty();
			case ExecutionPackage.XML_DATA_DATABASE__RECORDED_DATA_VALUES:
				return recordedDataValues != null && !recordedDataValues.isEmpty();
			case ExecutionPackage.XML_DATA_DATABASE__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ExecutionPackage.XML_DATA_DATABASE___ANALYSE_DATABASE:
				try {
					analyseDatabase();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.XML_DATA_DATABASE___RECORD_ATTRIBUTE_VALUE__STRING:
				recordAttributeValue((String)arguments.get(0));
				return null;
			case ExecutionPackage.XML_DATA_DATABASE___RECORD_DATA_VALUE__STRING:
				recordDataValue((String)arguments.get(0));
				return null;
			case ExecutionPackage.XML_DATA_DATABASE___REMOVE_ATTRIBUTE_VALUE__STRING:
				removeAttributeValue((String)arguments.get(0));
				return null;
			case ExecutionPackage.XML_DATA_DATABASE___REMOVE_DATA_VALUE__STRING:
				removeDataValue((String)arguments.get(0));
				return null;
			case ExecutionPackage.XML_DATA_DATABASE___INIT:
				try {
					init();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.XML_DATA_DATABASE___OPEN:
				try {
					open();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.XML_DATA_DATABASE___RECORD_ELEMENT_NAME__STRING:
				recordElementName((String)arguments.get(0));
				return null;
			case ExecutionPackage.XML_DATA_DATABASE___RECORD_ATTRIBUTE_NAME__STRING:
				recordAttributeName((String)arguments.get(0));
				return null;
			case ExecutionPackage.XML_DATA_DATABASE___REMOVE_ELEMENT_NAME__STRING:
				removeElementName((String)arguments.get(0));
				return null;
			case ExecutionPackage.XML_DATA_DATABASE___REMOVE_ATTRIBUTE_NAME__STRING:
				removeAttributeName((String)arguments.get(0));
				return null;
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (context: ");
		result.append(context);
		result.append(", namespace: ");
		result.append(namespace);
		result.append(')');
		return result.toString();
	}

	@Override
	public Result execute(CompletePattern pattern, String name, String person) throws InvalidityException,
			OperatorCycleException, MissingPatternContainerException, BaseXException, QueryException, QueryIOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countMatches(CompletePattern pattern) throws QueryException, InvalidityException, OperatorCycleException,
			MissingPatternContainerException, BaseXException, QueryIOException {
		// TODO Auto-generated method stub
		return 0;
	}

} //XmlDatabaseImpl
