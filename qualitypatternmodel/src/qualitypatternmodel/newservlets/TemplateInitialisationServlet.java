package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.Map;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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
		initialisation(getServletContext());
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		ServletUtilities.logCall(this.getClass().getName(), path, params);
		response.getOutputStream().println(getWebsite());
		response.setStatus(HttpServletResponse.SC_OK);
	}
	
	public static void initialisation(ServletContext scon) throws ServletException {
		ServletUtilities.log("Initializing ...");
		
		String templates = System.getenv().get("TEMPLATE_VOLUME");
		String files = System.getenv().get("SHARED_VOLUME");
		ServletUtilities.PATTERNFOLDER = templates == null? scon.getRealPath("/templates") : templates;
		ServletUtilities.FILEFOLDER = files == null? scon.getRealPath("/files") : files;
		
		try {
			for (CompletePattern pattern: GenericPatterns.getAllGenericPattern()) {
				pattern.isValid(AbstractionLevel.GENERIC);
				EMFModelSave.exportToFile2(pattern, ServletUtilities.PATTERNFOLDER + "/generic-patterns", pattern.getPatternId(), ServletUtilities.EXTENSION);
			}
			ServletUtilities.log("generic Patterns created: " 
					+ ServletUtilities.PATTERNFOLDER + "/generic-patterns");
			
			for (CompletePattern pattern: XmlPatterns.getAllXmlPattern()) {
				pattern.isValid(AbstractionLevel.ABSTRACT);				
				EMFModelSave.exportToFile2(pattern, ServletUtilities.PATTERNFOLDER + "/" + ServletUtilities.XML + "/" + ServletUtilities.TEMPLATEFOLDER, pattern.getPatternId(), ServletUtilities.EXTENSION);
			}
			ServletUtilities.log("XML Patterns created:     " 
					+ ServletUtilities.PATTERNFOLDER + "/" + ServletUtilities.XML + "/" + ServletUtilities.TEMPLATEFOLDER);
			
			for (CompletePattern pattern: RdfPatterns.getAllRdfPattern()) {
				pattern.isValid(AbstractionLevel.ABSTRACT);
				EMFModelSave.exportToFile2(pattern, ServletUtilities.PATTERNFOLDER + "/" + ServletUtilities.RDF + "/" + ServletUtilities.TEMPLATEFOLDER, pattern.getPatternId(), ServletUtilities.EXTENSION);
			}
			ServletUtilities.log("RDF Patterns created:     " 
					+ ServletUtilities.PATTERNFOLDER + "/" + ServletUtilities.RDF + "/" + ServletUtilities.TEMPLATEFOLDER);
			
			for (CompletePattern pattern: Neo4jPatterns.getAllNeoPattern()) {
				pattern.isValid(AbstractionLevel.ABSTRACT);
				EMFModelSave.exportToFile2(pattern, ServletUtilities.PATTERNFOLDER + "/" + ServletUtilities.NEO4J + "/" + ServletUtilities.TEMPLATEFOLDER, pattern.getPatternId(), ServletUtilities.EXTENSION);
			}
			ServletUtilities.log("NEO4J Patterns created:   " 
					+ ServletUtilities.PATTERNFOLDER + "/" + ServletUtilities.NEO4J + "/" + ServletUtilities.TEMPLATEFOLDER);
		} catch (IOException e) {
			ServletUtilities.logError(e);
			new ServletException("Unable to save files.");
		} catch (InvalidityException e) {
			ServletUtilities.logError(e);
			throw new ServletException("Invalid pattern: " + e.getMessage(), e);
		} catch (OperatorCycleException e) {
			ServletUtilities.logError(e);
			throw new ServletException("Invalid pattern (operator cycle): " + e.getMessage());
		} catch (MissingPatternContainerException e) {
			ServletUtilities.logError(e);
			throw new ServletException("Invalid pattern (missing container): " + e.getMessage());
		} catch (Exception e) {
			ServletUtilities.logError(e);
			throw new ServletException("Unexpected Error: " + e.getMessage(), e);
		}
	}
	
	private String getWebsite() {
		return "<!doctype html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "    <title>QualityPatternModel API</title>\r\n"
				+ "    <style type=\"text/css\">\r\n"
				+ "        body {\r\n"
				+ "            font-family: Tahoma, Arial, sans-serif;\r\n"
				+ "        }\r\n"
				+ "        h1,\r\n"
				+ "        h2,\r\n"
				+ "        h3,\r\n"
				+ "        b {\r\n"
				+ "            color: white;\r\n"
				+ "            background-color: #525D76;\r\n"
				+ "        }\r\n"
				+ "        h1 {\r\n"
				+ "            font-size: 22px;\r\n"
				+ "        }\r\n"
				+ "        h2 {\r\n"
				+ "            font-size: 16px;\r\n"
				+ "        }\r\n"
				+ "        h3 {\r\n"
				+ "            font-size: 14px;\r\n"
				+ "        }\r\n"
				+ "        p {\r\n"
				+ "            font-size: 12px;\r\n"
				+ "        }\r\n"
				+ "        a {\r\n"
				+ "            color: black;\r\n"
				+ "        }\r\n"
				+ "        .line {\r\n"
				+ "            height: 1px;\r\n"
				+ "            background-color: #525D76;\r\n"
				+ "            border: none;\r\n"
				+ "        }\r\n"
				+ "    </style>"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <h1>QualityPatternModel API</h1>\r\n"
				+ "</body>\r\n"
				+ "</html>";
	}
}
