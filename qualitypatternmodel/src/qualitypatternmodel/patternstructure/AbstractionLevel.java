/**
 */
package qualitypatternmodel.patternstructure;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Abstraction Level</b></em>',
 * and utility methods for working with them.
 * Abstraction levels of patterns.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getAbstractionLevel()
 * @model
 * @generated
 */
public enum AbstractionLevel implements Enumerator {
	/**
	 * The '<em><b>SEMI GENERIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMI_GENERIC_VALUE
	 * @generated
	 * @ordered
	 */
	SEMI_GENERIC(0, "SEMI_GENERIC", "SEMI_GENERIC"), /**
	 * The '<em><b>GENERIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERIC_VALUE
	 * @generated
	 * @ordered
	 */
	GENERIC(1, "GENERIC", "GENERIC"),

	/**
	 * The '<em><b>SEMI ABSTRACT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMI_ABSTRACT_VALUE
	 * @generated
	 * @ordered
	 */
	SEMI_ABSTRACT(2, "SEMI_ABSTRACT", "SEMI_ABSTRACT"), /**
	 * The '<em><b>ABSTRACT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSTRACT_VALUE
	 * @generated
	 * @ordered
	 */
	ABSTRACT(3, "ABSTRACT", "ABSTRACT"),

	/**
	 * The '<em><b>SEMI CONCRETE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMI_CONCRETE_VALUE
	 * @generated
	 * @ordered
	 */
	SEMI_CONCRETE(4, "SEMI_CONCRETE", "SEMI_CONCRETE"), /**
	 * The '<em><b>CONCRETE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCRETE_VALUE
	 * @generated
	 * @ordered
	 */
	CONCRETE(5, "CONCRETE", "CONCRETE");

	/**
	 * The '<em><b>SEMI GENERIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMI_GENERIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEMI_GENERIC_VALUE = 0;

	/**
	 * The '<em><b>GENERIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_VALUE = 1;

	/**
	 * The '<em><b>SEMI ABSTRACT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMI_ABSTRACT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEMI_ABSTRACT_VALUE = 2;

	/**
	 * The '<em><b>ABSTRACT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSTRACT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ABSTRACT_VALUE = 3;

	/**
	 * The '<em><b>SEMI CONCRETE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMI_CONCRETE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEMI_CONCRETE_VALUE = 4;

	/**
	 * The '<em><b>CONCRETE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCRETE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONCRETE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Abstraction Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AbstractionLevel[] VALUES_ARRAY =
		new AbstractionLevel[] {
			SEMI_GENERIC,
			GENERIC,
			SEMI_ABSTRACT,
			ABSTRACT,
			SEMI_CONCRETE,
			CONCRETE,
		};

	/**
	 * A public read-only list of all the '<em><b>Abstraction Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AbstractionLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Abstraction Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AbstractionLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AbstractionLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Abstraction Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AbstractionLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AbstractionLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Abstraction Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AbstractionLevel get(int value) {
		switch (value) {
			case SEMI_GENERIC_VALUE: return SEMI_GENERIC;
			case GENERIC_VALUE: return GENERIC;
			case SEMI_ABSTRACT_VALUE: return SEMI_ABSTRACT;
			case ABSTRACT_VALUE: return ABSTRACT;
			case SEMI_CONCRETE_VALUE: return SEMI_CONCRETE;
			case CONCRETE_VALUE: return CONCRETE;
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
	private AbstractionLevel(int value, String name, String literal) {
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
	
} //AbstractionLevel
