package qualitypatternmodel.cypherclasstester;

import java.util.LinkedList;
import java.util.List;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.NeoDirection;
import qualitypatternmodel.adaptionNeo4J.NeoLabel;
import qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JFactoryImpl;
import qualitypatternmodel.adaptionNeo4J.impl.NeoAttributeEdgeImpl;
import qualitypatternmodel.adaptionNeo4J.impl.NeoAttributePathParamImpl;
import qualitypatternmodel.adaptionNeo4J.impl.NeoComplexEdgeImpl;
import qualitypatternmodel.adaptionNeo4J.impl.NeoInEdgeTargedNodeImpl;
import qualitypatternmodel.adaptionNeo4J.impl.NeoLabelImpl;
import qualitypatternmodel.adaptionNeo4J.impl.NeoSimpleEdgeImpl;

public class EdgeTest {

	public static void main(String[] args) {
		//Neo Edge
		//SimpleEdge
		generateSimpleEdgeBlank();
		generateSimpleEdgeWithLabels();
		generateSimpleEdgeWithDirections();
		
		//ComplexEdge
		
		//NeoEdge
		
		//NeoAttributeEdge
		//Without NeoPath
		generateSimpleAttributeEdge();
		
		//With NeoPath
		generateAttributeEdgeWithSimpleNeoPath();
		generateAttributeEdgeWithComplexEdgeNeoPath();
		generateAttributeEdgeWithComplexEdgeNeoPathComplexNodesLabels();
		//generateAttributeEdgeWithComplexEdgeNeoPathComplexNodesLabelsTestToMuchNodes
	}
	
