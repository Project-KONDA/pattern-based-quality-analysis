package qualitypatternmodel.cyphertranslationtests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.operators.Contains;
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
        buildPatterns(completePatterns);
        //Call tester from CypherTest00
        CypherTest00.test(completePatterns);
        System.out.println("<<< END - Tests >>>");
        System.out.println("");         
        
        //INTRODUCE THE EXCEPTION TESTS 
    }

	public static void buildPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatterns.add(getPatternContains(true, CypherTest09Contains.LINK));
        completePatterns.add(getPatternContains(false, CypherTest09Contains.LINK));
        
        final Map<String, String> propertyNamesAndValues = createPropertyNameAndValueMap();
        completePatterns.add(getMultipleContains(true, propertyNamesAndValues));
        completePatterns.add(getMultipleContains(false, propertyNamesAndValues));
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
	
	public static CompletePattern getMultipleContains(Boolean invert, final Map<String, String> propertyNameAndValue) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		CompletePattern pattern = factory.createCompletePattern();
		
		Contains contains;
		int i = 0;
		
		for (Entry<String, String> entry : propertyNameAndValue.entrySet()) {
			pattern.getGraph().getNodes().get(0).addOutgoing().getTarget().addPrimitiveContains(entry.getValue());
			contains = ((Contains) pattern.getGraph().getOperatorList().getOperators().get(i));
			contains.getOption().setValue(invert);
			i++;
		}
		
		makeConcreteMult(pattern, propertyNameAndValue);
		
		return pattern;
	}
	
    private static void makeConcreteMult(CompletePattern completePattern, final Map<String, String> propertyNameAndValue) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
    	completePattern.createNeo4jAdaption();
    	
		NeoPropertyEdge npe;
		NeoPropertyPathParam nppp;
		int i = 0;
		
		for (Entry<String, String> entry : propertyNameAndValue.entrySet()) {
			npe = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(i);
			nppp = npe.getNeoPropertyPathParam();
			nppp.setNeoPropertyName(entry.getKey());
			i++;
		}		
    }
    
    private static final Map<String, String> createPropertyNameAndValueMap() {
    	Map<String, String> map = new HashMap<String, String>();
    	map.put("bandpk", "13000000");
    	map.put("exchangeIdentifier", "20_000001_000001_013_0");
    	map.put("identifier", "hmel n. ");
    	map.put("summary", "Churfürsten (Dietrich von Mainz, Dietrich");
    	map.put("title", "Friedrich");
    	
    	map = Collections.unmodifiableMap(map);
    	return map;
    }
	
	//ComplexEdge testing
	
	//Exceptions
	//--> NeoNode has a contains --> The rdf test is a good tamplate --> Even it works in Neo4J it makes no sense
	//--> NeoPropertyPathParam has no PropertyName
	//--> "invalid option" 
}
