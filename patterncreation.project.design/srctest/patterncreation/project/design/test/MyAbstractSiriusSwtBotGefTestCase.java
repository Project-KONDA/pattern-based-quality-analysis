package patterncreation.project.design.test;

import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.diagram.ui.tools.api.preferences.SiriusDiagramUiPreferencesKeys;
import org.eclipse.sirius.tests.support.api.DiagramComponentizationTestSupport;
import org.eclipse.sirius.tests.swtbot.support.api.AbstractSiriusSwtBotGefTestCase;
import org.eclipse.sirius.tests.swtbot.support.api.business.UIResource;
import org.eclipse.sirius.tests.swtbot.support.api.editor.SWTBotSiriusDiagramEditor;
import org.eclipse.sirius.tests.swtbot.support.utils.SWTBotUtils;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.sirius.viewpoint.description.tool.AbstractToolDescription;
import org.eclipse.ui.IEditorPart;

import patterncreation.project.design.Activator;

public class MyAbstractSiriusSwtBotGefTestCase extends AbstractSiriusSwtBotGefTestCase {
	
	// https://git.eclipse.org/r/plugins/gitiles/sirius/org.eclipse.sirius/+/617231a656f2fedeae3506264d6bb9430ae3985f/plugins/org.eclipse.sirius.tests.swtbot/src/org/eclipse/sirius/tests/swtbot/DiagramPrintTest.java

	private static final String AIRD = "representations.aird";
    private static final String REPRESENTATION_DESCRIPTION_NAME = ""; // "" instead of "Test"
    private static final String REPRESENTATION_NAME = "new Test";
    private static final String PATH = "/description/";
    private static final String ODESIGN = "patterncreation.odesign";
    private static final String SEMANTIC = "My.patternstructure";
    private static final String FILE_DIR = "/";
    
    private DDiagram diagram;
	
	@Override
    protected void onSetUpBeforeClosingWelcomePage() throws Exception {
        copyFileToTestProject(Activator.PLUGIN_ID, PATH, SEMANTIC, AIRD, ODESIGN);
    }
	
    @Override
    protected void onSetUpAfterOpeningDesignerPerspective() throws Exception {   	
    	
    	
        sessionAirdResource = new UIResource(designerProject, FILE_DIR, AIRD);
        localSession = designerPerspective.openSessionFromFile(sessionAirdResource);
        SWTBotUtils.waitAllUiEvents();                
        editor = (SWTBotSiriusDiagramEditor) openRepresentation(localSession.getOpenedSession(), REPRESENTATION_DESCRIPTION_NAME, REPRESENTATION_NAME, DDiagram.class, false);
    }
    
    public void test() {    	
    	
    	diagram = (DDiagram) editor.getDRepresentation();
    	
    	System.out.println(diagram.getDescription());
    	
    	
    	for(NodeMapping m : diagram.getDescription().getNodeMappings()) {
    		System.out.println(m);
    	}
    	
    	System.out.println("diagram.getDiagramElements:");
		for(DDiagramElement diagramElement : diagram.getDiagramElements()) {
			System.out.println(diagramElement);
		}	
    	
    	System.out.println("Tools: ");
//    	diagram.getDescription().
    	System.out.println(diagram.getDescription().getDefaultLayer());
    	System.out.println(diagram.getDescription().getToolSection());		
		for(AbstractToolDescription tool : diagram.getDescription().getAllTools()) {
			System.out.println(tool.getName());
		}
		for(AbstractToolDescription tool : diagram.getDescription().getReusedTools()) {
			System.out.println(tool.getName());
		}
		for(Viewpoint v : localSession.getOpenedSession().getSelectedViewpoints(false)) {
			System.out.println(v);
		}
		for(AbstractToolDescription tool : DiagramComponentizationTestSupport.getAllTools(localSession.getOpenedSession(), diagram.getDescription())) {
			System.out.println(tool.getName());
		}
		
		System.out.println("end of Tools");
		
//		if(container != null) {
//			applyContainerCreationTool("Element", diagram, container);
//		}
    	
    	System.out.println("hello world bot");
	}
}
