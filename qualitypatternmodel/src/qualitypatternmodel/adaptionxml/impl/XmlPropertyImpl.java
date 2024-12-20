/**
 */
package qualitypatternmodel.adaptionxml.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.XmlNode;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.impl.PrimitiveNodeImpl;
import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>XML
 * Property</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlPropertyImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlPropertyImpl#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XmlPropertyImpl extends PrimitiveNodeImpl implements XmlProperty {
	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<String> variables;
	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<XmlReference> references;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public XmlPropertyImpl() {
		super();
	}

	@Override
	public String generateXQuery() throws InvalidityException {
		return "";
	}

	@Override
	public void isValid(AbstractionLevel abstractionLevel)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (abstractionLevel.getValue() < AbstractionLevel.SEMI_ABSTRACT_VALUE) {
			throw new InvalidityException("non-generic class in generic pattern");
		}
		super.isValid(abstractionLevel);
	}

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		super.isValidLocal(abstractionLevel);

	}

	@Override
	public String translatePredicates() throws InvalidityException {
		String xPredicates = "";
		predicatesAreBeingTranslated = true;

		for (BooleanOperator predicate : predicates) {
			if (predicate.isTranslatable()) {
				xPredicates += "[" + predicate.generateXQuery() + "]";
			}
		}

		predicatesAreBeingTranslated = false;
		return xPredicates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String translateMultipleIncoming() {
		String xPredicates = "";
		for (int i = 0; i < getVariables().size()-1; i++) {
			xPredicates += "[. = " + getVariables().get(i) + "]";
		}
//		for(String v : getVariables()) {
//			xPredicates += "[. = " + v + "]";
//		}
		return xPredicates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<String> getXQueryRepresentation() throws InvalidityException {
		if (predicatesAreBeingTranslated) {
			BasicEList<String> list = new BasicEList<String>();
			list.add(".");
			return list;
		} else {
			if (translated) {
				return getVariables();
			} else {
				throw new InvalidityException("XmlProperty not yet translated");
			}
		}
	}

	@Override
	public String getName() {
		if (name == null || name.equals("")) {
			if (getInternalId() > -1) {
				name = "XmlProperty " + getInternalId();
				return name;
			}
		}
		return name;
	}

	@Override
	public PatternElement createXmlAdaption() throws InvalidityException {
		return this;
	}

	@Override
	public XmlProperty adaptAsXmlProperty() throws InvalidityException {
		return this;
	}

	@Override
	public boolean isTranslatable() {
		return translated;
	}

	@Override
	public Node makeGeneric() throws InvalidityException {
		throw new InvalidityException("This node can not become generic!");
	}

	@Override
	public void checkGeneric() throws InvalidityException {
		throw new InvalidityException("This node can not become generic!");
	}

	@Override

	public ComplexNode makeComplex() throws InvalidityException {
		throw new InvalidityException("This node can not become generic!");
	}

	@Override
	public void checkComplex() throws InvalidityException {
		throw new InvalidityException("This node can not become generic!");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionxmlPackage.Literals.XML_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getVariables() {
		if (variables == null) {
			variables = new EDataTypeUniqueEList<String>(String.class, this, AdaptionxmlPackage.XML_PROPERTY__VARIABLES);
		}
		return variables;
	}

	@Override
	public void initializeTranslation() {
		super.initializeTranslation();
		getVariables().clear();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XmlReference> getReferences() {
		if (references == null) {
			references = new EObjectWithInverseResolvingEList<XmlReference>(XmlReference.class, this, AdaptionxmlPackage.XML_PROPERTY__REFERENCES, AdaptionxmlPackage.XML_REFERENCE__PROPERTY);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionxmlPackage.XML_PROPERTY__REFERENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferences()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionxmlPackage.XML_PROPERTY__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptionxmlPackage.XML_PROPERTY__VARIABLES:
				return getVariables();
			case AdaptionxmlPackage.XML_PROPERTY__REFERENCES:
				return getReferences();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdaptionxmlPackage.XML_PROPERTY__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends String>)newValue);
				return;
			case AdaptionxmlPackage.XML_PROPERTY__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends XmlReference>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AdaptionxmlPackage.XML_PROPERTY__VARIABLES:
				getVariables().clear();
				return;
			case AdaptionxmlPackage.XML_PROPERTY__REFERENCES:
				getReferences().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AdaptionxmlPackage.XML_PROPERTY__VARIABLES:
				return variables != null && !variables.isEmpty();
			case AdaptionxmlPackage.XML_PROPERTY__REFERENCES:
				return references != null && !references.isEmpty();
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
		if (baseClass == XmlNode.class) {
			switch (derivedFeatureID) {
				case AdaptionxmlPackage.XML_PROPERTY__VARIABLES: return AdaptionxmlPackage.XML_NODE__VARIABLES;
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
		if (baseClass == XmlNode.class) {
			switch (baseFeatureID) {
				case AdaptionxmlPackage.XML_NODE__VARIABLES: return AdaptionxmlPackage.XML_PROPERTY__VARIABLES;
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
		if (baseClass == XmlNode.class) {
			switch (baseOperationID) {
				case AdaptionxmlPackage.XML_NODE___TRANSLATE_PREDICATES: return AdaptionxmlPackage.XML_PROPERTY___TRANSLATE_PREDICATES;
				case AdaptionxmlPackage.XML_NODE___GET_XQUERY_REPRESENTATION: return AdaptionxmlPackage.XML_PROPERTY___GET_XQUERY_REPRESENTATION;
				case AdaptionxmlPackage.XML_NODE___TRANSLATE_MULTIPLE_INCOMING: return AdaptionxmlPackage.XML_PROPERTY___TRANSLATE_MULTIPLE_INCOMING;
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
			case AdaptionxmlPackage.XML_PROPERTY___TRANSLATE_PREDICATES:
				try {
					return translatePredicates();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionxmlPackage.XML_PROPERTY___GET_XQUERY_REPRESENTATION:
				try {
					return getXQueryRepresentation();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionxmlPackage.XML_PROPERTY___TRANSLATE_MULTIPLE_INCOMING:
				return translateMultipleIncoming();
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
		result.append(" (variables: ");
		result.append(variables);
		result.append(')');
		return result.toString();
	}

} // XMLPropertyImpl
