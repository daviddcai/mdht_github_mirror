/*******************************************************************************
 * Copyright (c) 2016 David Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.mdht.uml.fhir.core.valueset;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Patient Medicine Change Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getPatientMedicineChangeTypes()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Patient Medicine Change Types'"
 * @generated
 */
public enum PatientMedicineChangeTypes implements Enumerator {
	/**
	 * The '<em><b>01</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_01_VALUE
	 * @generated
	 * @ordered
	 */
	_01(0, "_01", "_01"),

	/**
	 * The '<em><b>02</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_02_VALUE
	 * @generated
	 * @ordered
	 */
	_02(1, "_02", "_02"),

	/**
	 * The '<em><b>03</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_03_VALUE
	 * @generated
	 * @ordered
	 */
	_03(2, "_03", "_03"),

	/**
	 * The '<em><b>04</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_04_VALUE
	 * @generated
	 * @ordered
	 */
	_04(3, "_04", "_04"),

	/**
	 * The '<em><b>05</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_05_VALUE
	 * @generated
	 * @ordered
	 */
	_05(4, "_05", "_05"),

	/**
	 * The '<em><b>06</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_06_VALUE
	 * @generated
	 * @ordered
	 */
	_06(5, "_06", "_06");

	/**
	 * The '<em><b>01</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>01</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_01
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='01'"
	 * @generated
	 * @ordered
	 */
	public static final int _01_VALUE = 0;

	/**
	 * The '<em><b>02</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>02</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_02
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='02'"
	 * @generated
	 * @ordered
	 */
	public static final int _02_VALUE = 1;

	/**
	 * The '<em><b>03</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>03</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_03
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='03'"
	 * @generated
	 * @ordered
	 */
	public static final int _03_VALUE = 2;

	/**
	 * The '<em><b>04</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>04</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_04
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='04'"
	 * @generated
	 * @ordered
	 */
	public static final int _04_VALUE = 3;

	/**
	 * The '<em><b>05</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>05</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_05
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='05'"
	 * @generated
	 * @ordered
	 */
	public static final int _05_VALUE = 4;

	/**
	 * The '<em><b>06</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>06</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_06
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='06'"
	 * @generated
	 * @ordered
	 */
	public static final int _06_VALUE = 5;

	/**
	 * An array of all the '<em><b>Patient Medicine Change Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PatientMedicineChangeTypes[] VALUES_ARRAY =
		new PatientMedicineChangeTypes[] {
			_01,
			_02,
			_03,
			_04,
			_05,
			_06,
		};

	/**
	 * A public read-only list of all the '<em><b>Patient Medicine Change Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PatientMedicineChangeTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Patient Medicine Change Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PatientMedicineChangeTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PatientMedicineChangeTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Patient Medicine Change Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PatientMedicineChangeTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PatientMedicineChangeTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Patient Medicine Change Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PatientMedicineChangeTypes get(int value) {
		switch (value) {
			case _01_VALUE: return _01;
			case _02_VALUE: return _02;
			case _03_VALUE: return _03;
			case _04_VALUE: return _04;
			case _05_VALUE: return _05;
			case _06_VALUE: return _06;
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
	private PatientMedicineChangeTypes(int value, String name, String literal) {
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
	
} //PatientMedicineChangeTypes
