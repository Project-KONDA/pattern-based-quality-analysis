/**
 */
package qualitypatternmodel.graphstructure;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.functions.Operator;
import qualitypatternmodel.functions.OperatorList;
import qualitypatternmodel.patternstructure.InvalidityException;
import qualitypatternmodel.patternstructure.MissingPatternContainerException;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.Graph#getReturnElements <em>Return Elements</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Graph#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Graph#getOperatorList <em>Operator List</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Graph#getGraphDepth <em>Graph Depth</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Graph#isReturnGraph <em>Return Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Graph#getGetAllElements <em>Get All Elements</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Graph#getGetAllRelations <em>Get All Relations</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Graph#getQuantifiedcondition <em>Quantifiedcondition</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Graph#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Return Elements</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.graphstructure.SingleElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Elements</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getGraph_ReturnElements()
	 * @model required="true"
	 * @generated
	 */
	EList<SingleElement> getReturnElements();

	/**
	 * Returns the value of the '<em><b>Root Element</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.SingleElement#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Element</em>' containment reference.
	 * @see #setRootElement(SingleElement)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getGraph_RootElement()
	 * @see qualitypatternmodel.graphstructure.SingleElement#getRoot
	 * @model opposite="root" containment="true" required="true"
	 * @generated
	 */
	SingleElement getRootElement();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Graph#getRootElement <em>Root Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Element</em>' containment reference.
	 * @see #getRootElement()
	 * @generated
	 */
	void setRootElement(SingleElement value);

	/**
	 * Returns the value of the '<em><b>Operator List</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.functions.OperatorList#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator List</em>' containment reference.
	 * @see #setOperatorList(OperatorList)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getGraph_OperatorList()
	 * @see qualitypatternmodel.functions.OperatorList#getGraph
	 * @model opposite="graph" containment="true" required="true"
	 * @generated
	 */
	OperatorList getOperatorList();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Graph#getOperatorList <em>Operator List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator List</em>' containment reference.
	 * @see #getOperatorList()
	 * @generated
	 */
	void setOperatorList(OperatorList value);

	/**
	 * Returns the value of the '<em><b>Graph Depth</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph Depth</em>' attribute.
	 * @see #setGraphDepth(int)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getGraph_GraphDepth()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getGraphDepth();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Graph#getGraphDepth <em>Graph Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph Depth</em>' attribute.
	 * @see #getGraphDepth()
	 * @generated
	 */
	void setGraphDepth(int value);

	/**
	 * Returns the value of the '<em><b>Return Graph</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Graph</em>' attribute.
	 * @see #setReturnGraph(boolean)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getGraph_ReturnGraph()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isReturnGraph();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Graph#isReturnGraph <em>Return Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Graph</em>' attribute.
	 * @see #isReturnGraph()
	 * @generated
	 */
	void setReturnGraph(boolean value);

	/**
	 * Returns the value of the '<em><b>Get All Elements</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.graphstructure.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get All Elements</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getGraph_GetAllElements()
	 * @model volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\n\t\t\t\tself.rootElement.getAllElements'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Element> getGetAllElements();

	/**
	 * Returns the value of the '<em><b>Get All Relations</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.graphstructure.Relation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get All Relations</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getGraph_GetAllRelations()
	 * @model volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\n\t\t\t\tself.rootElement.getAllRelations'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Relation> getGetAllRelations();

	/**
	 * Returns the value of the '<em><b>Quantifiedcondition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifiedcondition</em>' container reference.
	 * @see #setQuantifiedcondition(QuantifiedCondition)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getGraph_Quantifiedcondition()
	 * @see qualitypatternmodel.patternstructure.QuantifiedCondition#getGraph
	 * @model opposite="graph" transient="false"
	 * @generated
	 */
	QuantifiedCondition getQuantifiedcondition();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Graph#getQuantifiedcondition <em>Quantifiedcondition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantifiedcondition</em>' container reference.
	 * @see #getQuantifiedcondition()
	 * @generated
	 */
	void setQuantifiedcondition(QuantifiedCondition value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.Pattern#getReturnGraph <em>Return Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' container reference.
	 * @see #setPattern(Pattern)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getGraph_Pattern()
	 * @see qualitypatternmodel.patternstructure.Pattern#getReturnGraph
	 * @model opposite="returnGraph" transient="false"
	 * @generated
	 */
	Pattern getPattern();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Graph#getPattern <em>Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' container reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(Pattern value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	EList<Operator> getAllOperators() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.MissingPatternContainerException"
	 * @generated
	 */
	void copyGraph(Graph graph) throws MissingPatternContainerException;

} // Graph
