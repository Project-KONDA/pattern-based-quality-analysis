package qualitypatternmodel.cypherclasstester;

import org.junit.Test;

interface INeo4J {
	@Test
	void generateCypher(); //Maybe do this just in the Systemtests
	
	@Test
	void myToString();
	
	@Test
	void toStringTest();
}