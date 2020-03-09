/**
 */
package qualitypatternmodel.patternstructure.impl;

import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.True;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>True</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TrueImpl extends ConditionImpl implements True {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrueImpl() {
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
		return PatternstructurePackage.Literals.TRUE;
	}
	
	@Override
	public String myToString() {
		return "true";
	}

} //TrueImpl
