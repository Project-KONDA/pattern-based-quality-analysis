package qualitypatternmodel.utility;

import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import qualitypatternmodel.execution.Databases;
import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.ServerXmlDataDatabase;
import qualitypatternmodel.execution.XmlDatabase;
import qualitypatternmodel.execution.impl.DatabasesImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

public class EMFModelLoad {
	public static CompletePattern loadCompletePattern(String path) {
		// Initialize the model
        PatternstructurePackage.eINSTANCE.eClass();

		Resource resource = load(path, "patternstructure");
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
			Databases db = (Databases) resource.getContents().get(0);	         
		} else {
			return null;
		}
		
		return resSet;
		
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
			Databases db = (Databases) resource.getContents().get(0);	         
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
        Resource resource = resSet.getResource(URI
                .createURI(path), true);
		return resource;
	}

}
