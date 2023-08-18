/**
 */
package qualitypatternmodel.adaptionxml.impl;

import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.adaptionxml.XmlRoot;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.impl.ComplexNodeImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XmlRootImpl extends ComplexNodeImpl implements XmlRoot {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public XmlRootImpl() {
		super();
		setName("Root");
	}
	
	@Override
	public String generateXQuery() throws InvalidityException {
		String result = "";
		for(Relation relation : getOutgoing()) {
			if(relation instanceof XmlNavigation) {
				result += relation.generateXQuery();
			} else {
				throw new InvalidityException("XMLRoot has XMLReference");
			}
		}
		return result;		
	}
	
	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (abstractionLevel.getValue() < AbstractionLevel.SEMI_ABSTRACT_VALUE)
			throw new InvalidityException("non-generic class in generic pattern");
		super.isValid(abstractionLevel);
	}

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {	
		super.isValidLocal(abstractionLevel);
		
		if(!getIncoming().isEmpty()) {
			throw new InvalidityException("incoming relation at XMLRoot " + getId());
		}
		
		if(!getPredicates().isEmpty()) {
			throw new InvalidityException("XMLRoot has predicate");
		}
		
		for(Relation relation : getOutgoing()) {
			if(relation instanceof XmlReference) {
				throw new InvalidityException("XMLRoot has XMLReference");
			}
		}
	}
	
	@Override
	public String getName() {
		if(name == null || name.equals("")) {
			if(getInternalId() > -1) {
				name = "XmlRoot " + getInternalId();
				return name;
			}
		}
		return name;
	}
	
	@Override
	public PatternElement createXmlAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return this;
	}
	
	@Override
	public XmlElement adaptAsXmlElement() throws InvalidityException {
		throw new InvalidityException("XmlRoot cannot be adapted as XmlElement");
	}
	
	@Override
	public XmlProperty adaptAsXmlProperty() throws InvalidityException {
		throw new InvalidityException("XmlRoot cannot be adapted as XmlProperty");
	}
	
	@Override
	public Node makeGeneric() throws InvalidityException{
		throw new InvalidityException("This node can not become generic!");
	}
	
	@Override
	public void checkGeneric() throws InvalidityException{
		throw new InvalidityException("This node can not become generic!");
	}
	
	@Override
	
	public ComplexNode makeComplex() throws InvalidityException{
		throw new InvalidityException("This node can not become generic!");
	}
		
	@Override
	public void checkComplex() throws InvalidityException{
		throw new InvalidityException("This node can not become generic!");
	}
	
	@Override
	public PrimitiveNode makePrimitive() throws InvalidityException{
		throw new InvalidityException("This node can not become generic!");
	}
		
	@Override
	public void checkPrimitive() throws InvalidityException{
		throw new InvalidityException("This node can not become generic!");
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionxmlPackage.Literals.XML_ROOT;
	}

} //XMLRootImpl
