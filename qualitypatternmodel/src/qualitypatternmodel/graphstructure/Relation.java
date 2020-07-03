/**
 */
package qualitypatternmodel.graphstructure;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.RelationMapping;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.Relation#getIncomingMapping <em>Incoming Mapping</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Relation#getOutgoingMappings <em>Outgoing Mappings</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Relation#getGraph <em>Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Relation#getSource <em>Source</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Relation#getTarget <em>Target</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Relation#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends PatternElement, Adaptable {
	/**
	 * Returns the value of the '<em><b>Outgoing Mappings</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.patternstructure.RelationMapping}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.RelationMapping#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Mappings</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getRelation_OutgoingMappings()
	 * @see qualitypatternmodel.patternstructure.RelationMapping#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<RelationMapping> getOutgoingMappings();

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Graph#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' container reference.
	 * @see #setGraph(Graph)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getRelation_Graph()
	 * @see qualitypatternmodel.graphstructure.Graph#getRelations
	 * @model opposite="relations" required="true" transient="false"
	 * @generated
	 */
	Graph getGraph();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Relation#getGraph <em>Graph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' container reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(Graph value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Element#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Element)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getRelation_Source()
	 * @see qualitypatternmodel.graphstructure.Element#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	Element getSource();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Relation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Element value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Element#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Element)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getRelation_Target()
	 * @see qualitypatternmodel.graphstructure.Element#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	Element getTarget();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Relation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Element value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getRelation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Relation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Incoming Mapping</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.RelationMapping#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Mapping</em>' reference.
	 * @see #setIncomingMapping(RelationMapping)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getRelation_IncomingMapping()
	 * @see qualitypatternmodel.patternstructure.RelationMapping#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	RelationMapping getIncomingMapping();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Relation#getIncomingMapping <em>Incoming Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Mapping</em>' reference.
	 * @see #getIncomingMapping()
	 * @generated
	 */
	void setIncomingMapping(RelationMapping value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeRelationFromPreviousGraphs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeMappingsToNext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void copyToNewNextGraphs(Element newRelationTo);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	XmlNavigation adaptAsXMLNavigation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	XmlReference adaptAsXMLReference();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setGraphSimple(Graph newGraph);

} // Relation
