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
 * A representation of the literals of the enumeration '<em><b>Ownership Enumerations</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 * @see org.ieee.standards.ieee1516._2010._2010Package#getOwnershipEnumerations()
 * @model extendedMetaData="name='ownershipEnumerations'"
 * @generated
 */
public enum OwnershipEnumerations implements Enumerator {
	/**
	 * The '<em><b>Divest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIVEST_VALUE
	 * @generated
	 * @ordered
	 */
	DIVEST(0, "Divest", "Divest"),

	/**
	 * The '<em><b>Acquire</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACQUIRE_VALUE
	 * @generated
	 * @ordered
	 */
	ACQUIRE(1, "Acquire", "Acquire"),

	/**
	 * The '<em><b>Divest Acquire</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIVEST_ACQUIRE_VALUE
	 * @generated
	 * @ordered
	 */
	DIVEST_ACQUIRE(2, "DivestAcquire", "DivestAcquire"),

	/**
	 * The '<em><b>No Transfer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_TRANSFER_VALUE
	 * @generated
	 * @ordered
	 */
	NO_TRANSFER(3, "NoTransfer", "NoTransfer");

	/**
	 * The '<em><b>Divest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Divest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIVEST
	 * @model name="Divest"
	 * @generated
	 * @ordered
	 */
	public static final int DIVEST_VALUE = 0;

	/**
	 * The '<em><b>Acquire</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Acquire</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACQUIRE
	 * @model name="Acquire"
	 * @generated
	 * @ordered
	 */
	public static final int ACQUIRE_VALUE = 1;

	/**
	 * The '<em><b>Divest Acquire</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Divest Acquire</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIVEST_ACQUIRE
	 * @model name="DivestAcquire"
	 * @generated
	 * @ordered
	 */
	public static final int DIVEST_ACQUIRE_VALUE = 2;

	/**
	 * The '<em><b>No Transfer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Transfer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_TRANSFER
	 * @model name="NoTransfer"
	 * @generated
	 * @ordered
	 */
	public static final int NO_TRANSFER_VALUE = 3;

	/**
	 * An array of all the '<em><b>Ownership Enumerations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OwnershipEnumerations[] VALUES_ARRAY =
		new OwnershipEnumerations[] {
			DIVEST,
			ACQUIRE,
			DIVEST_ACQUIRE,
			NO_TRANSFER,
		};

	/**
	 * A public read-only list of all the '<em><b>Ownership Enumerations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OwnershipEnumerations> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ownership Enumerations</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OwnershipEnumerations get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OwnershipEnumerations result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ownership Enumerations</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OwnershipEnumerations getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OwnershipEnumerations result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ownership Enumerations</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OwnershipEnumerations get(int value) {
		switch (value) {
			case DIVEST_VALUE: return DIVEST;
			case ACQUIRE_VALUE: return ACQUIRE;
			case DIVEST_ACQUIRE_VALUE: return DIVEST_ACQUIRE;
			case NO_TRANSFER_VALUE: return NO_TRANSFER;
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
	private OwnershipEnumerations(int value, String name, String literal) {
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
	
} //OwnershipEnumerations
