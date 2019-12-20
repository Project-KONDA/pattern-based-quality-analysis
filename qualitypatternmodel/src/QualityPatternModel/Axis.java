/**
 */
package QualityPatternModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Axis</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see QualityPatternModel.QualityPatternModelPackage#getAxis()
 * @model
 * @generated
 */
public enum Axis implements Enumerator {
	/**
	 * The '<em><b>CHILD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHILD_VALUE
	 * @generated
	 * @ordered
	 */
	CHILD(0, "CHILD", "child"),

	/**
	 * The '<em><b>DESCENDANT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESCENDANT_VALUE
	 * @generated
	 * @ordered
	 */
	DESCENDANT(1, "DESCENDANT", "descendant"),

	/**
	 * The '<em><b>PARENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARENT_VALUE
	 * @generated
	 * @ordered
	 */
	PARENT(2, "PARENT", "parent"),

	/**
	 * The '<em><b>ANCESTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANCESTOR_VALUE
	 * @generated
	 * @ordered
	 */
	ANCESTOR(3, "ANCESTOR", "ancestor"),

	/**
	 * The '<em><b>FOLLOWING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOLLOWING_VALUE
	 * @generated
	 * @ordered
	 */
	FOLLOWING(4, "FOLLOWING", "following"),

	/**
	 * The '<em><b>FOLLOWING SIBLING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOLLOWING_SIBLING_VALUE
	 * @generated
	 * @ordered
	 */
	FOLLOWING_SIBLING(5, "FOLLOWING_SIBLING", "following-sibling"),

	/**
	 * The '<em><b>PRECEDING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRECEDING_VALUE
	 * @generated
	 * @ordered
	 */
	PRECEDING(6, "PRECEDING", "preceding"),

	/**
	 * The '<em><b>PRECEDING SIBLING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRECEDING_SIBLING_VALUE
	 * @generated
	 * @ordered
	 */
	PRECEDING_SIBLING(7, "PRECEDING_SIBLING", "preceding-sibling"),

	/**
	 * The '<em><b>ANCESTOR OR SELF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANCESTOR_OR_SELF_VALUE
	 * @generated
	 * @ordered
	 */
	ANCESTOR_OR_SELF(8, "ANCESTOR_OR_SELF", "ancestor-or-self"),

	/**
	 * The '<em><b>DESCENDANT OR SELF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESCENDANT_OR_SELF_VALUE
	 * @generated
	 * @ordered
	 */
	DESCENDANT_OR_SELF(9, "DESCENDANT_OR_SELF", "descendant-or-self");

	/**
	 * The '<em><b>CHILD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHILD
	 * @model literal="child"
	 * @generated
	 * @ordered
	 */
	public static final int CHILD_VALUE = 0;

	/**
	 * The '<em><b>DESCENDANT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESCENDANT
	 * @model literal="descendant"
	 * @generated
	 * @ordered
	 */
	public static final int DESCENDANT_VALUE = 1;

	/**
	 * The '<em><b>PARENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARENT
	 * @model literal="parent"
	 * @generated
	 * @ordered
	 */
	public static final int PARENT_VALUE = 2;

	/**
	 * The '<em><b>ANCESTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANCESTOR
	 * @model literal="ancestor"
	 * @generated
	 * @ordered
	 */
	public static final int ANCESTOR_VALUE = 3;

	/**
	 * The '<em><b>FOLLOWING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOLLOWING
	 * @model literal="following"
	 * @generated
	 * @ordered
	 */
	public static final int FOLLOWING_VALUE = 4;

	/**
	 * The '<em><b>FOLLOWING SIBLING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOLLOWING_SIBLING
	 * @model literal="following-sibling"
	 * @generated
	 * @ordered
	 */
	public static final int FOLLOWING_SIBLING_VALUE = 5;

	/**
	 * The '<em><b>PRECEDING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRECEDING
	 * @model literal="preceding"
	 * @generated
	 * @ordered
	 */
	public static final int PRECEDING_VALUE = 6;

	/**
	 * The '<em><b>PRECEDING SIBLING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRECEDING_SIBLING
	 * @model literal="preceding-sibling"
	 * @generated
	 * @ordered
	 */
	public static final int PRECEDING_SIBLING_VALUE = 7;

	/**
	 * The '<em><b>ANCESTOR OR SELF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANCESTOR_OR_SELF
	 * @model literal="ancestor-or-self"
	 * @generated
	 * @ordered
	 */
	public static final int ANCESTOR_OR_SELF_VALUE = 8;

	/**
	 * The '<em><b>DESCENDANT OR SELF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESCENDANT_OR_SELF
	 * @model literal="descendant-or-self"
	 * @generated
	 * @ordered
	 */
	public static final int DESCENDANT_OR_SELF_VALUE = 9;

	/**
	 * An array of all the '<em><b>Axis</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Axis[] VALUES_ARRAY =
		new Axis[] {
			CHILD,
			DESCENDANT,
			PARENT,
			ANCESTOR,
			FOLLOWING,
			FOLLOWING_SIBLING,
			PRECEDING,
			PRECEDING_SIBLING,
			ANCESTOR_OR_SELF,
			DESCENDANT_OR_SELF,
		};

	/**
	 * A public read-only list of all the '<em><b>Axis</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Axis> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Axis</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Axis get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Axis result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Axis</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Axis getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Axis result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Axis</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Axis get(int value) {
		switch (value) {
			case CHILD_VALUE: return CHILD;
			case DESCENDANT_VALUE: return DESCENDANT;
			case PARENT_VALUE: return PARENT;
			case ANCESTOR_VALUE: return ANCESTOR;
			case FOLLOWING_VALUE: return FOLLOWING;
			case FOLLOWING_SIBLING_VALUE: return FOLLOWING_SIBLING;
			case PRECEDING_VALUE: return PRECEDING;
			case PRECEDING_SIBLING_VALUE: return PRECEDING_SIBLING;
			case ANCESTOR_OR_SELF_VALUE: return ANCESTOR_OR_SELF;
			case DESCENDANT_OR_SELF_VALUE: return DESCENDANT_OR_SELF;
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
	private Axis(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //Axis
