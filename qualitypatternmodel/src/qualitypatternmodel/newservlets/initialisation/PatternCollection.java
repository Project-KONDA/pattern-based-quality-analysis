package qualitypatternmodel.newservlets.initialisation;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;

import qualitypatternmodel.newservlets.patterns.Appdup2Pattern;
import qualitypatternmodel.newservlets.patterns.Appdup3Pattern;
import qualitypatternmodel.newservlets.patterns.CardImpliesMandAttPattern;
import qualitypatternmodel.newservlets.patterns.CardPattern;
import qualitypatternmodel.newservlets.patterns.CheckFormatPattern;
import qualitypatternmodel.newservlets.patterns.CompDatabasePattern;
import qualitypatternmodel.newservlets.patterns.CompPattern;
import qualitypatternmodel.newservlets.patterns.CompSetPattern;
import qualitypatternmodel.newservlets.patterns.CompValAnyPattern;
import qualitypatternmodel.newservlets.patterns.CompValPattern;
import qualitypatternmodel.newservlets.patterns.ContainsPattern;
import qualitypatternmodel.newservlets.patterns.DupvalPattern;
import qualitypatternmodel.newservlets.patterns.FuncPattern;
import qualitypatternmodel.newservlets.patterns.LocalUniquePattern;
import qualitypatternmodel.newservlets.patterns.MandAttPattern;
import qualitypatternmodel.newservlets.patterns.MandContPattern;
import qualitypatternmodel.newservlets.patterns.MatchPattern;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.newservlets.patterns.StringLengthPattern;
import qualitypatternmodel.newservlets.patterns.UniquePattern;
import qualitypatternmodel.newservlets.patterns.ValidLinkPattern;
import qualitypatternmodel.patternstructure.CompletePattern;

public class PatternCollection {

	public static List<Class<? extends PatternClass>> getPatternClasses() {
		List<Class<? extends PatternClass>> classes = new BasicEList<Class<? extends PatternClass>>();
		classes.add(Appdup2Pattern.class);
		classes.add(Appdup3Pattern.class);
		classes.add(CardImpliesMandAttPattern.class);
		classes.add(CardPattern.class);
		classes.add(CheckFormatPattern.class);
		classes.add(CompDatabasePattern.class);
		classes.add(CompPattern.class);
		classes.add(CompSetPattern.class);
		classes.add(CompValAnyPattern.class);
		classes.add(CompValPattern.class);
		classes.add(ContainsPattern.class);
		classes.add(DupvalPattern.class);
		classes.add(FuncPattern.class);
		classes.add(LocalUniquePattern.class);
		classes.add(MandAttPattern.class);
		classes.add(MandContPattern.class);
		classes.add(MatchPattern.class);
		classes.add(StringLengthPattern.class);
		classes.add(UniquePattern.class);
		classes.add(ValidLinkPattern.class);
		return classes;
	}

	public static List<PatternClass> getPatternClassInstances() {
		List<PatternClass> instances = new BasicEList<PatternClass>();
		for (Class<? extends PatternClass> clazz: getPatternClasses()) {
			try {
				instances.add(clazz.getDeclaredConstructor().newInstance());
			} catch (Exception e) {
				continue;
			}
		}
		return instances;
	}

	public static List<CompletePattern> getGenericPatterns() {
		List<CompletePattern> patterns = new BasicEList<CompletePattern>();
		for (PatternClass patternClass: getPatternClassInstances()) {
			if (patternClass.genericValid)
				try {
					CompletePattern pattern = patternClass.getGeneric(); 
					if (pattern != null)
						patterns.add(pattern);
				} catch (Exception e) {
					continue;
				}
		}
		return patterns;
	}

	public static List<CompletePattern> getXmlPatterns() {
		List<CompletePattern> patterns = new BasicEList<CompletePattern>();
		for (PatternClass patternClass: getPatternClassInstances()) {
			if (patternClass.xmlValid)
				try {
					CompletePattern pattern = patternClass.getXmlPattern(); 
					if (pattern != null)
						patterns.add(pattern);
				} catch (Exception e) {
					continue;
				}
		}
		return patterns;
	}

	public static List<CompletePattern> getRdfPatterns() {
		List<CompletePattern> patterns = new BasicEList<CompletePattern>();
		for (PatternClass patternClass: getPatternClassInstances()) {
			if (patternClass.rdfValid)
				try {
					CompletePattern pattern = patternClass.getRdfPattern(); 
					if (pattern != null)
						patterns.add(pattern);
				} catch (Exception e) {
					continue;
				}
		}
		return patterns;
	}

	public static List<CompletePattern> getNeoPatterns() {
		List<CompletePattern> patterns = new BasicEList<CompletePattern>();
		for (PatternClass patternClass: getPatternClassInstances()) {
			if (patternClass.neoValid)
				try {
					CompletePattern pattern = patternClass.getNeoPattern(); 
					if (pattern != null)
						patterns.add(pattern);
				} catch (Exception e) {
					continue;
				}
		}
		return patterns;
	}

	public static List<PatternBundle> getXmlPatternBundles() {
		List<PatternBundle> patternbundles = new BasicEList<PatternBundle>();
		for (PatternClass patternClass: getPatternClassInstances()) {
			if (patternClass.xmlValid)
				try {
					PatternBundle patternbundle = patternClass.getXmlBundle(); 
					if (patternbundle != null)
						patternbundles.add(patternbundle);
				} catch (Exception e) {
					continue;
				}
		}
		return patternbundles;
	}

	public static List<PatternBundle> getRdfPatternBundles() {
		List<PatternBundle> patternbundles = new BasicEList<PatternBundle>();
		for (PatternClass patternClass: getPatternClassInstances()) {
			if (patternClass.rdfValid)
				try {
					PatternBundle patternbundle = patternClass.getRdfBundle(); 
					if (patternbundle != null)
						patternbundles.add(patternbundle);
				} catch (Exception e) {
					continue;
				}
		}
		return patternbundles;
	}

	public static List<PatternBundle> getNeoPatternBundles() {
		List<PatternBundle> patternbundles = new BasicEList<PatternBundle>();
		for (PatternClass patternClass: getPatternClassInstances()) {
			if (patternClass.neoValid)
				try {
					PatternBundle patternbundle = patternClass.getNeoBundle(); 
					if (patternbundle != null)
						patternbundles.add(patternbundle);
				} catch (Exception e) {
					continue;
				}
		}
		return patternbundles;
	}
}
