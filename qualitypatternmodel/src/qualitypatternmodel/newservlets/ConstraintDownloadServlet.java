package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Map;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.EMFModelLoad;

import java.io.*;

@SuppressWarnings("serial")
public class ConstraintDownloadServlet extends HttpServlet {

	// GET .. /constraint/download /<technology>/<templateID>

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		int  callId = ServletUtilities.logCall(this.getClass().getName(), path, params);
		try {
			File result = applyGet(path, params);
			ServletUtilities.putResponse(response, callId, result, HttpURLConnection.HTTP_ACCEPTED, "");
		} catch (Exception e) {
			ServletUtilities.putResponseError(response, callId, e);
		}
	}

	public static File applyGet(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length < 3 || pathparts.length > 3 || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong URL for executing constraints: " 
					+ "GET '/constraint/download/{technology}/{constraintID}' "
					+ "(not /constraint/download/{" + path + ")");
		}

		String technology = pathparts[1];
		String constraintId = pathparts[2];

		String filePath = ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.CONSTRAINTFOLDER
				+ "/" + constraintId + "." + Constants.EXTENSION;

		// 1. try to load Pattern
		try {
			EMFModelLoad.loadCompletePattern(filePath);
		} catch (IOException e) {
			throw new FailedServletCallException("404 Requested constraint '" + constraintId + "' does not exist", e);
		}

		File file = new File(filePath);

		return file;
	}
}