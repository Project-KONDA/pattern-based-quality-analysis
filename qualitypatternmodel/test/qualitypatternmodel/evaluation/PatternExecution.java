package qualitypatternmodel.evaluation;

import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.CreateDB;
import org.basex.core.cmd.XQuery;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.testutilityclasses.EMFModelLoad;
import qualitypatternmodel.testutilityclasses.EMFValidationPreparation;

public class PatternExecution {
	public static void main(String[] args) {
		

	}

	static void execute(CompletePattern pattern, String dataPath) {        
        try {
			pattern.isValid(AbstractionLevel.CONCRETE);
		} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		try {
			String query = pattern.generateQuery();
			Context context = new Context();				
			new CreateDB("DBExample", dataPath).execute(context);
			XQuery xquery = new XQuery(query);
			String result = xquery.execute(context);
			System.out.println(result);
		} catch (BaseXException | InvalidityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
