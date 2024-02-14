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
		super.init(config);
        
		System.out.println(this.getServletContext().getRealPath("/" + ServletUtilities.PATTERNFOLDER + "/generic-patterns"));
//        ServletContext.getRealPath("/");

		try {
			for (CompletePattern pattern: GenericPatterns.getAllGenericPattern())
				EMFModelSave.exportToFile2(pattern, getServletContext(), ServletUtilities.PATTERNFOLDER + "/generic-patterns", pattern.getPatternId(), ServletUtilities.EXTENSION);
			for (CompletePattern pattern: XmlPatterns.getAllXmlPattern())
				EMFModelSave.exportToFile2(pattern, getServletContext(), ServletUtilities.PATTERNFOLDER + "/" + ServletUtilities.XML + "/" + ServletUtilities.TEMPLATEFOLDER, pattern.getPatternId(), ServletUtilities.EXTENSION);
			for (CompletePattern pattern: RdfPatterns.getAllRdfPattern())
				EMFModelSave.exportToFile2(pattern, getServletContext(), ServletUtilities.PATTERNFOLDER + "/" + ServletUtilities.RDF + "/" + ServletUtilities.TEMPLATEFOLDER, pattern.getPatternId(), ServletUtilities.EXTENSION);
			for (CompletePattern pattern: Neo4jPatterns.getAllNeoPattern())
				EMFModelSave.exportToFile2(pattern, getServletContext(), ServletUtilities.PATTERNFOLDER + "/" + ServletUtilities.NEO4J + "/" + ServletUtilities.TEMPLATEFOLDER, pattern.getPatternId(), ServletUtilities.EXTENSION);
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
