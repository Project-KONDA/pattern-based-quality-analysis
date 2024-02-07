package qualitypatternmodel.newservlets;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.initialisation.GenericPatterns;
import qualitypatternmodel.newservlets.initialisation.Neo4jPatterns;
import qualitypatternmodel.newservlets.initialisation.RdfPatterns;
import qualitypatternmodel.newservlets.initialisation.XmlPatterns;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelSave;

@SuppressWarnings("serial")
public class TemplateInitialisationServlet extends HttpServlet {
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		try {
			for (CompletePattern pattern: GenericPatterns.getAllGenericPattern())
				EMFModelSave.exportToFile2(pattern, "serverpatterns/generic-patterns", pattern.getName(), "pattern");
			for (CompletePattern pattern: XmlPatterns.getAllXmlPattern())
				EMFModelSave.exportToFile2(pattern, "serverpatterns/xml/abstract-patterns", pattern.getName(), "pattern");
			for (CompletePattern pattern: RdfPatterns.getAllRdfPattern())
				EMFModelSave.exportToFile2(pattern, "serverpatterns/rdf/abstract-patterns", pattern.getName(), "pattern");
			for (CompletePattern pattern: Neo4jPatterns.getAllNeoPattern())
				EMFModelSave.exportToFile2(pattern, "serverpatterns/neo/abstract-patterns", pattern.getName(), "pattern");
		} catch (IOException e) {
			new ServletException("Unable to save files.");
		} catch (InvalidityException e) {
			throw new ServletException("Invalid pattern: " + e.getMessage());
		} catch (OperatorCycleException e) {
			throw new ServletException("Invalid pattern (operator cycle): " + e.getMessage());
		} catch (MissingPatternContainerException e) {
			throw new ServletException("Invalid pattern (missing container): " + e.getMessage());
		}
	}
}
