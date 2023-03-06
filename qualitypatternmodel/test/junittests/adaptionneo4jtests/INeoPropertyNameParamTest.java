package junittests.adaptionneo4jtests;

public interface INeoPropertyNameParamTest extends INeo4JTest {
	void setValueIfValid(String property);
	void setValueIfValidException(String property);
}
