package qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests;

import java.util.ArrayList;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.cyphertranslationtests.CypherAbstractTranslation;
import qualitypatternmodel.adaptionneo4j.NeoNode;
import qualitypatternmodel.adaptionneo4j.NeoPropertyEdge;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.impl.DateParamImpl;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

//--> Systemtest und kein Kompnententest
public class CypherTest00 extends CypherAbstractTranslation {
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CypherTest00 cypher00 = new CypherTest00();
		try {
			cypher00.generalizedTests();         
			cypher00.generalizedInvalidtyExceptionTests();
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
	
	@Override
	public void buildInvalidityExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		//Add Exception-Tests
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
		CompletePattern completePattern = CypherAbstractTranslation.getBasePattern();
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
		
		NeoNode neoNode;
		
		neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addNeoLabel("Place");
		
		neoNode = (NeoNode) completePattern.getGraph().getNodes().get(1);
		neoNode.addNeoLabel("Regesta");
		
		neoNode = (NeoNode) completePattern.getGraph().getNodes().get(4);
		neoNode.addNeoLabel("Place");
		
		neoNode = (NeoNode) completePattern.getGraph().getNodes().get(5);
		neoNode.addNeoLabel("IndexPerson");
		
		return completePattern;
	}
	
	private CompletePattern getBasePatternComplexFinal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherAbstractTranslation.getBasePatternComplex();
		
		completePattern.createNeo4jAdaption();
		
		return completePattern;
	}
	
	private CompletePattern getBasePatternCondDateConcrete(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternCondDate(comp);

		NeoPropertyEdge relation = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam nppp = NEO_FACTORY.createNeoPropertyPathParam();
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
	
	private CompletePattern getBasePatternCondDate(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherAbstractTranslation.getBasePattern();
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
		
		NeoNode node = (NeoNode) completePattern.getGraph().getNodes().get(0);
		TextListParam labels = new TextListParamImpl();
		EList<String> textLabels = new BasicEList<String>();
		textLabels.add("Regesta");
		labels.setValueIfValid(textLabels);
		node.setNeoNodeLabels(labels);
			
		return completePattern;		
	}
	
	private CompletePattern getBasePatternCond(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherAbstractTranslation.getBasePattern();
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
		
		NeoNode node = (NeoNode) completePattern.getGraph().getNodes().get(0);
		TextListParam labels = new TextListParamImpl();
		EList<String> textLabels = new BasicEList<String>();
		textLabels.add("Regesta");
		labels.setValueIfValid(textLabels);
		node.setNeoNodeLabels(labels);
		
		return completePattern;		
	}
	
	private CompletePattern getBasePatternMatch(String regex) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherAbstractTranslation.getBasePattern();
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
		
		NeoNode node = (NeoNode) completePattern.getGraph().getNodes().get(0);
		TextListParam labels = new TextListParamImpl();
		EList<String> textLabels = new BasicEList<String>();
		textLabels.add("Regesta");
		labels.setValueIfValid(textLabels);
		node.setNeoNodeLabels(labels);
		
		return completePattern;		
	}

	@Override
	public void buildToComplexQueryPatterns(ArrayList<CompletePattern> completePatterns)
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
}