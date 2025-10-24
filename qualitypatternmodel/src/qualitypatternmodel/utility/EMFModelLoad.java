package qualitypatternmodel.utility;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.json.JSONObject;

import qualitypatternmodel.newservlets.ServletUtilities;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
//import qualitypatternmodel.patternstructure.impl.PatternstructureFactoryImpl;

public class EMFModelLoad {

	public static CompletePattern loadCompletePattern(String absoluteFolderPath, String patternId, String extension) throws IOException {
		return loadCompletePattern(absoluteFolderPath + "/" + patternId + "." + extension);
	}

	public static CompletePattern loadCompletePattern(String fullPath) throws IOException {
		// Initialize the model
        PatternstructurePackage.eINSTANCE.eClass();

        EObject object;
        try {
        	object = loadFromFile(fullPath);
		} catch (IOException e) {
			throw e;
		} catch (Exception e) {
			throw new IOException(e);
		}
		if (object == null) {
			throw new IOException("Wrong file : resource in " + fullPath + " is not a valid CompletePattern");
		}
		else if(object instanceof CompletePattern) {
			return (CompletePattern) object;
		} else {
			throw new IOException("Wrong file format: " + object.getClass().getSimpleName() + " in " + fullPath);
		}
	}

    public static CompletePattern loadCompletePatternResource(String path) {
        // Obtain a resource set
        ResourceSetImpl resourceSet = new ResourceSetImpl();

        // Register the factory for Patternstructure
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Constants.EXTENSION, PatternstructureFactory.eINSTANCE);

        // Load the resource
        Resource resource = resourceSet.getResource(URI.createFileURI(path), true);

        // Cast the resource to CompletePattern
        if (resource instanceof CompletePattern) {
            return (CompletePattern) resource;
        } else {
            // Handle the case when the resource is not a MyResource instance
            throw new IllegalArgumentException("The loaded resource is not an instance of MyResource.");
        }
    }

	public static EObject loadFromFile(String filePath) throws IOException {
        // Create a ResourceSet
        ResourceSet resourceSet = new ResourceSetImpl();

        // Register the appropriate resource factory for XMI files
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
                Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

        // Create a URI for the resource to load
        URI fileURI = URI.createFileURI(filePath);

        // Use the ResourceSet to create a Resource from the URI
        Resource resource = null;
        try {
        	resource = resourceSet.getResource(fileURI, true);
        } catch (Exception e) {}

        // Check if the resource was loaded successfully
        if (resource == null) {
//            System.err.println("Error loading EMF resource. Resource is null.");
            return null;
        }

        // Load the resource
        resource.load(null);
//        System.out.println("EMF model loaded successfully from: " + filePath);

        EObject object = resource.getContents().get(0);
        resource.getContents().remove(object);
        resource.unload();
        resource.setURI(null);
        resourceSet.getResources().remove(resource);

        resource = null;
        resourceSet = null;
        System.gc();

        return object;
    }

	public static List<CompletePattern> loadCompletePatternFromFolder(String folder, String extension) throws IOException {
//		String path = context.getRealPath(relativepath);
		List<String> files = getFilesInDirectory(folder, extension);

		List<CompletePattern> patterns = new BasicEList<CompletePattern>();
		for (String file: files) {
			try {
				patterns.add(loadCompletePattern(folder + "/" + file));
			} catch (Exception e) {
				System.out.println("Failed to load pattern: " + folder + "/" + file);
				e.printStackTrace();
			}
		}
		return patterns;
	}

	public static List<JSONObject> loadPatternJSONsFromFolder(String folder, String jsonfolder, String extension) throws IOException {
//		String path = context.getRealPath(relativepath);
		List<String> patternfiles = getFilesInDirectory(folder, extension);
//		List<String> jsonfiles = getFilesInDirectory(jsonfolder);
		
		List<JSONObject> patternjsons = new BasicEList<JSONObject>();
		
		for (String patternfilename: patternfiles) {
			String jsonfilename = patternfilename.replace("." + extension, ".json");
			
			File jsonfile = new File(jsonfolder + "/" + jsonfilename);
			if (jsonfile.exists()) {
				JSONObject json = EMFModelLoad.loadJson(jsonfolder + "/" + jsonfilename);
				patternjsons.add(json);
			} else {
				try {
					CompletePattern pattern = loadCompletePattern(folder + "/" + patternfilename);
					JSONObject json = ServletUtilities.getPatternJSON(pattern);
					EMFModelSave.exportJson(json, jsonfolder + "/" + jsonfilename);
					patternjsons.add(json);
				} catch (Exception e) {
					System.out.println("Failed to load pattern: " + folder + "/" + patternfilename);
					e.printStackTrace();
				}
			}
		}
		return patternjsons;
	}

    public static List<String> getFilesInDirectory(String directory, String extension) {
        Path directoryPath = Paths.get(directory);
        try (Stream<Path> pathStream = Files.list(directoryPath)) {
            Stream<String> fileStream = pathStream.map(Path::getFileName).map(Path::toString);
            List<String> files = fileStream.collect(Collectors.toList());
            List<String> results = new BasicEList<>();
            for (String filename : files)
            	if (filename.endsWith(extension))
            		results.add(filename);
            return results;
        } catch (IOException e) {
            return new BasicEList<>();  // Return an empty list in case of an error
        }
    }

	public static JSONObject loadJson(String filepath) throws IOException {
        String jsonString = new String(Files.readAllBytes(Paths.get(filepath)));
        JSONObject jsonObject = new JSONObject(jsonString);
        return jsonObject;
	}
}
