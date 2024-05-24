/**
 */
package qualitypatternmodel.operators.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.adaptionneo4j.NeoElementNode;
import qualitypatternmodel.adaptionneo4j.NeoPropertyNode;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlNode;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Comparable;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.graphstructure.impl.ComplexNodeImpl;
import qualitypatternmodel.graphstructure.impl.NodeImpl;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.NumberOperator;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.parameters.ListParam;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl;
import qualitypatternmodel.parameters.impl.ParameterValueImpl;
import qualitypatternmodel.parameters.impl.TypeOptionParamImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.CypherSpecificConstants;

/**
 * <!-- begin-user-doc --> 
 * An implementation of the model object '<em><b>Comparison</b></em>'. 
 * Comparison between two <code>PatternElement</code>s.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.operators.impl.ComparisonImpl#getArgument1 <em>Argument1</em>}</li>
 *   <li>{@link qualitypatternmodel.operators.impl.ComparisonImpl#getArgument2 <em>Argument2</em>}</li>
 *   <li>{@link qualitypatternmodel.operators.impl.ComparisonImpl#getOption <em>Option</em>}</li>
 *   <li>{@link qualitypatternmodel.operators.impl.ComparisonImpl#getTypeOption <em>Type Option</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComparisonImpl extends BooleanOperatorImpl implements Comparison {
//	private static final String THE_GIVEN_ARGUMENTS_ARE_NOT_VALID_FOR_NEO4J_POSSIBLIE_ARE_2X_PROPERTIES_2X_NODES_1X_PROPERTY_1X_PARAM = "The given Arguments are not valid for Neo4J \n Possiblie are: \n\t 2xProperties \n\t 2xNodes \n\t 1xProperty+1xParam \n\t 1xNeoElementNode+NumberParam";
	private static final String NOT_ALLOWED_OPERATOR_FOR_LIST_COMPARISON = "Not allowed operator for List comparison";
	private static final String THE_SECOND_ARGUMENT_HAS_TO_BE_A_LIST = "The second Argument has to be a List";

	/**
	 * The cached value of the '{@link #getArgument1() <em>Argument1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * The first argument of the comparison.
	 * <!-- end-user-doc -->
	 * @see #getArgument1()
	 * @generated
	 * @ordered
	 */
	protected qualitypatternmodel.graphstructure.Comparable argument1;

	/**
	 * The cached value of the '{@link #getArgument2() <em>Argument2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * The second argument of the comparison.
	 * <!-- end-user-doc -->
	 * @see #getArgument2()
	 * @generated
	 * @ordered
	 */
	protected qualitypatternmodel.graphstructure.Comparable argument2;

	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * The concrete comparison operator of <code>this</code> in form of a parameter.
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected ComparisonOptionParam option;

	/**
	 * The cached value of the '{@link #getTypeOption() <em>Type Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * The type of the arguments of <code>this</code> <code>Comparison</code> in form of a parameter.
	 * <!-- end-user-doc -->
	 * @see #getTypeOption()
	 * @generated
	 * @ordered
	 */
	protected TypeOptionParam typeOption;

	/**
	 * <!-- begin-user-doc --> 
	 * Constructor. 
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public ComparisonImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc --> 
	 * Translation into XQuery. 
	 * <!-- end-user-doc -->
	 */

	@Override
	public String generateXQuery() throws InvalidityException {
		if (option != null && option.getValue() != null && argument1 != null && argument2 != null) {
			ComparisonOperator operator = option.getValue();
			
			ReturnType type = getTypeOption().getValue();
			
			String tryStatement = type.getTryStatement();
			String catchTypeCastingError = type.getCatchCastingError();
			
			String conversionStartArgument1 = type.getConversion();
			String conversionEndArgument1 = type.getConversionEnd();
			EList<String> argument1Translated = new BasicEList<String>();
			if (argument1 instanceof XmlNode) {
				argument1Translated.addAll(((XmlNode) argument1).getXQueryRepresentation());
			} else {
				argument1Translated.add(argument1.generateXQuery());
			}
			
			String conversionStartArgument2 = type.getConversion();
			String conversionEndArgument2 = type.getConversionEnd();
			EList<String> argument2Translated = new BasicEList<String>();
			if (argument2 instanceof XmlNode) {
				argument2Translated.addAll(((XmlNode) argument2).getXQueryRepresentation());
			} else {
				argument2Translated.add(argument2.generateXQuery());
			}
			
			String predicate = "";
			
			for(String arg1 : argument1Translated) {
				for(String arg2 : argument2Translated) {
										
					// Two Elements
					if( argument1 instanceof XmlElement && argument2 instanceof XmlElement ) {
						String res = "fn:deep-equal ( " + arg1 + ", " + arg2 + " )";
						if (operator == ComparisonOperator.EQUAL) {
							return res;
						} else if (operator == ComparisonOperator.NOTEQUAL) {
							return "not ( " + res + ")";					
						}
					}
					
					// At least one TextListParam
					if ((argument1 instanceof TextListParam || argument2 instanceof TextListParam)
							&& (getOption().getValue() == ComparisonOperator.NOTEQUAL)) {
						return "not ( " + arg1 + " = " + arg2 + " )";
					}
					
					// No Property or string comparison
					if((!(argument1 instanceof XmlProperty) && !(argument2 instanceof XmlProperty)) || type == ReturnType.STRING) {
						return tryStatement + conversionStartArgument1 + arg1 + conversionEndArgument1 + operator.getLiteral()
						+ conversionStartArgument2 + arg2 + conversionEndArgument2 + catchTypeCastingError;	
					}
					
					// At least one casted Property
					// TODO: cast automatically, thus remove typeOption
					String some1 = "";
					String some2 = "";
					String castedArg1 = "";
					String castedArg2 = "";
					
		//			if(argument1 instanceof XmlProperty && ((XmlProperty) argument1).getOption().getValue() == PropertyKind.ATTRIBUTE) {				
		//				some1 = "some $arg1 in " + argument1Translated + " satisfies ";
		//				castedArg1 = conversionStartArgument1 + "$arg1" + conversionEndArgument1;			
		//			} else {
					castedArg1 = conversionStartArgument1 + arg1 + conversionEndArgument1;
		//			}
					
		//			if(argument2 instanceof XmlProperty && ((XmlProperty) argument2).getOption().getValue() == PropertyKind.ATTRIBUTE) {						
		//				some2 = "some $arg2 in " + argument2Translated + " satisfies ";
		//				castedArg2 = conversionStartArgument2 + "$arg2" + conversionEndArgument2;					
		//			} else {
					castedArg2 = conversionStartArgument2 + arg2 + conversionEndArgument2;	
		//			}
					
					if(!predicate.equals("")) {
						predicate += " && ";
					}
					predicate += some1 + some2 + tryStatement + castedArg1 + operator.getLiteral() + castedArg2 + catchTypeCastingError;
				}
			}
			
			return predicate;

			
		} else {
			throw new InvalidityException("invalid option" + " (" + getInternalId() + ")");
		}
	}
	
	@Override
	public String generateSparql() throws InvalidityException {
		String argument1Translation = getArgument1().generateSparql();
		String argument2Translation = getArgument2().generateSparql();
		if (argument1Translation.equals(argument2Translation)) {
			switch (option.getValue()) {
			case EQUAL:
			case GREATEROREQUAL:
			case LESSOREQUAL:
				return "";
			default:
				throw new InvalidityException("invalid options: arguments are equal but asserted to be different (" + getInternalId() + ")");			
			}
		}
		
		switch (option.getValue()) {
		case EQUAL:
//			if(getArgument1() instanceof TextLiteralParam || getArgument1() instanceof TextListParam) {
//				if(getArgument1() instanceof TextLiteralParam) {
//					argument1Translation = argument1Translation.substring(1,argument1Translation.length()-1);
//				}
//				return "\nFILTER (regex(" + argument2Translation + ", \"^" + argument1Translation + "$\")).";
//			} else if(getArgument2() instanceof TextLiteralParam || getArgument2() instanceof TextListParam) {
//				if(getArgument2() instanceof TextLiteralParam) {
//					argument2Translation = argument2Translation.substring(1,argument2Translation.length()-1);
//				}
//				return "\nFILTER (regex(" + argument1Translation + ", \"^" + argument2Translation + "$\")).";
//			} else if(getArgument1() instanceof RdfNode || getArgument2() instanceof RdfNode) {
//				return "\nFILTER (" + argument1Translation + " = " + argument2Translation + ").";
//			} else {
//				String nodeTranslation = "";
//				String otherTranslation = "";
//				if(getArgument1() instanceof Node) {
//					nodeTranslation = argument1Translation;
//					otherTranslation = argument2Translation;
//				} else if(getArgument2() instanceof Node) {
//					nodeTranslation = argument2Translation;
//					otherTranslation = argument1Translation;
//				}
//				return "\nVALUES " + nodeTranslation + " {" + otherTranslation + "}.";
//			}
			return "\nFILTER (" + argument1Translation + " = " + argument2Translation + ").";
		case NOTEQUAL:
//			if(getArgument1() instanceof TextLiteralParam || getArgument1() instanceof TextListParam) {
//				if(getArgument1() instanceof TextLiteralParam) {
//					argument1Translation = argument1Translation.substring(1,argument1Translation.length()-1);
//				}
//				return "\nFILTER (!regex(" + argument2Translation + ", \"^" + argument1Translation + "$\"))";
//			} else if(getArgument2() instanceof TextLiteralParam || getArgument2() instanceof TextListParam) {
//				if(getArgument2() instanceof TextLiteralParam) {
//					argument2Translation = argument2Translation.substring(1,argument2Translation.length()-1);
//				}
//				return "\nFILTER (!regex(" + argument1Translation + ", \"^" + argument2Translation + "$\"))";
//			} else {
//				return "\nFILTER (" + argument1Translation + " != " + argument2Translation + ")";		
//			}
			return "\nFILTER (" + argument1Translation + " != " + argument2Translation + ")";		
		case GREATER:
			return "\nFILTER (" + argument1Translation + " > " + argument2Translation + ")";			
		case LESS:
			return "\nFILTER (" + argument1Translation + " < " + argument2Translation + ")";			
		case GREATEROREQUAL:
			return "\nFILTER (" + argument1Translation + " >= " + argument2Translation + ")";			
		case LESSOREQUAL:
			return "\nFILTER (" + argument1Translation + " <= " + argument2Translation + ")";			
		default:
			throw new InvalidityException("invalid option");
		}
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @return String
	 * @throws InvalidityException
	 * Generates the sub-query for Comparison.
	 * The various operators are connected with an AND.
	 * If a container for the operators is implemented further logical connections between the operators are possible.
	 */
	@Override 
	public String generateCypher() throws InvalidityException {
		if (option != null && option.getValue() != null && argument1 != null && argument2 != null) {
			final StringBuilder cypher = new StringBuilder();
			final List<String> arguments = cypherArgumentCheckerAndConverter();
			final String argument1Translation = arguments.get(0);
			final String argument2Translation = arguments.get(1); 
					
			matchCypherOperators(cypher, argument1Translation, argument2Translation);
			return cypher.toString();
		} 
		throw new InvalidityException(Constants.INVALID_OPTION);
	}

	//BEGIN - Neo4J/Cypher
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * @param argument1Translation
	 * @param argument2Translation
	 * @throws InvalidityException
	 * It matches the arguments with the arguments for comparison. 
	 */
	private final void matchCypherOperators(StringBuilder cypher, final String argument1Translation,
		final String argument2Translation) throws InvalidityException {
		
		switch(option.getValue()) {
		case EQUAL:
			generateCypherDependingOnReturnType(cypher, argument1Translation, argument2Translation, CypherSpecificConstants.CYPHER_COMPARISON_OPERATOR_EQUAL);
			break;
		case NOTEQUAL:
			generateCypherDependingOnReturnType(cypher, argument1Translation, argument2Translation, CypherSpecificConstants.CYPHER_COMPARISON_OPERATOR_NOTEQUAL);
			break;
		case GREATER:
			generateCypherDependingOnReturnType(cypher, argument1Translation, argument2Translation, CypherSpecificConstants.CYPHER_COMPARISON_OPERATOR_GREATER);
			break;
		case LESS:
			generateCypherDependingOnReturnType(cypher, argument1Translation, argument2Translation, CypherSpecificConstants.CYPHER_COMPARISON_OPERATOR_LESS);
			break;
		case GREATEROREQUAL:
			generateCypherDependingOnReturnType(cypher, argument1Translation, argument2Translation, CypherSpecificConstants.CYPHER_COMPARISON_OPERATOR_GREATER_EQUAL);
			break;
		case LESSOREQUAL:
			generateCypherDependingOnReturnType(cypher, argument1Translation, argument2Translation, CypherSpecificConstants.CYPHER_COMPARISON_OPERATOR_LESS_EQUAL);
			break;
		default:
			throw new InvalidityException();
		}
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * @param argument1Translation
	 * @param argument2Translation
	 * @param comp
	 * @throws InvalidityException
	 * Checks if a specific ReturnType is set (List or ElementID)
	 * No further ReturnTypes are specified for Cypher. 
	 * Otherwise the standard Comparison will be done.
	 */
	private void generateCypherDependingOnReturnType(final StringBuilder cypher, final String argument1Translation,
			final String argument2Translation, final String comp) throws InvalidityException {
		if (getTypeOption().getValue() == ReturnType.LIST) {
			final boolean negation = shallListOperatorBeANegation(comp);
			generateCypherListComparison(cypher, argument1Translation, argument2Translation, negation);					
		} else if (getTypeOption().getValue() == ReturnType.ELEMENTID) {
			generateCypherIDComparison(cypher, argument1Translation, argument2Translation, comp);
		} else {
			generateCypherStandardComp(cypher, argument1Translation, argument2Translation, comp);
		}
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @param comp
	 * @return
	 * @throws InvalidityException
	 * Checks based on the comparison operator if the IN-list function of Cypher should be negated.
	 */
	private final boolean shallListOperatorBeANegation(final String comp) throws InvalidityException {
		if (comp.compareTo(CypherSpecificConstants.CYPHER_COMPARISON_OPERATOR_NOTEQUAL) == 0) {
			return true;
		} else if (comp.compareTo(CypherSpecificConstants.CYPHER_COMPARISON_OPERATOR_EQUAL) == 0) {
			return false;
		}
		throw new InvalidityException(NOT_ALLOWED_OPERATOR_FOR_LIST_COMPARISON);
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * @param argument1Translation
	 * @param argument2Translation
	 * @param comp
	 * Executes the standard operation for the comparison operator to concatenate the arguments with the correct logical operator.
	 */
	private void generateCypherStandardComp(StringBuilder cypher, final String argument1Translation,
			final String argument2Translation, final String comp) {
		cypher.append(argument1Translation);
		cypher.append(CypherSpecificConstants.ONE_WHITESPACE + comp
				+ CypherSpecificConstants.ONE_WHITESPACE);
		cypher.append(argument2Translation);
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * @param argument1Translation
	 * @param argument2Translation
	 * @param comp
	 * @throws InvalidityException 
	 * It uses two NeoElementNodes on which the ID function can be called. The ID could also be a numerical value. 
	 */
	private void generateCypherIDComparison(final StringBuilder cypher, String argument1Translation,
			String argument2Translation, String comp) throws InvalidityException {
		boolean isValid = checkForValidCypherNode();
//		checkForValidIdElement(); // --> There is no comparison between ComplexNode and PatamterValue
		if (isValid) {
			cypher.append(String.format(CypherSpecificConstants.CYPHER_SPECIAL_FUNCTION_ID, argument1Translation));
			cypher.append(CypherSpecificConstants.ONE_WHITESPACE + comp
					+ CypherSpecificConstants.ONE_WHITESPACE);
			cypher.append(String.format(CypherSpecificConstants.CYPHER_SPECIAL_FUNCTION_ID, argument2Translation));
		} else {
			throw new UnsupportedOperationException();
		}
	}
	

	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * @param argument1Translation
	 * @param argument2Translation (ListParam)
	 * @param negation
	 * @throws InvalidityException
	 * Creates the list comparision with IN-Function
	 * Just allows as a second function an ListParam
	 */
	private void generateCypherListComparison(final StringBuilder cypher, final String argument1Translation,
			final String argument2Translation, final boolean negation) throws InvalidityException {
		if (!(getArgument2() instanceof ListParam)) {
			throw new InvalidityException(THE_SECOND_ARGUMENT_HAS_TO_BE_A_LIST);	
		}
		if (!negation) {
			cypher.append(argument1Translation);
			cypher.append(CypherSpecificConstants.ONE_WHITESPACE + CypherSpecificConstants.BOOLEAN_OPERATOR_IN
					+ CypherSpecificConstants.ONE_WHITESPACE);
			cypher.append(argument2Translation);
		} else {
			cypher.append(CypherSpecificConstants.BOOLEAN_OPERATOR_NOT + " (");
			cypher.append(argument1Translation);
			cypher.append(CypherSpecificConstants.ONE_WHITESPACE + CypherSpecificConstants.BOOLEAN_OPERATOR_IN
					+ CypherSpecificConstants.ONE_WHITESPACE);
			cypher.append(argument2Translation);
			cypher.append(")");
		}
		
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @return
	 * Returns true if a Node is referred to. In the other case it returns false.  
	 */
	private final boolean checkForValidCypherNode() {
		return (getArgument1() instanceof NeoElementNode && getArgument2() instanceof NeoElementNode);
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @return
	 * @throws InvalidityException
	 * Checks if at least one of both arguments is something to reference to.
	 * If it is the case it converts it to the fitting string part for cypher.
	 * The return type is a unmodifiable list with always just two entries.
	 * The first entry is the first argument and the second entry is the second argument. 
	 */
	private final List<String> cypherArgumentCheckerAndConverter() throws InvalidityException {
		String argument1Translation = null;
		String argument2Translation = null; 
		
		if (getArgument1() instanceof NeoPropertyNode && getArgument2() instanceof NeoPropertyNode) {
			argument1Translation = (String) ((NeoPropertyNode) getArgument1()).generateCypherPropertyAddressing().get(CypherSpecificConstants.FIRST_CYPHER_PROPERTY_ADDRESSING); 
			argument2Translation = (String) ((NeoPropertyNode) getArgument2()).generateCypherPropertyAddressing().get(CypherSpecificConstants.FIRST_CYPHER_PROPERTY_ADDRESSING);
		} else if (getArgument1() instanceof NeoPropertyNode && !(getArgument2() instanceof NeoPropertyNode)) {
			argument1Translation = (String) ((NeoPropertyNode) getArgument1()).generateCypherPropertyAddressing().get(CypherSpecificConstants.FIRST_CYPHER_PROPERTY_ADDRESSING);
			argument2Translation = getArgument2().generateCypher(); 
		} else if (!(getArgument1() instanceof NeoPropertyNode) && getArgument2() instanceof NeoPropertyNode) {
			argument1Translation = getArgument1().generateCypher();
			argument2Translation = (String) ((NeoPropertyNode) getArgument2()).generateCypherPropertyAddressing().get(CypherSpecificConstants.FIRST_CYPHER_PROPERTY_ADDRESSING);
		} else if (getArgument1() instanceof NeoElementNode && getArgument2() instanceof NeoElementNode) {
			argument1Translation = ((NeoElementNode) getArgument1()).getCypherVariable(); 
			argument2Translation = ((NeoElementNode) getArgument2()).getCypherVariable(); 
		}
			
		List<String> result = new ArrayList<String>();
		result.add(argument1Translation);
		result.add(argument2Translation);
		result = Collections.unmodifiableList(result);
		return result;
	}
	//END - Neo4J/Cypher
	
	/**
	 * <!-- begin-user-doc --> 
	 * Validation of <code>this</code>. 
	 * <!-- end-user-doc -->
	 */
	
	@Override
	public void isValid(AbstractionLevel abstractionLevel)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		super.isValid(abstractionLevel);

		if (argument1 instanceof OperatorImpl || argument1 instanceof ParameterValueImpl)
			argument1.isValid(abstractionLevel);
		if (argument2 instanceof OperatorImpl || argument2 instanceof ParameterValueImpl)
			argument2.isValid(abstractionLevel);
		option.isValid(abstractionLevel);
		typeOption.isValid(abstractionLevel);

	}

	/**
	 * <!-- begin-user-doc --> 
	 * Validation of internal values. 
	 * <!-- end-user-doc -->
	 */
	
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException {
		if(abstractionLevel != AbstractionLevel.SEMI_GENERIC) {
			if (argument1 == null)
				throw new InvalidityException("argument1 null" + " (" + getInternalId() + ")");
			if (argument2 == null)
				throw new InvalidityException("argument2 null" + " (" + getInternalId() + ")");
		}
		
		if (option == null)
			throw new InvalidityException("operator option null" + " (" + getInternalId() + ")");
		if (typeOption == null)
			throw new InvalidityException("operator typeOption null" + " (" + getInternalId() + ")");

		if(argument1 != null && argument2 != null) { 
			if (argument1.getReturnType() != argument2.getReturnType()) {
				if (argument1.getReturnType() != ReturnType.UNSPECIFIED
						&& argument2.getReturnType() != ReturnType.UNSPECIFIED) {
					throw new InvalidityException("type mismatch" + " (" + getInternalId() + ") of " + argument1.getReturnType() + " and " + argument2.getReturnType());
				}
			}
		}

		if (argument1 != null && argument1.getReturnType() != ReturnType.UNSPECIFIED && getTypeOption().getValue() != ReturnType.UNSPECIFIED && argument1.getReturnType() != getTypeOption().getValue()) {
			throw new InvalidityException("type mismatch in argument1 " + argument1.getReturnType() + " is not " + getTypeOption().getValue() + " (" + getInternalId() + ")");
		}
		if (argument1 != null && argument2.getReturnType() != ReturnType.UNSPECIFIED && getTypeOption().getValue() != ReturnType.UNSPECIFIED && argument2.getReturnType() != getTypeOption().getValue()) {
			throw new InvalidityException("type mismatch in argument2 " + argument2.getReturnType() + " is not " + getTypeOption().getValue() + " (" + getInternalId() + ")");
		}

		if (abstractionLevel == AbstractionLevel.CONCRETE && getTypeOption().getValue() == ReturnType.UNSPECIFIED) {
			throw new InvalidityException("input value type unspecified" + " (" + getInternalId() + ")");
		}

		if (argument1 instanceof ComplexNode && argument2 instanceof ComplexNode) {
			if (option.getValue() != ComparisonOperator.EQUAL && option.getValue() != ComparisonOperator.NOTEQUAL) {
				throw new InvalidityException(
						"invalid comparison operator for arguments of type Element" + " (" + getInternalId() + ")");
			}
		}
		
//		if (abstractionLevel == AbstractionLevel.GENERIC) {
//			isAbstractNeo4jValid();
//		}
		
		super.isValidLocal(abstractionLevel);
		isCycleFree();
	}
	
//	/**
//	 * @author Lukas Sebastian Hofmann
//	 * @throws InvalidityException
//	 * Checks if correct arguments are set for a comparison of Neo4J
//	 */
//	private final void isAbstractNeo4jValid() throws InvalidityException {
//		if (getArgument1() instanceof PrimitiveNode && getArgument2() instanceof PrimitiveNode) {
//			return;
//		} else if (getArgument1() instanceof PrimitiveNode && !(getArgument2() instanceof ComplexNode)) {
//			return;
//		} else if (!(getArgument1() instanceof ComplexNode) && getArgument2() instanceof PrimitiveNode) {
//			return;
//		} else if (getArgument1() instanceof ComplexNode && getArgument2() instanceof ComplexNode) {
//			return;
//		} else if (getArgument1() instanceof ComplexNode && getArgument2() instanceof NumberParam) {
//			return;
//		} else if (getArgument1() instanceof NumberParam && getArgument2() instanceof ComplexNode) {
//			return;
//		}
//		throw new InvalidityException(THE_GIVEN_ARGUMENTS_ARE_NOT_VALID_FOR_NEO4J_POSSIBLIE_ARE_2X_PROPERTIES_2X_NODES_1X_PROPERTY_1X_PARAM);
//	}

	/**
	 * <!-- begin-user-doc --> 
	 * Returns this and all contained <code>Operator</code>s.
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 */
	public EList<Operator> getAllOperators() throws InvalidityException {
		EList<Operator> res = new BasicEList<Operator>();
		res.add(this);
		if (argument1 instanceof Operator) {
			res.addAll(((Operator) argument1).getAllOperators());
		}
		if (argument2 instanceof Operator) {
			res.addAll(((Operator) argument2).getAllOperators());
		}
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns all <code>Parameter</code>s referenced by this or a contained Operator.
	 * <!-- end-user-doc -->
	 */
	@Override
	public EList<Parameter> getAllParameters() throws InvalidityException {
		EList<Parameter> res = new BasicEList<Parameter>();
		if (argument1 instanceof Parameter) {
			res.add((Parameter) argument1);
		} else if (argument1 instanceof Operator) {
			res.addAll(((Operator) argument1).getAllParameters());
		}
		
		if (argument2 instanceof Parameter) {
			res.add((Parameter) argument2);
		} else if (argument2 instanceof Operator) {
			res.addAll(((Operator) argument2).getAllParameters());
		}
		
		if (getOption() != null) {
			res.add(option);
		} else {
			throw new InvalidityException("option null" + " (" + getInternalId() + ")");
		}
		
		if (getTypeOption() != null) {
			res.add(typeOption);
		} else {
			throw new InvalidityException("typeOption null" + " (" + getInternalId() + ")");
		}
		
		return res;
	}

	@Override
	public boolean isTranslatable() {		
		return argument1.isTranslatable() && argument2.isTranslatable();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @throws InvalidityException
	 * 
	 */
	@Override
	public EList<Node> getAllArgumentElements() {
		EList<Node> arguments = new BasicEList<Node>();
		if(argument1 != null) {
			arguments.addAll(argument1.getAllArgumentElements());
		}
		if(argument2 != null) {
			arguments.addAll(argument2.getAllArgumentElements());
		}
		return arguments;
	}

	@Override
	public EList<Comparable> getArguments() {
		EList<Comparable> list = new BasicEList<Comparable>();
		list.add(argument1);
		list.add(argument2);
		return list;
	}

	@Override
	public void createParameters() {	
		ParameterList parameterList = getParameterList();
		if(parameterList != null) {
			if (getOption() == null) {
				ComparisonOptionParam comparisonOption = new ComparisonOptionParamImpl();
				setOption(comparisonOption);
			}
			parameterList.add(getOption());
			if (getTypeOption() == null) {
				TypeOptionParam typeOption = new TypeOptionParamImpl();
				setTypeOption(typeOption);
			}
			parameterList.add(getTypeOption());
		}		
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperatorsPackage.Literals.COMPARISON;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public qualitypatternmodel.graphstructure.Comparable getArgument1() {
		if (argument1 != null && argument1.eIsProxy()) {
			InternalEObject oldArgument1 = (InternalEObject)argument1;
			argument1 = (qualitypatternmodel.graphstructure.Comparable)eResolveProxy(oldArgument1);
			if (argument1 != oldArgument1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperatorsPackage.COMPARISON__ARGUMENT1, oldArgument1, argument1));
			}
		}
		return argument1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public qualitypatternmodel.graphstructure.Comparable basicGetArgument1() {
		return argument1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArgument1(qualitypatternmodel.graphstructure.Comparable newArgument1) {
		if (newArgument1 != argument1) {
			NotificationChain msgs = null;
			if (argument1 != null)
				msgs = ((InternalEObject)argument1).eInverseRemove(this, GraphstructurePackage.COMPARABLE__COMPARISON1, qualitypatternmodel.graphstructure.Comparable.class, msgs);
			if (newArgument1 != null)
				msgs = ((InternalEObject)newArgument1).eInverseAdd(this, GraphstructurePackage.COMPARABLE__COMPARISON1, qualitypatternmodel.graphstructure.Comparable.class, msgs);
			msgs = basicSetArgument1(newArgument1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatorsPackage.COMPARISON__ARGUMENT1, newArgument1, newArgument1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetArgument1(qualitypatternmodel.graphstructure.Comparable newArgument1, NotificationChain msgs) {		
		Comparable oldArgument1 = argument1;
		argument1 = newArgument1;
		
		if(oldArgument1 instanceof Node && newArgument1 == null) {
			try {
				((Node) oldArgument1).makeGeneric();
			} catch (InvalidityException e) {
				// no problem
			}
		}
		if(argument2 instanceof Node && newArgument1 == null) {
			try {
				((Node) argument2).makeGeneric();
			} catch (InvalidityException e) {
				// no problem
			}
		}

		try {
			isCycleFree();
			
			if(newArgument1 != null && (newArgument1.getClass().equals(NodeImpl.class) || newArgument1.getClass().equals(ComplexNodeImpl.class)) && argument2 instanceof ParameterValue) {
				((Node) newArgument1).makePrimitive();
			}
			if(argument2 != null && newArgument1 instanceof ParameterValue && (argument2.getClass().equals(NodeImpl.class) || argument2.getClass().equals(ComplexNodeImpl.class))){
				((Node) argument2).makePrimitive();
			}				
			
		} catch (OperatorCycleException | InvalidityException e1) {
			argument1 = oldArgument1;
			if (newArgument1 != null) {
				newArgument1.getComparison1().remove(this); // undo eInverseAdd
			}
			if (oldArgument1 != null) {
				oldArgument1.getComparison1().add(this); // undo eInverseRemove
			}
			return msgs;
		}
		
		setTypeAccordingToArgument(newArgument1, getArgument2());

		adaptOperatorElementAssociation(newArgument1, oldArgument1);		
					
		ParameterList varlist = getParameterList();			
		if(oldArgument1 instanceof Parameter && varlist != null) {
			Parameter oldParameter = (Parameter) oldArgument1;					
			varlist.remove(oldParameter);				
		}				
		if(newArgument1 instanceof Parameter && varlist != null) {
			Parameter newParameter = (Parameter) newArgument1;
			varlist.add(newParameter);				
		}			

		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OperatorsPackage.COMPARISON__ARGUMENT1, oldArgument1, newArgument1);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	private void setTypeAccordingToArgument(qualitypatternmodel.graphstructure.Comparable newArgument,
			qualitypatternmodel.graphstructure.Comparable otherArgument) {
		if(getTypeOption() != null) {
			if (newArgument == null) {
				if (otherArgument == null || otherArgument instanceof PrimitiveNode || otherArgument instanceof UntypedParameterValue) {
					getTypeOption().setValue(ReturnType.UNSPECIFIED);
					if(!getTypeOption().getOptions().contains(ReturnType.UNSPECIFIED)) {
						getTypeOption().getOptions().add(ReturnType.UNSPECIFIED);
					}
					getTypeOption().setPredefined(false);
				}				
			} else {
				
				if (newArgument instanceof ComplexNode || newArgument instanceof BooleanOperator || newArgument instanceof NumberOperator || newArgument instanceof ParameterValue) {
					ReturnType returnType = null;
					
					if (newArgument instanceof ComplexNode) {
						returnType = ReturnType.ELEMENT;
					}
					if (newArgument instanceof BooleanOperator) {
						returnType = ReturnType.BOOLEAN;
					}
					if (newArgument instanceof NumberOperator) {
						returnType = ReturnType.NUMBER;
						
					}
					if (newArgument instanceof ParameterValue) {
						ParameterValue xsType = (ParameterValue) newArgument;						
						returnType = xsType.getReturnType();
					}
					
					getTypeOption().setValue(returnType);
					if(!getTypeOption().getOptions().contains(returnType)) {
						getTypeOption().getOptions().add(returnType);
					}
					getTypeOption().setPredefined(true);
				}
				
				
				if (newArgument instanceof UntypedParameterValue) {
					getTypeOption().setValue(ReturnType.UNSPECIFIED);
					if(!getTypeOption().getOptions().contains(ReturnType.UNSPECIFIED)) {
						getTypeOption().getOptions().add(ReturnType.UNSPECIFIED);
					}
					getTypeOption().setPredefined(false);
				}			
			}
		}

	}	

	private void adaptOperatorElementAssociation(qualitypatternmodel.graphstructure.Comparable newArgument, qualitypatternmodel.graphstructure.Comparable oldArgument) {
		EList<BooleanOperator> rootOperators = getRootBooleanOperators();

		addNewArgumentElementsToRootOperator(newArgument, rootOperators);

		if (newArgument instanceof BooleanOperator) {
			moveElementsFromNewArgumentToRootOperator(newArgument, rootOperators);
		}

		if(rootOperators.size() > 0) {
			for (BooleanOperator rootOperator : rootOperators) {
				removeOldArgumentElementsFromRootOperator(oldArgument, rootOperator);
				if (oldArgument instanceof BooleanOperator) {
					moveElementsFromRootOperatorToOldArgument(oldArgument, rootOperator);
				}
			}
		}
	}

	private void moveElementsFromRootOperatorToOldArgument(qualitypatternmodel.graphstructure.Comparable oldArgument, BooleanOperator rootOperator) {
		BooleanOperator oldArgumentOperator = (BooleanOperator) oldArgument;
		EList<Node> rootOperatorElements = new BasicEList<Node>();
		rootOperatorElements.addAll(rootOperator.getNodes());
		// rootOperator.getElements() is already empty at this point in case THIS gets DELETED!
		
		EList<Node> argumentElements = oldArgumentOperator.getAllArgumentElements();
		if(argumentElements.size() > 0) {
			for (Node argumentElement : argumentElements) {
					oldArgumentOperator.addElement(argumentElement);
					rootOperator.removeElement(argumentElement);
			}
		}
		
	}

	private void removeOldArgumentElementsFromRootOperator(qualitypatternmodel.graphstructure.Comparable oldArgument, BooleanOperator rootOperator) {
		if (oldArgument != null && oldArgument instanceof Node) {
			rootOperator.removeElement((Node) oldArgument);
		}
	}

	private void moveElementsFromNewArgumentToRootOperator(qualitypatternmodel.graphstructure.Comparable newArgument,
			EList<BooleanOperator> rootBooleanOperators) {
		BooleanOperator argumentOperator = (BooleanOperator) newArgument;
		EList<Node> argumentOperatorElements = new BasicEList<Node>();
		argumentOperatorElements.addAll(argumentOperator.getNodes());
		if(argumentOperatorElements.size() > 0) {
			for (Node node : argumentOperatorElements) {
				argumentOperator.removeElement(node);
				if(rootBooleanOperators.size() > 0) {
					for (BooleanOperator rootBoolenOperator : rootBooleanOperators) {
						rootBoolenOperator.addElement(node);
					}
				}
			}
		}
	}

	private void addNewArgumentElementsToRootOperator(qualitypatternmodel.graphstructure.Comparable newArgument,
			EList<BooleanOperator> rootBooleanOperators) {
		if (newArgument instanceof Node) {
			for (BooleanOperator boolOp : rootBooleanOperators) {
				if (newArgument != null) {
					boolOp.addElement((Node) newArgument);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComparisonOptionParam getOption() {
		if (option != null && option.eIsProxy()) {
			InternalEObject oldOption = (InternalEObject)option;
			option = (ComparisonOptionParam)eResolveProxy(oldOption);
			if (option != oldOption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperatorsPackage.COMPARISON__OPTION, oldOption, option));
			}
		}
		return option;
	}	

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOptionParam basicGetOption() {
		return option;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetOption(ComparisonOptionParam newOption, NotificationChain msgs) {
		ComparisonOptionParam oldOption = option;
		
		ParameterList varlist = getParameterList();
		if(varlist != null) {
			varlist.remove(oldOption);
			varlist.add(newOption);
		}
		
		option = newOption;
		
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperatorsPackage.COMPARISON__OPTION, oldOption, newOption);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOption(ComparisonOptionParam newOption) {
		if (newOption != option) {
			NotificationChain msgs = null;
			if (option != null)
				msgs = ((InternalEObject)option).eInverseRemove(this, ParametersPackage.COMPARISON_OPTION_PARAM__COMPARISONS, ComparisonOptionParam.class, msgs);
			if (newOption != null)
				msgs = ((InternalEObject)newOption).eInverseAdd(this, ParametersPackage.COMPARISON_OPTION_PARAM__COMPARISONS, ComparisonOptionParam.class, msgs);
			msgs = basicSetOption(newOption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatorsPackage.COMPARISON__OPTION, newOption, newOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeOptionParam getTypeOption() {
		if (typeOption != null && typeOption.eIsProxy()) {
			InternalEObject oldTypeOption = (InternalEObject)typeOption;
			typeOption = (TypeOptionParam)eResolveProxy(oldTypeOption);
			if (typeOption != oldTypeOption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperatorsPackage.COMPARISON__TYPE_OPTION, oldTypeOption, typeOption));
			}
		}
		return typeOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOptionParam basicGetTypeOption() {
		return typeOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetTypeOption(TypeOptionParam newTypeOption, NotificationChain msgs) {
		TypeOptionParam oldTypeOption = typeOption;
		
		ParameterList varlist = getParameterList();
		if(varlist != null) {
			varlist.remove(oldTypeOption);
			varlist.add(newTypeOption);
		}
		
		typeOption = newTypeOption;
		
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperatorsPackage.COMPARISON__TYPE_OPTION, oldTypeOption, newTypeOption);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeOption(TypeOptionParam newTypeOption) {
		if (newTypeOption != typeOption) {
			NotificationChain msgs = null;
			if (typeOption != null)
				msgs = ((InternalEObject)typeOption).eInverseRemove(this, ParametersPackage.TYPE_OPTION_PARAM__TYPE_COMPARISONS, TypeOptionParam.class, msgs);
			if (newTypeOption != null)
				msgs = ((InternalEObject)newTypeOption).eInverseAdd(this, ParametersPackage.TYPE_OPTION_PARAM__TYPE_COMPARISONS, TypeOptionParam.class, msgs);
			msgs = basicSetTypeOption(newTypeOption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatorsPackage.COMPARISON__TYPE_OPTION, newTypeOption, newTypeOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isPrimitive() {
		if(!(getArgument1() instanceof PrimitiveNode) && !(getArgument2() instanceof PrimitiveNode)) {			
			return false;
		}
		if(!(getArgument1() instanceof Parameter) && !(getArgument2() instanceof Parameter)) {			
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Node getElement() {
		if(isPrimitive()) {
			if(getArgument1() instanceof PrimitiveNode) {
				return (PrimitiveNode) getArgument1();
			}
			if(getArgument2() instanceof PrimitiveNode) {
				return (PrimitiveNode) getArgument2();
			}
		} 
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Comparison copy() {
		Comparison newComparison = new ComparisonImpl();
		newComparison.setOption(getOption());
		return newComparison;
	}
	
	@Override
	public EList<PatternElement> prepareParameterUpdates() {
		EList<PatternElement> patternElements = new BasicEList<PatternElement>();
		
		patternElements.add(getOption());
		setOption(null);
		
		patternElements.add(getTypeOption());
		setTypeOption(null);
		
		if(getArgument1() instanceof Operator) {
			patternElements.add(getArgument1());
		}
		if(getArgument1() instanceof Parameter) {
			patternElements.add(getArgument1());
			setArgument1(null);
		}
		if(getArgument2() instanceof Operator) {
			patternElements.add(getArgument2());
		}
		if(getArgument2() instanceof Parameter) {
			patternElements.add(getArgument2());
			setArgument2(null);
		}
		
		return patternElements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public qualitypatternmodel.graphstructure.Comparable getArgument2() {
		if (argument2 != null && argument2.eIsProxy()) {
			InternalEObject oldArgument2 = (InternalEObject)argument2;
			argument2 = (qualitypatternmodel.graphstructure.Comparable)eResolveProxy(oldArgument2);
			if (argument2 != oldArgument2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperatorsPackage.COMPARISON__ARGUMENT2, oldArgument2, argument2));
			}
		}
		return argument2;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public qualitypatternmodel.graphstructure.Comparable basicGetArgument2() {
		return argument2;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArgument2(qualitypatternmodel.graphstructure.Comparable newArgument2) {
		if (newArgument2 != argument2) {
			NotificationChain msgs = null;
			if (argument2 != null)
				msgs = ((InternalEObject)argument2).eInverseRemove(this, GraphstructurePackage.COMPARABLE__COMPARISON2, qualitypatternmodel.graphstructure.Comparable.class, msgs);
			if (newArgument2 != null)
				msgs = ((InternalEObject)newArgument2).eInverseAdd(this, GraphstructurePackage.COMPARABLE__COMPARISON2, qualitypatternmodel.graphstructure.Comparable.class, msgs);
			msgs = basicSetArgument2(newArgument2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatorsPackage.COMPARISON__ARGUMENT2, newArgument2, newArgument2));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public NotificationChain basicSetArgument2(qualitypatternmodel.graphstructure.Comparable newArgument2,
			NotificationChain msgs) {
		Comparable oldArgument2 = argument2;
		argument2 = newArgument2;
		
		if(oldArgument2 instanceof Node && newArgument2 == null) {
			try {
				((Node) oldArgument2).makeGeneric();
			} catch (InvalidityException e) {
				// no problem
			}
		}
		if(argument1 instanceof Node && newArgument2 == null) {
			try {
				((Node) argument1).makeGeneric();
			} catch (InvalidityException e) {
				// no problem
			}
		}

		try {
			isCycleFree();
			
			if(newArgument2 != null && argument1 instanceof ParameterValue && (newArgument2.getClass().equals(NodeImpl.class) || newArgument2.getClass().equals(ComplexNodeImpl.class))) {
				((Node) newArgument2).makePrimitive();
			}
			if(argument1 != null && newArgument2 instanceof ParameterValue && (argument1.getClass().equals(NodeImpl.class) || argument1.getClass().equals(ComplexNodeImpl.class))){
				((Node) argument1).makePrimitive();
			}
		} catch (OperatorCycleException | InvalidityException e1) {
			argument2 = oldArgument2;
			if (newArgument2 != null) {
				newArgument2.getComparison2().remove(this); // undo eInverseAdd
			}
			if (oldArgument2 != null) {
				oldArgument2.getComparison2().add(this); // undo eInverseRemove
			}
			return msgs;
		}
		
		setTypeAccordingToArgument(newArgument2, getArgument2());

		adaptOperatorElementAssociation(newArgument2, oldArgument2);		
		
		ParameterList varlist = getParameterList();			
		if(oldArgument2 instanceof Parameter && varlist != null) {
			Parameter oldParameter = (Parameter) oldArgument2;					
			varlist.remove(oldParameter);				
		}				
		if(newArgument2 instanceof Parameter && varlist != null) {
			Parameter newParameter = (Parameter) newArgument2;
			varlist.add(newParameter);				
		}		
		

		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OperatorsPackage.COMPARISON__ARGUMENT2, oldArgument2, newArgument2);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OperatorsPackage.COMPARISON__ARGUMENT1:
				if (argument1 != null)
					msgs = ((InternalEObject)argument1).eInverseRemove(this, GraphstructurePackage.COMPARABLE__COMPARISON1, qualitypatternmodel.graphstructure.Comparable.class, msgs);
				return basicSetArgument1((qualitypatternmodel.graphstructure.Comparable)otherEnd, msgs);
			case OperatorsPackage.COMPARISON__ARGUMENT2:
				if (argument2 != null)
					msgs = ((InternalEObject)argument2).eInverseRemove(this, GraphstructurePackage.COMPARABLE__COMPARISON2, qualitypatternmodel.graphstructure.Comparable.class, msgs);
				return basicSetArgument2((qualitypatternmodel.graphstructure.Comparable)otherEnd, msgs);
			case OperatorsPackage.COMPARISON__OPTION:
				if (option != null)
					msgs = ((InternalEObject)option).eInverseRemove(this, ParametersPackage.COMPARISON_OPTION_PARAM__COMPARISONS, ComparisonOptionParam.class, msgs);
				return basicSetOption((ComparisonOptionParam)otherEnd, msgs);
			case OperatorsPackage.COMPARISON__TYPE_OPTION:
				if (typeOption != null)
					msgs = ((InternalEObject)typeOption).eInverseRemove(this, ParametersPackage.TYPE_OPTION_PARAM__TYPE_COMPARISONS, TypeOptionParam.class, msgs);
				return basicSetTypeOption((TypeOptionParam)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OperatorsPackage.COMPARISON__ARGUMENT1:
				return basicSetArgument1(null, msgs);
			case OperatorsPackage.COMPARISON__ARGUMENT2:
				return basicSetArgument2(null, msgs);
			case OperatorsPackage.COMPARISON__OPTION:
				return basicSetOption(null, msgs);
			case OperatorsPackage.COMPARISON__TYPE_OPTION:
				return basicSetTypeOption(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperatorsPackage.COMPARISON__ARGUMENT1:
				if (resolve) return getArgument1();
				return basicGetArgument1();
			case OperatorsPackage.COMPARISON__ARGUMENT2:
				if (resolve) return getArgument2();
				return basicGetArgument2();
			case OperatorsPackage.COMPARISON__OPTION:
				if (resolve) return getOption();
				return basicGetOption();
			case OperatorsPackage.COMPARISON__TYPE_OPTION:
				if (resolve) return getTypeOption();
				return basicGetTypeOption();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OperatorsPackage.COMPARISON__ARGUMENT1:
				setArgument1((qualitypatternmodel.graphstructure.Comparable)newValue);
				return;
			case OperatorsPackage.COMPARISON__ARGUMENT2:
				setArgument2((qualitypatternmodel.graphstructure.Comparable)newValue);
				return;
			case OperatorsPackage.COMPARISON__OPTION:
				setOption((ComparisonOptionParam)newValue);
				return;
			case OperatorsPackage.COMPARISON__TYPE_OPTION:
				setTypeOption((TypeOptionParam)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OperatorsPackage.COMPARISON__ARGUMENT1:
				setArgument1((qualitypatternmodel.graphstructure.Comparable)null);
				return;
			case OperatorsPackage.COMPARISON__ARGUMENT2:
				setArgument2((qualitypatternmodel.graphstructure.Comparable)null);
				return;
			case OperatorsPackage.COMPARISON__OPTION:
				setOption((ComparisonOptionParam)null);
				return;
			case OperatorsPackage.COMPARISON__TYPE_OPTION:
				setTypeOption((TypeOptionParam)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OperatorsPackage.COMPARISON__ARGUMENT1:
				return argument1 != null;
			case OperatorsPackage.COMPARISON__ARGUMENT2:
				return argument2 != null;
			case OperatorsPackage.COMPARISON__OPTION:
				return option != null;
			case OperatorsPackage.COMPARISON__TYPE_OPTION:
				return typeOption != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OperatorsPackage.COMPARISON___IS_PRIMITIVE:
				return isPrimitive();
			case OperatorsPackage.COMPARISON___COPY:
				return copy();
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public String myToString() {
		String res = "COMP [" + getInternalId() + "] " + getTypeOption().getValue() + ":" + getReturnType() + " ";
		res += "(";
		if (getArgument1() != null)
			res += getArgument1().getClass().getSimpleName() + " [" + getArgument1().getInternalId() + "] ";
		else
			res += "- ";
		if (getOption() != null)
			res += getOption().getValue() + "[" + getOption().getInternalId() + "]";
		else
			res += "-";
		if (getArgument2() != null)
			res += " " + getArgument2().getClass().getSimpleName() + " [" + getArgument2().getInternalId() + "]";
		else
			res += " -";
		return res + ")";
	}
	
	//FUTURE WORK
	@Deprecated
	public String generateCypherInMatch() throws InvalidityException {
		throw new UnsupportedOperationException();
	}
	
	//FUTURE WORK
	@Deprecated
	public boolean neoInWhereClause() throws InvalidityException{
		boolean result = true;
		if (((getArgument1() instanceof NeoPropertyNode && getArgument2() instanceof ParameterValue) ||
				(getArgument1() instanceof ParameterValue && getArgument2() instanceof NeoPropertyNode)) 
				&& option.getValue() == ComparisonOperator.EQUAL) {
			if(option.getValue() == ComparisonOperator.EQUAL) result = false;
		} else if (getArgument1() instanceof NeoElementNode || getArgument2() instanceof NeoElementNode) throw new InvalidityException("Args 1 oder 2 can not be a NeoNode");
		return result;
	}
} // ComparisonImpl
