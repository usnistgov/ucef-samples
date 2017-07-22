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
 * A representation of the literals of the enumeration '<em><b>Security Classification Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ieee.standards.ieee1516._2010._2010Package#getSecurityClassificationEnumeration()
 * @model extendedMetaData="name='SecurityClassificationEnumeration'"
 * @generated
 */
public enum SecurityClassificationEnumeration implements Enumerator {
	/**
	 * The '<em><b>Unclassified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNCLASSIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	UNCLASSIFIED(0, "Unclassified", "Unclassified"),

	/**
	 * The '<em><b>Confidential</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIDENTIAL_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIDENTIAL(1, "Confidential", "Confidential"),

	/**
	 * The '<em><b>Secret</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECRET_VALUE
	 * @generated
	 * @ordered
	 */
	SECRET(2, "Secret", "Secret"),

	/**
	 * The '<em><b>Top Secret</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOP_SECRET_VALUE
	 * @generated
	 * @ordered
	 */
	TOP_SECRET(3, "TopSecret", "Top Secret");

	/**
	 * The '<em><b>Unclassified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unclassified</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNCLASSIFIED
	 * @model name="Unclassified"
	 * @generated
	 * @ordered
	 */
	public static final int UNCLASSIFIED_VALUE = 0;

	/**
	 * The '<em><b>Confidential</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Confidential</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIDENTIAL
	 * @model name="Confidential"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIDENTIAL_VALUE = 1;

	/**
	 * The '<em><b>Secret</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Secret</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECRET
	 * @model name="Secret"
	 * @generated
	 * @ordered
	 */
	public static final int SECRET_VALUE = 2;

	/**
	 * The '<em><b>Top Secret</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Top Secret</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOP_SECRET
	 * @model name="TopSecret" literal="Top Secret"
	 * @generated
	 * @ordered
	 */
	public static final int TOP_SECRET_VALUE = 3;

	/**
	 * An array of all the '<em><b>Security Classification Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SecurityClassificationEnumeration[] VALUES_ARRAY =
		new SecurityClassificationEnumeration[] {
			UNCLASSIFIED,
			CONFIDENTIAL,
			SECRET,
			TOP_SECRET,
		};

	/**
	 * A public read-only list of all the '<em><b>Security Classification Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SecurityClassificationEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Security Classification Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SecurityClassificationEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SecurityClassificationEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Security Classification Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SecurityClassificationEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SecurityClassificationEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Security Classification Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SecurityClassificationEnumeration get(int value) {
		switch (value) {
			case UNCLASSIFIED_VALUE: return UNCLASSIFIED;
			case CONFIDENTIAL_VALUE: return CONFIDENTIAL;
			case SECRET_VALUE: return SECRET;
			case TOP_SECRET_VALUE: return TOP_SECRET;
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
	private SecurityClassificationEnumeration(int value, String name, String literal) {
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
	
} //SecurityClassificationEnumeration
