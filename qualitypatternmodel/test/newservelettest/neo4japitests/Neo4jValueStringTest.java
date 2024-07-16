package newservelettest.neo4japitests;

import qualitypatternmodel.adaptionneo4j.Adaptionneo4jFactory;
import qualitypatternmodel.adaptionneo4j.NeoComplexEdge;
import qualitypatternmodel.adaptionneo4j.NeoEdgeLabelParam;
import qualitypatternmodel.adaptionneo4j.NeoElementPathParam;
import qualitypatternmodel.adaptionneo4j.NeoNodeLabelsParam;
import qualitypatternmodel.adaptionneo4j.NeoPropertyNameParam;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;
import qualitypatternmodel.exceptions.InvalidityException;

public class Neo4jValueStringTest {

	static Adaptionneo4jFactory factory = Adaptionneo4jFactory.eINSTANCE;

	public static void main(String[] args) throws InvalidityException {
		testNeoPropertyName();
		testEdgeLabel();
		testNodeLabels();

		testSimpleEdge();
		testComplexEdge();

		testElementPath();
		testPropertyPath();
	}


	private static void testNeoPropertyName() throws InvalidityException {
		System.out.println("_PROPERTY_NAME_");
		String[] valid = new String[] {
			"TEST",
			"test2bla",
			"asdf",
		};
		String[] invalid = new String[] {
			".asd:",
			":A",
			"ab cd"
		};
		for (String val: valid) {
			try {
				NeoPropertyNameParam propertypath = factory.createNeoPropertyNameParam();
				propertypath.setValueFromString(val);
				String propertypath2 = propertypath.getValueAsString();
				System.out.println("    " + val + " - " + propertypath2.equals(val) + " [" + propertypath2 + "]");
			} catch (InvalidityException e) {
				System.err.println("    " + val + " - error");
				e.printStackTrace();
			}
		}
		System.out.println();
		for (String val: invalid) {
			try {
				NeoPropertyNameParam propertypath = factory.createNeoPropertyNameParam();
				propertypath.setValueFromString(val);
				String propertypath2 = propertypath.getValueAsString();
				System.err.println("    " + val + " - invalid failed [" + propertypath2 + "]");
			} catch (InvalidityException e) {
				System.out.println("    " + val + " - success");
			}
		}
		System.out.println();
	}


	private static void testEdgeLabel() throws InvalidityException {
		System.out.println("_EDGE_LABEL_");
		String[] valid = new String[] {
			"TEST",
			"test2bla",
			"asdf",
		};
		String[] invalid = new String[] {
			".asd:",
			":A",
			"ab cd"
		};
		for (String val: valid) {
			try {
				NeoEdgeLabelParam edgelabel = factory.createNeoEdgeLabelParam();
				edgelabel.setValueFromString(val);
				String edgelabel2 = edgelabel.getValueAsString();
				System.out.println("    " + val + " - " + edgelabel2.equals(val) + " [" + edgelabel2 + "]");
			} catch (InvalidityException e) {
				System.err.println("    " + val + " - error");
				e.printStackTrace();
			}
		}
		System.out.println();
		for (String val: invalid) {
			try {
				NeoEdgeLabelParam edgelabel = factory.createNeoEdgeLabelParam();
				edgelabel.setValueFromString(val);
				String edgelabel2 = edgelabel.getValueAsString();
				System.err.println("    " + val + " - invalid failed [" + edgelabel2 + "]");
			} catch (InvalidityException e) {
				System.out.println("    " + val + " - success");
			}
		}
		System.out.println();
	}


