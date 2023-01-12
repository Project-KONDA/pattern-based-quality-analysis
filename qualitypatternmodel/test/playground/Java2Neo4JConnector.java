package playground;

import static org.mockito.Mockito.calls;

import java.time.Duration;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import org.neo4j.driver.Transaction;
import org.neo4j.driver.TransactionConfig;

public class Java2Neo4JConnector implements AutoCloseable {
	private static final String IS_VALID = " is valid!\n\t\t\t";
	private static final String QUERY2 = "Query: ";
	private static final String TEST_QUERY = "testQuery";
	//https://neo4j.com/developer/java/
	//https://mvnrepository.com/artifact/org.neo4j.driver/neo4j-java-driver/4.4.9
	
   private static final String MATCH_R_REGESTA_RETURN_R = "MATCH (r:Regesta) RETURN r LIMIT 1";
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
		Java2Neo4JConnector connector = null;
		try {
			connector = new Java2Neo4JConnector(URI, USER, PASSWORD);
			final Driver driver = connector.driver;
			driver.verifyConnectivity();
			connector.close();
			return true;
		} catch (Exception e) {
			try {
				if (connector != null) {
					connector.close();
				}
			} catch (Exception e2) {}
			return false;
		}
	}
	
    private void queryTesterWithException(final String query, final String queryID, boolean print) throws Exception {
        try (Session session = driver.session()) {
            String data = session.writeTransaction(tx -> {
                Result result = tx.run(query);
                String resultString = result.consume().toString();
                return resultString;
            });
            if (print) System.out.println(QUERY2 + queryID + IS_VALID + data);
        } catch (Exception e) {
			throw (e);
		}
    }
    
    public void queryTester(final String query, final String queryID, boolean print) throws Exception {
    	queryTesterWithException(query, queryID, print);
    }
    
    public void queryTesterThrows(final String query, final String queryID, boolean print) throws Exception {
    	queryTesterWithException(query, queryID, print);
    }
    
    public void queryTesterForToComplexQueries(final String query, final String queryID, boolean print) {
    	try {
    		TransactionConfig config = TransactionConfig.builder()
    			    .withTimeout(Duration.ofSeconds(6))
    			    .build();
    		
    		try (Session session = driver.session()) {
    			try (Transaction tx = session.beginTransaction(config)){
    				System.out.println(query);
    				tx.run(query);    				
    			} catch (org.neo4j.driver.exceptions.ClientException e) {
					if (e.toString().contains("org.neo4j.driver.exceptions.ClientException: The transaction has been terminated. Retry your operation in a new transaction, and you should see a successful result. The transaction has not completed within the specified timeout (dbms.transaction.timeout). You may want to retry with a longer timeout.")) {
						System.out.println("The transaction has been send, valited and terminated successfully.");						
					} else {
						throw e;
					}
				}
                if (print) System.out.println(QUERY2 + queryID + IS_VALID);
            } catch (Exception e) {
    			throw e;
    		}
    	} catch (Exception e) {
    		throw e;
    	}
    }
	
	public static void main(String[] args) {
		try (Java2Neo4JConnector connector = new Java2Neo4JConnector(URI, USER, PASSWORD)) {
			try {
				connector.queryTester(MATCH_R_REGESTA_RETURN_R, TEST_QUERY, true);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
