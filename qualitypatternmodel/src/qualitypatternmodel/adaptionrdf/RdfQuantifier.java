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
	 * The '<em><b>ONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_VALUE
	 * @generated NOT
	 * @ordered
	 */
	ONE(0, "ONE", ""), /**
	 * The '<em><b>ZERO PLUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZERO_PLUS_VALUE
	 * @generated NOT
	 * @ordered
	 */
	ZERO_PLUS(1, "ZERO_PLUS", "*"), /**
	 * The '<em><b>ONE PLUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_PLUS_VALUE
	 * @generated NOT
	 * @ordered
	 */
	ONE_PLUS(2, "ONE_PLUS", "+"), /**
	 * The '<em><b>ZERO OR ONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZERO_OR_ONE_VALUE
	 * @generated NOT
	 * @ordered
	 */
	ZERO_OR_ONE(3, "ZERO_OR_ONE", "?");

	/**
	 * The '<em><b>ONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONE_VALUE = 0;

	/**
	 * The '<em><b>ZERO PLUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZERO_PLUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ZERO_PLUS_VALUE = 1;

	/**
	 * The '<em><b>ONE PLUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_PLUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONE_PLUS_VALUE = 2;

	/**
	 * The '<em><b>ZERO OR ONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZERO_OR_ONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ZERO_OR_ONE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Rdf Quantifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RdfQuantifier[] VALUES_ARRAY =
		new RdfQuantifier[] {
			ONE,
			ZERO_PLUS,
			ONE_PLUS,
			ZERO_OR_ONE,
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
			case ONE_VALUE: return ONE;
			case ZERO_PLUS_VALUE: return ZERO_PLUS;
			case ONE_PLUS_VALUE: return ONE_PLUS;
			case ZERO_OR_ONE_VALUE: return ZERO_OR_ONE;
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
