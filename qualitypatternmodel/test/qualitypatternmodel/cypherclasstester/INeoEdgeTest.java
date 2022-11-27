 package qualitypatternmodel.cypherclasstester;


interface INeoEdgeTest extends INeo4J, NeoElementTest {
	void setIsReturnElement();
	void getReturnInnerEdgeNodes();
	void createParameters();
	void myToString();	
}
