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
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.common.ui.tools.api.util.EclipseUIUtil;
import org.eclipse.sirius.viewpoint.SiriusPlugin;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.adaptionxml.XmlRoot;
import qualitypatternmodel.graphstructure.Comparable;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.graphstructure.impl.RelationImpl;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.operators.OperatorList;
import qualitypatternmodel.operators.impl.ComparisonImpl;
import qualitypatternmodel.operators.impl.MatchImpl;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.DateParam;
import qualitypatternmodel.parameters.DateTimeParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.RelationOptionParam;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.TimeParam;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.parameters.impl.BooleanParamImpl;
import qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl;
import qualitypatternmodel.parameters.impl.DateParamImpl;
import qualitypatternmodel.parameters.impl.DateTimeParamImpl;
import qualitypatternmodel.parameters.impl.NumberParamImpl;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.parameters.impl.TimeParamImpl;
import qualitypatternmodel.parameters.impl.UntypedParameterValueImpl;
import qualitypatternmodel.parameters.impl.TypeOptionParamImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.ElementMapping;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.patternstructure.impl.QuantifiedConditionImpl;
import qualitypatternmodel.patternstructure.provider.QuantifiedConditionItemProvider;

/**
 * The services class used by VSM.
 */
/**
 * @author Lukas
 *
 */
/**
 * @author Lukas
 *
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
    
    /*public EObject browseExpressionProperty(EObject self) {
    	//System.out.println("Self: "+self.toString());
    	//comparisonProperty = self;
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
    }*/
    
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
    
    /*public boolean creationPropertyIf(EObject self) {
    	//System.out.println(comparisonProperty instanceof Comparison);
    	return comparisonProperty instanceof Comparison;
    }*/
    
    /*public EObject getComparisonProperty(EObject self) {
    	//System.out.println(comparisonProperty.toString());
    	return comparisonProperty;
    }*/
    
    public boolean creationPropertyPrecondition(EObject self) {
    	boolean returnvalue = false;
    	/*if(self instanceof Comparison) {
    		Comparison comparison =(Comparison) self;
    		EObject argument1 = comparison.getArgument1();
			EObject argument2 = comparison.getArgument2();
			if(argument1 != null && argument2 != null) {
				returnvalue = false;
			}else if(argument1 instanceof Property || argument1 instanceof Property){
				returnvalue = false;
			}
    	}*/
    	if(self instanceof Element) {
    		returnvalue = true;
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
    	typen.put("Value", UntypedParameterValue.class);
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
    	typen.put("Value", UntypedParameterValue.class);
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
    
    /*public void replacePropertyWithComparison(EObject self) {
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
    }*/
    
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
    		elements = graph.getElements();System.out.println(elements.size()+"llll");
    		for(Element element:elements) {
    			properties.addAll(element.getProperties());
    		}
    		
    		Comparable argument1 = comparison.getArgument1();
        	Comparable argument2 = comparison.getArgument2();
        	if(argument1 instanceof Property) {
        		properties.remove(argument1);
        	}
        	if(argument2 instanceof Property) {
        		properties.remove(argument2);
        	}
    	}else if(self instanceof Match) {
    		Match match = (Match) self;
    		operatorList = match.getOperatorList();
    		graph = operatorList.getGraph();
    		elements = graph.getElements();System.out.println(elements.size()+"uuuu");
    		for(Element element:elements) {
    			properties.addAll(element.getProperties());
    		}
    	}
    	
    	return properties;
    }
    
    public String featureNameSelectProperty(EObject self) {//hinzufügen einer Property zu einem Comparison, das gibt die kante zurück, in der die property gespeichert wird, auch hinzufügen von property zu match
    	System.out.println("wwwwwwwwwwwwwwwwwwwwwww"+self);
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
    	}else if (argument instanceof Element) {
    		element = (Element) argument;
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
    		parameter = new UntypedParameterValueImpl();
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
    	//parameterlist.add(parameter);
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
    
    static HashMap<Element, Boolean> elementMarks = new HashMap<Element, Boolean>();//speichert elemente und ob sie markiert sind
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
    		boolean isCondition = false;//ohne das würde das popup von quantifiedcondition bei element auftauchen im kontextmenü, das Objekt unter dem Mauspfeil ist eine Condition, wenn diese Variable true ist, bzw darf eine Condition hinzugefügt bekommen
    		if(self instanceof CompletePattern) {
        		CompletePattern completePattern = (CompletePattern) self;
        		condition = completePattern.getCondition();
        		isCondition = true;
    		}else if(self instanceof QuantifiedCondition) {
    			QuantifiedCondition quantifiedCondition = (QuantifiedCondition) self;
    			condition = quantifiedCondition.getCondition();
    			isCondition = true;
    		}else if(self instanceof CountCondition) {
    			hasCondition = false;
    			isCondition = true;
    		}else if(self instanceof NotCondition) {
    			NotCondition notCondition = (NotCondition) self;
    			condition = notCondition.getCondition();
    			isCondition = true;
    		}else if(self instanceof TrueElement) {
    			hasCondition = false;
    			isCondition = true;
    		}else if(self instanceof CountPattern) {
    			CountPattern countpattern = (CountPattern) self;
    			condition = countpattern.getCondition();
    			isCondition = true;
    		}
    		if(isCondition && hasCondition && condition == null) {
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
    		//Comparable argument2 = comparison.getArgument2();
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
    			/*Comparable argument2 = (Comparable) element;
    			if(argument2.getComparison2().size() == 0) {
    				ParameterList parameterlist = argument2.getParameterList();
    				parameterlist.getParameters().remove(argument2);
    			}*/
    		}
    		
    	}
    }
    
    public boolean elementIncomingmappingPrecondition(EObject self) {//decoration kein incomingmapping
    	boolean decoration = false;
    	Element element = (Element) self;
    	Graph graph = element.getGraph();
    	if(element.getIncomingMapping() == null && !graph.isReturnGraph()) {
    		decoration = true;
    	}
    	return decoration;
    }
    
    public boolean elementExistDecorationPrecondition(EObject self) {//decoration Quantor Exist
    	boolean decoration = false;
    	Element element = (Element) self;
    	Graph graph = element.getGraph();
    	QuantifiedCondition condition = graph.getQuantifiedCondition();
    	if(condition != null) {
    		Quantifier quantifier = condition.getQuantifier();
    		if(element.getIncomingMapping() == null && !graph.isReturnGraph() && quantifier == Quantifier.EXISTS) {
    			decoration = true;
    		}
    	}
    	return decoration;
    }
    
    public boolean elementForallDecorationPrecondition(EObject self) {//decoration Quantor Forall
    	boolean decoration = false;
    	Element element = (Element) self;
    	Graph graph = element.getGraph();
    	QuantifiedCondition condition = graph.getQuantifiedCondition();
    	if(condition != null) {
    		Quantifier quantifier = condition.getQuantifier();
    		if(element.getIncomingMapping() == null && !graph.isReturnGraph() && quantifier == Quantifier.FORALL) {
    			decoration = true;
    		}
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
    	if(element.getResultOf() != null && graph.isReturnGraph()/*graph.getReturnElements().contains(element)*/) {
    		decoration = true;
    	}
    	return decoration;
    }
    
    public void setReturnelement(EObject self) {//setzt ein element als returnelement
    	Element element = (Element) self;
    	//Graph graph = element.getGraph();
    	//graph.getReturnElements().add(element);
    	
    	element.setResultOf(element.getGraph());
    }
    
    public void deleteReturnelement(EObject self) {//löscht ein element als returnelement
    	Element element = (Element) self;
    	//Graph graph = element.getGraph();
    	//graph.getReturnElements().add(element);
    	
    	element.setResultOf(null);
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
    	Comparable argument1 = comparison.getArgument1();
    	Comparable argument2 = comparison.getArgument2();
    	if(argument1 instanceof Element) {
    		elements.remove(argument1);
    	}
    	if(argument2 instanceof Element) {
    		elements.remove(argument2);
    	}
    	return elements;
    }
    
    public void setElementToComparison(EObject self, EObject element) {//setzt elemente als argumente von comparisonSystem.out.println("zzzzzzzzzzzzzzzz"+self);
    	Comparison comparison = (Comparison) self;
    	Comparable comparable = (Comparable) element;
    	if(comparison.getArgument1() == null) {
    		comparison.setArgument1(comparable);
    	}else if(comparison.getArgument2() == null) {
    		comparison.setArgument2(comparable);
    	}
    }
    
    public boolean selectElementPrecondition(EObject self) {//kann auch für selectproperty verwendet werden
    	boolean open = false;
    	if(self instanceof Comparison) {
    		Comparison comparison = (Comparison) self;
        	Comparable argument1 = comparison.getArgument1();
        	Comparable argument2 = comparison.getArgument2();
        	if(argument1 == null) {
        		open = true;
        	}else if (argument2 == null) {
        		open = true;
        	}
    	}else if(self instanceof Match){
    		Match match = (Match) self;
    		Comparable property = match.getProperty();
        	if(property == null) {
        		open = true;
        	}
    	}
    	return open;
    }
    
    public boolean returnelementmarkPrecondition(EObject self) {
    	boolean open = false;
    	if(self instanceof Element) {
    		Element element = (Element) self;
    		Graph graph = element.getGraph();
    		if(graph.isReturnGraph() && element.getResultOf() == null) {
    			open = true;
    		}
    	}
    	return open;
    }
    
    public boolean deleteReturnelementmarkPrecondition(EObject self) {
    	boolean open = false;
    	if(self instanceof Element) {
    		Element element = (Element) self;
    		Graph graph = element.getGraph();
    		if(graph.isReturnGraph() && element.getResultOf() != null) {
    			open = true;
    		}
    	}
    	return open;
    }
    
    public boolean isContextgraph(EObject self) {//condition für den conditionalstyle von graph
    	boolean isContextgraph = false;
    	if(self instanceof Graph) {
    		Graph graph = (Graph) self;
    		isContextgraph = graph.isReturnGraph();
    	}
    	return isContextgraph;
    }
    
    public ArrayList<LogicalOperator> getOperators(EObject self){
    	ArrayList<LogicalOperator> operators = new ArrayList<LogicalOperator>();
    	operators.add(LogicalOperator.AND);
    	operators.add(LogicalOperator.OR);
    	operators.add(LogicalOperator.IMPLIES);
    	operators.add(LogicalOperator.XOR);
    	operators.add(LogicalOperator.EQUAL);
    	return operators;
    }
    
    public boolean changeOperatorPrecondition(EObject self) {
    	boolean open = false;
    	if(self instanceof Formula) {
    		open = true;
    	}
    	return open;
    }
    
    public void setOperator(EObject self, EObject element, LogicalOperator operator) {
    	if(element instanceof Formula) {
    		Formula formula = (Formula) element;
    		formula.setOperator(operator);
    	}
    }
    
    public LogicalOperator changeOperatorValueExpression(EObject self, EObject element) {//guckt welcher operator gerade gewählt ist, das returnelement muss in getOperators vorkommen
    	LogicalOperator operator = null;
    	if(element instanceof Formula) {
    		Formula formula = (Formula) element;
    		operator = formula.getOperator();
    	}
    	return operator;
    }
    
    public ArrayList<Quantifier> getQuantifiers(EObject self){
    	ArrayList<Quantifier> quantifiers = new ArrayList<Quantifier>();
    	quantifiers.add(Quantifier.EXISTS);
    	quantifiers.add(Quantifier.FORALL);
    	return quantifiers;
    }
    
    public boolean changeQuantifierPrecondition(EObject self) {
    	boolean open = false;
    	if(self instanceof QuantifiedCondition) {
    		open = true;
    	}
    	return open;
    }
    
    public void setQuantifier(EObject self, EObject element, Quantifier quantifier) {
    	if(element instanceof QuantifiedCondition) {
    		QuantifiedCondition quantifiedcondition = (QuantifiedCondition) element;
    		quantifiedcondition.setQuantifier(quantifier);
    	}
    }
    
    public Quantifier changeQuantifierValueExpression(EObject self, EObject element) {//guckt welcher quantifier gerade gewählt ist, das returnelement muss in getQuantifiers vorkommen
    	Quantifier quantifier = null;
    	if(element instanceof QuantifiedCondition) {
    		QuantifiedCondition quantifiedcondition = (QuantifiedCondition) element;
    		quantifier = quantifiedcondition.getQuantifier();
    	}
    	return quantifier;
    }
    
    static Quantifier radioq = Quantifier.EXISTS;
    public void storeQuantifier(EObject self, Quantifier q) {
    	//System.out.println(q);
    	radioq = q;
    }
    
    public Quantifier getQuantifier(EObject self) {
    	return radioq;
    }
    
    public void printQ(EObject self) {
    	System.out.println(radioq);
    }
    
    public Quantifier getForall(EObject self) {
    	return Quantifier.FORALL;
    }
    
    static LogicalOperator radioo = LogicalOperator.AND;
    public void storeOperator(EObject self, LogicalOperator o) {
    	radioo = o;
    }
    
    public LogicalOperator getOperator(EObject self) {
    	return radioo;
    }
    
    public LogicalOperator getSpecificOperator(EObject self, String s) {
    	LogicalOperator operator = null;
    	if(s.equals("and")) {
    		operator = LogicalOperator.AND;
    	}else if(s.equals("or")) {
    		operator = LogicalOperator.OR;
    	}else if(s.equals("implies")) {
    		operator = LogicalOperator.IMPLIES;
    	}else if(s.equals("xor")) {
    		operator = LogicalOperator.XOR;
    	}else if(s.equals("equal")) {
    		operator = LogicalOperator.EQUAL;
    	}
    	return operator;
    }
    
    public boolean countpatternPreconditionPopup(EObject self) {//geht auch bei numberelement
    	boolean open = false;
    	if(self instanceof CountCondition) {
    		CountCondition condition = (CountCondition) self;
    		if(condition.getArgument2() == null) {
    			open = true;
    		}
    	}
    	return open;
    }
    
    public boolean elementPreconditionPopup(EObject self) {
    	boolean open = false;
    	if(self instanceof Graph) {
    		open = true;
    	}
    	return open;
    }
    
    static ArrayList<Element> elementsRelation = null;
    public ArrayList<Element> getElementsForRelationCreation(EObject self){//sucht für die erstellung von relation über das kontextmenü die elemente
    	ArrayList<Element> elements = new ArrayList<Element>();
    	if(self instanceof Graph) {
    		Graph graph = (Graph) self;
    		elements.addAll(graph.getElements());
    	}
    	elementsRelation = elements;
    	return elements;
    }
    
    static EObject selectedElement1 = null;
    public void storeElement1Relation(EObject self, EObject e1){//speichert element1 von relation über kontextmenü von select
    	selectedElement1 = e1;
    }
    
    public EObject getElement1Relation(EObject self){
    	return selectedElement1;
    }
    
    static EObject selectedElement2 = null;
    public void storeElement2Relation(EObject self, EObject e2){//speichert element2 von relation über kontextmenü von select
    	selectedElement2 = e2;
    }
    
    public EObject getElement2Relation(EObject self){
    	return selectedElement2;
    }
    
    public ArrayList<Element> getElementsForRelationCreation2(EObject self){//sucht für die erstellung von relation über das kontextmenü die elemente für das zweite select
    	elementsRelation.remove(selectedElement1);
    	return elementsRelation;
    }
    
    public void createRelation(EObject self) {//erstellt relation über kontextmenü
    	if(selectedElement1 != null && selectedElement2 != null) {
    		Element e1 = (Element) selectedElement1;
    		Element e2 = (Element) selectedElement2;
    		if(self instanceof Graph) {
    			Graph graph = (Graph) self;
    			graph.addRelation(e1, e2);
    		}
    	}
    }
    
    public void setE1E2ToNull(EObject self) {//setzt selectetElement1 und selectedElement2 auf null, damit bei erneutem aufruf des dialogs die select objecte nichts anzeigen
    	selectedElement1 = null;
    	selectedElement2 = null;
    }
    
    public boolean relationPreconditionPopup(EObject self) {
    	boolean open = false;
    	if(self instanceof Graph) {
    		open = true;
    	}
    	return open;
    }
    
    static EObject selectedProperty = null;
    
    public void storeProperty(EObject self, EObject p) {//speichert die property, die im select von select property as argument über das kontextmenü ausgewählt wurde
    	selectedProperty = p;
    }
    
    public EObject getProperty(EObject self) {//gibt die property, die im select von select property as argument über das kontextmenü ausgewählt wurde, zurück
    	return selectedProperty;
    }
    
    public void setPropertyToNull(EObject self) {//setzt selectedProperty auf null, damit bei erneutem aufruf des dialogs die select objecte nichts anzeigen
    	selectedProperty = null;
    }
    
    static EObject selectedParameter = null;
    
    public void storeParameter(EObject self, EObject p) {//speichert die property, die im select von select property as argument über das kontextmenü ausgewählt wurde
    	selectedParameter = p;
    }
    
    public EObject getParameterPopup(EObject self) {//gibt die property, die im select von select property as argument über das kontextmenü ausgewählt wurde, zurück
    	return selectedParameter;
    }
    
    public void setParameterToNull(EObject self) {//setzt selectedProperty auf null, damit bei erneutem aufruf des dialogs die select objecte nichts anzeigen
    	selectedParameter = null;
    }
    
    static EObject selectedElement = null;
    
    public void storeElement(EObject self, EObject e) {//speichert die property, die im select von select property as argument über das kontextmenü ausgewählt wurde
    	selectedElement = e;
    }
    
    public EObject getElementPopup(EObject self) {//gibt die property, die im select von select property as argument über das kontextmenü ausgewählt wurde, zurück
    	return selectedElement;
    }
    
    public void setElementToNull(EObject self) {//setzt selectedProperty auf null, damit bei erneutem aufruf des dialogs die select objecte nichts anzeigen
    	selectedElement = null;
    }
    
    public void setElementToComparisonPopup(EObject self) {//setzt selectedProperty auf null, damit bei erneutem aufruf des dialogs die select objecte nichts anzeigen
    	setElementToComparison(self, selectedElement);
    }
    
    public boolean discardArgumentPrecondition(EObject self) {
    	boolean open = false;
    	if(self instanceof Comparison) {
    		Comparison comparison = (Comparison) self;
    		Comparable argument1 = comparison.getArgument1();
    		Comparable argument2 = comparison.getArgument2();
    		if(argument1 != null || argument2 != null) {
    			open = true;
    		}
    	}else if(self instanceof Match) {
    		Match match = (Match) self;
    		Property argument1 = match.getProperty();
    		TextLiteralParam argument2 = match.getRegularExpression();
    		if(argument1 != null || argument2 != null) {
    			open = true;
    		}
    	}
    	return open;
    }
    
    static boolean isAbstract = false;
    /**
     * Returns its parameter without change. Shows a message dialog on the first opening of an abstract pattern.
     * @param self the complete pattern
     * @return the parameter of this method
     */
    public EObject abstractPatternStart(EObject self) {//soll beim ersten Öffnen eines abstrakten Musters ein Dialog zeigen, vielleicht abhängig von der Methode, die genutzt wird, um ein abstraktes Muster von einem generischen Muster zu erstellen
    	System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvv"+self+isAbstract);
		if (self instanceof CompletePattern) {
			System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
			CompletePattern pattern = (CompletePattern) self;
			if (!pattern.isAdaptionStarted()) {

				try {
					System.out.println("lllllllllllllllllllllllllllllllll");
					pattern.isValid(AbstractionLevel.GENERIC);
					System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
					pattern.createXMLAdaption();
					System.out.println("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
					Display.getDefault().syncExec(new Runnable() {
						public void run() {
							String message = "This is an abstract pattern. It was adapted to use with a xml-database. It is from now on immutable, only relations should be changed to xml relations. After the exchange this pattern should be finalized.";
							MessageDialog dialog = new MessageDialog(new Shell(), "New abstract pattern", null, message, MessageDialog.INFORMATION, new String[] { "Ok" }, 0);
							int result = dialog.open();
							System.out.println(result + " " + isAbstract);
						}
					});
					//isAbstract = true;
					System.out.println("oooooooooooooooooooooooooooooooooo");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("wurde abgefangen abstractPatternStart");
					//isAbstract = true;
				}
			}
		}
		return self;
    }
    
    public void printisabstract(EObject self) {
    	System.out.println("hhhhhhhhhhhhhhhhhhhhh "+isAbstract);
    }
    
    public boolean isRelationPrecondition(EObject self) {//Precondition, ob eine Relation durch xml ersetzt werden darf, deshalb wird auch finalized abgefragt
    	boolean open = false;
    	System.out.println("1");
    	if(self instanceof Relation) {// && !finalized
    		System.out.println("2");
    		Relation relation = (Relation) self;
    		System.out.println("3");
    		CompletePattern pattern = (CompletePattern) getWurzelContainer(self);//(CompletePattern) relation.eContainer().eContainer();
    		System.out.println("4");
    		if(!pattern.isAdaptionFinalized()) {
    			System.out.println("5");
    			open = true;
    		}
    	}
    	return open;
    }
    
    public void setRelationToXmlnavigation(EObject self) {
    	if(self instanceof Relation) {
    		Relation relation = (Relation) self;
    		relation.adaptAsXMLNavigation();
    	}
    }
    
    public void setRelationToXmlreference(EObject self) {
    	if(self instanceof Relation) {
    		Relation relation = (Relation) self;
    		relation.adaptAsXMLReference();
    	}/*else if(self instanceof XmlNavigation) {
    		System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
    		XmlNavigation xmlnavigation = (XmlNavigation) self;
    		xmlnavigation.adaptAsXMLReference();
    	}*/
    }
    
    public boolean isXmlnavigation(EObject self) {
    	System.out.println("pokpjozkujpokpojkuokjpuok");
    	boolean isXmlnavigation = false;
    	if(self instanceof XmlNavigation) {
    		isXmlnavigation = true;
    	}
    	return isXmlnavigation;
    }
    
    public boolean isXmlreference(EObject self) {
    	System.out.println("2lydughöpsioghösiotjäsioetj");
    	boolean isXmlreference = false;
    	if(self instanceof XmlReference) {
    		isXmlreference = true;
    	}
    	return isXmlreference;
    }
    
    public boolean isXmlrelation(EObject self, EObject e) {
    	boolean isXmlrelation = false;
    	if(isXmlnavigation(e) || isXmlreference(e)) {
    		isXmlrelation = true;
    	}
    	return isXmlrelation;
    }
    
    public boolean isNotXmlrelation(EObject self, EObject e) {
    	return !isXmlrelation(self, e);
    }
    
    public boolean finalizeXmladaptionPrecondition(EObject self) {
    	boolean open = false;
    	if(self instanceof CompletePattern) {// && !finalized
    		CompletePattern pattern = (CompletePattern) self;
    		if(pattern.relationsXmlAdapted() && !pattern.isAdaptionFinalized()){
    			open = true;
    		}
    	}
    	return open;
    }
    
    public boolean finalizeDoubleClick(EObject self, EObject e) {//prüft, ob alle relationen ersetzt wurden und das muster noch nicht finalisiert wurde
    	boolean open = false;
    	if(e instanceof CompletePattern) {// && !finalized
    		CompletePattern pattern = (CompletePattern) e;
    		if(pattern.relationsXmlAdapted() && !pattern.isAdaptionFinalized()) {
        		open = true;
        	}
    	}
    	return open;
    }
    
    public boolean notFinalizeDoubleClick(EObject self, EObject e) {
    	boolean open = false;
    	if(e instanceof CompletePattern) {// && !finalized
    		CompletePattern pattern = (CompletePattern) e;
    		if(!pattern.relationsXmlAdapted() && !pattern.isAdaptionFinalized()) {
        		open = true;
        	}
    	}
    	return open;
    }
    
    //static boolean finalized = false;
    public void finalizeXmladaption(EObject self, EObject e) {//finalisiert das muster
    	System.out.println("1");
    	if(e instanceof CompletePattern) {
    		CompletePattern pattern = (CompletePattern) e;
    		System.out.println("2");
    		try {
				pattern.finalizeXMLAdaption();
				//finalized = true;
				System.out.println("3");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				System.out.println("wurde abgefangen finalizeXmladaption");
			}
    	}
    }
    
    public boolean isXmlroot(EObject self) {
    	boolean isXmlroot = false;
    	if(self instanceof XmlRoot) {
    		isXmlroot = true;
    	}
    	return isXmlroot;
    }
    
    public ArrayList<String> getRelations(EObject self){//für wizard, um relation durch xml zu erstetzen
    	ArrayList<String> relations = new ArrayList<String>();
    	relations.add("relation");
    	relations.add("xmlnavigation");
    	relations.add("xmlreference");
    	return relations;
    }
    
    public ArrayList<String> getXmlRelations(EObject self){//für wizard, um zwischen xmlrelationen zu wechseln
    	ArrayList<String> relations = new ArrayList<String>();
    	relations.add("xmlnavigation");
    	relations.add("xmlreference");
    	return relations;
    }
    
    static String selectedRelation = "relation";
    public void storeRelation(EObject self, String s) {
    	//System.out.println(q);
    	selectedRelation = s;
    }
    
    public String getRelation(EObject self9) {
    	return selectedRelation;
    }
    
    public void changeRelation(EObject self, EObject e) {
    	System.out.println("22222222222222222222"+e);
    	if(e instanceof Relation) {
    		System.out.println("333333333333333333"+selectedRelation);
    		Relation relation = (Relation) e;
    		if(selectedRelation.equals("relation")) {
    			
    		}else if(selectedRelation.equals("xmlnavigation")) {
    			System.out.println("6666666666666666666666666"+selectedRelation);
    			relation.adaptAsXMLNavigation();
    			System.out.println("11111111111111111111111"+selectedRelation);
    		}else if(selectedRelation.equals("xmlreference")) {
    			System.out.println("44444444444444444444444444444"+selectedRelation);
    			relation.adaptAsXMLReference();
    			System.out.println("5555555555555555555555"+selectedRelation);
    		}
    	}
    }
    
    public void setRelationToDefault(EObject self) {
    	selectedRelation = "relation";
    }
    
    public void setSelectedRelation(EObject self, EObject e){
    	if(e instanceof XmlNavigation) {
    		selectedRelation = "xmlnavigation";
    	}else if(e instanceof XmlReference) {
    		selectedRelation = "xmlreference";
    	}
    }
    
    public boolean isFinalized(EObject self, EObject e) {
    	/*boolean isFinalized = false;
    	if(e instanceof CompletePattern) {
    		CompletePattern pattern = (CompletePattern) e;
    		try {
				pattern.isValid(AbstractionLevel.ABSTRACT);
				isFinalized = true;
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				System.out.println("wurde abgefangen isFinalized");
			}
    		
    	}
    	return isFinalized;*/
    	boolean isFinalized = false;
    	if(e instanceof CompletePattern) {
    		CompletePattern pattern = (CompletePattern) e;
    		if(pattern.isAdaptionFinalized()) {
        		isFinalized = true;
        	}
    	}
    	return isFinalized;
    }
    
    public void addComparison(EObject self) {
    	if(self instanceof Graph) {
    		Graph graph = (Graph) self;
    		OperatorList operatorlist = graph.getOperatorList();
    		/*CompletePattern pattern = null;
			try {
				pattern = (CompletePattern) getWurzelContainer(self);//graph.getContainer(); geht nicht, falls der graph in einer quantifiedcondition ist
				//EObject cool = getWurzelContainer(self);
				//System.out.println("////////////////////////////////////////////////"+cool);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
    		//ParameterList parameterlist = pattern.getParameterList();
    		Comparison comparison = new ComparisonImpl();
    		//ComparisonOptionParam comparisonoptionparam = new ComparisonOptionParamImpl();
    		//comparison.setOption(comparisonoptionparam);
    		//parameterlist.add(comparisonoptionparam);
    		operatorlist.add(comparison);
    		
    	}
    }
    
    public void addMatch(EObject self) {
    	if(self instanceof Graph) {
    		Graph graph = (Graph) self;
    		OperatorList operatorlist = graph.getOperatorList();
    		/*CompletePattern pattern = null;
			try {
				pattern = (CompletePattern) getWurzelContainer(self);//pattern = (CompletePattern) graph.getContainer();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
    		//ParameterList parameterlist = pattern.getParameterList();
    		Match match = new MatchImpl();
    		//BooleanParam booleanparam = new BooleanParamImpl();
    		//match.setOption(booleanparam);
    		//parameterlist.add(booleanparam);
    		operatorlist.add(match);
    		
    	}
    }
    //ab hier Konkretisierungsview
    public ArrayList<EObject> getParameterlistElements(EObject self) {//sucht alle Objekte in der Parameterliste, diese müssen konkretisiert werden
    	ArrayList<EObject> elements = new ArrayList<EObject>();
    	if(self instanceof CompletePattern) {
    		CompletePattern pattern = (CompletePattern) self;
    		ParameterList parameterlist = pattern.getParameterList();
    		elements.addAll(parameterlist.getParameters());
    	}
    	return elements;
    }
    
    public String getParameterlistElementsIteratorName(EObject self, EObject iterator) {//Namen zu einem Element der Parameterliste, Iterator der Forschleife ist eine Element der Parameterliste
    	String name = "";
    	PatternElement patternelement = (PatternElement) iterator;
    	if(isModifiable(iterator)) {
    		name = getModifiableName(iterator);
    	}else if(iterator instanceof BooleanParam) {
    		name = "Boolean " + patternelement.getInternalId();
    	}else if(iterator instanceof TextLiteralParam) {
    		name = "Textliteral " + patternelement.getInternalId();
    	}else if(iterator instanceof TextListParam) {
    		name = "Textlist " + patternelement.getInternalId();
    	}else if(iterator instanceof NumberParam) {
    		name = "Number " + patternelement.getInternalId();
    	}else if(iterator instanceof DateParam) {
    		name = "Date " + patternelement.getInternalId();
    	}else if(iterator instanceof TimeParam) {
    		name = "Time " + patternelement.getInternalId();
    	}else if(iterator instanceof DateTimeParam) {
    		name = "DateTime " + patternelement.getInternalId();
    	}else if(iterator instanceof ComparisonOptionParam) {
    		name = "ComparisonOption " + patternelement.getInternalId();
    	}else if(iterator instanceof TypeOptionParam) {
    		name = "TypeOption " + patternelement.getInternalId();
    	}else if(iterator instanceof RelationOptionParam) {
    		name = "RelationOption " + patternelement.getInternalId();
    	}
    	return name;
    }
    
    public String getModifiableName(EObject iterator) {
    	String name = "";
    	PatternElement patternelement = (PatternElement) iterator;
    	if(iterator instanceof UntypedParameterValue) {
    		name = "UntypedParameterValue (modifiable) " + patternelement.getInternalId();
    	}else if(iterator instanceof BooleanParam) {
    		name = "Boolean (modifiable) " + patternelement.getInternalId();
    	}else if(iterator instanceof TextLiteralParam) {
    		name = "Textliteral (modifiable) " + patternelement.getInternalId();
    	}else if(iterator instanceof TextListParam) {
    		name = "Textlist (modifiable) " + patternelement.getInternalId();
    	}else if(iterator instanceof NumberParam) {
    		name = "Number (modifiable) " + patternelement.getInternalId();
    	}else if(iterator instanceof DateParam) {
    		name = "Date (modifiable) " + patternelement.getInternalId();
    	}else if(iterator instanceof TimeParam) {
    		name = "Time (modifiable) " + patternelement.getInternalId();
    	}else if(iterator instanceof DateTimeParam) {
    		name = "DateTime (modifiable) " + patternelement.getInternalId();
    	}
    	return name;
    }
    
    public boolean isModifiable(EObject object) {
    	ParameterValue value = (ParameterValue) object;
    	return value.isTypeModifiable();
    }
    
    public boolean isBooleanParam(EObject self, EObject iterator) {//prüft, ob das Element des Iterators ein booleanparam ist
    	boolean isBooleanParam = false;
    	if(iterator instanceof BooleanParam) {
    		isBooleanParam = !isModifiable(iterator);
    	}
    	return isBooleanParam;
    }
    
    public boolean isTextliteralParam(EObject self, EObject iterator) {//prüft, ob das Element des Iterators ein textliteralparam ist
    	boolean isTextliteralParam = false;
    	if(iterator instanceof TextLiteralParam) {
    		isTextliteralParam = true;
    	}
    	return isTextliteralParam;
    }
    
    public boolean isTextlistParam(EObject self, EObject iterator) {//prüft, ob das Element des Iterators ein textlistparam ist
    	boolean isTextlistParam = false;
    	if(iterator instanceof TextListParam) {
    		isTextlistParam = true;
    	}
    	return isTextlistParam;
    }
    
    public boolean isNumberParam(EObject self, EObject iterator) {//prüft, ob das Element des Iterators ein number ist
    	boolean isNumberParam = false;
    	if(iterator instanceof NumberParam) {
    		isNumberParam = true;
    	}
    	return isNumberParam;
    }
    
    public boolean isDateParam(EObject self, EObject iterator) {//prüft, ob das Element des Iterators ein date ist
    	boolean isDateParam = false;
    	if(iterator instanceof DateParam) {
    		isDateParam = true;
    	}
    	return isDateParam;
    }
    
    public boolean isTimeParam(EObject self, EObject iterator) {//prüft, ob das Element des Iterators ein time ist
    	boolean isTimeParam = false;
    	if(iterator instanceof TimeParam) {
    		isTimeParam = true;
    	}
    	return isTimeParam;
    }
    
    public boolean isDateTimeParam(EObject self, EObject iterator) {//prüft, ob das Element des Iterators ein datetime ist
    	boolean isDateTimeParam = false;
    	if(iterator instanceof DateTimeParam) {
    		isDateTimeParam = true;
    	}
    	return isDateTimeParam;
    }
    
    public boolean isComparisonOptionParam(EObject self, EObject iterator) {//prüft, ob das Element des Iterators ein comparisonoption ist
    	boolean isComparisonOptionParam = false;
    	if(iterator instanceof ComparisonOptionParam) {
    		isComparisonOptionParam = true;
    	}
    	return isComparisonOptionParam;
    }
    
    public boolean isTypeOptionParam(EObject self, EObject iterator) {//prüft, ob das Element des Iterators ein typeoption ist
    	boolean isTypeOptionParam = false;
    	if(iterator instanceof TypeOptionParam) {
    		isTypeOptionParam = true;
    	}
    	return isTypeOptionParam;
    }
    
    public boolean isRelationOptionParam(EObject self, EObject iterator) {//prüft, ob das Element des Iterators ein typeoption ist
    	boolean isRelationOptionParam = false;
    	if(iterator instanceof RelationOptionParam) {
    		isRelationOptionParam = true;
    	}
    	return isRelationOptionParam;
    }
    
    public boolean isUntypedParameterValue(EObject self, EObject iterator) {//prüft, ob das Element des Iterators ein untypedparametervalue ist
    	boolean isUntypedParameterValue = false;
    	if(iterator instanceof UntypedParameterValue) {
    		isUntypedParameterValue = true;
    	}else if(iterator instanceof ParameterValue) {
    		ParameterValue parametervalue = (ParameterValue) iterator;
    		if(parametervalue.isTypeModifiable()) {
    			isUntypedParameterValue = true;
    		}
    	}
    	return isUntypedParameterValue;
    }
    
    public ArrayList<EObject> getRelatedElements(EObject object){//sucht die Elemente heraus, die markiert werden müssen, wenn ein Objekt in der View mit der Checkbox ausgewählt wird
    	ArrayList<EObject> returnlist = new ArrayList<EObject>();//die gesuchten Elemente
    	
    	if(object instanceof BooleanParam) {//noch nicht fertig
    		//System.out.println("object ist Boolean");
    		BooleanParam booleanparam = (BooleanParam) object;
    		
    		EList<Comparison> comparisonArgument1 = booleanparam.getComparison1();
    		EList<Comparison> comparisonArgument2 = booleanparam.getComparison2();
    		EList<Match> matches = booleanparam.getMatches();
    		
    		returnlist.addAll(comparisonArgument1);
    		returnlist.addAll(comparisonArgument2);
    		returnlist.addAll(matches);
    		returnlist.add(object);
    		
    		/*System.out.println(comparisonArgument1);
    		System.out.println(comparisonArgument2);
    		System.out.println(matches);*/
    	}else if(object instanceof NumberParam){
    		NumberParam number = (NumberParam) object;
    		NumberElement numberelement = number.getNumberArgument();
    		
    		returnlist.add(numberelement);
    		returnlist.add(object);
    	}else if(object instanceof ComparisonOptionParam) {
    		ComparisonOptionParam comparisonoption = (ComparisonOptionParam) object;
    		EList<Comparison> comparisons = comparisonoption.getComparisons();
    		
    		returnlist.addAll(comparisons);
    	}else if(object instanceof TypeOptionParam) {
    		TypeOptionParam typeoptionparam = (TypeOptionParam) object;
    		EList<Comparison> comparisons = typeoptionparam.getTypeComparisons();
    		
    		returnlist.addAll(comparisons);
    	}else {
    		returnlist.add(object);
    	}
    	
    	return returnlist;
    }
    
    static HashMap<CompletePattern, ArrayList<EObject>> patternRelatedElements = new HashMap<CompletePattern, ArrayList<EObject>>();//Schlüssel ist ein CompletePattern, der Wert sind die Elemente, die in diesem CompletePattern markiert sind
    public void iteratorCheckbox(EObject self, EObject iterator, boolean checkboxValue) {//wird aufgerufen, wenn eine checkbox aktiviert wird
    	/*Fälle:
    		1. Element wird markiert und kein anderes Element ist markiert
    		2. Element wird markiert und ein anderes Element ist markiert
    		3. Elementmarkierung wird aufgehoben*/

    	//System.out.println(self);
    	System.out.println("uiuiui"+iterator);
    	ArrayList<EObject> thisPatternRelatedElements = patternRelatedElements.get((CompletePattern) self);
    	ArrayList<EObject> elements = getRelatedElements(iterator);//die Elemente, die wegen iterator markiert werden müssen
    	
    	if(thisPatternRelatedElements == null) {//das Muster wurde nocht nicht der Map hinzugefügt, also wurde noch kein Element des Musters markiert
    		thisPatternRelatedElements = new ArrayList<EObject>();
    		patternRelatedElements.put((CompletePattern) self, thisPatternRelatedElements);
    	}
    	
    	if(thisPatternRelatedElements.isEmpty()) {//gerade sind keine Elemente markiert, es kann also nur markiert werden
    		//System.out.println("Es sind keine Elemente markiert");
    		thisPatternRelatedElements.addAll(elements);
    		markCheckbox(iterator);
    		
    	}else {//es sind elemente markiert
    		thisPatternRelatedElements.clear();
    		if(checkboxValue) {
    			thisPatternRelatedElements.addAll(elements);
    			markCheckbox(iterator);System.out.println("Gerade hier"+iterator);
    		}else {
    			deleteCheckbox(self);
    			System.out.println("markCheckbox null");
    		}
    	}
    	//System.out.println("Diese Elemente sind markiert: "+patternRelatedElements.get((CompletePattern) self));
    	//System.out.println("Diese Elemente wurden wegen der Checkbox markiert: "+elements);
    	//System.out.println("Dieses Element gehört zur Chechbox: : "+checkboxElements.get((CompletePattern) self));
    	
    	//damit die Anzeige in Sirius aktualisiert wird
    	CompletePattern pattern = (CompletePattern) self;
    	String name =pattern.getName();
    	pattern.setName("Hallo");
    	pattern.setName(name);
    }
    
    /*static ArrayList<EObject> objecttestlist = new ArrayList<EObject>();
    public EObject objecttest(EObject self) {
    	if(!objecttestlist.contains(self)) {
    		objecttestlist.add(self);
    	}
    	if(objecttestlist.size() == 2) {
    		System.out.println(objecttestlist.get(0).equals(objecttestlist.get(1))+"777777777777777"+objecttestlist.get(0)+" "+objecttestlist.get(1));
    	}
    	System.out.println("ßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßß"+objecttestlist.size());
    	return self;
    }*/
    
    public boolean isElementMarked(EObject self) {//self ist das Element, in dem das conditional style liegt
    	boolean isMarked = false;//System.out.println(")))))))))))))))))))))))))))))))))))))))");
    	
    	CompletePattern pattern = (CompletePattern) getWurzelContainer(self);
    	ArrayList<EObject> markedElements = patternRelatedElements.get(pattern);
    	if(markedElements.contains(self)) {
    		isMarked = true;
    	}
    	
    	return isMarked;
    }
    
    static HashMap<CompletePattern, EObject> checkboxElements = new HashMap<CompletePattern, EObject>();//hier wird zu dem jeweiligen Muster das EObject zur markierten Checkbox gespeichert
    public boolean isCheckboxActivated(EObject self, EObject o) {
    	//System.out.println("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    	boolean isActivated = false;
    	
    	EObject checkboxElement = checkboxElements.get((CompletePattern) self);
    	//System.out.println("Sind checkbox und self gleich: "+(checkboxElement != null && checkboxElement.equals(o)));
    	if(checkboxElement != null && checkboxElement.equals(o)) {
    		isActivated = true;
    	}
    	
    	return isActivated;
    }
    
    public void markCheckbox(EObject eo) {//Speichert die markierte Checkbox, damit nur eine aktiviert sein kann
    	CompletePattern pattern = (CompletePattern) getWurzelContainer(eo);
    	EObject checkboxElement = checkboxElements.get(pattern);
    	//if(checkboxElement == null) {
    		//System.out.println("[[[[[[[[[[[[[[[[[[[[[[[[[["+eo);
    		checkboxElements.put(pattern, eo);
    	//}
    }
    
    public void deleteCheckbox(EObject eo) {//löscht den speicher, in dem die aktuell angewählte chechbox gespeichert ist
    	CompletePattern pattern = (CompletePattern) getWurzelContainer(eo);
    	checkboxElements.put(pattern, null);
    }
    
    public boolean isCompletePattern(EObject self) {
    	boolean isCompletePattern = false;
    	if(self instanceof CompletePattern) {
    		isCompletePattern = true;
    	}
    	return isCompletePattern;
    }
    
    public void setTextliteralValue(EObject self, EObject iterator, String s) {//wird bei text von textliteral in view 3 aufgerufen
    	if(iterator instanceof TextLiteralParam) {
    		TextLiteralParam textliteral = (TextLiteralParam) iterator;
    		textliteral.setValue(s);
    	}
    }
    
    public String getTextliteralValue(EObject self, EObject iterator) {//wird bei text von textliteral in view 3 aufgerufen
    	String s = "";
    	if(iterator instanceof TextLiteralParam) {
    		TextLiteralParam textliteral = (TextLiteralParam) iterator;
    		s = textliteral.getValue();
    	}
    	return s;
    }
    
    public void setBooleanValue(EObject self, EObject iterator, Boolean b) {//wird bei text von textliteral in view 3 aufgerufen
    	if(iterator instanceof BooleanParam) {
    		BooleanParam booleanparam = (BooleanParam) iterator;
    		booleanparam.setValue(b);
    	}
    }
    
    public boolean getBooleanValue(EObject self, EObject iterator) {//wird bei text von textliteral in view 3 aufgerufen
    	boolean b = false;
    	if(iterator instanceof BooleanParam) {
    		BooleanParam booleanparam = (BooleanParam) iterator;
    		b = booleanparam.getValue();
    	}
    	return b;
    }
    
    public void setNumberValue(EObject self, EObject iterator, String s) {//wird bei text von textliteral in view 3 aufgerufen
    	if(iterator instanceof NumberParam) {
    		NumberParam numberparam = (NumberParam) iterator;
    		numberparam.setValue(Double.parseDouble(s));
    	}
    }
    
    public double getNumberValue(EObject self, EObject iterator) {//wird bei text von textliteral in view 3 aufgerufen
    	double d = 0.0;
    	if(iterator instanceof NumberParam) {
    		NumberParam numberparam = (NumberParam) iterator;
    		d = numberparam.getValue();
    	}
    	return d;
    }
    
    public void setDateValue(EObject self, EObject iterator, String s) {//wird bei text von textliteral in view 3 aufgerufen
    	if(iterator instanceof DateParam) {
    		DateParam dateparam = (DateParam) iterator;
    		dateparam.setValue(s);
    	}
    }
    
    public String getDateValue(EObject self, EObject iterator) {//wird bei text von textliteral in view 3 aufgerufen
    	String s = "";
    	if(iterator instanceof DateParam) {
    		DateParam dateparam = (DateParam) iterator;
    		s = dateparam.getValue();
    	}
    	return s;
    }
    
    public void setDateTimeValue(EObject self, EObject iterator, String s) {//wird bei text von textliteral in view 3 aufgerufen
    	if(iterator instanceof DateTimeParam) {
    		DateTimeParam datetimeparam = (DateTimeParam) iterator;
    		datetimeparam.setValue(s);
    	}
    }
    
    public String getDateTimeValue(EObject self, EObject iterator) {//wird bei text von textliteral in view 3 aufgerufen
    	String s = "";
    	if(iterator instanceof DateTimeParam) {
    		DateTimeParam datetimeparam = (DateTimeParam) iterator;
    		s = datetimeparam.getValue();
    	}
    	return s;
    }
    
    public void setTimeValue(EObject self, EObject iterator, String s) {//wird bei text von textliteral in view 3 aufgerufen
    	if(iterator instanceof TimeParam) {
    		TimeParam timeparam = (TimeParam) iterator;
    		timeparam.setValue(s);
    	}
    }
    
    public String getTimeValue(EObject self, EObject iterator) {//wird bei text von textliteral in view 3 aufgerufen
    	String s = "";
    	if(iterator instanceof TimeParam) {
    		TimeParam timeparam = (TimeParam) iterator;
    		s = timeparam.getValue();
    	}
    	return s;
    }
    
    public void setTypeOptionValue(EObject self, EObject iterator, ReturnType r) {//wird bei text von textliteral in view 3 aufgerufen
    	if(iterator instanceof TypeOptionParam) {
    		TypeOptionParam typeoptionparam = (TypeOptionParam) iterator;
    		typeoptionparam.setValue(r);
    	}
    }
    
    public ReturnType getTypeOptionValue(EObject self, EObject iterator) {//wird bei text von textliteral in view 3 aufgerufen
    	ReturnType r = null;
    	if(iterator instanceof TypeOptionParam) {
    		TypeOptionParam typeoptionparam = (TypeOptionParam) iterator;
    		r = typeoptionparam.getValue();
    	}
    	return r;
    }
    
    public void setComparisonOptionValue(EObject self, EObject iterator, ComparisonOperator c) {//wird bei text von textliteral in view 3 aufgerufen
    	if(iterator instanceof ComparisonOptionParam) {
    		ComparisonOptionParam comparisonoptionparam = (ComparisonOptionParam) iterator;
    		comparisonoptionparam.setValue(c);
    	}
    }
    
    public ComparisonOperator getComparisonOptionValue(EObject self, EObject iterator) {//wird bei text von textliteral in view 3 aufgerufen
    	ComparisonOperator c = null;
    	if(iterator instanceof ComparisonOptionParam) {
    		ComparisonOptionParam comparisonoptionparam = (ComparisonOptionParam) iterator;
    		c = comparisonoptionparam.getValue();
    	}
    	return c;
    }
    
    public ArrayList<Boolean> getBooleanSelectCandidates(EObject self){
    	ArrayList<Boolean> candidates = new ArrayList<Boolean>();
    	candidates.add(true);
    	candidates.add(false);
    	return candidates;
    }
    
    public String getBooleanSelectCandidatesDisplay(EObject self, Boolean b){
    	String s = "false";
    	if(b) {
    		s = "true";
    	}
    	return s;
    }
    
    //Textlist
    public EList<String> getTextListValue(EObject self, EObject object){
    	EList<String> listvalues = null;
    	if(object instanceof TextListParam) {
    		TextListParam textlistparam = (TextListParam) object;
    		listvalues = textlistparam.getValues();
    	}
    	System.out.println("kzfkzgfl"+listvalues);
    	return listvalues;
    }
    
    public String getTextListListDisplay(EObject self, String s){
    	String returns = "";
    	if(s.equals("")) {
    		returns = "empty";
    	}else if(s.length() < 21) {
    		returns = s;
    	}else {
    		returns = s.substring(0, 19)+"...";
    	}
    	return returns;
    }
    
    public void addTextListElement(EObject self, EObject object) {
    	/*if(object instanceof TextListParam) {
    		TextListParam textlistparam = (TextListParam) object;
    		EList<String> values = textlistparam.getValues();
    		values.add("empty");
    	}*/
    	
    	if(object instanceof TextListParam) {
    		TextListParam textlistparam = (TextListParam) object;
    		EList<String> values = textlistparam.getValues();
    		System.out.println("trtrtrtrt"+textString.get((CompletePattern) self));
    		String s= textString.get((CompletePattern) self);
    		if(s != null) {
    			values.add(s);
    		}
    	}
    }
    
    public void deleteTextListElement(EObject self, String s, EObject textlist) {
    	EList<String> list = getTextListValue(self, textlist);
    	list.remove(s);
    }
    
    public void changeTextListElement(EObject self, String s, EObject textlist) {
    	System.out.println("00000000000000000"+s);
    	EList<String> list = getTextListValue(self, textlist);
    	CompletePattern pattern = (CompletePattern) self;
    	list.remove(loadedString.get(pattern));
    	list.add(s);
    	loadedString.put(pattern, s);
    }
    
    static HashMap<CompletePattern, String> textString = new HashMap<CompletePattern, String>();//String im Textfeld in der Listenmanipulation
    public void storeTextListText(EObject self, String s) {
    	textString.put((CompletePattern) self, s);
    }
    
    public void saveChangedText(EObject self, EObject textlist) {
    	System.out.println("00000000000000000");
    	EList<String> list = getTextListValue(self, textlist);
    	CompletePattern pattern = (CompletePattern) self;
    	list.remove(loadedString.get(pattern));
    	list.add(textString.get((CompletePattern) self));
    	loadedString.put(pattern, "");
    }
    
    static HashMap<CompletePattern, String> loadedString = new HashMap<CompletePattern, String>();
    public void loadTextListElement(EObject self, String s) {
    	System.out.println("Selection: "+s);
    	loadedString.put((CompletePattern) self, s);
    }
    
    public String getLoadedString(EObject self) {
    	System.out.println("Gelandener String: "+loadedString.get((CompletePattern) self));
    	return loadedString.get((CompletePattern) self);
    }
    
    public void closeTextListElement(EObject self) {//das geladene TextListelement soll jetzt leer sein
    	loadedString.put((CompletePattern) self, "");
    }
    
    static HashMap<CompletePattern, EObject> oldTextList = new HashMap<CompletePattern, EObject>();
    public void storeOldTextList(EObject self, EObject textlist) {//speichert zu Beginn des Dialogs zum bearbeiten der Textlist die aktuelle Textlist, um sie bei cancel wiederherzustellen
    	oldTextList.put((CompletePattern) self, textlist);
    }
    
    public void restoreOldTextList(EObject self, EObject textlist) {
    	if(textlist instanceof TextListParam) {
    		TextListParam textlistparam = (TextListParam) textlist;
    		EList<String> values = textlistparam.getValues();
    		values.clear();
    		TextListParam oldTextlistparam = ((TextListParam) (oldTextList.get((CompletePattern) self)));
    		values.addAll(oldTextlistparam.getValues());
    	}
    }
    //Ende Textlist
    
    public ArrayList<ReturnType> getTypeOptionSelectCandidates(EObject self){
    	ArrayList<ReturnType> candidates = new ArrayList<ReturnType>();
    	candidates.add(ReturnType.STRING);
    	candidates.add(ReturnType.BOOLEAN);
    	candidates.add(ReturnType.ELEMENT);
    	candidates.add(ReturnType.DATE);
    	candidates.add(ReturnType.TIME);
    	candidates.add(ReturnType.NUMBER);
    	candidates.add(ReturnType.DATETIME);
    	return candidates;
    }
    
    public String getTypeOptionSelectCandidatesDisplay(EObject self, ReturnType r){
    	String s = r.toString();
    	return s;
    }
    
    public ArrayList<ComparisonOperator> getComparisonOptionSelectCandidates(EObject self){
    	ArrayList<ComparisonOperator> candidates = new ArrayList<ComparisonOperator>();
    	candidates.add(ComparisonOperator.EQUAL);
    	candidates.add(ComparisonOperator.GREATER);
    	candidates.add(ComparisonOperator.LESS);
    	candidates.add(ComparisonOperator.GREATEROREQUAL);
    	candidates.add(ComparisonOperator.LESSOREQUAL);
    	candidates.add(ComparisonOperator.NOTEQUAL);
    	return candidates;
    }
    
    public ArrayList<String> getTypeSelectCandidates(EObject self){
    	ArrayList<String> candidates = new ArrayList<String>();
    	candidates.add("TextLiteral");
    	candidates.add("TextList");
    	candidates.add("Number");
    	candidates.add("Boolean");
    	candidates.add("Date");
    	candidates.add("Time");
    	candidates.add("DateTime");
    	return candidates;
    }
    
    public String getComparisonOptionSelectCandidatesDisplay(EObject self, ComparisonOperator c){
    	String s = c.toString();
    	return s;
    }
    
    public String getPropertyName(Property property) {
    	return "Property" + " \"" + property.getName() + "\" (of " + "Element" + " \"" + property.getElement().getName()+"\"" + ")";
    }
    
    public boolean deleteMatchPrecondition(EObject self) {
    	boolean delete = true;System.out.println("3");
    	if(self instanceof TextLiteralParam) {
    		System.out.println("1");
    		TextLiteralParam textliteral = (TextLiteralParam) self;
    		EList<Match> matches = textliteral.getMatches();
    		if(!matches.isEmpty()) {
    			System.out.println("2");
    			delete = false;
    		}
    	}
    	return delete;
    }
    
    //untypedparametervalue
    HashMap<CompletePattern, String> newType = new HashMap<CompletePattern, String>();
    public void storeUntypedparametervalueSelect(EObject self, String s) {//speichert den ausgewählten Wert von select
    	newType.put((CompletePattern) self, s);
    }
    
    public void deleteUntypedparametervalueSelect(EObject self) {//speichert den ausgewählten Wert von select
    	newType.remove((CompletePattern) self);
    }
    
    HashMap<CompletePattern, HashMap<EObject, EObject>> newTypeAfterTypeChange = new HashMap<CompletePattern, HashMap<EObject, EObject>>();
    /*public void changeTypeUntypedparametervalue(EObject self, EObject object) {
    	String type = newType.get((CompletePattern) self);
    	UntypedParameterValue untypedparametervalue = (UntypedParameterValue) object;
    	if(type.equals("TextLiteral")) {
    		untypedparametervalue.replace(new TextLiteralParamImpl());
    	}else if(type.equals("TextList")) {
    		untypedparametervalue.replace(new TextListParamImpl());
    	}else if(type.equals("Number")){
    		untypedparametervalue.replace(new NumberParamImpl());
    	}else if(type.equals("Boolean")){
    		untypedparametervalue.replace(new BooleanParamImpl());
    	}else if(type.equals("Date")){
    		untypedparametervalue.replace(new DateParamImpl());
    	}else if(type.equals("Time")){
    		untypedparametervalue.replace(new TimeParamImpl());
    	}else if(type.equals("DateTime")){
    		untypedparametervalue.replace(new DateTimeParamImpl());
    	}
    	deleteUntypedparametervalueSelect(self);
    }*/
    public void changeTypeUntypedparametervalue(EObject self, EObject object) {
    	String type = newType.get((CompletePattern) self);
    	UntypedParameterValue untypedparametervalue = (UntypedParameterValue) object;
    	ParameterValue newParameter = null;
    	if(type.equals("TextLiteral")) {
    		newParameter = new TextLiteralParamImpl();
    		untypedparametervalue.replace(newParameter);
    	}else if(type.equals("TextList")) {
    		newParameter = new TextListParamImpl();
    		untypedparametervalue.replace(newParameter);
    	}else if(type.equals("Number")){
    		newParameter = new NumberParamImpl();
    		untypedparametervalue.replace(newParameter);
    	}else if(type.equals("Boolean")){
    		newParameter = new BooleanParamImpl();
    		untypedparametervalue.replace(newParameter);
    	}else if(type.equals("Date")){
    		newParameter = new DateParamImpl();
    		untypedparametervalue.replace(newParameter);
    	}else if(type.equals("Time")){
    		newParameter = new TimeParamImpl();
    		untypedparametervalue.replace(newParameter);
    	}else if(type.equals("DateTime")){
    		newParameter = new DateTimeParamImpl();
    		untypedparametervalue.replace(newParameter);
    	}
    	deleteUntypedparametervalueSelect(self);
    	HashMap<EObject, EObject> newTypeAllocation = newTypeAfterTypeChange.get((CompletePattern) self);
    	if(newTypeAllocation == null) {
    		newTypeAfterTypeChange.put((CompletePattern) self, new HashMap<EObject, EObject>());
    		newTypeAllocation = newTypeAfterTypeChange.get((CompletePattern) self);
    	}
    	newTypeAllocation.put(untypedparametervalue, newParameter);System.out.println("Untyped wurde ersetzt durch: "+newTypeAllocation.get(untypedparametervalue));
    }
    
    public String untypedparametervalueSelectValueExpression(EObject self) {//speichert den ausgewählten Wert von select
    	return newType.get((CompletePattern) self);
    }
    
    public boolean isPageCompleteUntypedparametervalueWizard(EObject self) {
    	boolean isComplete = false;
    	
    	return isComplete;
    }
}
