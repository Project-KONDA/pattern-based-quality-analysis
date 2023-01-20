 package qualitypatternmodel.cypherclasstester;


interface INeoEdgeTest extends INeo4J, INeoElementTest {
	void setIsReturnElement();
	void getReturnInnerEdgeNodes();
	void createParameters();
	void myToString();	
}
