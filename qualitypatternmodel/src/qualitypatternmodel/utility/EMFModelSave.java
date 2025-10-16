package qualitypatternmodel.utility;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.json.JSONObject;

import jakarta.servlet.ServletContext;

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

    public static void exportToFile2(EObject data, ServletContext servletContext, String relativeFolderPath, String fileName, String fileExtension) throws IOException {
    	exportToFile2(data, servletContext.getRealPath(relativeFolderPath), fileName, fileExtension);
    }

    public static void exportToFile2(EObject data, String absoluteFolderPath, String fileName, String fileExtension) throws IOException {

    	String absolutePath = absoluteFolderPath + "/" + fileName + "." + fileExtension;
        // Create a ResourceSet
        ResourceSet resourceSet = new ResourceSetImpl();

        // Register the appropriate resource factory
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
                Resource.Factory.Registry.DEFAULT_EXTENSION, new org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl());

        // Print the absolute path for debugging
//        System.out.println("Absolute Path: " + URI.createFileURI(absolutePath).toFileString());

        // Create a Resource with an appropriate URI
        URI fileURI = URI.createFileURI(absolutePath);
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

	public static String exportToString(EObject eObject) {
        // Create a resource set and register XMI resource factory
        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());

        // Create a resource
        Resource resource = resourceSet.createResource(URI.createURI("temp.xmi"));

        // Add the EObject to the resource
        resource.getContents().add(eObject);

        try {
            // Write the resource to a StringWriter
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            resource.save(outputStream, null);
            return outputStream.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

	public static void exportJson(JSONObject json, String filepath) throws IOException {
	    Path path = Paths.get(filepath);
	    File file = path.toFile();

	    if (file.getParentFile() != null) {
	        Files.createDirectories(file.getParentFile().toPath());
	    }

	    Files.write(path, json.toString().getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
	}
}
