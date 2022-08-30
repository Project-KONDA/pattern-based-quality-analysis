package qualitypatternmodel.cyphertranslationtests;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JFactory;
import qualitypatternmodel.adaptionNeo4J.NeoEdge;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoPathPart;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JFactoryImpl;
import qualitypatternmodel.adaptionNeo4J.impl.NeoPathParamImpl;
import qualitypatternmodel.adaptionNeo4J.impl.NeoPathPartImpl;
import qualitypatternmodel.adaptionrdf.AdaptionrdfFactory;
import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.adaptionrdf.RdfPredicate;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.parameters.impl.DateParamImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import static qualitypatternmodel.xmltranslationtests.Test00.*;

public class CypherTest00 {
	public static final AdaptionNeo4JFactory factory = new AdaptionNeo4JFactoryImpl();
	
	public static void test(ArrayList<CompletePattern> completePatterns) {
		for (CompletePattern completePattern : completePatterns) {
			replace(completePattern);
			try {
//				completePattern.isValid(AbstractionLevel.CONCRETE); // TODO: allow technology-dependent validation
				System.out.println("\n\n___PATTERN_(VALID)___");
				System.out.println(completePattern.myToString());
				System.out.print("\n___TRANSLATION___");
				System.out.println(completePattern.generateCypher());
			} catch (Exception e) {
				System.out.println();
				e.printStackTrace();
				try {
				  System.out.println(completePattern.myToString());
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getBasePatternFinal());
		completePatterns.add(getBasePatternComplexFinal());
		completePatterns.add(getBasePatternCondDateConcrete("1440-02-02"));
		completePatterns.add(getBasePatternCondConcrete("1439-12-20"));
		//completePatterns.add(getBasePatternMatchConcrete("^2022")); //--> adapte
		//completePatterns.add(getBasePatternMatchNotConcrete("^2022")); //--> adapte
		CypherTest00.test(completePatterns);
	}
	
	public static CompletePattern getBasePatternFinal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		completePattern.createNeo4jAdaption();
		EList<Node> ns = completePattern.getGraph().getNodes();
		for (Node n : ns) {
			if(n instanceof ComplexNode) {
				NeoNode neo = (NeoNode) n; 
				neo.setNodePlace(NeoPlace.BEGINNING);
			}
		}
		return completePattern;
	}
	
	public static CompletePattern getBasePattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.setName("MyPattern");
		
		ComplexNode complexNode1 = completePattern.getGraph().getNodes().get(0).makeComplex();
		Node node2 = completePattern.getGraph().addNode();
		completePattern.getGraph().addRelation(complexNode1, node2);
	
		return completePattern;	
	}
	
	public static CompletePattern getBasePatternComplexFinal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternComplex();
		
		completePattern.createNeo4jAdaption();
		NeoNode ns = (NeoNode) completePattern.getGraph().getNodes().get(0);
		ns.setNodePlace(NeoPlace.BEGINNING);
		
		return completePattern;
	}
	
	public static CompletePattern getBasePatternComplex() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.setName("MyPattern");
		
		ComplexNode complexNode1 = completePattern.getGraph().getNodes().get(0).makeComplex();
		completePattern.getGraph().addNode();
		ComplexNode complexNode2 = completePattern.getGraph().getNodes().get(1).makeComplex();
//		complexNode2.setReturnNode(true);
		completePattern.getGraph().addRelation(complexNode1, complexNode2);
		
		return completePattern;		
	}
	
	public static CompletePattern getBasePatternCondDateConcrete(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternCondDate(comp);
		NeoNode neo = (NeoNode) completePattern.getGraph().getNodes().get(0); 
		neo.setNodePlace(NeoPlace.BEGINNING);

		NeoPropertyEdge relation = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam nppp = factory.createNeoPropertyPathParam();
		nppp.setNeoPropertyName("isoStartDate");
		relation.setNeoPropertyPathParam(nppp);
			
		return completePattern;		
	}
	
	public static CompletePattern getBasePatternCondDate(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		Node se = completePattern.getGraph().getNodes().get(1);
		DateParamImpl dp = new DateParamImpl();
		dp.setValue(comp);
		se.addPrimitiveComparison(dp);
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	
	public static CompletePattern getBasePatternCondConcrete(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternCond(comp);
		NeoNode neo = (NeoNode) completePattern.getGraph().getNodes().get(0); 
		neo.setNodePlace(NeoPlace.BEGINNING);

		NeoPropertyEdge relation = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam nppp = factory.createNeoPropertyPathParam();
		nppp.setNeoPropertyName("endDate");
		relation.setNeoPropertyPathParam(nppp);
			
		return completePattern;		
	}
	
	public static CompletePattern getBasePatternCond(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		Node se = completePattern.getGraph().getNodes().get(1);
		se.addPrimitiveComparison(comp);
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	
	
//	Build something with the setting because here is some error
//	private static void makeConcreteSimpleEdge(CompletePattern completePattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
////		NeoEdge ne = (NeoEdge) completePattern.getGraph().getRelations().get(0);
////		NeoPathParam npp = CypherTest00.factory.createNeoPathParam();
////		npp.setNeoPath(CypherTest00.factory.createNeoSimpleEdge());
////		ne.setNeoPathParam(npp);
//	}
}
