package qualitypatternmodel.cypherevaluation.utilis;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionneo4j.NeoElementPathParam;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;
import qualitypatternmodel.adaptionxml.XmlAxisPair;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;

public class DummyFiller {
	public static CompletePattern replace(CompletePattern pattern) throws InvalidityException {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		EList<Parameter> params = pattern.getParameterList().getParameters();
		for (int i = params.size()-1; i > -1; i--) {
			Parameter param = pattern.getParameterList().getParameters().get(i);
			if (param instanceof UntypedParameterValue) {
				TextLiteralParam text = parametersFactory.createTextLiteralParam();
				text.setValue("unknown");
				((UntypedParameterValue) param).replace(text);
			}
			if (param instanceof TextLiteralParam) { //Is also the same for the Labels
				TextLiteralParam text = (TextLiteralParam) param;
				text.setValue("something");
			}
			if (param instanceof TextListParam) {
				TextListParam text = (TextListParam) param;
				text.addStringValue("someLabelName");
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
			if (param instanceof NeoPropertyPathParam) {
				NeoPropertyPathParam neoParam = (NeoPropertyPathParam) param;
				neoParam.setNeoPropertyName("someProperty");
			}
			if (param instanceof NeoElementPathParam) {
				NeoElementPathParam neoParam = (NeoElementPathParam) param;
				((NeoSimpleEdge) neoParam.getNeoPathPart()).addNeoEdgeLabel("someLabel");
			}
		}
		return pattern;
	}
}
