package constrainttranslationtests;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.impl.NumberElementImpl;
import qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl;
import qualitypatternmodel.constrainttranslation.ConstraintTranslation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.impl.BooleanParamImpl;
import qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl;
import qualitypatternmodel.parameters.impl.NumberParamImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.parameters.impl.TypeOptionParamImpl;
import qualitypatternmodel.parameters.impl.UntypedParameterValueImpl;

public class ConstraintTranslationTests {
	
	static String RECORD_PATH = "/descendant::*";
	static String FIELD_PATH = "/descendant::*";
	static String OTHERFIELD_PATH = "/descendant::*";
	

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		EList<CompletePattern> patterns = getTestPatternCollection();
		
		int valid = 0;
		int invalid = 0;
		
		for (CompletePattern c: patterns) {
			try {
				System.out.println("____ " + c.getDescription() + " _____");
				System.out.println((String) ConstraintTranslation.translateToConstraint(c, false));
				System.out.println();
				valid += 1;
			} catch (Exception e) {
				e.printStackTrace();
				invalid += 1;
			}
		}
		
		System.out.println( "out of " + (valid+invalid) + " testpatterns " + valid + " were valid and " + invalid + " were invalid");
		
		// TODO Auto-generated method stub

	}
	
	public static EList<CompletePattern> getTestPatternCollection() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		EList<CompletePattern> patterns = new BasicEList<CompletePattern>();

		patterns.add(simpleMatchPattern(false));
		patterns.add(simpleMatchPattern(true));
		patterns.add(simpleStringLengthPattern(ComparisonOperator.EQUAL));
		patterns.add(simpleStringLengthPattern(ComparisonOperator.GREATER));
		patterns.add(simpleValueComparisonPattern(false));
		patterns.add(simpleValueComparisonPattern(true));
		patterns.add(notConditionPattern());
		patterns.add(doubleNotConditionPattern());
		patterns.add(formulaCombinationPattern(LogicalOperator.AND));
		patterns.add(formulaCombinationPattern(LogicalOperator.IMPLIES));
		patterns.add(formulaNotCombinationPattern());
		patterns.add(notComparisonPattern());
		patterns.add(simpleComparisonPattern(ComparisonOperator.EQUAL));
		patterns.add(simpleComparisonPattern(ComparisonOperator.GREATEROREQUAL));
		patterns.add(simpleComparisonPattern(ComparisonOperator.LESSOREQUAL));
		patterns.add(doubleComparisonPattern());
		patterns.add(conditionCombinationPattern());
		patterns.add(uniqueness1_1nPattern());
		patterns.add(uniqueness1_2nPattern());
		patterns.add(uniqueness2_1nPattern());
		patterns.add(uniqueness2_2nPattern());
		patterns.add(uniqueness3_1nPattern());
		patterns.add(uniqueness3_2nPattern());
		
		return patterns;
	}
	
	
	public static CompletePattern simpleMatchPattern(Boolean negate) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setDescription("Simple Match, negated:" + negate);
		QuantifiedCondition cond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(cond);
		Graph g = cond.getGraph();
		
		Node ret = completePattern.getGraph().getNodes().get(0);
		
		// EXISTS additional graph structure
		Node n2 = ret.addOutgoing(g).getTarget();
		
		n2.addPrimitiveMatch();
		
		completePattern.createXmlAdaption();
		
		EList<Parameter> params = completePattern.getParameterList().getParameters();
//		for (Parameter p: params)
//			System.out.println(p.getClass().getSimpleName() + " p" + params.indexOf(p) + " = (" + p.getClass().getSimpleName()+ ") params.get(" + params.indexOf(p) + ");" );
		
		BooleanParamImpl p0 = (BooleanParamImpl) params.get(0);
		TextLiteralParamImpl p1 = (TextLiteralParamImpl) params.get(1);
		XmlPathParamImpl p2 = (XmlPathParamImpl) params.get(2);
		XmlPathParamImpl p3 = (XmlPathParamImpl) params.get(3);
		
		p0.setValue(negate); // negate match?
		p1.setValue(".*"); // regex pattern
		p2.setValueFromString(RECORD_PATH); // path to record
		p3.setValueFromString(FIELD_PATH); // path record to field
		
		return completePattern;
	}
	
	public static CompletePattern simpleStringLengthPattern(ComparisonOperator co) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setDescription("Simple String Length: Comparison " + co + " 3");
		QuantifiedCondition cond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(cond);
		Graph g = cond.getGraph();
		
		Node ret = completePattern.getGraph().getNodes().get(0);
		
		// EXISTS additional graph structure
		Node n2 = ret.addOutgoing(g).getTarget();
		
		n2.addPrimitiveStringLength();
		
		completePattern.createXmlAdaption();
		
		EList<Parameter> params = completePattern.getParameterList().getParameters();
