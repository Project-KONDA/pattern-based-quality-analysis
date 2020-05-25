package qualitypatternmodel.testutilityclasses;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

public class EMFModelLoad {
	public CompletePattern load(String path) {
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
                .createURI(path), true);
        // Get the first model element and cast it to the right type
        CompletePattern completePattern = (CompletePattern) resource.getContents().get(0);
        return completePattern;
	}

}
