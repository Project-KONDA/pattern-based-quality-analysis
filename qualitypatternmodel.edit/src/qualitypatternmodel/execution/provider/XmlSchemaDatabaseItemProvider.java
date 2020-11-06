/**
 */
package qualitypatternmodel.execution.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import qualitypatternmodel.execution.ExecutionPackage;

import qualitypatternmodel.execution.XmlSchemaDatabase;

/**
 * This is the item provider adapter for a {@link qualitypatternmodel.execution.XmlSchemaDatabase} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XmlSchemaDatabaseItemProvider 
	extends XmlDatabaseItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlSchemaDatabaseItemProvider(AdapterFactory adapterFactory) {
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

			addXmlDatabasesPropertyDescriptor(object);
			addElementNamesPropertyDescriptor(object);
			addAttributeNamesPropertyDescriptor(object);
			addRootElementNamesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Xml Databases feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXmlDatabasesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XmlSchemaDatabase_xmlDatabases_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XmlSchemaDatabase_xmlDatabases_feature", "_UI_XmlSchemaDatabase_type"),
				 ExecutionPackage.Literals.XML_SCHEMA_DATABASE__XML_DATABASES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Element Names feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElementNamesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XmlSchemaDatabase_elementNames_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XmlSchemaDatabase_elementNames_feature", "_UI_XmlSchemaDatabase_type"),
				 ExecutionPackage.Literals.XML_SCHEMA_DATABASE__ELEMENT_NAMES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attribute Names feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttributeNamesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XmlSchemaDatabase_attributeNames_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XmlSchemaDatabase_attributeNames_feature", "_UI_XmlSchemaDatabase_type"),
				 ExecutionPackage.Literals.XML_SCHEMA_DATABASE__ATTRIBUTE_NAMES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Root Element Names feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRootElementNamesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XmlSchemaDatabase_rootElementNames_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XmlSchemaDatabase_rootElementNames_feature", "_UI_XmlSchemaDatabase_type"),
				 ExecutionPackage.Literals.XML_SCHEMA_DATABASE__ROOT_ELEMENT_NAMES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns XmlSchemaDatabase.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/XmlSchemaDatabase"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((XmlSchemaDatabase)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_XmlSchemaDatabase_type") :
			getString("_UI_XmlSchemaDatabase_type") + " " + label;
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

		switch (notification.getFeatureID(XmlSchemaDatabase.class)) {
			case ExecutionPackage.XML_SCHEMA_DATABASE__ELEMENT_NAMES:
			case ExecutionPackage.XML_SCHEMA_DATABASE__ATTRIBUTE_NAMES:
			case ExecutionPackage.XML_SCHEMA_DATABASE__ROOT_ELEMENT_NAMES:
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
