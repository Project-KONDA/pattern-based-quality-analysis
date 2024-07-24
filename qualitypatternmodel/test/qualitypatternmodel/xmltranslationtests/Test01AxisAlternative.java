package qualitypatternmodel.xmltranslationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.utility.PatternUtility;
import qualitypatternmodel.xmltestutility.PatternTestPair;

public class Test01AxisAlternative {

	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getAlternativeSimple());
		completePatterns.add(getAlternativeCondition());
		return completePatterns;
	}

    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternUtility.testPatterns(getPatterns());
	}

    public static CompletePattern getAlternativeSimple() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
    	CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
    	pattern.createXmlAdaption();
    	((XmlPathParam) pattern.getParameterList().getParameters().get(0)).setValueFromString("[\"/demo:data/demo:building\",\"/demo:data/demo:painting\"]");
    	return pattern;
    }

    public static CompletePattern getAlternativeCondition() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
    	CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
    	pattern.setCondition(PatternstructureFactory.eINSTANCE.createQuantifiedCondition());
    	pattern.getGraph().getNodes().get(0).addOutgoing(((QuantifiedCondition) pattern.getCondition()).getGraph());
    	pattern.createXmlAdaption();
    	((XmlPathParam) pattern.getParameterList().getParameters().get(0)).setValueFromString("[\"/demo:data/demo:building\",\"/demo:data/demo:painting\"]");
    	((XmlPathParam) pattern.getParameterList().getParameters().get(1)).setValueFromString("[\"/demo:name\",\"/demo:title\"]");
//    	XmlElementNavigation nav = (XmlElementNavigation) pattern.getGraph().getRelations().get(0);
//    	((XmlElementNavigation) pattern.getGraph().getRelations().get(0)).getXmlPathParam().setValueFromString("[\"/lido:lido\",\"/lido:lido2\"]");
//    	((XmlElementNavigation) pattern.getGraph().getRelations().get(1)).getXmlPathParam().setValueFromString("[\"/lido:lido\",\"/lido:lido2\"]");
    	return pattern;
    }

	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		testPairs.add(new PatternTestPair("01aa", "A1", getAlternativeSimple(), "declare namespace demo = \"demo\"; /demo:data/demo:building | /demo:data/demo:painting"));
		String a1 = "declare namespace demo = \"demo\"; (/demo:data/demo:building|/demo:data/demo:painting)[./demo:name|./demo:title]";
		testPairs.add(new PatternTestPair("01aa", "A2", getAlternativeCondition(), a1));
		return testPairs;
	}

}
