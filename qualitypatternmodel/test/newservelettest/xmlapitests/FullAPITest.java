package newservelettest.xmlapitests;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;

import java.io.File;
import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.newservlets.ConstraintCopyServlet;
import qualitypatternmodel.newservlets.ConstraintDataModelServlet;
import qualitypatternmodel.newservlets.ConstraintDatabaseServlet;
import qualitypatternmodel.newservlets.ConstraintExecuteServlet;
import qualitypatternmodel.newservlets.ConstraintMqafServlet;
import qualitypatternmodel.newservlets.ConstraintNameServlet;
import qualitypatternmodel.newservlets.ConstraintServlet;
import qualitypatternmodel.newservlets.ConstraintTagServlet;
import qualitypatternmodel.newservlets.InitialisationServlet;
import qualitypatternmodel.newservlets.PatternListServlet;
import qualitypatternmodel.newservlets.TemplateInstantiateServlet;
import qualitypatternmodel.newservlets.TemplateVariantServlet;

public class FullAPITest {

	public static void main(String[] args) throws InvalidServletCallException, FailedServletCallException, IOException, ServletException {
		String folder = new File(".").getCanonicalPath().replace('\\', '/') + "/temp";
		ServletContext context = mock(ServletContext.class);
        doAnswer(invocation -> {
            String argument = invocation.getArgument(0);
            if (argument.startsWith("/")) {
				return folder + argument;
			} else {
				return folder + argument;
			}
        }).when(context).getRealPath(anyString());
        InitialisationServlet.initialisation(null);

		testConstraintCopyServlet();
		testConstraintDatabaseServlet();
		testConstraintDataModelServlet();
		testConstraintExecuteServlet();
		testConstraintMqafServlet();
		testConstraintServlet();
		testConstraintTagServlet();
		testPatternListServlet();
		testTemplateInstantiateServlet();
		testTemplateVariantServlet();

	}

	private static void testConstraintDatabaseServlet() throws InvalidServletCallException, FailedServletCallException {
		ConstraintDatabaseServlet.applyGet(null, null);
		ConstraintDatabaseServlet.applyPost(null, null);
	}

	private static void testConstraintCopyServlet() throws InvalidServletCallException, FailedServletCallException, IOException {
		ConstraintCopyServlet.applyPut(null, null);
	}

	private static void testConstraintDataModelServlet() throws InvalidServletCallException, FailedServletCallException {
		ConstraintDataModelServlet.applyGet(null, null);
		ConstraintDataModelServlet.applyPost(null, null);
	}

	private static void testConstraintExecuteServlet() throws InvalidServletCallException, FailedServletCallException {
		ConstraintExecuteServlet.applyGet(null, null);
	}

	private static void testConstraintMqafServlet() throws InvalidServletCallException, FailedServletCallException {
		ConstraintMqafServlet.applyGet2(null, null);
		ConstraintMqafServlet.applyGet3(null, null);
		ConstraintNameServlet.applyPost(null, null);
	}

	private static void testConstraintServlet() throws InvalidServletCallException, FailedServletCallException {
		ConstraintServlet.applyGet(null, null);
		ConstraintServlet.applyDelete(null, null);
		ConstraintServlet.applyPost(null, null);
	}

	private static void testConstraintTagServlet() throws InvalidServletCallException, FailedServletCallException {
		ConstraintTagServlet.applyPost(null, null);
		ConstraintTagServlet.applyDelete(null, null);
	}

	private static void testPatternListServlet() throws InvalidServletCallException, FailedServletCallException {
		PatternListServlet.applyGet(null, null);
	}

	private static void testTemplateInstantiateServlet() throws InvalidServletCallException, FailedServletCallException, IOException {
		TemplateInstantiateServlet.applyPut(null, null);
	}

	private static void testTemplateVariantServlet() throws InvalidServletCallException, FailedServletCallException, IOException {
		TemplateVariantServlet.applyGet(null, null);
		TemplateVariantServlet.applyDelete(null, null);
		TemplateVariantServlet.applyPut(null, null);
	}
}
