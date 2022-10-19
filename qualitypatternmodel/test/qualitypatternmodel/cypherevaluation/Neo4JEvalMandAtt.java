package qualitypatternmodel.cypherevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.evaluation.EvalMandAtt;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.xmltranslationtests.Test00;

public class Neo4JEvalMandAtt {
	
	// also called MAND
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getMandattNeo4JAbstract());
		//completePatterns.add(getMandattMidasAps()); //Create a fitting Pattern for this 
		completePatterns.add(getMandatt3Neo4JAbstract());
		//completePatterns.add(getMandattMidasAps()); //Create a fitting Pattern for this --> In regard to Mandatt3
		
		Neo4JQueryPrinter.queryPrinterSys(completePatterns);		
	}
	
	public static CompletePattern getMandattNeo4JAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalMandAtt.getMandattGeneric();
		completePattern.createNeo4jAdaption();
		//Add maybe the BEGINNING for a condition
		return completePattern;
	}
	
	public static CompletePattern getMandatt3Neo4JAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		CompletePattern completePattern = EvalMandAtt.getMandatt3Generic();
		completePattern.createXmlAdaption();
		return completePattern;		
	}
		
	public static CompletePattern getMandattCondAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalMandAtt.getMandattCondGeneric();
		completePattern.createXmlAdaption();
		return completePattern;
	}

	public static CompletePattern getMandatt3CondAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		CompletePattern completePattern = EvalMandAtt.getMandatt3CondGeneric();
		completePattern.createXmlAdaption();
		return completePattern;		
	}	
}