//		for (Parameter p: params)
//			System.out.println(p.getClass().getSimpleName() + " p" + params.indexOf(p) + " = (" + p.getClass().getSimpleName()+ ") params.get(" + params.indexOf(p) + ");" );
		
		ComparisonOptionParamImpl p0 = (ComparisonOptionParamImpl) params.get(0);
		NumberParamImpl p1 = (NumberParamImpl) params.get(1);
		XmlPathParamImpl p2 = (XmlPathParamImpl) params.get(2);
		XmlPathParamImpl p3 = (XmlPathParamImpl) params.get(3);
		
		p0.setValue(co); // Comparison Operator
		p1.setValue(3.); // Number
		p2.setValueFromString(RECORD_PATH); // path to record
		p3.setValueFromString(FIELD_PATH); // path record to field
		
		return completePattern;
	}
	
	public static CompletePattern simpleValueComparisonPattern(Boolean negate) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setDescription("Simple Value Comparison " + (negate? "notequal":"equal") + " to \"value\"");
		QuantifiedCondition cond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(cond);
		Graph g = cond.getGraph();
		
		Node ret = completePattern.getGraph().getNodes().get(0);
		
		// EXISTS additional graph structure
		Node n2 = ret.addOutgoing(g).getTarget();
		
		n2.addPrimitiveComparison();
		
		completePattern.createXmlAdaption();
		
		EList<Parameter> params = completePattern.getParameterList().getParameters();
//		for (Parameter p: params)
//			System.out.println(p.getClass().getSimpleName() + " p" + params.indexOf(p) + " = (" + p.getClass().getSimpleName()+ ") params.get(" + params.indexOf(p) + ");" );
		
		UntypedParameterValueImpl p0 = (UntypedParameterValueImpl) params.get(0);
		ComparisonOptionParamImpl p1 = (ComparisonOptionParamImpl) params.get(1);
		TypeOptionParamImpl p2 = (TypeOptionParamImpl) params.get(2);
		XmlPathParamImpl p3 = (XmlPathParamImpl) params.get(3);
		XmlPathParamImpl p4 = (XmlPathParamImpl) params.get(4);
		
		p0.setValue("value"); // Comparison Value
		if (negate)
			p1.setValue(ComparisonOperator.NOTEQUAL);
		else 
			p1.setValue(ComparisonOperator.EQUAL);
		p2.setValue(ReturnType.STRING);
		p3.setValueFromString(RECORD_PATH); // path to record
		p4.setValueFromString(FIELD_PATH); // path record to field
		
		return completePattern;
	}

	public static CompletePattern simpleComparisonPattern(ComparisonOperator co) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setDescription("Simple Node Comparison: "+ co);
		QuantifiedCondition cond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(cond);
		Graph g = cond.getGraph();
		
		Node ret = completePattern.getGraph().getNodes().get(0).makeComplex();
		
		// EXISTS additional graph structure
		Node n2 = ret.addOutgoing(g).getTarget().makePrimitive();
		Node n3 = ret.addOutgoing(g).getTarget().makePrimitive();
		
		n2.addComparison(n3);
		
		completePattern.createXmlAdaption();
		
		EList<Parameter> params = completePattern.getParameterList().getParameters();
//		for (Parameter p: params)
//			System.out.println(p.getClass().getSimpleName() + " p" + params.indexOf(p) + " = (" + p.getClass().getSimpleName()+ ") params.get(" + params.indexOf(p) + ");" );
		
		ComparisonOptionParamImpl p0 = (ComparisonOptionParamImpl) params.get(0);
		TypeOptionParamImpl p1 = (TypeOptionParamImpl) params.get(1);
		XmlPathParamImpl p2 = (XmlPathParamImpl) params.get(2);
		XmlPathParamImpl p3 = (XmlPathParamImpl) params.get(3);
		XmlPathParamImpl p4 = (XmlPathParamImpl) params.get(4);
		
		p0.setValue(co);
		p1.setValue(ReturnType.STRING);
		p2.setValueFromString(RECORD_PATH);
		p3.setValueFromString(FIELD_PATH);
		p4.setValueFromString(OTHERFIELD_PATH);
		
		return completePattern;
	}

	public static CompletePattern conditionCombinationPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setDescription("Match-Contains-Comparison:");
		QuantifiedCondition cond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(cond);
		Graph g = cond.getGraph();
		
		Node ret = completePattern.getGraph().getNodes().get(0);
		
		// EXISTS additional graph structure
		Node n2 = ret.addOutgoing(g).getTarget().makePrimitive();
		
		n2.addPrimitiveMatch();
		n2.addPrimitiveContains();
		n2.addPrimitiveComparison();
		
		completePattern.createXmlAdaption();
		
		EList<Parameter> params = completePattern.getParameterList().getParameters();
