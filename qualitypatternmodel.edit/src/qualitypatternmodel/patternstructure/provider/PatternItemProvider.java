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

import qualitypatternmodel.inputfields.InputfieldsFactory;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

/**
 * This is the item provider adapter for a {@link qualitypatternmodel.patternstructure.Pattern} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternItemProvider extends PatternElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternItemProvider(AdapterFactory adapterFactory) {
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

//			addCheckMorphismOfNextGraphPropertyDescriptor(object);
			addElementCounterPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_Pattern_checkMorphismOfNextGraph_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pattern_checkMorphismOfNextGraph_feature", "_UI_Pattern_type"),
				 PatternstructurePackage.Literals.PATTERN__CHECK_MORPHISM_OF_NEXT_GRAPH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Element Counter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElementCounterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pattern_elementCounter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pattern_elementCounter_feature", "_UI_Pattern_type"),
				 PatternstructurePackage.Literals.PATTERN__ELEMENT_COUNTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pattern_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pattern_name_feature", "_UI_Pattern_type"),
				 PatternstructurePackage.Literals.PATTERN__NAME,
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
			childrenFeatures.add(PatternstructurePackage.Literals.PATTERN__VARIABLE_LIST);
			childrenFeatures.add(PatternstructurePackage.Literals.PATTERN__RETURN_GRAPH);
			childrenFeatures.add(PatternstructurePackage.Literals.PATTERN__CONDITION);
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
	 * This returns Pattern.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Pattern"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		Pattern pattern = (Pattern) object;
		String text = getString("_UI_Pattern_type") + " " + pattern.getShortPatternInternalId();
		if(pattern.getName() != null) {
			text += " " + pattern.getName();
		}
		return text;
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

		switch (notification.getFeatureID(Pattern.class)) {
			case PatternstructurePackage.PATTERN__CHECK_MORPHISM_OF_NEXT_GRAPH:
			case PatternstructurePackage.PATTERN__ELEMENT_COUNTER:
			case PatternstructurePackage.PATTERN__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PatternstructurePackage.PATTERN__VARIABLE_LIST:
			case PatternstructurePackage.PATTERN__RETURN_GRAPH:
			case PatternstructurePackage.PATTERN__CONDITION:
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
				(PatternstructurePackage.Literals.PATTERN__VARIABLE_LIST,
				 InputfieldsFactory.eINSTANCE.createVariableList()));

		newChildDescriptors.add
			(createChildParameter
				(PatternstructurePackage.Literals.PATTERN__RETURN_GRAPH,
				 GraphstructureFactory.eINSTANCE.createGraph()));

		newChildDescriptors.add
			(createChildParameter
				(PatternstructurePackage.Literals.PATTERN__CONDITION,
				 PatternstructureFactory.eINSTANCE.createQuantifiedCondition()));

		newChildDescriptors.add
			(createChildParameter
				(PatternstructurePackage.Literals.PATTERN__CONDITION,
				 PatternstructureFactory.eINSTANCE.createFormula()));

		newChildDescriptors.add
			(createChildParameter
				(PatternstructurePackage.Literals.PATTERN__CONDITION,
				 PatternstructureFactory.eINSTANCE.createTrue()));
	}

}
