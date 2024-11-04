/**
 */
package qualitypatternmodel.adaptionneo4j.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage;
import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;

/**
 * This is the item provider adapter for a {@link qualitypatternmodel.adaptionneo4j.NeoSimpleEdge} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NeoSimpleEdgeItemProvider extends NeoPathPartItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoSimpleEdgeItemProvider(AdapterFactory adapterFactory) {
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

			addNeoDirectionPropertyDescriptor(object);
			addNeoTargetNodeLabelsPropertyDescriptor(object);
			addNeoEdgeLabelPropertyDescriptor(object);
			addEdgeNumberPropertyDescriptor(object);
			addKeyValueParamPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Neo Direction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNeoDirectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NeoSimpleEdge_neoDirection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NeoSimpleEdge_neoDirection_feature", "_UI_NeoSimpleEdge_type"),
				 Adaptionneo4jPackage.Literals.NEO_SIMPLE_EDGE__NEO_DIRECTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Neo Target Node Labels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNeoTargetNodeLabelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NeoSimpleEdge_neoTargetNodeLabels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NeoSimpleEdge_neoTargetNodeLabels_feature", "_UI_NeoSimpleEdge_type"),
				 Adaptionneo4jPackage.Literals.NEO_SIMPLE_EDGE__NEO_TARGET_NODE_LABELS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Neo Edge Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNeoEdgeLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NeoSimpleEdge_neoEdgeLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NeoSimpleEdge_neoEdgeLabel_feature", "_UI_NeoSimpleEdge_type"),
				 Adaptionneo4jPackage.Literals.NEO_SIMPLE_EDGE__NEO_EDGE_LABEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Edge Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEdgeNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NeoSimpleEdge_edgeNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NeoSimpleEdge_edgeNumber_feature", "_UI_NeoSimpleEdge_type"),
				 Adaptionneo4jPackage.Literals.NEO_SIMPLE_EDGE__EDGE_NUMBER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Key Value Param feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeyValueParamPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NeoSimpleEdge_keyValueParam_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NeoSimpleEdge_keyValueParam_feature", "_UI_NeoSimpleEdge_type"),
				 Adaptionneo4jPackage.Literals.NEO_SIMPLE_EDGE__KEY_VALUE_PARAM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns NeoSimpleEdge.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NeoSimpleEdge"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((NeoSimpleEdge)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_NeoSimpleEdge_type") :
			getString("_UI_NeoSimpleEdge_type") + " " + label;
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

		switch (notification.getFeatureID(NeoSimpleEdge.class)) {
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_DIRECTION:
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__EDGE_NUMBER:
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
