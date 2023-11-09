/**
 */
package qualitypatternmodel.javaquery.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
	public void createInterimResultContainer(List<Object> objectList) throws InvalidityException {
		EList<InterimResultContainer> a = getInterimResults();
		a.clear();
		for (Object object: objectList) {
			if (object instanceof List) {
				@SuppressWarnings("unchecked")
				List<Object> lst = (List<Object>) object;
				Object retu = lst.get(0);
				Object parameter = lst.get(1);
				a.add(new InterimResultContainerImpl(getStructure(), retu, parameter));
			}
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
			if (interims.size() == 1)
				getStructure().setSubstructure(interims.get(0));
			else 
				getStructure().setSubstructure(new FixedContainerInterimImpl(interims));
		}
		
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaqueryPackage.JAVA_FILTER__FILTER, oldFilter, newFilter);
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
	 * @generated NOT
	 */
	@Override
	public EList<String> filterQueryResults() throws InvalidityException {
		EList<InterimResultContainer> interims = getInterimResults();
		EList<String> results = new BasicEList<String>();
		for (InterimResultContainer ir: interims) {
			if (getFilter().apply(ir.getParameter())) {
				InterimResult ret = ir.getReturn();
				if (ret instanceof ValueResult)
					results.add(((ValueResult) ret).getValue());
				else 
					results.add(ret.toString());
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
		}
		return super.eIsSet(featureID);
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
			case JavaqueryPackage.JAVA_FILTER___FILTER_QUERY_RESULTS:
				try {
					return filterQueryResults();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case JavaqueryPackage.JAVA_FILTER___CREATE_INTERIM_RESULT_CONTAINER__LIST:
				try {
					createInterimResultContainer((List<Object>)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public String toString() {
		return getFilter().toString() + "\n\n" + getStructure().toString();
	}

} //JavaFilterImpl
