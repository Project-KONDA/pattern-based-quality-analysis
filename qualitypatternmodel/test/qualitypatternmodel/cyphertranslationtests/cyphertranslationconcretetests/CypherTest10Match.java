package qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests;

import static qualitypatternmodel.xmltranslationtests.Test00.replace;

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
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

public class CypherTest10Match extends CypherTranslationAbstract {
//	https://neo4j.com/docs/cypher-manual/current/clauses/where/ --> Consider the diffrent regex expressions from here
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CypherTest10Match match = new CypherTest10Match();
		match.generalizedTests();         
		match.generalizedInvalidtyExceptionTests();
    }

	//REWORK the test here
	@Override
	public void buildInvalidityExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatternsExceptions.add(tryMatchInvalidOption(true));
		completePatternsExceptions.add(tryMatchInvalidOption(false));
		completePatternsExceptions.add(tryMatchInvalidOptionDiffrent(true));
		completePatternsExceptions.add(tryMatchInvalidOptionDiffrent3(true));
		
		//REWORK
		//completePatternsExceptions.add(tryMatchInvalidOptionDiffrent4(false));
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
    
	private static CompletePattern getPatternMatch(Boolean invert, String str) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern pattern = factory.createCompletePattern();
		pattern.getGraph().getNodes().get(0).addOutgoing().getTarget().addPrimitiveMatch(str);
		Match match = ((Match) pattern.getGraph().getOperatorList().getOperators().get(0));
		match.getOption().setValue(invert);
		
		makeConcrete(pattern);
		
		return pattern;
	}

	private static void makeConcrete(CompletePattern pattern)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		pattern.createNeo4jAdaption();
		NeoNode neoNode = (NeoNode) pattern.getGraph().getNodes().get(0);
		neoNode.setNodePlace(NeoPlace.BEGINNING);
		neoNode.addLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) pattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("summary");
	}
	
	//Exceptions 
	// --> "Match - invalid option"
	private static CompletePattern tryMatchInvalidOption(boolean invert)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern pattern = factory.createCompletePattern();
		pattern.getGraph().getNodes().get(0).addOutgoing().getTarget().addPrimitiveMatch("");
		Match match = ((Match) pattern.getGraph().getOperatorList().getOperators().get(0));
		match.getOption().setValue(invert);
		
		pattern.createNeo4jAdaption();
		NeoNode neoNode = (NeoNode) pattern.getGraph().getNodes().get(0);
		neoNode.setNodePlace(NeoPlace.BEGINNING);
		neoNode.addLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) pattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("summary");
		

		
		match = (Match) pattern.getGraph().getOperatorList().getOperators().get(0);
		
		try {
			Field option = match.getClass().getDeclaredField("option");
		    option.setAccessible(true);
		    option.set(match, null);
		    
		    Field regularExpression = match.getClass().getDeclaredField("regularExpression");
		    regularExpression.setAccessible(true);
		    regularExpression.set(match, null);
		    
		    Field primitiveNode = match.getClass().getDeclaredField("primitiveNode");
		    primitiveNode.setAccessible(true);
		    primitiveNode.set(match, null);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return pattern;
	}
	
	private static CompletePattern tryMatchInvalidOptionDiffrent(boolean invert)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern pattern = factory.createCompletePattern();
		pattern.getGraph().getNodes().get(0).addOutgoing().getTarget().addPrimitiveMatch("");
		Match match = ((Match) pattern.getGraph().getOperatorList().getOperators().get(0));
		match.getOption().setValue(invert);
		
		pattern.createNeo4jAdaption();
		NeoNode neoNode = (NeoNode) pattern.getGraph().getNodes().get(0);
		neoNode.setNodePlace(NeoPlace.BEGINNING);
		neoNode.addLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) pattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("summary");
		
		match = (Match) pattern.getGraph().getOperatorList().getOperators().get(0);
		
		try {
			TextLiteralParam t = new TextLiteralParamImpl();
		    Field value = t.getClass().getDeclaredField("value");
			value.setAccessible(true);
			value.set(t, null);
		    
		    Field regularExpression = match.getClass().getDeclaredField("regularExpression");
			regularExpression.setAccessible(true);
			regularExpression.set(match, t);
		 
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return pattern;
	}
	
	private static CompletePattern tryMatchInvalidOptionDiffrent3(boolean invert)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern pattern = factory.createCompletePattern();
		pattern.getGraph().getNodes().get(0).addOutgoing().getTarget().addPrimitiveMatch("");
		Match match = ((Match) pattern.getGraph().getOperatorList().getOperators().get(0));
		match.getOption().setValue(invert);
		
		pattern.createNeo4jAdaption();
		NeoNode neoNode = (NeoNode) pattern.getGraph().getNodes().get(0);
		neoNode.setNodePlace(NeoPlace.BEGINNING);
		neoNode.addLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) pattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("summary");
		
		match = (Match) pattern.getGraph().getOperatorList().getOperators().get(0);
		
		try {		    
		    Field regularExpression = match.getClass().getDeclaredField("regularExpression");
			regularExpression.setAccessible(true);
			regularExpression.set(match, null);
		 
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return pattern;
	}
	
	//Needs rework
	private static CompletePattern tryMatchInvalidOptionDiffrent4(boolean invert)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern pattern = factory.createCompletePattern();
		pattern.getGraph().getNodes().get(0).addOutgoing().getTarget().addPrimitiveMatch("");
		Match match = ((Match) pattern.getGraph().getOperatorList().getOperators().get(0));
		match.getOption().setValue(invert);
		
		pattern.createNeo4jAdaption();
		NeoNode neoNode = (NeoNode) pattern.getGraph().getNodes().get(0);
		neoNode.setNodePlace(NeoPlace.BEGINNING);
		neoNode.addLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) pattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("summary");
		
		match = (Match) pattern.getGraph().getOperatorList().getOperators().get(0);
				    
	    Field primitiveNode = match.getClass().getDeclaredField("primitiveNode");
	    primitiveNode.setAccessible(true);
	    primitiveNode.set(match, null);
		
		return pattern;
	}
	
	
	
	// --> If a ComplexNode NeoNode has a match
	private static void exceptionHandler(ArrayList<CompletePattern> completePatterns) {
		for (CompletePattern completePattern : completePatterns) {
			try {
				replace(completePattern);
				System.out.print("\n___TRANSLATION___");
				System.out.println(completePattern.generateCypher());
				System.out.println("No Exception has been triggered");
			} catch (Exception e) {
				System.out.println("-- Beginning of the Exceptions --");
				System.out.println(e.toString());
//				e.printStackTrace();
				try {
				  System.out.println(completePattern.myToString());
				} catch (Exception e2) {
					System.out.println(e2.toString());
					//e2.printStackTrace();
				}
				System.out.println("Test successful");
			}
		}
	}
}
