package qualitypatternmodel.newservlets;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Map;

import org.json.JSONObject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.ConstantsError;
import qualitypatternmodel.utility.EMFModelLoad;

@MultipartConfig
@SuppressWarnings("serial")
public class ConstraintUploadServlet extends HttpServlet {

	// POST .. /constraint/upload /<technology>/<templateID>

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
	    Part filePart = request.getPart("file");
		String uploadFolder = ServletConstants.PATTERN_VOLUME + "/" + ServletConstants.UPLOAD_FOLDER;
		File file = storePart(filePart, uploadFolder);
	    
		ServletUtilities.logCall(this.getClass().getName(), path, params);
		try {
			JSONObject result = applyPost(path, params, file);
			ServletUtilities.putResponse(response, result, HttpURLConnection.HTTP_ACCEPTED);
		} catch (Exception e) {
			ServletUtilities.putResponseError(response, e);
		}
	}
	
	static private File storePart(Part part, String uploadFolderPath) throws IOException {
	    String fileName = Paths.get(part.getSubmittedFileName()).getFileName().toString();

	    Path uploadDir = Path.of(uploadFolderPath);
	    if (!Files.exists(uploadDir)) {
	        Files.createDirectories(uploadDir);
	    }

	    Path targetPath = uploadDir.resolve(fileName);

	    // Copy file content to the destination
	    try (InputStream in = part.getInputStream()) {
	        Files.copy(in, targetPath, StandardCopyOption.REPLACE_EXISTING);
	    }

	    return targetPath.toFile();
	}

	public static JSONObject applyPost(String path, Map<String, String[]> parameterMap, File file) throws InvalidServletCallException, FailedServletCallException, IOException {
		if (path != null) {
			String[] pathparts = path.split("/");
			if (pathparts.length > 0 || pathparts.length > 3 || !pathparts[0].equals("")) {
				throw new InvalidServletCallException("Wrong URL for executing constraints: " 
						+ "GET '/constraint/download/ "
						+ "(not /constraint/download/{" + path + ")");
			}
		}

		String filePath = file.getAbsolutePath();

		CompletePattern pattern;
		try {
			pattern = EMFModelLoad.loadCompletePattern(filePath);
		} catch (IOException e) {
			throw new FailedServletCallException("The uploaded file is not a valid constraint", e);
		}

		Language lan = pattern.getLanguage();
		if (lan == null || !Constants.TECHS.contains(lan.getLiteral())) {
			throw new FailedServletCallException("The uploaded file is not a valid constraint, tech: " + lan + " is not in list: " + Constants.TECHS);
		}

		pattern.getId();

		// update patternID
		String newID = ServletUtilities.generateNewId(lan.getLiteral(), pattern.getAbstractId(), pattern.getText().get(0).getName());
		pattern.setPatternId(newID);

		// save & load constraint
		ServletUtilities.saveConstraint(lan.getLiteral(), newID, pattern);
		if (ServletUtilities.loadConstraint(lan.getLiteral(), newID) == null) {
			throw new FailedServletCallException(ConstantsError.SAVING_FAILED);
		}
		return ServletUtilities.getPatternJSON(pattern);
	}
}