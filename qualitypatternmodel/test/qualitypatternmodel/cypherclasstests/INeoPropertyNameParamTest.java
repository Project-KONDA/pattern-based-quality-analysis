package qualitypatternmodel.cypherclasstests;

public interface INeoPropertyNameParamTest extends INeo4JTest {
	void setValueIfValid(String property);
	void setValueIfValidException(String property);
}
