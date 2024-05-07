/**
 */
package qualitypatternmodel.adaptionxml.impl;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import org.basex.query.QueryException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.ecore.util.InternalEList;
import org.json.JSONArray;

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.XmlAxisOptionParam;
import qualitypatternmodel.adaptionxml.XmlAxisPart;
import qualitypatternmodel.adaptionxml.XmlAxisPartCondition;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
import qualitypatternmodel.adaptionxml.XmlRoot;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.Database;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.impl.CompletePatternImpl;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;
import qualitypatternmodel.textrepresentation.ParameterReference;
import qualitypatternmodel.textrepresentation.TextrepresentationPackage;
import qualitypatternmodel.utility.ConstantsXml;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Axis Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlAxisPartImpl#getParameterList <em>Parameter List</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlAxisPartImpl#isPredefined <em>Predefined</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlAxisPartImpl#getParameterReferences <em>Parameter References</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlAxisPartImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlAxisPartImpl#getXmlAxisOptionParam <em>Xml Axis Option Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlAxisPartImpl#getXmlPathParam <em>Xml Path Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlAxisPartImpl#getXmlAxisPartConditions <em>Xml Axis Part Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XmlAxisPartImpl extends PatternElementImpl implements XmlAxisPart {

	static String PROPERTY_PART_REGEX = "(((data|text|name)\\(\\))|(@[A-Za-z0-9]+))";
	
	/**
	 * The default value of the '{@link #isPredefined() <em>Predefined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPredefined()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PREDEFINED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPredefined() <em>Predefined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPredefined()
	 * @generated
	 * @ordered
	 */
	protected boolean predefined = PREDEFINED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameterReferences() <em>Parameter References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterReference> parameterReferences;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getXmlAxisOptionParam() <em>Xml Axis Option Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlAxisOptionParam()
	 * @generated
	 * @ordered
	 */
	protected XmlAxisOptionParam xmlAxisOptionParam;

	/**
	 * The cached value of the '{@link #getXmlAxisPartConditions() <em>Xml Axis Part Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlAxisPartConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<XmlAxisPartCondition> xmlAxisPartConditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public XmlAxisPartImpl() {
		super();
	}
	
	@Override
	public String generateXQuery() throws InvalidityException {
		String query = getXmlAxisOptionParam().generateXQuery();
		for (XmlAxisPartCondition cond: getXmlAxisPartConditions())
			query = query + cond.generateXQuery();
		return query;
	}
	
	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (abstractionLevel.getValue() < AbstractionLevel.SEMI_ABSTRACT_VALUE)
			throw new InvalidityException("non-generic class in generic pattern");
		super.isValid(abstractionLevel);
//		if (textLiteralParam != null) 
//			textLiteralParam.isValid(abstractionLevel);
		if (xmlAxisOptionParam != null) 
			xmlAxisOptionParam.isValid(abstractionLevel);
	}
	
	
	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
//		if (textLiteralParam == null) {
//			throw new InvalidityException("textLiteralParam null");
//		}
		if (xmlAxisOptionParam == null && abstractionLevel.equals(AbstractionLevel.CONCRETE)) {
			throw new InvalidityException("axisOptionParam null");
		}
	}
	
	@Override
	public EList<Parameter> getAllParameters() throws InvalidityException {
		EList<Parameter> res = new BasicEList<Parameter>();
		for (XmlAxisPartCondition con : getXmlAxisPartConditions())
			res.addAll(con.getAllParameters());
//		if (textLiteralParam != null) {
//			res.add(textLiteralParam);
//		}
		if (xmlAxisOptionParam != null) {
			res.add(xmlAxisOptionParam);
		}
		return res;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionxmlPackage.Literals.XML_AXIS_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterList getParameterList() {
		if (eContainerFeatureID() != AdaptionxmlPackage.XML_AXIS_PART__PARAMETER_LIST) return null;
		return (ParameterList)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterList(ParameterList newParameterList, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParameterList, AdaptionxmlPackage.XML_AXIS_PART__PARAMETER_LIST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterList(ParameterList newParameterList) {
		if (newParameterList != eInternalContainer() || (eContainerFeatureID() != AdaptionxmlPackage.XML_AXIS_PART__PARAMETER_LIST && newParameterList != null)) {
			if (EcoreUtil.isAncestor(this, newParameterList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParameterList != null)
				msgs = ((InternalEObject)newParameterList).eInverseAdd(this, ParametersPackage.PARAMETER_LIST__PARAMETERS, ParameterList.class, msgs);
			msgs = basicSetParameterList(newParameterList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_AXIS_PART__PARAMETER_LIST, newParameterList, newParameterList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPredefined() {
		return predefined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPredefined(boolean newPredefined) {
		boolean oldPredefined = predefined;
		predefined = newPredefined;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_AXIS_PART__PREDEFINED, oldPredefined, predefined));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParameterReference> getParameterReferences() {
		if (parameterReferences == null) {
			parameterReferences = new EObjectWithInverseResolvingEList.ManyInverse<ParameterReference>(ParameterReference.class, this, AdaptionxmlPackage.XML_AXIS_PART__PARAMETER_REFERENCES, TextrepresentationPackage.PARAMETER_REFERENCE__PARAMETER);
		}
		return parameterReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_AXIS_PART__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlAxisOptionParam getXmlAxisOptionParam() {
		return xmlAxisOptionParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXmlAxisOptionParam(XmlAxisOptionParam newXmlAxisOptionParam, NotificationChain msgs) {
		XmlAxisOptionParam oldXmlAxisOptionParam = xmlAxisOptionParam;
		xmlAxisOptionParam = newXmlAxisOptionParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_AXIS_PART__XML_AXIS_OPTION_PARAM, oldXmlAxisOptionParam, newXmlAxisOptionParam);
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
	public void setXmlAxisOptionParam(XmlAxisOptionParam newXmlAxisOptionParam) {
		if (newXmlAxisOptionParam != xmlAxisOptionParam) {
			NotificationChain msgs = null;
			if (xmlAxisOptionParam != null)
				msgs = ((InternalEObject)xmlAxisOptionParam).eInverseRemove(this, AdaptionxmlPackage.XML_AXIS_OPTION_PARAM__XML_AXIS_PART, XmlAxisOptionParam.class, msgs);
			if (newXmlAxisOptionParam != null)
				msgs = ((InternalEObject)newXmlAxisOptionParam).eInverseAdd(this, AdaptionxmlPackage.XML_AXIS_OPTION_PARAM__XML_AXIS_PART, XmlAxisOptionParam.class, msgs);
			msgs = basicSetXmlAxisOptionParam(newXmlAxisOptionParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_AXIS_PART__XML_AXIS_OPTION_PARAM, newXmlAxisOptionParam, newXmlAxisOptionParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlPathParam getXmlPathParam() {
		if (eContainerFeatureID() != AdaptionxmlPackage.XML_AXIS_PART__XML_PATH_PARAM) return null;
		return (XmlPathParam)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXmlPathParam(XmlPathParam newXmlPathParam, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newXmlPathParam, AdaptionxmlPackage.XML_AXIS_PART__XML_PATH_PARAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXmlPathParam(XmlPathParam newXmlPathParam) {
		if (newXmlPathParam != eInternalContainer() || (eContainerFeatureID() != AdaptionxmlPackage.XML_AXIS_PART__XML_PATH_PARAM && newXmlPathParam != null)) {
			if (EcoreUtil.isAncestor(this, newXmlPathParam))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newXmlPathParam != null)
				msgs = ((InternalEObject)newXmlPathParam).eInverseAdd(this, AdaptionxmlPackage.XML_PATH_PARAM__XML_AXIS_PARTS, XmlPathParam.class, msgs);
			msgs = basicSetXmlPathParam(newXmlPathParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_AXIS_PART__XML_PATH_PARAM, newXmlPathParam, newXmlPathParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XmlAxisPartCondition> getXmlAxisPartConditions() {
		if (xmlAxisPartConditions == null) {
			xmlAxisPartConditions = new EObjectContainmentWithInverseEList<XmlAxisPartCondition>(XmlAxisPartCondition.class, this, AdaptionxmlPackage.XML_AXIS_PART__XML_AXIS_PART_CONDITIONS, AdaptionxmlPackage.XML_AXIS_PART_CONDITION__XML_AXIS_PART);
		}
		return xmlAxisPartConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<XmlAxisPart> getNextXmlAxisPairs() {
		int index = getXmlPathParam().getXmlAxisParts().indexOf(this);
		EList<XmlAxisPart> xmlAxisParts = new BasicEList<XmlAxisPart>();
		if(index < getXmlPathParam().getXmlAxisParts().size()-1) {
			xmlAxisParts.add(getXmlPathParam().getXmlAxisParts().get(index+1));
		} else if(getXmlPathParam().getXmlPropertyOptionParam() == null && getXmlPathParam().getXmlNavigation() instanceof XmlElementNavigation) {
			XmlElement element = (XmlElement) getXmlPathParam().getXmlNavigation().getTarget();			
			for(Relation r : element.getOutgoing()) {
				if(r instanceof XmlElementNavigation) {
					XmlElementNavigation nav = (XmlElementNavigation) r;
					xmlAxisParts.add(nav.getXmlPathParam().getXmlAxisParts().get(0));
				}
				if(r instanceof XmlPropertyNavigation) {
					XmlPropertyNavigation nav = (XmlPropertyNavigation) r;
					EList<XmlAxisPart> pairs = nav.getXmlPathParam().getXmlAxisParts();
					if (pairs.size() > 0)
						xmlAxisParts.add(pairs.get(0));
				}
			}
		}
		return xmlAxisParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<XmlAxisPart> getPreviousXmlAxisPairs() {
		int index = getXmlPathParam().getXmlAxisParts().indexOf(this);
		EList<XmlAxisPart> xmlAxisParts = new BasicEList<XmlAxisPart>();
		if(index > 0) {
			xmlAxisParts.add(getXmlPathParam().getXmlAxisParts().get(index-1));
		} else if(index == 0 && getXmlPathParam().getXmlNavigation() != null && getXmlPathParam().getXmlNavigation().getSource() != null) {
			if(getXmlPathParam().getXmlNavigation().getSource() instanceof XmlElement) {
				for(Relation r : getXmlPathParam().getXmlNavigation().getSource().getIncoming()) {
					if(r instanceof XmlNavigation) {
						XmlNavigation nav = (XmlNavigation) r;
						xmlAxisParts.add(nav.getXmlPathParam().getXmlAxisParts().get(nav.getXmlPathParam().getXmlAxisParts().size()-1));
					}
				}						
			} 
		}		
		return xmlAxisParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<String> inferElementTagSuggestions() {
		EList<String> suggestions = new BasicEList<String>();
		
		EList<String> suggestionsFromIncoming = inferElementTagSuggestionsFromIncomingRelations();
		if(suggestions.isEmpty() || suggestionsFromIncoming.isEmpty()) {
			suggestions.addAll(suggestionsFromIncoming);
		} else {
			suggestions.retainAll(suggestionsFromIncoming);
		}		
		
		EList<String> suggestionsFromOutgoing = inferElementTagSuggestionsFromOutgoingRelations();		
		if(suggestions.isEmpty() || suggestionsFromOutgoing.isEmpty()) {
			suggestions.addAll(suggestionsFromOutgoing);
		} else {
			suggestions.retainAll(suggestionsFromOutgoing);
		}
				
		return suggestions;			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<String> inferElementTagSuggestionsFromOutgoingRelations() {
		EList<String> suggestions = new BasicEList<String>();
//		EList<XmlAxisPart> nextAxisPairs = getNextXmlAxisPairs();
//		for(XmlAxisPart next : nextAxisPairs) {		
//			if(next != null && next.getXmlAxisOptionParam() != null && next.getXmlAxisOptionParam().getValue() != null
//					&& next.getTextLiteralParam() != null && next.getTextLiteralParam().getValue() != null) {
//	
//				XmlAxisKind axis = next.getXmlAxisOptionParam().getValue();
//				String nextTag = null;			
//				
//				if(next.getTextLiteralParam().getValue().equals("") || next.getTextLiteralParam().getValue().equals("*")) {
//					boolean nextIsLast = next.getXmlPathParam().getXmlAxisParts().get(next.getXmlPathParam().getXmlAxisParts().size()-1).equals(next);
//					if(nextIsLast && getXmlPathParam().getXmlNavigation() != null && getXmlPathParam().getXmlNavigation().getTarget() instanceof XmlElement) {
//						XmlElement xmlElement = (XmlElement) getXmlPathParam().getXmlNavigation().getTarget();
//						nextTag = xmlElement.getTagFromComparisons();					
//					}
//				} else {
//					nextTag = next.getTextLiteralParam().getValue();
//				}
//				if(nextTag != null) {
//					try {			
//						Database db = ((CompletePattern) getAncestor(CompletePatternImpl.class)).getDatabase();
//						if (db instanceof XmlDataDatabase) {
//							XmlDataDatabase xmlDataDatabase = (XmlDataDatabase) db;
//							
//							EList<String> nextSuggestions = xmlDataDatabase.getSuggestionsFromAxisNextTag(axis, nextTag);
//							
//							if(suggestions.isEmpty() || nextSuggestions.isEmpty()) {
//								suggestions.addAll(nextSuggestions);
//							} else {
//								suggestions.retainAll(nextSuggestions);						
//							}
//						}
//					} catch (MissingPatternContainerException | QueryException | IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();				
//					}
//				}
//			}		
//		}
		return suggestions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public XmlAxisOptionParam setAxisOption(XmlAxisKind axis) {
		if (getXmlAxisOptionParam() == null)
			setXmlAxisOptionParam(new XmlAxisOptionParamImpl());
		getXmlAxisOptionParam().setValue(axis);
		return getXmlAxisOptionParam();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public XmlAxisPartCondition addAxisCondition(XmlPropertyKind propertyKind, String value) {
		XmlAxisPartCondition cond = new XmlAxisPartConditionImpl();
		if (cond.getXmlPropertyOption() == null)
			cond.setXmlPropertyOption(new XmlPropertyOptionParamImpl());
		cond.getXmlPropertyOption().setValue(propertyKind);
		if (value == null) 
			cond.setTextLiteralParam(null);
		else {
			if (cond.getTextLiteralParam() == null)
				cond.setTextLiteralParam(new TextLiteralParamImpl());
			cond.getTextLiteralParam().setValue(value);
		}
		getXmlAxisPartConditions().add(cond);
		return cond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public XmlAxisPartCondition addAxisCondition(XmlPropertyKind propertyKind) {
		return addAxisCondition(propertyKind, null); 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> validateAgainstSchema() {
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
	public void validateExampleValue(String val) throws InvalidityException {
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
	public boolean inputIsValid() {
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
	public boolean isUsed() {
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
	public void setValueFromString(String value) throws InvalidityException {
		value = value.trim();
		if (value.startsWith("//")) 
			value = "/descendant::" + value.substring(2);
			
		if(getXmlAxisOptionParam() == null)
			setXmlAxisOptionParam(new XmlAxisOptionParamImpl());
		
		Boolean axisdone = false;
		for (XmlAxisKind axis: XmlAxisKind.VALUES) {
			String literal = axis.getLiteral();
			literal = literal.substring(0, literal.length()-1);
			if (value.startsWith(literal)) {
				this.getXmlAxisOptionParam().setValue(axis);
				value = value.replace(literal, "");
				axisdone = true;
				break;
			}
		}
		if (!axisdone) 
			if (value.startsWith("/")) {
				value = value.substring(1);
				this.getXmlAxisOptionParam().setValue(XmlAxisKind.CHILD);
				axisdone = true;
			} else
				throw new InvalidityException("Invalid axis");
		value = value.trim();
		
		String[] split = value.split("(?=\\[)");
		
		for (int i = 0; i < split.length; i++)
			split[i] = split[i].trim();
		
		// nodename
		if (split[0].matches(ConstantsXml.REGEX_NODENAME))
			addAxisCondition(XmlPropertyKind.TAG, split[0]);
		else if (!split[0].equals("*"))
			throw new InvalidityException();
		
		// conditions
		ArrayList<String> conditions = new ArrayList<String>();
		
		String current = "";
		for (int i = 1; i < split.length; i++) {
			current += split[i];
			if (current.equals("[]"))
				current = "";
			else if (current.matches(ConstantsXml.REGEX_CONDITION)) {
				conditions.add(current);
				current = "";
			}			
		}
		if (!current.equals(""))
			throw new InvalidityException();
		for (String condition: conditions) {
			XmlAxisPartConditionImpl cond = new XmlAxisPartConditionImpl();
			cond.setValueFromString(condition);
			getXmlAxisPartConditions().add(cond);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getValueAsString() {
		try {
			return generateXQuery();
		} catch (InvalidityException e) {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void checkComparisonConsistency() throws InvalidityException {
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
	public JSONArray getOptionsAsJsonArray() {
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
	public String generateDescription() {
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
	public EList<String> inferElementTagSuggestionsFromIncomingRelations() {
		if(getXmlAxisOptionParam() == null || getXmlAxisOptionParam().getValue() == null) {
			return new BasicEList<String>();
		}
		XmlAxisKind axis = getXmlAxisOptionParam().getValue();
		
		int index = getXmlPathParam().getXmlAxisParts().indexOf(this);
		
		if (index == 0 && getXmlPathParam().getXmlNavigation() != null && getXmlPathParam().getXmlNavigation().getSource() instanceof XmlRoot) {
			try {
				Database db = ((CompletePattern) getAncestor(CompletePatternImpl.class)).getDatabase();
				if (db instanceof XmlDataDatabase) {
					XmlDataDatabase xmlDataDatabase = (XmlDataDatabase) db;
					return xmlDataDatabase.getSuggestionsFromAxisPreviousRoot(axis);
				}
			} catch (MissingPatternContainerException | QueryException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();					
			}
			
		} else {
			EList<String> suggestions = new BasicEList<String>();
//			EList<XmlAxisPart> previousAxisPairs = getPreviousXmlAxisPairs();
//			for(XmlAxisPart previous : previousAxisPairs) {
//			
//				if(previous != null && previous.getTextLiteralParam() != null && previous.getTextLiteralParam().getValue() != null) {
//					String previousTag = null;
//					if(previous.getTextLiteralParam().getValue().equals("") || previous.getTextLiteralParam().getValue().equals("*")) {
//						boolean previousIsLast = previous.getXmlPathParam().getXmlAxisParts().get(previous.getXmlPathParam().getXmlAxisParts().size()-1).equals(previous);
//						if(previousIsLast && previous.getXmlPathParam().getXmlNavigation() != null && previous.getXmlPathParam().getXmlNavigation().getTarget() instanceof XmlElement) {
//							XmlElement xmlElement = (XmlElement) previous.getXmlPathParam().getXmlNavigation().getTarget();
//							previousTag = xmlElement.getTagFromComparisons();	
//						}					
//					} else {
//						previousTag = previous.getTextLiteralParam().getValue();
//					}
//					
//					if(previousTag != null) {	
//						
//						try {
//							Database db = ((CompletePattern) getAncestor(CompletePatternImpl.class)).getDatabase();
//							if (db instanceof XmlDataDatabase) {
//								XmlDataDatabase xmlDataDatabase = (XmlDataDatabase) db;	
//								EList<String> previousSuggestions = xmlDataDatabase.getSuggestionsFromAxisPreviousTag(axis, previousTag);
//													
//								if(suggestions.isEmpty() || previousSuggestions.isEmpty()) {
//									suggestions.addAll(previousSuggestions);
//								} else {
//									suggestions.retainAll(previousSuggestions);						
//								}
//							}
//						} catch (MissingPatternContainerException | QueryException | IOException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();						
//						}						
//					}
//				}	
//			}
			return suggestions;
		}

		return new BasicEList<String>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<XmlAxisKind> inferAxisSuggestions() {
		EList<XmlAxisKind> suggestions = new BasicEList<XmlAxisKind>();
		
//		if(getTextLiteralParam() == null || getTextLiteralParam().getValue() == null 
//				|| getTextLiteralParam().getValue().equals("") || getTextLiteralParam().getValue().equals("*")) {
//			return suggestions;
//		}
//		
//		String targetTag = getTextLiteralParam().getValue();
//		
//		
//		EList<XmlAxisPart> previousAxisPairs = getPreviousXmlAxisPairs();
//		for (XmlAxisPart previous : previousAxisPairs) {
//			if(previous != null && previous.getTextLiteralParam() != null && previous.getTextLiteralParam().getValue() != null) {
//				String sourceTag = null;
//				if(previous.getTextLiteralParam().getValue().equals("") || previous.getTextLiteralParam().getValue().equals("*")) {
//					boolean previousIsLast = previous.getXmlPathParam().getXmlAxisParts().get(previous.getXmlPathParam().getXmlAxisParts().size()-1).equals(previous);
//					if(previousIsLast && previous.getXmlPathParam().getXmlNavigation() != null && previous.getXmlPathParam().getXmlNavigation().getTarget() instanceof XmlElement) {
//						XmlElement xmlElement = (XmlElement) previous.getXmlPathParam().getXmlNavigation().getTarget();
//						sourceTag = xmlElement.getTagFromComparisons();	
//					}
//				} else {	
//					sourceTag = previous.getTextLiteralParam().getValue();
//				}
//				if(sourceTag != null && targetTag != null) {
//					try {
//						Database db = ((CompletePattern) getAncestor(CompletePatternImpl.class)).getDatabase();
//						if(db instanceof XmlDataDatabase) {
//							XmlDataDatabase xmlDataDatabase = (XmlDataDatabase) db;					
//							EList<XmlAxisKind> newSuggestions = xmlDataDatabase.getSuggestionsFromSourceTargetTag(sourceTag, targetTag);	
//							if(suggestions.isEmpty() || newSuggestions.isEmpty()) {
//								suggestions.addAll(newSuggestions);
//							} else {
//								suggestions.retainAll(newSuggestions);						
//							}
//						}
//					} catch (MissingPatternContainerException | IOException | QueryException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}	
//			}
//		}
		
		return suggestions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeParametersFromParameterList() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	@Override
	public void createParameters() {	
		ParameterList parameterList = getParameterList();		
		if(parameterList != null) {
			if(getXmlAxisOptionParam() == null) {
				setXmlAxisOptionParam(new XmlAxisOptionParamImpl());
			}	
			if(getXmlAxisOptionParam() == null) {
				setXmlAxisOptionParam(new XmlAxisOptionParamImpl());
			}	
		}
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
			case AdaptionxmlPackage.XML_AXIS_PART__PARAMETER_LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParameterList((ParameterList)otherEnd, msgs);
			case AdaptionxmlPackage.XML_AXIS_PART__PARAMETER_REFERENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameterReferences()).basicAdd(otherEnd, msgs);
			case AdaptionxmlPackage.XML_AXIS_PART__XML_AXIS_OPTION_PARAM:
				if (xmlAxisOptionParam != null)
					msgs = ((InternalEObject)xmlAxisOptionParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptionxmlPackage.XML_AXIS_PART__XML_AXIS_OPTION_PARAM, null, msgs);
				return basicSetXmlAxisOptionParam((XmlAxisOptionParam)otherEnd, msgs);
			case AdaptionxmlPackage.XML_AXIS_PART__XML_PATH_PARAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetXmlPathParam((XmlPathParam)otherEnd, msgs);
			case AdaptionxmlPackage.XML_AXIS_PART__XML_AXIS_PART_CONDITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getXmlAxisPartConditions()).basicAdd(otherEnd, msgs);
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
			case AdaptionxmlPackage.XML_AXIS_PART__PARAMETER_LIST:
				return basicSetParameterList(null, msgs);
			case AdaptionxmlPackage.XML_AXIS_PART__PARAMETER_REFERENCES:
				return ((InternalEList<?>)getParameterReferences()).basicRemove(otherEnd, msgs);
			case AdaptionxmlPackage.XML_AXIS_PART__XML_AXIS_OPTION_PARAM:
				return basicSetXmlAxisOptionParam(null, msgs);
			case AdaptionxmlPackage.XML_AXIS_PART__XML_PATH_PARAM:
				return basicSetXmlPathParam(null, msgs);
			case AdaptionxmlPackage.XML_AXIS_PART__XML_AXIS_PART_CONDITIONS:
				return ((InternalEList<?>)getXmlAxisPartConditions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AdaptionxmlPackage.XML_AXIS_PART__PARAMETER_LIST:
				return eInternalContainer().eInverseRemove(this, ParametersPackage.PARAMETER_LIST__PARAMETERS, ParameterList.class, msgs);
			case AdaptionxmlPackage.XML_AXIS_PART__XML_PATH_PARAM:
				return eInternalContainer().eInverseRemove(this, AdaptionxmlPackage.XML_PATH_PARAM__XML_AXIS_PARTS, XmlPathParam.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptionxmlPackage.XML_AXIS_PART__PARAMETER_LIST:
				return getParameterList();
			case AdaptionxmlPackage.XML_AXIS_PART__PREDEFINED:
				return isPredefined();
			case AdaptionxmlPackage.XML_AXIS_PART__PARAMETER_REFERENCES:
				return getParameterReferences();
			case AdaptionxmlPackage.XML_AXIS_PART__DESCRIPTION:
				return getDescription();
			case AdaptionxmlPackage.XML_AXIS_PART__XML_AXIS_OPTION_PARAM:
				return getXmlAxisOptionParam();
			case AdaptionxmlPackage.XML_AXIS_PART__XML_PATH_PARAM:
				return getXmlPathParam();
			case AdaptionxmlPackage.XML_AXIS_PART__XML_AXIS_PART_CONDITIONS:
				return getXmlAxisPartConditions();
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
			case AdaptionxmlPackage.XML_AXIS_PART__PARAMETER_LIST:
				setParameterList((ParameterList)newValue);
				return;
			case AdaptionxmlPackage.XML_AXIS_PART__PREDEFINED:
				setPredefined((Boolean)newValue);
				return;
			case AdaptionxmlPackage.XML_AXIS_PART__PARAMETER_REFERENCES:
				getParameterReferences().clear();
				getParameterReferences().addAll((Collection<? extends ParameterReference>)newValue);
				return;
			case AdaptionxmlPackage.XML_AXIS_PART__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AdaptionxmlPackage.XML_AXIS_PART__XML_AXIS_OPTION_PARAM:
				setXmlAxisOptionParam((XmlAxisOptionParam)newValue);
				return;
			case AdaptionxmlPackage.XML_AXIS_PART__XML_PATH_PARAM:
				setXmlPathParam((XmlPathParam)newValue);
				return;
			case AdaptionxmlPackage.XML_AXIS_PART__XML_AXIS_PART_CONDITIONS:
				getXmlAxisPartConditions().clear();
				getXmlAxisPartConditions().addAll((Collection<? extends XmlAxisPartCondition>)newValue);
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
			case AdaptionxmlPackage.XML_AXIS_PART__PARAMETER_LIST:
				setParameterList((ParameterList)null);
				return;
			case AdaptionxmlPackage.XML_AXIS_PART__PREDEFINED:
				setPredefined(PREDEFINED_EDEFAULT);
				return;
			case AdaptionxmlPackage.XML_AXIS_PART__PARAMETER_REFERENCES:
				getParameterReferences().clear();
				return;
			case AdaptionxmlPackage.XML_AXIS_PART__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AdaptionxmlPackage.XML_AXIS_PART__XML_AXIS_OPTION_PARAM:
				setXmlAxisOptionParam((XmlAxisOptionParam)null);
				return;
			case AdaptionxmlPackage.XML_AXIS_PART__XML_PATH_PARAM:
				setXmlPathParam((XmlPathParam)null);
				return;
			case AdaptionxmlPackage.XML_AXIS_PART__XML_AXIS_PART_CONDITIONS:
				getXmlAxisPartConditions().clear();
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
			case AdaptionxmlPackage.XML_AXIS_PART__PARAMETER_LIST:
				return getParameterList() != null;
			case AdaptionxmlPackage.XML_AXIS_PART__PREDEFINED:
				return predefined != PREDEFINED_EDEFAULT;
			case AdaptionxmlPackage.XML_AXIS_PART__PARAMETER_REFERENCES:
				return parameterReferences != null && !parameterReferences.isEmpty();
			case AdaptionxmlPackage.XML_AXIS_PART__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AdaptionxmlPackage.XML_AXIS_PART__XML_AXIS_OPTION_PARAM:
				return xmlAxisOptionParam != null;
			case AdaptionxmlPackage.XML_AXIS_PART__XML_PATH_PARAM:
				return getXmlPathParam() != null;
			case AdaptionxmlPackage.XML_AXIS_PART__XML_AXIS_PART_CONDITIONS:
				return xmlAxisPartConditions != null && !xmlAxisPartConditions.isEmpty();
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
		if (baseClass == Parameter.class) {
			switch (derivedFeatureID) {
				case AdaptionxmlPackage.XML_AXIS_PART__PARAMETER_LIST: return ParametersPackage.PARAMETER__PARAMETER_LIST;
				case AdaptionxmlPackage.XML_AXIS_PART__PREDEFINED: return ParametersPackage.PARAMETER__PREDEFINED;
				case AdaptionxmlPackage.XML_AXIS_PART__PARAMETER_REFERENCES: return ParametersPackage.PARAMETER__PARAMETER_REFERENCES;
				case AdaptionxmlPackage.XML_AXIS_PART__DESCRIPTION: return ParametersPackage.PARAMETER__DESCRIPTION;
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
		if (baseClass == Parameter.class) {
			switch (baseFeatureID) {
				case ParametersPackage.PARAMETER__PARAMETER_LIST: return AdaptionxmlPackage.XML_AXIS_PART__PARAMETER_LIST;
				case ParametersPackage.PARAMETER__PREDEFINED: return AdaptionxmlPackage.XML_AXIS_PART__PREDEFINED;
				case ParametersPackage.PARAMETER__PARAMETER_REFERENCES: return AdaptionxmlPackage.XML_AXIS_PART__PARAMETER_REFERENCES;
				case ParametersPackage.PARAMETER__DESCRIPTION: return AdaptionxmlPackage.XML_AXIS_PART__DESCRIPTION;
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
		if (baseClass == Parameter.class) {
			switch (baseOperationID) {
				case ParametersPackage.PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP: return AdaptionxmlPackage.XML_AXIS_PART___VALIDATE__DIAGNOSTICCHAIN_MAP;
				case ParametersPackage.PARAMETER___VALIDATE_AGAINST_SCHEMA: return AdaptionxmlPackage.XML_AXIS_PART___VALIDATE_AGAINST_SCHEMA;
				case ParametersPackage.PARAMETER___VALIDATE_EXAMPLE_VALUE__STRING: return AdaptionxmlPackage.XML_AXIS_PART___VALIDATE_EXAMPLE_VALUE__STRING;
				case ParametersPackage.PARAMETER___INPUT_IS_VALID: return AdaptionxmlPackage.XML_AXIS_PART___INPUT_IS_VALID;
				case ParametersPackage.PARAMETER___IS_USED: return AdaptionxmlPackage.XML_AXIS_PART___IS_USED;
				case ParametersPackage.PARAMETER___SET_VALUE_FROM_STRING__STRING: return AdaptionxmlPackage.XML_AXIS_PART___SET_VALUE_FROM_STRING__STRING;
				case ParametersPackage.PARAMETER___GET_VALUE_AS_STRING: return AdaptionxmlPackage.XML_AXIS_PART___GET_VALUE_AS_STRING;
				case ParametersPackage.PARAMETER___CHECK_COMPARISON_CONSISTENCY: return AdaptionxmlPackage.XML_AXIS_PART___CHECK_COMPARISON_CONSISTENCY;
				case ParametersPackage.PARAMETER___GET_OPTIONS_AS_JSON_ARRAY: return AdaptionxmlPackage.XML_AXIS_PART___GET_OPTIONS_AS_JSON_ARRAY;
				case ParametersPackage.PARAMETER___GENERATE_DESCRIPTION: return AdaptionxmlPackage.XML_AXIS_PART___GENERATE_DESCRIPTION;
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
			case AdaptionxmlPackage.XML_AXIS_PART___GET_NEXT_XML_AXIS_PAIRS:
				return getNextXmlAxisPairs();
			case AdaptionxmlPackage.XML_AXIS_PART___GET_PREVIOUS_XML_AXIS_PAIRS:
				return getPreviousXmlAxisPairs();
			case AdaptionxmlPackage.XML_AXIS_PART___INFER_AXIS_SUGGESTIONS:
				return inferAxisSuggestions();
			case AdaptionxmlPackage.XML_AXIS_PART___INFER_ELEMENT_TAG_SUGGESTIONS:
				return inferElementTagSuggestions();
			case AdaptionxmlPackage.XML_AXIS_PART___INFER_ELEMENT_TAG_SUGGESTIONS_FROM_INCOMING_RELATIONS:
				return inferElementTagSuggestionsFromIncomingRelations();
			case AdaptionxmlPackage.XML_AXIS_PART___INFER_ELEMENT_TAG_SUGGESTIONS_FROM_OUTGOING_RELATIONS:
				return inferElementTagSuggestionsFromOutgoingRelations();
			case AdaptionxmlPackage.XML_AXIS_PART___SET_AXIS_OPTION__XMLAXISKIND:
				return setAxisOption((XmlAxisKind)arguments.get(0));
			case AdaptionxmlPackage.XML_AXIS_PART___ADD_AXIS_CONDITION__XMLPROPERTYKIND:
				return addAxisCondition((XmlPropertyKind)arguments.get(0));
			case AdaptionxmlPackage.XML_AXIS_PART___ADD_AXIS_CONDITION__XMLPROPERTYKIND_STRING:
				return addAxisCondition((XmlPropertyKind)arguments.get(0), (String)arguments.get(1));
			case AdaptionxmlPackage.XML_AXIS_PART___VALIDATE_AGAINST_SCHEMA:
				return validateAgainstSchema();
			case AdaptionxmlPackage.XML_AXIS_PART___VALIDATE_EXAMPLE_VALUE__STRING:
				try {
					validateExampleValue((String)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionxmlPackage.XML_AXIS_PART___INPUT_IS_VALID:
				return inputIsValid();
			case AdaptionxmlPackage.XML_AXIS_PART___IS_USED:
				return isUsed();
			case AdaptionxmlPackage.XML_AXIS_PART___SET_VALUE_FROM_STRING__STRING:
				try {
					setValueFromString((String)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionxmlPackage.XML_AXIS_PART___GET_VALUE_AS_STRING:
				return getValueAsString();
			case AdaptionxmlPackage.XML_AXIS_PART___CHECK_COMPARISON_CONSISTENCY:
				try {
					checkComparisonConsistency();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionxmlPackage.XML_AXIS_PART___GET_OPTIONS_AS_JSON_ARRAY:
				return getOptionsAsJsonArray();
			case AdaptionxmlPackage.XML_AXIS_PART___GENERATE_DESCRIPTION:
				return generateDescription();
			case AdaptionxmlPackage.XML_AXIS_PART___CREATE_PARAMETERS:
				createParameters();
				return null;
			case AdaptionxmlPackage.XML_AXIS_PART___REMOVE_PARAMETERS_FROM_PARAMETER_LIST:
				removeParametersFromParameterList();
				return null;
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
		result.append(" (predefined: ");
		result.append(predefined);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

	@Override
	public String myToString() {
		try {
			String result = "[";
			result += getXmlAxisOptionParam().myToString();
			
			for (XmlAxisPartCondition cond : getXmlAxisPartConditions())
				result += cond.myToString();
//			if (getXmlPropertyOption() != null) {
//				result += ", " + getXmlPropertyOption().myToString();
//			} 
//			if (getTextLiteralParam() != null && getTextLiteralParam().getValue() != null)
//				result += ", " + getTextLiteralParam().myToString();
			return result;
		} catch(NullPointerException e) {
			return "[invalid axis pair: no axis" + getInternalId() + "]";
		}
	}

} //AxisPairImpl
