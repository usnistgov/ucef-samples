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
 * A representation of the literals of the enumeration '<em><b>Resign Action Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ieee.standards.ieee1516._2010._2010Package#getResignActionType()
 * @model extendedMetaData="name='resignActionType'"
 * @generated
 */
public enum ResignActionType implements Enumerator {
	/**
	 * The '<em><b>Unconditionally Divest Attributes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNCONDITIONALLY_DIVEST_ATTRIBUTES_VALUE
	 * @generated
	 * @ordered
	 */
	UNCONDITIONALLY_DIVEST_ATTRIBUTES(0, "UnconditionallyDivestAttributes", "UnconditionallyDivestAttributes"),

	/**
	 * The '<em><b>Delete Objects</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE_OBJECTS_VALUE
	 * @generated
	 * @ordered
	 */
	DELETE_OBJECTS(1, "DeleteObjects", "DeleteObjects"),

	/**
	 * The '<em><b>Cancel Pending Ownership Acquisitions</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCEL_PENDING_OWNERSHIP_ACQUISITIONS_VALUE
	 * @generated
	 * @ordered
	 */
	CANCEL_PENDING_OWNERSHIP_ACQUISITIONS(2, "CancelPendingOwnershipAcquisitions", "CancelPendingOwnershipAcquisitions"),

	/**
	 * The '<em><b>Delete Objects Then Divest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE_OBJECTS_THEN_DIVEST_VALUE
	 * @generated
	 * @ordered
	 */
	DELETE_OBJECTS_THEN_DIVEST(3, "DeleteObjectsThenDivest", "DeleteObjectsThenDivest"),

	/**
	 * The '<em><b>Cancel Then Delete Then Divest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCEL_THEN_DELETE_THEN_DIVEST_VALUE
	 * @generated
	 * @ordered
	 */
	CANCEL_THEN_DELETE_THEN_DIVEST(4, "CancelThenDeleteThenDivest", "CancelThenDeleteThenDivest"),

	/**
	 * The '<em><b>No Action</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	NO_ACTION(5, "NoAction", "NoAction");

	/**
	 * The '<em><b>Unconditionally Divest Attributes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unconditionally Divest Attributes</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNCONDITIONALLY_DIVEST_ATTRIBUTES
	 * @model name="UnconditionallyDivestAttributes"
	 * @generated
	 * @ordered
	 */
	public static final int UNCONDITIONALLY_DIVEST_ATTRIBUTES_VALUE = 0;

	/**
	 * The '<em><b>Delete Objects</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Delete Objects</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELETE_OBJECTS
	 * @model name="DeleteObjects"
	 * @generated
	 * @ordered
	 */
	public static final int DELETE_OBJECTS_VALUE = 1;

	/**
	 * The '<em><b>Cancel Pending Ownership Acquisitions</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cancel Pending Ownership Acquisitions</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CANCEL_PENDING_OWNERSHIP_ACQUISITIONS
	 * @model name="CancelPendingOwnershipAcquisitions"
	 * @generated
	 * @ordered
	 */
	public static final int CANCEL_PENDING_OWNERSHIP_ACQUISITIONS_VALUE = 2;

	/**
	 * The '<em><b>Delete Objects Then Divest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Delete Objects Then Divest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELETE_OBJECTS_THEN_DIVEST
	 * @model name="DeleteObjectsThenDivest"
	 * @generated
	 * @ordered
	 */
	public static final int DELETE_OBJECTS_THEN_DIVEST_VALUE = 3;

	/**
	 * The '<em><b>Cancel Then Delete Then Divest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cancel Then Delete Then Divest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CANCEL_THEN_DELETE_THEN_DIVEST
	 * @model name="CancelThenDeleteThenDivest"
	 * @generated
	 * @ordered
	 */
	public static final int CANCEL_THEN_DELETE_THEN_DIVEST_VALUE = 4;

	/**
	 * The '<em><b>No Action</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Action</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_ACTION
	 * @model name="NoAction"
	 * @generated
	 * @ordered
	 */
	public static final int NO_ACTION_VALUE = 5;

	/**
	 * An array of all the '<em><b>Resign Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResignActionType[] VALUES_ARRAY =
		new ResignActionType[] {
			UNCONDITIONALLY_DIVEST_ATTRIBUTES,
			DELETE_OBJECTS,
			CANCEL_PENDING_OWNERSHIP_ACQUISITIONS,
			DELETE_OBJECTS_THEN_DIVEST,
			CANCEL_THEN_DELETE_THEN_DIVEST,
			NO_ACTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Resign Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResignActionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Resign Action Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResignActionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResignActionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resign Action Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResignActionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResignActionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resign Action Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResignActionType get(int value) {
		switch (value) {
			case UNCONDITIONALLY_DIVEST_ATTRIBUTES_VALUE: return UNCONDITIONALLY_DIVEST_ATTRIBUTES;
			case DELETE_OBJECTS_VALUE: return DELETE_OBJECTS;
			case CANCEL_PENDING_OWNERSHIP_ACQUISITIONS_VALUE: return CANCEL_PENDING_OWNERSHIP_ACQUISITIONS;
			case DELETE_OBJECTS_THEN_DIVEST_VALUE: return DELETE_OBJECTS_THEN_DIVEST;
			case CANCEL_THEN_DELETE_THEN_DIVEST_VALUE: return CANCEL_THEN_DELETE_THEN_DIVEST;
			case NO_ACTION_VALUE: return NO_ACTION;
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
	private ResignActionType(int value, String name, String literal) {
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
	
} //ResignActionType
