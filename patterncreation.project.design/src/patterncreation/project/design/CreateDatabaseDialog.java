package patterncreation.project.design;

import java.util.ArrayList;

import org.eclipse.jface.dialogs.Dialog;
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
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class CreateDatabaseDialog extends Dialog {
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
        chooseDatabaseLabel.setText("Create New Database");
        GridData gridData = new GridData();
        gridData.horizontalAlignment = GridData.FILL;
        gridData.horizontalSpan = 2;
        chooseDatabaseLabel.setLayoutData(gridData);
        
        new Label(container, SWT.NONE);
        
        Label labelName = new Label(container, SWT.NONE);
        labelName.setText("Name:");
        
        Text text2 = new Text(container, SWT.BORDER);
        GridData gridDataText = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1);
        //gridData.horizontalAlignment = GridData.FILL;
        //gridData.horizontalSpan = 2;
        text2.setLayoutData(gridDataText);
        
        Label labelDataPath = new Label(container, SWT.NONE);
        labelDataPath.setText("Data Path:");
        
        Text textDataPath = new Text(container, SWT.BORDER);
        GridData gridDataDataPath = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
        textDataPath.setLayoutData(gridDataDataPath);
        
        Button button = new Button(container, SWT.PUSH);
        button.setText("Choose Path");
        button.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
            	Shell shell = new Shell();
    		    FileDialog dialog = new FileDialog(shell, SWT.OPEN);
    			dialog.setFilterExtensions(new String [] {"*.html"});
    			dialog.setFilterPath(System.getProperty("user.dir"));//"c:\\temp"
    			//String result = dialog.open();
    			//text.setText(result);
    			dialog.open();
    			textDataPath.setText(dialog.getFileName());//zur ausführung braucht man den gesamten pfad, result verwenden
            }
        });
        
        Label labelSchemaPath = new Label(container, SWT.NONE);
        labelSchemaPath.setText("Schema Path:");
        
        Text textSchemaPath = new Text(container, SWT.BORDER);
        GridData gridDataSchemaPath = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
        textSchemaPath.setLayoutData(gridDataSchemaPath);
        
        Button buttonChoosePath = new Button(container, SWT.PUSH);
        buttonChoosePath.setText("Choose Path");
        buttonChoosePath.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
            	Shell shell = new Shell();
    		    FileDialog dialog = new FileDialog(shell, SWT.OPEN);
    			dialog.setFilterExtensions(new String [] {"*.html"});
    			dialog.setFilterPath(System.getProperty("user.dir"));//"c:\\temp"
    			//String result = dialog.open();
    			//text.setText(result);
    			dialog.open();
    			textSchemaPath.setText(dialog.getFileName());//zur ausführung braucht man den gesamten pfad, result verwenden
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
        
        Button buttonCreateDatabase = new Button(container, SWT.PUSH);
        buttonCreateDatabase.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,2,1));
        buttonCreateDatabase.setText("Create Database");
        buttonCreateDatabase.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                System.out.println("Pressed");
                container.getShell().close();
            }
        });

        return container;
    }

    // overriding this methods allows you to set the
    // title of the custom dialog
    @Override
    protected void configureShell(Shell newShell) {
        super.configureShell(newShell);
        newShell.setText("Selection dialog");
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
}
