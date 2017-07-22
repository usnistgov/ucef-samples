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
 * A representation of the literals of the enumeration '<em><b>Application Domain Enumerations</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ieee.standards.ieee1516._2010._2010Package#getApplicationDomainEnumerations()
 * @model extendedMetaData="name='ApplicationDomainEnumerations'"
 * @generated
 */
public enum ApplicationDomainEnumerations implements Enumerator {
	/**
	 * The '<em><b>Analysis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALYSIS_VALUE
	 * @generated
	 * @ordered
	 */
	ANALYSIS(0, "Analysis", "Analysis"),

	/**
	 * The '<em><b>Training</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAINING_VALUE
	 * @generated
	 * @ordered
	 */
	TRAINING(1, "Training", "Training"),

	/**
	 * The '<em><b>Test And Evaluation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEST_AND_EVALUATION_VALUE
	 * @generated
	 * @ordered
	 */
	TEST_AND_EVALUATION(2, "TestAndEvaluation", "Test and Evaluation"),

	/**
	 * The '<em><b>Engineering</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENGINEERING_VALUE
	 * @generated
	 * @ordered
	 */
	ENGINEERING(3, "Engineering", "Engineering"),

	/**
	 * The '<em><b>Acquisition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACQUISITION_VALUE
	 * @generated
	 * @ordered
	 */
	ACQUISITION(4, "Acquisition", "Acquisition");

	/**
	 * The '<em><b>Analysis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Analysis</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANALYSIS
	 * @model name="Analysis"
	 * @generated
	 * @ordered
	 */
	public static final int ANALYSIS_VALUE = 0;

	/**
	 * The '<em><b>Training</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Training</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRAINING
	 * @model name="Training"
	 * @generated
	 * @ordered
	 */
	public static final int TRAINING_VALUE = 1;

	/**
	 * The '<em><b>Test And Evaluation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Test And Evaluation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEST_AND_EVALUATION
	 * @model name="TestAndEvaluation" literal="Test and Evaluation"
	 * @generated
	 * @ordered
	 */
	public static final int TEST_AND_EVALUATION_VALUE = 2;

	/**
	 * The '<em><b>Engineering</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Engineering</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENGINEERING
	 * @model name="Engineering"
	 * @generated
	 * @ordered
	 */
	public static final int ENGINEERING_VALUE = 3;

	/**
	 * The '<em><b>Acquisition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Acquisition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACQUISITION
	 * @model name="Acquisition"
	 * @generated
	 * @ordered
	 */
	public static final int ACQUISITION_VALUE = 4;

	/**
	 * An array of all the '<em><b>Application Domain Enumerations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ApplicationDomainEnumerations[] VALUES_ARRAY =
		new ApplicationDomainEnumerations[] {
			ANALYSIS,
			TRAINING,
			TEST_AND_EVALUATION,
			ENGINEERING,
			ACQUISITION,
		};

	/**
	 * A public read-only list of all the '<em><b>Application Domain Enumerations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ApplicationDomainEnumerations> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Application Domain Enumerations</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ApplicationDomainEnumerations get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ApplicationDomainEnumerations result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Application Domain Enumerations</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ApplicationDomainEnumerations getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ApplicationDomainEnumerations result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Application Domain Enumerations</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ApplicationDomainEnumerations get(int value) {
		switch (value) {
			case ANALYSIS_VALUE: return ANALYSIS;
			case TRAINING_VALUE: return TRAINING;
			case TEST_AND_EVALUATION_VALUE: return TEST_AND_EVALUATION;
			case ENGINEERING_VALUE: return ENGINEERING;
			case ACQUISITION_VALUE: return ACQUISITION;
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
	private ApplicationDomainEnumerations(int value, String name, String literal) {
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
	
} //ApplicationDomainEnumerations
