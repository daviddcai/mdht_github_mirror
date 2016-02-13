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
 * A representation of the literals of the enumeration '<em><b>Composition Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getCompositionStatus()
 * @model
 * @generated
 */
public enum CompositionStatus implements Enumerator {
	/**
	 * The '<em><b>Preliminary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRELIMINARY_VALUE
	 * @generated
	 * @ordered
	 */
	PRELIMINARY(0, "preliminary", "preliminary"),

	/**
	 * The '<em><b>Final</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINAL_VALUE
	 * @generated
	 * @ordered
	 */
	FINAL(1, "final", "final"),

	/**
	 * The '<em><b>Amended</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMENDED_VALUE
	 * @generated
	 * @ordered
	 */
	AMENDED(2, "amended", "amended"),

	/**
	 * The '<em><b>Enteredinerror</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTEREDINERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ENTEREDINERROR(3, "enteredinerror", "enteredinerror");

	/**
	 * The '<em><b>Preliminary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Preliminary</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRELIMINARY
	 * @model name="preliminary"
	 * @generated
	 * @ordered
	 */
	public static final int PRELIMINARY_VALUE = 0;

	/**
	 * The '<em><b>Final</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Final</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FINAL
	 * @model name="final"
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_VALUE = 1;

	/**
	 * The '<em><b>Amended</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Amended</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AMENDED
	 * @model name="amended"
	 * @generated
	 * @ordered
	 */
	public static final int AMENDED_VALUE = 2;

	/**
	 * The '<em><b>Enteredinerror</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enteredinerror</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENTEREDINERROR
	 * @model name="enteredinerror"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='entered-in-error'"
	 * @generated
	 * @ordered
	 */
	public static final int ENTEREDINERROR_VALUE = 3;

	/**
	 * An array of all the '<em><b>Composition Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CompositionStatus[] VALUES_ARRAY =
		new CompositionStatus[] {
			PRELIMINARY,
			FINAL,
			AMENDED,
			ENTEREDINERROR,
		};

	/**
	 * A public read-only list of all the '<em><b>Composition Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CompositionStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Composition Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CompositionStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CompositionStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Composition Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CompositionStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CompositionStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Composition Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CompositionStatus get(int value) {
		switch (value) {
			case PRELIMINARY_VALUE: return PRELIMINARY;
			case FINAL_VALUE: return FINAL;
			case AMENDED_VALUE: return AMENDED;
			case ENTEREDINERROR_VALUE: return ENTEREDINERROR;
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
	private CompositionStatus(int value, String name, String literal) {
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
	
} //CompositionStatus