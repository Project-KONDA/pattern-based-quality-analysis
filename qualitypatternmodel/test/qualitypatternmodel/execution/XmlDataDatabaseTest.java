package qualitypatternmodel.execution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.basex.query.QueryException;
import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.execution.impl.ServerXmlDataDatabaseImpl;

public class XmlDataDatabaseTest {
	ServerXmlDataDatabase db;
	
	@Before
	public void before() throws IOException, InvalidityException {
		db = new ServerXmlDataDatabaseImpl("test_db_4", "localhost", 1984, "ddb_20190606", "admin", "admin");

	}
	
	@Test
	public void findXSDURLTest() throws IOException, QueryException, InvalidityException {
		String url = db.findXSDURL();
		assertEquals(url, "http://www.lido-schema.org/schema/v1.0/lido-v1.0.xsd");
	}
	
	@Test
	public void createSchemaDatabaseFromReferencedSchemaTest() throws IOException, QueryException, InvalidityException {
		LocalXmlSchemaDatabase schemaDb = db.createSchemaDatabaseFromReferencedSchema();
		EList<String> wholeDb = schemaDb.execute("/*");
		assertTrue(wholeDb.size() > 0);
	}

}
