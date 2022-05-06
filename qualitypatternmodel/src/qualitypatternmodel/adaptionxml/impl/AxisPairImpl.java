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

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.AxisOptionParam;
import qualitypatternmodel.adaptionxml.AxisPair;
import qualitypatternmodel.adaptionxml.PathParam;
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
import qualitypatternmodel.adaptionxml.AxisKind;
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
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.AxisPairImpl#getTextLiteralParam <em>Text Literal Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.AxisPairImpl#getAxisOptionParam <em>Axis Option Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.AxisPairImpl#getPathParam <em>Path Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AxisPairImpl extends PatternElementImpl implements AxisPair {
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
	 * The cached value of the '{@link #getAxisOptionParam() <em>Axis Option Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisOptionParam()
	 * @generated
	 * @ordered
	 */
	protected AxisOptionParam axisOptionParam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AxisPairImpl() {
		super();
	}
	
	@Override
	public String generateQuery() throws InvalidityException {
		String query = getAxisOptionParam().generateQuery();
		if (getTextLiteralParam() != null) {
			String literal = getTextLiteralParam().generateQuery();
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
		if (axisOptionParam != null) 
			axisOptionParam.isValid(abstractionLevel);
	}
	
	
	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
//		if (textLiteralParam == null) {
//			throw new InvalidityException("textLiteralParam null");
//		}
		if (axisOptionParam == null) {
			throw new InvalidityException("axisOptionParam null");
		}
		
	}
	
	@Override
	public EList<Parameter> getAllParameters() throws InvalidityException {
		EList<Parameter> res = new BasicEList<Parameter>();		
		if (textLiteralParam != null) {
			res.add(textLiteralParam);
		}
		if (axisOptionParam != null) {
			res.add(axisOptionParam);
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
		return AdaptionxmlPackage.Literals.AXIS_PAIR;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.AXIS_PAIR__TEXT_LITERAL_PARAM, oldTextLiteralParam, newTextLiteralParam);
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
				msgs = ((InternalEObject)textLiteralParam).eInverseRemove(this, ParametersPackage.TEXT_LITERAL_PARAM__AXIS_PAIR, TextLiteralParam.class, msgs);
			if (newTextLiteralParam != null)
				msgs = ((InternalEObject)newTextLiteralParam).eInverseAdd(this, ParametersPackage.TEXT_LITERAL_PARAM__AXIS_PAIR, TextLiteralParam.class, msgs);
			msgs = basicSetTextLiteralParam(newTextLiteralParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.AXIS_PAIR__TEXT_LITERAL_PARAM, newTextLiteralParam, newTextLiteralParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AxisOptionParam getAxisOptionParam() {
		return axisOptionParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxisOptionParam(AxisOptionParam newAxisOptionParam, NotificationChain msgs) {
		AxisOptionParam oldAxisOptionParam = axisOptionParam;
		axisOptionParam = newAxisOptionParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.AXIS_PAIR__AXIS_OPTION_PARAM, oldAxisOptionParam, newAxisOptionParam);
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
	public void setAxisOptionParam(AxisOptionParam newAxisOptionParam) {
		if (newAxisOptionParam != axisOptionParam) {
			NotificationChain msgs = null;
			if (axisOptionParam != null)
				msgs = ((InternalEObject)axisOptionParam).eInverseRemove(this, AdaptionxmlPackage.AXIS_OPTION_PARAM__AXIS_PAIR, AxisOptionParam.class, msgs);
			if (newAxisOptionParam != null)
				msgs = ((InternalEObject)newAxisOptionParam).eInverseAdd(this, AdaptionxmlPackage.AXIS_OPTION_PARAM__AXIS_PAIR, AxisOptionParam.class, msgs);
			msgs = basicSetAxisOptionParam(newAxisOptionParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.AXIS_PAIR__AXIS_OPTION_PARAM, newAxisOptionParam, newAxisOptionParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PathParam getPathParam() {
		if (eContainerFeatureID() != AdaptionxmlPackage.AXIS_PAIR__PATH_PARAM) return null;
		return (PathParam)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPathParam(PathParam newPathParam, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPathParam, AdaptionxmlPackage.AXIS_PAIR__PATH_PARAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathParam(PathParam newPathParam) {
		if (newPathParam != eInternalContainer() || (eContainerFeatureID() != AdaptionxmlPackage.AXIS_PAIR__PATH_PARAM && newPathParam != null)) {
			if (EcoreUtil.isAncestor(this, newPathParam))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPathParam != null)
				msgs = ((InternalEObject)newPathParam).eInverseAdd(this, AdaptionxmlPackage.PATH_PARAM__AXIS_PAIRS, PathParam.class, msgs);
			msgs = basicSetPathParam(newPathParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.AXIS_PAIR__PATH_PARAM, newPathParam, newPathParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<AxisPair> getNextAxisPairs() {
		int index = getPathParam().getAxisPairs().indexOf(this);
		EList<AxisPair> axisPairs = new BasicEList<AxisPair>();		
		if(index < getPathParam().getAxisPairs().size()-1) {
			axisPairs.add(getPathParam().getAxisPairs().get(index+1));
		} else if(getPathParam().getPropertyOptionParam() == null && getPathParam().getXmlNavigation() instanceof XmlElementNavigation) {
			XmlElement element = (XmlElement) getPathParam().getXmlNavigation().getTarget();			
			for(Relation r : element.getOutgoing()) {
				if(r instanceof XmlElementNavigation) {
					XmlElementNavigation nav = (XmlElementNavigation) r;
					axisPairs.add(nav.getPathParam().getAxisPairs().get(0));
				}
				if(r instanceof XmlPropertyNavigation) {
					XmlPropertyNavigation nav = (XmlPropertyNavigation) r;
					axisPairs.add(nav.getPathParam().getAxisPairs().get(0));
				}
			}
		}
		return axisPairs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<AxisPair> getPreviousAxisPairs() {
		int index = getPathParam().getAxisPairs().indexOf(this);
		EList<AxisPair> axisPairs = new BasicEList<AxisPair>();
		if(index > 0) {
			axisPairs.add(getPathParam().getAxisPairs().get(index-1));
		} else if(index == 0 && getPathParam().getXmlNavigation() != null && getPathParam().getXmlNavigation().getSource() != null) {
			if(getPathParam().getXmlNavigation().getSource() instanceof XmlElement) {
				for(Relation r : getPathParam().getXmlNavigation().getSource().getIncoming()) {
					if(r instanceof XmlNavigation) {
						XmlNavigation nav = (XmlNavigation) r;
						axisPairs.add(nav.getPathParam().getAxisPairs().get(nav.getPathParam().getAxisPairs().size()-1));
					}
				}						
			} 
		}		
		return axisPairs;
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
		EList<AxisPair> nextAxisPairs = getNextAxisPairs();
		for(AxisPair next : nextAxisPairs) {		
			if(next != null && next.getAxisOptionParam() != null && next.getAxisOptionParam().getValue() != null
					&& next.getTextLiteralParam() != null && next.getTextLiteralParam().getValue() != null) {
	
				AxisKind axis = next.getAxisOptionParam().getValue();
				String nextTag = null;			
				
				if(next.getTextLiteralParam().getValue().equals("") || next.getTextLiteralParam().getValue().equals("*")) {
					boolean nextIsLast = next.getPathParam().getAxisPairs().get(next.getPathParam().getAxisPairs().size()-1).equals(next);
					if(nextIsLast && getPathParam().getXmlNavigation() != null && getPathParam().getXmlNavigation().getTarget() instanceof XmlElement) {
						XmlElement xmlElement = (XmlElement) getPathParam().getXmlNavigation().getTarget();
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
		if(getAxisOptionParam() == null || getAxisOptionParam().getValue() == null) {
			return new BasicEList<String>();
		}
		AxisKind axis = getAxisOptionParam().getValue();
		
		int index = getPathParam().getAxisPairs().indexOf(this);
		
		if (index == 0 && getPathParam().getXmlNavigation() != null && getPathParam().getXmlNavigation().getSource() instanceof XmlRoot) {
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
			EList<AxisPair> previousAxisPairs = getPreviousAxisPairs();
			for(AxisPair previous : previousAxisPairs) {
			
				if(previous != null && previous.getTextLiteralParam() != null && previous.getTextLiteralParam().getValue() != null) {
					String previousTag = null;
					if(previous.getTextLiteralParam().getValue().equals("") || previous.getTextLiteralParam().getValue().equals("*")) {
						boolean previousIsLast = previous.getPathParam().getAxisPairs().get(previous.getPathParam().getAxisPairs().size()-1).equals(previous);
						if(previousIsLast && previous.getPathParam().getXmlNavigation() != null && previous.getPathParam().getXmlNavigation().getTarget() instanceof XmlElement) {
							XmlElement xmlElement = (XmlElement) previous.getPathParam().getXmlNavigation().getTarget();
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
	public EList<AxisKind> inferAxisSuggestions() {
		EList<AxisKind> suggestions = new BasicEList<AxisKind>();
		
		if(getTextLiteralParam() == null || getTextLiteralParam().getValue() == null 
				|| getTextLiteralParam().getValue().equals("") || getTextLiteralParam().getValue().equals("*")) {
			return suggestions;
		}
		
		String targetTag = getTextLiteralParam().getValue();
		
		
		EList<AxisPair> previousAxisPairs = getPreviousAxisPairs();
		for (AxisPair previous : previousAxisPairs) {
			if(previous != null && previous.getTextLiteralParam() != null && previous.getTextLiteralParam().getValue() != null) {
				String sourceTag = null;
				if(previous.getTextLiteralParam().getValue().equals("") || previous.getTextLiteralParam().getValue().equals("*")) {
					boolean previousIsLast = previous.getPathParam().getAxisPairs().get(previous.getPathParam().getAxisPairs().size()-1).equals(previous);
					if(previousIsLast && previous.getPathParam().getXmlNavigation() != null && previous.getPathParam().getXmlNavigation().getTarget() instanceof XmlElement) {
						XmlElement xmlElement = (XmlElement) previous.getPathParam().getXmlNavigation().getTarget();
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
							EList<AxisKind> newSuggestions = xmlDataDatabase.getSuggestionsFromSourceTargetTag(sourceTag, targetTag);	
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
			if(getAxisOptionParam() == null) {
				AxisOptionParam axis = new AxisOptionParamImpl();
				setAxisOptionParam(axis);
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
			case AdaptionxmlPackage.AXIS_PAIR__TEXT_LITERAL_PARAM:
				if (textLiteralParam != null)
					msgs = ((InternalEObject)textLiteralParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptionxmlPackage.AXIS_PAIR__TEXT_LITERAL_PARAM, null, msgs);
				return basicSetTextLiteralParam((TextLiteralParam)otherEnd, msgs);
			case AdaptionxmlPackage.AXIS_PAIR__AXIS_OPTION_PARAM:
				if (axisOptionParam != null)
					msgs = ((InternalEObject)axisOptionParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptionxmlPackage.AXIS_PAIR__AXIS_OPTION_PARAM, null, msgs);
				return basicSetAxisOptionParam((AxisOptionParam)otherEnd, msgs);
			case AdaptionxmlPackage.AXIS_PAIR__PATH_PARAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPathParam((PathParam)otherEnd, msgs);
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
			case AdaptionxmlPackage.AXIS_PAIR__TEXT_LITERAL_PARAM:
				return basicSetTextLiteralParam(null, msgs);
			case AdaptionxmlPackage.AXIS_PAIR__AXIS_OPTION_PARAM:
				return basicSetAxisOptionParam(null, msgs);
			case AdaptionxmlPackage.AXIS_PAIR__PATH_PARAM:
				return basicSetPathParam(null, msgs);
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
			case AdaptionxmlPackage.AXIS_PAIR__PATH_PARAM:
				return eInternalContainer().eInverseRemove(this, AdaptionxmlPackage.PATH_PARAM__AXIS_PAIRS, PathParam.class, msgs);
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
			case AdaptionxmlPackage.AXIS_PAIR__TEXT_LITERAL_PARAM:
				return getTextLiteralParam();
			case AdaptionxmlPackage.AXIS_PAIR__AXIS_OPTION_PARAM:
				return getAxisOptionParam();
			case AdaptionxmlPackage.AXIS_PAIR__PATH_PARAM:
				return getPathParam();
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
			case AdaptionxmlPackage.AXIS_PAIR__TEXT_LITERAL_PARAM:
				setTextLiteralParam((TextLiteralParam)newValue);
				return;
			case AdaptionxmlPackage.AXIS_PAIR__AXIS_OPTION_PARAM:
				setAxisOptionParam((AxisOptionParam)newValue);
				return;
			case AdaptionxmlPackage.AXIS_PAIR__PATH_PARAM:
				setPathParam((PathParam)newValue);
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
			case AdaptionxmlPackage.AXIS_PAIR__TEXT_LITERAL_PARAM:
				setTextLiteralParam((TextLiteralParam)null);
				return;
			case AdaptionxmlPackage.AXIS_PAIR__AXIS_OPTION_PARAM:
				setAxisOptionParam((AxisOptionParam)null);
				return;
			case AdaptionxmlPackage.AXIS_PAIR__PATH_PARAM:
				setPathParam((PathParam)null);
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
			case AdaptionxmlPackage.AXIS_PAIR__TEXT_LITERAL_PARAM:
				return textLiteralParam != null;
			case AdaptionxmlPackage.AXIS_PAIR__AXIS_OPTION_PARAM:
				return axisOptionParam != null;
			case AdaptionxmlPackage.AXIS_PAIR__PATH_PARAM:
				return getPathParam() != null;
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
				case GraphstructurePackage.ADAPTABLE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST: return AdaptionxmlPackage.AXIS_PAIR___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;
				case GraphstructurePackage.ADAPTABLE___CREATE_PARAMETERS: return AdaptionxmlPackage.AXIS_PAIR___CREATE_PARAMETERS;
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
			case AdaptionxmlPackage.AXIS_PAIR___GET_NEXT_AXIS_PAIRS:
				return getNextAxisPairs();
			case AdaptionxmlPackage.AXIS_PAIR___GET_PREVIOUS_AXIS_PAIRS:
				return getPreviousAxisPairs();
			case AdaptionxmlPackage.AXIS_PAIR___INFER_ELEMENT_TAG_SUGGESTIONS:
				return inferElementTagSuggestions();
			case AdaptionxmlPackage.AXIS_PAIR___INFER_ELEMENT_TAG_SUGGESTIONS_FROM_OUTGOING_RELATIONS:
				return inferElementTagSuggestionsFromOutgoingRelations();
			case AdaptionxmlPackage.AXIS_PAIR___INFER_ELEMENT_TAG_SUGGESTIONS_FROM_INCOMING_RELATIONS:
				return inferElementTagSuggestionsFromIncomingRelations();
			case AdaptionxmlPackage.AXIS_PAIR___INFER_AXIS_SUGGESTIONS:
				return inferAxisSuggestions();
			case AdaptionxmlPackage.AXIS_PAIR___REMOVE_PARAMETERS_FROM_PARAMETER_LIST:
				removeParametersFromParameterList();
				return null;
			case AdaptionxmlPackage.AXIS_PAIR___CREATE_PARAMETERS:
				createParameters();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public String myToString() {
		// TODO Auto-generated method stub
		return null;
	}

} //AxisPairImpl
