package patterncreation.project.design;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

import org.basex.core.BaseXException;
import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import qualitypatternmodel.execution.Databases;
import qualitypatternmodel.execution.ExecutionFactory;
import qualitypatternmodel.execution.LocalXmlDataDatabase;
import qualitypatternmodel.execution.LocalXmlSchemaDatabase;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.execution.XmlSchemaDatabase;
import qualitypatternmodel.execution.impl.DatabasesImpl;
import qualitypatternmodel.execution.impl.LocalXmlDataDatabaseImpl;
import qualitypatternmodel.execution.impl.LocalXmlSchemaDatabaseImpl;
import qualitypatternmodel.utility.EMFModelSave;

//import static qualitypatternmodel.utilityclasses.Util.*;

public class CreateDatabaseDialog extends Dialog {
	private String name;
	private String dataPath;
	private String schemaPath;
	
	public CreateDatabaseDialog(Shell parentShell) {
        super(parentShell);
    }

    @Override
    protected Control createDialogArea(Composite parent) {    	
    	Shell shell = new Shell();
        Composite container = (Composite) super.createDialogArea(parent);
        GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = 3;
        container.setLayout(gridLayout);
        
        Label chooseDatabaseLabel = new Label(container, SWT.NONE);
        chooseDatabaseLabel.setText("Specify New Database:");
        GridData gridData = new GridData();
        gridData.horizontalAlignment = GridData.FILL;
        gridData.horizontalSpan = 2;
        chooseDatabaseLabel.setLayoutData(gridData);
        
        new Label(container, SWT.NONE);
        
        Label nameLabel = new Label(container, SWT.NONE);
        nameLabel.setText("Name:");
        
        Text nameText = new Text(container, SWT.BORDER);
        GridData gridDataText = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1);
        //gridData.horizontalAlignment = GridData.FILL;
        //gridData.horizontalSpan = 2;
        nameText.setLayoutData(gridDataText);
        
        nameText.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				name = nameText.getText();
				
			}
		});
        
        Label dataPathLabel = new Label(container, SWT.NONE);
        dataPathLabel.setText("Data Path:");
        
        Text dataPathText = new Text(container, SWT.BORDER);
        GridData gridDataDataPath = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
        dataPathText.setLayoutData(gridDataDataPath);
        
        Button chooseDataPathButton = new Button(container, SWT.PUSH);
        chooseDataPathButton.setText("Choose Data Path");
        chooseDataPathButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
            	Shell shell = new Shell();
    		    FileDialog dialog = new FileDialog(shell, SWT.OPEN);
    			dialog.setFilterExtensions(new String [] {"*.xml"});
    			dialog.setFilterPath(System.getProperty("user.dir"));//"c:\\temp"
    			
    			dataPath = dialog.open();
    			dataPathText.setText(dataPath);
            }
        });
        
        Label schemaPathLabel = new Label(container, SWT.NONE);
        schemaPathLabel.setText("Schema Path:");
        
        Text schemaPathText = new Text(container, SWT.BORDER);
        GridData gridDataSchemaPath = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
        schemaPathText.setLayoutData(gridDataSchemaPath);
        
        Button chooseSchemaPathButton = new Button(container, SWT.PUSH);
        chooseSchemaPathButton.setText("Choose Schema Path");
        chooseSchemaPathButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
            	Shell shell = new Shell();
    		    FileDialog dialog = new FileDialog(shell, SWT.OPEN);
    			dialog.setFilterExtensions(new String [] {"*.xsd"});
    			dialog.setFilterPath(System.getProperty("user.dir"));//"c:\\temp"
    			
    			schemaPath = dialog.open();
    			schemaPathText.setText(schemaPath);
            }
        });
        
        new Label(container, SWT.NONE);
        new Label(container, SWT.NONE);
        new Label(container, SWT.NONE);
        new Label(container, SWT.NONE);
        new Label(container, SWT.NONE);
        new Label(container, SWT.NONE);
        new Label(container, SWT.NONE);
        //new Label(container, SWT.NONE);
        
        Button createDatabaseButton = new Button(container, SWT.PUSH);
        createDatabaseButton.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,2,1));
        createDatabaseButton.setText("Create Database");
        createDatabaseButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
            	if(name == null || name.equals("") || dataPath == null || schemaPath == null) {
            		MessageDialog.openError(shell, "OK", "Please specify all database properties.");
            	} else {
            		createDatabase();
            		container.getShell().close();
            	}
            }

			private void createDatabase() {
				LocalXmlDataDatabase dataDatabase = new LocalXmlDataDatabaseImpl(name, dataPath);
				
				// TODO: check if schema database already exists
				
				System.out.println(schemaPath);
				
				String[] split = schemaPath.split(Pattern.quote(File.separator));
				String schemaDatabaseName = split[split.length-1]; // TODO: improve
				LocalXmlSchemaDatabase schemaDatabase = new LocalXmlSchemaDatabaseImpl(schemaDatabaseName, schemaPath);
				
				dataDatabase.setXmlSchema(schemaDatabase);     
				
				try {
					
					dataDatabase.init();
					
					Databases databases = DatabasesImpl.getInstance();
			        databases.getXmlDatabases().add(dataDatabase);
			        databases.getXmlSchemata().add(schemaDatabase);
			        
			        EMFModelSave.exportToFile(databases, "platform:\\plugin\\patterncreation.project.design\\databases", "execution");
					
				} catch (QueryException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					MessageDialog.openError(shell, "OK", "An error occurred during database creation.");
				}
				
				
			}
        });

        return container;
    }
    
    @Override
    protected void configureShell(Shell newShell) {
        super.configureShell(newShell);
        newShell.setText("Create New Database");
    }

    @Override
    protected Point getInitialSize() {
        return new Point(450, 220);
    }
    
    /*@Override
    protected Control createButtonBar(Composite parent) {
        return null;
    }*/
    
    @Override
    protected void createButtonsForButtonBar(final Composite parent)
    { 
      GridLayout layout = (GridLayout)parent.getLayout();
      layout.marginHeight = 0;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDataPath() {
		return dataPath;
	}

	public void setDataPath(String dataPath) {
		this.dataPath = dataPath;
	}

	public String getSchemaPath() {
		return schemaPath;
	}

	public void setSchemaPath(String schemaPath) {
		this.schemaPath = schemaPath;
	}
}
