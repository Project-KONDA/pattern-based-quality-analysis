/**
 */
package qualitypatternmodel.adaptionrdf.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import qualitypatternmodel.adaptionrdf.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdaptionrdfFactoryImpl extends EFactoryImpl implements AdaptionrdfFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdaptionrdfFactory init() {
		try {
			AdaptionrdfFactory theAdaptionrdfFactory = (AdaptionrdfFactory)EPackage.Registry.INSTANCE.getEFactory(AdaptionrdfPackage.eNS_URI);
			if (theAdaptionrdfFactory != null) {
				return theAdaptionrdfFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AdaptionrdfFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptionrdfFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AdaptionrdfPackage.RDF_PREDICATE: return createRdfPredicate();
			case AdaptionrdfPackage.RDF_IRI_NODE: return createRdfIriNode();
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE: return createRdfSinglePredicate();
			case AdaptionrdfPackage.RDF_LITERAL_NODE: return createRdfLiteralNode();
			case AdaptionrdfPackage.IRI_PARAM: return createIriParam();
			case AdaptionrdfPackage.RDF_XOR: return createRdfXor();
			case AdaptionrdfPackage.RDF_SEQUENCE: return createRdfSequence();
			case AdaptionrdfPackage.IRI_LIST_PARAM: return createIriListParam();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AdaptionrdfPackage.RDF_QUANTIFIER:
				return createRdfQuantifierFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AdaptionrdfPackage.RDF_QUANTIFIER:
				return convertRdfQuantifierToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RdfPredicate createRdfPredicate() {
		RdfPredicateImpl rdfPredicate = new RdfPredicateImpl();
		return rdfPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RdfIriNode createRdfIriNode() {
		RdfIriNodeImpl rdfIriNode = new RdfIriNodeImpl();
		return rdfIriNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RdfSinglePredicate createRdfSinglePredicate() {
		RdfSinglePredicateImpl rdfSinglePredicate = new RdfSinglePredicateImpl();
		return rdfSinglePredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RdfLiteralNode createRdfLiteralNode() {
		RdfLiteralNodeImpl rdfLiteralNode = new RdfLiteralNodeImpl();
		return rdfLiteralNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IriParam createIriParam() {
		IriParamImpl iriParam = new IriParamImpl();
		return iriParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RdfXor createRdfXor() {
		RdfXorImpl rdfXor = new RdfXorImpl();
		return rdfXor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RdfSequence createRdfSequence() {
		RdfSequenceImpl rdfSequence = new RdfSequenceImpl();
		return rdfSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IriListParam createIriListParam() {
		IriListParamImpl iriListParam = new IriListParamImpl();
		return iriListParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdfQuantifier createRdfQuantifierFromString(EDataType eDataType, String initialValue) {
		RdfQuantifier result = RdfQuantifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRdfQuantifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdaptionrdfPackage getAdaptionrdfPackage() {
		return (AdaptionrdfPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AdaptionrdfPackage getPackage() {
		return AdaptionrdfPackage.eINSTANCE;
	}

} //AdaptionrdfFactoryImpl
