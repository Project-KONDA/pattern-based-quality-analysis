package qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.cyphertranslationtests.CypherTranslation;
import qualitypatternmodel.adaptionneo4j.NeoElementNode;
import qualitypatternmodel.adaptionneo4j.NeoNodeLabelsParam;
import qualitypatternmodel.adaptionneo4j.NeoPropertyEdge;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.parameters.impl.DateParamImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

public class CypherTest00 extends CypherTranslation {
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CypherTest00 cypher00 = new CypherTest00();
		try {
			long timeElapsedNanos = 0;
			long timeElapsedMillis =  0;
			
			for (int i = 0; i <= 9; i++) {
				Instant start = Instant.now();
				
				cypher00.tester();   
				
				Instant finish = Instant.now();
				timeElapsedNanos += Duration.between(start, finish).toNanos();
				timeElapsedMillis += Duration.between(start, finish).toMillisPart();
			}			
			
			cypher00.invalidtyExceptionTester();
			
			System.out.println("--- Average Run ---");
			long timeElapsedNanosAvg = timeElapsedNanos / 10;
			System.out.println(timeElapsedNanosAvg);
			long timeElapsedSecAvg = timeElapsedMillis / 10;
			System.out.println(timeElapsedSecAvg);
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

	@Override
	public void buildPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatterns.add(getBasePatternCypher());
		completePatterns.add(getBasePatternComplexFinal());
		completePatterns.add(getComplexStructure());
		completePatterns.add(getBasePatternCondDateConcrete("1440-02-02"));
		completePatterns.add(getBasePatternCondConcrete("1439-12-20"));
		completePatterns.add(getBasePatternMatchConcrete("1439.*"));
		completePatterns.add(getBasePatternMatchNotConcrete("1439.*"));
	}
	
	/**
	 *@author Lukas
	 *<p> This is a simple base Pattern which contains a NeoNode and a NeoPropertyNode
	 *	The NeoPropertyNode is not printed. Both are connected by a NeoPropertyEdge without a NeoPropertyPathParam
	 * </p>
	 * @return
	 * @throws InvalidityException
	 * @throws OperatorCycleException
	 * @throws MissingPatternContainerException
	 */
	protected CompletePattern getBasePatternCypher() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTranslation.getBasePattern();
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	/**
	 * @author Lukas
	 * <p> This Pattern represents a Complex Structure with 6 NeoNodes
	 * With are all connected.
	 * Fitting labels have been added as well  
	 * </p>
	 * @return
	 * @throws InvalidityException
	 * @throws OperatorCycleException
	 * @throws MissingPatternContainerException
	 */
	private CompletePattern getComplexStructure() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;;
		
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
		
		NeoElementNode neoNode;
		
		neoNode = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addNeoLabel("Place");
		
		neoNode = (NeoElementNode) completePattern.getGraph().getNodes().get(1);
		neoNode.addNeoLabel("Regesta");
		
		neoNode = (NeoElementNode) completePattern.getGraph().getNodes().get(4);
		neoNode.addNeoLabel("Place");
		
		neoNode = (NeoElementNode) completePattern.getGraph().getNodes().get(5);
		neoNode.addNeoLabel("IndexPerson");
		
