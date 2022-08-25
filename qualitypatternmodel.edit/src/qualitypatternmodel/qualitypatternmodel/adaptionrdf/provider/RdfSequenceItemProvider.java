/**
 */
package qualitypatternmodel.qualitypatternmodel.adaptionrdf.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import qualitypatternmodel.adaptionrdf.provider.RdfPathPartItemProvider;

import qualitypatternmodel.parameters.provider.QualitypatternmodelEditPlugin;

import qualitypatternmodel.qualitypatternmodel.adaptionrdf.AdaptionrdfFactory;
import qualitypatternmodel.qualitypatternmodel.adaptionrdf.AdaptionrdfPackage;
import qualitypatternmodel.qualitypatternmodel.adaptionrdf.RdfSequence;

/**
 * This is the item provider adapter for a {@link qualitypatternmodel.qualitypatternmodel.adaptionrdf.RdfSequence} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RdfSequenceItemProvider extends RdfPathPartItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdfSequenceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AdaptionrdfPackage.Literals.RDF_SEQUENCE__ITEMS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns RdfSequence.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RdfSequence"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RdfSequence)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_RdfSequence_type") :
			getString("_UI_RdfSequence_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(RdfSequence.class)) {
			case AdaptionrdfPackage.RDF_SEQUENCE__ITEMS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(AdaptionrdfPackage.Literals.RDF_SEQUENCE__ITEMS,
				 AdaptionrdfFactory.eINSTANCE.createRdfSinglePredicate()));

		newChildDescriptors.add
			(createChildParameter
				(AdaptionrdfPackage.Literals.RDF_SEQUENCE__ITEMS,
				 AdaptionrdfFactory.eINSTANCE.createRdfXor()));

		newChildDescriptors.add
			(createChildParameter
				(AdaptionrdfPackage.Literals.RDF_SEQUENCE__ITEMS,
				 AdaptionrdfFactory.eINSTANCE.createRdfSequence()));

		newChildDescriptors.add
			(createChildParameter
				(AdaptionrdfPackage.Literals.RDF_SEQUENCE__ITEMS,
				 qualitypatternmodel.adaptionrdf.AdaptionrdfFactory.eINSTANCE.createRdfSinglePredicate()));

		newChildDescriptors.add
			(createChildParameter
				(AdaptionrdfPackage.Literals.RDF_SEQUENCE__ITEMS,
				 qualitypatternmodel.adaptionrdf.AdaptionrdfFactory.eINSTANCE.createRdfXor()));

		newChildDescriptors.add
			(createChildParameter
				(AdaptionrdfPackage.Literals.RDF_SEQUENCE__ITEMS,
				 qualitypatternmodel.adaptionrdf.AdaptionrdfFactory.eINSTANCE.createRdfSequence()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return QualitypatternmodelEditPlugin.INSTANCE;
	}

}