//		for (Parameter p: params)
//			System.out.println(p.getClass().getSimpleName() + " p" + params.indexOf(p) + " = (" + p.getClass().getSimpleName()+ ") params.get(" + params.indexOf(p) + ");" );
		
		BooleanParamImpl p0 = (BooleanParamImpl) params.get(0);
		TextLiteralParamImpl p1 = (TextLiteralParamImpl) params.get(1);
		BooleanParamImpl p2 = (BooleanParamImpl) params.get(2);
		TextLiteralParamImpl p3 = (TextLiteralParamImpl) params.get(3);
		UntypedParameterValueImpl p4 = (UntypedParameterValueImpl) params.get(4);
		ComparisonOptionParamImpl p5 = (ComparisonOptionParamImpl) params.get(5);
		TypeOptionParamImpl p6 = (TypeOptionParamImpl) params.get(6);
		XmlPathParamImpl p7 = (XmlPathParamImpl) params.get(7);
		XmlPathParamImpl p8 = (XmlPathParamImpl) params.get(8);
		
		p0.setValue(false); // negate match?
		p1.setValue(".*"); // regex pattern
		p2.setValue(false);
		p3.setValue("part\"string");
		p4.setValue("anything");
		p5.setValue(ComparisonOperator.EQUAL);
		p6.setValue(ReturnType.STRING);
		p7.setValueFromString(RECORD_PATH); // path to record
		p8.setValueFromString(FIELD_PATH); // path record to field
		
		return completePattern;
	}

	public static CompletePattern doubleComparisonPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setDescription("Double Node Comparison: n2 = n3 & n2 = n4");
		QuantifiedCondition cond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(cond);
		Graph g = cond.getGraph();
		
		Node ret = completePattern.getGraph().getNodes().get(0).makeComplex();
		
		// EXISTS additional graph structure
		Node n2 = ret.addOutgoing(g).getTarget().makePrimitive();
		Node n3 = ret.addOutgoing(g).getTarget().makePrimitive();
		Node n4 = ret.addOutgoing(g).getTarget().makePrimitive();

		n2.addComparison(n3);
		n2.addComparison(n4);
		
		completePattern.createXmlAdaption();
		
		EList<Parameter> params = completePattern.getParameterList().getParameters();
//		for (Parameter p: params)
//			System.out.println(p.getClass().getSimpleName() + " p" + params.indexOf(p) + " = (" + p.getClass().getSimpleName()+ ") params.get(" + params.indexOf(p) + ");" );
		
		ComparisonOptionParamImpl p0 = (ComparisonOptionParamImpl) params.get(0);
		TypeOptionParamImpl p1 = (TypeOptionParamImpl) params.get(1);
		ComparisonOptionParamImpl p2 = (ComparisonOptionParamImpl) params.get(2);
		TypeOptionParamImpl p3 = (TypeOptionParamImpl) params.get(3);
		XmlPathParamImpl p4 = (XmlPathParamImpl) params.get(4);
		XmlPathParamImpl p5 = (XmlPathParamImpl) params.get(5);
		XmlPathParamImpl p6 = (XmlPathParamImpl) params.get(6);
		XmlPathParamImpl p7 = (XmlPathParamImpl) params.get(7);

		p0.setValue(ComparisonOperator.EQUAL);
		p1.setValue(ReturnType.STRING);
		p2.setValue(ComparisonOperator.EQUAL);
		p3.setValue(ReturnType.STRING);
		p4.setValueFromString(RECORD_PATH); // path to record
		p5.setValueFromString(FIELD_PATH); // path record to field
		p6.setValueFromString(OTHERFIELD_PATH); // path record to other field
		p7.setValueFromString(OTHERFIELD_PATH); // path record to other field
		
		return completePattern;
	}

	public static CompletePattern notConditionPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setDescription("Not Condition: not(match)");
		NotCondition not = PatternstructureFactory.eINSTANCE.createNotCondition();
		QuantifiedCondition cond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(not);
		not.setCondition(cond);
		Graph g = cond.getGraph();
		
		Node ret = completePattern.getGraph().getNodes().get(0);
		
		Node n2 = ret.addOutgoing(g).getTarget();
		
		n2.addPrimitiveMatch();
		
		completePattern.createXmlAdaption();
		
		EList<Parameter> params = completePattern.getParameterList().getParameters();
