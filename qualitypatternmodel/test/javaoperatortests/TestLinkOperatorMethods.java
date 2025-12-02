package javaoperatortests;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.javaoperators.JavaoperatorsFactory;
import qualitypatternmodel.javaoperators.LinkImageMinSizeOperator;
import qualitypatternmodel.javaoperators.LinkMimeTypeOperator;
import qualitypatternmodel.javaoperators.LinkSourceOperator;
import qualitypatternmodel.javaoperators.OneArgJavaOperator;
import qualitypatternmodel.javaoperators.ValidateLinkOperator;
import qualitypatternmodel.operators.OperatorList;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.utility.PatternUtility;

public class TestLinkOperatorMethods {

	public static void main(String[] args) throws InvalidityException {
		
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
		
		

		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		Graph graph = pattern.getGraph();
		OperatorList list = graph.getOperatorList();
		PrimitiveNode node = graph.getNodes().get(0).makePrimitive();

		ValidateLinkOperator op1 = JavaoperatorsFactory.eINSTANCE.createValidateLinkOperator();
		LinkSourceOperator op2 = JavaoperatorsFactory.eINSTANCE.createLinkSourceOperator();
		LinkMimeTypeOperator op3 = JavaoperatorsFactory.eINSTANCE.createLinkMimeTypeOperator();
		LinkImageMinSizeOperator op4 = JavaoperatorsFactory.eINSTANCE.createLinkImageMinSizeOperator();

		list.add(op1);
		list.add(op2);
		list.add(op3);
		list.add(op4);

		op1.createParameters();
		op2.createParameters();
		op3.createParameters();
		op4.createParameters();

		for (String str: url_source)
			op2.getTextListParam().addStringValue(str);
		for (String str: mimes)
			op3.getTextListParam().addStringValue(str);

		op4.getNumber1().setValue(width);
		op4.getNumber1().setValue(height);

		op1.getOption().setValue(false);
		op2.getOption().setValue(false);
		op3.getOption().setValue(false);
		op4.getOption().setValue(false);

		op1.setPrimitiveNode(node);
		op2.setPrimitiveNode(node);
		op3.setPrimitiveNode(node);
		op4.setPrimitiveNode(node);

		PatternUtility.fillParameter(pattern);

		
		OneArgJavaOperator[] ops = {op1, op2, op3, op4};

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
		

//		try {
//			System.out.println(op2.apply("www.google.de"));	
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		try {
//			System.out.println(op3.apply("www.google.de"));	
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		try {
//			System.out.println(op4.apply("www.google.de"));	
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
}
