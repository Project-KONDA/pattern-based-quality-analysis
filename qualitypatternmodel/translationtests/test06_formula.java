

import java.util.ArrayList;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.patternstructure.impl.*;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.graphstructure.impl.*;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.functions.*;
import qualitypatternmodel.functions.impl.*;
import qualitypatternmodel.inputfields.*;
import qualitypatternmodel.inputfields.impl.*;

public class test06_formula {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<Pattern> patterns = new ArrayList<Pattern>();
		patterns.add(getPatternNotExists());
		patterns.add(getPatternNotForall());
		patterns.add(getPatternExistsNotExists());
		patterns.add(getPatternForallNotForall());

		test00.test(patterns);
	}
	
	public static Pattern getPatternNotExists() {
		return null; //TODO
	}
	public static Pattern getPatternNotForall() {
		return null; //TODO
	}
	public static Pattern getPatternExistsNotExists() {
		return null; //TODO
	}
	public static Pattern getPatternForallNotForall() {		
		return null; //TODO
	}

}
