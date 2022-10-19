package qualitypatternmodel.cypherevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.evaluation.EvalMandStruc;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.xmltranslationtests.Test00;

public class Neo4JEvalMandStruc {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getMandStrucAbstract());
		completePatterns.add(getMandStrucRegestaPlace());
		completePatterns.add(getMandStrucEntryConnections());
		
		Neo4JQueryPrinter.queryPrinterSys(completePatterns);
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
