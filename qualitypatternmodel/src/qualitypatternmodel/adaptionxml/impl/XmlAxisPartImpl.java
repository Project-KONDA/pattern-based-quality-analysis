/**
 */
package qualitypatternmodel.adaptionxml.impl;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import org.basex.query.QueryException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.pivot.internal.ParameterImpl;

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.XmlAxisOptionParam;
import qualitypatternmodel.adaptionxml.XmlAxisPart;
import qualitypatternmodel.adaptionxml.XmlPathParam;
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
import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.impl.CompletePatternImpl;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Axis Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlAxisPartImpl#getTextLiteralParam <em>Text Literal Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlAxisPartImpl#getXmlAxisOptionParam <em>Xml Axis Option Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlAxisPartImpl#getXmlPathParam <em>Xml Path Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XmlAxisPartImpl extends ParameterImpl implements XmlAxisPart {
	/**
	 * The cached value of the '{@link #getTextLiteralParam() <em>Text Literal Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextLiteralParam()
	 * @generated
	 * @ordered
	 */
	protected TextLiteralParam textLiteralParam;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmlAxisPartImpl() {
		super();
	}
	
	@Override
	public String generateXQuery() throws InvalidityException {
		String query = getXmlAxisOptionParam().generateXQuery();
		if (getTextLiteralParam() != null) {
			String literal = getTextLiteralParam().generateXQuery();
			if ( !(literal.equals("\"\"")) && !(literal.equals("\"*\""))) {
				query += "[name()=" + literal + "]";
			}
		}
		return query; 
	}
	
	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (abstractionLevel.getValue() < AbstractionLevel.SEMI_ABSTRACT_VALUE)
			throw new InvalidityException("non-generic class in generic pattern");
		super.isValid(abstractionLevel);
		if (textLiteralParam != null) 
			textLiteralParam.isValid(abstractionLevel);
		if (xmlAxisOptionParam != null) 
			xmlAxisOptionParam.isValid(abstractionLevel);
	}
	
	
	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
