package playground;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;

public class Java2Neo4JConnector implements AutoCloseable {
	//https://neo4j.com/developer/java/
	//https://mvnrepository.com/artifact/org.neo4j.driver/neo4j-java-driver/4.4.9
	
   private final Driver driver; 
   private final static String URI = "bolt://localhost:7687";
   private final static String USER = "neo4j";
   private final static String PASSWORD = "Regesten";
   
	
   public Java2Neo4JConnector(String uri, String user, String password) {
        driver = GraphDatabase.driver(uri, AuthTokens.basic(user, password));
    }

	@Override
	public void close() throws Exception {
		driver.close();		
	}
	
    public void queryTester(final String query) {
        try (Session session = driver.session()) {
            String result = session.readTransaction(tx ->
            		{
            			Result result1 = tx.run(query);
            			return result1.single().get(0).asString();
            		});
            System.out.println(result);
        }
    }
	
	public static void main(String[] args) {
		Java2Neo4JConnector connector = new Java2Neo4JConnector(URI, USER, PASSWORD);
		connector.queryTester("MATCH (r:Regesta) RETRUN r LIMIT 1");
	}
}
