package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelSave;

public class ServerTemplateInitialisation {

	public static void main(String[] args) throws IOException {
		for (CompletePattern pattern: getPatternsXml())
			EMFModelSave.exportToFile2(pattern, "serverpatterns/xml/abstract-patterns", pattern.getName(), "pattern");
		for (CompletePattern pattern: getPatternsRdf())
			EMFModelSave.exportToFile2(pattern, "serverpatterns/rdf/abstract-patterns", pattern.getName(), "pattern");
		for (CompletePattern pattern: getPatternsNeo())
			EMFModelSave.exportToFile2(pattern, "serverpatterns/neo/abstract-patterns", pattern.getName(), "pattern");
	}
	
	public static List<CompletePattern> getPatternsXml(){
		List<CompletePattern> patterns = new BasicEList<CompletePattern>();
		return patterns;
	}
	public static List<CompletePattern> getPatternsRdf(){
		List<CompletePattern> patterns = new BasicEList<CompletePattern>();
		return patterns;
	}

	public static List<CompletePattern> getPatternsNeo(){
		List<CompletePattern> patterns = new BasicEList<CompletePattern>();
		return patterns;
	}
	
}