//		for (Parameter p: params)
//			System.out.println(p.getClass().getSimpleName() + " p" + params.indexOf(p) + " = (" + p.getClass().getSimpleName()+ ") params.get(" + params.indexOf(p) + ");" );
		
		BooleanParamImpl p0 = (BooleanParamImpl) params.get(0);
		TextLiteralParamImpl p1 = (TextLiteralParamImpl) params.get(1);
		XmlPathParamImpl p2 = (XmlPathParamImpl) params.get(2);
		XmlPathParamImpl p3 = (XmlPathParamImpl) params.get(3);
		
		p0.setValue(false); // negate match?
		p1.setValue(".*"); // regex pattern
		p2.setValueFromString(RECORD_PATH); // path to record
		p3.setValueFromString(FIELD_PATH); // path record to field
		
		return completePattern;
	}

	public static CompletePattern doubleNotConditionPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setDescription("DoubleNotCondition: not(not(match))");
		NotCondition not1 = PatternstructureFactory.eINSTANCE.createNotCondition();
		NotCondition not2 = PatternstructureFactory.eINSTANCE.createNotCondition();
		QuantifiedCondition cond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(not1);
		not1.setCondition(not2);
		not2.setCondition(cond);
		Graph g = cond.getGraph();
		
		Node ret = completePattern.getGraph().getNodes().get(0);
		
		Node n2 = ret.addOutgoing(g).getTarget();
		
		n2.addPrimitiveMatch();
		
		completePattern.createXmlAdaption();
		
		EList<Parameter> params = completePattern.getParameterList().getParameters();
//		for (Parameter p: params)
//			System.out.println(p.getClass().getSimpleName() + " p" + params.indexOf(p) + " = (" + p.getClass().getSimpleName()+ ") params.get(" + params.indexOf(p) + ");" );
		
		BooleanParamImpl p0 = (BooleanParamImpl) params.get(0);
		TextLiteralParamImpl p1 = (TextLiteralParamImpl) params.get(1);
		XmlPathParamImpl p2 = (XmlPathParamImpl) params.get(2);
		XmlPathParamImpl p3 = (XmlPathParamImpl) params.get(3);
		
		p0.setValue(false); // negate match?
		p1.setValue(".*"); // regex pattern
		p2.setValueFromString(RECORD_PATH); // path to record
		p3.setValueFromString(FIELD_PATH); // path record to field
		
		return completePattern;
	}
	
	public static CompletePattern notComparisonPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setDescription("Not StringLength: not ( len =3 ) ");
		NotCondition not = PatternstructureFactory.eINSTANCE.createNotCondition();
		QuantifiedCondition cond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(not);
		not.setCondition(cond);
		Graph g = cond.getGraph();
		
		Node ret = completePattern.getGraph().getNodes().get(0);
		
		Node n2 = ret.addOutgoing(g).getTarget();
		
		n2.addPrimitiveStringLength();
		
		completePattern.createXmlAdaption();
		
		EList<Parameter> params = completePattern.getParameterList().getParameters();
//		for (Parameter p: params)
//			System.out.println(p.getClass().getSimpleName() + " p" + params.indexOf(p) + " = (" + p.getClass().getSimpleName()+ ") params.get(" + params.indexOf(p) + ");" );
		
		ComparisonOptionParamImpl p0 = (ComparisonOptionParamImpl) params.get(0);
		NumberParamImpl p1 = (NumberParamImpl) params.get(1);
		XmlPathParamImpl p2 = (XmlPathParamImpl) params.get(2);
		XmlPathParamImpl p3 = (XmlPathParamImpl) params.get(3);
		
		p0.setValue(ComparisonOperator.EQUAL); // Comparison Operator
		p1.setValue(3.); // Number
		p2.setValueFromString(RECORD_PATH); // path to record
		p3.setValueFromString(FIELD_PATH); // path record to field
		
		return completePattern;
	}
	

	public static CompletePattern formulaCombinationPattern(LogicalOperator logic) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setDescription("Formula: = 1 " + logic + " = 2");
		Formula formula = PatternstructureFactory.eINSTANCE.createFormula();
		QuantifiedCondition cond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		QuantifiedCondition cond2 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(formula);
		formula.setCondition1(cond);
		formula.setCondition2(cond2);
		formula.setOperator(logic);
		Graph g = cond.getGraph();
		Graph g2 = cond2.getGraph();
		
		Node ret = completePattern.getGraph().getNodes().get(0).makeComplex();

		Node n2 = ret.addOutgoing(g).getTarget();
		n2.addPrimitiveComparison();
		Node n3 = ret.addOutgoing(g2).getTarget();
		n3.addPrimitiveComparison();
		
		completePattern.createXmlAdaption();
		
		EList<Parameter> params = completePattern.getParameterList().getParameters();
