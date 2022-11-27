/**
 */
package qualitypatternmodel.parameters.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import qualitypatternmodel.adaptionneo4j.Adaptionneo4jFactory;

import qualitypatternmodel.adaptionrdf.AdaptionrdfFactory;

import qualitypatternmodel.adaptionxml.AdaptionxmlFactory;

import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;

import qualitypatternmodel.patternstructure.provider.PatternElementItemProvider;

/**
 * This is the item provider adapter for a {@link qualitypatternmodel.parameters.ParameterList} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterListItemProvider extends PatternElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterListItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ParametersPackage.Literals.PARAMETER_LIST__PARAMETERS);
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
	 * This returns ParameterList.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ParameterList"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ParameterList)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_ParameterList_type") :
			getString("_UI_ParameterList_type") + " " + label;
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

		switch (notification.getFeatureID(ParameterList.class)) {
			case ParametersPackage.PARAMETER_LIST__PARAMETERS:
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
				(ParametersPackage.Literals.PARAMETER_LIST__PARAMETERS,
				 ParametersFactory.eINSTANCE.createComparisonOptionParam()));

		newChildDescriptors.add
			(createChildParameter
				(ParametersPackage.Literals.PARAMETER_LIST__PARAMETERS,
				 ParametersFactory.eINSTANCE.createBooleanParam()));

		newChildDescriptors.add
			(createChildParameter
				(ParametersPackage.Literals.PARAMETER_LIST__PARAMETERS,
				 ParametersFactory.eINSTANCE.createTextListParam()));

		newChildDescriptors.add
			(createChildParameter
				(ParametersPackage.Literals.PARAMETER_LIST__PARAMETERS,
				 ParametersFactory.eINSTANCE.createTextLiteralParam()));

		newChildDescriptors.add
			(createChildParameter
				(ParametersPackage.Literals.PARAMETER_LIST__PARAMETERS,
				 ParametersFactory.eINSTANCE.createNumberParam()));

		newChildDescriptors.add
			(createChildParameter
				(ParametersPackage.Literals.PARAMETER_LIST__PARAMETERS,
				 ParametersFactory.eINSTANCE.createDateParam()));

		newChildDescriptors.add
			(createChildParameter
				(ParametersPackage.Literals.PARAMETER_LIST__PARAMETERS,
				 ParametersFactory.eINSTANCE.createTimeParam()));

		newChildDescriptors.add
			(createChildParameter
				(ParametersPackage.Literals.PARAMETER_LIST__PARAMETERS,
				 ParametersFactory.eINSTANCE.createUntypedParameterValue()));

		newChildDescriptors.add
			(createChildParameter
				(ParametersPackage.Literals.PARAMETER_LIST__PARAMETERS,
				 ParametersFactory.eINSTANCE.createDateTimeParam()));

		newChildDescriptors.add
			(createChildParameter
				(ParametersPackage.Literals.PARAMETER_LIST__PARAMETERS,
				 ParametersFactory.eINSTANCE.createTypeOptionParam()));

		newChildDescriptors.add
			(createChildParameter
				(ParametersPackage.Literals.PARAMETER_LIST__PARAMETERS,
				 ParametersFactory.eINSTANCE.createKeyValueParam()));

		newChildDescriptors.add
			(createChildParameter
				(ParametersPackage.Literals.PARAMETER_LIST__PARAMETERS,
				 ParametersFactory.eINSTANCE.createMultiListParam()));

		newChildDescriptors.add
			(createChildParameter
				(ParametersPackage.Literals.PARAMETER_LIST__PARAMETERS,
				 AdaptionxmlFactory.eINSTANCE.createXmlAxisOptionParam()));

		newChildDescriptors.add
			(createChildParameter
				(ParametersPackage.Literals.PARAMETER_LIST__PARAMETERS,
				 AdaptionxmlFactory.eINSTANCE.createXmlPropertyOptionParam()));

		newChildDescriptors.add
			(createChildParameter
				(ParametersPackage.Literals.PARAMETER_LIST__PARAMETERS,
				 AdaptionxmlFactory.eINSTANCE.createXmlPathParam()));

		newChildDescriptors.add
			(createChildParameter
				(ParametersPackage.Literals.PARAMETER_LIST__PARAMETERS,
				 AdaptionrdfFactory.eINSTANCE.createIriParam()));

		newChildDescriptors.add
			(createChildParameter
				(ParametersPackage.Literals.PARAMETER_LIST__PARAMETERS,
				 AdaptionrdfFactory.eINSTANCE.createIriListParam()));

		newChildDescriptors.add
			(createChildParameter
				(ParametersPackage.Literals.PARAMETER_LIST__PARAMETERS,
				 AdaptionrdfFactory.eINSTANCE.createRdfPathParam()));

		newChildDescriptors.add
			(createChildParameter
				(ParametersPackage.Literals.PARAMETER_LIST__PARAMETERS,
				 Adaptionneo4jFactory.eINSTANCE.createNeoElementPathParam()));

		newChildDescriptors.add
			(createChildParameter
				(ParametersPackage.Literals.PARAMETER_LIST__PARAMETERS,
				 Adaptionneo4jFactory.eINSTANCE.createNeoPropertyPathParam()));
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
