package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlNode;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.textrepresentation.impl.PatternTextImpl;
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.ConstantsError;
import qualitypatternmodel.utility.ConstantsJSON;

@SuppressWarnings("serial")
public class TemplateVariantServlet extends HttpServlet {

	// GET .. /template/variant    /<technology>/<templateID>

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		int  callId = ServletUtilities.logCall(this.getClass().getName(), path, params);
		try{
			JSONObject result = applyGet(path, params);
			ServletUtilities.putResponse(response, callId, result);
		}
		catch (Exception e) {
			ServletUtilities.putResponseError(response, callId, e);
		}
	}

	// PUT .. /template/variant    /<technology>/<templateID>    {"variants":<variant-jsons>}

	@Override
	public void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		int  callId = ServletUtilities.logCall(this.getClass().getName(), path, params);
		try{
			String result = applyPut(path, params);
			ServletUtilities.putResponse(response, callId, result);
		}
		catch (FailedServletCallException e) {
	        if (e.getMessage().startsWith("404")) {
				ServletUtilities.putResponseError(response, callId, new FailedServletCallException(e.getMessage().substring(4)), HttpServletResponse.SC_NOT_FOUND);
			} else if (e.getMessage().startsWith("409")) {
				ServletUtilities.putResponseError(response, callId, new FailedServletCallException(e.getMessage().substring(4)), HttpServletResponse.SC_CONFLICT);
			} else {
				ServletUtilities.putResponseError(response, callId, e, HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			}
		}
		catch (Exception e) {
			ServletUtilities.putResponseError(response, callId, e);
		}
	}

	// DELETE .. /template/variant    /<technology>/<templateID>    {"variants":<variant-ids>}

	@Override
	public void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		int  callId = ServletUtilities.logCall(this.getClass().getName(), path, params);
		try{
			JSONObject result = applyDelete(path, params);
			ServletUtilities.putResponse(response, callId, result);
		}
		catch (Exception e) {
			ServletUtilities.putResponseError(response, callId, e);
		}
	}

	public static JSONObject applyGet (String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException, IOException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong URL for requesting a variant of a constraint: "
					+ "GET '/template/variant/{technology}/{templateID}' "
					+ "(not /template/variant" + path + ")");
		}

		// 1 get parameters
		String technology = pathparts[1];
		String templateId = pathparts[2];
		
		boolean putvariants = true;
		if (parameterMap.containsKey(ConstantsJSON.VARIANTS)) {
			if (parameterMap.get(ConstantsJSON.VARIANTS)[0].equals("false"))
				putvariants = false;
		}

		if (!Constants.TECHS.contains(technology)) {
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + Constants.TECHS);
		}

		JSONObject variantjson = ServletUtilities.loadTemplateVariantJSON(technology, templateId);
		if (!putvariants) {
			variantjson.remove(ConstantsJSON.VARIANTS);
		}
		return variantjson;
		
