/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.mdht.uml.cda;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.ED;
import org.eclipse.mdht.uml.hl7.datatypes.II;
import org.eclipse.mdht.uml.hl7.datatypes.TS;
import org.eclipse.mdht.uml.hl7.rim.Participation;
import org.eclipse.mdht.uml.hl7.vocab.ContextControl;
import org.eclipse.mdht.uml.hl7.vocab.NullFlavor;
import org.eclipse.mdht.uml.hl7.vocab.ParticipationType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legal Authenticator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.cda.LegalAuthenticator#getRealmCodes <em>Realm Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.LegalAuthenticator#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.LegalAuthenticator#getTemplateIds <em>Template Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.LegalAuthenticator#getTime <em>Time</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.LegalAuthenticator#getSignatureCode <em>Signature Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.LegalAuthenticator#getAssignedEntity <em>Assigned Entity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.LegalAuthenticator#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.LegalAuthenticator#getTypeCode <em>Type Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.LegalAuthenticator#getContextControlCode <em>Context Control Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.LegalAuthenticator#getSDTCSignatureText <em>SDTC Signature Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.cda.CDAPackage#getLegalAuthenticator()
 * @model
 * @generated
 */
public interface LegalAuthenticator extends Participation {
	/**
	 * Returns the value of the '<em><b>Realm Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.hl7.datatypes.CS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realm Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realm Code</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getLegalAuthenticator_RealmCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CS> getRealmCodes();

	/**
	 * Returns the value of the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Id</em>' containment reference.
	 * @see #setTypeId(InfrastructureRootTypeId)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getLegalAuthenticator_TypeId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	InfrastructureRootTypeId getTypeId();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.LegalAuthenticator#getTypeId <em>Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Id</em>' containment reference.
	 * @see #getTypeId()
	 * @generated
	 */
	void setTypeId(InfrastructureRootTypeId value);

	/**
	 * Returns the value of the '<em><b>Template Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.hl7.datatypes.II}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Id</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getLegalAuthenticator_TemplateId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	EList<II> getTemplateIds();

	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' containment reference.
	 * @see #setTime(TS)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getLegalAuthenticator_Time()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	TS getTime();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.LegalAuthenticator#getTime <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' containment reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(TS value);

	/**
	 * Returns the value of the '<em><b>Signature Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature Code</em>' containment reference.
	 * @see #setSignatureCode(CS)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getLegalAuthenticator_SignatureCode()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	CS getSignatureCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.LegalAuthenticator#getSignatureCode <em>Signature Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Code</em>' containment reference.
	 * @see #getSignatureCode()
	 * @generated
	 */
	void setSignatureCode(CS value);

	/**
	 * Returns the value of the '<em><b>Assigned Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Entity</em>' containment reference.
	 * @see #setAssignedEntity(AssignedEntity)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getLegalAuthenticator_AssignedEntity()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	AssignedEntity getAssignedEntity();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.LegalAuthenticator#getAssignedEntity <em>Assigned Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Entity</em>' containment reference.
	 * @see #getAssignedEntity()
	 * @generated
	 */
	void setAssignedEntity(AssignedEntity value);

	/**
	 * Returns the value of the '<em><b>Null Flavor</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.mdht.uml.hl7.vocab.NullFlavor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Null Flavor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null Flavor</em>' attribute.
	 * @see org.eclipse.mdht.uml.hl7.vocab.NullFlavor
	 * @see #isSetNullFlavor()
	 * @see #unsetNullFlavor()
	 * @see #setNullFlavor(NullFlavor)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getLegalAuthenticator_NullFlavor()
	 * @model unsettable="true" ordered="false"
	 * @generated
	 */
	NullFlavor getNullFlavor();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.LegalAuthenticator#getNullFlavor <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Flavor</em>' attribute.
	 * @see org.eclipse.mdht.uml.hl7.vocab.NullFlavor
	 * @see #isSetNullFlavor()
	 * @see #unsetNullFlavor()
	 * @see #getNullFlavor()
	 * @generated
	 */
	void setNullFlavor(NullFlavor value);

	/**
	 * Unsets the value of the '{@link org.eclipse.mdht.uml.cda.LegalAuthenticator#getNullFlavor <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNullFlavor()
	 * @see #getNullFlavor()
	 * @see #setNullFlavor(NullFlavor)
	 * @generated
	 */
	void unsetNullFlavor();

