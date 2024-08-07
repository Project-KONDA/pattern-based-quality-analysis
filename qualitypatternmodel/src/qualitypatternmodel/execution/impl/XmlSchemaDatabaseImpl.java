/**
 */
package qualitypatternmodel.execution.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.List;

import org.basex.core.BaseXException;
import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.execution.XmlDatabase;
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
 *   <li>{@link qualitypatternmodel.execution.impl.XmlSchemaDatabaseImpl#getElementNames <em>Element Names</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.XmlSchemaDatabaseImpl#getAttributeNames <em>Attribute Names</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.XmlSchemaDatabaseImpl#getRootElementNames <em>Root Element Names</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.XmlSchemaDatabaseImpl#getPrefix <em>Prefix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XmlSchemaDatabaseImpl extends XmlDatabaseImpl implements XmlSchemaDatabase {
	/**
	 * The cached value of the '{@link #getXmlDatabases() <em>Xml Databases</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * A list of all <code>XmlDataDatabases</code> that use the XML schema.
	 * <!-- end-user-doc -->
	 * @see #getXmlDatabases()
	 * @generated
	 * @ordered
	 */
	protected EList<XmlDataDatabase> xmlDatabases;

	/**
	 * The cached value of the '{@link #getElementNames() <em>Element Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * A list of the names of all XML elements defined in the XML schema.
	 * <!-- end-user-doc -->
	 * @see #getElementNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> elementNames;
	/**
	 * The cached value of the '{@link #getAttributeNames() <em>Attribute Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * A list of the names of all XML attributes defined in the XML schema.
	 * <!-- end-user-doc -->
	 * @see #getAttributeNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> attributeNames;

	/**
	 * The cached value of the '{@link #getRootElementNames() <em>Root Element Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootElementNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> rootElementNames;

	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected XmlSchemaDatabaseImpl() {
		super();
		DatabasesImpl.getInstance().getXmlSchemata().add(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws IOException
	 * @throws InvalidityException
	 * @generated NOT
	 */
	@Override
	public void analyse() throws QueryException, IOException, InvalidityException {
		retrievePrefix();
		retrieveNamespace();

		if(getElementNames().isEmpty()) {
			retrieveElementNames();
			updateElementNamesInXmlDatabases();
		}
		if(getAttributeNames().isEmpty()) {
			retrieveAttributeNames();
			updateAttributeNamesInXmlDatabases();
		}
		if(getRootElementNames().isEmpty()) {
			retrieveRootElementNames();
		}

	}

	private void retrieveNamespace() throws QueryIOException, BaseXException, QueryException, IOException {
		String path = "queries/GetNamespace.xq";

		String checkQuery;
		try {
			checkQuery = readFile(path, StandardCharsets.US_ASCII);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			return;
		}

		checkQuery = checkQuery.replace("xs:", getPrefix() + ":");


		List<String> queryResult = execute(checkQuery);
		if(queryResult.size() == 1) {
			setNamespace(queryResult.get(0) + ":");
		}

	}

	private void retrievePrefix()
			throws QueryException, QueryIOException, BaseXException, IOException, InvalidityException {
		EList<String> prefixResult = execute("/*/name()");
		if(prefixResult.size() != 1) {
			throw new InvalidityException("Multiple XML schemata declared");
		}
		if(prefixResult.get(0).startsWith("xs:")) {
			setPrefix("xs");
		} else if (prefixResult.get(0).startsWith("xsd:")) {
			setPrefix("xsd");
		} else {
			throw new InvalidityException("Invalid schema prefix");
		}
	}

	private void updateAttributeNamesInXmlDatabases() {
		for(XmlDataDatabase db : getXmlDatabases()) {
			db.addAttributeNames(getAttributeNames());
		}
	}

	private void updateElementNamesInXmlDatabases() {
		for(XmlDataDatabase db : getXmlDatabases()) {
			db.addElementNames(getElementNames());
		}
	}

	private void retrieveElementNames() throws QueryException, IOException {
//		open();
		List<String> retrievedElementNames = execute("//*[name()=\"" + getPrefix() + ":element\"]/data(@name)");
		getElementNames().addAll(retrievedElementNames);
	}

	private void retrieveRootElementNames() throws QueryException, IOException {
//		open();
		List<String> retrievedElementNames = execute("/*/*[name()=\"" + getPrefix() + ":element\"]/data(@name)");
		getRootElementNames().addAll(retrievedElementNames);
	}

	private void retrieveAttributeNames() throws QueryException, IOException {
//		open();
		List<String> retrievedAttributeNames = execute("//*[name()=\"" + getPrefix() + ":attribute\"]/data(@name)");
		getAttributeNames().addAll(retrievedAttributeNames);
	}

	private EList<String> getElementNamesFromQueryExecution(String elementName, String queryPath, String xQueryMethodName) throws QueryException, IOException {
//		open();

		String checkQuery;

		try {
			checkQuery = readFile(queryPath, StandardCharsets.US_ASCII);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			return new BasicEList<String>();
		}

		String call = distinctNamesQuery(xQueryMethodName, elementName);

		String query = checkQuery + call;

		List<String> queryResult = execute(query);

		EList<String> result = new BasicEList<String>();
		result.addAll(queryResult);

		return result;
	}

	private static String readFile(String path, Charset encoding) throws IOException {
//		path = "../" + path;
		String out = "";

		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    out = sb.toString();
		}

		return out;
	}

	private String distinctNamesQuery (String methodName, String elementName) {
		return "distinct-values(\r\n" +
				"  let $ns := \""+getNamespace()+"\"" +
				"  let $elements := (\r\n" +
				"    for $root in /" + getPrefix() + ":schema\r\n" +
				"    return local:"+methodName+"($root, \""+elementName.replace(getNamespace(), "")+"\", $ns))\r\n" +
				"  for $element in $elements\r\n" +
				"  return\r\n" +
				"    if(exists($element/@name)) then $ns || $element/@name/data()\r\n" +
				"    else $element/@ref/data()\r\n" +
				")";
	}

	@Override
	public void setNamespace(String newNamespace) {
		super.setNamespace(newNamespace);
		for(XmlDatabase db : getXmlDatabases()) {
			db.setNamespace(newNamespace);
		}
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
	 * @generated NOT
	 */
	@Override
	public EList<String> getElementNames() {
		if (elementNames == null) {
			elementNames = new EDataTypeUniqueEList<String>(String.class, this, ExecutionPackage.XML_SCHEMA_DATABASE__ELEMENT_NAMES);
		}

//		if(elementNames.isEmpty()) {
//			try {
//				retrieveElementNames();
//			} catch (QueryIOException | BaseXException | QueryException e) {
//				// do nothing
////				e.printStackTrace();
//			}
//		}

		return elementNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<String> getAttributeNames() {
		if (attributeNames == null) {
			attributeNames = new EDataTypeUniqueEList<String>(String.class, this, ExecutionPackage.XML_SCHEMA_DATABASE__ATTRIBUTE_NAMES);
		}

//		if(attributeNames.isEmpty()) {
//			try {
//				retrieveAttributeNames();
//			} catch (QueryIOException | BaseXException | QueryException e) {
//				// do nothing
////				e.printStackTrace();
//			}
//
//		}

		return attributeNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRootElementNames() {
		if (rootElementNames == null) {
			rootElementNames = new EDataTypeUniqueEList<String>(String.class, this, ExecutionPackage.XML_SCHEMA_DATABASE__ROOT_ELEMENT_NAMES);
		}
		return rootElementNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.XML_SCHEMA_DATABASE__PREFIX, oldPrefix, prefix));
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
			case ExecutionPackage.XML_SCHEMA_DATABASE__ELEMENT_NAMES:
				return getElementNames();
			case ExecutionPackage.XML_SCHEMA_DATABASE__ATTRIBUTE_NAMES:
				return getAttributeNames();
			case ExecutionPackage.XML_SCHEMA_DATABASE__ROOT_ELEMENT_NAMES:
				return getRootElementNames();
			case ExecutionPackage.XML_SCHEMA_DATABASE__PREFIX:
				return getPrefix();
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
			case ExecutionPackage.XML_SCHEMA_DATABASE__ELEMENT_NAMES:
				getElementNames().clear();
				getElementNames().addAll((Collection<? extends String>)newValue);
				return;
			case ExecutionPackage.XML_SCHEMA_DATABASE__ATTRIBUTE_NAMES:
				getAttributeNames().clear();
				getAttributeNames().addAll((Collection<? extends String>)newValue);
				return;
			case ExecutionPackage.XML_SCHEMA_DATABASE__ROOT_ELEMENT_NAMES:
				getRootElementNames().clear();
				getRootElementNames().addAll((Collection<? extends String>)newValue);
				return;
			case ExecutionPackage.XML_SCHEMA_DATABASE__PREFIX:
				setPrefix((String)newValue);
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
			case ExecutionPackage.XML_SCHEMA_DATABASE__ELEMENT_NAMES:
				getElementNames().clear();
				return;
			case ExecutionPackage.XML_SCHEMA_DATABASE__ATTRIBUTE_NAMES:
				getAttributeNames().clear();
				return;
			case ExecutionPackage.XML_SCHEMA_DATABASE__ROOT_ELEMENT_NAMES:
				getRootElementNames().clear();
				return;
			case ExecutionPackage.XML_SCHEMA_DATABASE__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
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
			case ExecutionPackage.XML_SCHEMA_DATABASE__ELEMENT_NAMES:
				return elementNames != null && !elementNames.isEmpty();
			case ExecutionPackage.XML_SCHEMA_DATABASE__ATTRIBUTE_NAMES:
				return attributeNames != null && !attributeNames.isEmpty();
			case ExecutionPackage.XML_SCHEMA_DATABASE__ROOT_ELEMENT_NAMES:
				return rootElementNames != null && !rootElementNames.isEmpty();
			case ExecutionPackage.XML_SCHEMA_DATABASE__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
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
		result.append(", rootElementNames: ");
		result.append(rootElementNames);
		result.append(", prefix: ");
		result.append(prefix);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws QueryException
	 * @throws IOException
	 * @generated NOT
	 */
	@Override
	public boolean checkChildInSchema(String elementName1, String elementName2) throws QueryException, IOException {
		return checkAxis(elementName1, elementName2, "queries/CheckChild.xq", "checkChild");
	}

	private boolean checkAxis(String elementName1, String elementName2, String path, String methodName)
			throws QueryException, IOException {
//		open();

		String checkQuery;
		try {
			checkQuery = readFile(path, StandardCharsets.US_ASCII);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			return true;
		}

		String ns = "declare namespace " + getPrefix() + " = \"http://www.w3.org/2001/XMLSchema\";\n";

		String call = "\nfor $root in /" + getPrefix() + ":schema\r\n" + "return local:" + methodName + "($root, \""
				+ (getNamespace() == null ? elementName1 : elementName1.replace(getNamespace(), "")) + "\", \"" + (getNamespace() == null ? elementName2 : elementName2.replace(getNamespace(), ""))
				+ "\", \"" + getNamespace() + "\")";


		String query = ns + checkQuery.replace("xs:", getPrefix() + ":") + call;

		List<String> queryResult = execute(query);
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
	 * @throws IOException
	 * @generated NOT
	 */
	@Override
	public boolean checkParentInSchema(String elementName1, String elementName2) throws QueryException, IOException {
		return checkChildInSchema(elementName2, elementName1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws QueryException
	 * @throws IOException
	 * @generated NOT
	 */
	@Override
	public boolean checkDescendantInSchema(String elementName1, String elementName2) throws QueryException, IOException {
		return checkAxis(elementName1, elementName2, "queries/CheckDescendant.xq", "checkDescendant");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws QueryException
	 * @throws IOException
	 * @generated NOT
	 */
	@Override
	public boolean checkAncestorInSchema(String elementName1, String elementName2) throws QueryException, IOException {
		return checkDescendantInSchema(elementName2, elementName1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws QueryException
	 * @throws IOException
	 * @generated NOT
	 */
	@Override
	public boolean checkAttributeInSchema(String elementName, String attributeName) throws QueryException, IOException {
		return checkAxis(elementName, attributeName, "queries/CheckAttribute.xq", "checkAttribute");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws IOException
	 * @generated NOT
	 */
	@Override
	public boolean checkFollowingSiblingInSchema(String elementName1, String elementName2) throws QueryException, IOException {
		return checkAxis(elementName1, elementName2, "queries/CheckFollowingSibling.xq", "checkFollowingSibling");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws IOException
	 * @generated NOT
	 */
	@Override
	public boolean checkPrecedingSiblingInSchema(String elementName1, String elementName2) throws QueryException, IOException {
		return checkFollowingSiblingInSchema(elementName2, elementName1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws IOException
	 * @generated NOT
	 */
	@Override
	public boolean checkFollowingInSchema(String elementName1, String elementName2) throws QueryException, IOException {
		return checkAxis(elementName1, elementName2, "queries/CheckFollowing.xq", "checkFollowing");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean checkPrecedingInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException, IOException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unused")
	@Override
	public void checkKeyRefInSchema(String elementName1, String elementName2) {
		// TODO: create/open schema database


		String namespace = "declare namespace " + getPrefix() + " = \"http://www.w3.org/2001/XMLSchema\";\r\n" +
				"";

		/* The following function checks whether there might exist a reference between an element named $n1 and an element named $n2 by analysing the XML schema.
		 * However, there may be false positives.
		 * For reliably checking this, the structural context of both elements must be known.
		 * This is not possible here.
		 * Furthermore, for a precise check the schema analysis would be much more complex.
		 *
		 */

		String checkRefId = "declare function local:checkRefId($r as element(), $n1 as " + getPrefix() + ":string, $n2 as " + getPrefix() + ":string)\r\n" +
				"as " + getPrefix() + ":boolean\r\n" +
				"{\r\n" +
				"some $ref in $r//" + getPrefix() + ":keyref[./" + getPrefix() + ":selector/@xpath = $n1 or matches(./" + getPrefix() + ":selector/@xpath, \"/\" || $n1 || \"$\")] \r\n" +
				"satisfies some $key in $r//" + getPrefix() + ":key[@name = $ref/@refer]\r\n" +
				"satisfies $key/" + getPrefix() + ":selector/@xpath = $n2 or matches($key/" + getPrefix() + ":selector/@xpath, \"/\" || $n2 || \"$\")\r\n" +
				"};";

		String getRefId = "declare function local:getRefId($r as element(), $n1 as " + getPrefix() + ":string, $n2 as " + getPrefix() + ":string)\r\n" +
				"as " + getPrefix() + ":string+\r\n" +
				"{\r\n" +
				"for $ref in $r//" + getPrefix() + ":keyref[./" + getPrefix() + ":selector/@xpath = $n1 or matches(./" + getPrefix() + ":selector/@xpath, \"/\" || $n1 || \"$\")] \r\n" +
				"for $key in $r//" + getPrefix() + ":key[@name = $ref/@refer]\r\n" +
				"where $key/" + getPrefix() + ":selector/@xpath = $n2 or matches($key/" + getPrefix() + ":selector/@xpath, \"/\" || $n2 || \"$\")\r\n" +
				"return ($ref/" + getPrefix() + ":field/@xpath, $key/" + getPrefix() + ":field/@xpath)\r\n" +
				"};";

		String callCheck = "for $x in /" + getPrefix() + ":schema\r\n" +
				"return local:checkRefId($x, \""+elementName1+"\",\""+elementName2+"\")";

		String callGet = "for $x in /" + getPrefix() + ":schema\r\n" +
				"return local:getRefId($x, \""+elementName1+"\",\""+elementName2+"\")";

		// TODO: execute query

		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws IOException
	 * @generated NOT
	 */
	@Override
	public EList<String> getChildrenInSchema(String elementName) throws QueryException, IOException {
		return getElementNamesFromQueryExecution(elementName, "queries/GetChildren.xq", "getChildren");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws IOException
	 * @generated NOT
	 */
	@Override
	public EList<String> getDescendantsInSchema(String elementName) throws QueryException, IOException {
		return getElementNamesFromQueryExecution(elementName, "queries/GetDescendantsEfficient.xq", "getDescendants");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws IOException
	 * @generated NOT
	 */
	@Override
	public EList<String> getParentsInSchema(String elementName) throws QueryException, IOException {
		return getElementNamesFromQueryExecution(elementName, "queries/GetParents.xq", "getDescendants");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws IOException
	 * @generated NOT
	 */
	@Override
	public EList<String> getAncestorsInSchema(String elementName) throws QueryException, IOException {
		return getElementNamesFromQueryExecution(elementName, "queries/GetAncestorsEfficient.xq", "getDescendants");
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
	 * @throws IOException
	 * @generated NOT
	 */
	@Override
	public EList<String> getFollowingSiblingsInSchema(String elementName) throws QueryException, IOException {
		return getElementNamesFromQueryExecution(elementName, "queries/GetFollowingSibling.xq", "getDescendants");
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
	 * @throws IOException
	 * @generated NOT
	 */
	@Override
	public EList<String> getFollowingInSchema(String elementName) throws QueryException, IOException {
		return getElementNamesFromQueryExecution(elementName, "queries/GetFollowing2.xq", "getDescendants");
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



} //XmlSchemaImpl
