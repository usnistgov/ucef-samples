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
 * A representation of the literals of the enumeration '<em><b>POC Type Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ieee.standards.ieee1516._2010._2010Package#getPOCTypeEnumeration()
 * @model extendedMetaData="name='POCTypeEnumeration'"
 * @generated
 */
public enum POCTypeEnumeration implements Enumerator {
	/**
	 * The '<em><b>Primary Author</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIMARY_AUTHOR_VALUE
	 * @generated
	 * @ordered
	 */
	PRIMARY_AUTHOR(0, "PrimaryAuthor", "Primary author"),

	/**
	 * The '<em><b>Contributor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRIBUTOR_VALUE
	 * @generated
	 * @ordered
	 */
	CONTRIBUTOR(1, "Contributor", "Contributor"),

	/**
	 * The '<em><b>Proponent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	PROPONENT(2, "Proponent", "Proponent"),

	/**
	 * The '<em><b>Sponsor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPONSOR_VALUE
	 * @generated
	 * @ordered
	 */
	SPONSOR(3, "Sponsor", "Sponsor"),

	/**
	 * The '<em><b>Release Authority</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELEASE_AUTHORITY_VALUE
	 * @generated
	 * @ordered
	 */
	RELEASE_AUTHORITY(4, "ReleaseAuthority", "Release authority"),

	/**
	 * The '<em><b>Technical POC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECHNICAL_POC_VALUE
	 * @generated
	 * @ordered
	 */
	TECHNICAL_POC(5, "TechnicalPOC", "Technical POC");

	/**
	 * The '<em><b>Primary Author</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Primary Author</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIMARY_AUTHOR
	 * @model name="PrimaryAuthor" literal="Primary author"
	 * @generated
	 * @ordered
	 */
	public static final int PRIMARY_AUTHOR_VALUE = 0;

	/**
	 * The '<em><b>Contributor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Contributor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTRIBUTOR
	 * @model name="Contributor"
	 * @generated
	 * @ordered
	 */
	public static final int CONTRIBUTOR_VALUE = 1;

	/**
	 * The '<em><b>Proponent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Proponent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROPONENT
	 * @model name="Proponent"
	 * @generated
	 * @ordered
	 */
	public static final int PROPONENT_VALUE = 2;

	/**
	 * The '<em><b>Sponsor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sponsor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPONSOR
	 * @model name="Sponsor"
	 * @generated
	 * @ordered
	 */
	public static final int SPONSOR_VALUE = 3;

	/**
	 * The '<em><b>Release Authority</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Release Authority</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELEASE_AUTHORITY
	 * @model name="ReleaseAuthority" literal="Release authority"
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_AUTHORITY_VALUE = 4;

	/**
	 * The '<em><b>Technical POC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Technical POC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TECHNICAL_POC
	 * @model name="TechnicalPOC" literal="Technical POC"
	 * @generated
	 * @ordered
	 */
	public static final int TECHNICAL_POC_VALUE = 5;

	/**
	 * An array of all the '<em><b>POC Type Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final POCTypeEnumeration[] VALUES_ARRAY =
		new POCTypeEnumeration[] {
			PRIMARY_AUTHOR,
			CONTRIBUTOR,
			PROPONENT,
			SPONSOR,
			RELEASE_AUTHORITY,
			TECHNICAL_POC,
		};

	/**
	 * A public read-only list of all the '<em><b>POC Type Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<POCTypeEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>POC Type Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static POCTypeEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			POCTypeEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>POC Type Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static POCTypeEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			POCTypeEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>POC Type Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static POCTypeEnumeration get(int value) {
		switch (value) {
			case PRIMARY_AUTHOR_VALUE: return PRIMARY_AUTHOR;
			case CONTRIBUTOR_VALUE: return CONTRIBUTOR;
			case PROPONENT_VALUE: return PROPONENT;
			case SPONSOR_VALUE: return SPONSOR;
			case RELEASE_AUTHORITY_VALUE: return RELEASE_AUTHORITY;
			case TECHNICAL_POC_VALUE: return TECHNICAL_POC;
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
	private POCTypeEnumeration(int value, String name, String literal) {
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
	
} //POCTypeEnumeration