//		// 2 load template
//		CompletePattern pattern = ServletUtilities.loadTemplate(technology, templateId);
//		if (pattern == null) {
//			throw new FailedServletCallException(ConstantsError.NOT_FOUND_TEMPLATE + ": '" + templateId + "'");
//		}
//		
//		return ServletUtilities.getVariantJSON(pattern, putvariants);
	}

	static HashSet<Integer> getSourceParamIDs(XmlPathParam param) {
		// get all XmlNavigations that use the parameters
		EList<XmlNavigation> navs = new BasicEList<XmlNavigation>();
		navs.add(param.getXmlNavigation());

		// get all sourcenodes of the XmlNavigations
		EList<Node> nodes = new BasicEList<Node>();
		for (XmlNavigation nav: navs) {
			if (nav.getSource() instanceof XmlNode) {
				nodes.add(nav.getSource());
			}
		}

		// get all XmlNavigation, that are be source-XmlNavigations
		EList<XmlNavigation> sourcenavs = new BasicEList<XmlNavigation>();
		for (Node node: nodes) {
			for (Relation r: node.getIncoming()) {
				if (r instanceof XmlNavigation) {
					sourcenavs.add((XmlNavigation) r);
				}
			}
		}

		// get the parameters of the source-XmlNavigations
		EList<XmlPathParam> sourceparams = new BasicEList<XmlPathParam>();
		for (XmlNavigation sn: sourcenavs) {
			if (sn.getXmlPathParam() != null) {
				sourceparams.add(sn.getXmlPathParam());
			}
		}

		// get the IDs of the source-fragments
		EList<Parameter> parameterlist = param.getParameterList().getParameters();
		HashSet<Integer> sourcefragids = new HashSet<Integer>();
		for (XmlPathParam source: sourceparams) {
			sourcefragids.add(parameterlist.indexOf(source));
		}
		return sourcefragids;
	}

	public static String applyPut (String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException, IOException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong URL for requesting a variant of a constraint: "
					+ "PUT '/template/variant/{technology}/{templateID}' "
					+ "(not /template/variant" + path + ")");
		}

		// 1 get parameters
		String technology = pathparts[1];
		String templateId = pathparts[2];

		if (!Constants.TECHS.contains(technology)) {
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + Constants.TECHS);
		}

		// 2 load json
		String[] variants = parameterMap.get(ConstantsJSON.VARIANTS);
		if (variants == null) {
			throw new FailedServletCallException(ConstantsError.NOT_FOUND_VARIANT);
		}

		// 3 load template
		CompletePattern pattern = ServletUtilities.loadTemplate(technology, templateId);
		CompletePattern patternSave = ServletUtilities.loadTemplate(technology, templateId);
		if (pattern == null) {
			throw new FailedServletCallException("404 Requested template '" + templateId + "' does not exist");
		}

		// 4 check for possibly duplicate variant names:
		ArrayList<String> patternTextNames = new ArrayList<String>();
		ArrayList<String> variantNames = new ArrayList<String>();


		for (String variant: variants) {
			try {
				JSONObject json = new JSONObject(variant);
				variantNames.add(json.getString(ConstantsJSON.NAME));
			} catch (Exception e) {
				throw new FailedServletCallException(ConstantsError.INVALID_JSON, e);
			}
		}

		for (PatternText text: pattern.getText()) {
			patternTextNames.add(text.getName());
		}

		for (String variantName: variantNames) {
			if (patternTextNames.contains(variantName)) {
				throw new FailedServletCallException("Variant with name '" + variantName + "' already exists.");
			}
		}
		if (new HashSet<String>(variantNames).size() != variantNames.size()) {
			throw new FailedServletCallException(ConstantsError.DUPLICATE_VARIANT_NAMES);
		}

		// 5 add variant
		for (String variant: variants) {
			try {
				JSONObject json = new JSONObject(variant);
				new PatternTextImpl(pattern, json);
			} catch (JSONException e) {
				throw new FailedServletCallException(ConstantsError.INVALID_JSON, e);
			} catch (InvalidityException e) {
				throw new FailedServletCallException(ConstantsError.INVALID_JSON + ": " + e.getMessage(), e);
			} catch (Exception e) {
				throw new FailedServletCallException("error: " + e.getMessage(), e);
			}
		}
		try {
			pattern.isValid(AbstractionLevel.ABSTRACT);
		} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e) {
			throw new FailedServletCallException(ConstantsError.INVALID_VARIANT, e);
		}

		// 6 save template
		try {
			ServletUtilities.saveTemplate(technology, templateId, pattern);
		} catch (IOException e) {
			ServletUtilities.saveTemplate(technology, templateId, patternSave);
			throw new FailedServletCallException(ConstantsError.VARIANT_UPDATE_FAILED, e);
		}

		CompletePattern pattern2 = ServletUtilities.loadTemplate(technology, templateId);
		try {
			pattern2.isValid(AbstractionLevel.ABSTRACT);
			for (PatternText text: pattern2.getText()) {
				text.isValid(AbstractionLevel.ABSTRACT);
			}
		} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e) {
			ServletUtilities.saveTemplate(technology, templateId, patternSave);
			throw new FailedServletCallException("", e);
		}

		return "New variant(s) added successfully to '" + templateId + "'.";
	}

	public static JSONObject applyDelete (String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException, IOException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong URL for deleting a variant of a constraint: "
					+ "DELETE '/template/variant/{technology}/{templateID}' "
					+ "(not /template/variant" + path + ")");
		}

		// 1 get parameters
		String technology = pathparts[1];
		String templateId = pathparts[2];

		if (!Constants.TECHS.contains(technology)) {
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + Constants.TECHS);
		}

		// 2 load variant list
		String[] variants = parameterMap.get(ConstantsJSON.VARIANTS);
		if (variants == null) {
			throw new FailedServletCallException(ConstantsError.NOT_FOUND_VARIANT);
		}

		// 3 load template
		CompletePattern pattern = ServletUtilities.loadTemplate(technology, templateId);
		CompletePattern patternSave = ServletUtilities.loadTemplate(technology, templateId);
		if (pattern == null) {
			throw new FailedServletCallException("Requested template '" + templateId + "' does not exist");
		}

		// 4 delete variants
		JSONArray success = new JSONArray();
		JSONArray failed = new JSONArray();

		for (String variantName: variants) {
			boolean done = false;
			for (PatternText text: pattern.getText()) {
				if (variantName.equals(text.getName())) {
					text.delete();
					success.put(text.getName());
					done = true;
					break;
				}
			}
			if (!done) {
				JSONObject object = new JSONObject();
				try {
					object.put(variantName, ConstantsError.NOT_FOUND_VARIANT);
				} catch (JSONException e) {}
				failed.put(object);
			}
		}

		// 5 save template
		try {
			ServletUtilities.saveTemplate(technology, templateId, pattern);
		} catch (IOException e) {
			ServletUtilities.saveTemplate(technology, templateId, patternSave);
			throw new FailedServletCallException("Failed to update template.", e);
		}

		// 6 return results
		JSONObject object = new JSONObject();
		try {
			object.put(ConstantsJSON.SUCCESS, success);
			object.put(ConstantsJSON.FAILED, failed);
		} catch (Exception e) {}
		return object;
	}
}