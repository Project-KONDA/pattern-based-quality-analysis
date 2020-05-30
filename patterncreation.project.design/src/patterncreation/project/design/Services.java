package patterncreation.project.design;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    public String getContents(EObject self) {//Hilfsmethode, um den Content zu drucken
    	List<EObject> contents = self.eContents();
    	File file = new File("C:\\Users\\Lukas\\Desktop\\diagrammstart.txt");
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
		}
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
		boolean morethanonecontent = false;
		if (!(self instanceof Formula)) {
			if (self.eContents().size() > 2) {
				morethanonecontent = true;
				x = 1;
			} else if (self.eContents().size() > 3) {
				morethanonecontent = true;
				x = 2;
			}
		}else {
			Formula formula = (Formula) self;
    		Condition condition1 = formula.getCondition1();
    		Condition condition2 = formula.getCondition2();
    		if(condition1 != null && condition2 != null) {//condition1 und condition2 ungleich null nicht dabei
    			morethanonecontent = true;
    			x = 3;
    		}
		}
    	File file = new File("C:\\Users\\Lukas\\Desktop\\formulacontents.txt");
    	FileWriter writer = null;
		try {
			file.createNewFile();
			writer = new FileWriter(file);
			writer.write("Test"+x+"\n");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return !morethanonecontent;
    }
    
    public String referenceNameOfNotCondition(EObject self) {
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
    		File file = new File("C:\\Users\\Lukas\\Desktop\\condition.txt");
        	FileWriter writer = null;
    		try {
    			file.createNewFile();
    			writer = new FileWriter(file);
    			writer.write("Test"+returnCondition+"\n");
    			writer.close();
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    	}else {
    		returnCondition = "condition";
    	}
    	
    	return returnCondition;
    }
    
    public String formulaConditionOneOrTwo(EObject self) {//muss noch für andere Typen als conditions programmiert werden
    	String returnCondition = "";
    	Formula constr1 = ((Condition)self).getFormula1();
    	Formula constr2 = ((Condition)self).getFormula2();
    	String type = "";
    	
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
    	}
    	return returnCondition;
    }
}
