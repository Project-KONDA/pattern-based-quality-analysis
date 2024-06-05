/**
 */
package qualitypatternmodel.textrepresentation.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

import qualitypatternmodel.textrepresentation.Fragment;
import qualitypatternmodel.textrepresentation.ParameterFragment;
import qualitypatternmodel.textrepresentation.ParameterPredefinition;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.textrepresentation.TextrepresentationPackage;
import qualitypatternmodel.utility.Constants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.textrepresentation.impl.PatternTextImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link qualitypatternmodel.textrepresentation.impl.PatternTextImpl#getFragments <em>Fragments</em>}</li>
 *   <li>{@link qualitypatternmodel.textrepresentation.impl.PatternTextImpl#getName <em>Name</em>}</li>
 *   <li>{@link qualitypatternmodel.textrepresentation.impl.PatternTextImpl#getParameterPredefinitions <em>Parameter Predefinitions</em>}</li>
 *   <li>{@link qualitypatternmodel.textrepresentation.impl.PatternTextImpl#getFragmentsOrdered <em>Fragments Ordered</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternTextImpl extends MinimalEObjectImpl.Container implements PatternText {
	/**
	 * The cached value of the '{@link #getFragments() <em>Fragments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * The fragments of the textual representation of a pattern.
	 * <!-- end-user-doc -->
	 * @see #getFragments()
	 * @generated
	 * @ordered
	 */
	protected EList<Fragment> fragments;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * The name of this textual representation of the pattern.
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameterPredefinitions() <em>Parameter Predefinitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterPredefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterPredefinition> parameterPredefinitions;

	/**
	 * The cached value of the '{@link #getFragmentsOrdered() <em>Fragments Ordered</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragmentsOrdered()
	 * @generated
	 * @ordered
	 */
	protected EList<Fragment> fragmentsOrdered;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternTextImpl() {
		super();
	}
	

	public PatternTextImpl(CompletePattern pattern, JSONObject json) throws JSONException, InvalidityException {
		super();
		
		//template check
		String template = json.getString("template");
		if (!pattern.getPatternId().equals(template))
			throw new InvalidityException("Selected Pattern '" + pattern.getPatternId() + "' does not match '" + template + "'.");
		pattern.getLanguage().getLiteral();
		String language = json.getString("language");
		if (!pattern.getLanguage().getLiteral().equals(language))
			throw new InvalidityException("The language of the selected Pattern '" + pattern.getName() + "' is '" + pattern.getLanguage().getLiteral() + "', which does not match '" + language + "'.");

		// pattern
		pattern.getText().add(this);
		
		// name
		String name = json.getString("name");
		this.setName(name);
				
		// fragments
		JSONArray fragments = json.getJSONArray("fragments");
		int id_counter = 0;
		for (int i = 0; i < fragments.length(); i++) {
            JSONObject fragmentObject = fragments.getJSONObject(i);
            
            boolean hasText = fragmentObject.has(Constants.JSON_TEXT);
            boolean hasParams = fragmentObject.has(Constants.JSON_PARAMETER);
            boolean hasName = fragmentObject.has(Constants.JSON_NAME);
            boolean hasValue = fragmentObject.has(Constants.JSON_VALUE);
            
            if (hasParams && hasName) {
            	addFragment(new ParameterFragmentImpl(pattern, fragmentObject, id_counter));
            	id_counter++;
            }	
            else if (hasParams && hasValue)
            	getParameterPredefinitions().add(new ParameterPredefinitionImpl(pattern, fragmentObject));
            else if (hasText) {
            	String text = fragmentObject.getString(Constants.JSON_TEXT);
            	addFragment(new TextFragmentImpl(text));
            } else throw new InvalidityException();
		}
		isValid(AbstractionLevel.ABSTRACT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextrepresentationPackage.Literals.PATTERN_TEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompletePattern getPattern() {
		if (eContainerFeatureID() != TextrepresentationPackage.PATTERN_TEXT__PATTERN) return null;
		return (CompletePattern)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPattern(CompletePattern newPattern, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPattern, TextrepresentationPackage.PATTERN_TEXT__PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPattern(CompletePattern newPattern) {
		if (newPattern != eInternalContainer() || (eContainerFeatureID() != TextrepresentationPackage.PATTERN_TEXT__PATTERN && newPattern != null)) {
			if (EcoreUtil.isAncestor(this, newPattern))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPattern != null)
				msgs = ((InternalEObject)newPattern).eInverseAdd(this, PatternstructurePackage.COMPLETE_PATTERN__TEXT, CompletePattern.class, msgs);
			msgs = basicSetPattern(newPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextrepresentationPackage.PATTERN_TEXT__PATTERN, newPattern, newPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Fragment> getFragments() {
		if (fragments == null) {
			fragments = new EObjectContainmentWithInverseEList<Fragment>(Fragment.class, this, TextrepresentationPackage.PATTERN_TEXT__FRAGMENTS, TextrepresentationPackage.FRAGMENT__PATTERN_TEXT);
		}
		return fragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextrepresentationPackage.PATTERN_TEXT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParameterPredefinition> getParameterPredefinitions() {
		if (parameterPredefinitions == null) {
			parameterPredefinitions = new EObjectContainmentEList<ParameterPredefinition>(ParameterPredefinition.class, this, TextrepresentationPackage.PATTERN_TEXT__PARAMETER_PREDEFINITIONS);
		}
		return parameterPredefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Fragment> getFragmentsOrdered() {
		if (fragmentsOrdered == null) {
			fragmentsOrdered = new NonUniqueList<Fragment>(Fragment.class, this, TextrepresentationPackage.PATTERN_TEXT__FRAGMENTS_ORDERED);
		}
		return fragmentsOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String generateJSON() {
		String json = "{";
//		String name = getPattern().getName();
//		json += "\"PatternName\": \"" + name + "\", ";
//		String abstractName = getPattern().getAbstractName();
//		if (abstractName != null & abstractName != "") {
//			json += "\"AbstractPatternName\": \"" + getPattern().getAbstractName() + "\", ";
//		}
//		String description = getPattern().getDescription();
//		if(description == null) {
//			description = "";
//		}
//		json += "\"PatternDescription\": \"" + description + "\",";
//		json += "\"PatternTextName\": \"" + getName() + "\",";

		json += "\"name\": \"" + getName() + "\", ";
		json += "\"fragments\" : [";
		for(int i = 0; i< getFragmentsOrdered().size(); i++) {
			if (i>0)
				json += ", ";
			json += getFragmentsOrdered().get(i).generateJSON();
		}
		json += "]}";
		return json;
	}

	
	@Override
	public JSONObject generateJSONObject() {
		JSONObject json = new JSONObject();
		try {
			json.put("name", getName());
			JSONArray fragments = new JSONArray();
			for (Fragment fragment: getFragmentsOrdered()) {
				fragments.put(fragment.generateJSONObject());
			}
			json.put("fragments", fragments);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException {
		
		// get all referenced parameters
		List<Parameter> referencedParameters = new ArrayList<Parameter>();
		for(Fragment f : getFragments()) {
			if(f instanceof ParameterFragment) {
				ParameterFragment p = (ParameterFragment) f;
				referencedParameters.addAll(p.getParameter());
				p.isValid(abstractionLevel);
			}
		}
		for(ParameterPredefinition p : getParameterPredefinitions()) {
			referencedParameters.addAll(p.getParameter());			
		}
		
		// get all parameters from the pattern, that needs to be specified
//		List<Parameter> patternParametersNonPredefinedNotAutomaticTypeNotRootRelation = new ArrayList<Parameter>();
		List<Parameter> patternParametersNonPredefined = new ArrayList<Parameter>();
		for(Parameter p : getPattern().getParameterList().getParameters()){
			if(!p.isPredefined()) {
				if(!(p instanceof TypeOptionParam)) {
					patternParametersNonPredefined.add(p);
				} else {
					TypeOptionParam t = (TypeOptionParam) p;
					boolean automaticType = true;
					for(Comparison c : t.getTypeComparisons()) {
						automaticType &= !(c.getArgument1() instanceof PrimitiveNode && c.getArgument2() instanceof PrimitiveNode);
					}
					if(!automaticType) {
						patternParametersNonPredefined.add(p);
					}
				}
			}
//			if(!p.isPredefined()) {
//				patternParametersNonPredefined.add(p);
//				if(!(p instanceof TypeOptionParam)) {
//					if(p instanceof XmlAxisOptionParam) {
//						XmlAxisOptionParam r = (XmlAxisOptionParam) p;
//						boolean rootRelation = true;
//						Relation relation = r.getXmlAxisPart().getXmlPathParam().getXmlNavigation();
//						rootRelation &= relation.getSource() instanceof XmlRoot;						
//						if(!rootRelation) {
//							patternParametersNonPredefinedNotAutomaticTypeNotRootRelation.add(p);
//						}
//					}					
//					
//				} else {
//					TypeOptionParam t = (TypeOptionParam) p;
//					boolean automaticType = true;
//					for(Comparison c : t.getTypeComparisons()) {
//						automaticType &= !(c.getArgument1() instanceof PrimitiveNode && c.getArgument2() instanceof PrimitiveNode);
//					}
//					if(!automaticType) {
//						patternParametersNonPredefinedNotAutomaticTypeNotRootRelation.add(p);
//					}
//				}
//			}
//			if(p instanceof XmlPathParam) {
//				XmlPathParam pathParam = (XmlPathParam) p;
//				if(pathParam.getXmlPropertyOptionParam() != null && !pathParam.getXmlPropertyOptionParam().isPredefined()) {
//					patternParametersNonPredefined.add(pathParam.getXmlPropertyOptionParam());
//					if(pathParam.getXmlPropertyOptionParam().getAttributeName() != null && !pathParam.getXmlPropertyOptionParam().getAttributeName().isPredefined()) {
//						patternParametersNonPredefined.add(pathParam.getXmlPropertyOptionParam().getAttributeName());
//					}
//				}
//				for(XmlAxisPart axisPair : pathParam.getXmlAxisParts()) {
//					if(axisPair.getXmlAxisOptionParam() != null && !axisPair.getXmlAxisOptionParam().isPredefined()) {
//						patternParametersNonPredefined.add(axisPair.getXmlAxisOptionParam());						
//						boolean rootRelation = true;
//						Relation relation = axisPair.getXmlAxisOptionParam().getXmlAxisPart().getXmlPathParam().getXmlNavigation();
//						rootRelation &= relation.getSource() instanceof XmlRoot;						
//						if(!rootRelation) {
//							patternParametersNonPredefinedNotAutomaticTypeNotRootRelation.add(axisPair.getXmlAxisOptionParam());
//						}
//					}
//					if(axisPair.getTextLiteralParam() != null && !axisPair.getTextLiteralParam().isPredefined()) {
//						patternParametersNonPredefined.add(axisPair.getTextLiteralParam());						
//					}
//				}
//			}
		}
		if(!referencedParameters.containsAll(patternParametersNonPredefined)) {
			String remaining = "";
			for(Parameter p : patternParametersNonPredefined) {
				if(!referencedParameters.contains(p)) {
					remaining += "\n  - " + p.myToString() + ", ";
				}
			}
			throw new InvalidityException("pattern text '" + getName() + "' does not reference all parameters: " + remaining + "\n" + getPattern().myToString());
		}
		if(!patternParametersNonPredefined.containsAll(referencedParameters)) {
			String remaining = "";
			for(Parameter p : referencedParameters) {
				if(!patternParametersNonPredefined.contains(p)) {
					remaining += "\n  - " + p.myToString() + ", ";
				}
			}
			throw new InvalidityException("pattern text references invalid parameters: " + remaining);
		}

		// Check Parameters not referenced multiple times
		Set<Parameter> referencedParametersSet = new HashSet<>(referencedParameters);
		if(referencedParameters.size() != referencedParametersSet.size()) {
			throw new InvalidityException("pattern text references parameters multiple times");
		}
		
		
		// Check Parameter Fragment names unique
		List<String> names = new BasicEList<String>();
		for(Fragment f : getFragments()) {
			if(f instanceof ParameterFragment) {
				ParameterFragment frag = (ParameterFragment) f;
				for(String n : names) {
					if(n.equals(frag.getId())) {
						throw new InvalidityException("Parameter fragment name not unique: " + frag.getId());
					}
				}					
				names.add(frag.getId());
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws OperatorCycleException 
	 * @throws InvalidityException 
	 * @generated NOT
	 */
	@Override
	public void instantiate() throws InvalidityException {
		isValid(AbstractionLevel.ABSTRACT);
		EList<PatternText> textsCopy = new BasicEList<PatternText>();
		textsCopy.addAll(getPattern().getText());
		for(PatternText text : textsCopy) {
			if(!text.equals(this)) {
				text.delete();
			}
		}
		for(ParameterPredefinition p : getParameterPredefinitions()) {
			for(Parameter param : p.getParameter()) {
				param.setValueFromString(p.getValue());
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws MissingPatternContainerException 
	 * @throws OperatorCycleException 
	 * @generated not
	 */
	@Override
	public String generateSparqlTemplate() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// build sentence:
//		getPattern().isValid(AbstractionLevel.ABSTRACT); // TODO: technology-specific validation
		
		String text = "#TEMPLATE={\"template\":\"";
		for(Fragment f : getFragmentsOrdered()) {
			text += f.generateSparqlTemplate() + " ";
		}
		
		// add variables:
		text += "\",\"variables\":{";		
		int c = 0;
		int size = getFragmentsOrdered().size();
		for(Fragment f : getFragmentsOrdered()) {
			if(f instanceof ParameterFragment) {
				ParameterFragment p = (ParameterFragment) f;
				text += " \"" + p.generateSparqlTemplate() + "\":{}"; // TODO: support declaration of SPARQL query that determines the value set in ParameterFragment
				if(c < size-2) {
					text += ",";
				}
			}
			c++;
		}
		text += "}}";
		
		// query:
		String query = getPattern().generateSparql();
		
		// add example values as BINDs:
//		String[] split = query.split("WHERE\n\\{");
//		assert split.length == 2;
		int index = query.indexOf("WHERE {") + "WHERE {".length();
		assert index > 0;
		List<String> fragmentVars = new BasicEList<String>();
		String binds = "";
		for(Fragment f : getFragmentsOrdered()) {
			if(f instanceof ParameterFragment) {
				ParameterFragment p = (ParameterFragment) f;
				if(p.getExampleValue() != null) {
//					binds += "BIND(" + p.getExampleValue() + " AS ?" + p.getName() + ")";
					binds += "\n  BIND(" + p.getExampleValue() + " AS ?" + p.getId() + ").";
				}
				fragmentVars.add("?"+p.getId());
			}
			c++;
		}
//		query = split[0] + "WHERE\n{\n" + binds + split[1];
		query = query.substring(0,index) + binds + query.substring(index);
		
		// inline VALUES:
		/* TODO: we could omit this if we add a dedicated generateSparqlTemplate()
		 * method in PatternElement that directly translates RDF nodes with a primitive
		 * comparison via the name of the associated ParameterFragment
		 */		
//		String[] splitValues = query.split("VALUES ");
//		query = splitValues[0];
//		for(int i=1; i<splitValues.length; i++) {
//			String s = splitValues[i];
//			String[] lineSplit = s.split(" \\{");
//			String var = lineSplit[0];
//			String replace = lineSplit[1].substring(0,lineSplit[1].length()-4);
//			query = query.replace(var, replace);
//		}
//		while(query.endsWith(" ")) {
//			query = query.substring(0, query.length()-1);
//		}		
//		query += "}";
//		
//		return text + "\n" + query;
		String regex = "[ ]*FILTER \\(\\?[a-z0-9]* = \\?[a-z0-9]*\\).";
		List<String[]> replacements = new BasicEList<>();
		
		String result = text;
		for(String line: query.split("\n")) {
			if (line.matches(regex)){
				line = line.replace(" ", "");
				line = line.replace("FILTER(", "");
				line = line.replace(").", "");
				String[] vars = line.split("=");
				assert vars.length == 2;
				assert vars[0].matches("\\?[a-z0-9]*");
				assert vars[1].matches("\\?[a-z0-9]*");
				if (fragmentVars.contains(vars[0])) {
					String[] pair = {vars[1], vars[0]};
					replacements.add(pair);
				}
				else if (fragmentVars.contains(vars[1])) {
					String[] pair = {vars[1], vars[0]};
					replacements.add(pair);
				}
			}
			else
				result += "\n" + line;
		}
		for (String[] p: replacements) {
			result = result.replace(p[0] , p[1]);
		}	
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void delete() {
		setPattern(null);
		for(Fragment fragment : getFragments()) {
			if(fragment instanceof ParameterFragment) {
				ParameterFragment parameterFragment = (ParameterFragment) fragment;
				parameterFragment.getParameter().clear();;
			}
		}
		for(ParameterPredefinition p : getParameterPredefinitions()) {
			p.getParameter().clear();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getPreview() {
		String s = "";
		for(Fragment frag : getFragmentsOrdered()) {
			s += frag.getPreview();
		}
		return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void addFragment(Fragment fragment) {		
		getFragmentsOrdered().add(fragment);
		getFragments().add(fragment);
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
			case TextrepresentationPackage.PATTERN_TEXT__PATTERN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPattern((CompletePattern)otherEnd, msgs);
			case TextrepresentationPackage.PATTERN_TEXT__FRAGMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFragments()).basicAdd(otherEnd, msgs);
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
			case TextrepresentationPackage.PATTERN_TEXT__PATTERN:
				return basicSetPattern(null, msgs);
			case TextrepresentationPackage.PATTERN_TEXT__FRAGMENTS:
				return ((InternalEList<?>)getFragments()).basicRemove(otherEnd, msgs);
			case TextrepresentationPackage.PATTERN_TEXT__PARAMETER_PREDEFINITIONS:
				return ((InternalEList<?>)getParameterPredefinitions()).basicRemove(otherEnd, msgs);
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
			case TextrepresentationPackage.PATTERN_TEXT__PATTERN:
				return eInternalContainer().eInverseRemove(this, PatternstructurePackage.COMPLETE_PATTERN__TEXT, CompletePattern.class, msgs);
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
			case TextrepresentationPackage.PATTERN_TEXT__PATTERN:
				return getPattern();
			case TextrepresentationPackage.PATTERN_TEXT__FRAGMENTS:
				return getFragments();
			case TextrepresentationPackage.PATTERN_TEXT__NAME:
				return getName();
			case TextrepresentationPackage.PATTERN_TEXT__PARAMETER_PREDEFINITIONS:
				return getParameterPredefinitions();
			case TextrepresentationPackage.PATTERN_TEXT__FRAGMENTS_ORDERED:
				return getFragmentsOrdered();
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
			case TextrepresentationPackage.PATTERN_TEXT__PATTERN:
				setPattern((CompletePattern)newValue);
				return;
			case TextrepresentationPackage.PATTERN_TEXT__FRAGMENTS:
				getFragments().clear();
				getFragments().addAll((Collection<? extends Fragment>)newValue);
				return;
			case TextrepresentationPackage.PATTERN_TEXT__NAME:
				setName((String)newValue);
				return;
			case TextrepresentationPackage.PATTERN_TEXT__PARAMETER_PREDEFINITIONS:
				getParameterPredefinitions().clear();
				getParameterPredefinitions().addAll((Collection<? extends ParameterPredefinition>)newValue);
				return;
			case TextrepresentationPackage.PATTERN_TEXT__FRAGMENTS_ORDERED:
				getFragmentsOrdered().clear();
				getFragmentsOrdered().addAll((Collection<? extends Fragment>)newValue);
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
			case TextrepresentationPackage.PATTERN_TEXT__PATTERN:
				setPattern((CompletePattern)null);
				return;
			case TextrepresentationPackage.PATTERN_TEXT__FRAGMENTS:
				getFragments().clear();
				return;
			case TextrepresentationPackage.PATTERN_TEXT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TextrepresentationPackage.PATTERN_TEXT__PARAMETER_PREDEFINITIONS:
				getParameterPredefinitions().clear();
				return;
			case TextrepresentationPackage.PATTERN_TEXT__FRAGMENTS_ORDERED:
				getFragmentsOrdered().clear();
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
			case TextrepresentationPackage.PATTERN_TEXT__PATTERN:
				return getPattern() != null;
			case TextrepresentationPackage.PATTERN_TEXT__FRAGMENTS:
				return fragments != null && !fragments.isEmpty();
			case TextrepresentationPackage.PATTERN_TEXT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TextrepresentationPackage.PATTERN_TEXT__PARAMETER_PREDEFINITIONS:
				return parameterPredefinitions != null && !parameterPredefinitions.isEmpty();
			case TextrepresentationPackage.PATTERN_TEXT__FRAGMENTS_ORDERED:
				return fragmentsOrdered != null && !fragmentsOrdered.isEmpty();
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
			case TextrepresentationPackage.PATTERN_TEXT___IS_VALID__ABSTRACTIONLEVEL:
				try {
					isValid((AbstractionLevel)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case TextrepresentationPackage.PATTERN_TEXT___ADD_FRAGMENT__FRAGMENT:
				addFragment((Fragment)arguments.get(0));
				return null;
			case TextrepresentationPackage.PATTERN_TEXT___GENERATE_JSON:
				return generateJSON();
			case TextrepresentationPackage.PATTERN_TEXT___GET_PREVIEW:
				return getPreview();
			case TextrepresentationPackage.PATTERN_TEXT___DELETE:
				delete();
				return null;
			case TextrepresentationPackage.PATTERN_TEXT___INSTANTIATE:
				try {
					instantiate();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case TextrepresentationPackage.PATTERN_TEXT___GENERATE_SPARQL_TEMPLATE:
				try {
					return generateSparqlTemplate();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case TextrepresentationPackage.PATTERN_TEXT___GENERATE_JSON_OBJECT:
				return generateJSONObject();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PatternTextImpl
