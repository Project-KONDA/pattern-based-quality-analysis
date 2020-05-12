/**
 */
package qualitypatternmodel.graphstructure.provider;


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

import qualitypatternmodel.adaptionxml.AdaptionxmlFactory;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.operators.OperatorsFactory;
import qualitypatternmodel.parameters.provider.QualitypatternmodelEditPlugin;
import qualitypatternmodel.patternstructure.provider.PatternElementItemProvider;

/**
 * This is the item provider adapter for a {@link qualitypatternmodel.graphstructure.Graph} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphItemProvider extends PatternElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addReturnElementsPropertyDescriptor(object);
			addGraphDepthPropertyDescriptor(object);
//			addReturnGraphPropertyDescriptor(object);
//			addGetAllElementsPropertyDescriptor(object);
//			addGetAllRelationsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Graph Depth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGraphDepthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Graph_graphDepth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Graph_graphDepth_feature", "_UI_Graph_type"),
				 GraphstructurePackage.Literals.GRAPH__GRAPH_DEPTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Return Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReturnElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Graph_returnElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Graph_returnElements_feature", "_UI_Graph_type"),
				 GraphstructurePackage.Literals.GRAPH__RETURN_ELEMENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Outgoing Morphisms feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutgoingMorphismsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Graph_outgoingMorphisms_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Graph_outgoingMorphisms_feature", "_UI_Graph_type"),
				 GraphstructurePackage.Literals.GRAPH__OUTGOING_MORPHISMS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incoming Morphism feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncomingMorphismPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Graph_incomingMorphism_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Graph_incomingMorphism_feature", "_UI_Graph_type"),
				 GraphstructurePackage.Literals.GRAPH__INCOMING_MORPHISM,
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
			childrenFeatures.add(GraphstructurePackage.Literals.GRAPH__ELEMENTS);
			childrenFeatures.add(GraphstructurePackage.Literals.GRAPH__OPERATOR_LIST);
			childrenFeatures.add(GraphstructurePackage.Literals.GRAPH__RELATIONS);
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
	 * This returns Graph.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Graph"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		Graph graph = (Graph) object;
		if (graph.isReturnGraph()) 
			return "Return" + getString("_UI_Graph_type") + " " + graph.getInternalId();	
		return getString("_UI_Graph_type") + " " + graph.getInternalId();			
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

		switch (notification.getFeatureID(Graph.class)) {
			case GraphstructurePackage.GRAPH__GRAPH_DEPTH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GraphstructurePackage.GRAPH__ELEMENTS:
			case GraphstructurePackage.GRAPH__OPERATOR_LIST:
			case GraphstructurePackage.GRAPH__RELATIONS:
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
				(GraphstructurePackage.Literals.GRAPH__ELEMENTS,
				 GraphstructureFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(GraphstructurePackage.Literals.GRAPH__ELEMENTS,
				 AdaptionxmlFactory.eINSTANCE.createXmlElement()));

		newChildDescriptors.add
			(createChildParameter
				(GraphstructurePackage.Literals.GRAPH__ELEMENTS,
				 AdaptionxmlFactory.eINSTANCE.createXmlRoot()));

		newChildDescriptors.add
			(createChildParameter
				(GraphstructurePackage.Literals.GRAPH__OPERATOR_LIST,
				 OperatorsFactory.eINSTANCE.createOperatorList()));

		newChildDescriptors.add
			(createChildParameter
				(GraphstructurePackage.Literals.GRAPH__RELATIONS,
				 GraphstructureFactory.eINSTANCE.createRelation()));

		newChildDescriptors.add
			(createChildParameter
				(GraphstructurePackage.Literals.GRAPH__RELATIONS,
				 AdaptionxmlFactory.eINSTANCE.createXmlNavigation()));

		newChildDescriptors.add
			(createChildParameter
				(GraphstructurePackage.Literals.GRAPH__RELATIONS,
				 AdaptionxmlFactory.eINSTANCE.createXmlReference()));
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