	private static void testNodeLabels() throws InvalidityException {
		System.out.println("_NODE_LABEL_");
		String[] valid = new String[] {
			"[\"abc\",\"def\"]",
			"[\"123abc\",\"a\"]",
		};
		String[] invalid = new String[] {
			"[\"ab.c\",\"def\"]",
			"[\"abc\",\"de.f\"]",
			"[\"abc\",\"d ef\"]",
			"[\"abc\",\"\"]",
			"LABEL",
			"TESTLABEL",
			"testlabel",
			"\"abc\", \"def\""
		};
		for (String val: valid) {
			try {
				NeoNodeLabelsParam nodelabels = factory.createNeoNodeLabelsParam();
				nodelabels.setValueFromString(val);
				String nodelabels2 = nodelabels.getValueAsString();
				System.out.println("    " + val + " - " + nodelabels2.equals(val) + " " + nodelabels2);
			} catch (InvalidityException e) {
				System.err.println("    " + val + " - error");
				e.printStackTrace();
			}
		}
		System.out.println();
		for (String val: invalid) {
			try {
				NeoNodeLabelsParam nodelabels = factory.createNeoNodeLabelsParam();
				nodelabels.setValueFromString(val);
				String nodelabels2 = nodelabels.getValueAsString();
				System.err.println("    " + val + " - invalid failed [" + nodelabels2 + "]");
			} catch (InvalidityException e) {
				System.out.println("    " + val + " - success");
			}
		}
		System.out.println();
	}


	private static void testSimpleEdge() throws InvalidityException {
		System.out.println("_SIMPLE_EDGE_");

		String[] valid = new String[] {
			"{}",
			"{\"edgetype\":\"abc\"}",
			"{\"targettype\":[]}",
			"{\"targettype\":[],\"edgetype\":\"abc\"}",
			"{\"targettype\":[\"asd\", \"qwe\"],\"edgetype\":\"abc\"}",
		};
		String[] invalid = new String[] {
			"{\"targettype\":[\"a sd\", \"qwe\"],\"edgetype\":\"abc\"}",
			"{\"targettype\":[\"asd\", \"qwe\"],\"edgetype\":\"a bc\"}",
			"TESTLABEL"
		};
		for (String val: valid) {
			try {
				NeoSimpleEdge simplepart = factory.createNeoSimpleEdge();
				simplepart.setValueFromString(val);
				String simplepart2 = simplepart.getValueAsString();
				System.out.println("    " + val + " - " + simplepart2.equals(val) + " [" + simplepart2 + "]");
			} catch (InvalidityException e) {
				System.err.println("    " + val + " - error");
				e.printStackTrace();
			}
		}
		System.out.println();
		for (String val: invalid) {
			try {
				NeoSimpleEdge simplepart = factory.createNeoSimpleEdge();
				simplepart.setValueFromString(val);
				String simplepart2 = simplepart.getValueAsString();
				System.err.println("    " + val + " - invalid failed [" + simplepart2 + "]");
			} catch (InvalidityException e) {
				System.out.println("    " + val + " - success");
			}
		}
		System.out.println();
	}


	private static void testComplexEdge() throws InvalidityException {
		System.out.println("_COMPLEX_EDGE_");
		String[] valid = new String[] {
			"[{},{}]",
			"[{},{\"targettype\":[]},{\"edgetype\":\"abc\"}]",
			"[{\"targettype\":[],\"edgetype\":\"abc\"},{\"targettype\":[],\"edgetype\":\"abc\"}]",
		};
		String[] invalid = new String[] {
			"[{}]",
			"[{},{\"edgetype\":\"\"}]",
			"[{},{\"targettype\":[\"\"]}]",
			"[{},{\"targettype\":[]},{\"edgetype\":\"ab c\"}]",
			"TESTLABEL"
		};
		for (String val: valid) {
			try {
				NeoComplexEdge complexpart = factory.createNeoComplexEdge();
				complexpart.setValueFromString(val);
				String complexpart2 = complexpart.getValueAsString();
				System.out.println("    " + val + " - " + complexpart2.equals(val) + " [" + complexpart2 + "]");
			} catch (InvalidityException e) {
				System.err.println("    " + val + " - error");
				e.printStackTrace();
			}
		}
		System.out.println();
		for (String val: invalid) {
			try {
				NeoComplexEdge complexpart = factory.createNeoComplexEdge();
				complexpart.setValueFromString(val);
				String complexpart2 = complexpart.getValueAsString();
				System.err.println("    " + val + " - invalid failed [" + complexpart2 + "]");
			} catch (InvalidityException e) {
				System.out.println("    " + val + " - success");
			}
		}
		System.out.println();
	}


