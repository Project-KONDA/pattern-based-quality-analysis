/**
 */
package qualitypatternmodel.javaquery.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import qualitypatternmodel.javaquery.JavaqueryPackage;
import qualitypatternmodel.javaquery.OneArgTwoNumberFunctionFilterPart;

/**
 * This is the item provider adapter for a {@link qualitypatternmodel.javaquery.OneArgTwoNumberFunctionFilterPart} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OneArgTwoNumberFunctionFilterPartItemProvider extends OneArgFunctionFilterPartItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneArgTwoNumberFunctionFilterPartItemProvider(AdapterFactory adapterFactory) {
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

			addNumber1PropertyDescriptor(object);
			addNumber2PropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Number1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumber1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OneArgTwoNumberFunctionFilterPart_number1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OneArgTwoNumberFunctionFilterPart_number1_feature", "_UI_OneArgTwoNumberFunctionFilterPart_type"),
				 JavaqueryPackage.Literals.ONE_ARG_TWO_NUMBER_FUNCTION_FILTER_PART__NUMBER1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumber2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OneArgTwoNumberFunctionFilterPart_number2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OneArgTwoNumberFunctionFilterPart_number2_feature", "_UI_OneArgTwoNumberFunctionFilterPart_type"),
				 JavaqueryPackage.Literals.ONE_ARG_TWO_NUMBER_FUNCTION_FILTER_PART__NUMBER2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns OneArgTwoNumberFunctionFilterPart.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OneArgTwoNumberFunctionFilterPart"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		OneArgTwoNumberFunctionFilterPart oneArgTwoNumberFunctionFilterPart = (OneArgTwoNumberFunctionFilterPart)object;
		return getString("_UI_OneArgTwoNumberFunctionFilterPart_type") + " " + oneArgTwoNumberFunctionFilterPart.isNegate();
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

		switch (notification.getFeatureID(OneArgTwoNumberFunctionFilterPart.class)) {
			case JavaqueryPackage.ONE_ARG_TWO_NUMBER_FUNCTION_FILTER_PART__NUMBER1:
			case JavaqueryPackage.ONE_ARG_TWO_NUMBER_FUNCTION_FILTER_PART__NUMBER2:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
