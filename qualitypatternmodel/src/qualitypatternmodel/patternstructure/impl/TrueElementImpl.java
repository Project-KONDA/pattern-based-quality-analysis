/**
 */
package qualitypatternmodel.patternstructure.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.execution.XmlDatabase;
import qualitypatternmodel.patternstructure.MorphismContainer;
import qualitypatternmodel.patternstructure.AbstractionLevel;
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
	public String generateQuery() throws InvalidityException {
		return "true()";
	}
	
	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) {}

	@Override
	public void recordValues(XmlDatabase database) {}
	
	@Override
	public EList<MorphismContainer> getNextMorphismContainers() {
		return new BasicEList<MorphismContainer>();
	}	
	
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
		return "TRUE";
	}

} //TrueImpl
