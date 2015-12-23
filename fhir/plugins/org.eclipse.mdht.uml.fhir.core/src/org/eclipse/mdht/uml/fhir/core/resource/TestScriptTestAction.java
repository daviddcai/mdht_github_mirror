/*******************************************************************************
 * Copyright (c) 2015 David Carlson and others.
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
package org.eclipse.mdht.uml.fhir.core.resource;

import org.eclipse.mdht.uml.fhir.core.datatype.BackboneElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Test Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptTestAction#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptTestAction#getAssert <em>Assert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getTestScriptTestAction()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Test_Action'"
 * @generated
 */
public interface TestScriptTestAction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(TestScriptSetupActionOperation)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getTestScriptTestAction_Operation()
	 * @model containment="true"
	 * @generated
	 */
	TestScriptSetupActionOperation getOperation();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptTestAction#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(TestScriptSetupActionOperation value);

	/**
	 * Returns the value of the '<em><b>Assert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assert</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assert</em>' containment reference.
	 * @see #setAssert(TestScriptSetupActionAssert)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getTestScriptTestAction_Assert()
	 * @model containment="true"
	 * @generated
	 */
	TestScriptSetupActionAssert getAssert();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptTestAction#getAssert <em>Assert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assert</em>' containment reference.
	 * @see #getAssert()
	 * @generated
	 */
	void setAssert(TestScriptSetupActionAssert value);

} // TestScriptTestAction
