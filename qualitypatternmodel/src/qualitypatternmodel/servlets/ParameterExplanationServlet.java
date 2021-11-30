package qualitypatternmodel.servlets;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.EMFModelLoad;

public class ParameterExplanationServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {		
		String result = "[\n"
				+ "{\"Parameter\":\""+Constants.PARAMETER_TYPE_TEXT+"\", \"Explanation\":\"An arbitrary string value\"},\n"
				+ "{\"Parameter\":\""+Constants.PARAMETER_TYPE_TEXT_LIST+"\", \"Explanation\":\"A list of string values\"},\n"
				+ "{\"Parameter\":\""+Constants.PARAMETER_TYPE_NUMBER+"\", \"Explanation\":\"A decimal number\"},\n"
				+ "{\"Parameter\":\""+Constants.PARAMETER_TYPE_BOOLEAN+"\", \"Explanation\":\"true or false\"},\n"
				+ "{\"Parameter\":\""+Constants.PARAMETER_TYPE_DATE+"\", \"Explanation\":\"A date consisting of day, month and year\"},\n"
				+ "{\"Parameter\":\""+Constants.PARAMETER_TYPE_TIME+"\", \"Explanation\":\"A time consisting of hours and minutes\"},\n"
				+ "{\"Parameter\":\""+Constants.PARAMETER_TYPE_DATE_TIME+"\", \"Explanation\":\"A combination of a date and a time\"},\n"
				+ "{\"Parameter\":\""+Constants.PARAMETER_TYPE_RELATION+"\", \"Explanation\":\"A relation between two XML elements in a hierarchy\"},\n"
				+ "{\"Parameter\":\""+Constants.PARAMETER_TYPE_COMPARISON+"\", \"Explanation\":\"A comparison operator to compare two values\"},\n"
				+ "{\"Parameter\":\""+Constants.PARAMETER_TYPE_PROPERTY+"\", \"Explanation\":\"A property of an XML element\"},\n"
				+ "{\"Parameter\":\""+Constants.PARAMETER_TYPE_TYPE+"\", \"Explanation\":\"A type of a comparison\"},\n"
				+ "{\"Parameter\":\""+Constants.PARAMETER_TYPE_UNTYPED+"\", \"Explanation\":\"A value of any type\"},\n"
				+ "]";
		response.getOutputStream().println(result);		
	}
	
}