//		if (textLiteralParam == null) {
//			throw new InvalidityException("textLiteralParam null");
//		}
		if (xmlAxisOptionParam == null) {
			throw new InvalidityException("axisOptionParam null");
		}
		
	}
	
	@Override
	public EList<Parameter> getAllParameters() throws InvalidityException {
		EList<Parameter> res = new BasicEList<Parameter>();		
		if (textLiteralParam != null) {
			res.add(textLiteralParam);
		}
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
		return AdaptionxmlPackage.Literals.XML_AXIS_PAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextLiteralParam getTextLiteralParam() {
		return textLiteralParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextLiteralParam(TextLiteralParam newTextLiteralParam, NotificationChain msgs) {
		TextLiteralParam oldTextLiteralParam = textLiteralParam;
		textLiteralParam = newTextLiteralParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_AXIS_PAIR__TEXT_LITERAL_PARAM, oldTextLiteralParam, newTextLiteralParam);
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
	public void setTextLiteralParam(TextLiteralParam newTextLiteralParam) {
		if (newTextLiteralParam != textLiteralParam) {
			NotificationChain msgs = null;
			if (textLiteralParam != null)
				msgs = ((InternalEObject)textLiteralParam).eInverseRemove(this, ParametersPackage.TEXT_LITERAL_PARAM__XML_AXIS_PAIR, TextLiteralParam.class, msgs);
			if (newTextLiteralParam != null)
				msgs = ((InternalEObject)newTextLiteralParam).eInverseAdd(this, ParametersPackage.TEXT_LITERAL_PARAM__XML_AXIS_PAIR, TextLiteralParam.class, msgs);
			msgs = basicSetTextLiteralParam(newTextLiteralParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_AXIS_PAIR__TEXT_LITERAL_PARAM, newTextLiteralParam, newTextLiteralParam));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_AXIS_PAIR__XML_AXIS_OPTION_PARAM, oldXmlAxisOptionParam, newXmlAxisOptionParam);
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
				msgs = ((InternalEObject)xmlAxisOptionParam).eInverseRemove(this, AdaptionxmlPackage.XML_AXIS_OPTION_PARAM__XML_AXIS_PAIR, XmlAxisOptionParam.class, msgs);
			if (newXmlAxisOptionParam != null)
				msgs = ((InternalEObject)newXmlAxisOptionParam).eInverseAdd(this, AdaptionxmlPackage.XML_AXIS_OPTION_PARAM__XML_AXIS_PAIR, XmlAxisOptionParam.class, msgs);
			msgs = basicSetXmlAxisOptionParam(newXmlAxisOptionParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_AXIS_PAIR__XML_AXIS_OPTION_PARAM, newXmlAxisOptionParam, newXmlAxisOptionParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlPathParam getXmlPathParam() {
		if (eContainerFeatureID() != AdaptionxmlPackage.XML_AXIS_PAIR__XML_PATH_PARAM) return null;
		return (XmlPathParam)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetXmlPathParam(XmlPathParam newXmlPathParam, NotificationChain msgs) {		
		if(getXmlAxisOptionParam() == null) {
			XmlAxisOptionParam axisOptionparam = new XmlAxisOptionParamImpl();
			setXmlAxisOptionParam(axisOptionparam);
		}
		if(getTextLiteralParam() == null) {
			TextLiteralParam text = new TextLiteralParamImpl();
			setTextLiteralParam(text);
		}
		msgs = eBasicSetContainer((InternalEObject)newXmlPathParam, AdaptionxmlPackage.XML_AXIS_PAIR__XML_PATH_PARAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXmlPathParam(XmlPathParam newXmlPathParam) {
		if (newXmlPathParam != eInternalContainer() || (eContainerFeatureID() != AdaptionxmlPackage.XML_AXIS_PAIR__XML_PATH_PARAM && newXmlPathParam != null)) {
			if (EcoreUtil.isAncestor(this, newXmlPathParam))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newXmlPathParam != null)
				msgs = ((InternalEObject)newXmlPathParam).eInverseAdd(this, AdaptionxmlPackage.XML_PATH_PARAM__XML_AXIS_PAIRS, XmlPathParam.class, msgs);
			msgs = basicSetXmlPathParam(newXmlPathParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_AXIS_PAIR__XML_PATH_PARAM, newXmlPathParam, newXmlPathParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<XmlAxisPart> getNextXmlAxisPairs() {
		int index = getXmlPathParam().getXmlAxisPairs().indexOf(this);
		EList<XmlAxisPart> xmlAxisPairs = new BasicEList<XmlAxisPart>();
		if(index < getXmlPathParam().getXmlAxisPairs().size()-1) {
			xmlAxisPairs.add(getXmlPathParam().getXmlAxisPairs().get(index+1));
		} else if(getXmlPathParam().getXmlPropertyOptionParam() == null && getXmlPathParam().getXmlNavigation() instanceof XmlElementNavigation) {
			XmlElement element = (XmlElement) getXmlPathParam().getXmlNavigation().getTarget();			
			for(Relation r : element.getOutgoing()) {
				if(r instanceof XmlElementNavigation) {
					XmlElementNavigation nav = (XmlElementNavigation) r;
					xmlAxisPairs.add(nav.getXmlPathParam().getXmlAxisPairs().get(0));
				}
				if(r instanceof XmlPropertyNavigation) {
					XmlPropertyNavigation nav = (XmlPropertyNavigation) r;
					EList<XmlAxisPart> pairs = nav.getXmlPathParam().getXmlAxisPairs();
					if (pairs.size() > 0)
						xmlAxisPairs.add(pairs.get(0));
				}
			}
		}
		return xmlAxisPairs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<XmlAxisPart> getPreviousXmlAxisPairs() {
		int index = getXmlPathParam().getXmlAxisPairs().indexOf(this);
		EList<XmlAxisPart> xmlAxisPairs = new BasicEList<XmlAxisPart>();
		if(index > 0) {
			xmlAxisPairs.add(getXmlPathParam().getXmlAxisPairs().get(index-1));
		} else if(index == 0 && getXmlPathParam().getXmlNavigation() != null && getXmlPathParam().getXmlNavigation().getSource() != null) {
			if(getXmlPathParam().getXmlNavigation().getSource() instanceof XmlElement) {
				for(Relation r : getXmlPathParam().getXmlNavigation().getSource().getIncoming()) {
					if(r instanceof XmlNavigation) {
						XmlNavigation nav = (XmlNavigation) r;
						xmlAxisPairs.add(nav.getXmlPathParam().getXmlAxisPairs().get(nav.getXmlPathParam().getXmlAxisPairs().size()-1));
					}
				}						
			} 
		}		
		return xmlAxisPairs;
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
		EList<XmlAxisPart> nextAxisPairs = getNextXmlAxisPairs();
		for(XmlAxisPart next : nextAxisPairs) {		
			if(next != null && next.getXmlAxisOptionParam() != null && next.getXmlAxisOptionParam().getValue() != null
					&& next.getTextLiteralParam() != null && next.getTextLiteralParam().getValue() != null) {
	
				XmlAxisKind axis = next.getXmlAxisOptionParam().getValue();
				String nextTag = null;			
				
				if(next.getTextLiteralParam().getValue().equals("") || next.getTextLiteralParam().getValue().equals("*")) {
					boolean nextIsLast = next.getXmlPathParam().getXmlAxisPairs().get(next.getXmlPathParam().getXmlAxisPairs().size()-1).equals(next);
					if(nextIsLast && getXmlPathParam().getXmlNavigation() != null && getXmlPathParam().getXmlNavigation().getTarget() instanceof XmlElement) {
						XmlElement xmlElement = (XmlElement) getXmlPathParam().getXmlNavigation().getTarget();
						nextTag = xmlElement.getTagFromComparisons();					
					}
				} else {
					nextTag = next.getTextLiteralParam().getValue();
				}
				if(nextTag != null) {
					try {			
						Database db = ((CompletePattern) getAncestor(CompletePatternImpl.class)).getDatabase();
						if (db instanceof XmlDataDatabase) {
							XmlDataDatabase xmlDataDatabase = (XmlDataDatabase) db;
							
							EList<String> nextSuggestions = xmlDataDatabase.getSuggestionsFromAxisNextTag(axis, nextTag);
							
							if(suggestions.isEmpty() || nextSuggestions.isEmpty()) {
								suggestions.addAll(nextSuggestions);
							} else {
								suggestions.retainAll(nextSuggestions);						
							}
						}
					} catch (MissingPatternContainerException | QueryException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();				
					}
				}
			}		
		}
		return suggestions;
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
		
		int index = getXmlPathParam().getXmlAxisPairs().indexOf(this);
		
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
			EList<XmlAxisPart> previousAxisPairs = getPreviousXmlAxisPairs();
			for(XmlAxisPart previous : previousAxisPairs) {
			
				if(previous != null && previous.getTextLiteralParam() != null && previous.getTextLiteralParam().getValue() != null) {
					String previousTag = null;
					if(previous.getTextLiteralParam().getValue().equals("") || previous.getTextLiteralParam().getValue().equals("*")) {
						boolean previousIsLast = previous.getXmlPathParam().getXmlAxisPairs().get(previous.getXmlPathParam().getXmlAxisPairs().size()-1).equals(previous);
						if(previousIsLast && previous.getXmlPathParam().getXmlNavigation() != null && previous.getXmlPathParam().getXmlNavigation().getTarget() instanceof XmlElement) {
							XmlElement xmlElement = (XmlElement) previous.getXmlPathParam().getXmlNavigation().getTarget();
							previousTag = xmlElement.getTagFromComparisons();	
						}					
					} else {
						previousTag = previous.getTextLiteralParam().getValue();
					}
					
					if(previousTag != null) {	
						
						try {
							Database db = ((CompletePattern) getAncestor(CompletePatternImpl.class)).getDatabase();
							if (db instanceof XmlDataDatabase) {
								XmlDataDatabase xmlDataDatabase = (XmlDataDatabase) db;	
								EList<String> previousSuggestions = xmlDataDatabase.getSuggestionsFromAxisPreviousTag(axis, previousTag);
													
								if(suggestions.isEmpty() || previousSuggestions.isEmpty()) {
									suggestions.addAll(previousSuggestions);
								} else {
									suggestions.retainAll(previousSuggestions);						
								}
							}
						} catch (MissingPatternContainerException | QueryException | IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();						
						}						
					}
				}	
			}
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
		
		if(getTextLiteralParam() == null || getTextLiteralParam().getValue() == null 
				|| getTextLiteralParam().getValue().equals("") || getTextLiteralParam().getValue().equals("*")) {
			return suggestions;
		}
		
		String targetTag = getTextLiteralParam().getValue();
		
		
		EList<XmlAxisPart> previousAxisPairs = getPreviousXmlAxisPairs();
		for (XmlAxisPart previous : previousAxisPairs) {
			if(previous != null && previous.getTextLiteralParam() != null && previous.getTextLiteralParam().getValue() != null) {
				String sourceTag = null;
				if(previous.getTextLiteralParam().getValue().equals("") || previous.getTextLiteralParam().getValue().equals("*")) {
					boolean previousIsLast = previous.getXmlPathParam().getXmlAxisPairs().get(previous.getXmlPathParam().getXmlAxisPairs().size()-1).equals(previous);
					if(previousIsLast && previous.getXmlPathParam().getXmlNavigation() != null && previous.getXmlPathParam().getXmlNavigation().getTarget() instanceof XmlElement) {
						XmlElement xmlElement = (XmlElement) previous.getXmlPathParam().getXmlNavigation().getTarget();
						sourceTag = xmlElement.getTagFromComparisons();	
					}
				} else {	
					sourceTag = previous.getTextLiteralParam().getValue();
				}
				if(sourceTag != null && targetTag != null) {
					try {
						Database db = ((CompletePattern) getAncestor(CompletePatternImpl.class)).getDatabase();
						if(db instanceof XmlDataDatabase) {
							XmlDataDatabase xmlDataDatabase = (XmlDataDatabase) db;					
							EList<XmlAxisKind> newSuggestions = xmlDataDatabase.getSuggestionsFromSourceTargetTag(sourceTag, targetTag);	
							if(suggestions.isEmpty() || newSuggestions.isEmpty()) {
								suggestions.addAll(newSuggestions);
							} else {
								suggestions.retainAll(newSuggestions);						
							}
						}
					} catch (MissingPatternContainerException | IOException | QueryException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}	
			}
		}
		
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
				XmlAxisOptionParam axis = new XmlAxisOptionParamImpl();
				setXmlAxisOptionParam(axis);
			}	
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionxmlPackage.XML_AXIS_PAIR__TEXT_LITERAL_PARAM:
				if (textLiteralParam != null)
					msgs = ((InternalEObject)textLiteralParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptionxmlPackage.XML_AXIS_PAIR__TEXT_LITERAL_PARAM, null, msgs);
				return basicSetTextLiteralParam((TextLiteralParam)otherEnd, msgs);
			case AdaptionxmlPackage.XML_AXIS_PAIR__XML_AXIS_OPTION_PARAM:
				if (xmlAxisOptionParam != null)
					msgs = ((InternalEObject)xmlAxisOptionParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptionxmlPackage.XML_AXIS_PAIR__XML_AXIS_OPTION_PARAM, null, msgs);
				return basicSetXmlAxisOptionParam((XmlAxisOptionParam)otherEnd, msgs);
			case AdaptionxmlPackage.XML_AXIS_PAIR__XML_PATH_PARAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetXmlPathParam((XmlPathParam)otherEnd, msgs);
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
			case AdaptionxmlPackage.XML_AXIS_PAIR__TEXT_LITERAL_PARAM:
				return basicSetTextLiteralParam(null, msgs);
			case AdaptionxmlPackage.XML_AXIS_PAIR__XML_AXIS_OPTION_PARAM:
				return basicSetXmlAxisOptionParam(null, msgs);
			case AdaptionxmlPackage.XML_AXIS_PAIR__XML_PATH_PARAM:
				return basicSetXmlPathParam(null, msgs);
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
			case AdaptionxmlPackage.XML_AXIS_PAIR__XML_PATH_PARAM:
				return eInternalContainer().eInverseRemove(this, AdaptionxmlPackage.XML_PATH_PARAM__XML_AXIS_PAIRS, XmlPathParam.class, msgs);
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
			case AdaptionxmlPackage.XML_AXIS_PAIR__TEXT_LITERAL_PARAM:
				return getTextLiteralParam();
			case AdaptionxmlPackage.XML_AXIS_PAIR__XML_AXIS_OPTION_PARAM:
				return getXmlAxisOptionParam();
			case AdaptionxmlPackage.XML_AXIS_PAIR__XML_PATH_PARAM:
				return getXmlPathParam();
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
			case AdaptionxmlPackage.XML_AXIS_PAIR__TEXT_LITERAL_PARAM:
				setTextLiteralParam((TextLiteralParam)newValue);
				return;
			case AdaptionxmlPackage.XML_AXIS_PAIR__XML_AXIS_OPTION_PARAM:
				setXmlAxisOptionParam((XmlAxisOptionParam)newValue);
				return;
			case AdaptionxmlPackage.XML_AXIS_PAIR__XML_PATH_PARAM:
				setXmlPathParam((XmlPathParam)newValue);
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
			case AdaptionxmlPackage.XML_AXIS_PAIR__TEXT_LITERAL_PARAM:
				setTextLiteralParam((TextLiteralParam)null);
				return;
			case AdaptionxmlPackage.XML_AXIS_PAIR__XML_AXIS_OPTION_PARAM:
				setXmlAxisOptionParam((XmlAxisOptionParam)null);
				return;
			case AdaptionxmlPackage.XML_AXIS_PAIR__XML_PATH_PARAM:
				setXmlPathParam((XmlPathParam)null);
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
			case AdaptionxmlPackage.XML_AXIS_PAIR__TEXT_LITERAL_PARAM:
				return textLiteralParam != null;
			case AdaptionxmlPackage.XML_AXIS_PAIR__XML_AXIS_OPTION_PARAM:
				return xmlAxisOptionParam != null;
			case AdaptionxmlPackage.XML_AXIS_PAIR__XML_PATH_PARAM:
				return getXmlPathParam() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Adaptable.class) {
			switch (baseOperationID) {
				case GraphstructurePackage.ADAPTABLE___CREATE_PARAMETERS: return AdaptionxmlPackage.XML_AXIS_PAIR___CREATE_PARAMETERS;
				case GraphstructurePackage.ADAPTABLE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST: return AdaptionxmlPackage.XML_AXIS_PAIR___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;
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
			case AdaptionxmlPackage.XML_AXIS_PAIR___GET_NEXT_XML_AXIS_PAIRS:
				return getNextXmlAxisPairs();
			case AdaptionxmlPackage.XML_AXIS_PAIR___GET_PREVIOUS_XML_AXIS_PAIRS:
				return getPreviousXmlAxisPairs();
			case AdaptionxmlPackage.XML_AXIS_PAIR___INFER_AXIS_SUGGESTIONS:
				return inferAxisSuggestions();
			case AdaptionxmlPackage.XML_AXIS_PAIR___INFER_ELEMENT_TAG_SUGGESTIONS:
				return inferElementTagSuggestions();
			case AdaptionxmlPackage.XML_AXIS_PAIR___INFER_ELEMENT_TAG_SUGGESTIONS_FROM_INCOMING_RELATIONS:
				return inferElementTagSuggestionsFromIncomingRelations();
			case AdaptionxmlPackage.XML_AXIS_PAIR___INFER_ELEMENT_TAG_SUGGESTIONS_FROM_OUTGOING_RELATIONS:
				return inferElementTagSuggestionsFromOutgoingRelations();
			case AdaptionxmlPackage.XML_AXIS_PAIR___CREATE_PARAMETERS:
				createParameters();
				return null;
			case AdaptionxmlPackage.XML_AXIS_PAIR___REMOVE_PARAMETERS_FROM_PARAMETER_LIST:
				removeParametersFromParameterList();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public String myToString() {
		try {
			return this.generateXQuery();
		} catch (InvalidityException e) {
			return "[invalid axis pair " + getInternalId() + "]]"; 
		}
	}

} //AxisPairImpl
