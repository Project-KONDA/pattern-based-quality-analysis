package patterncreation.project.design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.security.auth.Refreshable;

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
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.utility.EMFModelLoad;

public class ChooseDatabaseDialog extends Dialog {
	static final String DATABASES_PATH = "platform:/plugin/patterncreation.project.design/databases";
	static final String DATABASES_PATH_WITH_SUFFIX = DATABASES_PATH + ".execution";
	Database selectedDatabase;
	
	public ChooseDatabaseDialog(Shell parentShell) {
        super(parentShell);
    }

    @Override
    protected Control createDialogArea(Composite parent) {
    	Shell shell = new Shell();
        Composite container = (Composite) super.createDialogArea(parent);
        
        Label chooseDatabaseLabel = new Label(container, SWT.NONE);
        chooseDatabaseLabel.setText("Choose an existing database:");
        
        Group group = new Group(container, SWT.NONE);
        group.setLayout(new RowLayout(SWT.VERTICAL));
        
        List<XmlDataDatabase> databases = extractDatabases();
        // TODO: inform user if no database exists
        ArrayList<Button> radioButtons = new ArrayList<Button>();
		for (XmlDataDatabase database : databases) {
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
        
        Button createDatabaseButton = new Button(container, SWT.PUSH);
        createDatabaseButton.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
        createDatabaseButton.setText("Create New Database");
        createDatabaseButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                Shell shell = new Shell();
                CreateDatabaseDialog dialog = new CreateDatabaseDialog(shell);
	    		dialog.open();
	    		
	    		// TODO: make sure that new radio button is added
            }
        });
        
        new Label(container, SWT.NONE);
        new Label(container, SWT.NONE);
        
        /*Button buttonGo = createButton(parent, IDialogConstants.OK_ID,"Go!", false);
  	    buttonGo.setBounds(200, 0, 100, 25);*/
        Button closeButton = new Button(container, SWT.PUSH);
        closeButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
        closeButton.setText("Close");
        closeButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
            	if(selectedDatabase == null) {
            		MessageDialog.openError(shell, "OK", "Please choose a database.");
            	} else {
            		container.getShell().close();
            	}
            }
        });
        
        return container;
    }

    private List<XmlDataDatabase> extractDatabases() {    	
    	Databases databases = EMFModelLoad.loadDatabases(DATABASES_PATH_WITH_SUFFIX);    	
		return databases.getXmlDatabases();    	
	}

	@Override
    protected void configureShell(Shell newShell) {
        super.configureShell(newShell);
        newShell.setText("Choose Database");
    }

    @Override
    protected Point getInitialSize() {
        return new Point(450, 250);
    }
    
    @Override
    protected void createButtonsForButtonBar(final Composite parent)
    { 
      GridLayout layout = (GridLayout)parent.getLayout();
      layout.marginHeight = 0;
    }

	public Database getSelectedDatabase() {
		return selectedDatabase;
	}

	public void setSelectedDatabase(Database selectedDatabase) {
		this.selectedDatabase = selectedDatabase;
	}
}
