package qualitypatternmodel.rdftranslationtests;

import qualitypatternmodel.adaptionrdf.AdaptionrdfFactory;
import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.adaptionrdf.RdfPredicate;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.OperatorsFactory;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.ParameterFragment;
import qualitypatternmodel.textrepresentation.ParameterPredefinition;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.textrepresentation.TextFragment;
import qualitypatternmodel.textrepresentation.TextrepresentationFactory;

public class RdfTest10Template {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		// cf. example at https://en.wikibooks.org/wiki/SPARQL/Templates
		
		// pattern:
		CompletePattern completePattern = RdfTest00.getBasePattern();
		Graph graph = completePattern.getGraph();
//		graph.getNodes().get(0).setReturnNode(false);
//		graph.getNodes().get(1).setReturnNode(true);
		graph.getNodes().get(0).addOutgoing().getTarget();
					
		// note that complex node is comparison argument here
		Comparison comp = OperatorsFactory.eINSTANCE.createComparison();
		comp.setOperatorList(graph.getOperatorList());
		IriParam iriParam = AdaptionrdfFactory.eINSTANCE.createIriParam();
		comp.setArgument1(graph.getNodes().get(2));
		comp.setArgument2(iriParam);
		
		completePattern.createRdfAdaption();
				
		// pattern text:
		PatternText patternText = TextrepresentationFactory.eINSTANCE.createPatternText();
		patternText.setName("presidents");
		completePattern.getText().add(patternText);
		
		TextFragment text0 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text0.setText("Presidents of");
		TextFragment text1 = TextrepresentationFactory.eINSTANCE.createTextFragment();
		text1.setText("and their spouses");
		
		ParameterPredefinition paramPredef0 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();		
		RdfPredicate rdfPredicate0 = (RdfPredicate) graph.getRelations().get(1);
		IriParam iriParamForPred0 = AdaptionrdfFactory.eINSTANCE.createIriParam();
		((RdfSinglePredicate) rdfPredicate0.getRdfPathParam().getRdfPathPart()).setIriParam(iriParamForPred0);
		paramPredef0.getParameter().add(rdfPredicate0.getRdfPathParam());
		paramPredef0.setValue("^(p:P6/ps:P6)");
		
		ParameterPredefinition paramPredef1 = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();		
		RdfPredicate rdfPredicate1 = (RdfPredicate) graph.getRelations().get(0);
		IriParam iriParamForPred1 = AdaptionrdfFactory.eINSTANCE.createIriParam();
		((RdfSinglePredicate) rdfPredicate1.getRdfPathParam().getRdfPathPart()).setIriParam(iriParamForPred1);
		paramPredef1.getParameter().add(rdfPredicate1.getRdfPathParam());
		paramPredef1.setValue("wdt:P26");
		
		ParameterFragment paramTagNameParent = TextrepresentationFactory.eINSTANCE.createParameterFragment();
		paramTagNameParent.getParameter().add(iriParam);
		paramTagNameParent.setName("country");
		paramTagNameParent.setExampleValue("wd:Q30");
		
		patternText.getParameterPredefinitions().add(paramPredef0);
		patternText.getParameterPredefinitions().add(paramPredef1);
		patternText.addFragment(text0);
		patternText.addFragment(paramTagNameParent);
		patternText.addFragment(text1);
		
		System.out.println(patternText.generateSparqlTemplate());
		
	}
}
