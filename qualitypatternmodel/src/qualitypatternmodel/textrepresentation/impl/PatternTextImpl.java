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

import qualitypatternmodel.adaptionxml.XmlRoot;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.RelationOptionParam;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

import qualitypatternmodel.textrepresentation.Fragment;
import qualitypatternmodel.textrepresentation.ParameterFragment;
import qualitypatternmodel.textrepresentation.ParameterPredefinition;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.textrepresentation.TextrepresentationPackage;

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
		String json = "{\n";
		json += "\n\"PatternName\": \"" + getPattern().getName() + "\",";
		String description = getPattern().getDescription();
		if(description == null) {
			description = "";
		}
		json += "\n\"PatternDescription\": \"" + description + "\",";
		json += "\n\"PatternTextName\": \"" + getName() + "\","; 
		json+= "\n\"Fragments\" : [";
		for(Fragment f : getFragmentsOrdered()) {
			json += f.generateJSON() + ",\n";
		}
		json = json.substring(0, json.length()-2);
		json += "]\n}";
		return json;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException {
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
		
		List<Parameter> patternParametersNonPredefinedNotAutomaticTypeNotRootRelation = new ArrayList<Parameter>();
		List<Parameter> patternParametersNonPredefined = new ArrayList<Parameter>();
		for(Parameter p : getPattern().getParameterList().getParameters()){
			if(!p.isPredefined()) {
				patternParametersNonPredefined.add(p);
				if(!(p instanceof TypeOptionParam)) {					
					if(p instanceof RelationOptionParam) {
						RelationOptionParam r = (RelationOptionParam) p;
						boolean rootRelation = true;
						for(Relation relation : r.getRelations()) {
							rootRelation &= relation.getSource() instanceof XmlRoot;
						}						
						if(!rootRelation) {
							patternParametersNonPredefinedNotAutomaticTypeNotRootRelation.add(p);
						}
					}					
					
				} else {					
					TypeOptionParam t = (TypeOptionParam) p;
					boolean automaticType = true;
					for(Comparison c : t.getTypeComparisons()) {
						automaticType &= !(c.getArgument1() instanceof Property && c.getArgument2() instanceof Property);
					}
					if(!automaticType) {
						patternParametersNonPredefinedNotAutomaticTypeNotRootRelation.add(p);
					}					
				}				
			}
		}
		if(!referencedParameters.containsAll(patternParametersNonPredefinedNotAutomaticTypeNotRootRelation)) {
			for(Parameter p : patternParametersNonPredefinedNotAutomaticTypeNotRootRelation) {
				if(!referencedParameters.contains(p)) {
					System.out.println(p);
				}
			}
			throw new InvalidityException("pattern text does not reference all parameters");
		}
		if(!patternParametersNonPredefined.containsAll(referencedParameters)) {
			throw new InvalidityException("pattern text references invalid parameters");
		}
		
		Set<Parameter> referencedParametersSet = new HashSet<>(referencedParameters);
		if(referencedParameters.size() != referencedParametersSet.size()) {
			throw new InvalidityException("pattern text references parameters multiple times");
		}
		
		List<String> names = new BasicEList<String>();
		for(Fragment f : getFragments()) {
			if(f instanceof ParameterFragment) {
				ParameterFragment frag = (ParameterFragment) f;
				for(String n : names) {
					if(n.equals(frag.getName())) {
						throw new InvalidityException("Parameter fragment names not unique");
					}
				}					
				names.add(frag.getName());
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
		isValid(AbstractionLevel.CONCRETE);
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
			p.getParameter().clear();;		
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
			case TextrepresentationPackage.PATTERN_TEXT___GENERATE_JSON:
				return generateJSON();
			case TextrepresentationPackage.PATTERN_TEXT___IS_VALID__ABSTRACTIONLEVEL:
				try {
					isValid((AbstractionLevel)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case TextrepresentationPackage.PATTERN_TEXT___INSTANTIATE:
				try {
					instantiate();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case TextrepresentationPackage.PATTERN_TEXT___DELETE:
				delete();
				return null;
			case TextrepresentationPackage.PATTERN_TEXT___GET_PREVIEW:
				return getPreview();
			case TextrepresentationPackage.PATTERN_TEXT___ADD_FRAGMENT__FRAGMENT:
				addFragment((Fragment)arguments.get(0));
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PatternTextImpl
