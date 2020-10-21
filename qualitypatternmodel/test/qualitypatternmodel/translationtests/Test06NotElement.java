package qualitypatternmodel.translationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.patternstructure.impl.*;
import qualitypatternmodel.testutility.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.graphstructure.impl.*;
import qualitypatternmodel.operators.*;
import qualitypatternmodel.operators.impl.*;
import qualitypatternmodel.adaptionxml.RelationKind;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.*;
import qualitypatternmodel.parameters.impl.*;

public class Test06NotElement {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternNotNotTrue());	
		completePatterns.add(getPatternNotExists());
		completePatterns.add(getPatternNotForall());
		completePatterns.add(getPatternExistsNotExists());
		completePatterns.add(getPatternForallNotForall());

		Test00.test(completePatterns);
	}
	
	public static CompletePattern getPatternNotTrue() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		CompletePattern completePattern = Test00.getBasePattern();
		
		NotCondition n = factory.createNotCondition();
		completePattern.setCondition(n);
		TrueElement t = factory.createTrueElement();
		n.setCondition(t);
		
		completePattern.createXMLAdaption();
		completePattern.finalizeXMLAdaption();	
		
		return completePattern;		
	}
	
	public static CompletePattern getPatternNotNotTrue() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		CompletePattern completePattern = Test00.getBasePattern();
		
		NotCondition n = factory.createNotCondition();
		completePattern.setCondition(n);
		NotCondition n2 = factory.createNotCondition();
		n.setCondition(n2);
		TrueElement t = factory.createTrueElement();
		n2.setCondition(t);
		
		completePattern.createXMLAdaption();
		completePattern.finalizeXMLAdaption();	
		
		return completePattern;		
	}
	public static CompletePattern getPatternNotExistsAbstract() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = Test00.getBasePattern();
		
		NotCondition n = factory.createNotCondition();
		completePattern.setCondition(n);
		QuantifiedCondition qc = factory.createQuantifiedCondition();
		n.setCondition(qc);
		TrueElement t = factory.createTrueElement();
		qc.setCondition(t);
		
		Element e0 = qc.getGraph().getElements().get(0);
		Element e1 = graphFactory.createElement();
		e1.setGraph(qc.getGraph());
		Relation relation = graphFactory.createRelation();
		relation.setGraph(qc.getGraph());
		relation.setSource(e0);
		relation.setTarget(e1);	
		
		return completePattern;
	}
	public static CompletePattern getPatternNotExists() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {		
		
		CompletePattern completePattern = getPatternNotExistsAbstract();		
		
		completePattern.createXMLAdaption();
		((QuantifiedCondition) ((NotCondition) completePattern.getCondition()).getCondition()).getGraph().getRelations().get(0).adaptAsXMLNavigation();
		completePattern.finalizeXMLAdaption();	
		
		((XmlNavigation)(completePattern.getGraph().getRelations().get(0))).getOption().setValue(RelationKind.THREECHILD);;
		
		return completePattern;
	}
	public static CompletePattern getPatternNotForall() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternNotExists();
		QuantifiedCondition qc = ((QuantifiedCondition) ((NotCondition) completePattern.getCondition()).getCondition());
		qc.setQuantifier(Quantifier.FORALL);
		return completePattern;
	}

	public static CompletePattern getPatternExistsNotExistsAbstract() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;

		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;	

				
		CompletePattern completePattern = Test03Quantor.getPatternExists();
		TrueElement t = (TrueElement) ((QuantifiedCondition) completePattern.getCondition()).getCondition();
		QuantifiedCondition qc1 = (QuantifiedCondition) completePattern.getCondition(); 
		NotCondition n = factory.createNotCondition();
		QuantifiedCondition qc2 = factory.createQuantifiedCondition();
				
		qc1.setCondition(n);
		n.setCondition(qc2);
		qc2.setCondition(t);
		
		Element e2 = graphFactory.createElement();
		e2.setGraph(qc2.getGraph());
		return completePattern;
		
	}
	
	
	public static CompletePattern getPatternExistsNotExists() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternExistsNotExistsAbstract();

		QuantifiedCondition q1 = ((QuantifiedCondition)completePattern.getCondition());
		QuantifiedCondition q2 = ((QuantifiedCondition) ((NotCondition) q1.getCondition()).getCondition());

		completePattern.createXMLAdaption();
		completePattern.finalizeXMLAdaption();	
		
		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getOption().setValue(RelationKind.TWOCHILD);
		((XmlNavigation) q1.getGraph().getRelations().get(1)).getOption().setValue(RelationKind.CHILD);
		((XmlNavigation) q2.getGraph().getRelations().get(2)).getOption().setValue(RelationKind.ANCESTOR);
		return completePattern; 
	}
	public static CompletePattern getPatternForallNotForall() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		CompletePattern completePattern = getPatternExistsNotExists();
		
		QuantifiedCondition qc1 = (QuantifiedCondition) completePattern.getCondition();
		QuantifiedCondition qc2 = (QuantifiedCondition) ((NotCondition) qc1.getCondition()).getCondition();

		qc1.setQuantifier(Quantifier.FORALL);
		qc2.setQuantifier(Quantifier.FORALL);

		((XmlNavigation)qc1.getGraph().getRelations().get(1)).getOption().setValue(RelationKind.PARENT);
		((XmlNavigation)qc2.getGraph().getRelations().get(2)).getOption().setValue(RelationKind.CHILD);
		
		return completePattern;
	}
	
	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		
		testPairs.add(new PatternTestPair("NOTNOT", 	getPatternNotNotTrue(), 		"/*"));
		testPairs.add(new PatternTestPair("NOTEX", 		getPatternNotExists(), 		"/*/*/*[not(./*)]"));
		testPairs.add(new PatternTestPair("NOTFA", 		getPatternNotForall(), 		"()"));
		testPairs.add(new PatternTestPair("EXNOTEX",	getPatternExistsNotExists(),"if ( not( exists (/ancestor::*)) and  exists (/*)) then (/*/*)"));
		testPairs.add(new PatternTestPair("FANOTFA", 	getPatternForallNotForall(),"if ( not( exists (/parent::*))) then (/*/*)"));
				
		return testPairs;		
	}

}
