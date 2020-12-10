package patterncreation.project.design;

import org.eclipse.swt.widgets.Shell;

public class ChooseDatabaseForExecutionDialog extends ChooseDatabaseDialog {

	ViewExecutionPart1 viewExecutionPart1;
	
	public ChooseDatabaseForExecutionDialog(Shell parentShell, ViewExecutionPart1 viewExecutionPart1) {
        super(parentShell);
        this.viewExecutionPart1 = viewExecutionPart1;
        viewExecutionPart1.setChooseDatabaseDialog(this);
        loadDatabases();
    }
	
	protected void refresh(Shell shell) {
		super.refresh(shell);
		ChooseDatabaseDialog dialog = new ChooseDatabaseForExecutionDialog(shell, viewExecutionPart1);
		dialog.open();
	}
	    

	public ViewExecutionPart1 getViewExecutionPart1() {
		return viewExecutionPart1;
	}

	public void setViewExecutionPart1(ViewExecutionPart1 viewExecutionPart1) {
		this.viewExecutionPart1 = viewExecutionPart1;
	}

}
