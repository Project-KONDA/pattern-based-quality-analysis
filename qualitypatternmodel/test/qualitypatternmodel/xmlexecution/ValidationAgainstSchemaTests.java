package qualitypatternmodel.xmlexecution;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.basex.query.QueryException;
import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.LocalXmlSchemaDatabase;
import qualitypatternmodel.execution.ServerXmlDataDatabase;
import qualitypatternmodel.execution.impl.ServerXmlDataDatabaseImpl;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.xmlevaluation.EvalMatch;

public class ValidationAgainstSchemaTests {

	ServerXmlDataDatabase db;
	LocalXmlSchemaDatabase schemaDb;
	
	
	@Before
	public void before() throws IOException, QueryException, InvalidityException, OperatorCycleException, MissingPatternContainerException {
		db = new ServerXmlDataDatabaseImpl("test_db_3", "localhost", 1984, "ddb_20190606", "admin", "admin");
		schemaDb = db.createSchemaDatabaseFromReferencedSchema();		
		assertFalse(schemaDb.getElementNames().isEmpty());	
		assertFalse(db.getElementNames().isEmpty());	
	}
	
	@Test
	public void validateAgainstSchemaValidTest() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = EvalMatch.getMatchLidoMeasurementUnit();
		pattern.setDatabase(db);
		EList<Parameter> invalidParams = pattern.validateAgainstSchema();
		assertTrue(invalidParams.isEmpty());
	}
	
	@Test
	public void validateAgainstSchemaInvalidTest() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {		
		CompletePattern pattern = EvalMatch.getMatchMidas5064();
		pattern.setDatabase(db);
		EList<Parameter> invalidParams = pattern.validateAgainstSchema();
		assertFalse(invalidParams.isEmpty());
	}
	
}
