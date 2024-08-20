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
		
		String call = getCall(path, params);
		response.getOutputStream().println(getWebsite(call));
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
//	      SHARED_VOLUME: /shared
		String files = System.getenv().get(ServletConstants.ENV_FILE_VOLUME);
		if (files != null)
			ServletConstants.FILE_VOLUME = files;
		else 
			ServletConstants.FILE_VOLUME = scon.getRealPath(ServletConstants.FILE_VOLUME);
//	      UPLOAD_FOLDER: /shared/uploads
		String upload = System.getenv().get(ServletConstants.ENV_UPLOAD_FOLDER);
		if (upload != null)
			ServletConstants.UPLOAD_FOLDER = upload;
		else 
			ServletConstants.UPLOAD_FOLDER = scon.getRealPath(ServletConstants.UPLOAD_FOLDER);
//	      TEMPLATE_VOLUME: /templates
		String templates = System.getenv().get(ServletConstants.ENV_PATTERN_VOLUME);
		if (templates != null)
			ServletConstants.PATTERN_VOLUME = templates;
		else 
			ServletConstants.PATTERN_VOLUME = scon.getRealPath(ServletConstants.PATTERN_VOLUME);
//	      LOGFILE: qpm-logfile.log
		String logfile = System.getenv().get(ServletConstants.ENV_LOGFILE);
		if (logfile != null)
			ServletConstants.LOGFILE = logfile;
//	      SAVEFILE: savefile.txt
		String savefile = System.getenv().get(ServletConstants.ENV_SAVEFILE);
		if (savefile != null)
			ServletConstants.SAVEFILE = savefile;
//	      SAVE_LOG_IN_SHARED: true
		String log_in_files = System.getenv().get(ServletConstants.ENV_LOG_IN_FILE_VOLUME);
		if (log_in_files != null)
			ServletConstants.LOG_IN_FILE_VOLUME = log_in_files.equals("true");
//	      FILL_VALUES: false
		String values = System.getenv().get(ServletConstants.ENV_FILL_VALUES);
		if (values != null)
			ServletConstants.FILL_VALUES = values.equals("true");
//	      DEFAULT_VARIANTS: true
		String default_variants = System.getenv().get(ServletConstants.ENV_DEFAULT_VARIANTS);
		if (default_variants != null)
			ServletConstants.DEFAULT_VARIANTS = default_variants.equals("true");
//	      OLD_VARIANTS: false
		String old_variants = System.getenv().get(ServletConstants.ENV_OLD_VARIANTS);
		if (old_variants != null)
			ServletConstants.OLD_VARIANTS = old_variants.equals("true");
//	      OVERRIDE_VARIANTS: true
		String override = System.getenv().get(ServletConstants.ENV_OVERRIDE_VARIANTS);
		if (override != null)
			ServletConstants.OVERRIDE_VARIANTS = override.equals("true");
//	      GENERATE_GENERIC: false
		String generate_generic = System.getenv().get(ServletConstants.ENV_GENERATE_GENERIC);
		if (generate_generic != null)
			ServletConstants.GENERATE_GENERIC = generate_generic.equals("true");
//	      VALUE_AS_JSON: true
		String value_as_json = System.getenv().get(ServletConstants.ENV_VALUE_AS_JSON);
		if (value_as_json != null)
			ServletConstants.VALUE_AS_JSON = value_as_json.equals("true");

		System.out.println("Files can be found at " + ServletConstants.PATTERN_VOLUME);
		ServletUtilities.log("Initializing ...");
		ServletUtilities.log("Environmental Variable FILE_VOLUME:        " + files);
		ServletUtilities.log("Environmental Variable UPLOAD_FOLDER:      " + upload);
		ServletUtilities.log("Environmental Variable PATTERN_VOLUME:     " + templates);
		ServletUtilities.log("Environmental Variable LOGFILE:            " + logfile);
		ServletUtilities.log("Environmental Variable SAVEFILE:           " + savefile);
		ServletUtilities.log("Environmental Variable LOG_IN_FILE_VOLUME: " + log_in_files);
		ServletUtilities.log("Environmental Variable FILL_VALUES:        " + values);
		ServletUtilities.log("Environmental Variable DEFAULT_VARIANTS:   " + default_variants);
		ServletUtilities.log("Environmental Variable OLD_VARIANTS:       " + old_variants);
		ServletUtilities.log("Environmental Variable OVERRIDE_VARIANTS:  " + override);
		ServletUtilities.log("Environmental Variable GENERATE_GENERIC:   " + generate_generic);
		ServletUtilities.log("Environmental Variable VALUE_AS_JSON:      " + value_as_json);

		try {
			if (ServletConstants.GENERATE_GENERIC) {
				String genericfolder = ServletConstants.PATTERN_VOLUME + "/" + ServletConstants.GENERICFOLDER;
				for (CompletePattern pattern: GenericPatterns.getAllGenericPattern()) {
					String id = pattern.getPatternId();
					if (ServletConstants.OVERRIDE_VARIANTS || !fileExists(genericfolder, id)) {
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

		String xmlfolder = ServletConstants.PATTERN_VOLUME + "/" + Constants.XML + "/" + ServletConstants.TEMPLATEFOLDER;
		for (PatternBundle patternbundle: XmlPatterns.getAllXmlPatternBundles()) {
			patternbundle.export(xmlfolder, ServletConstants.OVERRIDE_VARIANTS);
		}
		ServletUtilities.log("XML Patterns created:     " + xmlfolder);

		String rdffolder = ServletConstants.PATTERN_VOLUME + "/" + Constants.RDF + "/" + ServletConstants.TEMPLATEFOLDER;
		for (PatternBundle patternbundle: RdfPatterns.getAllRdfPatternBundles()) {
			patternbundle.export(rdffolder, ServletConstants.OVERRIDE_VARIANTS);
		}
		ServletUtilities.log("RDF Patterns created:     " + rdffolder);

		String neofolder = ServletConstants.PATTERN_VOLUME + "/" + Constants.NEO4J + "/" + ServletConstants.TEMPLATEFOLDER;
		for (PatternBundle patternbundle: Neo4jPatterns.getAllNeoPatternBundles()) {
			patternbundle.export(neofolder, ServletConstants.OVERRIDE_VARIANTS);
		}
		ServletUtilities.log("NEO4J Patterns created:   " + neofolder);
	}

	private static boolean fileExists(String folder, String id) {
		String filepath = folder + "/" + id + "." + Constants.EXTENSION;
		File file = new File(filepath);
	    return file.exists();
	}

	private String getCall(String path, Map<String, String[]> params) {
		Boolean pathnull = path == null || "/".equals(path);
		Boolean paramsnull = params == null || params.isEmpty();
		
		if (pathnull && paramsnull)
			return null;
		return (pathnull? "/" : path) + (paramsnull? "" : " " + ServletUtilities.mapToString(params));
	}

	private String getWebsite(String call) {
		String result = "<!doctype html>\r\n"
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
				+ "    <h1>QualityPatternModel API</h1>\r\n";
		if (call != null)
			result += "    <h2>404 Page not found : qualitypatternmodel" + call + "</h2>\r\n";
		result += "</body>\r\n"
				+ "</html>";
		return result;
	}
}
