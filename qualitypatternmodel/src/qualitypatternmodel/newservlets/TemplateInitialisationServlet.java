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
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		ServletUtilities.log(getServletContext(), this.getClass().getName(), path, params);
		response.getOutputStream().println(getWebsite());
		response.setStatus(HttpServletResponse.SC_OK);
	}
	
	private String getWebsite() {
		return "<!doctype html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "\r\n"
				+ "<head>\r\n"
				+ "    <title>QualityPatternModel API</title>\r\n"
				+ "    <style type=\"text/css\">\r\n"
				+ "        body {\r\n"
				+ "            font-family: Tahoma, Arial, sans-serif;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        h1,\r\n"
				+ "        h2,\r\n"
				+ "        h3,\r\n"
				+ "        b {\r\n"
				+ "            color: white;\r\n"
				+ "            background-color: #525D76;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        h1 {\r\n"
				+ "            font-size: 22px;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        h2 {\r\n"
				+ "            font-size: 16px;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        h3 {\r\n"
				+ "            font-size: 14px;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        p {\r\n"
				+ "            font-size: 12px;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        a {\r\n"
				+ "            color: black;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        .line {\r\n"
				+ "            height: 1px;\r\n"
				+ "            background-color: #525D76;\r\n"
				+ "            border: none;\r\n"
				+ "        }\r\n"
				+ "    </style>"
				+ "</head>\r\n"
				+ "\r\n"
				+ "<body>\r\n"
				+ "    <h1>QualityPatternModel API</h1>\r\n"
				+ "</body>\r\n"
				+ "\r\n"
				+ "</html>";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("Creating Server files at: " + getServletContext().getRealPath(""));
		initialisation(getServletContext());
	}
	
	public static void initialisation(ServletContext servletContext) throws ServletException {
		ServletUtilities.log(servletContext, "Initializing ...");
		try {
			for (CompletePattern pattern: GenericPatterns.getAllGenericPattern()) {
				pattern.isValid(AbstractionLevel.GENERIC);
				EMFModelSave.exportToFile2(pattern, servletContext, ServletUtilities.PATTERNFOLDER + "/generic-patterns", pattern.getPatternId(), ServletUtilities.EXTENSION);
			}
			ServletUtilities.log(servletContext, "generic Patterns created successfully in: " + servletContext.getRealPath("/" + ServletUtilities.PATTERNFOLDER + "/generic-patterns"));
			
			for (CompletePattern pattern: XmlPatterns.getAllXmlPattern()) {
				pattern.isValid(AbstractionLevel.ABSTRACT);				
				EMFModelSave.exportToFile2(pattern, servletContext, ServletUtilities.PATTERNFOLDER + "/" + ServletUtilities.XML + "/" + ServletUtilities.TEMPLATEFOLDER, pattern.getPatternId(), ServletUtilities.EXTENSION);
			}
			ServletUtilities.log(servletContext, "XML-specific Patterns created successfully in: " + servletContext.getRealPath("/" + ServletUtilities.PATTERNFOLDER + "/" + ServletUtilities.XML + "/" + ServletUtilities.TEMPLATEFOLDER));
			
			for (CompletePattern pattern: RdfPatterns.getAllRdfPattern()) {
				pattern.isValid(AbstractionLevel.ABSTRACT);
				EMFModelSave.exportToFile2(pattern, servletContext, ServletUtilities.PATTERNFOLDER + "/" + ServletUtilities.RDF + "/" + ServletUtilities.TEMPLATEFOLDER, pattern.getPatternId(), ServletUtilities.EXTENSION);
			}
			ServletUtilities.log(servletContext, "RDF-specific Patterns created successfully in: " + servletContext.getRealPath("/" + ServletUtilities.PATTERNFOLDER + "/" + ServletUtilities.RDF + "/" + ServletUtilities.TEMPLATEFOLDER));
			
			for (CompletePattern pattern: Neo4jPatterns.getAllNeoPattern()) {
				pattern.isValid(AbstractionLevel.ABSTRACT);
				EMFModelSave.exportToFile2(pattern, servletContext, ServletUtilities.PATTERNFOLDER + "/" + ServletUtilities.NEO4J + "/" + ServletUtilities.TEMPLATEFOLDER, pattern.getPatternId(), ServletUtilities.EXTENSION);
			}
			ServletUtilities.log(servletContext, "NEO4J-specific Patterns created successfully in: " + servletContext.getRealPath("/" + ServletUtilities.PATTERNFOLDER + "/" + ServletUtilities.NEO4J + "/" + ServletUtilities.TEMPLATEFOLDER));
		} catch (IOException e) {
			ServletUtilities.log(servletContext, e.getStackTrace());
			new ServletException("Unable to save files.");
		} catch (InvalidityException e) {
			ServletUtilities.log(servletContext, e.getStackTrace());
			throw new ServletException("Invalid pattern: " + e.getMessage());
		} catch (OperatorCycleException e) {
			ServletUtilities.log(servletContext, e.getStackTrace());
			throw new ServletException("Invalid pattern (operator cycle): " + e.getMessage());
		} catch (MissingPatternContainerException e) {
			ServletUtilities.log(servletContext, e.getStackTrace());
			throw new ServletException("Invalid pattern (missing container): " + e.getMessage());
		} catch (Exception e) {
			ServletUtilities.log(servletContext, e.getStackTrace());
			throw new ServletException("Unexpected Error: " + e.getMessage());
		}
	}
}
