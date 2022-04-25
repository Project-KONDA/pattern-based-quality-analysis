/**
 */
package qualitypatternmodel.patternstructure;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Relation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Morphism</b></em>'.
 * A map from the <code>source</code> to the <code>target</code> <code>Graph</code>, which is specified through the contained <code>mappings</code>. 
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.Morphism#getMappings <em>Mappings</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Morphism#getSource <em>Source</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Morphism#getTarget <em>Target</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Morphism#getMorphismContainer <em>Morphism Container</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphism()
 * @model
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
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Graph#getOutgoingMorphisms <em>Outgoing Morphisms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Graph)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphism_Source()
	 * @see qualitypatternmodel.graphstructure.Graph#getOutgoingMorphisms
	 * @model opposite="outgoingMorphisms" required="true"
	 * @generated
	 */
	Graph getSource();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Morphism#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Graph value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Graph#getIncomingMorphism <em>Incoming Morphism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Graph)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphism_Target()
	 * @see qualitypatternmodel.graphstructure.Graph#getIncomingMorphism
	 * @model opposite="incomingMorphism" required="true"
	 * @generated
	 */
	Graph getTarget();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Morphism#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Graph value);

	/**
	 * Returns the value of the '<em><b>Morphism Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.MorphismContainer#getMorphism <em>Morphism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Morphism Container</em>' container reference.
	 * @see #setMorphismContainer(MorphismContainer)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphism_MorphismContainer()
	 * @see qualitypatternmodel.patternstructure.MorphismContainer#getMorphism
	 * @model opposite="morphism" transient="false"
	 * @generated
	 */
	MorphismContainer getMorphismContainer();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Morphism#getMorphismContainer <em>Morphism Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Morphism Container</em>' container reference.
	 * @see #getMorphismContainer()
	 * @generated
	 */
	void setMorphismContainer(MorphismContainer value);

	/**
	 * <!-- begin-user-doc -->
	 * Checks for all contained <code>ElementMappings</code> whether their <code>source</code> of type <code>Element</code>
	 * is contained in the <code>source</code> <code>Graph</code> and their <code>target</code> is contained in the <code>target</code> <code>Graph</code>.
	 * 
	 * @throws InvalidityException if constraint is not fulfilled
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void checkElementMappings() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * Checks for all contained <code>RelationMappings</code> whether their <code>source</code> of type <code>Relation</code>
	 * is contained in the <code>source</code> <code>Graph</code> and their <code>target</code> is contained in the <code>target</code> <code>Graph</code>.
	 * 
	 * @throws InvalidityException if constraint is not fulfilled
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void checkRelationMappings() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * Checks if each <code>Relation</code> of the <code>source</code> <code>Graph</code>
	 * is involved in exactly one of the contained <code>RelationMappings</code>.
	 * 
	 * @throws InvalidityException if constraint is not fulfilled
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void checkRelationMappingsUniqueness() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * Checks if each <code>Element</code> of the <code>source</code> <code>Graph</code>
	 * is involved in exactly one of the contained <code>ElementMappings</code>.
	 * 
	 * @throws InvalidityException if constraint is not fulfilled
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void checkElementMappingsUniqueness() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * Creates a new <code>ElementMapping</code> with <code>from</code> as <code>source</code> and <code>to</code>
	 * as <code>target</code> and adds it to <code>mappings</code>. 
	 * 
	 * @return the created <code>ElementMapping</code> with <code>from</code> as <code>source</code> and <code>to</code> as <code>target</code>
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ElementMapping addMapping(Node from, Node to);

	/**
	 * <!-- begin-user-doc -->
	 * Creates a new <code>RelationMapping</code> with <code>from</code> as <code>source</code> and <code>to</code>
	 * as <code>target</code> and adds it to <code>mappings</code>. 
	 * 
	 * @return the created <code>RelationMapping</code> with <code>from</code> as <code>source</code> and <code>to</code> as <code>target</code>
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	RelationMapping addMapping(Relation from, Relation to);

	/**
	 * <!-- begin-user-doc -->
	 * Removes <code>Mappings</code> that have a <code>source</code> or <code>target</code> 
	 * that is not contained in the <code>source</code> or <code>target</code> <code>Graph</code> 
	 * of <code>this</code> from <code>mappings</code>.
	 * 
	 * <code>Mappings</code> are not removed if their <code>source</code> or <code>target</code> is null and the <code>source</code> or <code>target</code> <code>Graph</code> of <code>this</code>
	 * is null as well.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeInconsistentMappings();	

} // Morphism