//		for (Parameter p: params)
//			System.out.println(p.getClass().getSimpleName() + " p" + params.indexOf(p) + " = (" + p.getClass().getSimpleName()+ ") params.get(" + params.indexOf(p) + ");" );
		
		UntypedParameterValueImpl p0 = (UntypedParameterValueImpl) params.get(0);
		ComparisonOptionParamImpl p1 = (ComparisonOptionParamImpl) params.get(1);
		TypeOptionParamImpl p2 = (TypeOptionParamImpl) params.get(2);
		UntypedParameterValueImpl p3 = (UntypedParameterValueImpl) params.get(3);
		ComparisonOptionParamImpl p4 = (ComparisonOptionParamImpl) params.get(4);
		TypeOptionParamImpl p5 = (TypeOptionParamImpl) params.get(5);
		XmlPathParamImpl p6 = (XmlPathParamImpl) params.get(6);
		XmlPathParamImpl p7 = (XmlPathParamImpl) params.get(7);
		XmlPathParamImpl p8 = (XmlPathParamImpl) params.get(8);
		
		p0.setValue("1");
		p1.setValue(ComparisonOperator.EQUAL);
		p2.setValue(ReturnType.STRING);
		p3.setValue("2");
		p4.setValue(ComparisonOperator.EQUAL);
		p5.setValue(ReturnType.STRING);
		p6.setValueFromString(RECORD_PATH);
		p7.setValueFromString(FIELD_PATH);
		p8.setValueFromString(FIELD_PATH);
				
		return completePattern;
	}

	public static CompletePattern formulaNotCombinationPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setDescription("Formula ( =1 ) and  (Not( = 2 ))");
		Formula formula = PatternstructureFactory.eINSTANCE.createFormula();
		NotCondition not = PatternstructureFactory.eINSTANCE.createNotCondition();
		QuantifiedCondition cond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		QuantifiedCondition cond2 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(formula);
		formula.setCondition1(cond);
		formula.setCondition2(not);
		not.setCondition(cond2);
		formula.setOperator(LogicalOperator.AND);
		Graph g = cond.getGraph();
		Graph g2 = cond2.getGraph();
		
		Node ret = completePattern.getGraph().getNodes().get(0).makeComplex();

		Node n2 = ret.addOutgoing(g).getTarget();
		n2.addPrimitiveComparison();
		Node n3 = ret.addOutgoing(g2).getTarget();
		n3.addPrimitiveComparison();
		
		completePattern.createXmlAdaption();
		
		EList<Parameter> params = completePattern.getParameterList().getParameters();
//		for (Parameter p: params)
//			System.out.println(p.getClass().getSimpleName() + " p" + params.indexOf(p) + " = (" + p.getClass().getSimpleName()+ ") params.get(" + params.indexOf(p) + ");" );
		
		UntypedParameterValueImpl p0 = (UntypedParameterValueImpl) params.get(0);
		ComparisonOptionParamImpl p1 = (ComparisonOptionParamImpl) params.get(1);
		TypeOptionParamImpl p2 = (TypeOptionParamImpl) params.get(2);
		UntypedParameterValueImpl p3 = (UntypedParameterValueImpl) params.get(3);
		ComparisonOptionParamImpl p4 = (ComparisonOptionParamImpl) params.get(4);
		TypeOptionParamImpl p5 = (TypeOptionParamImpl) params.get(5);
		XmlPathParamImpl p6 = (XmlPathParamImpl) params.get(6);
		XmlPathParamImpl p7 = (XmlPathParamImpl) params.get(7);
		XmlPathParamImpl p8 = (XmlPathParamImpl) params.get(8);
		
		p0.setValue("1");
		p1.setValue(ComparisonOperator.EQUAL);
		p2.setValue(ReturnType.STRING);
		p3.setValue("2");
		p4.setValue(ComparisonOperator.EQUAL);
		p5.setValue(ReturnType.STRING);
		p6.setValueFromString(RECORD_PATH);
		p7.setValueFromString(FIELD_PATH);
		p8.setValueFromString(FIELD_PATH);
				
		return completePattern;
	}
	
	public static CompletePattern uniqueness1_1nPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setDescription("Uniqueness 1 with 1 node");
		QuantifiedCondition cond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(cond);
		Graph g = cond.getGraph();
		
		Node ret = completePattern.getGraph().getNodes().get(0).makeComplex();
		ret.setName("RecordNode");
		
		Node record2 = g.addComplexNode();
		record2.setName("RecordNodeCopy");
		
		Node field = record2.addOutgoing().getTarget();
		field.setName("Field");
		ret.addOutgoing(field);
		
		Comparison c = ret.addComparison(record2);
		c.getOption().setValue(ComparisonOperator.NOTEQUAL);
		c.getOption().setPredefined(true);
		
		completePattern.createXmlAdaption();
		
		EList<Parameter> params = completePattern.getParameterList().getParameters();
