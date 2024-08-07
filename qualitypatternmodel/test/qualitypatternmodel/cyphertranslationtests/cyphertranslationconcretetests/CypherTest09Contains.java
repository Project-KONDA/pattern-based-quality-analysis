package qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import qualitypatternmodel.adaptionneo4j.NeoPropertyEdge;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
import qualitypatternmodel.cyphertranslationtests.CypherTranslation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.operators.Contains;
import qualitypatternmodel.operators.impl.ContainsImpl;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

public class CypherTest09Contains extends CypherTranslation {

	private final static String LINK = "http://opac.regesta-imperii.de/lang_de/kurztitelsuche_r.php?kurztitel=gudenus,_cod._dipl.";

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CypherTest09Contains contains = new CypherTest09Contains();
		try {
			contains.tester();
			contains.invalidtyExceptionTester();
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
    }

	@Override
	public void buildPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatterns.add(getPatternContains(true, CypherTest09Contains.LINK));
        completePatterns.add(getPatternContains(false, CypherTest09Contains.LINK));

        final Map<String, String> propertyNamesAndValues = createPropertyNameAndValueMap();
        completePatterns.add(getMultipleContains(true, propertyNamesAndValues));
        completePatterns.add(getMultipleContains(false, propertyNamesAndValues));
	}

	@Override
	public void buildInvalidityExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		completePatternsExceptions.add(generateOptionIsNullException());
		completePatternsExceptions.add(generateContentIsNullException());
		completePatternsExceptions.add(generateContentValueIsNullException());
		completePatternsExceptions.add(generatePrimitiveNodeIsNullException());
	}

    private void makeConcrete(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
    	completePattern.createNeo4jAdaption();

		NeoPropertyEdge npe = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam nppp = npe.getNeoPropertyPathParam();
		nppp.setNeoPropertyName("archivalHistory");
    }

    private CompletePattern getPatternContains(Boolean invert, String str) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;

		CompletePattern pattern = factory.createCompletePattern();
		pattern.getGraph().getNodes().get(0).addOutgoing().getTarget().addPrimitiveContains(str);
		Contains contains = ((Contains) pattern.getGraph().getOperatorList().getOperators().get(0));
		contains.getOption().setValue(invert);

		makeConcrete(pattern);

		return pattern;
	}

    private CompletePattern getMultipleContains(Boolean invert, final Map<String, String> propertyNameAndValue) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
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

    private void makeConcreteMult(CompletePattern completePattern, final Map<String, String> propertyNameAndValue) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
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

    private final Map<String, String> createPropertyNameAndValueMap() {
    	Map<String, String> map = new HashMap<String, String>();
    	map.put("bandpk", "13000000");
    	map.put("exchangeIdentifier", "20_000001_000001_013_0");
    	map.put("identifier", "hmel n. ");
    	map.put("summary", "Churfürsten (Dietrich von Mainz, Dietrich");
    	map.put("title", "Friedrich");

    	map = Collections.unmodifiableMap(map);
    	return map;
    }

	//Exceptions

    private CompletePattern generateOptionIsNullException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
    	CompletePattern completePattern = getPatternContains(true, CypherTest09Contains.LINK);
    	Contains contains = (Contains) completePattern.getGraph().getAllOperators().get(0);
    	contains.setOption(null);
    	return completePattern;
    }

    private CompletePattern generateContentIsNullException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
    	CompletePattern completePattern = getPatternContains(true, CypherTest09Contains.LINK);
    	Contains contains = (Contains) completePattern.getGraph().getAllOperators().get(0);
    	contains.setContent(null);
    	return completePattern;
    }

    private CompletePattern generateContentValueIsNullException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
    	CompletePattern completePattern = getPatternContains(true, CypherTest09Contains.LINK);
    	Contains contains = (Contains) completePattern.getGraph().getAllOperators().get(0);
    	TextLiteralParam tp = new TextLiteralParamImpl();
    	contains.setContent(tp);
    	return completePattern;
    }

    private CompletePattern generatePrimitiveNodeIsNullException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
    	CompletePattern completePattern = getPatternContains(true, CypherTest09Contains.LINK);
    	Contains contains = (Contains) completePattern.getGraph().getAllOperators().get(0);
    	Class<ContainsImpl> c = ContainsImpl.class;

    	Field f = c.getDeclaredField("primitiveNode");
    	f.setAccessible(true);
    	f.set(contains, null);
    	f.setAccessible(false);

    	return completePattern;
    }

    @Override
	public void invalidtyExceptionTester()
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

	@Override
	public void buildTooComplexQueryPatterns(ArrayList<CompletePattern> completePatterns)
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
