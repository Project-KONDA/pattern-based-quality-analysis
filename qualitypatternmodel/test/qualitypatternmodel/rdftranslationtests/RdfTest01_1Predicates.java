package qualitypatternmodel.rdftranslationtests;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionrdf.AdaptionrdfFactory;
import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.adaptionrdf.RdfPathPart;
import qualitypatternmodel.adaptionrdf.RdfPredicate;
import qualitypatternmodel.adaptionrdf.RdfQuantifier;
import qualitypatternmodel.adaptionrdf.RdfSequence;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.adaptionrdf.RdfXor;
import qualitypatternmodel.adaptionrdf.impl.RdfPathPartImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.patternstructure.CompletePattern;

public class RdfTest01_1Predicates {

	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getSinglePredicateUriPattern());
		completePatterns.add(getSinglePredicateQuantifierPattern(RdfQuantifier.ONE));
		completePatterns.add(getSinglePredicateQuantifierPattern(RdfQuantifier.ZERO_OR_ONE));
		completePatterns.add(getSinglePredicateQuantifierPattern(RdfQuantifier.ZERO_PLUS));
		completePatterns.add(getSinglePredicateQuantifierPattern(RdfQuantifier.ONE_PLUS));
		completePatterns.add(getWildcardPattern());
		completePatterns.add(getSequenceQuantifierPattern(RdfQuantifier.ONE));
		completePatterns.add(getSequenceQuantifierPattern(RdfQuantifier.ZERO_OR_ONE));
		completePatterns.add(getXorPattern());
		completePatterns.add(getTwoIncomingPredicatesPattern());
		return completePatterns;
	}

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		RdfTest00.test(getPatterns());
	}

	public static CompletePattern getBasePatternPredicates() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = RdfTest00.getBasePattern();
		completePattern.createRdfAdaption();
		return completePattern;
	}

	public static CompletePattern getSinglePredicateQuantifierPattern(RdfQuantifier q) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternPredicates();
		RdfPredicate relation = (RdfPredicate) completePattern.getGraph().getRelations().get(0);
		IriParam iriParam = AdaptionrdfFactory.eINSTANCE.createIriParam();
		EList<RdfPathPart> partlist = relation.getRdfPathParam().getRdfPathParts();
		partlist.clear();
		RdfPathPart part = new RdfPathPartImpl();
		partlist.add(part);
		RdfSinglePredicate rdfSinglePredicate = (RdfSinglePredicate) part.getRdfPath();
		rdfSinglePredicate.setIriParam(iriParam);
		rdfSinglePredicate.setQuantifier(q);
		iriParam.setPrefix("wdt");
		iriParam.setSuffix("P569");

		return completePattern;
	}

	public static CompletePattern getSinglePredicateUriPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternPredicates();
		RdfPredicate relation = (RdfPredicate) completePattern.getGraph().getRelations().get(0);
		IriParam iriParam = AdaptionrdfFactory.eINSTANCE.createIriParam();
		EList<RdfPathPart> pl = relation.getRdfPathParam().getRdfPathParts();
		pl.clear();
		RdfPathPart p = new RdfPathPartImpl();
		pl.add(p);
		((RdfSinglePredicate) p.getRdfPath()).setIriParam(iriParam);
		iriParam.setUri("thisisatesturi");
		return completePattern;
	}

	public static CompletePattern getWildcardPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternPredicates();
		return completePattern;
	}

	public static CompletePattern getSequenceQuantifierPattern(RdfQuantifier q) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternPredicates();
		RdfPredicate relation = (RdfPredicate) completePattern.getGraph().getRelations().get(0);
		RdfPathPart part = AdaptionrdfFactory.eINSTANCE.createRdfPathPart();
		RdfSequence seq = AdaptionrdfFactory.eINSTANCE.createRdfSequence();
		relation.getRdfPathParam().setRdfPathPart(part);
		part.setRdfPath(seq);
		seq.setQuantifier(q);

		RdfSinglePredicate pred = AdaptionrdfFactory.eINSTANCE.createRdfSinglePredicate();
		seq.getItems().add(pred);
		IriParam iriParam = AdaptionrdfFactory.eINSTANCE.createIriParam();
		pred.setIriParam(iriParam);
		iriParam.setPrefix("wdt");
		iriParam.setSuffix("P19");

		RdfSinglePredicate pred2 = AdaptionrdfFactory.eINSTANCE.createRdfSinglePredicate();
		seq.getItems().add(pred2);
		IriParam iriParam2 = AdaptionrdfFactory.eINSTANCE.createIriParam();
		pred2.setIriParam(iriParam2);
		iriParam2.setPrefix("wdt");
		iriParam2.setSuffix("P361");


		return completePattern;
	}

	public static CompletePattern getXorPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternPredicates();
		RdfPredicate relation = (RdfPredicate) completePattern.getGraph().getRelations().get(0);

		RdfPathPart part = AdaptionrdfFactory.eINSTANCE.createRdfPathPart();
		RdfXor seq = AdaptionrdfFactory.eINSTANCE.createRdfXor();
		relation.getRdfPathParam().setRdfPathPart(part);
		part.setRdfPath(seq);

		RdfSinglePredicate pred = AdaptionrdfFactory.eINSTANCE.createRdfSinglePredicate();
		seq.getItems().add(pred);
		IriParam iriParam = AdaptionrdfFactory.eINSTANCE.createIriParam();
		pred.setIriParam(iriParam);
		iriParam.setPrefix("wdt");
		iriParam.setSuffix("P19");

		RdfSinglePredicate pred2 = AdaptionrdfFactory.eINSTANCE.createRdfSinglePredicate();
		seq.getItems().add(pred2);
		IriParam iriParam2 = AdaptionrdfFactory.eINSTANCE.createIriParam();
		pred2.setIriParam(iriParam2);
		iriParam2.setPrefix("wdt");
		iriParam2.setSuffix("P361");


		return completePattern;
	}

	private static CompletePattern getTwoIncomingPredicatesPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = RdfTest00.getBasePattern();

		ComplexNode node2 = completePattern.getGraph().addNode().makeComplex();
		completePattern.getGraph().addRelation(node2, completePattern.getGraph().getNodes().get(1));

		completePattern.createRdfAdaption();
		return completePattern;
	}




}
