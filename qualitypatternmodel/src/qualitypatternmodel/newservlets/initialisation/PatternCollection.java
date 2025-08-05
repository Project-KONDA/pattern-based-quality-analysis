package qualitypatternmodel.newservlets.initialisation;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.patternstructure.CompletePattern;

public class PatternCollection {


	public static List<Class<? extends PatternClass>> getPatternClasses() {
		List<Class<? extends PatternClass>> classes = new BasicEList<Class<? extends PatternClass>>();
		return classes;
	}

	public static List<CompletePattern> getGenericPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<CompletePattern> patterns = new BasicEList<CompletePattern>();
		
		for (Class<? extends PatternClass> clazz: getPatternClasses()) {
			try {
				PatternClass patternClass = clazz.getDeclaredConstructor().newInstance();
				CompletePattern pattern = patternClass.getGeneric(); 
				if (pattern != null)
					patterns.add(pattern);
			} catch (Exception e) {
				continue;
			}
		}
		return patterns;
	}

	public static List<CompletePattern> getXmlPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<CompletePattern> patterns = new BasicEList<CompletePattern>();

		for (PatternBundle bundle: getXmlPatternBundles()) {
			patterns.add(bundle.getConcrete());
		}
		return patterns;
	}

	public static List<CompletePattern> getRdfPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<CompletePattern> patterns = new BasicEList<CompletePattern>();
		
		for (PatternBundle bundle: getRdfPatternBundles()) {
			patterns.add(bundle.getConcrete());
		}
		return patterns;
	}

	public static List<CompletePattern> getNeoPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<CompletePattern> patterns = new BasicEList<CompletePattern>();
		
		for (PatternBundle bundle: getNeoPatternBundles()) {
			patterns.add(bundle.getConcrete());
		}
		return patterns;
	}

	public static List<PatternBundle> getXmlPatternBundles() throws InvalidityException {
		List<PatternBundle> patternbundles = new BasicEList<PatternBundle>();
		
		for (Class<? extends PatternClass> clazz: getPatternClasses()) {
			String id = "<not found>";
			try {
				PatternClass patternClass = clazz.getDeclaredConstructor().newInstance();
				id = patternClass.id();
				if (patternClass.xmlValid()) {
					PatternBundle patternbundle = patternClass.getXmlBundle(); 
					if (patternbundle != null)
						patternbundles.add(patternbundle);
					else throw new RuntimeException("XML Patternbundle Null for Class " + id);
				}
			} catch (Exception e) {
				throw new InvalidityException("Exception when compiling XML PatternBundle for Class " + id);
			}
		}
		return patternbundles;
	}

	public static List<PatternBundle> getRdfPatternBundles() throws InvalidityException {
		List<PatternBundle> patternbundles = new BasicEList<PatternBundle>();
		
		for (Class<? extends PatternClass> clazz: getPatternClasses()) {
			String id = "<not found>";
			try {
				PatternClass patternClass = clazz.getDeclaredConstructor().newInstance();
				id = patternClass.id();
				if (patternClass.rdfValid()) {
					PatternBundle patternbundle = patternClass.getRdfBundle(); 
					if (patternbundle != null)
						patternbundles.add(patternbundle);
					else throw new RuntimeException("RDF Patternbundle Null for Class " + id);
				}
			} catch (Exception e) {
				throw new InvalidityException("Exception when compiling RDF PatternBundle for Class " + id);
			}
		}
		return patternbundles;
	}

	public static List<PatternBundle> getNeoPatternBundles() throws InvalidityException {
		List<PatternBundle> patternbundles = new BasicEList<PatternBundle>();
		
		for (Class<? extends PatternClass> clazz: getPatternClasses()) {
			String id = "<not found>";
			try {
				PatternClass patternClass = clazz.getDeclaredConstructor().newInstance();
				id = patternClass.id();
				if (patternClass.neoValid()) {
					PatternBundle patternbundle = patternClass.getNeoBundle(); 
					if (patternbundle != null)
						patternbundles.add(patternbundle);
					else throw new RuntimeException("NEO Patternbundle Null for Class " + id);
				}
			} catch (Exception e) {
				throw new InvalidityException("Exception when compiling NEO PatternBundle for Class " + id);
			}
		}
		return patternbundles;
	}
}
