package qualitypatternmodel.utility;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionneo4j.NeoElementPathParam;
import qualitypatternmodel.adaptionneo4j.NeoNodeLabelsParam;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
import qualitypatternmodel.adaptionneo4j.impl.NeoSimpleEdgeImpl;
import qualitypatternmodel.adaptionrdf.AdaptionrdfFactory;
import qualitypatternmodel.adaptionrdf.IriListParam;
import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.adaptionrdf.RdfPathParam;
import qualitypatternmodel.adaptionrdf.RdfPathPart;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlAxisPart;
import qualitypatternmodel.adaptionxml.XmlAxisPartCondition;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
import qualitypatternmodel.adaptionxml.XmlRoot;
import qualitypatternmodel.adaptionxml.impl.XmlAxisOptionParamImpl;
import qualitypatternmodel.adaptionxml.impl.XmlAxisPartImpl;
import qualitypatternmodel.adaptionxml.impl.XmlPropertyOptionParamImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;

public class PatternUtility {

	public static void testPatterns(List<CompletePattern> completePatterns) {
		int valid = 0;
		int total = 0;
		for (CompletePattern completePattern : completePatterns) {
			total++;
//			PatternUtility.fillParameter(completePattern);
			try {
				completePattern.isValid(AbstractionLevel.CONCRETE);
				String result = completePattern.myToString();
				System.out.println("\n\n___PATTERN_(VALID)___");
				System.out.println(result);
				System.out.println("\n___TRANSLATION___");
				System.out.println(completePattern.generateXQuery());
				valid++;
			} catch (Exception e) {
				System.out.print("\n####### PATTERN INVALID #######");
				try {
				  System.out.println(completePattern.myToString());
					e.printStackTrace();
				} catch (Exception e2) {
					System.out.print("\n####### PATTERN PRINTING FAILED #######");
					e2.printStackTrace();
					e.printStackTrace();
				}
			}
		}
		System.out.println(valid + " / " + total + " valid");
	}

	public static void getQueries(ArrayList<CompletePattern> completePatterns, Language lan) {
		for (CompletePattern completePattern : completePatterns) {
			PatternUtility.fillParameter(completePattern);

			try {
				completePattern.isValid(AbstractionLevel.CONCRETE);
				String result = null;
				switch (lan){
				case XML:
					completePattern.generateXQuery();
					break;
				case RDF:
					completePattern.generateSparql();
					break;
				case NEO4J:
					completePattern.generateCypher();
					break;
				default:
					throw new RuntimeException();
				}
				System.out.println("\n\n___PATTERN_(VALID)___");
				System.out.println(result);
			} catch (Exception e) {
				System.out.println("\n\n___PATTERN_(InVALID)___");
				e.printStackTrace();
				System.out.println(completePattern.myToString());
			}
		}
	}