	private static void generateSimpleEdgeBlank() {
		AdaptionNeo4JFactoryImpl factory = new AdaptionNeo4JFactoryImpl();
		NeoSimpleEdgeImpl nse = (NeoSimpleEdgeImpl) factory.createNeoSimpleEdge();
		try {
			System.out.println("NeoSimpleEdgeTest -- Blank Edge");
			System.out.println(nse.generateCypher());
			System.out.println("");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	private static void generateSimpleEdgeWithLabels() {
		AdaptionNeo4JFactoryImpl factory = new AdaptionNeo4JFactoryImpl();
		NeoSimpleEdgeImpl nse = (NeoSimpleEdgeImpl) factory.createNeoSimpleEdge();
		NeoLabel l = factory.createNeoLabel();
		l.setNeoLabel("PLACE_OF_ISSUE");
		nse.setNeoEdgeLabel(l);		
		try {
			System.out.println("NeoSimpleEdgeTest -- Edge With Labels");
			System.out.println(nse.generateCypher());
			System.out.println("");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void generateSimpleEdgeWithDirections() {
		AdaptionNeo4JFactoryImpl factory = new AdaptionNeo4JFactoryImpl();
		NeoSimpleEdgeImpl nse = (NeoSimpleEdgeImpl) factory.createNeoSimpleEdge();
		NeoLabel l = factory.createNeoLabel();
		l.setNeoLabel("PLACE_OF_ISSUE");
		nse.setNeoEdgeLabel(l);
		nse.setNeoDirection(NeoDirection.IMPLICIT);
		
		NeoSimpleEdgeImpl nse2 = (NeoSimpleEdgeImpl) factory.createNeoSimpleEdge();
		nse2.setNeoEdgeLabel(l);
		nse2.setNeoDirection(NeoDirection.RIGHT);
		
		NeoSimpleEdgeImpl nse3 = (NeoSimpleEdgeImpl) factory.createNeoSimpleEdge();
		nse3.setNeoEdgeLabel(l);
		nse3.setNeoDirection(NeoDirection.LEFT);
		
		try {
			System.out.println("NeoSimpleEdgeTest -- Edge With Directions");
			System.out.println(nse.generateCypher());
			System.out.println(nse2.generateCypher());
			System.out.println(nse3.generateCypher());
			System.out.println("");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void generateSimpleAttributeEdge() {
		AdaptionNeo4JFactoryImpl factory = new AdaptionNeo4JFactoryImpl();
		NeoAttributeEdgeImpl nan = (NeoAttributeEdgeImpl) factory.createNeoAttributeEdge();
		NeoAttributePathParamImpl napp = (NeoAttributePathParamImpl) factory.createNeoAttributePathParam();
		nan.setNeoAttributePathParam(napp);
		try {
			System.out.println("NeoAttributeEdgeTest -- Test without NeoAttributePathImpl");
			System.out.println("Between here and the next point nothing should be printed -->");
			System.out.print(nan.generateCypher());
			System.out.println("<-- Up here nothing should be have printed");
			System.out.println("");
		} catch (Exception e) {}
	}
	
	public static void generateAttributeEdgeWithSimpleNeoPath() {
		AdaptionNeo4JFactoryImpl factory = new AdaptionNeo4JFactoryImpl();
		NeoAttributeEdgeImpl nan = (NeoAttributeEdgeImpl) factory.createNeoAttributeEdge();
		NeoAttributePathParamImpl napp = (NeoAttributePathParamImpl) factory.createNeoAttributePathParam();
		napp.setNeoPath(factory.createNeoSimpleEdge());
		nan.setNeoAttributePathParam(napp);
	
		try {
			System.out.println("NeoAttributeEdgeTest -- With SimpleEdge in NeoAttributeEdge");
			System.out.println(nan.generateCypher());
			System.out.println("");
		} catch (Exception e) {}
	}
	
	public static void generateAttributeEdgeWithComplexEdgeNeoPath() {
		AdaptionNeo4JFactoryImpl factory = new AdaptionNeo4JFactoryImpl();
		NeoAttributeEdgeImpl nan = (NeoAttributeEdgeImpl) factory.createNeoAttributeEdge();
		NeoAttributePathParamImpl napp = (NeoAttributePathParamImpl) factory.createNeoAttributePathParam();
		NeoComplexEdgeImpl nce = (NeoComplexEdgeImpl) factory.createNeoComplexEdge();
		List<NeoSimpleEdgeImpl> s = new LinkedList<NeoSimpleEdgeImpl>();
		s.add((NeoSimpleEdgeImpl) factory.createNeoSimpleEdge());
		s.add((NeoSimpleEdgeImpl) factory.createNeoSimpleEdge());
		s.add((NeoSimpleEdgeImpl) factory.createNeoSimpleEdge());
		s.add((NeoSimpleEdgeImpl) factory.createNeoSimpleEdge());
		nce.eSet(AdaptionNeo4JPackage.NEO_COMPLEX_EDGE__NEO_PATH, s);
	
		napp.setNeoPath(nce);
		nan.setNeoAttributePathParam(napp);
		
		try {
			System.out.println("NeoAttributeEdgeTest -- With ComplexEdge in NeoAttributeEdge");
			System.out.println(nan.generateCypher());
			System.out.println("");
		} catch (Exception e) {}
	}
	
	public static void generateAttributeEdgeWithComplexEdgeNeoPathComplexNodesLabels() {
		AdaptionNeo4JFactoryImpl factory = new AdaptionNeo4JFactoryImpl();
		NeoAttributeEdgeImpl nan = (NeoAttributeEdgeImpl) factory.createNeoAttributeEdge();
		NeoAttributePathParamImpl napp = (NeoAttributePathParamImpl) factory.createNeoAttributePathParam();
		NeoComplexEdgeImpl nce = (NeoComplexEdgeImpl) factory.createNeoComplexEdge();
		List<NeoSimpleEdgeImpl> s = new LinkedList<NeoSimpleEdgeImpl>();
		s.add((NeoSimpleEdgeImpl) factory.createNeoSimpleEdge());
		s.add((NeoSimpleEdgeImpl) factory.createNeoSimpleEdge());
		s.add((NeoSimpleEdgeImpl) factory.createNeoSimpleEdge());
		s.add((NeoSimpleEdgeImpl) factory.createNeoSimpleEdge());
		nce.eSet(AdaptionNeo4JPackage.NEO_COMPLEX_EDGE__NEO_PATH, s);
		
		List<NeoLabelImpl> labelList = new LinkedList<NeoLabelImpl>();
		List<NeoInEdgeTargedNodeImpl> l = new LinkedList<NeoInEdgeTargedNodeImpl>();		
		NeoLabelImpl la;
		
		//First Inner Edge With Label
		NeoInEdgeTargedNodeImpl nietn = (NeoInEdgeTargedNodeImpl) factory.createNeoInEdgeTargedNode();
		nietn.setSourceEdge(s.get(0));
		la = (NeoLabelImpl) factory.createNeoLabel();
		la.setNeoLabel("A");
		labelList = new LinkedList<NeoLabelImpl>();
		labelList.add(la);
		nietn.eSet(AdaptionNeo4JPackage.NEO_NODE__NEO_NEO_LABELS, labelList);
		l.add(nietn);
		
		//Second Inner Edge With Label
		nietn = (NeoInEdgeTargedNodeImpl) factory.createNeoInEdgeTargedNode();
		nietn.setSourceEdge(s.get(1));
		la = (NeoLabelImpl) factory.createNeoLabel();
		la.setNeoLabel("B");
		labelList = new LinkedList<NeoLabelImpl>();
		labelList.add(la);
		nietn.eSet(AdaptionNeo4JPackage.NEO_NODE__NEO_NEO_LABELS, labelList);
		l.add(nietn);
		
		//Third Inner Edge With Label
		nietn = (NeoInEdgeTargedNodeImpl) factory.createNeoInEdgeTargedNode();
		nietn.setSourceEdge(s.get(2));
		la = (NeoLabelImpl) factory.createNeoLabel();
		la.setNeoLabel("C");
		labelList = new LinkedList<NeoLabelImpl>();
		labelList.add(la);
		nietn.eSet(AdaptionNeo4JPackage.NEO_NODE__NEO_NEO_LABELS, labelList);
		l.add(nietn);
		
		//Plugging everything together
		nce.eSet(AdaptionNeo4JPackage.NEO_COMPLEX_EDGE__NEO_TARGED_EDGE, l);
		napp.setNeoPath(nce);
		nan.setNeoAttributePathParam(napp);
	
		try {
			System.out.println("NeoAttributeEdgeTest -- With ComplexEdge and Nodes in between in NeoAttributeEdge");
			System.out.println(nan.generateCypher());
			System.out.println("");
		} catch (Exception e) {}
	}
	
//	public static void generateAttributeEdgeWithComplexEdgeNeoPathComplexNodesLabelsTestToMuchNodes() {
//		AdaptionNeo4JFactoryImpl factory = new AdaptionNeo4JFactoryImpl();
//		NeoAttributeEdgeImpl nan = (NeoAttributeEdgeImpl) factory.createNeoAttributeEdge();
//		NeoAttributePathParamImpl napp = (NeoAttributePathParamImpl) factory.createNeoAttributePathParam();
//		NeoComplexEdgeImpl nce = (NeoComplexEdgeImpl) factory.createNeoComplexEdge();
//		List<NeoSimpleEdgeImpl> s = new LinkedList<NeoSimpleEdgeImpl>();
//		s.add((NeoSimpleEdgeImpl) factory.createNeoSimpleEdge());
//		s.add((NeoSimpleEdgeImpl) factory.createNeoSimpleEdge());
//		s.add((NeoSimpleEdgeImpl) factory.createNeoSimpleEdge());
//		s.add((NeoSimpleEdgeImpl) factory.createNeoSimpleEdge());
//		nce.eSet(AdaptionNeo4JPackage.NEO_COMPLEX_EDGE__NEO_PATH, s);
//		
//		List<NeoInEdgeTargedNodeImpl> l = new LinkedList<NeoInEdgeTargedNodeImpl>();		
//		NeoInEdgeTargedNodeImpl nietn = (NeoInEdgeTargedNodeImpl) factory.createNeoInEdgeTargedNode();
//		l.add(nietn);
//		nietn = (NeoInEdgeTargedNodeImpl) factory.createNeoInEdgeTargedNode();
//		l.add(nietn);
//		nietn = (NeoInEdgeTargedNodeImpl) factory.createNeoInEdgeTargedNode();
//		l.add(nietn);
//		nce.eSet(AdaptionNeo4JPackage.NEO_COMPLEX_EDGE__NEO_TARGED_EDGE, l);
//		napp.setNeoPath(nce);
//		nan.setNeoAttributePathParam(napp);
//	
//		try {
//			System.out.println("NeoAttributeEdgeTest -- With ComplexEdge in NeoAttributeEdge");
//			System.out.println(nan.generateCypher());
//			System.out.println("");
//		} catch (Exception e) {}
//	}
}
