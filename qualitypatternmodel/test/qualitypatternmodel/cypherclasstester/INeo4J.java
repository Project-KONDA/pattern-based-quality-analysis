package qualitypatternmodel.cypherclasstester;

import org.junit.jupiter.api.Test;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JFactory;
import qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JFactoryImpl;

interface INeo4J {
	AdaptionNeo4JFactory FACTORY = new AdaptionNeo4JFactoryImpl();
	void generateCypher(); //Maybe do this just in the Systemtests
	void toStringTest(int numbers);
}