package junittests.adaptionneo4jtests;

import qualitypatternmodel.adaptionneo4j.Adaptionneo4jFactory;
import qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jFactoryImpl;

interface INeo4JTest {
	Adaptionneo4jFactory FACTORY = new Adaptionneo4jFactoryImpl();
	void generateCypher();
	void myToString();
	void toStringT();
}