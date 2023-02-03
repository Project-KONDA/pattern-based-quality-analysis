 package qualitypatternmodel.cypherclasstests;


interface INeoEdgeTest extends INeo4JTest, INeoElementTest {
	void setIsReturnElement();
	void getReturnInnerEdgeNodes();
	void createParameters();
	void myToString();	
}
