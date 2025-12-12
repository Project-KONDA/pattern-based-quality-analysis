package javaoperatortests;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.javaoperators.LinkImageMinSizeOperator;
import qualitypatternmodel.javaoperators.LinkMimeTypeOperator;
import qualitypatternmodel.javaoperators.LinkSourceOperator;
import qualitypatternmodel.javaoperators.OneArgJavaOperator;
import qualitypatternmodel.javaoperators.ValidateLinkOperator;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;

public class TestLinkOperatorMethods {

	public static void main(String[] args) throws InvalidityException {
		
		// CONFIG

		String[] urls = {
				"https://www.google.de", 
				"https://rlp.museum-digital.de/data/rlp/resources/video/202006/200w_03101730082.jpg", 
				"https://rlp.museum-digital.de/data/rlp/resources/video/202006/03101359436.mp4", 
				"https://creativecommons.org/publicdomain/zero/1.0/", 
				"https://creativecommons.org/licenses/by-nc-sa/4.0/", 
				"invalid"};
		String[] url_source = {"https://creativecommons.org"};
		String[] mimes = {"image/jpeg", "video/mp4"};
		double width = 100;
		double height = 100;

		boolean[][] res = {
				{true, true, true, true, true, false}, 
				{false, false, false, true, true, false},
				{false, true, true, false, false, false},
				{false, true, false, false, false, false}};

		// PATTERN

		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		Graph graph = pattern.getGraph();
		PrimitiveNode node = graph.getNodes().get(0).makePrimitive();

		// PARAMETER

		ValidateLinkOperator op1 = node.addPrimitiveValidateLink();
		op1.getOption().setValue(false);
		
		LinkSourceOperator op2 = node.addPrimitiveLinkSource();
		op2.getOption().setValue(false);
		for (String str: url_source)
			op2.getTextListParam().addStringValue(str);

		LinkMimeTypeOperator op3 = node.addPrimitiveLinkMimeType();
		op3.getOption().setValue(false);
		for (String str: mimes)
			op3.getTextListParam().addStringValue(str);

		LinkImageMinSizeOperator op4 = node.addPrimitiveLinkImageSize();
		op4.getNumber1().setValue(width);
		op4.getNumber2().setValue(height);
		op4.getOption().setValue(false);

		OneArgJavaOperator[] ops = {op1, op2, op3, op4};

		// TEST

		for (int i = 0; i<ops.length; i++) {
			for (int j=0; j<urls.length; j++) {
				OneArgJavaOperator op = ops[i];
				String url = urls[j];
				boolean expected = res[i][j];
				boolean real = op.apply(url);
				
				if (real != expected)
					System.out.println(op.getClass().getSimpleName() + " " + real + " / " + expected + " " + url);
			}
		}
	}
}
