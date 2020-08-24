package patterncreation.project.design.test;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.preferences.SiriusPreferencesKeys;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DDiagramElementContainer;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.business.internal.metamodel.helper.DiagramComponentizationHelper;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DSemanticDiagramSpec;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.Layer;
import org.eclipse.sirius.diagram.impl.DSemanticDiagramImpl;
import org.eclipse.sirius.tests.support.api.DiagramComponentizationTestSupport;
import org.eclipse.sirius.tests.support.api.EclipseTestsSupportHelper;
import org.eclipse.sirius.tests.support.api.SiriusDiagramTestCase;
import org.eclipse.sirius.tests.support.api.SiriusTestCase;
import org.eclipse.sirius.tests.swtbot.support.api.editor.SWTBotSiriusDiagramEditor;
import org.eclipse.sirius.tests.swtbot.support.utils.SWTBotUtils;
import org.eclipse.sirius.tools.api.command.ICommandFactory;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.sirius.viewpoint.description.tool.AbstractToolDescription;
import org.eclipse.ui.IEditorPart;

import patterncreation.project.design.Activator;

public class MySiriusDiagramTestCase extends SiriusDiagramTestCase {
	
	// https://eclipse.googlesource.com/sirius/org.eclipse.sirius/+/master/plugins/org.eclipse.sirius.tests.junit/src/org/eclipse/sirius/tests/unit/api/refresh/ModifyHeaderLabelExpressionTest.java

	/*
	 * I think it works best if the .patternstructure, .odesign and .aird files are all located directly in the project folder.
	 * Otherwise we need to adapt the path in the temporary project (copy destination) to the path in the original project.
	 * This is necessary since the .aird file includes the paths to the other files (especially the .odesign file).
	 * If these paths are not found in the temporary project (copy destination), the set up does not fully work: 
	 * the representation's description is not properly connected to the representation, i.e. getRepresentations(REPRESENTATION_DESC_NAME) is empty.
	 * 
	 */
	
	protected IEclipsePreferences preferences;
    private static final String SEMANTIC_MODEL_PATH = "/" + Activator.PLUGIN_ID + "/My.patternstructure";
    private static final String MODELER_PATH = "/" + Activator.PLUGIN_ID + "/patterncreation.odesign";
    private static final String REPRESENTATIONS_PATH = "/" + Activator.PLUGIN_ID + "/representations.aird";
    private static final String REPRESENTATION_DESC_NAME = "Test2";
    private static final String VIEWPOINT_NAME = "Patterncreation";//"Patterncreation2";
    
    private DDiagram diagram;
    private IEditorPart openedEditor;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        
        // Copy files to temporary test project
        EclipseTestsSupportHelper.INSTANCE.copyFile(MODELER_PATH, "/" + TEMPORARY_PROJECT_NAME + "/" + "patterncreation.odesign");
        EclipseTestsSupportHelper.INSTANCE.copyFile(SEMANTIC_MODEL_PATH, "/" + TEMPORARY_PROJECT_NAME + "/" + "My.patternstructure");
        EclipseTestsSupportHelper.INSTANCE.copyFile(REPRESENTATIONS_PATH, "/" + TEMPORARY_PROJECT_NAME + "/" + "representations.aird");
        
        // try copying Servies.java class: unsuccessful
//      EclipseTestsSupportHelper.INSTANCE.copyFile("/" + Activator.PLUGIN_ID + "/src/patterncreation/project/design/Services.java", TEMPORARY_PROJECT_NAME + "/patterncreation/project/design/Services.java");
                
        genericSetUp("/" + TEMPORARY_PROJECT_NAME + "/" + "My.patternstructure", "/" + TEMPORARY_PROJECT_NAME + "/" + "patterncreation.odesign", "/" + TEMPORARY_PROJECT_NAME + "/" + "representations.aird");
        
