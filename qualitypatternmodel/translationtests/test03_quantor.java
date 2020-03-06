

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.patternstructure.impl.*;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.graphstructure.impl.*;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.functions.*;
import qualitypatternmodel.functions.impl.*;
import qualitypatternmodel.inputfields.*;
import qualitypatternmodel.inputfields.impl.*;

public class test03_quantor {

	public static void main(String[] args) {

		ArrayList<Pattern> patterns = new ArrayList<Pattern>();
		patterns.add(getPatternExists());
		patterns.add(getPatternExistsCond());
		patterns.add(getPatternForall());
		patterns.add(getPatternForallCond());
		
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

	public static Pattern getPatternExists() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		Pattern pattern = getBasePattern();
		QuantifiedCondition cond = factory.createQuantifiedCondition();
		cond.setCondition(factory.createTrue());
		pattern.setCondition(cond);
		SingleElement se = graphFactory.createSingleElement();
		((SingleElement) cond.getGraph().getReturnElements().get(0)).getNextSingle().add(se);
		return pattern;
	}

	public static Pattern getPatternExistsCond() {
		
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		Pattern pattern = getPatternForall();
		VariableList varlist = pattern.getVariableList();
		Graph graph2 = ((QuantifiedCondition) pattern.getCondition()).getGraph();
		SingleElement last = graph2.getReturnElements().get(0);
		OperatorList oplist = graph2.getOperatorList();
		
		return pattern;
	}

	public static Pattern getPatternForall() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		Pattern pattern = getPatternExists();
		QuantifiedCondition cond1 = (QuantifiedCondition) pattern.getCondition();
		cond1.setQuantifier(Quantifier.FORALL);
		QuantifiedCondition cond2 = factory.createQuantifiedCondition();
		cond2.setCondition(factory.createTrue());
		cond1.setCondition(cond2);
		return pattern;
	}

	public static Pattern getPatternForallCond() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		FunctionsPackage.eINSTANCE.eClass();
		FunctionsFactory functionFactory = FunctionsFactory.eINSTANCE;
		InputfieldsPackage.eINSTANCE.eClass();
		InputfieldsFactory inputFactory = InputfieldsFactory.eINSTANCE;
		
		Pattern pattern = getPatternForall();
		VariableList varlist = pattern.getVariableList();
		Graph graph2 = ((QuantifiedCondition) ((QuantifiedCondition) pattern.getCondition()).getCondition()).getGraph();
		OperatorList oplist = graph2.getOperatorList();
		SingleElement last = graph2.getRootElement().getNextSingle().get(0).getNextSingle().get(0);
		
		Comparison comp = functionFactory.createComparison();
		oplist.add(comp);
			
		Property prop = graphFactory.createProperty();
		last.getProperties().add(prop);
		comp.setArgument1(prop);
		varlist.add(prop.getPropertyOption());
		varlist.add(prop.getAttributeName());
		
		varlist.add(comp.getOption());
		
		TextLiteral textlit = inputFactory.createTextLiteral();
		textlit.setValue("myvalue");
		varlist.add(textlit);
		
		comp.setArgument2(textlit);
		return pattern;
	}
}