	private static void testElementPath() throws InvalidityException {
		System.out.println("_ELEMENT_PATH_");
		String[] valid = new String[] {
			"[{},{}]",
			"[{},{\"targettype\":[]},{\"edgetype\":\"abc\"}]",
			"[{\"targettype\":[],\"edgetype\":\"abc\"},{\"targettype\":[],\"edgetype\":\"abc\"}]",
			"{\"pathpart\":[{},{}]}",
			"{\"pathpart\":[{},{\"targettype\":[]},{\"edgetype\":\"abc\"}]}",
			"{\"pathpart\":[{\"targettype\":[],\"edgetype\":\"abc\"},{\"targettype\":[],\"edgetype\":\"abc\"}]}",
		};
		String[] invalid = new String[] {
			"[{}]",
			"[{},{\"edgetype\":\"\"}]",
			"[{},{\"targettype\":[\"\"]}]",
			"[{},{\"targettype\":[]},{\"edgetype\":\"ab c\"}]",
			"TESTLABEL"
		};
		for (String val: valid) {
			try {
				NeoElementPathParam elementpath = factory.createNeoElementPathParam();
				elementpath.setValueFromString(val);
				String elementpath2 = elementpath.getValueAsString();
				System.out.println("    " + val + " - " + elementpath2.equals(val) + " [" + elementpath2 + "]");
			} catch (InvalidityException e) {
				System.err.println("    " + val + " - error");
				e.printStackTrace();
			}
		}
		System.out.println();
		for (String val: invalid) {
			try {
				NeoElementPathParam elementpath = factory.createNeoElementPathParam();
				elementpath.setValueFromString(val);
				String elementpath2 = elementpath.getValueAsString();
				System.err.println("    " + val + " - invalid failed [" + elementpath2 + "]");
			} catch (InvalidityException e) {
				System.out.println("    " + val + " - success");
			}
		}
		System.out.println();
	}


	private static void testPropertyPath() throws InvalidityException {
		System.out.println("_PROPERTY_PATH_");
		String[] valid = new String[] {
			"{\"pathpart\":[{},{}],\"propertyname\":\"a\"}",
			"{\"pathpart\":[{},{\"targettype\":[]},{\"edgetype\":\"abc\"}],\"propertyname\":\"a\"}",
			"{\"pathpart\":[{\"targettype\":[],\"edgetype\":\"abc\"},{\"targettype\":[],\"edgetype\":\"abc\"}],\"propertyname\":\"a\"}",
		};
		String[] invalid = new String[] {
			"TESTLABEL",
			"{\"pathpart\":[{},{}]}",
			"{\"pathpart\":[{},{\"targettype\":[]},{\"edgetype\":\"abc\"}]}",
			"{\"propertyname\":\"a\"}",
		};
		for (String val: valid) {
			try {
				NeoPropertyPathParam propertypath = factory.createNeoPropertyPathParam();
				propertypath.setValueFromString(val);
				String propertypath2 = propertypath.getValueAsString();
				System.out.println("    " + val + " - " + propertypath2.equals(val) + " [" + propertypath2 + "]");
			} catch (InvalidityException e) {
				System.err.println("    " + val + " - error");
				e.printStackTrace();
			}
		}
		System.out.println();
		for (String val: invalid) {
			try {
				NeoPropertyPathParam propertypath = factory.createNeoPropertyPathParam();
				propertypath.setValueFromString(val);
				String propertypath2 = propertypath.getValueAsString();
				System.err.println("    " + val + " - invalid failed [" + propertypath2 + "]");
			} catch (InvalidityException e) {
				System.out.println("    " + val + " - success");
			}
		}
		System.out.println();
	}
}
