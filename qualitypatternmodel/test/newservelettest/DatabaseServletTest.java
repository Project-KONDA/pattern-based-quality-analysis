package newservelettest;

import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.newservlets.DatabaseAddServlet;
import qualitypatternmodel.newservlets.DatabaseDeleteServlet;
import qualitypatternmodel.newservlets.DatabaseGetListServlet;

public class DatabaseServletTest {

	public static void main(String[] args) throws InvalidServletCallException, FailedServletCallException {
		System.out.println(new DatabaseAddServlet().applyPut("", null));
		System.out.println(new DatabaseDeleteServlet().applyDelete("", null));
		System.out.println(new DatabaseGetListServlet().applyGet("", null));
	}

}
