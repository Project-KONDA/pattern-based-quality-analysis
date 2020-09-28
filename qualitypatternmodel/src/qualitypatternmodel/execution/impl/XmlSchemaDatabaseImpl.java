/**
 */
package qualitypatternmodel.execution.impl;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.Open;
import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.basex.query.QueryProcessor;
import org.basex.query.iter.Iter;
import org.basex.query.value.item.Item;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.execution.XmlSchemaDatabase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xml Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.execution.impl.XmlSchemaDatabaseImpl#getXmlDatabases <em>Xml Databases</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.XmlSchemaDatabaseImpl#getAttributeNames <em>Attribute Names</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.XmlSchemaDatabaseImpl#getElementNames <em>Element Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XmlSchemaDatabaseImpl extends XmlDatabaseImpl implements XmlSchemaDatabase {
	/**
	 * The cached value of the '{@link #getXmlDatabases() <em>Xml Databases</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlDatabases()
	 * @generated
	 * @ordered
	 */
	protected EList<XmlDataDatabase> xmlDatabases;
	
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
	 * The cached value of the '{@link #getElementNames() <em>Element Names</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementNames()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Integer> elementNames;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmlSchemaDatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void analyse() throws BaseXException, QueryIOException, QueryException {
		open();		
		executeAnalysis("//*[name()=\"xs:element\"]/data(@name)", getElementNames(), context);
		executeAnalysis("//*[name()=\"xs:attribute\"]/data(@name)", getAttributeNames(), context);
		
		// TODO: add namespace
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
	
	private EList<String> getElementNames(String elementName, String path, String methodName) throws BaseXException, QueryException, QueryIOException {
		open();

		String checkQuery; 
		
		try {
			checkQuery = readFile(path, StandardCharsets.US_ASCII);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
			
			return new BasicEList<String>();
		}
		
		String call = distinctNamesQuery(methodName, elementName);
		
		String query = checkQuery + call;
		
		List<String> queryResult = executeQuery(query, context);
		
		EList<String> result = new BasicEList<String>();
		result.addAll(queryResult);	
		
		return result;
	}
	
	private static String readFile(String path, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}
	
	private String distinctNamesQuery (String methodName, String elementName) {
		return "distinct-values(\r\n" +
				"  let $ns := \""+getNamespace()+"\"" + 
				"  let $elements := (\r\n" + 
				"    for $root in /xs:schema\r\n" + 
				"    return local:"+methodName+"($root, \""+elementName.replace(getNamespace(), "")+"\", $ns))\r\n" + 
				"  for $element in $elements\r\n" + 
				"  return\r\n" + 
				"    if(exists($element/@name)) then $ns || $element/@name/data()\r\n" + 
				"    else $element/@ref/data()\r\n" + 
				")";
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void open() throws BaseXException {
		new Open(name).execute(context);
	}	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.XML_SCHEMA_DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XmlDataDatabase> getXmlDatabases() {
		if (xmlDatabases == null) {
			xmlDatabases = new EObjectWithInverseResolvingEList<XmlDataDatabase>(XmlDataDatabase.class, this, ExecutionPackage.XML_SCHEMA_DATABASE__XML_DATABASES, ExecutionPackage.XML_DATA_DATABASE__XML_SCHEMA);
		}
		return xmlDatabases;
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
			case ExecutionPackage.XML_SCHEMA_DATABASE__XML_DATABASES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getXmlDatabases()).basicAdd(otherEnd, msgs);
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
			case ExecutionPackage.XML_SCHEMA_DATABASE__XML_DATABASES:
				return ((InternalEList<?>)getXmlDatabases()).basicRemove(otherEnd, msgs);
			case ExecutionPackage.XML_SCHEMA_DATABASE__ATTRIBUTE_NAMES:
				return ((InternalEList<?>)getAttributeNames()).basicRemove(otherEnd, msgs);
			case ExecutionPackage.XML_SCHEMA_DATABASE__ELEMENT_NAMES:
				return ((InternalEList<?>)getElementNames()).basicRemove(otherEnd, msgs);
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
			case ExecutionPackage.XML_SCHEMA_DATABASE__XML_DATABASES:
				return getXmlDatabases();
			case ExecutionPackage.XML_SCHEMA_DATABASE__ATTRIBUTE_NAMES:
				if (coreType) return getAttributeNames();
				else return getAttributeNames().map();
			case ExecutionPackage.XML_SCHEMA_DATABASE__ELEMENT_NAMES:
				if (coreType) return getElementNames();
				else return getElementNames().map();
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
			case ExecutionPackage.XML_SCHEMA_DATABASE__XML_DATABASES:
				getXmlDatabases().clear();
				getXmlDatabases().addAll((Collection<? extends XmlDataDatabase>)newValue);
				return;
			case ExecutionPackage.XML_SCHEMA_DATABASE__ATTRIBUTE_NAMES:
				((EStructuralFeature.Setting)getAttributeNames()).set(newValue);
				return;
			case ExecutionPackage.XML_SCHEMA_DATABASE__ELEMENT_NAMES:
				((EStructuralFeature.Setting)getElementNames()).set(newValue);
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
			case ExecutionPackage.XML_SCHEMA_DATABASE__XML_DATABASES:
				getXmlDatabases().clear();
				return;
			case ExecutionPackage.XML_SCHEMA_DATABASE__ATTRIBUTE_NAMES:
				getAttributeNames().clear();
				return;
			case ExecutionPackage.XML_SCHEMA_DATABASE__ELEMENT_NAMES:
				getElementNames().clear();
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
			case ExecutionPackage.XML_SCHEMA_DATABASE__XML_DATABASES:
				return xmlDatabases != null && !xmlDatabases.isEmpty();
			case ExecutionPackage.XML_SCHEMA_DATABASE__ATTRIBUTE_NAMES:
				return attributeNames != null && !attributeNames.isEmpty();
			case ExecutionPackage.XML_SCHEMA_DATABASE__ELEMENT_NAMES:
				return elementNames != null && !elementNames.isEmpty();
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
			case ExecutionPackage.XML_SCHEMA_DATABASE___CHECK_FOLLOWING_IN_SCHEMA__STRING_STRING:
				try {
					return checkFollowingInSchema((String)arguments.get(0), (String)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.XML_SCHEMA_DATABASE___CHECK_PARENT_IN_SCHEMA__STRING_STRING:
				try {
					return checkParentInSchema((String)arguments.get(0), (String)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.XML_SCHEMA_DATABASE___CHECK_ANCESTOR_IN_SCHEMA__STRING_STRING:
				try {
					return checkAncestorInSchema((String)arguments.get(0), (String)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.XML_SCHEMA_DATABASE___CHECK_PRECEDING_SIBLING_IN_SCHEMA__STRING_STRING:
				try {
					return checkPrecedingSiblingInSchema((String)arguments.get(0), (String)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.XML_SCHEMA_DATABASE___CHECK_DESCENDANT_IN_SCHEMA__STRING_STRING:
				try {
					return checkDescendantInSchema((String)arguments.get(0), (String)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.XML_SCHEMA_DATABASE___CHECK_CHILD_IN_SCHEMA__STRING_STRING:
				try {
					return checkChildInSchema((String)arguments.get(0), (String)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.XML_SCHEMA_DATABASE___CHECK_ATTRIBUTE_IN_SCHEMA__STRING_STRING:
				try {
					return checkAttributeInSchema((String)arguments.get(0), (String)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.XML_SCHEMA_DATABASE___CHECK_KEY_REF_IN_SCHEMA__STRING_STRING:
				try {
					checkKeyRefInSchema((String)arguments.get(0), (String)arguments.get(1));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.XML_SCHEMA_DATABASE___CHECK_PRECEDING_IN_SCHEMA__STRING_STRING:
				try {
					return checkPrecedingInSchema((String)arguments.get(0), (String)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.XML_SCHEMA_DATABASE___CHECK_FOLLOWING_SIBLING_IN_SCHEMA__STRING_STRING:
				try {
					return checkFollowingSiblingInSchema((String)arguments.get(0), (String)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.XML_SCHEMA_DATABASE___GET_ANCESTORS_IN_SCHEMA__STRING:
				try {
					return getAncestorsInSchema((String)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.XML_SCHEMA_DATABASE___GET_DESCENDANTS_IN_SCHEMA__STRING:
				try {
					return getDescendantsInSchema((String)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.XML_SCHEMA_DATABASE___GET_CHILDREN_IN_SCHEMA__STRING:
				try {
					return getChildrenInSchema((String)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.XML_SCHEMA_DATABASE___GET_FOLLOWING_IN_SCHEMA__STRING:
				try {
					return getFollowingInSchema((String)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.XML_SCHEMA_DATABASE___GET_PRECEDING_IN_SCHEMA__STRING:
				try {
					return getPrecedingInSchema((String)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.XML_SCHEMA_DATABASE___GET_PARENTS_IN_SCHEMA__STRING:
				try {
					return getParentsInSchema((String)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.XML_SCHEMA_DATABASE___GET_ATTRIBUTES_IN_SCHEMA__STRING:
				try {
					return getAttributesInSchema((String)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.XML_SCHEMA_DATABASE___GET_FOLLOWING_SIBLINGS_IN_SCHEMA__STRING:
				try {
					return getFollowingSiblingsInSchema((String)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.XML_SCHEMA_DATABASE___GET_PRECEDING_SIBLINGS_IN_SCHEMA__STRING:
				try {
					return getPrecedingSiblingsInSchema((String)arguments.get(0));
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
	 * @throws BaseXException 
	 * @throws QueryException 
	 * @throws QueryIOException 
	 * @generated NOT
	 */
	@Override
	public boolean checkChildInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException {
		return checkAxis(elementName1, elementName2, "queries/CheckChild.xq", "checkChild");		
	}

	private boolean checkAxis(String elementName1, String elementName2, String path, String methodName)
			throws BaseXException, QueryException, QueryIOException {
		open();
		
		String checkQuery;
		try {
			checkQuery = readFile(path, StandardCharsets.US_ASCII);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return true;
		}
		
		String call = "\nfor $root in /xs:schema\r\n" + 
				"return local:"+methodName+"($root, \""+elementName1.replace(getNamespace(), "")+"\", \""+elementName2.replace(getNamespace(), "")+"\", \""+getNamespace()+"\")";
		
		String query = checkQuery + call;
		
		List<String> queryResult = executeQuery(query, context);
		if(queryResult.size() == 1) {			
			if(queryResult.get(0).equals("false")) {
				return false;
			}
		}
		
		// TODO: else throw exception ?
		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws QueryException 
	 * @throws QueryIOException 
	 * @throws BaseXException 
	 * @generated NOT
	 */
	@Override
	public boolean checkParentInSchema(String elementName1, String elementName2) throws BaseXException, QueryIOException, QueryException {
		return checkChildInSchema(elementName2, elementName1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws QueryException 
	 * @throws BaseXException 
	 * @throws QueryIOException 
	 * @generated NOT
	 */
	@Override
	public boolean checkDescendantInSchema(String elementName1, String elementName2) throws QueryException, BaseXException, QueryIOException {		
		return checkAxis(elementName1, elementName2, "queries/CheckDescendant.xq", "checkDescendant");			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws QueryException 
	 * @throws QueryIOException 
	 * @throws BaseXException 
	 * @generated NOT
	 */
	@Override
	public boolean checkAncestorInSchema(String elementName1, String elementName2) throws BaseXException, QueryIOException, QueryException {
		return checkDescendantInSchema(elementName2, elementName1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws QueryException 
	 * @throws QueryIOException 
	 * @throws BaseXException 
	 * @generated NOT
	 */
	@Override
	public boolean checkAttributeInSchema(String elementName, String attributeName) throws QueryException, QueryIOException, BaseXException {
		return checkAxis(elementName, attributeName, "queries/CheckAttribute.xq", "checkAttribute");		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean checkFollowingSiblingInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException {
		return checkAxis(elementName1, elementName2, "queries/CheckFollowingSibling.xq", "checkFollowingSibling");		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean checkPrecedingSiblingInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException {
		return checkFollowingSiblingInSchema(elementName2, elementName1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean checkFollowingInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException {
		return checkAxis(elementName1, elementName2, "queries/CheckFollowing.xq", "checkFollowing");			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean checkPrecedingInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException {
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
	public void checkKeyRefInSchema(String elementName1, String elementName2) {
		// TODO: create/open schema database
	
		
		String namespace = "declare namespace xsd = \"http://www.w3.org/2001/XMLSchema\";\r\n" + 
				"";
		
		/* The following function checks whether there might exist a reference between an element named $n1 and an element named $n2 by analysing the XML schema.
		 * However, there may be false positives.
		 * For reliably checking this, the structural context of both elements must be known.
		 * This is not possible here.
		 * Furthermore, for a precise check the schema analysis would be much more complex.
		 * 
		 */
		
		String checkRefId = "declare function local:checkRefId($r as element(), $n1 as xs:string, $n2 as xs:string)\r\n" + 
				"as xs:boolean\r\n" + 
				"{\r\n" + 
				"some $ref in $r//xs:keyref[./xs:selector/@xpath = $n1 or matches(./xs:selector/@xpath, \"/\" || $n1 || \"$\")] \r\n" + 
				"satisfies some $key in $r//xs:key[@name = $ref/@refer]\r\n" + 
				"satisfies $key/xs:selector/@xpath = $n2 or matches($key/xs:selector/@xpath, \"/\" || $n2 || \"$\")\r\n" + 
				"};";
		
		String getRefId = "declare function local:getRefId($r as element(), $n1 as xs:string, $n2 as xs:string)\r\n" + 
				"as xs:string+\r\n" + 
				"{\r\n" + 
				"for $ref in $r//xs:keyref[./xs:selector/@xpath = $n1 or matches(./xs:selector/@xpath, \"/\" || $n1 || \"$\")] \r\n" + 
				"for $key in $r//xs:key[@name = $ref/@refer]\r\n" + 
				"where $key/xs:selector/@xpath = $n2 or matches($key/xs:selector/@xpath, \"/\" || $n2 || \"$\")\r\n" + 
				"return ($ref/xs:field/@xpath, $key/xs:field/@xpath)\r\n" + 
				"};";
		
		String callCheck = "for $x in /xs:schema\r\n" + 
				"return local:checkRefId($x, \""+elementName1+"\",\""+elementName2+"\")";
		
		String callGet = "for $x in /xs:schema\r\n" + 
				"return local:getRefId($x, \""+elementName1+"\",\""+elementName2+"\")";
		
		// TODO: execute query
		
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<String> getChildrenInSchema(String elementName) throws BaseXException, QueryException, QueryIOException {
		return getElementNames(elementName, "queries/GetChildren.xq", "getChildren");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<String> getDescendantsInSchema(String elementName) throws BaseXException, QueryException, QueryIOException {
		return getElementNames(elementName, "queries/GetDescendantsEfficient.xq", "getDescendants");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<String> getParentsInSchema(String elementName) throws BaseXException, QueryException, QueryIOException {
		return getElementNames(elementName, "queries/GetParents.xq", "getDescendants");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<String> getAncestorsInSchema(String elementName) throws BaseXException, QueryException, QueryIOException {
		return getElementNames(elementName, "queries/GetAncestorsEfficient.xq", "getDescendants");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAttributesInSchema(String elementName) throws BaseXException, QueryException, QueryIOException {
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
	public EList<String> getFollowingSiblingsInSchema(String elementName) throws BaseXException, QueryException, QueryIOException {
		return getElementNames(elementName, "queries/GetFollowingSibling.xq", "getDescendants");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPrecedingSiblingsInSchema(String elementName) throws BaseXException, QueryException, QueryIOException {
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
	public EList<String> getFollowingInSchema(String elementName) throws BaseXException, QueryException, QueryIOException {
		return getElementNames(elementName, "queries/GetFollowing2.xq", "getDescendants");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPrecedingInSchema(String elementName) throws BaseXException, QueryException, QueryIOException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EMap<String, Integer> getElementNames() {
		if (elementNames == null) {
			elementNames = new EcoreEMap<String,Integer>(ExecutionPackage.Literals.STRING_TO_INT_MAP, StringToIntMapImpl.class, this, ExecutionPackage.XML_SCHEMA_DATABASE__ELEMENT_NAMES);
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
			attributeNames = new EcoreEMap<String,Integer>(ExecutionPackage.Literals.STRING_TO_INT_MAP, StringToIntMapImpl.class, this, ExecutionPackage.XML_SCHEMA_DATABASE__ATTRIBUTE_NAMES);
		}
		return attributeNames;
	}

	

} //XmlSchemaImpl
