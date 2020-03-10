import java.util.ArrayList;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.exceptions.*;

public class test04_quantorcombinations {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<Pattern> patterns = new ArrayList<Pattern>();
		patterns.add(getPatternExistsInExists());
		patterns.add(getPatternForallInExists());
		patterns.add(getPatternExistsInForall());
		patterns.add(getPatternForallInForall());

		test00.test(patterns);
	}

	public static Pattern getPatternExistsInExists() {
		
		// PatternStructure
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		Pattern pattern = test03_quantor.getPatternExists();
		QuantifiedCondition qcond = (QuantifiedCondition) pattern.getCondition();
		QuantifiedCondition qcond2 =  factory.createQuantifiedCondition();
		qcond.setCondition(qcond2);
		True t = factory.createTrue();
		qcond2.setCondition(t);
		
		
		// Graph Structure
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;

		Graph graph = qcond2.getGraph();
		SingleElement se = graphFactory.createSingleElement();
		SingleElement se2 = graphFactory.createSingleElement();
		se.getNextSingle().add(se2);
		graph.getRootElement().getNextSingle().add(se);
		graph.getReturnElements().add(se);
		
		// Morphism
		Graph g1 = qcond.getGraph();
		Graph g2 = qcond2.getGraph();
		Morphism m2 = qcond2.getMorphism();
		m2.setFrom(g1);
		m2.setTo(g2);		
		// SEMapping 1
		SingleElementMapping sem = (SingleElementMapping) m2.getMappings().get(0);
		sem.setFrom(g1.getRootElement());
		sem.setTo(g2.getRootElement());
		// SEMapping 2
		SingleElementMapping sem2 = factory.createSingleElementMapping();
		m2.getMappings().add(sem2);
		sem2.setFrom(g1.getRootElement().getNextSingle().get(0));
		sem2.setTo(g2.getRootElement().getNextSingle().get(0));
		// RMapping 1
		RelationMapping rm1 = factory.createRelationMapping();
		m2.getMappings().add(rm1);
		rm1.setFrom(g1.getRootElement().getNextSingle().get(0).getRelationFromPrevious());		
		rm1.setTo(g2.getRootElement().getNextSingle().get(0).getRelationFromPrevious());
		// SEMapping 3
		SingleElementMapping sem3 = factory.createSingleElementMapping();
		m2.getMappings().add(sem3);
		sem3.setFrom(g1.getRootElement().getNextSingle().get(0).getNextSingle().get(0));
		sem3.setTo(g2.getRootElement().getNextSingle().get(0).getNextSingle().get(0));
		// RMapping 2
		RelationMapping rm2 = factory.createRelationMapping();
		m2.getMappings().add(rm2);
		rm2.setFrom(g1.getRootElement().getNextSingle().get(0).getNextSingle().get(0).getRelationFromPrevious());
		rm2.setTo(g2.getRootElement().getNextSingle().get(0).getNextSingle().get(0).getRelationFromPrevious());
		
		SingleElement se3 = graphFactory.createSingleElement();
		se2.getNextSingle().add(se3);
		
		return pattern;
	}
	
	public static Pattern getPatternForallInExists() {
		Pattern pattern = getPatternExistsInExists();
		((QuantifiedCondition)((QuantifiedCondition) pattern.getCondition()).getCondition()).setQuantifier(Quantifier.FORALL);
		return pattern;		
	}

	public static Pattern getPatternExistsInForall() {
		Pattern pattern = getPatternExistsInExists();
		((QuantifiedCondition) pattern.getCondition()).setQuantifier(Quantifier.FORALL);
		return pattern;
	}
	public static Pattern getPatternForallInForall() {
		Pattern pattern = getPatternForallInExists();
		((QuantifiedCondition) pattern.getCondition()).setQuantifier(Quantifier.FORALL);
		return pattern;
	}
	
}
