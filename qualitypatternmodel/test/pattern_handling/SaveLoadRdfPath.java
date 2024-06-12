package pattern_handling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;

import org.json.JSONException;

import jakarta.servlet.ServletException;
import qualitypatternmodel.adaptionrdf.AdaptionrdfFactory;
import qualitypatternmodel.adaptionrdf.RdfPathParam;
import qualitypatternmodel.adaptionrdf.RdfPathPart;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.utility.EMFModelSave;
import qualitypatternmodel.utility.EMFModelLoad;

public class SaveLoadRdfPath {
	
	public static void main(String[] args) throws ServletException, InvalidServletCallException, FailedServletCallException, IOException, JSONException {
		String filepath = "./temp/rdfpathtest";
		String pack = "adaptionrdf";
		String filepath2 = filepath + "." + pack;
		Path pa = Paths.get(filepath2);
		
		RdfPathParam rp = AdaptionrdfFactory.eINSTANCE.createRdfPathParam();
		outputRdfPath(rp);
		
		EMFModelSave.exportToFile(rp, filepath, pack);
		RdfPathParam rp2 = (RdfPathParam) EMFModelLoad.loadFromFile(filepath2);
		outputRdfPath(rp2);
		
		Files.delete(pa);
	}
	
	private static void outputRdfPath(RdfPathParam rp) {
		System.out.println(rp.myToString());
		
		for (RdfPathPart p: rp.getRdfPathParts()) {
			System.out.println(" - " + p.myToString());
		}
		System.out.println(" - " + rp.getRdfPathParts().size());
		System.out.println(" - " + new HashSet<RdfPathPart>(rp.getRdfPathParts()).size());
		
		
	}
}
