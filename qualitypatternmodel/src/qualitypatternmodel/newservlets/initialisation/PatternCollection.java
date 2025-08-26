package qualitypatternmodel.newservlets.initialisation;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.ServletUtilities;
import qualitypatternmodel.newservlets.patterns.Appdup2Pattern;
import qualitypatternmodel.newservlets.patterns.Appdup3Pattern;
import qualitypatternmodel.newservlets.patterns.CardImpliesMandAttPattern;
import qualitypatternmodel.newservlets.patterns.CardPattern;
import qualitypatternmodel.newservlets.patterns.CheckFormatPattern;
import qualitypatternmodel.newservlets.patterns.CompDatabasePattern;
import qualitypatternmodel.newservlets.patterns.CompPattern;
import qualitypatternmodel.newservlets.patterns.CompSetIsoPattern;
import qualitypatternmodel.newservlets.patterns.CompSetPattern;
import qualitypatternmodel.newservlets.patterns.CompValAnyPattern;
import qualitypatternmodel.newservlets.patterns.CompValPattern;
import qualitypatternmodel.newservlets.patterns.ContainsIsoPattern;
import qualitypatternmodel.newservlets.patterns.ContainsPattern;
import qualitypatternmodel.newservlets.patterns.DupvalPattern;
import qualitypatternmodel.newservlets.patterns.FuncPattern;
import qualitypatternmodel.newservlets.patterns.LocalUniquePattern;
import qualitypatternmodel.newservlets.patterns.MandAttPattern;
import qualitypatternmodel.newservlets.patterns.MandContPattern;
import qualitypatternmodel.newservlets.patterns.MatchIsoPattern;
import qualitypatternmodel.newservlets.patterns.MatchIsoSinPattern;
import qualitypatternmodel.newservlets.patterns.MatchPattern;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.newservlets.patterns.StringLengthIsoPattern;
import qualitypatternmodel.newservlets.patterns.StringLengthPattern;
import qualitypatternmodel.newservlets.patterns.UniquePattern;
import qualitypatternmodel.newservlets.patterns.ValidLinkPattern;
import qualitypatternmodel.newservlets.patterns.ValidLinkIsoPattern;
import qualitypatternmodel.newservlets.patterns.ValidLinkIsoSinPattern;
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
		classes.add(CompSetIsoPattern.class);
		classes.add(CompValAnyPattern.class);
		classes.add(CompValPattern.class);
		classes.add(ContainsPattern.class);
		classes.add(ContainsIsoPattern.class);
		classes.add(DupvalPattern.class);
		classes.add(FuncPattern.class);
		classes.add(LocalUniquePattern.class);
		classes.add(MandAttPattern.class);
		classes.add(MandContPattern.class);
		classes.add(MatchPattern.class);
		classes.add(MatchIsoPattern.class);
		classes.add(MatchIsoSinPattern.class);
		classes.add(StringLengthPattern.class);
		classes.add(StringLengthIsoPattern.class);
		classes.add(UniquePattern.class);
		classes.add(ValidLinkPattern.class);
		classes.add(ValidLinkIsoPattern.class);
		classes.add(ValidLinkIsoSinPattern.class);
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
				ServletUtilities.logError(new InvalidityException("Exception when compiling Generic Pattern " + clazz.getName(), e));
			}
		}
		return patterns;
	}

	public static List<CompletePattern> getXmlPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
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

	public static List<CompletePattern> getRdfPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
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

	public static List<CompletePattern> getNeoPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
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
				if (patternClass.xmlValid) {
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
				if (patternClass.rdfValid) {
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
				id = patternClass.id;
				if (patternClass.neoValid) {
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