		return completePattern;
	}
	
	private CompletePattern getBasePatternComplexFinal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTranslation.getBasePatternComplex();
		
		completePattern.createNeo4jAdaption();
		
		return completePattern;
	}
	
	private CompletePattern getBasePatternCondDateConcrete(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternCondDate(comp);

		NeoPropertyEdge relation = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam nppp = NEO_FACTORY.createNeoPropertyPathParam();
		nppp.setNeoPropertyName("isoStartDate");
		relation.setNeoPropertyPathParam(nppp);
		
		NeoElementNode node = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
		NeoNodeLabelsParam labels = NEO_FACTORY.createNeoNodeLabelsParam();
		EList<String> textLabels = new BasicEList<String>();
		textLabels.add("Regesta");
		labels.setValueIfValid(textLabels);
		node.setNeoNodeLabels(labels);
			
		return completePattern;		
	}
	
	private CompletePattern getBasePatternCondDate(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTranslation.getBasePattern();
		Node se = completePattern.getGraph().getNodes().get(1);
		DateParamImpl dp = new DateParamImpl();
		dp.setValue(comp);
		se.addPrimitiveComparison(dp);
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	
	private CompletePattern getBasePatternCondConcrete(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternCond(comp);

		NeoPropertyEdge relation = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam nppp = NEO_FACTORY.createNeoPropertyPathParam();
		nppp.setNeoPropertyName("endDate");
		relation.setNeoPropertyPathParam(nppp);
		
		NeoElementNode node = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
		NeoNodeLabelsParam labels = NEO_FACTORY.createNeoNodeLabelsParam();
		EList<String> textLabels = new BasicEList<String>();
		textLabels.add("Regesta");
		labels.setValueIfValid(textLabels);
		node.setNeoNodeLabels(labels);
			
		return completePattern;		
	}
	
	private CompletePattern getBasePatternCond(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTranslation.getBasePattern();
		Node se = completePattern.getGraph().getNodes().get(1);
		se.addPrimitiveComparison(comp);
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	private CompletePattern getBasePatternMatchConcrete(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternMatch(comp);
		
		NeoPropertyEdge relation = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = NEO_FACTORY.createNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("endDate");
		relation.setNeoPropertyPathParam(neoPropertyPathParam);
		
		NeoElementNode node = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
		NeoNodeLabelsParam labels = NEO_FACTORY.createNeoNodeLabelsParam();
		EList<String> textLabels = new BasicEList<String>();
		textLabels.add("Regesta");
		labels.setValueIfValid(textLabels);
		node.setNeoNodeLabels(labels);
		
		return completePattern;		
	}
	
	private CompletePattern getBasePatternMatch(String regex) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTranslation.getBasePattern();
		Node se = completePattern.getGraph().getNodes().get(1);
		se.addPrimitiveMatch(regex);
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	private CompletePattern getBasePatternMatchNotConcrete(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternMatch(comp);
		
		((Match) completePattern.getGraph().getOperatorList().getOperators().get(0)).getOption().setValue(false);
		NeoPropertyEdge relation = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = NEO_FACTORY.createNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("endDate");
		relation.setNeoPropertyPathParam(neoPropertyPathParam);
		
		NeoElementNode node = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
		NeoNodeLabelsParam labels = NEO_FACTORY.createNeoNodeLabelsParam();
		EList<String> textLabels = new BasicEList<String>();
		textLabels.add("Regesta");
		labels.setValueIfValid(textLabels);
		node.setNeoNodeLabels(labels);
		
		return completePattern;		
	}

	@Override
	public void buildInvalidityExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		//Add Exception-Tests
	}
	
	@Override
	public void buildTooComplexQueryPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// TODO Auto-generated method stub
	}

	@Override
	public void buildUnsupportedException(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// TODO Auto-generated method stub
	}

	@Override
	public void buildOtherException(ArrayList<CompletePattern> completePatternsExceptions) throws InvalidityException {
		// TODO Auto-generated method stub
	}
	
	public static void test(ArrayList<CompletePattern> completePatterns) throws InvalidityException {
		for (CompletePattern completePattern : completePatterns) {
			replace(completePattern);
			try {
				completePattern.isValid(AbstractionLevel.CONCRETE);
				System.out.println("\n\n___PATTERN_(VALID)___");
				System.out.println(completePattern.myToString());
				System.out.print("\n___TRANSLATION___");
				System.out.println(completePattern.generateCypher());
			} catch (Exception e) {
				System.out.print("\n####### PATTERN INVALID #######");
				try {
				  System.out.println(completePattern.myToString());
					e.printStackTrace();
				} catch (Exception e2) {
					System.out.print("\n####### PATTERN PRINTING FAILED #######");
					e2.printStackTrace();
					e.printStackTrace();
				}
			}
		}
	}

}