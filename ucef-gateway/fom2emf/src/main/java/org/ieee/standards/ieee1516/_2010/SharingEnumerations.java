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
 * A representation of the literals of the enumeration '<em><b>Sharing Enumerations</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ieee.standards.ieee1516._2010._2010Package#getSharingEnumerations()
 * @model extendedMetaData="name='sharingEnumerations'"
 * @generated
 */
public enum SharingEnumerations implements Enumerator {
	/**
	 * The '<em><b>Publish</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLISH_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLISH(0, "Publish", "Publish"),

	/**
	 * The '<em><b>Subscribe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSCRIBE_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSCRIBE(1, "Subscribe", "Subscribe"),

	/**
	 * The '<em><b>Publish Subscribe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLISH_SUBSCRIBE_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLISH_SUBSCRIBE(2, "PublishSubscribe", "PublishSubscribe"),

	/**
	 * The '<em><b>Neither</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEITHER_VALUE
	 * @generated
	 * @ordered
	 */
	NEITHER(3, "Neither", "Neither");

	/**
	 * The '<em><b>Publish</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Publish</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUBLISH
	 * @model name="Publish"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLISH_VALUE = 0;

	/**
	 * The '<em><b>Subscribe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Subscribe</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSCRIBE
	 * @model name="Subscribe"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSCRIBE_VALUE = 1;

	/**
	 * The '<em><b>Publish Subscribe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Publish Subscribe</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUBLISH_SUBSCRIBE
	 * @model name="PublishSubscribe"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLISH_SUBSCRIBE_VALUE = 2;

	/**
	 * The '<em><b>Neither</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Neither</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEITHER
	 * @model name="Neither"
	 * @generated
	 * @ordered
	 */
	public static final int NEITHER_VALUE = 3;

	/**
	 * An array of all the '<em><b>Sharing Enumerations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SharingEnumerations[] VALUES_ARRAY =
		new SharingEnumerations[] {
			PUBLISH,
			SUBSCRIBE,
			PUBLISH_SUBSCRIBE,
			NEITHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Sharing Enumerations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SharingEnumerations> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sharing Enumerations</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SharingEnumerations get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SharingEnumerations result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sharing Enumerations</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SharingEnumerations getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SharingEnumerations result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sharing Enumerations</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SharingEnumerations get(int value) {
		switch (value) {
			case PUBLISH_VALUE: return PUBLISH;
			case SUBSCRIBE_VALUE: return SUBSCRIBE;
			case PUBLISH_SUBSCRIBE_VALUE: return PUBLISH_SUBSCRIBE;
			case NEITHER_VALUE: return NEITHER;
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
	private SharingEnumerations(int value, String name, String literal) {
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
	
} //SharingEnumerations
