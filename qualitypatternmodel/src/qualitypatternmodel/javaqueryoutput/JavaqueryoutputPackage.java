/**
 */
package qualitypatternmodel.javaqueryoutput;

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
	 * The number of operations of the '<em>Interim Result Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_RESULT_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaqueryoutput.impl.InterimResultPartImpl <em>Interim Result Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaqueryoutput.impl.InterimResultPartImpl
	 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getInterimResultPart()
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
	 * The meta object id for the '{@link qualitypatternmodel.javaqueryoutput.impl.RecordInterimResultImpl <em>Record Interim Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaqueryoutput.impl.RecordInterimResultImpl
	 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getRecordInterimResult()
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
	 * The meta object id for the '{@link qualitypatternmodel.javaqueryoutput.impl.InterimResultParamImpl <em>Interim Result Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaqueryoutput.impl.InterimResultParamImpl
	 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getInterimResultParam()
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
	 * The meta object id for the '{@link qualitypatternmodel.javaqueryoutput.impl.BooleanInterimResultParamImpl <em>Boolean Interim Result Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaqueryoutput.impl.BooleanInterimResultParamImpl
	 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getBooleanInterimResultParam()
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
	 * The meta object id for the '{@link qualitypatternmodel.javaqueryoutput.impl.ContainerInterimResultPartImpl <em>Container Interim Result Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaqueryoutput.impl.ContainerInterimResultPartImpl
	 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getContainerInterimResultPart()
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
	 * The meta object id for the '{@link qualitypatternmodel.javaqueryoutput.impl.ValueListInterimResultPartImpl <em>Value List Interim Result Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaqueryoutput.impl.ValueListInterimResultPartImpl
	 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getValueListInterimResultPart()
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
	 * Returns the meta object for class '{@link qualitypatternmodel.javaqueryoutput.RecordInterimResult <em>Record Interim Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Interim Result</em>'.
	 * @see qualitypatternmodel.javaqueryoutput.RecordInterimResult
	 * @generated
	 */
	EClass getRecordInterimResult();

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
	 * Returns the meta object for class '{@link qualitypatternmodel.javaqueryoutput.InterimResultParam <em>Interim Result Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interim Result Param</em>'.
	 * @see qualitypatternmodel.javaqueryoutput.InterimResultParam
	 * @generated
	 */
	EClass getInterimResultParam();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaqueryoutput.BooleanInterimResultParam <em>Boolean Interim Result Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Interim Result Param</em>'.
	 * @see qualitypatternmodel.javaqueryoutput.BooleanInterimResultParam
	 * @generated
	 */
	EClass getBooleanInterimResultParam();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaqueryoutput.ContainerInterimResultPart <em>Container Interim Result Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Interim Result Part</em>'.
	 * @see qualitypatternmodel.javaqueryoutput.ContainerInterimResultPart
	 * @generated
	 */
	EClass getContainerInterimResultPart();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.javaqueryoutput.ContainerInterimResultPart#getContained <em>Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained</em>'.
	 * @see qualitypatternmodel.javaqueryoutput.ContainerInterimResultPart#getContained()
	 * @see #getContainerInterimResultPart()
	 * @generated
	 */
	EReference getContainerInterimResultPart_Contained();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.javaqueryoutput.ValueListInterimResultPart <em>Value List Interim Result Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value List Interim Result Part</em>'.
	 * @see qualitypatternmodel.javaqueryoutput.ValueListInterimResultPart
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
		 * The meta object literal for the '{@link qualitypatternmodel.javaqueryoutput.impl.RecordInterimResultImpl <em>Record Interim Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaqueryoutput.impl.RecordInterimResultImpl
		 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getRecordInterimResult()
		 * @generated
		 */
		EClass RECORD_INTERIM_RESULT = eINSTANCE.getRecordInterimResult();

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
		 * The meta object literal for the '{@link qualitypatternmodel.javaqueryoutput.impl.InterimResultParamImpl <em>Interim Result Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaqueryoutput.impl.InterimResultParamImpl
		 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getInterimResultParam()
		 * @generated
		 */
		EClass INTERIM_RESULT_PARAM = eINSTANCE.getInterimResultParam();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaqueryoutput.impl.BooleanInterimResultParamImpl <em>Boolean Interim Result Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaqueryoutput.impl.BooleanInterimResultParamImpl
		 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getBooleanInterimResultParam()
		 * @generated
		 */
		EClass BOOLEAN_INTERIM_RESULT_PARAM = eINSTANCE.getBooleanInterimResultParam();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.javaqueryoutput.impl.ContainerInterimResultPartImpl <em>Container Interim Result Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaqueryoutput.impl.ContainerInterimResultPartImpl
		 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getContainerInterimResultPart()
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
		 * The meta object literal for the '{@link qualitypatternmodel.javaqueryoutput.impl.ValueListInterimResultPartImpl <em>Value List Interim Result Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaqueryoutput.impl.ValueListInterimResultPartImpl
		 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getValueListInterimResultPart()
		 * @generated
		 */
		EClass VALUE_LIST_INTERIM_RESULT_PART = eINSTANCE.getValueListInterimResultPart();

	}

} //JavaqueryoutputPackage
