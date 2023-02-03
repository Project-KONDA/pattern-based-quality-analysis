package qualitypatternmodel.cypherclasstests;

public interface INeoPropertyNameParam extends INeo4J {
	public void setValueIfValid();
	void setValueIfValidException(String label);
}
