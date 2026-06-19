package javaoperatortests;

import java.util.List;

import org.json.JSONObject;

import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.javaquery.JavaFilter;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.ConstantsJSON;
import qualitypatternmodel.utility.xmlprocessors.XQueryProcessorSaxon;

public class PatternFilterGenerationTest {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		String file = "D:\\Testdata\\Uni_Köln.xml";
//		String file2 = "D:\\Testdata\\Testdata_provider-mix\\digiCult.xml";
		
		JSONObject filterjson = new JSONObject("{'constraintID':'TestConstraint','name':'TestConstraint','patternId':'_fbpEj7jGEfCYR54oBVXbmw','language':'XML'}");
		filterjson.put("query", "for $var2_0 in /descendant::* return $var2_0");
		filterjson.put("queryPartial", "for $var2_0 in /descendant::* return $var2_0");
		filterjson.put("filter", new JSONObject("{'argument':2,'subfilters':[{'argument':3,'subfilter':{'argument':4,'negate':true,'functionclass':'ValidateLinkOperatorImpl','class':'OneArgFunctionFilterPartImpl'},'quantifier':'EXISTS','class':'ListFilterPartImpl'}],'quantifier':'EXISTS','class':'QuantifierFilterPartImpl'}"));
		filterjson.put("structure", new JSONObject("{'record':{'id':5,'class':'ValueInterimImpl'},'class':'InterimResultStructureImpl','substructure':{'contained':[{'contained':{'id':4,'class':'ValueInterimImpl'},'id':3,'class':'VariableContainerInterimImpl'}],'id':2,'class':'FixedContainerInterimImpl'}}"));
		JSONObject object = new JSONObject();
		object.put(ConstantsJSON.QUERY_FILTER, "let $var2_0 := . return <interim><return>{$var2_0}</return><condition><quantifier>{<value> {for $var3_0 in $var2_0 /text() return $var3_0}</value>}</quantifier></condition></interim>");
		filterjson.put(ConstantsJSON.RELATIVEQUERIES, object);
//		System.out.println(filterjson.toString(2));
		
		List<JSONObject> constraints = List.of(filterjson);
		List<String> files = List.of(file); // , file2);
		JSONObject result = XQueryProcessorSaxon.queryConstraintsFilePaths(constraints, files);
		System.out.println("RESULT LENGTH: " + result.length());
		
		
		main2();
		
//		System.out.println(result.toString(4));
		
//		JavaFilter filter = JavaFilterImpl.fromJson(filterjson);
//		System.out.println(filterjson.toString(4));
		
//		System.out.println("STRUCTURE");
//		System.out.println(filter.getStructure());
//		System.out.println("FILTER");
//		System.out.println(filter.getQuery());
//		System.out.println();
		
		
//		String data1 = "<interim><return><lido:appellationValue xmlns:lido=\"http://www.lido-schema.org\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">Deutsches Dokumentationszentrum für Kunstgeschichte - Bildarchiv Foto Marburg</lido:appellationValue></return><condition><quantifier><value>Deutsches Dokumentationszentrum für Kunstgeschichte - Bildarchiv Foto Marburg</value></quantifier></condition></interim>";
////		String data2 = "<interim><return><lido:category xmlns:lido=\"http://www.lido-schema.org\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><lido:conceptID lido:type=\"URI\">http://www.cidoc-crm.org/crm-concepts/E22</lido:conceptID><lido:term xml:lang=\"en\">Man-Made Object</lido:term></lido:category></return><condition><quantifier></quantifier></condition></interim>";
//		String data2 = "<interim>\r\n"
//				+ "  <return>\r\n"
//				+ "    <lido:appellationValue xmlns:lido=\"http://www.lido-schema.org\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">Deutsches Dokumentationszentrum für Kunstgeschichte - Bildarchiv Foto Marburg</lido:appellationValue>\r\n"
//				+ "  </return>\r\n"
//				+ "  <condition>\r\n"
//				+ "    <quantifier>\r\n"
//				+ "      <value>Deutsches Dokumentationszentrum für Kunstgeschichte - Bildarchiv Foto Marburg</value>\r\n"
//				+ "      <value>Deutsches Dokumentationszentrum für Kunstgeschichte - Bildarchiv Foto Marburg</value>\r\n"
//				+ "      <value>Deutsches Dokumentationszentrum für Kunstgeschichte - Bildarchiv Foto Marburg</value>\r\n"
//				+ "      <value>Deutsches Dokumentationszentrum für Kunstgeschichte - Bildarchiv Foto Marburg</value>\r\n"
//				+ "    </quantifier>\r\n"
//				+ "  </condition>\r\n"
//				+ "</interim>";
//		JSONObject data1j = new JSONObject();
//		JSONArray data1a = new JSONArray();
//		data1a.put(data1);
//		data1j.put(ConstantsJSON.QUERY_FILTER, data1a);
//		data1j.put("result", "1");
		
		
		
		
		
		

//		InterimResultContainer a = new InterimResultContainerImpl(filter.getStructure());
//		a.initialize(data1j);
//		System.out.println(a);
//		
//		JSONObject data2j = new JSONObject();
//		JSONArray data2a = new JSONArray();
//		data2a.put(data2);
//		data2j.put(ConstantsJSON.QUERY_FILTER, data2a);
//		data2j.put("result", "1");
//		InterimResultContainer b = new InterimResultContainerImpl(filter.getStructure());
//		b.initialize(data2j);
//		System.out.println(b);
	}
	
	

