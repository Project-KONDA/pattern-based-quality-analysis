package qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests;

import java.lang.reflect.Field;
import java.util.ArrayList;

import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.cyphertranslationtests.CypherTranslationAbstract;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.operators.NullCheck;
import qualitypatternmodel.operators.impl.NullCheckImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

public class CypherTest12CheckNull extends CypherTranslationAbstract {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
        CypherTranslationAbstract checkNull = new CypherTest12CheckNull();
        try {
        	checkNull.generalizedTests();         
            checkNull.generalizedInvalidtyExceptionTests();
        } catch (Exception e) {
			System.out.println(e);
		}
    }

	@Override
	public void buildInvalidityExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
			completePatternsExceptions.add(nullCheckInvalidOptionException());
			completePatternsExceptions.add(nullCheckNullPrimitiveNodeException());
	}

	@Override
	public void buildPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatterns.add(tryIsNull(true, "isoStartDate"));
		completePatterns.add(tryIsNull(false, "isoStartDate"));
	}

	private static CompletePattern tryIsNull(Boolean isNull, String str) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern pattern = factory.createCompletePattern();
		if (isNull) {
			pattern.getGraph().getNodes().get(0).addOutgoing().getTarget().addPrimitiveNullCheck();
		} else {
			pattern.getGraph().getNodes().get(0).addOutgoing().getTarget().addPrimitiveNullCheck(isNull);
		}
		
		NullCheck nullCheck = ((NullCheck) pattern.getGraph().getOperatorList().getOperators().get(0));		
		makeConcrete(pattern);
		
		return pattern;
	}
	
	private static void makeConcrete(CompletePattern pattern)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		pattern.createNeo4jAdaption();
		NeoNode neoNode = (NeoNode) pattern.getGraph().getNodes().get(0);
		neoNode.addLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) pattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("summary");
	}
	
	//Exceptions
	private static CompletePattern nullCheckInvalidOptionException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;	
		CompletePattern pattern = factory.createCompletePattern();
		pattern.getGraph().getNodes().get(0).addOutgoing().getTarget().addPrimitiveNullCheck();
		
		NullCheck nullCheck = ((NullCheck) pattern.getGraph().getOperatorList().getOperators().get(0));		
		makeConcrete(pattern);
		
		Class c = NullCheckImpl.class;
		Field option = c.getDeclaredField("option");
		option.setAccessible(true);
		option.set(nullCheck, null);
		option.setAccessible(false);
	    
		return pattern;
	}
	
	private static CompletePattern nullCheckNullPrimitiveNodeException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;	
		CompletePattern pattern = factory.createCompletePattern();
		pattern.getGraph().getNodes().get(0).addOutgoing().getTarget().addPrimitiveNullCheck();
		
		NullCheck nullCheck = ((NullCheck) pattern.getGraph().getOperatorList().getOperators().get(0));		
		makeConcrete(pattern);
		
		Class c = NullCheckImpl.class;
		Field option = c.getDeclaredField("primitiveNode");
		option.setAccessible(true);
		option.set(nullCheck, null);
		option.setAccessible(false);
		
		return pattern;
	}
	
    @Override
	public void generalizedInvalidtyExceptionTests()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		ArrayList<CompletePattern> completePatternsExceptions = new ArrayList<CompletePattern>();
		buildInvalidityExceptionPatterns(completePatternsExceptions);
		if (completePatternsExceptions.size() != 0) {
			System.out.println("");
			System.out.println(CypherTranslationAbstract.BEGIN_BUILD_PATTERN_EXCEPTIONS);		
			CypherTest10Match.exceptionTestHandler(completePatternsExceptions);
			System.out.println(CypherTranslationAbstract.END_BUILD_PATTERN_EXCEPTIONS);
			System.out.println("");
		}
	}
    
	public static void exceptionTestHandler(ArrayList<CompletePattern> completePatterns) {
		for (CompletePattern completePattern : completePatterns) {
			try {
				System.out.println(PATTERN_NOT_VALID);
				try {
					System.out.println(completePattern.myToString());
				} catch (Exception e) {
					// TODO: handle exception
				}
				System.out.print(TRANSLATION);
				System.out.println(completePattern.generateCypher());
				System.out.println(NO_EXCEPTION_HAS_BEEN_TRIGGERED);
			} catch (Exception e) {
				System.out.println("");
				System.out.println(BEGINNING_OF_THE_EXCEPTIONS_TESTS);
				System.out.println(e.toString());
				try {
				  System.out.println(completePattern.myToString());
				} catch (Exception e2) {
					System.out.println(e2.toString());
				}
				System.out.println(TEST_SUCCESSFUL);
			}
		}
	}
}
