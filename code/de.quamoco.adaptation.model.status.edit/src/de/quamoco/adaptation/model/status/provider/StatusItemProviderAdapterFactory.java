/*-------------------------------------------------------------------------+
|                                                                          |
| Copyright 2012 Technische Universitaet Muenchen and                      |
| Fraunhofer-Institut fuer Experimentelles Software Engineering (IESE)     |
|                                                                          |
| Licensed under the Apache License, Version 2.0 (the "License");          |
| you may not use this file except in compliance with the License.         |
| You may obtain a copy of the License at                                  |
|                                                                          |
|    http://www.apache.org/licenses/LICENSE-2.0                            |
|                                                                          |
| Unless required by applicable law or agreed to in writing, software      |
| distributed under the License is distributed on an "AS IS" BASIS,        |
| WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. |
| See the License for the specific language governing permissions and      |
| limitations under the License.                                           |
|                                                                          |
+-------------------------------------------------------------------------*/

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.quamoco.adaptation.model.status.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import de.quamoco.adaptation.model.status.util.StatusAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StatusItemProviderAdapterFactory extends StatusAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.quamoco.adaptation.model.status.AdaptationHistoryItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdaptationHistoryItemItemProvider adaptationHistoryItemItemProvider;

	/**
	 * This creates an adapter for a {@link de.quamoco.adaptation.model.status.AdaptationHistoryItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAdaptationHistoryItemAdapter() {
		if (adaptationHistoryItemItemProvider == null) {
			adaptationHistoryItemItemProvider = new AdaptationHistoryItemItemProvider(this);
		}

		return adaptationHistoryItemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.quamoco.adaptation.model.status.AdaptationTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdaptationTaskItemProvider adaptationTaskItemProvider;

	/**
	 * This creates an adapter for a {@link de.quamoco.adaptation.model.status.AdaptationTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAdaptationTaskAdapter() {
		if (adaptationTaskItemProvider == null) {
			adaptationTaskItemProvider = new AdaptationTaskItemProvider(this);
		}

		return adaptationTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.quamoco.adaptation.model.status.UserMarkedCompleted} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserMarkedCompletedItemProvider userMarkedCompletedItemProvider;

	/**
	 * This creates an adapter for a {@link de.quamoco.adaptation.model.status.UserMarkedCompleted}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUserMarkedCompletedAdapter() {
		if (userMarkedCompletedItemProvider == null) {
			userMarkedCompletedItemProvider = new UserMarkedCompletedItemProvider(this);
		}

		return userMarkedCompletedItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.quamoco.adaptation.model.status.FeatureRequired} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureRequiredItemProvider featureRequiredItemProvider;

	/**
	 * This creates an adapter for a {@link de.quamoco.adaptation.model.status.FeatureRequired}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFeatureRequiredAdapter() {
		if (featureRequiredItemProvider == null) {
			featureRequiredItemProvider = new FeatureRequiredItemProvider(this);
		}

		return featureRequiredItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.quamoco.adaptation.model.status.AdaptationAttributes} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdaptationAttributesItemProvider adaptationAttributesItemProvider;

	/**
	 * This creates an adapter for a {@link de.quamoco.adaptation.model.status.AdaptationAttributes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAdaptationAttributesAdapter() {
		if (adaptationAttributesItemProvider == null) {
			adaptationAttributesItemProvider = new AdaptationAttributesItemProvider(this);
		}

		return adaptationAttributesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.quamoco.adaptation.model.status.QmAdaptationAttributes} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QmAdaptationAttributesItemProvider qmAdaptationAttributesItemProvider;

	/**
	 * This creates an adapter for a {@link de.quamoco.adaptation.model.status.QmAdaptationAttributes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQmAdaptationAttributesAdapter() {
		if (qmAdaptationAttributesItemProvider == null) {
			qmAdaptationAttributesItemProvider = new QmAdaptationAttributesItemProvider(this);
		}

		return qmAdaptationAttributesItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (adaptationHistoryItemItemProvider != null) adaptationHistoryItemItemProvider.dispose();
		if (adaptationTaskItemProvider != null) adaptationTaskItemProvider.dispose();
		if (userMarkedCompletedItemProvider != null) userMarkedCompletedItemProvider.dispose();
		if (featureRequiredItemProvider != null) featureRequiredItemProvider.dispose();
		if (adaptationAttributesItemProvider != null) adaptationAttributesItemProvider.dispose();
		if (qmAdaptationAttributesItemProvider != null) qmAdaptationAttributesItemProvider.dispose();
	}

}
