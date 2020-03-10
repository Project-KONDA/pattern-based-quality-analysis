import java.util.ArrayList;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.exceptions.*;

//import qualitypatternmodel.patternstructure.*;
//import qualitypatternmodel.patternstructure.impl.*;
//import qualitypatternmodel.graphstructure.*;
//import qualitypatternmodel.graphstructure.impl.*;
//import qualitypatternmodel.functions.*;
//import qualitypatternmodel.functions.impl.*;
//import qualitypatternmodel.inputfields.*;
//import qualitypatternmodel.inputfields.impl.*;
//import qualitypatternmodel.exceptions.*;

public class test00 {
	
	public static void test(ArrayList<Pattern> patterns) {

		// output
		for (Pattern pattern : patterns) {
			try {
				pattern.isValid(true);
				System.out.println("\n\n___PATTERN_(VALID)___");
				System.out.println(pattern.myToString());
				System.out.print("\n___TRANSLATION___");
				System.out.println(pattern.toXQuery());
			} catch (Exception e) {
				e.printStackTrace();
				try {
				  System.out.println(pattern.myToString());
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
			}
		}
	}
	

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
	}


	public static Pattern getBasePattern() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;

		// PATTERN
		Pattern pattern = factory.createPattern();
		pattern.setName("MyPattern");
//		VariableList varlist = pattern.getVariableList();

		// RETURN GRAPH
//		Graph return_graph = pattern.getReturnGraph();
//		SingleElement return_root = return_graph.getRootElement();
//		OperatorList return_opList = return_graph.getOperatorList();
//		SingleElement return_return = return_root.getNextSingle().get(0);
		
		// FIRST CONDITION
		Condition truecondition = factory.createTrue();
		pattern.setCondition(truecondition);
		
		return pattern;
	}
}