//		for (Parameter p: params)
//			System.out.println(p.getClass().getSimpleName() + " p" + params.indexOf(p) + " = (" + p.getClass().getSimpleName()+ ") params.get(" + params.indexOf(p) + ");" );
		
		ComparisonOptionParamImpl p0 = (ComparisonOptionParamImpl) params.get(0);
//		TypeOptionParamImpl p1 = (TypeOptionParamImpl) params.get(1);
		XmlPathParamImpl p2 = (XmlPathParamImpl) params.get(2);
		XmlPathParamImpl p3 = (XmlPathParamImpl) params.get(3);
		XmlPathParamImpl p4 = (XmlPathParamImpl) params.get(4);
		XmlPathParamImpl p5 = (XmlPathParamImpl) params.get(5);
		
		p0.setValue(ComparisonOperator.NOTEQUAL);
		
		p2.setValueFromString(RECORD_PATH);
		p3.setValueFromString(RECORD_PATH);
		p4.setValueFromString(FIELD_PATH);
		p5.setValueFromString(FIELD_PATH);
				
		return completePattern;
	}
	
	public static CompletePattern uniqueness1_2nPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setDescription("Uniqueness 1 with 2 nodes");
		QuantifiedCondition cond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(cond);
		Graph g = cond.getGraph();
		
		Node ret = completePattern.getGraph().getNodes().get(0).makeComplex();
		ret.setName("RecordNode");
		
		Node record2 = g.addComplexNode();
		record2.setName("RecordNodeCopy");
		
		Node field = ret.addOutgoing(g).getTarget().makePrimitive();
		field.setName("Field1");
		Node field2 = record2.addOutgoing().getTarget().makePrimitive();
		field2.setName("Field2");
		
		Comparison c = ret.addComparison(record2);
		c.getOption().setValue(ComparisonOperator.NOTEQUAL);
		c.getOption().setPredefined(true);
		

		Comparison c2 = field.addComparison(field2);
		c2.getOption().setValue(ComparisonOperator.EQUAL);
		c2.getOption().setPredefined(true);
		
		completePattern.createXmlAdaption();
		
		EList<Parameter> params = completePattern.getParameterList().getParameters();
//		for (Parameter p: params)
//			System.out.println(p.getClass().getSimpleName() + " p" + params.indexOf(p) + " = (" + p.getClass().getSimpleName()+ ") params.get(" + params.indexOf(p) + ");" );

		ComparisonOptionParamImpl p0 = (ComparisonOptionParamImpl) params.get(0);
//		TypeOptionParamImpl p1 = (TypeOptionParamImpl) params.get(1);
		ComparisonOptionParamImpl p2 = (ComparisonOptionParamImpl) params.get(2);
		TypeOptionParamImpl p3 = (TypeOptionParamImpl) params.get(3);
		XmlPathParamImpl p4 = (XmlPathParamImpl) params.get(4);
		XmlPathParamImpl p5 = (XmlPathParamImpl) params.get(5);
		XmlPathParamImpl p6 = (XmlPathParamImpl) params.get(6);
		XmlPathParamImpl p7 = (XmlPathParamImpl) params.get(7);
		
		p0.setValue(ComparisonOperator.NOTEQUAL);
		p2.setValue(ComparisonOperator.EQUAL);
		p3.setValue(ReturnType.STRING);
		p4.setValueFromString(RECORD_PATH);
		p5.setValueFromString(RECORD_PATH);
		p6.setValueFromString(FIELD_PATH);
		p7.setValueFromString(FIELD_PATH);
				
		return completePattern;
	}

	
	public static CompletePattern uniqueness2_1nPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setDescription("Uniqueness 2 with 1 node");
		QuantifiedCondition cond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(cond);
		Graph g = cond.getGraph();
		
		Node ret = completePattern.getGraph().getNodes().get(0).makeComplex();
		ret.setName("RecordNode");
		
		Node record2 = g.addComplexNode();
		record2.setName("RecordNodeCopy");
		

		QuantifiedCondition condnext = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		cond.setCondition(condnext);
		Graph gx = condnext.getGraph();
		
		Node field = ret.addOutgoing(gx).getTarget().makePrimitive();
		field.setName("Field");
		record2.addOutgoing(field);
		

		Comparison c = ret.addComparison(record2);
		c.getOption().setValue(ComparisonOperator.NOTEQUAL);
		c.getOption().setPredefined(true);
		
		completePattern.createXmlAdaption();
		
		EList<Parameter> params = completePattern.getParameterList().getParameters();
