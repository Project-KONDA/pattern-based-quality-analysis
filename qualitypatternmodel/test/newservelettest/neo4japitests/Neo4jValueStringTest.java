package newservelettest.neo4japitests;

import qualitypatternmodel.adaptionneo4j.Adaptionneo4jFactory;
import qualitypatternmodel.adaptionneo4j.NeoComplexEdge;
import qualitypatternmodel.adaptionneo4j.NeoEdgeLabelParam;
import qualitypatternmodel.adaptionneo4j.NeoElementPathParam;
import qualitypatternmodel.adaptionneo4j.NeoNodeLabelsParam;
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


	private static void testNodeLabels() throws InvalidityException {
		String[] vals = new String[] {};
		for (String val: vals) {
			NeoNodeLabelsParam edgelabel = factory.createNeoNodeLabelsParam();
			edgelabel.setValueFromString(val);
			System.out.println(val + " - " + edgelabel.getValueAsString().equals(val));
		}
	}


	private static void testEdgeLabel() throws InvalidityException {
		String[] vals = new String[] {};
		for (String val: vals) {
			NeoEdgeLabelParam edgelabel = factory.createNeoEdgeLabelParam();
			edgelabel.setValueFromString(val);
			System.out.println(val + " - " + edgelabel.getValueAsString().equals(val));
		}
	}


	private static void testSimpleEdge() throws InvalidityException {
		String[] vals = new String[] {};
		for (String val: vals) {
			NeoSimpleEdge simplepart = factory.createNeoSimpleEdge();
			simplepart.setValueFromString(val);
			System.out.println(val + " - " + simplepart.getValueAsString().equals(val));
		}
	}


	private static void testComplexEdge() throws InvalidityException {
		String[] vals = new String[] {};
		for (String val: vals) {
			NeoComplexEdge complexpart = factory.createNeoComplexEdge();
			complexpart.setValueFromString(val);
			System.out.println(val + " - " + complexpart.getValueAsString().equals(val));
		}
	}
	
		
	private static void testNeoPropertyName() throws InvalidityException {
		String[] vals = new String[] {};
		for (String val: vals) {
			NeoPropertyPathParam propertypath = factory.createNeoPropertyPathParam();
			propertypath.setValueFromString(val);
			System.out.println(val + " - " + propertypath.getValueAsString().equals(val));
		}
	}


	private static void testPropertyPath() throws InvalidityException {
		String[] vals = new String[] {};
		for (String val: vals) {
			NeoPropertyPathParam propertypath = factory.createNeoPropertyPathParam();
			propertypath.setValueFromString(val);
			System.out.println(val + " - " + propertypath.getValueAsString().equals(val));
		}
	}


	private static void testElementPath() throws InvalidityException {
		String[] vals = new String[] {};
		for (String val: vals) {
			NeoElementPathParam elementpath = factory.createNeoElementPathParam();
			elementpath.setValueFromString(val);
			System.out.println(val + " - " + elementpath.getValueAsString().equals(val));
		}
	}
}
