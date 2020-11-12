package qualitypatternmodel.utility;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import qualitypatternmodel.execution.Databases;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

public class EMFModelLoad {
	public static CompletePattern loadCompletePattern(String path) {
		Resource resource = load(path, "patternstructure");
		if(resource.getContents().get(0) instanceof CompletePattern) {
			return (CompletePattern) resource.getContents().get(0);	         
		} else {
			return null;
		}
	}
	
	public static Databases loadDatabases(String path) {
		Resource resource = load(path, "execution");
		if(resource.getContents().get(0) instanceof Databases) {
			return (Databases) resource.getContents().get(0);	         
		} else {
			return null;
		}
	}

	private static Resource load(String path, String fileEnding) {
		// Initialize the model
        PatternstructurePackage.eINSTANCE.eClass();

        // Register the XMI resource factory for the .patternstructure extension

        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put(fileEnding, new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Get the resource
        Resource resource = resSet.getResource(URI
                .createURI(path), true);
		return resource;
	}

}
