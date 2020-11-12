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
	  Resource resource = resSet.createResource(URI.createFileURI(filePath + "." + packageName));
	  resource.getContents().add(data);
	  resource.save(Collections.EMPTY_MAP);
	}
}
