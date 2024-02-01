package newservelettest;

import java.io.IOException;
import java.nio.file.NoSuchFileException;

import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.newservlets.TemplateCopyServlet;
import qualitypatternmodel.newservlets.TemplateDeleteServlet;
import qualitypatternmodel.newservlets.TemplateExecuteServlet;
import qualitypatternmodel.newservlets.TemplateGetDatabaseServlet;
import qualitypatternmodel.newservlets.TemplateInstantiateServlet;
import qualitypatternmodel.newservlets.TemplateSetDatabaseServlet;
import qualitypatternmodel.newservlets.TemplateSetParameterServlet;
import qualitypatternmodel.newservlets.TemplateGetListServlet;
import qualitypatternmodel.newservlets.TemplateGetParameterServlet;


public class TemplateCreationServletTest {

	public static void main(String[] args) throws NoSuchFileException, IOException, InvalidServletCallException {
		System.out.println(new TemplateCopyServlet().applyPut("", null));
		System.out.println(new TemplateDeleteServlet().applyDelete("", null));
		System.out.println(new TemplateExecuteServlet().applyGet("", null));
		System.out.println(new TemplateGetDatabaseServlet().applyGet("", null));
		System.out.println(new TemplateGetListServlet().applyGet("", null));
		System.out.println(new TemplateGetParameterServlet().applyGet("", null));
		System.out.println(new TemplateInstantiateServlet().applyPut("", null));
		System.out.println(new TemplateSetDatabaseServlet().applyPost("", null));
		System.out.println(new TemplateSetParameterServlet().applyPost("", null));
	}

}
