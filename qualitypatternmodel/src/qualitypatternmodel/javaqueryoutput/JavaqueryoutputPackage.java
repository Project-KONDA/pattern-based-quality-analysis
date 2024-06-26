/**
 */
package qualitypatternmodel.javaqueryoutput;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.javaqueryoutput.JavaqueryoutputFactory
 * @model kind="package"
 * @generated
 */
public interface JavaqueryoutputPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "javaqueryoutput";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "javaqueryoutput";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "javaqueryoutput";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaqueryoutputPackage eINSTANCE = qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl.init();

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaqueryoutput.impl.InterimResultStructureImpl <em>Interim Result Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaqueryoutput.impl.InterimResultStructureImpl
	 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getInterimResultStructure()
	 * @generated
	 */
	int INTERIM_RESULT_STRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Substructure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_RESULT_STRUCTURE__SUBSTRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Record</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_RESULT_STRUCTURE__RECORD = 1;

	/**
	 * The number of structural features of the '<em>Interim Result Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_RESULT_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>To Json</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_RESULT_STRUCTURE___TO_JSON = 0;

	/**
	 * The number of operations of the '<em>Interim Result Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_RESULT_STRUCTURE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaqueryoutput.impl.InterimResultPartImpl <em>Interim Result Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaqueryoutput.impl.InterimResultPartImpl
	 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getInterimResultPart()
	 * @generated
	 */
	int INTERIM_RESULT_PART = 1;

	/**
	 * The number of structural features of the '<em>Interim Result Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_RESULT_PART_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>To Json</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_RESULT_PART___TO_JSON = 0;

	/**
	 * The number of operations of the '<em>Interim Result Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_RESULT_PART_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaqueryoutput.impl.ContainerInterimImpl <em>Container Interim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaqueryoutput.impl.ContainerInterimImpl
	 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getContainerInterim()
	 * @generated
	 */
	int CONTAINER_INTERIM = 2;

	/**
	 * The number of structural features of the '<em>Container Interim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INTERIM_FEATURE_COUNT = INTERIM_RESULT_PART_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To Json</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INTERIM___TO_JSON = INTERIM_RESULT_PART___TO_JSON;

	/**
	 * The operation id for the '<em>Get Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INTERIM___GET_SIZE = INTERIM_RESULT_PART_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Container Interim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INTERIM_OPERATION_COUNT = INTERIM_RESULT_PART_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaqueryoutput.impl.ValueInterimImpl <em>Value Interim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaqueryoutput.impl.ValueInterimImpl
	 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getValueInterim()
	 * @generated
	 */
	int VALUE_INTERIM = 3;

	/**
	 * The number of structural features of the '<em>Value Interim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_INTERIM_FEATURE_COUNT = INTERIM_RESULT_PART_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To Json</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_INTERIM___TO_JSON = INTERIM_RESULT_PART___TO_JSON;

	/**
	 * The number of operations of the '<em>Value Interim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_INTERIM_OPERATION_COUNT = INTERIM_RESULT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaqueryoutput.impl.VariableContainerInterimImpl <em>Variable Container Interim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaqueryoutput.impl.VariableContainerInterimImpl
	 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getVariableContainerInterim()
	 * @generated
	 */
	int VARIABLE_CONTAINER_INTERIM = 4;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CONTAINER_INTERIM__CONTAINED = CONTAINER_INTERIM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Container Interim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CONTAINER_INTERIM_FEATURE_COUNT = CONTAINER_INTERIM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>To Json</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CONTAINER_INTERIM___TO_JSON = CONTAINER_INTERIM___TO_JSON;

	/**
	 * The operation id for the '<em>Get Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CONTAINER_INTERIM___GET_SIZE = CONTAINER_INTERIM___GET_SIZE;

	/**
	 * The number of operations of the '<em>Variable Container Interim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CONTAINER_INTERIM_OPERATION_COUNT = CONTAINER_INTERIM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaqueryoutput.impl.FixedContainerInterimImpl <em>Fixed Container Interim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaqueryoutput.impl.FixedContainerInterimImpl
	 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getFixedContainerInterim()
	 * @generated
	 */
	int FIXED_CONTAINER_INTERIM = 5;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_CONTAINER_INTERIM__CONTAINED = CONTAINER_INTERIM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Can Be Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_CONTAINER_INTERIM__CAN_BE_EMPTY = CONTAINER_INTERIM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fixed Container Interim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_CONTAINER_INTERIM_FEATURE_COUNT = CONTAINER_INTERIM_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>To Json</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_CONTAINER_INTERIM___TO_JSON = CONTAINER_INTERIM___TO_JSON;

	/**
	 * The operation id for the '<em>Get Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_CONTAINER_INTERIM___GET_SIZE = CONTAINER_INTERIM___GET_SIZE;

	/**
	 * The number of operations of the '<em>Fixed Container Interim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_CONTAINER_INTERIM_OPERATION_COUNT = CONTAINER_INTERIM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaqueryoutput.impl.InterimResultImpl <em>Interim Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaqueryoutput.impl.InterimResultImpl
	 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getInterimResult()
	 * @generated
	 */
	int INTERIM_RESULT = 6;

	/**
	 * The feature id for the '<em><b>Corresponds To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_RESULT__CORRESPONDS_TO = 0;

	/**
	 * The number of structural features of the '<em>Interim Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_RESULT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Set Corresponding</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_RESULT___SET_CORRESPONDING__INTERIMRESULTPART = 0;

	/**
	 * The operation id for the '<em>Is Valid To Corresponding</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_RESULT___IS_VALID_TO_CORRESPONDING = 1;

	/**
	 * The number of operations of the '<em>Interim Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_RESULT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaqueryoutput.impl.ContainerResultImpl <em>Container Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaqueryoutput.impl.ContainerResultImpl
	 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getContainerResult()
	 * @generated
	 */
	int CONTAINER_RESULT = 7;

	/**
	 * The feature id for the '<em><b>Corresponds To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_RESULT__CORRESPONDS_TO = INTERIM_RESULT__CORRESPONDS_TO;

	/**
	 * The feature id for the '<em><b>Subresult</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_RESULT__SUBRESULT = INTERIM_RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tagname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_RESULT__TAGNAME = INTERIM_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_RESULT_FEATURE_COUNT = INTERIM_RESULT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Corresponding</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_RESULT___SET_CORRESPONDING__INTERIMRESULTPART = INTERIM_RESULT___SET_CORRESPONDING__INTERIMRESULTPART;

	/**
	 * The operation id for the '<em>Is Valid To Corresponding</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_RESULT___IS_VALID_TO_CORRESPONDING = INTERIM_RESULT___IS_VALID_TO_CORRESPONDING;

	/**
	 * The operation id for the '<em>Stream</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_RESULT___STREAM__STRING = INTERIM_RESULT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Container Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_RESULT_OPERATION_COUNT = INTERIM_RESULT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaqueryoutput.impl.ValueResultImpl <em>Value Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaqueryoutput.impl.ValueResultImpl
	 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getValueResult()
	 * @generated
	 */
	int VALUE_RESULT = 8;

	/**
	 * The feature id for the '<em><b>Corresponds To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESULT__CORRESPONDS_TO = INTERIM_RESULT__CORRESPONDS_TO;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESULT__VALUE = INTERIM_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESULT_FEATURE_COUNT = INTERIM_RESULT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Corresponding</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESULT___SET_CORRESPONDING__INTERIMRESULTPART = INTERIM_RESULT___SET_CORRESPONDING__INTERIMRESULTPART;

	/**
	 * The operation id for the '<em>Is Valid To Corresponding</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESULT___IS_VALID_TO_CORRESPONDING = INTERIM_RESULT___IS_VALID_TO_CORRESPONDING;

	/**
	 * The number of operations of the '<em>Value Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESULT_OPERATION_COUNT = INTERIM_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaqueryoutput.impl.InterimResultContainerImpl <em>Interim Result Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaqueryoutput.impl.InterimResultContainerImpl
	 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getInterimResultContainer()
	 * @generated
	 */
	int INTERIM_RESULT_CONTAINER = 9;

	/**
	 * The feature id for the '<em><b>Corresponds To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_RESULT_CONTAINER__CORRESPONDS_TO = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_RESULT_CONTAINER__PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_RESULT_CONTAINER__RETURN = 2;

	/**
	 * The number of structural features of the '<em>Interim Result Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_RESULT_CONTAINER_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Is Valid To Structure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_RESULT_CONTAINER___IS_VALID_TO_STRUCTURE = 0;

	/**
	 * The operation id for the '<em>Stream</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_RESULT_CONTAINER___STREAM__STRING = 1;

	/**
	 * The number of operations of the '<em>Interim Result Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_RESULT_CONTAINER_OPERATION_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaqueryoutput.InterimResultStructure <em>Interim Result Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interim Result Structure</em>'.
	 * @see qualitypatternmodel.javaqueryoutput.InterimResultStructure
	 * @generated
	 */
	EClass getInterimResultStructure();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.javaqueryoutput.InterimResultStructure#getSubstructure <em>Substructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Substructure</em>'.
	 * @see qualitypatternmodel.javaqueryoutput.InterimResultStructure#getSubstructure()
	 * @see #getInterimResultStructure()
	 * @generated
	 */
	EReference getInterimResultStructure_Substructure();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.javaqueryoutput.InterimResultStructure#getRecord <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Record</em>'.
	 * @see qualitypatternmodel.javaqueryoutput.InterimResultStructure#getRecord()
	 * @see #getInterimResultStructure()
	 * @generated
	 */
	EReference getInterimResultStructure_Record();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.javaqueryoutput.InterimResultStructure#toJson() <em>To Json</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Json</em>' operation.
	 * @see qualitypatternmodel.javaqueryoutput.InterimResultStructure#toJson()
	 * @generated
	 */
	EOperation getInterimResultStructure__ToJson();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaqueryoutput.InterimResultPart <em>Interim Result Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interim Result Part</em>'.
	 * @see qualitypatternmodel.javaqueryoutput.InterimResultPart
	 * @generated
	 */
	EClass getInterimResultPart();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.javaqueryoutput.InterimResultPart#toJson() <em>To Json</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Json</em>' operation.
	 * @see qualitypatternmodel.javaqueryoutput.InterimResultPart#toJson()
	 * @generated
	 */
	EOperation getInterimResultPart__ToJson();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaqueryoutput.ContainerInterim <em>Container Interim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Interim</em>'.
	 * @see qualitypatternmodel.javaqueryoutput.ContainerInterim
	 * @generated
	 */
	EClass getContainerInterim();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.javaqueryoutput.ContainerInterim#getSize() <em>Get Size</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Size</em>' operation.
	 * @see qualitypatternmodel.javaqueryoutput.ContainerInterim#getSize()
	 * @generated
	 */
	EOperation getContainerInterim__GetSize();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaqueryoutput.ValueInterim <em>Value Interim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Interim</em>'.
	 * @see qualitypatternmodel.javaqueryoutput.ValueInterim
	 * @generated
	 */
	EClass getValueInterim();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaqueryoutput.VariableContainerInterim <em>Variable Container Interim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Container Interim</em>'.
	 * @see qualitypatternmodel.javaqueryoutput.VariableContainerInterim
	 * @generated
	 */
	EClass getVariableContainerInterim();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.javaqueryoutput.VariableContainerInterim#getContained <em>Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contained</em>'.
	 * @see qualitypatternmodel.javaqueryoutput.VariableContainerInterim#getContained()
	 * @see #getVariableContainerInterim()
	 * @generated
	 */
	EReference getVariableContainerInterim_Contained();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaqueryoutput.FixedContainerInterim <em>Fixed Container Interim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Container Interim</em>'.
	 * @see qualitypatternmodel.javaqueryoutput.FixedContainerInterim
	 * @generated
	 */
	EClass getFixedContainerInterim();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.javaqueryoutput.FixedContainerInterim#getContained <em>Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained</em>'.
	 * @see qualitypatternmodel.javaqueryoutput.FixedContainerInterim#getContained()
	 * @see #getFixedContainerInterim()
	 * @generated
	 */
	EReference getFixedContainerInterim_Contained();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.javaqueryoutput.FixedContainerInterim#getCanBeEmpty <em>Can Be Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Be Empty</em>'.
	 * @see qualitypatternmodel.javaqueryoutput.FixedContainerInterim#getCanBeEmpty()
	 * @see #getFixedContainerInterim()
	 * @generated
	 */
	EAttribute getFixedContainerInterim_CanBeEmpty();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaqueryoutput.InterimResult <em>Interim Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interim Result</em>'.
	 * @see qualitypatternmodel.javaqueryoutput.InterimResult
	 * @generated
	 */
	EClass getInterimResult();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.javaqueryoutput.InterimResult#getCorrespondsTo <em>Corresponds To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Corresponds To</em>'.
	 * @see qualitypatternmodel.javaqueryoutput.InterimResult#getCorrespondsTo()
	 * @see #getInterimResult()
	 * @generated
	 */
	EReference getInterimResult_CorrespondsTo();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.javaqueryoutput.InterimResult#setCorresponding(qualitypatternmodel.javaqueryoutput.InterimResultPart) <em>Set Corresponding</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Corresponding</em>' operation.
	 * @see qualitypatternmodel.javaqueryoutput.InterimResult#setCorresponding(qualitypatternmodel.javaqueryoutput.InterimResultPart)
	 * @generated
	 */
	EOperation getInterimResult__SetCorresponding__InterimResultPart();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.javaqueryoutput.InterimResult#isValidToCorresponding() <em>Is Valid To Corresponding</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid To Corresponding</em>' operation.
	 * @see qualitypatternmodel.javaqueryoutput.InterimResult#isValidToCorresponding()
	 * @generated
	 */
	EOperation getInterimResult__IsValidToCorresponding();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaqueryoutput.ContainerResult <em>Container Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Result</em>'.
	 * @see qualitypatternmodel.javaqueryoutput.ContainerResult
	 * @generated
	 */
	EClass getContainerResult();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.javaqueryoutput.ContainerResult#getSubresult <em>Subresult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subresult</em>'.
	 * @see qualitypatternmodel.javaqueryoutput.ContainerResult#getSubresult()
	 * @see #getContainerResult()
	 * @generated
	 */
	EReference getContainerResult_Subresult();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.javaqueryoutput.ContainerResult#getTagname <em>Tagname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tagname</em>'.
	 * @see qualitypatternmodel.javaqueryoutput.ContainerResult#getTagname()
	 * @see #getContainerResult()
	 * @generated
	 */
	EAttribute getContainerResult_Tagname();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.javaqueryoutput.ContainerResult#stream(java.lang.String) <em>Stream</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stream</em>' operation.
	 * @see qualitypatternmodel.javaqueryoutput.ContainerResult#stream(java.lang.String)
	 * @generated
	 */
	EOperation getContainerResult__Stream__String();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaqueryoutput.ValueResult <em>Value Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Result</em>'.
	 * @see qualitypatternmodel.javaqueryoutput.ValueResult
	 * @generated
	 */
	EClass getValueResult();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.javaqueryoutput.ValueResult#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see qualitypatternmodel.javaqueryoutput.ValueResult#getValue()
	 * @see #getValueResult()
	 * @generated
	 */
	EAttribute getValueResult_Value();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaqueryoutput.InterimResultContainer <em>Interim Result Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interim Result Container</em>'.
	 * @see qualitypatternmodel.javaqueryoutput.InterimResultContainer
	 * @generated
	 */
	EClass getInterimResultContainer();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.javaqueryoutput.InterimResultContainer#getCorrespondsTo <em>Corresponds To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Corresponds To</em>'.
	 * @see qualitypatternmodel.javaqueryoutput.InterimResultContainer#getCorrespondsTo()
	 * @see #getInterimResultContainer()
	 * @generated
	 */
	EReference getInterimResultContainer_CorrespondsTo();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.javaqueryoutput.InterimResultContainer#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter</em>'.
	 * @see qualitypatternmodel.javaqueryoutput.InterimResultContainer#getParameter()
	 * @see #getInterimResultContainer()
	 * @generated
	 */
	EReference getInterimResultContainer_Parameter();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.javaqueryoutput.InterimResultContainer#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see qualitypatternmodel.javaqueryoutput.InterimResultContainer#getReturn()
	 * @see #getInterimResultContainer()
	 * @generated
	 */
	EReference getInterimResultContainer_Return();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.javaqueryoutput.InterimResultContainer#isValidToStructure() <em>Is Valid To Structure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid To Structure</em>' operation.
	 * @see qualitypatternmodel.javaqueryoutput.InterimResultContainer#isValidToStructure()
	 * @generated
	 */
	EOperation getInterimResultContainer__IsValidToStructure();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.javaqueryoutput.InterimResultContainer#stream(java.lang.String) <em>Stream</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stream</em>' operation.
	 * @see qualitypatternmodel.javaqueryoutput.InterimResultContainer#stream(java.lang.String)
	 * @generated
	 */
	EOperation getInterimResultContainer__Stream__String();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JavaqueryoutputFactory getJavaqueryoutputFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaqueryoutput.impl.InterimResultStructureImpl <em>Interim Result Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaqueryoutput.impl.InterimResultStructureImpl
		 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getInterimResultStructure()
		 * @generated
		 */
		EClass INTERIM_RESULT_STRUCTURE = eINSTANCE.getInterimResultStructure();

		/**
		 * The meta object literal for the '<em><b>Substructure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERIM_RESULT_STRUCTURE__SUBSTRUCTURE = eINSTANCE.getInterimResultStructure_Substructure();

		/**
		 * The meta object literal for the '<em><b>Record</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERIM_RESULT_STRUCTURE__RECORD = eINSTANCE.getInterimResultStructure_Record();

		/**
		 * The meta object literal for the '<em><b>To Json</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERIM_RESULT_STRUCTURE___TO_JSON = eINSTANCE.getInterimResultStructure__ToJson();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaqueryoutput.impl.InterimResultPartImpl <em>Interim Result Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaqueryoutput.impl.InterimResultPartImpl
		 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getInterimResultPart()
		 * @generated
		 */
		EClass INTERIM_RESULT_PART = eINSTANCE.getInterimResultPart();

		/**
		 * The meta object literal for the '<em><b>To Json</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERIM_RESULT_PART___TO_JSON = eINSTANCE.getInterimResultPart__ToJson();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaqueryoutput.impl.ContainerInterimImpl <em>Container Interim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaqueryoutput.impl.ContainerInterimImpl
		 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getContainerInterim()
		 * @generated
		 */
		EClass CONTAINER_INTERIM = eINSTANCE.getContainerInterim();

		/**
		 * The meta object literal for the '<em><b>Get Size</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER_INTERIM___GET_SIZE = eINSTANCE.getContainerInterim__GetSize();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaqueryoutput.impl.ValueInterimImpl <em>Value Interim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaqueryoutput.impl.ValueInterimImpl
		 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getValueInterim()
		 * @generated
		 */
		EClass VALUE_INTERIM = eINSTANCE.getValueInterim();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaqueryoutput.impl.VariableContainerInterimImpl <em>Variable Container Interim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaqueryoutput.impl.VariableContainerInterimImpl
		 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getVariableContainerInterim()
		 * @generated
		 */
		EClass VARIABLE_CONTAINER_INTERIM = eINSTANCE.getVariableContainerInterim();

		/**
		 * The meta object literal for the '<em><b>Contained</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_CONTAINER_INTERIM__CONTAINED = eINSTANCE.getVariableContainerInterim_Contained();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaqueryoutput.impl.FixedContainerInterimImpl <em>Fixed Container Interim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaqueryoutput.impl.FixedContainerInterimImpl
		 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getFixedContainerInterim()
		 * @generated
		 */
		EClass FIXED_CONTAINER_INTERIM = eINSTANCE.getFixedContainerInterim();

		/**
		 * The meta object literal for the '<em><b>Contained</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_CONTAINER_INTERIM__CONTAINED = eINSTANCE.getFixedContainerInterim_Contained();

		/**
		 * The meta object literal for the '<em><b>Can Be Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_CONTAINER_INTERIM__CAN_BE_EMPTY = eINSTANCE.getFixedContainerInterim_CanBeEmpty();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaqueryoutput.impl.InterimResultImpl <em>Interim Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaqueryoutput.impl.InterimResultImpl
		 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getInterimResult()
		 * @generated
		 */
		EClass INTERIM_RESULT = eINSTANCE.getInterimResult();

		/**
		 * The meta object literal for the '<em><b>Corresponds To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERIM_RESULT__CORRESPONDS_TO = eINSTANCE.getInterimResult_CorrespondsTo();

		/**
		 * The meta object literal for the '<em><b>Set Corresponding</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERIM_RESULT___SET_CORRESPONDING__INTERIMRESULTPART = eINSTANCE.getInterimResult__SetCorresponding__InterimResultPart();

		/**
		 * The meta object literal for the '<em><b>Is Valid To Corresponding</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERIM_RESULT___IS_VALID_TO_CORRESPONDING = eINSTANCE.getInterimResult__IsValidToCorresponding();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaqueryoutput.impl.ContainerResultImpl <em>Container Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaqueryoutput.impl.ContainerResultImpl
		 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getContainerResult()
		 * @generated
		 */
		EClass CONTAINER_RESULT = eINSTANCE.getContainerResult();

		/**
		 * The meta object literal for the '<em><b>Subresult</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_RESULT__SUBRESULT = eINSTANCE.getContainerResult_Subresult();

		/**
		 * The meta object literal for the '<em><b>Tagname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_RESULT__TAGNAME = eINSTANCE.getContainerResult_Tagname();

		/**
		 * The meta object literal for the '<em><b>Stream</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER_RESULT___STREAM__STRING = eINSTANCE.getContainerResult__Stream__String();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaqueryoutput.impl.ValueResultImpl <em>Value Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaqueryoutput.impl.ValueResultImpl
		 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getValueResult()
		 * @generated
		 */
		EClass VALUE_RESULT = eINSTANCE.getValueResult();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_RESULT__VALUE = eINSTANCE.getValueResult_Value();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaqueryoutput.impl.InterimResultContainerImpl <em>Interim Result Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaqueryoutput.impl.InterimResultContainerImpl
		 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getInterimResultContainer()
		 * @generated
		 */
		EClass INTERIM_RESULT_CONTAINER = eINSTANCE.getInterimResultContainer();

		/**
		 * The meta object literal for the '<em><b>Corresponds To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERIM_RESULT_CONTAINER__CORRESPONDS_TO = eINSTANCE.getInterimResultContainer_CorrespondsTo();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERIM_RESULT_CONTAINER__PARAMETER = eINSTANCE.getInterimResultContainer_Parameter();

		/**
		 * The meta object literal for the '<em><b>Return</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERIM_RESULT_CONTAINER__RETURN = eINSTANCE.getInterimResultContainer_Return();

		/**
		 * The meta object literal for the '<em><b>Is Valid To Structure</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERIM_RESULT_CONTAINER___IS_VALID_TO_STRUCTURE = eINSTANCE.getInterimResultContainer__IsValidToStructure();

		/**
		 * The meta object literal for the '<em><b>Stream</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERIM_RESULT_CONTAINER___STREAM__STRING = eINSTANCE.getInterimResultContainer__Stream__String();

	}

} //JavaqueryoutputPackage
