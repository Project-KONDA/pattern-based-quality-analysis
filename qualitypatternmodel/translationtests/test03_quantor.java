import java.util.ArrayList;
import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.functions.*;
import qualitypatternmodel.inputfields.*;

public class test03_quantor {

	public static void main(String[] args) {
//		System.out.println(getPatternExists().myToString());
		
		ArrayList<Pattern> patterns = new ArrayList<Pattern>();
		patterns.add(getPatternExists());
		patterns.add(getPatternExistsCond());
		patterns.add(getPatternForall());
		patterns.add(getPatternForallCond());

		test00.test(patterns);
	}

	public static Pattern getPatternExists() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		// Pattern Structure
		Pattern pattern = test00.getBasePattern();
		QuantifiedCondition cond = factory.createQuantifiedCondition();
		cond.setCondition(factory.createTrue());
		pattern.setCondition(cond);
		
		// EXISTS Graph Structure
		SingleElement se = graphFactory.createSingleElement();
		SingleElement se2 = graphFactory.createSingleElement();
		cond.getGraph().getRootElement().getNextSingle().add(se);
		cond.getGraph().getReturnElements().add(se);
		se.getNextSingle().add(se2);
		
		// Morphism
		Morphism m = cond.getMorphism();
		m.setFrom(pattern.getReturnGraph());
		m.setTo(cond.getGraph());
		// SEMapping 1
		SingleElementMapping sem = (SingleElementMapping) m.getMappings().get(0);
		sem.setFrom(pattern.getReturnGraph().getRootElement());
		sem.setTo(cond.getGraph().getRootElement());
		// SEMapping 2
		SingleElementMapping sem2 = factory.createSingleElementMapping();
		m.getMappings().add(sem2);
		sem2.setFrom(pattern.getReturnGraph().getReturnElements().get(0));
		sem2.setTo(se);
		// RelationMapping
		RelationMapping rm = factory.createRelationMapping();
		m.getMappings().add(rm);
		rm.setFrom(pattern.getReturnGraph().getReturnElements().get(0).getRelationFromPrevious());
		rm.setTo(se.getRelationFromPrevious());
		
		return pattern;
	}

	public static Pattern getPatternExistsCond() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		FunctionsPackage.eINSTANCE.eClass();
		FunctionsFactory functionFactory = FunctionsFactory.eINSTANCE;
		InputfieldsPackage.eINSTANCE.eClass();
		InputfieldsFactory inputFactory = InputfieldsFactory.eINSTANCE;
		
		Pattern pattern = getPatternExists();
		VariableList varlist = pattern.getVariableList();
		Graph graph2 = ((QuantifiedCondition) pattern.getCondition()).getGraph();
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

	public static Pattern getPatternForall() {		
		Pattern pattern = getPatternExists();
		QuantifiedCondition cond1 = (QuantifiedCondition) pattern.getCondition();
		cond1.setQuantifier(Quantifier.FORALL);
		return pattern;
	}

	public static Pattern getPatternForallCond() {		
		Pattern pattern = getPatternExistsCond();
		QuantifiedCondition cond1 = (QuantifiedCondition) pattern.getCondition();
		cond1.setQuantifier(Quantifier.FORALL);		
		return pattern;
	}
}
