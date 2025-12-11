package qualitypatternmodel.newservlets.initialisation;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;

import qualitypatternmodel.exceptions.InvalidityException;
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
	
	static boolean tryall = false;


	public static List<Class<? extends PatternClass>> getPatternClasses() {
		List<Class<? extends PatternClass>> classes = new BasicEList<Class<? extends PatternClass>>();
		// comp
		classes.add(CompPattern.class);
		classes.add(CompSetAnyPattern.class);
		classes.add(CompSetIsoPattern.class);
		classes.add(CompSetPattern.class);
		classes.add(CompSetSinPattern.class);

		// external
		classes.add(AppDup2Pattern.class);
		classes.add(AppDup3Pattern.class);
		classes.add(FuncPattern.class);
		classes.add(UniquePattern.class);

		// internal
		classes.add(CardCompSetIfCompSetPattern.class);
		classes.add(CardIfCompSetPattern.class);
		classes.add(CardPattern.class);
		classes.add(DupValPattern.class);

		// link
		classes.add(LinkImageSizeIsoPattern.class);
		classes.add(LinkImageSizePattern.class);
		classes.add(LinkImageSizeSinPattern.class);
		classes.add(LinkMimeTypeIsoPattern.class);
		classes.add(LinkMimeTypePattern.class);
		classes.add(LinkMimeTypeSinPattern.class);
		classes.add(LinkSourceIsoPattern.class);
		classes.add(LinkSourcePattern.class);
		classes.add(LinkSourceSinPattern.class);
		classes.add(ValidLinkIsoPattern.class);
		classes.add(ValidLinkPattern.class);
		classes.add(ValidLinkSinPattern.class);

		// mand
		classes.add(Mand2EleOrPattern.class);
		classes.add(Mand3EleOrPattern.class);
		classes.add(MandAttPattern.class);
		classes.add(MandContAndIsoPattern.class);
		classes.add(MandContAndPattern.class);
		classes.add(MandContAndSinPattern.class);
		classes.add(MandContIsoPattern.class);
		classes.add(MandContPattern.class);
		classes.add(MandContSinPattern.class);
		classes.add(MandElePattern.class);

		// string
		classes.add(CardMatchPattern.class);
		classes.add(ContainsIsoPattern.class);
		classes.add(ContainsListIsoPattern.class);
		classes.add(ContainsListPattern.class);
		classes.add(ContainsListSinPattern.class);
		classes.add(ContainsPattern.class);
		classes.add(ContainsSinPattern.class);
		classes.add(MatchIsoPattern.class);
		classes.add(MatchListIsoPattern.class);
		classes.add(MatchListPattern.class);
		classes.add(MatchListSinPattern.class);
		classes.add(MatchPattern.class);
		classes.add(MatchSinPattern.class);
		classes.add(StringLengthIsoPattern.class);
		classes.add(StringLengthPattern.class);
		classes.add(StringLengthRangeIsoPattern.class);
		classes.add(StringLengthRangePattern.class);
		classes.add(StringLengthRangeSinPattern.class);
		classes.add(StringLengthSinPattern.class);
		
		return classes;
	}

	public static List<PatternClass> getPatternClassInstances() {
		List<PatternClass> patternclasses = new BasicEList<PatternClass>();
		for (Class<? extends PatternClass> clazz: getPatternClasses()) {
			try {
				patternclasses.add(clazz.getDeclaredConstructor().newInstance());
			} catch (Exception e) {
				ServletUtilities.logError(new InvalidityException("Exception when instantiating PatternClass " + clazz.getName(), e));
			}
		}
		return patternclasses;
		
	}

	public static List<CompletePattern> getGenericPatterns() {
		List<CompletePattern> patterns = new BasicEList<CompletePattern>();
		
		for (Class<? extends PatternClass> clazz: getPatternClasses()) {
			try {
				PatternClass patternClass = clazz.getDeclaredConstructor().newInstance();
				CompletePattern pattern = patternClass.getGenericPattern(); 
				if (pattern != null)
					patterns.add(pattern);
			} catch (Exception e) {
				ServletUtilities.logError(new InvalidityException("Exception when compiling Generic Pattern " + clazz.getName(), e));
			}
		}
		return patterns;
	}

	public static List<CompletePattern> getXmlPatterns() throws InvalidityException {
		List<CompletePattern> patterns = new BasicEList<CompletePattern>();

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

	public static List<CompletePattern> getRdfPatterns() throws InvalidityException {
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

	public static List<CompletePattern> getNeoPatterns() throws InvalidityException {
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

	public static List<PatternBundle> getXmlPatternBundles() throws InvalidityException {
		List<PatternBundle> patternbundles = new BasicEList<PatternBundle>();
		
		for (Class<? extends PatternClass> clazz: getPatternClasses()) {
			String id = "<not found>";
			try {
				PatternClass patternClass = clazz.getDeclaredConstructor().newInstance();
				id = patternClass.id;
				if (tryall || patternClass.xmlValid) {
					PatternBundle patternbundle = patternClass.getXmlBundle(); 
					if (patternbundle != null)
						patternbundles.add(patternbundle);
					else throw new RuntimeException("XML Patternbundle Null for Class " + id);
				}
			} catch (Exception e) {
				ServletUtilities.logError(new InvalidityException("Exception when compiling XML PatternBundle for Class " + id, e));
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
				id = patternClass.id;
				if (tryall || patternClass.rdfValid) {
					PatternBundle patternbundle = patternClass.getRdfBundle(); 
					if (patternbundle != null)
						patternbundles.add(patternbundle);
					else throw new RuntimeException("RDF Patternbundle Null for Class " + id);
				}
			} catch (Exception e) {
				ServletUtilities.logError(new InvalidityException("Exception when compiling RDF PatternBundle for Class " + id));
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
				id = patternClass.id;
				if (tryall || patternClass.neoValid) {
					PatternBundle patternbundle = patternClass.getNeoBundle(); 
					if (patternbundle != null)
						patternbundles.add(patternbundle);
					else throw new RuntimeException("NEO Patternbundle Null for Class " + id);
				}
			} catch (Exception e) {
				ServletUtilities.logError(new InvalidityException("Exception when compiling NEO PatternBundle for Class " + id));
			}
		}
		return patternbundles;
	}
}
