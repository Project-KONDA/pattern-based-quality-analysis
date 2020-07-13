/**
 */
package qualitypatternmodel.execution.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import qualitypatternmodel.execution.ExecutionFactory;
import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.XmlDatabase;

/**
 * This is the item provider adapter for a {@link qualitypatternmodel.execution.XmlDatabase} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XmlDatabaseItemProvider extends DatabaseItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlDatabaseItemProvider(AdapterFactory adapterFactory) {
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

			addContextPropertyDescriptor(object);
			addSchemaContextPropertyDescriptor(object);
			addNamespacePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XmlDatabase_context_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XmlDatabase_context_feature", "_UI_XmlDatabase_type"),
				 ExecutionPackage.Literals.XML_DATABASE__CONTEXT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schema Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchemaContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XmlDatabase_schemaContext_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XmlDatabase_schemaContext_feature", "_UI_XmlDatabase_type"),
				 ExecutionPackage.Literals.XML_DATABASE__SCHEMA_CONTEXT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Namespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamespacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XmlDatabase_namespace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XmlDatabase_namespace_feature", "_UI_XmlDatabase_type"),
				 ExecutionPackage.Literals.XML_DATABASE__NAMESPACE,
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
			childrenFeatures.add(ExecutionPackage.Literals.XML_DATABASE__ELEMENT_NAMES);
			childrenFeatures.add(ExecutionPackage.Literals.XML_DATABASE__ATTRIBUTE_NAMES);
			childrenFeatures.add(ExecutionPackage.Literals.XML_DATABASE__RECORDED_ATTRIBUTE_VALUES);
			childrenFeatures.add(ExecutionPackage.Literals.XML_DATABASE__RECORDED_DATA_VALUES);
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
	 * This returns XmlDatabase.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/XmlDatabase"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((XmlDatabase)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_XmlDatabase_type") :
			getString("_UI_XmlDatabase_type") + " " + label;
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

		switch (notification.getFeatureID(XmlDatabase.class)) {
			case ExecutionPackage.XML_DATABASE__CONTEXT:
			case ExecutionPackage.XML_DATABASE__SCHEMA_CONTEXT:
			case ExecutionPackage.XML_DATABASE__NAMESPACE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ExecutionPackage.XML_DATABASE__ELEMENT_NAMES:
			case ExecutionPackage.XML_DATABASE__ATTRIBUTE_NAMES:
			case ExecutionPackage.XML_DATABASE__RECORDED_ATTRIBUTE_VALUES:
			case ExecutionPackage.XML_DATABASE__RECORDED_DATA_VALUES:
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
				(ExecutionPackage.Literals.XML_DATABASE__ELEMENT_NAMES,
				 ExecutionFactory.eINSTANCE.create(ExecutionPackage.Literals.STRING_TO_INT_MAP)));

		newChildDescriptors.add
			(createChildParameter
				(ExecutionPackage.Literals.XML_DATABASE__ATTRIBUTE_NAMES,
				 ExecutionFactory.eINSTANCE.create(ExecutionPackage.Literals.STRING_TO_INT_MAP)));

		newChildDescriptors.add
			(createChildParameter
				(ExecutionPackage.Literals.XML_DATABASE__RECORDED_ATTRIBUTE_VALUES,
				 ExecutionFactory.eINSTANCE.create(ExecutionPackage.Literals.STRING_TO_INT_MAP)));

		newChildDescriptors.add
			(createChildParameter
				(ExecutionPackage.Literals.XML_DATABASE__RECORDED_DATA_VALUES,
				 ExecutionFactory.eINSTANCE.create(ExecutionPackage.Literals.STRING_TO_INT_MAP)));
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
			childFeature == ExecutionPackage.Literals.XML_DATABASE__ELEMENT_NAMES ||
			childFeature == ExecutionPackage.Literals.XML_DATABASE__ATTRIBUTE_NAMES ||
			childFeature == ExecutionPackage.Literals.XML_DATABASE__RECORDED_ATTRIBUTE_VALUES ||
			childFeature == ExecutionPackage.Literals.XML_DATABASE__RECORDED_DATA_VALUES;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
