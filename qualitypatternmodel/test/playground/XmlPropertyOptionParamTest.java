package playground;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.impl.XmlPropertyOptionParamImpl;
import qualitypatternmodel.exceptions.InvalidityException;

public class XmlPropertyOptionParamTest {

	public static void main(String[] args) throws InvalidityException {
		List<String> props = Arrays.asList("text()", "data()", "name()", "@att", "@a1t2t3");
		List<String> axes = new ArrayList<String>();
		axes.add("/");
		axes.add("//");
		for (XmlAxisKind axis: XmlAxisKind.VALUES)
			axes.add(axis.getLiteral());
		List<String> list = new ArrayList<String>();
		for (String axis: axes)
			for (String prop: props)
				list.add(axis + prop);
		
		int success = 0, total = 0;
		for (String s: list) {
			total++;
			XmlPropertyOptionParamImpl xpo = new XmlPropertyOptionParamImpl(s);
			String query = xpo.generateXQuery();
			s = s.replace("/child::", "/").replace("/descendant::", "//").replace("data", "text");
			if (xpo.generateXQuery().equals(s))
				success++;
			else {
				System.out.println(xpo.myToString());
				System.out.println(s);
				System.out.println(query);
			}
		}
		System.out.println(success + "/" + total);
	}
}
