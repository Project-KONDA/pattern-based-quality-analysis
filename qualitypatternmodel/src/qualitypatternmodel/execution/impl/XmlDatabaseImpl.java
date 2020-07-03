/**
 */
package qualitypatternmodel.execution.impl;

import java.lang.reflect.InvocationTargetException;
import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.XQuery;
import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.Result;
import qualitypatternmodel.execution.XmlDatabase;
import qualitypatternmodel.patternstructure.CompletePattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xml Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.execution.impl.XmlDatabaseImpl#getContext <em>Context</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.XmlDatabaseImpl#getElementNames <em>Element Names</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.XmlDatabaseImpl#getAttributeNames <em>Attribute Names</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.XmlDatabaseImpl#getRecordedAttributeValues <em>Recorded Attribute Values</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.XmlDatabaseImpl#getRecordedDataValues <em>Recorded Data Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XmlDatabaseImpl extends DatabaseImpl implements XmlDatabase {
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
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EMap<String, Integer> getElementNames() {
		if (elementNames == null) {
			elementNames = new EcoreEMap<String,Integer>(ExecutionPackage.Literals.STRING_TO_INT_MAP, StringToIntMapImpl.class, this, ExecutionPackage.XML_DATABASE__ELEMENT_NAMES);
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
			attributeNames = new EcoreEMap<String,Integer>(ExecutionPackage.Literals.STRING_TO_INT_MAP, StringToIntMapImpl.class, this, ExecutionPackage.XML_DATABASE__ATTRIBUTE_NAMES);
		}
		return attributeNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, Integer> getRecordedAttributeValues() {
		if (recordedAttributeValues == null) {
			recordedAttributeValues = new EcoreEMap<String,Integer>(ExecutionPackage.Literals.STRING_TO_INT_MAP, StringToIntMapImpl.class, this, ExecutionPackage.XML_DATABASE__RECORDED_ATTRIBUTE_VALUES);
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
			recordedDataValues = new EcoreEMap<String,Integer>(ExecutionPackage.Literals.STRING_TO_INT_MAP, StringToIntMapImpl.class, this, ExecutionPackage.XML_DATABASE__RECORDED_DATA_VALUES);
		}
		return recordedDataValues;
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
	
	private void executeAnalysis(String query, String regex, EMap<String,Integer> valueStorage) throws BaseXException {
		XQuery xquery = new XQuery(query);
		String result = xquery.execute(context);
		String[] split = result.split(regex);
		for(int i = 0; i < split.length; i++) {
			valueStorage.put(split[i],0);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void analyseSchema() throws BaseXException {
		// TODO: create/open schema database
		// TODO: add namespace
		executeAnalysis("//*[name()=\"xsd:element\"]/data(@name)", "\n", getElementNames());
		executeAnalysis("//*[name()=\"xsd:attribute\"]/data(@name)", "\n", getAttributeNames());
	
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
			map.put(value, 0);
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
	public boolean checkChildInSchema(String elementName1, String elementName2) {
		// TODO: create/open schema database
		
		String checkChildComplexType = "declare function local:checkChildComplexType($r as element(), $n2 as xs:string, $cT as element())\r\n" + 
				"as xs:boolean\r\n" + 
				"{\r\n" + 
				"  if($cT/xs:sequence or $cT/xs:choice or $cT/xs:all) then\r\n" + 
				"    exists($cT/*/xs:element[@name = $n2]) or exists($cT/*/xs:element[@ref = $n2])\r\n" + 
				"  else\r\n" + 
				"    some $ext in $cT/xs:complexContent/xs:extension satisfies \r\n" + 
				"      exists($ext/*/xs:element[@name = $n2]) \r\n" + 
				"      or      \r\n" + 
				"      (some $cT2 in $r/xs:complexType[@name = $ext/@base] satisfies\r\n" + 
				"        local:checkChildComplexType($r, $n2, $cT2))        \r\n" + 
				"};";
		
		String checkChild = "declare function local:checkChild($r as element(), $n1 as xs:string, $n2 as xs:string)\r\n" + 
				"as xs:boolean\r\n" + 
				"{\r\n" + 
				"some $e1 in $r//xs:element[@name=$n1] satisfies\r\n" + 
				"  if($e1[@type]) then\r\n" + 
				"    some $cT in $r/xs:complexType[@name = $e1/@type] satisfies \r\n" + 
				"        local:checkChildComplexType($r, $n2, $cT)      \r\n" + 
				"  else\r\n" + 
				"    exists($e1/xs:complexType/*/xs:element[@name = $n2]) or exists($e1/xs:complexType/*/xs:element[@ref = $n2])\r\n" + 
				"  \r\n" + 
				"};";
		
		String call = "for $x in /xs:schema\r\n" + 
				"return local:checkChild($x, \""+elementName1+"\", \""+elementName2+"\")";
		
		// TODO: execute query		
		
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean checkParentInSchema(String elementName1, String elementName2) {
		return checkChildInSchema(elementName2, elementName1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean checkDescendantInSchema(String elementName1, String elementName2) {
		
		// TODO: create/open schema database
		
		String namespace = "declare namespace xsd = \"http://www.w3.org/2001/XMLSchema\";\r\n" + 
				"";
		
		String checkChildComplexType = "declare function local:checkChildComplexType($r as element(), $n2 as xs:string, $cT as element())\r\n" + 
				"as xs:boolean\r\n" + 
				"{\r\n" + 
				"  if($cT/xs:sequence or $cT/xs:choice or $cT/xs:all) then\r\n" + 
				"    exists($cT/*/xs:element[@name = $n2]) or exists($cT/*/xs:element[@ref = $n2])\r\n" + 
				"  else\r\n" + 
				"    some $ext in $cT/xs:complexContent/xs:extension satisfies \r\n" + 
				"      exists($ext/*/xs:element[@name = $n2]) \r\n" + 
				"      or      \r\n" + 
				"      (some $cT2 in $r/xs:complexType[@name = $ext/@base] satisfies\r\n" + 
				"        local:checkChildComplexType($r, $n2, $cT2))        \r\n" + 
				"};";
		
		String checkChild = "declare function local:checkChild($r as element(), $n1 as xs:string, $n2 as xs:string)\r\n" + 
				"as xs:boolean\r\n" + 
				"{\r\n" + 
				"some $e1 in $r//xs:element[@name=$n1] satisfies\r\n" + 
				"  if($e1[@type]) then\r\n" + 
				"    some $cT in $r/xs:complexType[@name = $e1/@type] satisfies \r\n" + 
				"        local:checkChildComplexType($r, $n2, $cT)      \r\n" + 
				"  else\r\n" + 
				"    exists($e1/xs:complexType/*/xs:element[@name = $n2]) or exists($e1/xs:complexType/*/xs:element[@ref = $n2])\r\n" + 
				"  \r\n" + 
				"};";
		
		
		String checkDescendantComplexType = "declare function local:checkDescendantComplexType($r as element(), $n2 as xs:string, $cT as element())\r\n" + 
				"as xs:boolean\r\n" + 
				"{\r\n" + 
				"   if($cT/xs:sequence or $cT/xs:choice or $cT/xs:all) then\r\n" + 
				"     some $child in $cT/*/xs:element satisfies      \r\n" + 
				"      if ($child[@name]) then        \r\n" + 
				"        local:checkDescendant($r,$child/@name,$n2)\r\n" + 
				"      else\r\n" + 
				"        local:checkDescendant($r,$child/@ref,$n2)   \r\n" + 
				"  else\r\n" + 
				"    some $ext in $cT/xs:complexContent/xs:extension satisfies       \r\n" + 
				"      (some $y in $ext/*/xs:element satisfies (local:checkDescendant($r,$y/@name,$n2) or local:checkDescendant($r,$y/@ref,$n2))) \r\n" + 
				"      or        \r\n" + 
				"      (some $cT2 in $r/xs:complexType[@name = $ext/@base]\r\n" + 
				"        satisfies local:checkDescendantComplexType($r, $n2, $cT2))             \r\n" + 
				"};";
		
		String checkDescendant = "declare function local:checkDescendant($r as element(), $n1 as xs:string, $n2 as xs:string)\r\n" + 
				"as xs:boolean\r\n" + 
				"{  \r\n" + 
				"  if(local:checkChild($r,$n1,$n2)) then true()\r\n" + 
				"  else\r\n" + 
				"    some $e1 in $r//xs:element[@name=$n1] satisfies    \r\n" + 
				"      if($e1[@type]) then       \r\n" + 
				"        some $cT in $r/xs:complexType[@name = $e1/@type] satisfies           \r\n" + 
				"            local:checkDescendantComplexType($r, $n2, $cT)            \r\n" + 
				"      else               \r\n" + 
				"        some $child in $e1/xs:complexType/*/xs:element satisfies\r\n" + 
				"          if ($child[@name]) then        \r\n" + 
				"            local:checkDescendant($r,$child/@name,$n2)\r\n" + 
				"          else\r\n" + 
				"            local:checkDescendant($r,$child/@ref,$n2)                \r\n" + 
				"};";
		
		String call = "for $x in /xs:schema\r\n" + 
				"return local:checkDescendant($x, \""+elementName1+"\", \""+elementName2+"\")";
		
		// TODO: execute query	
		
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean checkAncestorInSchema(String elementName1, String elementName2) {
		return checkDescendantInSchema(elementName2, elementName1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean checkAttributeInSchema(String elementName, String attributeName) {
		String checkAttributeComplexType = "declare function local:checkAttributeComplexType($r as element(), $attributeName as xs:string, $cT as element())\r\n" + 
				"as xs:boolean\r\n" + 
				"{\r\n" + 
				"  if($cT/xs:sequence or $cT/xs:choice or $cT/xs:all) then\r\n" + 
				"    exists($cT/xs:attribute[@name = $attributeName])\r\n" + 
				"    or exists($cT/xs:attribute[@ref = $attributeName])\r\n" + 
				"  else\r\n" + 
				"    some $ext in $cT/xs:complexContent/xs:extension satisfies \r\n" + 
				"      exists($ext/xs:attribute[@name = $attributeName])\r\n" + 
				"      or      \r\n" + 
				"      (some $cT2 in $r/xs:complexType[@name = $ext/@base] satisfies\r\n" + 
				"        local:checkAttributeComplexType($r, $attributeName, $cT2))         \r\n" + 
				"};";
		
		String checkAttribute = "declare function local:checkAttribute($r as element(), $elementName as xs:string, $attributeName as xs:string)\r\n" + 
				"as xs:boolean\r\n" + 
				"{\r\n" + 
				"some $e1 in $r//xs:element[@name=$elementName] satisfies\r\n" + 
				"  if($e1[@type]) then\r\n" + 
				"    some $cT in $r/xs:complexType[@name = $e1/@type] satisfies \r\n" + 
				"        local:checkAttributeComplexType($r, $attributeName, $cT)      \r\n" + 
				"  else   \r\n" + 
				"      exists($e1/xs:complexType/xs:attribute[@name = $attributeName])  \r\n" + 
				"      or exists($e1/xs:complexType/xs:attribute[@ref = $attributeName])\r\n" + 
				"};";
		
		String call = "for $x in /xs:schema\r\n" + 
				"return local:checkAttribute($x, \""+elementName+"\", \""+attributeName+"\")";
		
		// TODO: execute query	
		
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
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutionPackage.XML_DATABASE__ELEMENT_NAMES:
				return ((InternalEList<?>)getElementNames()).basicRemove(otherEnd, msgs);
			case ExecutionPackage.XML_DATABASE__ATTRIBUTE_NAMES:
				return ((InternalEList<?>)getAttributeNames()).basicRemove(otherEnd, msgs);
			case ExecutionPackage.XML_DATABASE__RECORDED_ATTRIBUTE_VALUES:
				return ((InternalEList<?>)getRecordedAttributeValues()).basicRemove(otherEnd, msgs);
			case ExecutionPackage.XML_DATABASE__RECORDED_DATA_VALUES:
				return ((InternalEList<?>)getRecordedDataValues()).basicRemove(otherEnd, msgs);
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
			case ExecutionPackage.XML_DATABASE__CONTEXT:
				return getContext();
			case ExecutionPackage.XML_DATABASE__ELEMENT_NAMES:
				if (coreType) return getElementNames();
				else return getElementNames().map();
			case ExecutionPackage.XML_DATABASE__ATTRIBUTE_NAMES:
				if (coreType) return getAttributeNames();
				else return getAttributeNames().map();
			case ExecutionPackage.XML_DATABASE__RECORDED_ATTRIBUTE_VALUES:
				if (coreType) return getRecordedAttributeValues();
				else return getRecordedAttributeValues().map();
			case ExecutionPackage.XML_DATABASE__RECORDED_DATA_VALUES:
				if (coreType) return getRecordedDataValues();
				else return getRecordedDataValues().map();
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
			case ExecutionPackage.XML_DATABASE__CONTEXT:
				setContext((Context)newValue);
				return;
			case ExecutionPackage.XML_DATABASE__ELEMENT_NAMES:
				((EStructuralFeature.Setting)getElementNames()).set(newValue);
				return;
			case ExecutionPackage.XML_DATABASE__ATTRIBUTE_NAMES:
				((EStructuralFeature.Setting)getAttributeNames()).set(newValue);
				return;
			case ExecutionPackage.XML_DATABASE__RECORDED_ATTRIBUTE_VALUES:
				((EStructuralFeature.Setting)getRecordedAttributeValues()).set(newValue);
				return;
			case ExecutionPackage.XML_DATABASE__RECORDED_DATA_VALUES:
				((EStructuralFeature.Setting)getRecordedDataValues()).set(newValue);
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
			case ExecutionPackage.XML_DATABASE__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
				return;
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
			case ExecutionPackage.XML_DATABASE__CONTEXT:
				return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
			case ExecutionPackage.XML_DATABASE__ELEMENT_NAMES:
				return elementNames != null && !elementNames.isEmpty();
			case ExecutionPackage.XML_DATABASE__ATTRIBUTE_NAMES:
				return attributeNames != null && !attributeNames.isEmpty();
			case ExecutionPackage.XML_DATABASE__RECORDED_ATTRIBUTE_VALUES:
				return recordedAttributeValues != null && !recordedAttributeValues.isEmpty();
			case ExecutionPackage.XML_DATABASE__RECORDED_DATA_VALUES:
				return recordedDataValues != null && !recordedDataValues.isEmpty();
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
			case ExecutionPackage.XML_DATABASE___RECORD_ATTRIBUTE_VALUE__STRING:
				recordAttributeValue((String)arguments.get(0));
				return null;
			case ExecutionPackage.XML_DATABASE___RECORD_DATA_VALUE__STRING:
				recordDataValue((String)arguments.get(0));
				return null;
			case ExecutionPackage.XML_DATABASE___REMOVE_ATTRIBUTE_VALUE__STRING:
				removeAttributeValue((String)arguments.get(0));
				return null;
			case ExecutionPackage.XML_DATABASE___REMOVE_DATA_VALUE__STRING:
				removeDataValue((String)arguments.get(0));
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
			case ExecutionPackage.XML_DATABASE___RECORD_ELEMENT_NAME__STRING:
				recordElementName((String)arguments.get(0));
				return null;
			case ExecutionPackage.XML_DATABASE___RECORD_ATTRIBUTE_NAME__STRING:
				recordAttributeName((String)arguments.get(0));
				return null;
			case ExecutionPackage.XML_DATABASE___REMOVE_ELEMENT_NAME__STRING:
				removeElementName((String)arguments.get(0));
				return null;
			case ExecutionPackage.XML_DATABASE___REMOVE_ATTRIBUTE_NAME__STRING:
				removeAttributeName((String)arguments.get(0));
				return null;
			case ExecutionPackage.XML_DATABASE___CHECK_KEY_REF_IN_SCHEMA__STRING_STRING:
				checkKeyRefInSchema((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case ExecutionPackage.XML_DATABASE___CHECK_CHILD_IN_SCHEMA__STRING_STRING:
				return checkChildInSchema((String)arguments.get(0), (String)arguments.get(1));
			case ExecutionPackage.XML_DATABASE___CHECK_PARENT_IN_SCHEMA__STRING_STRING:
				return checkParentInSchema((String)arguments.get(0), (String)arguments.get(1));
			case ExecutionPackage.XML_DATABASE___CHECK_DESCENDANT_IN_SCHEMA__STRING_STRING:
				return checkDescendantInSchema((String)arguments.get(0), (String)arguments.get(1));
			case ExecutionPackage.XML_DATABASE___CHECK_ANCESTOR_IN_SCHEMA__STRING_STRING:
				return checkAncestorInSchema((String)arguments.get(0), (String)arguments.get(1));
			case ExecutionPackage.XML_DATABASE___CHECK_ATTRIBUTE_IN_SCHEMA__STRING_STRING:
				return checkAttributeInSchema((String)arguments.get(0), (String)arguments.get(1));
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
