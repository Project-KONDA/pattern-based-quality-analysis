package patterncreation.project.design;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
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

public class ViewExecutionPart1 extends ViewPart {

	private Label label;
	private Text text = null;
	public ViewExecutionPart1() {
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub
		//label = new Label(parent, 0);
        //label.setText("Hello World");
		
		//Display display = new Display();

		
		/*final Button button1 = new Button(shell, SWT.NONE);
		button1.setText("Knopf1");*/
		
		/*FileDialog dialog = new FileDialog(shell, SWT.OPEN);
		dialog.setFilterExtensions(new String [] {"*.html"});
		dialog.setFilterPath("c:\\temp");
		String result = dialog.open();*/
		

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

	    Label label = new Label(container, SWT.NONE);
	    label.setBounds(10, 10, 75, 25);
        label.setText("Pattern: ");
        
        text = new Text(container, SWT.BORDER);//Text
        text.setBounds(90, 10, 200, 25);
	    
	    Button buttonmusterwahl = new Button(container, SWT.NONE);
	    buttonmusterwahl.setBounds(300, 10, 120, 25);
	    buttonmusterwahl.setText("Choose Pattern");
	    
	    buttonmusterwahl.addSelectionListener(new SelectionListener() {
	    	 
	    	   @Override
	    	   public void widgetSelected(SelectionEvent arg0) {
	    			Shell shell = new Shell();
	    		    FileDialog dialog = new FileDialog(shell, SWT.OPEN);
	    			dialog.setFilterExtensions(new String [] {"*.html"});
	    			dialog.setFilterPath(System.getProperty("user.dir"));//"c:\\temp"
	    			//String result = dialog.open();
	    			//text.setText(result);
	    			dialog.open();
	    			text.setText(dialog.getFileName());//zur ausführung braucht man den gesamten pfad, result verwenden
	    	   }
	    	 
	    	   @Override
	    	   public void widgetDefaultSelected(SelectionEvent arg0) {
	    	       System.out.println("Ignore this method!");
	    	   }
	    	 
	    	});
	    
	    Label label2 = new Label(container, SWT.NONE);
	    label2.setBounds(10, 40, 75, 25);
        label2.setText("Database:");
        
        Text text2 = new Text(container, SWT.BORDER);
        text2.setBounds(90, 40, 200, 25);
	    
	    Button buttondatenbankwahl = new Button(container, SWT.NONE);
	    buttondatenbankwahl.setBounds(300, 40, 120, 25);
	    buttondatenbankwahl.setText("Choose Database");
	    
	    buttondatenbankwahl.addSelectionListener(new SelectionListener() {
	    	 
	    	   @Override
	    	   public void widgetSelected(SelectionEvent arg0) {
	    			/*Shell shell = new Shell();
	    		    FileDialog dialog = new FileDialog(shell, SWT.OPEN|SWT.MULTI);
	    			dialog.setFilterExtensions(new String [] {"*.html"});
	    			dialog.setFilterPath(System.getProperty("user.dir"));
	    			//String result = dialog.open();
	    			//text2.setText(result);
	    			dialog.open();
	    			String[] selectedFiles = dialog.getFileNames();
	    			text2.setText(String.join(", ", selectedFiles));*/
	    		   
	    		   /*Display.getDefault().syncExec(new Runnable() {
						public void run() {
							String message = "Choose Database";
							MessageDialog dialog = new MessageDialog(new Shell(), "Choose Database", null, message, MessageDialog.INFORMATION, new String[] { "Ok" }, 0);
							Shell shell = new Shell();
							Group genderGroup = new Group(shell, SWT.NONE);
							genderGroup.setLayout(new RowLayout(SWT.HORIZONTAL));
							 
							 
							Button buttonMale = new Button(genderGroup, SWT.RADIO);
							buttonMale.setText("Male");
							 
							Button buttonFemale = new Button(genderGroup, SWT.RADIO);
							buttonFemale.setText("Female");
							int result = dialog.open();
							//System.out.println(result + " " + isAbstract);
						}
					});*/
	    		   Shell shell = new Shell();
	    		   ChooseDatabaseDialog dialog = new ChooseDatabaseDialog(shell);
	    		   dialog.open();
	    	   }
	    	 
	    	   @Override
	    	   public void widgetDefaultSelected(SelectionEvent arg0) {
	    	       System.out.println("Ignore this method!");
	    	   }
	    	 
	    	});
	    
	    final Text text4 = new Text(container, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL | SWT.READ_ONLY);
	    text4.setBounds(10, 100, 1000, 30);
	    text4.setText("Hallo");
	    
	    final Text text3 = new Text(container, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL | SWT.READ_ONLY);
	    text3.setBounds(10, 135, 1000, 1000);
	    text3.setText("Hallo");
	    
	    Button buttonabspielen = new Button(container, SWT.NONE);
	    buttonabspielen.setBounds(90, 70, 200, 25);
	    buttonabspielen.setText("Applay Pattern");
	    
	    Button buttonspeichern = new Button(container, SWT.NONE);
	    buttonspeichern.setBounds(300, 70, 120, 25);
	    buttonspeichern.setText("Save Result");
	    
	    buttonspeichern.addSelectionListener(new SelectionListener() {
	    	 
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
	    			      myWriter.write(text3.getText());
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
	
	public void setText(String s) {
		text.setText(s);
	}

}
