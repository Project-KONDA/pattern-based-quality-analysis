

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

public class test02_return {

	public static void main(String[] args) {

		ArrayList<Pattern> patterns = new ArrayList<Pattern>();
		patterns.add(getPatternMultipleReturn());
		patterns.add(getPatternMultipleReturnNested());
		patterns.add(getPatternLateReturn());
		
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

	public static Pattern getPatternMultipleReturn() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
			
		Pattern pattern = getBasePattern();
		Graph return_graph = pattern.getReturnGraph();
		
		SingleElement root = pattern.getReturnGraph().getRootElement();
		SingleElement return2 = graphFactory.createSingleElement();
		root.getNextSingle().add(return2);
		return_graph.getReturnElements().add(return2);
				
		return pattern;
	}

	public static Pattern getPatternMultipleReturnNested() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		Pattern pattern = getBasePattern();
		
		SingleElement return2 = graphFactory.createSingleElement();
		pattern.getReturnGraph().getReturnElements().get(0).getNextSingle().add(return2);
		pattern.getReturnGraph().getReturnElements().add(return2);
		
		return pattern;
	}

	public static Pattern getPatternLateReturn() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
			
		Pattern pattern = getBasePattern();
		Graph return_graph = pattern.getReturnGraph();
		
		SingleElement return2 = graphFactory.createSingleElement();
		EList<SingleElement> return_elements = return_graph.getReturnElements();
		return_elements.get(0).getNextSingle().add(return2);
		return_elements.remove(0);
		return_elements.add(return2);
		
		return pattern;
	}
	
}
