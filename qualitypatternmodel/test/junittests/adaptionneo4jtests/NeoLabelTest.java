package junittests.adaptionneo4jtests;

import qualitypatternmodel.adaptionneo4j.NeoLabel;

public abstract class NeoLabelTest implements INeoLabelTest{
	public NeoLabel label = null;

	public void setUp() {

	}

	public void tearDown() {
		label = null;
	}
}
