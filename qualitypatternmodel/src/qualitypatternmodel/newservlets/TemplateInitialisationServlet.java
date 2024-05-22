package qualitypatternmodel.newservlets;

import java.io.File;
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
		String templates = System.getenv().get("TEMPLATE_VOLUME");
		String files = System.getenv().get("SHARED_VOLUME");
		ServletUtilities.PATTERNFOLDER = templates == null? scon.getRealPath("/templates") : templates;
		ServletUtilities.FILEFOLDER = files == null? scon.getRealPath("/files") : files;
		
		System.out.println("Files can be found at " + ServletUtilities.PATTERNFOLDER);
		ServletUtilities.log("Initializing ...");
		try {
			String genericfolder = ServletUtilities.PATTERNFOLDER + "/generic-patterns";
			for (CompletePattern pattern: GenericPatterns.getAllGenericPattern()) {
				String id = pattern.getPatternId();
				if (!fileExists(genericfolder, id)) {
					pattern.isValid(AbstractionLevel.GENERIC);
					EMFModelSave.exportToFile2(pattern, genericfolder, id, ServletUtilities.EXTENSION);
				}
			}
			ServletUtilities.log("generic Patterns created: " + genericfolder);

			String xmlfolder = ServletUtilities.PATTERNFOLDER + "/" + ServletUtilities.XML + "/" + ServletUtilities.TEMPLATEFOLDER;
			for (CompletePattern pattern: XmlPatterns.getAllXmlPattern()) {
				String id = pattern.getPatternId();
				if (!fileExists(xmlfolder, id)) {
					pattern.isValid(AbstractionLevel.ABSTRACT);				
					EMFModelSave.exportToFile2(pattern, xmlfolder, id, ServletUtilities.EXTENSION);
				}
			}
			ServletUtilities.log("XML Patterns created:     " + xmlfolder);

			String rdffolder = ServletUtilities.PATTERNFOLDER + "/" + ServletUtilities.RDF + "/" + ServletUtilities.TEMPLATEFOLDER;
			for (CompletePattern pattern: RdfPatterns.getAllRdfPattern()) {
				String id = pattern.getPatternId();
				if (!fileExists(rdffolder, id)) {
					pattern.isValid(AbstractionLevel.ABSTRACT);
					EMFModelSave.exportToFile2(pattern, rdffolder, id, ServletUtilities.EXTENSION);
				}
			}
			ServletUtilities.log("RDF Patterns created:     " + rdffolder);
			
			String neofolder = ServletUtilities.PATTERNFOLDER + "/" + ServletUtilities.NEO4J + "/" + ServletUtilities.TEMPLATEFOLDER;
			for (CompletePattern pattern: Neo4jPatterns.getAllNeoPattern()) {
				String id = pattern.getPatternId();
				if (!fileExists(neofolder, id)) {
					pattern.isValid(AbstractionLevel.ABSTRACT);
					EMFModelSave.exportToFile2(pattern, neofolder, id, ServletUtilities.EXTENSION);
				}
			}
			ServletUtilities.log("NEO4J Patterns created:   " + neofolder);
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
	
	private static boolean fileExists(String folder, String id) {
		String filepath = folder + "/" + id + "." + ServletUtilities.EXTENSION;
		File file = new File(filepath);
	    return file.exists();
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
