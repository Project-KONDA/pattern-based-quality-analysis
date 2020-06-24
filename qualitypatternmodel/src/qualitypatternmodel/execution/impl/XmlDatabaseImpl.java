/**
 */
package qualitypatternmodel.execution.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.XQuery;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.XmlDatabase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xml Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.execution.impl.XmlDatabaseImpl#getElementNames <em>Element Names</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.XmlDatabaseImpl#getAttributeNames <em>Attribute Names</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.XmlDatabaseImpl#getRecordedAttributeValues <em>Recorded Attribute Values</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.XmlDatabaseImpl#getRecordedDataValues <em>Recorded Data Values</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.XmlDatabaseImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XmlDatabaseImpl extends DatabaseImpl implements XmlDatabase {
	/**
	 * The cached value of the '{@link #getElementNames() <em>Element Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> elementNames;

	/**
	 * The cached value of the '{@link #getAttributeNames() <em>Attribute Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> attributeNames;

	/**
	 * The cached value of the '{@link #getRecordedAttributeValues() <em>Recorded Attribute Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordedAttributeValues()
	 * @generated
	 * @ordered
	 */
	protected EList<String> recordedAttributeValues;

	/**
	 * The cached value of the '{@link #getRecordedDataValues() <em>Recorded Data Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordedDataValues()
	 * @generated
	 * @ordered
	 */
	protected EList<String> recordedDataValues;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmlDatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.XML_DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getElementNames() {
		if (elementNames == null) {
			elementNames = new EDataTypeUniqueEList<String>(String.class, this, ExecutionPackage.XML_DATABASE__ELEMENT_NAMES);
		}
		return elementNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAttributeNames() {
		if (attributeNames == null) {
			attributeNames = new EDataTypeUniqueEList<String>(String.class, this, ExecutionPackage.XML_DATABASE__ATTRIBUTE_NAMES);
		}
		return attributeNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRecordedAttributeValues() {
		if (recordedAttributeValues == null) {
			recordedAttributeValues = new EDataTypeUniqueEList<String>(String.class, this, ExecutionPackage.XML_DATABASE__RECORDED_ATTRIBUTE_VALUES);
		}
		return recordedAttributeValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRecordedDataValues() {
		if (recordedDataValues == null) {
			recordedDataValues = new EDataTypeUniqueEList<String>(String.class, this, ExecutionPackage.XML_DATABASE__RECORDED_DATA_VALUES);
		}
		return recordedDataValues;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.XML_DATABASE__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void analyseDatabase() throws BaseXException {
		open();				
		executeAnalysis("distinct-values(//*/name())", "\n", getElementNames());
		executeAnalysis("distinct-values(//*/@*/name()))", "\n", getAttributeNames());
	}
	
	private void executeAnalysis(String query, String regex, EList<String> valueStorage) throws BaseXException {
		XQuery xquery = new XQuery(query);
		String result = xquery.execute(context);
		String[] split = result.split(regex);
		for(int i = 0; i < split.length; i++) {
			valueStorage.add(split[i]);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void analyseSchema() throws BaseXException {
		open();		
		// TODO: add namespace
		executeAnalysis("//*[name()=\"xsd:element\"]/data(@name)", "\n", getElementNames());
		executeAnalysis("//*[name()=\"xsd:attribute\"]/data(@name)", "\n", getAttributeNames());
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void recordAttributeValue() {
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
	public void recordDataValue() {
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
	public void removeAttributeValue() {
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
	public void removeDataValue() {
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
	public void init() throws BaseXException {
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
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutionPackage.XML_DATABASE__ELEMENT_NAMES:
				return getElementNames();
			case ExecutionPackage.XML_DATABASE__ATTRIBUTE_NAMES:
				return getAttributeNames();
			case ExecutionPackage.XML_DATABASE__RECORDED_ATTRIBUTE_VALUES:
				return getRecordedAttributeValues();
			case ExecutionPackage.XML_DATABASE__RECORDED_DATA_VALUES:
				return getRecordedDataValues();
			case ExecutionPackage.XML_DATABASE__CONTEXT:
				return getContext();
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
			case ExecutionPackage.XML_DATABASE__ELEMENT_NAMES:
				getElementNames().clear();
				getElementNames().addAll((Collection<? extends String>)newValue);
				return;
			case ExecutionPackage.XML_DATABASE__ATTRIBUTE_NAMES:
				getAttributeNames().clear();
				getAttributeNames().addAll((Collection<? extends String>)newValue);
				return;
			case ExecutionPackage.XML_DATABASE__RECORDED_ATTRIBUTE_VALUES:
				getRecordedAttributeValues().clear();
				getRecordedAttributeValues().addAll((Collection<? extends String>)newValue);
				return;
			case ExecutionPackage.XML_DATABASE__RECORDED_DATA_VALUES:
				getRecordedDataValues().clear();
				getRecordedDataValues().addAll((Collection<? extends String>)newValue);
				return;
			case ExecutionPackage.XML_DATABASE__CONTEXT:
				setContext((Context)newValue);
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
			case ExecutionPackage.XML_DATABASE__ELEMENT_NAMES:
				getElementNames().clear();
				return;
			case ExecutionPackage.XML_DATABASE__ATTRIBUTE_NAMES:
				getAttributeNames().clear();
				return;
			case ExecutionPackage.XML_DATABASE__RECORDED_ATTRIBUTE_VALUES:
				getRecordedAttributeValues().clear();
				return;
			case ExecutionPackage.XML_DATABASE__RECORDED_DATA_VALUES:
				getRecordedDataValues().clear();
				return;
			case ExecutionPackage.XML_DATABASE__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
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
			case ExecutionPackage.XML_DATABASE__ELEMENT_NAMES:
				return elementNames != null && !elementNames.isEmpty();
			case ExecutionPackage.XML_DATABASE__ATTRIBUTE_NAMES:
				return attributeNames != null && !attributeNames.isEmpty();
			case ExecutionPackage.XML_DATABASE__RECORDED_ATTRIBUTE_VALUES:
				return recordedAttributeValues != null && !recordedAttributeValues.isEmpty();
			case ExecutionPackage.XML_DATABASE__RECORDED_DATA_VALUES:
				return recordedDataValues != null && !recordedDataValues.isEmpty();
			case ExecutionPackage.XML_DATABASE__CONTEXT:
				return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
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
			case ExecutionPackage.XML_DATABASE___ANALYSE_DATABASE:
				try {
					analyseDatabase();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.XML_DATABASE___ANALYSE_SCHEMA:
				try {
					analyseSchema();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.XML_DATABASE___RECORD_ATTRIBUTE_VALUE:
				recordAttributeValue();
				return null;
			case ExecutionPackage.XML_DATABASE___RECORD_DATA_VALUE:
				recordDataValue();
				return null;
			case ExecutionPackage.XML_DATABASE___REMOVE_ATTRIBUTE_VALUE:
				removeAttributeValue();
				return null;
			case ExecutionPackage.XML_DATABASE___REMOVE_DATA_VALUE:
				removeDataValue();
				return null;
			case ExecutionPackage.XML_DATABASE___INIT:
				try {
					init();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.XML_DATABASE___OPEN:
				try {
					open();
					return null;
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
		result.append(" (elementNames: ");
		result.append(elementNames);
		result.append(", attributeNames: ");
		result.append(attributeNames);
		result.append(", recordedAttributeValues: ");
		result.append(recordedAttributeValues);
		result.append(", recordedDataValues: ");
		result.append(recordedDataValues);
		result.append(", context: ");
		result.append(context);
		result.append(')');
		return result.toString();
	}

} //XmlDatabaseImpl
