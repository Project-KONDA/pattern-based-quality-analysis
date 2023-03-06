package qualitypatternmodel.adaptionneo4jtests;

public interface INeoLabelTest extends INeo4JTest {
	void setValueIfValid(String label);
	void setValueIfValidException(String label);
}