        // Activate auto refresh
        changeSiriusPreference(SiriusPreferencesKeys.PREF_AUTO_REFRESH.name(), true);        
        activateViewpoint(VIEWPOINT_NAME);
    }

	
	
	public void test() {
		
		System.out.println("> hello world");
		
		diagram = (DSemanticDiagramImpl) getRepresentations(REPRESENTATION_DESC_NAME).toArray()[0]; // get existing representation from copied .aird file		
		System.out.println("Diagram description: " + diagram.getDescription());
				
//		for (DRepresentationDescriptor descriptor : DialectManager.INSTANCE.getAllRepresentationDescriptors(session)) {
//			System.out.println("d: "+descriptor.getName());
//			System.out.println("d: "+descriptor.getDescription().getName());			
//        }
		
		openedEditor = DialectUIManager.INSTANCE.openEditor(session, diagram, new NullProgressMonitor());
		SWTBotUtils.waitAllUiEvents();		
		openedEditor.setFocus();
		
		
		
		// --------------------------------------------------------------------------------------------------------------------------------------------
		
		/*
		 *  alternative method: create representation
		 *  does not work: returns null
		 */
//		DDiagram newDiagram = (DDiagram) createRepresentation("Test", "test", semanticModel);		
//		diagram = newDiagram;
		
		
		// ------------------------- print diagram components -----------------------------------------------------------------------------------------------
		
		/*
		 * current problem: the diagram does not contain any elements, containers etc. (see console output)
		 * 
		 * maybe that is caused by the Services.java class not being found: 
		 * 
		 * 	!ENTRY org.eclipse.sirius.common.acceleo.aql 2 0 2020-08-07 13:18:01.840
		 *	!MESSAGE Could not find Java extension class patterncreation.project.design.Services
		 */
		
//		DDiagramElementContainer container = null; // for first test case (see below)
				
		System.out.println("diagram.getCurrentConcern:" + diagram.getCurrentConcern());
		
		System.out.println("diagram.getContainers:");
		for(DDiagramElementContainer diagramElementContainer : diagram.getContainers()) {
			System.out.println(diagramElementContainer);
			// prepare first test case:
//			if(diagramElementContainer.toString().equals("ContextGraph")) {
//				container = diagramElementContainer;
//			}

		}
		System.out.println("diagram.getDiagramElements:");
		for(DDiagramElement diagramElement : diagram.getDiagramElements()) {
			System.out.println(diagramElement);
		}	
		System.out.println("diagram.getNodes:");
		for(DNode node : diagram.getNodes()) {
			System.out.println(node);
		}
		System.out.println("diagram.getRepresentationElements:");
		for(DRepresentationElement element : diagram.getRepresentationElements()) {
			System.out.println(element);
		}
		System.out.println("diagram.getOwnedRepresentationElements:");
		for(DRepresentationElement element : diagram.getOwnedRepresentationElements()) {
			System.out.println(element);
		}
		System.out.println("diagram.getOwnedDiagramElements:");
		for(DDiagramElement diagramElement : diagram.getOwnedDiagramElements()) {
			System.out.println(diagramElement);
		}
				

		
		// ------------------------- print tools and related information -----------------------------------------------------------------------------------------------
		
		System.out.println("All tools: ");
//		System.out.println(diagram.getDescription().getToolSection());
		for(AbstractToolDescription tool : diagram.getDescription().getAllTools()) {
			System.out.println(tool.getName());
		}
//		for(AbstractToolDescription tool : diagram.getDescription().getReusedTools()) {
//			System.out.println(tool.getName());
//		}
//		for(Viewpoint v : session.getSelectedViewpoints(false)) {
//			System.out.println(v);		
//			
//		}	
//		System.out.println(DiagramComponentizationHelper.getContributedLayers(diagram.getDescription(), session.getSelectedViewpoints(false)).size());
//		for (final Layer layer : DiagramComponentizationHelper.getContributedLayers(diagram.getDescription(), session.getSelectedViewpoints(false))) {
////                tools.addAll(layer.getAllTools());
//            for(AbstractToolDescription t : layer.getAllTools()) {
//            	System.out.println(t);
//            }
//        }
//		
//		for(AbstractToolDescription tool : DiagramComponentizationTestSupport.getAllTools(session, diagram.getDescription())) {
//			System.out.println(tool.getName());
//		}
//		
//		System.out.println("end of Tools");
		
		// ----------------------------------- first test test case -----------------------------------------------------------------------------------------------		
		
		/*
		 * not executable at the moment as diagram does not contain any elements, containers etc.
		 */
		
//		if(container != null) {
//			System.out.println("before tool execution");
//			applyContainerCreationTool("Element", diagram, container);
//		}		
//		System.out.println("diagram.getDiagramElements:");
//		for(DDiagramElement diagramElement : diagram.getDiagramElements()) {
//			System.out.println(diagramElement);
//		}			
		
		// ---------------------------------------------------------------------------------------------------------------------------------		
		
		System.out.println("\n> goodbye world");
	}

	
}
