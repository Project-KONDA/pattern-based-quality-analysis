package javaoperatortests;

import java.util.List;

import org.json.JSONObject;

import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.javaquery.JavaFilter;
import qualitypatternmodel.javaquery.impl.JavaFilterImpl;
import qualitypatternmodel.javaqueryoutput.InterimResultContainer;
import qualitypatternmodel.javaqueryoutput.impl.InterimResultContainerImpl;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.patternstructure.CompletePattern;

public class PatternFilterGenerationTest {

	static JSONObject filterjson = new JSONObject("{'filter':{'argument':2,'subfilters':[{'argument':3,'subfilter':{'argument':4,'negate':true,'functionclass':'ValidateLinkOperatorImpl','class':'OneArgFunctionFilterPartImpl'},'quantifier':'EXISTS','class':'ListFilterPartImpl'}],'quantifier':'EXISTS','class':'QuantifierFilterPartImpl'},'patternName':'Valid Link','patternId':'_fbpEj7jGEfCYR54oBVXbmw','query':'for $var2_0 in /descendant::*\\nreturn\\n  \\n  <interim>\\n  <return>\\n  {\\n  $var2_0\\n  }\\n  <\\/return>\\n  <condition>\\n  <quantifier>\\n  {\\n  \\n  <value>\\n  {  \\n  for $var3_0 in $var2_0 /text()\\n  return $var3_0\\n  }\\n  <\\/value>\\n  \\n  }\\n  <\\/quantifier>\\n  <\\/condition>\\n  <\\/interim>','language':'XML','structure':{'record':{'id':5,'class':'ValueInterimImpl'},'class':'InterimResultStructureImpl','substructure':{'contained':[{'contained':{'id':4,'class':'ValueInterimImpl'},'id':3,'class':'VariableContainerInterimImpl'}],'id':2,'class':'FixedContainerInterimImpl'}}}");
	

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		JavaFilter filter = JavaFilterImpl.fromJson(filterjson);
//		System.out.println(filterjson.toString(4));
		
		System.out.println(filter.getStructure());
		System.out.println();
		System.out.println(filter.getQuery());
		System.out.println();
		String data1 = "<interim><return><lido:appellationValue xmlns:lido=\"http://www.lido-schema.org\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">Deutsches Dokumentationszentrum für Kunstgeschichte - Bildarchiv Foto Marburg</lido:appellationValue></return><condition><quantifier><value>Deutsches Dokumentationszentrum für Kunstgeschichte - Bildarchiv Foto Marburg</value></quantifier></condition></interim>";
//		String data2 = "<interim><return><lido:category xmlns:lido=\"http://www.lido-schema.org\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><lido:conceptID lido:type=\"URI\">http://www.cidoc-crm.org/crm-concepts/E22</lido:conceptID><lido:term xml:lang=\"en\">Man-Made Object</lido:term></lido:category></return><condition><quantifier></quantifier></condition></interim>";
		String data2 = "<interim>\r\n"
				+ "  <return>\r\n"
				+ "    <lido:appellationValue xmlns:lido=\"http://www.lido-schema.org\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">Deutsches Dokumentationszentrum für Kunstgeschichte - Bildarchiv Foto Marburg</lido:appellationValue>\r\n"
				+ "  </return>\r\n"
				+ "  <condition>\r\n"
				+ "    <quantifier>\r\n"
				+ "      <value>Deutsches Dokumentationszentrum für Kunstgeschichte - Bildarchiv Foto Marburg</value>\r\n"
				+ "      <value>Deutsches Dokumentationszentrum für Kunstgeschichte - Bildarchiv Foto Marburg</value>\r\n"
				+ "      <value>Deutsches Dokumentationszentrum für Kunstgeschichte - Bildarchiv Foto Marburg</value>\r\n"
				+ "      <value>Deutsches Dokumentationszentrum für Kunstgeschichte - Bildarchiv Foto Marburg</value>\r\n"
				+ "    </quantifier>\r\n"
				+ "  </condition>\r\n"
				+ "</interim>";

		InterimResultContainer a = new InterimResultContainerImpl(filter.getStructure());
		a.initialize(data1);
		System.out.println(a);
		
		InterimResultContainer b = new InterimResultContainerImpl(filter.getStructure());
		b.initialize(data2);
		System.out.println(b);
	}
	
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
