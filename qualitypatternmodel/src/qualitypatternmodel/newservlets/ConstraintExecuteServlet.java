package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.node.ObjectNode;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.ConstantsError;
import qualitypatternmodel.utility.ConstantsJSON;
import qualitypatternmodel.utility.Util;
import qualitypatternmodel.utility.xmlprocessors.XmlServletUtility;

@SuppressWarnings("serial")
public class ConstraintExecuteServlet extends HttpServlet {

	// GET .. /constraint/execute    /<technology>    {"files": filename-string , "constraints": <constraint-json>, "constraintIDs": <constraint-ids>}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		int  callId = ServletUtilities.logCall("GET", this.getClass().getName(), path, params);
		try {
			ObjectNode result = applyGet(path, params);
			if (result.path(ConstantsJSON.RESULT).isEmpty()) {
				result.put(ConstantsJSON.STATUS, ConstantsJSON.STATUS_FAILED);
				ServletUtilities.putResponse(response, callId, result, HttpServletResponse.SC_BAD_REQUEST);
			} else {
				if (Util.jsonKeySet((ObjectNode) result.path(ConstantsJSON.FAILEDCONSTRAINTS)).isEmpty()
						&& Util.jsonKeySet((ObjectNode) result.path(ConstantsJSON.FAILEDFILES)).isEmpty())
					result.put(ConstantsJSON.STATUS, ConstantsJSON.STATUS_SUCCESS);
				else
					result.put(ConstantsJSON.STATUS, ConstantsJSON.STATUS_PARTIAL);
				ServletUtilities.putResponse(response, callId, result, HttpServletResponse.SC_OK);
			}
		}
		catch (Exception e) {
			ServletUtilities.putResponseError(response, callId, e);
		}
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		ObjectNode json;
		try {
			json = ServletUtilities.extractJSON(request);
		} catch (Exception e) {
	        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
	        response.getWriter().write("Invalid or empty JSON");
	        return;
		}
		int  callId = ServletUtilities.logCall("GET", this.getClass().getName(), path, json);
		try {
			ObjectNode result = applyPost(path, json);
			ServletUtilities.putResponse(response, callId, result);
		}
		catch (Exception e) {
			ServletUtilities.putResponseError(response, callId, e);
		}
	}

	public static ObjectNode applyPost(String path, ObjectNode parameters) throws InvalidServletCallException, FailedServletCallException {
		return applyGet(path, ServletUtilities.jsonToMap(parameters));
	}

	public static ObjectNode applyGet(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length < 2  || pathparts.length > 2  || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong URL for executing constraints: "
					+ "GET '/constraint/execute/{technology}' "
					+ "(not /constraint/execute{" + path + ")");
		}

		String technology = pathparts[1];

		if (technology.equals(Constants.XML)) {
			return applyGetXml(path, technology, parameterMap);
		} else {
			throw new FailedServletCallException("Technology '" + technology + "' currently not supported");
		}
	}

	public static ObjectNode applyGetXml(String path, String technology, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		// get parameters
		List<String> filepaths = Arrays.asList(parameterMap.get(ConstantsJSON.FILES));
		String[] constraintsCompiled = parameterMap.get(ConstantsJSON.CONSTRAINTS);
		String[] constraintIDs = parameterMap.get(ConstantsJSON.CONSTRAINT_IDS);

		// setup
		ArrayList<ObjectNode> constraints = new ArrayList<ObjectNode>();
		ObjectNode failedConstraints = Util.jsonCreateObject();

		// compile constraintIDs
		if (constraintIDs != null) {
			for (String constraintId: constraintIDs) {
//				CompletePattern pattern;
				try {
//					pattern = ServletUtilities.loadConstraint(technology, constraintId);
//					pattern.isValid(AbstractionLevel.CONCRETE);
				// 2 generate query
//					JSONObject queryJson = ConstraintQueryServlet.generateQueryJson(pattern, technology);
					ObjectNode queryJson = ServletUtilities.loadConstraintQueryJson(technology, constraintId);
					constraints.add(queryJson);

					String templateId = queryJson.path(ConstantsJSON.TEMPLATE_ID).asText(null);
					if (templateId != null)
						ServletUtilities.increaseNumber(ServletConstants.COUNTFILE, templateId, ConstantsJSON.COUNTER_EXECUTE);
						
				} catch (Exception e) {
					try {
						failedConstraints.put(constraintId, ConstantsError.INVALID_CONSTRAINT);
					} catch (RuntimeException f) {}
					ServletUtilities.logError(new InvalidityException("Constraint " + constraintId + " not valid", e));
				}
			}
		}

		// transform constraint parameters
		if (constraintsCompiled != null) {
			for (String constraint: constraintsCompiled) {
				String constraintID = "<invalid>";
				try {
					ObjectNode object = Util.jsonCreateObject(constraint);
					if (!object.has(ConstantsJSON.CONSTRAINT_ID)) {
						failedConstraints.put(constraint, ConstantsError.INVALID_FILEFORMAT);
						ServletUtilities.log("Constraint not valid: " + ConstantsError.INVALID_FILEFORMAT);
						break;
					} else {
						constraintID = object.get(ConstantsJSON.CONSTRAINT_ID).asText();
					}

					if (!object.has(ConstantsJSON.QUERY)) {
						failedConstraints.put(constraintID, ConstantsError.NO_QUERY);
						ServletUtilities.log("Constraint " + constraintID + " not valid: " + ConstantsError.NO_QUERY);
					}
					else if (!object.has(ConstantsJSON.TECHNOLOGY) || !object.get(ConstantsJSON.TECHNOLOGY).equals(Constants.XML)) {
						failedConstraints.put(constraintID, ConstantsError.INVALID_TECHNOLOGY);
						ServletUtilities.log("Constraint " + constraintID + " not valid: " + ConstantsError.INVALID_TECHNOLOGY);
					}
					else if (!object.has(ConstantsJSON.LANGUAGE) || !object.path(ConstantsJSON.LANGUAGE).asText().equals(Constants.XQUERY)) {
						failedConstraints.put(constraintID, ConstantsError.INVALID_LANGUAGE);
						ServletUtilities.log("Constraint " + constraintID + " not valid: " + ConstantsError.INVALID_LANGUAGE);
					} else {
						constraints.add(object);

						String templateId = object.get(ConstantsJSON.TEMPLATE_ID).asText();
						String variantId = object.get(ConstantsJSON.VARIANT_ID).asText();
						if (templateId != null && variantId != null)
							try {
								ServletUtilities.increaseNumber(ServletConstants.COUNTFILE, templateId + "_" + variantId, ConstantsJSON.COUNTER_EXECUTE);
							} catch (IOException e) {}
					}
				} catch (RuntimeException | JsonProcessingException e) {
					try {
						failedConstraints.put(constraintID, e.getMessage());
						ServletUtilities.logError(new InvalidityException("Constraint not valid ", e));
					} catch (RuntimeException f) {}
				}
			}
		}

		if (constraints.isEmpty()) {
			throw new InvalidServletCallException(ConstantsError.INVALID_CONSTRAINTS + ": " + failedConstraints);
		}

		ObjectNode result = XmlServletUtility.queryConstraintsFilePaths(constraints, filepaths);

		if (Util.jsonKeySet((ObjectNode) result.get(ConstantsJSON.FAILEDCONSTRAINTS)).isEmpty() && Util.jsonKeySet(failedConstraints).isEmpty())
			result.remove(ConstantsJSON.FAILEDCONSTRAINTS);
		else 
			for (String failedid: Util.jsonKeySet(failedConstraints)) {
				if (!result.has(ConstantsJSON.FAILEDCONSTRAINTS))
					result.set(ConstantsJSON.FAILEDCONSTRAINTS, Util.jsonCreateObject());
				((ObjectNode) result.get(ConstantsJSON.FAILEDCONSTRAINTS)).set(failedid, failedConstraints.get(failedid));
			}
		if (!result.has(ConstantsJSON.FAILEDFILES) || result.path(ConstantsJSON.FAILEDFILES).isEmpty())
			result.remove(ConstantsJSON.FAILEDFILES);
		return result;
	}
}
