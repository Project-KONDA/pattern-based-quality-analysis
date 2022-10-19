package qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests;

import java.util.ArrayList;

import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.cyphertranslationtests.CypherTranslationAbstract;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.operators.NullCheck;
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
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
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
		neoNode.setNodePlace(NeoPlace.BEGINNING);
		neoNode.addLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) pattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("summary");
	}
	
	//Exceptions
}
