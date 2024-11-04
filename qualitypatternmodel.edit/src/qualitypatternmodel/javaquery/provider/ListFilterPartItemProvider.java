/**
 */
package qualitypatternmodel.javaquery.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import qualitypatternmodel.javaquery.JavaqueryFactory;
import qualitypatternmodel.javaquery.JavaqueryPackage;
import qualitypatternmodel.javaquery.ListFilterPart;

import qualitypatternmodel.patternstructure.Quantifier;

/**
 * This is the item provider adapter for a {@link qualitypatternmodel.javaquery.ListFilterPart} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ListFilterPartItemProvider extends BooleanFilterPartItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListFilterPartItemProvider(AdapterFactory adapterFactory) {
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

			addArgumentPropertyDescriptor(object);
			addQuantifierPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Argument feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArgumentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ListFilterPart_argument_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ListFilterPart_argument_feature", "_UI_ListFilterPart_type"),
				 JavaqueryPackage.Literals.LIST_FILTER_PART__ARGUMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Quantifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQuantifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ListFilterPart_quantifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ListFilterPart_quantifier_feature", "_UI_ListFilterPart_type"),
				 JavaqueryPackage.Literals.LIST_FILTER_PART__QUANTIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(JavaqueryPackage.Literals.LIST_FILTER_PART__SUBFILTER);
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
	 * This returns ListFilterPart.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ListFilterPart"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Quantifier labelValue = ((ListFilterPart)object).getQuantifier();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_ListFilterPart_type") :
			getString("_UI_ListFilterPart_type") + " " + label;
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

		switch (notification.getFeatureID(ListFilterPart.class)) {
			case JavaqueryPackage.LIST_FILTER_PART__QUANTIFIER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case JavaqueryPackage.LIST_FILTER_PART__SUBFILTER:
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
				(JavaqueryPackage.Literals.LIST_FILTER_PART__SUBFILTER,
				 JavaqueryFactory.eINSTANCE.createFormulaFilterPart()));

		newChildDescriptors.add
			(createChildParameter
				(JavaqueryPackage.Literals.LIST_FILTER_PART__SUBFILTER,
				 JavaqueryFactory.eINSTANCE.createBooleanFilterElement()));

		newChildDescriptors.add
			(createChildParameter
				(JavaqueryPackage.Literals.LIST_FILTER_PART__SUBFILTER,
				 JavaqueryFactory.eINSTANCE.createOneArgFunctionFilterPart()));

		newChildDescriptors.add
			(createChildParameter
				(JavaqueryPackage.Literals.LIST_FILTER_PART__SUBFILTER,
				 JavaqueryFactory.eINSTANCE.createListFilterPart()));

		newChildDescriptors.add
			(createChildParameter
				(JavaqueryPackage.Literals.LIST_FILTER_PART__SUBFILTER,
				 JavaqueryFactory.eINSTANCE.createNotFilterPart()));

		newChildDescriptors.add
			(createChildParameter
				(JavaqueryPackage.Literals.LIST_FILTER_PART__SUBFILTER,
				 JavaqueryFactory.eINSTANCE.createCountFilterPart()));

		newChildDescriptors.add
			(createChildParameter
				(JavaqueryPackage.Literals.LIST_FILTER_PART__SUBFILTER,
				 JavaqueryFactory.eINSTANCE.createQuantifierFilterPart()));
	}

}
