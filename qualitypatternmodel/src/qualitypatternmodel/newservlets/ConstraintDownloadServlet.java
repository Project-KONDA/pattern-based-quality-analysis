package qualitypatternmodel.newservlets;

import java.util.Map;

import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.utility.Constants;
//import qualitypatternmodel.utility.EMFModelLoad;

import java.io.*;

@SuppressWarnings("serial")
public class ConstraintDownloadServlet extends QPMHttpServlet {

	@Override
	protected String getAllowedRole() {
		return ServletConstants.ROLE_MANAGEMENT;
	}

	// GET .. /constraint/download /<technology>/<templateID>


	@Override
	public File applyGet(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length < 3 || pathparts.length > 3 || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong URL for executing constraints: " 
					+ "GET '/constraint/download/{technology}/{constraintID}' "
					+ "(not /constraint/download{" + path + ")");
		}

		String technology = pathparts[1];
		String constraintId = pathparts[2];

		String filePath = ServletConstants.PATTERN_VOLUME + "/" + technology + "/" + ServletConstants.CONSTRAINTFOLDER
				+ "/" + constraintId + "." + Constants.EXTENSION;

		File file = new File(filePath);

		if (!file.exists()) {
			throw new FailedServletCallException("404 Requested constraint '" + constraintId + "' does not exist");
		}

		return file;
	}
}