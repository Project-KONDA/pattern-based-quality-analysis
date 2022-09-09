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
    
    public Java2Neo4JConnector() {
        this(URI, USER, PASSWORD);
    }

	@Override
	public void close() throws Exception {
		driver.close();		
	}
	
    public void queryTester(final String query, final String queryID) {
        try (Session session = driver.session()) {
            String data = session.writeTransaction(tx -> {
                Result result = tx.run(query);
                String resultString = result.consume().toString();
                return resultString;
            });
            System.out.println("Query: " + queryID + " is valid!\n\t\t\t" + data);
        }
    }
	
    //TODO - Specify everything more concrete 
	public static void main(String[] args) {
		Java2Neo4JConnector connector = new Java2Neo4JConnector(URI, USER, PASSWORD);
		connector.queryTester("MATCH (r:Regesta) RETURN r", "testQuery");
	}
}
