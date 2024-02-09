package newservelettest;

import java.io.IOException;
import java.nio.file.NoSuchFileException;

import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.newservlets.TemplateAddTagServlet;
import qualitypatternmodel.newservlets.TemplateCopyServlet;
import qualitypatternmodel.newservlets.TemplateDeleteServlet;
import qualitypatternmodel.newservlets.TemplateGetDataModelServlet;
import qualitypatternmodel.newservlets.TemplateGetDatabaseServlet;
import qualitypatternmodel.newservlets.TemplateInstantiateServlet;
import qualitypatternmodel.newservlets.TemplateMqafJsonServlet;
import qualitypatternmodel.newservlets.TemplateQueryServlet;
import qualitypatternmodel.newservlets.TemplateRemoveTagServlet;
import qualitypatternmodel.newservlets.TemplateSetDataModelServlet;
import qualitypatternmodel.newservlets.TemplateSetDatabaseServlet;
import qualitypatternmodel.newservlets.TemplateSetNameServlet;
import qualitypatternmodel.newservlets.TemplateSetParameterServlet;
import qualitypatternmodel.newservlets.TemplateGetListServlet;
import qualitypatternmodel.newservlets.TemplateGetServlet;


public class TemplateCreationServletTest {

	public static void main(String[] args) throws NoSuchFileException, IOException, InvalidServletCallException, FailedServletCallException {
		System.out.println(new TemplateGetListServlet().applyGet("", null));
		System.out.println(new TemplateGetServlet().applyGet("", null));
		System.out.println(new TemplateInstantiateServlet().applyPut("", null));
		System.out.println(new TemplateCopyServlet().applyPut("", null));
		System.out.println(new TemplateDeleteServlet().applyDelete("", null));
		System.out.println(new TemplateSetParameterServlet().applyPost("", null));
		System.out.println(new TemplateSetDatabaseServlet().applyPost("", null));
		System.out.println(new TemplateGetDatabaseServlet().applyGet("", null));
		
		System.out.println(new TemplateGetDataModelServlet().applyGet("", null));
		System.out.println(new TemplateSetDataModelServlet().applyPost("", null));
		System.out.println(new TemplateSetNameServlet().applyPost("", null));
		System.out.println(new TemplateMqafJsonServlet().applyGet("", null));
		System.out.println(new TemplateQueryServlet().applyGet("", null));

		System.out.println(new TemplateAddTagServlet().applyPost("", null));
		System.out.println(new TemplateRemoveTagServlet().applyDelete("", null));
		
	}

}