//		for (Parameter p: params)
//			System.out.println(p.getClass().getSimpleName() + " p" + params.indexOf(p) + " = (" + p.getClass().getSimpleName()+ ") params.get(" + params.indexOf(p) + ");" );
		

		ComparisonOptionParamImpl p0 = (ComparisonOptionParamImpl) params.get(0);
//		TypeOptionParamImpl p1 = (TypeOptionParamImpl) params.get(1);
		XmlPathParamImpl p2 = (XmlPathParamImpl) params.get(2);
		XmlPathParamImpl p3 = (XmlPathParamImpl) params.get(3);
		XmlPathParamImpl p4 = (XmlPathParamImpl) params.get(4);
		XmlPathParamImpl p5 = (XmlPathParamImpl) params.get(5);
		
		p0.setValue(ComparisonOperator.NOTEQUAL);
		
		p2.setValueFromString(RECORD_PATH);
		p3.setValueFromString(RECORD_PATH);
		p4.setValueFromString(FIELD_PATH);
		p5.setValueFromString(FIELD_PATH);
		
		return completePattern;
	}
	
	public static CompletePattern uniqueness2_2nPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setDescription("Uniqueness 2 with 2 nodes");
		QuantifiedCondition cond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(cond);
		Graph g = cond.getGraph();
		
		Node ret = completePattern.getGraph().getNodes().get(0).makeComplex();
		ret.setName("RecordNode");
		
		Node record2 = g.addComplexNode();
		record2.setName("RecordNodeCopy");
		

		QuantifiedCondition condnext = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		cond.setCondition(condnext);
		Graph gx = condnext.getGraph();
		
		
		Node field = ret.addOutgoing(gx).getTarget().makePrimitive();
		field.setName("Field1");
		Node field2 = record2.addOutgoing(gx).getTarget().makePrimitive();
		field2.setName("Field2");
		
		Comparison c = ret.addComparison(record2);
		c.getOption().setValue(ComparisonOperator.NOTEQUAL);
		c.getOption().setPredefined(true);
		

		Comparison c2 = field.addComparison(field2);
		c2.getOption().setValue(ComparisonOperator.EQUAL);
		c2.getOption().setPredefined(true);
		
		completePattern.createXmlAdaption();
		
		EList<Parameter> params = completePattern.getParameterList().getParameters();
//		for (Parameter p: params)
//			System.out.println(p.getClass().getSimpleName() + " p" + params.indexOf(p) + " = (" + p.getClass().getSimpleName()+ ") params.get(" + params.indexOf(p) + ");" );
		
		ComparisonOptionParamImpl p0 = (ComparisonOptionParamImpl) params.get(0);
//		TypeOptionParamImpl p1 = (TypeOptionParamImpl) params.get(1);
		ComparisonOptionParamImpl p2 = (ComparisonOptionParamImpl) params.get(2);
		TypeOptionParamImpl p3 = (TypeOptionParamImpl) params.get(3);
		XmlPathParamImpl p4 = (XmlPathParamImpl) params.get(4);
		XmlPathParamImpl p5 = (XmlPathParamImpl) params.get(5);
		XmlPathParamImpl p6 = (XmlPathParamImpl) params.get(6);
		XmlPathParamImpl p7 = (XmlPathParamImpl) params.get(7);

		p0.setValue(ComparisonOperator.NOTEQUAL);
		p2.setValue(ComparisonOperator.EQUAL);
		p3.setValue(ReturnType.STRING);
		p4.setValueFromString(RECORD_PATH);
		p5.setValueFromString(RECORD_PATH);
		p6.setValueFromString(FIELD_PATH);
		p7.setValueFromString(FIELD_PATH);
		
		return completePattern;
	}
	
	public static CompletePattern uniqueness3_1nPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setDescription("Uniqueness 3 with 1 node");
		CountCondition ccond = PatternstructureFactory.eINSTANCE.createCountCondition();
		completePattern.setCondition(ccond);
		CountPattern cp = ccond.getCountPattern();
		ccond.setArgument2(new NumberElementImpl());
		
		QuantifiedCondition qcon = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		cp.setCondition(qcon);
		
		Graph g1 = completePattern.getGraph();
		Graph g2 = cp.getGraph();
		Graph g3 = qcon.getGraph();
		
		Node ret = g1.getNodes().get(0).makeComplex();
		ret.setName("RecordNode");
		Node recCopy = g2.addComplexNode();
		recCopy.setName("RecordNodeCopy");
		recCopy.setReturnNode(true);
		Node n2 = ret.addOutgoing(g3).getTarget().makePrimitive();
		n2.setName("Field");
		recCopy.addOutgoing(n2);
		
		completePattern.createXmlAdaption();
		
		EList<Parameter> params = completePattern.getParameterList().getParameters();
