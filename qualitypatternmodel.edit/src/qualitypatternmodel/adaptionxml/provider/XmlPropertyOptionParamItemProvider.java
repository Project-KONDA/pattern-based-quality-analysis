/**
 */
package qualitypatternmodel.adaptionxml.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import qualitypatternmodel.adaptionneo4j.Adaptionneo4jFactory;

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;

import qualitypatternmodel.parameters.ParametersFactory;

import qualitypatternmodel.parameters.provider.ParameterItemProvider;
import qualitypatternmodel.parameters.provider.QualitypatternmodelEditPlugin;

/**
 * This is the item provider adapter for a {@link qualitypatternmodel.adaptionxml.XmlPropertyOptionParam} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XmlPropertyOptionParamItemProvider extends ParameterItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlPropertyOptionParamItemProvider(AdapterFactory adapterFactory) {
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

			addOptionsPropertyDescriptor(object);
			addValuePropertyDescriptor(object);
			addXmlAxisPartConditionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Options feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOptionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XmlPropertyOptionParam_options_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XmlPropertyOptionParam_options_feature", "_UI_XmlPropertyOptionParam_type"),
				 AdaptionxmlPackage.Literals.XML_PROPERTY_OPTION_PARAM__OPTIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XmlPropertyOptionParam_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XmlPropertyOptionParam_value_feature", "_UI_XmlPropertyOptionParam_type"),
				 AdaptionxmlPackage.Literals.XML_PROPERTY_OPTION_PARAM__VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Xml Axis Part Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXmlAxisPartConditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XmlPropertyOptionParam_xmlAxisPartCondition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XmlPropertyOptionParam_xmlAxisPartCondition_feature", "_UI_XmlPropertyOptionParam_type"),
				 AdaptionxmlPackage.Literals.XML_PROPERTY_OPTION_PARAM__XML_AXIS_PART_CONDITION,
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
			childrenFeatures.add(AdaptionxmlPackage.Literals.XML_PROPERTY_OPTION_PARAM__ATTRIBUTE_NAME);
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
	 * This returns XmlPropertyOptionParam.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/XmlPropertyOptionParam"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((XmlPropertyOptionParam)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_XmlPropertyOptionParam_type") :
			getString("_UI_XmlPropertyOptionParam_type") + " " + label;
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

		switch (notification.getFeatureID(XmlPropertyOptionParam.class)) {
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__OPTIONS:
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__VALUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM__ATTRIBUTE_NAME:
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
				(AdaptionxmlPackage.Literals.XML_PROPERTY_OPTION_PARAM__ATTRIBUTE_NAME,
				 ParametersFactory.eINSTANCE.createTextLiteralParam()));

		newChildDescriptors.add
			(createChildParameter
				(AdaptionxmlPackage.Literals.XML_PROPERTY_OPTION_PARAM__ATTRIBUTE_NAME,
				 Adaptionneo4jFactory.eINSTANCE.createNeoEdgeLabelParam()));

		newChildDescriptors.add
			(createChildParameter
				(AdaptionxmlPackage.Literals.XML_PROPERTY_OPTION_PARAM__ATTRIBUTE_NAME,
				 Adaptionneo4jFactory.eINSTANCE.createNeoPropertyNameParam()));
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
