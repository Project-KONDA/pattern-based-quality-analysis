package qualitypatternmodel.cypherclasstests;

public interface INeoPropertyNameParamTest extends INeo4JTest {
	public void setValueIfValid();
	void setValueIfValidException(String property);
}
