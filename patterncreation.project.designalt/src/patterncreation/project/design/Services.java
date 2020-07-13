package patterncreation.project.design;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.actions.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.requests.ArrangeRequest;
import org.eclipse.sirius.common.ui.tools.api.util.EclipseUIUtil;
import org.eclipse.sirius.viewpoint.SiriusPlugin;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.operators.OperatorList;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
	private static EObject comparisonProperty = null;//das ist das Comparison, auf das geklickt wurde, als eine neue Property erstellt wurde
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    public String getContents(EObject self) {//Hilfsmethode, um den Content zu drucken
    	List<EObject> contents = self.eContents();
    	/*File file = new File("C:\\Users\\Lukas\\Desktop\\diagrammstart.txt");
    	FileWriter writer = null;
		try {
			file.createNewFile();
			writer = new FileWriter(file);
			for(EObject eo:contents) {
				writer.write("Test"+eo.toString()+"\n");
			}
			
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
       return "x";
     }
    
    public boolean addElementToPattern(EObject self) {
    	/*boolean containsTrue = false;
    	List<EObject> contents = self.eContents();
    	for(EObject eo:contents) {
    		if(eo instanceof TrueElement) {
    			containsTrue = true;
    		}
    	}
    	return !containsTrue;*/
    	int x = 0;
    	int contentsSize = self.eContents().size();
		boolean morethanonecontent = false;
		if (self instanceof Formula) {
			Formula formula = (Formula) self;
    		Condition condition1 = formula.getCondition1();
    		Condition condition2 = formula.getCondition2();
    		if(condition1 != null && condition2 != null) {//condition1 und condition2 ungleich null nicht dabei
    			morethanonecontent = true;
    			x = 3;
    		}
		}else if(self instanceof QuantifiedCondition) {
			if(contentsSize >= 3 ) {
				morethanonecontent = true;
				x = 2;
			}
		}else {
			if (contentsSize > 2) {
				morethanonecontent = true;
				x = 1;
			}
		}
    	/*File file = new File("C:\\Users\\Lukas\\Desktop\\formulacontents.txt");
    	FileWriter writer = null;
		try {
			file.createNewFile();
			writer = new FileWriter(file);
			writer.write("Test"+x+"\n");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
    	return !morethanonecontent;
    }
    
    public String referenceName(EObject self) {
    	String returnCondition = "x";
    	if(self instanceof Formula) {
    		Formula formula = (Formula) self;
    		Condition condition1 = formula.getCondition1();
    		Condition condition2 = formula.getCondition2();
    		
    		if(condition1 == null && condition2 == null) {//condition1 und condition2 ungleich null nicht dabei
    			returnCondition = "condition1";
    		}else if(condition1 == null){
    			returnCondition = "condition1";
    		}else if(condition2 == null) {
    			returnCondition = "condition2";
    		}
    		/*File file = new File("C:\\Users\\Lukas\\Desktop\\condition.txt");
        	FileWriter writer = null;
    		try {
    			file.createNewFile();
    			writer = new FileWriter(file);
    			writer.write("Test"+returnCondition+"\n");
    			writer.close();
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}*/
    	}else {
    		returnCondition = "condition";
    	}
    	
    	return returnCondition;
    }
    
    public String formulaConditionOneOrTwo(EObject self) {//muss noch für andere Typen als notconditions programmiert werden; ist für die Benennung
    	String returnCondition = "";
    	if(self instanceof Condition) {
    		Condition selfCondition = (Condition) self;
    		Formula formula1 = selfCondition.getFormula1();
        	Formula formula2 = selfCondition.getFormula2();
        	if(formula1 == null && formula2 == null) {
        		
        	}else if(formula1 == null) {
        		returnCondition = "2";
        	}else {
        		returnCondition = "1";
        	}
    	}
    	
    	/*String type = "";
    	
    	File file = new File("C:\\Users\\Lukas\\Desktop\\condition12.txt");
    	FileWriter writer = null;
		try {
			file.createNewFile();
			writer = new FileWriter(file);
			writer.write("Test"+constr1+" "+constr2+"\n");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	EObject container = self.eContainer();//Formula
    	if(container instanceof Formula) {
			Condition condition1 = ((Formula)container).getCondition1();
			Condition condition2 = ((Formula)container).getCondition2();
			if(self instanceof NotCondition) {
				NotCondition notCondition =(NotCondition) self;
				if(((NotCondition) condition1) == notCondition) {
					returnCondition = "1";
				}else {
					returnCondition = "2";
				}
			}else if(self instanceof TrueElement) {
				
			}
    	}*/
    	return returnCondition;
    }
    
    public String graphName(EObject self) {
    	EObject container = self.eContainer();
    	String graphName = "Graph";
    	if(container instanceof CompletePattern) {
    		graphName = "ReturnGraph";
    	}
    	return graphName;
    }
    
    public String elementName(EObject self) {
    	String elementName = "Element ";
    	if(self instanceof Element) {
    		Element selfElement = (Element) self;
    		String selfName = selfElement.getName();
    		if(selfName != null && selfName.equals("First")) {
    			elementName = "Root";
    		}else {
    			elementName = elementName + selfElement.getInternalId();
    		}
    	}
    	return elementName;
    }
    
    /*public EObject rootElement(EObject self) {
    	EObject rootcontainer = getWurzelContainer(self);
    	
    	List<EObject> list1 = new ArrayList<EObject>();
    	TreeIterator<EObject> iterator = rootcontainer.eAllContents();
    	
    	int i = 0;
    	while(iterator.hasNext()) {
    		i+=1;*/
    		/*File file = new File("C:\\Users\\Lukas\\Desktop\\testFile2.txt");
        	FileWriter writer = null;
    		try {
    			file.createNewFile();
    			writer = new FileWriter(file);
    			writer.write("Test data\n");
    			writer.write(String.valueOf(i));
    			writer.close();
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}*/
    		/*EObject eo = (EObject) iterator.next();

    		Element2 e2 = null;
    		Element3 e3 = null;
    		
    		if(eo instanceof Element2) {
    			e2 = (Element2) eo;
    		}
    		if(eo instanceof Element3) {
    			e3 = (Element3) eo;
    		}
    		
    		if(e2!=null) {
    			if(e2.getNummer()==0) {
    				Elementundattribut eua = new Elementundattribut();
    				eua.setAttribut("nummer");
    				eua.setElement(e2);
    				list1.add(eua);
    				
    				mapfuellen(e2.getName());
    			}
    		}
    		if(e3!=null) {
    			if(e3.getNummer()==0) {
    				Elementundattribut eua = new Elementundattribut();
    				eua.setAttribut("nummer");
    				eua.setElement(e3);
    				list1.add(eua);
    				
    				mapfuellen(e3.getName());
    			}
    		}
    	}  	
     	return(list1);
    }*/
    
    public EObject getWurzelContainer(EObject context) {//sucht das Wurzelelement
    	EObject container1 = null;
    	EObject container2 = null;
    	container1 = context.eContainer();
    	while(container1!=null) {
    		container2 = container1;
    		container1 = container1.eContainer();
    	}
    	if(container2==null) {//falls context keinen container hat
    		container2 = context;
    	}
    	return container2;
    }
    
    //HashMap<String, Integer> objectSizes = new HashMap<String, Integer>();
    //HashMap<String, PatternElement> objects = new HashMap<String, PatternElement>();
    public int getSizeAndAutosize(EObject self) {//autosize für jedes Element, wenn ein Element hinzugefügt wird
    	String id = ((PatternElement)self).getId();
    	/*File file = new File("C:\\Users\\Lukas\\Desktop\\NeuerOrdner\\"+id+".txt");
    	FileWriter writer = null;
		try {
			file.createNewFile();
			writer = new FileWriter(file);
			writer.write("Test\n");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
    	
    	IEditorPart editor = EclipseUIUtil.getActiveEditor();
    	List<Object> partsToArrange = new ArrayList<>(1);

    	if (editor instanceof DiagramEditor) {
    	  DiagramEditor diagramEditor = (DiagramEditor) editor;
    	  DiagramEditPart diagramEditPart = diagramEditor.getDiagramEditPart();
    	  diagramEditPart.addNotify();
    	  
    	  /*ArrangeRequest arrangeRequest = new ArrangeRequest(ActionIds.ACTION_ARRANGE_ALL);
    	  partsToArrange.add(diagramEditPart);
    	  arrangeRequest.setPartsToArrange(partsToArrange);
    	  diagramEditPart.performRequest(arrangeRequest);*/
    	}
    	
    	/*int returnint = 10;
    	int childnumber = 0;
    	
    	TreeIterator<EObject> contents = self.eAllContents();
    	
    	while(contents.hasNext()) {
    		
    		EObject eo = (EObject) iterator.next();

    		Element2 e2 = null;
    		Element3 e3 = null;
    		
    		if(eo instanceof Element2) {
    			e2 = (Element2) eo;
    		}
    		if(eo instanceof Element3) {
    			e3 = (Element3) eo;
    		}
    		
    	}  	
    	
    	File file = new File("C:\\Users\\Lukas\\Desktop\\NeuerOrdner\\"+((PatternElement)self).getId()+" "+childnumber+".txt");
    	FileWriter writer = null;
		try {
			file.createNewFile();
			writer = new FileWriter(file);
			writer.write("Test\n");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return returnint;*/return -1;
    }
    
    public String elementReferenceName(EObject self) {
    	/*File file = new File("C:\\Users\\Lukas\\Desktop\\NeuerOrdner\\referenceName.txt");
    	FileWriter writer = null;
		try {
			file.createNewFile();
			writer = new FileWriter(file);
			writer.write("");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
    	String referenceName = "";
    	if(self instanceof CompletePattern) {
    		referenceName = "elements";
    	}else if(self instanceof QuantifiedCondition) {
    		referenceName = "graph";
    	}
    	
    	
    	return referenceName;
    }
    
    public EObject getOperatorListAsEObject(EObject self) {//wird von container creation comparison im change context aufgerufen, m die operatorlist des graphen als eobject zu bekommen
    	Graph gr = null;
    	EObject eo = null;
    	EList<EObject> contents = self.eContents();((Graph)self).getOperatorList();
    	for(EObject i:contents) {
    		if(i instanceof OperatorList) {
    			eo = i;
    		}
    	}
    	/*File file = new File("C:\\Users\\Lukas\\Desktop\\NeuerOrdner\\eobject.txt");
    	FileWriter writer = null;
    	try {
			file.createNewFile();
			writer = new FileWriter(file);
			writer.write(eo.toString());
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
    	return ((Graph)self).getOperatorList();
    }
    
    public ArrayList<EObject> semanticCandidatExpressionComparison(EObject self) {//wird von container creation comparison im change context aufgerufen, um die operatorlist des graphen als eobject zu bekommen
    	/*System.out.println("SCE "+self.toString());
    	if(self instanceof Element) {
    		System.out.println("Ist Element");
    	}else {
    		System.out.println("Kein Element");
    	}*/
    	
    	EObject eo = null;
    	EList<EObject> contents = null;
    	String elementId = "";
    	if(self instanceof Element) {
    		contents = self.eContainer().eContents();
    		elementId = ((Element) self).getId();
    	}else {//Graph
    		contents = self.eContents();
    	}
    	for(EObject i:contents) {
    		if(i!= null && i instanceof OperatorList) {
    			eo = i;
    		}
    	}
    	EList<EObject> elements = ((OperatorList)eo).eContents();
    	ArrayList<EObject> elements2 = new ArrayList<EObject>();//Comparisons in einem Element, primitiv
    	ArrayList<EObject> elements3 = new ArrayList<EObject>();//Comparisons zwischen zwei Elementen
    	for(EObject i:elements) {
    		if(i!= null && i instanceof Comparison) {
    			if(((Comparison) i).isPrimitive()) {//Comparisons, die Properties nur von einem Element und nicht von zwei Elementen vergleicht, sollen im Element angezeigt werden, die anderen im Graph
    				//System.out.println("Comparison ist primitiv");
    				String argument1Id = "";
    				String argument2Id = "";
    				Comparison comparison = (Comparison) i;
    				EObject argument1 = comparison.getArgument1();
    				EObject argument2 = comparison.getArgument2();
    				if(argument1 instanceof Property) {
    					argument1Id = ((Property) argument1).getElement().getId();
    					//System.out.println("Argument1 ist Property "+elementId+" / "+argument1Id);
    							if(argument1Id == elementId) {
    								//System.out.println("ID ist gleich");
    								elements2.add(i);
    							}
    				}else {//Argument2 ist Property
    					//System.out.println("Argument2 ist Property");
    					argument2Id = ((Property) argument2).getElement().getId();
    					if(argument2Id == elementId) {
    						//System.out.println("ID ist gleich");
							elements2.add(i);
						}
    				}
    				
    			}else {//Comparison zwischen zwei Elementen, nicht primitiv
    				elements3.add(i);
    			}
    		}
    	}
    	
    	if(self instanceof Element) {
    		return elements2;
    	}else {
    		//System.out.println(self.toString());
    		return elements3;
    	}
    	
    }
    
    public EObject printSelf(EObject self) {
    	System.out.println("Self: "+self.toString());
    	return self;
    }
    
    public EObject browseExpressionProperty(EObject self) {
    	//System.out.println("Self: "+self.toString());
    	comparisonProperty = self;
    	EObject eo = self;
    	if(self instanceof Comparison) {
    		Comparison comparison = (Comparison) self;
    		EObject argument1 = comparison.getArgument1();
			EObject argument2 = comparison.getArgument2();
			if(argument1 instanceof Property) {
				eo = ((Property) argument1).getElement();
				//System.out.println("Argument1 ist Property "+elementId+" / "+argument1Id);
			}else {//Argument2 ist Property
				//System.out.println("Argument2 ist Property");
				eo = ((Property) argument2).getElement();
			}
    	}
    	return eo;
    }
    
    /*public EList<Operator> semanticCandidateExpressionComparison(EObject self) {
    	System.out.println("Comparison Self: "+self.toString());
    	ArrayList<EObject> elements = new ArrayList<EObject>();
    	
    	Graph graph = null;
    	EObject selfContainer = self.eContainer();
    	OperatorList operatorList = null;
    	EList<Operator> operators = null;
    	
    	if(selfContainer != null && selfContainer instanceof Graph) {
    		graph = (Graph) selfContainer;
    	}
    	
    	if(graph != null) {
    		operatorList = graph.getOperatorList();
    	}
    	
    	if(operatorList != null) {
    		operators = operatorList.getOperators();
    	}
    	
    	return operators;
    }*/
    
    public ArrayList<EObject> semanticCandidateExpressionProperty(EObject self) {
    	//System.out.println("Property: "+self.toString());
    	EList<EObject> eo = null;
    	ArrayList<EObject> list = new ArrayList<EObject>();
    	if(self instanceof Element) {
    		//System.out.println("Element");
    		eo = self.eContents();
    		for(EObject i:eo) {
    			if(i instanceof Property) {
    				Property property = (Property) i;
    				EList<Comparison> comparison1 = property.getComparison1();
    				EList<Comparison> comparison2 = property.getComparison2();
    				if(comparison1.isEmpty() && comparison2.isEmpty()) {
    					list.add(i);
    				}
    			}
    		}
    	}else if(self instanceof Comparison) {
    		//System.out.println("Comparison");
    		Property property = (Property) ((Comparison) self).getArgument1();
    		list.add((EObject) property);
    	}
    	return list;
    }
    
    public boolean creationPropertyIf(EObject self) {
    	//System.out.println(comparisonProperty instanceof Comparison);
    	return comparisonProperty instanceof Comparison;
    }
    
    public EObject getComparisonProperty(EObject self) {
    	//System.out.println(comparisonProperty.toString());
    	return comparisonProperty;
    }
    
    public boolean creationPropertyPrecondition(EObject self) {
    	boolean returnvalue = true;
    	if(self instanceof Comparison) {
    		Comparison comparison =(Comparison) self;
    		EObject argument1 = comparison.getArgument1();
			EObject argument2 = comparison.getArgument2();
			if(argument1 != null && argument2 != null) {
				returnvalue = false;
			}else if(argument1 instanceof Property || argument1 instanceof Property){
				returnvalue = false;
			}
    	}
    	return returnvalue;
    }
    
    public ArrayList<EObject> semanticCandidateExpressionTextliteral(EObject self) {
    	System.out.println(self.toString());
    	CompletePattern root = (CompletePattern) getWurzelContainer(self);
    	ParameterList parameterlist = root.getParameterList();
    	EList<Parameter> parameters = parameterlist.getParameters();
    	ArrayList<EObject> returnvalues = new ArrayList<EObject>();
    	for(Parameter parameter:parameters) {
    		if(parameter instanceof TextLiteralParam) {
    			System.out.println("Textliteral");
    			if(self instanceof Comparison) {
    				System.out.println("Comparison");
    				EList<Comparison> comparison1 =((TextLiteralParam) parameter).getComparison1();
    				EList<Comparison> comparison2 =((TextLiteralParam) parameter).getComparison2();
    				boolean isSelfInComparison1 = comparison1.contains((Comparison) self);
    				boolean isSelfInComparison2 = comparison2.contains((Comparison) self);
    				if(isSelfInComparison1 || isSelfInComparison2) {
    					System.out.println("Textliteral hat Comparison als Attribut");
    					returnvalues.add(parameter);
    				}
    			}
    		}
    	}
    	return returnvalues;
    }
}