	/**
	 * Returns whether the value of the '{@link org.eclipse.mdht.uml.cda.LegalAuthenticator#getNullFlavor <em>Null Flavor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Null Flavor</em>' attribute is set.
	 * @see #unsetNullFlavor()
	 * @see #getNullFlavor()
	 * @see #setNullFlavor(NullFlavor)
	 * @generated
	 */
	boolean isSetNullFlavor();

	/**
	 * Returns the value of the '<em><b>Type Code</b></em>' attribute.
	 * The default value is <code>"LA"</code>.
	 * The literals are from the enumeration {@link org.eclipse.mdht.uml.hl7.vocab.ParticipationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Code</em>' attribute.
	 * @see org.eclipse.mdht.uml.hl7.vocab.ParticipationType
	 * @see #isSetTypeCode()
	 * @see #unsetTypeCode()
	 * @see #setTypeCode(ParticipationType)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getLegalAuthenticator_TypeCode()
	 * @model default="LA" unsettable="true" ordered="false"
	 * @generated
	 */
	ParticipationType getTypeCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.LegalAuthenticator#getTypeCode <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Code</em>' attribute.
	 * @see org.eclipse.mdht.uml.hl7.vocab.ParticipationType
	 * @see #isSetTypeCode()
	 * @see #unsetTypeCode()
	 * @see #getTypeCode()
	 * @generated
	 */
	void setTypeCode(ParticipationType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.mdht.uml.cda.LegalAuthenticator#getTypeCode <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeCode()
	 * @see #getTypeCode()
	 * @see #setTypeCode(ParticipationType)
	 * @generated
	 */
	void unsetTypeCode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.mdht.uml.cda.LegalAuthenticator#getTypeCode <em>Type Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Code</em>' attribute is set.
	 * @see #unsetTypeCode()
	 * @see #getTypeCode()
	 * @see #setTypeCode(ParticipationType)
	 * @generated
	 */
	boolean isSetTypeCode();

	/**
	 * Returns the value of the '<em><b>Context Control Code</b></em>' attribute.
	 * The default value is <code>"OP"</code>.
	 * The literals are from the enumeration {@link org.eclipse.mdht.uml.hl7.vocab.ContextControl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Control Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Control Code</em>' attribute.
	 * @see org.eclipse.mdht.uml.hl7.vocab.ContextControl
	 * @see #isSetContextControlCode()
	 * @see #unsetContextControlCode()
	 * @see #setContextControlCode(ContextControl)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getLegalAuthenticator_ContextControlCode()
	 * @model default="OP" unsettable="true" ordered="false"
	 * @generated
	 */
	ContextControl getContextControlCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.LegalAuthenticator#getContextControlCode <em>Context Control Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Control Code</em>' attribute.
	 * @see org.eclipse.mdht.uml.hl7.vocab.ContextControl
	 * @see #isSetContextControlCode()
	 * @see #unsetContextControlCode()
	 * @see #getContextControlCode()
	 * @generated
	 */
	void setContextControlCode(ContextControl value);

	/**
	 * Unsets the value of the '{@link org.eclipse.mdht.uml.cda.LegalAuthenticator#getContextControlCode <em>Context Control Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContextControlCode()
	 * @see #getContextControlCode()
	 * @see #setContextControlCode(ContextControl)
	 * @generated
	 */
	void unsetContextControlCode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.mdht.uml.cda.LegalAuthenticator#getContextControlCode <em>Context Control Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Context Control Code</em>' attribute is set.
	 * @see #unsetContextControlCode()
	 * @see #getContextControlCode()
	 * @see #setContextControlCode(ContextControl)
	 * @generated
	 */
	boolean isSetContextControlCode();

	/**
	 * Returns the value of the '<em><b>SDTC Signature Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SDTC Signature Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SDTC Signature Text</em>' containment reference.
	 * @see #setSDTCSignatureText(ED)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getLegalAuthenticator_SDTCSignatureText()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='signatureText' namespace='urn:hl7-org:sdtc' kind='element'"
	 * @generated
	 */
	ED getSDTCSignatureText();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.LegalAuthenticator#getSDTCSignatureText <em>SDTC Signature Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SDTC Signature Text</em>' containment reference.
	 * @see #getSDTCSignatureText()
	 * @generated
	 */
	void setSDTCSignatureText(ED value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.isTypeCodeDefined() implies self.typeCode=vocab::ParticipationType::LA'"
	 * @generated
	 */
	boolean validateTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.isContextControlCodeDefined() implies self.contextControlCode=vocab::ContextControl::OP'"
	 * @generated
	 */
	boolean validateContextControlCode(DiagnosticChain diagnostics, Map<Object, Object> context);

} // LegalAuthenticator
