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
import qualitypatternmodel.newservlets.initialisation.PatternBundle;
import qualitypatternmodel.newservlets.initialisation.RdfPatterns;
import qualitypatternmodel.newservlets.initialisation.XmlPatterns;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.EMFModelSave;

@SuppressWarnings("serial")
public class InitialisationServlet extends HttpServlet {

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

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		doGet(request, response);
	}

	@Override
	public void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
		doGet(request, response);
	}

	@Override
	public void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		doGet(request, response);
	}

	public static void initialisation(ServletContext scon) throws ServletException {
		String templates = System.getenv().get(ServletConstants.ENV_TEMPLATE_VOLUME);
		String files = System.getenv().get(ServletConstants.ENV_SHARED_VOLUME);
		ServletConstants.PATTERNFOLDER = templates == null? scon.getRealPath(ServletConstants.PATTERNFOLDER) : templates;
		ServletConstants.FILEFOLDER = files == null? scon.getRealPath(ServletConstants.FILEFOLDER) : files;

		System.out.println("Files can be found at " + ServletConstants.PATTERNFOLDER);
		ServletUtilities.log("Initializing ...");
		try {
			if (ServletConstants.GENERATE_GENERIC) {
				String genericfolder = ServletConstants.PATTERNFOLDER + "/" + ServletConstants.GENERICFOLDER;
				for (CompletePattern pattern: GenericPatterns.getAllGenericPattern()) {
					String id = pattern.getPatternId();
					if (ServletConstants.OVERRIDE || !fileExists(genericfolder, id)) {
						pattern.isValid(AbstractionLevel.GENERIC);
						EMFModelSave.exportToFile2(pattern, genericfolder, id, Constants.EXTENSION);
					}
				}
				ServletUtilities.log("generic Patterns created: " + genericfolder);
			}
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

		String xmlfolder = ServletConstants.PATTERNFOLDER + "/" + Constants.XML + "/" + ServletConstants.TEMPLATEFOLDER;
		for (PatternBundle patternbundle: XmlPatterns.getAllXmlPatternBundles()) {
			patternbundle.export(xmlfolder, ServletConstants.OVERRIDE);
		}
		ServletUtilities.log("XML Patterns created:     " + xmlfolder);

		String rdffolder = ServletConstants.PATTERNFOLDER + "/" + Constants.RDF + "/" + ServletConstants.TEMPLATEFOLDER;
		for (PatternBundle patternbundle: RdfPatterns.getAllRdfPatternBundles()) {
			patternbundle.export(rdffolder, ServletConstants.OVERRIDE);
		}
		ServletUtilities.log("RDF Patterns created:     " + rdffolder);

		String neofolder = ServletConstants.PATTERNFOLDER + "/" + Constants.NEO4J + "/" + ServletConstants.TEMPLATEFOLDER;
		for (PatternBundle patternbundle: Neo4jPatterns.getAllNeoPatternBundles()) {
			patternbundle.export(neofolder, ServletConstants.OVERRIDE);
		}
		ServletUtilities.log("NEO4J Patterns created:   " + neofolder);
	}

	private static boolean fileExists(String folder, String id) {
		String filepath = folder + "/" + id + "." + Constants.EXTENSION;
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
