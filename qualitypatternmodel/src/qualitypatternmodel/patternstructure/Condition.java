/**
 */
package qualitypatternmodel.patternstructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.Condition#getCondDepth <em>Cond Depth</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Condition#getGetNextQuantifiedConditions <em>Get Next Quantified Conditions</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCondition()
 * @model abstract="true"
 * @generated
 */
public interface Condition extends PatternElement {

	/**
	 * Returns the value of the '<em><b>Cond Depth</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond Depth</em>' attribute.
	 * @see #setCondDepth(int)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCondition_CondDepth()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getCondDepth();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Condition#getCondDepth <em>Cond Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond Depth</em>' attribute.
	 * @see #getCondDepth()
	 * @generated
	 */
	void setCondDepth(int value);

	/**
	 * Returns the value of the '<em><b>Get Next Quantified Conditions</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.patternstructure.QuantifiedCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Next Quantified Conditions</em>' reference list.
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCondition_GetNextQuantifiedConditions()
	 * @model volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\t\t\t\t\n\t\t\t\tif self.oclIsTypeOf(QuantifiedCondition) then \n\t\t\t\t\tSet{self.oclAsType(QuantifiedCondition)}\n\t\t\t\telse \n\t\t\t\t\tif self.oclIsTypeOf(Formula) then \t\t\t\t\t\n\t\t\t\t\t\tself.oclAsType(Formula).arguments-&gt;collect(element: Condition | element.getNextQuantifiedConditions)-&gt;asSet()\n\t\t\t\t\telse \n\t\t\t\t\t\tSet{}\n\t\t\t\t\tendif\n\t\t\t\tendif'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<QuantifiedCondition> getGetNextQuantifiedConditions();
} // Condition