//	public static JSONObject queryConstraintsFilePaths(List<JSONObject> constraints, List<String> datapaths) {
//		JSONArray constraintIDs = new JSONArray();
//		for (JSONObject constraint: constraints) {
//			constraintIDs.put(constraint.get(ConstantsJSON.CONSTRAINT_ID));
//			System.out.println(constraint.get(ConstantsJSON.CONSTRAINT_ID));
//		}
//
//		String jsonfilename =  ServletConstants.tempJsonFileName();
//		XQueryProcessorSaxon.initializeExecutionResultFile(datapaths, constraintIDs, jsonfilename);
//
//	    // compile constraints
//	    Processor processor = new Processor(false);
//	    XQueryCompiler compiler = processor.newXQueryCompiler();
//		List<SaxonConstraint> constraintExecutables = new ArrayList<SaxonConstraint>();
//		for (JSONObject constraint: constraints) {
//			System.out.println(" - " + constraint.get(ConstantsJSON.CONSTRAINT_ID));
//			try {
//				SaxonConstraint ce = new SaxonConstraint();
//				ce.id = constraint.getString(ConstantsJSON.CONSTRAINT_ID);
//				ce.name = constraint.getString(ConstantsJSON.NAME);
//				ce.query = constraint.getString(ConstantsJSON.QUERY);
//				ce.query_executable = compiler.compile(ce.query);
//				if (constraint.has(ConstantsJSON.CUSTOM))
//					ce.custom = constraint.getJSONObject(ConstantsJSON.CUSTOM);
//				String counterquery = constraint.getString(ConstantsJSON.QUERY_PARTIAL);
//				ce.query_total_executable = compiler.compile(counterquery);
//				if (constraint.has(ConstantsJSON.FILTER)) {
//					ce.filter = constraint;
//				}
//				if (constraint.has(ConstantsJSON.RELATIVEQUERIES)) {
//					ce.relativeQueries = constraint.getJSONObject(ConstantsJSON.RELATIVEQUERIES);
//				}
//				constraintExecutables.add(ce);
////				System.out.println("SAXONCONSTRAINT " + ce);
//			} catch (Exception e) {
//				e.printStackTrace();
//				XQueryProcessorSaxon.addFailedConstraint(constraint.getString(ConstantsJSON.CONSTRAINT_ID), e.getMessage(), jsonfilename);
//			}
//		}
//
//		// iterate over files
//	    final DocumentBuilder builder = processor.newDocumentBuilder();
//	    builder.setLineNumbering(XQueryProcessorSaxon.BUILDER_LINENUMBERING);
//        builder.setWhitespaceStrippingPolicy(XQueryProcessorSaxon.WHITESPACESTRIPPING);
//
//        for (String path: datapaths) {
//			File file;
//            XdmNode inputDoc;
//			try {
//				file = Util.getAndTestFile(path);
//				inputDoc = builder.build(file);
//				if (file == null) {
//					XQueryProcessorSaxon.addFailedFile(path, ConstantsError.NOT_FOUND_FILEPATH, jsonfilename);
//					continue;
//				}
//			} catch (Exception e) {
//				XQueryProcessorSaxon.addFailedFile(path, ConstantsError.NOT_FOUND_FILEPATH, jsonfilename);
//				continue;
//			}
//
//            for (SaxonConstraint executable: constraintExecutables) {
//                try {
//	                JSONObject queryResult = XQueryProcessorSaxon.querySaxonConstraint(processor, file, inputDoc, executable);
//	                XQueryProcessorSaxon.combineExecutionResult(queryResult, jsonfilename);
//				} catch (Exception e) {
//					XQueryProcessorSaxon.addFailedConstraint(executable.id, e.getMessage(), jsonfilename);
//					ServletUtilities.logError(new InvalidityException("invalid query: " + executable.query, e));
//					continue;
//				} catch (Error e) {
//					XQueryProcessorSaxon.addFailedConstraint(executable.id, e.getMessage(), jsonfilename);
//					ServletUtilities.logError(new InvalidityException("invalid query: " + executable.query, e));
//					continue;
//				}
//            }
//        }
//        return XQueryProcessorSaxon.getFinalExecutionResultFile(jsonfilename);
//	}

