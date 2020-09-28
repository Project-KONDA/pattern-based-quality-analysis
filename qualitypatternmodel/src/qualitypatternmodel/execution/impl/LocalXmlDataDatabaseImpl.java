/**
 */
package qualitypatternmodel.execution.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.CreateDB;
import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.basex.query.QueryProcessor;
import org.basex.query.iter.Iter;
import org.basex.query.value.item.Item;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.LocalXmlDataDatabase;
import qualitypatternmodel.execution.Result;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Xml Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.execution.impl.LocalXmlDataDatabaseImpl#getDataPath <em>Data Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalXmlDataDatabaseImpl extends XmlDataDatabaseImpl implements LocalXmlDataDatabase {
	/**
	 * The default value of the '{@link #getDataPath() <em>Data Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPath()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataPath() <em>Data Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPath()
	 * @generated
	 * @ordered
	 */
	protected String dataPath = DATA_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalXmlDataDatabaseImpl() {
		super();
	}
	
	public LocalXmlDataDatabaseImpl(String name, String dataPath) {
		super();
		this.name = name;
		this.dataPath = dataPath;		
	}
	
//	public LocalXmlDatabaseImpl(String name, String dataPath, String schemaPath) {
//		super();
//		this.name = name;
//		this.dataPath = dataPath;	
//		this.schemaPath = schemaPath;
//	}

	@Override
	public void init() throws BaseXException, QueryIOException, QueryException {
		context = new Context();
		create(); // TODO: optional
		analyse();
	}
	
	@Override
	public Result execute(CompletePattern pattern, String name, String person) throws InvalidityException, OperatorCycleException, MissingPatternContainerException, BaseXException, QueryException, QueryIOException {
		
		pattern.isValid(AbstractionLevel.CONCRETE);	
		
		open();
		
		String query;
		if(pattern.getQuery() == null) {
			query = pattern.generateQuery();
		} else {
			query = pattern.getQuery();
		}
//		XQuery xquery = new XQuery(query);
		
		Date startDate = new Date();
		
//		String queryResult = xquery.execute(context);
		List<String> queryResult = new ArrayList<String>();
		// Create a query processor
	    try(QueryProcessor proc = new QueryProcessor(query, context)) {
	      // Store the pointer to the result in an iterator:
	      Iter iter = proc.iter();
	      for(Item item; (item = iter.next()) != null;) {
	    	  queryResult.add(item.serialize().toString());
	        }
	    }
		
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
	public int countMatches(CompletePattern pattern) throws QueryException, InvalidityException, OperatorCycleException, MissingPatternContainerException, BaseXException, QueryIOException {
		pattern.isValid(AbstractionLevel.CONCRETE);	
		
		open();
		
		String query;
		if(pattern.getPartialQuery() == null) {
			pattern.generateQuery();
		}
		query = pattern.getPartialQuery();
		
		List<String> queryResult = new ArrayList<String>();
	    try(QueryProcessor proc = new QueryProcessor(query, context)) {
	      Iter iter = proc.iter();
	      for(Item item; (item = iter.next()) != null;) {
	    	  queryResult.add(item.serialize().toString());
	        }
	    }
	    
	    return queryResult.size();
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.LOCAL_XML_DATA_DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataPath() {
		return dataPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataPath(String newDataPath) {
		String oldDataPath = dataPath;
		dataPath = newDataPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.LOCAL_XML_DATA_DATABASE__DATA_PATH, oldDataPath, dataPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void create() throws BaseXException {
		new CreateDB(name, dataPath).execute(context);	
	}	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutionPackage.LOCAL_XML_DATA_DATABASE__DATA_PATH:
				return getDataPath();
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
			case ExecutionPackage.LOCAL_XML_DATA_DATABASE__DATA_PATH:
				setDataPath((String)newValue);
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
			case ExecutionPackage.LOCAL_XML_DATA_DATABASE__DATA_PATH:
				setDataPath(DATA_PATH_EDEFAULT);
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
			case ExecutionPackage.LOCAL_XML_DATA_DATABASE__DATA_PATH:
				return DATA_PATH_EDEFAULT == null ? dataPath != null : !DATA_PATH_EDEFAULT.equals(dataPath);
		}
		return super.eIsSet(featureID);
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
		result.append(" (dataPath: ");
		result.append(dataPath);
		result.append(')');
		return result.toString();
	}

} //LocalXmlDatabaseImpl
