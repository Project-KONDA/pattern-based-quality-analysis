package qualitypatternmodel.demo;

import java.io.IOException;

import qualitypatternmodel.execution.impl.DatabasesImpl;
import qualitypatternmodel.utility.EMFModelSave;

public class DemoEmptyDatabases {
	
	public static void main(String[] args) throws IOException {
		EMFModelSave.exportToFile(DatabasesImpl.getInstance(), "databases/databases", "execution");
	}

}
