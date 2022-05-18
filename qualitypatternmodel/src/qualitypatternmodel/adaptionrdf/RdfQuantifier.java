/**
 */
package qualitypatternmodel.adaptionrdf;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Rdf Quantifier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfQuantifier()
 * @model
 * @generated
 */
public enum RdfQuantifier implements Enumerator {
	/**
	 * The '<em><b>ONCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONCE_VALUE
	 * @generated
	 * @ordered
	 */
	ONCE(0, "ONCE", "ONCE"),

	/**
	 * The '<em><b>ZEROPLUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZEROPLUS_VALUE
	 * @generated
	 * @ordered
	 */
	ZEROPLUS(1, "ZEROPLUS", "ZEROPLUS"),

	/**
	 * The '<em><b>ONEPLUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONEPLUS_VALUE
	 * @generated
	 * @ordered
	 */
	ONEPLUS(2, "ONEPLUS", "ONEPLUS");

	/**
	 * The '<em><b>ONCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONCE_VALUE = 0;

	/**
	 * The '<em><b>ZEROPLUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZEROPLUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ZEROPLUS_VALUE = 1;

	/**
	 * The '<em><b>ONEPLUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONEPLUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONEPLUS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Rdf Quantifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RdfQuantifier[] VALUES_ARRAY =
		new RdfQuantifier[] {
			ONCE,
			ZEROPLUS,
			ONEPLUS,
		};

	/**
	 * A public read-only list of all the '<em><b>Rdf Quantifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RdfQuantifier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Rdf Quantifier</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RdfQuantifier get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RdfQuantifier result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rdf Quantifier</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RdfQuantifier getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RdfQuantifier result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rdf Quantifier</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RdfQuantifier get(int value) {
		switch (value) {
			case ONCE_VALUE: return ONCE;
			case ZEROPLUS_VALUE: return ZEROPLUS;
			case ONEPLUS_VALUE: return ONEPLUS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RdfQuantifier(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //RdfQuantifier
