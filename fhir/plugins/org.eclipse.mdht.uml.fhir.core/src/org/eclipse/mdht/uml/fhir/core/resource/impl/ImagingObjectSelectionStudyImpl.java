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
package org.eclipse.mdht.uml.fhir.core.resource.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Oid;
import org.eclipse.mdht.uml.fhir.core.datatype.Uri;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.ImagingObjectSelectionStudy;
import org.eclipse.mdht.uml.fhir.core.resource.ImagingObjectSelectionStudySeries;
import org.eclipse.mdht.uml.fhir.core.resource.ImagingStudy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imaging Object Selection Study</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImagingObjectSelectionStudyImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImagingObjectSelectionStudyImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImagingObjectSelectionStudyImpl#getImagingStudy <em>Imaging Study</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImagingObjectSelectionStudyImpl#getSeries <em>Series</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImagingObjectSelectionStudyImpl extends BackboneElementImpl implements ImagingObjectSelectionStudy {
	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected Oid uid;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri url;

	/**
	 * The cached value of the '{@link #getImagingStudy() <em>Imaging Study</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagingStudy()
	 * @generated
	 * @ordered
	 */
	protected ImagingStudy imagingStudy;

	/**
	 * The cached value of the '{@link #getSeries() <em>Series</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagingObjectSelectionStudySeries> series;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagingObjectSelectionStudyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getImagingObjectSelectionStudy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid getUid() {
		if (uid != null && uid.eIsProxy()) {
			InternalEObject oldUid = (InternalEObject)uid;
			uid = (Oid)eResolveProxy(oldUid);
			if (uid != oldUid) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY__UID, oldUid, uid));
			}
		}
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid basicGetUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(Oid newUid) {
		Oid oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getUrl() {
		if (url != null && url.eIsProxy()) {
			InternalEObject oldUrl = (InternalEObject)url;
			url = (Uri)eResolveProxy(oldUrl);
			if (url != oldUrl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY__URL, oldUrl, url));
			}
		}
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(Uri newUrl) {
		Uri oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudy getImagingStudy() {
		if (imagingStudy != null && imagingStudy.eIsProxy()) {
			InternalEObject oldImagingStudy = (InternalEObject)imagingStudy;
			imagingStudy = (ImagingStudy)eResolveProxy(oldImagingStudy);
			if (imagingStudy != oldImagingStudy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY__IMAGING_STUDY, oldImagingStudy, imagingStudy));
			}
		}
		return imagingStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudy basicGetImagingStudy() {
		return imagingStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImagingStudy(ImagingStudy newImagingStudy) {
		ImagingStudy oldImagingStudy = imagingStudy;
		imagingStudy = newImagingStudy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY__IMAGING_STUDY, oldImagingStudy, imagingStudy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImagingObjectSelectionStudySeries> getSeries() {
		if (series == null) {
			series = new EObjectContainmentEList<ImagingObjectSelectionStudySeries>(ImagingObjectSelectionStudySeries.class, this, FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY__SERIES);
		}
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY__SERIES:
				return ((InternalEList<?>)getSeries()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY__UID:
				if (resolve) return getUid();
				return basicGetUid();
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY__URL:
				if (resolve) return getUrl();
				return basicGetUrl();
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY__IMAGING_STUDY:
				if (resolve) return getImagingStudy();
				return basicGetImagingStudy();
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY__SERIES:
				return getSeries();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY__UID:
				setUid((Oid)newValue);
				return;
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY__URL:
				setUrl((Uri)newValue);
				return;
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY__IMAGING_STUDY:
				setImagingStudy((ImagingStudy)newValue);
				return;
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY__SERIES:
				getSeries().clear();
				getSeries().addAll((Collection<? extends ImagingObjectSelectionStudySeries>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY__UID:
				setUid((Oid)null);
				return;
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY__URL:
				setUrl((Uri)null);
				return;
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY__IMAGING_STUDY:
				setImagingStudy((ImagingStudy)null);
				return;
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY__SERIES:
				getSeries().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY__UID:
				return uid != null;
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY__URL:
				return url != null;
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY__IMAGING_STUDY:
				return imagingStudy != null;
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY__SERIES:
				return series != null && !series.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImagingObjectSelectionStudyImpl
