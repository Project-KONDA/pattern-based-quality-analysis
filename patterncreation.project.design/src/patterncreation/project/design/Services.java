package patterncreation.project.design;

import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.actions.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.requests.ArrangeRequest;
import org.eclipse.sirius.common.ui.tools.api.util.EclipseUIUtil;
import org.eclipse.sirius.viewpoint.SiriusPlugin;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import qualitypatternmodel.graphstructure.Comparable;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.operators.OperatorList;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.DateParam;
import qualitypatternmodel.parameters.DateTimeParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.TimeParam;
import qualitypatternmodel.parameters.UnknownParameterValue;
import qualitypatternmodel.parameters.impl.BooleanParamImpl;
import qualitypatternmodel.parameters.impl.DateParamImpl;
import qualitypatternmodel.parameters.impl.DateTimeParamImpl;
import qualitypatternmodel.parameters.impl.NumberParamImpl;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.parameters.impl.TimeParamImpl;
import qualitypatternmodel.parameters.impl.UnknownParameterValueImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.ElementMapping;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.NumberElement;
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
    		graphName = "ContextGraph";
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
    	//String id = ((PatternElement)self).getId();
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
    
    public ArrayList<EObject> semanticCandidatExpressionComparisonAlternative(EObject self) {//zeigt primitive vergleiche in elementen an, die anderen zwischen den elementen
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
    		//System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"+elementId);
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
    			//System.out.println("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqq"+(i!= null) +" "+ (i instanceof Comparison));
    			Comparison comparison = (Comparison) i;
    			EObject argument1 = comparison.getArgument1();
				EObject argument2 = comparison.getArgument2();
    			if(/*comparison.isPrimitive()*/!(argument1 instanceof Property && argument2 instanceof Property)) {//Comparisons, die Properties nur von einem Element und nicht von zwei Elementen vergleicht, sollen im Element angezeigt werden, die anderen im Graph
    				//System.out.println("Comparison ist primitiv");
    				String argument1Id = "";
    				String argument2Id = "";
    				
    				
    				
    				//System.out.println("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy"+((Property) argument1).toString());
    				if(argument1 instanceof Property) {
    					//System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"+((Property) argument1).toString());
    					argument1Id = ((Property) argument1).getElement().getId();
    					//System.out.println("Argument1 ist Property "+elementId+" / "+argument1Id);
    							if(argument1Id == elementId) {
    								//System.out.println("ID ist gleich");
    								elements2.add(i);
    							}
    				}else if(argument2 instanceof Property){//Argument2 ist Property
    					//System.out.println("Argument2 ist Property");
    					argument2Id = ((Property) argument2).getElement().getId();
    					if(argument2Id == elementId) {
    						//System.out.println("ID ist gleich");
							elements2.add(i);
						}
    				}else {//keine Property als Argument
    					elements3.add(i);
    				}
    				
    			}else {//Comparison zwischen zwei Elementen, nicht primitiv
    				elements3.add(i);
    			}
    		}
    	}
    	
    	if(self instanceof Element) {
    		//System.out.println(elements2);
    		return elements2;
    	}else {
    		//System.out.println(self.toString());
    		return elements3;
    	}
    	
    }
    
    public EList<EObject> semanticCandidatExpressionComparison(EObject self) {
    	EObject eo = null;
    	EList<EObject> contents = self.eContents();
    	for(EObject i:contents) {
    		if(i instanceof OperatorList) {
    			eo = i;
    		}
    	}
    	EList<EObject> elements = ((OperatorList)eo).eContents();
    	return elements;
    }
    
    public EObject printSelf(EObject self) {
    	/*EObject co = null;
		try {
			co = ((Comparison) self).getArgument1().getContainer();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("Self: "+co.toString());*/
    	System.out.println(self.toString());
    	
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
    		//Property property = (Property) ((Comparison) self).getArgument1();
    		//list.add((EObject) property);
    		
    		Comparison comparison = (Comparison) self;
    		EObject argument1 = comparison.getArgument1();
			EObject argument2 = comparison.getArgument2();
    		if(!(argument1 instanceof Property && argument2 instanceof Property)) {
    			Property property = (Property) comparison.getArgument1();
    			list.add((EObject) property);
    		}
    	}
    	return list;
    }
    
    public ArrayList<EObject> semanticCandidateExpressionProperty2(EObject self) {//ist für properties, die in einem comparison nicht angezeigt werden solleen, sie sollen nur im namen angezeigt werden
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
    		//Property property = (Property) ((Comparison) self).getArgument1();
    		//list.add((EObject) property);
    		
    		/*Comparison comparison = (Comparison) self;
    		EObject argument1 = comparison.getArgument1();
			EObject argument2 = comparison.getArgument2();
    		if(!(argument1 instanceof Property && argument2 instanceof Property)) {
    			Property property = (Property) comparison.getArgument1();
    			list.add((EObject) property);
    		}*/
    	}
    	return list;
    }
    
    public ArrayList<EObject> semanticCandidateExpressionProperty3(EObject self) {//zeigt properties in elementen, matches und in comparisons an
    	//System.out.println("Property: "+self.toString());
    	ArrayList<EObject> list = new ArrayList<EObject>();
    	if(self instanceof Element) {
    		EList<EObject> eo = self.eContents();
    		for(EObject i:eo) {
    			if(i instanceof Property) {
    				list.add(i);
    			}
    		}
    	}else if(self instanceof Comparison) {
    		Comparison comparison = (Comparison) self;
    		EObject argument1 = comparison.getArgument1();
			EObject argument2 = comparison.getArgument2();
			if(argument1 instanceof Property) {
				list.add(argument1);
			}
			if(argument2 instanceof Property) {
				list.add(argument2);
			}
    	}else if(self instanceof Match) {
    		Match match = (Match) self;
    		EObject property = match.getProperty();
    		if(property != null) {
    			list.add(property);
    		}
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
    	System.out.println(self.toString()+"aaaaaaaaaaaaaaaaa");
    	CompletePattern root = (CompletePattern) getWurzelContainer(self);System.out.println("1");
    	ParameterList parameterlist = root.getParameterList();System.out.println("2");
    	EList<Parameter> parameters = parameterlist.getParameters();System.out.println("3"+parameters.size());
    	ArrayList<EObject> returnvalues = new ArrayList<EObject>();System.out.println("4");
    	for(Parameter parameter:parameters) {
    		System.out.println("Schleife");
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
    
    public ArrayList<EObject> semanticCandidateExpressionParameterAlt(EObject self, String s) {
    	HashMap<String, Class<?>> typen = new HashMap<String, Class<?>>();
    	typen.put("Textliteral", TextLiteralParam.class);
    	typen.put("Value", UnknownParameterValue.class);
    	typen.put("Textlist", TextListParam.class);
    	typen.put("Number", NumberParam.class);
    	typen.put("Boolean", BooleanParam.class);
    	typen.put("Date", DateParam.class);
    	typen.put("Time", TimeParam.class);
    	typen.put("DateTime", DateTimeParam.class);
    	EObject rooteobject = getWurzelContainer(self);
    	CompletePattern root = null;
    	if(rooteobject instanceof CompletePattern) {
    		root = (CompletePattern) rooteobject;
    	}
    	ParameterList parameterlist = root.getParameterList();
    	EList<Parameter> parameters = parameterlist.getParameters();
    	ArrayList<EObject> returnvalues = new ArrayList<EObject>();
    	for(Parameter parameter:parameters) {
    		Class<?> typ = typen.get(s);
    		if(typ.isInstance(parameter)) {
    			if(self instanceof Comparison) {
    				EList<Comparison> comparison1 = ((Comparable) parameter).getComparison1();//((TextLiteralParam) parameter).getComparison1();
    				EList<Comparison> comparison2 = ((Comparable) parameter).getComparison2();//((TextLiteralParam) parameter).getComparison2();
    				boolean isSelfInComparison1 = comparison1.contains((Comparison) self);
    				boolean isSelfInComparison2 = comparison2.contains((Comparison) self);
    				if(isSelfInComparison1 || isSelfInComparison2) {
    					returnvalues.add(parameter);
    				}
    			}else if(self instanceof NumberElement){
    				NumberElement numberelement = (NumberElement) self;
    				returnvalues.add(numberelement.getNumberParam());
    			}
    		}
    	}
    	return returnvalues;
    }
    
    public ArrayList<EObject> semanticCandidateExpressionParameter(EObject self, String s) {
    	HashMap<String, Class<?>> typen = new HashMap<String, Class<?>>();
    	typen.put("Textliteral", TextLiteralParam.class);
    	typen.put("Value", UnknownParameterValue.class);
    	typen.put("Textlist", TextListParam.class);
    	typen.put("Number", NumberParam.class);
    	typen.put("Boolean", BooleanParam.class);
    	typen.put("Date", DateParam.class);
    	typen.put("Time", TimeParam.class);
    	typen.put("DateTime", DateTimeParam.class);
    	
    	ArrayList<EObject> returnvalues = new ArrayList<EObject>();
    	if(self instanceof Comparison) {
    		Comparison comparison = (Comparison) self;
    		Comparable argument1 = comparison.getArgument1();
    		Comparable argument2 = comparison.getArgument2();
    		Class<?> typ = typen.get(s);
    		if(typ.isInstance(argument1)) {
    			returnvalues.add(argument1);
    		}
    		if(typ.isInstance(argument2)) {
    			returnvalues.add(argument2);
    		}
    	}else if(self instanceof NumberElement){
			NumberElement numberelement = (NumberElement) self;
			returnvalues.add(numberelement.getNumberParam());
		}else if(self instanceof Match) {
			Match match =(Match) self;
			returnvalues.add(match.getRegularExpression());
		}
    	return returnvalues;
    }
    
    public void replacePropertyWithComparison(EObject self) {
    	//System.out.println(self.toString());
    	if(self instanceof Property) {
    		//System.out.println("Propety");
    		Property property = (Property) self;
    		//System.out.println(property.getComparison1());
    		if(property.getComparison1().isEmpty() && property.getComparison2().isEmpty()) {
    			//System.out.println("Property ist in keinem Comparison");
    			property.addComparison();
    		}
    	}
    }
    
    //es soll nur das countpattern in argument2 gelöscht werden können
    public boolean deleteCountPatternPrecondition(EObject self) {
    	CountPattern countpattern = (CountPattern) self;
    	boolean delete = false;
    	if(countpattern.getCountCondition() == null) {
    		delete = true;
    	}
    	return delete;
    }
    
    public String comparisonName(EObject self) {
    	String name = "";
    	Comparison comparison = (Comparison) self;
    	Comparable argument1 = comparison.getArgument1();
    	Comparable argument2 = comparison.getArgument2();
    	if(argument1 == null) {
    		name = "... o";
    	}else {
    		name = "Property " + argument1.getInternalId()+" o";
    	}
    	if(argument2 == null) {
    		name = name + " ...";
    	}else {
    		if(argument2 instanceof TextLiteralParam) {
    			name = name + " TextLiteral " + argument2.getInternalId();
    		}
    		//name = name + " Property " + argument2.getInternalId();
    	}
    	return name;
    }
    
    public void deleteArgument2Comparison(EObject self) {//löscht bei einem Comparison das zweite Argument
    	Comparison comparison = (Comparison) self;
    	comparison.setArgument2(null);
    }
    
    public boolean selectPropertyPrecondition(EObject self) {
    	boolean isComparison = false;
    	if(self instanceof Comparison) {
    		isComparison = true;
    	}
    	return isComparison;
    }
    
    public ArrayList<Property> getProperties(EObject self) {
    	Comparison comparison = null;
    	OperatorList operatorList = null;
    	Graph graph = null;
    	EList<Element> elements = null;
    	ArrayList<Property> properties = new ArrayList<Property>();
    	if(self instanceof Comparison) {
    		comparison = (Comparison) self;
    		operatorList = comparison.getOperatorList();
    		graph = operatorList.getGraph();
    		elements = graph.getElements();
    		for(Element element:elements) {
    			properties.addAll(element.getProperties());
    		}
    	}else if(self instanceof Match) {
    		Match match = (Match) self;
    		operatorList = match.getOperatorList();
    		graph = operatorList.getGraph();
    		elements = graph.getElements();
    		for(Element element:elements) {
    			properties.addAll(element.getProperties());
    		}
    	}
    	return properties;
    }
    
    public String featureNameSelectProperty(EObject self) {//hinzufügen einer Property zu einem Comparison, das gibt die kante zurück, in der die property gespeichert wird, auch hinzufügen von property zu match
    	String feature = "property";//Wert für Match
    	if(self instanceof Comparison) {
    		Comparison comparison = (Comparison) self;
    		if(comparison.getArgument1() == null) {
    			feature = "argument1";
    		}else {
    			feature = "argument2";
    		}
    	}

    	return feature;
    }
    
    public Element targetFinderExpressionComparisonArgument1and2(EObject self, String s) {
    	Comparison comparison = (Comparison) self;
    	Comparable argument = null;
    	if(s.equals("argument1")) {
    		argument = comparison.getArgument1();
    	}else {//argument2
    		argument = comparison.getArgument2();
    	}
    	Element element = null;
    	if(argument instanceof Property) {
    		Property property = (Property) argument;
    		element = property.getElement();
    	}
		return element;
    }
    
    public EObject addParameter(EObject self, String s) {
    	CompletePattern root = (CompletePattern) getWurzelContainer(self);
    	ParameterList parameterlist = root.getParameterList();
    	Parameter parameter = null;
    	if(s.equals("Textliteral")) {
    		parameter = new TextLiteralParamImpl();
    	}else if(s.equals("Value")) {
    		parameter = new UnknownParameterValueImpl();
    	}else if(s.equals("Textlist")) {
    		parameter = new TextListParamImpl();
    	}else if(s.equals("Number")) {
    		parameter = new NumberParamImpl();
    	}else if(s.equals("Boolean")) {
    		parameter = new BooleanParamImpl();
    	}else if(s.equals("Date")) {
    		parameter = new DateParamImpl();
    	}else if(s.equals("Time")) {
    		parameter = new TimeParamImpl();
    	}else if(s.equals("DateTime")) {
    		parameter = new DateTimeParamImpl();
    	}
    	parameterlist.add(parameter);
    	if(self instanceof NumberElement) {
    		System.out.println("pppppppppppppppppppppppppppp");
    		NumberElement numberelement = (NumberElement) self;
    		numberelement.setNumberParam((NumberParam) parameter);
    	}else if(self instanceof Match) {
    		Match match = (Match) self;
    		match.setRegularExpression((TextLiteralParam) parameter);
    	}else {//Comparison
    		Comparison comparison =(Comparison) self;
        	comparison.setArgument2((Comparable) parameter);
    	}
    	
    	
    	/*TextLiteralParam textliteral = new TextLiteralParamImpl();
    	parameterlist.add(textliteral);
    	Comparison comparison =(Comparison) self;
    	comparison.setArgument2(textliteral);*/
    	return self;
    }
    
    public EObject nametest(EObject self, EObject e) {//testet, ob bei einem doppelklick auf ein element der name geändert werden kann
    	((Element) e).setName("Hallo");
    	return self;
    }
    
    static HashMap<Element, Boolean> elementMarks = new HashMap<Element, Boolean>();
    static Element markedElement1 = null;
    static Element markedElement2 = null;
    public EObject changeColorOfElement(EObject self, EObject e) {//nach einem doppelklick auf element wird hier die markierung des elements und seines mappingelements hinzugefügt
    	boolean deleteMark = false;
    	Element element = (Element) e;
    	Boolean elementMark = elementMarks.get(element);
    	
    	EList<ElementMapping> elementmappings = element.getOutgoingMappings();
    	ElementMapping mapping = null;
    	Element target = null;
    	if(!elementmappings.isEmpty()) {
    		mapping = elementmappings.get(0);System.out.println("jjjjj"+mapping);
    		target = mapping.getTarget();
    	}else {//falls das element kein outgoingmapping hat, sondern ein incomingmapping
    		mapping = element.getIncomingMapping();
    		target = mapping.getSource();
    		System.out.println("Test"+mapping.getSource());
    	}
    	
    	Boolean targetMark = elementMarks.get(target);
    	
    	if(target != null) {//hat ein mapping
    		if(elementMark == null) {//ist nicht in der liste
    			elementMarks.put(element, true);
    		}else {//ist in der liste
    			if(elementMark == true) {//wird nur einmal benötigt, weil elementMark und targetMark immer gleich sein sollten
    				deleteMark = true;
    			}
    			elementMarks.put(element, !elementMark);
    		}
    		
    		if(targetMark == null) {//ist nicht in der liste
    			elementMarks.put(target, true);
    		}else {//ist in der liste
    			elementMarks.put(target, !targetMark);
    		}
    		
    		if(deleteMark) {
    			elementMarks.put(markedElement1, false);//markierung aufheben
    			elementMarks.put(markedElement2, false);//markierung aufheben
    			markedElement1 = null;
    			markedElement2 = null;
    		}else {
    			if(markedElement1 != null) {//prüfe nur eins, weil beide gesetzt sein sollten oder keins, hebt die vorherige markierung auf, bevor die neue geestzt wird
    				elementMarks.put(markedElement1, false);//markierung aufheben
        			elementMarks.put(markedElement2, false);//markierung aufheben
    			}
    			markedElement1 = element;
    			markedElement2 = target;
    		}
    		
    	}

    	return self;
    }
    
    HashSet<Element> markedElements = new HashSet<Element>();//merkt sich die markierten elemente, um später die markierungen zu entfernen
    HashSet<Element> visitedElements = new HashSet<Element>();// elemente, die beim sammeln der elemente, die markiert werden sollen, abgearbeitet wurden
    public EObject changeColorOfElement2(EObject self, EObject e) {//nach einem doppelklick auf element wird hier die markierung des elements und seines mappingelements hinzugefügt
    	System.out.println("Anfang");
    	Element element = (Element) e;
    	ArrayList<Element> elementsToVisit = new ArrayList<Element>();
    	boolean firstRun = true;
    	
    	if(markedElements.contains(element)) {//Doppelklick auf ein Element, das markiert ist, Markierungen werden aufgehoben
    		System.out.println("Element ist markiert");
    		for(Element me:markedElements) {
    			elementMarks.put(me, false);
    		}
    		markedElements.clear();
    		System.out.println("Element ist markiert2");
    	}else {//Doppelklick auf ein Element, das nicht markiert ist
    		System.out.println("Element ist nicht markiert");
    		if(markedElements.size() != 0) {//klick auf element, das nicht markiert ist, aber andere elemente sind markiert, die nicht markiert sein sollen
    			for(Element el:markedElements) {
    				elementMarks.put(el, false);
    			}
    			markedElements.clear();//hier werden, nachdem die markierungen aufgehoben wurden, die elemente aus der merkliste der markierten elemente gelöscht
    		}
    		while(firstRun || elementsToVisit.size() != 0) {//suche nach allen elemente, die über mappings verbunden sind und markiert werden müssen
    			System.out.println("while durchlauf");
        		if(firstRun) {
        			System.out.println("FirstRun");
        			firstRun = false;
        			ElementMapping incomingMapping = element.getIncomingMapping();
        			if(incomingMapping != null) {
        				elementsToVisit.add(element.getIncomingMapping().getSource());
        				elementMarks.put(element, true);
        				markedElements.add(element);
        			}
        			EList<ElementMapping> outgoingmappings = outgoingmappings = element.getOutgoingMappings();
        			if(outgoingmappings != null) {
        				for(ElementMapping em:outgoingmappings) {//kann nicht null sein, sondern leere liste
                    		elementsToVisit.add(em.getTarget());
                    	}
        				elementMarks.put(element, true);
        				markedElements.add(element);
        			}
        			visitedElements.add(element);
        			System.out.println("Element zum abarbeiten: "+elementsToVisit);
        		}else {
        			System.out.println("nicht FirstRun");
        			int etvnumber = elementsToVisit.size();
        			while(etvnumber != 0) {//Element etv:elementsToVisit
        				Element etv = elementsToVisit.get(0);//element aus elementtovisit, i ist immer 0, weil durch das löschen dieses elements im nächsten schleifendurchlauf am index 0 ein anderes element ist
        				System.out.println("Etv Durchlauf: "+etv);
        				if(visitedElements.contains(etv)) {//element wurde schon abgearbeitet
        					System.out.println("element wurde schon abgearbeitet");
        				}else {
        					System.out.println("element wurde noch nicht abgearbeitet");
        					visitedElements.add(etv);//element wird gerade abgearbeitet und so gekennzeichnet, dass es dann abgearbeitet wurde
        					ElementMapping incomingMapping = etv.getIncomingMapping();
        					if(incomingMapping != null) {
        						elementsToVisit.add(incomingMapping.getSource());
        					}
        					EList<ElementMapping> outgoingmappings = etv.getOutgoingMappings();
        	    			for(ElementMapping em:outgoingmappings) {
        	    				elementsToVisit.add(em.getTarget());System.out.println(em.getTarget()+"qqqqqqqqqqqqq");//hier
        	            	}
        	    			
        	    			Boolean elementMark = elementMarks.get(etv);
        	    			if(elementMark == null || elementMark == false) {//Falls es nicht markiert ist oder noch nie markiert wurde
        	    				elementMarks.put(etv, true);
        	    				markedElements.add(etv);
        	    				System.out.println("etv markiert");
        	    			}else if(elementMark == true) {//Falls es markiert ist
        	    				elementMarks.put(etv, false);
        	    				markedElements.remove(etv);
        	    				System.out.println("etv markierung weg");
        	    			}
        				}
        				elementsToVisit.remove(etv);
        				etvnumber = elementsToVisit.size();//die bedingung der whileschleife wird neu berechnet, weil elementtovisit verändert wurde
        				System.out.println("etv schleife ende");
        			}
        			System.out.println("nicht firstrun ende");
        		}
        		System.out.println("while ende "+(firstRun || elementsToVisit.size() != 0));
        	}
    	}
    	visitedElements.clear();
    	return self;
    }
    
    public boolean getElementMark(EObject self) {
    	Boolean mark = elementMarks.get(self);
    	if(mark == null) {
    		mark = false;
    	}
    	return mark;
    }
    
    public void deleteQuantifiedCondition(EObject self) {
    	EObject root = getWurzelContainer(self);
    	if(root instanceof CompletePattern) {
    		CompletePattern completePattern = (CompletePattern) root;
    		completePattern.setCondition(null);
    		System.out.println("qqqqqqqqqqqqqqqqqqqqqq");
    	}else {
    		System.out.println("wwwwwwwwwwwwwwwwwwwwww");
    	}
    }
    
    public boolean numberPrecondition(EObject self) {
    	boolean add = false;
    	if(self instanceof NumberElement) {
    		NumberElement numberelement = (NumberElement) self;
    		if(numberelement.getNumberParam() == null) {
    			add = true;
    		}
    	}else if(self instanceof Comparison) {
    		Comparison comparison = (Comparison) self;
    		Comparable argument1 = comparison.getArgument1();
    		Comparable argument2 = comparison.getArgument2();
    		if(argument1 == null && argument2 == null) {
    			add = true;
    		}else if(argument1 == null ^ argument2 == null) {
    			if(argument1 != null) {
    				if(argument1 instanceof Property) {
    					add = true;
    				}
    			}else {//argument2 != null
    				if(argument2 instanceof Property) {
    					add = true;
    				}
    			}
    		}
    	}
    	return add;
    }
    
    public boolean parameterPrecondition(EObject self, String s) {//beim hinzufügen
    	boolean add = false;
    	if(s.equals("Number") && self instanceof NumberElement) {
    		NumberElement numberelement = (NumberElement) self;
    		if(numberelement.getNumberParam() == null) {
    			add = true;
    		}
    	}else if(s.equals("Textliteral") && self instanceof Match) {
    		Match match = (Match) self;
    		TextLiteralParam regex = match.getRegularExpression();
    		if(regex == null) {
    			add = true;
    		}
    	}else if(self instanceof Comparison) {
    		Comparison comparison = (Comparison) self;
    		Comparable argument1 = comparison.getArgument1();
    		Comparable argument2 = comparison.getArgument2();
    		if(argument1 == null && argument2 == null) {
    			add = true;
    		}else if(argument1 == null ^ argument2 == null) {
    			if(argument1 != null) {
    				if(argument1 instanceof Property) {
    					add = true;
    				}
    			}else {//argument2 != null
    				if(argument2 instanceof Property) {
    					add = true;
    				}
    			}
    		}
    	}
    	return add;
    }
    
    public boolean conditionPrecondition(EObject self) {//beim hinzufügen
    	boolean add = false;
    	boolean hasCondition = true;
    	if(self instanceof Formula) {
    		Formula formula = (Formula) self;
    		Condition argument1 = formula.getCondition1();
    		Condition argument2 = formula.getCondition2();
    		if(argument1 == null || argument2 == null) {
    			add = true;
    		}
    	}else {
    		Condition condition = null;
    		if(self instanceof CompletePattern) {
        		CompletePattern completePattern = (CompletePattern) self;
        		condition = completePattern.getCondition();
    		}else if(self instanceof QuantifiedCondition) {
    			QuantifiedCondition quantifiedCondition = (QuantifiedCondition) self;
    			condition = quantifiedCondition.getCondition();
    		}else if(self instanceof CountCondition) {
    			hasCondition = false;
    		}else if(self instanceof NotCondition) {
    			NotCondition notCondition = (NotCondition) self;
    			condition = notCondition.getCondition();
    		}else if(self instanceof TrueElement) {
    			hasCondition = false;
    		}
    		if(hasCondition && condition == null) {
    			add = true;
    		}
    	}
    	return add;
    }
    
    public Element targetFinderExpressionMatch(EObject self) {//sucht das Element der Property des Match, um den Pfeil auszurichten
    	Match match = (Match) self;
    	Property argument = match.getProperty();
    	Element element = argument.getElement();
		return element;
    }
    
    public EList<Parameter> getParameter(EObject self) {//sucht alle Parameter, um sie wiederverwenden zu können
    	EObject root = getWurzelContainer(self);
    	CompletePattern completePattern = (CompletePattern) root;
    	ParameterList parameterList = completePattern.getParameterList();
    	EList<Parameter> parameter = parameterList.getParameters();
    	if(self instanceof Match) {
    		for(Parameter p:parameter) {
    			if(!(p instanceof TextLiteralParamImpl)) {
    				parameter.remove(p);
    			}
    		}
    	}
    	return parameter;
    }
    
    public boolean selectParameterPrecondition(EObject self) {//wann soll das Fenster zur Auswahl von Parametern geöffnet werden können
    	boolean open = false;
    	if(self instanceof Match) {
    		Match match = (Match) self;
    		TextLiteralParam regex = match.getRegularExpression();
    		if(regex == null) {
    			open = true;
    		}
    	}else if(self instanceof Comparison) {
    		Comparison comparison = (Comparison) self;
    		Comparable argument2 = comparison.getArgument2();
    		if(argument2 == null) {
    			open = true;
    		}
    	}
    	return open;
    }
    
    public String featureNameSelectParameter(EObject self) {//hinzufügen eines Parameters zu einem Comparison, das gibt die kante zurück, in der der Parameter gespeichert wird, auch hinzufügen von Parameter zu match
    	String feature = "regularExpression";//Wert für Match
    	if(self instanceof Comparison) {
    			feature = "argument2";
    	}

    	return feature;
    }
    
    public void discardArgument1(EObject self) {//entfernt argument1 von comparison und match, dort werden immer properties gespeichert
    	if(self instanceof Match) {
    		Match match = (Match) self;
    		match.setProperty(null);
    	}else if(self instanceof Comparison) {
    		Comparison comparison = (Comparison) self;
    		comparison.setArgument1(null);
    	}
    }
    
    public void discardArgument2(EObject self) {//entfernt argument2 von comparison und match, dort werden properties und parameter gespeichert
    	if(self instanceof Match) {
    		Match match = (Match) self;
    		match.setRegularExpression(null);
    		//löschen aus der parameterliste implementieren
    	}else if(self instanceof Comparison) {
    		Comparison comparison = (Comparison) self;
    		Comparable argument2 = comparison.getArgument2();
    		comparison.setArgument2(null);
    		/*System.out.println("öööööö"+argument2);
			if(argument2.getComparison2().size() == 0) {
				System.out.println("kzuglu");
				ParameterList parameterlist = argument2.getParameterList();
				parameterlist.getParameters().remove(argument2);
			}*/
    	}
    }
    
    public boolean discardArgument1Precondition(EObject self) {
    	boolean discard = false;
    	if(self instanceof Match) {
    		Match match = (Match) self;
    		Property property = match.getProperty();
    		if(property != null) {
    			discard = true;
    		}
    	}else if(self instanceof Comparison) {
    		Comparison comparison = (Comparison) self;
    		Comparable argument1 = comparison.getArgument1();
    		if(argument1 != null) {
    			discard = true;
    		}
    	}
    	return discard;
    }
    
    public boolean discardArgument2Precondition(EObject self) {
    	boolean discard = false;
    	if(self instanceof Match) {
    		Match match = (Match) self;
    		TextLiteralParam regex = match.getRegularExpression();
    		if(regex != null) {
    			discard = true;
    		}
    	}else if(self instanceof Comparison) {
    		Comparison comparison = (Comparison) self;
    		Comparable argument2 = comparison.getArgument2();
    		if(argument2 != null) {
    			discard = true;
    		}
    	}
    	return discard;
    }
    
    public ArrayList<EObject> candidatesExpressionDiscardArgument(EObject self) {//für das entfernen von argumenten von comparisons und matches über den selectionwizard
    	ArrayList<EObject> arguments = new ArrayList<EObject>();
    	if(self instanceof Match) {
    		Match match = (Match) self;
    		Property property = match.getProperty();
    		TextLiteralParam regex = match.getRegularExpression();
    		if(property != null) {
    			arguments.add(property);
    		}
    		if(regex != null) {
    			arguments.add(regex);
    		}
    	}else if(self instanceof Comparison) {
    		Comparison comparison = (Comparison) self;
    		Comparable argument1 = comparison.getArgument1();
    		Comparable argument2 = comparison.getArgument2();
    		if(argument1 != null) {
    			arguments.add(argument1);
    		}
    		if(argument2 != null) {
    			arguments.add(argument2);
    		}
    	}
    	return arguments;
    }
    
    public void discardArgument(EObject self, EObject element, EObject container) {//entfernt das ausgewählte argument von comparison und match
    	if(container instanceof Match) {
    		System.out.println("1");
    		Match match = (Match) container;
    		if(element instanceof TextLiteralParam) {
    			System.out.println("2"+match);
    			match.setRegularExpression(null);
    			/*TextLiteralParam textliteral = (TextLiteralParam) element;
    			System.out.println(textliteral.getMatches().size());
    			if(textliteral.getMatches().size() == 0) {
    				System.out.println("3");
    				ParameterList parameterlist = textliteral.getParameterList();
    				System.out.println("3,5"+parameterlist);
    				parameterlist.getParameters();//.remove(textliteral);
    				System.out.println("4");
    			}*/
    		}else {
    			match.setProperty(null);
    		}
    	}else if(container instanceof Comparison) {
    		Comparison comparison = (Comparison) container;
    		if(element == comparison.getArgument1()) {
    			comparison.setArgument1(null);
    		}else {
    			comparison.setArgument2(null);
    			Comparable argument2 = (Comparable) element;
    			if(argument2.getComparison2().size() == 0) {
    				ParameterList parameterlist = argument2.getParameterList();
    				parameterlist.getParameters().remove(argument2);
    			}
    		}
    		
    	}
    }
    
    public boolean elementIncomingmappingPrecondition(EObject self) {//decoration kein incomingmapping
    	boolean decoration = false;
    	Element element = (Element) self;
    	if(element.getIncomingMapping() == null) {
    		decoration = true;
    	}
    	return decoration;
    }
    
    public boolean hasReturnelementGraph(EObject self) {//decoration graph hat kein returnelement
    	boolean decoration = false;
    	Graph graph = (Graph) self;
    	if(graph.isReturnGraph()) {
    		EList<Element> elements = graph.getElements();
    		EList<Element> returnelements = graph.getReturnElements();
    		if(returnelements.isEmpty()) {
    			decoration = true;
    		}
    	}
    	return decoration;
    }
    
    public boolean isReturnelement(EObject self) {//decoration element ist returnelement
    	boolean decoration = false;
    	Element element = (Element) self;
    	Graph graph = element.getGraph();
    	if(graph.getReturnElements().contains(element)) {
    		decoration = true;
    	}
    	return decoration;
    }
    
    public boolean setReturnelement(EObject self) {//setzt ein element als returnelement
    	boolean decoration = false;
    	Element element = (Element) self;
    	Graph graph = element.getGraph();
    	graph.getReturnElements().add(element);
    	return decoration;
    }
    
    public ArrayList<Element> getElements(EObject self){//sucht für die selection von elementen die elemente
    	ArrayList<Element> elements = new ArrayList<Element>();
    	Comparison comparison = (Comparison) self;
    	try {
			PatternElement graph = comparison.getContainer().getContainer();
			elements.addAll(((Graph) graph).getElements());
			System.out.println(graph);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return elements;
    }
    
    public void setElementToComparison(EObject self, EObject element) {//setzt elemente als argumente von comparison
    	System.out.println("zzzzzzzzzzzzzzzz"+self);
    	Comparison comparison = (Comparison) self;
    	Comparable comparable = (Comparable) element;
    	if(comparison.getArgument1() == null) {
    		comparison.setArgument1(comparable);
    	}else if(comparison.getArgument2() == null) {
    		comparison.setArgument2(comparable);
    	}
    }
}
