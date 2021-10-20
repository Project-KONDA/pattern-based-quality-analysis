/**
 *
 * $Id$
 */
package qualitypatternmodel.execution.validation;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.execution.Database;

import qualitypatternmodel.patternstructure.CompletePattern;

/**
 * A sample validator interface for {@link qualitypatternmodel.execution.Result}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ResultValidator {
	boolean validate();

	boolean validateDatabase(Database value);
	boolean validateName(String value);
	boolean validatePerson(String value);
	boolean validateStartDate(Date value);
	boolean validateRuntime(long value);
	boolean validateProblemNumber(int value);
	boolean validateEndDate(Date value);
	boolean validatePattern(CompletePattern value);
	boolean validateMatchNumber(int value);
	boolean validateSplitResult(EList<String> value);
}