//	public static JSONObject querySaxonConstraint(Processor processor, File file, XdmNode inputDoc, SaxonConstraint executable) throws SaxonApiException, SaxonApiUncheckedException, InvalidityException {
//		System.out.println("Querying " + executable.id + " with file " + file.getAbsolutePath());
//		Long starttime = System.nanoTime();
//		JSONObject queryResult = new JSONObject();
//		queryResult.put(ConstantsJSON.CONSTRAINT_ID, executable.id);
//		queryResult.put(ConstantsJSON.CONSTRAINT_NAME, executable.name);
//		queryResult.put(ConstantsJSON.FILE, file.getName());
//		if (executable.custom != null)
//			queryResult.put(ConstantsJSON.CUSTOM, executable.custom);
//
//		// query partial
//		XQueryEvaluator evalPartial = executable.query_total_executable.load();
//		evalPartial.setContextItem(inputDoc);
//		long total = evalPartial.evaluate().size();
//		JSONArray incidents = new JSONArray();
//		// query
//		XQueryEvaluator eval = executable.query_executable.load();
//		eval.setContextItem(inputDoc);
//
//        for (XdmItem item : eval) {
//        	if (XQueryProcessorSaxon.NOSKIPS || !XQueryProcessorSaxon.skipXdmItem(item)) {
//            	JSONObject output = XQueryProcessorSaxon.formatItemJSON(item, processor);
//            	if(executable.relativeQueries != null) {
//	            	for (String key: executable.relativeQueries.keySet()) {
//	            		try {
//	                		JSONArray partres = XQueryProcessorSaxon.queryRelativeQuery(item, executable.relativeQueries.getString(key), processor); 
//	                		output.put(key, partres);
//	            		} catch (Exception e) {}
//	            	}
//            	}
//            	incidents.put(output);
//            }
//        }
//
//        System.out.println("INCIDENTS: " + incidents.length());
//        System.out.println(incidents.getJSONObject(0).toString(4));
//		
//		if (executable.filter != null) {
//			try {
//				System.out.println("FILTERING X");
//				JavaFilter filter = JavaFilterImpl.fromJson(executable.filter);
//				System.out.println("FILTER A " + filter);
//				incidents = filter.filter(incidents);
//			}
//			catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//
//		long incidents_len = incidents.length();
//		long compliances_len = total - incidents_len;
//		
//		if (Util.SNIPPET_REMOVENAMESPACE)
//			XmlServletUtility.stripNamespacesFromIncidents(incidents);
//		        
//		queryResult.put(ConstantsJSON.INCIDENTS, incidents);
//		queryResult.put(ConstantsJSON.TOTAL_FINDINGS, total);
//		queryResult.put(ConstantsJSON.TOTAL_INCIDENCES, incidents_len);
//		queryResult.put(ConstantsJSON.TOTAL_COMPLIANCES, compliances_len);
//		queryResult.put(ConstantsJSON.DURATION, System.nanoTime() - starttime);
//		return queryResult;
//	}
	
	public static void main2() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern cp = (CompletePattern) OneArgTestPatterns.getTestPattern7().createXmlAdaption();
		cp.printParameters(false);

		// fill parameters
		List<Parameter> params = cp.getParameterList().getParameters();
		for (Parameter p: params) {
			if (p instanceof XmlPathParam) {
				try {
					p.setValueFromString("//*");
				}
				catch (Exception e) {
					p.setValueFromString("/text()");
				}
			}
			if (p instanceof TextLiteralParam) {
				p.setValueFromString("a");
			}
		}

		System.out.println(cp.myToString());
		
		JavaFilter filter = cp.generateQueryFilter(); 

		System.out.println("\n_Filter_");
		System.out.println(filter.toJson().toString().replace("\"", "'"));
		
		System.out.println("\n_Query_");
		System.out.println(filter.getQuery());

//		System.out.println("\n_generateXQueryJava_");
//		System.out.println(cp.getCondition().generateXQueryJava());
//
//		System.out.println("\n_generateXQueryJavaReturn_");
//		System.out.println(cp.generateXQueryJavaReturn());
	}

}
