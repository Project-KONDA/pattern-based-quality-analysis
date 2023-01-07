package qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests;

import java.lang.reflect.Field;
import java.util.ArrayList;

import qualitypatternmodel.adaptionneo4j.NeoElementNode;
import qualitypatternmodel.adaptionneo4j.NeoPlace;
import qualitypatternmodel.adaptionneo4j.NeoPropertyEdge;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
import qualitypatternmodel.cyphertranslationtests.CypherTranslation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

public class CypherTest10Match extends CypherTranslation {
//	https://neo4j.com/docs/cypher-manual/current/clauses/where/ --> Consider the diffrent regex expressions from here
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CypherTest10Match match = new CypherTest10Match();
		try {
			match.generalizedTests();         
			match.generalizedInvalidtyExceptionTests();
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
    }

	@Override
	public void buildPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatterns.add(getPatternMatch(true, "Churfürsten"));
		completePatterns.add(getPatternMatch(false, "Churfürsten"));
        completePatterns.add(getPatternMatch(true, ".*Churfürsten.*"));
		completePatterns.add(getPatternMatch(false, ".*Churfürsten.*"));
        completePatterns.add(getPatternMatch(true, ".*(?i)Churfürsten.*"));
		completePatterns.add(getPatternMatch(false, ".*(?i)Churfürsten.*"));
		completePatterns.add(getPatternMatch(true, ".*(?m)Churfürsten.*"));
		completePatterns.add(getPatternMatch(false, ".*(?m)Churfürsten.*"));
		completePatterns.add(getPatternMatch(true, ".*(?s)Churfürsten.*"));
		completePatterns.add(getPatternMatch(false, ".*(?s)Churfürsten.*"));
	}
	
	@Override
	public void buildInvalidityExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		completePatternsExceptions.add(generateMatchInvalidOptionException(true));
		completePatternsExceptions.add(generateMatchInvalidOptionException(false));
		completePatternsExceptions.add(generateMatchInvalidOptionDiffrentException(true));
		completePatternsExceptions.add(generateMatchInvalidOptionDiffrentException(true));
		completePatternsExceptions.add(generateMatchInvalidOptionDiffrent4Exception(false));
	}
	

    
	private CompletePattern getPatternMatch(Boolean invert, String str) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern pattern = factory.createCompletePattern();
		pattern.getGraph().getNodes().get(0).addOutgoing().getTarget().addPrimitiveMatch(str);
		Match match = ((Match) pattern.getGraph().getOperatorList().getOperators().get(0));
		match.getOption().setValue(invert);
		
		CypherTest10Match.makeConcrete(pattern);
		
		return pattern;
	}
	
	//Exceptions 
	private CompletePattern generateMatchInvalidOptionException(boolean invert)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern pattern = factory.createCompletePattern();
		pattern.getGraph().getNodes().get(0).addOutgoing().getTarget().addPrimitiveMatch("");
		Match match = ((Match) pattern.getGraph().getOperatorList().getOperators().get(0));
		match.getOption().setValue(invert);
		
		pattern.createNeo4jAdaption();
		NeoElementNode neoNode = (NeoElementNode) pattern.getGraph().getNodes().get(0);
		neoNode.setNeoPlace(NeoPlace.BEGINNING);
		neoNode.addNeoLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) pattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("summary");
	
		match = (Match) pattern.getGraph().getOperatorList().getOperators().get(0);
		
		Field option = match.getClass().getDeclaredField("option");
	    option.setAccessible(true);
	    option.set(match, null);
	    
	    Field regularExpression = match.getClass().getDeclaredField("regularExpression");
	    regularExpression.setAccessible(true);
	    regularExpression.set(match, null);
	    
	    Field primitiveNode = match.getClass().getDeclaredField("primitiveNode");
	    primitiveNode.setAccessible(true);
	    primitiveNode.set(match, null);
		
		return pattern;
	}
	
	private CompletePattern generateMatchInvalidOptionDiffrentException(boolean invert)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern pattern = factory.createCompletePattern();
		pattern.getGraph().getNodes().get(0).addOutgoing().getTarget().addPrimitiveMatch("");
		Match match = ((Match) pattern.getGraph().getOperatorList().getOperators().get(0));
		match.getOption().setValue(invert);
		
		pattern.createNeo4jAdaption();
		NeoElementNode neoNode = (NeoElementNode) pattern.getGraph().getNodes().get(0);
		neoNode.setNeoPlace(NeoPlace.BEGINNING);
		neoNode.addNeoLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) pattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("summary");
		
		match = (Match) pattern.getGraph().getOperatorList().getOperators().get(0);
		
		TextLiteralParam t = new TextLiteralParamImpl();
	    Field value = t.getClass().getDeclaredField("value");
		value.setAccessible(true);
		value.set(t, null);
	    
	    Field regularExpression = match.getClass().getDeclaredField("regularExpression");
		regularExpression.setAccessible(true);
		regularExpression.set(match, t);

		return pattern;
	}
	
	private CompletePattern generateMatchInvalidOptionDiffrent3Exception(boolean invert)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern pattern = factory.createCompletePattern();
		pattern.getGraph().getNodes().get(0).addOutgoing().getTarget().addPrimitiveMatch("");
		Match match = ((Match) pattern.getGraph().getOperatorList().getOperators().get(0));
		match.getOption().setValue(invert);
		
		pattern.createNeo4jAdaption();
		NeoElementNode neoNode = (NeoElementNode) pattern.getGraph().getNodes().get(0);
		neoNode.setNeoPlace(NeoPlace.BEGINNING);
		neoNode.addNeoLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) pattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("summary");
		
		match = (Match) pattern.getGraph().getOperatorList().getOperators().get(0);
			    
	    Field regularExpression = match.getClass().getDeclaredField("regularExpression");
		regularExpression.setAccessible(true);
		regularExpression.set(match, null);		
		return pattern;
	}
	
	private CompletePattern generateMatchInvalidOptionDiffrent4Exception(boolean invert)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern pattern = factory.createCompletePattern();
		pattern.getGraph().getNodes().get(0).addOutgoing().getTarget().addPrimitiveMatch("");
		Match match = ((Match) pattern.getGraph().getOperatorList().getOperators().get(0));
		match.getOption().setValue(invert);
		
		pattern.createNeo4jAdaption();
		NeoElementNode neoNode = (NeoElementNode) pattern.getGraph().getNodes().get(0);
		neoNode.setNeoPlace(NeoPlace.BEGINNING);
		neoNode.addNeoLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) pattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("summary");
		
		match = (Match) pattern.getGraph().getOperatorList().getOperators().get(0);
				    
	    Field primitiveNode = match.getClass().getDeclaredField("primitiveNode");
	    primitiveNode.setAccessible(true);
	    primitiveNode.set(match, null);
		
		return pattern;
	}
	
	
    @Override
	public void generalizedInvalidtyExceptionTests()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		ArrayList<CompletePattern> completePatternsExceptions = new ArrayList<CompletePattern>();
		buildInvalidityExceptionPatterns(completePatternsExceptions);
		if (completePatternsExceptions.size() != 0) {
			System.out.println("");
			System.out.println(CypherTranslation.BEGIN_BUILD_PATTERN_EXCEPTIONS);		
			exceptionTestHandler(completePatternsExceptions);
			System.out.println(CypherTranslation.END_BUILD_PATTERN_EXCEPTIONS);
			System.out.println("");
		}
	}
    
    //FACTORY-METHODS
	private static void makeConcrete(CompletePattern pattern)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		pattern.createNeo4jAdaption();
		NeoElementNode neoNode = (NeoElementNode) pattern.getGraph().getNodes().get(0);
		neoNode.setNeoPlace(NeoPlace.BEGINNING);
		neoNode.addNeoLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) pattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("summary");
	}

	@Override
	public void buildToComplexQueryPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildUnsupportedException(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildOtherException(ArrayList<CompletePattern> completePatternsExceptions) throws InvalidityException {
		// TODO Auto-generated method stub
		
	}
}
