package newservelettest.neo4japitests;

import java.io.IOException;
import java.util.Map;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;

import com.google.common.io.Files;

import qualitypatternmodel.adaptionneo4j.NeoNodeLabelsParam;
import qualitypatternmodel.adaptionneo4j.NeoPathParam;
import qualitypatternmodel.adaptionneo4j.impl.NeoSimpleEdgeImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.initialisation.GenericPatterns;
import qualitypatternmodel.newservlets.initialisation.Neo4jPatternVariants;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

public class Neo4jExperiments {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException, IOException {
		CompletePattern pattern = GenericPatterns.getConcrete(GenericPatterns.getGenericCard(), Language.NEO4J, Map.of(), new String[] {}, new String[] {});
		
//		{
//		EList<Parameter> params = pattern.getParameterList().getParameters();
//		ComparisonOptionParam comp = (ComparisonOptionParam) params.get(0);
//		NumberParam numb = (NumberParam) params.get(1);
//		NeoNodeLabelsParam lab1 = (NeoNodeLabelsParam) params.get(2);
//		NeoNodeLabelsParam lab2 = (NeoNodeLabelsParam) params.get(3);
//		NeoPathParam path = (NeoPathParam) params.get(4);
//		comp.setValue(ComparisonOperator.EQUAL);
//		numb.setValue(1.);
//		lab1.getValues();
//		lab2.getValues();
//		path.setNeoPathPart(new NeoSimpleEdgeImpl());
//		comp.clear();
//		numb.clear();
//		lab1.clear();
//		lab2.clear();
//		path.clear();
//		}
//		
		String saved = pattern.myToString();
		System.out.println(saved);
		System.out.println(pattern.generateCypher());
		
		EMFModelSave.exportToFile2(pattern, "D:", "neotest", "patternstructure");
		
		CompletePattern pattern2 = EMFModelLoad.loadCompletePattern("D:/neotest.patternstructure");
		String loaded = pattern2.myToString();
		System.out.println(loaded);
	}
}