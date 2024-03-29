/**
 */
package qualitypatternmodel.adaptionrdf.provider;

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

import qualitypatternmodel.adaptionrdf.util.AdaptionrdfAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AdaptionrdfItemProviderAdapterFactory extends AdaptionrdfAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public AdaptionrdfItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.adaptionrdf.RdfPredicate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdfPredicateItemProvider rdfPredicateItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.adaptionrdf.RdfPredicate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRdfPredicateAdapter() {
		if (rdfPredicateItemProvider == null) {
			rdfPredicateItemProvider = new RdfPredicateItemProvider(this);
		}

		return rdfPredicateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.adaptionrdf.RdfIriNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdfIriNodeItemProvider rdfIriNodeItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.adaptionrdf.RdfIriNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRdfIriNodeAdapter() {
		if (rdfIriNodeItemProvider == null) {
			rdfIriNodeItemProvider = new RdfIriNodeItemProvider(this);
		}

		return rdfIriNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.adaptionrdf.RdfSinglePredicate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdfSinglePredicateItemProvider rdfSinglePredicateItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.adaptionrdf.RdfSinglePredicate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRdfSinglePredicateAdapter() {
		if (rdfSinglePredicateItemProvider == null) {
			rdfSinglePredicateItemProvider = new RdfSinglePredicateItemProvider(this);
		}

		return rdfSinglePredicateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.adaptionrdf.RdfLiteralNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdfLiteralNodeItemProvider rdfLiteralNodeItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.adaptionrdf.RdfLiteralNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRdfLiteralNodeAdapter() {
		if (rdfLiteralNodeItemProvider == null) {
			rdfLiteralNodeItemProvider = new RdfLiteralNodeItemProvider(this);
		}

		return rdfLiteralNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.adaptionrdf.IriParam} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IriParamItemProvider iriParamItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.adaptionrdf.IriParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIriParamAdapter() {
		if (iriParamItemProvider == null) {
			iriParamItemProvider = new IriParamItemProvider(this);
		}

		return iriParamItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.adaptionrdf.RdfXor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdfXorItemProvider rdfXorItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.adaptionrdf.RdfXor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRdfXorAdapter() {
		if (rdfXorItemProvider == null) {
			rdfXorItemProvider = new RdfXorItemProvider(this);
		}

		return rdfXorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.adaptionrdf.RdfSequence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdfSequenceItemProvider rdfSequenceItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.adaptionrdf.RdfSequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRdfSequenceAdapter() {
		if (rdfSequenceItemProvider == null) {
			rdfSequenceItemProvider = new RdfSequenceItemProvider(this);
		}

		return rdfSequenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.adaptionrdf.IriListParam} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IriListParamItemProvider iriListParamItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.adaptionrdf.IriListParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIriListParamAdapter() {
		if (iriListParamItemProvider == null) {
			iriListParamItemProvider = new IriListParamItemProvider(this);
		}

		return iriListParamItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.adaptionrdf.RdfPathParam} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdfPathParamItemProvider rdfPathParamItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.adaptionrdf.RdfPathParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRdfPathParamAdapter() {
		if (rdfPathParamItemProvider == null) {
			rdfPathParamItemProvider = new RdfPathParamItemProvider(this);
		}

		return rdfPathParamItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.adaptionrdf.RdfPathPart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdfPathPartItemProvider rdfPathPartItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.adaptionrdf.RdfPathPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRdfPathPartAdapter() {
		if (rdfPathPartItemProvider == null) {
			rdfPathPartItemProvider = new RdfPathPartItemProvider(this);
		}

		return rdfPathPartItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public void dispose() {
		if (rdfPredicateItemProvider != null) rdfPredicateItemProvider.dispose();
		if (rdfIriNodeItemProvider != null) rdfIriNodeItemProvider.dispose();
		if (rdfSinglePredicateItemProvider != null) rdfSinglePredicateItemProvider.dispose();
		if (rdfLiteralNodeItemProvider != null) rdfLiteralNodeItemProvider.dispose();
		if (iriParamItemProvider != null) iriParamItemProvider.dispose();
		if (rdfXorItemProvider != null) rdfXorItemProvider.dispose();
		if (rdfSequenceItemProvider != null) rdfSequenceItemProvider.dispose();
		if (iriListParamItemProvider != null) iriListParamItemProvider.dispose();
		if (rdfPathParamItemProvider != null) rdfPathParamItemProvider.dispose();
		if (rdfPathPartItemProvider != null) rdfPathPartItemProvider.dispose();
	}

}
