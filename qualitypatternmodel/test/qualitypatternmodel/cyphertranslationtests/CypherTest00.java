package qualitypatternmodel.cyphertranslationtests;

import static qualitypatternmodel.xmltranslationtests.Test00.replace;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionrdf.AdaptionrdfFactory;
import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.adaptionrdf.RdfPredicate;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.rdftranslationtests.RdfTest00;

public class CypherTest00 {
	public static void test(ArrayList<CompletePattern> completePatterns) {
		for (CompletePattern completePattern : completePatterns) {
			replace(completePattern);
			try {
//				completePattern.isValid(AbstractionLevel.CONCRETE); // TODO: allow technology-dependent validation
				System.out.println("\n\n___PATTERN_(VALID)___");
				System.out.println(completePattern.myToString());
				System.out.print("\n___TRANSLATION___");
				System.out.println(completePattern.generateSparql());
			} catch (Exception e) {
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
		//completePatterns.add(getBasePatternCondConcrete("2022-12-31")); --> adapte
		//completePatterns.add(getBasePatternMatchConcrete("^2022")); --> adapte
		//completePatterns.add(getBasePatternMatchNotConcrete("^2022")); --> adapte
		RdfTest00.test(completePatterns);
	}
	
	public static CompletePattern getBasePatternFinal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	public static CompletePattern getBasePattern() throws InvalidityException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.setName("MyPattern");
		
		//has to be check since in the XML test it is not provided
		//However it makes sense due to the fact that a relation between to nodes has to be established
		ComplexNode complexNode1 = completePattern.getGraph().getNodes().get(0).makeComplex();
		Node node2 = completePattern.getGraph().addNode();
		completePattern.getGraph().addRelation(complexNode1, node2);
		
		return completePattern;
	}
	
	public static CompletePattern getBasePatternCond(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		Node se = completePattern.getGraph().getNodes().get(1); //what do I have to get here 0, 1 or 2 since in RDF and XML tests it is diffrent
		se.addPrimitiveComparison(comp);
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	//More adaption needed
	public static CompletePattern getBasePatternCondConcrete(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternCond(comp);
		
		//Complete part has to be restructured to methods to create the Neo4J structure !!! 
		//RdfPredicate relation = (RdfPredicate) completePattern.getGraph().getRelations().get(0);
		//IriParam iriParam = AdaptionrdfFactory.eINSTANCE.createIriParam();
		//((RdfSinglePredicate) relation.getRdfPathParam()).setIriParam(iriParam);
		//iriParam.setPrefix("wdt");
		//iriParam.setSuffix("P569");
		//The following is for the Xml adaptation
		//XmlNavigation xmlNavigation = (XmlNavigation) completePattern.getGraph().getRelations().get(0);
		//xmlNavigation.getXmlPathParam().setXmlAxis(XmlAxisKind.DESCENDANT, "");		
		
		return completePattern;		
	}
	
	public static CompletePattern getBasePatternMatch(String regex) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		Node se = completePattern.getGraph().getNodes().get(1); //what do I have to get here 0, 1 or 2 since in RDF and XML tests it is diffrent
		se.addPrimitiveMatch(regex);
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	public static CompletePattern getBasePatternMatchConcrete(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternMatch(comp);
		
//		Has to be adapted
//		RdfPredicate relation = (RdfPredicate) completePattern.getGraph().getRelations().get(0);
//		IriParam iriParam = AdaptionrdfFactory.eINSTANCE.createIriParam();
//		((RdfSinglePredicate) relation.getRdfPathParam()).setIriParam(iriParam);
//		iriParam.setPrefix("wdt");
//		iriParam.setSuffix("P569");
//		XML
//		XmlNavigation xmlNavigation = (XmlNavigation) completePattern.getGraph().getRelations().get(0);
//		xmlNavigation.getXmlPathParam().setXmlAxis(XmlAxisKind.DESCENDANT, "");
		
		return completePattern;		
	}

//	The following Methods has been specificlly for the adaptions
//	public static CompletePattern getBasePatternMatchNotConcrete(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern completePattern = getBasePatternMatch(comp);
//		((Match) completePattern.getGraph().getOperatorList().getOperators().get(0)).getOption().setValue(false);
//		RdfPredicate relation = (RdfPredicate) completePattern.getGraph().getRelations().get(0);
//		IriParam iriParam = AdaptionrdfFactory.eINSTANCE.createIriParam();
//		((RdfSinglePredicate) relation.getRdfPathParam()).setIriParam(iriParam);
//		iriParam.setPrefix("wdt");
//		iriParam.setSuffix("P569");
//		return completePattern;		
//	}
//	
//	//From XMLAdaption
//	public static CompletePattern replace(CompletePattern pattern) {
//		ParametersPackage.eINSTANCE.eClass();
//		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
//		
//		EList<Parameter> params = pattern.getParameterList().getParameters();
//		for (int i = params.size()-1; i > -1; i--) {
//			Parameter param = pattern.getParameterList().getParameters().get(i);
//			if (param instanceof UntypedParameterValue) {
//				TextLiteralParam text = parametersFactory.createTextLiteralParam();
//				text.setValue("unknown");
//				((UntypedParameterValue) param).replace(text);
//			}
//		}
//		return pattern;
//	}
	
}
