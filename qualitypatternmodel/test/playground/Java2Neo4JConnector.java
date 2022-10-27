package playground;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;

public class Java2Neo4JConnector implements AutoCloseable {
	//https://neo4j.com/developer/java/
	//https://mvnrepository.com/artifact/org.neo4j.driver/neo4j-java-driver/4.4.9
	
   final Driver driver; 
   final static String URI = "bolt://localhost:7687";
   final static String USER = "neo4j";
   final static String PASSWORD = "Regesten";
   
	
    public Java2Neo4JConnector(String uri, String user, String password) {
        driver = GraphDatabase.driver(uri, AuthTokens.basic(user, password));
    }
    
    public Java2Neo4JConnector() {
        this(URI, USER, PASSWORD);
    }

	@Override
	public void close() {
		driver.close();	
		
	}
	 
	public static boolean verifyConnectivity() {
		boolean isActive = false;
		try {
			final Java2Neo4JConnector connector = new Java2Neo4JConnector(URI, USER, PASSWORD);
			final Driver driver = connector.driver;
			driver.verifyConnectivity();
			connector.queryTesterWithException("MATCH (r:Regesta) RETURN r", "testQuery", false);
			connector.close();
			return true;
		} catch (Exception e) {
			isActive = false;
		}
		return isActive;
	}
	
    private void queryTesterWithException(final String query, final String queryID, boolean print) throws Exception {
        try (Session session = driver.session()) {
            String data = session.writeTransaction(tx -> {
                Result result = tx.run(query);
                String resultString = result.consume().toString();
                return resultString;
            });
            if (print) System.out.println("Query: " + queryID + " is valid!\n\t\t\t" + data);
        } catch (Exception e) {
			throw (e);
		}
    }
    
    public void queryTester(final String query, final String queryID, boolean print) {
    	try {
    		queryTesterWithException(query, queryID, print);
    	} catch (Exception e) {
			System.out.println(e);
		}
    }
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Java2Neo4JConnector connector = new Java2Neo4JConnector(URI, USER, PASSWORD);
		connector.queryTester("MATCH (r:Regesta) RETURN r", "testQuery", true);
	}
}
