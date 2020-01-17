package qualitypatternmodel.validitychecks;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

public class EMFModelLoad {
	public Pattern load() {
		// Initialize the model
        PatternstructurePackage.eINSTANCE.eClass();

        // Register the XMI resource factory for the .patternstructure extension

        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("patternstructure", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Get the resource
        Resource resource = resSet.getResource(URI
                .createURI("instances/MyNewMatch.patternstructure"), true);
        // Get the first model element and cast it to the right type
        Pattern pattern = (Pattern) resource.getContents().get(0);
        return pattern;
	}

}
