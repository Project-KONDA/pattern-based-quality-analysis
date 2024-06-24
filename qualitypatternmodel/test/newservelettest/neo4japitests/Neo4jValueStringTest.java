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
		testEdgeLabel();
		testNodeLabels();
		testSimpleEdge();
		testComplexEdge();
		testNeoPropertyName();
		testElementPath();
		testPropertyPath();
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
			":A"
		};
		for (String val: valid) {
			try {
				NeoEdgeLabelParam edgelabel = factory.createNeoEdgeLabelParam();
				edgelabel.setValueFromString(val);
				String edgelabel2 = edgelabel.getValueAsString();
				System.out.println(val + " - " + edgelabel2.equals(val) + " [" + edgelabel2 + "]");
			} catch (InvalidityException e) {
				System.out.println(val + " - error");
			}
		}
		System.out.println();
	}


	private static void testNodeLabels() throws InvalidityException {
		System.out.println("_NODE_LABEL_");
		String[] valid = new String[] {
			"LABEL",
			"TESTLABEL",
			"testlabel",
			"{\"abc\",\"def\"}",
			"\"abc\", \"def\""
		};
		String[] invalid = new String[] {
		};
		for (String val: valid) {
			try {
				NeoNodeLabelsParam edgelabel = factory.createNeoNodeLabelsParam();
				edgelabel.setValueFromString(val);
				String edgelabel2 = edgelabel.getValueAsString();
				System.out.println(val + " - " + edgelabel2.equals(val) + " [" + edgelabel2 + "]");
			} catch (InvalidityException e) {
				System.out.println(val + " - error");
			}
		}
		System.out.println();
	}


	private static void testSimpleEdge() throws InvalidityException {
		System.out.println("_SIMPLE_EDGE_");
		String[] valid = new String[] {
		};
		String[] invalid = new String[] {
			"TESTLABEL"
		};
		for (String val: valid) {
			try {
				NeoSimpleEdge simplepart = factory.createNeoSimpleEdge();
				simplepart.setValueFromString(val);
				String simplepart2 = simplepart.getValueAsString();
				System.out.println(val + " - " + simplepart2.equals(val) + " [" + simplepart2 + "]");
			} catch (InvalidityException e) {
				System.out.println(val + " - error");
			}
		}
		System.out.println();
	}


	private static void testComplexEdge() throws InvalidityException {
		System.out.println("_COMPLEX_EDGE_");
		String[] valid = new String[] {
		};
		String[] invalid = new String[] {
			"TESTLABEL"
		};
		for (String val: valid) {
			try {
				NeoComplexEdge complexpart = factory.createNeoComplexEdge();
				complexpart.setValueFromString(val);
				String complexpart2 = complexpart.getValueAsString();
				System.out.println(val + " - " + complexpart2.equals(val) + " [" + complexpart2 + "]");
			} catch (InvalidityException e) {
				System.out.println(val + " - error");
			}
		}
		System.out.println();
	}
	
		
	private static void testNeoPropertyName() throws InvalidityException {
		System.out.println("_PROPERTY_NAME_");
		String[] valid = new String[] {
			"TESTLABEL"
		};
		String[] invalid = new String[] {
		};
		for (String val: valid) {
			try {
				NeoPropertyNameParam propertypath = factory.createNeoPropertyNameParam();
				propertypath.setValueFromString(val);
				String propertypath2 = propertypath.getValueAsString();
				System.out.println(val + " - " + propertypath2.equals(val) + " [" + propertypath2 + "]");
			} catch (InvalidityException e) {
				System.out.println(val + " - error");
			}
		}
		System.out.println();
	}


	private static void testPropertyPath() throws InvalidityException {
		System.out.println("_PROPERTY_PATH_");
		String[] valid = new String[] {
		};
		String[] invalid = new String[] {
			"TESTLABEL"
		};
		for (String val: valid) {
			try {
				NeoPropertyPathParam propertypath = factory.createNeoPropertyPathParam();
				propertypath.setValueFromString(val);
				String propertypath2 = propertypath.getValueAsString();
				System.out.println(val + " - " + propertypath2.equals(val) + " [" + propertypath2 + "]");
			} catch (InvalidityException e) {
				System.out.println(val + " - error");
			}
		}
		System.out.println();
	}


	private static void testElementPath() throws InvalidityException {
		System.out.println("_ELEMENT_PATH_");
		String[] valid = new String[] {
		};
		String[] invalid = new String[] {
			"TESTLABEL"
		};
		for (String val: valid) {
			try {
				NeoElementPathParam elementpath = factory.createNeoElementPathParam();
				elementpath.setValueFromString(val);
				String elementpath2 = elementpath.getValueAsString();
				System.out.println(val + " - " + elementpath2.equals(val) + " [" + elementpath2 + "]");
			} catch (InvalidityException e) {
				System.out.println(val + " - error");
			}
		}
		System.out.println();
	}
}
