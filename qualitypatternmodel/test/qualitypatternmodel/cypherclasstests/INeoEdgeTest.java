 package qualitypatternmodel.cypherclasstests;


interface INeoEdgeTest extends INeo4J, INeoElementTest {
	void setIsReturnElement();
	void getReturnInnerEdgeNodes();
	void createParameters();
	void myToString();	
}
