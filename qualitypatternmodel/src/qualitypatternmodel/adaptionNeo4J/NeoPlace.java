/**
 */
package qualitypatternmodel.adaptionNeo4J;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Neo Place</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoPlace()
 * @model
 * @generated
 */
public enum NeoPlace implements Enumerator {
	/**
	 * The '<em><b>BEGINNING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEGINNING_VALUE
	 * @generated
	 * @ordered
	 */
	BEGINNING(0, "BEGINNING", "BEGINNING"),

	/**
	 * The '<em><b>ENDING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENDING_VALUE
	 * @generated
	 * @ordered
	 */
	ENDING(1, "ENDING", "ENDING"),

	/**
	 * The '<em><b>FOLLOWING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOLLOWING_VALUE
	 * @generated
	 * @ordered
	 */
	FOLLOWING(2, "FOLLOWING", "FOLLOWING");

	/**
	 * The '<em><b>BEGINNING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEGINNING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BEGINNING_VALUE = 0;

	/**
	 * The '<em><b>ENDING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENDING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENDING_VALUE = 1;

	/**
	 * The '<em><b>FOLLOWING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOLLOWING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FOLLOWING_VALUE = 2;

	/**
	 * An array of all the '<em><b>Neo Place</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NeoPlace[] VALUES_ARRAY =
		new NeoPlace[] {
			BEGINNING,
			ENDING,
			FOLLOWING,
		};

	/**
	 * A public read-only list of all the '<em><b>Neo Place</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NeoPlace> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Neo Place</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NeoPlace get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NeoPlace result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Neo Place</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NeoPlace getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NeoPlace result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Neo Place</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NeoPlace get(int value) {
		switch (value) {
			case BEGINNING_VALUE: return BEGINNING;
			case ENDING_VALUE: return ENDING;
			case FOLLOWING_VALUE: return FOLLOWING;
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
	private NeoPlace(int value, String name, String literal) {
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
	
} //NeoPlace
