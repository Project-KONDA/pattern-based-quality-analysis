/**
 */
package qualitypatternmodel.javaquery.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaquery.BooleanFilterPart;
import qualitypatternmodel.javaquery.JavaFilter;
import qualitypatternmodel.javaquery.JavaqueryPackage;
import qualitypatternmodel.javaqueryoutput.InterimResult;
import qualitypatternmodel.javaqueryoutput.InterimResultContainer;
import qualitypatternmodel.javaqueryoutput.InterimResultPart;
import qualitypatternmodel.javaqueryoutput.InterimResultStructure;
import qualitypatternmodel.javaqueryoutput.ValueResult;
import qualitypatternmodel.javaqueryoutput.impl.FixedContainerInterimImpl;
import qualitypatternmodel.javaqueryoutput.impl.InterimResultContainerImpl;
import qualitypatternmodel.javaqueryoutput.impl.InterimResultStructureImpl;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.utility.ConstantsJSON;
import qualitypatternmodel.utility.xmlprocessors.XmlServletUtility;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.impl.JavaFilterImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.impl.JavaFilterImpl#getStructure <em>Structure</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.impl.JavaFilterImpl#getInterimResults <em>Interim Results</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.impl.JavaFilterImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.impl.JavaFilterImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.impl.JavaFilterImpl#getPatternName <em>Pattern Name</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.impl.JavaFilterImpl#getPatternId <em>Pattern Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaFilterImpl extends MinimalEObjectImpl.Container implements JavaFilter {
	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected BooleanFilterPart filter;

	/**
	 * The cached value of the '{@link #getStructure() <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructure()
	 * @generated
	 * @ordered
	 */
	protected InterimResultStructure structure;

	/**
	 * The cached value of the '{@link #getInterimResults() <em>Interim Results</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterimResults()
	 * @generated
	 * @ordered
	 */
	protected EList<InterimResultContainer> interimResults;

	/**
	 * The default value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected String query = QUERY_EDEFAULT;

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
	 * The default value of the '{@link #getPatternName() <em>Pattern Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternName()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPatternName() <em>Pattern Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternName()
	 * @generated
	 * @ordered
	 */
	protected String patternName = PATTERN_NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public JavaFilterImpl() {
		super();
		setStructure(new InterimResultStructureImpl());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void createInterimResultContainer(JSONArray objectList) throws InvalidityException {
		EList<InterimResultContainer> interimContainer = getInterimResults();
		interimContainer.clear();
//		if (objectList != null) {
			for (Object object: objectList) {
				if (object instanceof List) {
					@SuppressWarnings("unchecked")
					List<Object> lst = (List<Object>) object;

					Object retu = lst.get(0);
					Object parameter = lst.get(1);
					try {
						InterimResultContainer interim = new InterimResultContainerImpl(getStructure(), retu, parameter);
						interimContainer.add(interim);
					}
					catch (InvalidityException e) {
						InvalidityException newE = new InvalidityException("invalid list: " + lst, e);
						newE.printStackTrace();
					}
				}
			}
//		}
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException
	 * @generated NOT
	 */
	@Override
	public JSONArray executeXQueryJava(String datapath) throws InvalidityException {
		return XmlServletUtility.executeXQueryString(getQuery(), datapath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public JSONArray execute(String datapath) throws InvalidityException {
		// Query Results
		JSONArray list = executeXQueryJava(datapath);
		return filter(list);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public JSONArray filter(JSONArray array) throws InvalidityException {

		// import Query Results
		createInterimResultContainerXQuery(array);

		for (InterimResultContainer interim: getInterimResults()) {
			if (!interim.isValidToStructure()) {
				throw new InvalidityException("InterimResult is invalid to structure:\n" + interim + "\n" + getStructure());
			}
		}

		JSONArray result = filterQueryResults();
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public JSONObject toJson() {

		JSONObject result = new JSONObject();
		try {
			result.put("patternId", getPatternId());
			result.put("patternName", getPatternName());
			result.put("query", getQuery());
			result.put("language", getLanguage().getName());
			result.put("filter", getFilter().toJson());
			result.put("structure", getStructure().toJson());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
//        try {
//            // Create ObjectMapper instance
//            ObjectMapper mapper = new ObjectMapper();
//
//            // Serialize EMF object to JSON string
//            String json = mapper.writeValueAsString(this);
//
//            return json;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
    }

	public static JavaFilter fromJson(JSONObject jsonObject) throws InvalidityException, JSONException {
		JavaFilter filter = new JavaFilterImpl();
		filter.setPatternId(jsonObject.getString("patternId"));
		filter.setPatternId(jsonObject.getString("patternName"));
		filter.setQuery(jsonObject.getString("query"));
		filter.setLanguage(Language.valueOf(jsonObject.getString("language")));

		JSONObject structurejson = jsonObject.getJSONObject("structure");
		JSONObject filterjson = jsonObject.getJSONObject("filter");
		
		InterimResultStructureImpl structure = InterimResultStructureImpl.fromJson(structurejson);
		filter.setStructure(structure);

		Map<Integer, InterimResultPart> map = structure.getInterimResultParts();
		BooleanFilterPart subfilter = (BooleanFilterPart) JavaFilterPartImpl.fromJson(filterjson, map);
		filter.setFilter(subfilter);

		return filter;

//        try {
//            // Create ObjectMapper instance
//            ObjectMapper mapper = new ObjectMapper();
//
//            // Deserialize JSON string to EMF object
//            JavaFilter filter = mapper.readValue(json, JavaFilter.class);
//
//            return filter;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void createInterimResultContainerXQuery(JSONArray list) throws InvalidityException {
//	public void createInterimResultContainerXQuery(List<String> objectList) throws InvalidityException {
		getInterimResults().clear();
		
		for (int i = 0; i<list.length(); i++) {
			JSONObject interim = list.getJSONObject(i);
			String interimString = interim.getString(ConstantsJSON.RESULT_SNIPPET);
			InterimResultContainer interimresult = new InterimResultContainerImpl(getStructure());
			interimresult.initialize(interimString);
			getInterimResults().add(interimresult);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryPackage.Literals.JAVA_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanFilterPart getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetFilter(BooleanFilterPart newFilter, NotificationChain msgs) {
		BooleanFilterPart oldFilter = filter;
		filter = newFilter;

		EList<InterimResultPart> interims = filter.getArguments();

		if (interims != null) {
			if (interims.size() == 1) {
				getStructure().setSubstructure(interims.get(0));
			} else {
				getStructure().setSubstructure(new FixedContainerInterimImpl(interims));
			}
		}

		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaqueryPackage.JAVA_FILTER__FILTER, oldFilter, newFilter);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilter(BooleanFilterPart newFilter) {
		if (newFilter != filter) {
			NotificationChain msgs = null;
			if (filter != null)
				msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaqueryPackage.JAVA_FILTER__FILTER, null, msgs);
			if (newFilter != null)
				msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaqueryPackage.JAVA_FILTER__FILTER, null, msgs);
			msgs = basicSetFilter(newFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.JAVA_FILTER__FILTER, newFilter, newFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterimResultStructure getStructure() {
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructure(InterimResultStructure newStructure, NotificationChain msgs) {
		InterimResultStructure oldStructure = structure;
		structure = newStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaqueryPackage.JAVA_FILTER__STRUCTURE, oldStructure, newStructure);
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
	public void setStructure(InterimResultStructure newStructure) {
		if (newStructure != structure) {
			NotificationChain msgs = null;
			if (structure != null)
				msgs = ((InternalEObject)structure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaqueryPackage.JAVA_FILTER__STRUCTURE, null, msgs);
			if (newStructure != null)
				msgs = ((InternalEObject)newStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaqueryPackage.JAVA_FILTER__STRUCTURE, null, msgs);
			msgs = basicSetStructure(newStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.JAVA_FILTER__STRUCTURE, newStructure, newStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterimResultContainer> getInterimResults() {
		if (interimResults == null) {
			interimResults = new EObjectResolvingEList<InterimResultContainer>(InterimResultContainer.class, this, JavaqueryPackage.JAVA_FILTER__INTERIM_RESULTS);
		}
		return interimResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuery(String newQuery) {
		String oldQuery = query;
		query = newQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.JAVA_FILTER__QUERY, oldQuery, query));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.JAVA_FILTER__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPatternName() {
		return patternName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatternName(String newPatternName) {
		String oldPatternName = patternName;
		patternName = newPatternName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.JAVA_FILTER__PATTERN_NAME, oldPatternName, patternName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.JAVA_FILTER__PATTERN_ID, oldPatternId, patternId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException
	 * @generated NOT
	 */
	@Override
	public JSONArray filterQueryResults() throws InvalidityException {
		EList<InterimResultContainer> interims = getInterimResults();
		JSONArray results = new JSONArray();
		for (InterimResultContainer ir: interims) {
			try {
				if (getFilter().apply(ir.getParameter())) {
					InterimResult ret = ir.getReturn();
					if (ret instanceof ValueResult) {
						results.put(((ValueResult) ret).getValue());
					} else {
						results.put(ret.toString());
					}
				}
			} catch (InvalidityException e) {
				throw new InvalidityException(ir.toString() + "\n*\n" + ir.getParameter() + "\n" + e.getMessage(), e);
			}
		}
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaqueryPackage.JAVA_FILTER__FILTER:
				return basicSetFilter(null, msgs);
			case JavaqueryPackage.JAVA_FILTER__STRUCTURE:
				return basicSetStructure(null, msgs);
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
			case JavaqueryPackage.JAVA_FILTER__FILTER:
				return getFilter();
			case JavaqueryPackage.JAVA_FILTER__STRUCTURE:
				return getStructure();
			case JavaqueryPackage.JAVA_FILTER__INTERIM_RESULTS:
				return getInterimResults();
			case JavaqueryPackage.JAVA_FILTER__QUERY:
				return getQuery();
			case JavaqueryPackage.JAVA_FILTER__LANGUAGE:
				return getLanguage();
			case JavaqueryPackage.JAVA_FILTER__PATTERN_NAME:
				return getPatternName();
			case JavaqueryPackage.JAVA_FILTER__PATTERN_ID:
				return getPatternId();
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
			case JavaqueryPackage.JAVA_FILTER__FILTER:
				setFilter((BooleanFilterPart)newValue);
				return;
			case JavaqueryPackage.JAVA_FILTER__STRUCTURE:
				setStructure((InterimResultStructure)newValue);
				return;
			case JavaqueryPackage.JAVA_FILTER__INTERIM_RESULTS:
				getInterimResults().clear();
				getInterimResults().addAll((Collection<? extends InterimResultContainer>)newValue);
				return;
			case JavaqueryPackage.JAVA_FILTER__QUERY:
				setQuery((String)newValue);
				return;
			case JavaqueryPackage.JAVA_FILTER__LANGUAGE:
				setLanguage((Language)newValue);
				return;
			case JavaqueryPackage.JAVA_FILTER__PATTERN_NAME:
				setPatternName((String)newValue);
				return;
			case JavaqueryPackage.JAVA_FILTER__PATTERN_ID:
				setPatternId((String)newValue);
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
			case JavaqueryPackage.JAVA_FILTER__FILTER:
				setFilter((BooleanFilterPart)null);
				return;
			case JavaqueryPackage.JAVA_FILTER__STRUCTURE:
				setStructure((InterimResultStructure)null);
				return;
			case JavaqueryPackage.JAVA_FILTER__INTERIM_RESULTS:
				getInterimResults().clear();
				return;
			case JavaqueryPackage.JAVA_FILTER__QUERY:
				setQuery(QUERY_EDEFAULT);
				return;
			case JavaqueryPackage.JAVA_FILTER__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case JavaqueryPackage.JAVA_FILTER__PATTERN_NAME:
				setPatternName(PATTERN_NAME_EDEFAULT);
				return;
			case JavaqueryPackage.JAVA_FILTER__PATTERN_ID:
				setPatternId(PATTERN_ID_EDEFAULT);
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
			case JavaqueryPackage.JAVA_FILTER__FILTER:
				return filter != null;
			case JavaqueryPackage.JAVA_FILTER__STRUCTURE:
				return structure != null;
			case JavaqueryPackage.JAVA_FILTER__INTERIM_RESULTS:
				return interimResults != null && !interimResults.isEmpty();
			case JavaqueryPackage.JAVA_FILTER__QUERY:
				return QUERY_EDEFAULT == null ? query != null : !QUERY_EDEFAULT.equals(query);
			case JavaqueryPackage.JAVA_FILTER__LANGUAGE:
				return language != LANGUAGE_EDEFAULT;
			case JavaqueryPackage.JAVA_FILTER__PATTERN_NAME:
				return PATTERN_NAME_EDEFAULT == null ? patternName != null : !PATTERN_NAME_EDEFAULT.equals(patternName);
			case JavaqueryPackage.JAVA_FILTER__PATTERN_ID:
				return PATTERN_ID_EDEFAULT == null ? patternId != null : !PATTERN_ID_EDEFAULT.equals(patternId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JavaqueryPackage.JAVA_FILTER___FILTER_QUERY_RESULTS:
				try {
					return filterQueryResults();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case JavaqueryPackage.JAVA_FILTER___CREATE_INTERIM_RESULT_CONTAINER__JSONARRAY:
				try {
					createInterimResultContainer((JSONArray)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case JavaqueryPackage.JAVA_FILTER___EXECUTE__STRING:
				try {
					return execute((String)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case JavaqueryPackage.JAVA_FILTER___FILTER__JSONARRAY:
				try {
					return filter((JSONArray)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case JavaqueryPackage.JAVA_FILTER___TO_JSON:
				return toJson();
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public String toString() {
		String res = getQuery();
		if (res == null)
			return "Empty JavaFilter";

		if (getFilter() != null) {
			res += "\n\nFilter " + getFilter().toString();
		} else {
			res += "\n\nFilter not Found";
		}

		if (getStructure() != null) {
			res += "\n\nStructure: " + getStructure().toString();
		} else {
			res += "\n\nStructure not Found";
		}

		return res;
	}

} //JavaFilterImpl
