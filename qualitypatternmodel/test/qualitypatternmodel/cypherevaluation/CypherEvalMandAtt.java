package qualitypatternmodel.cypherevaluation;

import java.util.ArrayList;

import qualitypatternmodel.evaluation.EvalMandAtt;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;

public class CypherEvalMandAtt {
	
	// also called MAND
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getMandattNeo4JAbstract());
		//completePatterns.add(getMandattMidasAps()); //Create a fitting Pattern for this 
		completePatterns.add(getMandatt3Neo4JAbstract());
		//completePatterns.add(getMandattMidasAps()); //Create a fitting Pattern for this --> In regard to Mandatt3
		
		try {
			CypherQueryPrinter.queryPrinterSys(completePatterns);
		} catch (Exception e) {
			System.out.println(e);
		}		
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
