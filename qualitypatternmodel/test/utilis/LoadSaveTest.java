package utilis;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

public class LoadSaveTest {

    public static boolean isContainedIn(EObject source, EObject target) {
        if (source == null || target == null) {
			return false;
		}
        if (source == target) {
			return true;
		}

        for (EReference containmentReference : target.eClass().getEAllContainments()) {
            if (containmentReference.isMany()) {
                List<?> containedObjects = (List<?>) target.eGet(containmentReference);
                for (Object containedObject : containedObjects) {
                    if (containedObject instanceof EObject) {
                        if (isContainedIn(source, (EObject) containedObject)) {
                            return true;
                        }
                    }
                }
            } else {
                Object containedObject = target.eGet(containmentReference);
                if (containedObject instanceof EObject) {
					if (isContainedIn(source, (EObject) containedObject)) {
						return true;
					}
				}
            }
        }
        return false;
    }

	public static void main(String[] args) throws IOException, InvalidityException, OperatorCycleException, MissingPatternContainerException, URISyntaxException {

		CompletePattern pattern0 = PatternstructureFactory.eINSTANCE.createCompletePattern();
		QuantifiedCondition qcon = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern0.setCondition(qcon);
		pattern0.getGraph().getNodes().get(0).addOutgoing(qcon.getGraph()).getTarget().makePrimitive().addPrimitiveStringLength();
		pattern0.getGraph().getNodes().add(GraphstructureFactory.eINSTANCE.createNode());
		String p0 = pattern0.myToString();


//		System.out.println("Graph: " + isContainedIn(pattern0.getGraph(), pattern0));
//		System.out.println("Condition: " + isContainedIn(pattern0.getCondition(), pattern0));
//		System.out.println("Node in pattern: " + isContainedIn(pattern0.getGraph().getNodes().get(0), pattern0));
//		System.out.println("Node in graph: " + isContainedIn(pattern0.getGraph().getNodes().get(0), pattern0.getGraph()));

//		System.out.println("\n base:");
//		String pattern0s = pattern0.myToString();
//		System.out.println(pattern0s);

		EMFModelSave.exportToFile2(pattern0, "D:/", "testpattern0", "patternstructure");
		CompletePattern pattern1 = EMFModelLoad.loadCompletePattern("D:/testpattern0.patternstructure");
		String p1 = pattern1.myToString();
		if (!p0.equals(p1))
		 {
			System.out.println("p1:" + p1);
//		System.out.println("\n loaded:");
//		String pattern1s = pattern1.myToString();
////		if (!pattern1s.equals(pattern0s))
//			System.out.println(pattern1s);
//
////		pattern1.getGraph().getNodes().add(AdaptionxmlFactory.eINSTANCE.createXmlElement());
////		pattern1.getGraph().getNodes().add(GraphstructureFactory.eINSTANCE.createNode());
//		pattern1.createXmlAdaption();
//		System.out.println("\n XML:");
//		String pattern1s2 = pattern1.myToString();
//		System.out.println(pattern1s2);
//
//		System.out.println("Graph: " + isContainedIn(pattern1.getGraph(), pattern1));
//		System.out.println("Condition: " + isContainedIn(pattern1.getCondition(), pattern1));
//		System.out.println("Node in pattern: " + isContainedIn(pattern1.getGraph().getNodes().get(0), pattern1));
//		System.out.println("Node in graph: " + isContainedIn(pattern1.getGraph().getNodes().get(0), pattern1.getGraph()));
//
//		EMFModelSave.exportToFile2(pattern1, "D:/", "testpattern_xml", "patternstructure");
//		CompletePattern pattern2 = EMFModelLoad.loadCompletePattern("D:/testpattern_xml.patternstructure");
//
////		System.out.println("\n loaded XML:");
//		String pattern2s = pattern2.myToString();
////		if (!pattern1s2.equals(pattern2s))
////			System.out.println(pattern2s);
//
//		System.out.println("\n next:");
//
//
//		CompletePattern pattern3 = EMFModelLoad.loadCompletePattern("D:/testpattern.patternstructure");
//		String pattern3s = pattern3.myToString();
//		if (!pattern3s.equals(pattern0s))
//			System.out.println(pattern3s);
		}


		EMFModelSave.exportToFile2(pattern1, "D:/", "testpattern1", "patternstructure");
		CompletePattern pattern2 = EMFModelLoad.loadCompletePattern("D:/testpattern1.patternstructure");
		String p2 = pattern2.myToString();
		if (!p1.equals(p2)) {
			System.out.println("p2:" + p2);
		}

		EMFModelSave.exportToFile2(pattern2, "D:/", "testpattern2", "patternstructure");
		CompletePattern pattern3 = EMFModelLoad.loadCompletePattern("D:/testpattern2.patternstructure");
		String p3 = pattern3.myToString();
		if (!p2.equals(p3)) {
			System.out.println("p3:" + p3);
		}

		try {
			Files.delete(Paths.get("D:/testpattern.patternstructure"));
		} catch (Exception e) {}

		try {
			Files.delete(Paths.get("D:/testpattern0.patternstructure"));
		} catch (Exception e) {}
		try {
			Files.delete(Paths.get("D:/testpattern1.patternstructure"));
		} catch (Exception e) {}
		try {
			Files.delete(Paths.get("D:/testpattern2.patternstructure"));
		} catch (Exception e) {}
		try {
			Files.delete(Paths.get("D:/testpattern_xml.patternstructure"));
		} catch (Exception e) {}

	}

}