//		for (Parameter p: params)
//			System.out.println(p.getClass().getSimpleName() + " p" + params.indexOf(p) + " = (" + p.getClass().getSimpleName()+ ") params.get(" + params.indexOf(p) + ");" );
		
		ComparisonOptionParamImpl p0 = (ComparisonOptionParamImpl) params.get(0);
		NumberParamImpl p1 = (NumberParamImpl) params.get(1);
		XmlPathParamImpl p2 = (XmlPathParamImpl) params.get(2);
		XmlPathParamImpl p3 = (XmlPathParamImpl) params.get(3);
		XmlPathParamImpl p4 = (XmlPathParamImpl) params.get(4);
		XmlPathParamImpl p5 = (XmlPathParamImpl) params.get(5);
		
		
		p0.setValue(ComparisonOperator.GREATER);
		p1.setValue(1.);
		p2.setValueFromString(RECORD_PATH);
		p3.setValueFromString(RECORD_PATH);
		p4.setValueFromString(FIELD_PATH);
		p5.setValueFromString(FIELD_PATH);
		
		return completePattern;
	}
	
	public static CompletePattern uniqueness3_2nPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setDescription("Uniqueness 3 with 2 nodes");
		CountCondition ccond = PatternstructureFactory.eINSTANCE.createCountCondition();
		completePattern.setCondition(ccond);
		CountPattern cp = ccond.getCountPattern();
		ccond.setArgument2(new NumberElementImpl());
		
		QuantifiedCondition qcon = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		cp.setCondition(qcon);
		
		Graph g1 = completePattern.getGraph();
		Graph g2 = cp.getGraph();
		Graph g3 = qcon.getGraph();
		
		Node ret = g1.getNodes().get(0).makeComplex();
		ret.setName("RecordNode");
		Node recCopy = g2.addComplexNode();
		recCopy.setName("RecordNodeCopy");
		recCopy.setReturnNode(true);
		Node n2 = ret.addOutgoing(g3).getTarget().makePrimitive();
		n2.setName("Field1");
		Node n3 = recCopy.addOutgoing(g3).getTarget().makePrimitive();
		n3.setName("Field2");
		
		n2.addComparison(n3);
		
		completePattern.createXmlAdaption();
		
		EList<Parameter> params = completePattern.getParameterList().getParameters();
//		for (Parameter p: params)
//			System.out.println(p.getClass().getSimpleName() + " p" + params.indexOf(p) + " = (" + p.getClass().getSimpleName()+ ") params.get(" + params.indexOf(p) + ");" );
		
		ComparisonOptionParamImpl p0 = (ComparisonOptionParamImpl) params.get(0);
		NumberParamImpl p1 = (NumberParamImpl) params.get(1);
		ComparisonOptionParamImpl p2 = (ComparisonOptionParamImpl) params.get(2);
		TypeOptionParamImpl p3 = (TypeOptionParamImpl) params.get(3);
		XmlPathParamImpl p4 = (XmlPathParamImpl) params.get(4);
		XmlPathParamImpl p5 = (XmlPathParamImpl) params.get(5);
		XmlPathParamImpl p6 = (XmlPathParamImpl) params.get(6);
		XmlPathParamImpl p7 = (XmlPathParamImpl) params.get(7);
		
		p0.setValue(ComparisonOperator.GREATER);
		p1.setValue(1.);
		p2.setValue(ComparisonOperator.EQUAL);
		p3.setValue(ReturnType.STRING);
		p4.setValueFromString(RECORD_PATH);
		p5.setValueFromString(RECORD_PATH);
		p6.setValueFromString(FIELD_PATH);
		p7.setValueFromString(FIELD_PATH);
		
		return completePattern;
	}
}
