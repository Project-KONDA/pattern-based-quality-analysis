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
import org.eclipse.emf.edit.provider.ViewerNotification;

import qualitypatternmodel.javaquery.JavaqueryFactory;
import qualitypatternmodel.javaquery.JavaqueryPackage;
import qualitypatternmodel.javaquery.TwoArgFunctionFilterPart;

/**
 * This is the item provider adapter for a {@link qualitypatternmodel.javaquery.TwoArgFunctionFilterPart} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TwoArgFunctionFilterPartItemProvider extends JavaFilterPartItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwoArgFunctionFilterPartItemProvider(AdapterFactory adapterFactory) {
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

			addArgument1PropertyDescriptor(object);
			addArgument2PropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Argument1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArgument1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TwoArgFunctionFilterPart_argument1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TwoArgFunctionFilterPart_argument1_feature", "_UI_TwoArgFunctionFilterPart_type"),
				 JavaqueryPackage.Literals.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT1,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Argument2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArgument2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TwoArgFunctionFilterPart_argument2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TwoArgFunctionFilterPart_argument2_feature", "_UI_TwoArgFunctionFilterPart_type"),
				 JavaqueryPackage.Literals.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT2,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(JavaqueryPackage.Literals.TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR2);
			childrenFeatures.add(JavaqueryPackage.Literals.TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR1);
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
	 * This returns TwoArgFunctionFilterPart.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TwoArgFunctionFilterPart"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_TwoArgFunctionFilterPart_type");
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

		switch (notification.getFeatureID(TwoArgFunctionFilterPart.class)) {
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR2:
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR1:
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
				(JavaqueryPackage.Literals.TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR2,
				 JavaqueryFactory.eINSTANCE.createEveryCombinator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaqueryPackage.Literals.TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR2,
				 JavaqueryFactory.eINSTANCE.createAnyCombinator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaqueryPackage.Literals.TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR2,
				 JavaqueryFactory.eINSTANCE.createNoneCombinator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaqueryPackage.Literals.TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR2,
				 JavaqueryFactory.eINSTANCE.createCountCombinator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaqueryPackage.Literals.TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR1,
				 JavaqueryFactory.eINSTANCE.createEveryCombinator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaqueryPackage.Literals.TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR1,
				 JavaqueryFactory.eINSTANCE.createAnyCombinator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaqueryPackage.Literals.TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR1,
				 JavaqueryFactory.eINSTANCE.createNoneCombinator()));

		newChildDescriptors.add
			(createChildParameter
				(JavaqueryPackage.Literals.TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR1,
				 JavaqueryFactory.eINSTANCE.createCountCombinator()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == JavaqueryPackage.Literals.TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR2 ||
			childFeature == JavaqueryPackage.Literals.TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR1;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
