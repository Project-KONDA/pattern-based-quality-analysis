package qualitypatternmodel.cyphertranslationtests;

import java.util.ArrayList;

import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.Contains;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

public class CypherTest09Contains {
    private final static String LINK = "http://opac.regesta-imperii.de/lang_de/kurztitelsuche_r.php?kurztitel=gudenus,_cod._dipl.";
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
        //Tests
        System.out.println("");
        System.out.println("<<< BEGIN - Tests >>>");
        ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
        completePatterns.add(getPatternContains(true, CypherTest09Contains.LINK));
        completePatterns.add(getPatternContains(false, CypherTest09Contains.LINK));
        //Call tester from CypherTest00
        CypherTest00.test(completePatterns);
        System.out.println("<<< END - Tests >>>");
        System.out.println("");         
        
        //INTRODUCE THE EXCEPTION TESTS ??? 
    }
    
    private static void makeConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
    	completePattern.createNeo4jAdaption();
    	
		NeoPropertyEdge npe = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam nppp = npe.getNeoPropertyPathParam();
		nppp.setNeoPropertyName("archivalHistory");
    }
    
	public static CompletePattern getPatternContains(Boolean invert, String str) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern pattern = factory.createCompletePattern();
		pattern.getGraph().getNodes().get(0).addOutgoing().getTarget().addPrimitiveContains(str);
		Contains contains = ((Contains) pattern.getGraph().getOperatorList().getOperators().get(0));
		contains.getOption().setValue(invert);
		
		makeConcrete(pattern);
		
		return pattern;
	}
	
	//ComplexEdge testing
	
	//Exceptions
	//--> NeoNode has a contains --> The rdf test is a good tamplate --> Even it works in Neo4J it makes no sense
	//--> NeoPropertyPathParam has no PropertyName
	//--> "invalid option"
}
