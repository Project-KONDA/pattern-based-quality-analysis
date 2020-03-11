/**
 */
package qualitypatternmodel.patternstructure.impl;

import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.TrueElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>True</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TrueElementImpl extends ConditionImpl implements TrueElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrueElementImpl() {
		super();
	}
	
	@Override
	public String toXQuery(Location location) throws InvalidityException {
		return "true()";
	}
	
	@Override
	public void isValidLocal(boolean isDefinedPattern) {}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternstructurePackage.Literals.TRUE_ELEMENT;
	}
	
	@Override
	public String myToString() {
		return "true";
	}

} //TrueImpl
