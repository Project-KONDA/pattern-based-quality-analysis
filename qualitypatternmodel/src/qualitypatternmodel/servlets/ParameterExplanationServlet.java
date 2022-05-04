package qualitypatternmodel.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qualitypatternmodel.utility.Constants;

public class ParameterExplanationServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {		
		String result = "["
				+ "{\"Parameter\":\""+Constants.PARAMETER_TYPE_TEXT+"\", \"Explanation\":\"An arbitrary string value\"}, "
				+ "{\"Parameter\":\""+Constants.PARAMETER_TYPE_TEXT_LIST+"\", \"Explanation\":\"A list of string values\"}, "
				+ "{\"Parameter\":\""+Constants.PARAMETER_TYPE_NUMBER+"\", \"Explanation\":\"A decimal number\"}, "
				+ "{\"Parameter\":\""+Constants.PARAMETER_TYPE_BOOLEAN+"\", \"Explanation\":\"true or false\"}, "
				+ "{\"Parameter\":\""+Constants.PARAMETER_TYPE_DATE+"\", \"Explanation\":\"A date consisting of day, month and year\"}, "
				+ "{\"Parameter\":\""+Constants.PARAMETER_TYPE_TIME+"\", \"Explanation\":\"A time consisting of hours and minutes\"}, "
				+ "{\"Parameter\":\""+Constants.PARAMETER_TYPE_DATE_TIME+"\", \"Explanation\":\"A combination of a date and a time\"}, "
				+ "{\"Parameter\":\""+Constants.PARAMETER_TYPE_RELATION+"\", \"Explanation\":\"A relation between two XML elements in a hierarchy\"}, "
				+ "{\"Parameter\":\""+Constants.PARAMETER_TYPE_COMPARISON+"\", \"Explanation\":\"A comparison operator to compare two values\"}, "
				+ "{\"Parameter\":\""+Constants.PARAMETER_TYPE_PROPERTY+"\", \"Explanation\":\"A property of an XML element\"}, "
				+ "{\"Parameter\":\""+Constants.PARAMETER_TYPE_TYPE+"\", \"Explanation\":\"A type of a comparison\"}, "
				+ "{\"Parameter\":\""+Constants.PARAMETER_TYPE_UNTYPED+"\", \"Explanation\":\"A value of any type\"}"
				+ "]";
		response.getOutputStream().println(result);		
	}
	
}
