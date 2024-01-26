package qualitypatternmodel.utility;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import qualitypatternmodel.execution.Databases;
import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.XmlDatabase;
import qualitypatternmodel.execution.impl.DatabasesImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

public class EMFModelLoad {
	public static CompletePattern loadCompletePattern(String path) {
		return loadCompletePattern(path, "patternstructure");
	}
	
	public static CompletePattern loadCompletePattern(String path, String extension) {
		// Initialize the model
        PatternstructurePackage.eINSTANCE.eClass();

		Resource resource = load(path, extension);
		if(resource.getContents().get(0) instanceof CompletePattern) {
			return (CompletePattern) resource.getContents().get(0);	         
		} else {
			return null;
		}
	}
	
	public static Databases loadDatabases(String path) {
		// Initialize the model
        ExecutionPackage.eINSTANCE.eClass();

		Resource resource = load(path, "execution");
		if(resource.getContents().get(0) instanceof Databases) {
			return (Databases) resource.getContents().get(0);	         
		} else {
			return null;
		}
	}
	
	public static ResourceSet loadDatabasesInResourceSet(String dbPath) {
		
		ExecutionPackage.eINSTANCE.eClass();
		String fileEnding = "execution";
		// Register the XMI resource factory for the .patternstructure extension
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put(fileEnding, new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Get the resource
        Resource resource = resSet.getResource(URI
                .createURI(dbPath), true);
		if(resource.getContents().get(0) instanceof Databases) {
//			Databases db = (Databases) resource.getContents().get(0);
			return resSet;
		} else {
			return null;
		}
	}
	
	public static CompletePattern loadCompletePatternInResourceSet(String patternPath, ResourceSet resSet) {
		
		EList<XmlDatabase> correctList = new BasicEList<XmlDatabase>();
		correctList.addAll(DatabasesImpl.getInstance().getXmlDatabases());
				
		PatternstructurePackage.eINSTANCE.eClass();
		String path = patternPath;
		String fileEnding = "patternstructure";
		// Register the XMI resource factory for the .patternstructure extension
        Resource.Factory.Registry reg2 = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m2 = reg2.getExtensionToFactoryMap();
        m2.put(fileEnding, new XMIResourceFactoryImpl());

        // Get the resource
        Resource resource2 = resSet.getResource(URI
                .createURI(path), true);
       
		EList<XmlDatabase> copy = new BasicEList<XmlDatabase>();
		copy.addAll(DatabasesImpl.getInstance().getXmlDatabases());
		
		for(XmlDatabase db : copy) {
			if(db.eIsProxy()) {			
				DatabasesImpl.getInstance().getXmlDatabases().remove(db);
			}
		}
		
		assert(correctList.containsAll(DatabasesImpl.getInstance().getXmlDatabases()) && DatabasesImpl.getInstance().getXmlDatabases().containsAll(correctList));

		if(resource2.getContents().get(0) instanceof CompletePattern) {
			return (CompletePattern) resource2.getContents().get(0);	  
		} else {
			return null;
		}
	}

	public static CompletePattern loadCompletePatternAndDatabase(String patternPath, String dbPath) {
		ExecutionPackage.eINSTANCE.eClass();
		String path = dbPath;
		String fileEnding = "execution";
		// Register the XMI resource factory for the .patternstructure extension
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put(fileEnding, new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Get the resource
        Resource resource = resSet.getResource(URI
                .createURI(path), true);
		if(resource.getContents().get(0) instanceof Databases) {
//			Databases db = (Databases) resource.getContents().get(0);	         
		} else {
			return null;
		}
		
		EList<XmlDatabase> correctList = new BasicEList<XmlDatabase>();
		correctList.addAll(DatabasesImpl.getInstance().getXmlDatabases());
				
		PatternstructurePackage.eINSTANCE.eClass();
		path = patternPath;
		fileEnding = "patternstructure";
		// Register the XMI resource factory for the .patternstructure extension
        Resource.Factory.Registry reg2 = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m2 = reg2.getExtensionToFactoryMap();
        m2.put(fileEnding, new XMIResourceFactoryImpl());

        // Get the resource
        Resource resource2 = resSet.getResource(URI
                .createURI(path), true);
       
		EList<XmlDatabase> copy = new BasicEList<XmlDatabase>();
		copy.addAll(DatabasesImpl.getInstance().getXmlDatabases());
		
		for(XmlDatabase db : copy) {
			if(db.eIsProxy()) {			
				DatabasesImpl.getInstance().getXmlDatabases().remove(db);
			}
		}
		
		assert(correctList.containsAll(DatabasesImpl.getInstance().getXmlDatabases()) && DatabasesImpl.getInstance().getXmlDatabases().containsAll(correctList));

		if(resource2.getContents().get(0) instanceof CompletePattern) {
			return (CompletePattern) resource2.getContents().get(0);	  
		} else {
			return null;
		}
	}
	
	private static Resource load(String path, String fileEnding) {
		
        // Register the XMI resource factory for the .patternstructure extension
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put(fileEnding, new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Get the resource
        Resource resource = resSet.getResource(URI.createURI(path), true);
		return resource;
	}
	
	public static EObject loadFromFile(String filePath) {
        // Create a ResourceSet
        ResourceSet resourceSet = new ResourceSetImpl();

        // Register the appropriate resource factory for XMI files
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
                Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

        // Create a URI for the resource to load
        URI fileURI = URI.createFileURI(filePath);

        // Use the ResourceSet to create a Resource from the URI
        Resource resource = resourceSet.getResource(fileURI, true);

        // Check if the resource was loaded successfully
        if (resource == null) {
            System.err.println("Error loading EMF resource. Resource is null.");
            return null;
        }

        try {
            // Load the resource
            resource.load(null);
            System.out.println("EMF model loaded successfully from: " + filePath);

            // Assuming your model has a single root element, return it
            return resource.getContents().get(0);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error loading EMF model from file: " + filePath);
            return null;
        }
    }

	public static List<CompletePattern> loadCompletePatternFromFolder(String path, String extension) throws IOException {
		List<String> files = getFilesInDirectory(path);
		
		List<CompletePattern> patterns = new BasicEList<CompletePattern>();
		if (files == null)
			throw new NoSuchFileException(path);
		for (String file: files) {
			try {
				patterns.add(loadCompletePattern(file, extension));
			} catch (Exception e) {}
		}
		return patterns;
	}

	public static List<EObject> loadObjectsFromFolder(String path, String extension) throws IOException {
		List<String> files = getFilesInDirectory(path);
		
		List<EObject> patterns = new BasicEList<EObject>();
		for (String file: files) {
			try {
				patterns.add(loadCompletePattern(file, extension));
			} catch (Exception e) {}
		}
		return patterns;
	}

    private static List<String> getFilesInDirectory(String directory) throws IOException {
        Path directoryPath = Paths.get(directory);
        Stream<Path> pathstream = Files.list(directoryPath).map(Path::getFileName);
        Stream <String> filestream = pathstream.map(Path::toString);
        List<String> results = filestream.collect(Collectors.toList());
        return results;       
    }
	
	public static CompletePattern loadAbstractPattern(String format, String abstractPattern) {
		
		// TODO Auto-generated method stub
		return null;
	}

	public static CompletePattern loadConcretePattern(String format, String concretePattern) {
		// TODO Auto-generated method stub
		return null;
	}

}
