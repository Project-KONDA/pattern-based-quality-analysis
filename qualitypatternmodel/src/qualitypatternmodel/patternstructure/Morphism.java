/**
 */
package qualitypatternmodel.patternstructure;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.graphstructure.Graph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Morphism</b></em>'.
 * Describes the connections and correspondences between two graphes.
 * Contains mappings, which each does connect two graph elements. 
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.Morphism#getMorphDepth <em>Morph Depth</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Morphism#getCheckSingleElementMappings <em>Check Single Element Mappings</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Morphism#getCheckRelationMappings <em>Check Relation Mappings</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Morphism#getCheckSingleElementMappingsUniqueness <em>Check Single Element Mappings Uniqueness</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Morphism#getCheckRelationMappingsUniqueness <em>Check Relation Mappings Uniqueness</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Morphism#getMappings <em>Mappings</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Morphism#getFrom <em>From</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Morphism#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphism()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='singleElementMappingsValid relationMappingsValid singleElementMappingsUnique relationMappingsUnique'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot singleElementMappingsValid='self.checkSingleElementMappings' relationMappingsValid='self.checkRelationMappings' singleElementMappingsUnique='self.checkSingleElementMappingsUniqueness' relationMappingsUnique='self.checkRelationMappingsUniqueness'"
 * @generated
 */
public interface Morphism extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.patternstructure.Mapping}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.Mapping#getMorphism <em>Morphism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphism_Mappings()
	 * @see qualitypatternmodel.patternstructure.Mapping#getMorphism
	 * @model opposite="morphism" containment="true"
	 * @generated
	 */
	EList<Mapping> getMappings();

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Graph#getMorphismTo <em>Morphism To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Graph)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphism_From()
	 * @see qualitypatternmodel.graphstructure.Graph#getMorphismTo
	 * @model opposite="morphismTo" required="true"
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
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Graph#getMorphismFrom <em>Morphism From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Graph)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphism_To()
	 * @see qualitypatternmodel.graphstructure.Graph#getMorphismFrom
	 * @model opposite="morphismFrom" required="true"
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
	 * checks the validity of the contained SingleElementMappings
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Single Element Mappings</em>' attribute.
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphism_CheckSingleElementMappings()
	 * @model changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\n\t\t\t\t\t\tself.mappings-&gt;select(f: Mapping | f.oclIsTypeOf(SingleElementMapping))-&gt;forAll(m : Mapping | self.from.getAllElements-&gt;includes(m.oclAsType(SingleElementMapping).from))\n\t\t\t\t\t\tand\n\t\t\t\t\t\tself.mappings-&gt;select(f: Mapping | f.oclIsTypeOf(SingleElementMapping))-&gt;forAll(m : Mapping | self.to.getAllElements-&gt;includes(m.oclAsType(SingleElementMapping).to))'"
	 * @generated
	 */
	Boolean getCheckSingleElementMappings();

	/**
	 * Returns the value of the '<em><b>Check Relation Mappings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * checks the validity of the contained RelationMappings
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Relation Mappings</em>' attribute.
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphism_CheckRelationMappings()
	 * @model changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\n\t\t\t\t\t\tself.mappings-&gt;select(f: Mapping | f.oclIsTypeOf(RelationMapping))-&gt;forAll(m : Mapping | self.from.getAllRelations-&gt;includes(m.oclAsType(RelationMapping).from))\n\t\t\t\t\t\tand\n\t\t\t\t\t\tself.mappings-&gt;select(f: Mapping | f.oclIsTypeOf(RelationMapping))-&gt;forAll(m : Mapping | self.to.getAllRelations-&gt;includes(m.oclAsType(RelationMapping).to))'"
	 * @generated
	 */
	Boolean getCheckRelationMappings();

	/**
	 * Returns the value of the '<em><b>Check Single Element Mappings Uniqueness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * checks the uniqueness of the contained SingleElementMappings
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Single Element Mappings Uniqueness</em>' attribute.
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphism_CheckSingleElementMappingsUniqueness()
	 * @model changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\n\t\t\t\t\t\t\tself.mappings-&gt;select(f: Mapping | f.oclIsTypeOf(SingleElementMapping))-&gt;collect(m: Mapping | m.oclAsType(SingleElementMapping).from)-&gt;size()\n\t\t\t\t\t\t\t= self.mappings-&gt;select(f: Mapping | f.oclIsTypeOf(SingleElementMapping))-&gt;collect(m: Mapping | m.oclAsType(SingleElementMapping).from)-&gt;asSet()-&gt;size()\n\t\t\t\t\t\t\tand\n\t\t\t\t\t\t\tself.mappings-&gt;select(f: Mapping | f.oclIsTypeOf(SingleElementMapping))-&gt;collect(m: Mapping | m.oclAsType(SingleElementMapping).to)-&gt;size()\n\t\t\t\t\t\t\t= self.mappings-&gt;select(f: Mapping | f.oclIsTypeOf(SingleElementMapping))-&gt;collect(m: Mapping | m.oclAsType(SingleElementMapping).to)-&gt;asSet()-&gt;size()'"
	 * @generated
	 */
	Boolean getCheckSingleElementMappingsUniqueness();

	/**
	 * Returns the value of the '<em><b>Check Relation Mappings Uniqueness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * checks the uniqueness of the contained RelationMappings
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Relation Mappings Uniqueness</em>' attribute.
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphism_CheckRelationMappingsUniqueness()
	 * @model changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\n\t\t\t\t\t\t\tself.mappings-&gt;select(f: Mapping | f.oclIsTypeOf(RelationMapping))-&gt;collect(m: Mapping | m.oclAsType(RelationMapping).from)-&gt;size()\n\t\t\t\t\t\t\t= self.mappings-&gt;select(f: Mapping | f.oclIsTypeOf(RelationMapping))-&gt;collect(m: Mapping | m.oclAsType(RelationMapping).from)-&gt;asSet()-&gt;size()\n\t\t\t\t\t\t\tand\n\t\t\t\t\t\t\tself.mappings-&gt;select(f: Mapping | f.oclIsTypeOf(RelationMapping))-&gt;collect(m: Mapping | m.oclAsType(RelationMapping).to)-&gt;size()\n\t\t\t\t\t\t\t= self.mappings-&gt;select(f: Mapping | f.oclIsTypeOf(RelationMapping))-&gt;collect(m: Mapping | m.oclAsType(RelationMapping).to)-&gt;asSet()-&gt;size()'"
	 * @generated
	 */
	Boolean getCheckRelationMappingsUniqueness();

	void removeDanglingMappingReference();

	

} // Morphism
