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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.XmlNavigation;

import qualitypatternmodel.graphstructure.provider.RelationItemProvider;

import qualitypatternmodel.parameters.provider.QualitypatternmodelEditPlugin;

/**
 * This is the item provider adapter for a {@link qualitypatternmodel.adaptionxml.XmlNavigation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XmlNavigationItemProvider extends RelationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlNavigationItemProvider(AdapterFactory adapterFactory) {
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

			addXmlPathParamPropertyDescriptor(object);
			addSourceVariablePropertyDescriptor(object);
			addVariableCounterPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Xml Path Param feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXmlPathParamPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XmlNavigation_xmlPathParam_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XmlNavigation_xmlPathParam_feature", "_UI_XmlNavigation_type"),
				 AdaptionxmlPackage.Literals.XML_NAVIGATION__XML_PATH_PARAM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Variable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceVariablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XmlNavigation_sourceVariable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XmlNavigation_sourceVariable_feature", "_UI_XmlNavigation_type"),
				 AdaptionxmlPackage.Literals.XML_NAVIGATION__SOURCE_VARIABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Variable Counter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariableCounterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XmlNavigation_variableCounter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XmlNavigation_variableCounter_feature", "_UI_XmlNavigation_type"),
				 AdaptionxmlPackage.Literals.XML_NAVIGATION__VARIABLE_COUNTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns XmlNavigation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/XmlNavigation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((XmlNavigation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_XmlNavigation_type") :
			getString("_UI_XmlNavigation_type") + " " + label;
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

		switch (notification.getFeatureID(XmlNavigation.class)) {
			case AdaptionxmlPackage.XML_NAVIGATION__SOURCE_VARIABLE:
			case AdaptionxmlPackage.XML_NAVIGATION__VARIABLE_COUNTER:
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
