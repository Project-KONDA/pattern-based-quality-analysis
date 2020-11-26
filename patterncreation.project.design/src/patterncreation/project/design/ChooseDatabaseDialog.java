package patterncreation.project.design;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.security.auth.Refreshable;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import qualitypatternmodel.execution.Database;
import qualitypatternmodel.execution.Databases;
import qualitypatternmodel.execution.ExecutionFactory;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.execution.impl.DatabasesImpl;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

public class ChooseDatabaseDialog extends Dialog {
//	static final String DATABASES_PATH = "platform:/plugin/patterncreation.project.design/databases";
//	static final String DATABASES_PATH_WITH_SUFFIX = DATABASES_PATH + ".execution";
	Database selectedDatabase;
	ViewExecutionPart1 viewExecutionPart1;
	
	public ChooseDatabaseDialog(Shell parentShell, ViewExecutionPart1 viewExecutionPart1) {
        super(parentShell);
        this.viewExecutionPart1 = viewExecutionPart1;
        viewExecutionPart1.setChooseDatabaseDialog(this);
        loadDatabases();
    }
	

    @Override
    protected Control createDialogArea(Composite parent) {    	
    	
//    	Shell shell = new Shell();
        Composite container = (Composite) super.createDialogArea(parent);
        
        Label chooseDatabaseLabel = new Label(container, SWT.NONE);
        chooseDatabaseLabel.setText("Choose an existing database or create a new database");
        
        Button createDatabaseButton = new Button(container, SWT.PUSH);
        createDatabaseButton.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
        createDatabaseButton.setText("Create New Database");
        ChooseDatabaseDialog thisThis = this;
        createDatabaseButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                Shell shell = new Shell();
                CreateDatabaseDialog dialog = new CreateDatabaseDialog(shell, thisThis);
	    		dialog.open();	    		
            }
        });     
        
        
        Group group = new Group(container, SWT.NONE);
        group.setLayout(new RowLayout(SWT.VERTICAL));
        
        List<XmlDataDatabase> databases = DatabasesImpl.getInstance().getXmlDatabases();
        // TODO: inform user if no database exists
        ArrayList<Button> radioButtons = new ArrayList<Button>();
		for (XmlDataDatabase database : databases) {
//			System.out.println("database: " + database);
//			System.out.println("context: " + database.getContext());
        	Button radioButton = new Button(group, SWT.RADIO);
        	radioButton.setText(database.getName());
        	radioButtons.add(radioButton);
        	
        	radioButton.addSelectionListener(new SelectionAdapter() {
        		@Override
                public void widgetSelected(SelectionEvent e) {
        			selectedDatabase = database;        			
        		}
			});
        	
        }

        
        return container;
    }

    
    private void loadDatabases() {    
    	String userDir = Platform.getInstallLocation().getURL().toString();
    	String path = userDir + "databases" + ".execution";
    	    	
    	DatabasesImpl.getInstance().getXmlDatabases().clear();
		DatabasesImpl.getInstance().getXmlSchemata().clear();
		
		try {
			EMFModelLoad.loadDatabases(path);  
		} catch (Exception e) {
			if(e.getCause() instanceof FileNotFoundException) {
				// create file if it does not exist
				try {					
					EMFModelSave.exportToFile(DatabasesImpl.getInstance(), userDir + "databases", "execution");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else {
				e.printStackTrace();
			}			
						  		
		}  
    }
    private void saveDatabases() {
    	String userDir = Platform.getInstallLocation().getURL().toString();
    	try {
			EMFModelSave.exportToFile(DatabasesImpl.getInstance(), userDir + "databases", "execution");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    protected void refresh(Shell shell) {
    	saveDatabases();
    	
    	close();
		ChooseDatabaseDialog dialog = new ChooseDatabaseDialog(shell, viewExecutionPart1);
		dialog.open();
    }
    
    @Override
    protected void okPressed() {
    	// TODO Auto-generated method stub
    	saveDatabases();
    	super.okPressed();
    }
    
    @Override
    protected void cancelPressed() {
    	saveDatabases();
    	if(selectedDatabase == null) {
    		MessageDialog.openError(getShell(), "OK", "Please choose a database.");
    	} else {
    		super.cancelPressed();
    	}    	
    }

	@Override
    protected void configureShell(Shell newShell) {
        super.configureShell(newShell);
        newShell.setText("Choose Database");
    }

    @Override
    protected Point getInitialSize() {
        return new Point(450, 300);
    }
    
//    @Override
//    protected void createButtonsForButtonBar(final Composite parent)
//    { 
//      GridLayout layout = (GridLayout)parent.getLayout();
//      layout.marginHeight = 0;
//    }

    
	public Database getSelectedDatabase() {
		return selectedDatabase;
	}

	public void setSelectedDatabase(Database selectedDatabase) {
		this.selectedDatabase = selectedDatabase;
	}


	public ViewExecutionPart1 getViewExecutionPart1() {
		return viewExecutionPart1;
	}


	public void setViewExecutionPart1(ViewExecutionPart1 viewExecutionPart1) {
		this.viewExecutionPart1 = viewExecutionPart1;
	}
	
}
