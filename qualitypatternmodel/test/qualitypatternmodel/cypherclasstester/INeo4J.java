package qualitypatternmodel.cypherclasstester;

import qualitypatternmodel.adaptionneo4j.Adaptionneo4jFactory;
import qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jFactoryImpl;

interface INeo4J {
	Adaptionneo4jFactory FACTORY = new Adaptionneo4jFactoryImpl();
	void generateCypher();
}