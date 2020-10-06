/**
 */
package qualitypatternmodel.execution.impl;

import org.basex.core.BaseXException;
import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.ServerXmlDataDatabase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server Xml Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ServerXmlDataDatabaseImpl extends XmlDataDatabaseImpl implements ServerXmlDataDatabase {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerXmlDataDatabaseImpl() {
		super();
	}
	
	@Override
	public void init() throws BaseXException, QueryIOException, QueryException {
		open();
		analyse();		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.SERVER_XML_DATA_DATABASE;
	}

} //ServerXmlDatabaseImpl
