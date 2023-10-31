/**
 */
package qualitypatternmodel.outputstructure;

import org.eclipse.emf.ecore.EClass;
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
 * @see qualitypatternmodel.outputstructure.OutputstructureFactory
 * @model kind="package"
 * @generated
 */
public interface OutputstructurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "outputstructure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "outputstructure";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "outputstructure";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OutputstructurePackage eINSTANCE = qualitypatternmodel.outputstructure.impl.OutputstructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link qualitypatternmodel.outputstructure.impl.InterimResultsStructureImpl <em>Interim Results Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.outputstructure.impl.InterimResultsStructureImpl
	 * @see qualitypatternmodel.outputstructure.impl.OutputstructurePackageImpl#getInterimResultsStructure()
	 * @generated
	 */
	int INTERIM_RESULTS_STRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Substructure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_RESULTS_STRUCTURE__SUBSTRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Record</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_RESULTS_STRUCTURE__RECORD = 1;

	/**
	 * The number of structural features of the '<em>Interim Results Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_RESULTS_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interim Results Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_RESULTS_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.outputstructure.impl.InterimResultPartImpl <em>Interim Result Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.outputstructure.impl.InterimResultPartImpl
	 * @see qualitypatternmodel.outputstructure.impl.OutputstructurePackageImpl#getInterimResultPart()
	 * @generated
	 */
	int INTERIM_RESULT_PART = 2;

	/**
	 * The number of structural features of the '<em>Interim Result Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_RESULT_PART_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Interim Result Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_RESULT_PART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.outputstructure.impl.RecordInterimResultImpl <em>Record Interim Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.outputstructure.impl.RecordInterimResultImpl
	 * @see qualitypatternmodel.outputstructure.impl.OutputstructurePackageImpl#getRecordInterimResult()
	 * @generated
	 */
	int RECORD_INTERIM_RESULT = 1;

	/**
	 * The number of structural features of the '<em>Record Interim Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_INTERIM_RESULT_FEATURE_COUNT = INTERIM_RESULT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Record Interim Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_INTERIM_RESULT_OPERATION_COUNT = INTERIM_RESULT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.outputstructure.impl.InterimResultParamImpl <em>Interim Result Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.outputstructure.impl.InterimResultParamImpl
	 * @see qualitypatternmodel.outputstructure.impl.OutputstructurePackageImpl#getInterimResultParam()
	 * @generated
	 */
	int INTERIM_RESULT_PARAM = 3;

	/**
	 * The number of structural features of the '<em>Interim Result Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_RESULT_PARAM_FEATURE_COUNT = INTERIM_RESULT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interim Result Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_RESULT_PARAM_OPERATION_COUNT = INTERIM_RESULT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.outputstructure.impl.BooleanInterimResultParamImpl <em>Boolean Interim Result Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.outputstructure.impl.BooleanInterimResultParamImpl
	 * @see qualitypatternmodel.outputstructure.impl.OutputstructurePackageImpl#getBooleanInterimResultParam()
	 * @generated
	 */
	int BOOLEAN_INTERIM_RESULT_PARAM = 4;

	/**
	 * The number of structural features of the '<em>Boolean Interim Result Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INTERIM_RESULT_PARAM_FEATURE_COUNT = INTERIM_RESULT_PARAM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Interim Result Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_INTERIM_RESULT_PARAM_OPERATION_COUNT = INTERIM_RESULT_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.outputstructure.impl.ContainerInterimResultPartImpl <em>Container Interim Result Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.outputstructure.impl.ContainerInterimResultPartImpl
	 * @see qualitypatternmodel.outputstructure.impl.OutputstructurePackageImpl#getContainerInterimResultPart()
	 * @generated
	 */
	int CONTAINER_INTERIM_RESULT_PART = 5;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INTERIM_RESULT_PART__CONTAINED = INTERIM_RESULT_PARAM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container Interim Result Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INTERIM_RESULT_PART_FEATURE_COUNT = INTERIM_RESULT_PARAM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Container Interim Result Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INTERIM_RESULT_PART_OPERATION_COUNT = INTERIM_RESULT_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.outputstructure.impl.ValueListInterimResultPartImpl <em>Value List Interim Result Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.outputstructure.impl.ValueListInterimResultPartImpl
	 * @see qualitypatternmodel.outputstructure.impl.OutputstructurePackageImpl#getValueListInterimResultPart()
	 * @generated
	 */
	int VALUE_LIST_INTERIM_RESULT_PART = 6;

	/**
	 * The number of structural features of the '<em>Value List Interim Result Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST_INTERIM_RESULT_PART_FEATURE_COUNT = INTERIM_RESULT_PARAM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value List Interim Result Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LIST_INTERIM_RESULT_PART_OPERATION_COUNT = INTERIM_RESULT_PARAM_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.outputstructure.InterimResultsStructure <em>Interim Results Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interim Results Structure</em>'.
	 * @see qualitypatternmodel.outputstructure.InterimResultsStructure
	 * @generated
	 */
	EClass getInterimResultsStructure();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.outputstructure.InterimResultsStructure#getSubstructure <em>Substructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Substructure</em>'.
	 * @see qualitypatternmodel.outputstructure.InterimResultsStructure#getSubstructure()
	 * @see #getInterimResultsStructure()
	 * @generated
	 */
	EReference getInterimResultsStructure_Substructure();

	/**
	 * Returns the meta object for the containment reference '{@link qualitypatternmodel.outputstructure.InterimResultsStructure#getRecord <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Record</em>'.
	 * @see qualitypatternmodel.outputstructure.InterimResultsStructure#getRecord()
	 * @see #getInterimResultsStructure()
	 * @generated
	 */
	EReference getInterimResultsStructure_Record();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.outputstructure.RecordInterimResult <em>Record Interim Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Interim Result</em>'.
	 * @see qualitypatternmodel.outputstructure.RecordInterimResult
	 * @generated
	 */
	EClass getRecordInterimResult();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.outputstructure.InterimResultPart <em>Interim Result Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interim Result Part</em>'.
	 * @see qualitypatternmodel.outputstructure.InterimResultPart
	 * @generated
	 */
	EClass getInterimResultPart();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.outputstructure.InterimResultParam <em>Interim Result Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interim Result Param</em>'.
	 * @see qualitypatternmodel.outputstructure.InterimResultParam
	 * @generated
	 */
	EClass getInterimResultParam();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.outputstructure.BooleanInterimResultParam <em>Boolean Interim Result Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Interim Result Param</em>'.
	 * @see qualitypatternmodel.outputstructure.BooleanInterimResultParam
	 * @generated
	 */
	EClass getBooleanInterimResultParam();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.outputstructure.ContainerInterimResultPart <em>Container Interim Result Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Interim Result Part</em>'.
	 * @see qualitypatternmodel.outputstructure.ContainerInterimResultPart
	 * @generated
	 */
	EClass getContainerInterimResultPart();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.outputstructure.ContainerInterimResultPart#getContained <em>Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained</em>'.
	 * @see qualitypatternmodel.outputstructure.ContainerInterimResultPart#getContained()
	 * @see #getContainerInterimResultPart()
	 * @generated
	 */
	EReference getContainerInterimResultPart_Contained();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.outputstructure.ValueListInterimResultPart <em>Value List Interim Result Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value List Interim Result Part</em>'.
	 * @see qualitypatternmodel.outputstructure.ValueListInterimResultPart
	 * @generated
	 */
	EClass getValueListInterimResultPart();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OutputstructureFactory getOutputstructureFactory();

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
		 * The meta object literal for the '{@link qualitypatternmodel.outputstructure.impl.InterimResultsStructureImpl <em>Interim Results Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.outputstructure.impl.InterimResultsStructureImpl
		 * @see qualitypatternmodel.outputstructure.impl.OutputstructurePackageImpl#getInterimResultsStructure()
		 * @generated
		 */
		EClass INTERIM_RESULTS_STRUCTURE = eINSTANCE.getInterimResultsStructure();

		/**
		 * The meta object literal for the '<em><b>Substructure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERIM_RESULTS_STRUCTURE__SUBSTRUCTURE = eINSTANCE.getInterimResultsStructure_Substructure();

		/**
		 * The meta object literal for the '<em><b>Record</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERIM_RESULTS_STRUCTURE__RECORD = eINSTANCE.getInterimResultsStructure_Record();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.outputstructure.impl.RecordInterimResultImpl <em>Record Interim Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.outputstructure.impl.RecordInterimResultImpl
		 * @see qualitypatternmodel.outputstructure.impl.OutputstructurePackageImpl#getRecordInterimResult()
		 * @generated
		 */
		EClass RECORD_INTERIM_RESULT = eINSTANCE.getRecordInterimResult();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.outputstructure.impl.InterimResultPartImpl <em>Interim Result Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.outputstructure.impl.InterimResultPartImpl
		 * @see qualitypatternmodel.outputstructure.impl.OutputstructurePackageImpl#getInterimResultPart()
		 * @generated
		 */
		EClass INTERIM_RESULT_PART = eINSTANCE.getInterimResultPart();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.outputstructure.impl.InterimResultParamImpl <em>Interim Result Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.outputstructure.impl.InterimResultParamImpl
		 * @see qualitypatternmodel.outputstructure.impl.OutputstructurePackageImpl#getInterimResultParam()
		 * @generated
		 */
		EClass INTERIM_RESULT_PARAM = eINSTANCE.getInterimResultParam();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.outputstructure.impl.BooleanInterimResultParamImpl <em>Boolean Interim Result Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.outputstructure.impl.BooleanInterimResultParamImpl
		 * @see qualitypatternmodel.outputstructure.impl.OutputstructurePackageImpl#getBooleanInterimResultParam()
		 * @generated
		 */
		EClass BOOLEAN_INTERIM_RESULT_PARAM = eINSTANCE.getBooleanInterimResultParam();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.outputstructure.impl.ContainerInterimResultPartImpl <em>Container Interim Result Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.outputstructure.impl.ContainerInterimResultPartImpl
		 * @see qualitypatternmodel.outputstructure.impl.OutputstructurePackageImpl#getContainerInterimResultPart()
		 * @generated
		 */
		EClass CONTAINER_INTERIM_RESULT_PART = eINSTANCE.getContainerInterimResultPart();

		/**
		 * The meta object literal for the '<em><b>Contained</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_INTERIM_RESULT_PART__CONTAINED = eINSTANCE.getContainerInterimResultPart_Contained();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.outputstructure.impl.ValueListInterimResultPartImpl <em>Value List Interim Result Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.outputstructure.impl.ValueListInterimResultPartImpl
		 * @see qualitypatternmodel.outputstructure.impl.OutputstructurePackageImpl#getValueListInterimResultPart()
		 * @generated
		 */
		EClass VALUE_LIST_INTERIM_RESULT_PART = eINSTANCE.getValueListInterimResultPart();

	}

} //OutputstructurePackage
