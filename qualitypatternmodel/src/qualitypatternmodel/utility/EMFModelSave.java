package qualitypatternmodel.utility;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class EMFModelSave {
	
	public static void exportToFile(EObject data, String filePath, String packageName) throws IOException {		
	  Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	  Map<String, Object> m = reg.getExtensionToFactoryMap();
	  m.put(packageName, new XMIResourceFactoryImpl());
	  ResourceSet resSet = new ResourceSetImpl();
	  Resource resource = resSet.createResource(URI.createURI(filePath + "." + packageName));
	  resource.getContents().add(data);
	  resource.save(Collections.EMPTY_MAP);
	}
	
    public static void exportToFile2(EObject data, String filePath, String fileName, String fileExtension) throws IOException {
    	
    	String path = filePath + "/" + fileName + "." + fileExtension;
    	
        // Create a ResourceSet
        ResourceSet resourceSet = new ResourceSetImpl();

        // Register the appropriate resource factory
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
                Resource.Factory.Registry.DEFAULT_EXTENSION, new org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl());
        
        // Print the absolute path for debugging
        System.out.println("Absolute Path: " + new java.io.File(path).getAbsolutePath());
        
        // Create a Resource with an appropriate URI
        URI fileURI = URI.createFileURI(path);
        Resource resource = resourceSet.createResource(fileURI);
        
        // Add the model instance to the resource's contents
        resource.getContents().add(data);

        // Save the resource
        try {
            resource.save(null);
            resource.unload();
        } catch (IOException e) {
            resource.unload();
            throw e;
        }
    }
}
