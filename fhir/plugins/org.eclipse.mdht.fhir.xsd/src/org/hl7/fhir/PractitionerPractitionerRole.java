/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Practitioner Practitioner Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A person who is directly or indirectly involved in the provisioning of healthcare.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.PractitionerPractitionerRole#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.PractitionerPractitionerRole#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.PractitionerPractitionerRole#getSpecialty <em>Specialty</em>}</li>
 *   <li>{@link org.hl7.fhir.PractitionerPractitionerRole#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.PractitionerPractitionerRole#getTelecom <em>Telecom</em>}</li>
 *   <li>{@link org.hl7.fhir.PractitionerPractitionerRole#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.PractitionerPractitionerRole#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.PractitionerPractitionerRole#getHealthcareService <em>Healthcare Service</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPractitionerPractitionerRole()
 * @model extendedMetaData="name='Practitioner.PractitionerRole' kind='elementOnly'"
 * @generated
 */
public interface PractitionerPractitionerRole extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization where the Practitioner performs the roles associated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPractitionerPractitionerRole_Organization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organization' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOrganization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PractitionerPractitionerRole#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Reference value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Roles which this practitioner is authorized to perform for the organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getPractitionerPractitionerRole_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRole();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PractitionerPractitionerRole#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Specialty</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific specialty of the practitioner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specialty</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPractitionerPractitionerRole_Specialty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specialty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getSpecialty();

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business Identifiers that are specific to a role/location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPractitionerPractitionerRole_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Telecom</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContactPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contact details that are specific to the role/location/service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telecom</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPractitionerPractitionerRole_Telecom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='telecom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactPoint> getTelecom();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The period during which the person is authorized to act as a practitioner in these role(s) for the organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getPractitionerPractitionerRole_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PractitionerPractitionerRole#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location(s) at which this practitioner provides care.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPractitionerPractitionerRole_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getLocation();

	/**
	 * Returns the value of the '<em><b>Healthcare Service</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of healthcare services that this worker provides for this role's Organization/Location(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Healthcare Service</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getPractitionerPractitionerRole_HealthcareService()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='healthcareService' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getHealthcareService();

} // PractitionerPractitionerRole
