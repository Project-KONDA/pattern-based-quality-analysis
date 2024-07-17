/**
 */
package qualitypatternmodel.adaptionrdf;

import org.eclipse.emf.common.util.EList;
import org.json.JSONException;
import org.json.JSONObject;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.utility.ConstantsRdf;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rdf Path Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionrdf.RdfPathComponent#isInvert <em>Invert</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.RdfPathComponent#getQuantifier <em>Quantifier</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfPathComponent()
 * @model abstract="true"
 * @generated
 */
public interface RdfPathComponent extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Invert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invert</em>' attribute.
	 * @see #setInvert(boolean)
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfPathComponent_Invert()
	 * @model
	 * @generated
	 */
	boolean isInvert();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionrdf.RdfPathComponent#isInvert <em>Invert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invert</em>' attribute.
	 * @see #isInvert()
	 * @generated
	 */
	void setInvert(boolean value);

	/**
	 * Returns the value of the '<em><b>Quantifier</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.adaptionrdf.RdfQuantifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifier</em>' attribute.
	 * @see qualitypatternmodel.adaptionrdf.RdfQuantifier
	 * @see #setQuantifier(RdfQuantifier)
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfPathComponent_Quantifier()
	 * @model
	 * @generated
	 */
	RdfQuantifier getQuantifier();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionrdf.RdfPathComponent#getQuantifier <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantifier</em>' attribute.
	 * @see qualitypatternmodel.adaptionrdf.RdfQuantifier
	 * @see #getQuantifier()
	 * @generated
	 */
	void setQuantifier(RdfQuantifier value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<RdfSinglePredicate> getRdfSinglePredicates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getValueAsString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void setValueFromString(String value) throws InvalidityException;

	static RdfPathComponent createNewRdfPathComponent(String value) throws InvalidityException {
		RdfPathComponent comp = null;
		JSONObject jobj;
		try {
			jobj = new JSONObject(value);
			if (jobj.has(ConstantsRdf.JSON_RDF_PATH_XOR)) {
				comp = AdaptionrdfFactory.eINSTANCE.createRdfXor();
			} else if (jobj.has(ConstantsRdf.JSON_RDF_PATH_SEQUENCE) ) {
				comp = AdaptionrdfFactory.eINSTANCE.createRdfSequence();
			} else {
				throw new InvalidityException("Invalid JSONObject: '" + value + "'");
			}
		} catch (JSONException e) {
			comp = AdaptionrdfFactory.eINSTANCE.createRdfSinglePredicate();
		}
		comp.setValueFromString(value);
		return comp;
	}

} // RdfPathParam
