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

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.uml.fhir.core.datatype.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.datatype.PositiveInt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Response Items Item Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseItemsItemDetail#getSequenceLinkId <em>Sequence Link Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseItemsItemDetail#getAdjudications <em>Adjudication</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseItemsItemDetail#getSubDetails <em>Sub Detail</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponseItemsItemDetail()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Items_ItemDetail'"
 * @generated
 */
public interface ClaimResponseItemsItemDetail extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence Link Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Link Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Link Id</em>' reference.
	 * @see #setSequenceLinkId(PositiveInt)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponseItemsItemDetail_SequenceLinkId()
	 * @model required="true"
	 * @generated
	 */
	PositiveInt getSequenceLinkId();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseItemsItemDetail#getSequenceLinkId <em>Sequence Link Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Link Id</em>' reference.
	 * @see #getSequenceLinkId()
	 * @generated
	 */
	void setSequenceLinkId(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Adjudication</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseItemsItemDetailDetailAdjudication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adjudication</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adjudication</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponseItemsItemDetail_Adjudication()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClaimResponseItemsItemDetailDetailAdjudication> getAdjudications();

	/**
	 * Returns the value of the '<em><b>Sub Detail</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseItemsItemDetailSubDetail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Detail</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Detail</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponseItemsItemDetail_SubDetail()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClaimResponseItemsItemDetailSubDetail> getSubDetails();

} // ClaimResponseItemsItemDetail
