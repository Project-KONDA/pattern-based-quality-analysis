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
	 * The meta object id for the '{@link qualitypatternmodel.javaqueryoutput.impl.RecordInterimImpl <em>Record Interim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaqueryoutput.impl.RecordInterimImpl
	 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getRecordInterim()
	 * @generated
	 */
	int RECORD_INTERIM = 1;

	/**
	 * The number of structural features of the '<em>Record Interim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_INTERIM_FEATURE_COUNT = INTERIM_RESULT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Record Interim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_INTERIM_OPERATION_COUNT = INTERIM_RESULT_PART_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link qualitypatternmodel.javaqueryoutput.impl.BooleanValueInterimImpl <em>Boolean Value Interim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaqueryoutput.impl.BooleanValueInterimImpl
	 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getBooleanValueInterim()
	 * @generated
	 */
	int BOOLEAN_VALUE_INTERIM = 4;

	/**
	 * The number of structural features of the '<em>Boolean Value Interim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_INTERIM_FEATURE_COUNT = INTERIM_RESULT_PARAM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Value Interim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_INTERIM_OPERATION_COUNT = INTERIM_RESULT_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaqueryoutput.impl.ContainerInterimImpl <em>Container Interim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaqueryoutput.impl.ContainerInterimImpl
	 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getContainerInterim()
	 * @generated
	 */
	int CONTAINER_INTERIM = 5;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INTERIM__CONTAINED = INTERIM_RESULT_PARAM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container Interim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INTERIM_FEATURE_COUNT = INTERIM_RESULT_PARAM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Container Interim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INTERIM_OPERATION_COUNT = INTERIM_RESULT_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaqueryoutput.impl.ValueInterimImpl <em>Value Interim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaqueryoutput.impl.ValueInterimImpl
	 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getValueInterim()
	 * @generated
	 */
	int VALUE_INTERIM = 6;

	/**
	 * The number of structural features of the '<em>Value Interim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_INTERIM_FEATURE_COUNT = INTERIM_RESULT_PARAM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value Interim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_INTERIM_OPERATION_COUNT = INTERIM_RESULT_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.javaqueryoutput.impl.NumberValueInterimImpl <em>Number Value Interim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.javaqueryoutput.impl.NumberValueInterimImpl
	 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getNumberValueInterim()
	 * @generated
	 */
	int NUMBER_VALUE_INTERIM = 7;

	/**
	 * The number of structural features of the '<em>Number Value Interim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_INTERIM_FEATURE_COUNT = INTERIM_RESULT_PARAM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number Value Interim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_INTERIM_OPERATION_COUNT = INTERIM_RESULT_PARAM_OPERATION_COUNT + 0;

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
	 * Returns the meta object for class '{@link qualitypatternmodel.javaqueryoutput.RecordInterim <em>Record Interim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Interim</em>'.
	 * @see qualitypatternmodel.javaqueryoutput.RecordInterim
	 * @generated
	 */
	EClass getRecordInterim();

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
	 * Returns the meta object for class '{@link qualitypatternmodel.javaqueryoutput.BooleanValueInterim <em>Boolean Value Interim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value Interim</em>'.
	 * @see qualitypatternmodel.javaqueryoutput.BooleanValueInterim
	 * @generated
	 */
	EClass getBooleanValueInterim();

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
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.javaqueryoutput.ContainerInterim#getContained <em>Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained</em>'.
	 * @see qualitypatternmodel.javaqueryoutput.ContainerInterim#getContained()
	 * @see #getContainerInterim()
	 * @generated
	 */
	EReference getContainerInterim_Contained();

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
	 * Returns the meta object for class '{@link qualitypatternmodel.javaqueryoutput.NumberValueInterim <em>Number Value Interim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Value Interim</em>'.
	 * @see qualitypatternmodel.javaqueryoutput.NumberValueInterim
	 * @generated
	 */
	EClass getNumberValueInterim();

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
		 * The meta object literal for the '{@link qualitypatternmodel.javaqueryoutput.impl.RecordInterimImpl <em>Record Interim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaqueryoutput.impl.RecordInterimImpl
		 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getRecordInterim()
		 * @generated
		 */
		EClass RECORD_INTERIM = eINSTANCE.getRecordInterim();

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
		 * The meta object literal for the '{@link qualitypatternmodel.javaqueryoutput.impl.BooleanValueInterimImpl <em>Boolean Value Interim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaqueryoutput.impl.BooleanValueInterimImpl
		 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getBooleanValueInterim()
		 * @generated
		 */
		EClass BOOLEAN_VALUE_INTERIM = eINSTANCE.getBooleanValueInterim();

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
		 * The meta object literal for the '<em><b>Contained</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_INTERIM__CONTAINED = eINSTANCE.getContainerInterim_Contained();

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
		 * The meta object literal for the '{@link qualitypatternmodel.javaqueryoutput.impl.NumberValueInterimImpl <em>Number Value Interim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.javaqueryoutput.impl.NumberValueInterimImpl
		 * @see qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl#getNumberValueInterim()
		 * @generated
		 */
		EClass NUMBER_VALUE_INTERIM = eINSTANCE.getNumberValueInterim();

	}

} //JavaqueryoutputPackage
