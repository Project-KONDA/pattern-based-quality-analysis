package qualitypatternmodel.newservlets;

import org.eclipse.emf.ecore.EPackage;

import qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage;
import qualitypatternmodel.adaptionrdf.AdaptionrdfPackage;
import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.javaoperators.JavaoperatorsPackage;
import qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.textrepresentation.TextrepresentationPackage;

public class EMFInitializer {
	
	static void initialize() {

		ServletUtilities.log("EMF Classes initializing");	
		PatternstructurePackage.eINSTANCE.eClass();
		EPackage.Registry.INSTANCE.put(PatternstructurePackage.eNS_URI, PatternstructurePackage.eINSTANCE);		
		GraphstructurePackage.eINSTANCE.eClass();
		EPackage.Registry.INSTANCE.put(GraphstructurePackage.eNS_URI, GraphstructurePackage.eINSTANCE);
		OperatorsPackage.eINSTANCE.eClass();
		EPackage.Registry.INSTANCE.put(OperatorsPackage.eNS_URI, OperatorsPackage.eINSTANCE);		
		ParametersPackage.eINSTANCE.eClass();
		EPackage.Registry.INSTANCE.put(ParametersPackage.eNS_URI, ParametersPackage.eINSTANCE);
		
		TextrepresentationPackage.eINSTANCE.eClass();
		EPackage.Registry.INSTANCE.put(TextrepresentationPackage.eNS_URI, TextrepresentationPackage.eINSTANCE);
		
		AdaptionxmlPackage.eINSTANCE.eClass();
		EPackage.Registry.INSTANCE.put(AdaptionxmlPackage.eNS_URI, AdaptionxmlPackage.eINSTANCE);
		AdaptionrdfPackage.eINSTANCE.eClass();
		EPackage.Registry.INSTANCE.put(AdaptionrdfPackage.eNS_URI, AdaptionrdfPackage.eINSTANCE);
		Adaptionneo4jPackage.eINSTANCE.eClass();
		EPackage.Registry.INSTANCE.put(Adaptionneo4jPackage.eNS_URI, Adaptionneo4jPackage.eINSTANCE);

		JavaoperatorsPackage.eINSTANCE.eClass();
		EPackage.Registry.INSTANCE.put(OperatorsPackage.eNS_URI, OperatorsPackage.eINSTANCE);
		JavaqueryoutputPackage.eINSTANCE.eClass();
		EPackage.Registry.INSTANCE.put(JavaqueryoutputPackage.eNS_URI, JavaqueryoutputPackage.eINSTANCE);
		
		ServletUtilities.log("EMF Classes initialized");
		
	}
}