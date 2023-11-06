/**
 */
package qualitypatternmodel.javaquery.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import qualitypatternmodel.javaquery.BooleanFilterPart;
import qualitypatternmodel.javaquery.JavaFilter;
import qualitypatternmodel.javaquery.JavaqueryPackage;
import qualitypatternmodel.javaqueryoutput.InterimResult;
import qualitypatternmodel.javaqueryoutput.InterimResultPart;
import qualitypatternmodel.javaqueryoutput.InterimResultStructure;
import qualitypatternmodel.javaqueryoutput.impl.FixedContainerInterimImpl;
import qualitypatternmodel.javaqueryoutput.impl.InterimResultStructureImpl;

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
 *   <li>{@link qualitypatternmodel.javaquery.impl.JavaFilterImpl#getInterimResult <em>Interim Result</em>}</li>
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
	 * The cached value of the '{@link #getInterimResult() <em>Interim Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterimResult()
	 * @generated
	 * @ordered
	 */
	protected InterimResult interimResult;

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
	public InterimResult getInterimResult() {
		if (interimResult != null && interimResult.eIsProxy()) {
			InternalEObject oldInterimResult = (InternalEObject)interimResult;
			interimResult = (InterimResult)eResolveProxy(oldInterimResult);
			if (interimResult != oldInterimResult) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaqueryPackage.JAVA_FILTER__INTERIM_RESULT, oldInterimResult, interimResult));
			}
		}
		return interimResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterimResult basicGetInterimResult() {
		return interimResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterimResult(InterimResult newInterimResult) {
		InterimResult oldInterimResult = interimResult;
		interimResult = newInterimResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.JAVA_FILTER__INTERIM_RESULT, oldInterimResult, interimResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String filterXQueryResults(List<Object> param1) {
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
			case JavaqueryPackage.JAVA_FILTER__INTERIM_RESULT:
				if (resolve) return getInterimResult();
				return basicGetInterimResult();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JavaqueryPackage.JAVA_FILTER__FILTER:
				setFilter((BooleanFilterPart)newValue);
				return;
			case JavaqueryPackage.JAVA_FILTER__STRUCTURE:
				setStructure((InterimResultStructure)newValue);
				return;
			case JavaqueryPackage.JAVA_FILTER__INTERIM_RESULT:
				setInterimResult((InterimResult)newValue);
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
			case JavaqueryPackage.JAVA_FILTER__INTERIM_RESULT:
				setInterimResult((InterimResult)null);
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
			case JavaqueryPackage.JAVA_FILTER__INTERIM_RESULT:
				return interimResult != null;
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
			case JavaqueryPackage.JAVA_FILTER___FILTER_XQUERY_RESULTS__LIST:
				return filterXQueryResults((List<Object>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public String toString() {
		return getFilter().toString() + "\n\n" + getStructure().toString();
	}

} //JavaFilterImpl
