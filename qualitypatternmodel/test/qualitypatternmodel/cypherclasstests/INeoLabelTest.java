package qualitypatternmodel.cypherclasstests;

public interface INeoLabelTest extends INeo4JTest {
	void setValueIfValid(String label);
	void setValueIfValidException(String label);
}
