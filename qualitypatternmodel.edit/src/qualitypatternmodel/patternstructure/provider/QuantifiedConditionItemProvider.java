/**
 */
package qualitypatternmodel.patternstructure.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import qualitypatternmodel.graphstructure.GraphstructureFactory;

import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

/**
 * This is the item provider adapter for a {@link qualitypatternmodel.patternstructure.QuantifiedCondition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QuantifiedConditionItemProvider extends ConditionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantifiedConditionItemProvider(AdapterFactory adapterFactory) {
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

			addQuantifierPropertyDescriptor(object);
			addCheckMorphismOfNextGraphPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Quantifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQuantifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QuantifiedCondition_quantifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QuantifiedCondition_quantifier_feature", "_UI_QuantifiedCondition_type"),
				 PatternstructurePackage.Literals.QUANTIFIED_CONDITION__QUANTIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Check Morphism Of Next Graph feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCheckMorphismOfNextGraphPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QuantifiedCondition_checkMorphismOfNextGraph_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QuantifiedCondition_checkMorphismOfNextGraph_feature", "_UI_QuantifiedCondition_type"),
				 PatternstructurePackage.Literals.QUANTIFIED_CONDITION__CHECK_MORPHISM_OF_NEXT_GRAPH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(PatternstructurePackage.Literals.QUANTIFIED_CONDITION__GRAPH);
			childrenFeatures.add(PatternstructurePackage.Literals.QUANTIFIED_CONDITION__CONDITION);
			childrenFeatures.add(PatternstructurePackage.Literals.QUANTIFIED_CONDITION__MORPHISM);
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
	 * This returns QuantifiedCondition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/QuantifiedCondition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition)object;
		return getString("_UI_QuantifiedCondition_type") + " " + quantifiedCondition.getId();
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

		switch (notification.getFeatureID(QuantifiedCondition.class)) {
			case PatternstructurePackage.QUANTIFIED_CONDITION__QUANTIFIER:
			case PatternstructurePackage.QUANTIFIED_CONDITION__CHECK_MORPHISM_OF_NEXT_GRAPH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PatternstructurePackage.QUANTIFIED_CONDITION__GRAPH:
			case PatternstructurePackage.QUANTIFIED_CONDITION__CONDITION:
			case PatternstructurePackage.QUANTIFIED_CONDITION__MORPHISM:
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
				(PatternstructurePackage.Literals.QUANTIFIED_CONDITION__GRAPH,
				 GraphstructureFactory.eINSTANCE.createGraph()));

		newChildDescriptors.add
			(createChildParameter
				(PatternstructurePackage.Literals.QUANTIFIED_CONDITION__CONDITION,
				 PatternstructureFactory.eINSTANCE.createQuantifiedCondition()));

		newChildDescriptors.add
			(createChildParameter
				(PatternstructurePackage.Literals.QUANTIFIED_CONDITION__CONDITION,
				 PatternstructureFactory.eINSTANCE.createFormula()));

		newChildDescriptors.add
			(createChildParameter
				(PatternstructurePackage.Literals.QUANTIFIED_CONDITION__CONDITION,
				 PatternstructureFactory.eINSTANCE.createTrue()));

		newChildDescriptors.add
			(createChildParameter
				(PatternstructurePackage.Literals.QUANTIFIED_CONDITION__MORPHISM,
				 PatternstructureFactory.eINSTANCE.createMorphism()));
	}

}
