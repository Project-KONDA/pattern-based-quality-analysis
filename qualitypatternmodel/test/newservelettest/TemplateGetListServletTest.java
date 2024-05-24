package newservelettest;

import java.io.IOException;
import java.nio.file.NoSuchFileException;

import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.newservlets.TemplateGetListServlet;


public class TemplateGetListServletTest {

	public static void main(String[] args) throws NoSuchFileException, IOException, InvalidServletCallException, FailedServletCallException {
		System.out.println(new TemplateGetListServlet().applyGet("/xml/template", null));
	}

}
