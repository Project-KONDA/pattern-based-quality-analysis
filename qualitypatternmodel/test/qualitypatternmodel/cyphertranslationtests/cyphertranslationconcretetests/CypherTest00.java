package qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests;

import java.util.ArrayList;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JFactoryImpl;
import qualitypatternmodel.cyphertranslationtests.CypherTranslationAbstract;
import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JFactory;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.impl.DateParamImpl;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

//--> Systemtest und kein Kompnententest
public class CypherTest00 extends CypherTranslationAbstract {
	public static final AdaptionNeo4JFactory FACTORY = new AdaptionNeo4JFactoryImpl();
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CypherTest00 nullTest = new CypherTest00();
		nullTest.generalizedTests();         
		nullTest.generalizedInvalidtyExceptionTests();
	}

	@Override
	public void buildPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatterns.add(getBasePatternFinal());
		completePatterns.add(getBasePatternComplexFinal());
		completePatterns.add(getComplexMatchStructure());
		completePatterns.add(getBasePatternCondDateConcrete("1440-02-02"));
		completePatterns.add(getBasePatternCondConcrete("1439-12-20"));
		completePatterns.add(getBasePatternMatchConcrete("1439.*"));
		completePatterns.add(getBasePatternMatchNotConcrete("1439.*"));
	}
	
	@Override
	public void buildInvalidityExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		//Add Exception-Tests
	}
	
	protected static CompletePattern getBasePatternFinal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		completePattern.createNeo4jAdaption();
		
		return completePattern;
	}
	
	private static CompletePattern getComplexMatchStructure() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.setName("MyPattern");
		
		ComplexNode complexNode1 = completePattern.getGraph().getNodes().get(0).makeComplex();
		ComplexNode pn1 = completePattern.getGraph().addComplexNode();
		completePattern.getGraph().addRelation(complexNode1, pn1);
		
		ComplexNode pn2 = completePattern.getGraph().addComplexNode();
		completePattern.getGraph().addRelation(complexNode1, pn2);
		
		ComplexNode pn3 = completePattern.getGraph().addComplexNode();
		completePattern.getGraph().addRelation(complexNode1, pn3);
		
		ComplexNode pn4 = completePattern.getGraph().addComplexNode();
		completePattern.getGraph().addRelation(pn1, pn4);
		
		ComplexNode pn5 = completePattern.getGraph().addComplexNode();
		completePattern.getGraph().addRelation(pn1, pn5);
		
		ComplexNode pn6 = completePattern.getGraph().addComplexNode();
		completePattern.getGraph().addRelation(pn1, pn6);
	
		
		completePattern.createNeo4jAdaption();
		
		NeoNode neoNode;
		
		neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addLabel("Place");
		
		neoNode = (NeoNode) completePattern.getGraph().getNodes().get(1);
		neoNode.addLabel("Regesta");
		
		neoNode = (NeoNode) completePattern.getGraph().getNodes().get(4);
		neoNode.addLabel("Place");
		
		neoNode = (NeoNode) completePattern.getGraph().getNodes().get(5);
		neoNode.addLabel("IndexPerson");
		
		return completePattern;
	}
	
	
	protected static CompletePattern getBasePattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.setName("MyPattern");
		
		ComplexNode complexNode1 = completePattern.getGraph().getNodes().get(0).makeComplex();
		PrimitiveNode pn = completePattern.getGraph().addPrimitiveNode();
		completePattern.getGraph().addRelation(complexNode1, pn);
	
		return completePattern;	
	}
	
	private static CompletePattern getBasePatternComplexFinal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternComplex();
		
		completePattern.createNeo4jAdaption();
		
		return completePattern;
	}
	
	protected static CompletePattern getBasePatternComplex() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.setName("MyPattern");
		
		ComplexNode complexNode1 = completePattern.getGraph().getNodes().get(0).makeComplex();
		completePattern.getGraph().addNode();
		ComplexNode complexNode2 = completePattern.getGraph().getNodes().get(1).makeComplex();
		completePattern.getGraph().addRelation(complexNode1, complexNode2);
		
		return completePattern;		
	}
	
	private static CompletePattern getBasePatternCondDateConcrete(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternCondDate(comp);

		NeoPropertyEdge relation = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam nppp = FACTORY.createNeoPropertyPathParam();
		nppp.setNeoPropertyName("isoStartDate");
		relation.setNeoPropertyPathParam(nppp);
		
		NeoNode node = (NeoNode) completePattern.getGraph().getNodes().get(0);
		TextListParam labels = new TextListParamImpl();
		EList<String> textLabels = new BasicEList<String>();
		textLabels.add("Regesta");
		labels.setValueIfValid(textLabels);
		node.setNeoNodeLabels(labels);
			
		return completePattern;		
	}
	
	private static CompletePattern getBasePatternCondDate(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		Node se = completePattern.getGraph().getNodes().get(1);
		DateParamImpl dp = new DateParamImpl();
		dp.setValue(comp);
		se.addPrimitiveComparison(dp);
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	
	private static CompletePattern getBasePatternCondConcrete(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternCond(comp);

		NeoPropertyEdge relation = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam nppp = FACTORY.createNeoPropertyPathParam();
		nppp.setNeoPropertyName("endDate");
		relation.setNeoPropertyPathParam(nppp);
		
		NeoNode node = (NeoNode) completePattern.getGraph().getNodes().get(0);
		TextListParam labels = new TextListParamImpl();
		EList<String> textLabels = new BasicEList<String>();
		textLabels.add("Regesta");
		labels.setValueIfValid(textLabels);
		node.setNeoNodeLabels(labels);
			
		return completePattern;		
	}
	
	private static CompletePattern getBasePatternCond(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		Node se = completePattern.getGraph().getNodes().get(1);
		se.addPrimitiveComparison(comp);
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	private static CompletePattern getBasePatternMatchConcrete(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternMatch(comp);
		
		NeoPropertyEdge relation = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = FACTORY.createNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("endDate");
		relation.setNeoPropertyPathParam(neoPropertyPathParam);
		
		NeoNode node = (NeoNode) completePattern.getGraph().getNodes().get(0);
		TextListParam labels = new TextListParamImpl();
		EList<String> textLabels = new BasicEList<String>();
		textLabels.add("Regesta");
		labels.setValueIfValid(textLabels);
		node.setNeoNodeLabels(labels);
		
		return completePattern;		
	}
	
	private static CompletePattern getBasePatternMatch(String regex) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		Node se = completePattern.getGraph().getNodes().get(1);
		se.addPrimitiveMatch(regex);
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	private static CompletePattern getBasePatternMatchNotConcrete(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternMatch(comp);
		
		((Match) completePattern.getGraph().getOperatorList().getOperators().get(0)).getOption().setValue(false);
		NeoPropertyEdge relation = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = FACTORY.createNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("endDate");
		relation.setNeoPropertyPathParam(neoPropertyPathParam);
		
		NeoNode node = (NeoNode) completePattern.getGraph().getNodes().get(0);
		TextListParam labels = new TextListParamImpl();
		EList<String> textLabels = new BasicEList<String>();
		textLabels.add("Regesta");
		labels.setValueIfValid(textLabels);
		node.setNeoNodeLabels(labels);
		
		return completePattern;		
	}
}