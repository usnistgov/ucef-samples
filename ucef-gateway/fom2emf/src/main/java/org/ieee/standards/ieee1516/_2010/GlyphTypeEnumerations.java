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
 * A representation of the literals of the enumeration '<em><b>Glyph Type Enumerations</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ieee.standards.ieee1516._2010._2010Package#getGlyphTypeEnumerations()
 * @model extendedMetaData="name='glyphTypeEnumerations'"
 * @generated
 */
public enum GlyphTypeEnumerations implements Enumerator {
	/**
	 * The '<em><b>BITMAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BITMAP_VALUE
	 * @generated
	 * @ordered
	 */
	BITMAP(0, "BITMAP", "BITMAP"),

	/**
	 * The '<em><b>JPG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JPG_VALUE
	 * @generated
	 * @ordered
	 */
	JPG(1, "JPG", "JPG"),

	/**
	 * The '<em><b>GIF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GIF_VALUE
	 * @generated
	 * @ordered
	 */
	GIF(2, "GIF", "GIF"),

	/**
	 * The '<em><b>PNG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PNG_VALUE
	 * @generated
	 * @ordered
	 */
	PNG(3, "PNG", "PNG"),

	/**
	 * The '<em><b>TIFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIFF_VALUE
	 * @generated
	 * @ordered
	 */
	TIFF(4, "TIFF", "TIFF");

	/**
	 * The '<em><b>BITMAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BITMAP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BITMAP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BITMAP_VALUE = 0;

	/**
	 * The '<em><b>JPG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JPG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JPG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JPG_VALUE = 1;

	/**
	 * The '<em><b>GIF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GIF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GIF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GIF_VALUE = 2;

	/**
	 * The '<em><b>PNG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PNG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PNG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PNG_VALUE = 3;

	/**
	 * The '<em><b>TIFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIFF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIFF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIFF_VALUE = 4;

	/**
	 * An array of all the '<em><b>Glyph Type Enumerations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GlyphTypeEnumerations[] VALUES_ARRAY =
		new GlyphTypeEnumerations[] {
			BITMAP,
			JPG,
			GIF,
			PNG,
			TIFF,
		};

	/**
	 * A public read-only list of all the '<em><b>Glyph Type Enumerations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GlyphTypeEnumerations> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Glyph Type Enumerations</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GlyphTypeEnumerations get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GlyphTypeEnumerations result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Glyph Type Enumerations</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GlyphTypeEnumerations getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GlyphTypeEnumerations result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Glyph Type Enumerations</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GlyphTypeEnumerations get(int value) {
		switch (value) {
			case BITMAP_VALUE: return BITMAP;
			case JPG_VALUE: return JPG;
			case GIF_VALUE: return GIF;
			case PNG_VALUE: return PNG;
			case TIFF_VALUE: return TIFF;
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
	private GlyphTypeEnumerations(int value, String name, String literal) {
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
	
} //GlyphTypeEnumerations
