package patterncreation.project.design;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.basex.core.BaseXException;
import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.Database;
import qualitypatternmodel.execution.Result;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelLoad;

public class ViewExecutionPart1 extends ViewPart {

	private static final String FILE_PATH_PREFIX = "file:/";
	private Text selectedPatternText;	
	private Label selectedDatabaseLabel;
	
	private String patternFilePath;
	private CompletePattern pattern;
	
	private Database database;
	
	private ChooseDatabaseDialog chooseDatabaseDialog;
	
	
	public ViewExecutionPart1() {
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public void createPartControl(Composite parent) {
		Shell shell = new Shell();		

		//ScrolledComposite container = new ScrolledComposite(parent, SWT.NONE|SWT.H_SCROLL | SWT.V_SCROLL);
		ScrolledComposite sc = new ScrolledComposite(parent, SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
	    Composite container = new Composite(sc, SWT.NONE);
	    sc.setContent(container);

	    /*Label lblRelation = new Label(container, SWT.NONE);
	    lblRelation.setBounds(10, 13, 74, 15);
	    lblRelation.setText("Label name:");
	    container.setSize(container.computeSize(SWT.DEFAULT, SWT.DEFAULT));*/
		
		final GridData leftData = new GridData(SWT.FILL, SWT.FILL, true, true);
		container.setLayoutData(leftData);
	    //container.setLayout(new GridLayout(1, false));

	    Label patternLabel = new Label(container, SWT.NONE);
	    patternLabel.setBounds(10, 10, 75, 25);
        patternLabel.setText("Pattern: ");
        
        selectedPatternText = new Text(container, SWT.BORDER);//Text
        selectedPatternText.setBounds(90, 10, 200, 25);
	    
	    Button choosePatternButton = new Button(container, SWT.NONE);
	    choosePatternButton.setBounds(300, 10, 120, 25);
	    choosePatternButton.setText("Choose Pattern");	   
	    
	    choosePatternButton.addSelectionListener(new SelectionListener() {
	    	 
	    	   @Override
	    	   public void widgetSelected(SelectionEvent arg0) {
	    			Shell shell = new Shell();
	    		    FileDialog dialog = new FileDialog(shell, SWT.OPEN);
	    			dialog.setFilterExtensions(new String [] {"*.patternstructure"});
	    			dialog.setFilterPath(System.getProperty("user.dir"));//"c:\\temp"
	    			
	    			patternFilePath = dialog.open();
	    			
	    			if(patternFilePath != null) {
	    				selectedPatternText.setText(patternFilePath);
	    				patternFilePath = FILE_PATH_PREFIX + patternFilePath.replace("\\", "/");
	    				pattern = EMFModelLoad.loadCompletePattern(patternFilePath);
	    				
	    				try {
							pattern.isValid(AbstractionLevel.CONCRETE);
						} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e) {
							MessageDialog.openError(shell, "OK", "The selected pattern is not a valid concrete pattern.");
							pattern = null;
							selectedPatternText.setText("");
						}	    					
	    				
	    			}	    			
	    			
	    	   }
	    	 
	    	   @Override
	    	   public void widgetDefaultSelected(SelectionEvent arg0) {
	    	       System.out.println("Ignore this method!");
	    	   }
	    	 
	    	});
	    
	    Label databaseLabel = new Label(container, SWT.NONE);
	    databaseLabel.setBounds(10, 40, 75, 25);
        databaseLabel.setText("Database:");
        
        selectedDatabaseLabel = new Label(container, SWT.BORDER);
        selectedDatabaseLabel.setBounds(90, 40, 200, 25);
	    
	    Button chooseDatabaseButton = new Button(container, SWT.NONE);
	    chooseDatabaseButton.setBounds(300, 40, 120, 25);
	    chooseDatabaseButton.setText("Choose Database");
	    
	    ViewExecutionPart1 thisView = this;
	    
	    chooseDatabaseButton.addSelectionListener(new SelectionListener() {
	    	 
	    	   @Override
	    	   public void widgetSelected(SelectionEvent arg0) {	    			
	    		   Shell shell = new Shell();
	    		   ChooseDatabaseDialog dialog = new ChooseDatabaseDialog(shell, thisView);
	    		   dialog.open();
	    		   
	    		   database = chooseDatabaseDialog.getSelectedDatabase();
	    		   
	    		   System.out.println(database);
	    		   
	    		   if(database != null) {
	    			   selectedDatabaseLabel.setText(database.toString()); // TODO: show name	    	
	    		   }
	    	   }
	    	 
	    	   @Override
	    	   public void widgetDefaultSelected(SelectionEvent arg0) {
	    	       System.out.println("Ignore this method!");
	    	   }
	    	 
	    	});
	    
	    final Text metaDataText = new Text(container, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL | SWT.READ_ONLY);
	    metaDataText.setBounds(10, 100, 1000, 100);
	    metaDataText.setText("Hallo");
	    
	    final Text resultText = new Text(container, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL | SWT.READ_ONLY);
	    resultText.setBounds(10, 200, 1000, 1000);
	    resultText.setText("Hallo");
	    
	    Button applyButton = new Button(container, SWT.NONE);
	    applyButton.setBounds(90, 70, 200, 25);
	    applyButton.setText("Apply Pattern");
	    
	    applyButton.addSelectionListener(new SelectionAdapter() {
	    	  @Override
	            public void widgetSelected(SelectionEvent e) {
	    		
	    		  if(pattern == null || database == null) {
	    			  MessageDialog.openError(shell, "OK", "Please choose a pattern and a database.");
	    		  } else {	    				
						try {
							Result result = database.execute(pattern, null, null); // TODO: allow specification of name and person
//							resultText.setText(result.getResultString()); // TODO	
							
						} catch (BaseXException | QueryIOException | InvalidityException | OperatorCycleException
								| MissingPatternContainerException | QueryException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
							MessageDialog.openError(shell, "OK", "An error occurred during the pattern application.");
						} 		
					
	    		  }
	    		  
	    		  
	    	  }
		});
	    
	    Button saveButton = new Button(container, SWT.NONE);
	    saveButton.setBounds(300, 70, 120, 25);
	    saveButton.setText("Save Result");
	    
	    saveButton.addSelectionListener(new SelectionListener() {
	    	 
	    	   @Override
	    	   public void widgetSelected(SelectionEvent arg0) {
	    			Shell shell = new Shell();
	    		    FileDialog dialog = new FileDialog(shell, SWT.SAVE);
	    			dialog.setFilterExtensions(new String [] {"*.txt"});
	    			dialog.setFilterPath("c:\\temp");
	    			dialog.setOverwrite(true);//funktioniert nicht
	    			String result = dialog.open();
	    			/*if(!result.endsWith(".txt")) {
	    				result=result.concat(".txt");
	    			}*/
	    			try {
	    			      File myObj = new File(result);
	    			      myObj.createNewFile();
	    			      FileWriter myWriter = new FileWriter(result);
	    			      myWriter.write(resultText.getText());
	    			      myWriter.close();
	    			    } catch (IOException e) {
	    			      System.out.println("An error occurred.");
	    			      e.printStackTrace();
	    			    }
	    			
	    			/*WizardDialog wizardDialog = new WizardDialog(parent.getShell(),//funktioniert
	    		            new NewWizard1());
	    		        if (wizardDialog.open() == Window.OK) {
	    		            System.out.println("Ok pressed");
	    		        } else {
	    		            System.out.println("Cancel pressed");
	    		        }*/
	    	   }
	    	 
	    	   @Override
	    	   public void widgetDefaultSelected(SelectionEvent arg0) {
	    	       System.out.println("Ignore this method!");
	    	   }
	    	 
	    	});
	    
	    container.setSize(container.computeSize(SWT.DEFAULT, SWT.DEFAULT));
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
	}
	
//	public void setText(String s) {
//		selectedPatternText.setText(s);
//	}

}
