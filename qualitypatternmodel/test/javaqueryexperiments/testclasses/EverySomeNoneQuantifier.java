package javaqueryexperiments.testclasses;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

public enum EverySomeNoneQuantifier implements Enumerator {
	/**
	 * The '<em><b>EVERY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVERY_VALUE
	 * @generated
	 * @ordered
	 */
	EVERY(0, "EVERY", "EVERY"),

	/**
	 * The '<em><b>SOME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOME_VALUE
	 * @generated
	 * @ordered
	 */
	SOME(1, "SOME", "SOME"),

	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(2, "NONE", "NONE");

	public static final int EVERY_VALUE = 0;

	public static final int SOME_VALUE = 1;

	public static final int NONE_VALUE = 2;

	private static final EverySomeNoneQuantifier[] VALUES_ARRAY =
		new EverySomeNoneQuantifier[] {
			EVERY,
			SOME,
			NONE
		};

	public static final List<EverySomeNoneQuantifier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	public static EverySomeNoneQuantifier get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EverySomeNoneQuantifier result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	public static EverySomeNoneQuantifier getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EverySomeNoneQuantifier result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	public static EverySomeNoneQuantifier get(int value) {
		switch (value) {
			case EVERY_VALUE: return EVERY;
			case SOME_VALUE: return SOME;
			case NONE_VALUE: return NONE;
		}
		return null;
	}

	private final int value;

	private final String name;

	private final String literal;

	private EverySomeNoneQuantifier(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	@Override
	public int getValue() {
	  return value;
	}

	@Override
	public String getName() {
	  return name;
	}

	@Override
	public String getLiteral() {
	  return literal;
	}

	@Override
	public String toString() {
		return literal;
	}
	
} //EverySomeNoneQuantifier
