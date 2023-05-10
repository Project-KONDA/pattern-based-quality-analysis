package qualitypatternmodel.textrepresentation.impl;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectEList;

@SuppressWarnings("serial")
public class NonUniqueList<E> extends EObjectEList<E> {

	public NonUniqueList(Class<?> dataClass, InternalEObject owner, int featureID) {
		super(dataClass, owner, featureID);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected boolean isUnique(){
		return false;
    }


	

}
