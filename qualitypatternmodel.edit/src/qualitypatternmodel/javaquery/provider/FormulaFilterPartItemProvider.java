/**
 */
package qualitypatternmodel.javaquery.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import qualitypatternmodel.javaquery.FormulaFilterPart;
import qualitypatternmodel.javaquery.JavaqueryFactory;
import qualitypatternmodel.javaquery.JavaqueryPackage;

/**
 * This is the item provider adapter for a {@link qualitypatternmodel.javaquery.FormulaFilterPart} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FormulaFilterPartItemProvider extends JavaFilterPartItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormulaFilterPartItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(JavaqueryPackage.Literals.FORMULA_FILTER_PART__SUBFILTER1);
			childrenFeatures.add(JavaqueryPackage.Literals.FORMULA_FILTER_PART__SUBFILTER2);
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
	 * This returns FormulaFilterPart.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FormulaFilterPart"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_FormulaFilterPart_type");
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

		switch (notification.getFeatureID(FormulaFilterPart.class)) {
			case JavaqueryPackage.FORMULA_FILTER_PART__SUBFILTER1:
			case JavaqueryPackage.FORMULA_FILTER_PART__SUBFILTER2:
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
				(JavaqueryPackage.Literals.FORMULA_FILTER_PART__SUBFILTER1,
				 JavaqueryFactory.eINSTANCE.createFormulaFilterPart()));

		newChildDescriptors.add
			(createChildParameter
				(JavaqueryPackage.Literals.FORMULA_FILTER_PART__SUBFILTER1,
				 JavaqueryFactory.eINSTANCE.createBooleanFilterPart()));

		newChildDescriptors.add
			(createChildParameter
				(JavaqueryPackage.Literals.FORMULA_FILTER_PART__SUBFILTER1,
				 JavaqueryFactory.eINSTANCE.createOneArgFunctionFilterPart()));

		newChildDescriptors.add
			(createChildParameter
				(JavaqueryPackage.Literals.FORMULA_FILTER_PART__SUBFILTER1,
				 JavaqueryFactory.eINSTANCE.createListFilterPart()));

		newChildDescriptors.add
			(createChildParameter
				(JavaqueryPackage.Literals.FORMULA_FILTER_PART__SUBFILTER1,
				 JavaqueryFactory.eINSTANCE.createTwoArgFunctionFilterPart()));

		newChildDescriptors.add
			(createChildParameter
				(JavaqueryPackage.Literals.FORMULA_FILTER_PART__SUBFILTER2,
				 JavaqueryFactory.eINSTANCE.createFormulaFilterPart()));

		newChildDescriptors.add
			(createChildParameter
				(JavaqueryPackage.Literals.FORMULA_FILTER_PART__SUBFILTER2,
				 JavaqueryFactory.eINSTANCE.createBooleanFilterPart()));

		newChildDescriptors.add
			(createChildParameter
				(JavaqueryPackage.Literals.FORMULA_FILTER_PART__SUBFILTER2,
				 JavaqueryFactory.eINSTANCE.createOneArgFunctionFilterPart()));

		newChildDescriptors.add
			(createChildParameter
				(JavaqueryPackage.Literals.FORMULA_FILTER_PART__SUBFILTER2,
				 JavaqueryFactory.eINSTANCE.createListFilterPart()));

		newChildDescriptors.add
			(createChildParameter
				(JavaqueryPackage.Literals.FORMULA_FILTER_PART__SUBFILTER2,
				 JavaqueryFactory.eINSTANCE.createTwoArgFunctionFilterPart()));
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
			childFeature == JavaqueryPackage.Literals.FORMULA_FILTER_PART__SUBFILTER1 ||
			childFeature == JavaqueryPackage.Literals.FORMULA_FILTER_PART__SUBFILTER2;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
