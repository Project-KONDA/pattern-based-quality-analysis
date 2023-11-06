/**
 */
package qualitypatternmodel.patternstructure.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.javaquery.JavaFilterPart;
import qualitypatternmodel.patternstructure.MorphismContainer;
import qualitypatternmodel.patternstructure.PatternElement;
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
	public JavaFilterPart generateQueryFilterPart() throws InvalidityException {
		return null;
	}
	
	
	@Override
	public String generateXQuery() throws InvalidityException {
		return "true()";
	}
	
	@Override
	public String generateSparql() throws InvalidityException {
		return "";
	}
	
	@Override 
	public String generateCypher() throws InvalidityException {
		return new String(); 
	}
	
	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) {}

	@Override
	public void recordValues(XmlDataDatabase database) {}
	
	@Override
	public EList<MorphismContainer> getNextMorphismContainers() {
		return new BasicEList<MorphismContainer>();
	}	
	
	@Override
	public EList<PatternElement> prepareParameterUpdates() {
		return new BasicEList<PatternElement>();
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
