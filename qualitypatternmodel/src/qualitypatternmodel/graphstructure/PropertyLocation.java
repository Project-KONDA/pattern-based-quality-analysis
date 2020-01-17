/**
 */
package qualitypatternmodel.graphstructure;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Property Location</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getPropertyLocation()
 * @model
 * @generated
 */
public enum PropertyLocation implements Enumerator {
	/**
	 * The '<em><b>DATA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_VALUE
	 * @generated
	 * @ordered
	 */
	DATA(0, "DATA", "DATA"), /**
	 * The '<em><b>TAG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAG_VALUE
	 * @generated
	 * @ordered
	 */
	TAG(1, "TAG", "TAG"), /**
	 * The '<em><b>ATTRIBUTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTRIBUTE_VALUE
	 * @generated
	 * @ordered
	 */
	ATTRIBUTE(2, "ATTRIBUTE", "ATTRIBUTE");

	/**
	 * The '<em><b>DATA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATA_VALUE = 0;

	/**
	 * The '<em><b>TAG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TAG_VALUE = 1;

	/**
	 * The '<em><b>ATTRIBUTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTRIBUTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Property Location</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PropertyLocation[] VALUES_ARRAY =
		new PropertyLocation[] {
			DATA,
			TAG,
			ATTRIBUTE,
		};

	/**
	 * A public read-only list of all the '<em><b>Property Location</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PropertyLocation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Property Location</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropertyLocation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PropertyLocation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Property Location</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropertyLocation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PropertyLocation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Property Location</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropertyLocation get(int value) {
		switch (value) {
			case DATA_VALUE: return DATA;
			case TAG_VALUE: return TAG;
			case ATTRIBUTE_VALUE: return ATTRIBUTE;
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
	private PropertyLocation(int value, String name, String literal) {
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
	
} //PropertyLocation
