package playground;

import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.CreateDB;
import org.basex.core.cmd.XQuery;
import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.basex.query.QueryProcessor;
import org.basex.query.iter.Iter;
import org.basex.query.value.item.Item;
import org.eclipse.emf.common.util.Diagnostic;

import qualitypatternmodel.testutility.EMFModelLoad;
import qualitypatternmodel.testutility.EMFValidationPreparation;

public class ExampleExecutionIterator {
	public static void main(String[] args) throws QueryIOException {
		
//		EMFValidationPreparation.registerDelegates();
		
		 // Loading the existing model
        EMFModelLoad loader = new EMFModelLoad();
//        Pattern pattern = loader.load("instances/playground/MatchAppellationUncertain.patternstructure");
        // TODO: create pattern "MatchAppellationUncertain.patternstructure"
		
//		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(pattern);			
//		
//		printDiagnostic(diagnostic, "");
//        
//        try {
//			pattern.isValid(false);
//		} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
		try {
//			String query = pattern.toXQuery();
//			String query = "(//*[name()=\"lido:appellationValue\"]";
			Context context = new Context();		
//			new CreateDB("DBExample", "D:/Dokumente/LIDO/201902-Update/ddb_20190220/ddb_20190220_1.xml").execute(context);
			
			new CreateDB("DBExample", "C:\\Users\\Viola Wenz\\Documents\\Daten\\ddb_20190220\\ddb_20190220\\ddb_20190220_1.xml").execute(context);
			XQuery xquery = new XQuery("(//*)[1]");
//			String result = xquery.execute(context);
			
			try(QueryProcessor proc = new QueryProcessor("//*", context)) {
			      // Store the pointer to the result in an iterator:
			      Iter iter = proc.iter();
//			      System.out.println(iter.size());
			      int i = 0;
			      for(Item item; (item = iter.next()) != null;) {
//			    	  queryResult.add(item.toJava().toString());
			    	  i++;
//			    	  System.out.println(item.serialize().toString());
//			    	  System.out.println("---------------------");
			      }
			      System.out.println(i);
			    } catch (QueryException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
//			System.out.println(result);
		} 
//		catch (InvalidityException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
		catch (BaseXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private static void printDiagnostic(Diagnostic diagnostic, String indent) {
		System.out.print(indent);
		System.out.println(diagnostic.getMessage());
		for (Diagnostic child : diagnostic.getChildren()) {
			printDiagnostic(child, indent + "  ");
		}
	}
}
