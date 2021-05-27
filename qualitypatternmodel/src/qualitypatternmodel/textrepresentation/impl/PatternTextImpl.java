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
 *   <li>{@link qualitypatternmodel.textrepresentation.impl.PatternTextImpl#getTextfragment <em>Textfragment</em>}</li>
 *   <li>{@link qualitypatternmodel.textrepresentation.impl.PatternTextImpl#getName <em>Name</em>}</li>
 *   <li>{@link qualitypatternmodel.textrepresentation.impl.PatternTextImpl#getParameterPredefinitions <em>Parameter Predefinitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternTextImpl extends MinimalEObjectImpl.Container implements PatternText {
	/**
	 * The cached value of the '{@link #getTextfragment() <em>Textfragment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * The fragments of the textual representation of a pattern.
	 * <!-- end-user-doc -->
	 * @see #getTextfragment()
	 * @generated
	 * @ordered
	 */
	protected EList<Fragment> textfragment;

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
	public EList<Fragment> getTextfragment() {
		if (textfragment == null) {
			textfragment = new EObjectContainmentWithInverseEList<Fragment>(Fragment.class, this, TextrepresentationPackage.PATTERN_TEXT__TEXTFRAGMENT, TextrepresentationPackage.FRAGMENT__PATTERN_TEXT);
		}
		return textfragment;
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
	public String generateJSON() {
		String json = "{\n";
		json += "\n\"PatternName\": \"" + getPattern().getName() + "\",";
		json += "\n\"PatternTextName\": \"" + getName() + "\","; 
		json+= "\n\"Fragments\" : [";
		for(Fragment f : getTextfragment()) {
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
	public void isValid() throws InvalidityException {
		List<Parameter> referencedParameters = new ArrayList<Parameter>();
		for(Fragment f : getTextfragment()) {
			if(f instanceof ParameterFragment) {
				ParameterFragment p = (ParameterFragment) f;
				referencedParameters.add(p.getParameter());
			}
		}
		for(ParameterPredefinition p : getParameterPredefinitions()) {
			referencedParameters.add(p.getParameter());			
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
							rootRelation &= relation instanceof XmlRoot;
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
			throw new InvalidityException("pattern text does not reference all parameters");
		}
		if(!patternParametersNonPredefined.containsAll(referencedParameters)) {
			throw new InvalidityException("pattern text references invalid parameters");
		}
		
		Set<Parameter> referencedParametersSet = new HashSet<>(referencedParameters);
		if(referencedParameters.size() != referencedParametersSet.size()) {
			throw new InvalidityException("pattern text references parameters multiple times");
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
		isValid();
		for(PatternText text : getPattern().getText()) {
			if(!text.equals(this)) {
				text.delete();
			}
		}
		for(ParameterPredefinition p : getParameterPredefinitions()) {
			p.getParameter().setValueFromString(p.getValue());
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
		for(Fragment fragment : getTextfragment()) {
			if(fragment instanceof ParameterFragment) {
				ParameterFragment parameterFragment = (ParameterFragment) fragment;
				parameterFragment.setParameter(null);
			}
		}
		for(ParameterPredefinition p : getParameterPredefinitions()) {
			p.setParameter(null);		
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
			case TextrepresentationPackage.PATTERN_TEXT__PATTERN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPattern((CompletePattern)otherEnd, msgs);
			case TextrepresentationPackage.PATTERN_TEXT__TEXTFRAGMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTextfragment()).basicAdd(otherEnd, msgs);
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
			case TextrepresentationPackage.PATTERN_TEXT__TEXTFRAGMENT:
				return ((InternalEList<?>)getTextfragment()).basicRemove(otherEnd, msgs);
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
			case TextrepresentationPackage.PATTERN_TEXT__TEXTFRAGMENT:
				return getTextfragment();
			case TextrepresentationPackage.PATTERN_TEXT__NAME:
				return getName();
			case TextrepresentationPackage.PATTERN_TEXT__PARAMETER_PREDEFINITIONS:
				return getParameterPredefinitions();
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
			case TextrepresentationPackage.PATTERN_TEXT__TEXTFRAGMENT:
				getTextfragment().clear();
				getTextfragment().addAll((Collection<? extends Fragment>)newValue);
				return;
			case TextrepresentationPackage.PATTERN_TEXT__NAME:
				setName((String)newValue);
				return;
			case TextrepresentationPackage.PATTERN_TEXT__PARAMETER_PREDEFINITIONS:
				getParameterPredefinitions().clear();
				getParameterPredefinitions().addAll((Collection<? extends ParameterPredefinition>)newValue);
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
			case TextrepresentationPackage.PATTERN_TEXT__TEXTFRAGMENT:
				getTextfragment().clear();
				return;
			case TextrepresentationPackage.PATTERN_TEXT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TextrepresentationPackage.PATTERN_TEXT__PARAMETER_PREDEFINITIONS:
				getParameterPredefinitions().clear();
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
			case TextrepresentationPackage.PATTERN_TEXT__TEXTFRAGMENT:
				return textfragment != null && !textfragment.isEmpty();
			case TextrepresentationPackage.PATTERN_TEXT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TextrepresentationPackage.PATTERN_TEXT__PARAMETER_PREDEFINITIONS:
				return parameterPredefinitions != null && !parameterPredefinitions.isEmpty();
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
			case TextrepresentationPackage.PATTERN_TEXT___IS_VALID:
				try {
					isValid();
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
