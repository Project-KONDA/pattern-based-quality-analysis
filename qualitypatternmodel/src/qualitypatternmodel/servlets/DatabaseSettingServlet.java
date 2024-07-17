package qualitypatternmodel.servlets;

import java.io.IOException;
import java.net.URL;

import org.eclipse.emf.ecore.resource.ResourceSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.execution.ServerXmlDataDatabase;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.execution.impl.DatabasesImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

@SuppressWarnings("serial")
public class DatabaseSettingServlet extends HttpServlet {


	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String requestUrl = request.getRequestURI();
		String args = requestUrl.substring(Util.DATABASE_SETTING_ENDPOINT.length());
		String[] split = args.split("/");
		String databaseName = split[0];
		String patternName = split[1];


		String filePath = Util.DATABASES_PATH + Util.DATABASES_NAME + ".execution";
		URL folderURL = getClass().getClassLoader().getResource(Util.DATABASES_PATH);
		URL fileURL = getClass().getClassLoader().getResource(filePath);

		if(fileURL != null && folderURL != null) {
			DatabasesImpl.getInstance().clear();
			ResourceSet set = EMFModelLoad.loadDatabasesInResourceSet(fileURL.toString());
			ServerXmlDataDatabase database = null;
			for(XmlDataDatabase db : DatabasesImpl.getInstance().getXmlDatabases()) {
				if(db instanceof ServerXmlDataDatabase) {
					ServerXmlDataDatabase serverDb = (ServerXmlDataDatabase) db;
					if(serverDb.getLocalName().equals(databaseName)) {
						database = serverDb;
					}
				}
			}

			if(database == null) {
				response.sendError(404);
				response.getOutputStream().println("{ \"error\": \"Could not find database with local name '" + databaseName + "'.\"}");
			}


			String filePathPattern = Util.CONCRETE_PATTERNS_PATH + patternName + ".patternstructure";
			URL folderURLPattern = getClass().getClassLoader().getResource(Util.CONCRETE_PATTERNS_PATH);
			URL fileURLPattern = getClass().getClassLoader().getResource(filePathPattern);

			if(fileURLPattern != null && folderURLPattern != null) {
				CompletePattern pattern = EMFModelLoad.loadCompletePatternInResourceSet(fileURLPattern.toString(), set);

				pattern.setDatabase(database);

				EMFModelSave.exportToFile(pattern, folderURLPattern.toString() + patternName, "patternstructure");
				EMFModelSave.exportToFile(DatabasesImpl.getInstance(), folderURL.toString() + Util.DATABASES_NAME, "execution");
				response.getOutputStream().println("Successfully set database of pattern '" + patternName + "'.");

			} else {
				response.sendError(404);
				response.getOutputStream().println("{ \"error\": \"Loading concrete pattern folder failed\"}");
			}


		} else {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Loading databases folder failed\"}");
		}




	}
}

