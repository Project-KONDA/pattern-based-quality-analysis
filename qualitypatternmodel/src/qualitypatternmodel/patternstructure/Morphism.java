/**
 */
package qualitypatternmodel.patternstructure;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.graphstructure.Graph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Morphism</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.Morphism#getMappings <em>Mappings</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Morphism#getFrom <em>From</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Morphism#getTo <em>To</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Morphism#getMorphDepth <em>Morph Depth</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Morphism#getCheckSingleElementMappings <em>Check Single Element Mappings</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Morphism#getCheckRelationMappings <em>Check Relation Mappings</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphism()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='singleElementMappingsValid relationMappingsValid'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot singleElementMappingsValid='self.checkSingleElementMappings' relationMappingsValid='self.checkRelationMappings'"
 * @generated
 */
public interface Morphism extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.patternstructure.Mapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphism_Mappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mapping> getMappings();

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Graph)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphism_From()
	 * @model required="true"
	 * @generated
	 */
	Graph getFrom();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Morphism#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Graph value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Graph)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphism_To()
	 * @model required="true"
	 * @generated
	 */
	Graph getTo();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Morphism#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Graph value);

	/**
	 * Returns the value of the '<em><b>Morph Depth</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Morph Depth</em>' attribute.
	 * @see #setMorphDepth(int)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphism_MorphDepth()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getMorphDepth();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Morphism#getMorphDepth <em>Morph Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Morph Depth</em>' attribute.
	 * @see #getMorphDepth()
	 * @generated
	 */
	void setMorphDepth(int value);

	/**
	 * Returns the value of the '<em><b>Check Single Element Mappings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Single Element Mappings</em>' attribute.
	 * @see #setCheckSingleElementMappings(Boolean)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphism_CheckSingleElementMappings()
	 * @model volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\n\t\t\t\t\t\tself.mappings-&gt;select(f: Mapping | f.oclIsTypeOf(SingleElementMapping))-&gt;forAll(m : Mapping | self.from.getAllElements-&gt;includes(m.oclAsType(SingleElementMapping).from))\n\t\t\t\t\t\tand\n\t\t\t\t\t\tself.mappings-&gt;select(f: Mapping | f.oclIsTypeOf(SingleElementMapping))-&gt;forAll(m : Mapping | self.to.getAllElements-&gt;includes(m.oclAsType(SingleElementMapping).to))'"
	 * @generated
	 */
	Boolean getCheckSingleElementMappings();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Morphism#getCheckSingleElementMappings <em>Check Single Element Mappings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Single Element Mappings</em>' attribute.
	 * @see #getCheckSingleElementMappings()
	 * @generated
	 */
	void setCheckSingleElementMappings(Boolean value);

	/**
	 * Returns the value of the '<em><b>Check Relation Mappings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Relation Mappings</em>' attribute.
	 * @see #setCheckRelationMappings(Boolean)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphism_CheckRelationMappings()
	 * @model volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\n\t\t\t\t\t\tself.mappings-&gt;select(f: Mapping | f.oclIsTypeOf(RelationMapping))-&gt;forAll(m : Mapping | self.from.getAllRelations-&gt;includes(m.oclAsType(RelationMapping).from))\n\t\t\t\t\t\tand\n\t\t\t\t\t\tself.mappings-&gt;select(f: Mapping | f.oclIsTypeOf(RelationMapping))-&gt;forAll(m : Mapping | self.to.getAllRelations-&gt;includes(m.oclAsType(RelationMapping).to))'"
	 * @generated
	 */
	Boolean getCheckRelationMappings();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Morphism#getCheckRelationMappings <em>Check Relation Mappings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Relation Mappings</em>' attribute.
	 * @see #getCheckRelationMappings()
	 * @generated
	 */
	void setCheckRelationMappings(Boolean value);

} // Morphism
