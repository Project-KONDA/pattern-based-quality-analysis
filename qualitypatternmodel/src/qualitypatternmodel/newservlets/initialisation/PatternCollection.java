package qualitypatternmodel.newservlets.initialisation;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.ServletUtilities;
import qualitypatternmodel.newservlets.patterns.*;
import qualitypatternmodel.newservlets.patterns.comp.*;
import qualitypatternmodel.newservlets.patterns.external.*;
import qualitypatternmodel.newservlets.patterns.internal.*;
import qualitypatternmodel.newservlets.patterns.link.*;
import qualitypatternmodel.newservlets.patterns.mand.*;
import qualitypatternmodel.newservlets.patterns.string.*;
import qualitypatternmodel.patternstructure.CompletePattern;

public class PatternCollection {

	public static List<Class<? extends PatternClass>> getPatternClasses() {
		List<Class<? extends PatternClass>> classes = new BasicEList<Class<? extends PatternClass>>();
		// comp
		classes.add(CompDatabasePattern.class);
		classes.add(CompPattern.class);
		classes.add(CompSetIsoPattern.class);
		classes.add(CompSetSinPattern.class);
		classes.add(CompSetPattern.class);
		classes.add(CompValAnyPattern.class);
		classes.add(CompValPattern.class);
		// external
		classes.add(Appdup2Pattern.class);
		classes.add(Appdup3Pattern.class);
		classes.add(FuncPattern.class);
		classes.add(UniquePattern.class);
		// internal
		classes.add(CardPattern.class);
		classes.add(DupvalPattern.class);
		classes.add(LocalUniquePattern.class);
		// link
		classes.add(CheckFormatPattern.class);
		classes.add(ValidLinkIsoPattern.class);
		classes.add(ValidLinkSinPattern.class);
		classes.add(ValidLinkPattern.class);
		// mand
		classes.add(CardImpliesMandAttPattern.class);
		classes.add(MandAttPattern.class);
		classes.add(MandContAndIsoPattern.class);
		classes.add(MandContAndSinPattern.class);
		classes.add(MandContAndPattern.class);
		classes.add(MandContIsoPattern.class);
		classes.add(MandContSinPattern.class);
		classes.add(MandContPattern.class);
		// string
		classes.add(CardMatchPattern.class);
		classes.add(ContainsIsoPattern.class);
		classes.add(ContainsSinPattern.class);
		classes.add(ContainsPattern.class);
		classes.add(MatchIsoPattern.class);
		classes.add(MatchSinPattern.class);
		classes.add(MatchPattern.class);
		classes.add(StringLengthIsoPattern.class);
		classes.add(StringLengthPattern.class);
		classes.add(StringLengthRangeIsoPattern.class);
		classes.add(StringLengthRangeSinPattern.class);
		classes.add(StringLengthRangePattern.class);
		classes.add(StringLengthSinPattern.class);
		
		return classes;
	}

	public static List<PatternClass> getPatternClassInstances() {
		List<PatternClass> instances = new BasicEList<PatternClass>();
		for (Class<? extends PatternClass> clazz: getPatternClasses()) {
			try {
				instances.add(clazz.getDeclaredConstructor().newInstance());
			} catch (Exception e) {
				ServletUtilities.logError(new InvalidityException("Exception when compiling Generic Pattern " + clazz.getName(), e));
			}
		}
		return instances;
	}

	public static List<CompletePattern> getGenericPatterns() {
		List<CompletePattern> patterns = new BasicEList<CompletePattern>();
		for (PatternClass patternClass: getPatternClassInstances()) {
			if (patternClass.genericValid)
				try {
					CompletePattern pattern = patternClass.getGenericPattern(); 
					if (pattern != null)
						patterns.add(pattern);
				} catch (Exception e) {
					continue;
				}
		}
		return patterns;
	}

		for (PatternBundle bundle: getXmlPatternBundles()) {
			try {
				patterns.add(bundle.getConcrete());
			}
			catch (Exception e) {
				ServletUtilities.logError(new InvalidityException("Exception when compiling Xml PatternBundle " + bundle.id, e));
			}
		}
		return patterns;
	}

	public static List<CompletePattern> getRdfPatterns() {
		List<CompletePattern> patterns = new BasicEList<CompletePattern>();
		
		for (PatternBundle bundle: getRdfPatternBundles()) {
			try {
				patterns.add(bundle.getConcrete());
			}
			catch (Exception e) {
				ServletUtilities.logError(new InvalidityException("Exception when compiling Rdf PatternBundle " + bundle.id, e));
			}
		}
		return patterns;
	}

	public static List<CompletePattern> getNeoPatterns() {
		List<CompletePattern> patterns = new BasicEList<CompletePattern>();
		for (PatternBundle bundle: getNeoPatternBundles()) {
			try {
				patterns.add(bundle.getConcrete());
			}
			catch (Exception e) {
				ServletUtilities.logError(new InvalidityException("Exception when compiling Neo PatternBundle " + bundle.id, e));
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
			} catch (Exception e) {
				ServletUtilities.logError(new InvalidityException("Exception when compiling XML PatternBundle for Class " + id, e));
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
