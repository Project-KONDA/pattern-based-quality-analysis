package qualitypatternmodel.servlets;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.basex.query.QueryException;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.Database;
import qualitypatternmodel.execution.Result;
import qualitypatternmodel.execution.ServerXmlDataDatabase;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelLoad;

public class PatternApplicationServlet extends HttpServlet {
	

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {		
		String[] patternNames = request.getParameterValues("pattern-names");	
		
		String filePathDb = Util.DATABASES_PATH + Util.DATABASES_NAME + ".execution";	
		URL folderURLDb = getClass().getClassLoader().getResource(Util.DATABASES_PATH);
		URL fileURLDb = getClass().getClassLoader().getResource(filePathDb);
		
		if(fileURLDb != null && folderURLDb != null) {
			String json = "[";
			for(String patternName : patternNames) {
				
				String filePath = Util.CONCRETE_PATTERNS_PATH + patternName + ".patternstructure";	
				URL folderURL = getClass().getClassLoader().getResource(Util.CONCRETE_PATTERNS_PATH);
				URL fileURL = getClass().getClassLoader().getResource(filePath);				
								
				if(fileURL != null && folderURL != null) {										
					
					CompletePattern pattern = EMFModelLoad.loadCompletePatternAndDatabase(fileURL.toString(), fileURLDb.toString());
					Database database = pattern.getDatabase();	
					
					try {
						Result result = database.execute(pattern, null, null);
						
						json += "{";
						json += "\"Pattern\":";
						json += "\"" + patternName + "\", ";
						json += "\"Results\":";
						
						json += "[";
						for(String s : result.getSplitResult()) {
							String escaped = s;
							escaped = escaped.replace("\\", "\\\\");
						    escaped = escaped.replace("\"", "\\\"");
						    escaped = escaped.replace("\b", "\\b");
						    escaped = escaped.replace("\f", "\\f");
						    escaped = escaped.replace("\n", "\\n");
						    escaped = escaped.replace("\r", "\\r");
						    escaped = escaped.replace("\t", "\\t");
							json += "\"" + escaped +"\", ";
						}
						json += "], ";
						json = json.replace(", ]", "]");						
						json += "\"Count\":";
						json += "\"" + result.getProblemNumber() + "\", ";
						json += "\"Runtime\":";
						String time = String.format("%d min, %d sec, %d msec", 
							    TimeUnit.MILLISECONDS.toMinutes(result.getRuntime()),
							    TimeUnit.MILLISECONDS.toSeconds(result.getRuntime()) - 
							    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(result.getRuntime())),
							    result.getRuntime() - 
							    TimeUnit.MINUTES.toMillis(TimeUnit.MILLISECONDS.toMinutes(result.getRuntime())) -
							    TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(result.getRuntime()) - 
									    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(result.getRuntime())))
							);
						json += "\"" + time + "\"";
						json += "}, ";						
						
					} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException
							| QueryException e) {
						response.sendError(409);
						response.getOutputStream().println("{ \"error\": \"Pattern invalid\"}");
					}
										
					
				} else {
					response.sendError(404);
					response.getOutputStream().println("{ \"error\": \"Concrete pattern not found\"}");
				}
				
			}
			json += "]";
			json = json.replace(", ]", "]");	
			response.setCharacterEncoding("UTF-8");
			response.getWriter().println(json);
				
		} else {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Loading databases folder failed\"}");
		}
		
	}	
	
}
