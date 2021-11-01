package qualitypatternmodel.servlets;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.ResourceSet;

import qualitypatternmodel.execution.Databases;
import qualitypatternmodel.execution.ServerXmlDataDatabase;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.execution.XmlDatabase;
import qualitypatternmodel.execution.impl.DatabasesImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

public class DatabaseDeletionServlet extends HttpServlet {

	@Override
	public void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String requestUrl = request.getRequestURI();
		String localName = requestUrl.substring(Util.DATABASE_DELETION_ENDPOINT.length());
				
		String filePath = Util.DATABASES_PATH + Util.DATABASES_NAME + ".execution";	
		URL folderURL = getClass().getClassLoader().getResource(Util.DATABASES_PATH);
		URL fileURL = getClass().getClassLoader().getResource(filePath);		
						
		if(fileURL != null && folderURL != null) {			
			
			try {
				List<String> fileNames = Util.getListOfFileNamesInFolder(Util.CONCRETE_PATTERNS_PATH, getClass());
				EList<CompletePattern> patterns = new BasicEList<CompletePattern>();
				DatabasesImpl.getInstance().clear();
				
				ResourceSet set = EMFModelLoad.loadDatabasesInResourceSet(fileURL.toString());			
				
				for (String name: fileNames) {				
					String filePathPattern = Util.CONCRETE_PATTERNS_PATH + name + ".patternstructure";	
					URL folderURLPattern = getClass().getClassLoader().getResource(Util.CONCRETE_PATTERNS_PATH);
					URL fileURLPattern = getClass().getClassLoader().getResource(filePathPattern);						
					
					if(fileURLPattern != null && folderURLPattern != null) {						
						CompletePattern pattern = EMFModelLoad.loadCompletePatternInResourceSet(fileURLPattern.toString(), set);
						if(pattern.getDatabase() != null) {
							if(pattern.getDatabase() instanceof ServerXmlDataDatabase) {
								ServerXmlDataDatabase serverDatabase = (ServerXmlDataDatabase) pattern.getDatabase();
								if(serverDatabase.getLocalName().equals(localName)) {
									pattern.setDatabase(null);
								}
							}
						}						
						patterns.add(pattern);					
					}				
				}
				boolean found = false;
				EList<XmlDataDatabase> copy = new BasicEList<XmlDataDatabase>();
				copy.addAll(DatabasesImpl.getInstance().getXmlDatabases());
				for (XmlDataDatabase db: copy) {					
					if(db instanceof ServerXmlDataDatabase) {
						ServerXmlDataDatabase serverDatabase = (ServerXmlDataDatabase) db;
						if(serverDatabase.getLocalName().equals(localName)) {
							serverDatabase.delete();
							found = true;
						}
					}						
				}		
				if(found) {
					int i = 0;
					for (String name: fileNames) {				
						String filePathPattern = Util.CONCRETE_PATTERNS_PATH + name + ".patternstructure";	
						URL folderURLPattern = getClass().getClassLoader().getResource(Util.CONCRETE_PATTERNS_PATH);
						URL fileURLPattern = getClass().getClassLoader().getResource(filePathPattern);		
						
						if(fileURLPattern != null && folderURLPattern != null) {
							CompletePattern pattern = patterns.get(i);
							EMFModelSave.exportToFile(pattern, folderURLPattern.toString() + name, "patternstructure");					
						}			
						i++;
					}					
					EMFModelSave.exportToFile(DatabasesImpl.getInstance(), folderURL.toString() + Util.DATABASES_NAME, "execution");
					response.getOutputStream().println("Successfully deleted local database '" + localName + "'.");	
				} else {
					response.sendError(404);
					response.getOutputStream().println("{ \"error\": \"Could not find database with local name '" + localName + "'\"}");
				}
				
			} catch (URISyntaxException e) {
				response.sendError(404);
				response.getOutputStream().println("{ \"error\": \"Loading concrete pattern folder failed\"}");
			}
			
			
		} else {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Loading databases folder failed\"}");
		}
					
	}
}
