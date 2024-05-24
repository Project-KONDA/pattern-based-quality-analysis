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
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelSave;

@SuppressWarnings("serial")
public class TemplateInitialisationServlet extends HttpServlet {
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		try {
			for (CompletePattern pattern: GenericPatterns.getAllGenericPattern()) {
				pattern.isValid(AbstractionLevel.GENERIC);
				EMFModelSave.exportToFile2(pattern, getServletContext(), ServletUtilities.PATTERNFOLDER + "/generic-patterns", pattern.getPatternId(), ServletUtilities.EXTENSION);
			}
				
			System.out.println("generic Patterns created successfully in: " + this.getServletContext().getRealPath("/" + ServletUtilities.PATTERNFOLDER + "/generic-patterns"));
			for (CompletePattern pattern: XmlPatterns.getAllXmlPattern()) {
				pattern.isValid(AbstractionLevel.ABSTRACT);				
				EMFModelSave.exportToFile2(pattern, getServletContext(), ServletUtilities.PATTERNFOLDER + "/" + ServletUtilities.XML + "/" + ServletUtilities.TEMPLATEFOLDER, pattern.getPatternId(), ServletUtilities.EXTENSION);
			}
			System.out.println("XML-specific Patterns created successfully in: " + this.getServletContext().getRealPath("/" + ServletUtilities.PATTERNFOLDER + "/" + ServletUtilities.XML + "/" + ServletUtilities.TEMPLATEFOLDER));
			for (CompletePattern pattern: RdfPatterns.getAllRdfPattern()) {
				pattern.isValid(AbstractionLevel.ABSTRACT);
				EMFModelSave.exportToFile2(pattern, getServletContext(), ServletUtilities.PATTERNFOLDER + "/" + ServletUtilities.RDF + "/" + ServletUtilities.TEMPLATEFOLDER, pattern.getPatternId(), ServletUtilities.EXTENSION);
			}
			System.out.println("RDF-specific Patterns created successfully in: " + this.getServletContext().getRealPath("/" + ServletUtilities.PATTERNFOLDER + "/" + ServletUtilities.RDF + "/" + ServletUtilities.TEMPLATEFOLDER));
			for (CompletePattern pattern: Neo4jPatterns.getAllNeoPattern()) {
				pattern.isValid(AbstractionLevel.ABSTRACT);
				EMFModelSave.exportToFile2(pattern, getServletContext(), ServletUtilities.PATTERNFOLDER + "/" + ServletUtilities.NEO4J + "/" + ServletUtilities.TEMPLATEFOLDER, pattern.getPatternId(), ServletUtilities.EXTENSION);
			}
			System.out.println("NEO4J-specific Patterns created successfully in: " + this.getServletContext().getRealPath("/" + ServletUtilities.PATTERNFOLDER + "/" + ServletUtilities.NEO4J + "/" + ServletUtilities.TEMPLATEFOLDER));
		} catch (IOException e) {
			new ServletException("Unable to save files.");
		} catch (InvalidityException e) {
			e.printStackTrace();
			throw new ServletException("Invalid pattern: " + e.getMessage());
		} catch (OperatorCycleException e) {
			e.printStackTrace();
			throw new ServletException("Invalid pattern (operator cycle): " + e.getMessage());
		} catch (MissingPatternContainerException e) {
			e.printStackTrace();
			throw new ServletException("Invalid pattern (missing container): " + e.getMessage());
		}
	}
}
