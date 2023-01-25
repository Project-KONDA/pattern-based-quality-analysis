package qualitypatternmodel.cypherclasstests;

public interface INeoLabel extends INeo4J {
	void setValueIfValid(String label);
	void setValueIfValidException(String label);
}
