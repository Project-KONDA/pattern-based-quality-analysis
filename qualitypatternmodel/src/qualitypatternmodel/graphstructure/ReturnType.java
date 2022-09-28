/**
 */
package qualitypatternmodel.graphstructure;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Return Type</b></em>',
 * and utility methods for working with them.
 * Possible types of operator arguments.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getReturnType()
 * @model
 * @generated
 */
public enum ReturnType implements Enumerator {
	/**
	 * The '<em><b>UNSPECIFIED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSPECIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	UNSPECIFIED(0, "UNSPECIFIED", "UNSPECIFIED"), /**
	 * The '<em><b>STRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_VALUE
	 * @generated
	 * @ordered
	 */
	STRING(1, "STRING", "STRING"), /**
	 * The '<em><b>BOOLEAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN(2, "BOOLEAN", "BOOLEAN"), /**
	 * The '<em><b>ELEMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ELEMENT(4, "ELEMENT", "ELEMENT"), /**
	 * The '<em><b>DATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(5, "DATE", "DATE"), /**
	 * The '<em><b>TIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_VALUE
	 * @generated
	 * @ordered
	 */
	TIME(6, "TIME", "TIME"), /**
	 * The '<em><b>NUMBER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	NUMBER(7, "NUMBER", "NUMBER"), /**
	 * The '<em><b>DATETIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_VALUE
	 * @generated
	 * @ordered
	 */
	DATETIME(8, "DATETIME", "DATETIME"), /**
	 * The '<em><b>LIST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIST_VALUE
	 * @generated
	 * @ordered
	 */
	LIST(8, "LIST", "LIST"), /**
	 * The '<em><b>ELEMENTID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELEMENTID_VALUE
	 * @generated
	 * @ordered
	 */
	ELEMENTID(9, "ELEMENTID", "ELEMENTID");

	private static final String CATCH_CASTING_ERROR = "} catch err:FORG0001 { false() }";

	private static final String TRY = "try {";

	/**
	 * The '<em><b>UNSPECIFIED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSPECIFIED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNSPECIFIED_VALUE = 0;

	/**
	 * The '<em><b>STRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_VALUE = 1;

	/**
	 * The '<em><b>BOOLEAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_VALUE = 2;

	/**
	 * The '<em><b>ELEMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELEMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ELEMENT_VALUE = 4;

	/**
	 * The '<em><b>DATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 5;

	/**
	 * The '<em><b>TIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_VALUE = 6;

	/**
	 * The '<em><b>NUMBER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMBER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NUMBER_VALUE = 7;

	/**
	 * The '<em><b>DATETIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATETIME_VALUE = 8;

	/**
	 * The '<em><b>LIST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIST_VALUE = 8;

	/**
	 * The '<em><b>ELEMENTID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELEMENTID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ELEMENTID_VALUE = 9;

	/**
	 * An array of all the '<em><b>Return Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReturnType[] VALUES_ARRAY =
		new ReturnType[] {
			UNSPECIFIED,
			STRING,
			BOOLEAN,
			ELEMENT,
			DATE,
			TIME,
			NUMBER,
			DATETIME,
			LIST,
			ELEMENTID,
		};

	/**
	 * A public read-only list of all the '<em><b>Return Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReturnType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Return Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReturnType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReturnType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Return Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReturnType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReturnType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Return Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReturnType get(int value) {
		switch (value) {
			case UNSPECIFIED_VALUE: return UNSPECIFIED;
			case STRING_VALUE: return STRING;
			case BOOLEAN_VALUE: return BOOLEAN;
			case ELEMENT_VALUE: return ELEMENT;
			case DATE_VALUE: return DATE;
			case TIME_VALUE: return TIME;
			case NUMBER_VALUE: return NUMBER;
			case DATETIME_VALUE: return DATETIME;
			case ELEMENTID_VALUE: return ELEMENTID;
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
	private ReturnType(int value, String name, String literal) {
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
	
	private String conversion;
	
	static {
		NUMBER.conversion = "xs:double(";
//		STRING.conversion = "xs:string(";
		STRING.conversion = "";
		BOOLEAN.conversion = "xs:boolean(";
		DATE.conversion = "xs:date(";
		TIME.conversion = "xs:time(";
		DATETIME.conversion = "xs:dateTime(";
		ELEMENT.conversion = "";		
		UNSPECIFIED.conversion = "";
	}
	
	public String getConversion() {
		return conversion;
	}
	
	private String conversionEnd;
	
	static {
		NUMBER.conversionEnd = ")";
//		STRING.conversionEnd = ")";
		STRING.conversionEnd = "";
		BOOLEAN.conversionEnd = ")";
		DATE.conversionEnd = ")";
		TIME.conversionEnd = ")";
		DATETIME.conversionEnd = ")";
		ELEMENT.conversionEnd = "";	
		UNSPECIFIED.conversionEnd = "";
	}
	
	public String getConversionEnd() {
		return conversionEnd;
	}
	
	private String tryStatement;
	
	static {
		NUMBER.tryStatement = TRY;
		STRING.tryStatement = "";
		BOOLEAN.tryStatement = TRY;
		DATE.tryStatement = TRY;
		TIME.tryStatement = TRY;
		DATETIME.tryStatement = TRY;
		ELEMENT.tryStatement = "";		
		UNSPECIFIED.tryStatement = "";
	}
	
	public String getTryStatement() {
		return tryStatement;
	}
	
	private String catchCastingError;
	
	static {
		NUMBER.catchCastingError = CATCH_CASTING_ERROR;
		STRING.catchCastingError = "";
		BOOLEAN.catchCastingError = CATCH_CASTING_ERROR;
		DATE.catchCastingError = CATCH_CASTING_ERROR;
		TIME.catchCastingError = CATCH_CASTING_ERROR;
		DATETIME.catchCastingError = CATCH_CASTING_ERROR;
		ELEMENT.catchCastingError = "";		
		UNSPECIFIED.catchCastingError = "";
	}
	
	public String getCatchCastingError() {
		return catchCastingError;
	}
	
} //ReturnType
