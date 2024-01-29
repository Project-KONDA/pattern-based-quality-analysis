package qualitypatternmodel.newservlets;

import java.io.IOException;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.initialisation.GenericPatterns;
import qualitypatternmodel.newservlets.initialisation.Neo4jPatterns;
import qualitypatternmodel.newservlets.initialisation.RdfPatterns;
import qualitypatternmodel.newservlets.initialisation.XmlPatterns;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelSave;

public class ServerTemplateInitialisation {

	public static void main(String[] args) throws IOException, InvalidityException, OperatorCycleException, MissingPatternContainerException {
		for (CompletePattern pattern: GenericPatterns.getAllGenericPattern())
			EMFModelSave.exportToFile2(pattern, "serverpatterns/generic-patterns", pattern.getName(), "pattern");
		for (CompletePattern pattern: XmlPatterns.getAllXmlPattern())
			EMFModelSave.exportToFile2(pattern, "serverpatterns/xml/abstract-patterns", pattern.getName(), "pattern");
		for (CompletePattern pattern: RdfPatterns.getAllRdfPattern())
			EMFModelSave.exportToFile2(pattern, "serverpatterns/rdf/abstract-patterns", pattern.getName(), "pattern");
		for (CompletePattern pattern: Neo4jPatterns.getAllNeoPattern())
			EMFModelSave.exportToFile2(pattern, "serverpatterns/neo/abstract-patterns", pattern.getName(), "pattern");
	}
}
