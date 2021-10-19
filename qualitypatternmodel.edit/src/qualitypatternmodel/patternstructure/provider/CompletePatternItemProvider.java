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
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.textrepresentation.TextrepresentationFactory;

/**
 * This is the item provider adapter for a {@link qualitypatternmodel.patternstructure.CompletePattern} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CompletePatternItemProvider extends PatternItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompletePatternItemProvider(AdapterFactory adapterFactory) {
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
//			addElementCounterPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_CompletePattern_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompletePattern_name_feature", "_UI_CompletePattern_type"),
				 PatternstructurePackage.Literals.COMPLETE_PATTERN__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Database feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatabasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompletePattern_database_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompletePattern_database_feature", "_UI_CompletePattern_type"),
				 PatternstructurePackage.Literals.COMPLETE_PATTERN__DATABASE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Adaption Started feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdaptionStartedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompletePattern_adaptionStarted_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompletePattern_adaptionStarted_feature", "_UI_CompletePattern_type"),
				 PatternstructurePackage.Literals.COMPLETE_PATTERN__ADAPTION_STARTED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Adaption Finalized feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdaptionFinalizedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompletePattern_adaptionFinalized_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompletePattern_adaptionFinalized_feature", "_UI_CompletePattern_type"),
				 PatternstructurePackage.Literals.COMPLETE_PATTERN__ADAPTION_FINALIZED,
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
				 getString("_UI_CompletePattern_elementCounter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompletePattern_elementCounter_feature", "_UI_CompletePattern_type"),
				 PatternstructurePackage.Literals.COMPLETE_PATTERN__ELEMENT_COUNTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Property Counter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyCounterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompletePattern_propertyCounter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompletePattern_propertyCounter_feature", "_UI_CompletePattern_type"),
				 PatternstructurePackage.Literals.COMPLETE_PATTERN__PROPERTY_COUNTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Relation Counter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelationCounterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompletePattern_relationCounter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompletePattern_relationCounter_feature", "_UI_CompletePattern_type"),
				 PatternstructurePackage.Literals.COMPLETE_PATTERN__RELATION_COUNTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter Counter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameterCounterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompletePattern_parameterCounter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompletePattern_parameterCounter_feature", "_UI_CompletePattern_type"),
				 PatternstructurePackage.Literals.COMPLETE_PATTERN__PARAMETER_COUNTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Operator Counter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperatorCounterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompletePattern_operatorCounter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompletePattern_operatorCounter_feature", "_UI_CompletePattern_type"),
				 PatternstructurePackage.Literals.COMPLETE_PATTERN__OPERATOR_COUNTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Counter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCounterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompletePattern_counter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompletePattern_counter_feature", "_UI_CompletePattern_type"),
				 PatternstructurePackage.Literals.COMPLETE_PATTERN__COUNTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompletePattern_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompletePattern_description_feature", "_UI_CompletePattern_type"),
				 PatternstructurePackage.Literals.COMPLETE_PATTERN__DESCRIPTION,
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
			childrenFeatures.add(PatternstructurePackage.Literals.COMPLETE_PATTERN__PARAMETER_LIST);
			childrenFeatures.add(PatternstructurePackage.Literals.COMPLETE_PATTERN__TEXT);
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
	 * This returns CompletePattern.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CompletePattern"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		CompletePattern completePattern = (CompletePattern) object;
		String text = getString("_UI_CompletePattern_type") + " " + completePattern.getInternalId();
		if(completePattern.getName() != null) {
			text += " " + completePattern.getName();
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

		switch (notification.getFeatureID(CompletePattern.class)) {
			case PatternstructurePackage.COMPLETE_PATTERN__NAME:
			case PatternstructurePackage.COMPLETE_PATTERN__ADAPTION_STARTED:
			case PatternstructurePackage.COMPLETE_PATTERN__ADAPTION_FINALIZED:
			case PatternstructurePackage.COMPLETE_PATTERN__ELEMENT_COUNTER:
			case PatternstructurePackage.COMPLETE_PATTERN__PROPERTY_COUNTER:
			case PatternstructurePackage.COMPLETE_PATTERN__RELATION_COUNTER:
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_COUNTER:
			case PatternstructurePackage.COMPLETE_PATTERN__OPERATOR_COUNTER:
			case PatternstructurePackage.COMPLETE_PATTERN__COUNTER:
			case PatternstructurePackage.COMPLETE_PATTERN__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST:
			case PatternstructurePackage.COMPLETE_PATTERN__TEXT:
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
				(PatternstructurePackage.Literals.COMPLETE_PATTERN__PARAMETER_LIST,
				 ParametersFactory.eINSTANCE.createParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(PatternstructurePackage.Literals.COMPLETE_PATTERN__TEXT,
				 TextrepresentationFactory.eINSTANCE.createPatternText()));
	}

}
