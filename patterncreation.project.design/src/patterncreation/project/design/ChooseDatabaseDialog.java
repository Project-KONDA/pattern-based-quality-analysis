package patterncreation.project.design;

import java.util.ArrayList;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
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

public class ChooseDatabaseDialog extends Dialog {
	public ChooseDatabaseDialog(Shell parentShell) {
        super(parentShell);
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        Composite container = (Composite) super.createDialogArea(parent);
        
        Label chooseDatabaseLabel = new Label(container, SWT.NONE);
        chooseDatabaseLabel.setText("Choose Database");
        
        Group genderGroup = new Group(container, SWT.NONE);
        genderGroup.setLayout(new RowLayout(SWT.VERTICAL));
        ArrayList<String> stringlist = new ArrayList<String>();
        stringlist.add("Hallo");
        stringlist.add("Haus");
        ArrayList<Button> buttons = new ArrayList<Button>();
        for(String s:stringlist) {
        	Button radiobutton = new Button(genderGroup, SWT.RADIO);
        	radiobutton.setText(s);
        	buttons.add(radiobutton);
        }
        
        Button button = new Button(container, SWT.PUSH);
        button.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
        button.setText("Create New Database");
        button.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                System.out.println("Pressed");
                Shell shell = new Shell();
                CreateDatabaseDialog dialog = new CreateDatabaseDialog(shell);
	    		dialog.open();
            }
        });
        
        new Label(container, SWT.NONE);
        new Label(container, SWT.NONE);
        
        /*Button buttonGo = createButton(parent, IDialogConstants.OK_ID,"Go!", false);
  	    buttonGo.setBounds(200, 0, 100, 25);*/
        Button buttonGo = new Button(container, SWT.PUSH);
        buttonGo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
        buttonGo.setText("Go!");
        buttonGo.addSelectionListener(new SelectionAdapter() {
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
        return new Point(450, 250);
    }
    
    @Override
    protected void createButtonsForButtonBar(final Composite parent)
    { 
      GridLayout layout = (GridLayout)parent.getLayout();
      layout.marginHeight = 0;
    }
}
