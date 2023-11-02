/**
 */
package qualitypatternmodel.javaquery.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.javaquery.JavaqueryPackage;
import qualitypatternmodel.javaquery.NumberFilterElement;
import qualitypatternmodel.javaqueryoutput.InterimResultParam;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Filter Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NumberFilterElementImpl extends NumberFilterPartImpl implements NumberFilterElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberFilterElementImpl() {
		super();
	}

	public NumberFilterElementImpl(Double value) {
		super();
	}
	
	@Override
	public Double apply() {return null;};

	@Override
	public EList<InterimResultParam> getArguments() {
		return new BasicEList<InterimResultParam>();
	}
	
	
	
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryPackage.Literals.NUMBER_FILTER_ELEMENT;
	}

} //NumberFilterElementImpl
