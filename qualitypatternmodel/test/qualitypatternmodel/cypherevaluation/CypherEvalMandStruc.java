package qualitypatternmodel.cypherevaluation;

import java.util.ArrayList;
import qualitypatternmodel.evaluation.EvalMandStruc;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;

public class CypherEvalMandStruc {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getMandStrucAbstract());
		completePatterns.add(getMandStrucRegestaPlace());
		completePatterns.add(getMandStrucEntryConnections());
		
		try {
			CypherQueryPrinter.queryPrinterSys(completePatterns);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static CompletePattern getMandStrucAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalMandStruc.getMandstrucGeneric();
		completePattern.createNeo4jAdaption();
		//Set the NeoBeginning in the Condition
		return completePattern;
	}
	
	public static CompletePattern getMandstruc3Abstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalMandStruc.getMandstruc3Generic();
		completePattern.createNeo4jAdaption();
		//Set the NeoBeginning in the Condition
		return completePattern;
	}
	
	public static CompletePattern getMandStrucRegestaPlace() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getMandStrucAbstract();
//		List<Parameter> params = completePattern.getParameterList().getParameters();


		return completePattern;
	}
	
	public static CompletePattern getMandstruc3CondAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalMandStruc.getMandstruc3CondGeneric();
		completePattern.createNeo4jAdaption();
		//Set the beginning
		return completePattern;
	}
	
	public static CompletePattern getMandStrucEntryConnections() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getMandstruc3Abstract();
//		List<Parameter> params = completePattern.getParameterList().getParameters();

		return completePattern;
	}
}
