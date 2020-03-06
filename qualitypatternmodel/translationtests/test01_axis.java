

import java.util.ArrayList;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.patternstructure.impl.*;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.graphstructure.impl.*;
import qualitypatternmodel.functions.*;
import qualitypatternmodel.functions.impl.*;
import qualitypatternmodel.inputfields.*;
import qualitypatternmodel.inputfields.impl.*;

public class test01_axis {

	public static void main(String[] args) {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;

		ArrayList<Pattern> patterns = new ArrayList<Pattern>();
		patterns.add(getBasePattern(factory));
		patterns.add(getBasePattern_axis(factory, Axis.PARENT));
		patterns.add(getBasePattern_axis(factory, Axis.SELF));
		patterns.add(getBasePattern_axis(factory, Axis.ANCESTOR));
		patterns.add(getBasePattern_axis(factory, Axis.ANCESTOR_OR_SELF));
		patterns.add(getBasePattern_axis(factory, Axis.DESCENDANT));
		patterns.add(getBasePattern_axis(factory, Axis.DESCENDANT_OR_SELF));
		patterns.add(getBasePattern_axis(factory, Axis.FOLLOWING));
		patterns.add(getBasePattern_axis(factory, Axis.FOLLOWING_SIBLING));
		patterns.add(getBasePattern_axis(factory, Axis.PRECEDING));
		patterns.add(getBasePattern_axis(factory, Axis.PRECEDING_SIBLING));;
		
		// output
		for (Pattern pattern : patterns) {
			try {
				pattern.isValid(true);
				System.out.println();
				System.out.println("valid");
				System.out.print(pattern);
				System.out.println(pattern.toXQuery());
			} catch (Exception e) {
				System.out.println("\nnot valid: " + e.getMessage());
			}
		}
	}

	public static Pattern getBasePattern(PatternstructureFactory factory) {

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

	public static Pattern getBasePattern_axis(PatternstructureFactory factory, Axis axis) {
		Pattern pattern = getBasePattern(factory);
		pattern.getReturnGraph().getRootElement().getNextSingle().get(0).getRelationFromPrevious().setAxis(axis);
		return pattern;
	}
	
}
