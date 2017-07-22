/**
 */
package org.ieee.standards.ieee1516._2010;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Fixed Record Encoding Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ieee.standards.ieee1516._2010._2010Package#getFixedRecordEncodingEnumeration()
 * @model extendedMetaData="name='fixedRecordEncodingEnumeration'"
 * @generated
 */
public enum FixedRecordEncodingEnumeration implements Enumerator {
	/**
	 * The '<em><b>HL Afixed Record</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HL_AFIXED_RECORD_VALUE
	 * @generated
	 * @ordered
	 */
	HL_AFIXED_RECORD(0, "HLAfixedRecord", "HLAfixedRecord");

	/**
	 * The '<em><b>HL Afixed Record</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HL Afixed Record</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HL_AFIXED_RECORD
	 * @model name="HLAfixedRecord"
	 * @generated
	 * @ordered
	 */
	public static final int HL_AFIXED_RECORD_VALUE = 0;

	/**
	 * An array of all the '<em><b>Fixed Record Encoding Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FixedRecordEncodingEnumeration[] VALUES_ARRAY =
		new FixedRecordEncodingEnumeration[] {
			HL_AFIXED_RECORD,
		};

	/**
	 * A public read-only list of all the '<em><b>Fixed Record Encoding Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FixedRecordEncodingEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Fixed Record Encoding Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FixedRecordEncodingEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FixedRecordEncodingEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fixed Record Encoding Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FixedRecordEncodingEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FixedRecordEncodingEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fixed Record Encoding Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FixedRecordEncodingEnumeration get(int value) {
		switch (value) {
			case HL_AFIXED_RECORD_VALUE: return HL_AFIXED_RECORD;
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
	private FixedRecordEncodingEnumeration(int value, String name, String literal) {
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
	
} //FixedRecordEncodingEnumeration
