import java.util.ArrayList;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.exceptions.*;

public class test01_axis {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		PatternstructurePackage.eINSTANCE.eClass();
//		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
//		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;

		ArrayList<Pattern> patterns = new ArrayList<Pattern>();
		patterns.add(test00.getBasePattern());
		patterns.add(getBasePattern_axis(Axis.PARENT));
		patterns.add(getBasePattern_axis(Axis.SELF));
		patterns.add(getBasePattern_axis(Axis.ANCESTOR));
		patterns.add(getBasePattern_axis(Axis.ANCESTOR_OR_SELF));
		patterns.add(getBasePattern_axis(Axis.DESCENDANT));
		patterns.add(getBasePattern_axis(Axis.DESCENDANT_OR_SELF));
		patterns.add(getBasePattern_axis(Axis.FOLLOWING));
		patterns.add(getBasePattern_axis(Axis.FOLLOWING_SIBLING));
		patterns.add(getBasePattern_axis(Axis.PRECEDING));
		patterns.add(getBasePattern_axis(Axis.PRECEDING_SIBLING));;
		
		// output
		for (Pattern pattern : patterns) {
			try {
				pattern.isValid(true);
				System.out.println("\n\n___PATTERN_(VALID)___");
				System.out.println(pattern.myToString());
				System.out.print("\n___TRANSLATION___");
				System.out.println(pattern.toXQuery());
			} catch (Exception e) {
				System.out.println("\nnot valid: " + e.getMessage());
			}
		}
	}

	public static Pattern getBasePattern_axis(Axis axis) {
		Pattern pattern = test00.getBasePattern();
		pattern.getReturnGraph().getRootElement().getNextSingle().get(0).getRelationFromPrevious().setAxis(axis);
		return pattern;
	}
	
}
