/**
 */
package qualitypatternmodel.adaptionNeo4J.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.PatternParams;
import qualitypatternmodel.adaptionNeo4J.SimpleEdge;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.AbstractionLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.SimpleEdgeImpl#getPatternParams <em>Pattern Params</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleEdgeImpl extends NeoPathImpl implements SimpleEdge {
	/**
	 * The cached value of the '{@link #getPatternParams() <em>Pattern Params</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternParams()
	 * @generated
	 * @ordered
	 */
	protected PatternParams patternParams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleEdgeImpl() {
		super();
	} 
	
	@Override
	public String generateCypher() throws InvalidityException {
		String cypher = "";
		
		return cypher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionNeo4JPackage.Literals.SIMPLE_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override //Equalvalant to getIriParam() --> Look why it is diffrent
	public PatternParams getPatternParams() {
		if (patternParams != null && patternParams.eIsProxy()) {
			InternalEObject oldPatternParams = (InternalEObject)patternParams;
			patternParams = (PatternParams)eResolveProxy(oldPatternParams);
			if (patternParams != oldPatternParams) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionNeo4JPackage.SIMPLE_EDGE__PATTERN_PARAMS, oldPatternParams, patternParams));
			}
		}
		return patternParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternParams basicGetPatternParams() {
		return patternParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatternParams(PatternParams newPatternParams) {
		PatternParams oldPatternParams = patternParams;
		patternParams = newPatternParams;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.SIMPLE_EDGE__PATTERN_PARAMS, oldPatternParams, patternParams));
	}
	
	//Inserted Method
	@Override 
	public EList<SimpleEdge> getSimpleEdges() {
		EList<SimpleEdge> l = new BasicEList<SimpleEdge>();
		//TODO
		return  l;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptionNeo4JPackage.SIMPLE_EDGE__PATTERN_PARAMS:
				if (resolve) return getPatternParams();
				return basicGetPatternParams();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdaptionNeo4JPackage.SIMPLE_EDGE__PATTERN_PARAMS:
				setPatternParams((PatternParams)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AdaptionNeo4JPackage.SIMPLE_EDGE__PATTERN_PARAMS:
				setPatternParams((PatternParams)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AdaptionNeo4JPackage.SIMPLE_EDGE__PATTERN_PARAMS:
				return patternParams != null;
		}
		return super.eIsSet(featureID);
	}

//	Also not done in RdfSinglePredicateImpl.class
//	@Override
//	public String generateDescription() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public String myToString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override 
	public void isValidLocal(AbstractionLevel abstractionLevel) 
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		//TODO
	}
} //SimpleEdgeImpl
