package patterncreation.project.design;

import org.eclipse.swt.widgets.Shell;

public class ChooseDatabaseForConcretizationDialog extends ChooseDatabaseDialog {
	Services services;

	public ChooseDatabaseForConcretizationDialog(Shell parentShell, Services services) {
        super(parentShell);
        this.services = services;
        services.setChooseDatabaseForConcretizationDialog(this);
        loadDatabases();
    }
	
	protected void refresh(Shell shell) {
		super.refresh(shell);
		ChooseDatabaseDialog dialog = new ChooseDatabaseForConcretizationDialog(shell, services);
		dialog.open();
	}

	public Services getServices() {
		return services;
	}

	public void setServices(Services services) {
		this.services = services;
	}
	  

}
