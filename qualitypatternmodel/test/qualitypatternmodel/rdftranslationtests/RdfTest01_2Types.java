package qualitypatternmodel.rdftranslationtests;

import java.util.ArrayList;

import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.adaptionrdf.RdfIriNode;
import qualitypatternmodel.adaptionrdf.impl.IriParamImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;

public class RdfTest01_2Types {

	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getBaseRdfPattern());
		completePatterns.add(getBaseRdfPatternIri());
		completePatterns.add(getBaseRdfPatternMoreIris());
		return completePatterns;
	}

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		RdfTest00.test(getPatterns());
	}

	public static CompletePattern getBaseRdfPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = RdfTest00.getBasePattern();
		completePattern.createRdfAdaption();
		return completePattern;
	}

	public static CompletePattern getBaseRdfPatternIri() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBaseRdfPattern();
		RdfIriNode r = (RdfIriNode) completePattern.getGraph().getNodes().get(0);
		IriParam p = new IriParamImpl();
		p.setUri("LOL");
		r.getRdfIriNodeTypes().getIriParams().add(p);
		return completePattern;
	}

	public static CompletePattern getBaseRdfPatternMoreIris() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBaseRdfPattern();
		RdfIriNode r = (RdfIriNode) completePattern.getGraph().getNodes().get(0);
		IriParam p = new IriParamImpl();
		p.setUri("typeuri1");
		r.getRdfIriNodeTypes().getIriParams().add(p);
		IriParam p2 = new IriParamImpl();
		p2.setUri("typeuri2");
		r.getRdfIriNodeTypes().getIriParams().add(p2);
		IriParam p3 = new IriParamImpl();
		p3.setPrefix("pre");
		p3.setSuffix("suf");
		r.getRdfIriNodeTypes().getIriParams().add(p3);
		return completePattern;
	}
}
