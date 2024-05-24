/**
 */
package qualitypatternmodel.adaptionxml.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;

import qualitypatternmodel.adaptionxml.XmlAxisPartCondition;
import qualitypatternmodel.parameters.provider.ParameterItemProvider;
import qualitypatternmodel.parameters.provider.QualitypatternmodelEditPlugin;

/**
 * This is the item provider adapter for a {@link qualitypatternmodel.adaptionxml.XmlAxisPartCondition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XmlAxisPartConditionItemProvider 
	extends ParameterItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlAxisPartConditionItemProvider(AdapterFactory adapterFactory) {
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

			addXmlPropertyOptionPropertyDescriptor(object);
			addTextLiteralParamPropertyDescriptor(object);
			addXmlAxisPartPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Xml Property Option feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXmlPropertyOptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XmlAxisPartCondition_xmlPropertyOption_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XmlAxisPartCondition_xmlPropertyOption_feature", "_UI_XmlAxisPartCondition_type"),
				 AdaptionxmlPackage.Literals.XML_AXIS_PART_CONDITION__XML_PROPERTY_OPTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text Literal Param feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextLiteralParamPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XmlAxisPartCondition_textLiteralParam_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XmlAxisPartCondition_textLiteralParam_feature", "_UI_XmlAxisPartCondition_type"),
				 AdaptionxmlPackage.Literals.XML_AXIS_PART_CONDITION__TEXT_LITERAL_PARAM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Xml Axis Part feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXmlAxisPartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XmlAxisPartCondition_xmlAxisPart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XmlAxisPartCondition_xmlAxisPart_feature", "_UI_XmlAxisPartCondition_type"),
				 AdaptionxmlPackage.Literals.XML_AXIS_PART_CONDITION__XML_AXIS_PART,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns XmlAxisPartCondition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/XmlAxisPartCondition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((XmlAxisPartCondition)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_XmlAxisPartCondition_type") :
			getString("_UI_XmlAxisPartCondition_type") + " " + label;
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
