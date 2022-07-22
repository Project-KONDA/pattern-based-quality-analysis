package qualitypatternmodel.rdfevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.adaptionrdf.RdfPathParam;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.adaptionrdf.impl.IriParamImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.rdftranslationtests.RdfTest00;

public class EvalAppdup {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getAppDup2Abstract());
		completePatterns.add(getAppDup2Concrete());
		completePatterns.add(getAppDup3Abstract());
		completePatterns.add(getAppDup3Concrete());
		RdfTest00.test(completePatterns);
	}

	public static CompletePattern getAppDup2Generic() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		completePattern.getGraph().getReturnNodes().get(0).setName("main");
		
		ComplexNode main = (ComplexNode) completePattern.getGraph().getReturnNodes().get(0);
		ComplexNode other = graphFactory.createComplexNode();
		other.setName("other");
		other.setReturnNode(true);
		other.setGraph(completePattern.getGraph());
		Comparison c = main.addComparison(other);
		
		QuantifiedCondition qc1 = factory.createQuantifiedCondition();
		completePattern.setCondition(qc1);
		
		Graph g1 = qc1.getGraph();
		Node main1 = g1.getNodes().get(0);
		Node other1 = g1.getNodes().get(1);
		
		c.getOption().setValue(ComparisonOperator.NOTEQUAL);
		
		Node n1 = main1.addOutgoing().getTarget().makePrimitive();
		other1.addOutgoing(n1);

		QuantifiedCondition qc2 = factory.createQuantifiedCondition();
		qc1.setCondition(qc2);
		
		Graph g2 = qc2.getGraph();
		Node main2 = g2.getNodes().get(0);
		Node other2 = g2.getNodes().get(1);
		
		Node n2 = main2.addOutgoing().getTarget().makePrimitive();
		other2.addOutgoing(n2);
		
		return completePattern;
	}
	
	public static CompletePattern getAppDup2Abstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getAppDup2Generic();	
		completePattern.createRdfAdaption();
		return completePattern;		
	}
	
	public static CompletePattern getAppDup2Concrete() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getAppDup2Abstract();
		
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
		TypeOptionParam p1 = ((TypeOptionParam) params.get(1));
		RdfPathParam p2 = ((RdfPathParam) params.get(2));
		RdfPathParam p3 = ((RdfPathParam) params.get(3));
		RdfPathParam p4 = ((RdfPathParam) params.get(4));
		RdfPathParam p5 = ((RdfPathParam) params.get(5));
		
		((RdfSinglePredicate) p2.getRdfPathPart()).setIriParam(new IriParamImpl("wdt:P569")); // BIRTHDATE
		((RdfSinglePredicate) p3.getRdfPathPart()).setIriParam(new IriParamImpl("wdt:P569")); // BIRTHDATE
		((RdfSinglePredicate) p4.getRdfPathPart()).setIriParam(new IriParamImpl("wdt:P570")); // DEATHDATE
		((RdfSinglePredicate) p5.getRdfPathPart()).setIriParam(new IriParamImpl("wdt:P570")); // DEATHDATE
				
		return completePattern;
	}
	


	public static CompletePattern getAppDup3Generic() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = getAppDup2Generic();

		QuantifiedCondition qc1 = (QuantifiedCondition) completePattern.getCondition();
		QuantifiedCondition qc2 = (QuantifiedCondition) qc1.getCondition();
		
		QuantifiedCondition qc3 = factory.createQuantifiedCondition();
		qc2.setCondition(qc3);
		
		Graph g2 = qc3.getGraph();
		Node main2 = g2.getNodes().get(0);
		Node other2 = g2.getNodes().get(1);
		
		Node n2 = main2.addOutgoing().getTarget().makePrimitive();
		other2.addOutgoing(n2);
		
		return completePattern;
	}
	
	public static CompletePattern getAppDup3Abstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getAppDup3Generic();
		completePattern.createRdfAdaption();
		return completePattern;
	}
	
	public static CompletePattern getAppDup3Concrete() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getAppDup3Abstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
		TypeOptionParam p1 = ((TypeOptionParam) params.get(1));
		RdfPathParam p2 = ((RdfPathParam) params.get(2));
		RdfPathParam p3 = ((RdfPathParam) params.get(3));
		RdfPathParam p4 = ((RdfPathParam) params.get(4));
		RdfPathParam p5 = ((RdfPathParam) params.get(5));
		RdfPathParam p6 = ((RdfPathParam) params.get(6));
		RdfPathParam p7 = ((RdfPathParam) params.get(7));
		
		((RdfSinglePredicate) p2.getRdfPathPart()).setIriParam(new IriParamImpl("wdt:P2561"));
		((RdfSinglePredicate) p3.getRdfPathPart()).setIriParam(new IriParamImpl("wdt:P2561"));
		((RdfSinglePredicate) p4.getRdfPathPart()).setIriParam(new IriParamImpl("wdt:P31"));
		((RdfSinglePredicate) p5.getRdfPathPart()).setIriParam(new IriParamImpl("wdt:P31"));
		((RdfSinglePredicate) p6.getRdfPathPart()).setIriParam(new IriParamImpl("wdt:P1448"));
		((RdfSinglePredicate) p7.getRdfPathPart()).setIriParam(new IriParamImpl("wdt:P1448"));
		
		
		return completePattern;
	}
}