	public static CompletePattern fillParameter(CompletePattern pattern) {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;

		EList<Parameter> params = pattern.getParameterList().getParameters();
		for (int i = params.size()-1; i > -1; i--) {
			Parameter param = pattern.getParameterList().getParameters().get(i);
			
			// GENERIC
			
			if (param instanceof UntypedParameterValue) {
				TextLiteralParam text = parametersFactory.createTextLiteralParam();
				text.setValue("unknown");
				try {
					((UntypedParameterValue) param).replace(text);
				} catch (InvalidityException e) {
					e.printStackTrace();
				}
			}
			if (param instanceof TextLiteralParam) {
				TextLiteralParam text = (TextLiteralParam) param;
				if(text.getValue() == null) {
					text.setValue("something");
				}
			}
			if (param instanceof TextListParam) {
				TextListParam list = (TextListParam) param;
				if(list.getValues() == null || list.getValues().isEmpty()) {
					try {
						list.addStringValue("test");
						list.addStringValue("text");
					} catch (Exception e) {}
				}
			}
			if (param instanceof ComparisonOptionParam) {
				ComparisonOptionParam comp = (ComparisonOptionParam) param;
				if(comp.getValue() == null) {
					comp.setValue(ComparisonOperator.EQUAL);
				}
			}
			if (param instanceof BooleanParam) {
				BooleanParam bool = (BooleanParam) param;
				if(bool.getValue() == null) {
					bool.setValue(true);
				}
			}
			if (param instanceof NumberParam) {
				NumberParam number = (NumberParam) param;
				if(number.getValue() == null) {
					number.setValue(0.0);
				}
			}
			if (param instanceof TypeOptionParam) {
				TypeOptionParam typeOptionParam = (TypeOptionParam) param;
				if(typeOptionParam.getValue() == null || typeOptionParam.getValue() == ReturnType.UNSPECIFIED) {
					typeOptionParam.setValue(ReturnType.STRING);
				}
			}
			
			// XML
			if (param instanceof XmlPathParam) {
				XmlPathParam xmlPathParam = (XmlPathParam) param;
//				try {
//					if (xmlPathParam.getXmlNavigation() instanceof XmlPropertyNavigation) {
//						if (xmlPathParam.getXmlNavigation().getSource() instanceof XmlRoot)
//							xmlPathParam.setValueFromString("//*/text()");
//						else
//							xmlPathParam.setValueFromString("/text()");
//					} else {
//						if (xmlPathParam.getXmlNavigation().getSource() instanceof XmlRoot)
//								xmlPathParam.setValueFromString("//*");
//						else
//							xmlPathParam.setValueFromString("/*");
//					}
//				} catch (InvalidityException e) {
//					e.printStackTrace();
//				}
				if (xmlPathParam.getXmlAxisParts().isEmpty() && 
						(xmlPathParam.isValue() || xmlPathParam.getXmlNavigation().getSource() instanceof XmlRoot) ) {
					xmlPathParam.getXmlAxisParts().add(new XmlAxisPartImpl());
				}
				for (XmlAxisPart pair : xmlPathParam.getXmlAxisParts()) {
					if (pair.getXmlAxisOptionParam() == null) {
						pair.setXmlAxisOptionParam(new XmlAxisOptionParamImpl());
					}
					if (pair.getXmlAxisOptionParam().getValue() == null) {
						if (xmlPathParam.getXmlNavigation().getSource() instanceof XmlRoot)
							pair.getXmlAxisOptionParam().setValue(XmlAxisKind.DESCENDANT);
						else 
							pair.getXmlAxisOptionParam().setValue(XmlAxisKind.CHILD);
					}
					for (XmlAxisPartCondition cond : pair.getXmlAxisPartConditions()) {
						if (cond.getXmlPropertyOption() == null) {
							cond.setXmlPropertyOption(new XmlPropertyOptionParamImpl());
						}
						if (cond.getXmlPropertyOption().getValue() == null) {
							cond.getXmlPropertyOption().setValue(XmlPropertyKind.DATA);
						}
//						if(cond.getTextLiteralParam() == null) {
//							cond.setTextLiteralParam(new TextLiteralParamImpl());
//						}
						if(cond.getTextLiteralParam() != null && cond.getTextLiteralParam().getValue() == null) {
							cond.setTextLiteralParam(null);
						}
					}
				}
				if (xmlPathParam.getXmlNavigation() instanceof XmlPropertyNavigation) {
					
					if (xmlPathParam.getXmlPropertyOptionParam() == null) {
						xmlPathParam.setXmlPropertyOptionParam(new XmlPropertyOptionParamImpl());
					}
					if (xmlPathParam.getXmlPropertyOptionParam().getValue() == null) {
						xmlPathParam.getXmlPropertyOptionParam().setValue(XmlPropertyKind.DATA);
					}
				}
			}
			
			// RDF
			if (param instanceof RdfPathParam) {
				RdfPathParam rdfPathParam = (RdfPathParam) param;
				if (!rdfPathParam.inputIsValid()) {
					IriParam iriParam = AdaptionrdfFactory.eINSTANCE.createIriParam();
					RdfSinglePredicate rdfSingle = AdaptionrdfFactory.eINSTANCE.createRdfSinglePredicate();
					RdfPathPart rdfPathPart = AdaptionrdfFactory.eINSTANCE.createRdfPathPart();
					rdfSingle.setIriParam(iriParam);
					rdfPathPart.setRdfPath(rdfSingle);
					rdfPathParam.getRdfPathParts().add(rdfPathPart);
					iriParam.setPrefix("wdt");
					iriParam.setSuffix("P569");
				}
			}
			
			if (param instanceof IriListParam) {
				IriListParam iriList = (IriListParam) param;
				if (!iriList.inputIsValid() || iriList.getIriParams().isEmpty()) {
					iriList.clear();
					IriParam iriParam = AdaptionrdfFactory.eINSTANCE.createIriParam();
					iriParam.setPrefix("wdt");
					iriParam.setSuffix("P569");
					iriList.getIriParams().add(iriParam);
				}
			}
			
			// NEO4J
			if (param instanceof NeoNodeLabelsParam) {
				NeoNodeLabelsParam neoNodeLabels = (NeoNodeLabelsParam) param;
				try {
					neoNodeLabels.setValueFromString("['Label']");
				} catch (Exception e) {
				}
			}
			if (param instanceof NeoElementPathParam) {
				NeoElementPathParam neoElementPath = (NeoElementPathParam) param;
				NeoSimpleEdgeImpl nse = new NeoSimpleEdgeImpl();
				neoElementPath.setNeoPathPart(nse);
			}
			if (param instanceof NeoPropertyPathParam) {
				NeoPropertyPathParam neoPropertyPath = (NeoPropertyPathParam) param;
				neoPropertyPath.getNeoPropertyName().setValue("Name");
			}
			
		}
		return pattern;
	}

}
