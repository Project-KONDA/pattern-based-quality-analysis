package qualitypatternmodel.cyphertranslationtests;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;

public interface ICypherTranslatione {
	void buildPatterns(ArrayList<CompletePattern> completePatterns) throws InvalidityException, OperatorCycleException, MissingPatternContainerException;
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param completePatterns
	 * @throws InvalidityException
	 * @throws OperatorCycleException
	 * @throws MissingPatternContainerException
	 * This method should just be filled with Methods which have a hugh processing time. This have to be checked against the DB differently
	 */
	void buildToComplexQueryPatterns(ArrayList<CompletePattern> completePatterns) throws InvalidityException, OperatorCycleException, MissingPatternContainerException;	
	void buildInvalidityExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions) throws InvalidityException, OperatorCycleException, MissingPatternContainerException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException;
	void buildUnsupportedException(ArrayList<CompletePattern> completePatternsExceptions) throws InvalidityException, OperatorCycleException, MissingPatternContainerException;
	void buildOtherException(ArrayList<CompletePattern> completePatternsExceptions) throws InvalidityException;
}
